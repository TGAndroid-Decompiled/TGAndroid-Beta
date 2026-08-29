package z8;

import android.content.Context;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.v0;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
import u8.h;
public final class d {
    public static WeakReference f50795b;
    public final v0 f50796a;

    public d(Context context) {
        this.f50796a = new j(context, b7.d.f1942a, com.google.android.gms.common.api.b.f3758i, new h(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f50795b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f50795b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.f50792e.f50784a = 2;
        this.f50796a.e(1, new c(new b[]{bVar}));
    }
}
