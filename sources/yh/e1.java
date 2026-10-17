package yh;

import ai.m6;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
public final class e1 extends Drawable {
    public static l1 C = new l1();
    public Paint A;
    public int B;
    public final ViewGroup f50227a;
    public final d6 f50228b;
    public final Paint f50229c;
    public final Paint d;
    public final RectF e;
    public final Path f50230f;
    public final boolean f50231g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f50232i;
    public RadialGradient f50233j;
    public final Matrix f50234k;
    public final d1 f50235l;
    public int[] f50236m;
    public LinearGradient f50237n;
    public final Matrix f50238o;
    public boolean f50239p;
    public final Paint f50240q;
    public final f6 f50241r;
    public float f50242s;
    public boolean f50243t;
    public boolean f50244u;
    public int v;
    public int f50245w;
    public Integer f50246x;
    public long f50247y;
    public Bitmap f50248z;

    public e1(ViewGroup viewGroup, d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f50229c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f50230f = new Path();
        this.f50234k = new Matrix();
        new Path();
        this.f50238o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f50240q = paint3;
        this.f50241r = new f6(new tg.p(this, 16), 320L, bs.h);
        this.f50242s = AndroidUtilities.dp(11.0f);
        this.f50244u = true;
        this.v = 0;
        int i10 = h6.f20986d6;
        this.f50245w = i10;
        this.f50227a = viewGroup;
        this.f50228b = d6Var;
        d1 d1Var = new d1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f50235l = d1Var;
        viewGroup.addOnAttachStateChangeListener(new m6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            d1Var.a();
        }
        this.f50231g = z10;
        paint.setColor(h6.w0(i10, d6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f50243t != z10) {
            this.f50243t = z10;
            Paint paint = this.f50229c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), h6.w0(h6.f20927a6, this.f50228b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: yh.e1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f50227a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f50233j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f50247y = 0L;
        d1 d1Var = this.f50235l;
        if (stargiftattributepattern == null) {
            d1Var.g(null, false);
            return;
        }
        d1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f50247y = document.f20278id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f50239p == z10) {
            return;
        }
        this.f50239p = z10;
        if (!z11) {
            this.f50241r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f50236m == iArr) {
            return;
        }
        this.f50236m = iArr;
        this.f50237n = null;
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
