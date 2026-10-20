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
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.vj0;
import w7.z5;
public class o2 extends j {
    public final TLRPC.Document f45589q0;
    public final Object f45590r0;
    public final int f45591s0;
    public boolean f45592t0;
    public final f6 f45593u0;
    public final fw0 f45594v0;
    public final x1 f45595w0;
    public final ImageReceiver f45596x0;

    public o2(Context context, PointF pointF, float f7, float f10, fw0 fw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f45591s0 = -1;
        int i10 = 0;
        this.f45592t0 = false;
        this.f45596x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f45589q0 = document;
        this.f45594v0 = fw0Var;
        this.f45590r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f45591s0 = tL_maskCoords.f20351n;
                }
            } else {
                i10++;
            }
        }
        x1 x1Var = new x1(this, context);
        this.f45595w0 = x1Var;
        addView(x1Var, z5.c(-1.0f, -1));
        this.f45593u0 = new f6(x1Var, 0L, 500L, bs.h);
        this.f45596x0.setAspectFit(true);
        this.f45596x0.setInvalidateAll(true);
        this.f45596x0.setParentView(x1Var);
        this.f45596x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f45596x0.setDelegate(new qg.h0(this, 14));
        k();
    }

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 2);
        a2Var.f45286r = new RectF();
        return a2Var;
    }

    public int getAnchor() {
        return this.f45591s0;
    }

    public fw0 getBaseSize() {
        return this.f45594v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f45596x0;
        vj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        return this.f45590r0;
    }

    @Override
    public fl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new fl0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f45589q0;
    }

    @Override
    public final void k() {
        fw0 fw0Var = this.f45594v0;
        setX(getPositionX() - (fw0Var.f26428a / 2.0f));
        setY(getPositionY() - (fw0Var.f26429b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45596x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45596x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        fw0 fw0Var = this.f45594v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) fw0Var.f26428a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) fw0Var.f26429b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f45592t0;
        this.f45592t0 = z11;
        if (!z10) {
            this.f45593u0.f(z11, true);
        }
        this.f45595w0.invalidate();
    }

    public o2(Context context, o2 o2Var, PointF pointF) {
        this(context, pointF, o2Var.getRotation(), o2Var.getScale(), o2Var.f45594v0, o2Var.f45589q0, o2Var.f45590r0);
        if (o2Var.f45592t0) {
            r(false);
        }
    }

    public void q(vj0 vj0Var) {
    }
}
