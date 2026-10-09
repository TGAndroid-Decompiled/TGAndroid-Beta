package qg;

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
import ci.l8;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.mw0;
import w7.x5;
public final class y1 extends j {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public MediaController.CropState G0;
    public final TLObject f46633q0;
    public final String f46634r0;
    public final int f46635s0;
    public boolean f46636t0;
    public final g6 f46637u0;
    public final mw0 f46638v0;
    public final int f46639w0;
    public boolean f46640x0;
    public final g6 f46641y0;
    public final ai.f0 f46642z0;

    public y1(Context context, PointF pointF, mw0 mw0Var, String str, int i10) {
        super(context, pointF);
        this.f46635s0 = -1;
        this.f46636t0 = false;
        this.f46640x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f46634r0 = str;
        this.f46638v0 = mw0Var;
        ai.f0 f0Var = new ai.f0(this, context);
        this.f46642z0 = f0Var;
        addView(f0Var, x5.d(-1.0f, -1));
        hs hsVar = hs.h;
        this.f46637u0 = new g6(f0Var, 0L, 500L, hsVar);
        this.f46641y0 = new g6(f0Var, 0L, 350L, hsVar);
        this.f46639w0 = i10;
        Bitmap q6 = l8.q(new m4.w(str, 22), 1920, 1920, 0, false);
        this.A0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return a1.g.l(round, round, "_");
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getAnchor() {
        return this.f46635s0;
    }

    public mw0 getBaseSize() {
        return this.f46638v0;
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
        return this.f46639w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public ml0 getSelectionBounds() {
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
        float y3 = bi.y(dp, 2.0f, getPositionX(), scaleX);
        return new ml0(y3, bi.y(dp2, 2.0f, getPositionY(), scaleX), ((((AndroidUtilities.dp(64.0f) / scaleX) + scale2) * scaleX) + y3) - y3, dp2 * scaleX);
    }

    @Override
    public final void k() {
        mw0 mw0Var = this.f46638v0;
        float f7 = mw0Var.f28963a / 2.0f;
        float f10 = mw0Var.f28964b / 2.0f;
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
        mw0 mw0Var = this.f46638v0;
        float f7 = mw0Var.f28963a;
        float f10 = mw0Var.f28964b;
        MediaController.CropState cropState = this.G0;
        if (cropState != null) {
            f7 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f7, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824));
    }

    public final String q(int i10) {
        TLObject tLObject = this.f46633q0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f46634r0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f46636t0;
        this.f46636t0 = z11;
        if (!z10) {
            this.f46637u0.f(z11, true);
        }
        ai.f0 f0Var = this.f46642z0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.C0 && !this.B0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ac.d dVar = new ac.d();
            dVar.f409a = true;
            zzd a2 = i8.d.a(new ac.e(dVar));
            this.B0 = true;
            a2.g(vb.a.a(bitmap, this.f46639w0)).addOnSuccessListener(new m4.w(this, 23)).addOnFailureListener(new x1(0, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f46640x0;
        this.f46640x0 = z11;
        if (!z10) {
            this.f46641y0.f(z11, true);
        }
        ai.f0 f0Var = this.f46642z0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public y1(Context context, PointF pointF, mw0 mw0Var, TLObject tLObject) {
        super(context, pointF);
        this.f46635s0 = -1;
        this.f46636t0 = false;
        this.f46640x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f46633q0 = tLObject;
        this.f46638v0 = mw0Var;
        ai.f0 f0Var = new ai.f0(this, context);
        this.f46642z0 = f0Var;
        addView(f0Var, x5.d(-1.0f, -1));
        hs hsVar = hs.h;
        this.f46637u0 = new g6(f0Var, 0L, 500L, hsVar);
        this.f46641y0 = new g6(f0Var, 0L, 350L, hsVar);
        k();
    }
}
