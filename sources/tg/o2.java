package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ja;
import hi.pb;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.pi0;
public final class o2 extends j {
    public final m0 f57507r0;
    public boolean f57508s0;
    public int f57509t0;
    public int f57510u0;
    public final pb f57511v0;

    public o2(Context context, PointF pointF, int i7, pb pbVar, float f10, int i10) {
        super(context, pointF);
        m0 m0Var = new m0(context, f10);
        this.f57507r0 = m0Var;
        m0Var.setMaxWidth(i10);
        m0Var.e(0, this.f57509t0);
        this.f57511v0 = pbVar;
        String str = pbVar.f14885c;
        String a10 = pbVar.a();
        m0Var.d(i7, str);
        m0Var.setText(a10);
        m();
        addView(m0Var, ja.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new j0(this, getContext());
    }

    public int getColor() {
        return this.f57509t0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public pi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = i20.x(L, 2.0f, getPositionX(), scaleX);
        return new pi0(x10, i20.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f57507r0.K;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f57507r0.J;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f57507r0.J;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f57507r0.K;
    }

    public int getType() {
        return this.f57510u0;
    }

    public int getTypesCount() {
        return this.f57507r0.getTypesCount() - (!this.f57508s0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        k();
    }

    public void setColor(int i7) {
        this.f57508s0 = true;
        this.f57509t0 = i7;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f57507r0.setIsVideo(true);
    }

    public void setMaxWidth(int i7) {
        this.f57507r0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.f57510u0 = i7;
        this.f57507r0.e(i7, this.f57509t0);
    }
}
