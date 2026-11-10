package zh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
public final class v0 extends Drawable {
    public static c1 E = new c1();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f60576a;
    public final h6 f60577b;
    public final Paint f60578c;
    public final Paint d;
    public final RectF f60579e;
    public final Path f60580f;
    public final boolean f60581g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f60582i;
    public RadialGradient f60583j;
    public final Matrix f60584k;
    public final u0 f60585l;
    public int[] f60586m;
    public LinearGradient f60587n;
    public final Matrix f60588o;
    public boolean f60589p;
    public final Paint f60590q;
    public final v5 f60591r;
    public float f60592s;
    public boolean f60593t;
    public int f60594u;
    public boolean v;
    public int f60595w;
    public int f60596x;
    public int f60597y;
    public Integer f60598z;

    public v0(ViewGroup viewGroup, h6 h6Var, boolean z9) {
        Paint paint = new Paint(1);
        this.f60578c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f60579e = new RectF();
        this.f60580f = new Path();
        this.f60584k = new Matrix();
        new Path();
        this.f60588o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f60590q = paint3;
        this.f60591r = new v5(new wg.a0(this, 6), 320L, wq.h);
        this.f60592s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.f60595w = 0;
        int i7 = m6.f27890d6;
        this.f60597y = i7;
        this.f60576a = viewGroup;
        this.f60577b = h6Var;
        u0 u0Var = new u0(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.f60585l = u0Var;
        viewGroup.addOnAttachStateChangeListener(new bi.m6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            u0Var.a();
        }
        this.f60581g = z9;
        int w02 = m6.w0(i7, h6Var);
        this.f60596x = w02;
        paint.setColor(w02);
        a(z9);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z9) {
        int i7;
        if (z9) {
            i7 = m6.w0(m6.f27833a6, this.f60577b);
        } else {
            i7 = 0;
        }
        if (this.f60593t == z9 && (!z9 || this.f60594u == i7)) {
            return;
        }
        this.f60593t = z9;
        Paint paint = this.f60578c;
        if (z9) {
            this.f60594u = i7;
            paint.setShadowLayer(org.telegram.messenger.g0.L(1.66f), 0.0f, org.telegram.messenger.g0.L(0.33f), i7);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: zh.v0.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f60576a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f60583j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.A = 0L;
        u0 u0Var = this.f60585l;
        if (stargiftattributepattern == null) {
            u0Var.g(null, false);
            return;
        }
        u0Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f26966id;
        }
    }

    public final void f(boolean z9, boolean z10) {
        if (this.f60589p == z9) {
            return;
        }
        this.f60589p = z9;
        if (!z10) {
            this.f60591r.a(z9);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f60586m == iArr) {
            return;
        }
        this.f60586m = iArr;
        this.f60587n = null;
        c();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        rect.set(org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(4.0f));
        return true;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
