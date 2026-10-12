package rg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.w5;
public final class f0 extends FrameLayout {
    public final ImageView f47460a;
    public final h5 f47461b;
    public final w5 f47462c;
    public final h5 d;
    public e0 f47463e;
    public d0 f47464f;

    public f0(j0 j0Var, Context context, c6 c6Var) {
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
        this.f47460a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.Lj, c6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, w7.w5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, 24, i12 | 16));
        h5 h5Var = new h5(context);
        this.f47461b = h5Var;
        h5Var.setWidthWrapContent(true);
        h5Var.setTextColor(h6.w0(h6.f20667j5, c6Var));
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
        addView(h5Var, w7.w5.a(-2.0f, f7, 0.0f, f10, 0.0f, -2, i13));
        h5 h5Var2 = new h5(context);
        this.d = h5Var2;
        h5Var2.setTextColor(-1);
        h5Var2.setWidthWrapContent(true);
        h5Var2.setTypeface(AndroidUtilities.bold());
        h5Var2.setTextSize(14);
        w5 w5Var = new w5(this, context, c6Var);
        this.f47462c = w5Var;
        w5Var.setWillNotDraw(false);
        w5Var.addView(h5Var2, w7.w5.e(-2, -2, 17));
        addView(w5Var, w7.w5.d(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f47464f != null) {
            f7 = 49.0f;
        } else {
            f7 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
