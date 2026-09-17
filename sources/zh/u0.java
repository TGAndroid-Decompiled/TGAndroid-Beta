package zh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mp;
public final class u0 implements View.OnClickListener {
    public final int f52710a;
    public final w3 f52711b;

    public u0(w3 w3Var, int i10) {
        this.f52710a = i10;
        this.f52711b = w3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52710a) {
            case 0:
                this.f52711b.onBackPressed();
                return;
            case 1:
                this.f52711b.w1();
                return;
            case 2:
                this.f52711b.onBackPressed();
                return;
            case 3:
                this.f52711b.a2();
                return;
            case 4:
                this.f52711b.dismiss();
                return;
            case 5:
                this.f52711b.a2();
                return;
            case 6:
                this.f52711b.onBackPressed();
                return;
            case 7:
                this.f52711b.Q1();
                return;
            case 8:
                this.f52711b.a2();
                return;
            case 9:
                this.f52711b.onBackPressed();
                return;
            case 10:
                this.f52711b.W1(true);
                return;
            case 11:
                this.f52711b.a2();
                return;
            case 12:
                w3 w3Var = this.f52711b;
                if (!w3Var.f52805j0.N) {
                    mp mpVar = w3Var.f52822v0;
                    mpVar.a(!mpVar.f28505a.f23935q, true);
                    return;
                }
                return;
            case 13:
                w3.T0(this.f52711b, view);
                return;
            case 14:
                this.f52711b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                w3 w3Var2 = this.f52711b;
                if (alpha < 0.99f) {
                    w3Var2.u1();
                    return;
                } else {
                    w3Var2.Y1();
                    return;
                }
            case 16:
                w3.b1(this.f52711b);
                return;
            case 17:
                this.f52711b.S1();
                return;
            case 18:
                this.f52711b.R1(view);
                return;
            case 19:
                this.f52711b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    w3 w3Var3 = this.f52711b;
                    di.d dVar = w3Var3.f52805j0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(w3Var3, 22));
                    w3Var3.f52795e0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    w3Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                w3 w3Var4 = this.f52711b;
                w3Var4.V0 = true;
                w3Var4.r2(false);
                return;
            case 22:
                this.f52711b.W1(false);
                return;
            case 23:
                j3 j3Var = this.f52711b.M0;
                j3Var.h.e();
                j3Var.f52107i.e();
                j3Var.f52108j.e();
                j3Var.f52109k.e();
                return;
            case 24:
                this.f52711b.Q1();
                return;
            case 25:
                this.f52711b.onBackPressed();
                return;
            default:
                w3 w3Var5 = this.f52711b;
                w3Var5.V0 = true;
                w3Var5.r2(false);
                return;
        }
    }
}
