package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.m5;
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class e0 extends FrameLayout {
    public final ImageView f56458a;
    public final k5 f56459b;
    public final m5 f56460c;
    public final k5 d;
    public d0 f56461e;
    public c0 f56462f;

    public e0(i0 i0Var, Context context, f6 f6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10 = i0.O2;
        int i11 = i0Var.f28646t0;
        setPadding(i11, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f56458a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r6.t(imageView, k6.zk, f6Var, PorterDuff.Mode.SRC_IN);
        if (hd.f22878a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, ha.d(24, 24.0f, i7 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        k5 k5Var = new k5(context);
        this.f56459b = k5Var;
        k5Var.setWidthWrapContent(true);
        r6.Y(k5Var, k6.f27957j5, f6Var);
        k5Var.setTextSize(14);
        boolean z9 = hd.f22878a0;
        int i12 = (z9 ? 5 : 3) | 16;
        if (z9) {
            f10 = 30.0f;
        } else {
            f10 = 60.0f;
        }
        if (z9) {
            f11 = 60.0f;
        } else {
            f11 = 30.0f;
        }
        addView(k5Var, ha.d(-2, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        k5 k5Var2 = new k5(context);
        this.d = k5Var2;
        k5Var2.setTextColor(-1);
        k5Var2.setWidthWrapContent(true);
        k5Var2.setTypeface(org.telegram.messenger.g0.o());
        k5Var2.setTextSize(14);
        m5 m5Var = new m5(this, context, f6Var);
        this.f56460c = m5Var;
        m5Var.setWillNotDraw(false);
        m5Var.addView(k5Var2, ha.e(-2, -2, 17));
        addView(m5Var, ha.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f56462f != null) {
            f10 = 49.0f;
        } else {
            f10 = 36.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
