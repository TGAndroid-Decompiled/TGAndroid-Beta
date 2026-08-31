package qh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class c9 extends a3 {
    public final ca f45073h0;

    public c9(ca caVar, int i10, Context context, oh.b bVar, MediaController.AlbumEntry albumEntry, boolean z4, boolean z10, boolean z11) {
        super(i10, context, bVar, albumEntry, z4, 1.39f, z10, z11);
        this.f45073h0 = caVar;
    }

    @Override
    public final void a() {
        ca caVar = this.f45073h0;
        caVar.J0.setTranslationY(caVar.f45115n.getMeasuredHeight() - caVar.J0.g());
        p8 p8Var = caVar.f45118n2;
        if (p8Var != null) {
            p8Var.run();
            caVar.f45118n2 = null;
        }
    }

    @Override
    public final void c(boolean z4) {
        if (this.f45073h0.f45082c0 == 0 && z4) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.s0(this, 27));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
            ca caVar = this.f45073h0;
            caVar.I0 = true;
            caVar.f(false);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ca caVar = this.f45073h0;
        if (caVar.f45101h2) {
            float clamp = Utilities.clamp(1.0f - (f10 / (caVar.f45115n.getMeasuredHeight() - caVar.J0.g())), 1.0f, 0.0f);
            caVar.f45128r.b(AndroidUtilities.dp(-32.0f) * clamp);
            caVar.f45128r.setAlpha(1.0f - (0.6f * clamp));
            caVar.f45093f0.setAlpha(1.0f - clamp);
        }
    }
}
