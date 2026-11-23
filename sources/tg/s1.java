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
import hi.x7;
import org.telegram.messenger.m10;
import org.telegram.messenger.w7;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.uc1;
public final class s1 extends n {
    public final c6 A0;
    public final w01 B0;
    public final Bitmap C0;
    public boolean D0;
    public boolean E0;
    public final Rect F0;
    public final Rect G0;
    public final Paint H0;
    public we I0;
    public final TLObject f58223s0;
    public final String f58224t0;
    public final int f58225u0;
    public boolean f58226v0;
    public final c6 f58227w0;
    public final xt0 f58228x0;
    public final int f58229y0;
    public boolean f58230z0;

    public s1(Context context, PointF pointF, xt0 xt0Var, String str, int i7) {
        super(context, pointF);
        this.f58225u0 = -1;
        this.f58226v0 = false;
        this.f58230z0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.F0 = new Rect();
        this.G0 = new Rect();
        this.H0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f58224t0 = str;
        this.f58228x0 = xt0Var;
        w01 w01Var = new w01(this, context);
        this.B0 = w01Var;
        addView(w01Var, na.c(-1.0f, -1));
        kr krVar = kr.h;
        this.f58227w0 = new c6(w01Var, 0L, 500L, krVar);
        this.A0 = new c6(w01Var, 0L, 350L, krVar);
        this.f58229y0 = i7;
        Bitmap q10 = x7.q(new ab.t(str, 2), 1920, 1920, 0, false);
        this.C0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = org.telegram.messenger.g0.f24226q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / org.telegram.messenger.g0.f24225p);
        return com.google.android.gms.internal.vision.e2.j(round, "_", round);
    }

    @Override
    public final m a() {
        return new o0(this, getContext());
    }

    public int getAnchor() {
        return this.f58225u0;
    }

    public xt0 getBaseSize() {
        return this.f58228x0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.C0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.C0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.f58229y0;
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
        float y10 = m10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, m10.y(L2, 2.0f, getPositionY(), scaleX), ((((org.telegram.messenger.g0.L(64.0f) / scaleX) + scale2) * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override
    public final void k() {
        xt0 xt0Var = this.f58228x0;
        float f10 = xt0Var.f42189a / 2.0f;
        float f11 = xt0Var.f42190b / 2.0f;
        we weVar = this.I0;
        if (weVar != null) {
            f10 *= weVar.f27771e;
            f11 *= weVar.f27772f;
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
        xt0 xt0Var = this.f58228x0;
        float f10 = xt0Var.f42189a;
        float f11 = xt0Var.f42190b;
        we weVar = this.I0;
        if (weVar != null) {
            f10 *= weVar.f27771e;
            f11 *= weVar.f27772f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824));
    }

    public final String q(int i7) {
        TLObject tLObject = this.f58223s0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                w7.G(i7);
                return w7.J(w10, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f58224t0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f58226v0;
        this.f58226v0 = z11;
        if (!z10) {
            this.f58227w0.f(z11, true);
        }
        w01 w01Var = this.B0;
        if (w01Var != null) {
            w01Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.E0 && !this.D0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ia.a aVar = new ia.a();
            aVar.f16271a = true;
            zzd a10 = oe.a(new zb.d(aVar));
            this.D0 = true;
            a10.h(ub.a.a(this.f58229y0, bitmap)).addOnSuccessListener(new s(this, 2)).addOnFailureListener(new uc1(13, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f58230z0;
        this.f58230z0 = z11;
        if (!z10) {
            this.A0.f(z11, true);
        }
        w01 w01Var = this.B0;
        if (w01Var != null) {
            w01Var.invalidate();
        }
    }

    public s1(Context context, PointF pointF, xt0 xt0Var, TLObject tLObject) {
        super(context, pointF);
        this.f58225u0 = -1;
        this.f58226v0 = false;
        this.f58230z0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.F0 = new Rect();
        this.G0 = new Rect();
        this.H0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f58223s0 = tLObject;
        this.f58228x0 = xt0Var;
        w01 w01Var = new w01(this, context);
        this.B0 = w01Var;
        addView(w01Var, na.c(-1.0f, -1));
        kr krVar = kr.h;
        this.f58227w0 = new c6(w01Var, 0L, 500L, krVar);
        this.A0 = new c6(w01Var, 0L, 350L, krVar);
        k();
    }
}
