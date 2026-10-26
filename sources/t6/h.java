package t6;

import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import o6.l;
public final class h extends j {
    public static final com.google.android.gms.common.api.e f48721k = new com.google.android.gms.common.api.e("ModuleInstall.API", new b8.d(14), new Object());

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
        if (b10.f48714a.isEmpty()) {
            return Tasks.forResult(new s6.a(0, true));
        }
        u b11 = v.b();
        b11.d = new l6.c[]{l7.b.f16950c};
        b11.f6620a = 27301;
        b11.f6621b = false;
        b11.f6622c = new f(this, b10);
        return e(0, b11.a());
    }
}
