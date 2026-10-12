package rg;

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
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import di.k8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iw0;
import w7.a6;
public final class z1 extends j {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public MediaController.CropState G0;
    public final TLObject f44634q0;
    public final String f44635r0;
    public final int f44636s0;
    public boolean f44637t0;
    public final g6 f44638u0;
    public final iw0 f44639v0;
    public final int f44640w0;
    public boolean f44641x0;
    public final g6 f44642y0;
    public final ah.x f44643z0;

    public z1(Context context, PointF pointF, iw0 iw0Var, String str, int i10) {
        super(context, pointF);
        this.f44636s0 = -1;
        this.f44637t0 = false;
        this.f44641x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f44635r0 = str;
        this.f44639v0 = iw0Var;
        ah.x xVar = new ah.x(this, context);
        this.f44643z0 = xVar;
        addView(xVar, a6.d(-1.0f, -1));
        es esVar = es.h;
        this.f44638u0 = new g6(xVar, 0L, 500L, esVar);
        this.f44642y0 = new g6(xVar, 0L, 350L, esVar);
        this.f44640w0 = i10;
        Bitmap q6 = k8.q(new b0(str, 1), 1920, 1920, 0, false);
        this.A0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return a1.g.k(round, round, "_");
    }

    @Override
    public final i a() {
        return new r0(this, getContext());
    }

    public int getAnchor() {
        return this.f44636s0;
    }

    public iw0 getBaseSize() {
        return this.f44639v0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.f44640w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public il0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float scale2 = getScale() * getMeasuredWidth();
        getMeasuredHeight();
        getScale();
        AndroidUtilities.dp(64.0f);
        float x10 = yh.x(dp, 2.0f, getPositionX(), scaleX);
        return new il0(x10, yh.x(dp2, 2.0f, getPositionY(), scaleX), ((((AndroidUtilities.dp(64.0f) / scaleX) + scale2) * scaleX) + x10) - x10, dp2 * scaleX);
    }

    @Override
    public final void k() {
        iw0 iw0Var = this.f44639v0;
        float f7 = iw0Var.f26116a / 2.0f;
        float f10 = iw0Var.f26117b / 2.0f;
        MediaController.CropState cropState = this.G0;
        if (cropState != null) {
            f7 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        setX(getPositionX() - f7);
        setY(getPositionY() - f10);
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
    public final void onMeasure(int i10, int i11) {
        iw0 iw0Var = this.f44639v0;
        float f7 = iw0Var.f26116a;
        float f10 = iw0Var.f26117b;
        MediaController.CropState cropState = this.G0;
        if (cropState != null) {
            f7 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f7, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824));
    }

    public final String q(int i10) {
        TLObject tLObject = this.f44634q0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f44635r0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f44637t0;
        this.f44637t0 = z11;
        if (!z10) {
            this.f44638u0.f(z11, true);
        }
        ah.x xVar = this.f44643z0;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.C0 && !this.B0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            bc.d dVar = new bc.d();
            dVar.f2633a = true;
            zzd a2 = v7.f0.a(new bc.e(dVar));
            this.B0 = true;
            a2.g(wb.a.a(bitmap, this.f44640w0)).addOnSuccessListener(new b0(this, 2)).addOnFailureListener(new org.telegram.ui.web.c0(6, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f44641x0;
        this.f44641x0 = z11;
        if (!z10) {
            this.f44642y0.f(z11, true);
        }
        ah.x xVar = this.f44643z0;
        if (xVar != null) {
            xVar.invalidate();
        }
    }

    public z1(Context context, PointF pointF, iw0 iw0Var, TLObject tLObject) {
        super(context, pointF);
        this.f44636s0 = -1;
        this.f44637t0 = false;
        this.f44641x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f44634q0 = tLObject;
        this.f44639v0 = iw0Var;
        ah.x xVar = new ah.x(this, context);
        this.f44643z0 = xVar;
        addView(xVar, a6.d(-1.0f, -1));
        es esVar = es.h;
        this.f44638u0 = new g6(xVar, 0L, 500L, esVar);
        this.f44642y0 = new g6(xVar, 0L, 350L, esVar);
        k();
    }
}
