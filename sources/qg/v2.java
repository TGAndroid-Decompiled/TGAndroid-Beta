package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import ci.nd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.sk0;
import w7.y5;
public final class v2 extends j {
    public final s0 f41943q0;
    public boolean f41944r0;
    public int f41945s0;
    public int f41946t0;
    public final nd f41947u0;

    public v2(Context context, PointF pointF, int i10, nd ndVar, float f7, int i11) {
        super(context, pointF);
        s0 s0Var = new s0(context, f7);
        this.f41943q0 = s0Var;
        s0Var.setMaxWidth(i11);
        s0Var.e(0, this.f41945s0);
        this.f41947u0 = ndVar;
        String str = ndVar.f5104c;
        String a2 = ndVar.a();
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
        return this.f41945s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
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
        return this.f41943q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f41943q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f41943q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f41943q0.J;
    }

    public int getType() {
        return this.f41946t0;
    }

    public int getTypesCount() {
        return this.f41943q0.getTypesCount() - (!this.f41944r0 ? 1 : 0);
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
        this.f41944r0 = true;
        this.f41945s0 = i10;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f41943q0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.f41943q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f41946t0 = i10;
        this.f41943q0.e(i10, this.f41945s0);
    }
}
