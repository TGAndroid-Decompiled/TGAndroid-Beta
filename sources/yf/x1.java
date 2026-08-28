package yf;

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
import f7.m8;
import g7.e6;
import kh.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.ei1;
public final class x1 extends j {
    public final Rect A0;
    public final Paint B0;
    public MediaController.CropState C0;
    public final TLObject m0;
    public final String f50168n0;
    public final int f50169o0;
    public boolean f50170p0;
    public final y5 f50171q0;
    public final qu0 f50172r0;
    public final int f50173s0;
    public boolean f50174t0;
    public final y5 f50175u0;
    public final fh.d2 f50176v0;
    public final Bitmap f50177w0;
    public boolean f50178x0;
    public boolean f50179y0;
    public final Rect f50180z0;

    public x1(Context context, PointF pointF, qu0 qu0Var, String str, int i9) {
        super(context, pointF);
        this.f50169o0 = -1;
        this.f50170p0 = false;
        this.f50174t0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.f50180z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f50168n0 = str;
        this.f50172r0 = qu0Var;
        fh.d2 d2Var = new fh.d2(this, context);
        this.f50176v0 = d2Var;
        addView(d2Var, e6.c(-1.0f, -1));
        gr grVar = gr.h;
        this.f50171q0 = new y5(d2Var, 0L, 500L, grVar);
        this.f50175u0 = new y5(d2Var, 0L, 350L, grVar);
        this.f50173s0 = i9;
        Bitmap q10 = a8.q(new t0.c(str, 11), 1920, 1920, 0, false);
        this.f50177w0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return e2.c.l(round, "_", round);
    }

    @Override
    public final i a() {
        return new o0(this, getContext());
    }

    public int getAnchor() {
        return this.f50169o0;
    }

    public qu0 getBaseSize() {
        return this.f50172r0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.f50177w0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.f50177w0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.f50173s0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public wj0 getSelectionBounds() {
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
        float v = ll.v(dp, 2.0f, getPositionX(), scaleX);
        return new wj0(v, ll.v(dp2, 2.0f, getPositionY(), scaleX), ((((AndroidUtilities.dp(64.0f) / scaleX) + scale2) * scaleX) + v) - v, dp2 * scaleX);
    }

    @Override
    public final void k() {
        qu0 qu0Var = this.f50172r0;
        float f10 = qu0Var.f32026a / 2.0f;
        float f11 = qu0Var.f32027b / 2.0f;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f10 *= cropState.cropPw;
            f11 *= cropState.cropPh;
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
    public final void onMeasure(int i9, int i10) {
        qu0 qu0Var = this.f50172r0;
        float f10 = qu0Var.f32026a;
        float f11 = qu0Var.f32027b;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f10 *= cropState.cropPw;
            f11 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824));
    }

    public final String q(int i9) {
        TLObject tLObject = this.m0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i9).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f50168n0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f50170p0;
        this.f50170p0 = z11;
        if (!z10) {
            this.f50171q0.f(z11, true);
        }
        fh.d2 d2Var = this.f50176v0;
        if (d2Var != null) {
            d2Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.f50179y0 && !this.f50178x0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ib.d dVar = new ib.d();
            dVar.f11083a = true;
            zzd a2 = m8.a(new ib.e(dVar));
            this.f50178x0 = true;
            a2.g(db.a.a(bitmap, this.f50173s0)).addOnSuccessListener(new t0.c(this, 12)).addOnFailureListener(new ei1(13, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f50174t0;
        this.f50174t0 = z11;
        if (!z10) {
            this.f50175u0.f(z11, true);
        }
        fh.d2 d2Var = this.f50176v0;
        if (d2Var != null) {
            d2Var.invalidate();
        }
    }

    public x1(Context context, PointF pointF, qu0 qu0Var, TLObject tLObject) {
        super(context, pointF);
        this.f50169o0 = -1;
        this.f50170p0 = false;
        this.f50174t0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.f50180z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.m0 = tLObject;
        this.f50172r0 = qu0Var;
        fh.d2 d2Var = new fh.d2(this, context);
        this.f50176v0 = d2Var;
        addView(d2Var, e6.c(-1.0f, -1));
        gr grVar = gr.h;
        this.f50171q0 = new y5(d2Var, 0L, 500L, grVar);
        this.f50175u0 = new y5(d2Var, 0L, 350L, grVar);
        k();
    }
}
