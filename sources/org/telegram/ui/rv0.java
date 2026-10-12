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
public final class rv0 extends FrameLayout {
    public final FrameLayout f41736a;
    public final TextureView f41737b;
    public final l4 f41738c;
    public final org.telegram.ui.Components.y9 d;
    public final sv0 f41739e;

    public rv0(sv0 sv0Var, Context context) {
        super(context);
        this.f41739e = sv0Var;
        new Path();
        new Paint(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41736a = frameLayout;
        frameLayout.setOutlineProvider(new ViewOutlineProvider());
        frameLayout.setClipToOutline(true);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.d = y9Var;
        frameLayout.addView(y9Var);
        frameLayout.setWillNotDraw(false);
        l4 l4Var = new l4(context);
        this.f41738c = l4Var;
        l4Var.setBackgroundColor(0);
        frameLayout.addView(l4Var, w7.w5.e(-1, -1, 17));
        TextureView textureView = new TextureView(context);
        this.f41737b = textureView;
        textureView.setOpaque(false);
        l4Var.addView(textureView, w7.w5.d(-1.0f, -1));
        addView(frameLayout, w7.w5.d(-2.0f, -2));
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        sv0 sv0Var = this.f41739e;
        float[] fArr = sv0Var.f42002m;
        vh.g gVar = sv0Var.f41999j;
        Path path = sv0Var.f42001l;
        if (sv0Var.f42003n && sv0Var.f41995e != null && sv0Var.f41992a != null) {
            sv0Var.i();
            float left = sv0Var.f42004o - getLeft();
            float top = sv0Var.f42005p - getTop();
            canvas.save();
            float f11 = sv0Var.O;
            float f12 = sv0Var.A;
            float f13 = ((f11 * f12) + 1.0f) - f12;
            canvas.scale(f13, f13, sv0Var.f42008s + left, sv0Var.f42009t + top);
            float f14 = sv0Var.J;
            float f15 = sv0Var.A;
            canvas.translate((f14 * f15) + left, (sv0Var.K * f15) + top);
            ImageReceiver imageReceiver = sv0Var.f41997g;
            if (imageReceiver != null && imageReceiver.hasNotThumb()) {
                float f16 = sv0Var.B;
                if (f16 != 1.0f) {
                    float f17 = f16 + 0.10666667f;
                    sv0Var.B = f17;
                    if (f17 > 1.0f) {
                        sv0Var.B = 1.0f;
                    } else {
                        sv0Var.e();
                    }
                }
                sv0Var.f41997g.setAlpha(sv0Var.B);
            }
            float f18 = sv0Var.f42010u;
            float f19 = sv0Var.v;
            float f20 = sv0Var.f42011w;
            float f21 = sv0Var.f42013y;
            if (f20 == f21 && sv0Var.f42012x == sv0Var.f42014z) {
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
                float f22 = sv0Var.f42014z;
                float f23 = sv0Var.f42012x;
                float f24 = ((f22 - f23) / 2.0f) * f7;
                f18 -= f24;
                float f25 = ((f21 - f20) / 2.0f) * f7;
                f19 -= f25;
                ImageReceiver imageReceiver2 = sv0Var.f41996f;
                if (imageReceiver2 != null) {
                    imageReceiver2.setImageCoords(f18, f19, (f24 * 2.0f) + f23, (f25 * 2.0f) + f20);
                }
            }
            if (!sv0Var.R) {
                ImageReceiver imageReceiver3 = sv0Var.f41996f;
                if (imageReceiver3 != null) {
                    if (sv0Var.B != f10) {
                        if (imageReceiver3.getLottieAnimation() != null || sv0Var.f41996f.getAnimation() != null || sv0Var.f41997g.getLottieAnimation() != null || sv0Var.f41997g.getAnimation() != null) {
                            invalidate();
                        }
                        sv0Var.f41996f.draw(canvas);
                        sv0Var.f41997g.setImageCoords(sv0Var.f41996f.getImageX(), sv0Var.f41996f.getImageY(), sv0Var.f41996f.getImageWidth(), sv0Var.f41996f.getImageHeight());
                        sv0Var.f41997g.draw(canvas);
                    } else {
                        sv0Var.f41997g.setImageCoords(imageReceiver3.getImageX(), sv0Var.f41996f.getImageY(), sv0Var.f41996f.getImageWidth(), sv0Var.f41996f.getImageHeight());
                        sv0Var.f41997g.draw(canvas);
                        if (sv0Var.f41997g.getLottieAnimation() != null || sv0Var.f41997g.getAnimation() != null) {
                            invalidate();
                        }
                    }
                }
            } else {
                float f26 = sv0Var.f42008s - sv0Var.f42010u;
                FrameLayout frameLayout = this.f41736a;
                frameLayout.setPivotX(f26);
                frameLayout.setPivotY(sv0Var.f42009t - sv0Var.v);
                frameLayout.setScaleY(f13);
                frameLayout.setScaleX(f13);
                frameLayout.setTranslationX((sv0Var.J * f13 * sv0Var.A) + f18 + left);
                frameLayout.setTranslationY((sv0Var.K * f13 * sv0Var.A) + f19 + top);
            }
            if (sv0Var.f41998i) {
                sv0Var.h.setAlpha(sv0Var.f41996f.getAlpha());
                sv0Var.h.setRoundRadius(sv0Var.f41996f.getRoundRadius(true));
                sv0Var.h.setImageCoords(sv0Var.f41996f.getImageX(), sv0Var.f41996f.getImageY(), sv0Var.f41996f.getImageWidth(), sv0Var.f41996f.getImageHeight());
                sv0Var.h.draw(canvas);
                int[] roundRadius = sv0Var.f41996f.getRoundRadius(true);
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
                rectF.set(sv0Var.f41996f.getImageX(), sv0Var.f41996f.getImageY(), sv0Var.f41996f.getImageX2(), sv0Var.f41996f.getImageY2());
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (sv0Var.f42000k != null) {
                    canvas.translate(sv0Var.f41996f.getImageX(), sv0Var.f41996f.getImageY());
                    sv0Var.f42000k.c(canvas, sv0Var.d, (int) sv0Var.f41996f.getImageWidth(), (int) sv0Var.f41996f.getImageHeight(), 1.0f, false);
                } else {
                    gVar.h(i0.a.k(-1, (int) (sv0Var.f41996f.getAlpha() * Color.alpha(-1) * 0.325f)));
                    gVar.setBounds((int) sv0Var.f41996f.getImageX(), (int) sv0Var.f41996f.getImageY(), (int) sv0Var.f41996f.getImageX2(), (int) sv0Var.f41996f.getImageY2());
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
        pv0 pv0Var;
        sv0 sv0Var = this.f41739e;
        float[] fArr = sv0Var.Q;
        if (sv0Var.C == null) {
            float f11 = sv0Var.P;
            if (f11 != 1.0f) {
                float f12 = f11 + 0.07272727f;
                sv0Var.P = f12;
                if (f12 > 1.0f) {
                    sv0Var.P = 1.0f;
                } else {
                    sv0Var.e();
                }
            }
        }
        float interpolation = org.telegram.ui.Components.js.f27627f.getInterpolation(sv0Var.P) * sv0Var.A;
        float measuredHeight = getMeasuredHeight();
        if (interpolation != 1.0f && (pv0Var = sv0Var.F) != null) {
            pv0Var.b(fArr);
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
        sv0Var.c(canvas, 1.0f - interpolation, sv0Var.f42004o - getLeft(), sv0Var.f42005p - getTop(), f7, f10);
    }
}
