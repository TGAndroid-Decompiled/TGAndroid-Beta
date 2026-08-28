package y3;

import android.media.metrics.LogSessionId;
public abstract class o {
    public static void a(i iVar, i3.l lVar) {
        LogSessionId logSessionId;
        i3.k kVar = lVar.f10922a;
        kVar.getClass();
        LogSessionId logSessionId2 = kVar.f10921a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!logSessionId2.equals(logSessionId)) {
            iVar.f49501b.setString("log-session-id", logSessionId2.getStringId());
        }
    }
}
