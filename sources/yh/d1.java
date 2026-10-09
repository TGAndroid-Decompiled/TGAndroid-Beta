package yh;

import android.view.View;
public final class d1 implements View.OnClickListener {
    public final int f52378a;
    public final s3 f52379b;
    public final int f52380c;

    public d1(s3 s3Var, int i10, int i11) {
        this.f52378a = i11;
        this.f52379b = s3Var;
        this.f52380c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f52378a) {
            case 0:
                s3 s3Var = this.f52379b;
                int i14 = this.f52380c;
                s3Var.S0 = i14;
                d2 d2Var = s3Var.Z;
                int currentPosition = d2Var.getCurrentPosition();
                if (i14 > s3Var.H1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                d2Var.D(currentPosition + i10);
                return;
            case 1:
                s3 s3Var2 = this.f52379b;
                int i15 = this.f52380c;
                s3Var2.S0 = i15;
                d2 d2Var2 = s3Var2.Z;
                int currentPosition2 = d2Var2.getCurrentPosition();
                if (i15 > s3Var2.H1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                d2Var2.D(currentPosition2 + i11);
                return;
            case 2:
                s3 s3Var3 = this.f52379b;
                int i16 = this.f52380c;
                s3Var3.S0 = i16;
                d2 d2Var3 = s3Var3.Z;
                int currentPosition3 = d2Var3.getCurrentPosition();
                if (i16 > s3Var3.H1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                d2Var3.D(currentPosition3 + i12);
                return;
            default:
                s3 s3Var4 = this.f52379b;
                int i17 = this.f52380c;
                s3Var4.S0 = i17;
                d2 d2Var4 = s3Var4.Z;
                int currentPosition4 = d2Var4.getCurrentPosition();
                if (i17 > s3Var4.H1()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                d2Var4.D(currentPosition4 + i13);
                return;
        }
    }
}
