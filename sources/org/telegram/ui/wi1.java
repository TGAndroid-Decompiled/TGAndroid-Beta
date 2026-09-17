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
    public final org.telegram.ui.Cells.t1 f39048a;
    public final org.telegram.ui.Components.ml0 f39049b;
    public final float f39050c;
    public float d;
    public final Paint e = new Paint(1);
    public final ValueAnimator f39051f;
    public final ChatActivityEnterView.RecordCircle f39052g;
    public final int h;
    public final org.telegram.ui.Components.ui f39053i;
    public final org.telegram.ui.ActionBar.f6 f39054j;
    public float f39055k;
    public float f39056l;

    public wi1(org.telegram.ui.Cells.t1 t1Var, nk nkVar, org.telegram.ui.Components.ml0 ml0Var, org.telegram.ui.Components.ui uiVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f39054j = f6Var;
        this.f39048a = t1Var;
        this.f39053i = uiVar;
        this.f39049b = ml0Var;
        t1Var.setEnterTransitionInProgress(true);
        ChatActivityEnterView.RecordCircle recordCircle = nkVar.getRecordCircle();
        this.f39052g = recordCircle;
        if (recordCircle != null) {
            this.f39050c = recordCircle.L;
            recordCircle.M = true;
            recordCircle.N = true;
        }
        new Matrix();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP));
        this.h = t1Var.getMessageObject().stableId;
        ((ArrayList) uiVar.f28393c).add(this);
        uiVar.a();
        ((ViewGroup) uiVar.d).invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f39051f = ofFloat;
        ofFloat.addUpdateListener(new ai.x(25, this, uiVar));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(220L);
        ofFloat.addListener(new vi1(this, t1Var, uiVar));
        if (t1Var.getSeekBarWaveform() != null) {
            org.telegram.ui.Components.jo0 seekBarWaveform = t1Var.getSeekBarWaveform();
            seekBarWaveform.v.d(0.0f, true);
            org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f25385n;
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
        ChatActivityEnterView.RecordCircle recordCircle = this.f39052g;
        org.telegram.ui.Components.ui uiVar = this.f39053i;
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
        org.telegram.ui.Cells.t1 t1Var = this.f39048a;
        int i10 = t1Var.getMessageObject().stableId;
        int i11 = this.h;
        org.telegram.ui.Components.ml0 ml0Var = this.f39049b;
        if (i10 != i11) {
            x11 = this.f39055k;
            y10 = this.f39056l;
        } else {
            y10 = (ml0Var.getY() + (t1Var.getY() + t1Var.getRadialProgress().f22135a.centerY())) - uiVar.getY();
            x11 = (ml0Var.getX() + (t1Var.getX() + t1Var.getRadialProgress().f22135a.centerX())) - uiVar.getX();
        }
        this.f39055k = x11;
        this.f39056l = y10;
        float interpolation = org.telegram.ui.Components.qr.f27380f.getInterpolation(f12);
        float interpolation2 = org.telegram.ui.Components.qr.h.getInterpolation(f12);
        final float f13 = (x11 * interpolation2) + ((1.0f - interpolation2) * x10);
        float f14 = 1.0f - interpolation;
        final float f15 = (y10 * interpolation) + (y3 * f14);
        float height = t1Var.getRadialProgress().f22135a.height() / 2.0f;
        float f16 = (height * interpolation) + (this.f39050c * f14);
        ml0Var.getY();
        uiVar.getY();
        ml0Var.getMeasuredHeight();
        if (uiVar.getMeasuredHeight() > 0) {
            uiVar.getMeasuredHeight();
        }
        int i12 = t1Var.getRadialProgress().f22147p;
        int i13 = org.telegram.ui.ActionBar.j6.f18852cf;
        org.telegram.ui.ActionBar.f6 f6Var = this.f39054j;
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
            org.telegram.ui.Components.z9 z9Var = recordCircle.h;
            org.telegram.ui.Components.z9 z9Var2 = recordCircle.f21892n;
            f10 = x10;
            float interpolation3 = org.telegram.ui.Components.qr.f27381g.getInterpolation(recordCircle.H);
            ChatActivityEnterView chatActivityEnterView = ChatActivityEnterView.this;
            float f19 = chatActivityEnterView.f21797i4;
            if (f19 > 0.7f) {
                f11 = 1.0f;
            } else {
                f11 = f19 / 0.7f;
            }
            canvas.save();
            float f20 = ((z9Var2.f30443t * 1.4f) + 0.878f) * chatActivityEnterView.f21785g4 * f11 * interpolation3 * f18;
            canvas.scale(f20, f20, f13, f15);
            z9Var2.a(f13, f15, canvas, z9Var2.d);
            canvas.restore();
            float f21 = ((z9Var.f30443t * 1.4f) + 0.926f) * chatActivityEnterView.f21785g4 * f11 * interpolation3 * f18;
            canvas.save();
            canvas.scale(f21, f21, f13, f15);
            z9Var.a(f13, f15, canvas, z9Var.d);
            canvas.restore();
        } else {
            f10 = x10;
        }
        canvas.drawCircle(f13, f15, f16, paint);
        canvas.save();
        final float f22 = f16 / height;
        canvas.scale(f22, f22, f13, f15);
        final float centerX = f13 - t1Var.getRadialProgress().f22135a.centerX();
        final float centerY = f15 - t1Var.getRadialProgress().f22135a.centerY();
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
                wi1 wi1Var = wi1.this;
                RadialProgress2 radialProgress = wi1Var.f39048a.getRadialProgress();
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
                ChatActivityEnterView.RecordCircle recordCircle2 = wi1Var.f39052g;
                if (recordCircle2 != null) {
                    int i14 = (int) f23;
                    int i15 = (int) y3;
                    float f31 = 1.0f - f12;
                    recordCircle2.a();
                    ChatActivityEnterView chatActivityEnterView2 = ChatActivityEnterView.this;
                    boolean z10 = chatActivityEnterView2.f21844r4;
                    Rect rect = chatActivityEnterView2.S3;
                    Drawable drawable4 = null;
                    if (z10) {
                        if (recordCircle2.f21891f != 1.0f) {
                            if (chatActivityEnterView2.f21757c1) {
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
                        if (chatActivityEnterView2.f21757c1) {
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
                    recordCircle2.b(canvas3, drawable5, drawable6, recordCircle2.f21891f, (int) (255.0f * f24));
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
