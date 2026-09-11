package rg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import di.nd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vl;
import org.telegram.ui.Components.hk0;
import w7.x5;
public final class y2 extends k {
    public final u0 f45574q0;
    public boolean f45575r0;
    public int f45576s0;
    public int f45577t0;
    public final nd f45578u0;

    public y2(Context context, PointF pointF, int i10, nd ndVar, float f7, int i11) {
        super(context, pointF);
        u0 u0Var = new u0(context, f7);
        this.f45574q0 = u0Var;
        u0Var.setMaxWidth(i11);
        u0Var.e(0, this.f45576s0);
        this.f45578u0 = ndVar;
        String str = ndVar.f7706c;
        String a2 = ndVar.a();
        u0Var.d(i10, str);
        u0Var.setText(a2);
        m();
        addView(u0Var, x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final j a() {
        return new r0(this, getContext());
    }

    public int getColor() {
        return this.f45576s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
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
        return this.f45574q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f45574q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f45574q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f45574q0.J;
    }

    public int getType() {
        return this.f45577t0;
    }

    public int getTypesCount() {
        return this.f45574q0.getTypesCount() - (!this.f45575r0 ? 1 : 0);
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
        this.f45575r0 = true;
        this.f45576s0 = i10;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f45574q0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.f45574q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f45577t0 = i10;
        this.f45574q0.e(i10, this.f45576s0);
    }
}
