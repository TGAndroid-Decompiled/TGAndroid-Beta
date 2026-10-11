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
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
public final class g1 extends Drawable {
    public static n1 C = new n1();
    public Paint A;
    public int B;
    public final ViewGroup f51315a;
    public final d6 f51316b;
    public final Paint f51317c;
    public final Paint d;
    public final RectF f51318e;
    public final Path f51319f;
    public final boolean f51320g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f51321i;
    public RadialGradient f51322j;
    public final Matrix f51323k;
    public final f1 f51324l;
    public int[] f51325m;
    public LinearGradient f51326n;
    public final Matrix f51327o;
    public boolean f51328p;
    public final Paint f51329q;
    public final g6 f51330r;
    public float f51331s;
    public boolean f51332t;
    public boolean f51333u;
    public int v;
    public int f51334w;
    public Integer f51335x;
    public long f51336y;
    public Bitmap f51337z;

    public g1(ViewGroup viewGroup, d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f51317c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f51318e = new RectF();
        this.f51319f = new Path();
        this.f51323k = new Matrix();
        new Path();
        this.f51327o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f51329q = paint3;
        this.f51330r = new g6(new rg.x1(this, 19), 320L, is.h);
        this.f51331s = AndroidUtilities.dp(11.0f);
        this.f51333u = true;
        this.v = 0;
        int i10 = h6.f20786d6;
        this.f51334w = i10;
        this.f51315a = viewGroup;
        this.f51316b = d6Var;
        f1 f1Var = new f1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f51324l = f1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.v2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            f1Var.a();
        }
        this.f51320g = z10;
        paint.setColor(h6.w0(i10, d6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f51332t != z10) {
            this.f51332t = z10;
            Paint paint = this.f51317c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), h6.w0(h6.f20729a6, this.f51316b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.g1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f51315a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f51322j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f51336y = 0L;
        f1 f1Var = this.f51324l;
        if (stargiftattributepattern == null) {
            f1Var.g(null, false);
            return;
        }
        f1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f51336y = document.f20038id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f51328p == z10) {
            return;
        }
        this.f51328p = z10;
        if (!z11) {
            this.f51330r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f51325m == iArr) {
            return;
        }
        this.f51325m = iArr;
        this.f51326n = null;
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
