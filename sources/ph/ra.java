package ph;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rc;
public final class ra extends View {
    public final gj0 f42293a;
    public final org.telegram.ui.Components.j6 f42294b;
    public final Paint f42295c;
    public final Paint d;
    public final rc e;
    public boolean f42296f;
    public final org.telegram.ui.Components.z5 h;

    public ra(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f42295c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new rc(this);
        mr mrVar = mr.h;
        this.h = new org.telegram.ui.Components.z5(this, 0L, 240L, mrVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        gj0 gj0Var = new gj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f42293a = gj0Var;
        gj0Var.f25176s0 = this;
        gj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        gj0Var.h = true;
        gj0Var.N(0);
        gj0Var.H(true);
        gj0Var.start();
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, false, false);
        this.f42294b = j6Var;
        j6Var.k(0.3f, 250L, mrVar);
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.r(-1);
        j6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        j6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        j6Var.f25847b = 17;
    }

    public final void a(boolean z4, boolean z10) {
        int i10;
        this.e.c(z4);
        if (!z4 && !z10) {
            i10 = R.string.TrashHintDrag;
        } else {
            i10 = R.string.TrashHintRelease;
        }
        boolean z11 = true;
        this.f42294b.q(LocaleController.getString(i10), true, true);
        int i11 = 0;
        z11 = (!z4 || z10) ? false : false;
        this.f42296f = z11;
        gj0 gj0Var = this.f42293a;
        if (z11) {
            if (gj0Var.Y > 34) {
                gj0Var.L(0, false, false);
            }
            gj0Var.N(33);
            gj0Var.start();
        } else {
            if (z10) {
                i11 = 66;
            }
            gj0Var.N(i11);
            gj0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e = (this.h.e(this.f42296f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e, this.d);
        canvas.drawCircle(width, height, e, this.f42295c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        gj0 gj0Var = this.f42293a;
        gj0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        gj0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.j6 j6Var = this.f42294b;
        j6Var.setBounds(0, dp3, width2, height2);
        j6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f42294b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
