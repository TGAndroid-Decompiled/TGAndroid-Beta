package ph;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class e9 extends a3 {
    public final da f41590h0;

    public e9(da daVar, int i10, Context context, nh.b bVar, MediaController.AlbumEntry albumEntry, boolean z4, boolean z10, boolean z11) {
        super(i10, context, bVar, albumEntry, z4, 1.39f, z10, z11);
        this.f41590h0 = daVar;
    }

    @Override
    public final void a() {
        da daVar = this.f41590h0;
        daVar.J0.setTranslationY(daVar.f41512n.getMeasuredHeight() - daVar.J0.g());
        r8 r8Var = daVar.f41515n2;
        if (r8Var != null) {
            r8Var.run();
            daVar.f41515n2 = null;
        }
    }

    @Override
    public final void c(boolean z4) {
        if (this.f41590h0.f41480c0 == 0 && z4) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o0(this, 26));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
            da daVar = this.f41590h0;
            daVar.I0 = true;
            daVar.f(false);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        da daVar = this.f41590h0;
        if (daVar.f41498h2) {
            float clamp = Utilities.clamp(1.0f - (f10 / (daVar.f41512n.getMeasuredHeight() - daVar.J0.g())), 1.0f, 0.0f);
            daVar.f41525r.b(AndroidUtilities.dp(-32.0f) * clamp);
            daVar.f41525r.setAlpha(1.0f - (0.6f * clamp));
            daVar.f41490f0.setAlpha(1.0f - clamp);
        }
    }
}
