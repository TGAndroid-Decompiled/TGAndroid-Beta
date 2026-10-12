package zh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.aq;
public final class t0 implements View.OnClickListener {
    public final int f51166a;
    public final r3 f51167b;

    public t0(r3 r3Var, int i10) {
        this.f51166a = i10;
        this.f51167b = r3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51166a) {
            case 0:
                this.f51167b.onBackPressed();
                return;
            case 1:
                this.f51167b.x1();
                return;
            case 2:
                this.f51167b.onBackPressed();
                return;
            case 3:
                this.f51167b.b2();
                return;
            case 4:
                this.f51167b.dismiss();
                return;
            case 5:
                this.f51167b.b2();
                return;
            case 6:
                this.f51167b.onBackPressed();
                return;
            case 7:
                this.f51167b.R1();
                return;
            case 8:
                this.f51167b.b2();
                return;
            case 9:
                this.f51167b.onBackPressed();
                return;
            case 10:
                this.f51167b.X1(true);
                return;
            case 11:
                this.f51167b.b2();
                return;
            case 12:
                r3 r3Var = this.f51167b;
                if (!r3Var.f51088k0.N) {
                    aq aqVar = r3Var.f51105w0;
                    aqVar.a(!aqVar.f23604a.f23092q, true);
                    return;
                }
                return;
            case 13:
                r3.U0(this.f51167b, view);
                return;
            case 14:
                this.f51167b.X1(true);
                return;
            case 15:
                int i10 = (view.getAlpha() > 0.99f ? 1 : (view.getAlpha() == 0.99f ? 0 : -1));
                r3 r3Var2 = this.f51167b;
                if (i10 < 0) {
                    r3Var2.v1();
                    return;
                } else {
                    r3Var2.Z1();
                    return;
                }
            case 16:
                r3.c1(this.f51167b);
                return;
            case 17:
                this.f51167b.T1();
                return;
            case 18:
                this.f51167b.S1(view);
                return;
            case 19:
                this.f51167b.V1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    r3 r3Var3 = this.f51167b;
                    di.d dVar = r3Var3.f51088k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new t0(r3Var3, 22));
                    r3Var3.f51078f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    r3Var3.s2(3, true, null);
                    return;
                }
                return;
            case 21:
                r3 r3Var4 = this.f51167b;
                r3Var4.W0 = true;
                r3Var4.t2(false);
                return;
            case 22:
                this.f51167b.X1(false);
                return;
            case 23:
                e3 e3Var = this.f51167b.N0;
                e3Var.h.e();
                e3Var.f50425i.e();
                e3Var.f50426j.e();
                e3Var.f50427k.e();
                return;
            case 24:
                this.f51167b.R1();
                return;
            case 25:
                this.f51167b.onBackPressed();
                return;
            default:
                r3 r3Var5 = this.f51167b;
                r3Var5.W0 = true;
                r3Var5.t2(false);
                return;
        }
    }
}
