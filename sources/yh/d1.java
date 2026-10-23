package yh;

import ai.n6;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
public final class d1 extends Drawable {
    public static k1 E = new k1();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f50644a;
    public final g6 f50645b;
    public final Paint f50646c;
    public final Paint d;
    public final RectF e;
    public final Path f50647f;
    public final boolean f50648g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f50649i;
    public RadialGradient f50650j;
    public final Matrix f50651k;
    public final c1 f50652l;
    public int[] f50653m;
    public LinearGradient f50654n;
    public final Matrix f50655o;
    public boolean f50656p;
    public final Paint f50657q;
    public final f6 f50658r;
    public float f50659s;
    public boolean f50660t;
    public int f50661u;
    public boolean v;
    public int f50662w;
    public int f50663x;
    public int f50664y;
    public Integer f50665z;

    public d1(ViewGroup viewGroup, g6 g6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f50646c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f50647f = new Path();
        this.f50651k = new Matrix();
        new Path();
        this.f50655o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f50657q = paint3;
        this.f50658r = new f6(new tg.p(this, 16), 320L, bs.h);
        this.f50659s = AndroidUtilities.dp(11.0f);
        this.v = true;
        this.f50662w = 0;
        int i10 = k6.f21183d6;
        this.f50664y = i10;
        this.f50644a = viewGroup;
        this.f50645b = g6Var;
        c1 c1Var = new c1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f50652l = c1Var;
        viewGroup.addOnAttachStateChangeListener(new n6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            c1Var.a();
        }
        this.f50648g = z10;
        int w02 = k6.w0(i10, g6Var);
        this.f50663x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int i10;
        if (z10) {
            i10 = k6.w0(k6.f21124a6, this.f50645b);
        } else {
            i10 = 0;
        }
        if (this.f50660t == z10 && (!z10 || this.f50661u == i10)) {
            return;
        }
        this.f50660t = z10;
        Paint paint = this.f50646c;
        if (z10) {
            this.f50661u = i10;
            paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), i10);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: yh.d1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f50644a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f50650j = null;
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
        c1 c1Var = this.f50652l;
        if (stargiftattributepattern == null) {
            c1Var.g(null, false);
            return;
        }
        c1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f20349id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f50656p == z10) {
            return;
        }
        this.f50656p = z10;
        if (!z11) {
            this.f50658r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f50653m == iArr) {
            return;
        }
        this.f50653m = iArr;
        this.f50654n = null;
        c();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        rect.set(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        return true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
