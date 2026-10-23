package sg;

import ai.o5;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class f0 extends FrameLayout {
    public final ImageView f46680a;
    public final n5 f46681b;
    public final o5 f46682c;
    public final n5 d;
    public e0 e;
    public d0 f46683f;

    public f0(j0 j0Var, Context context, g6 g6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        i10 = ((h3) j0Var).backgroundPaddingLeft;
        i11 = ((h3) j0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f46680a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r6.t(imageView, k6.Lj, g6Var, PorterDuff.Mode.SRC_IN);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, z5.d(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        n5 n5Var = new n5(context);
        this.f46681b = n5Var;
        n5Var.setWidthWrapContent(true);
        r6.Z(n5Var, k6.f21289j5, g6Var);
        n5Var.setTextSize(14);
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
        addView(n5Var, z5.d(-2, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        n5 n5Var2 = new n5(context);
        this.d = n5Var2;
        n5Var2.setTextColor(-1);
        n5Var2.setWidthWrapContent(true);
        n5Var2.setTypeface(AndroidUtilities.bold());
        n5Var2.setTextSize(14);
        o5 o5Var = new o5(this, context, g6Var);
        this.f46682c = o5Var;
        o5Var.setWillNotDraw(false);
        o5Var.addView(n5Var2, z5.e(-2, -2, 17));
        addView(o5Var, z5.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f46683f != null) {
            f7 = 49.0f;
        } else {
            f7 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
