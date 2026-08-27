package y3;

import android.media.metrics.LogSessionId;

public abstract class o {
    public static void a(i iVar, i3.k kVar) {
        i3.j jVar = kVar.f10562a;
        jVar.getClass();
        LogSessionId logSessionId = jVar.f10561a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        iVar.f49491b.setString("log-session-id", logSessionId.getStringId());
    }
}
