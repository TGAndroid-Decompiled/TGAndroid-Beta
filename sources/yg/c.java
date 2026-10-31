package yg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;
import org.telegram.ui.ActionBar.t6;
import rf.o;
public final class c extends Drawable {
    public final int f54433a;
    public final Drawable f54434b;
    public int f54435c;
    public int d;

    public c() {
        this.f54433a = 1;
        this.d = 255;
        this.f54434b = i0.a.f(w0.f19025b, 2131232694);
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f54433a) {
            case 0:
                this.f54434b.draw(canvas);
                return;
            default:
                float exactCenterX = getBounds().exactCenterX();
                float exactCenterY = getBounds().exactCenterY();
                int x02 = t6.x0(null, t6.G6, false);
                int x03 = t6.x0(null, t6.f20929d6, false);
                int i10 = this.f54435c;
                Drawable drawable = this.f54434b;
                if (i10 != x03) {
                    this.f54435c = x03;
                    drawable.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_IN));
                }
                canvas.drawCircle(exactCenterX, exactCenterY, i0.L(7.6666665f), t6.n0(i0.b.o(x03, this.d)));
                canvas.drawCircle(exactCenterX, exactCenterY, i0.L(6.6666665f), t6.n0(i0.b.o(x02, this.d)));
                o.d(drawable, exactCenterX, exactCenterY, 17);
                canvas.translate(0.0f, i0.L(0.66f));
                canvas.save();
                canvas.rotate(90.0f, exactCenterX, exactCenterY);
                o.b(canvas, drawable, 0.8f);
                canvas.restore();
                return;
        }
    }

    @Override
    public final int getAlpha() {
        switch (this.f54433a) {
            case 0:
                return this.f54434b.getAlpha();
            default:
                return this.d;
        }
    }

    @Override
    public int getIntrinsicHeight() {
        switch (this.f54433a) {
            case 1:
                return i0.L(13.333333f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        switch (this.f54433a) {
            case 1:
                return i0.L(13.333333f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f54433a) {
            case 0:
                return this.f54434b.getOpacity();
            default:
                return -3;
        }
    }

    @Override
    public void onBoundsChange(Rect rect) {
        switch (this.f54433a) {
            case 0:
                super.onBoundsChange(rect);
                int width = rect.width();
                int i10 = this.f54435c;
                int i11 = (width - i10) / 2;
                int height = rect.height();
                int i12 = this.d;
                int i13 = (height - i12) / 2;
                this.f54434b.setBounds(i11, i13, i10 + i11, i12 + i13);
                return;
            default:
                super.onBoundsChange(rect);
                return;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        switch (this.f54433a) {
            case 0:
                this.f54434b.setAlpha(i10);
                return;
            default:
                this.d = i10;
                this.f54434b.setAlpha(i10);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f54433a;
    }

    public c(int i10, int i11, Drawable drawable) {
        this.f54433a = 0;
        this.f54435c = i10;
        this.d = i11;
        this.f54434b = drawable;
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
