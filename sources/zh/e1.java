package zh;

import android.view.View;
public final class e1 implements View.OnClickListener {
    public final int f51816a;
    public final w3 f51817b;
    public final int f51818c;

    public e1(w3 w3Var, int i10, int i11) {
        this.f51816a = i11;
        this.f51817b = w3Var;
        this.f51818c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f51816a) {
            case 0:
                w3 w3Var = this.f51817b;
                int i14 = this.f51818c;
                w3Var.R0 = i14;
                g2 g2Var = w3Var.Z;
                int currentPosition = g2Var.getCurrentPosition();
                if (i14 > w3Var.G1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                g2Var.D(currentPosition + i10);
                return;
            case 1:
                w3 w3Var2 = this.f51817b;
                int i15 = this.f51818c;
                w3Var2.R0 = i15;
                g2 g2Var2 = w3Var2.Z;
                int currentPosition2 = g2Var2.getCurrentPosition();
                if (i15 > w3Var2.G1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                g2Var2.D(currentPosition2 + i11);
                return;
            case 2:
                w3 w3Var3 = this.f51817b;
                int i16 = this.f51818c;
                w3Var3.R0 = i16;
                g2 g2Var3 = w3Var3.Z;
                int currentPosition3 = g2Var3.getCurrentPosition();
                if (i16 > w3Var3.G1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                g2Var3.D(currentPosition3 + i12);
                return;
            default:
                w3 w3Var4 = this.f51817b;
                int i17 = this.f51818c;
                w3Var4.R0 = i17;
                g2 g2Var4 = w3Var4.Z;
                int currentPosition4 = g2Var4.getCurrentPosition();
                if (i17 > w3Var4.G1()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                g2Var4.D(currentPosition4 + i13);
                return;
        }
    }
}
