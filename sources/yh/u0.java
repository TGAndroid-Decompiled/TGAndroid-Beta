package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.np;
public final class u0 implements View.OnClickListener {
    public final int f47869a;
    public final a4 f47870b;

    public u0(a4 a4Var, int i10) {
        this.f47869a = i10;
        this.f47870b = a4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47869a) {
            case 0:
                this.f47870b.onBackPressed();
                return;
            case 1:
                this.f47870b.w1();
                return;
            case 2:
                this.f47870b.onBackPressed();
                return;
            case 3:
                this.f47870b.a2();
                return;
            case 4:
                this.f47870b.dismiss();
                return;
            case 5:
                this.f47870b.a2();
                return;
            case 6:
                this.f47870b.onBackPressed();
                return;
            case 7:
                this.f47870b.Q1();
                return;
            case 8:
                this.f47870b.a2();
                return;
            case 9:
                this.f47870b.onBackPressed();
                return;
            case 10:
                this.f47870b.W1(true);
                return;
            case 11:
                this.f47870b.a2();
                return;
            case 12:
                a4 a4Var = this.f47870b;
                if (!a4Var.f46991j0.N) {
                    np npVar = a4Var.f47008v0;
                    npVar.a(!npVar.f26511a.f21985q, true);
                    return;
                }
                return;
            case 13:
                a4.T0(this.f47870b, view);
                return;
            case 14:
                this.f47870b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                a4 a4Var2 = this.f47870b;
                if (alpha < 0.99f) {
                    a4Var2.u1();
                    return;
                } else {
                    a4Var2.Y1();
                    return;
                }
            case 16:
                a4.b1(this.f47870b);
                return;
            case 17:
                this.f47870b.S1();
                return;
            case 18:
                this.f47870b.R1(view);
                return;
            case 19:
                this.f47870b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    a4 a4Var3 = this.f47870b;
                    ci.d dVar = a4Var3.f46991j0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(a4Var3, 22));
                    a4Var3.f46981e0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    a4Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                a4 a4Var4 = this.f47870b;
                a4Var4.V0 = true;
                a4Var4.r2(false);
                return;
            case 22:
                this.f47870b.W1(false);
                return;
            case 23:
                m3 m3Var = this.f47870b.M0;
                m3Var.h.e();
                m3Var.f47470i.e();
                m3Var.f47471j.e();
                m3Var.f47472k.e();
                return;
            case 24:
                this.f47870b.Q1();
                return;
            case 25:
                this.f47870b.onBackPressed();
                return;
            default:
                a4 a4Var5 = this.f47870b;
                a4Var5.V0 = true;
                a4Var5.r2(false);
                return;
        }
    }
}
