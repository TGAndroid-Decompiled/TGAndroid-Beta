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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
public final class e1 extends Drawable {
    public static l1 C = new l1();
    public Paint A;
    public int B;
    public final ViewGroup f48824a;
    public final c6 f48825b;
    public final Paint f48826c;
    public final Paint d;
    public final RectF e;
    public final Path f48827f;
    public final boolean f48828g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f48829i;
    public RadialGradient f48830j;
    public final Matrix f48831k;
    public final d1 f48832l;
    public int[] f48833m;
    public LinearGradient f48834n;
    public final Matrix f48835o;
    public boolean f48836p;
    public final Paint f48837q;
    public final g6 f48838r;
    public float f48839s;
    public boolean f48840t;
    public boolean f48841u;
    public int v;
    public int f48842w;
    public Integer f48843x;
    public long f48844y;
    public Bitmap f48845z;

    public e1(ViewGroup viewGroup, c6 c6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f48826c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f48827f = new Path();
        this.f48831k = new Matrix();
        new Path();
        this.f48835o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f48837q = paint3;
        this.f48838r = new g6(new rh.j(this, 26), 320L, es.h);
        this.f48839s = AndroidUtilities.dp(11.0f);
        this.f48841u = true;
        this.v = 0;
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        this.f48842w = i10;
        this.f48824a = viewGroup;
        this.f48825b = c6Var;
        d1 d1Var = new d1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f48832l = d1Var;
        viewGroup.addOnAttachStateChangeListener(new bi.j2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            d1Var.a();
        }
        this.f48828g = z10;
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f48840t != z10) {
            this.f48840t = z10;
            Paint paint = this.f48826c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19842a6, this.f48825b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: yh.e1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f48824a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f48830j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f48844y = 0L;
        d1 d1Var = this.f48832l;
        if (stargiftattributepattern == null) {
            d1Var.g(null, false);
            return;
        }
        d1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f48844y = document.f19222id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f48836p == z10) {
            return;
        }
        this.f48836p = z10;
        if (!z11) {
            this.f48838r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f48833m == iArr) {
            return;
        }
        this.f48833m = iArr;
        this.f48834n = null;
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
