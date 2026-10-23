package rg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.yj0;
import w7.z5;
public class p2 extends j {
    public final TLRPC.Document f46026q0;
    public final Object f46027r0;
    public final int f46028s0;
    public boolean f46029t0;
    public final f6 f46030u0;
    public final iw0 f46031v0;
    public final y1 f46032w0;
    public final ImageReceiver f46033x0;

    public p2(Context context, PointF pointF, float f7, float f10, iw0 iw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f46028s0 = -1;
        int i10 = 0;
        this.f46029t0 = false;
        this.f46033x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f46026q0 = document;
        this.f46031v0 = iw0Var;
        this.f46027r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f46028s0 = tL_maskCoords.f20418n;
                }
            } else {
                i10++;
            }
        }
        y1 y1Var = new y1(this, context);
        this.f46032w0 = y1Var;
        addView(y1Var, z5.c(-1.0f, -1));
        this.f46030u0 = new f6(y1Var, 0L, 500L, bs.h);
        this.f46033x0.setAspectFit(true);
        this.f46033x0.setInvalidateAll(true);
        this.f46033x0.setParentView(y1Var);
        this.f46033x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f46033x0.setDelegate(new qg.g0(this, 14));
        k();
    }

    @Override
    public final i a() {
        b2 b2Var = new b2(this, getContext(), 2);
        b2Var.f45722r = new RectF();
        return b2Var;
    }

    public int getAnchor() {
        return this.f46028s0;
    }

    public iw0 getBaseSize() {
        return this.f46031v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f46033x0;
        yj0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.r();
        }
        e6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f46027r0;
    }

    @Override
    public il0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new il0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f46026q0;
    }

    @Override
    public final void k() {
        iw0 iw0Var = this.f46031v0;
        setX(getPositionX() - (iw0Var.f27465a / 2.0f));
        setY(getPositionY() - (iw0Var.f27466b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46033x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46033x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        iw0 iw0Var = this.f46031v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) iw0Var.f27465a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) iw0Var.f27466b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f46029t0;
        this.f46029t0 = z11;
        if (!z10) {
            this.f46030u0.f(z11, true);
        }
        this.f46032w0.invalidate();
    }

    public p2(Context context, p2 p2Var, PointF pointF) {
        this(context, pointF, p2Var.getRotation(), p2Var.getScale(), p2Var.f46031v0, p2Var.f46026q0, p2Var.f46027r0);
        if (p2Var.f46029t0) {
            r(false);
        }
    }

    public void q(yj0 yj0Var) {
    }
}
