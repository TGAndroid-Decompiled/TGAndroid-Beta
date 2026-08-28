package yf;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import g7.e6;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.y5;
public class n2 extends j {
    public final TLRPC.Document m0;
    public final Object f50034n0;
    public final int f50035o0;
    public boolean f50036p0;
    public final y5 f50037q0;
    public final qu0 f50038r0;
    public final fh.d2 f50039s0;
    public final ImageReceiver f50040t0;

    public n2(Context context, PointF pointF, float f10, float f11, qu0 qu0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f50035o0 = -1;
        int i9 = 0;
        this.f50036p0 = false;
        this.f50040t0 = new ImageReceiver();
        setRotation(f10);
        setScale(f11);
        this.m0 = document;
        this.f50038r0 = qu0Var;
        this.f50034n0 = obj;
        while (true) {
            if (i9 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i9);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f50035o0 = tL_maskCoords.f22455n;
                }
            } else {
                i9++;
            }
        }
        fh.d2 d2Var = new fh.d2(this, context);
        this.f50039s0 = d2Var;
        addView(d2Var, e6.c(-1.0f, -1));
        this.f50037q0 = new y5(d2Var, 0L, 500L, gr.h);
        this.f50040t0.setAspectFit(true);
        this.f50040t0.setInvalidateAll(true);
        this.f50040t0.setParentView(d2Var);
        this.f50040t0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f50040t0.setDelegate(new t0.c(this, 15));
        k();
    }

    @Override
    public final i a() {
        z1 z1Var = new z1(this, getContext(), 2);
        z1Var.f50198r = new RectF();
        return z1Var;
    }

    public int getAnchor() {
        return this.f50035o0;
    }

    public qu0 getBaseSize() {
        return this.f50038r0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f50040t0;
        mi0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        return this.f50034n0;
    }

    @Override
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new wj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.m0;
    }

    @Override
    public final void k() {
        qu0 qu0Var = this.f50038r0;
        setX(getPositionX() - (qu0Var.f32026a / 2.0f));
        setY(getPositionY() - (qu0Var.f32027b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50040t0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50040t0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        qu0 qu0Var = this.f50038r0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) qu0Var.f32026a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) qu0Var.f32027b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f50036p0;
        this.f50036p0 = z11;
        if (!z10) {
            this.f50037q0.f(z11, true);
        }
        this.f50039s0.invalidate();
    }

    public n2(Context context, n2 n2Var, PointF pointF) {
        this(context, pointF, n2Var.getRotation(), n2Var.getScale(), n2Var.f50038r0, n2Var.m0, n2Var.f50034n0);
        if (n2Var.f50036p0) {
            r(false);
        }
    }

    public void q(mi0 mi0Var) {
    }
}
