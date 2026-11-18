package t9;

import android.content.Context;
import b9.k0;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import o9.h;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f57638b;
    public final k0 f57639a;

    public d(Context context) {
        this.f57639a = new j(context, s7.d.f57077a, com.google.android.gms.common.api.b.f6200j, new h(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f57638b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f57638b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.f57635e.f57627a = 2;
        this.f57639a.e(1, new c(new b[]{bVar}));
    }
}
