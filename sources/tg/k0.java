package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ha;
import org.telegram.ui.Components.ki0;
public final class k0 extends j {
    public final i0 f55811q0;
    public int f55812r0;
    public int f55813s0;
    public boolean f55814t0;
    public h0 f55815u0;

    public k0(Context context, PointF pointF, int i7, h0 h0Var, float f10, int i10) {
        super(context, pointF);
        i0 i0Var = new i0(context, f10);
        this.f55811q0 = i0Var;
        i0Var.setMaxWidth(i10);
        this.f55815u0 = h0Var;
        i0Var.b(i7, h0Var, false);
        m();
        this.f55813s0 = 3;
        i0Var.c(3, this.f55812r0);
        addView(i0Var, ha.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new j0(this, getContext());
    }

    public int getColor() {
        return this.f55812r0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i7 = this.f55813s0 + 1;
        if (i7 == 4) {
            return !this.f55814t0 ? 1 : 0;
        }
        return i7;
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
        return this.f55811q0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f55811q0.f55747f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f55811q0.f55747f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f55811q0.h;
    }

    public int getType() {
        return this.f55813s0;
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
        this.f55814t0 = true;
        this.f55812r0 = i7;
    }

    public void setMaxWidth(int i7) {
        this.f55811q0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.f55813s0 = i7;
        this.f55811q0.c(i7, this.f55812r0);
    }
}
