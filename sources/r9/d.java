package r9;

import android.content.Context;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import m9.i;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f47354b;
    public final a6.a f47355a;

    public d(Context context) {
        this.f47355a = new j(context, q7.d.f47018a, com.google.android.gms.common.api.b.f6469j, new i(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f47354b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f47354b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.e.f47346a = 2;
        this.f47355a.e(1, new c(new b[]{bVar}));
    }
}
