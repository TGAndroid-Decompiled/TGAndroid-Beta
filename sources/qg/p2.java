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
public class p2 extends j {
    public final TLRPC.Document f46552q0;
    public final Object f46553r0;
    public final int f46554s0;
    public boolean f46555t0;
    public final g6 f46556u0;
    public final nw0 f46557v0;
    public final ai.f0 f46558w0;
    public final ImageReceiver f46559x0;

    public p2(Context context, PointF pointF, float f7, float f10, nw0 nw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f46554s0 = -1;
        int i10 = 0;
        this.f46555t0 = false;
        this.f46559x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f46552q0 = document;
        this.f46557v0 = nw0Var;
        this.f46553r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f46554s0 = tL_maskCoords.f20117n;
                }
            } else {
                i10++;
            }
        }
        ai.f0 f0Var = new ai.f0(this, context);
        this.f46558w0 = f0Var;
        addView(f0Var, x5.d(-1.0f, -1));
        this.f46556u0 = new g6(f0Var, 0L, 500L, is.h);
        this.f46559x0.setAspectFit(true);
        this.f46559x0.setInvalidateAll(true);
        this.f46559x0.setParentView(f0Var);
        this.f46559x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f46559x0.setDelegate(new m4.w(this, 26));
        k();
    }

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 2);
        a2Var.f46224r = new RectF();
        return a2Var;
    }

    public int getAnchor() {
        return this.f46554s0;
    }

    public nw0 getBaseSize() {
        return this.f46557v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f46559x0;
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
        return this.f46553r0;
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
        return this.f46552q0;
    }

    @Override
    public final void k() {
        nw0 nw0Var = this.f46557v0;
        setX(getPositionX() - (nw0Var.f29260a / 2.0f));
        setY(getPositionY() - (nw0Var.f29261b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46559x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46559x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        nw0 nw0Var = this.f46557v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) nw0Var.f29260a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) nw0Var.f29261b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f46555t0;
        this.f46555t0 = z11;
        if (!z10) {
            this.f46556u0.f(z11, true);
        }
        this.f46558w0.invalidate();
    }

    public p2(Context context, p2 p2Var, PointF pointF) {
        this(context, pointF, p2Var.getRotation(), p2Var.getScale(), p2Var.f46557v0, p2Var.f46552q0, p2Var.f46553r0);
        if (p2Var.f46555t0) {
            r(false);
        }
    }

    public void q(dk0 dk0Var) {
    }
}
