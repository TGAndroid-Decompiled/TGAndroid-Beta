package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import ci.jd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.qk;
import org.telegram.ui.Components.uk0;
import w7.y5;
public final class w2 extends j {
    public final s0 f42024q0;
    public boolean f42025r0;
    public int f42026s0;
    public int f42027t0;
    public final jd f42028u0;

    public w2(Context context, PointF pointF, int i10, jd jdVar, float f7, int i11) {
        super(context, pointF);
        s0 s0Var = new s0(context, f7);
        this.f42024q0 = s0Var;
        s0Var.setMaxWidth(i11);
        s0Var.e(0, this.f42026s0);
        this.f42028u0 = jdVar;
        String str = jdVar.f4892c;
        String a2 = jdVar.a();
        s0Var.d(i10, str);
        s0Var.setText(a2);
        m();
        addView(s0Var, y5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getColor() {
        return this.f42026s0;
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
        float w10 = qk.w(dp, 2.0f, getPositionX(), scaleX);
        return new uk0(w10, qk.w(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + w10) - w10, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f42024q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f42024q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f42024q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f42024q0.J;
    }

    public int getType() {
        return this.f42027t0;
    }

    public int getTypesCount() {
        return this.f42024q0.getTypesCount() - (!this.f42025r0 ? 1 : 0);
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
        this.f42025r0 = true;
        this.f42026s0 = i10;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f42024q0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.f42024q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f42027t0 = i10;
        this.f42024q0.e(i10, this.f42026s0);
    }
}
