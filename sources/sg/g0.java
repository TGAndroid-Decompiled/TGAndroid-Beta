package sg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.t5;
import w7.x5;
public final class g0 extends FrameLayout {
    public final ImageView f46099a;
    public final j5 f46100b;
    public final t5 f46101c;
    public final j5 d;
    public f0 f46102e;
    public e0 f46103f;

    public g0(k0 k0Var, Context context, f6 f6Var) {
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
        this.f46099a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Lj, f6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, x5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        j5 j5Var = new j5(context);
        this.f46100b = j5Var;
        j5Var.setWidthWrapContent(true);
        j5Var.setTextColor(j6.v0(j6.f20770j5, f6Var));
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
        addView(j5Var, x5.d(-2, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        j5 j5Var2 = new j5(context);
        this.d = j5Var2;
        j5Var2.setTextColor(-1);
        j5Var2.setWidthWrapContent(true);
        j5Var2.setTypeface(AndroidUtilities.bold());
        j5Var2.setTextSize(14);
        t5 t5Var = new t5(this, context, f6Var);
        this.f46101c = t5Var;
        t5Var.setWillNotDraw(false);
        t5Var.addView(j5Var2, x5.e(-2, -2, 17));
        addView(t5Var, x5.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f46103f != null) {
            f7 = 49.0f;
        } else {
            f7 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
