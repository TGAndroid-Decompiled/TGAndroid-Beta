package za;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class n {
    public final k9.h f49089a;
    public final bb.h f49090b;

    public n(k9.h hVar, bb.h hVar2, id.h hVar3) {
        this.f49089a = hVar;
        this.f49090b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f13534a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(q0.f49099a);
            zd.e0.q(zd.e0.b(hVar3), new bb.i(this, hVar3, null, 4));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
