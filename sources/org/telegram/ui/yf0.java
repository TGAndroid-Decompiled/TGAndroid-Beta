package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class yf0 extends org.telegram.ui.Components.cu0 {
    public final int[] f54360g0;
    public final int[] f54361h0;
    public int f54362i0;
    public final int[] f54363j0;
    public final org.telegram.ui.Components.i61 f54364k0;
    public final Paint f54365l0;
    public final org.telegram.ui.ActionBar.i6 m0;
    public final dg0 f54366n0;

    public yf0(dg0 dg0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null);
        this.f54366n0 = dg0Var;
        this.m0 = i6Var;
        this.f54360g0 = new int[2];
        this.f54361h0 = new int[2];
        this.f54362i0 = 0;
        this.f54363j0 = new int[2];
        this.f54364k0 = new org.telegram.ui.Components.i61(1);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
        this.f54365l0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        ?? r10;
        int[] iArr;
        char c10;
        tf0 tf0Var;
        org.telegram.ui.Cells.r1 r1Var;
        boolean z10;
        float textX;
        float textY;
        char c11;
        TextPaint textPaint;
        float f10;
        float height;
        float f11;
        float f12;
        float f13;
        final float f14;
        int i7;
        float f15;
        float f16;
        int i10;
        char c12;
        float f17;
        boolean z11;
        dg0 dg0Var = this.f54366n0;
        int[] iArr2 = dg0Var.f47114r0;
        Paint paint = dg0Var.T;
        float[] fArr = dg0Var.f47116s0;
        Rect rect = dg0Var.f47125y0;
        zf0 zf0Var = dg0Var.K;
        if (dg0Var.f47120w && (r1Var = dg0Var.Q) != null && r1Var.getCurrentPosition() == null) {
            if (dg0Var.f47122x) {
                org.telegram.ui.Components.hf hfVar = dg0Var.S;
                if (hfVar != null) {
                    hfVar.setAlpha(0.0f);
                } else {
                    ab.q qVar = dg0Var.m0;
                    if (qVar != null) {
                        qVar.C(true);
                    }
                }
                dg0Var.f47122x = false;
            }
            if (dg0Var.Q.getMessageObject() != null && dg0Var.Q.getMessageObject().D == 15) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                textX = dg0Var.Q.getPhotoImage().L0;
            } else {
                textX = dg0Var.Q.getTextX();
            }
            if (z10) {
                textY = dg0Var.Q.getPhotoImage().M0;
            } else {
                textY = dg0Var.Q.getTextY();
            }
            float x10 = dg0Var.Q.getX() + zf0Var.getX() + textX;
            float y10 = dg0Var.Q.getY() + zf0Var.getY() + textY;
            float f18 = textY;
            if (dg0Var.Q.getMessageObject() != null) {
                org.telegram.messenger.fj messageObject = dg0Var.Q.getMessageObject();
                c11 = 3;
                if (messageObject.P1 >= 1 && messageObject.f24073k != null && !messageObject.u2()) {
                    int i11 = messageObject.P1;
                    int i12 = messageObject.Q1;
                    if (i11 == i12) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    switch (Math.max(i11, i12)) {
                        case 0:
                        case 1:
                        case 2:
                            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.n6.f29839y2;
                            if (z11) {
                                textPaint = textPaintArr[0];
                                break;
                            } else {
                                textPaint = textPaintArr[2];
                                break;
                            }
                        case 3:
                            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.n6.f29839y2;
                            if (z11) {
                                textPaint = textPaintArr2[1];
                                break;
                            } else {
                                textPaint = textPaintArr2[3];
                                break;
                            }
                        case 4:
                            TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.n6.f29839y2;
                            if (z11) {
                                textPaint = textPaintArr3[2];
                                break;
                            } else {
                                textPaint = textPaintArr3[4];
                                break;
                            }
                        case 5:
                            TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.n6.f29839y2;
                            if (z11) {
                                textPaint = textPaintArr4[3];
                                break;
                            } else {
                                textPaint = textPaintArr4[5];
                                break;
                            }
                        case 6:
                            TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.n6.f29839y2;
                            if (z11) {
                                textPaint = textPaintArr5[4];
                                break;
                            } else {
                                textPaint = textPaintArr5[5];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.n6.f29839y2[5];
                            break;
                    }
                } else {
                    textPaint = org.telegram.ui.ActionBar.n6.f29648o2;
                }
            } else {
                c11 = 3;
                textPaint = org.telegram.ui.ActionBar.n6.f29648o2;
            }
            float textSize = textPaint.getTextSize();
            org.telegram.ui.Components.hf hfVar2 = dg0Var.S;
            if (hfVar2 != null) {
                int[] iArr3 = this.f54360g0;
                hfVar2.getLocationOnScreen(iArr3);
                float paddingLeft = dg0Var.S.getPaddingLeft() + iArr3[0];
                int i13 = iArr3[1];
                float textSize2 = dg0Var.S.getTextSize();
                int i14 = iArr3[1];
                float f19 = i14;
                height = dg0Var.S.getMeasuredHeight() + i14;
                float T1 = org.telegram.messenger.g0.T1(paddingLeft, x10, dg0Var.E);
                float T12 = org.telegram.messenger.g0.T1((dg0Var.S.getPaddingTop() + i13) - dg0Var.S.getScrollY(), y10, dg0Var.E);
                float T13 = org.telegram.messenger.g0.T1(textSize2, textSize, dg0Var.E);
                f10 = textX;
                f12 = T12;
                f13 = f19;
                f14 = T13;
                f11 = T1;
            } else {
                ab.q qVar2 = dg0Var.m0;
                if (qVar2 != null) {
                    float[] fArr2 = (float[]) qVar2.f988b;
                    if (((boolean[]) qVar2.f989c)[0] && qVar2.f987a) {
                        f10 = textX;
                        i7 = 4;
                    } else {
                        ji.e eVar = (ji.e) ((androidx.activity.n) qVar2.d).d;
                        eVar.getLocationOnScreen(eVar.f18002r3);
                        int[] iArr4 = eVar.f18002r3;
                        f10 = textX;
                        fArr2[0] = iArr4[0] + eVar.O2;
                        int i15 = iArr4[1];
                        fArr2[1] = i15 + eVar.P2;
                        RectF rectF = eVar.f17969j0;
                        fArr2[2] = i15 + rectF.top;
                        fArr2[3] = i15 + rectF.bottom;
                        qVar2.f987a = true;
                        i7 = 4;
                    }
                    System.arraycopy(fArr2, 0, fArr, 0, i7);
                    float b10 = ((androidx.activity.n) dg0Var.m0.d).b();
                    f13 = fArr[2];
                    float f20 = fArr[c11];
                    float T14 = org.telegram.messenger.g0.T1(fArr[0], x10, dg0Var.E);
                    float T15 = org.telegram.messenger.g0.T1(fArr[1], y10, dg0Var.E);
                    height = f20;
                    f11 = T14;
                    f12 = T15;
                    f14 = org.telegram.messenger.g0.T1(b10, textSize, dg0Var.E);
                } else {
                    f10 = textX;
                    height = getHeight();
                    f11 = x10;
                    f12 = y10;
                    f13 = 0.0f;
                    f14 = textSize;
                }
            }
            float f21 = dg0Var.E;
            if (dg0Var.f47119v0 != null) {
                f13 = dg0Var.f47121w0;
            }
            float T16 = org.telegram.messenger.g0.T1(f13, ((1.0f - zf0Var.getScaleY()) * zf0Var.getHeight()) + zf0Var.getY(), dg0Var.E);
            if (zf0Var.canScrollVertically(-1)) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            float T17 = org.telegram.messenger.g0.T1(0.0f, f15, dg0Var.E);
            if (dg0Var.f47119v0 != null) {
                height = dg0Var.f47123x0;
            }
            float T18 = org.telegram.messenger.g0.T1(height, zf0Var.getY() + zf0Var.getHeight(), dg0Var.E);
            if (zf0Var.canScrollVertically(1)) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            float T19 = org.telegram.messenger.g0.T1(0.0f, f16, dg0Var.E);
            iArr = iArr2;
            float f22 = f10;
            canvas.saveLayerAlpha(0.0f, T16 + 1.0f, getWidth(), T18 - 1.0f, 255, 31);
            if (dg0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f21) * 255.0f), 31);
                canvas2.translate(f11, f12);
                canvas2.translate((-dg0Var.S.getX()) - dg0Var.S.getPaddingLeft(), ((-dg0Var.S.getY()) - dg0Var.S.getPaddingTop()) + dg0Var.S.getScrollY());
                float alpha = dg0Var.S.getAlpha();
                dg0Var.S.setAlpha(1.0f);
                if (dg0Var.E < 0.001f) {
                    if (dg0Var.V != null) {
                        canvas2.save();
                        canvas2.translate(0.0f, dg0Var.S.getY());
                        f17 = alpha;
                        canvas2.saveLayerAlpha(dg0Var.S.getX() + dg0Var.S.getPaddingLeft(), 0.0f, ((dg0Var.S.getX() + dg0Var.S.getPaddingLeft()) + dg0Var.S.getWidth()) - dg0Var.S.getPaddingRight(), dg0Var.S.getHeight(), (int) org.telegram.messenger.m10.y(dg0Var.E, 0.1f, 1.0f, 255.0f), 31);
                        dg0Var.V.a(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        f17 = alpha;
                        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Je, this.m0));
                        paint.setAlpha((int) org.telegram.messenger.m10.y(dg0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                        canvas2.drawRect(dg0Var.S.getPaddingLeft(), dg0Var.S.getY(), ((dg0Var.S.getX() + dg0Var.S.getPaddingLeft()) + dg0Var.S.getWidth()) - dg0Var.S.getPaddingRight(), dg0Var.S.getY() + dg0Var.S.getHeight(), paint);
                    }
                } else {
                    f17 = alpha;
                }
                org.telegram.ui.Components.d dVar = dg0Var.U;
                if (dVar != null) {
                    dVar.a(canvas2, new org.telegram.messenger.o10() {
                        @Override
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            dg0 dg0Var2 = yf0.this.f54366n0;
                            canvas3.translate(dg0Var2.S.getX(), dg0Var2.S.getY() - dg0Var2.S.getScrollY());
                            float textSize3 = f14 / dg0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, dg0Var2.S.getPaddingLeft(), dg0Var2.S.getPaddingTop());
                            dg0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                dg0Var.S.setAlpha(f17);
                canvas2.restore();
            } else {
                canvas2 = canvas;
                if (dg0Var.m0 != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f21) * 255.0f), 31);
                    canvas2.translate(f11, f12);
                    float b11 = f14 / ((androidx.activity.n) dg0Var.m0.d).b();
                    canvas2.scale(b11, b11);
                    ab.q qVar3 = dg0Var.m0;
                    if (!((boolean[]) qVar3.f989c)[0]) {
                        ji.e eVar2 = (ji.e) ((androidx.activity.n) qVar3.d).d;
                        StaticLayout staticLayout = eVar2.P0;
                        TextPaint textPaint2 = eVar2.d;
                        if (staticLayout != null) {
                            int alpha2 = textPaint2.getAlpha();
                            textPaint2.setAlpha(255);
                            eVar2.P0.draw(canvas2);
                            textPaint2.setAlpha(alpha2);
                        }
                    }
                    canvas2.restore();
                }
            }
            r10 = 1;
            dg0Var.Q.getTransitionParams().f32544y0 = true;
            org.telegram.ui.Cells.r1 r1Var2 = dg0Var.f47119v0;
            if (r1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f21 * 255.0f), 31);
                canvas2.translate(f11, f12);
                canvas2.translate(-f22, -f18);
                float T110 = org.telegram.messenger.g0.T1(1.0f, zf0Var.getScaleX(), dg0Var.E);
                canvas2.scale(T110, T110, (-dg0Var.Q.getX()) + zf0Var.getWidth(), (-dg0Var.Q.getY()) + zf0Var.getHeight());
                float f23 = f14 / textSize;
                canvas2.scale(f23, f23, f22, f18);
                if (dg0Var.Q.L0()) {
                    canvas2.save();
                    canvas2.translate(0.0f, dg0Var.Q.getPaddingTop());
                    dg0Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                }
                dg0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr5 = this.f54361h0;
                r1Var2.getLocationInWindow(iArr5);
                if (dg0Var.f47119v0.getParent() instanceof View) {
                    i10 = (int) ((View) dg0Var.f47119v0.getParent()).getTranslationY();
                } else {
                    i10 = 0;
                }
                int i16 = this.f54362i0;
                int[] iArr6 = this.f54363j0;
                if (i16 > i10 && iArr6[1] - iArr5[1] > i16) {
                    c12 = 0;
                } else {
                    c12 = 0;
                    iArr6[0] = iArr5[0];
                    iArr6[1] = iArr5[1];
                }
                this.f54362i0 = i10;
                float T111 = org.telegram.messenger.g0.T1(dg0Var.Q.getX() + zf0Var.getX(), iArr6[c12], 1.0f - dg0Var.E);
                float T112 = org.telegram.messenger.g0.T1(dg0Var.Q.getY() + zf0Var.getY(), iArr6[1], 1.0f - dg0Var.E);
                canvas2.save();
                canvas2.translate(T111, T112);
                float T113 = org.telegram.messenger.g0.T1(1.0f, zf0Var.getScaleX(), dg0Var.E);
                canvas2.scale(T113, T113, (-dg0Var.Q.getX()) + zf0Var.getWidth(), (-dg0Var.Q.getY()) + zf0Var.getHeight());
                dg0Var.Q.getTransitionParams().L1 = 1.0f - dg0Var.E;
                dg0Var.Q.getTransitionParams().f32475h0 = rect.left * dg0Var.E;
                dg0Var.Q.getTransitionParams().f32489k0 = rect.top * dg0Var.E;
                dg0Var.Q.getTransitionParams().f32480i0 = rect.right * dg0Var.E;
                org.telegram.ui.Cells.y1 transitionParams = dg0Var.Q.getTransitionParams();
                float f24 = dg0Var.E;
                transitionParams.f32485j0 = rect.bottom * f24;
                dg0Var.Q.setTimeAlpha(1.0f - f24);
                if (dg0Var.Q.L0()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, dg0Var.f47119v0.getWidth(), dg0Var.f47119v0.getHeight(), (int) (dg0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, dg0Var.Q.getPaddingTop());
                    dg0Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, dg0Var.f47119v0.getWidth(), dg0Var.f47119v0.getHeight(), (int) ((1.0f - dg0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, dg0Var.f47119v0.getPaddingTop());
                    dg0Var.f47119v0.M0(canvas2, true, false);
                    canvas2.restore();
                }
                dg0Var.Q.draw(canvas2);
                if (dg0Var.Q.getTransitionParams().f32540x0) {
                    dg0Var.Q.h1(canvas2, 1.0f);
                    dg0Var.Q.y1(1.0f - dg0Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, T16, getWidth(), org.telegram.messenger.g0.L(14.0f) + T16);
            org.telegram.ui.Components.i61 i61Var = this.f54364k0;
            i61Var.u(canvas2, rectF2, 1, T17);
            rectF2.set(0.0f, T18 - org.telegram.messenger.g0.L(14.0f), getWidth(), T18);
            i61Var.u(canvas2, rectF2, 3, T19);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            r10 = 1;
            iArr = iArr2;
        }
        if (dg0Var.f47120w) {
            if (dg0Var.f47124y) {
                dg0Var.o(r10, 1.0f);
                c10 = 0;
                dg0Var.f47124y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i17 = iArr[c10];
            int width = dg0Var.X.getWidth();
            dg0Var.X.getHeight();
            canvas2.translate(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(6.0f) + (i17 - (width - tf0Var.m())), dg0Var.X.getX(), dg0Var.E), org.telegram.messenger.g0.T1(iArr[r10], dg0Var.X.getY(), dg0Var.E));
            if (dg0Var.f47115s && dg0Var.f47113r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, dg0Var.X.getWidth(), dg0Var.X.getHeight(), (int) (dg0Var.E * 255.0f), 31);
            }
            dg0Var.X.draw(canvas2);
            if (dg0Var.f47115s && dg0Var.f47113r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (dg0Var.f47107l0 != null) {
            if (dg0Var.J == null) {
                dg0Var.J = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), 23, this, false);
            }
            Rect rect2 = org.telegram.messenger.g0.Q;
            rect2.set((int) ((dg0Var.f47107l0.right - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) ((dg0Var.f47107l0.bottom - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) (dg0Var.f47107l0.right - org.telegram.messenger.g0.L(12.0f)), (int) (dg0Var.f47107l0.bottom - org.telegram.messenger.g0.L(12.0f)));
            RectF rectF3 = org.telegram.messenger.g0.P;
            rectF3.set(rect2);
            rectF3.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(6.0f));
            float height2 = rectF3.height() / 2.0f;
            Paint paint2 = this.f54365l0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (dg0Var.J.e() * 30.0f * dg0Var.E));
            canvas2.drawRoundRect(rectF3, height2, height2, paint2);
            dg0Var.J.setBounds(rect2);
            org.telegram.ui.Components.m5 m5Var = dg0Var.J;
            m5Var.f37380w = (int) (dg0Var.E * 255.0f);
            m5Var.draw(canvas2);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        dg0 dg0Var = this.f54366n0;
        if (dg0Var.f47120w) {
            if (view != dg0Var.X) {
                org.telegram.ui.Cells.r1 r1Var = dg0Var.Q;
                if (view == r1Var && r1Var != null && r1Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
