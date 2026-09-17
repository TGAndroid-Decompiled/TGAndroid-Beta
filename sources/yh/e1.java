package yh;

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
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.pr;
public final class e1 extends Drawable {
    public static l1 C = new l1();
    public Paint A;
    public int B;
    public final ViewGroup f50238a;
    public final f6 f50239b;
    public final Paint f50240c;
    public final Paint d;
    public final RectF f50241e;
    public final Path f50242f;
    public final boolean f50243g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f50244i;
    public RadialGradient f50245j;
    public final Matrix f50246k;
    public final d1 f50247l;
    public int[] f50248m;
    public LinearGradient f50249n;
    public final Matrix f50250o;
    public boolean f50251p;
    public final Paint f50252q;
    public final e6 f50253r;
    public float f50254s;
    public boolean f50255t;
    public boolean f50256u;
    public int v;
    public int f50257w;
    public Integer f50258x;
    public long f50259y;
    public Bitmap f50260z;

    public e1(ViewGroup viewGroup, f6 f6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f50240c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f50241e = new RectF();
        this.f50242f = new Path();
        this.f50246k = new Matrix();
        new Path();
        this.f50250o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f50252q = paint3;
        this.f50253r = new e6(new sg.p0(this, 20), 320L, pr.h);
        this.f50254s = AndroidUtilities.dp(11.0f);
        this.f50256u = true;
        this.v = 0;
        int i10 = j6.f20664d6;
        this.f50257w = i10;
        this.f50238a = viewGroup;
        this.f50239b = f6Var;
        d1 d1Var = new d1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f50247l = d1Var;
        viewGroup.addOnAttachStateChangeListener(new bi.i2(this, 11));
        if (viewGroup.isAttachedToWindow()) {
            d1Var.a();
        }
        this.f50243g = z10;
        paint.setColor(j6.v0(i10, f6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f50255t != z10) {
            this.f50255t = z10;
            Paint paint = this.f50240c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), j6.v0(j6.f20607a6, this.f50239b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: yh.e1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f50238a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f50245j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f50259y = 0L;
        d1 d1Var = this.f50247l;
        if (stargiftattributepattern == null) {
            d1Var.g(null, false);
            return;
        }
        d1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f50259y = document.f19875id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f50251p == z10) {
            return;
        }
        this.f50251p = z10;
        if (!z11) {
            this.f50253r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f50248m == iArr) {
            return;
        }
        this.f50248m = iArr;
        this.f50249n = null;
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
