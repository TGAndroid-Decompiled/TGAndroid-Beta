package wh;

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
import org.telegram.ui.Components.wr;
public final class e1 extends Drawable {
    public static l1 C = new l1();
    public Paint A;
    public int B;
    public final ViewGroup f44058a;
    public final f6 f44059b;
    public final Paint f44060c;
    public final Paint d;
    public final RectF e;
    public final Path f44061f;
    public final boolean f44062g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f44063i;
    public RadialGradient f44064j;
    public final Matrix f44065k;
    public final d1 f44066l;
    public int[] f44067m;
    public LinearGradient f44068n;
    public final Matrix f44069o;
    public boolean f44070p;
    public final Paint f44071q;
    public final d6 f44072r;
    public float f44073s;
    public boolean f44074t;
    public boolean f44075u;
    public int v;
    public int f44076w;
    public Integer f44077x;
    public long f44078y;
    public Bitmap f44079z;

    public e1(ViewGroup viewGroup, f6 f6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f44060c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f44061f = new Path();
        this.f44065k = new Matrix();
        new Path();
        this.f44069o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f44071q = paint3;
        this.f44072r = new d6(new qg.q0(this, 22), 320L, wr.h);
        this.f44073s = AndroidUtilities.dp(11.0f);
        this.f44075u = true;
        this.v = 0;
        int i10 = j6.f17928d6;
        this.f44076w = i10;
        this.f44058a = viewGroup;
        this.f44059b = f6Var;
        d1 d1Var = new d1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f44066l = d1Var;
        viewGroup.addOnAttachStateChangeListener(new l.d(this, 10));
        if (viewGroup.isAttachedToWindow()) {
            d1Var.a();
        }
        this.f44062g = z10;
        paint.setColor(j6.v0(i10, f6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f44074t != z10) {
            this.f44074t = z10;
            Paint paint = this.f44060c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), j6.v0(j6.f17871a6, this.f44059b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: wh.e1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f44058a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f44064j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f44078y = 0L;
        d1 d1Var = this.f44066l;
        if (stargiftattributepattern == null) {
            d1Var.g(null, false);
            return;
        }
        d1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f44078y = document.f17201id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f44070p == z10) {
            return;
        }
        this.f44070p = z10;
        if (!z11) {
            this.f44072r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f44067m == iArr) {
            return;
        }
        this.f44067m = iArr;
        this.f44068n = null;
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
