package s9;

import a9.j0;
import android.content.Context;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import n9.i;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f54689b;
    public final j0 f54690a;

    public d(Context context) {
        this.f54690a = new j(context, r7.d.f54403a, com.google.android.gms.common.api.b.f6584j, new i(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f54689b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f54689b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.f54686e.f54678a = 2;
        this.f54690a.e(1, new c(new b[]{bVar}));
    }
}
