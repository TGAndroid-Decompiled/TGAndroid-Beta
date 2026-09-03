package qh;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h91;
public final class z9 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final aa f46426a;

    public z9(aa aaVar) {
        this.f46426a = aaVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        f9 f9Var;
        aa aaVar = this.f46426a;
        ba baVar = aaVar.B0;
        if (!aaVar.f45005x0 || (f9Var = baVar.f45120y0) == null || baVar.f45048c0 != 0 || f9Var.f46194s || baVar.f45116x0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = baVar.Q1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        baVar.Q1 = scaleFactor;
        baVar.Q1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        baVar.f45120y0.setZoom(baVar.Q1);
        h91 h91Var = baVar.S0;
        if (h91Var != null) {
            h91Var.b(baVar.Q1, false);
        }
        baVar.j0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        aa aaVar = this.f46426a;
        ba baVar = aaVar.B0;
        if (baVar.f45120y0 != null && baVar.f45048c0 == 0 && !baVar.H0) {
            aaVar.f45005x0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        aa aaVar = this.f46426a;
        aaVar.f45005x0 = false;
        aaVar.B0.f(false);
        ba.c(aaVar.B0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
