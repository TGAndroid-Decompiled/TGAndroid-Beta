package zf;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import h7.z5;
import lh.pc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.yj0;

public final class w2 extends j {
    public final r0 m0;

    public boolean f50757n0;

    public int f50758o0;

    public int f50759p0;

    public final pc f50760q0;

    public w2(Context context, PointF pointF, int i10, pc pcVar, float f10, int i11) {
        super(context, pointF);
        r0 r0Var = new r0(context, f10);
        this.m0 = r0Var;
        r0Var.setMaxWidth(i11);
        r0Var.e(0, this.f50758o0);
        this.f50760q0 = pcVar;
        String str = pcVar.f16550c;
        String strA = pcVar.a();
        r0Var.d(i10, str);
        r0Var.setText(strA);
        m();
        addView(r0Var, z5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new o0(this, getContext());
    }

    public int getColor() {
        return this.f50758o0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float fDp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float fDp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float fT = rl.t(fDp, 2.0f, getPositionX(), scaleX);
        return new yj0(fT, rl.t(fDp2, 2.0f, getPositionY(), scaleX), ((fDp * scaleX) + fT) - fT, fDp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.m0.F;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.m0.E;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.m0.E;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.m0.F;
    }

    public int getType() {
        return this.f50759p0;
    }

    public int getTypesCount() {
        return this.m0.getTypesCount() - (!this.f50757n0 ? 1 : 0);
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
        this.f50757n0 = true;
        this.f50758o0 = i10;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.m0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.m0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f50759p0 = i10;
        this.m0.e(i10, this.f50758o0);
    }
}
