package za;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class m {
    public final k9.h f54267a;
    public final bb.h f54268b;

    public m(k9.h hVar, bb.h hVar2, jd.h hVar3) {
        this.f54267a = hVar;
        this.f54268b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f14747a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(q0.f54280a);
            ae.g0.q(ae.g0.b(hVar3), new bb.i(this, hVar3, null, 4));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
