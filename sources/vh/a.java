package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import cg.r;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
public final class a extends c implements qe.b {
    public final qe.a d;
    public final int[] f56937e;
    public final Drawable f56938f;
    public final TextPaint h;
    public StaticLayout f56939n;
    public int f56940r;
    public int f56941s;

    public a(Context context, e6 e6Var) {
        super(e6Var);
        this.d = new qe.a(0, this, xq.h, 320L, false);
        this.f56937e = new int[]{16842910, 16842919};
        this.f56938f = p1.g(context, 2131232488);
        this.h = new TextPaint(k6.P2);
        int w02 = k6.w0(k6.f27972i6, e6Var);
        if (this.f56954b != w02) {
            k6.H1(this.f56953a, w02, false);
            this.f56954b = w02;
        }
        b();
        c();
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i3) {
        this.f56953a.setAlpha(i3);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f56938f;
        drawable.setAlpha((int) ((1.0f - this.d.f53840e) * this.f56955c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f53840e) * this.f56955c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f56953a.draw(canvas);
        r.b(canvas, this.f56938f, 1.0f - this.d.f53840e);
        if (this.f56939n != null) {
            canvas.save();
            canvas.translate(g0.L(44.0f) + bounds.left, g0.L(13.66f) + bounds.top);
            this.f56939n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i3) {
        if (this.f56941s != i3) {
            this.f56941s = i3;
            this.h.setColor(i3);
            this.f56938f.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
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
        r.d(this.f56938f, L, exactCenterY, 17);
        int width = rect.width() - g0.L(56.0f);
        if (this.f56939n != null && this.f56940r == width) {
            return;
        }
        this.f56940r = width;
        this.f56939n = new StaticLayout(bd.M0(2131747192, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
