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
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.zr;
import w7.z5;
public class p2 extends j {
    public final TLRPC.Document f46025q0;
    public final Object f46026r0;
    public final int f46027s0;
    public boolean f46028t0;
    public final d6 f46029u0;
    public final hw0 f46030v0;
    public final y1 f46031w0;
    public final ImageReceiver f46032x0;

    public p2(Context context, PointF pointF, float f7, float f10, hw0 hw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f46027s0 = -1;
        int i10 = 0;
        this.f46028t0 = false;
        this.f46032x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f46025q0 = document;
        this.f46030v0 = hw0Var;
        this.f46026r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f46027s0 = tL_maskCoords.f20419n;
                }
            } else {
                i10++;
            }
        }
        y1 y1Var = new y1(this, context);
        this.f46031w0 = y1Var;
        addView(y1Var, z5.c(-1.0f, -1));
        this.f46029u0 = new d6(y1Var, 0L, 500L, zr.h);
        this.f46032x0.setAspectFit(true);
        this.f46032x0.setInvalidateAll(true);
        this.f46032x0.setParentView(y1Var);
        this.f46032x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f46032x0.setDelegate(new qg.g0(this, 14));
        k();
    }

    @Override
    public final i a() {
        b2 b2Var = new b2(this, getContext(), 2);
        b2Var.f45721r = new RectF();
        return b2Var;
    }

    public int getAnchor() {
        return this.f46027s0;
    }

    public hw0 getBaseSize() {
        return this.f46030v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f46032x0;
        xj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        return this.f46026r0;
    }

    @Override
    public hl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new hl0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f46025q0;
    }

    @Override
    public final void k() {
        hw0 hw0Var = this.f46030v0;
        setX(getPositionX() - (hw0Var.f27188a / 2.0f));
        setY(getPositionY() - (hw0Var.f27189b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46032x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46032x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        hw0 hw0Var = this.f46030v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) hw0Var.f27188a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) hw0Var.f27189b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f46028t0;
        this.f46028t0 = z11;
        if (!z10) {
            this.f46029u0.f(z11, true);
        }
        this.f46031w0.invalidate();
    }

    public p2(Context context, p2 p2Var, PointF pointF) {
        this(context, pointF, p2Var.getRotation(), p2Var.getScale(), p2Var.f46030v0, p2Var.f46025q0, p2Var.f46026r0);
        if (p2Var.f46028t0) {
            r(false);
        }
    }

    public void q(xj0 xj0Var) {
    }
}
