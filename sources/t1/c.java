package t1;

import android.util.Log;
import androidx.fragment.app.k0;
import androidx.fragment.app.s;
import kotlin.jvm.internal.i;
public abstract class c {
    public static final b f43290a = b.f43289a;

    public static b a(s sVar) {
        while (sVar != null) {
            if (sVar.t()) {
                sVar.p();
            }
            sVar = sVar.M;
        }
        return f43290a;
    }

    public static void b(a aVar) {
        if (k0.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f43288a.getClass().getName()), aVar);
        }
    }

    public static final void c(s sVar, String previousFragmentId) {
        i.e(previousFragmentId, "previousFragmentId");
        b(new a(sVar, "Attempting to reuse fragment " + sVar + " with previous ID " + previousFragmentId));
        a(sVar).getClass();
    }
}
