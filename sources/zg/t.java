package zg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rk0;
import yh.s2;
public final class t implements rk0 {
    public final Object f49488a;

    @Override
    public void h(View view, p0 p0Var, boolean z10, boolean z11) {
        u uVar = (u) this.f49488a;
        uVar.f49489a.ab(null, uVar.e, uVar.f49490b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new s2(this, 9));
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
    public void o() {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
