package zg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.xp;
public final class b extends FrameLayout {
    public final k5 f60468a;
    public final ImageView f60469b;

    public b(Context context, e6 e6Var) {
        super(context);
        int i3;
        k5 k5Var = new k5(context);
        this.f60468a = k5Var;
        k5Var.setTextSize(16);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        k5Var.setGravity(i3);
        int i10 = k6.L6;
        r6.Y(k5Var, i10, e6Var);
        k5Var.setTag(Integer.valueOf(i10));
        addView(k5Var);
        ImageView imageView = new ImageView(context);
        this.f60469b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        k5Var.k(bd.M0(2131753603, null));
        Drawable drawable = getResources().getDrawable(2131232557);
        Drawable drawable2 = getResources().getDrawable(2131232558);
        int i11 = k6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        r6.y(this, drawable, i11, e6Var, mode);
        r6.y(this, drawable2, k6.f28008k7, e6Var, mode);
        imageView.setImageDrawable(new xp(drawable, drawable2));
        r6.i(k6.f27954h5, this, e6Var);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        int i13 = i11 - i3;
        k5 k5Var = this.f60468a;
        int textHeight = ((i12 - i10) - k5Var.getTextHeight()) / 2;
        boolean z11 = bd.f21784a0;
        float f10 = 23.0f;
        ImageView imageView = this.f60469b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - k5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f10 = 68.0f;
            }
            L = measuredWidth2 - g0.L(f10);
        } else {
            if (imageView.getVisibility() == 0) {
                f10 = 68.0f;
            }
            L = g0.L(f10);
        }
        k5Var.layout(L, textHeight, k5Var.getMeasuredWidth() + L, k5Var.getMeasuredHeight() + textHeight);
        if (!bd.f21784a0) {
            measuredWidth = g0.L(24.0f);
        } else {
            measuredWidth = (i13 - imageView.getMeasuredWidth()) - g0.L(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        this.f60468a.measure(org.telegram.messenger.camera.q.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(20.0f), 1073741824));
        this.f60469b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, g0.L(50.0f));
    }
}
