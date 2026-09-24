package yh;

import android.view.View;
public final class e1 implements View.OnClickListener {
    public final int f47313a;
    public final x3 f47314b;
    public final int f47315c;

    public e1(x3 x3Var, int i10, int i11) {
        this.f47313a = i11;
        this.f47314b = x3Var;
        this.f47315c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f47313a) {
            case 0:
                x3 x3Var = this.f47314b;
                int i14 = this.f47315c;
                x3Var.R0 = i14;
                g2 g2Var = x3Var.Z;
                int currentPosition = g2Var.getCurrentPosition();
                if (i14 > x3Var.G1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                g2Var.D(currentPosition + i10);
                return;
            case 1:
                x3 x3Var2 = this.f47314b;
                int i15 = this.f47315c;
                x3Var2.R0 = i15;
                g2 g2Var2 = x3Var2.Z;
                int currentPosition2 = g2Var2.getCurrentPosition();
                if (i15 > x3Var2.G1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                g2Var2.D(currentPosition2 + i11);
                return;
            case 2:
                x3 x3Var3 = this.f47314b;
                int i16 = this.f47315c;
                x3Var3.R0 = i16;
                g2 g2Var3 = x3Var3.Z;
                int currentPosition3 = g2Var3.getCurrentPosition();
                if (i16 > x3Var3.G1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                g2Var3.D(currentPosition3 + i12);
                return;
            default:
                x3 x3Var4 = this.f47314b;
                int i17 = this.f47315c;
                x3Var4.R0 = i17;
                g2 g2Var4 = x3Var4.Z;
                int currentPosition4 = g2Var4.getCurrentPosition();
                if (i17 > x3Var4.G1()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                g2Var4.D(currentPosition4 + i13);
                return;
        }
    }
}
