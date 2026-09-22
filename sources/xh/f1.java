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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.qr;
public final class f1 extends Drawable {
    public static n1 C = new n1();
    public Paint A;
    public int B;
    public final ViewGroup f46165a;
    public final f6 f46166b;
    public final Paint f46167c;
    public final Paint d;
    public final RectF e;
    public final Path f46168f;
    public final boolean f46169g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f46170i;
    public RadialGradient f46171j;
    public final Matrix f46172k;
    public final e1 f46173l;
    public int[] f46174m;
    public LinearGradient f46175n;
    public final Matrix f46176o;
    public boolean f46177p;
    public final Paint f46178q;
    public final d6 f46179r;
    public float f46180s;
    public boolean f46181t;
    public boolean f46182u;
    public int v;
    public int f46183w;
    public Integer f46184x;
    public long f46185y;
    public Bitmap f46186z;

    public f1(ViewGroup viewGroup, f6 f6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f46167c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f46168f = new Path();
        this.f46172k = new Matrix();
        new Path();
        this.f46176o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f46178q = paint3;
        this.f46179r = new d6(new rg.q1(this, 16), 320L, qr.h);
        this.f46180s = AndroidUtilities.dp(11.0f);
        this.f46182u = true;
        this.v = 0;
        int i10 = j6.f19109d6;
        this.f46183w = i10;
        this.f46165a = viewGroup;
        this.f46166b = f6Var;
        e1 e1Var = new e1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f46173l = e1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            e1Var.a();
        }
        this.f46169g = z10;
        paint.setColor(j6.v0(i10, f6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f46181t != z10) {
            this.f46181t = z10;
            Paint paint = this.f46167c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), j6.v0(j6.f19052a6, this.f46166b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.f1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f46165a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f46171j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f46185y = 0L;
        e1 e1Var = this.f46173l;
        if (stargiftattributepattern == null) {
            e1Var.g(null, false);
            return;
        }
        e1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f46185y = document.f18349id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f46177p == z10) {
            return;
        }
        this.f46177p = z10;
        if (!z11) {
            this.f46179r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f46174m == iArr) {
            return;
        }
        this.f46174m = iArr;
        this.f46175n = null;
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
