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
import bi.m6;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public final class v0 extends Drawable {
    public static c1 E = new c1();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f60546a;
    public final f6 f60547b;
    public final Paint f60548c;
    public final Paint d;
    public final RectF f60549e;
    public final Path f60550f;
    public final boolean f60551g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f60552i;
    public RadialGradient f60553j;
    public final Matrix f60554k;
    public final u0 f60555l;
    public int[] f60556m;
    public LinearGradient f60557n;
    public final Matrix f60558o;
    public boolean f60559p;
    public final Paint f60560q;
    public final w5 f60561r;
    public float f60562s;
    public boolean f60563t;
    public int f60564u;
    public boolean v;
    public int f60565w;
    public int f60566x;
    public int f60567y;
    public Integer f60568z;

    public v0(ViewGroup viewGroup, f6 f6Var, boolean z9) {
        Paint paint = new Paint(1);
        this.f60548c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f60549e = new RectF();
        this.f60550f = new Path();
        this.f60554k = new Matrix();
        new Path();
        this.f60558o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f60560q = paint3;
        this.f60561r = new w5(new wg.p(this, 8), 320L, xq.h);
        this.f60562s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.f60565w = 0;
        int i7 = k6.f27852d6;
        this.f60567y = i7;
        this.f60546a = viewGroup;
        this.f60547b = f6Var;
        u0 u0Var = new u0(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.f60555l = u0Var;
        viewGroup.addOnAttachStateChangeListener(new m6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            u0Var.a();
        }
        this.f60551g = z9;
        int w02 = k6.w0(i7, f6Var);
        this.f60566x = w02;
        paint.setColor(w02);
        a(z9);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z9) {
        int i7;
        if (z9) {
            i7 = k6.w0(k6.f27795a6, this.f60547b);
        } else {
            i7 = 0;
        }
        if (this.f60563t == z9 && (!z9 || this.f60564u == i7)) {
            return;
        }
        this.f60563t = z9;
        Paint paint = this.f60548c;
        if (z9) {
            this.f60564u = i7;
            paint.setShadowLayer(org.telegram.messenger.g0.L(1.66f), 0.0f, org.telegram.messenger.g0.L(0.33f), i7);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: zh.v0.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f60546a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f60553j = null;
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
        u0 u0Var = this.f60555l;
        if (stargiftattributepattern == null) {
            u0Var.g(null, false);
            return;
        }
        u0Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f26962id;
        }
    }

    public final void f(boolean z9, boolean z10) {
        if (this.f60559p == z9) {
            return;
        }
        this.f60559p = z9;
        if (!z10) {
            this.f60561r.a(z9);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f60556m == iArr) {
            return;
        }
        this.f60556m = iArr;
        this.f60557n = null;
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
