package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.xp;
public final class b extends FrameLayout {
    public final l5 f59437a;
    public final ImageView f59438b;

    public b(Context context, g6 g6Var) {
        super(context);
        int i7;
        l5 l5Var = new l5(context);
        this.f59437a = l5Var;
        l5Var.setTextSize(16);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        l5Var.setGravity(i7);
        int i10 = l6.L6;
        s6.X(l5Var, i10, g6Var);
        l5Var.setTag(Integer.valueOf(i10));
        addView(l5Var);
        ImageView imageView = new ImageView(context);
        this.f59438b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        l5Var.k(id.M0(2131753603, null));
        Drawable drawable = getResources().getDrawable(2131232559);
        Drawable drawable2 = getResources().getDrawable(2131232560);
        int i11 = l6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        s6.x(this, drawable, i11, g6Var, mode);
        s6.x(this, drawable2, l6.f27995k7, g6Var, mode);
        imageView.setImageDrawable(new xp(drawable, drawable2));
        s6.h(l6.f27938h5, this, g6Var);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        int measuredWidth;
        int i13 = i11 - i7;
        l5 l5Var = this.f59437a;
        int textHeight = ((i12 - i10) - l5Var.getTextHeight()) / 2;
        boolean z10 = id.f23157a0;
        float f10 = 23.0f;
        ImageView imageView = this.f59438b;
        if (z10) {
            int measuredWidth2 = getMeasuredWidth() - l5Var.getMeasuredWidth();
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
        l5Var.layout(L, textHeight, l5Var.getMeasuredWidth() + L, l5Var.getMeasuredHeight() + textHeight);
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
        this.f59437a.measure(org.telegram.messenger.camera.q.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(20.0f), 1073741824));
        this.f59438b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
        setMeasuredDimension(size, g0.L(50.0f));
    }
}
