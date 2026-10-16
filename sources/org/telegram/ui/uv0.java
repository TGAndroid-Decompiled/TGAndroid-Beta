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
public final class uv0 extends FrameLayout {
    public final FrameLayout f40494a;
    public final TextureView f40495b;
    public final n4 f40496c;
    public final org.telegram.ui.Components.z9 d;
    public final vv0 e;

    public uv0(vv0 vv0Var, Context context) {
        super(context);
        this.e = vv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40494a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.d = z9Var;
        frameLayout.addView(z9Var);
        frameLayout.setWillNotDraw(false);
        n4 n4Var = new n4(context);
        this.f40496c = n4Var;
        n4Var.setBackgroundColor(0);
        frameLayout.addView(n4Var, w7.z5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f40495b = textureView;
        textureView.setOpaque(false);
        n4Var.addView(textureView, w7.z5.d(-1.0f, -1));
        addView(frameLayout, w7.z5.d(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        vv0 vv0Var = this.e;
        float[] fArr = vv0Var.f40778m;
        wh.g gVar = vv0Var.f40775j;
        Path path = vv0Var.f40777l;
        if (vv0Var.f40779n && vv0Var.e != null && vv0Var.f40769a != null) {
            vv0Var.i();
            float left = vv0Var.f40780o - getLeft();
            float top = vv0Var.f40781p - getTop();
            canvas.save();
            float f11 = vv0Var.O;
            float f12 = vv0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, vv0Var.f40784s + left, vv0Var.f40785t + top);
            float f14 = vv0Var.J;
            float f15 = vv0Var.A;
            canvas.translate((f14 * f15) + left, (vv0Var.K * f15) + top);
            ImageReceiver imageReceiver = vv0Var.f40773g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = vv0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    vv0Var.B = f17;
                    if (f17 > 1.0f) {
                        vv0Var.B = 1.0f;
                    } else {
                        vv0Var.e();
                    }
                }
                vv0Var.f40773g.setAlpha(vv0Var.B);
            }
            float f18 = vv0Var.f40786u;
            float f19 = vv0Var.v;
            float f20 = vv0Var.f40787w;
            float f21 = vv0Var.f40789y;
            if (f20 == f21 && vv0Var.f40788x == vv0Var.f40790z) {
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
                float f22 = vv0Var.f40790z;
                float f23 = vv0Var.f40788x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = vv0Var.f40772f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!vv0Var.R) {
                ImageReceiver imageReceiver3 = vv0Var.f40772f;
                if (imageReceiver3 != null) {
                    if (vv0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || vv0Var.f40772f.getAnimation() != null || vv0Var.f40773g.getLottieAnimation() != null || vv0Var.f40773g.getAnimation() != null) {
                            invalidate();
                        }
                        vv0Var.f40772f.draw(canvas);
                        vv0Var.f40773g.setImageCoords(vv0Var.f40772f.getImageX(), vv0Var.f40772f.getImageY(), vv0Var.f40772f.getImageWidth(), vv0Var.f40772f.getImageHeight());
                        vv0Var.f40773g.draw(canvas);
                    } else {
                        vv0Var.f40773g.setImageCoords(imageReceiver3.getImageX(), vv0Var.f40772f.getImageY(), vv0Var.f40772f.getImageWidth(), vv0Var.f40772f.getImageHeight());
                        vv0Var.f40773g.draw(canvas);
                        if (vv0Var.f40773g.getLottieAnimation() != null || vv0Var.f40773g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = vv0Var.f40784s - vv0Var.f40786u;
                FrameLayout frameLayout = this.f40494a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(vv0Var.f40785t - vv0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((vv0Var.J * f13 * vv0Var.A) + f18 + left);
                frameLayout.setTranslationY((vv0Var.K * f13 * vv0Var.A) + f19 + top);
            }
            if (vv0Var.f40774i) {
                vv0Var.h.setAlpha(vv0Var.f40772f.getAlpha());
                vv0Var.h.setRoundRadius(vv0Var.f40772f.getRoundRadius(true));
                vv0Var.h.setImageCoords(vv0Var.f40772f.getImageX(), vv0Var.f40772f.getImageY(), vv0Var.f40772f.getImageWidth(), vv0Var.f40772f.getImageHeight());
                vv0Var.h.draw(canvas);
                int[] roundRadius = vv0Var.f40772f.getRoundRadius(true);
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
                rectF.set(vv0Var.f40772f.getImageX(), vv0Var.f40772f.getImageY(), vv0Var.f40772f.getImageX2(), vv0Var.f40772f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (vv0Var.f40776k != null) {
                    canvas.translate(vv0Var.f40772f.getImageX(), vv0Var.f40772f.getImageY());
                    vv0Var.f40776k.c(canvas, vv0Var.d, (int) vv0Var.f40772f.getImageWidth(), (int) vv0Var.f40772f.getImageHeight(), 1.0f, false);
                } else {
                    gVar.h(i0.a.k(-1, (int) (vv0Var.f40772f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) vv0Var.f40772f.getImageX(), (int) vv0Var.f40772f.getImageY(), (int) vv0Var.f40772f.getImageX2(), (int) vv0Var.f40772f.getImageY2());
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
        sv0 sv0Var;
        vv0 vv0Var = this.e;
        float[] fArr = vv0Var.Q;
        if (vv0Var.C == null) {
            float f11 = vv0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                vv0Var.P = f12;
                if (f12 > 1.0f) {
                    vv0Var.P = 1.0f;
                } else {
                    vv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.es.f24465f.getInterpolation(vv0Var.P) * vv0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation != 1.0f && (sv0Var = vv0Var.F) != null) {
            sv0Var.b(fArr);
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
        vv0Var.c(canvas, 1.0f - interpolation, vv0Var.f40780o - getLeft(), vv0Var.f40781p - getTop(), f7, f10);
    }
}
