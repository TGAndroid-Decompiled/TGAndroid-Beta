package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.op;
public final class u0 implements View.OnClickListener {
    public final int f47764a;
    public final y3 f47765b;

    public u0(y3 y3Var, int i10) {
        this.f47764a = i10;
        this.f47765b = y3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47764a) {
            case 0:
                this.f47765b.onBackPressed();
                return;
            case 1:
                this.f47765b.w1();
                return;
            case 2:
                this.f47765b.onBackPressed();
                return;
            case 3:
                this.f47765b.a2();
                return;
            case 4:
                this.f47765b.dismiss();
                return;
            case 5:
                this.f47765b.a2();
                return;
            case 6:
                this.f47765b.onBackPressed();
                return;
            case 7:
                this.f47765b.Q1();
                return;
            case 8:
                this.f47765b.a2();
                return;
            case 9:
                this.f47765b.onBackPressed();
                return;
            case 10:
                this.f47765b.W1(true);
                return;
            case 11:
                this.f47765b.a2();
                return;
            case 12:
                y3 y3Var = this.f47765b;
                if (!y3Var.f47964j0.N) {
                    op opVar = y3Var.f47981v0;
                    opVar.a(!opVar.f26827a.f21943q, true);
                    return;
                }
                return;
            case 13:
                y3.T0(this.f47765b, view);
                return;
            case 14:
                this.f47765b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                y3 y3Var2 = this.f47765b;
                if (alpha < 0.99f) {
                    y3Var2.u1();
                    return;
                } else {
                    y3Var2.Y1();
                    return;
                }
            case 16:
                y3.b1(this.f47765b);
                return;
            case 17:
                this.f47765b.S1();
                return;
            case 18:
                this.f47765b.R1(view);
                return;
            case 19:
                this.f47765b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    y3 y3Var3 = this.f47765b;
                    ci.d dVar = y3Var3.f47964j0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(y3Var3, 22));
                    y3Var3.f47954e0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    y3Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                y3 y3Var4 = this.f47765b;
                y3Var4.V0 = true;
                y3Var4.r2(false);
                return;
            case 22:
                this.f47765b.W1(false);
                return;
            case 23:
                k3 k3Var = this.f47765b.M0;
                k3Var.h.e();
                k3Var.f47278i.e();
                k3Var.f47279j.e();
                k3Var.f47280k.e();
                return;
            case 24:
                this.f47765b.Q1();
                return;
            case 25:
                this.f47765b.onBackPressed();
                return;
            default:
                y3 y3Var5 = this.f47765b;
                y3Var5.V0 = true;
                y3Var5.r2(false);
                return;
        }
    }
}
