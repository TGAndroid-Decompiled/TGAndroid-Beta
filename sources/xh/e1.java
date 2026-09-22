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
    public final ViewGroup f45831a;
    public final e6 f45832b;
    public final Paint f45833c;
    public final Paint d;
    public final RectF e;
    public final Path f45834f;
    public final boolean f45835g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f45836i;
    public RadialGradient f45837j;
    public final Matrix f45838k;
    public final d1 f45839l;
    public int[] f45840m;
    public LinearGradient f45841n;
    public final Matrix f45842o;
    public boolean f45843p;
    public final Paint f45844q;
    public final c6 f45845r;
    public float f45846s;
    public boolean f45847t;
    public boolean f45848u;
    public int v;
    public int f45849w;
    public Integer f45850x;
    public long f45851y;
    public Bitmap f45852z;

    public e1(ViewGroup viewGroup, e6 e6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f45833c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f45834f = new Path();
        this.f45838k = new Matrix();
        new Path();
        this.f45842o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f45844q = paint3;
        this.f45845r = new c6(new rg.w1(this, 15), 320L, qr.h);
        this.f45846s = AndroidUtilities.dp(11.0f);
        this.f45848u = true;
        this.v = 0;
        int i10 = i6.f18834d6;
        this.f45849w = i10;
        this.f45831a = viewGroup;
        this.f45832b = e6Var;
        d1 d1Var = new d1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f45839l = d1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            d1Var.a();
        }
        this.f45835g = z10;
        paint.setColor(i6.v0(i10, e6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f45847t != z10) {
            this.f45847t = z10;
            Paint paint = this.f45833c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), i6.v0(i6.f18777a6, this.f45832b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.e1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f45831a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f45837j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f45851y = 0L;
        d1 d1Var = this.f45839l;
        if (stargiftattributepattern == null) {
            d1Var.g(null, false);
            return;
        }
        d1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f45851y = document.f18115id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f45843p == z10) {
            return;
        }
        this.f45843p = z10;
        if (!z11) {
            this.f45845r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f45840m == iArr) {
            return;
        }
        this.f45840m = iArr;
        this.f45841n = null;
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
