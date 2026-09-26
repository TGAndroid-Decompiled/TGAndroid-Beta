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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.ds0;
import w7.y5;
public final class y1 extends j {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public MediaController.CropState G0;
    public final TLObject f42004q0;
    public final String f42005r0;
    public final int f42006s0;
    public boolean f42007t0;
    public final e6 f42008u0;
    public final vv0 f42009v0;
    public final int f42010w0;
    public boolean f42011x0;
    public final e6 f42012y0;
    public final ai.f0 f42013z0;

    public y1(Context context, PointF pointF, vv0 vv0Var, String str, int i10) {
        super(context, pointF);
        this.f42006s0 = -1;
        this.f42007t0 = false;
        this.f42011x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f42005r0 = str;
        this.f42009v0 = vv0Var;
        ai.f0 f0Var = new ai.f0(this, context);
        this.f42013z0 = f0Var;
        addView(f0Var, y5.c(-1.0f, -1));
        sr srVar = sr.h;
        this.f42008u0 = new e6(f0Var, 0L, 500L, srVar);
        this.f42012y0 = new e6(f0Var, 0L, 350L, srVar);
        this.f42010w0 = i10;
        Bitmap q6 = l8.q(new le.b(str, 22), 1920, 1920, 0, false);
        this.A0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return a4.a.l(round, round, "_");
    }

    @Override
    public final i a() {
        return new q0(this, getContext());
    }

    public int getAnchor() {
        return this.f42006s0;
    }

    public vv0 getBaseSize() {
        return this.f42009v0;
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
        return this.f42010w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public tk0 getSelectionBounds() {
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
        float x10 = ok.x(dp, 2.0f, getPositionX(), scaleX);
        return new tk0(x10, ok.x(dp2, 2.0f, getPositionY(), scaleX), ((((AndroidUtilities.dp(64.0f) / scaleX) + scale2) * scaleX) + x10) - x10, dp2 * scaleX);
    }

    @Override
    public final void k() {
        vv0 vv0Var = this.f42009v0;
        float f7 = vv0Var.f29774a / 2.0f;
        float f10 = vv0Var.f29775b / 2.0f;
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
        vv0 vv0Var = this.f42009v0;
        float f7 = vv0Var.f29774a;
        float f10 = vv0Var.f29775b;
        MediaController.CropState cropState = this.G0;
        if (cropState != null) {
            f7 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f7, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824));
    }

    public final String q(int i10) {
        TLObject tLObject = this.f42004q0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f42005r0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f42007t0;
        this.f42007t0 = z11;
        if (!z10) {
            this.f42008u0.f(z11, true);
        }
        ai.f0 f0Var = this.f42013z0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.C0 && !this.B0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ac.d dVar = new ac.d();
            dVar.f382a = true;
            zzd a2 = i8.d.a(new ac.e(dVar));
            this.B0 = true;
            a2.g(vb.a.a(bitmap, this.f42010w0)).addOnSuccessListener(new le.b(this, 23)).addOnFailureListener(new ds0(26, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f42011x0;
        this.f42011x0 = z11;
        if (!z10) {
            this.f42012y0.f(z11, true);
        }
        ai.f0 f0Var = this.f42013z0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public y1(Context context, PointF pointF, vv0 vv0Var, TLObject tLObject) {
        super(context, pointF);
        this.f42006s0 = -1;
        this.f42007t0 = false;
        this.f42011x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f42004q0 = tLObject;
        this.f42009v0 = vv0Var;
        ai.f0 f0Var = new ai.f0(this, context);
        this.f42013z0 = f0Var;
        addView(f0Var, y5.c(-1.0f, -1));
        sr srVar = sr.h;
        this.f42008u0 = new e6(f0Var, 0L, 500L, srVar);
        this.f42012y0 = new e6(f0Var, 0L, 350L, srVar);
        k();
    }
}
