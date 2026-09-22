package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadialProgress2;
public final class wi1 implements di0 {
    public final org.telegram.ui.Cells.u1 f39188a;
    public final org.telegram.ui.Components.yl0 f39189b;
    public final float f39190c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f39191f;
    public final ChatActivityEnterView.RecordCircle f39192g;
    public final int h;
    public final org.telegram.ui.Components.ui f39193i;
    public final org.telegram.ui.ActionBar.f6 f39194j;
    public float f39195k;
    public float f39196l;

    public wi1(org.telegram.ui.Cells.u1 u1Var, mk mkVar, org.telegram.ui.Components.yl0 yl0Var, org.telegram.ui.Components.ui uiVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f39194j = f6Var;
        this.f39188a = u1Var;
        this.f39193i = uiVar;
        this.f39189b = yl0Var;
        u1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = mkVar.getRecordCircle();
        this.f39192g = recordCircle;
        if (recordCircle != null) {
            this.f39190c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = u1Var.getMessageObject().stableId;
        ((ArrayList) uiVar.f28786c).add(this);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39191f = ofFloat;
        ofFloat.addUpdateListener(new ai.x(25, this, uiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new vi1(this, u1Var, uiVar));
        if (u1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.xo0 seekBarWaveform = u1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f30370n;
            if (u1Var2 != null) {
                u1Var2.invalidate();
            }
        }
    }

    @Override
    public final void a(final Canvas canvas) {
        float f7;
        float x10;
        final float y3;
        float y10;
        float x11;
        float f10;
        float f11;
        final float f12 = this.d;
        if (f12 > 0.6f) {
            f7 = 1.0f;
        } else {
            f7 = f12 / 0.6f;
        }
        ChatActivityEnterView.RecordCircle recordCircle = this.f39192g;
        org.telegram.ui.Components.ui uiVar = this.f39193i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.J) - uiVar.getX();
        }
        if (recordCircle == null) {
            y3 = 0.0f;
        } else {
            y3 = (recordCircle.getY() + recordCircle.K) - uiVar.getY();
        }
        org.telegram.ui.Cells.u1 u1Var = this.f39188a;
        int i10 = u1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.yl0 yl0Var = this.f39189b;
        if (i10 != i11) {
            x11 = this.f39195k;
            y10 = this.f39196l;
        } else {
            y10 = (yl0Var.getY() + (u1Var.getY() + u1Var.getRadialProgress().f22362a.centerY())) - uiVar.getY();
            x11 = (yl0Var.getX() + (u1Var.getX() + u1Var.getRadialProgress().f22362a.centerX())) - uiVar.getX();
        }
        this.f39195k = x11;
        this.f39196l = y10;
        float interpolation = org.telegram.ui.Components.qr.f27653f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.qr.h.getInterpolation(f12);
        final float f13 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f14 = 1.0f - interpolation;
        final float f15 = (y10 * interpolation) + (y3 * f14);
        float height = u1Var.getRadialProgress().f22362a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.f39190c * f14);
        yl0Var.getY();
        uiVar.getY();
        yl0Var.getMeasuredHeight();
        if (uiVar.getMeasuredHeight() > 0) {
            uiVar.getMeasuredHeight();
        }
        int i12 = u1Var.getRadialProgress().f22374p;
        int i13 = org.telegram.ui.ActionBar.j6.f19099cf;
        org.telegram.ui.ActionBar.f6 f6Var = this.f39194j;
        float f17 = f7;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        Paint paint = this.e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f18 = 1.0f - f17;
            org.telegram.ui.Components.aa aaVar = recordCircle.h;
            org.telegram.ui.Components.aa aaVar2 = recordCircle.f22119n;
            f10 = x10;
            float interpolation3 = org.telegram.ui.Components.qr.f27654g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f19 = chatActivityEnterView.f22028j4;
            if (f19 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f19 / 0.7f;
            }
            canvas.save();
            float f20 = ((aaVar2.f22596t * 1.4f) + 0.878f) * chatActivityEnterView.f22017h4 * f11 * interpolation3 * f18;
            canvas.scale(f20, f20, f13, f15);
            aaVar2.a(f13, f15, canvas, aaVar2.d);
            canvas.restore();
            float f21 = ((aaVar.f22596t * 1.4f) + 0.926f) * chatActivityEnterView.f22017h4 * f11 * interpolation3 * f18;
            canvas.save();
            canvas.scale(f21, f21, f13, f15);
            aaVar.a(f13, f15, canvas, aaVar.d);
            canvas.restore();
        } else {
            f10 = x10;
        }
        canvas.drawCircle(f13, f15, f16, paint);
        canvas.save();
        final float f22 = f16 / height;
        canvas.scale(f22, f22, f13, f15);
        final float centerX = f13 - u1Var.getRadialProgress().f22362a.centerX();
        final float centerY = f15 - u1Var.getRadialProgress().f22362a.centerY();
        canvas.translate(centerX, centerY);
        u1Var.getRadialProgress().E = interpolation;
        u1Var.getRadialProgress().B = false;
        final float f23 = f10;
        u1Var.q2(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f24;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                wi1 wi1Var = wi1.this;
                RadialProgress2 radialProgress = wi1Var.f39188a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f25 = centerX;
                float f26 = centerY;
                canvas3.translate(-f25, -f26);
                float f27 = f22;
                float f28 = 1.0f / f27;
                float f29 = f13;
                float f30 = f15;
                canvas3.scale(f28, f28, f29, f30);
                ChatActivityEnterView.RecordCircle recordCircle2 = wi1Var.f39192g;
                if (recordCircle2 != null) {
                    int i14 = (int) f23;
                    int i15 = (int) y3;
                    float f31 = 1.0f - f12;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f22077s4;
                    Rect rect = chatActivityEnterView2.T3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f22118f != 1.0f) {
                            if (chatActivityEnterView2.f21983c1) {
                                drawable3 = chatActivityEnterView2.Q3;
                            } else {
                                drawable3 = chatActivityEnterView2.P3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.R3;
                        canvas2 = canvas3;
                        f24 = f31;
                        rect.set(org.telegram.messenger.rk.y(2, i14, drawable2), org.telegram.messenger.rk.d(2, i15, drawable2), org.telegram.ui.Cells.c1.d(2, i14, drawable2), org.telegram.messenger.rk.A(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.messenger.rk.y(2, i14, drawable4), org.telegram.messenger.rk.d(2, i15, drawable4), org.telegram.ui.Cells.c1.d(2, i14, drawable4), org.telegram.messenger.rk.A(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f24 = f31;
                        if (chatActivityEnterView2.f21983c1) {
                            drawable = chatActivityEnterView2.Q3;
                        } else {
                            drawable = chatActivityEnterView2.P3;
                        }
                        drawable2 = drawable;
                        rect.set(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i14, AndroidUtilities.dp(12.0f) + i15);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f22118f, (int) (255.0f * f24));
                }
                canvas3.scale(f27, f27, f29, f30);
                canvas3.translate(f25, f26);
            }
        });
        u1Var.getRadialProgress().B = true;
        u1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
