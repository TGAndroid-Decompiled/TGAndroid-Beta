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
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vv0;
import w7.y5;
public class o2 extends j {
    public final TLRPC.Document f41844q0;
    public final Object f41845r0;
    public final int f41846s0;
    public boolean f41847t0;
    public final e6 f41848u0;
    public final vv0 f41849v0;
    public final ai.f0 f41850w0;
    public final ImageReceiver f41851x0;

    public o2(Context context, PointF pointF, float f7, float f10, vv0 vv0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f41846s0 = -1;
        int i10 = 0;
        this.f41847t0 = false;
        this.f41851x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f41844q0 = document;
        this.f41849v0 = vv0Var;
        this.f41845r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f41846s0 = tL_maskCoords.f18410n;
                }
            } else {
                i10++;
            }
        }
        ai.f0 f0Var = new ai.f0(this, context);
        this.f41850w0 = f0Var;
        addView(f0Var, y5.c(-1.0f, -1));
        this.f41848u0 = new e6(f0Var, 0L, 500L, sr.h);
        this.f41851x0.setAspectFit(true);
        this.f41851x0.setInvalidateAll(true);
        this.f41851x0.setParentView(f0Var);
        this.f41851x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f41851x0.setDelegate(new le.b(this, 26));
        k();
    }

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 2);
        a2Var.f41573r = new RectF();
        return a2Var;
    }

    public int getAnchor() {
        return this.f41846s0;
    }

    public vv0 getBaseSize() {
        return this.f41849v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f41851x0;
        jj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        return this.f41845r0;
    }

    @Override
    public tk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new tk0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f41844q0;
    }

    @Override
    public final void k() {
        vv0 vv0Var = this.f41849v0;
        setX(getPositionX() - (vv0Var.f29774a / 2.0f));
        setY(getPositionY() - (vv0Var.f29775b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41851x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41851x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        vv0 vv0Var = this.f41849v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) vv0Var.f29774a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) vv0Var.f29775b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f41847t0;
        this.f41847t0 = z11;
        if (!z10) {
            this.f41848u0.f(z11, true);
        }
        this.f41850w0.invalidate();
    }

    public o2(Context context, o2 o2Var, PointF pointF) {
        this(context, pointF, o2Var.getRotation(), o2Var.getScale(), o2Var.f41849v0, o2Var.f41844q0, o2Var.f41845r0);
        if (o2Var.f41847t0) {
            r(false);
        }
    }

    public void q(jj0 jj0Var) {
    }
}
