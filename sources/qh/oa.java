package qh;

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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class oa extends View {
    public final hj0 f45846a;
    public final org.telegram.ui.Components.j6 f45847b;
    public final Paint f45848c;
    public final Paint d;
    public final rc f45849e;
    public boolean f45850f;
    public final org.telegram.ui.Components.z5 h;

    public oa(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f45848c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f45849e = new rc(this);
        pr prVar = pr.h;
        this.h = new org.telegram.ui.Components.z5(this, 0L, 240L, prVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        hj0 hj0Var = new hj0(R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f45846a = hj0Var;
        hj0Var.f27542s0 = this;
        hj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        hj0Var.h = true;
        hj0Var.N(0);
        hj0Var.H(true);
        hj0Var.start();
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, false, false);
        this.f45847b = j6Var;
        j6Var.k(0.3f, 250L, prVar);
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.r(-1);
        j6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        j6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        j6Var.f27999b = 17;
    }

    public final void a(boolean z4, boolean z10) {
        int i10;
        this.f45849e.c(z4);
        if (!z4 && !z10) {
            i10 = R.string.TrashHintDrag;
        } else {
            i10 = R.string.TrashHintRelease;
        }
        boolean z11 = true;
        this.f45847b.q(LocaleController.getString(i10), true, true);
        int i11 = 0;
        z11 = (!z4 || z10) ? false : false;
        this.f45850f = z11;
        hj0 hj0Var = this.f45846a;
        if (z11) {
            if (hj0Var.Y > 34) {
                hj0Var.L(0, false, false);
            }
            hj0Var.N(33);
            hj0Var.start();
        } else {
            if (z10) {
                i11 = 66;
            }
            hj0Var.N(i11);
            hj0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e6 = (this.h.e(this.f45850f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e6, this.d);
        canvas.drawCircle(width, height, e6, this.f45848c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        hj0 hj0Var = this.f45846a;
        hj0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        hj0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.j6 j6Var = this.f45847b;
        j6Var.setBounds(0, dp3, width2, height2);
        j6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f45847b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
