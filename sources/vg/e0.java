package vg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import ci.t4;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class e0 extends FrameLayout {
    public final ImageView f56596a;
    public final k5 f56597b;
    public final t4 f56598c;
    public final k5 d;
    public d0 f56599e;
    public c0 f56600f;

    public e0(i0 i0Var, Context context, e6 e6Var) {
        super(context);
        int i3;
        float f10;
        float f11;
        int i10 = i0.P2;
        int i11 = i0Var.f28618u0;
        setPadding(i11, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f56596a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r6.t(imageView, k6.zk, e6Var, PorterDuff.Mode.SRC_IN);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(imageView, mf.d(24, 24.0f, i3 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        k5 k5Var = new k5(context);
        this.f56597b = k5Var;
        k5Var.setWidthWrapContent(true);
        r6.Y(k5Var, k6.f27988j5, e6Var);
        k5Var.setTextSize(14);
        boolean z10 = bd.f21784a0;
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
        addView(k5Var, mf.d(-2, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        k5 k5Var2 = new k5(context);
        this.d = k5Var2;
        k5Var2.setTextColor(-1);
        k5Var2.setWidthWrapContent(true);
        k5Var2.setTypeface(org.telegram.messenger.g0.o());
        k5Var2.setTextSize(14);
        t4 t4Var = new t4(this, context, e6Var);
        this.f56598c = t4Var;
        t4Var.setWillNotDraw(false);
        t4Var.addView(k5Var2, mf.e(-2, -2, 17));
        addView(t4Var, mf.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        if (this.f56600f != null) {
            f10 = 49.0f;
        } else {
            f10 = 36.0f;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
