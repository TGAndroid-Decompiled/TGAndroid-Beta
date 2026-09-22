package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.np;
public final class u0 implements View.OnClickListener {
    public final int f48114a;
    public final y3 f48115b;

    public u0(y3 y3Var, int i10) {
        this.f48114a = i10;
        this.f48115b = y3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48114a) {
            case 0:
                this.f48115b.onBackPressed();
                return;
            case 1:
                this.f48115b.w1();
                return;
            case 2:
                this.f48115b.onBackPressed();
                return;
            case 3:
                this.f48115b.a2();
                return;
            case 4:
                this.f48115b.dismiss();
                return;
            case 5:
                this.f48115b.a2();
                return;
            case 6:
                this.f48115b.onBackPressed();
                return;
            case 7:
                this.f48115b.Q1();
                return;
            case 8:
                this.f48115b.a2();
                return;
            case 9:
                this.f48115b.onBackPressed();
                return;
            case 10:
                this.f48115b.W1(true);
                return;
            case 11:
                this.f48115b.a2();
                return;
            case 12:
                y3 y3Var = this.f48115b;
                if (!y3Var.f48338j0.N) {
                    np npVar = y3Var.f48355v0;
                    npVar.a(!npVar.f26861a.f22209q, true);
                    return;
                }
                return;
            case 13:
                y3.T0(this.f48115b, view);
                return;
            case 14:
                this.f48115b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                y3 y3Var2 = this.f48115b;
                if (alpha < 0.99f) {
                    y3Var2.u1();
                    return;
                } else {
                    y3Var2.Y1();
                    return;
                }
            case 16:
                y3.b1(this.f48115b);
                return;
            case 17:
                this.f48115b.S1();
                return;
            case 18:
                this.f48115b.R1(view);
                return;
            case 19:
                this.f48115b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    y3 y3Var3 = this.f48115b;
                    ci.d dVar = y3Var3.f48338j0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(y3Var3, 22));
                    y3Var3.f48328e0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    y3Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                y3 y3Var4 = this.f48115b;
                y3Var4.V0 = true;
                y3Var4.r2(false);
                return;
            case 22:
                this.f48115b.W1(false);
                return;
            case 23:
                k3 k3Var = this.f48115b.M0;
                k3Var.h.e();
                k3Var.f47651i.e();
                k3Var.f47652j.e();
                k3Var.f47653k.e();
                return;
            case 24:
                this.f48115b.Q1();
                return;
            case 25:
                this.f48115b.onBackPressed();
                return;
            default:
                y3 y3Var5 = this.f48115b;
                y3Var5.V0 = true;
                y3Var5.r2(false);
                return;
        }
    }
}
