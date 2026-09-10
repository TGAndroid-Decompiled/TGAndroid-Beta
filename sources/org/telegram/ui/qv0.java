package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.TextureView;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class qv0 extends FrameLayout {
    public final FrameLayout f36142a;
    public final TextureView f36143b;
    public final m4 f36144c;
    public final org.telegram.ui.Components.w9 d;
    public final rv0 e;

    public qv0(rv0 rv0Var, Context context) {
        super(context);
        this.e = rv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36142a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        m4 m4Var = new m4(context);
        this.f36144c = m4Var;
        m4Var.setBackgroundColor(0);
        frameLayout.addView(m4Var, w7.a6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f36143b = textureView;
        textureView.setOpaque(false);
        m4Var.addView(textureView, w7.a6.c(-1.0f, -1));
        addView(frameLayout, w7.a6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        rv0 rv0Var = this.e;
        float[] fArr = rv0Var.f36467m;
        uh.h hVar = rv0Var.f36464j;
        Path path = rv0Var.f36466l;
        if (rv0Var.f36468n && rv0Var.e != null && rv0Var.f36458a != null) {
            rv0Var.i();
            float left = rv0Var.f36469o - getLeft();
            float top = rv0Var.f36470p - getTop();
            canvas.save();
            float f11 = rv0Var.O;
            float f12 = rv0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, rv0Var.f36473s + left, rv0Var.f36474t + top);
            float f14 = rv0Var.J;
            float f15 = rv0Var.A;
            canvas.translate((f14 * f15) + left, (rv0Var.K * f15) + top);
            ImageReceiver imageReceiver = rv0Var.f36462g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = rv0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    rv0Var.B = f17;
                    if (f17 > 1.0f) {
                        rv0Var.B = 1.0f;
                    } else {
                        rv0Var.e();
                    }
                }
                rv0Var.f36462g.setAlpha(rv0Var.B);
            }
            float f18 = rv0Var.f36475u;
            float f19 = rv0Var.v;
            float f20 = rv0Var.f36476w;
            float f21 = rv0Var.f36478y;
            if (f20 == f21 && rv0Var.f36477x == rv0Var.f36479z) {
                f10 = 1.0f;
            } else {
                if (f13 < 1.0f) {
                    f7 = 0.0f;
                } else if (f13 < 1.4f) {
                    f7 = (f13 - 1.0f) / 0.4f;
                } else {
                    f7 = 1.0f;
                }
                f10 = 1.0f;
                float f22 = rv0Var.f36479z;
                float f23 = rv0Var.f36477x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = rv0Var.f36461f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!rv0Var.R) {
                ImageReceiver imageReceiver3 = rv0Var.f36461f;
                if (imageReceiver3 != null) {
                    if (rv0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || rv0Var.f36461f.getAnimation() != null || rv0Var.f36462g.getLottieAnimation() != null || rv0Var.f36462g.getAnimation() != null) {
                            invalidate();
                        }
                        rv0Var.f36461f.draw(canvas);
                        rv0Var.f36462g.setImageCoords(rv0Var.f36461f.getImageX(), rv0Var.f36461f.getImageY(), rv0Var.f36461f.getImageWidth(), rv0Var.f36461f.getImageHeight());
                        rv0Var.f36462g.draw(canvas);
                    } else {
                        rv0Var.f36462g.setImageCoords(imageReceiver3.getImageX(), rv0Var.f36461f.getImageY(), rv0Var.f36461f.getImageWidth(), rv0Var.f36461f.getImageHeight());
                        rv0Var.f36462g.draw(canvas);
                        if (rv0Var.f36462g.getLottieAnimation() != null || rv0Var.f36462g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = rv0Var.f36473s - rv0Var.f36475u;
                FrameLayout frameLayout = this.f36142a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(rv0Var.f36474t - rv0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((rv0Var.J * f13 * rv0Var.A) + f18 + left);
                frameLayout.setTranslationY((rv0Var.K * f13 * rv0Var.A) + f19 + top);
            }
            if (rv0Var.f36463i) {
                rv0Var.h.setAlpha(rv0Var.f36461f.getAlpha());
                rv0Var.h.setRoundRadius(rv0Var.f36461f.getRoundRadius(true));
                rv0Var.h.setImageCoords(rv0Var.f36461f.getImageX(), rv0Var.f36461f.getImageY(), rv0Var.f36461f.getImageWidth(), rv0Var.f36461f.getImageHeight());
                rv0Var.h.draw(canvas);
                int[] roundRadius = rv0Var.f36461f.getRoundRadius(true);
                float f27 = roundRadius[0];
                fArr[1] = f27;
                fArr[0] = f27;
                float f28 = roundRadius[1];
                fArr[3] = f28;
                fArr[2] = f28;
                float f29 = roundRadius[2];
                fArr[5] = f29;
                fArr[4] = f29;
                float f30 = roundRadius[3];
                fArr[7] = f30;
                fArr[6] = f30;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rv0Var.f36461f.getImageX(), rv0Var.f36461f.getImageY(), rv0Var.f36461f.getImageX2(), rv0Var.f36461f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (rv0Var.f36465k != null) {
                    canvas.translate(rv0Var.f36461f.getImageX(), rv0Var.f36461f.getImageY());
                    rv0Var.f36465k.c(canvas, rv0Var.d, (int) rv0Var.f36461f.getImageWidth(), (int) rv0Var.f36461f.getImageHeight(), 1.0f, false);
                } else {
                    hVar.h(i0.a.k(-1, (int) (rv0Var.f36461f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    hVar.setBounds((int) rv0Var.f36461f.getImageX(), (int) rv0Var.f36461f.getImageY(), (int) rv0Var.f36461f.getImageX2(), (int) rv0Var.f36461f.getImageY2());
                    hVar.draw(canvas);
                }
                canvas.restore();
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        ov0 ov0Var;
        rv0 rv0Var = this.e;
        float[] fArr = rv0Var.Q;
        if (rv0Var.C == null) {
            float f10 = rv0Var.P;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                rv0Var.P = f11;
                if (f11 > 1.0f) {
                    rv0Var.P = 1.0f;
                } else {
                    rv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.wr.f28819f.getInterpolation(rv0Var.P) * rv0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f12 = 0.0f;
        if (interpolation != 1.0f && (ov0Var = rv0Var.F) != null) {
            ov0Var.h(fArr);
            canvas.save();
            float f13 = 1.0f - interpolation;
            float f14 = fArr[0] * f13;
            float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f7 = measuredHeight2;
            f12 = f14;
        } else {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = measuredHeight;
        }
        rv0Var.c(canvas, 1.0f - interpolation, rv0Var.f36469o - getLeft(), rv0Var.f36470p - getTop(), f12, f7);
    }
}
