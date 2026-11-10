package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.xp;
public final class b extends FrameLayout {
    public final m5 f59435a;
    public final ImageView f59436b;

    public b(Context context, h6 h6Var) {
        super(context);
        int i7;
        m5 m5Var = new m5(context);
        this.f59435a = m5Var;
        m5Var.setTextSize(16);
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        m5Var.setGravity(i7);
        int i10 = m6.L6;
        t6.X(m5Var, i10, h6Var);
        m5Var.setTag(Integer.valueOf(i10));
        addView(m5Var);
        ImageView imageView = new ImageView(context);
        this.f59436b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        m5Var.k(id.M0(2131753603, null));
        Drawable drawable = getResources().getDrawable(2131232559);
        Drawable drawable2 = getResources().getDrawable(2131232560);
        int i11 = m6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        t6.x(this, drawable, i11, h6Var, mode);
        t6.x(this, drawable2, m6.f28020k7, h6Var, mode);
        imageView.setImageDrawable(new xp(drawable, drawable2));
        t6.h(m6.f27963h5, this, h6Var);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        int i13 = i11 - i7;
        m5 m5Var = this.f59435a;
        int textHeight = ((i12 - i10) - m5Var.getTextHeight()) / 2;
        boolean z10 = id.f23161a0;
        float f10 = 23.0f;
        ImageView imageView = this.f59436b;
        if (z10) {
            int measuredWidth2 = getMeasuredWidth() - m5Var.getMeasuredWidth();
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
        m5Var.layout(L, textHeight, m5Var.getMeasuredWidth() + L, m5Var.getMeasuredHeight() + textHeight);
        if (!id.f23161a0) {
            measuredWidth = g0.L(24.0f);
        } else {
            measuredWidth = (i13 - imageView.getMeasuredWidth()) - g0.L(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        this.f59435a.measure(org.telegram.messenger.camera.q.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(20.0f), 1073741824));
        this.f59436b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, g0.L(50.0f));
    }
}
