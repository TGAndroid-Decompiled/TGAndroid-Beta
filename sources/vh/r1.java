package vh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
public final class r1 extends q1 {
    public Drawable f51817i;
    public Drawable f51818j;
    public StaticLayout f51819k;
    public float f51820l;
    public float f51821m;
    public Paint f51822n;
    public final org.telegram.ui.ActionBar.f5 f51823o;

    public r1(org.telegram.ui.ActionBar.f5 f5Var, int i10, int i11, String str) {
        super(f5Var);
        this.f51823o = f5Var;
        this.f51796a = i10;
        Drawable mutate = f5Var.getContext().getResources().getDrawable(i11).mutate();
        this.f51817i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = (TextPaint) f5Var.f20326c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, org.telegram.messenger.i0.f16172q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f51819k = staticLayout;
        this.f51820l = staticLayout.getLineCount() > 0 ? this.f51819k.getLineWidth(0) : 0.0f;
        this.f51821m = this.f51819k.getLineCount() > 0 ? this.f51819k.getLineLeft(0) : 0.0f;
        this.f51797b = org.telegram.messenger.i0.N(45.6f) + this.f51820l;
        this.f51798c = org.telegram.messenger.i0.N(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        RectF rectF = this.f51799f;
        rectF.set(f7, f10, this.f51797b + f7, this.f51798c + f10);
        float a2 = this.f51800g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), (Paint) this.f51823o.f20325b);
        if (this.f51818j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f51817i == null) {
            org.telegram.messenger.g6 f11 = org.telegram.messenger.k6.f(null);
            this.f51817i = f11;
            if (c3.i0.t(f11)) {
                f11.f15863a = false;
            }
        }
        if (this.f51817i != null) {
            float L = org.telegram.messenger.i0.L(24.0f) / 2;
            this.f51817i.setBounds((int) ((rectF.left + org.telegram.messenger.i0.L(18.0f)) - L), (int) (((this.f51798c / 2.0f) + rectF.top) - L), (int) (rectF.left + org.telegram.messenger.i0.L(18.0f) + L), (int) ((this.f51798c / 2.0f) + rectF.top + L));
            this.f51817i.draw(canvas);
        }
        if (this.f51818j != null) {
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(rectF.left + org.telegram.messenger.i0.L(18.55f), ((rectF.top + this.f51798c) - org.telegram.messenger.i0.L(5.0f)) - org.telegram.messenger.i0.L(12.55f), rectF.left + org.telegram.messenger.i0.L(29.45f), rectF.left + org.telegram.messenger.i0.L(31.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), this.f51822n);
            this.f51818j.setBounds((int) (rectF.left + org.telegram.messenger.i0.L(18.0f)), (int) (((rectF.top + this.f51798c) - org.telegram.messenger.i0.L(5.0f)) - org.telegram.messenger.i0.L(12.0f)), (int) (rectF.left + org.telegram.messenger.i0.L(30.0f)), (int) ((rectF.top + this.f51798c) - org.telegram.messenger.i0.L(5.0f)));
            this.f51818j.draw(canvas);
            canvas.restore();
        }
        float f12 = rectF.left;
        if (this.f51817i != null) {
            i10 = 28;
        }
        canvas.translate((f12 + org.telegram.messenger.i0.L(i10 + 6)) - this.f51821m, ((this.f51798c / 2.0f) + rectF.top) - (this.f51819k.getHeight() / 2.0f));
        this.f51819k.draw(canvas);
        canvas.restore();
    }

    public r1(org.telegram.ui.ActionBar.f5 f5Var, CharSequence charSequence) {
        super(f5Var);
        this.f51823o = f5Var;
        this.f51796a = 5;
        TextPaint textPaint = (TextPaint) f5Var.f20326c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, org.telegram.messenger.i0.f16172q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f51819k = staticLayout;
        this.f51820l = staticLayout.getLineCount() > 0 ? this.f51819k.getLineWidth(0) : 0.0f;
        this.f51821m = this.f51819k.getLineCount() > 0 ? this.f51819k.getLineLeft(0) : 0.0f;
        this.f51797b = org.telegram.messenger.i0.N(12.0f) + this.f51820l;
        this.f51798c = org.telegram.messenger.i0.N(36.0f);
    }
}
