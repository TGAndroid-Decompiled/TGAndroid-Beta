package xg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import tg.x1;
public final class o extends x1 {
    public final r f51795r;

    public o(r rVar, Context context) {
        super(context);
        this.f51795r = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51795r.f51800b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51795r.f51800b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f49116a.f49088b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
