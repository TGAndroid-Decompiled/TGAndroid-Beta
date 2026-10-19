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
public final class uu0 extends FrameLayout {
    public final FrameLayout f42049a;
    public final TextureView f42050b;
    public final o4 f42051c;
    public final org.telegram.ui.Components.w9 d;
    public final vu0 e;

    public uu0(vu0 vu0Var, Context context) {
        super(context);
        this.e = vu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42049a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        o4 o4Var = new o4(context);
        this.f42051c = o4Var;
        o4Var.setBackgroundColor(0);
        frameLayout.addView(o4Var, w7.z5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f42050b = textureView;
        textureView.setOpaque(false);
        o4Var.addView(textureView, w7.z5.c(-1.0f, -1));
        addView(frameLayout, w7.z5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        vu0 vu0Var = this.e;
        float[] fArr = vu0Var.f42380m;
        wh.g gVar = vu0Var.f42377j;
        Path path = vu0Var.f42379l;
        if (vu0Var.f42381n && vu0Var.e != null && vu0Var.f42371a != null) {
            vu0Var.i();
            float left = vu0Var.f42382o - getLeft();
            float top = vu0Var.f42383p - getTop();
            canvas.save();
            float f11 = vu0Var.O;
            float f12 = vu0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, vu0Var.f42386s + left, vu0Var.f42387t + top);
            float f14 = vu0Var.J;
            float f15 = vu0Var.A;
            canvas.translate((f14 * f15) + left, (vu0Var.K * f15) + top);
            ImageReceiver imageReceiver = vu0Var.f42375g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = vu0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    vu0Var.B = f17;
                    if (f17 > 1.0f) {
                        vu0Var.B = 1.0f;
                    } else {
                        vu0Var.e();
                    }
                }
                vu0Var.f42375g.setAlpha(vu0Var.B);
            }
            float f18 = vu0Var.f42388u;
            float f19 = vu0Var.v;
            float f20 = vu0Var.f42389w;
            float f21 = vu0Var.f42391y;
            if (f20 == f21 && vu0Var.f42390x == vu0Var.f42392z) {
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
                float f22 = vu0Var.f42392z;
                float f23 = vu0Var.f42390x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = vu0Var.f42374f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!vu0Var.R) {
                ImageReceiver imageReceiver3 = vu0Var.f42374f;
                if (imageReceiver3 != null) {
                    if (vu0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || vu0Var.f42374f.getAnimation() != null || vu0Var.f42375g.getLottieAnimation() != null || vu0Var.f42375g.getAnimation() != null) {
                            invalidate();
                        }
                        vu0Var.f42374f.draw(canvas);
                        vu0Var.f42375g.setImageCoords(vu0Var.f42374f.getImageX(), vu0Var.f42374f.getImageY(), vu0Var.f42374f.getImageWidth(), vu0Var.f42374f.getImageHeight());
                        vu0Var.f42375g.draw(canvas);
                    } else {
                        vu0Var.f42375g.setImageCoords(imageReceiver3.getImageX(), vu0Var.f42374f.getImageY(), vu0Var.f42374f.getImageWidth(), vu0Var.f42374f.getImageHeight());
                        vu0Var.f42375g.draw(canvas);
                        if (vu0Var.f42375g.getLottieAnimation() != null || vu0Var.f42375g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = vu0Var.f42386s - vu0Var.f42388u;
                FrameLayout frameLayout = this.f42049a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(vu0Var.f42387t - vu0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((vu0Var.J * f13 * vu0Var.A) + f18 + left);
                frameLayout.setTranslationY((vu0Var.K * f13 * vu0Var.A) + f19 + top);
            }
            if (vu0Var.f42376i) {
                vu0Var.h.setAlpha(vu0Var.f42374f.getAlpha());
                vu0Var.h.setRoundRadius(vu0Var.f42374f.getRoundRadius(true));
                vu0Var.h.setImageCoords(vu0Var.f42374f.getImageX(), vu0Var.f42374f.getImageY(), vu0Var.f42374f.getImageWidth(), vu0Var.f42374f.getImageHeight());
                vu0Var.h.draw(canvas);
                int[] roundRadius = vu0Var.f42374f.getRoundRadius(true);
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
                rectF.set(vu0Var.f42374f.getImageX(), vu0Var.f42374f.getImageY(), vu0Var.f42374f.getImageX2(), vu0Var.f42374f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (vu0Var.f42378k != null) {
                    canvas.translate(vu0Var.f42374f.getImageX(), vu0Var.f42374f.getImageY());
                    vu0Var.f42378k.c(canvas, vu0Var.d, (int) vu0Var.f42374f.getImageWidth(), (int) vu0Var.f42374f.getImageHeight(), 1.0f, false);
                } else {
                    gVar.h(i0.a.o(-1, (int) (vu0Var.f42374f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) vu0Var.f42374f.getImageX(), (int) vu0Var.f42374f.getImageY(), (int) vu0Var.f42374f.getImageX2(), (int) vu0Var.f42374f.getImageY2());
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
        su0 su0Var;
        vu0 vu0Var = this.e;
        float[] fArr = vu0Var.Q;
        if (vu0Var.C == null) {
            float f11 = vu0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                vu0Var.P = f12;
                if (f12 > 1.0f) {
                    vu0Var.P = 1.0f;
                } else {
                    vu0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.bs.f25014f.getInterpolation(vu0Var.P) * vu0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation != 1.0f && (su0Var = vu0Var.F) != null) {
            su0Var.b(fArr);
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
        vu0Var.c(canvas, 1.0f - interpolation, vu0Var.f42382o - getLeft(), vu0Var.f42383p - getTop(), f7, f10);
    }
}
