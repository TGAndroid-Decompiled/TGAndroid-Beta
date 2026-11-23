package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.na;
import hi.kc;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.aj0;
public final class r2 extends n {
    public final r0 f58210s0;
    public boolean f58211t0;
    public int f58212u0;
    public int f58213v0;
    public final kc f58214w0;

    public r2(Context context, PointF pointF, int i7, kc kcVar, float f10, int i10) {
        super(context, pointF);
        r0 r0Var = new r0(context, f10);
        this.f58210s0 = r0Var;
        r0Var.setMaxWidth(i10);
        r0Var.e(0, this.f58212u0);
        this.f58214w0 = kcVar;
        String str = kcVar.f14804c;
        String a10 = kcVar.a();
        r0Var.d(i7, str);
        r0Var.setText(a10);
        m();
        addView(r0Var, na.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final m a() {
        return new o0(this, getContext());
    }

    public int getColor() {
        return this.f58212u0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float y10 = m10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, m10.y(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f58210s0.K;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f58210s0.J;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f58210s0.J;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f58210s0.K;
    }

    public int getType() {
        return this.f58213v0;
    }

    public int getTypesCount() {
        return this.f58210s0.getTypesCount() - (!this.f58211t0 ? 1 : 0);
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
        this.f58211t0 = true;
        this.f58212u0 = i7;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f58210s0.setIsVideo(true);
    }

    public void setMaxWidth(int i7) {
        this.f58210s0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.f58213v0 = i7;
        this.f58210s0.e(i7, this.f58212u0);
    }
}
