package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wt0 extends View {
    public final Paint f44258a;
    public final org.telegram.ui.Components.i6 f44259b;
    public final TextPaint f44260c;
    public StaticLayout d;
    public float f44261e;
    public float f44262f;
    public final org.telegram.ui.Components.i6 h;
    public String f44263n;
    public boolean f44264r;
    public final org.telegram.ui.Components.y5 f44265s;
    public boolean v;
    public int f44266w;

    public wt0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f44258a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f44260c = textPaint;
        this.f44264r = false;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f44265s = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.f44259b = i6Var;
        i6Var.k(0.3f, 320L, grVar);
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.setCallback(this);
        i6Var.q("0", true, true);
        i6Var.G = AndroidUtilities.displaySize.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        c();
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true, false);
        this.h = i6Var2;
        i6Var2.k(0.3f, 320L, grVar);
        i6Var2.r(-1);
        i6Var2.t(AndroidUtilities.dp(14.0f));
        i6Var2.u(AndroidUtilities.bold());
        i6Var2.setCallback(this);
        i6Var2.q("0", true, true);
        i6Var2.G = AndroidUtilities.displaySize.x;
    }

    public final void a(int i9, int i10) {
        b(i9, i10, true);
    }

    public final void b(int i9, int i10, boolean z10) {
        int i11;
        boolean z11;
        boolean z12 = false;
        int max = Math.max(0, i9);
        int max2 = Math.max(max, i10);
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null && !TextUtils.equals(this.f44263n, LocaleController.getInstance().getCurrentLocaleInfo().shortName)) {
            c();
        }
        if (LocaleController.isRTL) {
            i11 = max2;
        } else {
            i11 = max;
        }
        String format = String.format("%d", Integer.valueOf(i11));
        if (z10 && !this.v && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44259b.q(format, z11, true);
        if (!LocaleController.isRTL) {
            max = max2;
        }
        String format2 = String.format("%d", Integer.valueOf(max));
        if (z10 && !this.v && !LocaleController.isRTL) {
            z12 = true;
        }
        this.h.q(format2, z12, true);
        this.v = !z10;
    }

    public final void c() {
        this.f44263n = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Of).replace("%1$d", "").replace("%2$d", ""), this.f44260c, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.f44261e = this.d.getLineWidth(0);
            this.f44262f = this.d.getLineDescent(0);
            return;
        }
        this.f44261e = 0.0f;
        this.f44262f = 0.0f;
    }

    public final void d(boolean z10, boolean z11) {
        float f10;
        if (this.f44264r != z10) {
            this.f44264r = z10;
            if (!z10) {
                this.v = true;
            }
            if (!z11) {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f44265s.d(f10, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean isShown() {
        return this.f44264r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.f44264r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = this.f44265s.d(f10, false);
        if (d <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.i6 i6Var = this.f44259b;
        float d9 = i6Var.d() + this.f44261e;
        org.telegram.ui.Components.i6 i6Var2 = this.h;
        float d10 = i6Var2.d() + d9 + AndroidUtilities.dp(18.0f);
        float f11 = ((1.0f - d) * (-AndroidUtilities.dp(8.0f))) + this.f44266w;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - d10) / 2.0f, AndroidUtilities.dpf2(10.0f) + f11, (getWidth() + d10) / 2.0f, AndroidUtilities.dpf2(33.0f) + f11);
        Paint paint = this.f44258a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * d));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - d10) / 2.0f) + AndroidUtilities.dp(9.0f), f11 + AndroidUtilities.dp(9.5f));
        i6Var.setBounds(0, 0, (int) i6Var.d(), AndroidUtilities.dp(23.0f));
        int i9 = (int) (d * 255.0f);
        i6Var.f29351w = i9;
        i6Var.draw(canvas);
        canvas.translate(i6Var.d(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.f44261e)) / 2.0f, ((this.f44262f / 2.0f) + (AndroidUtilities.dp(23.0f) - this.d.getHeight())) / 2.0f);
        this.f44260c.setAlpha(i9);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.f44261e, 0.0f);
        i6Var2.setBounds(0, 0, (int) i6Var2.d(), AndroidUtilities.dp(23.0f));
        i6Var2.f29351w = i9;
        i6Var2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        this.f44266w = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        this.f44259b.G = size;
        this.h.G = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), org.telegram.messenger.ll.C(43.0f, this.f44266w, 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f44259b != drawable && this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
