package sf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.jl0;
public final class a0 extends fl0 {
    public final ArrayList f47735r;
    public final int f47736s;
    public final Context v;
    public final d0 f47737w;

    public a0(d0 d0Var, Context context) {
        this.f47737w = d0Var;
        ArrayList arrayList = new ArrayList();
        this.f47735r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.f47736s = i10;
        this.v = context;
        arrayList.addAll(s1.f(i10).e());
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 != 0 && i10 != 2) {
            return this.f47735r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.f47735r;
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
        if (i10 == 2) {
            return 2;
        }
        return 0;
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
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        if (i10 != 0 && i10 != 2 && i11 < this.f47735r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
            m1 m1Var = (m1) n1Var.f6432a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof r1) {
                r1 r1Var = (r1) O;
                m1Var.a(r1Var, null, z10);
                m1Var.d.a(this.f47737w.f47777w.contains(Integer.valueOf(r1Var.f47935a)), false);
            }
        }
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f47735r;
        arrayList.clear();
        arrayList.addAll(s1.f(this.f47736s).e());
        X(false);
        this.f47737w.K();
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View m1Var;
        Context context = this.v;
        if (i10 != 0) {
            if (i10 != 1) {
                m1Var = new View(context);
                m1Var.setTag(-33024);
            } else {
                m1Var = new View(context);
                m1Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                m1Var.setTag(-33024);
            }
        } else {
            m1Var = new m1(context, this.f47737w.f28402a, false);
        }
        return new f2.n1(m1Var);
    }
}
