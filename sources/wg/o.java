package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import sg.z1;
public final class o extends z1 {
    public final r f48571n;

    public o(r rVar, Context context) {
        super(context);
        this.f48571n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48571n.f48577b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48571n.f48577b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f46404a.f46373b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
