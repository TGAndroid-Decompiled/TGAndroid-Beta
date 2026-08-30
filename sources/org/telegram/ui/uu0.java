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
    public final FrameLayout f39003a;
    public final TextureView f39004b;
    public final o4 f39005c;
    public final org.telegram.ui.Components.p9 d;
    public final vu0 e;

    public uu0(vu0 vu0Var, Context context) {
        super(context);
        this.e = vu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39003a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        frameLayout.addView(p9Var);
        frameLayout.setWillNotDraw(false);
        o4 o4Var = new o4(context);
        this.f39005c = o4Var;
        o4Var.setBackgroundColor(0);
        frameLayout.addView(o4Var, k7.b6.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f39004b = textureView;
        textureView.setOpaque(false);
        o4Var.addView(textureView, k7.b6.c(-1.0f, -1));
        addView(frameLayout, k7.b6.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        vu0 vu0Var = this.e;
        float[] fArr = vu0Var.f39258m;
        ih.k kVar = vu0Var.f39255j;
        Path path = vu0Var.f39257l;
        if (vu0Var.f39259n && vu0Var.e != null && vu0Var.f39249a != null) {
            vu0Var.i();
            float left = vu0Var.f39260o - getLeft();
            float top = vu0Var.f39261p - getTop();
            canvas.save();
            float f12 = vu0Var.O;
            float f13 = vu0Var.A;
            float f14 = ((f12 * f13) + 1.0f) - f13;
            canvas.scale(f14, f14, vu0Var.f39264s + left, vu0Var.f39265t + top);
            float f15 = vu0Var.J;
            float f16 = vu0Var.A;
            canvas.translate((f15 * f16) + left, (vu0Var.K * f16) + top);
            ImageReceiver imageReceiver = vu0Var.f39253g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f17 = vu0Var.B;
                if (f17 != 1.0f) {
                    float f18 = f17 + 0.10666667f;
                    vu0Var.B = f18;
                    if (f18 > 1.0f) {
                        vu0Var.B = 1.0f;
                    } else {
                        vu0Var.e();
                    }
                }
                vu0Var.f39253g.setAlpha(vu0Var.B);
            }
            float f19 = vu0Var.f39266u;
            float f20 = vu0Var.v;
            float f21 = vu0Var.f39267w;
            float f22 = vu0Var.f39269y;
            if (f21 == f22 && vu0Var.f39268x == vu0Var.f39270z) {
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
                float f23 = vu0Var.f39270z;
                float f24 = vu0Var.f39268x;
                float f25 = ((f23 - f24) / 2.0f) * f10;
                f19 -= f25;
                float f26 = ((f22 - f21) / 2.0f) * f10;
                f20 -= f26;
                ImageReceiver imageReceiver2 = vu0Var.f39252f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f19, f20, (f25 * 2.0f) + f24, (f26 * 2.0f) + f21);
                }
            }
            if (!vu0Var.R) {
                ImageReceiver imageReceiver3 = vu0Var.f39252f;
                if (imageReceiver3 != null) {
                    if (vu0Var.B != f11) {
                        if (imageReceiver3.getLottieAnimation() != null || vu0Var.f39252f.getAnimation() != null || vu0Var.f39253g.getLottieAnimation() != null || vu0Var.f39253g.getAnimation() != null) {
                            invalidate();
                        }
                        vu0Var.f39252f.draw(canvas);
                        vu0Var.f39253g.setImageCoords(vu0Var.f39252f.getImageX(), vu0Var.f39252f.getImageY(), vu0Var.f39252f.getImageWidth(), vu0Var.f39252f.getImageHeight());
                        vu0Var.f39253g.draw(canvas);
                    } else {
                        vu0Var.f39253g.setImageCoords(imageReceiver3.getImageX(), vu0Var.f39252f.getImageY(), vu0Var.f39252f.getImageWidth(), vu0Var.f39252f.getImageHeight());
                        vu0Var.f39253g.draw(canvas);
                        if (vu0Var.f39253g.getLottieAnimation() != null || vu0Var.f39253g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f27 = vu0Var.f39264s - vu0Var.f39266u;
                FrameLayout frameLayout = this.f39003a;
                frameLayout.setPivotX(f27);
                frameLayout.setPivotY(vu0Var.f39265t - vu0Var.v);
                frameLayout.setScaleY(f14);
                frameLayout.setScaleX(f14);
                frameLayout.setTranslationX((vu0Var.J * f14 * vu0Var.A) + f19 + left);
                frameLayout.setTranslationY((vu0Var.K * f14 * vu0Var.A) + f20 + top);
            }
            if (vu0Var.f39254i) {
                vu0Var.h.setAlpha(vu0Var.f39252f.getAlpha());
                vu0Var.h.setRoundRadius(vu0Var.f39252f.getRoundRadius(true));
                vu0Var.h.setImageCoords(vu0Var.f39252f.getImageX(), vu0Var.f39252f.getImageY(), vu0Var.f39252f.getImageWidth(), vu0Var.f39252f.getImageHeight());
                vu0Var.h.draw(canvas);
                int[] roundRadius = vu0Var.f39252f.getRoundRadius(true);
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
                rectF.set(vu0Var.f39252f.getImageX(), vu0Var.f39252f.getImageY(), vu0Var.f39252f.getImageX2(), vu0Var.f39252f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (vu0Var.f39256k != null) {
                    canvas.translate(vu0Var.f39252f.getImageX(), vu0Var.f39252f.getImageY());
                    vu0Var.f39256k.c(canvas, vu0Var.d, (int) vu0Var.f39252f.getImageWidth(), (int) vu0Var.f39252f.getImageHeight(), 1.0f, false);
                } else {
                    kVar.h(i0.a.k(-1, (int) (vu0Var.f39252f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    kVar.setBounds((int) vu0Var.f39252f.getImageX(), (int) vu0Var.f39252f.getImageY(), (int) vu0Var.f39252f.getImageX2(), (int) vu0Var.f39252f.getImageY2());
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
        float interpolation = org.telegram.ui.Components.nr.f27346f.getInterpolation(vu0Var.P) * vu0Var.A;
        float measuredHeight = getMeasuredHeight();
        float f13 = 0.0f;
        if (interpolation != 1.0f && (su0Var = vu0Var.F) != null) {
            su0Var.c(fArr);
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
        vu0Var.c(canvas, 1.0f - interpolation, vu0Var.f39260o - getLeft(), vu0Var.f39261p - getTop(), f13, f10);
    }
}
