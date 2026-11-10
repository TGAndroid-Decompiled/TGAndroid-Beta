package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class e0 extends FrameLayout {
    public final ImageView f56562a;
    public final m5 f56563b;
    public final bi.m5 f56564c;
    public final m5 d;
    public d0 f56565e;
    public c0 f56566f;

    public e0(i0 i0Var, Context context, h6 h6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10 = i0.R2;
        int i11 = i0Var.f28705t0;
        setPadding(i11, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f56562a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        t6.s(imageView, m6.zk, h6Var, PorterDuff.Mode.SRC_IN);
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, ha.d(24, 24.0f, i7 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        m5 m5Var = new m5(context);
        this.f56563b = m5Var;
        m5Var.setWidthWrapContent(true);
        t6.X(m5Var, m6.f27998j5, h6Var);
        m5Var.setTextSize(14);
        boolean z9 = id.f23161a0;
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
        addView(m5Var, ha.d(-2, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        m5 m5Var2 = new m5(context);
        this.d = m5Var2;
        m5Var2.setTextColor(-1);
        m5Var2.setWidthWrapContent(true);
        m5Var2.setTypeface(org.telegram.messenger.g0.o());
        m5Var2.setTextSize(14);
        bi.m5 m5Var3 = new bi.m5(this, context, h6Var);
        this.f56564c = m5Var3;
        m5Var3.setWillNotDraw(false);
        m5Var3.addView(m5Var2, ha.e(-2, -2, 17));
        addView(m5Var3, ha.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f56566f != null) {
            f10 = 49.0f;
        } else {
            f10 = 36.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
