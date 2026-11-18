package v6;

import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import q6.m;
import sg.h0;
public final class e extends j {
    public static final com.google.android.gms.common.api.e f59297l = new com.google.android.gms.common.api.e("ModuleInstall.API", new a9.e(19), new Object());

    public final Task f(n... nVarArr) {
        boolean z10;
        if (nVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.a("Please provide at least one OptionalModuleApi.", z10);
        for (n nVar : nVarArr) {
            m.i(nVar, "Requested API must not be null.");
        }
        a b10 = a.b(Arrays.asList(nVarArr), false);
        if (b10.f59292a.isEmpty()) {
            return Tasks.forResult(new u6.a(0, true));
        }
        t b11 = u.b();
        b11.d = new n6.c[]{n7.b.d};
        b11.f6352a = 27301;
        b11.f6353b = false;
        b11.f6354c = new h0(7, this, b10);
        return e(0, b11.a());
    }
}
