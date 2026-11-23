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
import bg.t;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.nr;
public final class a extends c implements te.b {
    public final te.a d;
    public final int[] f59013e;
    public final Drawable f59014f;
    public final TextPaint h;
    public StaticLayout f59015n;
    public int f59016r;
    public int f59017s;

    public a(Context context, h6 h6Var) {
        super(h6Var);
        this.d = new te.a(0, this, nr.h, 320L, false);
        this.f59013e = new int[]{16842910, 16842919};
        this.f59014f = i5.c.g(context, 2131232490);
        this.h = new TextPaint(m6.P2);
        int w02 = m6.w0(m6.f29473i6, h6Var);
        if (this.f59030b != w02) {
            m6.H1(this.f59029a, w02, false);
            this.f59030b = w02;
        }
        b();
        c();
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i7) {
        this.f59029a.setAlpha(i7);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f59014f;
        drawable.setAlpha((int) ((1.0f - this.d.f57700e) * this.f59031c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f57700e) * this.f59031c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f59029a.draw(canvas);
        t.b(canvas, this.f59014f, 1.0f - this.d.f57700e);
        if (this.f59015n != null) {
            canvas.save();
            canvas.translate(g0.L(44.0f) + bounds.left, g0.L(13.66f) + bounds.top);
            this.f59015n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i7) {
        if (this.f59017s != i7) {
            this.f59017s = i7;
            this.h.setColor(i7);
            this.f59014f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
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
        t.d(this.f59014f, L, exactCenterY, 17);
        int width = rect.width() - g0.L(56.0f);
        if (this.f59015n != null && this.f59016r == width) {
            return;
        }
        this.f59016r = width;
        this.f59015n = new StaticLayout(hd.N0(2131746990, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
