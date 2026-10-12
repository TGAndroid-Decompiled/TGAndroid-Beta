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
    public final ViewGroup f51441a;
    public final c6 f51442b;
    public final Paint f51443c;
    public final Paint d;
    public final RectF f51444e;
    public final Path f51445f;
    public final boolean f51446g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f51447i;
    public RadialGradient f51448j;
    public final Matrix f51449k;
    public final e1 f51450l;
    public int[] f51451m;
    public LinearGradient f51452n;
    public final Matrix f51453o;
    public boolean f51454p;
    public final Paint f51455q;
    public final g6 f51456r;
    public float f51457s;
    public boolean f51458t;
    public boolean f51459u;
    public int v;
    public int f51460w;
    public Integer f51461x;
    public long f51462y;
    public Bitmap f51463z;

    public f1(ViewGroup viewGroup, c6 c6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f51443c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f51444e = new RectF();
        this.f51445f = new Path();
        this.f51449k = new Matrix();
        new Path();
        this.f51453o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f51455q = paint3;
        this.f51456r = new g6(new rg.x1(this, 19), 320L, js.h);
        this.f51457s = AndroidUtilities.dp(11.0f);
        this.f51459u = true;
        this.v = 0;
        int i10 = h6.f20559d6;
        this.f51460w = i10;
        this.f51441a = viewGroup;
        this.f51442b = c6Var;
        e1 e1Var = new e1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f51450l = e1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.v2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            e1Var.a();
        }
        this.f51446g = z10;
        paint.setColor(h6.w0(i10, c6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f51458t != z10) {
            this.f51458t = z10;
            Paint paint = this.f51443c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), h6.w0(h6.f20502a6, this.f51442b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.f1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f51441a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f51448j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f51462y = 0L;
        e1 e1Var = this.f51450l;
        if (stargiftattributepattern == null) {
            e1Var.g(null, false);
            return;
        }
        e1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f51462y = document.f19808id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f51454p == z10) {
            return;
        }
        this.f51454p = z10;
        if (!z11) {
            this.f51456r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f51451m == iArr) {
            return;
        }
        this.f51451m = iArr;
        this.f51452n = null;
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
