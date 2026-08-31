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
    public final FrameLayout f42889a;
    public final TextureView f42890b;
    public final o4 f42891c;
    public final org.telegram.ui.Components.p9 d;
    public final xu0 f42892e;

    public wu0(xu0 xu0Var, Context context) {
        super(context);
        this.f42892e = xu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42889a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        frameLayout.addView(p9Var);
        frameLayout.setWillNotDraw(false);
        o4 o4Var = new o4(context);
        this.f42891c = o4Var;
        o4Var.setBackgroundColor(0);
        frameLayout.addView(o4Var, k7.c6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f42890b = textureView;
        textureView.setOpaque(false);
        o4Var.addView(textureView, k7.c6.c(-1.0f, -1));
        addView(frameLayout, k7.c6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        xu0 xu0Var = this.f42892e;
        float[] fArr = xu0Var.f43470m;
        jh.k kVar = xu0Var.f43467j;
        Path path = xu0Var.f43469l;
        if (xu0Var.f43471n && xu0Var.f43463e != null && xu0Var.f43460a != null) {
            xu0Var.i();
            float left = xu0Var.f43472o - getLeft();
            float top = xu0Var.f43473p - getTop();
            canvas.save();
            float f12 = xu0Var.O;
            float f13 = xu0Var.A;
            float f14 = ((f12 * f13) + 1.0f) - f13;
            canvas.scale(f14, f14, xu0Var.f43476s + left, xu0Var.f43477t + top);
            float f15 = xu0Var.J;
            float f16 = xu0Var.A;
            canvas.translate((f15 * f16) + left, (xu0Var.K * f16) + top);
            ImageReceiver imageReceiver = xu0Var.f43465g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f17 = xu0Var.B;
                if (f17 != 1.0f) {
                    float f18 = f17 + 0.10666667f;
                    xu0Var.B = f18;
                    if (f18 > 1.0f) {
                        xu0Var.B = 1.0f;
                    } else {
                        xu0Var.e();
                    }
                }
                xu0Var.f43465g.setAlpha(xu0Var.B);
            }
            float f19 = xu0Var.f43478u;
            float f20 = xu0Var.v;
            float f21 = xu0Var.f43479w;
            float f22 = xu0Var.f43481y;
            if (f21 == f22 && xu0Var.f43480x == xu0Var.f43482z) {
                f11 = 1.0f;
            } else {
                if (f14 < 1.0f) {
                    f10 = 0.0f;
                } else if (f14 < 1.4f) {
                    f10 = (f14 - 1.0f) / 0.4f;
                } else {
                    f10 = 1.0f;
                }
                f11 = 1.0f;
                float f23 = xu0Var.f43482z;
                float f24 = xu0Var.f43480x;
                float f25 = ((f23 - f24) / 2.0f) * f10;
                f19 -= f25;
                float f26 = ((f22 - f21) / 2.0f) * f10;
                f20 -= f26;
                ImageReceiver imageReceiver2 = xu0Var.f43464f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f19, f20, (f25 * 2.0f) + f24, (f26 * 2.0f) + f21);
                }
            }
            if (!xu0Var.R) {
                ImageReceiver imageReceiver3 = xu0Var.f43464f;
                if (imageReceiver3 != null) {
                    if (xu0Var.B != f11) {
                        if (imageReceiver3.getLottieAnimation() != null || xu0Var.f43464f.getAnimation() != null || xu0Var.f43465g.getLottieAnimation() != null || xu0Var.f43465g.getAnimation() != null) {
                            invalidate();
                        }
                        xu0Var.f43464f.draw(canvas);
                        xu0Var.f43465g.setImageCoords(xu0Var.f43464f.getImageX(), xu0Var.f43464f.getImageY(), xu0Var.f43464f.getImageWidth(), xu0Var.f43464f.getImageHeight());
                        xu0Var.f43465g.draw(canvas);
                    } else {
                        xu0Var.f43465g.setImageCoords(imageReceiver3.getImageX(), xu0Var.f43464f.getImageY(), xu0Var.f43464f.getImageWidth(), xu0Var.f43464f.getImageHeight());
                        xu0Var.f43465g.draw(canvas);
                        if (xu0Var.f43465g.getLottieAnimation() != null || xu0Var.f43465g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f27 = xu0Var.f43476s - xu0Var.f43478u;
                FrameLayout frameLayout = this.f42889a;
                frameLayout.setPivotX(f27);
                frameLayout.setPivotY(xu0Var.f43477t - xu0Var.v);
                frameLayout.setScaleY(f14);
                frameLayout.setScaleX(f14);
                frameLayout.setTranslationX((xu0Var.J * f14 * xu0Var.A) + f19 + left);
                frameLayout.setTranslationY((xu0Var.K * f14 * xu0Var.A) + f20 + top);
            }
            if (xu0Var.f43466i) {
                xu0Var.h.setAlpha(xu0Var.f43464f.getAlpha());
                xu0Var.h.setRoundRadius(xu0Var.f43464f.getRoundRadius(true));
                xu0Var.h.setImageCoords(xu0Var.f43464f.getImageX(), xu0Var.f43464f.getImageY(), xu0Var.f43464f.getImageWidth(), xu0Var.f43464f.getImageHeight());
                xu0Var.h.draw(canvas);
                int[] roundRadius = xu0Var.f43464f.getRoundRadius(true);
                float f28 = roundRadius[0];
                fArr[1] = f28;
                fArr[0] = f28;
                float f29 = roundRadius[1];
                fArr[3] = f29;
                fArr[2] = f29;
                float f30 = roundRadius[2];
                fArr[5] = f30;
                fArr[4] = f30;
                float f31 = roundRadius[3];
                fArr[7] = f31;
                fArr[6] = f31;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(xu0Var.f43464f.getImageX(), xu0Var.f43464f.getImageY(), xu0Var.f43464f.getImageX2(), xu0Var.f43464f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (xu0Var.f43468k != null) {
                    canvas.translate(xu0Var.f43464f.getImageX(), xu0Var.f43464f.getImageY());
                    xu0Var.f43468k.c(canvas, xu0Var.d, (int) xu0Var.f43464f.getImageWidth(), (int) xu0Var.f43464f.getImageHeight(), 1.0f, false);
                } else {
                    kVar.h(i0.a.k(-1, (int) (xu0Var.f43464f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    kVar.setBounds((int) xu0Var.f43464f.getImageX(), (int) xu0Var.f43464f.getImageY(), (int) xu0Var.f43464f.getImageX2(), (int) xu0Var.f43464f.getImageY2());
                    kVar.draw(canvas);
                }
                canvas.restore();
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        uu0 uu0Var;
        xu0 xu0Var = this.f42892e;
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
        float interpolation = org.telegram.ui.Components.pr.f30183f.getInterpolation(xu0Var.P) * xu0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f13 = 0.0f;
        if (interpolation != 1.0f && (uu0Var = xu0Var.F) != null) {
            uu0Var.c(fArr);
            canvas.save();
            float f14 = 1.0f - interpolation;
            float f15 = fArr[0] * f14;
            float measuredHeight2 = (fArr[1] * f14) + (getMeasuredHeight() * interpolation);
            canvas.clipRect(0.0f, f15, getMeasuredWidth(), measuredHeight2);
            a(canvas);
            super.dispatchDraw(canvas);
            canvas.restore();
            f10 = measuredHeight2;
            f13 = f15;
        } else {
            a(canvas);
            super.dispatchDraw(canvas);
            f10 = measuredHeight;
        }
        xu0Var.c(canvas, 1.0f - interpolation, xu0Var.f43472o - getLeft(), xu0Var.f43473p - getTop(), f13, f10);
    }
}
