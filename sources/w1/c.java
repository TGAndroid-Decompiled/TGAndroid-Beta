package w1;

import android.util.Log;
import androidx.fragment.app.i0;
import androidx.fragment.app.r;
import kotlin.jvm.internal.j;
public abstract class c {
    public static final b f57459a = b.f57458a;

    public static b a(r rVar) {
        while (rVar != null) {
            if (rVar.t()) {
                rVar.p();
            }
            rVar = rVar.M;
        }
        return f57459a;
    }

    public static void b(a aVar) {
        if (i0.K(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f57457a.getClass().getName()), aVar);
        }
    }

    public static final void c(r rVar, String previousFragmentId) {
        j.e(previousFragmentId, "previousFragmentId");
        b(new a(rVar, "Attempting to reuse fragment " + rVar + " with previous ID " + previousFragmentId));
        a(rVar).getClass();
    }
}
