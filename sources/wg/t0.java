package wg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
public final class t0 implements c20 {
    public final int f57811a;
    public final w0 f57812b;

    public t0(w0 w0Var, int i7) {
        this.f57811a = i7;
        this.f57812b = w0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f57811a) {
            case 0:
                String str = (String) obj;
                w0 w0Var = this.f57812b;
                ArrayList arrayList = w0Var.Y1;
                tg.y yVar = w0Var.f57833n2;
                w0Var.f57825f2 = str;
                int i7 = w0Var.f57829j2;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            w0Var.m1(false, true);
                            w0Var.j1(true);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(str)) {
                        org.telegram.messenger.g0.r(yVar);
                        arrayList.clear();
                        arrayList.addAll(s.e(w0Var.f57828i2.f26956id));
                        w0Var.m1(false, true);
                        w0Var.j1(true);
                        return;
                    } else {
                        org.telegram.messenger.g0.r(yVar);
                        org.telegram.messenger.g0.i3(yVar, 350L);
                        return;
                    }
                }
                org.telegram.messenger.g0.r(yVar);
                org.telegram.messenger.g0.i3(yVar, 350L);
                return;
            default:
                List list = (List) obj;
                w0 w0Var2 = this.f57812b;
                ArrayList arrayList2 = w0Var2.Y1;
                if (!TextUtils.isEmpty(w0Var2.f57825f2)) {
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
