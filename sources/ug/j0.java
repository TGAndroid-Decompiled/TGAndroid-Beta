package ug;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import b8.mf;
import org.telegram.ui.Components.ni0;
public final class j0 extends j {
    public final h0 f56093r0;
    public int f56094s0;
    public int f56095t0;
    public boolean f56096u0;
    public g0 f56097v0;

    public j0(Context context, PointF pointF, int i3, g0 g0Var, float f10, int i10) {
        super(context, pointF);
        h0 h0Var = new h0(context, f10);
        this.f56093r0 = h0Var;
        h0Var.setMaxWidth(i10);
        this.f56097v0 = g0Var;
        h0Var.b(i3, g0Var, false);
        m();
        this.f56095t0 = 3;
        h0Var.c(3, this.f56094s0);
        addView(h0Var, mf.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new i0(this, getContext());
    }

    public int getColor() {
        return this.f56094s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i3 = this.f56095t0 + 1;
        if (i3 == 4) {
            return !this.f56096u0 ? 1 : 0;
        }
        return i3;
    }

    @Override
    public ni0 getSelectionBounds() {
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
        return new ni0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f56093r0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f56093r0.f56033f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f56093r0.f56033f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f56093r0.h;
    }

    public int getType() {
        return this.f56095t0;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        k();
    }

    public void setColor(int i3) {
        this.f56096u0 = true;
        this.f56094s0 = i3;
    }

    public void setMaxWidth(int i3) {
        this.f56093r0.setMaxWidth(i3);
    }

    public void setType(int i3) {
        this.f56095t0 = i3;
        this.f56093r0.c(i3, this.f56094s0);
    }
}
