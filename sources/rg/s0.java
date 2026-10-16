package rg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.sk;
import org.telegram.ui.Components.il0;
import w7.z5;
public final class s0 extends j {
    public final q0 f44296q0;
    public int f44297r0;
    public int f44298s0;
    public boolean f44299t0;
    public p0 f44300u0;

    public s0(Context context, PointF pointF, int i10, p0 p0Var, float f7, int i11) {
        super(context, pointF);
        q0 q0Var = new q0(context, f7);
        this.f44296q0 = q0Var;
        q0Var.setMaxWidth(i11);
        this.f44300u0 = p0Var;
        q0Var.b(i10, p0Var, false);
        m();
        this.f44298s0 = 3;
        q0Var.c(3, this.f44297r0);
        addView(q0Var, z5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new r0(this, getContext());
    }

    public int getColor() {
        return this.f44297r0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.f44298s0 + 1;
        if (i10 == 4) {
            return !this.f44299t0 ? 1 : 0;
        }
        return i10;
    }

    @Override
    public il0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float y3 = sk.y(dp, 2.0f, getPositionX(), scaleX);
        return new il0(y3, sk.y(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + y3) - y3, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f44296q0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f44296q0.f44247f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f44296q0.f44247f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f44296q0.h;
    }

    public int getType() {
        return this.f44298s0;
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
        this.f44299t0 = true;
        this.f44297r0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f44296q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f44298s0 = i10;
        this.f44296q0.c(i10, this.f44297r0);
    }
}
