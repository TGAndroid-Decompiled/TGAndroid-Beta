package ph;

import android.content.Context;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.xw0;
public final class r1 extends xw0 {
    public final boolean f42236w3;
    public final s1 f42237x3;

    public r1(s1 s1Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, i10, f6Var);
        this.f42237x3 = s1Var;
        this.f42236w3 = z4;
    }

    @Override
    public final boolean A1() {
        return LiteMode.isEnabled(8200);
    }

    @Override
    public final tw0[] B1(tw0[] tw0VarArr) {
        if (tw0VarArr != null && this.f42236w3) {
            int i10 = 0;
            while (true) {
                if (i10 < tw0VarArr.length) {
                    tw0 tw0Var = tw0VarArr[i10];
                    if (tw0Var != null && tw0Var.f29059b) {
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
    public final void E1(int i10) {
        super.E1(i10);
        this.f42237x3.d(false);
    }
}
