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
    public final ViewGroup f51349a;
    public final d6 f51350b;
    public final Paint f51351c;
    public final Paint d;
    public final RectF f51352e;
    public final Path f51353f;
    public final boolean f51354g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f51355i;
    public RadialGradient f51356j;
    public final Matrix f51357k;
    public final f1 f51358l;
    public int[] f51359m;
    public LinearGradient f51360n;
    public final Matrix f51361o;
    public boolean f51362p;
    public final Paint f51363q;
    public final g6 f51364r;
    public float f51365s;
    public boolean f51366t;
    public boolean f51367u;
    public int v;
    public int f51368w;
    public Integer f51369x;
    public long f51370y;
    public Bitmap f51371z;

    public g1(ViewGroup viewGroup, d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f51351c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f51352e = new RectF();
        this.f51353f = new Path();
        this.f51357k = new Matrix();
        new Path();
        this.f51361o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f51363q = paint3;
        this.f51364r = new g6(new rg.x1(this, 19), 320L, is.h);
        this.f51365s = AndroidUtilities.dp(11.0f);
        this.f51367u = true;
        this.v = 0;
        int i10 = h6.f20822d6;
        this.f51368w = i10;
        this.f51349a = viewGroup;
        this.f51350b = d6Var;
        f1 f1Var = new f1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f51358l = f1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.v2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            f1Var.a();
        }
        this.f51354g = z10;
        paint.setColor(h6.w0(i10, d6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f51366t != z10) {
            this.f51366t = z10;
            Paint paint = this.f51351c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), h6.w0(h6.f20765a6, this.f51350b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.g1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f51349a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f51356j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f51370y = 0L;
        f1 f1Var = this.f51358l;
        if (stargiftattributepattern == null) {
            f1Var.g(null, false);
            return;
        }
        f1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f51370y = document.f20074id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f51362p == z10) {
            return;
        }
        this.f51362p = z10;
        if (!z11) {
            this.f51364r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f51359m == iArr) {
            return;
        }
        this.f51359m = iArr;
        this.f51360n = null;
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
