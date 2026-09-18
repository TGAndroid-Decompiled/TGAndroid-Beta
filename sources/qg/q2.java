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
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yi0;
import w7.x5;
public class q2 extends j {
    public final TLRPC.Document f41616q0;
    public final Object f41617r0;
    public final int f41618s0;
    public boolean f41619t0;
    public final c6 f41620u0;
    public final kv0 f41621v0;
    public final ai.f0 f41622w0;
    public final ImageReceiver f41623x0;

    public q2(Context context, PointF pointF, float f7, float f10, kv0 kv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f41618s0 = -1;
        int i10 = 0;
        this.f41619t0 = false;
        this.f41623x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f41616q0 = document;
        this.f41621v0 = kv0Var;
        this.f41617r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f41618s0 = tL_maskCoords.f18196n;
                }
            } else {
                i10++;
            }
        }
        ai.f0 f0Var = new ai.f0(this, context);
        this.f41622w0 = f0Var;
        addView(f0Var, x5.c(-1.0f, -1));
        this.f41620u0 = new c6(f0Var, 0L, 500L, qr.h);
        this.f41623x0.setAspectFit(true);
        this.f41623x0.setInvalidateAll(true);
        this.f41623x0.setParentView(f0Var);
        this.f41623x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f41623x0.setDelegate(new k2.v(this, 26));
        k();
    }

    @Override
    public final i a() {
        c2 c2Var = new c2(this, getContext(), 2);
        c2Var.f41350r = new RectF();
        return c2Var;
    }

    public int getAnchor() {
        return this.f41618s0;
    }

    public kv0 getBaseSize() {
        return this.f41621v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f41623x0;
        yi0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        return this.f41617r0;
    }

    @Override
    public ik0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new ik0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f41616q0;
    }

    @Override
    public final void k() {
        kv0 kv0Var = this.f41621v0;
        setX(getPositionX() - (kv0Var.f25698a / 2.0f));
        setY(getPositionY() - (kv0Var.f25699b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41623x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41623x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        kv0 kv0Var = this.f41621v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) kv0Var.f25698a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) kv0Var.f25699b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f41619t0;
        this.f41619t0 = z11;
        if (!z10) {
            this.f41620u0.f(z11, true);
        }
        this.f41622w0.invalidate();
    }

    public q2(Context context, q2 q2Var, PointF pointF) {
        this(context, pointF, q2Var.getRotation(), q2Var.getScale(), q2Var.f41621v0, q2Var.f41616q0, q2Var.f41617r0);
        if (q2Var.f41619t0) {
            r(false);
        }
    }

    public void q(yi0 yi0Var) {
    }
}
