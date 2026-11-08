package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.xp;
public final class b extends FrameLayout {
    public final k5 f59428a;
    public final ImageView f59429b;

    public b(Context context, f6 f6Var) {
        super(context);
        int i7;
        k5 k5Var = new k5(context);
        this.f59428a = k5Var;
        k5Var.setTextSize(16);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        k5Var.setGravity(i7);
        int i10 = k6.L6;
        r6.Y(k5Var, i10, f6Var);
        k5Var.setTag(Integer.valueOf(i10));
        addView(k5Var);
        ImageView imageView = new ImageView(context);
        this.f59429b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        k5Var.k(id.M0(2131753603, null));
        Drawable drawable = getResources().getDrawable(2131232559);
        Drawable drawable2 = getResources().getDrawable(2131232560);
        int i11 = k6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        r6.y(this, drawable, i11, f6Var, mode);
        r6.y(this, drawable2, k6.f27982k7, f6Var, mode);
        imageView.setImageDrawable(new xp(drawable, drawable2));
        r6.i(k6.f27925h5, this, f6Var);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        int i13 = i11 - i7;
        k5 k5Var = this.f59428a;
        int textHeight = ((i12 - i10) - k5Var.getTextHeight()) / 2;
        boolean z10 = id.f23157a0;
        float f10 = 23.0f;
        ImageView imageView = this.f59429b;
        if (z10) {
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
        if (!id.f23157a0) {
            measuredWidth = g0.L(24.0f);
        } else {
            measuredWidth = (i13 - imageView.getMeasuredWidth()) - g0.L(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.f59428a.measure(org.telegram.messenger.camera.q.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(20.0f), 1073741824));
        this.f59429b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, g0.L(50.0f));
    }
}
