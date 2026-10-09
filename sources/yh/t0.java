package yh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.dq;
public final class t0 implements View.OnClickListener {
    public final int f53213a;
    public final s3 f53214b;

    public t0(s3 s3Var, int i10) {
        this.f53213a = i10;
        this.f53214b = s3Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f53213a) {
            case 0:
                this.f53214b.onBackPressed();
                return;
            case 1:
                this.f53214b.x1();
                return;
            case 2:
                this.f53214b.onBackPressed();
                return;
            case 3:
                this.f53214b.b2();
                return;
            case 4:
                this.f53214b.dismiss();
                return;
            case 5:
                this.f53214b.b2();
                return;
            case 6:
                this.f53214b.onBackPressed();
                return;
            case 7:
                this.f53214b.R1();
                return;
            case 8:
                this.f53214b.b2();
                return;
            case 9:
                this.f53214b.onBackPressed();
                return;
            case 10:
                this.f53214b.X1(true);
                return;
            case 11:
                this.f53214b.b2();
                return;
            case 12:
                s3 s3Var = this.f53214b;
                if (!s3Var.f53179k0.N) {
                    dq dqVar = s3Var.f53196w0;
                    dqVar.a(!dqVar.f25790a.f24097q, true);
                    return;
                }
                return;
            case 13:
                s3.U0(this.f53214b, view);
                return;
            case 14:
                this.f53214b.X1(true);
                return;
            case 15:
                int i10 = (view.getAlpha() > 0.99f ? 1 : (view.getAlpha() == 0.99f ? 0 : -1));
                s3 s3Var2 = this.f53214b;
                if (i10 < 0) {
                    s3Var2.v1();
                    return;
                } else {
                    s3Var2.Z1();
                    return;
                }
            case 16:
                s3.c1(this.f53214b);
                return;
            case 17:
                this.f53214b.T1();
                return;
            case 18:
                this.f53214b.S1(view);
                return;
            case 19:
                this.f53214b.V1();
                return;
            case 20:
                if (view.getAlpha() >= 1.0f) {
                    s3 s3Var3 = this.f53214b;
                    ci.d dVar = s3Var3.f53179k0;
                    dVar.g(LocaleController.getString(R.string.GiftCraftInfoButton), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new t0(s3Var3, 22));
                    s3Var3.f53169f0.i(3, LocaleController.getString(R.string.GiftCraftInfoTitle), LocaleController.getString(R.string.GiftCraftInfoText), null);
                    s3Var3.s2(3, true, null);
                    return;
                }
                return;
            case 21:
                s3 s3Var4 = this.f53214b;
                s3Var4.W0 = true;
                s3Var4.t2(false);
                return;
            case 22:
                this.f53214b.X1(false);
                return;
            case 23:
                f3 f3Var = this.f53214b.N0;
                f3Var.h.e();
                f3Var.f52505i.e();
                f3Var.f52506j.e();
                f3Var.f52507k.e();
                return;
            case 24:
                this.f53214b.R1();
                return;
            case 25:
                this.f53214b.onBackPressed();
                return;
            default:
                s3 s3Var5 = this.f53214b;
                s3Var5.W0 = true;
                s3Var5.t2(false);
                return;
        }
    }
}
