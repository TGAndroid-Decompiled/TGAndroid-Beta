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
public final class xu0 extends FrameLayout {
    public final FrameLayout f43657a;
    public final TextureView f43658b;
    public final n4 f43659c;
    public final org.telegram.ui.Components.w9 d;
    public final yu0 e;

    public xu0(yu0 yu0Var, Context context) {
        super(context);
        this.e = yu0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43657a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.d = w9Var;
        frameLayout.addView(w9Var);
        frameLayout.setWillNotDraw(false);
        n4 n4Var = new n4(context);
        this.f43659c = n4Var;
        n4Var.setBackgroundColor(0);
        frameLayout.addView(n4Var, w7.z5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f43658b = textureView;
        textureView.setOpaque(false);
        n4Var.addView(textureView, w7.z5.c(-1.0f, -1));
        addView(frameLayout, w7.z5.c(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        yu0 yu0Var = this.e;
        float[] fArr = yu0Var.f43984m;
        wh.g gVar = yu0Var.f43981j;
        Path path = yu0Var.f43983l;
        if (yu0Var.f43985n && yu0Var.e != null && yu0Var.f43975a != null) {
            yu0Var.i();
            float left = yu0Var.f43986o - getLeft();
            float top = yu0Var.f43987p - getTop();
            canvas.save();
            float f11 = yu0Var.O;
            float f12 = yu0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, yu0Var.f43990s + left, yu0Var.f43991t + top);
            float f14 = yu0Var.J;
            float f15 = yu0Var.A;
            canvas.translate((f14 * f15) + left, (yu0Var.K * f15) + top);
            ImageReceiver imageReceiver = yu0Var.f43979g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = yu0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    yu0Var.B = f17;
                    if (f17 > 1.0f) {
                        yu0Var.B = 1.0f;
                    } else {
                        yu0Var.e();
                    }
                }
                yu0Var.f43979g.setAlpha(yu0Var.B);
            }
            float f18 = yu0Var.f43992u;
            float f19 = yu0Var.v;
            float f20 = yu0Var.f43993w;
            float f21 = yu0Var.f43995y;
            if (f20 == f21 && yu0Var.f43994x == yu0Var.f43996z) {
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
                float f22 = yu0Var.f43996z;
                float f23 = yu0Var.f43994x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = yu0Var.f43978f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!yu0Var.R) {
                ImageReceiver imageReceiver3 = yu0Var.f43978f;
                if (imageReceiver3 != null) {
                    if (yu0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || yu0Var.f43978f.getAnimation() != null || yu0Var.f43979g.getLottieAnimation() != null || yu0Var.f43979g.getAnimation() != null) {
                            invalidate();
                        }
                        yu0Var.f43978f.draw(canvas);
                        yu0Var.f43979g.setImageCoords(yu0Var.f43978f.getImageX(), yu0Var.f43978f.getImageY(), yu0Var.f43978f.getImageWidth(), yu0Var.f43978f.getImageHeight());
                        yu0Var.f43979g.draw(canvas);
                    } else {
                        yu0Var.f43979g.setImageCoords(imageReceiver3.getImageX(), yu0Var.f43978f.getImageY(), yu0Var.f43978f.getImageWidth(), yu0Var.f43978f.getImageHeight());
                        yu0Var.f43979g.draw(canvas);
                        if (yu0Var.f43979g.getLottieAnimation() != null || yu0Var.f43979g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = yu0Var.f43990s - yu0Var.f43992u;
                FrameLayout frameLayout = this.f43657a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(yu0Var.f43991t - yu0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((yu0Var.J * f13 * yu0Var.A) + f18 + left);
                frameLayout.setTranslationY((yu0Var.K * f13 * yu0Var.A) + f19 + top);
            }
            if (yu0Var.f43980i) {
                yu0Var.h.setAlpha(yu0Var.f43978f.getAlpha());
                yu0Var.h.setRoundRadius(yu0Var.f43978f.getRoundRadius(true));
                yu0Var.h.setImageCoords(yu0Var.f43978f.getImageX(), yu0Var.f43978f.getImageY(), yu0Var.f43978f.getImageWidth(), yu0Var.f43978f.getImageHeight());
                yu0Var.h.draw(canvas);
                int[] roundRadius = yu0Var.f43978f.getRoundRadius(true);
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
                rectF.set(yu0Var.f43978f.getImageX(), yu0Var.f43978f.getImageY(), yu0Var.f43978f.getImageX2(), yu0Var.f43978f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (yu0Var.f43982k != null) {
                    canvas.translate(yu0Var.f43978f.getImageX(), yu0Var.f43978f.getImageY());
                    yu0Var.f43982k.c(canvas, yu0Var.d, (int) yu0Var.f43978f.getImageWidth(), (int) yu0Var.f43978f.getImageHeight(), 1.0f, false);
                } else {
                    gVar.h(i0.a.o(-1, (int) (yu0Var.f43978f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) yu0Var.f43978f.getImageX(), (int) yu0Var.f43978f.getImageY(), (int) yu0Var.f43978f.getImageX2(), (int) yu0Var.f43978f.getImageY2());
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
        vu0 vu0Var;
        yu0 yu0Var = this.e;
        float[] fArr = yu0Var.Q;
        if (yu0Var.C == null) {
            float f11 = yu0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                yu0Var.P = f12;
                if (f12 > 1.0f) {
                    yu0Var.P = 1.0f;
                } else {
                    yu0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.bs.f25133f.getInterpolation(yu0Var.P) * yu0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation != 1.0f && (vu0Var = yu0Var.F) != null) {
            vu0Var.b(fArr);
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
        yu0Var.c(canvas, 1.0f - interpolation, yu0Var.f43986o - getLeft(), yu0Var.f43987p - getTop(), f7, f10);
    }
}
