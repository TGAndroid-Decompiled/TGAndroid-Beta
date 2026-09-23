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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.rr;
public final class f1 extends Drawable {
    public static n1 C = new n1();
    public Paint A;
    public int B;
    public final ViewGroup f45796a;
    public final d6 f45797b;
    public final Paint f45798c;
    public final Paint d;
    public final RectF e;
    public final Path f45799f;
    public final boolean f45800g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f45801i;
    public RadialGradient f45802j;
    public final Matrix f45803k;
    public final e1 f45804l;
    public int[] f45805m;
    public LinearGradient f45806n;
    public final Matrix f45807o;
    public boolean f45808p;
    public final Paint f45809q;
    public final e6 f45810r;
    public float f45811s;
    public boolean f45812t;
    public boolean f45813u;
    public int v;
    public int f45814w;
    public Integer f45815x;
    public long f45816y;
    public Bitmap f45817z;

    public f1(ViewGroup viewGroup, d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f45798c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f45799f = new Path();
        this.f45803k = new Matrix();
        new Path();
        this.f45807o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f45809q = paint3;
        this.f45810r = new e6(new rg.w1(this, 15), 320L, rr.h);
        this.f45811s = AndroidUtilities.dp(11.0f);
        this.f45813u = true;
        this.v = 0;
        int i10 = h6.f18789d6;
        this.f45814w = i10;
        this.f45796a = viewGroup;
        this.f45797b = d6Var;
        e1 e1Var = new e1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f45804l = e1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            e1Var.a();
        }
        this.f45800g = z10;
        paint.setColor(h6.v0(i10, d6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f45812t != z10) {
            this.f45812t = z10;
            Paint paint = this.f45798c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), h6.v0(h6.f18732a6, this.f45797b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.f1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f45796a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f45802j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f45816y = 0L;
        e1 e1Var = this.f45804l;
        if (stargiftattributepattern == null) {
            e1Var.g(null, false);
            return;
        }
        e1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f45816y = document.f18089id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f45808p == z10) {
            return;
        }
        this.f45808p = z10;
        if (!z11) {
            this.f45810r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f45805m == iArr) {
            return;
        }
        this.f45805m = iArr;
        this.f45806n = null;
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
