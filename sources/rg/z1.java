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
import di.o8;
import ji.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.qv0;
import w7.x5;
public final class z1 extends k {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public MediaController.CropState G0;
    public final TLObject f45584q0;
    public final String f45585r0;
    public final int f45586s0;
    public boolean f45587t0;
    public final e6 f45588u0;
    public final iv0 f45589v0;
    public final int f45590w0;
    public boolean f45591x0;
    public final e6 f45592y0;
    public final ah.y f45593z0;

    public z1(Context context, PointF pointF, iv0 iv0Var, String str, int i10) {
        super(context, pointF);
        this.f45586s0 = -1;
        this.f45587t0 = false;
        this.f45591x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f45585r0 = str;
        this.f45589v0 = iv0Var;
        ah.y yVar = new ah.y(this, context);
        this.f45593z0 = yVar;
        addView(yVar, x5.c(-1.0f, -1));
        pr prVar = pr.h;
        this.f45588u0 = new e6(yVar, 0L, 500L, prVar);
        this.f45592y0 = new e6(yVar, 0L, 350L, prVar);
        this.f45590w0 = i10;
        Bitmap q6 = o8.q(new k5(str, 26), 1920, 1920, 0, false);
        this.A0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return a4.a.k(round, round, "_");
    }

    @Override
    public final j a() {
        return new r0(this, getContext());
    }

    public int getAnchor() {
        return this.f45586s0;
    }

    public iv0 getBaseSize() {
        return this.f45589v0;
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
        return this.f45590w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public hk0 getSelectionBounds() {
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
        float u10 = wl.u(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(u10, wl.u(dp2, 2.0f, getPositionY(), scaleX), ((((AndroidUtilities.dp(64.0f) / scaleX) + scale2) * scaleX) + u10) - u10, dp2 * scaleX);
    }

    @Override
    public final void k() {
        iv0 iv0Var = this.f45589v0;
        float f7 = iv0Var.f27271a / 2.0f;
        float f10 = iv0Var.f27272b / 2.0f;
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
        iv0 iv0Var = this.f45589v0;
        float f7 = iv0Var.f27271a;
        float f10 = iv0Var.f27272b;
        MediaController.CropState cropState = this.G0;
        if (cropState != null) {
            f7 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f7, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824));
    }

    public final String q(int i10) {
        TLObject tLObject = this.f45584q0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f45585r0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f45587t0;
        this.f45587t0 = z11;
        if (!z10) {
            this.f45588u0.f(z11, true);
        }
        ah.y yVar = this.f45593z0;
        if (yVar != null) {
            yVar.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.C0 && !this.B0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ac.d dVar = new ac.d();
            dVar.f396a = true;
            zzd a2 = i8.d.a(new ac.e(dVar));
            this.B0 = true;
            a2.g(vb.a.a(bitmap, this.f45590w0)).addOnSuccessListener(new k5(this, 27)).addOnFailureListener(new qv0(28, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f45591x0;
        this.f45591x0 = z11;
        if (!z10) {
            this.f45592y0.f(z11, true);
        }
        ah.y yVar = this.f45593z0;
        if (yVar != null) {
            yVar.invalidate();
        }
    }

    public z1(Context context, PointF pointF, iv0 iv0Var, TLObject tLObject) {
        super(context, pointF);
        this.f45586s0 = -1;
        this.f45587t0 = false;
        this.f45591x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f45584q0 = tLObject;
        this.f45589v0 = iv0Var;
        ah.y yVar = new ah.y(this, context);
        this.f45593z0 = yVar;
        addView(yVar, x5.c(-1.0f, -1));
        pr prVar = pr.h;
        this.f45588u0 = new e6(yVar, 0L, 500L, prVar);
        this.f45592y0 = new e6(yVar, 0L, 350L, prVar);
        k();
    }
}
