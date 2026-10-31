package ph;

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
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
public final class z0 extends Drawable {
    public static g1 E = new g1();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f45363a;
    public final p6 f45364b;
    public final Paint f45365c;
    public final Paint d;
    public final RectF e;
    public final Path f45366f;
    public final boolean f45367g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f45368i;
    public RadialGradient f45369j;
    public final Matrix f45370k;
    public final y0 f45371l;
    public int[] f45372m;
    public LinearGradient f45373n;
    public final Matrix f45374o;
    public boolean f45375p;
    public final Paint f45376q;
    public final t5 f45377r;
    public float f45378s;
    public boolean f45379t;
    public int f45380u;
    public boolean v;
    public int f45381w;
    public int f45382x;
    public int f45383y;
    public Integer f45384z;

    public z0(ViewGroup viewGroup, p6 p6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f45365c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f45366f = new Path();
        this.f45370k = new Matrix();
        new Path();
        this.f45374o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f45376q = paint3;
        this.f45377r = new t5(new w5(this, 27), 320L, gr.h);
        this.f45378s = org.telegram.messenger.i0.L(11.0f);
        this.v = true;
        this.f45381w = 0;
        int i10 = t6.f20929d6;
        this.f45383y = i10;
        this.f45363a = viewGroup;
        this.f45364b = p6Var;
        y0 y0Var = new y0(this, viewGroup, org.telegram.messenger.i0.L(28.0f));
        this.f45371l = y0Var;
        viewGroup.addOnAttachStateChangeListener(new l.d(this, 11));
        if (viewGroup.isAttachedToWindow()) {
            y0Var.a();
        }
        this.f45367g = z10;
        int w02 = t6.w0(i10, p6Var);
        this.f45382x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int i10;
        if (z10) {
            i10 = t6.w0(t6.f20871a6, this.f45364b);
        } else {
            i10 = 0;
        }
        if (this.f45379t == z10 && (!z10 || this.f45380u == i10)) {
            return;
        }
        this.f45379t = z10;
        Paint paint = this.f45365c;
        if (z10) {
            this.f45380u = i10;
            paint.setShadowLayer(org.telegram.messenger.i0.L(1.66f), 0.0f, org.telegram.messenger.i0.L(0.33f), i10);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: ph.z0.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f45363a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f45369j = null;
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
        y0 y0Var = this.f45371l;
        if (stargiftattributepattern == null) {
            y0Var.g(null, false);
            return;
        }
        y0Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f19799id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f45375p == z10) {
            return;
        }
        this.f45375p = z10;
        if (!z11) {
            this.f45377r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f45372m == iArr) {
            return;
        }
        this.f45372m = iArr;
        this.f45373n = null;
        c();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        rect.set(org.telegram.messenger.i0.L(3.33f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(3.33f), org.telegram.messenger.i0.L(4.0f));
        return true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
