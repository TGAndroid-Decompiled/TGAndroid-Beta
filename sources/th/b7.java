package th;

import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wb;
public final class b7 implements ua {
    public final float[] f48822a = new float[2];
    public final c7 f48823b;

    public b7(c7 c7Var) {
        this.f48823b = c7Var;
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final int f(int i10) {
        c7 c7Var = this.f48823b;
        o7 o7Var = c7Var.f48872r0;
        z2 H = o7Var.H();
        if (H == null) {
            return 0;
        }
        g2 g2Var = H.L0;
        c7 c7Var2 = o7Var.f49344s;
        float[] fArr = this.f48822a;
        org.telegram.messenger.i0.r1(g2Var, c7Var2, fArr);
        return (int) (c7Var.getMeasuredHeight() - (fArr[1] + g2Var.getMeasuredHeight()));
    }

    @Override
    public final boolean g(int i10) {
        return false;
    }

    @Override
    public final int h(int i10) {
        return 0;
    }

    @Override
    public final void b(wb wbVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(wb wbVar) {
    }
}
