package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import c8.ma;
import c8.ne;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import hi.d7;
import org.telegram.messenger.n10;
import org.telegram.messenger.w7;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.wc1;
public final class n1 extends j {
    public final w01 A0;
    public final Bitmap B0;
    public boolean C0;
    public boolean D0;
    public final Rect E0;
    public final Rect F0;
    public final Paint G0;
    public we H0;
    public final TLObject f58044r0;
    public final String f58045s0;
    public final int f58046t0;
    public boolean f58047u0;
    public final c6 f58048v0;
    public final vt0 f58049w0;
    public final int f58050x0;
    public boolean f58051y0;
    public final c6 f58052z0;

    public n1(Context context, PointF pointF, vt0 vt0Var, String str, int i7) {
        super(context, pointF);
        this.f58046t0 = -1;
        this.f58047u0 = false;
        this.f58051y0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f58045s0 = str;
        this.f58049w0 = vt0Var;
        w01 w01Var = new w01(this, context);
        this.A0 = w01Var;
        addView(w01Var, ma.c(-1.0f, -1));
        lr lrVar = lr.h;
        this.f58048v0 = new c6(w01Var, 0L, 500L, lrVar);
        this.f58052z0 = new c6(w01Var, 0L, 350L, lrVar);
        this.f58050x0 = i7;
        Bitmap q10 = d7.q(new ab.t(str, 2), 1920, 1920, 0, false);
        this.B0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = org.telegram.messenger.g0.f24121q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / org.telegram.messenger.g0.f24120p);
        return com.google.android.gms.internal.vision.e2.j(round, "_", round);
    }

    @Override
    public final i a() {
        return new j0(this, getContext());
    }

    public int getAnchor() {
        return this.f58046t0;
    }

    public vt0 getBaseSize() {
        return this.f58049w0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.B0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.B0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.f58050x0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public yi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float scale2 = getScale() * getMeasuredWidth();
        getMeasuredHeight();
        getScale();
        org.telegram.messenger.g0.L(64.0f);
        float y10 = n10.y(L, 2.0f, getPositionX(), scaleX);
        return new yi0(y10, n10.y(L2, 2.0f, getPositionY(), scaleX), ((((org.telegram.messenger.g0.L(64.0f) / scaleX) + scale2) * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override
    public final void k() {
        vt0 vt0Var = this.f58049w0;
        float f10 = vt0Var.f41433a / 2.0f;
        float f11 = vt0Var.f41434b / 2.0f;
        we weVar = this.H0;
        if (weVar != null) {
            f10 *= weVar.f27679e;
            f11 *= weVar.f27680f;
        }
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        vt0 vt0Var = this.f58049w0;
        float f10 = vt0Var.f41433a;
        float f11 = vt0Var.f41434b;
        we weVar = this.H0;
        if (weVar != null) {
            f10 *= weVar.f27679e;
            f11 *= weVar.f27680f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824));
    }

    public final String q(int i7) {
        TLObject tLObject = this.f58044r0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                w7.G(i7);
                return w7.J(w10, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f58045s0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f58047u0;
        this.f58047u0 = z11;
        if (!z10) {
            this.f58048v0.f(z11, true);
        }
        w01 w01Var = this.A0;
        if (w01Var != null) {
            w01Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.D0 && !this.C0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ia.a aVar = new ia.a();
            aVar.f16183a = true;
            zzd a10 = ne.a(new zb.d(aVar));
            this.C0 = true;
            a10.h(ub.a.a(this.f58050x0, bitmap)).addOnSuccessListener(new org.telegram.ui.ActionBar.p(this, 29)).addOnFailureListener(new wc1(13, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f58051y0;
        this.f58051y0 = z11;
        if (!z10) {
            this.f58052z0.f(z11, true);
        }
        w01 w01Var = this.A0;
        if (w01Var != null) {
            w01Var.invalidate();
        }
    }

    public n1(Context context, PointF pointF, vt0 vt0Var, TLObject tLObject) {
        super(context, pointF);
        this.f58046t0 = -1;
        this.f58047u0 = false;
        this.f58051y0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f58044r0 = tLObject;
        this.f58049w0 = vt0Var;
        w01 w01Var = new w01(this, context);
        this.A0 = w01Var;
        addView(w01Var, ma.c(-1.0f, -1));
        lr lrVar = lr.h;
        this.f58048v0 = new c6(w01Var, 0L, 500L, lrVar);
        this.f58052z0 = new c6(w01Var, 0L, 350L, lrVar);
        k();
    }
}
