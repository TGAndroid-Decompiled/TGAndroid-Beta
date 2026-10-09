package xh;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hs;
public final class g1 extends Drawable {
    public static n1 C = new n1();
    public Paint A;
    public int B;
    public final ViewGroup f51226a;
    public final e6 f51227b;
    public final Paint f51228c;
    public final Paint d;
    public final RectF f51229e;
    public final Path f51230f;
    public final boolean f51231g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f51232i;
    public RadialGradient f51233j;
    public final Matrix f51234k;
    public final f1 f51235l;
    public int[] f51236m;
    public LinearGradient f51237n;
    public final Matrix f51238o;
    public boolean f51239p;
    public final Paint f51240q;
    public final g6 f51241r;
    public float f51242s;
    public boolean f51243t;
    public boolean f51244u;
    public int v;
    public int f51245w;
    public Integer f51246x;
    public long f51247y;
    public Bitmap f51248z;

    public g1(ViewGroup viewGroup, e6 e6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f51228c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f51229e = new RectF();
        this.f51230f = new Path();
        this.f51234k = new Matrix();
        new Path();
        this.f51238o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f51240q = paint3;
        this.f51241r = new g6(new rg.x1(this, 19), 320L, hs.h);
        this.f51242s = AndroidUtilities.dp(11.0f);
        this.f51244u = true;
        this.v = 0;
        int i10 = i6.f20797d6;
        this.f51245w = i10;
        this.f51226a = viewGroup;
        this.f51227b = e6Var;
        f1 f1Var = new f1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f51235l = f1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.v2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            f1Var.a();
        }
        this.f51231g = z10;
        paint.setColor(i6.w0(i10, e6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f51243t != z10) {
            this.f51243t = z10;
            Paint paint = this.f51228c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), i6.w0(i6.f20740a6, this.f51227b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.g1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f51226a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f51233j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f51247y = 0L;
        f1 f1Var = this.f51235l;
        if (stargiftattributepattern == null) {
            f1Var.g(null, false);
            return;
        }
        f1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f51247y = document.f20044id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f51239p == z10) {
            return;
        }
        this.f51239p = z10;
        if (!z11) {
            this.f51241r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f51236m == iArr) {
            return;
        }
        this.f51236m = iArr;
        this.f51237n = null;
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
