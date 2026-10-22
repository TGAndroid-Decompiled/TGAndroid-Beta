package yh;

import ai.n6;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
public final class d1 extends Drawable {
    public static k1 C = new k1();
    public Paint A;
    public int B;
    public final ViewGroup f50200a;
    public final d6 f50201b;
    public final Paint f50202c;
    public final Paint d;
    public final RectF e;
    public final Path f50203f;
    public final boolean f50204g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f50205i;
    public RadialGradient f50206j;
    public final Matrix f50207k;
    public final c1 f50208l;
    public int[] f50209m;
    public LinearGradient f50210n;
    public final Matrix f50211o;
    public boolean f50212p;
    public final Paint f50213q;
    public final f6 f50214r;
    public float f50215s;
    public boolean f50216t;
    public boolean f50217u;
    public int v;
    public int f50218w;
    public Integer f50219x;
    public long f50220y;
    public Bitmap f50221z;

    public d1(ViewGroup viewGroup, d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f50202c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f50203f = new Path();
        this.f50207k = new Matrix();
        new Path();
        this.f50211o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f50213q = paint3;
        this.f50214r = new f6(new tg.p(this, 16), 320L, bs.h);
        this.f50215s = AndroidUtilities.dp(11.0f);
        this.f50217u = true;
        this.v = 0;
        int i10 = h6.f20993d6;
        this.f50218w = i10;
        this.f50200a = viewGroup;
        this.f50201b = d6Var;
        c1 c1Var = new c1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f50208l = c1Var;
        viewGroup.addOnAttachStateChangeListener(new n6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            c1Var.a();
        }
        this.f50204g = z10;
        paint.setColor(h6.w0(i10, d6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f50216t != z10) {
            this.f50216t = z10;
            Paint paint = this.f50202c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), h6.w0(h6.f20934a6, this.f50201b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: yh.d1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f50200a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f50206j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f50220y = 0L;
        c1 c1Var = this.f50208l;
        if (stargiftattributepattern == null) {
            c1Var.g(null, false);
            return;
        }
        c1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f50220y = document.f20285id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f50212p == z10) {
            return;
        }
        this.f50212p = z10;
        if (!z11) {
            this.f50214r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f50209m == iArr) {
            return;
        }
        this.f50209m = iArr;
        this.f50210n = null;
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
