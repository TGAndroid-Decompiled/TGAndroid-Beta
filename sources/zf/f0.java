package zf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
public final class f0 extends FrameLayout {
    public final ImageView f50501a;
    public final h5 f50502b;
    public final bh.g f50503c;
    public final h5 d;
    public e0 f50504e;
    public d0 f50505f;

    public f0(j0 j0Var, Context context, b6 b6Var) {
        super(context);
        int i9;
        int i10;
        int i11;
        float f10;
        float f11;
        i9 = ((f3) j0Var).backgroundPaddingLeft;
        i10 = ((f3) j0Var).backgroundPaddingLeft;
        setPadding(i9, 0, i10, 0);
        ImageView imageView = new ImageView(context);
        this.f50501a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.Lj, b6Var), PorterDuff.Mode.SRC_IN));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(imageView, e6.d(24, 24.0f, i11 | 16, 24.0f, 0.0f, 24.0f, 0.0f));
        h5 h5Var = new h5(context);
        this.f50502b = h5Var;
        h5Var.setWidthWrapContent(true);
        h5Var.setTextColor(f6.v0(f6.f23108j5, b6Var));
        h5Var.setTextSize(14);
        boolean z10 = LocaleController.isRTL;
        int i12 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f10 = 30.0f;
        } else {
            f10 = 60.0f;
        }
        if (z10) {
            f11 = 60.0f;
        } else {
            f11 = 30.0f;
        }
        addView(h5Var, e6.d(-2, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        h5 h5Var2 = new h5(context);
        this.d = h5Var2;
        h5Var2.setTextColor(-1);
        h5Var2.setWidthWrapContent(true);
        h5Var2.setTypeface(AndroidUtilities.bold());
        h5Var2.setTextSize(14);
        bh.g gVar = new bh.g(this, context, b6Var);
        this.f50503c = gVar;
        gVar.setWillNotDraw(false);
        gVar.addView(h5Var2, e6.e(-2, -2, 17));
        addView(gVar, e6.c(-1.0f, -1));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        if (this.f50505f != null) {
            f10 = 49.0f;
        } else {
            f10 = 36.0f;
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }
}
