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
public final class vv0 extends FrameLayout {
    public final FrameLayout f41088a;
    public final TextureView f41089b;
    public final n4 f41090c;
    public final org.telegram.ui.Components.z9 d;
    public final wv0 e;

    public vv0(wv0 wv0Var, Context context) {
        super(context);
        this.e = wv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41088a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.d = z9Var;
        frameLayout.addView(z9Var);
        frameLayout.setWillNotDraw(false);
        n4 n4Var = new n4(context);
        this.f41090c = n4Var;
        n4Var.setBackgroundColor(0);
        frameLayout.addView(n4Var, w7.a6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f41089b = textureView;
        textureView.setOpaque(false);
        n4Var.addView(textureView, w7.a6.d(-1.0f, -1));
        addView(frameLayout, w7.a6.d(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        wv0 wv0Var = this.e;
        float[] fArr = wv0Var.f41673m;
        wh.g gVar = wv0Var.f41670j;
        Path path = wv0Var.f41672l;
        if (wv0Var.f41674n && wv0Var.e != null && wv0Var.f41664a != null) {
            wv0Var.i();
            float left = wv0Var.f41675o - getLeft();
            float top = wv0Var.f41676p - getTop();
            canvas.save();
            float f11 = wv0Var.O;
            float f12 = wv0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, wv0Var.f41679s + left, wv0Var.f41680t + top);
            float f14 = wv0Var.J;
            float f15 = wv0Var.A;
            canvas.translate((f14 * f15) + left, (wv0Var.K * f15) + top);
            ImageReceiver imageReceiver = wv0Var.f41668g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = wv0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    wv0Var.B = f17;
                    if (f17 > 1.0f) {
                        wv0Var.B = 1.0f;
                    } else {
                        wv0Var.e();
                    }
                }
                wv0Var.f41668g.setAlpha(wv0Var.B);
            }
            float f18 = wv0Var.f41681u;
            float f19 = wv0Var.v;
            float f20 = wv0Var.f41682w;
            float f21 = wv0Var.f41684y;
            if (f20 == f21 && wv0Var.f41683x == wv0Var.f41685z) {
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
                float f22 = wv0Var.f41685z;
                float f23 = wv0Var.f41683x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = wv0Var.f41667f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!wv0Var.R) {
                ImageReceiver imageReceiver3 = wv0Var.f41667f;
                if (imageReceiver3 != null) {
                    if (wv0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || wv0Var.f41667f.getAnimation() != null || wv0Var.f41668g.getLottieAnimation() != null || wv0Var.f41668g.getAnimation() != null) {
                            invalidate();
                        }
                        wv0Var.f41667f.draw(canvas);
                        wv0Var.f41668g.setImageCoords(wv0Var.f41667f.getImageX(), wv0Var.f41667f.getImageY(), wv0Var.f41667f.getImageWidth(), wv0Var.f41667f.getImageHeight());
                        wv0Var.f41668g.draw(canvas);
                    } else {
                        wv0Var.f41668g.setImageCoords(imageReceiver3.getImageX(), wv0Var.f41667f.getImageY(), wv0Var.f41667f.getImageWidth(), wv0Var.f41667f.getImageHeight());
                        wv0Var.f41668g.draw(canvas);
                        if (wv0Var.f41668g.getLottieAnimation() != null || wv0Var.f41668g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = wv0Var.f41679s - wv0Var.f41681u;
                FrameLayout frameLayout = this.f41088a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(wv0Var.f41680t - wv0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((wv0Var.J * f13 * wv0Var.A) + f18 + left);
                frameLayout.setTranslationY((wv0Var.K * f13 * wv0Var.A) + f19 + top);
            }
            if (wv0Var.f41669i) {
                wv0Var.h.setAlpha(wv0Var.f41667f.getAlpha());
                wv0Var.h.setRoundRadius(wv0Var.f41667f.getRoundRadius(true));
                wv0Var.h.setImageCoords(wv0Var.f41667f.getImageX(), wv0Var.f41667f.getImageY(), wv0Var.f41667f.getImageWidth(), wv0Var.f41667f.getImageHeight());
                wv0Var.h.draw(canvas);
                int[] roundRadius = wv0Var.f41667f.getRoundRadius(true);
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
                rectF.set(wv0Var.f41667f.getImageX(), wv0Var.f41667f.getImageY(), wv0Var.f41667f.getImageX2(), wv0Var.f41667f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (wv0Var.f41671k != null) {
                    canvas.translate(wv0Var.f41667f.getImageX(), wv0Var.f41667f.getImageY());
                    wv0Var.f41671k.c(canvas, wv0Var.d, (int) wv0Var.f41667f.getImageWidth(), (int) wv0Var.f41667f.getImageHeight(), 1.0f, false);
                } else {
                    gVar.h(i0.a.k(-1, (int) (wv0Var.f41667f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) wv0Var.f41667f.getImageX(), (int) wv0Var.f41667f.getImageY(), (int) wv0Var.f41667f.getImageX2(), (int) wv0Var.f41667f.getImageY2());
                    gVar.draw(canvas);
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
        float f10;
        tv0 tv0Var;
        wv0 wv0Var = this.e;
        float[] fArr = wv0Var.Q;
        if (wv0Var.C == null) {
            float f11 = wv0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                wv0Var.P = f12;
                if (f12 > 1.0f) {
                    wv0Var.P = 1.0f;
                } else {
                    wv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.es.f24771f.getInterpolation(wv0Var.P) * wv0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation != 1.0f && (tv0Var = wv0Var.F) != null) {
            tv0Var.b(fArr);
            canvas.save();
            float f13 = 1.0f - interpolation;
            float f14 = fArr[0] * f13;
            float measuredHeight2 = (fArr[1] * f13) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f14, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f10 = measuredHeight2;
            f7 = f14;
        } else {
            a(canvas);
            super.dispatchDraw(canvas);
            f7 = 0.0f;
            f10 = measuredHeight;
        }
        wv0Var.c(canvas, 1.0f - interpolation, wv0Var.f41675o - getLeft(), wv0Var.f41676p - getTop(), f7, f10);
    }
}
