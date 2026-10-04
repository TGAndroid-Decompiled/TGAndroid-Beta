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
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.uk0;
import w7.z5;
public class o2 extends j {
    public final TLRPC.Document f45284q0;
    public final Object f45285r0;
    public final int f45286s0;
    public boolean f45287t0;
    public final e6 f45288u0;
    public final fw0 f45289v0;
    public final ai.f0 f45290w0;
    public final ImageReceiver f45291x0;

    public o2(Context context, PointF pointF, float f7, float f10, fw0 fw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f45286s0 = -1;
        int i10 = 0;
        this.f45287t0 = false;
        this.f45291x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f45284q0 = document;
        this.f45289v0 = fw0Var;
        this.f45285r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f45286s0 = tL_maskCoords.f20117n;
                }
            } else {
                i10++;
            }
        }
        ai.f0 f0Var = new ai.f0(this, context);
        this.f45290w0 = f0Var;
        addView(f0Var, z5.c(-1.0f, -1));
        this.f45288u0 = new e6(f0Var, 0L, 500L, tr.h);
        this.f45291x0.setAspectFit(true);
        this.f45291x0.setInvalidateAll(true);
        this.f45291x0.setParentView(f0Var);
        this.f45291x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f45291x0.setDelegate(new k2.v(this, 27));
        k();
    }

    @Override
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 2);
        z1Var.f45442r = new RectF();
        return z1Var;
    }

    public int getAnchor() {
        return this.f45286s0;
    }

    public fw0 getBaseSize() {
        return this.f45289v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f45291x0;
        kj0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.r();
        }
        d6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f45285r0;
    }

    @Override
    public uk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new uk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f45284q0;
    }

    @Override
    public final void k() {
        fw0 fw0Var = this.f45289v0;
        setX(getPositionX() - (fw0Var.f26590a / 2.0f));
        setY(getPositionY() - (fw0Var.f26591b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45291x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45291x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        fw0 fw0Var = this.f45289v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) fw0Var.f26590a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) fw0Var.f26591b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f45287t0;
        this.f45287t0 = z11;
        if (!z10) {
            this.f45288u0.f(z11, true);
        }
        this.f45290w0.invalidate();
    }

    public o2(Context context, o2 o2Var, PointF pointF) {
        this(context, pointF, o2Var.getRotation(), o2Var.getScale(), o2Var.f45289v0, o2Var.f45284q0, o2Var.f45285r0);
        if (o2Var.f45287t0) {
            r(false);
        }
    }

    public void q(kj0 kj0Var) {
    }
}
