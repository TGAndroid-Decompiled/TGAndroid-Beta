package p9;

import android.content.Context;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.v0;
import java.lang.ref.WeakReference;
import k9.i;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f44367b;
    public final v0 f44368a;

    public d(Context context) {
        this.f44368a = new j(context, p7.d.f44307a, com.google.android.gms.common.api.b.f6476t, new i(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f44367b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f44367b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.f44364e.f44356a = 2;
        this.f44368a.e(1, new c(new b[]{bVar}));
    }
}
