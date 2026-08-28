package pf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.wk0;
public final class b0 extends sk0 {
    public final ArrayList f45568r;
    public final int f45569s;
    public final Context v;
    public final e0 f45570w;

    public b0(e0 e0Var, Context context) {
        this.f45570w = e0Var;
        ArrayList arrayList = new ArrayList();
        this.f45568r = arrayList;
        int i9 = UserConfig.selectedAccount;
        this.f45569s = i9;
        this.v = context;
        arrayList.addAll(r1.f(i9).e());
    }

    @Override
    public final String F(int i9) {
        return null;
    }

    @Override
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i9) {
        if (i9 != 0 && i9 != 2) {
            return this.f45568r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i9, int i10) {
        if (i9 != 0 && i10 >= 0) {
            ArrayList arrayList = this.f45568r;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    @Override
    public final int P(int i9, int i10) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 2) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int R() {
        return 3;
    }

    @Override
    public final View T(int i9, View view) {
        return null;
    }

    @Override
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        if (i9 != 0 && i9 != 2 && i10 < this.f45568r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i9, int i10, f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
            m1 m1Var = (m1) q1Var.f5501a;
            Object O = O(i9, i10);
            boolean z10 = true;
            if (i9 == 1 && i10 == M(i9) - 1) {
                z10 = false;
            }
            if (O instanceof q1) {
                q1 q1Var2 = (q1) O;
                m1Var.a(q1Var2, null, z10);
                m1Var.d.a(this.f45570w.f45610w.contains(Integer.valueOf(q1Var2.f45756a)), false);
            }
        }
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f45568r;
        arrayList.clear();
        arrayList.addAll(r1.f(this.f45569s).e());
        X(false);
        this.f45570w.K();
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m1Var;
        Context context = this.v;
        if (i9 != 0) {
            if (i9 != 1) {
                m1Var = new View(context);
                m1Var.setTag(-33024);
            } else {
                m1Var = new View(context);
                m1Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
                m1Var.setTag(-33024);
            }
        } else {
            m1Var = new m1(context, this.f45570w.f27492a, false);
        }
        return new f2.q1(m1Var);
    }
}
