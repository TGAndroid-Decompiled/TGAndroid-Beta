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
import c8.na;
import c8.oe;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import hi.d7;
import org.telegram.messenger.o10;
import org.telegram.messenger.w7;
import org.telegram.messenger.xe;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.wc1;
public final class p1 extends j {
    public final x01 A0;
    public final Bitmap B0;
    public boolean C0;
    public boolean D0;
    public final Rect E0;
    public final Rect F0;
    public final Paint G0;
    public xe H0;
    public final TLObject f58090r0;
    public final String f58091s0;
    public final int f58092t0;
    public boolean f58093u0;
    public final d6 f58094v0;
    public final yt0 f58095w0;
    public final int f58096x0;
    public boolean f58097y0;
    public final d6 f58098z0;

    public p1(Context context, PointF pointF, yt0 yt0Var, String str, int i7) {
        super(context, pointF);
        this.f58092t0 = -1;
        this.f58093u0 = false;
        this.f58097y0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f58091s0 = str;
        this.f58095w0 = yt0Var;
        x01 x01Var = new x01(this, context);
        this.A0 = x01Var;
        addView(x01Var, na.c(-1.0f, -1));
        nr nrVar = nr.h;
        this.f58094v0 = new d6(x01Var, 0L, 500L, nrVar);
        this.f58098z0 = new d6(x01Var, 0L, 350L, nrVar);
        this.f58096x0 = i7;
        Bitmap q10 = d7.q(new ab.t(str, 2), 1920, 1920, 0, false);
        this.B0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = org.telegram.messenger.g0.f24010q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / org.telegram.messenger.g0.f24009p);
        return com.google.android.gms.internal.vision.e2.j(round, "_", round);
    }

    @Override
    public final i a() {
        return new k0(this, getContext());
    }

    public int getAnchor() {
        return this.f58092t0;
    }

    public yt0 getBaseSize() {
        return this.f58095w0;
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
        return this.f58096x0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public aj0 getSelectionBounds() {
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
        float y10 = o10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, o10.y(L2, 2.0f, getPositionY(), scaleX), ((((org.telegram.messenger.g0.L(64.0f) / scaleX) + scale2) * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override
    public final void k() {
        yt0 yt0Var = this.f58095w0;
        float f10 = yt0Var.f42506a / 2.0f;
        float f11 = yt0Var.f42507b / 2.0f;
        xe xeVar = this.H0;
        if (xeVar != null) {
            f10 *= xeVar.f27841e;
            f11 *= xeVar.f27842f;
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
        yt0 yt0Var = this.f58095w0;
        float f10 = yt0Var.f42506a;
        float f11 = yt0Var.f42507b;
        xe xeVar = this.H0;
        if (xeVar != null) {
            f10 *= xeVar.f27841e;
            f11 *= xeVar.f27842f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824));
    }

    public final String q(int i7) {
        TLObject tLObject = this.f58090r0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                w7.G(i7);
                return w7.J(w10, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f58091s0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f58093u0;
        this.f58093u0 = z11;
        if (!z10) {
            this.f58094v0.f(z11, true);
        }
        x01 x01Var = this.A0;
        if (x01Var != null) {
            x01Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.D0 && !this.C0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ia.a aVar = new ia.a();
            aVar.f16174a = true;
            zzd a10 = oe.a(new zb.d(aVar));
            this.C0 = true;
            a10.h(ub.a.a(this.f58096x0, bitmap)).addOnSuccessListener(new o1(this, 0)).addOnFailureListener(new wc1(13, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f58097y0;
        this.f58097y0 = z11;
        if (!z10) {
            this.f58098z0.f(z11, true);
        }
        x01 x01Var = this.A0;
        if (x01Var != null) {
            x01Var.invalidate();
        }
    }

    public p1(Context context, PointF pointF, yt0 yt0Var, TLObject tLObject) {
        super(context, pointF);
        this.f58092t0 = -1;
        this.f58093u0 = false;
        this.f58097y0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f58090r0 = tLObject;
        this.f58095w0 = yt0Var;
        x01 x01Var = new x01(this, context);
        this.A0 = x01Var;
        addView(x01Var, na.c(-1.0f, -1));
        nr nrVar = nr.h;
        this.f58094v0 = new d6(x01Var, 0L, 500L, nrVar);
        this.f58098z0 = new d6(x01Var, 0L, 350L, nrVar);
        k();
    }
}
