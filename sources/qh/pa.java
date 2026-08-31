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
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class pa extends View {
    public final ij0 f45887a;
    public final org.telegram.ui.Components.j6 f45888b;
    public final Paint f45889c;
    public final Paint d;
    public final rc f45890e;
    public boolean f45891f;
    public final org.telegram.ui.Components.z5 h;

    public pa(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f45889c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f45890e = new rc(this);
        pr prVar = pr.h;
        this.h = new org.telegram.ui.Components.z5(this, 0L, 240L, prVar);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dp(1.66f), 805306368);
        paint2.setColor(855638016);
        int i10 = R.raw.group_pip_delete_icon;
        ij0 ij0Var = new ij0(i10, "" + R.raw.group_pip_delete_icon, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.f45887a = ij0Var;
        ij0Var.f27835s0 = this;
        ij0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        ij0Var.h = true;
        ij0Var.N(0);
        ij0Var.H(true);
        ij0Var.start();
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, false, false);
        this.f45888b = j6Var;
        j6Var.k(0.3f, 250L, prVar);
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.r(-1);
        j6Var.p(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dp(1.0f), 1073741824);
        j6Var.q(LocaleController.getString(R.string.TrashHintDrag), true, true);
        j6Var.f28029b = 17;
    }

    public final void a(boolean z4, boolean z10) {
        int i10;
        this.f45890e.c(z4);
        if (!z4 && !z10) {
            i10 = R.string.TrashHintDrag;
        } else {
            i10 = R.string.TrashHintRelease;
        }
        boolean z11 = true;
        this.f45888b.q(LocaleController.getString(i10), true, true);
        int i11 = 0;
        z11 = (!z4 || z10) ? false : false;
        this.f45891f = z11;
        ij0 ij0Var = this.f45887a;
        if (z11) {
            if (ij0Var.Y > 34) {
                ij0Var.L(0, false, false);
            }
            ij0Var.N(33);
            ij0Var.start();
        } else {
            if (z10) {
                i11 = 66;
            }
            ij0Var.N(i11);
            ij0Var.start();
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(30.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float e6 = (this.h.e(this.f45891f) * AndroidUtilities.dp(3.0f)) + dp;
        canvas.drawCircle(width, height, e6, this.d);
        canvas.drawCircle(width, height, e6, this.f45889c);
        float dp2 = AndroidUtilities.dp(48.0f) / 2.0f;
        ij0 ij0Var = this.f45887a;
        ij0Var.setBounds((int) (width - dp2), (int) (height - dp2), (int) (width + dp2), (int) (dp2 + height));
        ij0Var.draw(canvas);
        int dp3 = (int) (height + dp + AndroidUtilities.dp(7.0f));
        int width2 = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Components.j6 j6Var = this.f45888b;
        j6Var.setBounds(0, dp3, width2, height2);
        j6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, AndroidUtilities.dp(120.0f));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f45888b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
