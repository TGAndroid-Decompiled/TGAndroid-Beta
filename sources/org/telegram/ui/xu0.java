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
public final class xu0 extends View {
    public final Paint f42894a;
    public final org.telegram.ui.Components.p6 f42895b;
    public final TextPaint f42896c;
    public StaticLayout d;
    public float f42897e;
    public float f42898f;
    public final org.telegram.ui.Components.p6 h;
    public String f42899n;
    public boolean f42900r;
    public final org.telegram.ui.Components.e6 f42901s;
    public boolean v;
    public int f42902w;

    public xu0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f42894a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f42896c = textPaint;
        this.f42900r = false;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.f42901s = new org.telegram.ui.Components.e6(this, 0L, 350L, prVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.f42895b = p6Var;
        p6Var.k(0.3f, 320L, prVar);
        p6Var.r(-1);
        p6Var.t(AndroidUtilities.dp(14.0f));
        p6Var.u(AndroidUtilities.bold());
        p6Var.setCallback(this);
        p6Var.q("0", true, true);
        p6Var.G = AndroidUtilities.displaySize.x;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        c();
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(false, true, true, false);
        this.h = p6Var2;
        p6Var2.k(0.3f, 320L, prVar);
        p6Var2.r(-1);
        p6Var2.t(AndroidUtilities.dp(14.0f));
        p6Var2.u(AndroidUtilities.bold());
        p6Var2.setCallback(this);
        p6Var2.q("0", true, true);
        p6Var2.G = AndroidUtilities.displaySize.x;
    }

    public final void a(int i10, int i11) {
        b(i10, i11, true);
    }

    public final void b(int i10, int i11, boolean z10) {
        int i12;
        boolean z11;
        boolean z12 = false;
        int max = Math.max(0, i10);
        int max2 = Math.max(max, i11);
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null && !TextUtils.equals(this.f42899n, LocaleController.getInstance().getCurrentLocaleInfo().shortName)) {
            c();
        }
        if (LocaleController.isRTL) {
            i12 = max2;
        } else {
            i12 = max;
        }
        String format = String.format("%d", Integer.valueOf(i12));
        if (z10 && !this.v && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42895b.q(format, z11, true);
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
        this.f42899n = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Of).replace("%1$d", "").replace("%2$d", ""), this.f42896c, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.f42897e = this.d.getLineWidth(0);
            this.f42898f = this.d.getLineDescent(0);
            return;
        }
        this.f42897e = 0.0f;
        this.f42898f = 0.0f;
    }

    public final void d(boolean z10, boolean z11) {
        float f7;
        if (this.f42900r != z10) {
            this.f42900r = z10;
            if (!z10) {
                this.v = true;
            }
            if (!z11) {
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.f42901s.d(f7, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean isShown() {
        return this.f42900r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.f42900r) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.f42901s.d(f7, false);
        if (d <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.p6 p6Var = this.f42895b;
        float d10 = p6Var.d() + this.f42897e;
        org.telegram.ui.Components.p6 p6Var2 = this.h;
        float d11 = p6Var2.d() + d10 + AndroidUtilities.dp(18.0f);
        float f10 = ((1.0f - d) * (-AndroidUtilities.dp(8.0f))) + this.f42902w;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - d11) / 2.0f, AndroidUtilities.dpf2(10.0f) + f10, (getWidth() + d11) / 2.0f, AndroidUtilities.dpf2(33.0f) + f10);
        Paint paint = this.f42894a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * d));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - d11) / 2.0f) + AndroidUtilities.dp(9.0f), f10 + AndroidUtilities.dp(9.5f));
        p6Var.setBounds(0, 0, (int) p6Var.d(), AndroidUtilities.dp(23.0f));
        int i10 = (int) (d * 255.0f);
        p6Var.f29303w = i10;
        p6Var.draw(canvas);
        canvas.translate(p6Var.d(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.f42897e)) / 2.0f, ((this.f42898f / 2.0f) + (AndroidUtilities.dp(23.0f) - this.d.getHeight())) / 2.0f);
        this.f42896c.setAlpha(i10);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.f42897e, 0.0f);
        p6Var2.setBounds(0, 0, (int) p6Var2.d(), AndroidUtilities.dp(23.0f));
        p6Var2.f29303w = i10;
        p6Var2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.f42902w = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        this.f42895b.G = size;
        this.h.G = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), org.telegram.messenger.vl.C(43.0f, this.f42902w, 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f42895b != drawable && this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
