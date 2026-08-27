package sh;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import f2.j1;
import f2.k0;
import f2.k1;
import f2.x0;
import f2.y0;
import org.telegram.messenger.AndroidUtilities;

public class n extends k1 {

    public final LinearInterpolator f47983i;

    public final DecelerateInterpolator f47984j;

    public final float f47985k;

    public int f47986l;

    public int f47987m;

    public final int f47988n;

    public final float f47989o;

    public int f47990p;

    public n(Context context, int i10) {
        this.f47983i = new LinearInterpolator();
        this.f47984j = new DecelerateInterpolator(1.5f);
        this.f47986l = 0;
        this.f47987m = 0;
        this.f47989o = 1.0f;
        this.f47985k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f47988n = i10;
    }

    @Override
    public final PointF a(int i10) {
        x0 x0Var = this.f5733c;
        if (x0Var instanceof k0) {
            return ((k0) x0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, j1 j1Var) {
        if (this.f5732b.f1864x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f47986l;
        int i13 = i12 - i10;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f47986l = i13;
        int i14 = this.f47987m;
        int i15 = i14 - i11;
        int i16 = i14 * i15 > 0 ? i15 : 0;
        this.f47987m = i16;
        if (i13 == 0 && i16 == 0) {
            PointF pointFA = a(this.f5731a);
            if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
                j1Var.d = this.f5731a;
                h();
            } else {
                k1.b(pointFA);
                this.f47986l = (int) (pointFA.x * 10000.0f);
                this.f47987m = (int) (pointFA.y * 10000.0f);
                j1Var.b((int) (this.f47986l * 1.2f), (int) (this.f47987m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f47985k)) * 1.2f), this.f47983i);
            }
        }
    }

    @Override
    public final void f() {
        this.f47987m = 0;
        this.f47986l = 0;
    }

    @Override
    public final void g(View view, j1 j1Var) {
        int i10;
        int iF;
        x0 x0Var = this.f5733c;
        if (x0Var == null || !x0Var.e()) {
            i10 = 0;
        } else {
            y0 y0Var = (y0) view.getLayoutParams();
            int iZ = x0.z(view) - ((ViewGroup.MarginLayoutParams) y0Var).topMargin;
            int iV = x0.v(view) + ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin;
            int iC = (x0Var.f5863n - x0Var.C()) - x0Var.F();
            int i11 = iV - iZ;
            int i12 = this.f47988n;
            if (i12 == 2) {
                iF = x0Var.F() + this.f47990p;
            } else if (i11 > iC) {
                iF = 0;
            } else {
                iF = i12 == 0 ? (iC - i11) / 2 : (x0Var.F() + this.f47990p) - AndroidUtilities.dp(88.0f);
            }
            int i13 = i11 + iF;
            i10 = iF - iZ;
            if (i10 <= 0 && (i10 = i13 - iV) >= 0) {
                i10 = 0;
            }
        }
        int iCeil = (int) Math.ceil(((double) ((int) Math.ceil(Math.abs(i10) * this.f47985k))) / 0.3356d);
        if (iCeil > 0) {
            j1Var.b(0, -i10, Math.max((int) (this.f47989o * 400.0f), iCeil), this.f47984j);
        } else {
            i();
        }
    }

    public n(Context context, int i10, float f10) {
        this.f47983i = new LinearInterpolator();
        this.f47984j = new DecelerateInterpolator(1.5f);
        this.f47986l = 0;
        this.f47987m = 0;
        this.f47989o = f10;
        this.f47985k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.f47988n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
