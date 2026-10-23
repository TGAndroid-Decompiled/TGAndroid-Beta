package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import sg.x1;
public final class o extends x1 {
    public final r f48994n;

    public o(r rVar, Context context) {
        super(context);
        this.f48994n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48994n.f48999b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48994n.f48999b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f46508a.f46480b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
