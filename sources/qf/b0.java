package qf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.zk0;

public final class b0 extends vk0 {

    public final ArrayList f46239r;

    public final int f46240s;
    public final Context v;

    public final e0 f46241w;

    public b0(e0 e0Var, Context context) {
        this.f46241w = e0Var;
        ArrayList arrayList = new ArrayList();
        this.f46239r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.f46240s = i10;
        this.v = context;
        arrayList.addAll(q1.f(i10).e());
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0 || i10 == 2) {
            return 1;
        }
        return this.f46239r.size();
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.f46239r;
            if (i11 < arrayList.size()) {
                return arrayList.get(i11);
            }
        }
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == 2 ? 2 : 0;
    }

    @Override
    public final int R() {
        return 3;
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, f2.o1 o1Var) {
        return (i10 == 0 || i10 == 2 || i11 >= this.f46239r.size()) ? false : true;
    }

    @Override
    public final void W(int i10, int i11, f2.o1 o1Var) {
        if (o1Var.f5793f == 0) {
            m1 m1Var = (m1) o1Var.f5789a;
            Object objO = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (objO instanceof p1) {
                p1 p1Var = (p1) objO;
                m1Var.a(p1Var, null, z10);
                m1Var.d.a(this.f46241w.f46281w.contains(Integer.valueOf(p1Var.f46418a)), false);
            }
        }
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f46239r;
        arrayList.clear();
        arrayList.addAll(q1.f(this.f46240s).e());
        X(false);
        this.f46241w.L();
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View m1Var;
        Context context = this.v;
        if (i10 == 0) {
            m1Var = new m1(context, this.f46241w.f34899a, false);
        } else if (i10 != 1) {
            m1Var = new View(context);
            m1Var.setTag(-33024);
        } else {
            m1Var = new View(context);
            m1Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
            m1Var.setTag(-33024);
        }
        return new lk0(m1Var);
    }
}
