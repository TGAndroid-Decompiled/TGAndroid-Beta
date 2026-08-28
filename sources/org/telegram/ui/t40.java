package org.telegram.ui;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
public final class t40 extends org.telegram.ui.ActionBar.h5 {
    public LinearGradient I0;
    public int J0;
    public final Matrix K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public long Q0;
    public final o50 R0;

    public t40(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.R0 = o50Var;
        this.K0 = new Matrix();
        this.L0 = -1.0f;
    }

    @Override
    public final void d(int i9) {
        super.d(i9);
        int textWidth = getTextWidth();
        if (textWidth != this.J0) {
            float f10 = textWidth;
            this.P0 = 1.3f * f10;
            float f11 = f10 * 2.0f;
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23101ih, false);
            int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23137kh, false);
            int i10 = org.telegram.ui.ActionBar.f6.f23119jh;
            this.I0 = new LinearGradient(0.0f, getTextHeight(), f11, 0.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.f6.w0(null, i10, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.I0);
            this.J0 = textWidth;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t40.onDraw(android.graphics.Canvas):void");
    }
}
