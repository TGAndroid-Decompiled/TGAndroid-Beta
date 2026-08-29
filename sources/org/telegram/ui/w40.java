package org.telegram.ui;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
public final class w40 extends org.telegram.ui.ActionBar.h5 {
    public LinearGradient I0;
    public int J0;
    public final Matrix K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public long Q0;
    public final r50 R0;

    public w40(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.R0 = r50Var;
        this.K0 = new Matrix();
        this.L0 = -1.0f;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        int textWidth = getTextWidth();
        if (textWidth != this.J0) {
            float f9 = textWidth;
            this.P0 = 1.3f * f9;
            float f10 = f9 * 2.0f;
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23162ih, false);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23199kh, false);
            int i11 = org.telegram.ui.ActionBar.g6.f23181jh;
            this.I0 = new LinearGradient(0.0f, getTextHeight(), f10, 0.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.I0);
            this.J0 = textWidth;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w40.onDraw(android.graphics.Canvas):void");
    }
}
