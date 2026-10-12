package rg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import di.id;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.yh;
import org.telegram.ui.Components.il0;
import w7.a6;
public final class y2 extends j {
    public final u0 f44627q0;
    public boolean f44628r0;
    public int f44629s0;
    public int f44630t0;
    public final id f44631u0;

    public y2(Context context, PointF pointF, int i10, id idVar, float f7, int i11) {
        super(context, pointF);
        u0 u0Var = new u0(context, f7);
        this.f44627q0 = u0Var;
        u0Var.setMaxWidth(i11);
        u0Var.e(0, this.f44629s0);
        this.f44631u0 = idVar;
        String str = idVar.f7091c;
        String a2 = idVar.a();
        u0Var.d(i10, str);
        u0Var.setText(a2);
        m();
        addView(u0Var, a6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new r0(this, getContext());
    }

    public int getColor() {
        return this.f44629s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
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
        float x10 = yh.x(dp, 2.0f, getPositionX(), scaleX);
        return new il0(x10, yh.x(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + x10) - x10, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f44627q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f44627q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f44627q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f44627q0.J;
    }

    public int getType() {
        return this.f44630t0;
    }

    public int getTypesCount() {
        return this.f44627q0.getTypesCount() - (!this.f44628r0 ? 1 : 0);
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
        this.f44628r0 = true;
        this.f44629s0 = i10;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f44627q0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.f44627q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f44630t0 = i10;
        this.f44627q0.e(i10, this.f44629s0);
    }
}
