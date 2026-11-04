package ug;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import b8.mf;
import gi.sb;
import org.telegram.ui.Components.ni0;
public final class m2 extends j {
    public final l0 f56160r0;
    public boolean f56161s0;
    public int f56162t0;
    public int f56163u0;
    public final sb f56164v0;

    public m2(Context context, PointF pointF, int i3, sb sbVar, float f10, int i10) {
        super(context, pointF);
        l0 l0Var = new l0(context, f10);
        this.f56160r0 = l0Var;
        l0Var.setMaxWidth(i10);
        l0Var.e(0, this.f56162t0);
        this.f56164v0 = sbVar;
        String str = sbVar.f13584c;
        String a10 = sbVar.a();
        l0Var.d(i3, str);
        l0Var.setText(a10);
        m();
        addView(l0Var, mf.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new i0(this, getContext());
    }

    public int getColor() {
        return this.f56162t0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new ni0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f56160r0.K;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f56160r0.J;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f56160r0.J;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f56160r0.K;
    }

    public int getType() {
        return this.f56163u0;
    }

    public int getTypesCount() {
        return this.f56160r0.getTypesCount() - (!this.f56161s0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        k();
    }

    public void setColor(int i3) {
        this.f56161s0 = true;
        this.f56162t0 = i3;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f56160r0.setIsVideo(true);
    }

    public void setMaxWidth(int i3) {
        this.f56160r0.setMaxWidth(i3);
    }

    public void setType(int i3) {
        this.f56163u0 = i3;
        this.f56160r0.e(i3, this.f56162t0);
    }
}
