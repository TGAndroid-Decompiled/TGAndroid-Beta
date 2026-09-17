package zh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mp;
public final class u0 implements View.OnClickListener {
    public final int f52679a;
    public final w3 f52680b;

    public u0(w3 w3Var, int i10) {
        this.f52679a = i10;
        this.f52680b = w3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52679a) {
            case 0:
                this.f52680b.onBackPressed();
                return;
            case 1:
                this.f52680b.w1();
                return;
            case 2:
                this.f52680b.onBackPressed();
                return;
            case 3:
                this.f52680b.a2();
                return;
            case 4:
                this.f52680b.dismiss();
                return;
            case 5:
                this.f52680b.a2();
                return;
            case 6:
                this.f52680b.onBackPressed();
                return;
            case 7:
                this.f52680b.Q1();
                return;
            case 8:
                this.f52680b.a2();
                return;
            case 9:
                this.f52680b.onBackPressed();
                return;
            case 10:
                this.f52680b.W1(true);
                return;
            case 11:
                this.f52680b.a2();
                return;
            case 12:
                w3 w3Var = this.f52680b;
                if (!w3Var.f52774j0.N) {
                    mp mpVar = w3Var.f52791v0;
                    mpVar.a(!mpVar.f28478a.f23908q, true);
                    return;
                }
                return;
            case 13:
                w3.T0(this.f52680b, view);
                return;
            case 14:
                this.f52680b.W1(true);
                return;
            case 15:
                float alpha = view.getAlpha();
                w3 w3Var2 = this.f52680b;
                if (alpha < 0.99f) {
                    w3Var2.u1();
                    return;
                } else {
                    w3Var2.Y1();
                    return;
                }
            case 16:
                w3.b1(this.f52680b);
                return;
            case 17:
                this.f52680b.S1();
                return;
            case 18:
                this.f52680b.R1(view);
                return;
            case 19:
                this.f52680b.U1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    w3 w3Var3 = this.f52680b;
                    di.d dVar = w3Var3.f52774j0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new u0(w3Var3, 22));
                    w3Var3.f52764e0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    w3Var3.q2(3, true, null);
                    return;
                }
                return;
            case 21:
                w3 w3Var4 = this.f52680b;
                w3Var4.V0 = true;
                w3Var4.r2(false);
                return;
            case 22:
                this.f52680b.W1(false);
                return;
            case 23:
                j3 j3Var = this.f52680b.M0;
                j3Var.h.e();
                j3Var.f52076i.e();
                j3Var.f52077j.e();
                j3Var.f52078k.e();
                return;
            case 24:
                this.f52680b.Q1();
                return;
            case 25:
                this.f52680b.onBackPressed();
                return;
            default:
                w3 w3Var5 = this.f52680b;
                w3Var5.V0 = true;
                w3Var5.r2(false);
                return;
        }
    }
}
