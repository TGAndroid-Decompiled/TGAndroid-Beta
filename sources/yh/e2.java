package yh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wp0;
public final class e2 implements wp0, fk0 {
    public final KeyEvent.Callback f47014a;

    public e2(KeyEvent.Callback callback) {
        this.f47014a = callback;
    }

    @Override
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.f47014a;
        tVar.f49112a.ab(null, tVar.e, tVar.f49113b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new w2(this, 8));
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public void u0() {
        qc k10 = ((y3) this.f47014a).getBulletinFactory().k(false);
        k10.f27316t = true;
        k10.j();
    }

    @Override
    public void U() {
    }

    @Override
    public void o() {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
