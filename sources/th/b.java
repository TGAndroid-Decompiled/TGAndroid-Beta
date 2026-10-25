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
    public final TextPaint f49138a;
    public final TextPaint f49139b;
    public RadialProgress2 f49140c;
    public boolean d;
    public StaticLayout f49142g;
    public StaticLayout h;
    public CharSequence e = "";
    public CharSequence f49141f = "";
    public int f49147m = -1;
    public final int f49143i = AndroidUtilities.dp(64.0f);
    public final int f49144j = AndroidUtilities.dp(10.66f);
    public final int f49145k = AndroidUtilities.dp(12.0f);
    public final int f49146l = AndroidUtilities.dp(4.0f);

    public b() {
        TextPaint textPaint = new TextPaint(1);
        this.f49138a = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        TextPaint textPaint2 = new TextPaint(1);
        this.f49139b = textPaint2;
        textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.d;
        TextPaint textPaint = this.f49139b;
        TextPaint textPaint2 = this.f49138a;
        if (z10) {
            int alpha = textPaint2.getAlpha();
            int alpha2 = textPaint.getAlpha();
            textPaint2.setColor(y6.x0(null, y6.G6, false));
            textPaint2.setAlpha(alpha);
            textPaint.setColor(y6.x0(null, y6.f23746y6, false));
            textPaint.setAlpha(alpha2);
        }
        int width = getBounds().width();
        int i10 = this.f49143i;
        if (width > 0 && (width != this.f49147m || this.f49142g == null || this.h == null)) {
            this.f49147m = width;
            int i11 = (width - i10) - this.f49145k;
            if (i11 <= 0) {
                this.f49142g = null;
                this.h = null;
            } else {
                float f7 = i11;
                CharSequence ellipsize = TextUtils.ellipsize(this.e, textPaint2, f7, TextUtils.TruncateAt.MIDDLE);
                CharSequence ellipsize2 = TextUtils.ellipsize(this.f49141f, textPaint, f7, TextUtils.TruncateAt.END);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.f49142g = new StaticLayout(ellipsize, textPaint2, i11, alignment, 1.0f, 0.0f, false);
                this.h = new StaticLayout(ellipsize2, textPaint, i11, alignment, 1.0f, 0.0f, false);
            }
        }
        if (this.f49142g != null && this.h != null) {
            Rect bounds = getBounds();
            float f10 = bounds.left + i10;
            float f11 = bounds.top + this.f49144j;
            this.f49140c.r(AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(9.0f) + bounds.top, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(10.0f) + bounds.left, AndroidUtilities.dp(42.0f) + AndroidUtilities.dp(9.0f) + bounds.top);
            canvas.save();
            canvas.translate(f10, f11);
            this.f49142g.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(f10, this.f49142g.getHeight() + f11 + this.f49146l);
            this.h.draw(canvas);
            canvas.restore();
            this.f49140c.draw(canvas);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f49138a.getFontMetricsInt();
        int i10 = fontMetricsInt.descent - fontMetricsInt.ascent;
        int i11 = this.f49144j;
        int i12 = i10 + i11 + this.f49146l;
        Paint.FontMetricsInt fontMetricsInt2 = this.f49139b.getFontMetricsInt();
        return (fontMetricsInt2.descent - fontMetricsInt2.ascent) + i12 + i11;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f49147m = -1;
        this.f49142g = null;
        this.h = null;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f49140c.E = i10 / 255.0f;
        this.f49138a.setAlpha(i10);
        this.f49139b.setAlpha(i10);
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f49138a.setColorFilter(colorFilter);
        this.f49139b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
