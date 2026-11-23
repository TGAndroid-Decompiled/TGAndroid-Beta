package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.na;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.aj0;
public final class p0 extends n {
    public final n0 f58164s0;
    public int f58165t0;
    public int f58166u0;
    public boolean f58167v0;
    public m0 f58168w0;

    public p0(Context context, PointF pointF, int i7, m0 m0Var, float f10, int i10) {
        super(context, pointF);
        n0 n0Var = new n0(context, f10);
        this.f58164s0 = n0Var;
        n0Var.setMaxWidth(i10);
        this.f58168w0 = m0Var;
        n0Var.b(i7, m0Var, false);
        m();
        this.f58166u0 = 3;
        n0Var.c(3, this.f58165t0);
        addView(n0Var, na.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final m a() {
        return new o0(this, getContext());
    }

    public int getColor() {
        return this.f58165t0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i7 = this.f58166u0 + 1;
        if (i7 == 4) {
            return !this.f58167v0 ? 1 : 0;
        }
        return i7;
    }

    @Override
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float y10 = m10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, m10.y(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f58164s0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f58164s0.f58123f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f58164s0.f58123f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f58164s0.h;
    }

    public int getType() {
        return this.f58166u0;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        k();
    }

    public void setColor(int i7) {
        this.f58167v0 = true;
        this.f58165t0 = i7;
    }

    public void setMaxWidth(int i7) {
        this.f58164s0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.f58166u0 = i7;
        this.f58164s0.c(i7, this.f58165t0);
    }
}
