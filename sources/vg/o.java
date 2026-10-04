package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import rg.y1;
public final class o extends y1 {
    public final r f48321n;

    public o(r rVar, Context context) {
        super(context);
        this.f48321n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48321n.f48327b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48321n.f48327b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f46400a.f46366b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
