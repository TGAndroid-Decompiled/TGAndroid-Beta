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
import w7.z5;
public class o2 extends j {
    public final TLRPC.Document f45607q0;
    public final Object f45608r0;
    public final int f45609s0;
    public boolean f45610t0;
    public final f6 f45611u0;
    public final dw0 f45612v0;
    public final n2 f45613w0;
    public final ImageReceiver f45614x0;

    public o2(Context context, PointF pointF, float f7, float f10, dw0 dw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f45609s0 = -1;
        int i10 = 0;
        this.f45610t0 = false;
        this.f45614x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f45607q0 = document;
        this.f45612v0 = dw0Var;
        this.f45608r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f45609s0 = tL_maskCoords.f20347n;
                }
            } else {
                i10++;
            }
        }
        n2 n2Var = new n2(this, context);
        this.f45613w0 = n2Var;
        addView(n2Var, z5.d(-1.0f, -1));
        this.f45611u0 = new f6(n2Var, 0L, 500L, bs.h);
        this.f45614x0.setAspectFit(true);
        this.f45614x0.setInvalidateAll(true);
        this.f45614x0.setParentView(n2Var);
        this.f45614x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f45614x0.setDelegate(new qg.g0(this, 14));
        k();
    }

    @Override
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 2);
        z1Var.f45751r = new RectF();
        return z1Var;
    }

    public int getAnchor() {
        return this.f45609s0;
    }

    public dw0 getBaseSize() {
        return this.f45612v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f45614x0;
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
        return this.f45608r0;
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
        return this.f45607q0;
    }

    @Override
    public final void k() {
        dw0 dw0Var = this.f45612v0;
        setX(getPositionX() - (dw0Var.f25720a / 2.0f));
        setY(getPositionY() - (dw0Var.f25721b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45614x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45614x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        dw0 dw0Var = this.f45612v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) dw0Var.f25720a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) dw0Var.f25721b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f45610t0;
        this.f45610t0 = z11;
        if (!z10) {
            this.f45611u0.f(z11, true);
        }
        this.f45613w0.invalidate();
    }

    public o2(Context context, o2 o2Var, PointF pointF) {
        this(context, pointF, o2Var.getRotation(), o2Var.getScale(), o2Var.f45612v0, o2Var.f45607q0, o2Var.f45608r0);
        if (o2Var.f45610t0) {
            r(false);
        }
    }

    public void q(uj0 uj0Var) {
    }
}
