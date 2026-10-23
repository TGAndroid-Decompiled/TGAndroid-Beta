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
    public final ViewGroup f50201a;
    public final d6 f50202b;
    public final Paint f50203c;
    public final Paint d;
    public final RectF e;
    public final Path f50204f;
    public final boolean f50205g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f50206i;
    public RadialGradient f50207j;
    public final Matrix f50208k;
    public final c1 f50209l;
    public int[] f50210m;
    public LinearGradient f50211n;
    public final Matrix f50212o;
    public boolean f50213p;
    public final Paint f50214q;
    public final f6 f50215r;
    public float f50216s;
    public boolean f50217t;
    public boolean f50218u;
    public int v;
    public int f50219w;
    public Integer f50220x;
    public long f50221y;
    public Bitmap f50222z;

    public d1(ViewGroup viewGroup, d6 d6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f50203c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f50204f = new Path();
        this.f50208k = new Matrix();
        new Path();
        this.f50212o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f50214q = paint3;
        this.f50215r = new f6(new tg.p(this, 16), 320L, bs.h);
        this.f50216s = AndroidUtilities.dp(11.0f);
        this.f50218u = true;
        this.v = 0;
        int i10 = h6.f20994d6;
        this.f50219w = i10;
        this.f50201a = viewGroup;
        this.f50202b = d6Var;
        c1 c1Var = new c1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f50209l = c1Var;
        viewGroup.addOnAttachStateChangeListener(new n6(this, 13));
        if (viewGroup.isAttachedToWindow()) {
            c1Var.a();
        }
        this.f50205g = z10;
        paint.setColor(h6.w0(i10, d6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f50217t != z10) {
            this.f50217t = z10;
            Paint paint = this.f50203c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), h6.w0(h6.f20935a6, this.f50202b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: yh.d1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f50201a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f50207j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f50221y = 0L;
        c1 c1Var = this.f50209l;
        if (stargiftattributepattern == null) {
            c1Var.g(null, false);
            return;
        }
        c1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f50221y = document.f20286id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f50213p == z10) {
            return;
        }
        this.f50213p = z10;
        if (!z11) {
            this.f50215r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f50210m == iArr) {
            return;
        }
        this.f50210m = iArr;
        this.f50211n = null;
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
