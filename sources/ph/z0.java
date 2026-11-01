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
    public final ViewGroup f45374a;
    public final p6 f45375b;
    public final Paint f45376c;
    public final Paint d;
    public final RectF e;
    public final Path f45377f;
    public final boolean f45378g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f45379i;
    public RadialGradient f45380j;
    public final Matrix f45381k;
    public final y0 f45382l;
    public int[] f45383m;
    public LinearGradient f45384n;
    public final Matrix f45385o;
    public boolean f45386p;
    public final Paint f45387q;
    public final t5 f45388r;
    public float f45389s;
    public boolean f45390t;
    public int f45391u;
    public boolean v;
    public int f45392w;
    public int f45393x;
    public int f45394y;
    public Integer f45395z;

    public z0(ViewGroup viewGroup, p6 p6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f45376c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f45377f = new Path();
        this.f45381k = new Matrix();
        new Path();
        this.f45385o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f45387q = paint3;
        this.f45388r = new t5(new w5(this, 27), 320L, gr.h);
        this.f45389s = org.telegram.messenger.i0.L(11.0f);
        this.v = true;
        this.f45392w = 0;
        int i10 = t6.f20930d6;
        this.f45394y = i10;
        this.f45374a = viewGroup;
        this.f45375b = p6Var;
        y0 y0Var = new y0(this, viewGroup, org.telegram.messenger.i0.L(28.0f));
        this.f45382l = y0Var;
        viewGroup.addOnAttachStateChangeListener(new l.d(this, 11));
        if (viewGroup.isAttachedToWindow()) {
            y0Var.a();
        }
        this.f45378g = z10;
        int w02 = t6.w0(i10, p6Var);
        this.f45393x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int i10;
        if (z10) {
            i10 = t6.w0(t6.f20872a6, this.f45375b);
        } else {
            i10 = 0;
        }
        if (this.f45390t == z10 && (!z10 || this.f45391u == i10)) {
            return;
        }
        this.f45390t = z10;
        Paint paint = this.f45376c;
        if (z10) {
            this.f45391u = i10;
            paint.setShadowLayer(org.telegram.messenger.i0.L(1.66f), 0.0f, org.telegram.messenger.i0.L(0.33f), i10);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r33, float r34) {
        throw new UnsupportedOperationException("Method not decompiled: ph.z0.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f45374a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f45380j = null;
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
        y0 y0Var = this.f45382l;
        if (stargiftattributepattern == null) {
            y0Var.g(null, false);
            return;
        }
        y0Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f19800id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f45386p == z10) {
            return;
        }
        this.f45386p = z10;
        if (!z11) {
            this.f45388r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f45383m == iArr) {
            return;
        }
        this.f45383m = iArr;
        this.f45384n = null;
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
