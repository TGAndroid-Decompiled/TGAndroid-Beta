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
import org.telegram.ui.s5;
import w7.x5;
public final class f0 extends FrameLayout {
    public final ImageView f47336a;
    public final h5 f47337b;
    public final s5 f47338c;
    public final h5 d;
    public e0 f47339e;
    public d0 f47340f;

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
        this.f47336a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.Lj, d6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, x5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, 24, i12 | 16));
        h5 h5Var = new h5(context);
        this.f47337b = h5Var;
        h5Var.setWidthWrapContent(true);
        h5Var.setTextColor(h6.w0(h6.f20894j5, d6Var));
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
        addView(h5Var, x5.a(-2.0f, f7, 0.0f, f10, 0.0f, -2, i13));
        h5 h5Var2 = new h5(context);
        this.d = h5Var2;
        h5Var2.setTextColor(-1);
        h5Var2.setWidthWrapContent(true);
        h5Var2.setTypeface(AndroidUtilities.bold());
        h5Var2.setTextSize(14);
        s5 s5Var = new s5(this, context, d6Var);
        this.f47338c = s5Var;
        s5Var.setWillNotDraw(false);
        s5Var.addView(h5Var2, x5.e(-2, -2, 17));
        addView(s5Var, x5.d(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f47340f != null) {
            f7 = 49.0f;
        } else {
            f7 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
