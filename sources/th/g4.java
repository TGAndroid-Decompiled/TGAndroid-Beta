package th;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.wb;
public final class g4 extends FrameLayout {
    public final float f49012a;
    public final h4 f49013b;

    public g4(h4 h4Var, Context context, float f7) {
        super(context);
        this.f49013b = h4Var;
        this.f49012a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wb.a(this.f49013b.f21590c, new org.telegram.ui.Components.k7(this, 10));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        wb.h(this.f49013b.f21590c);
    }
}
