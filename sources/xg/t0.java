package xg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.u10;
public final class t0 implements u10 {
    public final int f58761a;
    public final w0 f58762b;

    public t0(w0 w0Var, int i3) {
        this.f58761a = i3;
        this.f58762b = w0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f58761a) {
            case 0:
                String str = (String) obj;
                w0 w0Var = this.f58762b;
                ArrayList arrayList = w0Var.Z1;
                wi.i0 i0Var = w0Var.f58784o2;
                w0Var.f58776g2 = str;
                int i3 = w0Var.f58780k2;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            w0Var.m1(false, true);
                            w0Var.j1(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        org.telegram.messenger.g0.r(i0Var);
                        arrayList.clear();
                        arrayList.addAll(s.e(w0Var.f58779j2.f27001id));
                        w0Var.m1(false, true);
                        w0Var.j1(true);
                        return;
                    } else {
                        org.telegram.messenger.g0.r(i0Var);
                        org.telegram.messenger.g0.i3(i0Var, 350L);
                        return;
                    }
                }
                org.telegram.messenger.g0.r(i0Var);
                org.telegram.messenger.g0.i3(i0Var, 350L);
                return;
            default:
                List list = (List) obj;
                w0 w0Var2 = this.f58762b;
                ArrayList arrayList2 = w0Var2.Z1;
                if (!TextUtils.isEmpty(w0Var2.f58776g2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    w0Var2.n1(true, true);
                    w0Var2.j1(true);
                    return;
                }
                return;
        }
    }
}
