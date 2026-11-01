package vh;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t81;
public final class m8 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final n8 f51503a;

    public m8(n8 n8Var) {
        this.f51503a = n8Var;
    }

    @Override
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        t7 t7Var;
        n8 n8Var = this.f51503a;
        o8 o8Var = n8Var.f51593n0;
        if (!n8Var.f51590j0 || (t7Var = o8Var.B0) == null || o8Var.f51637f0 != 0 || t7Var.f52048s || o8Var.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = o8Var.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        o8Var.T1 = scaleFactor;
        o8Var.T1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        o8Var.B0.setZoom(o8Var.T1);
        t81 t81Var = o8Var.V0;
        if (t81Var != null) {
            t81Var.b(false, o8Var.T1);
        }
        o8Var.i0(true);
        return true;
    }

    @Override
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        n8 n8Var = this.f51503a;
        o8 o8Var = n8Var.f51593n0;
        if (o8Var.B0 != null && o8Var.f51637f0 == 0 && !o8Var.K0) {
            n8Var.f51590j0 = true;
            return super.onScaleBegin(scaleGestureDetector);
        }
        return false;
    }

    @Override
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        n8 n8Var = this.f51503a;
        n8Var.f51590j0 = false;
        n8Var.f51593n0.e(false);
        o8.b(n8Var.f51593n0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
