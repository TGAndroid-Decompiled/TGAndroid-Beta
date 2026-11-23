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
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.kr;
public final class a extends c implements te.b {
    public final te.a d;
    public final int[] f59095e;
    public final Drawable f59096f;
    public final TextPaint h;
    public StaticLayout f59097n;
    public int f59098r;
    public int f59099s;

    public a(Context context, i6 i6Var) {
        super(i6Var);
        this.d = new te.a(0, this, kr.h, 320L, false);
        this.f59095e = new int[]{16842910, 16842919};
        this.f59096f = i5.c.g(context, 2131232493);
        this.h = new TextPaint(n6.P2);
        int w02 = n6.w0(n6.f29543i6, i6Var);
        if (this.f59112b != w02) {
            n6.H1(this.f59111a, w02, false);
            this.f59112b = w02;
        }
        b();
        c();
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i7) {
        this.f59111a.setAlpha(i7);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f59096f;
        drawable.setAlpha((int) ((1.0f - this.d.f57779e) * this.f59113c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f57779e) * this.f59113c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f59111a.draw(canvas);
        t.b(canvas, this.f59096f, 1.0f - this.d.f57779e);
        if (this.f59097n != null) {
            canvas.save();
            canvas.translate(g0.L(44.0f) + bounds.left, g0.L(13.66f) + bounds.top);
            this.f59097n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i7) {
        if (this.f59099s != i7) {
            this.f59099s = i7;
            this.h.setColor(i7);
            this.f59096f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
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
        t.d(this.f59096f, L, exactCenterY, 17);
        int width = rect.width() - g0.L(56.0f);
        if (this.f59097n != null && this.f59098r == width) {
            return;
        }
        this.f59098r = width;
        this.f59097n = new StaticLayout(gd.N0(2131746990, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
