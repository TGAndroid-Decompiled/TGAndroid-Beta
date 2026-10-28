package zh;

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
import bi.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
public final class d1 extends Drawable {
    public static k1 E = new k1();
    public long A;
    public Bitmap B;
    public Paint C;
    public int D;
    public final ViewGroup f52991a;
    public final u6 f52992b;
    public final Paint f52993c;
    public final Paint d;
    public final RectF e;
    public final Path f52994f;
    public final boolean f52995g;
    public TL_stars.starGiftAttributeBackdrop h;
    public int f52996i;
    public RadialGradient f52997j;
    public final Matrix f52998k;
    public final c1 f52999l;
    public int[] f53000m;
    public LinearGradient f53001n;
    public final Matrix f53002o;
    public boolean f53003p;
    public final Paint f53004q;
    public final h6 f53005r;
    public float f53006s;
    public boolean f53007t;
    public int f53008u;
    public boolean v;
    public int f53009w;
    public int f53010x;
    public int f53011y;
    public Integer f53012z;

    public d1(ViewGroup viewGroup, u6 u6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f52993c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.e = new RectF();
        this.f52994f = new Path();
        this.f52998k = new Matrix();
        new Path();
        this.f53002o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f53004q = paint3;
        this.f53005r = new h6(new ti.g(this, 20), 320L, ds.h);
        this.f53006s = AndroidUtilities.dp(11.0f);
        this.v = true;
        this.f53009w = 0;
        int i10 = y6.f23357d6;
        this.f53011y = i10;
        this.f52991a = viewGroup;
        this.f52992b = u6Var;
        c1 c1Var = new c1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f52999l = c1Var;
        viewGroup.addOnAttachStateChangeListener(new i6(this, 14));
        if (viewGroup.isAttachedToWindow()) {
            c1Var.a();
        }
        this.f52995g = z10;
        int w02 = y6.w0(i10, u6Var);
        this.f53010x = w02;
        paint.setColor(w02);
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        int i10;
        if (z10) {
            i10 = y6.w0(y6.f23299a6, this.f52992b);
        } else {
            i10 = 0;
        }
        if (this.f53007t == z10 && (!z10 || this.f53008u == i10)) {
            return;
        }
        this.f53007t = z10;
        Paint paint = this.f52993c;
        if (z10) {
            this.f53008u = i10;
            paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), i10);
            return;
        }
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b(android.graphics.Canvas r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: zh.d1.b(android.graphics.Canvas, float):void");
    }

    public final void c() {
        this.f52991a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f52997j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.A = 0L;
        c1 c1Var = this.f52999l;
        if (stargiftattributepattern == null) {
            c1Var.g(null, false);
            return;
        }
        c1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.A = document.f22034id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f53003p == z10) {
            return;
        }
        this.f53003p = z10;
        if (!z11) {
            this.f53005r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f53000m == iArr) {
            return;
        }
        this.f53000m = iArr;
        this.f53001n = null;
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
