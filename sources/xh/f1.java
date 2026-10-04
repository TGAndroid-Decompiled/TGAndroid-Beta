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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.tr;
public final class f1 extends Drawable {
    public static m1 C = new m1();
    public Paint A;
    public int B;
    public final ViewGroup f49928a;
    public final d6 f49929b;
    public final Paint f49930c;
    public final Paint d;
    public final RectF f49931e;
    public final Path f49932f;
    public final boolean f49933g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f49934i;
    public RadialGradient f49935j;
    public final Matrix f49936k;
    public final e1 f49937l;
    public int[] f49938m;
    public LinearGradient f49939n;
    public final Matrix f49940o;
    public boolean f49941p;
    public final Paint f49942q;
    public final e6 f49943r;
    public float f49944s;
    public boolean f49945t;
    public boolean f49946u;
    public int v;
    public int f49947w;
    public Integer f49948x;
    public long f49949y;
    public Bitmap f49950z;

    public f1(ViewGroup viewGroup, d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f49930c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f49931e = new RectF();
        this.f49932f = new Path();
        this.f49936k = new Matrix();
        new Path();
        this.f49940o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f49942q = paint3;
        this.f49943r = new e6(new rg.s1(this, 16), 320L, tr.h);
        this.f49944s = AndroidUtilities.dp(11.0f);
        this.f49946u = true;
        this.v = 0;
        int i10 = i6.f20817d6;
        this.f49947w = i10;
        this.f49928a = viewGroup;
        this.f49929b = d6Var;
        e1 e1Var = new e1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f49937l = e1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            e1Var.a();
        }
        this.f49933g = z10;
        paint.setColor(i6.v0(i10, d6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f49945t != z10) {
            this.f49945t = z10;
            Paint paint = this.f49930c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), i6.v0(i6.f20760a6, this.f49929b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.f1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f49928a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f49935j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f49949y = 0L;
        e1 e1Var = this.f49937l;
        if (stargiftattributepattern == null) {
            e1Var.g(null, false);
            return;
        }
        e1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f49949y = document.f20043id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f49941p == z10) {
            return;
        }
        this.f49941p = z10;
        if (!z11) {
            this.f49943r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f49938m == iArr) {
            return;
        }
        this.f49938m = iArr;
        this.f49939n = null;
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
