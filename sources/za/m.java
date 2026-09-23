package za;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class m {
    public final k9.h f48759a;
    public final bb.h f48760b;

    public m(k9.h hVar, bb.h hVar2, id.h hVar3) {
        this.f48759a = hVar;
        this.f48760b = hVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f13536a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(q0.f48769a);
            zd.e0.q(zd.e0.b(hVar3), new bb.i(this, hVar3, null, 4));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
