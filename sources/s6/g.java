package s6;

import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import ki.t1;
import n6.l;
public final class g extends j {
    public static final com.google.android.gms.common.api.e f46109k = new com.google.android.gms.common.api.e("ModuleInstall.API", new a8.d(14), new Object());

    public final Task f(n... nVarArr) {
        boolean z10;
        if (nVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.a("Please provide at least one OptionalModuleApi.", z10);
        for (n nVar : nVarArr) {
            l.i(nVar, "Requested API must not be null.");
        }
        a b10 = a.b(Arrays.asList(nVarArr), false);
        if (b10.f46103a.isEmpty()) {
            return Tasks.forResult(new r6.a(0, true));
        }
        u b11 = v.b();
        b11.d = new k6.c[]{k7.b.f14990c};
        b11.f6496a = 27301;
        b11.f6497b = false;
        b11.f6498c = new t1(this, b10);
        return e(0, b11.a());
    }
}
