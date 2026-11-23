package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import di.n4;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class g0 extends FrameLayout {
    public final ImageView f58669a;
    public final m5 f58670b;
    public final n4 f58671c;
    public final m5 d;
    public f0 f58672e;
    public e0 f58673f;

    public g0(k0 k0Var, Context context, h6 h6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10 = k0.S2;
        int i11 = k0Var.f30177u0;
        setPadding(i11, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f58669a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        t6.s(imageView, m6.Ck, h6Var, PorterDuff.Mode.SRC_IN);
        if (hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, na.d(24, 24.0f, i7 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        m5 m5Var = new m5(context);
        this.f58670b = m5Var;
        m5Var.setWidthWrapContent(true);
        t6.X(m5Var, m6.f29455j5, h6Var);
        m5Var.setTextSize(14);
        boolean z10 = hd.f24408a0;
        int i12 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f10 = 30.0f;
        } else {
            f10 = 60.0f;
        }
        if (z10) {
            f11 = 60.0f;
        } else {
            f11 = 30.0f;
        }
        addView(m5Var, na.d(-2, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        m5 m5Var2 = new m5(context);
        this.d = m5Var2;
        m5Var2.setTextColor(-1);
        m5Var2.setWidthWrapContent(true);
        m5Var2.setTypeface(org.telegram.messenger.g0.o());
        m5Var2.setTextSize(14);
        n4 n4Var = new n4(this, context, h6Var);
        this.f58671c = n4Var;
        n4Var.setWillNotDraw(false);
        n4Var.addView(m5Var2, na.e(-2, -2, 17));
        addView(n4Var, na.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f58673f != null) {
            f10 = 49.0f;
        } else {
            f10 = 36.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
