package qh;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.yw0;
public final class r1 extends yw0 {
    public final boolean f45931w3;
    public final s1 f45932x3;

    public r1(s1 s1Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, i10, g6Var);
        this.f45932x3 = s1Var;
        this.f45931w3 = z4;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final uw0[] B1(uw0[] uw0VarArr) {
        if (uw0VarArr != null && this.f45931w3) {
            int i10 = 0;
            while (true) {
                if (i10 < uw0VarArr.length) {
                    uw0 uw0Var = uw0VarArr[i10];
                    if (uw0Var != null && uw0Var.f31739b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = uw0VarArr.length;
                uw0[] uw0VarArr2 = new uw0[length];
                uw0VarArr2[0] = uw0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    uw0VarArr2[i11] = uw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return uw0VarArr2;
            }
        }
        return uw0VarArr;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.f45932x3.d(false);
    }
}
