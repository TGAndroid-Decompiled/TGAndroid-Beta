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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public final class v0 extends Drawable {
    public static c1 E = new c1();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f60564a;
    public final g6 f60565b;
    public final Paint f60566c;
    public final Paint d;
    public final RectF f60567e;
    public final Path f60568f;
    public final boolean f60569g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f60570i;
    public RadialGradient f60571j;
    public final Matrix f60572k;
    public final u0 f60573l;
    public int[] f60574m;
    public LinearGradient f60575n;
    public final Matrix f60576o;
    public boolean f60577p;
    public final Paint f60578q;
    public final w5 f60579r;
    public float f60580s;
    public boolean f60581t;
    public int f60582u;
    public boolean v;
    public int f60583w;
    public int f60584x;
    public int f60585y;
    public Integer f60586z;

    public v0(ViewGroup viewGroup, g6 g6Var, boolean z9) {
        Paint paint = new Paint(1);
        this.f60566c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f60567e = new RectF();
        this.f60568f = new Path();
        this.f60572k = new Matrix();
        new Path();
        this.f60576o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f60578q = paint3;
        this.f60579r = new w5(new wg.a0(this, 6), 320L, xq.h);
        this.f60580s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.f60583w = 0;
        int i7 = l6.f27865d6;
        this.f60585y = i7;
        this.f60564a = viewGroup;
        this.f60565b = g6Var;
        u0 u0Var = new u0(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.f60573l = u0Var;
        viewGroup.addOnAttachStateChangeListener(new m6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            u0Var.a();
        }
        this.f60569g = z9;
        int w02 = l6.w0(i7, g6Var);
        this.f60584x = w02;
        paint.setColor(w02);
        a(z9);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z9) {
        int i7;
        if (z9) {
            i7 = l6.w0(l6.f27808a6, this.f60565b);
        } else {
            i7 = 0;
        }
        if (this.f60581t == z9 && (!z9 || this.f60582u == i7)) {
            return;
        }
        this.f60581t = z9;
        Paint paint = this.f60566c;
        if (z9) {
            this.f60582u = i7;
            paint.setShadowLayer(org.telegram.messenger.g0.L(1.66f), 0.0f, org.telegram.messenger.g0.L(0.33f), i7);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: zh.v0.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f60564a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f60571j = null;
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
        u0 u0Var = this.f60573l;
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
        if (this.f60577p == z9) {
            return;
        }
        this.f60577p = z9;
        if (!z10) {
            this.f60579r.a(z9);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f60574m == iArr) {
            return;
        }
        this.f60574m = iArr;
        this.f60575n = null;
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
