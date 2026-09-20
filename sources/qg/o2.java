package qg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.uv0;
import w7.y5;
public class o2 extends j {
    public final TLRPC.Document f41859q0;
    public final Object f41860r0;
    public final int f41861s0;
    public boolean f41862t0;
    public final d6 f41863u0;
    public final uv0 f41864v0;
    public final ai.f0 f41865w0;
    public final ImageReceiver f41866x0;

    public o2(Context context, PointF pointF, float f7, float f10, uv0 uv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f41861s0 = -1;
        int i10 = 0;
        this.f41862t0 = false;
        this.f41866x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f41859q0 = document;
        this.f41864v0 = uv0Var;
        this.f41860r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f41861s0 = tL_maskCoords.f18403n;
                }
            } else {
                i10++;
            }
        }
        ai.f0 f0Var = new ai.f0(this, context);
        this.f41865w0 = f0Var;
        addView(f0Var, y5.c(-1.0f, -1));
        this.f41863u0 = new d6(f0Var, 0L, 500L, qr.h);
        this.f41866x0.setAspectFit(true);
        this.f41866x0.setInvalidateAll(true);
        this.f41866x0.setParentView(f0Var);
        this.f41866x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f41866x0.setDelegate(new k2.v(this, 26));
        k();
    }

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 2);
        a2Var.f41588r = new RectF();
        return a2Var;
    }

    public int getAnchor() {
        return this.f41861s0;
    }

    public uv0 getBaseSize() {
        return this.f41864v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f41866x0;
        hj0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.r();
        }
        c6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f41860r0;
    }

    @Override
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new rk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f41859q0;
    }

    @Override
    public final void k() {
        uv0 uv0Var = this.f41864v0;
        setX(getPositionX() - (uv0Var.f28868a / 2.0f));
        setY(getPositionY() - (uv0Var.f28869b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41866x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41866x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        uv0 uv0Var = this.f41864v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) uv0Var.f28868a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) uv0Var.f28869b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f41862t0;
        this.f41862t0 = z11;
        if (!z10) {
            this.f41863u0.f(z11, true);
        }
        this.f41865w0.invalidate();
    }

    public o2(Context context, o2 o2Var, PointF pointF) {
        this(context, pointF, o2Var.getRotation(), o2Var.getScale(), o2Var.f41864v0, o2Var.f41859q0, o2Var.f41860r0);
        if (o2Var.f41862t0) {
            r(false);
        }
    }

    public void q(hj0 hj0Var) {
    }
}
