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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.u5;
import w7.z5;
public final class g0 extends FrameLayout {
    public final ImageView f46112a;
    public final i5 f46113b;
    public final u5 f46114c;
    public final i5 d;
    public f0 f46115e;
    public e0 f46116f;

    public g0(k0 k0Var, Context context, d6 d6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        i10 = ((f3) k0Var).backgroundPaddingLeft;
        i11 = ((f3) k0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f46112a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.Lj, d6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, z5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        i5 i5Var = new i5(context);
        this.f46113b = i5Var;
        i5Var.setWidthWrapContent(true);
        i5Var.setTextColor(i6.v0(i6.f20926j5, d6Var));
        i5Var.setTextSize(14);
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
        addView(i5Var, z5.d(-2, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        i5 i5Var2 = new i5(context);
        this.d = i5Var2;
        i5Var2.setTextColor(-1);
        i5Var2.setWidthWrapContent(true);
        i5Var2.setTypeface(AndroidUtilities.bold());
        i5Var2.setTextSize(14);
        u5 u5Var = new u5(this, context, d6Var);
        this.f46114c = u5Var;
        u5Var.setWillNotDraw(false);
        u5Var.addView(i5Var2, z5.e(-2, -2, 17));
        addView(u5Var, z5.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f46116f != null) {
            f7 = 49.0f;
        } else {
            f7 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
