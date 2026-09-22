package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import ci.nd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.uk0;
import w7.y5;
public final class w2 extends j {
    public final t0 f42012q0;
    public boolean f42013r0;
    public int f42014s0;
    public int f42015t0;
    public final nd f42016u0;

    public w2(Context context, PointF pointF, int i10, nd ndVar, float f7, int i11) {
        super(context, pointF);
        t0 t0Var = new t0(context, f7);
        this.f42012q0 = t0Var;
        t0Var.setMaxWidth(i11);
        t0Var.e(0, this.f42014s0);
        this.f42016u0 = ndVar;
        String str = ndVar.f5103c;
        String a2 = ndVar.a();
        t0Var.d(i10, str);
        t0Var.setText(a2);
        m();
        addView(t0Var, y5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new q0(this, getContext());
    }

    public int getColor() {
        return this.f42014s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
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
        float w10 = rk.w(dp, 2.0f, getPositionX(), scaleX);
        return new uk0(w10, rk.w(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + w10) - w10, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f42012q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f42012q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f42012q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f42012q0.J;
    }

    public int getType() {
        return this.f42015t0;
    }

    public int getTypesCount() {
        return this.f42012q0.getTypesCount() - (!this.f42013r0 ? 1 : 0);
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
        this.f42013r0 = true;
        this.f42014s0 = i10;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f42012q0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.f42012q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f42015t0 = i10;
        this.f42012q0.e(i10, this.f42014s0);
    }
}
