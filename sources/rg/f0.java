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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.u5;
import w7.x5;
public final class f0 extends FrameLayout {
    public final ImageView f42237a;
    public final i5 f42238b;
    public final u5 f42239c;
    public final i5 d;
    public e0 e;
    public d0 f42240f;

    public f0(j0 j0Var, Context context, d6 d6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        i10 = ((f3) j0Var).backgroundPaddingLeft;
        i11 = ((f3) j0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f42237a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.Lj, d6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, x5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        i5 i5Var = new i5(context);
        this.f42238b = i5Var;
        i5Var.setWidthWrapContent(true);
        i5Var.setTextColor(h6.v0(h6.f18895j5, d6Var));
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
        addView(i5Var, x5.d(-2, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        i5 i5Var2 = new i5(context);
        this.d = i5Var2;
        i5Var2.setTextColor(-1);
        i5Var2.setWidthWrapContent(true);
        i5Var2.setTypeface(AndroidUtilities.bold());
        i5Var2.setTextSize(14);
        u5 u5Var = new u5(this, context, d6Var);
        this.f42239c = u5Var;
        u5Var.setWillNotDraw(false);
        u5Var.addView(i5Var2, x5.e(-2, -2, 17));
        addView(u5Var, x5.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f42240f != null) {
            f7 = 49.0f;
        } else {
            f7 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
