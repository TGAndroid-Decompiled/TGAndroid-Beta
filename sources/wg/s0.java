package wg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.w10;
import org.telegram.ui.Wallet.o5;
public final class s0 implements w10 {
    public final int f59929a;
    public final v0 f59930b;

    public s0(v0 v0Var, int i7) {
        this.f59929a = i7;
        this.f59930b = v0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59929a) {
            case 0:
                String str = (String) obj;
                v0 v0Var = this.f59930b;
                ArrayList arrayList = v0Var.f59941c2;
                o5 o5Var = v0Var.f59955r2;
                v0Var.f59947j2 = str;
                int i7 = v0Var.f59951n2;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            v0Var.n1(false, true);
                            v0Var.k1(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        org.telegram.messenger.g0.r(o5Var);
                        arrayList.clear();
                        arrayList.addAll(r.e(v0Var.f59950m2.f28492id));
                        v0Var.n1(false, true);
                        v0Var.k1(true);
                        return;
                    } else {
                        org.telegram.messenger.g0.r(o5Var);
                        org.telegram.messenger.g0.h3(o5Var, 350L);
                        return;
                    }
                }
                org.telegram.messenger.g0.r(o5Var);
                org.telegram.messenger.g0.h3(o5Var, 350L);
                return;
            default:
                List list = (List) obj;
                v0 v0Var2 = this.f59930b;
                ArrayList arrayList2 = v0Var2.f59941c2;
                if (!TextUtils.isEmpty(v0Var2.f59947j2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    v0Var2.o1(true, true);
                    v0Var2.k1(true);
                    return;
                }
                return;
        }
    }
}
