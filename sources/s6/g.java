package s6;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import ji.u4;
import n6.l;
public final class g extends j {
    public static final com.google.android.gms.common.api.e f45953k = new com.google.android.gms.common.api.e("ModuleInstall.API", new a8.d(14), new Object());

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
        if (b10.f45947a.isEmpty()) {
            return Tasks.forResult(new r6.a(0, true));
        }
        v e7 = w.e();
        e7.d = new k6.c[]{k7.b.f14836c};
        e7.f5115a = 27301;
        e7.f5116b = false;
        e7.f5117c = new u4(this, b10);
        return e(0, e7.a());
    }
}
