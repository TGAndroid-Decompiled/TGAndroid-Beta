package v6;

import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import q6.m;
import sg.i0;
public final class f extends j {
    public static final com.google.android.gms.common.api.e f57246l = new com.google.android.gms.common.api.e("ModuleInstall.API", new a9.e(19), new Object());

    public final Task f(n... nVarArr) {
        boolean z9;
        if (nVarArr.length > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        m.a("Please provide at least one OptionalModuleApi.", z9);
        for (n nVar : nVarArr) {
            m.h(nVar, "Requested API must not be null.");
        }
        a b10 = a.b(Arrays.asList(nVarArr), false);
        if (b10.f57239a.isEmpty()) {
            return Tasks.forResult(new u6.a(0, true));
        }
        s b11 = t.b();
        b11.d = new n6.c[]{n7.b.d};
        b11.f6680a = 27301;
        b11.f6681b = false;
        b11.f6682c = new i0(7, this, b10);
        return e(0, b11.a());
    }
}
