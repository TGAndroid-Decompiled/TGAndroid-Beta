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
    public Drawable f51832i;
    public Drawable f51833j;
    public StaticLayout f51834k;
    public float f51835l;
    public float f51836m;
    public Paint f51837n;
    public final org.telegram.ui.ActionBar.f5 f51838o;

    public r1(org.telegram.ui.ActionBar.f5 f5Var, int i10, int i11, String str) {
        super(f5Var);
        this.f51838o = f5Var;
        this.f51781a = i10;
        Drawable mutate = f5Var.getContext().getResources().getDrawable(i11).mutate();
        this.f51832i = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        String upperCase = str.toUpperCase();
        TextPaint textPaint = (TextPaint) f5Var.f20325c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(upperCase, textPaint, org.telegram.messenger.i0.f16026q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f51834k = staticLayout;
        this.f51835l = staticLayout.getLineCount() > 0 ? this.f51834k.getLineWidth(0) : 0.0f;
        this.f51836m = this.f51834k.getLineCount() > 0 ? this.f51834k.getLineLeft(0) : 0.0f;
        this.f51782b = org.telegram.messenger.i0.N(45.6f) + this.f51835l;
        this.f51783c = org.telegram.messenger.i0.N(36.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        RectF rectF = this.f51784f;
        rectF.set(f7, f10, this.f51782b + f7, this.f51783c + f10);
        float a2 = this.f51785g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), (Paint) this.f51838o.f20324b);
        if (this.f51833j != null) {
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        int i10 = 0;
        if (this.f51832i == null) {
            org.telegram.messenger.g6 f11 = org.telegram.messenger.k6.f(null);
            this.f51832i = f11;
            if (c3.i0.t(f11)) {
                f11.f15678a = false;
            }
        }
        if (this.f51832i != null) {
            float L = org.telegram.messenger.i0.L(24.0f) / 2;
            this.f51832i.setBounds((int) ((rectF.left + org.telegram.messenger.i0.L(18.0f)) - L), (int) (((this.f51783c / 2.0f) + rectF.top) - L), (int) (rectF.left + org.telegram.messenger.i0.L(18.0f) + L), (int) ((this.f51783c / 2.0f) + rectF.top + L));
            this.f51832i.draw(canvas);
        }
        if (this.f51833j != null) {
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(rectF.left + org.telegram.messenger.i0.L(18.55f), ((rectF.top + this.f51783c) - org.telegram.messenger.i0.L(5.0f)) - org.telegram.messenger.i0.L(12.55f), rectF.left + org.telegram.messenger.i0.L(29.45f), rectF.left + org.telegram.messenger.i0.L(31.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), this.f51837n);
            this.f51833j.setBounds((int) (rectF.left + org.telegram.messenger.i0.L(18.0f)), (int) (((rectF.top + this.f51783c) - org.telegram.messenger.i0.L(5.0f)) - org.telegram.messenger.i0.L(12.0f)), (int) (rectF.left + org.telegram.messenger.i0.L(30.0f)), (int) ((rectF.top + this.f51783c) - org.telegram.messenger.i0.L(5.0f)));
            this.f51833j.draw(canvas);
            canvas.restore();
        }
        float f12 = rectF.left;
        if (this.f51832i != null) {
            i10 = 28;
        }
        canvas.translate((f12 + org.telegram.messenger.i0.L(i10 + 6)) - this.f51836m, ((this.f51783c / 2.0f) + rectF.top) - (this.f51834k.getHeight() / 2.0f));
        this.f51834k.draw(canvas);
        canvas.restore();
    }

    public r1(org.telegram.ui.ActionBar.f5 f5Var, CharSequence charSequence) {
        super(f5Var);
        this.f51838o = f5Var;
        this.f51781a = 5;
        TextPaint textPaint = (TextPaint) f5Var.f20325c;
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint, org.telegram.messenger.i0.f16026q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f51834k = staticLayout;
        this.f51835l = staticLayout.getLineCount() > 0 ? this.f51834k.getLineWidth(0) : 0.0f;
        this.f51836m = this.f51834k.getLineCount() > 0 ? this.f51834k.getLineLeft(0) : 0.0f;
        this.f51782b = org.telegram.messenger.i0.N(12.0f) + this.f51835l;
        this.f51783c = org.telegram.messenger.i0.N(36.0f);
    }
}
