package sg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import fi.pc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.kb1;
public final class x2 extends j {
    public final s0 f48615q0;
    public boolean f48616r0;
    public int f48617s0;
    public int f48618t0;
    public final pc f48619u0;

    public x2(Context context, PointF pointF, int i10, pc pcVar, float f7, int i11) {
        super(context, pointF);
        s0 s0Var = new s0(context, f7);
        this.f48615q0 = s0Var;
        s0Var.setMaxWidth(i11);
        s0Var.e(0, this.f48617s0);
        this.f48619u0 = pcVar;
        String str = pcVar.f11454c;
        String a2 = pcVar.a();
        s0Var.d(i10, str);
        s0Var.setText(a2);
        m();
        addView(s0Var, kb1.i(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getColor() {
        return this.f48617s0;
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
        float y3 = wh.y(dp, 2.0f, getPositionX(), scaleX);
        return new il0(y3, wh.y(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + y3) - y3, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f48615q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f48615q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f48615q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f48615q0.J;
    }

    public int getType() {
        return this.f48618t0;
    }

    public int getTypesCount() {
        return this.f48615q0.getTypesCount() - (!this.f48616r0 ? 1 : 0);
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
        this.f48616r0 = true;
        this.f48617s0 = i10;
    }

    @Override
    public void setIsVideo(boolean z10) {
        this.f48615q0.setIsVideo(true);
    }

    public void setMaxWidth(int i10) {
        this.f48615q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f48618t0 = i10;
        this.f48615q0.e(i10, this.f48617s0);
    }
}
