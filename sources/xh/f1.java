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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.js;
public final class f1 extends Drawable {
    public static m1 C = new m1();
    public Paint A;
    public int B;
    public final ViewGroup f51449a;
    public final c6 f51450b;
    public final Paint f51451c;
    public final Paint d;
    public final RectF f51452e;
    public final Path f51453f;
    public final boolean f51454g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f51455i;
    public RadialGradient f51456j;
    public final Matrix f51457k;
    public final e1 f51458l;
    public int[] f51459m;
    public LinearGradient f51460n;
    public final Matrix f51461o;
    public boolean f51462p;
    public final Paint f51463q;
    public final g6 f51464r;
    public float f51465s;
    public boolean f51466t;
    public boolean f51467u;
    public int v;
    public int f51468w;
    public Integer f51469x;
    public long f51470y;
    public Bitmap f51471z;

    public f1(ViewGroup viewGroup, c6 c6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f51451c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f51452e = new RectF();
        this.f51453f = new Path();
        this.f51457k = new Matrix();
        new Path();
        this.f51461o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f51463q = paint3;
        this.f51464r = new g6(new rg.x1(this, 19), 320L, js.h);
        this.f51465s = AndroidUtilities.dp(11.0f);
        this.f51467u = true;
        this.v = 0;
        int i10 = h6.f20560d6;
        this.f51468w = i10;
        this.f51449a = viewGroup;
        this.f51450b = c6Var;
        e1 e1Var = new e1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f51458l = e1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.v2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            e1Var.a();
        }
        this.f51454g = z10;
        paint.setColor(h6.w0(i10, c6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f51466t != z10) {
            this.f51466t = z10;
            Paint paint = this.f51451c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), h6.w0(h6.f20503a6, this.f51450b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.f1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f51449a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f51456j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f51470y = 0L;
        e1 e1Var = this.f51458l;
        if (stargiftattributepattern == null) {
            e1Var.g(null, false);
            return;
        }
        e1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f51470y = document.f19809id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f51462p == z10) {
            return;
        }
        this.f51462p = z10;
        if (!z11) {
            this.f51464r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f51459m == iArr) {
            return;
        }
        this.f51459m = iArr;
        this.f51460n = null;
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
