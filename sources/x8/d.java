package x8;

import android.content.Context;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.v0;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
import s8.i;
public final class d {
    public static WeakReference f49095b;
    public final v0 f49096a;

    public d(Context context) {
        this.f49096a = new j(context, z6.d.f50310a, com.google.android.gms.common.api.b.f2744g, new i(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f49095b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f49095b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.f49092e.f49084a = 2;
        this.f49096a.e(1, new c(new b[]{bVar}));
    }
}
