package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.sk0;
import w7.y5;
public final class q0 extends j {
    public final o0 f41872q0;
    public int f41873r0;
    public int f41874s0;
    public boolean f41875t0;
    public n0 f41876u0;

    public q0(Context context, PointF pointF, int i10, n0 n0Var, float f7, int i11) {
        super(context, pointF);
        o0 o0Var = new o0(context, f7);
        this.f41872q0 = o0Var;
        o0Var.setMaxWidth(i11);
        this.f41876u0 = n0Var;
        o0Var.b(i10, n0Var, false);
        m();
        this.f41874s0 = 3;
        o0Var.c(3, this.f41873r0);
        addView(o0Var, y5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getColor() {
        return this.f41873r0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.f41874s0 + 1;
        if (i10 == 4) {
            return !this.f41875t0 ? 1 : 0;
        }
        return i10;
    }

    @Override
    public sk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = wh.x(dp, 2.0f, getPositionX(), scaleX);
        return new sk0(x10, wh.x(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + x10) - x10, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f41872q0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f41872q0.f41830f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f41872q0.f41830f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f41872q0.h;
    }

    public int getType() {
        return this.f41874s0;
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
        this.f41875t0 = true;
        this.f41873r0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f41872q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f41874s0 = i10;
        this.f41872q0.c(i10, this.f41873r0);
    }
}
