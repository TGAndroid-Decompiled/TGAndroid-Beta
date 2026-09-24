package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.op;
public final class u0 implements View.OnClickListener {
    public final int f48060a;
    public final x3 f48061b;

    public u0(x3 x3Var, int i10) {
        this.f48060a = i10;
        this.f48061b = x3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48060a) {
            case 0:
                this.f48061b.onBackPressed();
                return;
            case 1:
                this.f48061b.w1();
                return;
            case 2:
                this.f48061b.onBackPressed();
                return;
            case 3:
                this.f48061b.a2();
                return;
            case 4:
                this.f48061b.dismiss();
                return;
            case 5:
                this.f48061b.a2();
                return;
            case 6:
                this.f48061b.onBackPressed();
                return;
            case 7:
                this.f48061b.Q1();
                return;
            case 8:
                this.f48061b.a2();
                return;
            case 9:
                this.f48061b.onBackPressed();
                return;
            case 10:
                this.f48061b.W1(true);
                return;
            case 11:
                this.f48061b.a2();
                return;
            case 12:
                x3 x3Var = this.f48061b;
                if (!x3Var.f48235j0.N) {
                    op opVar = x3Var.f48252v0;
                    opVar.a(!opVar.f27163a.f22180q, true);
                    return;
                }
                return;
            case 13:
                x3.T0(this.f48061b, view);
                return;
            case 14:
                this.f48061b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                x3 x3Var2 = this.f48061b;
                if (alpha < 0.99f) {
                    x3Var2.u1();
                    return;
                } else {
                    x3Var2.Y1();
                    return;
                }
            case 16:
                x3.b1(this.f48061b);
                return;
            case 17:
                this.f48061b.S1();
                return;
            case 18:
                this.f48061b.R1(view);
                return;
            case 19:
                this.f48061b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    x3 x3Var3 = this.f48061b;
                    ci.d dVar = x3Var3.f48235j0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(x3Var3, 22));
                    x3Var3.f48225e0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    x3Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                x3 x3Var4 = this.f48061b;
                x3Var4.V0 = true;
                x3Var4.r2(false);
                return;
            case 22:
                this.f48061b.W1(false);
                return;
            case 23:
                j3 j3Var = this.f48061b.M0;
                j3Var.h.e();
                j3Var.f47542i.e();
                j3Var.f47543j.e();
                j3Var.f47544k.e();
                return;
            case 24:
                this.f48061b.Q1();
                return;
            case 25:
                this.f48061b.onBackPressed();
                return;
            default:
                x3 x3Var5 = this.f48061b;
                x3Var5.V0 = true;
                x3Var5.r2(false);
                return;
        }
    }
}
