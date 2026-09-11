package rg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vl;
import org.telegram.ui.Components.hk0;
import w7.x5;
public final class s0 extends k {
    public final q0 f45477q0;
    public int f45478r0;
    public int f45479s0;
    public boolean f45480t0;
    public p0 f45481u0;

    public s0(Context context, PointF pointF, int i10, p0 p0Var, float f7, int i11) {
        super(context, pointF);
        q0 q0Var = new q0(context, f7);
        this.f45477q0 = q0Var;
        q0Var.setMaxWidth(i11);
        this.f45481u0 = p0Var;
        q0Var.b(i10, p0Var, false);
        m();
        this.f45479s0 = 3;
        q0Var.c(3, this.f45478r0);
        addView(q0Var, x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final j a() {
        return new r0(this, getContext());
    }

    public int getColor() {
        return this.f45478r0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.f45479s0 + 1;
        if (i10 == 4) {
            return !this.f45480t0 ? 1 : 0;
        }
        return i10;
    }

    @Override
    public hk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float u10 = vl.u(dp, 2.0f, getPositionX(), scaleX);
        return new hk0(u10, vl.u(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + u10) - u10, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f45477q0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f45477q0.f45429f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f45477q0.f45429f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f45477q0.h;
    }

    public int getType() {
        return this.f45479s0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public void setColor(int i10) {
        this.f45480t0 = true;
        this.f45478r0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f45477q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f45479s0 = i10;
        this.f45477q0.c(i10, this.f45478r0);
    }
}
