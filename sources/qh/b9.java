package qh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class b9 extends z2 {
    public final ba f45039h0;

    public b9(ba baVar, int i10, Context context, oh.b bVar, MediaController.AlbumEntry albumEntry, boolean z4, boolean z10, boolean z11) {
        super(i10, context, bVar, albumEntry, z4, 1.39f, z10, z11);
        this.f45039h0 = baVar;
    }

    @Override
    public final void a() {
        ba baVar = this.f45039h0;
        baVar.J0.setTranslationY(baVar.f45081n.getMeasuredHeight() - baVar.J0.g());
        o8 o8Var = baVar.f45084n2;
        if (o8Var != null) {
            o8Var.run();
            baVar.f45084n2 = null;
        }
    }

    @Override
    public final void c(boolean z4) {
        if (this.f45039h0.f45048c0 == 0 && z4) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.s0(this, 27));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < g()) {
            ba baVar = this.f45039h0;
            baVar.I0 = true;
            baVar.f(false);
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ba baVar = this.f45039h0;
        if (baVar.f45067h2) {
            float clamp = Utilities.clamp(1.0f - (f10 / (baVar.f45081n.getMeasuredHeight() - baVar.J0.g())), 1.0f, 0.0f);
            baVar.f45094r.b(AndroidUtilities.dp(-32.0f) * clamp);
            baVar.f45094r.setAlpha(1.0f - (0.6f * clamp));
            baVar.f45059f0.setAlpha(1.0f - clamp);
        }
    }
}
