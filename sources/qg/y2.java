package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import ci.nd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.ik0;
import w7.x5;
public final class y2 extends j {
    public final v0 f41739q0;
    public boolean f41740r0;
    public int f41741s0;
    public int f41742t0;
    public final nd f41743u0;

    public y2(Context context, PointF pointF, int i10, nd ndVar, float f7, int i11) {
        super(context, pointF);
        v0 v0Var = new v0(context, f7);
        this.f41739q0 = v0Var;
        v0Var.setMaxWidth(i11);
        v0Var.e(0, this.f41741s0);
        this.f41743u0 = ndVar;
        String str = ndVar.f5104c;
        String a2 = ndVar.a();
        v0Var.d(i10, str);
        v0Var.setText(a2);
        m();
        addView(v0Var, x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new s0(this, getContext());
    }

    public int getColor() {
        return this.f41741s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
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
        return this.f41739q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f41739q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f41739q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f41739q0.J;
    }

    public int getType() {
        return this.f41742t0;
    }

    public int getTypesCount() {
        return this.f41739q0.getTypesCount() - (!this.f41740r0 ? 1 : 0);
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
        this.f41740r0 = true;
        this.f41741s0 = i10;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f41739q0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.f41739q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f41742t0 = i10;
        this.f41739q0.e(i10, this.f41741s0);
    }
}
