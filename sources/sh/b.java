package sh;

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
    public final TextPaint f46383a;
    public final TextPaint f46384b;
    public RadialProgress2 f46385c;
    public StaticLayout f46387f;
    public StaticLayout f46388g;
    public CharSequence d = "";
    public CharSequence f46386e = "";
    public int f46392l = -1;
    public final int h = AndroidUtilities.dp(64.0f);
    public final int f46389i = AndroidUtilities.dp(10.66f);
    public final int f46390j = AndroidUtilities.dp(12.0f);
    public final int f46391k = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f46383a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f46384b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int i10 = this.h;
        if (width > 0 && (width != this.f46392l || this.f46387f == null || this.f46388g == null)) {
            this.f46392l = width;
            int i11 = (width - i10) - this.f46390j;
            if (i11 <= 0) {
                this.f46387f = null;
                this.f46388g = null;
            } else {
                CharSequence charSequence = this.d;
                float f7 = i11;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                TextPaint textPaint = this.f46383a;
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f7, truncateAt);
                CharSequence charSequence2 = this.f46386e;
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f46384b;
                CharSequence ellipsize2 = TextUtils.ellipsize(charSequence2, textPaint2, f7, truncateAt2);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f46387f = new StaticLayout(ellipsize, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.f46388g = new StaticLayout(ellipsize2, textPaint2, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f46387f != null && this.f46388g != null) {
            Rect bounds = getBounds();
            float f10 = bounds.left + i10;
            float f11 = bounds.top + this.f46389i;
            this.f46385c.q(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f10, f11);
            this.f46387f.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f10, this.f46387f.getHeight() + f11 + this.f46391k);
            this.f46388g.draw(canvas);
            canvas.restore();
            this.f46385c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f46383a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f46389i;
        int i12 = i10 + i11 + this.f46391k;
        Paint.FontMetricsInt fontMetricsInt2 = this.f46384b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f46392l = -1;
        this.f46387f = null;
        this.f46388g = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f46385c.E = i10 / 255.0f;
        this.f46383a.setAlpha(i10);
        this.f46384b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f46383a.setColorFilter(colorFilter);
        this.f46384b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
