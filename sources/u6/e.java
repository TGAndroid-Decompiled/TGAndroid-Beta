package u6;

import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import mi.h0;
import p6.m;
public final class e extends j {
    public static final com.google.android.gms.common.api.e f55735l = new com.google.android.gms.common.api.e("ModuleInstall.API", new a6.b(17), new Object());

    public final Task f(n... nVarArr) {
        boolean z10;
        if (nVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.a("Please provide at least one OptionalModuleApi.", z10);
        for (n nVar : nVarArr) {
            m.h(nVar, "Requested API must not be null.");
        }
        a b10 = a.b(Arrays.asList(nVarArr), false);
        if (b10.f55730a.isEmpty()) {
            return Tasks.forResult(new t6.a(0, true));
        }
        s b11 = t.b();
        b11.d = new m6.c[]{m7.b.d};
        b11.f6735a = 27301;
        b11.f6736b = false;
        b11.f6737c = new h0(this, b10, false, 26);
        return e(0, b11.a());
    }
}
