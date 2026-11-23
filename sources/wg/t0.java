package wg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.y10;
public final class t0 implements y10 {
    public final int f59834a;
    public final w0 f59835b;

    public t0(w0 w0Var, int i7) {
        this.f59834a = i7;
        this.f59835b = w0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59834a) {
            case 0:
                String str = (String) obj;
                w0 w0Var = this.f59835b;
                ArrayList arrayList = w0Var.f59846c2;
                s4.s0 s0Var = w0Var.f59860r2;
                w0Var.f59852j2 = str;
                int i7 = w0Var.f59856n2;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            w0Var.n1(false, true);
                            w0Var.k1(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        org.telegram.messenger.g0.r(s0Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(w0Var.f59855m2.f28398id));
                        w0Var.n1(false, true);
                        w0Var.k1(true);
                        return;
                    } else {
                        org.telegram.messenger.g0.r(s0Var);
                        org.telegram.messenger.g0.h3(s0Var, 350L);
                        return;
                    }
                }
                org.telegram.messenger.g0.r(s0Var);
                org.telegram.messenger.g0.h3(s0Var, 350L);
                return;
            default:
                List list = (List) obj;
                w0 w0Var2 = this.f59835b;
                ArrayList arrayList2 = w0Var2.f59846c2;
                if (!TextUtils.isEmpty(w0Var2.f59852j2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    w0Var2.o1(true, true);
                    w0Var2.k1(true);
                    return;
                }
                return;
        }
    }
}
