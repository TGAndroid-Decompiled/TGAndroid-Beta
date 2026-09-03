package ph;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h91;
public final class ba extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final ca f41342a;

    public ba(ca caVar) {
        this.f41342a = caVar;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        i9 i9Var;
        ca caVar = this.f41342a;
        da daVar = caVar.B0;
        if (!caVar.f41448x0 || (i9Var = daVar.f41589y0) == null || daVar.f41518c0 != 0 || i9Var.f42494s || daVar.f41585x0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = daVar.Q1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        daVar.Q1 = scaleFactor;
        daVar.Q1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        daVar.f41589y0.setZoom(daVar.Q1);
        h91 h91Var = daVar.S0;
        if (h91Var != null) {
            h91Var.b(daVar.Q1, false);
        }
        daVar.j0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ca caVar = this.f41342a;
        da daVar = caVar.B0;
        if (daVar.f41589y0 != null && daVar.f41518c0 == 0 && !daVar.H0) {
            caVar.f41448x0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ca caVar = this.f41342a;
        caVar.f41448x0 = false;
        caVar.B0.f(false);
        da.c(caVar.B0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
