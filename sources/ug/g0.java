package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import di.n4;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class g0 extends FrameLayout {
    public final ImageView f58784a;
    public final n5 f58785b;
    public final n4 f58786c;
    public final n5 d;
    public f0 f58787e;
    public e0 f58788f;

    public g0(k0 k0Var, Context context, i6 i6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10 = k0.S2;
        int i11 = k0Var.f30261u0;
        setPadding(i11, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f58784a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        u6.s(imageView, n6.Ck, i6Var, PorterDuff.Mode.SRC_IN);
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, na.d(24, 24.0f, i7 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        n5 n5Var = new n5(context);
        this.f58785b = n5Var;
        n5Var.setWidthWrapContent(true);
        u6.X(n5Var, n6.f29559j5, i6Var);
        n5Var.setTextSize(14);
        boolean z10 = gd.f24314a0;
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
        addView(n5Var, na.d(-2, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        n5 n5Var2 = new n5(context);
        this.d = n5Var2;
        n5Var2.setTextColor(-1);
        n5Var2.setWidthWrapContent(true);
        n5Var2.setTypeface(org.telegram.messenger.g0.o());
        n5Var2.setTextSize(14);
        n4 n4Var = new n4(this, context, i6Var);
        this.f58786c = n4Var;
        n4Var.setWillNotDraw(false);
        n4Var.addView(n5Var2, na.e(-2, -2, 17));
        addView(n4Var, na.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f58788f != null) {
            f10 = 49.0f;
        } else {
            f10 = 36.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
