package rh;

import android.view.View;
public final class i1 implements View.OnClickListener {
    public final int f47090a;
    public final e4 f47091b;
    public final int f47092c;

    public i1(e4 e4Var, int i10, int i11) {
        this.f47090a = i11;
        this.f47091b = e4Var;
        this.f47092c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f47090a) {
            case 0:
                e4 e4Var = this.f47091b;
                int i14 = this.f47092c;
                e4Var.M2 = i14;
                l2 l2Var = e4Var.R1;
                int currentPosition = l2Var.getCurrentPosition();
                if (i14 > e4Var.D1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                l2Var.E(currentPosition + i10);
                return;
            case 1:
                e4 e4Var2 = this.f47091b;
                int i15 = this.f47092c;
                e4Var2.M2 = i15;
                l2 l2Var2 = e4Var2.R1;
                int currentPosition2 = l2Var2.getCurrentPosition();
                if (i15 > e4Var2.D1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                l2Var2.E(currentPosition2 + i11);
                return;
            case 2:
                e4 e4Var3 = this.f47091b;
                int i16 = this.f47092c;
                e4Var3.M2 = i16;
                l2 l2Var3 = e4Var3.R1;
                int currentPosition3 = l2Var3.getCurrentPosition();
                if (i16 > e4Var3.D1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                l2Var3.E(currentPosition3 + i12);
                return;
            default:
                e4 e4Var4 = this.f47091b;
                int i17 = this.f47092c;
                e4Var4.M2 = i17;
                l2 l2Var4 = e4Var4.R1;
                int currentPosition4 = l2Var4.getCurrentPosition();
                if (i17 > e4Var4.D1()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                l2Var4.E(currentPosition4 + i13);
                return;
        }
    }
}
