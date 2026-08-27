package zf;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import h7.z5;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yj0;

public class o2 extends j {
    public final TLRPC.Document m0;

    public final Object f50645n0;

    public final int f50646o0;

    public boolean f50647p0;

    public final y5 f50648q0;

    public final tu0 f50649r0;

    public final qg.f f50650s0;

    public final ImageReceiver f50651t0;

    public o2(Context context, PointF pointF, float f10, float f11, tu0 tu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f50646o0 = -1;
        this.f50647p0 = false;
        this.f50651t0 = new ImageReceiver();
        setRotation(f10);
        setScale(f11);
        this.m0 = document;
        this.f50649r0 = tu0Var;
        this.f50645n0 = obj;
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords == null) {
                    break;
                }
                this.f50646o0 = tL_maskCoords.f22455n;
                break;
            }
        }
        qg.f fVar = new qg.f(this, context);
        this.f50650s0 = fVar;
        addView(fVar, z5.c(-1.0f, -1));
        this.f50648q0 = new y5(fVar, 0L, 500L, er.h);
        this.f50651t0.setAspectFit(true);
        this.f50651t0.setInvalidateAll(true);
        this.f50651t0.setParentView(fVar);
        this.f50651t0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f50651t0.setDelegate(new t0.c(this, 15));
        k();
    }

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 2);
        a2Var.f50337r = new RectF();
        return a2Var;
    }

    public int getAnchor() {
        return this.f50646o0;
    }

    public tu0 getBaseSize() {
        return this.f50649r0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f50651t0;
        oi0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.p();
        }
        x5 animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f50645n0;
    }

    @Override
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new yj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.m0;
    }

    @Override
    public final void k() {
        tu0 tu0Var = this.f50649r0;
        float f10 = tu0Var.f32893a / 2.0f;
        float f11 = tu0Var.f32894b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50651t0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50651t0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        tu0 tu0Var = this.f50649r0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) tu0Var.f32893a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) tu0Var.f32894b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f50647p0;
        this.f50647p0 = z11;
        if (!z10) {
            this.f50648q0.f(z11, true);
        }
        this.f50650s0.invalidate();
    }

    public o2(Context context, o2 o2Var, PointF pointF) {
        this(context, pointF, o2Var.getRotation(), o2Var.getScale(), o2Var.f50649r0, o2Var.m0, o2Var.f50645n0);
        if (o2Var.f50647p0) {
            r(false);
        }
    }

    public void q(oi0 oi0Var) {
    }
}
