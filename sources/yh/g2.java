package yh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.xp0;
public final class g2 implements xp0, fk0 {
    public final KeyEvent.Callback f47242a;

    public g2(KeyEvent.Callback callback) {
        this.f47242a = callback;
    }

    @Override
    public void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.f47242a;
        tVar.f49196a.ab(null, tVar.e, tVar.f49197b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new y2(this, 8));
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
        oc k10 = ((a4) this.f47242a).getBulletinFactory().k(false);
        k10.f26715t = true;
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
