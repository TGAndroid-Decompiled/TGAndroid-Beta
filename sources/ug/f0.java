package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import di.k4;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
public final class f0 extends FrameLayout {
    public final ImageView f58074a;
    public final j5 f58075b;
    public final k4 f58076c;
    public final j5 d;
    public e0 f58077e;
    public d0 f58078f;

    public f0(j0 j0Var, Context context, e6 e6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        int i10 = j0.S2;
        int i11 = j0Var.f29717u0;
        setPadding(i11, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f58074a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        q6.s(imageView, j6.Ck, e6Var, PorterDuff.Mode.SRC_IN);
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, ja.d(24, 24.0f, i7 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.f58075b = j5Var;
        j5Var.setWidthWrapContent(true);
        q6.X(j5Var, j6.f28957j5, e6Var);
        j5Var.setTextSize(14);
        boolean z10 = hd.f24104a0;
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
        addView(j5Var, ja.d(-2, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        j5 j5Var2 = new j5(context);
        this.d = j5Var2;
        j5Var2.setTextColor(-1);
        j5Var2.setWidthWrapContent(true);
        j5Var2.setTypeface(org.telegram.messenger.g0.o());
        j5Var2.setTextSize(14);
        k4 k4Var = new k4(this, context, e6Var);
        this.f58076c = k4Var;
        k4Var.setWillNotDraw(false);
        k4Var.addView(j5Var2, ja.e(-2, -2, 17));
        addView(k4Var, ja.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.f58078f != null) {
            f10 = 49.0f;
        } else {
            f10 = 36.0f;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
