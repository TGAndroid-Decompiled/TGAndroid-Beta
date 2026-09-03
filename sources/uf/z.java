package uf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.rl0;
public final class z extends nl0 {
    public final ArrayList f45547r;
    public final int f45548s;
    public final Context v;
    public final c0 f45549w;

    public z(c0 c0Var, Context context) {
        this.f45549w = c0Var;
        ArrayList arrayList = new ArrayList();
        this.f45547r = arrayList;
        int i10 = UserConfig.selectedAccount;
        this.f45548s = i10;
        this.v = context;
        arrayList.addAll(p1.f(i10).e());
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(rl0 rl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 != 0 && i10 != 2) {
            return this.f45547r.size();
        }
        return 1;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 != 0 && i11 >= 0) {
            ArrayList arrayList = this.f45547r;
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
    public final boolean V(int i10, int i11, f2.l1 l1Var) {
        if (i10 != 0 && i10 != 2 && i11 < this.f45547r.size()) {
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.l1 l1Var) {
        if (l1Var.f5777f == 0) {
            l1 l1Var2 = (l1) l1Var.f5774a;
            Object O = O(i10, i11);
            boolean z4 = true;
            if (i10 == 1 && i11 == M(i10) - 1) {
                z4 = false;
            }
            if (O instanceof o1) {
                o1 o1Var = (o1) O;
                l1Var2.a(o1Var, null, z4);
                l1Var2.d.a(this.f45549w.f45334w.contains(Integer.valueOf(o1Var.f45471a)), false);
            }
        }
    }

    @Override
    public final void l() {
        ArrayList arrayList = this.f45547r;
        arrayList.clear();
        arrayList.addAll(p1.f(this.f45548s).e());
        X(false);
        this.f45549w.K();
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View l1Var;
        Context context = this.v;
        if (i10 != 0) {
            if (i10 != 1) {
                l1Var = new View(context);
                l1Var.setTag(-33024);
            } else {
                l1Var = new View(context);
                l1Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
                l1Var.setTag(-33024);
            }
        } else {
            l1Var = new l1(context, this.f45549w.f24281a, false);
        }
        return new f2.l1(l1Var);
    }
}
