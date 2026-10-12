package za;

import android.app.Application;
import android.content.Context;
import android.util.Log;
public final class m {
    public final k9.h f54498a;
    public final bb.i f54499b;

    public m(k9.h hVar, bb.i iVar, jd.h hVar2) {
        this.f54498a = hVar;
        this.f54499b = iVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        hVar.a();
        Context applicationContext = hVar.f14744a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(p0.f54508a);
            ae.g0.q(ae.g0.b(hVar2), new bb.j(this, hVar2, null, 4));
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
