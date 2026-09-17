package yh;

import android.view.View;
public final class e1 implements View.OnClickListener {
    public final int f47123a;
    public final a4 f47124b;
    public final int f47125c;

    public e1(a4 a4Var, int i10, int i11) {
        this.f47123a = i11;
        this.f47124b = a4Var;
        this.f47125c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f47123a) {
            case 0:
                a4 a4Var = this.f47124b;
                int i14 = this.f47125c;
                a4Var.R0 = i14;
                j2 j2Var = a4Var.Z;
                int currentPosition = j2Var.getCurrentPosition();
                if (i14 > a4Var.G1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                j2Var.E(currentPosition + i10);
                return;
            case 1:
                a4 a4Var2 = this.f47124b;
                int i15 = this.f47125c;
                a4Var2.R0 = i15;
                j2 j2Var2 = a4Var2.Z;
                int currentPosition2 = j2Var2.getCurrentPosition();
                if (i15 > a4Var2.G1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                j2Var2.E(currentPosition2 + i11);
                return;
            case 2:
                a4 a4Var3 = this.f47124b;
                int i16 = this.f47125c;
                a4Var3.R0 = i16;
                j2 j2Var3 = a4Var3.Z;
                int currentPosition3 = j2Var3.getCurrentPosition();
                if (i16 > a4Var3.G1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                j2Var3.E(currentPosition3 + i12);
                return;
            default:
                a4 a4Var4 = this.f47124b;
                int i17 = this.f47125c;
                a4Var4.R0 = i17;
                j2 j2Var4 = a4Var4.Z;
                int currentPosition4 = j2Var4.getCurrentPosition();
                if (i17 > a4Var4.G1()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                j2Var4.E(currentPosition4 + i13);
                return;
        }
    }
}
