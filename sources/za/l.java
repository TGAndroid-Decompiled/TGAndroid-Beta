package za;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class l {
    public final k9.h f51488a;
    public final bb.i f51489b;

    public l(k9.h hVar, bb.i iVar, id.h hVar2) {
        this.f51488a = hVar;
        this.f51489b = iVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f14882a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(o0.f51498a);
            zd.e0.q(zd.e0.b(hVar2), new bb.j(this, hVar2, null, 4));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
