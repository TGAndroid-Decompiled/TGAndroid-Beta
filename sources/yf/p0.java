package yf;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.wj0;
public final class p0 extends j {
    public final n0 m0;
    public int f50060n0;
    public int f50061o0;
    public boolean f50062p0;
    public m0 f50063q0;

    public p0(Context context, PointF pointF, int i9, m0 m0Var, float f10, int i10) {
        super(context, pointF);
        n0 n0Var = new n0(context, f10);
        this.m0 = n0Var;
        n0Var.setMaxWidth(i10);
        this.f50063q0 = m0Var;
        n0Var.b(i9, m0Var, false);
        m();
        this.f50061o0 = 3;
        n0Var.c(3, this.f50060n0);
        addView(n0Var, e6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new o0(this, getContext());
    }

    public int getColor() {
        return this.f50060n0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i9 = this.f50061o0 + 1;
        if (i9 == 4) {
            return !this.f50062p0 ? 1 : 0;
        }
        return i9;
    }

    @Override
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float v = ll.v(dp, 2.0f, getPositionX(), scaleX);
        return new wj0(v, ll.v(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + v) - v, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.m0.h;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.m0.f50016f;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.m0.f50016f;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.m0.h;
    }

    public int getType() {
        return this.f50061o0;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        k();
    }

    public void setColor(int i9) {
        this.f50062p0 = true;
        this.f50060n0 = i9;
    }

    public void setMaxWidth(int i9) {
        this.m0.setMaxWidth(i9);
    }

    public void setType(int i9) {
        this.f50061o0 = i9;
        this.m0.c(i9, this.f50060n0);
    }
}
