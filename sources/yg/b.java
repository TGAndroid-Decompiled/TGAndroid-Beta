package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.lq;
public final class b extends FrameLayout {
    public final n5 f61336a;
    public final ImageView f61337b;

    public b(Context context, i6 i6Var) {
        super(context);
        int i7;
        n5 n5Var = new n5(context);
        this.f61336a = n5Var;
        n5Var.setTextSize(16);
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        n5Var.setGravity(i7);
        int i10 = n6.L6;
        u6.X(n5Var, i10, i6Var);
        n5Var.setTag(Integer.valueOf(i10));
        addView(n5Var);
        ImageView imageView = new ImageView(context);
        this.f61337b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        n5Var.k(gd.N0(2131753600, null));
        Drawable drawable = getResources().getDrawable(2131232564);
        Drawable drawable2 = getResources().getDrawable(2131232565);
        int i11 = n6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        u6.x(this, drawable, i11, i6Var, mode);
        u6.x(this, drawable2, n6.f29581k7, i6Var, mode);
        imageView.setImageDrawable(new lq(drawable, drawable2));
        u6.h(n6.f29524h5, this, i6Var);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        int i13 = i11 - i7;
        n5 n5Var = this.f61336a;
        int textHeight = ((i12 - i10) - n5Var.getTextHeight()) / 2;
        boolean z11 = gd.f24314a0;
        float f10 = 23.0f;
        ImageView imageView = this.f61337b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - n5Var.getMeasuredWidth();
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
        n5Var.layout(L, textHeight, n5Var.getMeasuredWidth() + L, n5Var.getMeasuredHeight() + textHeight);
        if (!gd.f24314a0) {
            measuredWidth = g0.L(24.0f);
        } else {
            measuredWidth = (i13 - imageView.getMeasuredWidth()) - g0.L(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.f61336a.measure(m10.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(20.0f), 1073741824));
        this.f61337b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, g0.L(50.0f));
    }
}
