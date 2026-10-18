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
public final class wu0 extends FrameLayout {
    public final FrameLayout f42956a;
    public final TextureView f42957b;
    public final o4 f42958c;
    public final org.telegram.ui.Components.w9 d;
    public final xu0 e;

    public wu0(xu0 xu0Var, Context context) {
        super(context);
        this.e = xu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42956a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        o4 o4Var = new o4(context);
        this.f42958c = o4Var;
        o4Var.setBackgroundColor(0);
        frameLayout.addView(o4Var, w7.z5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f42957b = textureView;
        textureView.setOpaque(false);
        o4Var.addView(textureView, w7.z5.d(-1.0f, -1));
        addView(frameLayout, w7.z5.d(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        xu0 xu0Var = this.e;
        float[] fArr = xu0Var.f43289m;
        wh.g gVar = xu0Var.f43286j;
        Path path = xu0Var.f43288l;
        if (xu0Var.f43290n && xu0Var.e != null && xu0Var.f43280a != null) {
            xu0Var.i();
            float left = xu0Var.f43291o - getLeft();
            float top = xu0Var.f43292p - getTop();
            canvas.save();
            float f11 = xu0Var.O;
            float f12 = xu0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, xu0Var.f43295s + left, xu0Var.f43296t + top);
            float f14 = xu0Var.J;
            float f15 = xu0Var.A;
            canvas.translate((f14 * f15) + left, (xu0Var.K * f15) + top);
            ImageReceiver imageReceiver = xu0Var.f43284g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = xu0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    xu0Var.B = f17;
                    if (f17 > 1.0f) {
                        xu0Var.B = 1.0f;
                    } else {
                        xu0Var.e();
                    }
                }
                xu0Var.f43284g.setAlpha(xu0Var.B);
            }
            float f18 = xu0Var.f43297u;
            float f19 = xu0Var.v;
            float f20 = xu0Var.f43298w;
            float f21 = xu0Var.f43300y;
            if (f20 == f21 && xu0Var.f43299x == xu0Var.f43301z) {
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
                float f22 = xu0Var.f43301z;
                float f23 = xu0Var.f43299x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = xu0Var.f43283f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!xu0Var.R) {
                ImageReceiver imageReceiver3 = xu0Var.f43283f;
                if (imageReceiver3 != null) {
                    if (xu0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || xu0Var.f43283f.getAnimation() != null || xu0Var.f43284g.getLottieAnimation() != null || xu0Var.f43284g.getAnimation() != null) {
                            invalidate();
                        }
                        xu0Var.f43283f.draw(canvas);
                        xu0Var.f43284g.setImageCoords(xu0Var.f43283f.getImageX(), xu0Var.f43283f.getImageY(), xu0Var.f43283f.getImageWidth(), xu0Var.f43283f.getImageHeight());
                        xu0Var.f43284g.draw(canvas);
                    } else {
                        xu0Var.f43284g.setImageCoords(imageReceiver3.getImageX(), xu0Var.f43283f.getImageY(), xu0Var.f43283f.getImageWidth(), xu0Var.f43283f.getImageHeight());
                        xu0Var.f43284g.draw(canvas);
                        if (xu0Var.f43284g.getLottieAnimation() != null || xu0Var.f43284g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = xu0Var.f43295s - xu0Var.f43297u;
                FrameLayout frameLayout = this.f42956a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(xu0Var.f43296t - xu0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((xu0Var.J * f13 * xu0Var.A) + f18 + left);
                frameLayout.setTranslationY((xu0Var.K * f13 * xu0Var.A) + f19 + top);
            }
            if (xu0Var.f43285i) {
                xu0Var.h.setAlpha(xu0Var.f43283f.getAlpha());
                xu0Var.h.setRoundRadius(xu0Var.f43283f.getRoundRadius(true));
                xu0Var.h.setImageCoords(xu0Var.f43283f.getImageX(), xu0Var.f43283f.getImageY(), xu0Var.f43283f.getImageWidth(), xu0Var.f43283f.getImageHeight());
                xu0Var.h.draw(canvas);
                int[] roundRadius = xu0Var.f43283f.getRoundRadius(true);
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
                rectF.set(xu0Var.f43283f.getImageX(), xu0Var.f43283f.getImageY(), xu0Var.f43283f.getImageX2(), xu0Var.f43283f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (xu0Var.f43287k != null) {
                    canvas.translate(xu0Var.f43283f.getImageX(), xu0Var.f43283f.getImageY());
                    xu0Var.f43287k.c(canvas, xu0Var.d, (int) xu0Var.f43283f.getImageWidth(), (int) xu0Var.f43283f.getImageHeight(), 1.0f, false);
                } else {
                    gVar.h(i0.a.o(-1, (int) (xu0Var.f43283f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) xu0Var.f43283f.getImageX(), (int) xu0Var.f43283f.getImageY(), (int) xu0Var.f43283f.getImageX2(), (int) xu0Var.f43283f.getImageY2());
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
        uu0 uu0Var;
        xu0 xu0Var = this.e;
        float[] fArr = xu0Var.Q;
        if (xu0Var.C == null) {
            float f11 = xu0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                xu0Var.P = f12;
                if (f12 > 1.0f) {
                    xu0Var.P = 1.0f;
                } else {
                    xu0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.bs.f25037f.getInterpolation(xu0Var.P) * xu0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation != 1.0f && (uu0Var = xu0Var.F) != null) {
            uu0Var.b(fArr);
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
        xu0Var.c(canvas, 1.0f - interpolation, xu0Var.f43291o - getLeft(), xu0Var.f43292p - getTop(), f7, f10);
    }
}
