package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.t9;
public final class m extends FrameLayout implements x5 {
    public final t9 f46732a;

    public m(Context context) {
        super(context);
        t9 t9Var = new t9(context);
        this.f46732a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(t9Var, f6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = g6.S0;
        t9 t9Var = this.f46732a;
        jf.r.a(canvas, drawable, (t9Var.getWidth() / 2.0f) + t9Var.getLeft(), (t9Var.getHeight() / 2.0f) + t9Var.getTop(), t9Var.getHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), 1073741824));
    }

    @Override
    public final void e() {
    }
}
