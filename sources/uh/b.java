package uh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;
public final class b extends Drawable {
    public final TextPaint f56339a;
    public final TextPaint f56340b;
    public RadialProgress2 f56341c;
    public boolean d;
    public StaticLayout f56344g;
    public StaticLayout h;
    public CharSequence f56342e = "";
    public CharSequence f56343f = "";
    public int f56349m = -1;
    public final int f56345i = g0.L(64.0f);
    public final int f56346j = g0.L(10.66f);
    public final int f56347k = g0.L(12.0f);
    public final int f56348l = g0.L(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f56339a = textPaint;
        textPaint.setTextSize(g0.L(15.0f));
        textPaint.setTypeface(g0.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.f56340b = textPaint2;
        textPaint2.setTextSize(g0.L(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.d;
        TextPaint textPaint = this.f56340b;
        TextPaint textPaint2 = this.f56339a;
        if (z10) {
            int alpha = textPaint2.getAlpha();
            int alpha2 = textPaint.getAlpha();
            textPaint2.setColor(k6.x0(null, k6.G6, false));
            textPaint2.setAlpha(alpha);
            textPaint.setColor(k6.x0(null, k6.f28273y6, false));
            textPaint.setAlpha(alpha2);
        }
        int width = getBounds().width();
        int i3 = this.f56345i;
        if (width > 0 && (width != this.f56349m || this.f56344g == null || this.h == null)) {
            this.f56349m = width;
            int i10 = (width - i3) - this.f56347k;
            if (i10 <= 0) {
                this.f56344g = null;
                this.h = null;
            } else {
                float f10 = i10;
                CharSequence ellipsize = TextUtils.ellipsize(this.f56342e, textPaint2, f10, TextUtils.TruncateAt.MIDDLE);
                CharSequence ellipsize2 = TextUtils.ellipsize(this.f56343f, textPaint, f10, TextUtils.TruncateAt.END);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f56344g = new StaticLayout(ellipsize, textPaint2, i10, alignment, 1.0f, 0.0f, false);
                this.h = new StaticLayout(ellipsize2, textPaint, i10, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f56344g != null && this.h != null) {
            Rect bounds = getBounds();
            float f11 = bounds.left + i3;
            float f12 = bounds.top + this.f56346j;
            this.f56341c.r(g0.L(10.0f) + bounds.left, g0.L(9.0f) + bounds.top, g0.L(42.0f) + g0.L(10.0f) + bounds.left, g0.L(42.0f) + g0.L(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f11, f12);
            this.f56344g.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f11, this.f56344g.getHeight() + f12 + this.f56348l);
            this.h.draw(canvas);
            canvas.restore();
            this.f56341c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f56339a.getFontMetricsInt();
        int i3 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i10 = this.f56346j;
        int i11 = i3 + i10 + this.f56348l;
        Paint.FontMetricsInt fontMetricsInt2 = this.f56340b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i11 + i10;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f56349m = -1;
        this.f56344g = null;
        this.h = null;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f56341c.E = i3 / 255.0f;
        this.f56339a.setAlpha(i3);
        this.f56340b.setAlpha(i3);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f56339a.setColorFilter(colorFilter);
        this.f56340b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
