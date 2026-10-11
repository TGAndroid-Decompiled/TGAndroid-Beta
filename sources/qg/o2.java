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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.nw0;
import w7.x5;
public class o2 extends j {
    public final TLRPC.Document f46610q0;
    public final Object f46611r0;
    public final int f46612s0;
    public boolean f46613t0;
    public final g6 f46614u0;
    public final nw0 f46615v0;
    public final ai.f0 f46616w0;
    public final ImageReceiver f46617x0;

    public o2(Context context, PointF pointF, float f7, float f10, nw0 nw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f46612s0 = -1;
        int i10 = 0;
        this.f46613t0 = false;
        this.f46617x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f46610q0 = document;
        this.f46615v0 = nw0Var;
        this.f46611r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f46612s0 = tL_maskCoords.f20143n;
                }
            } else {
                i10++;
            }
        }
        ai.f0 f0Var = new ai.f0(this, context);
        this.f46616w0 = f0Var;
        addView(f0Var, x5.d(-1.0f, -1));
        this.f46614u0 = new g6(f0Var, 0L, 500L, is.h);
        this.f46617x0.setAspectFit(true);
        this.f46617x0.setInvalidateAll(true);
        this.f46617x0.setParentView(f0Var);
        this.f46617x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f46617x0.setDelegate(new m4.w(this, 26));
        k();
    }

    @Override
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 2);
        z1Var.f46762r = new RectF();
        return z1Var;
    }

    public int getAnchor() {
        return this.f46612s0;
    }

    public nw0 getBaseSize() {
        return this.f46615v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f46617x0;
        dk0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.r();
        }
        f6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f46611r0;
    }

    @Override
    public nl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new nl0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f46610q0;
    }

    @Override
    public final void k() {
        nw0 nw0Var = this.f46615v0;
        setX(getPositionX() - (nw0Var.f29302a / 2.0f));
        setY(getPositionY() - (nw0Var.f29303b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46617x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46617x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        nw0 nw0Var = this.f46615v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) nw0Var.f29302a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) nw0Var.f29303b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f46613t0;
        this.f46613t0 = z11;
        if (!z10) {
            this.f46614u0.f(z11, true);
        }
        this.f46616w0.invalidate();
    }

    public o2(Context context, o2 o2Var, PointF pointF) {
        this(context, pointF, o2Var.getRotation(), o2Var.getScale(), o2Var.f46615v0, o2Var.f46610q0, o2Var.f46611r0);
        if (o2Var.f46613t0) {
            r(false);
        }
    }

    public void q(dk0 dk0Var) {
    }
}
