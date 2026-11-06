package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ha;
import fi.sb;
import org.telegram.ui.Components.ki0;
public final class l2 extends j {
    public final m0 f55730q0;
    public boolean f55731r0;
    public int f55732s0;
    public int f55733t0;
    public final sb f55734u0;

    public l2(Context context, PointF pointF, int i7, sb sbVar, float f10, int i10) {
        super(context, pointF);
        m0 m0Var = new m0(context, f10);
        this.f55730q0 = m0Var;
        m0Var.setMaxWidth(i10);
        m0Var.e(0, this.f55732s0);
        this.f55734u0 = sbVar;
        String str = sbVar.f12823c;
        String a10 = sbVar.a();
        m0Var.d(i7, str);
        m0Var.setText(a10);
        m();
        addView(m0Var, ha.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new j0(this, getContext());
    }

    public int getColor() {
        return this.f55732s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new ki0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f55730q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f55730q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f55730q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f55730q0.J;
    }

    public int getType() {
        return this.f55733t0;
    }

    public int getTypesCount() {
        return this.f55730q0.getTypesCount() - (!this.f55731r0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        k();
    }

    public void setColor(int i7) {
        this.f55731r0 = true;
        this.f55732s0 = i7;
    }

    @Override
    public void setIsVideo(boolean z9) {
        this.f55730q0.setIsVideo(true);
    }

    public void setMaxWidth(int i7) {
        this.f55730q0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.f55733t0 = i7;
        this.f55730q0.e(i7, this.f55732s0);
    }
}
