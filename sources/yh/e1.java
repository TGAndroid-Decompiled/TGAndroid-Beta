package yh;

import android.view.View;
public final class e1 implements View.OnClickListener {
    public final int f47040a;
    public final z3 f47041b;
    public final int f47042c;

    public e1(z3 z3Var, int i10, int i11) {
        this.f47040a = i11;
        this.f47041b = z3Var;
        this.f47042c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f47040a) {
            case 0:
                z3 z3Var = this.f47041b;
                int i14 = this.f47042c;
                z3Var.R0 = i14;
                i2 i2Var = z3Var.Z;
                int currentPosition = i2Var.getCurrentPosition();
                if (i14 > z3Var.G1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                i2Var.D(currentPosition + i10);
                return;
            case 1:
                z3 z3Var2 = this.f47041b;
                int i15 = this.f47042c;
                z3Var2.R0 = i15;
                i2 i2Var2 = z3Var2.Z;
                int currentPosition2 = i2Var2.getCurrentPosition();
                if (i15 > z3Var2.G1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                i2Var2.D(currentPosition2 + i11);
                return;
            case 2:
                z3 z3Var3 = this.f47041b;
                int i16 = this.f47042c;
                z3Var3.R0 = i16;
                i2 i2Var3 = z3Var3.Z;
                int currentPosition3 = i2Var3.getCurrentPosition();
                if (i16 > z3Var3.G1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                i2Var3.D(currentPosition3 + i12);
                return;
            default:
                z3 z3Var4 = this.f47041b;
                int i17 = this.f47042c;
                z3Var4.R0 = i17;
                i2 i2Var4 = z3Var4.Z;
                int currentPosition4 = i2Var4.getCurrentPosition();
                if (i17 > z3Var4.G1()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                i2Var4.D(currentPosition4 + i13);
                return;
        }
    }
}
