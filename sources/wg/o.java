package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import sg.x1;
public final class o extends x1 {
    public final r f47597n;

    public o(r rVar, Context context) {
        super(context);
        this.f47597n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47597n.f47602b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47597n.f47602b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f45428a.f45400b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
