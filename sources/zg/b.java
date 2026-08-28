package zg;

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
    public final TextPaint f50815a;
    public final TextPaint f50816b;
    public RadialProgress2 f50817c;
    public StaticLayout f50819f;
    public StaticLayout f50820g;
    public CharSequence d = "";
    public CharSequence f50818e = "";
    public int f50824l = -1;
    public final int h = AndroidUtilities.dp(64.0f);
    public final int f50821i = AndroidUtilities.dp(10.66f);
    public final int f50822j = AndroidUtilities.dp(12.0f);
    public final int f50823k = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f50815a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f50816b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int i9 = this.h;
        if (width > 0 && (width != this.f50824l || this.f50819f == null || this.f50820g == null)) {
            this.f50824l = width;
            int i10 = (width - i9) - this.f50822j;
            if (i10 <= 0) {
                this.f50819f = null;
                this.f50820g = null;
            } else {
                CharSequence charSequence = this.d;
                float f10 = i10;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                TextPaint textPaint = this.f50815a;
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f10, truncateAt);
                CharSequence charSequence2 = this.f50818e;
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f50816b;
                CharSequence ellipsize2 = TextUtils.ellipsize(charSequence2, textPaint2, f10, truncateAt2);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f50819f = new StaticLayout(ellipsize, textPaint, i10, alignment, 1.0f, 0.0f, false);
                this.f50820g = new StaticLayout(ellipsize2, textPaint2, i10, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f50819f != null && this.f50820g != null) {
            Rect bounds = getBounds();
            float f11 = bounds.left + i9;
            float f12 = bounds.top + this.f50821i;
            this.f50817c.q(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f11, f12);
            this.f50819f.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f11, this.f50819f.getHeight() + f12 + this.f50823k);
            this.f50820g.draw(canvas);
            canvas.restore();
            this.f50817c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f50815a.getFontMetricsInt();
        int i9 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i10 = this.f50821i;
        int i11 = i9 + i10 + this.f50823k;
        Paint.FontMetricsInt fontMetricsInt2 = this.f50816b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i11 + i10;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f50824l = -1;
        this.f50819f = null;
        this.f50820g = null;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f50817c.E = i9 / 255.0f;
        this.f50815a.setAlpha(i9);
        this.f50816b.setAlpha(i9);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f50815a.setColorFilter(colorFilter);
        this.f50816b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
