package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.cd;
public final class r7 extends FrameLayout {
    public final org.telegram.ui.Components.f6 f47416a;
    public final ImageView f47417b;
    public int f47418c;
    public boolean d;

    public r7(Context context) {
        super(context);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.f47416a = f6Var;
        f6Var.getDrawable().r(true, true);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        addView(f6Var, w7.b6.i(-1.0f, -1.0f, 8388627, 22.0f, 0.0f, 58.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f47417b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230871);
        addView(imageView, w7.b6.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47418c = Integer.MAX_VALUE;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        super.onDraw(canvas);
        if (this.d) {
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(22.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(22.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }
}
