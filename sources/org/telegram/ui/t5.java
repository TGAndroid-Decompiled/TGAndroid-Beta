package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class t5 extends FrameLayout {
    public final int f41842a = 1;
    public Object f41843b;
    public Object f41844c;
    public Object d;
    public Object f41845e;

    public t5(Context context) {
        super(context);
    }

    public float a() {
        yh.s3 s3Var = (yh.s3) this.f41845e;
        return (s3Var.Z0.a(3) * s3Var.B0.getMeasuredHeight()) + (s3Var.Z0.a(2) * s3Var.f53197z0.getMeasuredHeight()) + (s3Var.Z0.a(1) * s3Var.f53190s0.getMeasuredHeight()) + (s3Var.Z0.a(0) * s3Var.f53169g0.getMeasuredHeight()) + s3Var.f53167f0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        int i10;
        float f7;
        float f10;
        ImageView imageView = (ImageView) this.f41844c;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        TextView textView = (TextView) this.d;
        boolean z11 = LocaleController.isRTL;
        if (!z11 && z10) {
            f7 = 53.0f;
        } else {
            f7 = 22.0f;
        }
        if (z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        textView.setLayoutParams(w7.x5.a(-2.0f, f7, 14.0f, f10, 12.0f, -1, 55));
    }

    public void c(int i10, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.f41844c).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        f4.d dVar;
        float max = Math.max(0.0f, getHeight() - a());
        yh.s3 s3Var = (yh.s3) this.f41845e;
        org.telegram.ui.Components.qm0 qm0Var = s3Var.d;
        int childCount = qm0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = qm0Var.getChildAt(childCount);
            qm0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - s3Var.f53167f0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (s3Var.Z0.a(4) * s3Var.getBottomInset()) + max;
        Float f7 = s3Var.Y0;
        if (f7 != null && (dVar = s3Var.Z0) != null && dVar.f9646c < 1.0f) {
            return AndroidUtilities.lerp(f7.floatValue(), a2, s3Var.Z0.f9646c);
        }
        return a2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        int v;
        FrameLayout frameLayout;
        int i10;
        Paint e7;
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        Drawable drawable;
        int i11;
        Drawable drawable2;
        switch (this.f41842a) {
            case 2:
                Path path = (Path) this.f41844c;
                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) this.f41845e;
                boolean z11 = true;
                float C = b51Var.C(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), w7.o.a(C / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                b51Var.f24912x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, C));
                if (C <= AndroidUtilities.statusBarHeight / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f41843b;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f41843b = Boolean.valueOf(z10);
                    Window window = b51Var.getWindow();
                    if (z10) {
                        v = b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5);
                    } else {
                        v = org.telegram.ui.ActionBar.i6.v(b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21075s8), 855638016);
                    }
                    if (AndroidUtilities.computePerceivedBrightness(v) <= 0.721f) {
                        z11 = false;
                    }
                    AndroidUtilities.setLightStatusBar(window, z11);
                }
                b51Var.topBulletinContainer.setTranslationY(Math.max(b51Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, C) + getTranslationY() + ((-frameLayout.getTop()) - b51Var.topBulletinContainer.getHeight()));
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, C, getWidth(), getHeight() + lerp);
                path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(path, (Paint) this.d);
                super.dispatchDraw(canvas);
                return;
            case 3:
                LinearGradient linearGradient = (LinearGradient) this.d;
                Matrix matrix = (Matrix) this.f41843b;
                Paint paint = (Paint) this.f41844c;
                PhotoViewer photoViewer = (PhotoViewer) this.f41845e;
                if (!photoViewer.S4) {
                    if (photoViewer.f33981n0.getVisibility() == 0) {
                        i10 = getMeasuredHeight() - AndroidUtilities.dp(48.0f);
                    } else {
                        i10 = 0;
                    }
                    int i12 = photoViewer.f33887c2;
                    if (i12 != 0 && i12 != 2 && i12 != -1) {
                        paint.setShader(null);
                        paint.setColor(2130706432);
                    } else {
                        matrix.reset();
                        matrix.postTranslate(0.0f, i10);
                        matrix.postScale(1.0f, Math.min(AndroidUtilities.dp(40.0f), getMeasuredHeight() - i10) / 16.0f);
                        linearGradient.setLocalMatrix(matrix);
                        paint.setShader(linearGradient);
                    }
                    canvas.drawRect(0.0f, i10, getMeasuredWidth(), getMeasuredHeight(), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 4:
            case 6:
            case 10:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                Paint paint2 = (Paint) this.f41843b;
                Paint paint3 = (Paint) this.d;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp = AndroidUtilities.dp(8.0f);
                Paint paint4 = (Paint) this.f41844c;
                paint4.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                xd1 xd1Var = (xd1) this.f41845e;
                paint4.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.k(-16777216, (int) (xd1Var.R1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, dp, dp, paint4);
                md1 md1Var = xd1Var.f43998x0;
                xc1 xc1Var = xd1Var.f43935a;
                org.telegram.ui.ActionBar.i6.s(this, md1Var, xc1Var);
                Paint F = xc1Var.F("paintChatActionBackground");
                int alpha = F.getAlpha();
                F.setAlpha((int) (xd1Var.R1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, dp, dp, F);
                F.setAlpha(alpha);
                if (xd1Var.M1) {
                    float f7 = xd1Var.f43975n1;
                    if (f7 > 0.0f) {
                        paint2.setColor(i0.a.k(-16777216, (int) (f7 * 255.0f * xd1Var.f43977o1)));
                        canvas.drawRoundRect(rectF2, dp, dp, paint2);
                    }
                }
                paint3.setColor(520093695);
                paint3.setAlpha((int) (xd1Var.R1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, dp, dp, paint3);
                super.dispatchDraw(canvas);
                return;
            case 7:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f41843b;
                Paint paint5 = (Paint) this.f41844c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f41845e;
                if (limitPreviewView.P) {
                    if (!limitPreviewView.f24240c0 && !limitPreviewView.R) {
                        paint5.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.e7, e6Var));
                    } else {
                        paint5.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var));
                    }
                } else {
                    paint5.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20741a7, e6Var));
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rg.t tVar = limitPreviewView.f24243e0;
                if (tVar != null) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((v5) ((z0) tVar).f44437b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.f24251n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.R) {
                    e7 = limitPreviewView.K;
                } else if (limitPreviewView.f24243e0 != null) {
                    e7 = (Paint) this.d;
                } else {
                    e7 = rg.b1.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.f24256y;
                if (viewGroup != null) {
                    rg.a1 a1Var = limitPreviewView.E;
                    if (a1Var != null) {
                        e7 = a1Var.f47177f;
                        a1Var.a();
                        Matrix matrix2 = a1Var.f47176e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, limitPreviewView.f24239c / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, -limitPreviewView.F);
                        a1Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f10 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f10 += view.getY();
                        }
                        rg.b1 d = rg.b1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f10, measuredWidth, measuredHeight);
                    }
                } else {
                    rg.b1 d10 = rg.b1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha2 = e7.getAlpha();
                if (limitPreviewView.V && (valueAnimator2 = limitPreviewView.f24248i0) != null) {
                    e7.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.U && (valueAnimator = limitPreviewView.f24248i0) != null) {
                    e7.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.P) {
                    if (!limitPreviewView.L && !limitPreviewView.M) {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.f24251n, getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(limitPreviewView.f24251n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e7);
                e7.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.E == null && limitPreviewView.f24241d0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                Paint paint6 = (Paint) this.d;
                paint6.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ii, (org.telegram.ui.ActionBar.e6) this.f41843b));
                rg.f0 f0Var = (rg.f0) this.f41845e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint6);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint6);
                RectF rectF4 = AndroidUtilities.rectTmp;
                int top = f0Var.d.getTop();
                rectF4.set(f0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((f0Var.d.getBottom() + top) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + f0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                rg.a1 a1Var2 = (rg.a1) this.f41844c;
                a1Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), a1Var2.f47177f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 9:
                Drawable drawable3 = (Drawable) this.f41843b;
                rg.y0 y0Var = (rg.y0) this.f41845e;
                drawable = ((org.telegram.ui.ActionBar.f3) y0Var).shadowDrawable;
                int i13 = y0Var.M;
                i11 = ((org.telegram.ui.ActionBar.f3) y0Var).backgroundPaddingTop;
                drawable.setBounds(0, org.telegram.messenger.bi.D(2.0f, i11 + i13, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.f3) y0Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.a8 a8Var = y0Var.N;
                if (a8Var != null && a8Var.getVisibility() == 0 && y0Var.N.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, y0Var.N.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + y0Var.N.getBottom());
                    drawable3.setAlpha((int) (y0Var.N.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 11:
                yh.s3 s3Var = (yh.s3) this.f41845e;
                s3Var.J(canvas, this);
                canvas.save();
                float d11 = d();
                float dp2 = AndroidUtilities.dp(12.0f);
                RectF rectF5 = (RectF) this.f41843b;
                rectF5.set(yh.s3.o1(s3Var), d11, getWidth() - yh.s3.p1(s3Var), getHeight() + dp2);
                Paint paint7 = (Paint) this.f41844c;
                paint7.setColor(s3Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5));
                Path path2 = (Path) this.d;
                path2.rewind();
                path2.addRoundRect(rectF5, dp2, dp2, Path.Direction.CW);
                canvas.drawPath(path2, paint7);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                org.telegram.ui.Components.ab abVar = s3Var.f26023e;
                if (abVar != null && abVar.getVisibility() == 0 && abVar.getAlpha() > 0.0f) {
                    if (abVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(abVar.getX(), abVar.getY(), abVar.getX() + abVar.getMeasuredWidth(), abVar.getY() + abVar.getMeasuredHeight(), (int) (abVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(abVar.getX(), abVar.getY(), abVar.getX() + abVar.getMeasuredWidth(), abVar.getY() + abVar.getMeasuredHeight());
                    }
                    canvas.translate(abVar.getX(), abVar.getY());
                    abVar.draw(canvas);
                    canvas.restore();
                }
                s3Var.I(canvas, this);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        switch (this.f41842a) {
            case 2:
                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) this.f41845e;
                if (b51Var.J != null && b51Var.K != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + b51Var.J.x());
                    }
                    if (b51Var.J.x() && b51Var.K.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = b51Var.K.b(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        Log.d("TA2", "checkOnTap=" + b10);
                    }
                    if (b10) {
                        motionEvent.setAction(3);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                rg.y0 y0Var = (rg.y0) this.f41845e;
                if (motionEvent.getAction() == 0) {
                    float y3 = motionEvent.getY();
                    int i11 = y0Var.M;
                    i10 = ((org.telegram.ui.ActionBar.f3) y0Var).backgroundPaddingTop;
                    if (y3 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        y0Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                yh.s3 s3Var = (yh.s3) this.f41845e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d() && yh.s3.m1(s3Var).isAttachedToWindow()) {
                    s3Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f41842a) {
            case 0:
                RectF rectF = (RectF) this.f41843b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((v5) this.f41845e).u0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
                invalidate();
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        ImageReceiver photoImage;
        switch (this.f41842a) {
            case 6:
                float[] fArr = (float[]) this.d;
                Path path = (Path) this.f41843b;
                Matrix matrix = (Matrix) this.f41844c;
                ci.b6 b6Var = (ci.b6) this.f41845e;
                qg.x0 x0Var = b6Var.f46228r0;
                if (view == b6Var.f46233w0) {
                    org.telegram.ui.Cells.u1 q6 = qg.e1.q(b6Var);
                    if (q6 == null || (photoImage = q6.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.getImageWidth() / b6Var.f46235y0, photoImage.getImageHeight() / b6Var.f46236z0);
                    matrix.postScale((b6Var.f46235y0 / b6Var.f46233w0.getWidth()) * max, (b6Var.f46236z0 / b6Var.f46233w0.getHeight()) * max);
                    matrix.postTranslate((photoImage.getCenterX() + (q6.getX() + x0Var.getX())) - ((b6Var.f46235y0 * max) / 2.0f), (photoImage.getCenterY() + (q6.getY() + x0Var.getY())) - ((b6Var.f46236z0 * max) / 2.0f));
                    b6Var.f46233w0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    AndroidUtilities.rectTmp.set(photoImage.getImageX() + q6.getX() + x0Var.getX(), photoImage.getImageY() + q6.getY() + x0Var.getY(), photoImage.getImageX2() + q6.getX() + x0Var.getX(), photoImage.getImageY2() + q6.getY() + x0Var.getY());
                    for (int i10 = 0; i10 < photoImage.getRoundRadius().length; i10++) {
                        int i11 = i10 * 2;
                        fArr[i11] = photoImage.getRoundRadius()[i10];
                        fArr[i11 + 1] = photoImage.getRoundRadius()[i10];
                    }
                    path.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            case 7:
            case 8:
            default:
                return super.drawChild(canvas, view, j3);
            case 9:
                Path path2 = (Path) this.f41844c;
                if (view == ((ScrollView) this.d)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((rg.y0) this.f41845e).M, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 10:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f41843b;
                yf.y yVar = (yf.y) this.d;
                yf.y yVar2 = (yf.y) this.f41844c;
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                th.f fVar = (th.f) this.f41845e;
                int i12 = (int) fVar.X.f16345e;
                if (view == fVar.f48471h0 && i12 > 0) {
                    yVar2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = org.telegram.ui.ActionBar.i6.f20868h5;
                    yVar2.b(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
                    yVar2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    yVar.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    yVar.b(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
                    yVar.draw(canvas);
                }
                return drawChild2;
            case 11:
                yh.s3 s3Var = (yh.s3) this.f41845e;
                if (view == s3Var.f26023e) {
                    return false;
                }
                if (view != s3Var.f53165e0) {
                    canvas.save();
                    canvas.clipPath((Path) this.d);
                    boolean drawChild3 = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild3;
                }
                return super.drawChild(canvas, view, j3);
        }
    }

    public void e() {
        float d = d();
        yh.s3 s3Var = (yh.s3) this.f41845e;
        yh.f2 f2Var = s3Var.f53165e0;
        f2Var.setTranslationY(d - f2Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - f2Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        f2Var.setAlpha(s3Var.Z0.a(0) * clamp01);
        f2Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        f2Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        yh.p3 p3Var = s3Var.f53167f0;
        p3Var.setTranslationY(d);
        s3Var.f53169g0.setTranslationY(p3Var.getRealHeight() + d);
        s3Var.f53190s0.setTranslationY(p3Var.getRealHeight() + d);
        s3Var.f53197z0.setTranslationY(p3Var.getRealHeight() + d);
        s3Var.B0.setTranslationY(p3Var.getRealHeight() + d);
        FrameLayout frameLayout = s3Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(s3Var.f53183o0, s3Var.d.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f41842a) {
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f41842a) {
            case 2:
                super.onAttachedToWindow();
                org.telegram.ui.Components.tc.a(this, new ci.a9(9));
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f41842a) {
            case 2:
                super.onDetachedFromWindow();
                org.telegram.ui.Components.tc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f41842a) {
            case 1:
                RectF rectF = (RectF) this.f41843b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.d;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                float dp = AndroidUtilities.dp(4.0f);
                fArr[7] = dp;
                fArr[6] = dp;
                fArr[5] = dp;
                fArr[4] = dp;
                Path path = (Path) this.f41844c;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = (Paint) this.f41845e;
                paint.setColor(2130706432);
                canvas.drawPath(path, paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int left;
        int boundsRight;
        int i15;
        switch (this.f41842a) {
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.f41845e;
                if (photoViewer.H0.getVisibility() != 8) {
                    if (photoViewer.S0.getVisibility() == 0) {
                        i14 = AndroidUtilities.dp(63.0f);
                    } else {
                        i14 = 0;
                    }
                    int measuredWidth = (((i12 - i10) - i14) - photoViewer.H0.getMeasuredWidth()) / 2;
                    dc1 dc1Var = photoViewer.H0;
                    dc1Var.layout(measuredWidth, dc1Var.getTop(), photoViewer.H0.getMeasuredWidth() + measuredWidth, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    return;
                }
                return;
            case 6:
                ci.b6 b6Var = (ci.b6) this.f41845e;
                qg.x0 x0Var = b6Var.f46228r0;
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < x0Var.getChildCount(); i17++) {
                    View childAt = x0Var.getChildAt(i17);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        left2 = childAt.getLeft() + u1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = u1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                        left2 = childAt.getLeft() + w0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = w0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i16 = Math.max(right, i16);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i16 = Math.max(right, i16);
                }
                x0Var.layout(-measuredWidth2, 0, x0Var.getMeasuredWidth() - measuredWidth2, x0Var.getMeasuredHeight());
                TextureView textureView = b6Var.f46233w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), x0Var.getMeasuredHeight());
                    return;
                }
                return;
            case 7:
                if (getChildCount() == 2) {
                    View childAt2 = getChildAt(0);
                    View childAt3 = getChildAt(1);
                    int measuredWidth3 = childAt2.getMeasuredWidth();
                    int i18 = i13 - i11;
                    childAt2.layout(0, 0, measuredWidth3, i18);
                    childAt3.layout(measuredWidth3, 0, i12 - i10, i18);
                    return;
                }
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                yh.s3 s3Var = (yh.s3) this.f41845e;
                gg.m0 m0Var = s3Var.R0;
                if (m0Var != null) {
                    int finalHeight = s3Var.f53167f0.getFinalHeight();
                    int A1 = s3Var.A1();
                    if (s3Var.Z0.d(1) && s3Var.f53181n0.getVisibility() == 0) {
                        i15 = s3Var.f53181n0.getMeasuredHeight();
                    } else {
                        i15 = 0;
                    }
                    m0Var.F(finalHeight, A1 + i15);
                }
                s3Var.U1();
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int left;
        int boundsRight;
        int i13;
        float measuredWidth;
        int w02;
        int w03;
        int i14;
        int i15;
        switch (this.f41842a) {
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.f41845e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.H0.getLayoutParams();
                if (photoViewer.S0.getVisibility() == 0) {
                    i12 = AndroidUtilities.dp(63.0f);
                } else {
                    i12 = 0;
                }
                layoutParams.rightMargin = i12;
                super.onMeasure(i10, i11);
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 5:
            case 8:
            case 10:
            default:
                super.onMeasure(i10, i11);
                return;
            case 6:
                ci.b6 b6Var = (ci.b6) this.f41845e;
                qg.x0 x0Var = b6Var.f46228r0;
                x0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = b6Var.f46233w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < x0Var.getChildCount(); i17++) {
                    View childAt = x0Var.getChildAt(i17);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        left2 = childAt.getLeft() + u1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = u1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                        left2 = childAt.getLeft() + w0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = w0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i16 = Math.max(right, i16);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i16 = Math.max(right, i16);
                }
                setMeasuredDimension(i16 - measuredWidth2, x0Var.getMeasuredHeight());
                return;
            case 7:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f41843b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f41845e;
                TextView textView = limitPreviewView.f24254w;
                org.telegram.ui.Components.kh0 kh0Var = limitPreviewView.f24246g0;
                org.telegram.ui.Components.r6 r6Var = limitPreviewView.N;
                org.telegram.ui.Components.kh0 kh0Var2 = limitPreviewView.f24245f0;
                org.telegram.ui.Components.r6 r6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    kh0Var2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    int measuredWidth3 = kh0Var2.getMeasuredWidth();
                    int measuredWidth4 = r6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    int i18 = 0;
                    if (textView.getVisibility() == 0) {
                        i13 = textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    } else {
                        i13 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i13);
                    kh0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    if (limitPreviewView.P) {
                        float f7 = limitPreviewView.f24235a;
                        float f10 = 0.0f;
                        int i19 = -1;
                        if (f7 == 0.0f) {
                            limitPreviewView.f24251n = 0;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (limitPreviewView.L || limitPreviewView.f24243e0 != null) {
                                    w03 = -1;
                                } else {
                                    w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var);
                                }
                                r6Var2.setTextColor(w03);
                                if (limitPreviewView.f24243e0 == null) {
                                    i19 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var);
                                }
                                r6Var.setTextColor(i19);
                            }
                        } else if (f7 < 1.0f) {
                            if (limitPreviewView.L) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = kh0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            if (!limitPreviewView.L) {
                                f10 = kh0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            limitPreviewView.f24251n = (int) ((((size - measuredWidth) - f10) * limitPreviewView.f24235a) + measuredWidth);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (limitPreviewView.L || limitPreviewView.f24243e0 != null) {
                                    w02 = -1;
                                } else {
                                    w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var);
                                }
                                r6Var2.setTextColor(w02);
                                r6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.f24251n = size;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                r6Var2.setTextColor(-1);
                                r6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int measuredWidth5 = kh0Var.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.O.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        if (r6Var2.getVisibility() == 0) {
                            i18 = r6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        }
                        int clamp = (int) Utilities.clamp(size * limitPreviewView.f24235a, size - Math.max(measuredWidth5, measuredWidth6 + i18), max);
                        limitPreviewView.f24251n = clamp;
                        kh0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        kh0Var.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.f24251n, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    setMeasuredDimension(size, size2);
                    return;
                }
                super.onMeasure(i10, i11);
                return;
            case 9:
                rg.y0 y0Var = (rg.y0) this.f41845e;
                y0Var.L = 0;
                ScrollView scrollView = (ScrollView) this.d;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE));
                int size3 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i14 = ((org.telegram.ui.ActionBar.f3) y0Var).backgroundPaddingTop;
                y0Var.L = i14 + size3;
                super.onMeasure(i10, i11);
                y0Var.B();
                return;
            case 11:
                yh.s3 s3Var = (yh.s3) this.f41845e;
                int bottomInset = s3Var.getBottomInset();
                int i20 = 0;
                setPadding(0, 0, 0, bottomInset);
                s3Var.f53167f0.L.setPadding(0, 0, 0, bottomInset);
                int size4 = View.MeasureSpec.getSize(i11);
                s3Var.h = size4;
                int size5 = View.MeasureSpec.getSize(i10);
                for (int i21 = 0; i21 < getChildCount(); i21++) {
                    View childAt2 = getChildAt(i21);
                    if (childAt2 instanceof ci.d4) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                    } else if (childAt2 == s3Var.d) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(size4 - bottomInset, 1073741824));
                    } else {
                        if (childAt2.getLayoutParams() != null && childAt2.getLayoutParams().height == -1) {
                            i15 = size4;
                        } else {
                            i15 = 9999;
                        }
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size5, size4);
                gg.m0 m0Var = s3Var.R0;
                if (m0Var != null) {
                    int finalHeight = s3Var.f53167f0.getFinalHeight();
                    int A1 = s3Var.A1();
                    if (s3Var.Z0.d(1) && s3Var.f53181n0.getVisibility() == 0) {
                        i20 = s3Var.f53181n0.getMeasuredHeight();
                    }
                    m0Var.F(finalHeight, A1 + i20);
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f41842a) {
            case 3:
                super.setAlpha(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f41845e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f7);
                }
                bt0 bt0Var = photoViewer.U1;
                if (bt0Var != null && bt0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.f34089y7[0] * f7);
                }
                ct0 ct0Var = photoViewer.V1;
                if (ct0Var != null && ct0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(f7 * photoViewer.f34098z7[0]);
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f41842a) {
            case 2:
                super.setTranslationY(f7);
                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) this.f41845e;
                FrameLayout frameLayout = b51Var.topBulletinContainer;
                frameLayout.setTranslationY(Math.max(b51Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, b51Var.C(true)) + ((-frameLayout.getTop()) - b51Var.topBulletinContainer.getHeight()) + f7);
                return;
            case 3:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.f41845e;
                FrameLayout frameLayout2 = photoViewer.R7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.R7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * org.telegram.messenger.q.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                k0 k0Var = photoViewer.X1;
                if (k0Var != null) {
                    k0Var.setTranslationY(f7);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f7);
                    return;
                }
                return;
            case 9:
                super.setTranslationY(f7);
                ((rg.y0) this.f41845e).onContainerTranslationYChanged(f7);
                return;
            case 11:
                super.setTranslationY(f7);
                FrameLayout frameLayout3 = ((yh.s3) this.f41845e).topBulletinContainer;
                if (frameLayout3 != null) {
                    frameLayout3.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                    return;
                }
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        int i11;
        switch (this.f41842a) {
            case 3:
                super.setVisibility(i10);
                PhotoViewer photoViewer = (PhotoViewer) this.f41845e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    FrameLayout frameLayout2 = photoViewer.R7;
                    if (i10 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    frameLayout2.setVisibility(i11);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public t5(ci.b6 b6Var, Context context) {
        super(context);
        this.f41845e = b6Var;
        this.f41844c = new Matrix();
        this.d = new float[8];
        this.f41843b = new Path();
    }

    public t5(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f41845e = limitPreviewView;
        this.f41843b = e6Var;
        this.f41844c = new Paint();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(-1);
    }

    public t5(Context context, org.telegram.ui.ActionBar.e6 e6Var, th.f fVar) {
        super(context);
        this.f41845e = fVar;
        this.f41843b = e6Var;
        this.f41844c = new yf.y(2);
        this.d = new yf.y(8);
    }

    public t5(rg.y0 y0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.f41845e = y0Var;
        this.d = scrollView;
        this.f41843b = drawable;
        this.f41844c = new Path();
    }

    public t5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.bi.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20905j5, e6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f41844c = imageView;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f41843b = g2Var;
        imageView.setImageDrawable(g2Var);
        g2Var.a(-1);
        addView(imageView, w7.x5.a(24.0f, 16.0f, 16.0f, 16.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 48));
        imageView.setOnClickListener(new m60(this, 28));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    public t5(v5 v5Var, Context context) {
        super(context);
        this.f41845e = v5Var;
        this.f41843b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f41844c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, w7.x5.e(-2, -2, 1));
        addView(textView, w7.x5.a(-2.0f, 0.0f, 25.0f, 0.0f, 0.0f, -2, 1));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k10 = i0.a.k(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, 0, k10, k10));
    }

    public t5(org.telegram.ui.Components.b51 b51Var, Context context) {
        super(context);
        this.f41845e = b51Var;
        this.f41844c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(b51Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5));
        org.telegram.ui.ActionBar.i6.m(paint);
    }

    public t5(xd1 xd1Var, Activity activity) {
        super(activity);
        this.f41845e = xd1Var;
        this.f41844c = new Paint(1);
        this.d = new Paint(1);
        this.f41843b = new Paint(1);
    }

    public t5(yh.s3 s3Var, Context context) {
        super(context);
        this.f41845e = s3Var;
        this.f41843b = new RectF();
        this.f41844c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public t5(rg.f0 f0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f41845e = f0Var;
        this.f41843b = e6Var;
        this.f41844c = new rg.a1(org.telegram.ui.ActionBar.i6.Lj, org.telegram.ui.ActionBar.i6.Mj, -1, -1, e6Var);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public t5(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f41845e = photoViewer;
        this.f41844c = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f41843b = new Matrix();
    }
}
