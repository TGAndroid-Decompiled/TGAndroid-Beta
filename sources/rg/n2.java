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
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Wallet.p9;
import w7.z5;
public class n2 extends j {
    public final TLRPC.Document f45541q0;
    public final Object f45542r0;
    public final int f45543s0;
    public boolean f45544t0;
    public final f6 f45545u0;
    public final dw0 f45546v0;
    public final p9 f45547w0;
    public final ImageReceiver f45548x0;

    public n2(Context context, PointF pointF, float f7, float f10, dw0 dw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f45543s0 = -1;
        int i10 = 0;
        this.f45544t0 = false;
        this.f45548x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f45541q0 = document;
        this.f45546v0 = dw0Var;
        this.f45542r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f45543s0 = tL_maskCoords.f20347n;
                }
            } else {
                i10++;
            }
        }
        p9 p9Var = new p9(this, context);
        this.f45547w0 = p9Var;
        addView(p9Var, z5.c(-1.0f, -1));
        this.f45545u0 = new f6(p9Var, 0L, 500L, bs.h);
        this.f45548x0.setAspectFit(true);
        this.f45548x0.setInvalidateAll(true);
        this.f45548x0.setParentView(p9Var);
        this.f45548x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f45548x0.setDelegate(new qg.g0(this, 14));
        k();
    }

    @Override
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 2);
        z1Var.f45723r = new RectF();
        return z1Var;
    }

    public int getAnchor() {
        return this.f45543s0;
    }

    public dw0 getBaseSize() {
        return this.f45546v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f45548x0;
        uj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        return this.f45542r0;
    }

    @Override
    public el0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new el0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f45541q0;
    }

    @Override
    public final void k() {
        dw0 dw0Var = this.f45546v0;
        setX(getPositionX() - (dw0Var.f25720a / 2.0f));
        setY(getPositionY() - (dw0Var.f25721b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45548x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45548x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        dw0 dw0Var = this.f45546v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) dw0Var.f25720a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) dw0Var.f25721b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f45544t0;
        this.f45544t0 = z11;
        if (!z10) {
            this.f45545u0.f(z11, true);
        }
        this.f45547w0.invalidate();
    }

    public n2(Context context, n2 n2Var, PointF pointF) {
        this(context, pointF, n2Var.getRotation(), n2Var.getScale(), n2Var.f45546v0, n2Var.f45541q0, n2Var.f45542r0);
        if (n2Var.f45544t0) {
            r(false);
        }
    }

    public void q(uj0 uj0Var) {
    }
}
