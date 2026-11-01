package vh;

import android.content.Context;
import org.telegram.messenger.tc;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.yv0;
public final class o1 extends cw0 {
    public final boolean G3;
    public final p1 H3;

    public o1(p1 p1Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(i10, context, p6Var);
        this.H3 = p1Var;
        this.G3 = z10;
    }

    @Override
    public final boolean D1() {
        return tc.e(8200);
    }

    @Override
    public final yv0[] E1(yv0[] yv0VarArr) {
        if (yv0VarArr != null && this.G3) {
            int i10 = 0;
            while (true) {
                if (i10 < yv0VarArr.length) {
                    yv0 yv0Var = yv0VarArr[i10];
                    if (yv0Var != null && yv0Var.f32917b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                int length = yv0VarArr.length;
                yv0[] yv0VarArr2 = new yv0[length];
                yv0VarArr2[0] = yv0VarArr[i10];
                for (int i11 = 1; i11 < length; i11++) {
                    yv0VarArr2[i11] = yv0VarArr[i11 <= i10 ? i11 - 1 : i11];
                }
                return yv0VarArr2;
            }
        }
        return yv0VarArr;
    }

    @Override
    public final void H1(int i10) {
        super.H1(i10);
        this.H3.d(false);
    }
}
