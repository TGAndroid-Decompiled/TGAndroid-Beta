package rh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgress2;
public final class b extends Drawable {
    public final TextPaint f42862a;
    public final TextPaint f42863b;
    public RadialProgress2 f42864c;
    public StaticLayout f42865f;
    public StaticLayout f42866g;
    public CharSequence d = "";
    public CharSequence e = "";
    public int f42870l = -1;
    public final int h = AndroidUtilities.dp(64.0f);
    public final int f42867i = AndroidUtilities.dp(10.66f);
    public final int f42868j = AndroidUtilities.dp(12.0f);
    public final int f42869k = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f42862a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f42863b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int i10 = this.h;
        if (width > 0 && (width != this.f42870l || this.f42865f == null || this.f42866g == null)) {
            this.f42870l = width;
            int i11 = (width - i10) - this.f42868j;
            if (i11 <= 0) {
                this.f42865f = null;
                this.f42866g = null;
            } else {
                CharSequence charSequence = this.d;
                float f7 = i11;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                TextPaint textPaint = this.f42862a;
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f7, truncateAt);
                CharSequence charSequence2 = this.e;
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f42863b;
                CharSequence ellipsize2 = TextUtils.ellipsize(charSequence2, textPaint2, f7, truncateAt2);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f42865f = new StaticLayout(ellipsize, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.f42866g = new StaticLayout(ellipsize2, textPaint2, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f42865f != null && this.f42866g != null) {
            Rect bounds = getBounds();
            float f10 = bounds.left + i10;
            float f11 = bounds.top + this.f42867i;
            this.f42864c.q(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f10, f11);
            this.f42865f.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f10, this.f42865f.getHeight() + f11 + this.f42869k);
            this.f42866g.draw(canvas);
            canvas.restore();
            this.f42864c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f42862a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f42867i;
        int i12 = i10 + i11 + this.f42869k;
        Paint.FontMetricsInt fontMetricsInt2 = this.f42863b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f42870l = -1;
        this.f42865f = null;
        this.f42866g = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f42864c.E = i10 / 255.0f;
        this.f42862a.setAlpha(i10);
        this.f42863b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f42862a.setColorFilter(colorFilter);
        this.f42863b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
