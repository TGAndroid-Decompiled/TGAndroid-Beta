package q9;

import android.content.Context;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.v0;
import java.lang.ref.WeakReference;
import l9.i;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f44434b;
    public final v0 f44435a;

    public d(Context context) {
        this.f44435a = new j(context, p7.d.f44242a, com.google.android.gms.common.api.b.f6347p, new i(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f44434b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f44434b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.e.f44426a = 2;
        this.f44435a.e(1, new c(new b[]{bVar}));
    }
}
