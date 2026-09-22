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
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.xi0;
import w7.x5;
public class q2 extends j {
    public final TLRPC.Document f41585q0;
    public final Object f41586r0;
    public final int f41587s0;
    public boolean f41588t0;
    public final c6 f41589u0;
    public final jv0 f41590v0;
    public final ai.f0 f41591w0;
    public final ImageReceiver f41592x0;

    public q2(Context context, PointF pointF, float f7, float f10, jv0 jv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f41587s0 = -1;
        int i10 = 0;
        this.f41588t0 = false;
        this.f41592x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f41585q0 = document;
        this.f41590v0 = jv0Var;
        this.f41586r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f41587s0 = tL_maskCoords.f18184n;
                }
            } else {
                i10++;
            }
        }
        ai.f0 f0Var = new ai.f0(this, context);
        this.f41591w0 = f0Var;
        addView(f0Var, x5.c(-1.0f, -1));
        this.f41589u0 = new c6(f0Var, 0L, 500L, qr.h);
        this.f41592x0.setAspectFit(true);
        this.f41592x0.setInvalidateAll(true);
        this.f41592x0.setParentView(f0Var);
        this.f41592x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f41592x0.setDelegate(new k2.v(this, 25));
        k();
    }

    @Override
    public final i a() {
        c2 c2Var = new c2(this, getContext(), 2);
        c2Var.f41319r = new RectF();
        return c2Var;
    }

    public int getAnchor() {
        return this.f41587s0;
    }

    public jv0 getBaseSize() {
        return this.f41590v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f41592x0;
        xi0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.r();
        }
        b6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f41586r0;
    }

    @Override
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new hk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f41585q0;
    }

    @Override
    public final void k() {
        jv0 jv0Var = this.f41590v0;
        setX(getPositionX() - (jv0Var.f25440a / 2.0f));
        setY(getPositionY() - (jv0Var.f25441b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41592x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41592x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        jv0 jv0Var = this.f41590v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) jv0Var.f25440a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) jv0Var.f25441b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f41588t0;
        this.f41588t0 = z11;
        if (!z10) {
            this.f41589u0.f(z11, true);
        }
        this.f41591w0.invalidate();
    }

    public q2(Context context, q2 q2Var, PointF pointF) {
        this(context, pointF, q2Var.getRotation(), q2Var.getScale(), q2Var.f41590v0, q2Var.f41585q0, q2Var.f41586r0);
        if (q2Var.f41588t0) {
            r(false);
        }
    }

    public void q(xi0 xi0Var) {
    }
}
