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
    public final ViewGroup f50266a;
    public final f6 f50267b;
    public final Paint f50268c;
    public final Paint d;
    public final RectF f50269e;
    public final Path f50270f;
    public final boolean f50271g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f50272i;
    public RadialGradient f50273j;
    public final Matrix f50274k;
    public final d1 f50275l;
    public int[] f50276m;
    public LinearGradient f50277n;
    public final Matrix f50278o;
    public boolean f50279p;
    public final Paint f50280q;
    public final e6 f50281r;
    public float f50282s;
    public boolean f50283t;
    public boolean f50284u;
    public int v;
    public int f50285w;
    public Integer f50286x;
    public long f50287y;
    public Bitmap f50288z;

    public e1(ViewGroup viewGroup, f6 f6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f50268c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f50269e = new RectF();
        this.f50270f = new Path();
        this.f50274k = new Matrix();
        new Path();
        this.f50278o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f50280q = paint3;
        this.f50281r = new e6(new sg.p0(this, 20), 320L, pr.h);
        this.f50282s = AndroidUtilities.dp(11.0f);
        this.f50284u = true;
        this.v = 0;
        int i10 = j6.f20690d6;
        this.f50285w = i10;
        this.f50266a = viewGroup;
        this.f50267b = f6Var;
        d1 d1Var = new d1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f50275l = d1Var;
        viewGroup.addOnAttachStateChangeListener(new bi.i2(this, 11));
        if (viewGroup.isAttachedToWindow()) {
            d1Var.a();
        }
        this.f50271g = z10;
        paint.setColor(j6.v0(i10, f6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f50283t != z10) {
            this.f50283t = z10;
            Paint paint = this.f50268c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), j6.v0(j6.f20633a6, this.f50267b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: yh.e1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f50266a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f50273j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f50287y = 0L;
        d1 d1Var = this.f50275l;
        if (stargiftattributepattern == null) {
            d1Var.g(null, false);
            return;
        }
        d1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f50287y = document.f19902id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f50279p == z10) {
            return;
        }
        this.f50279p = z10;
        if (!z11) {
            this.f50281r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f50276m == iArr) {
            return;
        }
        this.f50276m = iArr;
        this.f50277n = null;
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
