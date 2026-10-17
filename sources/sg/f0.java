package sg;

import ai.n5;
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
import org.telegram.ui.ActionBar.j5;
import w7.z5;
public final class f0 extends FrameLayout {
    public final ImageView f46252a;
    public final j5 f46253b;
    public final n5 f46254c;
    public final j5 d;
    public e0 e;
    public d0 f46255f;

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
        this.f46252a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.Lj, d6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, z5.a(24.0f, 24.0f, 0.0f, 24.0f, 0.0f, 24, i12 | 16));
        j5 j5Var = new j5(context);
        this.f46253b = j5Var;
        j5Var.setWidthWrapContent(true);
        j5Var.setTextColor(h6.w0(h6.f21092j5, d6Var));
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
        addView(j5Var, z5.a(-2.0f, f7, 0.0f, f10, 0.0f, -2, i13));
        j5 j5Var2 = new j5(context);
        this.d = j5Var2;
        j5Var2.setTextColor(-1);
        j5Var2.setWidthWrapContent(true);
        j5Var2.setTypeface(AndroidUtilities.bold());
        j5Var2.setTextSize(14);
        n5 n5Var = new n5(this, context, d6Var);
        this.f46254c = n5Var;
        n5Var.setWillNotDraw(false);
        n5Var.addView(j5Var2, z5.e(-2, -2, 17));
        addView(n5Var, z5.d(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f46255f != null) {
            f7 = 49.0f;
        } else {
            f7 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
