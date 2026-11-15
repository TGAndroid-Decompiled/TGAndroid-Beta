package th;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.RadialProgress2;
public final class b extends Drawable {
    public final TextPaint f57631a;
    public final TextPaint f57632b;
    public RadialProgress2 f57633c;
    public boolean d;
    public StaticLayout f57636g;
    public StaticLayout h;
    public CharSequence f57634e = "";
    public CharSequence f57635f = "";
    public int f57641m = -1;
    public final int f57637i = g0.L(64.0f);
    public final int f57638j = g0.L(10.66f);
    public final int f57639k = g0.L(12.0f);
    public final int f57640l = g0.L(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f57631a = textPaint;
        textPaint.setTextSize(g0.L(15.0f));
        textPaint.setTypeface(g0.o());
        TextPaint textPaint2 = new TextPaint(1);
        this.f57632b = textPaint2;
        textPaint2.setTextSize(g0.L(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.d;
        TextPaint textPaint = this.f57632b;
        TextPaint textPaint2 = this.f57631a;
        if (z10) {
            int alpha = textPaint2.getAlpha();
            int alpha2 = textPaint.getAlpha();
            textPaint2.setColor(j6.x0(null, j6.G6, false));
            textPaint2.setAlpha(alpha);
            textPaint.setColor(j6.x0(null, j6.f29241y6, false));
            textPaint.setAlpha(alpha2);
        }
        int width = getBounds().width();
        int i7 = this.f57637i;
        if (width > 0 && (width != this.f57641m || this.f57636g == null || this.h == null)) {
            this.f57641m = width;
            int i10 = (width - i7) - this.f57639k;
            if (i10 <= 0) {
                this.f57636g = null;
                this.h = null;
            } else {
                float f10 = i10;
                CharSequence ellipsize = TextUtils.ellipsize(this.f57634e, textPaint2, f10, TextUtils.TruncateAt.MIDDLE);
                CharSequence ellipsize2 = TextUtils.ellipsize(this.f57635f, textPaint, f10, TextUtils.TruncateAt.END);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f57636g = new StaticLayout(ellipsize, textPaint2, i10, alignment, 1.0f, 0.0f, false);
                this.h = new StaticLayout(ellipsize2, textPaint, i10, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f57636g != null && this.h != null) {
            Rect bounds = getBounds();
            float f11 = bounds.left + i7;
            float f12 = bounds.top + this.f57638j;
            this.f57633c.r(g0.L(10.0f) + bounds.left, g0.L(9.0f) + bounds.top, g0.L(42.0f) + g0.L(10.0f) + bounds.left, g0.L(42.0f) + g0.L(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f11, f12);
            this.f57636g.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f11, this.f57636g.getHeight() + f12 + this.f57640l);
            this.h.draw(canvas);
            canvas.restore();
            this.f57633c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f57631a.getFontMetricsInt();
        int i7 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i10 = this.f57638j;
        int i11 = i7 + i10 + this.f57640l;
        Paint.FontMetricsInt fontMetricsInt2 = this.f57632b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i11 + i10;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f57641m = -1;
        this.f57636g = null;
        this.h = null;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f57633c.E = i7 / 255.0f;
        this.f57631a.setAlpha(i7);
        this.f57632b.setAlpha(i7);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f57631a.setColorFilter(colorFilter);
        this.f57632b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
