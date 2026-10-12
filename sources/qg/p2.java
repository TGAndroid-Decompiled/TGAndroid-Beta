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
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sw0;
import w7.w5;
public class p2 extends j {
    public final TLRPC.Document f46445q0;
    public final Object f46446r0;
    public final int f46447s0;
    public boolean f46448t0;
    public final g6 f46449u0;
    public final sw0 f46450v0;
    public final ai.f0 f46451w0;
    public final ImageReceiver f46452x0;

    public p2(Context context, PointF pointF, float f7, float f10, sw0 sw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f46447s0 = -1;
        int i10 = 0;
        this.f46448t0 = false;
        this.f46452x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f46445q0 = document;
        this.f46450v0 = sw0Var;
        this.f46446r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f46447s0 = tL_maskCoords.f19877n;
                }
            } else {
                i10++;
            }
        }
        ai.f0 f0Var = new ai.f0(this, context);
        this.f46451w0 = f0Var;
        addView(f0Var, w5.d(-1.0f, -1));
        this.f46449u0 = new g6(f0Var, 0L, 500L, js.h);
        this.f46452x0.setAspectFit(true);
        this.f46452x0.setInvalidateAll(true);
        this.f46452x0.setParentView(f0Var);
        this.f46452x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f46452x0.setDelegate(new m4.x(this, 26));
        k();
    }

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 2);
        a2Var.f46117r = new RectF();
        return a2Var;
    }

    public int getAnchor() {
        return this.f46447s0;
    }

    public sw0 getBaseSize() {
        return this.f46450v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f46452x0;
        fk0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.r();
        }
        f6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f46446r0;
    }

    @Override
    public sl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new sl0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f46445q0;
    }

    @Override
    public final void k() {
        sw0 sw0Var = this.f46450v0;
        setX(getPositionX() - (sw0Var.f30696a / 2.0f));
        setY(getPositionY() - (sw0Var.f30697b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46452x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46452x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        sw0 sw0Var = this.f46450v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) sw0Var.f30696a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) sw0Var.f30697b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f46448t0;
        this.f46448t0 = z11;
        if (!z10) {
            this.f46449u0.f(z11, true);
        }
        this.f46451w0.invalidate();
    }

    public p2(Context context, p2 p2Var, PointF pointF) {
        this(context, pointF, p2Var.getRotation(), p2Var.getScale(), p2Var.f46450v0, p2Var.f46445q0, p2Var.f46446r0);
        if (p2Var.f46448t0) {
            r(false);
        }
    }

    public void q(fk0 fk0Var) {
    }
}
