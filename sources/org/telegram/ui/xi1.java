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
public final class xi1 implements ci0 {
    public final org.telegram.ui.Cells.u1 f44116a;
    public final org.telegram.ui.Components.rm0 f44117b;
    public final float f44118c;
    public float d;
    public final Paint f44119e = new Paint(1);
    public final ValueAnimator f44120f;
    public final ChatActivityEnterView.RecordCircle f44121g;
    public final int h;
    public final org.telegram.ui.Components.xi f44122i;
    public final org.telegram.ui.ActionBar.d6 f44123j;
    public float f44124k;
    public float f44125l;

    public xi1(org.telegram.ui.Cells.u1 u1Var, ok okVar, org.telegram.ui.Components.rm0 rm0Var, org.telegram.ui.Components.xi xiVar, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f44123j = d6Var;
        this.f44116a = u1Var;
        this.f44122i = xiVar;
        this.f44117b = rm0Var;
        u1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = okVar.getRecordCircle();
        this.f44121g = recordCircle;
        if (recordCircle != null) {
            this.f44118c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = u1Var.getMessageObject().stableId;
        ((ArrayList) xiVar.f32985c).add(this);
        xiVar.a();
        ((ViewGroup) xiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f44120f = ofFloat;
        ofFloat.addUpdateListener(new ai.x(25, this, xiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new wi1(this, u1Var, xiVar));
        if (u1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.op0 seekBarWaveform = u1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f29589n;
            if (u1Var2 != null) {
                u1Var2.invalidate();
            }
        }
    }

    @Override
    public final void a(final Canvas canvas) {
        float f7;
        float x10;
        float y3;
        float x11;
        float f10;
        float f11;
        final float f12 = this.d;
        if (f12 > 0.6f) {
            f7 = 1.0f;
        } else {
            f7 = f12 / 0.6f;
        }
        float f13 = 0.0f;
        ChatActivityEnterView.RecordCircle recordCircle = this.f44121g;
        org.telegram.ui.Components.xi xiVar = this.f44122i;
        if (recordCircle == null) {
            x10 = 0.0f;
        } else {
            x10 = (recordCircle.getX() + recordCircle.J) - xiVar.getX();
        }
        if (recordCircle != null) {
            f13 = (recordCircle.getY() + recordCircle.K) - xiVar.getY();
        }
        final float f14 = f13;
        org.telegram.ui.Cells.u1 u1Var = this.f44116a;
        int i10 = u1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.rm0 rm0Var = this.f44117b;
        if (i10 != i11) {
            x11 = this.f44124k;
            y3 = this.f44125l;
        } else {
            y3 = (rm0Var.getY() + (u1Var.getY() + u1Var.getRadialProgress().f24288a.centerY())) - xiVar.getY();
            x11 = (rm0Var.getX() + (u1Var.getX() + u1Var.getRadialProgress().f24288a.centerX())) - xiVar.getX();
        }
        this.f44124k = x11;
        this.f44125l = y3;
        float interpolation = org.telegram.ui.Components.is.f27500f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.is.h.getInterpolation(f12);
        final float f15 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f16 = 1.0f - interpolation;
        final float f17 = (y3 * interpolation) + (f14 * f16);
        float height = u1Var.getRadialProgress().f24288a.height() / 2.0f;
        float f18 = (height * interpolation) + (this.f44118c * f16);
        rm0Var.getY();
        xiVar.getY();
        rm0Var.getMeasuredHeight();
        if (xiVar.getMeasuredHeight() > 0) {
            xiVar.getMeasuredHeight();
        }
        int i12 = u1Var.getRadialProgress().f24301p;
        int i13 = org.telegram.ui.ActionBar.h6.f20812cf;
        org.telegram.ui.ActionBar.d6 d6Var = this.f44123j;
        float f19 = f7;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i13, d6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, w02, org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        Paint paint = this.f44119e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f20 = 1.0f - f19;
            org.telegram.ui.Components.da daVar = recordCircle.h;
            org.telegram.ui.Components.da daVar2 = recordCircle.f24032n;
            f10 = x10;
            float interpolation3 = org.telegram.ui.Components.is.f27501g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f21 = chatActivityEnterView.f23940j4;
            if (f21 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f21 / 0.7f;
            }
            canvas.save();
            float f22 = ((daVar2.f25719t * 1.4f) + 0.878f) * chatActivityEnterView.f23929h4 * f11 * interpolation3 * f20;
            canvas.scale(f22, f22, f15, f17);
            daVar2.a(f15, f17, canvas, daVar2.d);
            canvas.restore();
            float f23 = ((daVar.f25719t * 1.4f) + 0.926f) * chatActivityEnterView.f23929h4 * f11 * interpolation3 * f20;
            canvas.save();
            canvas.scale(f23, f23, f15, f17);
            daVar.a(f15, f17, canvas, daVar.d);
            canvas.restore();
        } else {
            f10 = x10;
        }
        canvas.drawCircle(f15, f17, f18, paint);
        canvas.save();
        final float f24 = f18 / height;
        canvas.scale(f24, f24, f15, f17);
        final float centerX = f15 - u1Var.getRadialProgress().f24288a.centerX();
        final float centerY = f17 - u1Var.getRadialProgress().f24288a.centerY();
        canvas.translate(centerX, centerY);
        u1Var.getRadialProgress().E = interpolation;
        u1Var.getRadialProgress().B = false;
        final float f25 = f10;
        u1Var.q2(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f26;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                xi1 xi1Var = xi1.this;
                RadialProgress2 radialProgress = xi1Var.f44116a.getRadialProgress();
                Canvas canvas3 = canvas;
                radialProgress.draw(canvas3);
                float f27 = centerX;
                float f28 = centerY;
                canvas3.translate(-f27, -f28);
                float f29 = f24;
                float f30 = 1.0f / f29;
                float f31 = f15;
                float f32 = f17;
                canvas3.scale(f30, f30, f31, f32);
                ChatActivityEnterView.RecordCircle recordCircle2 = xi1Var.f44121g;
                if (recordCircle2 != null) {
                    int i14 = (int) f25;
                    int i15 = (int) f14;
                    float f33 = 1.0f - f12;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f23989s4;
                    Rect rect = chatActivityEnterView2.T3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f24031f != 1.0f) {
                            if (chatActivityEnterView2.f23894c1) {
                                drawable3 = chatActivityEnterView2.Q3;
                            } else {
                                drawable3 = chatActivityEnterView2.P3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.R3;
                        canvas2 = canvas3;
                        f26 = f33;
                        rect.set(org.telegram.ui.Cells.c1.s(2, i14, drawable2), org.telegram.ui.Cells.c1.c(2, i15, drawable2), org.telegram.ui.Cells.c1.w(2, i14, drawable2), org.telegram.ui.Cells.c1.v(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.ui.Cells.c1.s(2, i14, drawable4), org.telegram.ui.Cells.c1.c(2, i15, drawable4), org.telegram.ui.Cells.c1.w(2, i14, drawable4), org.telegram.ui.Cells.c1.v(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f26 = f33;
                        if (chatActivityEnterView2.f23894c1) {
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
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f24031f, (int) (255.0f * f26));
                }
                canvas3.scale(f29, f29, f31, f32);
                canvas3.translate(f27, f28);
            }
        });
        u1Var.getRadialProgress().B = true;
        u1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
