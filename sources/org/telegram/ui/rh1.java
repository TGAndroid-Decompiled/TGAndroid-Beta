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
public final class rh1 implements kh0 {
    public final org.telegram.ui.Cells.s1 f42107a;
    public final org.telegram.ui.Components.jl0 f42108b;
    public final float f42109c;
    public float d;
    public final Paint f42110e = new Paint(1);
    public final ValueAnimator f42111f;
    public final ChatActivityEnterView.RecordCircle f42112g;
    public final int h;
    public final org.telegram.ui.Components.mi f42113i;
    public final org.telegram.ui.ActionBar.c6 f42114j;
    public float f42115k;
    public float f42116l;

    public rh1(org.telegram.ui.Cells.s1 s1Var, dk dkVar, org.telegram.ui.Components.jl0 jl0Var, org.telegram.ui.Components.mi miVar, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f42114j = c6Var;
        this.f42107a = s1Var;
        this.f42113i = miVar;
        this.f42108b = jl0Var;
        s1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = dkVar.getRecordCircle();
        this.f42112g = recordCircle;
        if (recordCircle != null) {
            this.f42109c = recordCircle.H;
            recordCircle.I = true;
            recordCircle.J = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = s1Var.getMessageObject().stableId;
        ((ArrayList) miVar.f30705c).add(this);
        miVar.a();
        ((ViewGroup) miVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42111f = ofFloat;
        ofFloat.addUpdateListener(new bg.b3(23, this, miVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new qh1(this, s1Var, miVar));
        if (s1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.co0 seekBarWaveform = s1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.f27534n;
            if (s1Var2 != null) {
                s1Var2.invalidate();
            }
        }
    }

    @Override
    public final void a(final Canvas canvas) {
        float f9;
        float x4;
        final float y8;
        float y10;
        float x10;
        float f10;
        float f11;
        final float f12 = this.d;
        if (f12 > 0.6f) {
            f9 = 1.0f;
        } else {
            f9 = f12 / 0.6f;
        }
        ChatActivityEnterView.RecordCircle recordCircle = this.f42112g;
        org.telegram.ui.Components.mi miVar = this.f42113i;
        if (recordCircle == null) {
            x4 = 0.0f;
        } else {
            x4 = (recordCircle.getX() + recordCircle.F) - miVar.getX();
        }
        if (recordCircle == null) {
            y8 = 0.0f;
        } else {
            y8 = (recordCircle.getY() + recordCircle.G) - miVar.getY();
        }
        org.telegram.ui.Cells.s1 s1Var = this.f42107a;
        int i10 = s1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.jl0 jl0Var = this.f42108b;
        if (i10 != i11) {
            x10 = this.f42115k;
            y10 = this.f42116l;
        } else {
            y10 = (jl0Var.getY() + (s1Var.getY() + s1Var.getRadialProgress().f26479a.centerY())) - miVar.getY();
            x10 = (jl0Var.getX() + (s1Var.getX() + s1Var.getRadialProgress().f26479a.centerX())) - miVar.getX();
        }
        this.f42115k = x10;
        this.f42116l = y10;
        float interpolation = org.telegram.ui.Components.jr.f29800f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.jr.h.getInterpolation(f12);
        final float f13 = (x10 * interpolation2) + ((1.0f - interpolation2) * x4);
        float f14 = 1.0f - interpolation;
        final float f15 = (y10 * interpolation) + (y8 * f14);
        float height = s1Var.getRadialProgress().f26479a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.f42109c * f14);
        jl0Var.getY();
        miVar.getY();
        jl0Var.getMeasuredHeight();
        if (miVar.getMeasuredHeight() > 0) {
            miVar.getMeasuredHeight();
        }
        int i12 = s1Var.getRadialProgress().f26492p;
        int i13 = org.telegram.ui.ActionBar.g6.f23053cf;
        org.telegram.ui.ActionBar.c6 c6Var = this.f42114j;
        float f17 = f9;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i13, c6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        Paint paint = this.f42110e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f18 = 1.0f - f17;
            org.telegram.ui.Components.y9 y9Var = recordCircle.h;
            org.telegram.ui.Components.y9 y9Var2 = recordCircle.f26235n;
            f10 = x4;
            float interpolation3 = org.telegram.ui.Components.jr.f29801g.getInterpolation(recordCircle.D);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f19 = chatActivityEnterView.f26116e4;
            if (f19 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f19 / 0.7f;
            }
            canvas.save();
            float f20 = ((y9Var2.f34992t * 1.4f) + 0.878f) * chatActivityEnterView.f26103c4 * f11 * interpolation3 * f18;
            canvas.scale(f20, f20, f13, f15);
            y9Var2.a(f13, f15, canvas, y9Var2.d);
            canvas.restore();
            float f21 = ((y9Var.f34992t * 1.4f) + 0.926f) * chatActivityEnterView.f26103c4 * f11 * interpolation3 * f18;
            canvas.save();
            canvas.scale(f21, f21, f13, f15);
            y9Var.a(f13, f15, canvas, y9Var.d);
            canvas.restore();
        } else {
            f10 = x4;
        }
        canvas.drawCircle(f13, f15, f16, paint);
        canvas.save();
        final float f22 = f16 / height;
        canvas.scale(f22, f22, f13, f15);
        final float centerX = f13 - s1Var.getRadialProgress().f26479a.centerX();
        final float centerY = f15 - s1Var.getRadialProgress().f26479a.centerY();
        canvas.translate(centerX, centerY);
        s1Var.getRadialProgress().E = interpolation;
        s1Var.getRadialProgress().B = false;
        final float f23 = f10;
        s1Var.q2(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f24;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                rh1 rh1Var = rh1.this;
                RadialProgress2 radialProgress = rh1Var.f42107a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = rh1Var.f42112g;
                if (recordCircle2 != null) {
                    int i14 = (int) f23;
                    int i15 = (int) y8;
                    float f31 = 1.0f - f12;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f26165n4;
                    Rect rect = chatActivityEnterView2.O3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f26234f != 1.0f) {
                            if (chatActivityEnterView2.Y0) {
                                drawable3 = chatActivityEnterView2.L3;
                            } else {
                                drawable3 = chatActivityEnterView2.K3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.M3;
                        canvas2 = canvas3;
                        f24 = f31;
                        rect.set(b.v(2, i14, drawable2), b.f(2, i15, drawable2), b.A(2, i14, drawable2), b.y(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(b.v(2, i14, drawable4), b.f(2, i15, drawable4), b.A(2, i14, drawable4), b.y(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f24 = f31;
                        if (chatActivityEnterView2.Y0) {
                            drawable = chatActivityEnterView2.L3;
                        } else {
                            drawable = chatActivityEnterView2.K3;
                        }
                        drawable2 = drawable;
                        rect.set(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i14, AndroidUtilities.dp(12.0f) + i15);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f26234f, (int) (255.0f * f24));
                }
                canvas3.scale(f27, f27, f29, f30);
                canvas3.translate(f25, f26);
            }
        });
        s1Var.getRadialProgress().B = true;
        s1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
