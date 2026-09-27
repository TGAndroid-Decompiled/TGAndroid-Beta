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
import org.telegram.ui.Components.sr;
public final class f1 extends Drawable {
    public static n1 C = new n1();
    public Paint A;
    public int B;
    public final ViewGroup f46192a;
    public final e6 f46193b;
    public final Paint f46194c;
    public final Paint d;
    public final RectF e;
    public final Path f46195f;
    public final boolean f46196g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f46197i;
    public RadialGradient f46198j;
    public final Matrix f46199k;
    public final e1 f46200l;
    public int[] f46201m;
    public LinearGradient f46202n;
    public final Matrix f46203o;
    public boolean f46204p;
    public final Paint f46205q;
    public final org.telegram.ui.Components.e6 f46206r;
    public float f46207s;
    public boolean f46208t;
    public boolean f46209u;
    public int v;
    public int f46210w;
    public Integer f46211x;
    public long f46212y;
    public Bitmap f46213z;

    public f1(ViewGroup viewGroup, e6 e6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f46194c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f46195f = new Path();
        this.f46199k = new Matrix();
        new Path();
        this.f46203o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f46205q = paint3;
        this.f46206r = new org.telegram.ui.Components.e6(new rg.q1(this, 16), 320L, sr.h);
        this.f46207s = AndroidUtilities.dp(11.0f);
        this.f46209u = true;
        this.v = 0;
        int i10 = i6.f19057d6;
        this.f46210w = i10;
        this.f46192a = viewGroup;
        this.f46193b = e6Var;
        e1 e1Var = new e1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f46200l = e1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            e1Var.a();
        }
        this.f46196g = z10;
        paint.setColor(i6.v0(i10, e6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f46208t != z10) {
            this.f46208t = z10;
            Paint paint = this.f46194c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), i6.v0(i6.f19000a6, this.f46193b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.f1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f46192a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f46198j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f46212y = 0L;
        e1 e1Var = this.f46200l;
        if (stargiftattributepattern == null) {
            e1Var.g(null, false);
            return;
        }
        e1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f46212y = document.f18335id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f46204p == z10) {
            return;
        }
        this.f46204p = z10;
        if (!z11) {
            this.f46206r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f46201m == iArr) {
            return;
        }
        this.f46201m = iArr;
        this.f46202n = null;
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
