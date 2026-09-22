package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.np;
public final class u0 implements View.OnClickListener {
    public final int f47785a;
    public final z3 f47786b;

    public u0(z3 z3Var, int i10) {
        this.f47785a = i10;
        this.f47786b = z3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47785a) {
            case 0:
                this.f47786b.onBackPressed();
                return;
            case 1:
                this.f47786b.w1();
                return;
            case 2:
                this.f47786b.onBackPressed();
                return;
            case 3:
                this.f47786b.a2();
                return;
            case 4:
                this.f47786b.dismiss();
                return;
            case 5:
                this.f47786b.a2();
                return;
            case 6:
                this.f47786b.onBackPressed();
                return;
            case 7:
                this.f47786b.Q1();
                return;
            case 8:
                this.f47786b.a2();
                return;
            case 9:
                this.f47786b.onBackPressed();
                return;
            case 10:
                this.f47786b.W1(true);
                return;
            case 11:
                this.f47786b.a2();
                return;
            case 12:
                z3 z3Var = this.f47786b;
                if (!z3Var.f48029j0.N) {
                    np npVar = z3Var.f48046v0;
                    npVar.a(!npVar.f26546a.f21969q, true);
                    return;
                }
                return;
            case 13:
                z3.T0(this.f47786b, view);
                return;
            case 14:
                this.f47786b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                z3 z3Var2 = this.f47786b;
                if (alpha < 0.99f) {
                    z3Var2.u1();
                    return;
                } else {
                    z3Var2.Y1();
                    return;
                }
            case 16:
                z3.b1(this.f47786b);
                return;
            case 17:
                this.f47786b.S1();
                return;
            case 18:
                this.f47786b.R1(view);
                return;
            case 19:
                this.f47786b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    z3 z3Var3 = this.f47786b;
                    ci.d dVar = z3Var3.f48029j0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(z3Var3, 22));
                    z3Var3.f48019e0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    z3Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                z3 z3Var4 = this.f47786b;
                z3Var4.V0 = true;
                z3Var4.r2(false);
                return;
            case 22:
                this.f47786b.W1(false);
                return;
            case 23:
                l3 l3Var = this.f47786b.M0;
                l3Var.h.e();
                l3Var.f47346i.e();
                l3Var.f47347j.e();
                l3Var.f47348k.e();
                return;
            case 24:
                this.f47786b.Q1();
                return;
            case 25:
                this.f47786b.onBackPressed();
                return;
            default:
                z3 z3Var5 = this.f47786b;
                z3Var5.V0 = true;
                z3Var5.r2(false);
                return;
        }
    }
}
