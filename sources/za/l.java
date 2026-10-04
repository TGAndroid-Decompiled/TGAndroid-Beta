package za;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class l {
    public final k9.h f53134a;
    public final bb.h f53135b;

    public l(k9.h hVar, bb.h hVar2, id.h hVar3) {
        this.f53134a = hVar;
        this.f53135b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f14715a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(o0.f53144a);
            zd.e0.q(zd.e0.b(hVar3), new bb.i(this, hVar3, null, 4));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
