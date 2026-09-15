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
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.qr;
public final class e1 extends Drawable {
    public static m1 C = new m1();
    public Paint A;
    public int B;
    public final ViewGroup f45835a;
    public final e6 f45836b;
    public final Paint f45837c;
    public final Paint d;
    public final RectF e;
    public final Path f45838f;
    public final boolean f45839g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f45840i;
    public RadialGradient f45841j;
    public final Matrix f45842k;
    public final d1 f45843l;
    public int[] f45844m;
    public LinearGradient f45845n;
    public final Matrix f45846o;
    public boolean f45847p;
    public final Paint f45848q;
    public final c6 f45849r;
    public float f45850s;
    public boolean f45851t;
    public boolean f45852u;
    public int v;
    public int f45853w;
    public Integer f45854x;
    public long f45855y;
    public Bitmap f45856z;

    public e1(ViewGroup viewGroup, e6 e6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f45837c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f45838f = new Path();
        this.f45842k = new Matrix();
        new Path();
        this.f45846o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f45848q = paint3;
        this.f45849r = new c6(new rg.w1(this, 15), 320L, qr.h);
        this.f45850s = AndroidUtilities.dp(11.0f);
        this.f45852u = true;
        this.v = 0;
        int i10 = i6.f18836d6;
        this.f45853w = i10;
        this.f45835a = viewGroup;
        this.f45836b = e6Var;
        d1 d1Var = new d1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f45843l = d1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 11));
        if (viewGroup.isAttachedToWindow()) {
            d1Var.a();
        }
        this.f45839g = z10;
        paint.setColor(i6.v0(i10, e6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f45851t != z10) {
            this.f45851t = z10;
            Paint paint = this.f45837c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), i6.v0(i6.f18779a6, this.f45836b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.e1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f45835a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f45841j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f45855y = 0L;
        d1 d1Var = this.f45843l;
        if (stargiftattributepattern == null) {
            d1Var.g(null, false);
            return;
        }
        d1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f45855y = document.f18118id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f45847p == z10) {
            return;
        }
        this.f45847p = z10;
        if (!z11) {
            this.f45849r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f45844m == iArr) {
            return;
        }
        this.f45844m = iArr;
        this.f45845n = null;
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
