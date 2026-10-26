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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Wallet.p5;
public class q2 extends j {
    public final TLRPC.Document f48474q0;
    public final Object f48475r0;
    public final int f48476s0;
    public boolean f48477t0;
    public final h6 f48478u0;
    public final qw0 f48479v0;
    public final p5 f48480w0;
    public final ImageReceiver f48481x0;

    public q2(Context context, PointF pointF, float f7, float f10, qw0 qw0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f48476s0 = -1;
        int i10 = 0;
        this.f48477t0 = false;
        this.f48481x0 = new ImageReceiver();
        setRotation(f7);
        setScale(f10);
        this.f48474q0 = document;
        this.f48479v0 = qw0Var;
        this.f48475r0 = obj;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f48476s0 = tL_maskCoords.f22102n;
                }
            } else {
                i10++;
            }
        }
        p5 p5Var = new p5(this, context);
        this.f48480w0 = p5Var;
        addView(p5Var, gb1.g(-1.0f, -1));
        this.f48478u0 = new h6(p5Var, 0L, 500L, ds.h);
        this.f48481x0.setAspectFit(true);
        this.f48481x0.setInvalidateAll(true);
        this.f48481x0.setParentView(p5Var);
        this.f48481x0.setImage(ImageLocation.getForDocument(document), (String) null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), (String) null, "webp", obj, 1);
        this.f48481x0.setDelegate(new org.telegram.ui.Components.voip.j1(this, 18));
        k();
    }

    @Override
    public final i a() {
        b2 b2Var = new b2(this, getContext(), 2);
        b2Var.f48163r = new RectF();
        return b2Var;
    }

    public int getAnchor() {
        return this.f48476s0;
    }

    public qw0 getBaseSize() {
        return this.f48479v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f48481x0;
        xj0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        return this.f48475r0;
    }

    @Override
    public hl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new hl0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    public TLRPC.Document getSticker() {
        return this.f48474q0;
    }

    @Override
    public final void k() {
        qw0 qw0Var = this.f48479v0;
        setX(getPositionX() - (qw0Var.f32054a / 2.0f));
        setY(getPositionY() - (qw0Var.f32055b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48481x0.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48481x0.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        qw0 qw0Var = this.f48479v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) qw0Var.f32054a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) qw0Var.f32055b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f48477t0;
        this.f48477t0 = z11;
        if (!z10) {
            this.f48478u0.f(z11, true);
        }
        this.f48480w0.invalidate();
    }

    public q2(Context context, q2 q2Var, PointF pointF) {
        this(context, pointF, q2Var.getRotation(), q2Var.getScale(), q2Var.f48479v0, q2Var.f48474q0, q2Var.f48475r0);
        if (q2Var.f48477t0) {
            r(false);
        }
    }

    public void q(xj0 xj0Var) {
    }
}
