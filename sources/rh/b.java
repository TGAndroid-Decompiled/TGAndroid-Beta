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
    public final TextPaint f47536a;
    public final TextPaint f47537b;
    public RadialProgress2 f47538c;
    public StaticLayout f47540f;
    public StaticLayout f47541g;
    public CharSequence d = "";
    public CharSequence f47539e = "";
    public int f47545l = -1;
    public final int h = AndroidUtilities.dp(64.0f);
    public final int f47542i = AndroidUtilities.dp(10.66f);
    public final int f47543j = AndroidUtilities.dp(12.0f);
    public final int f47544k = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f47536a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f47537b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        int i10 = this.h;
        if (width > 0 && (width != this.f47545l || this.f47540f == null || this.f47541g == null)) {
            this.f47545l = width;
            int i11 = (width - i10) - this.f47543j;
            if (i11 <= 0) {
                this.f47540f = null;
                this.f47541g = null;
            } else {
                CharSequence charSequence = this.d;
                float f7 = i11;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                TextPaint textPaint = this.f47536a;
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint, f7, truncateAt);
                CharSequence charSequence2 = this.f47539e;
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f47537b;
                CharSequence ellipsize2 = TextUtils.ellipsize(charSequence2, textPaint2, f7, truncateAt2);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f47540f = new StaticLayout(ellipsize, textPaint, i11, alignment, 1.0f, 0.0f, false);
                this.f47541g = new StaticLayout(ellipsize2, textPaint2, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f47540f != null && this.f47541g != null) {
            Rect bounds = getBounds();
            float f10 = bounds.left + i10;
            float f11 = bounds.top + this.f47542i;
            this.f47538c.q(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f10, f11);
            this.f47540f.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f10, this.f47540f.getHeight() + f11 + this.f47544k);
            this.f47541g.draw(canvas);
            canvas.restore();
            this.f47538c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f47536a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f47542i;
        int i12 = i10 + i11 + this.f47544k;
        Paint.FontMetricsInt fontMetricsInt2 = this.f47537b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f47545l = -1;
        this.f47540f = null;
        this.f47541g = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f47538c.E = i10 / 255.0f;
        this.f47536a.setAlpha(i10);
        this.f47537b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f47536a.setColorFilter(colorFilter);
        this.f47537b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
