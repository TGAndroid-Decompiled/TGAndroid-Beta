package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import w7.b6;
public final class k extends FrameLayout implements k6 {
    public final g9 f54501a;

    public k(Context context) {
        super(context);
        g9 g9Var = new g9(context);
        this.f54501a = g9Var;
        g9Var.setRoundRadius(i0.L(20.0f));
        addView(g9Var, b6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = t6.S0;
        g9 g9Var = this.f54501a;
        rf.o.a(canvas, drawable, (g9Var.getWidth() / 2.0f) + g9Var.getLeft(), (g9Var.getHeight() / 2.0f) + g9Var.getTop(), g9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i0.L(136.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
