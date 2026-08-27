package zf;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.yj0;

public final class p0 extends j {
    public final n0 m0;

    public int f50655n0;

    public int f50656o0;

    public boolean f50657p0;

    public m0 f50658q0;

    public p0(Context context, PointF pointF, int i10, m0 m0Var, float f10, int i11) {
        super(context, pointF);
        n0 n0Var = new n0(context, f10);
        this.m0 = n0Var;
        n0Var.setMaxWidth(i11);
        this.f50658q0 = m0Var;
        n0Var.b(i10, m0Var, false);
        m();
        this.f50656o0 = 3;
        n0Var.c(3, this.f50655n0);
        addView(n0Var, z5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new o0(this, getContext());
    }

    public int getColor() {
        return this.f50655n0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.f50656o0 + 1;
        return i10 == 4 ? !this.f50657p0 ? 1 : 0 : i10;
    }

    @Override
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float fDp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float fDp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float fT = rl.t(fDp, 2.0f, getPositionX(), scaleX);
        return new yj0(fT, rl.t(fDp2, 2.0f, getPositionY(), scaleX), ((fDp * scaleX) + fT) - fT, fDp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.m0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.m0.f50589f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.m0.f50589f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.m0.h;
    }

    public int getType() {
        return this.f50656o0;
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
        this.f50657p0 = true;
        this.f50655n0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.m0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f50656o0 = i10;
        this.m0.c(i10, this.f50655n0);
    }
}
