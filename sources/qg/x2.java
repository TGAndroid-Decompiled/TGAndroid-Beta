package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import ci.kd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.nl0;
import w7.x5;
public final class x2 extends j {
    public final s0 f46667q0;
    public boolean f46668r0;
    public int f46669s0;
    public int f46670t0;
    public final kd f46671u0;

    public x2(Context context, PointF pointF, int i10, kd kdVar, float f7, int i11) {
        super(context, pointF);
        s0 s0Var = new s0(context, f7);
        this.f46667q0 = s0Var;
        s0Var.setMaxWidth(i11);
        s0Var.e(0, this.f46669s0);
        this.f46671u0 = kdVar;
        String str = kdVar.f5352c;
        String a2 = kdVar.a();
        s0Var.d(i10, str);
        s0Var.setText(a2);
        m();
        addView(s0Var, x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getColor() {
        return this.f46669s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public nl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float y3 = bi.y(dp, 2.0f, getPositionX(), scaleX);
        return new nl0(y3, bi.y(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + y3) - y3, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f46667q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f46667q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f46667q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f46667q0.J;
    }

    public int getType() {
        return this.f46670t0;
    }

    public int getTypesCount() {
        return this.f46667q0.getTypesCount() - (!this.f46668r0 ? 1 : 0);
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
        this.f46668r0 = true;
        this.f46669s0 = i10;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f46667q0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.f46667q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f46670t0 = i10;
        this.f46667q0.e(i10, this.f46669s0);
    }
}
