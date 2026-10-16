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
public final class x5 extends FrameLayout {
    public final int f41431a = 1;
    public Object f41432b;
    public Object f41433c;
    public Object d;
    public Object e;

    public x5(Context context) {
        super(context);
    }

    public float a() {
        zh.r3 r3Var = (zh.r3) this.e;
        return (r3Var.Z0.a(3) * r3Var.B0.getMeasuredHeight()) + (r3Var.Z0.a(2) * r3Var.f51109z0.getMeasuredHeight()) + (r3Var.Z0.a(1) * r3Var.f51102s0.getMeasuredHeight()) + (r3Var.Z0.a(0) * r3Var.f51081g0.getMeasuredHeight()) + r3Var.f51079f0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        int i10;
        float f7;
        float f10;
        ImageView imageView = (ImageView) this.f41433c;
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
        textView.setLayoutParams(w7.z5.a(-2.0f, f7, 14.0f, f10, 12.0f, -1, 55));
    }

    public void c(int i10, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.f41433c).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        f4.d dVar;
        float max = Math.max(0.0f, getHeight() - a());
        zh.r3 r3Var = (zh.r3) this.e;
        org.telegram.ui.Components.mm0 mm0Var = r3Var.d;
        int childCount = mm0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = mm0Var.getChildAt(childCount);
            mm0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - r3Var.f51079f0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (r3Var.Z0.a(4) * r3Var.getBottomInset()) + max;
        Float f7 = r3Var.Y0;
        if (f7 != null && (dVar = r3Var.Z0) != null && dVar.f8934c < 1.0f) {
            return AndroidUtilities.lerp(f7.floatValue(), a2, r3Var.Z0.f8934c);
        }
        return a2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        int v;
        FrameLayout frameLayout;
        int i10;
        Paint e;
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        Drawable drawable;
        int i11;
        Drawable drawable2;
        switch (this.f41431a) {
            case 2:
                Path path = (Path) this.f41433c;
                org.telegram.ui.Components.x41 x41Var = (org.telegram.ui.Components.x41) this.e;
                boolean z11 = true;
                float C = x41Var.C(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), w7.r.a(C / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                x41Var.f30871x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, C));
                if (C <= AndroidUtilities.statusBarHeight / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f41432b;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f41432b = Boolean.valueOf(z10);
                    Window window = x41Var.getWindow();
                    if (z10) {
                        v = x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5);
                    } else {
                        v = org.telegram.ui.ActionBar.g6.v(x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19880s8), 855638016);
                    }
                    if (AndroidUtilities.computePerceivedBrightness(v) <= 0.721f) {
                        z11 = false;
                    }
                    AndroidUtilities.setLightStatusBar(window, z11);
                }
                x41Var.topBulletinContainer.setTranslationY(Math.max(x41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, C) + getTranslationY() + ((-frameLayout.getTop()) - x41Var.topBulletinContainer.getHeight()));
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, C, getWidth(), getHeight() + lerp);
                path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(path, (Paint) this.d);
                super.dispatchDraw(canvas);
                return;
            case 3:
                LinearGradient linearGradient = (LinearGradient) this.d;
                Matrix matrix = (Matrix) this.f41432b;
                Paint paint = (Paint) this.f41433c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.S4) {
                    if (photoViewer.f32006n0.getVisibility() == 0) {
                        i10 = getMeasuredHeight() - AndroidUtilities.dp(48.0f);
                    } else {
                        i10 = 0;
                    }
                    int i12 = photoViewer.f31912c2;
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
                Paint paint2 = (Paint) this.f41432b;
                Paint paint3 = (Paint) this.d;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp = AndroidUtilities.dp(8.0f);
                Paint paint4 = (Paint) this.f41433c;
                paint4.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                ce1 ce1Var = (ce1) this.e;
                paint4.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.k(-16777216, (int) (ce1Var.R1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, dp, dp, paint4);
                rd1 rd1Var = ce1Var.f34639x0;
                cd1 cd1Var = ce1Var.f34577a;
                org.telegram.ui.ActionBar.g6.s(this, rd1Var, cd1Var);
                Paint F = cd1Var.F("paintChatActionBackground");
                int alpha = F.getAlpha();
                F.setAlpha((int) (ce1Var.R1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, dp, dp, F);
                F.setAlpha(alpha);
                if (ce1Var.M1) {
                    float f7 = ce1Var.f34616n1;
                    if (f7 > 0.0f) {
                        paint2.setColor(i0.a.k(-16777216, (int) (f7 * 255.0f * ce1Var.f34618o1)));
                        canvas.drawRoundRect(rectF2, dp, dp, paint2);
                    }
                }
                paint3.setColor(520093695);
                paint3.setAlpha((int) (ce1Var.R1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, dp, dp, paint3);
                super.dispatchDraw(canvas);
                return;
            case 7:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f41432b;
                Paint paint5 = (Paint) this.f41433c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (limitPreviewView.P) {
                    if (!limitPreviewView.f22926c0 && !limitPreviewView.R) {
                        paint5.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.e7, c6Var));
                    } else {
                        paint5.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19690i6, c6Var));
                    }
                } else {
                    paint5.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19543a7, c6Var));
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                sg.t tVar = limitPreviewView.f22928e0;
                if (tVar != null) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((z5) ((b1) tVar).f34139b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.f22936n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.R) {
                    e = limitPreviewView.K;
                } else if (limitPreviewView.f22928e0 != null) {
                    e = (Paint) this.d;
                } else {
                    e = sg.b1.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.f22941y;
                if (viewGroup != null) {
                    sg.a1 a1Var = limitPreviewView.E;
                    if (a1Var != null) {
                        e = a1Var.f45117f;
                        a1Var.a();
                        Matrix matrix2 = a1Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, limitPreviewView.f22925c / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, -limitPreviewView.F);
                        a1Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f10 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f10 += view.getY();
                        }
                        sg.b1 d = sg.b1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f10, measuredWidth, measuredHeight);
                    }
                } else {
                    sg.b1 d10 = sg.b1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha2 = e.getAlpha();
                if (limitPreviewView.V && (valueAnimator2 = limitPreviewView.f22933i0) != null) {
                    e.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.U && (valueAnimator = limitPreviewView.f22933i0) != null) {
                    e.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.P) {
                    if (!limitPreviewView.L && !limitPreviewView.M) {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.f22936n, getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(limitPreviewView.f22936n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e);
                e.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.E == null && limitPreviewView.f22927d0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                Paint paint6 = (Paint) this.d;
                paint6.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Ii, (org.telegram.ui.ActionBar.c6) this.f41432b));
                sg.f0 f0Var = (sg.f0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint6);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint6);
                RectF rectF4 = AndroidUtilities.rectTmp;
                int top = f0Var.d.getTop();
                rectF4.set(f0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((f0Var.d.getBottom() + top) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + f0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                sg.a1 a1Var2 = (sg.a1) this.f41433c;
                a1Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), a1Var2.f45117f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 9:
                Drawable drawable3 = (Drawable) this.f41432b;
                sg.y0 y0Var = (sg.y0) this.e;
                drawable = ((org.telegram.ui.ActionBar.e3) y0Var).shadowDrawable;
                int i13 = y0Var.M;
                i11 = ((org.telegram.ui.ActionBar.e3) y0Var).backgroundPaddingTop;
                drawable.setBounds(0, org.telegram.messenger.sk.D(2.0f, i11 + i13, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.e3) y0Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.b8 b8Var = y0Var.N;
                if (b8Var != null && b8Var.getVisibility() == 0 && y0Var.N.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, y0Var.N.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + y0Var.N.getBottom());
                    drawable3.setAlpha((int) (y0Var.N.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 11:
                zh.r3 r3Var = (zh.r3) this.e;
                r3Var.J(canvas, this);
                canvas.save();
                float d11 = d();
                float dp2 = AndroidUtilities.dp(12.0f);
                RectF rectF5 = (RectF) this.f41432b;
                rectF5.set(zh.r3.o1(r3Var), d11, getWidth() - zh.r3.p1(r3Var), getHeight() + dp2);
                Paint paint7 = (Paint) this.f41433c;
                paint7.setColor(r3Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
                Path path2 = (Path) this.d;
                path2.rewind();
                path2.addRoundRect(rectF5, dp2, dp2, Path.Direction.CW);
                canvas.drawPath(path2, paint7);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                org.telegram.ui.Components.za zaVar = r3Var.e;
                if (zaVar != null && zaVar.getVisibility() == 0 && zaVar.getAlpha() > 0.0f) {
                    if (zaVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(zaVar.getX(), zaVar.getY(), zaVar.getX() + zaVar.getMeasuredWidth(), zaVar.getY() + zaVar.getMeasuredHeight(), (int) (zaVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(zaVar.getX(), zaVar.getY(), zaVar.getX() + zaVar.getMeasuredWidth(), zaVar.getY() + zaVar.getMeasuredHeight());
                    }
                    canvas.translate(zaVar.getX(), zaVar.getY());
                    zaVar.draw(canvas);
                    canvas.restore();
                }
                r3Var.I(canvas, this);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        switch (this.f41431a) {
            case 2:
                org.telegram.ui.Components.x41 x41Var = (org.telegram.ui.Components.x41) this.e;
                if (x41Var.J != null && x41Var.K != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + x41Var.J.x());
                    }
                    if (x41Var.J.x() && x41Var.K.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = x41Var.K.b(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        Log.d("TA2", "checkOnTap=" + b10);
                    }
                    if (b10) {
                        motionEvent.setAction(3);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                sg.y0 y0Var = (sg.y0) this.e;
                if (motionEvent.getAction() == 0) {
                    float y3 = motionEvent.getY();
                    int i11 = y0Var.M;
                    i10 = ((org.telegram.ui.ActionBar.e3) y0Var).backgroundPaddingTop;
                    if (y3 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        y0Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                zh.r3 r3Var = (zh.r3) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d() && zh.r3.m1(r3Var).isAttachedToWindow()) {
                    r3Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f41431a) {
            case 0:
                RectF rectF = (RectF) this.f41432b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((z5) this.e).u0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
                invalidate();
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        ImageReceiver photoImage;
        switch (this.f41431a) {
            case 6:
                float[] fArr = (float[]) this.d;
                Path path = (Path) this.f41432b;
                Matrix matrix = (Matrix) this.f41433c;
                di.a6 a6Var = (di.a6) this.e;
                rg.z0 z0Var = a6Var.f44018r0;
                if (view == a6Var.f44023w0) {
                    org.telegram.ui.Cells.u1 q6 = rg.g1.q(a6Var);
                    if (q6 == null || (photoImage = q6.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.getImageWidth() / a6Var.f44025y0, photoImage.getImageHeight() / a6Var.f44026z0);
                    matrix.postScale((a6Var.f44025y0 / a6Var.f44023w0.getWidth()) * max, (a6Var.f44026z0 / a6Var.f44023w0.getHeight()) * max);
                    matrix.postTranslate((photoImage.getCenterX() + (q6.getX() + z0Var.getX())) - ((a6Var.f44025y0 * max) / 2.0f), (photoImage.getCenterY() + (q6.getY() + z0Var.getY())) - ((a6Var.f44026z0 * max) / 2.0f));
                    a6Var.f44023w0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    AndroidUtilities.rectTmp.set(photoImage.getImageX() + q6.getX() + z0Var.getX(), photoImage.getImageY() + q6.getY() + z0Var.getY(), photoImage.getImageX2() + q6.getX() + z0Var.getX(), photoImage.getImageY2() + q6.getY() + z0Var.getY());
                    for (int i10 = 0; i10 < photoImage.getRoundRadius().length; i10++) {
                        int i11 = i10 * 2;
                        fArr[i11] = photoImage.getRoundRadius()[i10];
                        fArr[i11 + 1] = photoImage.getRoundRadius()[i10];
                    }
                    path.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 7:
            case 8:
            default:
                return super.drawChild(canvas, view, j10);
            case 9:
                Path path2 = (Path) this.f41433c;
                if (view == ((ScrollView) this.d)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((sg.y0) this.e).M, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 10:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f41432b;
                zf.z zVar = (zf.z) this.d;
                zf.z zVar2 = (zf.z) this.f41433c;
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                uh.f fVar = (uh.f) this.e;
                int i12 = (int) fVar.X.e;
                if (view == fVar.f46452h0 && i12 > 0) {
                    zVar2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = org.telegram.ui.ActionBar.g6.f19672h5;
                    zVar2.b(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
                    zVar2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    zVar.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    zVar.b(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
                    zVar.draw(canvas);
                }
                return drawChild2;
            case 11:
                zh.r3 r3Var = (zh.r3) this.e;
                if (view == r3Var.e) {
                    return false;
                }
                if (view != r3Var.f51077e0) {
                    canvas.save();
                    canvas.clipPath((Path) this.d);
                    boolean drawChild3 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild3;
                }
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        float d = d();
        zh.r3 r3Var = (zh.r3) this.e;
        zh.e2 e2Var = r3Var.f51077e0;
        e2Var.setTranslationY(d - e2Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - e2Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        e2Var.setAlpha(r3Var.Z0.a(0) * clamp01);
        e2Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        e2Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        zh.o3 o3Var = r3Var.f51079f0;
        o3Var.setTranslationY(d);
        r3Var.f51081g0.setTranslationY(o3Var.getRealHeight() + d);
        r3Var.f51102s0.setTranslationY(o3Var.getRealHeight() + d);
        r3Var.f51109z0.setTranslationY(o3Var.getRealHeight() + d);
        r3Var.B0.setTranslationY(o3Var.getRealHeight() + d);
        FrameLayout frameLayout = r3Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(r3Var.f51095o0, r3Var.d.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f41431a) {
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f41431a) {
            case 2:
                super.onAttachedToWindow();
                org.telegram.ui.Components.sc.a(this, new di.z8(9));
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f41431a) {
            case 2:
                super.onDetachedFromWindow();
                org.telegram.ui.Components.sc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f41431a) {
            case 1:
                RectF rectF = (RectF) this.f41432b;
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
                Path path = (Path) this.f41433c;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = (Paint) this.e;
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
        switch (this.f41431a) {
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.H0.getVisibility() != 8) {
                    if (photoViewer.S0.getVisibility() == 0) {
                        i14 = AndroidUtilities.dp(63.0f);
                    } else {
                        i14 = 0;
                    }
                    int measuredWidth = (((i12 - i10) - i14) - photoViewer.H0.getMeasuredWidth()) / 2;
                    ic1 ic1Var = photoViewer.H0;
                    ic1Var.layout(measuredWidth, ic1Var.getTop(), photoViewer.H0.getMeasuredWidth() + measuredWidth, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    return;
                }
                return;
            case 6:
                di.a6 a6Var = (di.a6) this.e;
                rg.z0 z0Var = a6Var.f44018r0;
                int measuredWidth2 = z0Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < z0Var.getChildCount(); i17++) {
                    View childAt = z0Var.getChildAt(i17);
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
                z0Var.layout(-measuredWidth2, 0, z0Var.getMeasuredWidth() - measuredWidth2, z0Var.getMeasuredHeight());
                TextureView textureView = a6Var.f44023w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), z0Var.getMeasuredHeight());
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
                zh.r3 r3Var = (zh.r3) this.e;
                hg.m0 m0Var = r3Var.R0;
                if (m0Var != null) {
                    int finalHeight = r3Var.f51079f0.getFinalHeight();
                    int A1 = r3Var.A1();
                    if (r3Var.Z0.d(1) && r3Var.f51093n0.getVisibility() == 0) {
                        i15 = r3Var.f51093n0.getMeasuredHeight();
                    } else {
                        i15 = 0;
                    }
                    m0Var.F(finalHeight, A1 + i15);
                }
                r3Var.U1();
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
        switch (this.f41431a) {
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
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
                di.a6 a6Var = (di.a6) this.e;
                rg.z0 z0Var = a6Var.f44018r0;
                z0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = a6Var.f44023w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(z0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(z0Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = z0Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < z0Var.getChildCount(); i17++) {
                    View childAt = z0Var.getChildAt(i17);
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
                setMeasuredDimension(i16 - measuredWidth2, z0Var.getMeasuredHeight());
                return;
            case 7:
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f41432b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                TextView textView = limitPreviewView.f22939w;
                org.telegram.ui.Components.jh0 jh0Var = limitPreviewView.f22931g0;
                org.telegram.ui.Components.s6 s6Var = limitPreviewView.N;
                org.telegram.ui.Components.jh0 jh0Var2 = limitPreviewView.f22930f0;
                org.telegram.ui.Components.s6 s6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    jh0Var2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    int measuredWidth3 = jh0Var2.getMeasuredWidth();
                    int measuredWidth4 = s6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    int i18 = 0;
                    if (textView.getVisibility() == 0) {
                        i13 = textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    } else {
                        i13 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i13);
                    jh0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    if (limitPreviewView.P) {
                        float f7 = limitPreviewView.f22921a;
                        float f10 = 0.0f;
                        int i19 = -1;
                        if (f7 == 0.0f) {
                            limitPreviewView.f22936n = 0;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (limitPreviewView.L || limitPreviewView.f22928e0 != null) {
                                    w03 = -1;
                                } else {
                                    w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var);
                                }
                                s6Var2.setTextColor(w03);
                                if (limitPreviewView.f22928e0 == null) {
                                    i19 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var);
                                }
                                s6Var.setTextColor(i19);
                            }
                        } else if (f7 < 1.0f) {
                            if (limitPreviewView.L) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = jh0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            if (!limitPreviewView.L) {
                                f10 = jh0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            limitPreviewView.f22936n = (int) ((((size - measuredWidth) - f10) * limitPreviewView.f22921a) + measuredWidth);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (limitPreviewView.L || limitPreviewView.f22928e0 != null) {
                                    w02 = -1;
                                } else {
                                    w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var);
                                }
                                s6Var2.setTextColor(w02);
                                s6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.f22936n = size;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                s6Var2.setTextColor(-1);
                                s6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int measuredWidth5 = jh0Var.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.O.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        if (s6Var2.getVisibility() == 0) {
                            i18 = s6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        }
                        int clamp = (int) Utilities.clamp(size * limitPreviewView.f22921a, size - Math.max(measuredWidth5, measuredWidth6 + i18), max);
                        limitPreviewView.f22936n = clamp;
                        jh0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        jh0Var.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.f22936n, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    setMeasuredDimension(size, size2);
                    return;
                }
                super.onMeasure(i10, i11);
                return;
            case 9:
                sg.y0 y0Var = (sg.y0) this.e;
                y0Var.L = 0;
                ScrollView scrollView = (ScrollView) this.d;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE));
                int size3 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i14 = ((org.telegram.ui.ActionBar.e3) y0Var).backgroundPaddingTop;
                y0Var.L = i14 + size3;
                super.onMeasure(i10, i11);
                y0Var.B();
                return;
            case 11:
                zh.r3 r3Var = (zh.r3) this.e;
                int bottomInset = r3Var.getBottomInset();
                int i20 = 0;
                setPadding(0, 0, 0, bottomInset);
                r3Var.f51079f0.L.setPadding(0, 0, 0, bottomInset);
                int size4 = View.MeasureSpec.getSize(i11);
                r3Var.h = size4;
                int size5 = View.MeasureSpec.getSize(i10);
                for (int i21 = 0; i21 < getChildCount(); i21++) {
                    View childAt2 = getChildAt(i21);
                    if (childAt2 instanceof di.d4) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                    } else if (childAt2 == r3Var.d) {
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
                hg.m0 m0Var = r3Var.R0;
                if (m0Var != null) {
                    int finalHeight = r3Var.f51079f0.getFinalHeight();
                    int A1 = r3Var.A1();
                    if (r3Var.Z0.d(1) && r3Var.f51093n0.getVisibility() == 0) {
                        i20 = r3Var.f51093n0.getMeasuredHeight();
                    }
                    m0Var.F(finalHeight, A1 + i20);
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f41431a) {
            case 3:
                super.setAlpha(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f7);
                }
                ht0 ht0Var = photoViewer.U1;
                if (ht0Var != null && ht0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.f32114y7[0] * f7);
                }
                it0 it0Var = photoViewer.V1;
                if (it0Var != null && it0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(f7 * photoViewer.f32123z7[0]);
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
        switch (this.f41431a) {
            case 2:
                super.setTranslationY(f7);
                org.telegram.ui.Components.x41 x41Var = (org.telegram.ui.Components.x41) this.e;
                FrameLayout frameLayout = x41Var.topBulletinContainer;
                frameLayout.setTranslationY(Math.max(x41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, x41Var.C(true)) + ((-frameLayout.getTop()) - x41Var.topBulletinContainer.getHeight()) + f7);
                return;
            case 3:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout2 = photoViewer.R7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.R7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * org.telegram.messenger.g0.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                l0 l0Var = photoViewer.X1;
                if (l0Var != null) {
                    l0Var.setTranslationY(f7);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f7);
                    return;
                }
                return;
            case 9:
                super.setTranslationY(f7);
                ((sg.y0) this.e).onContainerTranslationYChanged(f7);
                return;
            case 11:
                super.setTranslationY(f7);
                FrameLayout frameLayout3 = ((zh.r3) this.e).topBulletinContainer;
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
        switch (this.f41431a) {
            case 3:
                super.setVisibility(i10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
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

    public x5(di.a6 a6Var, Context context) {
        super(context);
        this.e = a6Var;
        this.f41433c = new Matrix();
        this.d = new float[8];
        this.f41432b = new Path();
    }

    public x5(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = limitPreviewView;
        this.f41432b = c6Var;
        this.f41433c = new Paint();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(-1);
    }

    public x5(Context context, org.telegram.ui.ActionBar.c6 c6Var, uh.f fVar) {
        super(context);
        this.e = fVar;
        this.f41432b = c6Var;
        this.f41433c = new zf.z(2);
        this.d = new zf.z(8);
    }

    public x5(sg.y0 y0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = y0Var;
        this.d = scrollView;
        this.f41432b = drawable;
        this.f41433c = new Path();
    }

    public x5(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.sk.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f41433c = imageView;
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f41432b = f2Var;
        imageView.setImageDrawable(f2Var);
        f2Var.a(-1);
        addView(imageView, w7.z5.a(24.0f, 16.0f, 16.0f, 16.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 48));
        imageView.setOnClickListener(new t60(this, 28));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    public x5(z5 z5Var, Context context) {
        super(context);
        this.e = z5Var;
        this.f41432b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f41433c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, w7.z5.e(-2, -2, 1));
        addView(textView, w7.z5.a(-2.0f, 0.0f, 25.0f, 0.0f, 0.0f, -2, 1));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k10 = i0.a.k(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, k10, k10));
    }

    public x5(org.telegram.ui.Components.x41 x41Var, Context context) {
        super(context);
        this.e = x41Var;
        this.f41433c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(x41Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
        org.telegram.ui.ActionBar.g6.m(paint);
    }

    public x5(ce1 ce1Var, Activity activity) {
        super(activity);
        this.e = ce1Var;
        this.f41433c = new Paint(1);
        this.d = new Paint(1);
        this.f41432b = new Paint(1);
    }

    public x5(zh.r3 r3Var, Context context) {
        super(context);
        this.e = r3Var;
        this.f41432b = new RectF();
        this.f41433c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public x5(sg.f0 f0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = f0Var;
        this.f41432b = c6Var;
        this.f41433c = new sg.a1(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, c6Var);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public x5(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.f41433c = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f41432b = new Matrix();
    }
}
