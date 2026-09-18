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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qr;
public final class f1 extends Drawable {
    public static n1 C = new n1();
    public Paint A;
    public int B;
    public final ViewGroup f46097a;
    public final e6 f46098b;
    public final Paint f46099c;
    public final Paint d;
    public final RectF e;
    public final Path f46100f;
    public final boolean f46101g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f46102i;
    public RadialGradient f46103j;
    public final Matrix f46104k;
    public final e1 f46105l;
    public int[] f46106m;
    public LinearGradient f46107n;
    public final Matrix f46108o;
    public boolean f46109p;
    public final Paint f46110q;
    public final org.telegram.ui.Components.e6 f46111r;
    public float f46112s;
    public boolean f46113t;
    public boolean f46114u;
    public int v;
    public int f46115w;
    public Integer f46116x;
    public long f46117y;
    public Bitmap f46118z;

    public f1(ViewGroup viewGroup, e6 e6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f46099c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f46100f = new Path();
        this.f46104k = new Matrix();
        new Path();
        this.f46108o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f46110q = paint3;
        this.f46111r = new org.telegram.ui.Components.e6(new rg.w1(this, 15), 320L, qr.h);
        this.f46112s = AndroidUtilities.dp(11.0f);
        this.f46114u = true;
        this.v = 0;
        int i10 = j6.f19062d6;
        this.f46115w = i10;
        this.f46097a = viewGroup;
        this.f46098b = e6Var;
        e1 e1Var = new e1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f46105l = e1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            e1Var.a();
        }
        this.f46101g = z10;
        paint.setColor(j6.v0(i10, e6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f46113t != z10) {
            this.f46113t = z10;
            Paint paint = this.f46099c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), j6.v0(j6.f19005a6, this.f46098b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.f1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f46097a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f46103j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f46117y = 0L;
        e1 e1Var = this.f46105l;
        if (stargiftattributepattern == null) {
            e1Var.g(null, false);
            return;
        }
        e1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f46117y = document.f18302id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f46109p == z10) {
            return;
        }
        this.f46109p = z10;
        if (!z11) {
            this.f46111r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f46106m == iArr) {
            return;
        }
        this.f46106m = iArr;
        this.f46107n = null;
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
