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
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.zr;
public final class d1 extends Drawable {
    public static k1 E = new k1();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f50643a;
    public final g6 f50644b;
    public final Paint f50645c;
    public final Paint d;
    public final RectF e;
    public final Path f50646f;
    public final boolean f50647g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f50648i;
    public RadialGradient f50649j;
    public final Matrix f50650k;
    public final c1 f50651l;
    public int[] f50652m;
    public LinearGradient f50653n;
    public final Matrix f50654o;
    public boolean f50655p;
    public final Paint f50656q;
    public final d6 f50657r;
    public float f50658s;
    public boolean f50659t;
    public int f50660u;
    public boolean v;
    public int f50661w;
    public int f50662x;
    public int f50663y;
    public Integer f50664z;

    public d1(ViewGroup viewGroup, g6 g6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f50645c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f50646f = new Path();
        this.f50650k = new Matrix();
        new Path();
        this.f50654o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f50656q = paint3;
        this.f50657r = new d6(new tg.p(this, 16), 320L, zr.h);
        this.f50658s = AndroidUtilities.dp(11.0f);
        this.v = true;
        this.f50661w = 0;
        int i10 = k6.f21184d6;
        this.f50663y = i10;
        this.f50643a = viewGroup;
        this.f50644b = g6Var;
        c1 c1Var = new c1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f50651l = c1Var;
        viewGroup.addOnAttachStateChangeListener(new n6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            c1Var.a();
        }
        this.f50647g = z10;
        int w02 = k6.w0(i10, g6Var);
        this.f50662x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int i10;
        if (z10) {
            i10 = k6.w0(k6.f21125a6, this.f50644b);
        } else {
            i10 = 0;
        }
        if (this.f50659t == z10 && (!z10 || this.f50660u == i10)) {
            return;
        }
        this.f50659t = z10;
        Paint paint = this.f50645c;
        if (z10) {
            this.f50660u = i10;
            paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), i10);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: yh.d1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f50643a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f50649j = null;
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
        c1 c1Var = this.f50651l;
        if (stargiftattributepattern == null) {
            c1Var.g(null, false);
            return;
        }
        c1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f20350id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f50655p == z10) {
            return;
        }
        this.f50655p = z10;
        if (!z11) {
            this.f50657r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f50652m == iArr) {
            return;
        }
        this.f50652m = iArr;
        this.f50653n = null;
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
