package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.fq;
public final class b extends FrameLayout {
    public final j5 f60639a;
    public final ImageView f60640b;

    public b(Context context, e6 e6Var) {
        super(context);
        int i7;
        j5 j5Var = new j5(context);
        this.f60639a = j5Var;
        j5Var.setTextSize(16);
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        j5Var.setGravity(i7);
        int i10 = j6.L6;
        q6.X(j5Var, i10, e6Var);
        j5Var.setTag(Integer.valueOf(i10));
        addView(j5Var);
        ImageView imageView = new ImageView(context);
        this.f60640b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        j5Var.k(hd.M0(2131753603, null));
        Drawable drawable = getResources().getDrawable(2131232560);
        Drawable drawable2 = getResources().getDrawable(2131232561);
        int i11 = j6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        q6.x(this, drawable, i11, e6Var, mode);
        q6.x(this, drawable2, j6.f28979k7, e6Var, mode);
        imageView.setImageDrawable(new fq(drawable, drawable2));
        q6.h(j6.f28922h5, this, e6Var);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        int i13 = i11 - i7;
        j5 j5Var = this.f60639a;
        int textHeight = ((i12 - i10) - j5Var.getTextHeight()) / 2;
        boolean z11 = hd.f24104a0;
        float f10 = 23.0f;
        ImageView imageView = this.f60640b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - j5Var.getMeasuredWidth();
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
        j5Var.layout(L, textHeight, j5Var.getMeasuredWidth() + L, j5Var.getMeasuredHeight() + textHeight);
        if (!hd.f24104a0) {
            measuredWidth = g0.L(24.0f);
        } else {
            measuredWidth = (i13 - imageView.getMeasuredWidth()) - g0.L(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.f60639a.measure(i20.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(20.0f), 1073741824));
        this.f60640b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, g0.L(50.0f));
    }
}
