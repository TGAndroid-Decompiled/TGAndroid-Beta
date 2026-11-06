package uh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import bg.s;
import jg.g;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
public final class a extends c implements te.b {
    public final te.a d;
    public final int[] f56801e;
    public final Drawable f56802f;
    public final TextPaint h;
    public StaticLayout f56803n;
    public int f56804r;
    public int f56805s;

    public a(Context context, f6 f6Var) {
        super(f6Var);
        this.d = new te.a(0, this, xq.h, 320L, false);
        this.f56801e = new int[]{16842910, 16842919};
        this.f56802f = g.h(context, 2131232488);
        this.h = new TextPaint(k6.P2);
        int w02 = k6.w0(k6.f27940i6, f6Var);
        if (this.f56818b != w02) {
            k6.H1(this.f56817a, w02, false);
            this.f56818b = w02;
        }
        b();
        c();
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i7) {
        this.f56817a.setAlpha(i7);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f56802f;
        drawable.setAlpha((int) ((1.0f - this.d.f55395e) * this.f56819c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f55395e) * this.f56819c));
    }

    public final void d(boolean z9, boolean z10) {
        this.d.a(z9, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f56817a.draw(canvas);
        s.b(canvas, this.f56802f, 1.0f - this.d.f55395e);
        if (this.f56803n != null) {
            canvas.save();
            canvas.translate(g0.L(44.0f) + bounds.left, g0.L(13.66f) + bounds.top);
            this.f56803n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i7) {
        if (this.f56805s != i7) {
            this.f56805s = i7;
            this.h.setColor(i7);
            this.f56802f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float exactCenterY = rect.exactCenterY();
        float L = g0.L(22.33f) + rect.left;
        g0.L(27.0f);
        g0.L(44.0f);
        s.d(this.f56802f, L, exactCenterY, 17);
        int width = rect.width() - g0.L(56.0f);
        if (this.f56803n != null && this.f56804r == width) {
            return;
        }
        this.f56804r = width;
        this.f56803n = new StaticLayout(hd.M0(2131747183, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
