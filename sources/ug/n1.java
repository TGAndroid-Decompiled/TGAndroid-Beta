package ug;

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
import b8.mf;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import gi.f7;
import org.telegram.messenger.re;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.na1;
import x7.q5;
public final class n1 extends j {
    public final kw0 A0;
    public final Bitmap B0;
    public boolean C0;
    public boolean D0;
    public final Rect E0;
    public final Rect F0;
    public final Paint G0;
    public re H0;
    public final TLObject f56178r0;
    public final String f56179s0;
    public final int f56180t0;
    public boolean f56181u0;
    public final u5 f56182v0;
    public final lt0 f56183w0;
    public final int f56184x0;
    public boolean f56185y0;
    public final u5 f56186z0;

    public n1(Context context, PointF pointF, lt0 lt0Var, String str, int i3) {
        super(context, pointF);
        this.f56180t0 = -1;
        this.f56181u0 = false;
        this.f56185y0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f56179s0 = str;
        this.f56183w0 = lt0Var;
        kw0 kw0Var = new kw0(this, context);
        this.A0 = kw0Var;
        addView(kw0Var, mf.c(-1.0f, -1));
        xq xqVar = xq.h;
        this.f56182v0 = new u5(kw0Var, 0L, 500L, xqVar);
        this.f56186z0 = new u5(kw0Var, 0L, 350L, xqVar);
        this.f56184x0 = i3;
        Bitmap q10 = f7.q(new m1(str, 0), 1920, 1920, 0, false);
        this.B0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = org.telegram.messenger.g0.f22608q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / org.telegram.messenger.g0.f22607p);
        return com.google.android.recaptcha.internal.a.i(round, "_", round);
    }

    @Override
    public final i a() {
        return new i0(this, getContext());
    }

    public int getAnchor() {
        return this.f56180t0;
    }

    public lt0 getBaseSize() {
        return this.f56183w0;
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
        return this.f56184x0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public ni0 getSelectionBounds() {
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
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new ni0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((((org.telegram.messenger.g0.L(64.0f) / scaleX) + scale2) * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public final void k() {
        lt0 lt0Var = this.f56183w0;
        float f10 = lt0Var.f35877a / 2.0f;
        float f11 = lt0Var.f35878b / 2.0f;
        re reVar = this.H0;
        if (reVar != null) {
            f10 *= reVar.f25113e;
            f11 *= reVar.f25114f;
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
    public final void onMeasure(int i3, int i10) {
        lt0 lt0Var = this.f56183w0;
        float f10 = lt0Var.f35877a;
        float f11 = lt0Var.f35878b;
        re reVar = this.H0;
        if (reVar != null) {
            f10 *= reVar.f25113e;
            f11 *= reVar.f25114f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824));
    }

    public final String q(int i3) {
        TLObject tLObject = this.f56178r0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                w7.G(i3);
                return w7.K(w10, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f56179s0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f56181u0;
        this.f56181u0 = z11;
        if (!z10) {
            this.f56182v0.f(z11, true);
        }
        kw0 kw0Var = this.A0;
        if (kw0Var != null) {
            kw0Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.D0 && !this.C0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ha.a aVar = new ha.a();
            aVar.f14364a = true;
            zzd a10 = q5.a(new wb.d(aVar));
            this.C0 = true;
            a10.g(rb.a.a(bitmap, this.f56184x0)).addOnSuccessListener(new e3(this, 21)).addOnFailureListener(new na1(16, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f56185y0;
        this.f56185y0 = z11;
        if (!z10) {
            this.f56186z0.f(z11, true);
        }
        kw0 kw0Var = this.A0;
        if (kw0Var != null) {
            kw0Var.invalidate();
        }
    }

    public n1(Context context, PointF pointF, lt0 lt0Var, TLObject tLObject) {
        super(context, pointF);
        this.f56180t0 = -1;
        this.f56181u0 = false;
        this.f56185y0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f56178r0 = tLObject;
        this.f56183w0 = lt0Var;
        kw0 kw0Var = new kw0(this, context);
        this.A0 = kw0Var;
        addView(kw0Var, mf.c(-1.0f, -1));
        xq xqVar = xq.h;
        this.f56182v0 = new u5(kw0Var, 0L, 500L, xqVar);
        this.f56186z0 = new u5(kw0Var, 0L, 350L, xqVar);
        k();
    }
}
