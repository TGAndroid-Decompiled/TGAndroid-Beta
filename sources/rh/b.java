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
    public final TextPaint f47660a;
    public final TextPaint f47661b;
    public RadialProgress2 f47662c;
    public StaticLayout f47664f;
    public StaticLayout f47665g;
    public CharSequence d = "";
    public CharSequence f47663e = "";
    public int f47669l = -1;
    public final int h = AndroidUtilities.dp(64.0f);
    public final int f47666i = AndroidUtilities.dp(10.66f);
    public final int f47667j = AndroidUtilities.dp(12.0f);
    public final int f47668k = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f47660a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f47661b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int i10 = this.h;
        if (width > 0 && (width != this.f47669l || this.f47664f == null || this.f47665g == null)) {
            this.f47669l = width;
            int i11 = (width - i10) - this.f47667j;
            if (i11 <= 0) {
                this.f47664f = null;
                this.f47665g = null;
            } else {
                CharSequence charSequence = this.d;
                float f7 = i11;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                TextPaint textPaint = this.f47660a;
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f7, truncateAt);
                CharSequence charSequence2 = this.f47663e;
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f47661b;
                CharSequence ellipsize2 = TextUtils.ellipsize(charSequence2, textPaint2, f7, truncateAt2);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f47664f = new StaticLayout(ellipsize, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.f47665g = new StaticLayout(ellipsize2, textPaint2, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f47664f != null && this.f47665g != null) {
            Rect bounds = getBounds();
            float f10 = bounds.left + i10;
            float f11 = bounds.top + this.f47666i;
            this.f47662c.q(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f10, f11);
            this.f47664f.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f10, this.f47664f.getHeight() + f11 + this.f47668k);
            this.f47665g.draw(canvas);
            canvas.restore();
            this.f47662c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f47660a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f47666i;
        int i12 = i10 + i11 + this.f47668k;
        Paint.FontMetricsInt fontMetricsInt2 = this.f47661b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f47669l = -1;
        this.f47664f = null;
        this.f47665g = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f47662c.E = i10 / 255.0f;
        this.f47660a.setAlpha(i10);
        this.f47661b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f47660a.setColorFilter(colorFilter);
        this.f47661b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
