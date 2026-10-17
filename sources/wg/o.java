package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import sg.w1;
public final class o extends w1 {
    public final r f49006n;

    public o(r rVar, Context context) {
        super(context);
        this.f49006n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49006n.f49011b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49006n.f49011b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f46499a.f46471b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
