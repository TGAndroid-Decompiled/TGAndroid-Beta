package pg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import bi.ld;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.wr;
import w7.a6;
public class o2 extends j {
    public final TLRPC.Document f40239q0;
    public final Object f40240r0;
    public final int f40241s0;
    public boolean f40242t0;
    public final d6 f40243u0;
    public final tv0 f40244v0;
    public final ld f40245w0;
    public final ImageReceiver f40246x0;

    public o2(Context context, PointF pointF, float f7, float f10, tv0 tv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f40241s0 = -1;
        int i10 = 0;
        this.f40242t0 = false;
        this.f40246x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f40239q0 = document;
        this.f40244v0 = tv0Var;
        this.f40240r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f40241s0 = tL_maskCoords.f17270n;
                }
            } else {
                i10++;
            }
        }
        ld ldVar = new ld(this, context);
        this.f40245w0 = ldVar;
        addView(ldVar, a6.c(-1.0f, -1));
        this.f40243u0 = new d6(ldVar, 0L, 500L, wr.h);
        this.f40246x0.setAspectFit(true);
        this.f40246x0.setInvalidateAll(true);
        this.f40246x0.setParentView(ldVar);
        this.f40246x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f40246x0.setDelegate(new org.telegram.tgnet.j(this, 15));
        k();
    }

    @Override
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 2);
        z1Var.f40386r = new RectF();
        return z1Var;
    }

    public int getAnchor() {
        return this.f40241s0;
    }

    public tv0 getBaseSize() {
        return this.f40244v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f40246x0;
        hj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        return this.f40240r0;
    }

    @Override
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new rk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f40239q0;
    }

    @Override
    public final void k() {
        tv0 tv0Var = this.f40244v0;
        setX(getPositionX() - (tv0Var.f27499a / 2.0f));
        setY(getPositionY() - (tv0Var.f27500b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40246x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40246x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        tv0 tv0Var = this.f40244v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) tv0Var.f27499a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) tv0Var.f27500b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f40242t0;
        this.f40242t0 = z11;
        if (!z10) {
            this.f40243u0.f(z11, true);
        }
        this.f40245w0.invalidate();
    }

    public o2(Context context, o2 o2Var, PointF pointF) {
        this(context, pointF, o2Var.getRotation(), o2Var.getScale(), o2Var.f40244v0, o2Var.f40239q0, o2Var.f40240r0);
        if (o2Var.f40242t0) {
            r(false);
        }
    }

    public void q(hj0 hj0Var) {
    }
}
