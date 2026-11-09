package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.m5;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
public final class e0 extends FrameLayout {
    public final ImageView f56563a;
    public final l5 f56564b;
    public final m5 f56565c;
    public final l5 d;
    public d0 f56566e;
    public c0 f56567f;

    public e0(i0 i0Var, Context context, g6 g6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10 = i0.O2;
        int i11 = i0Var.f28654t0;
        setPadding(i11, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f56563a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        s6.s(imageView, l6.zk, g6Var, PorterDuff.Mode.SRC_IN);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, ha.d(24, 24.0f, i7 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        l5 l5Var = new l5(context);
        this.f56564b = l5Var;
        l5Var.setWidthWrapContent(true);
        s6.X(l5Var, l6.f27973j5, g6Var);
        l5Var.setTextSize(14);
        boolean z9 = id.f23157a0;
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
        addView(l5Var, ha.d(-2, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        l5 l5Var2 = new l5(context);
        this.d = l5Var2;
        l5Var2.setTextColor(-1);
        l5Var2.setWidthWrapContent(true);
        l5Var2.setTypeface(org.telegram.messenger.g0.o());
        l5Var2.setTextSize(14);
        m5 m5Var = new m5(this, context, g6Var);
        this.f56565c = m5Var;
        m5Var.setWillNotDraw(false);
        m5Var.addView(l5Var2, ha.e(-2, -2, 17));
        addView(m5Var, ha.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f56567f != null) {
            f10 = 49.0f;
        } else {
            f10 = 36.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
