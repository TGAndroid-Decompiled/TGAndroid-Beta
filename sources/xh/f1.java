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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.qr;
public final class f1 extends Drawable {
    public static n1 C = new n1();
    public Paint A;
    public int B;
    public final ViewGroup f46144a;
    public final f6 f46145b;
    public final Paint f46146c;
    public final Paint d;
    public final RectF e;
    public final Path f46147f;
    public final boolean f46148g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f46149i;
    public RadialGradient f46150j;
    public final Matrix f46151k;
    public final e1 f46152l;
    public int[] f46153m;
    public LinearGradient f46154n;
    public final Matrix f46155o;
    public boolean f46156p;
    public final Paint f46157q;
    public final d6 f46158r;
    public float f46159s;
    public boolean f46160t;
    public boolean f46161u;
    public int v;
    public int f46162w;
    public Integer f46163x;
    public long f46164y;
    public Bitmap f46165z;

    public f1(ViewGroup viewGroup, f6 f6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f46146c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f46147f = new Path();
        this.f46151k = new Matrix();
        new Path();
        this.f46155o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f46157q = paint3;
        this.f46158r = new d6(new rg.q1(this, 16), 320L, qr.h);
        this.f46159s = AndroidUtilities.dp(11.0f);
        this.f46161u = true;
        this.v = 0;
        int i10 = j6.f19094d6;
        this.f46162w = i10;
        this.f46144a = viewGroup;
        this.f46145b = f6Var;
        e1 e1Var = new e1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f46152l = e1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            e1Var.a();
        }
        this.f46148g = z10;
        paint.setColor(j6.v0(i10, f6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f46160t != z10) {
            this.f46160t = z10;
            Paint paint = this.f46146c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), j6.v0(j6.f19037a6, this.f46145b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.f1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f46144a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f46150j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f46164y = 0L;
        e1 e1Var = this.f46152l;
        if (stargiftattributepattern == null) {
            e1Var.g(null, false);
            return;
        }
        e1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f46164y = document.f18334id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f46156p == z10) {
            return;
        }
        this.f46156p = z10;
        if (!z11) {
            this.f46158r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f46153m == iArr) {
            return;
        }
        this.f46153m = iArr;
        this.f46154n = null;
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
