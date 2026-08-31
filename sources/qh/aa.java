package qh;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i91;
public final class aa extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final ba f44931a;

    public aa(ba baVar) {
        this.f44931a = baVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        g9 g9Var;
        ba baVar = this.f44931a;
        ca caVar = baVar.B0;
        if (!baVar.f45028x0 || (g9Var = caVar.f45154y0) == null || caVar.f45082c0 != 0 || g9Var.f46176s || caVar.f45150x0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = caVar.Q1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        caVar.Q1 = scaleFactor;
        caVar.Q1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        caVar.f45154y0.setZoom(caVar.Q1);
        i91 i91Var = caVar.S0;
        if (i91Var != null) {
            i91Var.b(caVar.Q1, false);
        }
        caVar.j0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ba baVar = this.f44931a;
        ca caVar = baVar.B0;
        if (caVar.f45154y0 != null && caVar.f45082c0 == 0 && !caVar.H0) {
            baVar.f45028x0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ba baVar = this.f44931a;
        baVar.f45028x0 = false;
        baVar.B0.f(false);
        ca.c(baVar.B0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
