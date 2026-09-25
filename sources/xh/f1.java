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
    public final ViewGroup f46125a;
    public final d6 f46126b;
    public final Paint f46127c;
    public final Paint d;
    public final RectF e;
    public final Path f46128f;
    public final boolean f46129g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f46130i;
    public RadialGradient f46131j;
    public final Matrix f46132k;
    public final e1 f46133l;
    public int[] f46134m;
    public LinearGradient f46135n;
    public final Matrix f46136o;
    public boolean f46137p;
    public final Paint f46138q;
    public final e6 f46139r;
    public float f46140s;
    public boolean f46141t;
    public boolean f46142u;
    public int v;
    public int f46143w;
    public Integer f46144x;
    public long f46145y;
    public Bitmap f46146z;

    public f1(ViewGroup viewGroup, d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f46127c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f46128f = new Path();
        this.f46132k = new Matrix();
        new Path();
        this.f46136o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f46138q = paint3;
        this.f46139r = new e6(new rg.q1(this, 16), 320L, rr.h);
        this.f46140s = AndroidUtilities.dp(11.0f);
        this.f46142u = true;
        this.v = 0;
        int i10 = h6.f19060d6;
        this.f46143w = i10;
        this.f46125a = viewGroup;
        this.f46126b = d6Var;
        e1 e1Var = new e1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f46133l = e1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            e1Var.a();
        }
        this.f46129g = z10;
        paint.setColor(h6.v0(i10, d6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f46141t != z10) {
            this.f46141t = z10;
            Paint paint = this.f46127c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), h6.v0(h6.f19003a6, this.f46126b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.f1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f46125a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f46131j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f46145y = 0L;
        e1 e1Var = this.f46133l;
        if (stargiftattributepattern == null) {
            e1Var.g(null, false);
            return;
        }
        e1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f46145y = document.f18342id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f46137p == z10) {
            return;
        }
        this.f46137p = z10;
        if (!z11) {
            this.f46139r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f46134m == iArr) {
            return;
        }
        this.f46134m = iArr;
        this.f46135n = null;
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
