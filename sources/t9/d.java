package t9;

import android.content.Context;
import b9.j0;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import o9.h;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f55376b;
    public final j0 f55377a;

    public d(Context context) {
        this.f55377a = new j(context, s7.d.f54844a, com.google.android.gms.common.api.b.f6532j, new h(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f55376b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f55376b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.f55373e.f55365a = 2;
        this.f55377a.e(1, new c(new b[]{bVar}));
    }
}
