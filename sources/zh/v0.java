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
    public final ViewGroup f60547a;
    public final f6 f60548b;
    public final Paint f60549c;
    public final Paint d;
    public final RectF f60550e;
    public final Path f60551f;
    public final boolean f60552g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f60553i;
    public RadialGradient f60554j;
    public final Matrix f60555k;
    public final u0 f60556l;
    public int[] f60557m;
    public LinearGradient f60558n;
    public final Matrix f60559o;
    public boolean f60560p;
    public final Paint f60561q;
    public final w5 f60562r;
    public float f60563s;
    public boolean f60564t;
    public int f60565u;
    public boolean v;
    public int f60566w;
    public int f60567x;
    public int f60568y;
    public Integer f60569z;

    public v0(ViewGroup viewGroup, f6 f6Var, boolean z9) {
        Paint paint = new Paint(1);
        this.f60549c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f60550e = new RectF();
        this.f60551f = new Path();
        this.f60555k = new Matrix();
        new Path();
        this.f60559o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f60561q = paint3;
        this.f60562r = new w5(new wg.p(this, 8), 320L, xq.h);
        this.f60563s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.f60566w = 0;
        int i7 = k6.f27852d6;
        this.f60568y = i7;
        this.f60547a = viewGroup;
        this.f60548b = f6Var;
        u0 u0Var = new u0(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.f60556l = u0Var;
        viewGroup.addOnAttachStateChangeListener(new m6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            u0Var.a();
        }
        this.f60552g = z9;
        int w02 = k6.w0(i7, f6Var);
        this.f60567x = w02;
        paint.setColor(w02);
        a(z9);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z9) {
        int i7;
        if (z9) {
            i7 = k6.w0(k6.f27795a6, this.f60548b);
        } else {
            i7 = 0;
        }
        if (this.f60564t == z9 && (!z9 || this.f60565u == i7)) {
            return;
        }
        this.f60564t = z9;
        Paint paint = this.f60549c;
        if (z9) {
            this.f60565u = i7;
            paint.setShadowLayer(org.telegram.messenger.g0.L(1.66f), 0.0f, org.telegram.messenger.g0.L(0.33f), i7);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: zh.v0.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f60547a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f60554j = null;
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
        u0 u0Var = this.f60556l;
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
        if (this.f60560p == z9) {
            return;
        }
        this.f60560p = z9;
        if (!z10) {
            this.f60562r.a(z9);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f60557m == iArr) {
            return;
        }
        this.f60557m = iArr;
        this.f60558n = null;
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
