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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.tr;
public final class f1 extends Drawable {
    public static m1 C = new m1();
    public Paint A;
    public int B;
    public final ViewGroup f49944a;
    public final d6 f49945b;
    public final Paint f49946c;
    public final Paint d;
    public final RectF f49947e;
    public final Path f49948f;
    public final boolean f49949g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f49950i;
    public RadialGradient f49951j;
    public final Matrix f49952k;
    public final e1 f49953l;
    public int[] f49954m;
    public LinearGradient f49955n;
    public final Matrix f49956o;
    public boolean f49957p;
    public final Paint f49958q;
    public final e6 f49959r;
    public float f49960s;
    public boolean f49961t;
    public boolean f49962u;
    public int v;
    public int f49963w;
    public Integer f49964x;
    public long f49965y;
    public Bitmap f49966z;

    public f1(ViewGroup viewGroup, d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f49946c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f49947e = new RectF();
        this.f49948f = new Path();
        this.f49952k = new Matrix();
        new Path();
        this.f49956o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f49958q = paint3;
        this.f49959r = new e6(new rg.s1(this, 16), 320L, tr.h);
        this.f49960s = AndroidUtilities.dp(11.0f);
        this.f49962u = true;
        this.v = 0;
        int i10 = i6.f20827d6;
        this.f49963w = i10;
        this.f49944a = viewGroup;
        this.f49945b = d6Var;
        e1 e1Var = new e1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f49953l = e1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            e1Var.a();
        }
        this.f49949g = z10;
        paint.setColor(i6.v0(i10, d6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f49961t != z10) {
            this.f49961t = z10;
            Paint paint = this.f49946c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), i6.v0(i6.f20770a6, this.f49945b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.f1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f49944a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f49951j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f49965y = 0L;
        e1 e1Var = this.f49953l;
        if (stargiftattributepattern == null) {
            e1Var.g(null, false);
            return;
        }
        e1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f49965y = document.f20053id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f49957p == z10) {
            return;
        }
        this.f49957p = z10;
        if (!z11) {
            this.f49959r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f49954m == iArr) {
            return;
        }
        this.f49954m = iArr;
        this.f49955n = null;
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
