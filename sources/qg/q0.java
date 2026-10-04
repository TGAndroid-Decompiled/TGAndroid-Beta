package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.uk0;
import w7.z5;
public final class q0 extends j {
    public final o0 f45295q0;
    public int f45296r0;
    public int f45297s0;
    public boolean f45298t0;
    public n0 f45299u0;

    public q0(Context context, PointF pointF, int i10, n0 n0Var, float f7, int i11) {
        super(context, pointF);
        o0 o0Var = new o0(context, f7);
        this.f45295q0 = o0Var;
        o0Var.setMaxWidth(i11);
        this.f45299u0 = n0Var;
        o0Var.b(i10, n0Var, false);
        m();
        this.f45297s0 = 3;
        o0Var.c(3, this.f45296r0);
        addView(o0Var, z5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getColor() {
        return this.f45296r0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.f45297s0 + 1;
        if (i10 == 4) {
            return !this.f45298t0 ? 1 : 0;
        }
        return i10;
    }

    @Override
    public uk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = ok.x(dp, 2.0f, getPositionX(), scaleX);
        return new uk0(x10, ok.x(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + x10) - x10, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f45295q0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f45295q0.f45247f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f45295q0.f45247f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f45295q0.h;
    }

    public int getType() {
        return this.f45297s0;
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
        this.f45298t0 = true;
        this.f45296r0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f45295q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f45297s0 = i10;
        this.f45295q0.c(i10, this.f45296r0);
    }
}
