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
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xi0;
import w7.x5;
public class q2 extends k {
    public final TLRPC.Document f45458q0;
    public final Object f45459r0;
    public final int f45460s0;
    public boolean f45461t0;
    public final e6 f45462u0;
    public final iv0 f45463v0;
    public final ah.y f45464w0;
    public final ImageReceiver f45465x0;

    public q2(Context context, PointF pointF, float f7, float f10, iv0 iv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f45460s0 = -1;
        int i10 = 0;
        this.f45461t0 = false;
        this.f45465x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f45458q0 = document;
        this.f45463v0 = iv0Var;
        this.f45459r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f45460s0 = tL_maskCoords.f19944n;
                }
            } else {
                i10++;
            }
        }
        ah.y yVar = new ah.y(this, context);
        this.f45464w0 = yVar;
        addView(yVar, x5.c(-1.0f, -1));
        this.f45462u0 = new e6(yVar, 0L, 500L, pr.h);
        this.f45465x0.setAspectFit(true);
        this.f45465x0.setInvalidateAll(true);
        this.f45465x0.setParentView(yVar);
        this.f45465x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f45465x0.setDelegate(new p2(this, 0));
        k();
    }

    @Override
    public final j a() {
        b2 b2Var = new b2(this, getContext(), 2);
        b2Var.f45138r = new RectF();
        return b2Var;
    }

    public int getAnchor() {
        return this.f45460s0;
    }

    public iv0 getBaseSize() {
        return this.f45463v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f45465x0;
        xi0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.p();
        }
        d6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f45459r0;
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
        return this.f45458q0;
    }

    @Override
    public final void k() {
        iv0 iv0Var = this.f45463v0;
        setX(getPositionX() - (iv0Var.f27271a / 2.0f));
        setY(getPositionY() - (iv0Var.f27272b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45465x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45465x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        iv0 iv0Var = this.f45463v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) iv0Var.f27271a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) iv0Var.f27272b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f45461t0;
        this.f45461t0 = z11;
        if (!z10) {
            this.f45462u0.f(z11, true);
        }
        this.f45464w0.invalidate();
    }

    public q2(Context context, q2 q2Var, PointF pointF) {
        this(context, pointF, q2Var.getRotation(), q2Var.getScale(), q2Var.f45463v0, q2Var.f45458q0, q2Var.f45459r0);
        if (q2Var.f45461t0) {
            r(false);
        }
    }

    public void q(xi0 xi0Var) {
    }
}
