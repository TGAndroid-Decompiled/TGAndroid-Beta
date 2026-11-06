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
public final class w0 extends Drawable {
    public static d1 E = new d1();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f60442a;
    public final f6 f60443b;
    public final Paint f60444c;
    public final Paint d;
    public final RectF f60445e;
    public final Path f60446f;
    public final boolean f60447g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f60448i;
    public RadialGradient f60449j;
    public final Matrix f60450k;
    public final v0 f60451l;
    public int[] f60452m;
    public LinearGradient f60453n;
    public final Matrix f60454o;
    public boolean f60455p;
    public final Paint f60456q;
    public final w5 f60457r;
    public float f60458s;
    public boolean f60459t;
    public int f60460u;
    public boolean v;
    public int f60461w;
    public int f60462x;
    public int f60463y;
    public Integer f60464z;

    public w0(ViewGroup viewGroup, f6 f6Var, boolean z9) {
        Paint paint = new Paint(1);
        this.f60444c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f60445e = new RectF();
        this.f60446f = new Path();
        this.f60450k = new Matrix();
        new Path();
        this.f60454o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f60456q = paint3;
        this.f60457r = new w5(new wg.p(this, 8), 320L, xq.h);
        this.f60458s = org.telegram.messenger.g0.L(11.0f);
        this.v = true;
        this.f60461w = 0;
        int i7 = k6.f27848d6;
        this.f60463y = i7;
        this.f60442a = viewGroup;
        this.f60443b = f6Var;
        v0 v0Var = new v0(this, viewGroup, org.telegram.messenger.g0.L(28.0f));
        this.f60451l = v0Var;
        viewGroup.addOnAttachStateChangeListener(new m6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            v0Var.a();
        }
        this.f60447g = z9;
        int w02 = k6.w0(i7, f6Var);
        this.f60462x = w02;
        paint.setColor(w02);
        a(z9);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z9) {
        int i7;
        if (z9) {
            i7 = k6.w0(k6.f27791a6, this.f60443b);
        } else {
            i7 = 0;
        }
        if (this.f60459t == z9 && (!z9 || this.f60460u == i7)) {
            return;
        }
        this.f60459t = z9;
        Paint paint = this.f60444c;
        if (z9) {
            this.f60460u = i7;
            paint.setShadowLayer(org.telegram.messenger.g0.L(1.66f), 0.0f, org.telegram.messenger.g0.L(0.33f), i7);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: zh.w0.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f60442a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f60449j = null;
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
        v0 v0Var = this.f60451l;
        if (stargiftattributepattern == null) {
            v0Var.g(null, false);
            return;
        }
        v0Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f26958id;
        }
    }

    public final void f(boolean z9, boolean z10) {
        if (this.f60455p == z9) {
            return;
        }
        this.f60455p = z9;
        if (!z10) {
            this.f60457r.a(z9);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f60452m == iArr) {
            return;
        }
        this.f60452m = iArr;
        this.f60453n = null;
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
