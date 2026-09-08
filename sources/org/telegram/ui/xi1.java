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
    public final org.telegram.ui.Cells.t1 f42765a;
    public final org.telegram.ui.Components.ll0 f42766b;
    public final float f42767c;
    public float d;
    public final Paint f42768e = new Paint(1);
    public final ValueAnimator f42769f;
    public final ChatActivityEnterView.RecordCircle f42770g;
    public final int h;
    public final org.telegram.ui.Components.ui f42771i;
    public final org.telegram.ui.ActionBar.f6 f42772j;
    public float f42773k;
    public float f42774l;

    public xi1(org.telegram.ui.Cells.t1 t1Var, mk mkVar, org.telegram.ui.Components.ll0 ll0Var, org.telegram.ui.Components.ui uiVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f42772j = f6Var;
        this.f42765a = t1Var;
        this.f42771i = uiVar;
        this.f42766b = ll0Var;
        t1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = mkVar.getRecordCircle();
        this.f42770g = recordCircle;
        if (recordCircle != null) {
            this.f42767c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = t1Var.getMessageObject().stableId;
        ((ArrayList) uiVar.f30931c).add(this);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f42769f = ofFloat;
        ofFloat.addUpdateListener(new ah.m0(26, this, uiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new wi1(this, t1Var, uiVar));
        if (t1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.io0 seekBarWaveform = t1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f27246n;
            if (t1Var2 != null) {
                t1Var2.invalidate();
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
        ChatActivityEnterView.RecordCircle recordCircle = this.f42770g;
        org.telegram.ui.Components.ui uiVar = this.f42771i;
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
        org.telegram.ui.Cells.t1 t1Var = this.f42765a;
        int i10 = t1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.ll0 ll0Var = this.f42766b;
        if (i10 != i11) {
            x11 = this.f42773k;
            y10 = this.f42774l;
        } else {
            y10 = (ll0Var.getY() + (t1Var.getY() + t1Var.getRadialProgress().f24097a.centerY())) - uiVar.getY();
            x11 = (ll0Var.getX() + (t1Var.getX() + t1Var.getRadialProgress().f24097a.centerX())) - uiVar.getX();
        }
        this.f42773k = x11;
        this.f42774l = y10;
        float interpolation = org.telegram.ui.Components.pr.f29493f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.pr.h.getInterpolation(f12);
        final float f13 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f14 = 1.0f - interpolation;
        final float f15 = (y10 * interpolation) + (y3 * f14);
        float height = t1Var.getRadialProgress().f24097a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.f42767c * f14);
        ll0Var.getY();
        uiVar.getY();
        ll0Var.getMeasuredHeight();
        if (uiVar.getMeasuredHeight() > 0) {
            uiVar.getMeasuredHeight();
        }
        int i12 = t1Var.getRadialProgress().f24110p;
        int i13 = org.telegram.ui.ActionBar.j6.f20680cf;
        org.telegram.ui.ActionBar.f6 f6Var = this.f42772j;
        float f17 = f7;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i13, f6Var);
        if (i12 < 0) {
            i12 = i13;
        }
        int d = i0.a.d(interpolation, v02, org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        Paint paint = this.f42768e;
        paint.setColor(d);
        if (recordCircle != null) {
            float f18 = 1.0f - f17;
            org.telegram.ui.Components.ca caVar = recordCircle.h;
            org.telegram.ui.Components.ca caVar2 = recordCircle.f23841n;
            f10 = x10;
            float interpolation3 = org.telegram.ui.Components.pr.f29494g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f19 = chatActivityEnterView.f23745i4;
            if (f19 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f19 / 0.7f;
            }
            canvas.save();
            float f20 = ((caVar2.f24970t * 1.4f) + 0.878f) * chatActivityEnterView.f23733g4 * f11 * interpolation3 * f18;
            canvas.scale(f20, f20, f13, f15);
            caVar2.a(f13, f15, canvas, caVar2.d);
            canvas.restore();
            float f21 = ((caVar.f24970t * 1.4f) + 0.926f) * chatActivityEnterView.f23733g4 * f11 * interpolation3 * f18;
            canvas.save();
            canvas.scale(f21, f21, f13, f15);
            caVar.a(f13, f15, canvas, caVar.d);
            canvas.restore();
        } else {
            f10 = x10;
        }
        canvas.drawCircle(f13, f15, f16, paint);
        canvas.save();
        final float f22 = f16 / height;
        canvas.scale(f22, f22, f13, f15);
        final float centerX = f13 - t1Var.getRadialProgress().f24097a.centerX();
        final float centerY = f15 - t1Var.getRadialProgress().f24097a.centerY();
        canvas.translate(centerX, centerY);
        t1Var.getRadialProgress().E = interpolation;
        t1Var.getRadialProgress().B = false;
        final float f23 = f10;
        t1Var.q2(canvas, interpolation, new Runnable() {
            @Override
            public final void run() {
                Canvas canvas2;
                float f24;
                Drawable drawable;
                Drawable drawable2;
                Drawable drawable3;
                xi1 xi1Var = xi1.this;
                RadialProgress2 radialProgress = xi1Var.f42765a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = xi1Var.f42770g;
                if (recordCircle2 != null) {
                    int i14 = (int) f23;
                    int i15 = (int) y3;
                    float f31 = 1.0f - f12;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f23792r4;
                    Rect rect = chatActivityEnterView2.S3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f23840f != 1.0f) {
                            if (chatActivityEnterView2.f23704c1) {
                                drawable3 = chatActivityEnterView2.P3;
                            } else {
                                drawable3 = chatActivityEnterView2.O3;
                            }
                            drawable4 = drawable3;
                        }
                        drawable2 = chatActivityEnterView2.Q3;
                        canvas2 = canvas3;
                        f24 = f31;
                        rect.set(org.telegram.messenger.wl.w(2, i14, drawable2), org.telegram.messenger.wl.e(2, i15, drawable2), org.telegram.messenger.wl.B(2, i14, drawable2), org.telegram.messenger.wl.z(2, i15, drawable2));
                        if (drawable4 != null) {
                            drawable4.setBounds(org.telegram.messenger.wl.w(2, i14, drawable4), org.telegram.messenger.wl.e(2, i15, drawable4), org.telegram.messenger.wl.B(2, i14, drawable4), org.telegram.messenger.wl.z(2, i15, drawable4));
                        }
                    } else {
                        canvas2 = canvas3;
                        f24 = f31;
                        if (chatActivityEnterView2.f23704c1) {
                            drawable = chatActivityEnterView2.P3;
                        } else {
                            drawable = chatActivityEnterView2.O3;
                        }
                        drawable2 = drawable;
                        rect.set(i14 - AndroidUtilities.dp(12.0f), i15 - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i14, AndroidUtilities.dp(12.0f) + i15);
                    }
                    Drawable drawable5 = drawable2;
                    Drawable drawable6 = drawable4;
                    drawable5.setBounds(rect);
                    canvas3 = canvas2;
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f23840f, (int) (255.0f * f24));
                }
                canvas3.scale(f27, f27, f29, f30);
                canvas3.translate(f25, f26);
            }
        });
        t1Var.getRadialProgress().B = true;
        t1Var.getRadialProgress().E = 1.0f;
        canvas.restore();
    }
}
