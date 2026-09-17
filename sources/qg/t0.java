package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.ik0;
import w7.x5;
public final class t0 extends j {
    public final r0 f41674q0;
    public int f41675r0;
    public int f41676s0;
    public boolean f41677t0;
    public q0 f41678u0;

    public t0(Context context, PointF pointF, int i10, q0 q0Var, float f7, int i11) {
        super(context, pointF);
        r0 r0Var = new r0(context, f7);
        this.f41674q0 = r0Var;
        r0Var.setMaxWidth(i11);
        this.f41678u0 = q0Var;
        r0Var.b(i10, q0Var, false);
        m();
        this.f41676s0 = 3;
        r0Var.c(3, this.f41675r0);
        addView(r0Var, x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new s0(this, getContext());
    }

    public int getColor() {
        return this.f41675r0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.f41676s0 + 1;
        if (i10 == 4) {
            return !this.f41677t0 ? 1 : 0;
        }
        return i10;
    }

    @Override
    public ik0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float u10 = wl.u(dp, 2.0f, getPositionX(), scaleX);
        return new ik0(u10, wl.u(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + u10) - u10, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f41674q0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f41674q0.f41630f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f41674q0.f41630f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f41674q0.h;
    }

    public int getType() {
        return this.f41676s0;
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
        this.f41677t0 = true;
        this.f41675r0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f41674q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f41676s0 = i10;
        this.f41674q0.c(i10, this.f41675r0);
    }
}
