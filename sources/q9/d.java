package q9;

import android.content.Context;
import com.google.android.gms.common.api.j;
import com.google.android.gms.internal.clearcut.v0;
import java.lang.ref.WeakReference;
import l9.i;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f45515b;
    public final v0 f45516a;

    public d(Context context) {
        this.f45516a = new j(context, p7.d.f44862a, com.google.android.gms.common.api.b.f4337k, new i(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f45515b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f45515b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.e.f45507a = 2;
        this.f45516a.e(1, new c(new b[]{bVar}));
    }
}
