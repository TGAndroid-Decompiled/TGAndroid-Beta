package sg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Wallet.p5;
public class p2 extends j {
    public final TLRPC.Document f48501q0;
    public final Object f48502r0;
    public final int f48503s0;
    public boolean f48504t0;
    public final h6 f48505u0;
    public final rw0 f48506v0;
    public final p5 f48507w0;
    public final ImageReceiver f48508x0;

    public p2(Context context, PointF pointF, float f7, float f10, rw0 rw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f48503s0 = -1;
        int i10 = 0;
        this.f48504t0 = false;
        this.f48508x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f48501q0 = document;
        this.f48506v0 = rw0Var;
        this.f48502r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f48503s0 = tL_maskCoords.f22103n;
                }
            } else {
                i10++;
            }
        }
        p5 p5Var = new p5(this, context);
        this.f48507w0 = p5Var;
        addView(p5Var, kb1.g(-1.0f, -1));
        this.f48505u0 = new h6(p5Var, 0L, 500L, ds.h);
        this.f48508x0.setAspectFit(true);
        this.f48508x0.setInvalidateAll(true);
        this.f48508x0.setParentView(p5Var);
        this.f48508x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f48508x0.setDelegate(new org.telegram.ui.Components.voip.j1(this, 18));
        k();
    }

    @Override
    public final i a() {
        a2 a2Var = new a2(this, getContext(), 2);
        a2Var.f48182r = new RectF();
        return a2Var;
    }

    public int getAnchor() {
        return this.f48503s0;
    }

    public rw0 getBaseSize() {
        return this.f48506v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f48508x0;
        yj0 lottieAnimation = imageReceiver.getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.r();
        }
        g6 animation = imageReceiver.getAnimation();
        if (animation != null) {
            return animation.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f48502r0;
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
        return this.f48501q0;
    }

    @Override
    public final void k() {
        rw0 rw0Var = this.f48506v0;
        setX(getPositionX() - (rw0Var.f32392a / 2.0f));
        setY(getPositionY() - (rw0Var.f32393b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48508x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48508x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        rw0 rw0Var = this.f48506v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) rw0Var.f32392a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) rw0Var.f32393b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f48504t0;
        this.f48504t0 = z11;
        if (!z10) {
            this.f48505u0.f(z11, true);
        }
        this.f48507w0.invalidate();
    }

    public p2(Context context, p2 p2Var, PointF pointF) {
        this(context, pointF, p2Var.getRotation(), p2Var.getScale(), p2Var.f48506v0, p2Var.f48501q0, p2Var.f48502r0);
        if (p2Var.f48504t0) {
            r(false);
        }
    }

    public void q(yj0 yj0Var) {
    }
}
