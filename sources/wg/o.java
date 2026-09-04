package wg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import sg.z1;
public final class o extends z1 {
    public final r f48542n;

    public o(r rVar, Context context) {
        super(context);
        this.f48542n = rVar;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48542n.f48548b.setPaused(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48542n.f48548b.setPaused(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f46376a.f46345b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
