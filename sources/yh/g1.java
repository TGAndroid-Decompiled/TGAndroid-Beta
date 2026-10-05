package yh;

import android.view.View;
public final class g1 implements View.OnClickListener {
    public final int f51328a;
    public final y3 f51329b;
    public final int f51330c;

    public g1(y3 y3Var, int i10, int i11) {
        this.f51328a = i11;
        this.f51329b = y3Var;
        this.f51330c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f51328a) {
            case 0:
                y3 y3Var = this.f51329b;
                int i14 = this.f51330c;
                y3Var.R0 = i14;
                h2 h2Var = y3Var.Z;
                int currentPosition = h2Var.getCurrentPosition();
                if (i14 > y3Var.G1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                h2Var.E(currentPosition + i10);
                return;
            case 1:
                y3 y3Var2 = this.f51329b;
                int i15 = this.f51330c;
                y3Var2.R0 = i15;
                h2 h2Var2 = y3Var2.Z;
                int currentPosition2 = h2Var2.getCurrentPosition();
                if (i15 > y3Var2.G1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                h2Var2.E(currentPosition2 + i11);
                return;
            case 2:
                y3 y3Var3 = this.f51329b;
                int i16 = this.f51330c;
                y3Var3.R0 = i16;
                h2 h2Var3 = y3Var3.Z;
                int currentPosition3 = h2Var3.getCurrentPosition();
                if (i16 > y3Var3.G1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                h2Var3.E(currentPosition3 + i12);
                return;
            default:
                y3 y3Var4 = this.f51329b;
                int i17 = this.f51330c;
                y3Var4.R0 = i17;
                h2 h2Var4 = y3Var4.Z;
                int currentPosition4 = h2Var4.getCurrentPosition();
                if (i17 > y3Var4.G1()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                h2Var4.E(currentPosition4 + i13);
                return;
        }
    }
}
