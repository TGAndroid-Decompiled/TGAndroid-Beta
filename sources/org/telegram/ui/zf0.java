package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class zf0 extends org.telegram.ui.Components.du0 {
    public final int[] f54543g0;
    public final int[] f54544h0;
    public int f54545i0;
    public final int[] f54546j0;
    public final h6.m f54547k0;
    public final Paint f54548l0;
    public final org.telegram.ui.ActionBar.h6 m0;
    public final eg0 f54549n0;

    public zf0(eg0 eg0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null);
        this.f54549n0 = eg0Var;
        this.m0 = h6Var;
        this.f54543g0 = new int[2];
        this.f54544h0 = new int[2];
        this.f54545i0 = 0;
        this.f54546j0 = new int[2];
        this.f54547k0 = new h6.m(29);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37961f;
        this.f54548l0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        final Canvas canvas2;
        ?? r10;
        int[] iArr;
        char c10;
        uf0 uf0Var;
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
        eg0 eg0Var = this.f54549n0;
        int[] iArr2 = eg0Var.f47286r0;
        Paint paint = eg0Var.T;
        float[] fArr = eg0Var.f47288s0;
        Rect rect = eg0Var.f47297y0;
        ag0 ag0Var = eg0Var.K;
        if (eg0Var.f47292w && (r1Var = eg0Var.Q) != null && r1Var.getCurrentPosition() == null) {
            if (eg0Var.f47294x) {
                org.telegram.ui.Components.gf gfVar = eg0Var.S;
                if (gfVar != null) {
                    gfVar.setAlpha(0.0f);
                } else {
                    ab.q qVar = eg0Var.m0;
                    if (qVar != null) {
                        qVar.C(true);
                    }
                }
                eg0Var.f47294x = false;
            }
            if (eg0Var.Q.getMessageObject() != null && eg0Var.Q.getMessageObject().D == 15) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                textX = eg0Var.Q.getPhotoImage().L0;
            } else {
                textX = eg0Var.Q.getTextX();
            }
            if (z10) {
                textY = eg0Var.Q.getPhotoImage().M0;
            } else {
                textY = eg0Var.Q.getTextY();
            }
            float x10 = eg0Var.Q.getX() + ag0Var.getX() + textX;
            float y10 = eg0Var.Q.getY() + ag0Var.getY() + textY;
            float f18 = textY;
            if (eg0Var.Q.getMessageObject() != null) {
                org.telegram.messenger.gj messageObject = eg0Var.Q.getMessageObject();
                c11 = 3;
                if (messageObject.P1 >= 1 && messageObject.f24213k != null && !messageObject.u2()) {
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
                            TextPaint[] textPaintArr = org.telegram.ui.ActionBar.m6.f29769y2;
                            if (z11) {
                                textPaint = textPaintArr[0];
                                break;
                            } else {
                                textPaint = textPaintArr[2];
                                break;
                            }
                        case 3:
                            TextPaint[] textPaintArr2 = org.telegram.ui.ActionBar.m6.f29769y2;
                            if (z11) {
                                textPaint = textPaintArr2[1];
                                break;
                            } else {
                                textPaint = textPaintArr2[3];
                                break;
                            }
                        case 4:
                            TextPaint[] textPaintArr3 = org.telegram.ui.ActionBar.m6.f29769y2;
                            if (z11) {
                                textPaint = textPaintArr3[2];
                                break;
                            } else {
                                textPaint = textPaintArr3[4];
                                break;
                            }
                        case 5:
                            TextPaint[] textPaintArr4 = org.telegram.ui.ActionBar.m6.f29769y2;
                            if (z11) {
                                textPaint = textPaintArr4[3];
                                break;
                            } else {
                                textPaint = textPaintArr4[5];
                                break;
                            }
                        case 6:
                            TextPaint[] textPaintArr5 = org.telegram.ui.ActionBar.m6.f29769y2;
                            if (z11) {
                                textPaint = textPaintArr5[4];
                                break;
                            } else {
                                textPaint = textPaintArr5[5];
                                break;
                            }
                        default:
                            textPaint = org.telegram.ui.ActionBar.m6.f29769y2[5];
                            break;
                    }
                } else {
                    textPaint = org.telegram.ui.ActionBar.m6.f29578o2;
                }
            } else {
                c11 = 3;
                textPaint = org.telegram.ui.ActionBar.m6.f29578o2;
            }
            float textSize = textPaint.getTextSize();
            org.telegram.ui.Components.gf gfVar2 = eg0Var.S;
            if (gfVar2 != null) {
                int[] iArr3 = this.f54543g0;
                gfVar2.getLocationOnScreen(iArr3);
                float paddingLeft = eg0Var.S.getPaddingLeft() + iArr3[0];
                int i13 = iArr3[1];
                float textSize2 = eg0Var.S.getTextSize();
                int i14 = iArr3[1];
                float f19 = i14;
                height = eg0Var.S.getMeasuredHeight() + i14;
                float T1 = org.telegram.messenger.g0.T1(paddingLeft, x10, eg0Var.E);
                float T12 = org.telegram.messenger.g0.T1((eg0Var.S.getPaddingTop() + i13) - eg0Var.S.getScrollY(), y10, eg0Var.E);
                float T13 = org.telegram.messenger.g0.T1(textSize2, textSize, eg0Var.E);
                f10 = textX;
                f12 = T12;
                f13 = f19;
                f14 = T13;
                f11 = T1;
            } else {
                ab.q qVar2 = eg0Var.m0;
                if (qVar2 != null) {
                    float[] fArr2 = (float[]) qVar2.f988b;
                    if (((boolean[]) qVar2.f989c)[0] && qVar2.f987a) {
                        f10 = textX;
                        i7 = 4;
                    } else {
                        ji.e eVar = (ji.e) ((androidx.activity.n) qVar2.d).d;
                        eVar.getLocationOnScreen(eVar.f17934r3);
                        int[] iArr4 = eVar.f17934r3;
                        f10 = textX;
                        fArr2[0] = iArr4[0] + eVar.O2;
                        int i15 = iArr4[1];
                        fArr2[1] = i15 + eVar.P2;
                        RectF rectF = eVar.f17901j0;
                        fArr2[2] = i15 + rectF.top;
                        fArr2[3] = i15 + rectF.bottom;
                        qVar2.f987a = true;
                        i7 = 4;
                    }
                    System.arraycopy(fArr2, 0, fArr, 0, i7);
                    float b10 = ((androidx.activity.n) eg0Var.m0.d).b();
                    f13 = fArr[2];
                    float f20 = fArr[c11];
                    float T14 = org.telegram.messenger.g0.T1(fArr[0], x10, eg0Var.E);
                    float T15 = org.telegram.messenger.g0.T1(fArr[1], y10, eg0Var.E);
                    height = f20;
                    f11 = T14;
                    f12 = T15;
                    f14 = org.telegram.messenger.g0.T1(b10, textSize, eg0Var.E);
                } else {
                    f10 = textX;
                    height = getHeight();
                    f11 = x10;
                    f12 = y10;
                    f13 = 0.0f;
                    f14 = textSize;
                }
            }
            float f21 = eg0Var.E;
            if (eg0Var.f47291v0 != null) {
                f13 = eg0Var.f47293w0;
            }
            float T16 = org.telegram.messenger.g0.T1(f13, ((1.0f - ag0Var.getScaleY()) * ag0Var.getHeight()) + ag0Var.getY(), eg0Var.E);
            if (ag0Var.canScrollVertically(-1)) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            float T17 = org.telegram.messenger.g0.T1(0.0f, f15, eg0Var.E);
            if (eg0Var.f47291v0 != null) {
                height = eg0Var.f47295x0;
            }
            float T18 = org.telegram.messenger.g0.T1(height, ag0Var.getY() + ag0Var.getHeight(), eg0Var.E);
            if (ag0Var.canScrollVertically(1)) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            float T19 = org.telegram.messenger.g0.T1(0.0f, f16, eg0Var.E);
            iArr = iArr2;
            float f22 = f10;
            canvas.saveLayerAlpha(0.0f, T16 + 1.0f, getWidth(), T18 - 1.0f, 255, 31);
            if (eg0Var.S != null) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f21) * 255.0f), 31);
                canvas2.translate(f11, f12);
                canvas2.translate((-eg0Var.S.getX()) - eg0Var.S.getPaddingLeft(), ((-eg0Var.S.getY()) - eg0Var.S.getPaddingTop()) + eg0Var.S.getScrollY());
                float alpha = eg0Var.S.getAlpha();
                eg0Var.S.setAlpha(1.0f);
                if (eg0Var.E < 0.001f) {
                    if (eg0Var.V != null) {
                        canvas2.save();
                        canvas2.translate(0.0f, eg0Var.S.getY());
                        f17 = alpha;
                        canvas2.saveLayerAlpha(eg0Var.S.getX() + eg0Var.S.getPaddingLeft(), 0.0f, ((eg0Var.S.getX() + eg0Var.S.getPaddingLeft()) + eg0Var.S.getWidth()) - eg0Var.S.getPaddingRight(), eg0Var.S.getHeight(), (int) org.telegram.messenger.o10.y(eg0Var.E, 0.1f, 1.0f, 255.0f), 31);
                        eg0Var.V.a(canvas2);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        f17 = alpha;
                        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Je, this.m0));
                        paint.setAlpha((int) org.telegram.messenger.o10.y(eg0Var.E, 0.1f, 1.0f, paint.getAlpha()));
                        canvas2.drawRect(eg0Var.S.getPaddingLeft(), eg0Var.S.getY(), ((eg0Var.S.getX() + eg0Var.S.getPaddingLeft()) + eg0Var.S.getWidth()) - eg0Var.S.getPaddingRight(), eg0Var.S.getY() + eg0Var.S.getHeight(), paint);
                    }
                } else {
                    f17 = alpha;
                }
                org.telegram.ui.Components.d dVar = eg0Var.U;
                if (dVar != null) {
                    dVar.a(canvas2, new org.telegram.messenger.q10() {
                        @Override
                        public final Object run() {
                            Canvas canvas3 = canvas2;
                            canvas3.save();
                            eg0 eg0Var2 = zf0.this.f54549n0;
                            canvas3.translate(eg0Var2.S.getX(), eg0Var2.S.getY() - eg0Var2.S.getScrollY());
                            float textSize3 = f14 / eg0Var2.S.getTextSize();
                            canvas3.scale(textSize3, textSize3, eg0Var2.S.getPaddingLeft(), eg0Var2.S.getPaddingTop());
                            eg0Var2.S.draw(canvas3);
                            canvas3.restore();
                            return Boolean.TRUE;
                        }
                    });
                }
                eg0Var.S.setAlpha(f17);
                canvas2.restore();
            } else {
                canvas2 = canvas;
                if (eg0Var.m0 != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f21) * 255.0f), 31);
                    canvas2.translate(f11, f12);
                    float b11 = f14 / ((androidx.activity.n) eg0Var.m0.d).b();
                    canvas2.scale(b11, b11);
                    ab.q qVar3 = eg0Var.m0;
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
            eg0Var.Q.getTransitionParams().f32477y0 = true;
            org.telegram.ui.Cells.r1 r1Var2 = eg0Var.f47291v0;
            if (r1Var2 == null) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f21 * 255.0f), 31);
                canvas2.translate(f11, f12);
                canvas2.translate(-f22, -f18);
                float T110 = org.telegram.messenger.g0.T1(1.0f, ag0Var.getScaleX(), eg0Var.E);
                canvas2.scale(T110, T110, (-eg0Var.Q.getX()) + ag0Var.getWidth(), (-eg0Var.Q.getY()) + ag0Var.getHeight());
                float f23 = f14 / textSize;
                canvas2.scale(f23, f23, f22, f18);
                if (eg0Var.Q.L0()) {
                    canvas2.save();
                    canvas2.translate(0.0f, eg0Var.Q.getPaddingTop());
                    eg0Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                }
                eg0Var.Q.draw(canvas2);
                canvas2.restore();
            } else {
                int[] iArr5 = this.f54544h0;
                r1Var2.getLocationInWindow(iArr5);
                if (eg0Var.f47291v0.getParent() instanceof View) {
                    i10 = (int) ((View) eg0Var.f47291v0.getParent()).getTranslationY();
                } else {
                    i10 = 0;
                }
                int i16 = this.f54545i0;
                int[] iArr6 = this.f54546j0;
                if (i16 > i10 && iArr6[1] - iArr5[1] > i16) {
                    c12 = 0;
                } else {
                    c12 = 0;
                    iArr6[0] = iArr5[0];
                    iArr6[1] = iArr5[1];
                }
                this.f54545i0 = i10;
                float T111 = org.telegram.messenger.g0.T1(eg0Var.Q.getX() + ag0Var.getX(), iArr6[c12], 1.0f - eg0Var.E);
                float T112 = org.telegram.messenger.g0.T1(eg0Var.Q.getY() + ag0Var.getY(), iArr6[1], 1.0f - eg0Var.E);
                canvas2.save();
                canvas2.translate(T111, T112);
                float T113 = org.telegram.messenger.g0.T1(1.0f, ag0Var.getScaleX(), eg0Var.E);
                canvas2.scale(T113, T113, (-eg0Var.Q.getX()) + ag0Var.getWidth(), (-eg0Var.Q.getY()) + ag0Var.getHeight());
                eg0Var.Q.getTransitionParams().L1 = 1.0f - eg0Var.E;
                eg0Var.Q.getTransitionParams().f32408h0 = rect.left * eg0Var.E;
                eg0Var.Q.getTransitionParams().f32422k0 = rect.top * eg0Var.E;
                eg0Var.Q.getTransitionParams().f32413i0 = rect.right * eg0Var.E;
                org.telegram.ui.Cells.y1 transitionParams = eg0Var.Q.getTransitionParams();
                float f24 = eg0Var.E;
                transitionParams.f32418j0 = rect.bottom * f24;
                eg0Var.Q.setTimeAlpha(1.0f - f24);
                if (eg0Var.Q.L0()) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, eg0Var.f47291v0.getWidth(), eg0Var.f47291v0.getHeight(), (int) (eg0Var.E * 255.0f), 31);
                    canvas2.translate(0.0f, eg0Var.Q.getPaddingTop());
                    eg0Var.Q.M0(canvas2, true, false);
                    canvas2.restore();
                    canvas2.saveLayerAlpha(0.0f, 0.0f, eg0Var.f47291v0.getWidth(), eg0Var.f47291v0.getHeight(), (int) ((1.0f - eg0Var.E) * 255.0f), 31);
                    canvas2.translate(0.0f, eg0Var.f47291v0.getPaddingTop());
                    eg0Var.f47291v0.M0(canvas2, true, false);
                    canvas2.restore();
                }
                eg0Var.Q.draw(canvas2);
                if (eg0Var.Q.getTransitionParams().f32473x0) {
                    eg0Var.Q.h1(canvas2, 1.0f);
                    eg0Var.Q.y1(1.0f - eg0Var.E, canvas2, true);
                }
                canvas2.restore();
            }
            canvas2.save();
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, T16, getWidth(), org.telegram.messenger.g0.L(14.0f) + T16);
            h6.m mVar = this.f54547k0;
            mVar.n(canvas2, rectF2, 1, T17);
            rectF2.set(0.0f, T18 - org.telegram.messenger.g0.L(14.0f), getWidth(), T18);
            mVar.n(canvas2, rectF2, 3, T19);
            canvas2.restore();
            canvas2.restore();
        } else {
            canvas2 = canvas;
            r10 = 1;
            iArr = iArr2;
        }
        if (eg0Var.f47292w) {
            if (eg0Var.f47296y) {
                eg0Var.o(r10, 1.0f);
                c10 = 0;
                eg0Var.f47296y = false;
            } else {
                c10 = 0;
            }
            canvas2.save();
            int i17 = iArr[c10];
            int width = eg0Var.X.getWidth();
            eg0Var.X.getHeight();
            canvas2.translate(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(6.0f) + (i17 - (width - uf0Var.m())), eg0Var.X.getX(), eg0Var.E), org.telegram.messenger.g0.T1(iArr[r10], eg0Var.X.getY(), eg0Var.E));
            if (eg0Var.f47287s && eg0Var.f47285r) {
                canvas2.saveLayerAlpha(0.0f, 0.0f, eg0Var.X.getWidth(), eg0Var.X.getHeight(), (int) (eg0Var.E * 255.0f), 31);
            }
            eg0Var.X.draw(canvas2);
            if (eg0Var.f47287s && eg0Var.f47285r) {
                canvas2.restore();
            }
            canvas2.restore();
        }
        super.dispatchDraw(canvas);
        if (eg0Var.f47279l0 != null) {
            if (eg0Var.J == null) {
                eg0Var.J = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), 23, this, false);
            }
            Rect rect2 = org.telegram.messenger.g0.Q;
            rect2.set((int) ((eg0Var.f47279l0.right - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) ((eg0Var.f47279l0.bottom - org.telegram.messenger.g0.L(12.0f)) - org.telegram.messenger.g0.L(24.0f)), (int) (eg0Var.f47279l0.right - org.telegram.messenger.g0.L(12.0f)), (int) (eg0Var.f47279l0.bottom - org.telegram.messenger.g0.L(12.0f)));
            RectF rectF3 = org.telegram.messenger.g0.P;
            rectF3.set(rect2);
            rectF3.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(6.0f));
            float height2 = rectF3.height() / 2.0f;
            Paint paint2 = this.f54548l0;
            paint2.setColor(503316480);
            paint2.setAlpha((int) (eg0Var.J.e() * 30.0f * eg0Var.E));
            canvas2.drawRoundRect(rectF3, height2, height2, paint2);
            eg0Var.J.setBounds(rect2);
            org.telegram.ui.Components.n5 n5Var = eg0Var.J;
            n5Var.f37782w = (int) (eg0Var.E * 255.0f);
            n5Var.draw(canvas2);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        eg0 eg0Var = this.f54549n0;
        if (eg0Var.f47292w) {
            if (view != eg0Var.X) {
                org.telegram.ui.Cells.r1 r1Var = eg0Var.Q;
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
