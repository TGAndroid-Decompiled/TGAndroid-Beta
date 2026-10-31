package th;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.wb;
public final class g4 extends FrameLayout {
    public final float f48998a;
    public final h4 f48999b;

    public g4(h4 h4Var, Context context, float f7) {
        super(context);
        this.f48999b = h4Var;
        this.f48998a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wb.a(this.f48999b.f21589c, new org.telegram.ui.Components.k7(this, 10));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wb.h(this.f48999b.f21589c);
    }
}
