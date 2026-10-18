package yh;

import ai.m6;
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
public final class e1 extends Drawable {
    public static l1 C = new l1();
    public Paint A;
    public int B;
    public final ViewGroup f50252a;
    public final d6 f50253b;
    public final Paint f50254c;
    public final Paint d;
    public final RectF e;
    public final Path f50255f;
    public final boolean f50256g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f50257i;
    public RadialGradient f50258j;
    public final Matrix f50259k;
    public final d1 f50260l;
    public int[] f50261m;
    public LinearGradient f50262n;
    public final Matrix f50263o;
    public boolean f50264p;
    public final Paint f50265q;
    public final f6 f50266r;
    public float f50267s;
    public boolean f50268t;
    public boolean f50269u;
    public int v;
    public int f50270w;
    public Integer f50271x;
    public long f50272y;
    public Bitmap f50273z;

    public e1(ViewGroup viewGroup, d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f50254c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f50255f = new Path();
        this.f50259k = new Matrix();
        new Path();
        this.f50263o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f50265q = paint3;
        this.f50266r = new f6(new tg.p(this, 16), 320L, bs.h);
        this.f50267s = AndroidUtilities.dp(11.0f);
        this.f50269u = true;
        this.v = 0;
        int i10 = h6.f20993d6;
        this.f50270w = i10;
        this.f50252a = viewGroup;
        this.f50253b = d6Var;
        d1 d1Var = new d1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f50260l = d1Var;
        viewGroup.addOnAttachStateChangeListener(new m6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            d1Var.a();
        }
        this.f50256g = z10;
        paint.setColor(h6.w0(i10, d6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f50268t != z10) {
            this.f50268t = z10;
            Paint paint = this.f50254c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), h6.w0(h6.f20934a6, this.f50253b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: yh.e1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f50252a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f50258j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f50272y = 0L;
        d1 d1Var = this.f50260l;
        if (stargiftattributepattern == null) {
            d1Var.g(null, false);
            return;
        }
        d1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f50272y = document.f20285id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f50264p == z10) {
            return;
        }
        this.f50264p = z10;
        if (!z11) {
            this.f50266r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f50261m == iArr) {
            return;
        }
        this.f50261m = iArr;
        this.f50262n = null;
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
