package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.i0;
public final class a extends Drawable {
    public final TextPaint f46584a;
    public final TextPaint f46585b;
    public final RectF f46586c;
    public final Drawable d;
    public float e;
    public String f46587f;

    public a(Context context) {
        TextPaint textPaint = new TextPaint(1);
        this.f46584a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f46585b = textPaint2;
        this.f46586c = new RectF();
        textPaint.setColor(-1);
        textPaint.setTypeface(i0.o());
        textPaint.setTextSize(i0.L(12.0f));
        textPaint2.setColor(-6915073);
        this.d = context.getDrawable(2131231927);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f46586c;
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        canvas.drawRoundRect(rectF, i0.L(12.0f), i0.L(12.0f), this.f46585b);
        int L = i0.L(2.0f) + bounds.left;
        int L2 = i0.L(1.0f) + bounds.top;
        int L3 = i0.L(2.0f) + bounds.left;
        Drawable drawable = this.d;
        drawable.setBounds(L, L2, drawable.getIntrinsicWidth() + L3, drawable.getIntrinsicHeight() + i0.L(1.0f) + getBounds().top);
        drawable.draw(canvas);
        String str = this.f46587f;
        if (str != null) {
            canvas.drawText(str, i0.L(16.5f) + bounds.left, i0.L(13.0f) + bounds.top, this.f46584a);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return i0.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return (int) (i0.L(23.0f) + this.e);
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
