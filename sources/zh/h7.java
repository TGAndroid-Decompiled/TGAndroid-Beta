package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.pc;
public final class h7 implements nb {
    public final float[] f48484a = new float[2];
    public final i7 f48485b;

    public h7(i7 i7Var) {
        this.f48485b = i7Var;
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
        i7 i7Var = this.f48485b;
        u7 u7Var = i7Var.I0;
        a3 t10 = u7Var.t();
        if (t10 == null) {
            return 0;
        }
        h2 h2Var = t10.f48160c1;
        i7 i7Var2 = u7Var.f48958s;
        float[] fArr = this.f48484a;
        AndroidUtilities.getViewPositionInParent(h2Var, i7Var2, fArr);
        return (int) (i7Var.getMeasuredHeight() - (fArr[1] + h2Var.getMeasuredHeight()));
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
    public final void b(pc pcVar) {
    }

    @Override
    public final void c(float f7) {
    }

    @Override
    public final void d(pc pcVar) {
    }
}
