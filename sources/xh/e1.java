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
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.qr;
public final class e1 extends Drawable {
    public static m1 C = new m1();
    public Paint A;
    public int B;
    public final ViewGroup f45863a;
    public final f6 f45864b;
    public final Paint f45865c;
    public final Paint d;
    public final RectF e;
    public final Path f45866f;
    public final boolean f45867g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f45868i;
    public RadialGradient f45869j;
    public final Matrix f45870k;
    public final d1 f45871l;
    public int[] f45872m;
    public LinearGradient f45873n;
    public final Matrix f45874o;
    public boolean f45875p;
    public final Paint f45876q;
    public final c6 f45877r;
    public float f45878s;
    public boolean f45879t;
    public boolean f45880u;
    public int v;
    public int f45881w;
    public Integer f45882x;
    public long f45883y;
    public Bitmap f45884z;

    public e1(ViewGroup viewGroup, f6 f6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f45865c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f45866f = new Path();
        this.f45870k = new Matrix();
        new Path();
        this.f45874o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f45876q = paint3;
        this.f45877r = new c6(new rg.w1(this, 15), 320L, qr.h);
        this.f45878s = AndroidUtilities.dp(11.0f);
        this.f45880u = true;
        this.v = 0;
        int i10 = j6.f18863d6;
        this.f45881w = i10;
        this.f45863a = viewGroup;
        this.f45864b = f6Var;
        d1 d1Var = new d1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f45871l = d1Var;
        viewGroup.addOnAttachStateChangeListener(new ai.u2(this, 12));
        if (viewGroup.isAttachedToWindow()) {
            d1Var.a();
        }
        this.f45867g = z10;
        paint.setColor(j6.v0(i10, f6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f45879t != z10) {
            this.f45879t = z10;
            Paint paint = this.f45865c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), j6.v0(j6.f18806a6, this.f45864b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: xh.e1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f45863a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f45869j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f45883y = 0L;
        d1 d1Var = this.f45871l;
        if (stargiftattributepattern == null) {
            d1Var.g(null, false);
            return;
        }
        d1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f45883y = document.f18127id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f45875p == z10) {
            return;
        }
        this.f45875p = z10;
        if (!z11) {
            this.f45877r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f45872m == iArr) {
            return;
        }
        this.f45872m = iArr;
        this.f45873n = null;
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
