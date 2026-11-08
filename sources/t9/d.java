package t9;

import android.content.Context;
import b9.j0;
import com.google.android.gms.common.api.j;
import java.lang.ref.WeakReference;
import o9.h;
import org.telegram.ui.LaunchActivity;
public final class d {
    public static WeakReference f55467b;
    public final j0 f55468a;

    public d(Context context) {
        this.f55468a = new j(context, s7.d.f54935a, com.google.android.gms.common.api.b.f6532j, new h(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        d dVar;
        synchronized (d.class) {
            WeakReference weakReference = f55467b;
            if (weakReference == null) {
                dVar = null;
            } else {
                dVar = (d) weakReference.get();
            }
            if (dVar == null) {
                d dVar2 = new d(launchActivity.getApplicationContext());
                f55467b = new WeakReference(dVar2);
                return dVar2;
            }
            return dVar;
        }
    }

    public final void a(b bVar) {
        bVar.f55464e.f55456a = 2;
        this.f55468a.e(1, new c(new b[]{bVar}));
    }
}
