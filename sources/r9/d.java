package r9;

import android.content.Context;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import m9.i;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f47319b;
    public final a6.a f47320a;

    public d(Context context) {
        this.f47320a = new j(context, q7.d.f46983a, com.google.android.gms.common.api.b.f6469j, new i(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f47319b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f47319b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.e.f47311a = 2;
        this.f47320a.e(1, new c(new b[]{bVar}));
    }
}
