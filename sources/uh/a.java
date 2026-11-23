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
    public final int[] f58978e;
    public final Drawable f58979f;
    public final TextPaint h;
    public StaticLayout f58980n;
    public int f58981r;
    public int f58982s;

    public a(Context context, h6 h6Var) {
        super(h6Var);
        this.d = new te.a(0, this, nr.h, 320L, false);
        this.f58978e = new int[]{16842910, 16842919};
        this.f58979f = i5.c.g(context, 2131232490);
        this.h = new TextPaint(m6.P2);
        int w02 = m6.w0(m6.f29439i6, h6Var);
        if (this.f58995b != w02) {
            m6.H1(this.f58994a, w02, false);
            this.f58995b = w02;
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
        this.f58994a.setAlpha(i7);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f58979f;
        drawable.setAlpha((int) ((1.0f - this.d.f57665e) * this.f58996c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f57665e) * this.f58996c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f58994a.draw(canvas);
        t.b(canvas, this.f58979f, 1.0f - this.d.f57665e);
        if (this.f58980n != null) {
            canvas.save();
            canvas.translate(g0.L(44.0f) + bounds.left, g0.L(13.66f) + bounds.top);
            this.f58980n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i7) {
        if (this.f58982s != i7) {
            this.f58982s = i7;
            this.h.setColor(i7);
            this.f58979f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
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
        t.d(this.f58979f, L, exactCenterY, 17);
        int width = rect.width() - g0.L(56.0f);
        if (this.f58980n != null && this.f58981r == width) {
            return;
        }
        this.f58981r = width;
        this.f58980n = new StaticLayout(hd.N0(2131746990, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
