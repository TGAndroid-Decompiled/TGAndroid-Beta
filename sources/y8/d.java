package y8;

import a7.e;
import android.content.Context;
import com.google.android.gms.internal.clearcut.v0;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
import t8.i;

public final class d {

    public static WeakReference f49812b;

    public final v0 f49813a;

    public d(Context context) {
        this.f49813a = new v0(context, e.f106a, com.google.android.gms.common.api.b.f3189g, new i(4));
    }

    public static synchronized d b(LaunchActivity launchActivity) {
        WeakReference weakReference = f49812b;
        d dVar = weakReference == null ? null : (d) weakReference.get();
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(launchActivity.getApplicationContext());
        f49812b = new WeakReference(dVar2);
        return dVar2;
    }

    public final void a(b bVar) {
        bVar.f49809e.f49801a = 2;
        this.f49813a.e(1, new c(new b[]{bVar}));
    }
}
