package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.os.SystemClock;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Utilities;

public final class x40 extends org.telegram.ui.ActionBar.h5 {
    public LinearGradient I0;
    public int J0;
    public final Matrix K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public long Q0;
    public final s50 R0;

    public x40(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.R0 = s50Var;
        this.K0 = new Matrix();
        this.L0 = -1.0f;
    }

    @Override
    public final void d(int i10) {
        super.d(i10);
        int textWidth = getTextWidth();
        if (textWidth != this.J0) {
            float f10 = textWidth;
            this.P0 = 1.3f * f10;
            float textHeight = getTextHeight();
            float f11 = f10 * 2.0f;
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23154ih, false);
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23191kh, false);
            int i11 = org.telegram.ui.ActionBar.g6.f23173jh;
            this.I0 = new LinearGradient(0.0f, textHeight, f11, 0.0f, new int[]{iW0, iW1, org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.I0);
            this.J0 = textWidth;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.I0 != null) {
            s50 s50Var = this.R0;
            ChatObject.Call call = s50Var.W0;
            if (call == null || !call.isScheduled()) {
                f10 = 0.0f;
            } else {
                long currentTimeMillis = (((long) s50Var.W0.call.schedule_date) * 1000) - s50Var.d.getConnectionsManager().getCurrentTimeMillis();
                if (currentTimeMillis < 0) {
                    f10 = 1.0f;
                } else if (currentTimeMillis < 5000) {
                    f10 = 1.0f - (currentTimeMillis / 5000.0f);
                } else {
                    f10 = 0.0f;
                }
            }
            Matrix matrix = this.K0;
            matrix.reset();
            matrix.postTranslate((-this.J0) * 0.7f * f10, 0.0f);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.Q0;
            if (j10 > 20) {
                j10 = 17;
            }
            this.Q0 = jElapsedRealtime;
            float f11 = this.N0;
            if (f11 == 0.0f || this.O0 >= f11) {
                this.N0 = Utilities.random.nextInt(200) + 1500;
                this.O0 = 0.0f;
                if (this.L0 == -1.0f) {
                    this.L0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
                }
                this.M0 = this.L0;
                this.L0 = ((Utilities.random.nextInt(100) - 50) * 0.2f) / 50.0f;
            }
            float f12 = j10;
            float fD = com.google.android.recaptcha.internal.a.d(f12 * 0.02f, s50Var.K0, 1.0f * f12, this.O0);
            this.O0 = fD;
            float f13 = this.N0;
            if (fD > f13) {
                this.O0 = f13;
            }
            float interpolation = org.telegram.ui.Components.er.f28123g.getInterpolation(this.O0 / f13);
            float f14 = this.P0;
            float f15 = this.M0;
            matrix.postTranslate(((((this.L0 - f15) * interpolation) + f15) * f14) - (f14 / 2.0f), 0.0f);
            this.I0.setLocalMatrix(matrix);
            invalidate();
        }
        super.onDraw(canvas);
    }
}
