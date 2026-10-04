package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qp;
public final class u0 implements View.OnClickListener {
    public final int f52049a;
    public final x3 f52050b;

    public u0(x3 x3Var, int i10) {
        this.f52049a = i10;
        this.f52050b = x3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52049a) {
            case 0:
                this.f52050b.onBackPressed();
                return;
            case 1:
                this.f52050b.w1();
                return;
            case 2:
                this.f52050b.onBackPressed();
                return;
            case 3:
                this.f52050b.a2();
                return;
            case 4:
                this.f52050b.dismiss();
                return;
            case 5:
                this.f52050b.a2();
                return;
            case 6:
                this.f52050b.onBackPressed();
                return;
            case 7:
                this.f52050b.Q1();
                return;
            case 8:
                this.f52050b.a2();
                return;
            case 9:
                this.f52050b.onBackPressed();
                return;
            case 10:
                this.f52050b.W1(true);
                return;
            case 11:
                this.f52050b.a2();
                return;
            case 12:
                x3 x3Var = this.f52050b;
                if (!x3Var.f52230j0.N) {
                    qp qpVar = x3Var.f52247v0;
                    qpVar.a(!qpVar.f30147a.f24098q, true);
                    return;
                }
                return;
            case 13:
                x3.T0(this.f52050b, view);
                return;
            case 14:
                this.f52050b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                x3 x3Var2 = this.f52050b;
                if (alpha < 0.99f) {
                    x3Var2.u1();
                    return;
                } else {
                    x3Var2.Y1();
                    return;
                }
            case 16:
                x3.b1(this.f52050b);
                return;
            case 17:
                this.f52050b.S1();
                return;
            case 18:
                this.f52050b.R1(view);
                return;
            case 19:
                this.f52050b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    x3 x3Var3 = this.f52050b;
                    ci.d dVar = x3Var3.f52230j0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(x3Var3, 22));
                    x3Var3.f52220e0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    x3Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                x3 x3Var4 = this.f52050b;
                x3Var4.V0 = true;
                x3Var4.r2(false);
                return;
            case 22:
                this.f52050b.W1(false);
                return;
            case 23:
                j3 j3Var = this.f52050b.M0;
                j3Var.h.e();
                j3Var.f51465i.e();
                j3Var.f51466j.e();
                j3Var.f51467k.e();
                return;
            case 24:
                this.f52050b.Q1();
                return;
            case 25:
                this.f52050b.onBackPressed();
                return;
            default:
                x3 x3Var5 = this.f52050b;
                x3Var5.V0 = true;
                x3Var5.r2(false);
                return;
        }
    }
}
