package t1;

import android.util.Log;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import kotlin.jvm.internal.j;
public abstract class c {
    public static final b f47868a = b.f47867a;

    public static b a(s sVar) {
        while (sVar != null) {
            if (sVar.t()) {
                sVar.p();
            }
            sVar = sVar.J;
        }
        return f47868a;
    }

    public static void b(a aVar) {
        if (j0.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f47866a.getClass().getName()), aVar);
        }
    }

    public static final void c(s sVar, String previousFragmentId) {
        j.e(previousFragmentId, "previousFragmentId");
        b(new a(sVar, "Attempting to reuse fragment " + sVar + " with previous ID " + previousFragmentId));
        a(sVar).getClass();
    }
}
