package zh;

import android.content.Context;
import android.widget.FrameLayout;
import bi.rd;
import org.telegram.ui.Components.pc;
public final class h4 extends FrameLayout {
    public final float f48469a;
    public final i4 f48470b;

    public h4(i4 i4Var, Context context, float f7) {
        super(context);
        this.f48470b = i4Var;
        this.f48469a = f7;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pc.a(this.f48470b.container, new rd(this, 11));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        pc.h(this.f48470b.container);
    }
}
