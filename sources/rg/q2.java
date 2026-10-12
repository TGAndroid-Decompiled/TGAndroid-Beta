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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.yj0;
import w7.a6;
public class q2 extends j {
    public final TLRPC.Document f44516q0;
    public final Object f44517r0;
    public final int f44518s0;
    public boolean f44519t0;
    public final g6 f44520u0;
    public final iw0 f44521v0;
    public final ah.x f44522w0;
    public final ImageReceiver f44523x0;

    public q2(Context context, PointF pointF, float f7, float f10, iw0 iw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f44518s0 = -1;
        int i10 = 0;
        this.f44519t0 = false;
        this.f44523x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f44516q0 = document;
        this.f44521v0 = iw0Var;
        this.f44517r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f44518s0 = tL_maskCoords.f19291n;
                }
            } else {
                i10++;
            }
        }
        ah.x xVar = new ah.x(this, context);
        this.f44522w0 = xVar;
        addView(xVar, a6.d(-1.0f, -1));
        this.f44520u0 = new g6(xVar, 0L, 500L, es.h);
        this.f44523x0.setAspectFit(true);
        this.f44523x0.setInvalidateAll(true);
        this.f44523x0.setParentView(xVar);
        this.f44523x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f44523x0.setDelegate(new b0(this, 5));
        k();
    }

    @Override
    public final i a() {
        b2 b2Var = new b2(this, getContext(), 2);
        b2Var.f44211r = new RectF();
        return b2Var;
    }

    public int getAnchor() {
        return this.f44518s0;
    }

    public iw0 getBaseSize() {
        return this.f44521v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f44523x0;
        yj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        return this.f44517r0;
    }

    @Override
    public il0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new il0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f44516q0;
    }

    @Override
    public final void k() {
        iw0 iw0Var = this.f44521v0;
        setX(getPositionX() - (iw0Var.f26116a / 2.0f));
        setY(getPositionY() - (iw0Var.f26117b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44523x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44523x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        iw0 iw0Var = this.f44521v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) iw0Var.f26116a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) iw0Var.f26117b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f44519t0;
        this.f44519t0 = z11;
        if (!z10) {
            this.f44520u0.f(z11, true);
        }
        this.f44522w0.invalidate();
    }

    public q2(Context context, q2 q2Var, PointF pointF) {
        this(context, pointF, q2Var.getRotation(), q2Var.getScale(), q2Var.f44521v0, q2Var.f44516q0, q2Var.f44517r0);
        if (q2Var.f44519t0) {
            r(false);
        }
    }

    public void q(yj0 yj0Var) {
    }
}
