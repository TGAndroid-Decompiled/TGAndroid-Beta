package zh;

import android.view.View;
public final class d1 implements View.OnClickListener {
    public final int f50371a;
    public final r3 f50372b;
    public final int f50373c;

    public d1(r3 r3Var, int i10, int i11) {
        this.f50371a = i11;
        this.f50372b = r3Var;
        this.f50373c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f50371a) {
            case 0:
                r3 r3Var = this.f50372b;
                int i14 = this.f50373c;
                r3Var.S0 = i14;
                c2 c2Var = r3Var.Z;
                int currentPosition = c2Var.getCurrentPosition();
                if (i14 > r3Var.H1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                c2Var.D(currentPosition + i10);
                return;
            case 1:
                r3 r3Var2 = this.f50372b;
                int i15 = this.f50373c;
                r3Var2.S0 = i15;
                c2 c2Var2 = r3Var2.Z;
                int currentPosition2 = c2Var2.getCurrentPosition();
                if (i15 > r3Var2.H1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                c2Var2.D(currentPosition2 + i11);
                return;
            case 2:
                r3 r3Var3 = this.f50372b;
                int i16 = this.f50373c;
                r3Var3.S0 = i16;
                c2 c2Var3 = r3Var3.Z;
                int currentPosition3 = c2Var3.getCurrentPosition();
                if (i16 > r3Var3.H1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                c2Var3.D(currentPosition3 + i12);
                return;
            default:
                r3 r3Var4 = this.f50372b;
                int i17 = this.f50373c;
                r3Var4.S0 = i17;
                c2 c2Var4 = r3Var4.Z;
                int currentPosition4 = c2Var4.getCurrentPosition();
                if (i17 > r3Var4.H1()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                c2Var4.D(currentPosition4 + i13);
                return;
        }
    }
}
