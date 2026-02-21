package org.slf4j.simple;

import java.io.PrintStream;

/**
 * This class encapsulates the user's choice of output target.
 *
 * @author Ceki G&uuml;lc&uuml;
 */
class OutputChoice {

    enum OutputChoiceType {
        SYS_OUT, CACHED_SYS_OUT, SYS_ERR, CACHED_SYS_ERR, FILE;
    }

    final OutputChoiceType outputChoiceType;
    final PrintStream targetPrintStream;

    private OutputChoice(OutputChoiceType outputChoiceType, PrintStream targetPrintStream) {
        this.outputChoiceType = outputChoiceType;
        this.targetPrintStream = targetPrintStream;
    }

    static OutputChoice forSysOut(boolean cached) {
        if (cached) {
            return new OutputChoice(OutputChoiceType.CACHED_SYS_OUT, System.out);
        }
        return new OutputChoice(OutputChoiceType.SYS_OUT, null);
    }

    static OutputChoice forSysErr(boolean cached) {
        if (cached) {
            return new OutputChoice(OutputChoiceType.CACHED_SYS_ERR, System.err);
        }
        return new OutputChoice(OutputChoiceType.SYS_ERR, null);
    }

    static OutputChoice forFile(PrintStream printStream) {
        if (printStream == null) {
            throw new IllegalArgumentException("printStream must not be null");
        }
        return new OutputChoice(OutputChoiceType.FILE, printStream);
    }

    PrintStream getTargetPrintStream() {
        switch (outputChoiceType) {
            case SYS_OUT:
                return System.out;
            case SYS_ERR:
                return System.err;
            case CACHED_SYS_ERR:
            case CACHED_SYS_OUT:
            case FILE:
                return targetPrintStream;
            default:
                throw new IllegalArgumentException();
        }
    }
}