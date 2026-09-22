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
    public final TextPaint f42574a;
    public final TextPaint f42575b;
    public RadialProgress2 f42576c;
    public StaticLayout f42577f;
    public StaticLayout f42578g;
    public CharSequence d = "";
    public CharSequence e = "";
    public int f42582l = -1;
    public final int h = AndroidUtilities.dp(64.0f);
    public final int f42579i = AndroidUtilities.dp(10.66f);
    public final int f42580j = AndroidUtilities.dp(12.0f);
    public final int f42581k = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f42574a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f42575b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int i10 = this.h;
        if (width > 0 && (width != this.f42582l || this.f42577f == null || this.f42578g == null)) {
            this.f42582l = width;
            int i11 = (width - i10) - this.f42580j;
            if (i11 <= 0) {
                this.f42577f = null;
                this.f42578g = null;
            } else {
                CharSequence charSequence = this.d;
                float f7 = i11;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                TextPaint textPaint = this.f42574a;
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f7, truncateAt);
                CharSequence charSequence2 = this.e;
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f42575b;
                CharSequence ellipsize2 = TextUtils.ellipsize(charSequence2, textPaint2, f7, truncateAt2);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f42577f = new StaticLayout(ellipsize, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.f42578g = new StaticLayout(ellipsize2, textPaint2, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f42577f != null && this.f42578g != null) {
            Rect bounds = getBounds();
            float f10 = bounds.left + i10;
            float f11 = bounds.top + this.f42579i;
            this.f42576c.q(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f10, f11);
            this.f42577f.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f10, this.f42577f.getHeight() + f11 + this.f42581k);
            this.f42578g.draw(canvas);
            canvas.restore();
            this.f42576c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f42574a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f42579i;
        int i12 = i10 + i11 + this.f42581k;
        Paint.FontMetricsInt fontMetricsInt2 = this.f42575b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f42582l = -1;
        this.f42577f = null;
        this.f42578g = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f42576c.E = i10 / 255.0f;
        this.f42574a.setAlpha(i10);
        this.f42575b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f42574a.setColorFilter(colorFilter);
        this.f42575b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
