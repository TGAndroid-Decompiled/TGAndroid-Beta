package org.webrtc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    private static final Logger fallbackLogger = createFallbackLogger();
    private static Loggable loggable;
    private static Severity loggableSeverity;
    private static volatile boolean loggingEnabled;

    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    @Deprecated
    public static void enableTracing(String str, EnumSet<TraceLevel> enumSet) {
    }

    private static native void nativeEnableLogThreads();

    private static native void nativeEnableLogTimeStamps();

    private static native void nativeEnableLogToDebugOutput(int i);

    private static native void nativeLog(int i, String str, String str2);

    private static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    public static void injectLoggable(Loggable loggable2, Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
    }

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    @Deprecated
    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(256),
        TRACE_TIMER(512),
        TRACE_STREAM(1024),
        TRACE_DEBUG(2048),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(8192),
        TRACE_ALL(65535);
        
        public final int level;

        TraceLevel(int i) {
            this.level = i;
        }
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (Logging.class) {
            if (loggable == null) {
                nativeEnableLogToDebugOutput(severity.ordinal());
                loggingEnabled = true;
            } else {
                throw new IllegalStateException("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
            }
        }
    }

    public static void log(Severity severity, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        } else if (loggable != null) {
            if (severity.ordinal() >= loggableSeverity.ordinal()) {
                loggable.onLogMessage(str2, severity, str);
            }
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
        } else {
            int i = C36821.$SwitchMap$org$webrtc$Logging$Severity[severity.ordinal()];
            if (i == 1) {
                level = Level.SEVERE;
            } else if (i == 2) {
                level = Level.WARNING;
            } else if (i != 3) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            Logger logger = fallbackLogger;
            logger.log(level, str + ": " + str2);
        }
    }

    public static class C36821 {
        static final int[] $SwitchMap$org$webrtc$Logging$Severity;

        static {
            int[] iArr = new int[Severity.values().length];
            $SwitchMap$org$webrtc$Logging$Severity = iArr;
            try {
                iArr[Severity.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$Logging$Severity[Severity.LS_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$Logging$Severity[Severity.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void m9d(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    public static void m8e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    public static void m5w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }

    public static void m7e(String str, String str2, Throwable th) {
        Severity severity = Severity.LS_ERROR;
        log(severity, str, str2);
        log(severity, str, th.toString());
        log(severity, str, getStackTraceString(th));
    }

    public static void m4w(String str, String str2, Throwable th) {
        Severity severity = Severity.LS_WARNING;
        log(severity, str, str2);
        log(severity, str, th.toString());
        log(severity, str, getStackTraceString(th));
    }

    public static void m6v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    private static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
