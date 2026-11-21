package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ma;
import hi.pb;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.aj0;
public final class o2 extends j {
    public final n0 f58102r0;
    public boolean f58103s0;
    public int f58104t0;
    public int f58105u0;
    public final pb f58106v0;

    public o2(Context context, PointF pointF, int i7, pb pbVar, float f10, int i10) {
        super(context, pointF);
        n0 n0Var = new n0(context, f10);
        this.f58102r0 = n0Var;
        n0Var.setMaxWidth(i10);
        n0Var.e(0, this.f58104t0);
        this.f58106v0 = pbVar;
        String str = pbVar.f15283c;
        String a10 = pbVar.a();
        n0Var.d(i7, str);
        n0Var.setText(a10);
        m();
        addView(n0Var, ma.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new k0(this, getContext());
    }

    public int getColor() {
        return this.f58104t0;
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
        float y10 = n10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, n10.y(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f58102r0.K;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f58102r0.J;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f58102r0.J;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f58102r0.K;
    }

    public int getType() {
        return this.f58105u0;
    }

    public int getTypesCount() {
        return this.f58102r0.getTypesCount() - (!this.f58103s0 ? 1 : 0);
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
        this.f58103s0 = true;
        this.f58104t0 = i7;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f58102r0.setIsVideo(true);
    }

    public void setMaxWidth(int i7) {
        this.f58102r0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.f58105u0 = i7;
        this.f58102r0.e(i7, this.f58104t0);
    }
}
