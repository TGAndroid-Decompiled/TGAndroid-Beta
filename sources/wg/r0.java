package wg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.z10;
public final class r0 implements z10 {
    public final int f59233a;
    public final u0 f59234b;

    public r0(u0 u0Var, int i7) {
        this.f59233a = i7;
        this.f59234b = u0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59233a) {
            case 0:
                String str = (String) obj;
                u0 u0Var = this.f59234b;
                ArrayList arrayList = u0Var.f59245c2;
                s4.s0 s0Var = u0Var.f59259r2;
                u0Var.f59251j2 = str;
                int i7 = u0Var.f59255n2;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            u0Var.m1(false, true);
                            u0Var.j1(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        org.telegram.messenger.g0.r(s0Var);
                        arrayList.clear();
                        arrayList.addAll(q.e(u0Var.f59254m2.f28051id));
                        u0Var.m1(false, true);
                        u0Var.j1(true);
                        return;
                    } else {
                        org.telegram.messenger.g0.r(s0Var);
                        org.telegram.messenger.g0.i3(s0Var, 350L);
                        return;
                    }
                }
                org.telegram.messenger.g0.r(s0Var);
                org.telegram.messenger.g0.i3(s0Var, 350L);
                return;
            default:
                List list = (List) obj;
                u0 u0Var2 = this.f59234b;
                ArrayList arrayList2 = u0Var2.f59245c2;
                if (!TextUtils.isEmpty(u0Var2.f59251j2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    u0Var2.n1(true, true);
                    u0Var2.j1(true);
                    return;
                }
                return;
        }
    }
}
