package rg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.t5;
import w7.y5;
public final class f0 extends FrameLayout {
    public final ImageView f42571a;
    public final h5 f42572b;
    public final t5 f42573c;
    public final h5 d;
    public e0 e;
    public d0 f42574f;

    public f0(j0 j0Var, Context context, d6 d6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        i10 = ((e3) j0Var).backgroundPaddingLeft;
        i11 = ((e3) j0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f42571a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.Lj, d6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, y5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        h5 h5Var = new h5(context);
        this.f42572b = h5Var;
        h5Var.setWidthWrapContent(true);
        h5Var.setTextColor(h6.v0(h6.f19166j5, d6Var));
        h5Var.setTextSize(14);
        boolean z10 = LocaleController.isRTL;
        int i13 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f7 = 30.0f;
        } else {
            f7 = 60.0f;
        }
        if (z10) {
            f10 = 60.0f;
        } else {
            f10 = 30.0f;
        }
        addView(h5Var, y5.d(-2, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        h5 h5Var2 = new h5(context);
        this.d = h5Var2;
        h5Var2.setTextColor(-1);
        h5Var2.setWidthWrapContent(true);
        h5Var2.setTypeface(AndroidUtilities.bold());
        h5Var2.setTextSize(14);
        t5 t5Var = new t5(this, context, d6Var);
        this.f42573c = t5Var;
        t5Var.setWillNotDraw(false);
        t5Var.addView(h5Var2, y5.e(-2, -2, 17));
        addView(t5Var, y5.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f42574f != null) {
            f7 = 49.0f;
        } else {
            f7 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
