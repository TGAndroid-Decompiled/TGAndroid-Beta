package qh;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.xw0;
public final class q1 extends xw0 {
    public final boolean f45910w3;
    public final r1 f45911x3;

    public q1(r1 r1Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, i10, g6Var);
        this.f45911x3 = r1Var;
        this.f45910w3 = z4;
    }

    @Override
    public final tw0[] A1(tw0[] tw0VarArr) {
        if (tw0VarArr != null && this.f45910w3) {
            int i10 = 0;
            while (true) {
                if (i10 < tw0VarArr.length) {
                    tw0 tw0Var = tw0VarArr[i10];
                    if (tw0Var != null && tw0Var.f31423b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = tw0VarArr.length;
                tw0[] tw0VarArr2 = new tw0[length];
                tw0VarArr2[0] = tw0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    tw0VarArr2[i11] = tw0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return tw0VarArr2;
            }
        }
        return tw0VarArr;
    }

    @Override
    public final void D1(int i10) {
        super.D1(i10);
        this.f45911x3.d(false);
    }

    @Override
    public final boolean z1() {
        return LiteMode.isEnabled(8200);
    }
}
