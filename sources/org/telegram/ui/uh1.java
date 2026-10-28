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
public final class uh1 implements ph0 {
    public final org.telegram.ui.Cells.s1 f44030a;
    public final org.telegram.ui.Components.nm0 f44031b;
    public final float f44032c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f44033f;
    public final ChatActivityEnterView.RecordCircle f44034g;
    public final int h;
    public final org.telegram.ui.Components.si f44035i;
    public final org.telegram.ui.ActionBar.u6 f44036j;
    public float f44037k;
    public float f44038l;

    public uh1(org.telegram.ui.Cells.s1 s1Var, jk jkVar, org.telegram.ui.Components.nm0 nm0Var, org.telegram.ui.Components.si siVar, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f44036j = u6Var;
        this.f44030a = s1Var;
        this.f44035i = siVar;
        this.f44031b = nm0Var;
        s1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = jkVar.getRecordCircle();
        this.f44034g = recordCircle;
        if (recordCircle != null) {
            this.f44032c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = s1Var.getMessageObject().stableId;
        ((ArrayList) siVar.f32599c).add(this);
        siVar.a();
        ((ViewGroup) siVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44033f = ofFloat;
        ofFloat.addUpdateListener(new bh.b0(25, this, siVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new th1(this, s1Var, siVar));
        if (s1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.qp0 seekBarWaveform = s1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.f31990n;
            if (s1Var2 != null) {
                s1Var2.invalidate();
            }
        }
    }

    @Override
    public final void a(final Canvas canvas) {
        float f7;
        float x9;
        float y3;
        float x10;
        float f10;
        float f11;
        final float f12 = this.d;
        if (f12 > 0.6f) {
            f7 = 1.0f;
        } else {
            f7 = f12 / 0.6f;
        }
        float f13 = 0.0f;
        ChatActivityEnterView.RecordCircle recordCircle = this.f44034g;
        org.telegram.ui.Components.si siVar = this.f44035i;
        if (recordCircle == null) {
            x9 = 0.0f;
        } else {
            x9 = (recordCircle.getX() + recordCircle.J) - siVar.getX();
        }
        if (recordCircle != null) {
            f13 = (recordCircle.getY() + recordCircle.K) - siVar.getY();
        }
        final float f14 = f13;
        org.telegram.ui.Cells.s1 s1Var = this.f44030a;
        int i10 = s1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.nm0 nm0Var = this.f44031b;
        if (i10 != i11) {
            x10 = this.f44037k;
            y3 = this.f44038l;
        } else {
            y3 = (nm0Var.getY() + (s1Var.getY() + s1Var.getRadialProgress().f26245a.centerY())) - siVar.getY();
            x10 = (nm0Var.getX() + (s1Var.getX() + s1Var.getRadialProgress().f26245a.centerX())) - siVar.getX();
        }
        this.f44037k = x10;
        this.f44038l = y3;
        float interpolation = org.telegram.ui.Components.ds.f27530f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.ds.h.getInterpolation(f12);
        final float f15 = (x10 * interpolation2) + ((1.0f - interpolation2) * x9);
        float f16 = 1.0f - interpolation;
        final float f17 = (y3 * interpolation) + (f14 * f16);
        float height = s1Var.getRadialProgress().f26245a.height() / 2.0f;
        float f18 = (height * interpolation) + (this.f44032c * f16);
        nm0Var.getY();
        siVar.getY();
        nm0Var.getMeasuredHeight();
        if (siVar.getMeasuredHeight() > 0) {
            siVar.getMeasuredHeight();
        }
        int i12 = s1Var.getRadialProgress().f26257p;
        int i13 = org.telegram.ui.ActionBar.y6.f23347cf;
        org.telegram.ui.ActionBar.u6 u6Var = this.f44036j;
        float f19 = f7;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i13, u6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int f20 = i0.a.f(interpolation, w02, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        Paint paint = this.e;
        paint.setColor(f20);
        if (recordCircle != null) {
            float f21 = 1.0f - f19;
            org.telegram.ui.Components.fa faVar = recordCircle.h;
            org.telegram.ui.Components.fa faVar2 = recordCircle.f26001n;
            f10 = x9;
            float interpolation3 = org.telegram.ui.Components.ds.f27531g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f22 = chatActivityEnterView.f25907j4;
            if (f22 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f22 / 0.7f;
            }
            canvas.save();
            float f23 = ((faVar2.f28081t * 1.4f) + 0.878f) * chatActivityEnterView.f25895h4 * f11 * interpolation3 * f21;
            canvas.scale(f23, f23, f15, f17);
            faVar2.a(f15, f17, canvas, faVar2.d);
            canvas.restore();
            float f24 = ((faVar.f28081t * 1.4f) + 0.926f) * chatActivityEnterView.f25895h4 * f11 * interpolation3 * f21;
            canvas.save();
            canvas.scale(f24, f24, f15, f17);
            faVar.a(f15, f17, canvas, faVar.d);
            canvas.restore();
        } else {
            f10 = x9;
        }
        canvas.drawCircle(f15, f17, f18, paint);
        canvas.save();
        final float f25 = f18 / height;
        canvas.scale(f25, f25, f15, f17);
        final float centerX = f15 - s1Var.getRadialProgress().f26245a.centerX();
        final float centerY = f17 - s1Var.getRadialProgress().f26245a.centerY();
        canvas.translate(centerX, centerY);
        s1Var.getRadialProgress().E = interpolation;
        s1Var.getRadialProgress().B = false;
        final float f26 = f10;
        s1Var.q2(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f27;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                uh1 uh1Var = uh1.this;
                RadialProgress2 radialProgress = uh1Var.f44030a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f28 = centerX;
                float f29 = centerY;
                canvas3.translate(-f28, -f29);
                float f30 = f25;
                float f31 = 1.0f / f30;
                float f32 = f15;
                float f33 = f17;
                canvas3.scale(f31, f31, f32, f33);
                ChatActivityEnterView.RecordCircle recordCircle2 = uh1Var.f44034g;
                if (recordCircle2 != null) {
                    int i14 = (int) f26;
                    int i15 = (int) f14;
                    float f34 = 1.0f - f12;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f25959s4;
                    Rect rect = chatActivityEnterView2.T3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f26000f != 1.0f) {
                            if (chatActivityEnterView2.f25861c1) {
                                drawable3 = chatActivityEnterView2.Q3;
                            } else {
                                drawable3 = chatActivityEnterView2.P3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.R3;
                        canvas2 = canvas3;
                        f27 = f34;
                        rect.set(d3.x(2, i14, drawable2), d3.i(2, i15, drawable2), d3.C(2, i14, drawable2), d3.B(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(d3.x(2, i14, drawable4), d3.i(2, i15, drawable4), d3.C(2, i14, drawable4), d3.B(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f27 = f34;
                        if (chatActivityEnterView2.f25861c1) {
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
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f26000f, (int) (255.0f * f27));
                }
                canvas3.scale(f30, f30, f32, f33);
                canvas3.translate(f28, f29);
            }
        });
        s1Var.getRadialProgress().B = true;
        s1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
