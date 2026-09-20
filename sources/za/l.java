package za;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class l {
    public final k9.h f49108a;
    public final bb.h f49109b;

    public l(k9.h hVar, bb.h hVar2, id.h hVar3) {
        this.f49108a = hVar;
        this.f49109b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f13548a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(o0.f49118a);
            zd.e0.q(zd.e0.b(hVar3), new bb.i(this, hVar3, null, 4));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
