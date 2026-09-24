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
    public final ViewGroup f46110a;
    public final d6 f46111b;
    public final Paint f46112c;
    public final Paint d;
    public final RectF e;
    public final Path f46113f;
    public final boolean f46114g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f46115i;
    public RadialGradient f46116j;
    public final Matrix f46117k;
    public final e1 f46118l;
    public int[] f46119m;
    public LinearGradient f46120n;
    public final Matrix f46121o;
    public boolean f46122p;
    public final Paint f46123q;
    public final e6 f46124r;
    public float f46125s;
    public boolean f46126t;
    public boolean f46127u;
    public int v;
    public int f46128w;
    public Integer f46129x;
    public long f46130y;
    public Bitmap f46131z;

    public f1(ViewGroup viewGroup, d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f46112c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f46113f = new Path();
        this.f46117k = new Matrix();
        new Path();
        this.f46121o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f46123q = paint3;
        this.f46124r = new e6(new rg.q1(this, 16), 320L, rr.h);
        this.f46125s = AndroidUtilities.dp(11.0f);
        this.f46127u = true;
        this.v = 0;
        int i10 = h6.f19045d6;
        this.f46128w = i10;
        this.f46110a = viewGroup;
        this.f46111b = d6Var;
        e1 e1Var = new e1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f46118l = e1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            e1Var.a();
        }
        this.f46114g = z10;
        paint.setColor(h6.v0(i10, d6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f46126t != z10) {
            this.f46126t = z10;
            Paint paint = this.f46112c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), h6.v0(h6.f18988a6, this.f46111b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.f1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f46110a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f46116j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f46130y = 0L;
        e1 e1Var = this.f46118l;
        if (stargiftattributepattern == null) {
            e1Var.g(null, false);
            return;
        }
        e1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f46130y = document.f18327id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f46122p == z10) {
            return;
        }
        this.f46122p = z10;
        if (!z11) {
            this.f46124r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f46119m == iArr) {
            return;
        }
        this.f46119m = iArr;
        this.f46120n = null;
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
