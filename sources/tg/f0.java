package tg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.j5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class f0 extends FrameLayout {
    public final ImageView f48855a;
    public final b6 f48856b;
    public final j5 f48857c;
    public final b6 d;
    public e0 e;
    public d0 f48858f;

    public f0(j0 j0Var, Context context, u6 u6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        i10 = ((k3) j0Var).backgroundPaddingLeft;
        i11 = ((k3) j0Var).backgroundPaddingLeft;
        setPadding(i10, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.f48855a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        f7.t(imageView, y6.Lj, u6Var, PorterDuff.Mode.SRC_IN);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(imageView, gb1.h(24, 24.0f, i12 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        b6 b6Var = new b6(context);
        this.f48856b = b6Var;
        b6Var.setWidthWrapContent(true);
        f7.Y(b6Var, y6.f23462j5, u6Var);
        b6Var.setTextSize(14);
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
        addView(b6Var, gb1.h(-2, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        b6 b6Var2 = new b6(context);
        this.d = b6Var2;
        b6Var2.setTextColor(-1);
        b6Var2.setWidthWrapContent(true);
        b6Var2.setTypeface(AndroidUtilities.bold());
        b6Var2.setTextSize(14);
        j5 j5Var = new j5(this, context, u6Var);
        this.f48857c = j5Var;
        j5Var.setWillNotDraw(false);
        j5Var.addView(b6Var2, gb1.i(-2, -2, 17));
        addView(j5Var, gb1.g(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f48858f != null) {
            f7 = 49.0f;
        } else {
            f7 = 36.0f;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
