package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ma;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.aj0;
public final class l0 extends j {
    public final j0 f58039r0;
    public int f58040s0;
    public int f58041t0;
    public boolean f58042u0;
    public i0 f58043v0;

    public l0(Context context, PointF pointF, int i7, i0 i0Var, float f10, int i10) {
        super(context, pointF);
        j0 j0Var = new j0(context, f10);
        this.f58039r0 = j0Var;
        j0Var.setMaxWidth(i10);
        this.f58043v0 = i0Var;
        j0Var.b(i7, i0Var, false);
        m();
        this.f58041t0 = 3;
        j0Var.c(3, this.f58040s0);
        addView(j0Var, ma.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new k0(this, getContext());
    }

    public int getColor() {
        return this.f58040s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i7 = this.f58041t0 + 1;
        if (i7 == 4) {
            return !this.f58042u0 ? 1 : 0;
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
        float y10 = o10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, o10.y(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f58039r0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f58039r0.f58007f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f58039r0.f58007f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f58039r0.h;
    }

    public int getType() {
        return this.f58041t0;
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
        this.f58042u0 = true;
        this.f58040s0 = i7;
    }

    public void setMaxWidth(int i7) {
        this.f58039r0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.f58041t0 = i7;
        this.f58039r0.c(i7, this.f58040s0);
    }
}
