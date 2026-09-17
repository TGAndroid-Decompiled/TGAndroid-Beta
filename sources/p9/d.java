package p9;

import android.content.Context;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.u0;
import java.lang.ref.WeakReference;
import k9.i;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f44046b;
    public final u0 f44047a;

    public d(Context context) {
        this.f44047a = new j(context, p7.d.f43986a, com.google.android.gms.common.api.b.f4976t, new i(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f44046b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f44046b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.f44043e.f44035a = 2;
        this.f44047a.e(1, new c(new b[]{bVar}));
    }
}
