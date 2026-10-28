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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.RadialProgress2;
public final class b extends Drawable {
    public final TextPaint f49176a;
    public final TextPaint f49177b;
    public RadialProgress2 f49178c;
    public boolean d;
    public StaticLayout f49180g;
    public StaticLayout h;
    public CharSequence e = "";
    public CharSequence f49179f = "";
    public int f49185m = -1;
    public final int f49181i = AndroidUtilities.dp(64.0f);
    public final int f49182j = AndroidUtilities.dp(10.66f);
    public final int f49183k = AndroidUtilities.dp(12.0f);
    public final int f49184l = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f49176a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f49177b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.d;
        TextPaint textPaint = this.f49177b;
        TextPaint textPaint2 = this.f49176a;
        if (z10) {
            int alpha = textPaint2.getAlpha();
            int alpha2 = textPaint.getAlpha();
            textPaint2.setColor(y6.x0(null, y6.G6, false));
            textPaint2.setAlpha(alpha);
            textPaint.setColor(y6.x0(null, y6.f23749y6, false));
            textPaint.setAlpha(alpha2);
        }
        int width = getBounds().width();
        int i10 = this.f49181i;
        if (width > 0 && (width != this.f49185m || this.f49180g == null || this.h == null)) {
            this.f49185m = width;
            int i11 = (width - i10) - this.f49183k;
            if (i11 <= 0) {
                this.f49180g = null;
                this.h = null;
            } else {
                float f7 = i11;
                CharSequence ellipsize = TextUtils.ellipsize(this.e, textPaint2, f7, TextUtils.TruncateAt.MIDDLE);
                CharSequence ellipsize2 = TextUtils.ellipsize(this.f49179f, textPaint, f7, TextUtils.TruncateAt.END);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f49180g = new StaticLayout(ellipsize, textPaint2, i11, alignment, 1.0f, 0.0f, false);
                this.h = new StaticLayout(ellipsize2, textPaint, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f49180g != null && this.h != null) {
            Rect bounds = getBounds();
            float f10 = bounds.left + i10;
            float f11 = bounds.top + this.f49182j;
            this.f49178c.r(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f10, f11);
            this.f49180g.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f10, this.f49180g.getHeight() + f11 + this.f49184l);
            this.h.draw(canvas);
            canvas.restore();
            this.f49178c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f49176a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f49182j;
        int i12 = i10 + i11 + this.f49184l;
        Paint.FontMetricsInt fontMetricsInt2 = this.f49177b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f49185m = -1;
        this.f49180g = null;
        this.h = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f49178c.E = i10 / 255.0f;
        this.f49176a.setAlpha(i10);
        this.f49177b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f49176a.setColorFilter(colorFilter);
        this.f49177b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
