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
    public final ViewGroup f50267a;
    public final f6 f50268b;
    public final Paint f50269c;
    public final Paint d;
    public final RectF f50270e;
    public final Path f50271f;
    public final boolean f50272g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f50273i;
    public RadialGradient f50274j;
    public final Matrix f50275k;
    public final d1 f50276l;
    public int[] f50277m;
    public LinearGradient f50278n;
    public final Matrix f50279o;
    public boolean f50280p;
    public final Paint f50281q;
    public final e6 f50282r;
    public float f50283s;
    public boolean f50284t;
    public boolean f50285u;
    public int v;
    public int f50286w;
    public Integer f50287x;
    public long f50288y;
    public Bitmap f50289z;

    public e1(ViewGroup viewGroup, f6 f6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f50269c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f50270e = new RectF();
        this.f50271f = new Path();
        this.f50275k = new Matrix();
        new Path();
        this.f50279o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f50281q = paint3;
        this.f50282r = new e6(new sg.p0(this, 20), 320L, pr.h);
        this.f50283s = AndroidUtilities.dp(11.0f);
        this.f50285u = true;
        this.v = 0;
        int i10 = j6.f20691d6;
        this.f50286w = i10;
        this.f50267a = viewGroup;
        this.f50268b = f6Var;
        d1 d1Var = new d1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f50276l = d1Var;
        viewGroup.addOnAttachStateChangeListener(new bi.i2(this, 11));
        if (viewGroup.isAttachedToWindow()) {
            d1Var.a();
        }
        this.f50272g = z10;
        paint.setColor(j6.v0(i10, f6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f50284t != z10) {
            this.f50284t = z10;
            Paint paint = this.f50269c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), j6.v0(j6.f20634a6, this.f50268b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: yh.e1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f50267a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f50274j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f50288y = 0L;
        d1 d1Var = this.f50276l;
        if (stargiftattributepattern == null) {
            d1Var.g(null, false);
            return;
        }
        d1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f50288y = document.f19902id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f50280p == z10) {
            return;
        }
        this.f50280p = z10;
        if (!z11) {
            this.f50282r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f50277m == iArr) {
            return;
        }
        this.f50277m = iArr;
        this.f50278n = null;
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
