package q9;

import android.content.Context;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.v0;
import java.lang.ref.WeakReference;
import l9.i;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f44427b;
    public final v0 f44428a;

    public d(Context context) {
        this.f44428a = new j(context, p7.d.f44234a, com.google.android.gms.common.api.b.f6348p, new i(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f44427b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f44427b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.e.f44419a = 2;
        this.f44428a.e(1, new c(new b[]{bVar}));
    }
}
