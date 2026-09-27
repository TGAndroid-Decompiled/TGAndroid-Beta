package rg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.v5;
import w7.y5;
public final class f0 extends FrameLayout {
    public final ImageView f42615a;
    public final j5 f42616b;
    public final v5 f42617c;
    public final j5 d;
    public e0 e;
    public d0 f42618f;

    public f0(j0 j0Var, Context context, e6 e6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        i10 = ((g3) j0Var).backgroundPaddingLeft;
        i11 = ((g3) j0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f42615a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.Lj, e6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, y5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.f42616b = j5Var;
        j5Var.setWidthWrapContent(true);
        j5Var.setTextColor(i6.v0(i6.f19164j5, e6Var));
        j5Var.setTextSize(14);
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
        addView(j5Var, y5.d(-2, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        j5 j5Var2 = new j5(context);
        this.d = j5Var2;
        j5Var2.setTextColor(-1);
        j5Var2.setWidthWrapContent(true);
        j5Var2.setTypeface(AndroidUtilities.bold());
        j5Var2.setTextSize(14);
        v5 v5Var = new v5(this, context, e6Var);
        this.f42617c = v5Var;
        v5Var.setWillNotDraw(false);
        v5Var.addView(j5Var2, y5.e(-2, -2, 17));
        addView(v5Var, y5.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f42618f != null) {
            f7 = 49.0f;
        } else {
            f7 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
