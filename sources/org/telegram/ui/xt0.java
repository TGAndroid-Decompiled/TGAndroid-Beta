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

public final class xt0 extends View {

    public final Paint f44615a;

    public final org.telegram.ui.Components.i6 f44616b;

    public final TextPaint f44617c;
    public StaticLayout d;

    public float f44618e;

    public float f44619f;
    public final org.telegram.ui.Components.i6 h;

    public String f44620n;

    public boolean f44621r;

    public final org.telegram.ui.Components.y5 f44622s;
    public boolean v;

    public int f44623w;

    public xt0(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f44615a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f44617c = textPaint;
        this.f44621r = false;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.f44622s = new org.telegram.ui.Components.y5(this, 0L, 350L, erVar);
        paint.setColor(2130706432);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.f44616b = i6Var;
        i6Var.k(0.3f, 320L, erVar);
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
        i6Var2.k(0.3f, 320L, erVar);
        i6Var2.r(-1);
        i6Var2.t(AndroidUtilities.dp(14.0f));
        i6Var2.u(AndroidUtilities.bold());
        i6Var2.setCallback(this);
        i6Var2.q("0", true, true);
        i6Var2.G = AndroidUtilities.displaySize.x;
    }

    public final void a(int i10, int i11) {
        b(i10, i11, true);
    }

    public final void b(int i10, int i11, boolean z10) {
        boolean z11 = false;
        int iMax = Math.max(0, i10);
        int iMax2 = Math.max(iMax, i11);
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null && !TextUtils.equals(this.f44620n, LocaleController.getInstance().getCurrentLocaleInfo().shortName)) {
            c();
        }
        this.f44616b.q(String.format("%d", Integer.valueOf(LocaleController.isRTL ? iMax2 : iMax)), (!z10 || this.v || LocaleController.isRTL) ? false : true, true);
        if (!LocaleController.isRTL) {
            iMax = iMax2;
        }
        String str = String.format("%d", Integer.valueOf(iMax));
        if (z10 && !this.v && !LocaleController.isRTL) {
            z11 = true;
        }
        this.h.q(str, z11, true);
        this.v = !z10;
    }

    public final void c() {
        this.f44620n = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Of).replace("%1$d", "").replace("%2$d", ""), this.f44617c, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() >= 1) {
            this.f44618e = this.d.getLineWidth(0);
            this.f44619f = this.d.getLineDescent(0);
        } else {
            this.f44618e = 0.0f;
            this.f44619f = 0.0f;
        }
    }

    public final void d(boolean z10, boolean z11) {
        if (this.f44621r != z10) {
            this.f44621r = z10;
            if (!z10) {
                this.v = true;
            }
            if (!z11) {
                this.f44622s.d(z10 ? 1.0f : 0.0f, true);
            }
            invalidate();
        }
    }

    @Override
    public final boolean isShown() {
        return this.f44621r;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fD = this.f44622s.d(this.f44621r ? 1.0f : 0.0f, false);
        if (fD <= 0.0f) {
            return;
        }
        org.telegram.ui.Components.i6 i6Var = this.f44616b;
        float fD2 = i6Var.d() + this.f44618e;
        org.telegram.ui.Components.i6 i6Var2 = this.h;
        float fD3 = i6Var2.d() + fD2 + AndroidUtilities.dp(18.0f);
        float f10 = ((1.0f - fD) * (-AndroidUtilities.dp(8.0f))) + this.f44623w;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - fD3) / 2.0f, AndroidUtilities.dpf2(10.0f) + f10, (getWidth() + fD3) / 2.0f, AndroidUtilities.dpf2(33.0f) + f10);
        Paint paint = this.f44615a;
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * fD));
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), paint);
        paint.setAlpha(alpha);
        canvas.save();
        canvas.translate(((getWidth() - fD3) / 2.0f) + AndroidUtilities.dp(9.0f), f10 + AndroidUtilities.dp(9.5f));
        i6Var.setBounds(0, 0, (int) i6Var.d(), AndroidUtilities.dp(23.0f));
        int i10 = (int) (fD * 255.0f);
        i6Var.f29257w = i10;
        i6Var.draw(canvas);
        canvas.translate(i6Var.d(), 0.0f);
        canvas.save();
        canvas.translate((-(this.d.getWidth() - this.f44618e)) / 2.0f, ((this.f44619f / 2.0f) + (AndroidUtilities.dp(23.0f) - this.d.getHeight())) / 2.0f);
        this.f44617c.setAlpha(i10);
        this.d.draw(canvas);
        canvas.restore();
        canvas.translate(this.f44618e, 0.0f);
        i6Var2.setBounds(0, 0, (int) i6Var2.d(), AndroidUtilities.dp(23.0f));
        i6Var2.f29257w = i10;
        i6Var2.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.f44623w = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        this.f44616b.G = size;
        this.h.G = size;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), org.telegram.messenger.rl.B(43.0f, this.f44623w, 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f44616b == drawable || this.h == drawable || super.verifyDrawable(drawable);
    }
}
