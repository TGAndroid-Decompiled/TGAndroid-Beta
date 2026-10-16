package q9;

import android.content.Context;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.u0;
import java.lang.ref.WeakReference;
import l9.i;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f43082b;
    public final u0 f43083a;

    public d(Context context) {
        this.f43083a = new j(context, p7.d.f42849a, com.google.android.gms.common.api.b.f4891p, new i(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f43082b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f43082b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.e.f43074a = 2;
        this.f43083a.e(1, new c(new b[]{bVar}));
    }
}
