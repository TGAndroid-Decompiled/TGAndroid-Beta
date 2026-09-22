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
    public final int f37644a = 1;
    public Object f37645b;
    public Object f37646c;
    public Object d;
    public Object e;

    public t5(Context context) {
        super(context);
    }

    public float a() {
        yh.y3 y3Var = (yh.y3) this.e;
        return (y3Var.Y0.a(3) * y3Var.A0.getMeasuredHeight()) + (y3Var.Y0.a(2) * y3Var.f48358y0.getMeasuredHeight()) + (y3Var.Y0.a(1) * y3Var.f48351r0.getMeasuredHeight()) + (y3Var.Y0.a(0) * y3Var.f48330f0.getMeasuredHeight()) + y3Var.f48328e0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        int i10;
        float f7;
        float f10;
        ImageView imageView = (ImageView) this.f37646c;
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
        textView.setLayoutParams(w7.y5.d(-1, -2.0f, 55, f7, 14.0f, f10, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.f37646c).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        f4.d dVar;
        float max = Math.max(0.0f, getHeight() - a());
        yh.y3 y3Var = (yh.y3) this.e;
        org.telegram.ui.Components.yl0 yl0Var = y3Var.d;
        int childCount = yl0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = yl0Var.getChildAt(childCount);
            yl0Var.getClass();
            int S = RecyclerView.S(childAt);
            if (S >= 0) {
                if (S == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (S == 1) {
                    max = childAt.getY();
                    break;
                } else if (S == 0) {
                    max = childAt.getY() - y3Var.f48328e0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (y3Var.Y0.a(4) * y3Var.getBottomInset()) + max;
        Float f7 = y3Var.X0;
        if (f7 != null && (dVar = y3Var.Y0) != null && dVar.f8876c < 1.0f) {
            return AndroidUtilities.lerp(f7.floatValue(), a2, y3Var.Y0.f8876c);
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
        switch (this.f37644a) {
            case 2:
                Path path = (Path) this.f37646c;
                org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) this.e;
                boolean z11 = true;
                float z12 = l41Var.z(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), w7.q.a(z12 / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                l41Var.f25994x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, z12));
                if (z12 <= AndroidUtilities.statusBarHeight / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f37645b;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f37645b = Boolean.valueOf(z10);
                    Window window = l41Var.getWindow();
                    if (z10) {
                        v = l41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19180h5);
                    } else {
                        v = org.telegram.ui.ActionBar.j6.v(l41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19387s8), 855638016);
                    }
                    if (AndroidUtilities.computePerceivedBrightness(v) <= 0.721f) {
                        z11 = false;
                    }
                    AndroidUtilities.setLightStatusBar(window, z11);
                }
                l41Var.topBulletinContainer.setTranslationY(Math.max(l41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, z12) + getTranslationY() + ((-frameLayout.getTop()) - l41Var.topBulletinContainer.getHeight()));
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, z12, getWidth(), getHeight() + lerp);
                path.addRoundRect(rectF, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(path, (Paint) this.d);
                super.dispatchDraw(canvas);
                return;
            case 3:
                LinearGradient linearGradient = (LinearGradient) this.d;
                Matrix matrix = (Matrix) this.f37645b;
                Paint paint = (Paint) this.f37646c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.S4) {
                    if (photoViewer.f31319n0.getVisibility() == 0) {
                        i10 = getMeasuredHeight() - AndroidUtilities.dp(48.0f);
                    } else {
                        i10 = 0;
                    }
                    int i12 = photoViewer.f31226c2;
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
                Paint paint2 = (Paint) this.f37645b;
                Paint paint3 = (Paint) this.d;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp = AndroidUtilities.dp(8.0f);
                Paint paint4 = (Paint) this.f37646c;
                paint4.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                xd1 xd1Var = (xd1) this.e;
                paint4.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.k(-16777216, (int) (xd1Var.R1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, dp, dp, paint4);
                md1 md1Var = xd1Var.f39556x0;
                xc1 xc1Var = xd1Var.f39494a;
                org.telegram.ui.ActionBar.j6.s(this, md1Var, xc1Var);
                Paint G = xc1Var.G("paintChatActionBackground");
                int alpha = G.getAlpha();
                G.setAlpha((int) (xd1Var.R1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, dp, dp, G);
                G.setAlpha(alpha);
                if (xd1Var.M1) {
                    float f7 = xd1Var.f39533n1;
                    if (f7 > 0.0f) {
                        paint2.setColor(i0.a.k(-16777216, (int) (f7 * 255.0f * xd1Var.f39535o1)));
                        canvas.drawRoundRect(rectF2, dp, dp, paint2);
                    }
                }
                paint3.setColor(520093695);
                paint3.setAlpha((int) (xd1Var.R1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, dp, dp, paint3);
                super.dispatchDraw(canvas);
                return;
            case 7:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f37645b;
                Paint paint5 = (Paint) this.f37646c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (limitPreviewView.P) {
                    if (!limitPreviewView.f22343c0 && !limitPreviewView.R) {
                        paint5.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.e7, f6Var));
                    } else {
                        paint5.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19199i6, f6Var));
                    }
                } else {
                    paint5.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19053a7, f6Var));
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                rg.t tVar = limitPreviewView.f22345e0;
                if (tVar != null) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((v5) ((y0) tVar).f39778b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint5);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.f22353n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.R) {
                    e = limitPreviewView.K;
                } else if (limitPreviewView.f22345e0 != null) {
                    e = (Paint) this.d;
                } else {
                    e = rg.a1.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.f22358y;
                if (viewGroup != null) {
                    rg.z0 z0Var = limitPreviewView.E;
                    if (z0Var != null) {
                        e = z0Var.f42875f;
                        z0Var.a();
                        Matrix matrix2 = z0Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, limitPreviewView.f22342c / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, -limitPreviewView.F);
                        z0Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f10 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f10 += view.getY();
                        }
                        rg.a1 d = rg.a1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f10, measuredWidth, measuredHeight);
                    }
                } else {
                    rg.a1 d10 = rg.a1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha2 = e.getAlpha();
                if (limitPreviewView.V && (valueAnimator2 = limitPreviewView.f22350i0) != null) {
                    e.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.U && (valueAnimator = limitPreviewView.f22350i0) != null) {
                    e.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.P) {
                    if (!limitPreviewView.L && !limitPreviewView.M) {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.f22353n, getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(limitPreviewView.f22353n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e);
                e.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.E == null && limitPreviewView.f22344d0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                Paint paint6 = (Paint) this.d;
                paint6.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ii, (org.telegram.ui.ActionBar.f6) this.f37645b));
                rg.f0 f0Var = (rg.f0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint6);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint6);
                RectF rectF4 = AndroidUtilities.rectTmp;
                int top = f0Var.d.getTop();
                rectF4.set(f0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((f0Var.d.getBottom() + top) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + f0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                rg.z0 z0Var2 = (rg.z0) this.f37646c;
                z0Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), z0Var2.f42875f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 9:
                Drawable drawable3 = (Drawable) this.f37645b;
                rg.x0 x0Var = (rg.x0) this.e;
                drawable = ((org.telegram.ui.ActionBar.f3) x0Var).shadowDrawable;
                int i13 = x0Var.M;
                i11 = ((org.telegram.ui.ActionBar.f3) x0Var).backgroundPaddingTop;
                drawable.setBounds(0, org.telegram.messenger.rk.D(2.0f, i11 + i13, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.f3) x0Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.x7 x7Var = x0Var.N;
                if (x7Var != null && x7Var.getVisibility() == 0 && x0Var.N.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, x0Var.N.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + x0Var.N.getBottom());
                    drawable3.setAlpha((int) (x0Var.N.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 11:
                yh.y3 y3Var = (yh.y3) this.e;
                y3Var.I(canvas, this);
                canvas.save();
                float d11 = d();
                float dp2 = AndroidUtilities.dp(12.0f);
                RectF rectF5 = (RectF) this.f37645b;
                rectF5.set(yh.y3.n1(y3Var), d11, getWidth() - yh.y3.o1(y3Var), getHeight() + dp2);
                Paint paint7 = (Paint) this.f37646c;
                paint7.setColor(y3Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19180h5));
                Path path2 = (Path) this.d;
                path2.rewind();
                path2.addRoundRect(rectF5, dp2, dp2, Path.Direction.CW);
                canvas.drawPath(path2, paint7);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                org.telegram.ui.Components.wa waVar = y3Var.e;
                if (waVar != null && waVar.getVisibility() == 0 && waVar.getAlpha() > 0.0f) {
                    if (waVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(waVar.getX(), waVar.getY(), waVar.getX() + waVar.getMeasuredWidth(), waVar.getY() + waVar.getMeasuredHeight(), (int) (waVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(waVar.getX(), waVar.getY(), waVar.getX() + waVar.getMeasuredWidth(), waVar.getY() + waVar.getMeasuredHeight());
                    }
                    canvas.translate(waVar.getX(), waVar.getY());
                    waVar.draw(canvas);
                    canvas.restore();
                }
                y3Var.G(canvas, this);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        switch (this.f37644a) {
            case 2:
                org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) this.e;
                if (l41Var.J != null && l41Var.K != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + l41Var.J.y());
                    }
                    if (l41Var.J.y() && l41Var.K.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = l41Var.K.b(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        Log.d("TA2", "checkOnTap=" + b10);
                    }
                    if (b10) {
                        motionEvent.setAction(3);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                rg.x0 x0Var = (rg.x0) this.e;
                if (motionEvent.getAction() == 0) {
                    float y3 = motionEvent.getY();
                    int i11 = x0Var.M;
                    i10 = ((org.telegram.ui.ActionBar.f3) x0Var).backgroundPaddingTop;
                    if (y3 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        x0Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                yh.y3 y3Var = (yh.y3) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d() && yh.y3.l1(y3Var).isAttachedToWindow()) {
                    y3Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f37644a) {
            case 0:
                RectF rectF = (RectF) this.f37645b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((v5) this.e).t0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        switch (this.f37644a) {
            case 6:
                float[] fArr = (float[]) this.d;
                Path path = (Path) this.f37645b;
                Matrix matrix = (Matrix) this.f37646c;
                ci.c6 c6Var = (ci.c6) this.e;
                qg.y0 y0Var = c6Var.f41665r0;
                if (view == c6Var.f41670w0) {
                    org.telegram.ui.Cells.u1 q6 = qg.f1.q(c6Var);
                    if (q6 == null || (photoImage = q6.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.getImageWidth() / c6Var.f41672y0, photoImage.getImageHeight() / c6Var.f41673z0);
                    matrix.postScale((c6Var.f41672y0 / c6Var.f41670w0.getWidth()) * max, (c6Var.f41673z0 / c6Var.f41670w0.getHeight()) * max);
                    matrix.postTranslate((photoImage.getCenterX() + (q6.getX() + y0Var.getX())) - ((c6Var.f41672y0 * max) / 2.0f), (photoImage.getCenterY() + (q6.getY() + y0Var.getY())) - ((c6Var.f41673z0 * max) / 2.0f));
                    c6Var.f41670w0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    AndroidUtilities.rectTmp.set(photoImage.getImageX() + q6.getX() + y0Var.getX(), photoImage.getImageY() + q6.getY() + y0Var.getY(), photoImage.getImageX2() + q6.getX() + y0Var.getX(), photoImage.getImageY2() + q6.getY() + y0Var.getY());
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
                Path path2 = (Path) this.f37646c;
                if (view == ((ScrollView) this.d)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((rg.x0) this.e).M, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            case 10:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f37645b;
                yf.y yVar = (yf.y) this.d;
                yf.y yVar2 = (yf.y) this.f37646c;
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                th.f fVar = (th.f) this.e;
                int i12 = (int) fVar.X.e;
                if (view == fVar.f43586h0 && i12 > 0) {
                    yVar2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = org.telegram.ui.ActionBar.j6.f19180h5;
                    yVar2.b(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                    yVar2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    yVar.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    yVar.b(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                    yVar.draw(canvas);
                }
                return drawChild2;
            case 11:
                yh.y3 y3Var = (yh.y3) this.e;
                if (view == y3Var.e) {
                    return false;
                }
                if (view != y3Var.f48326d0) {
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
        yh.y3 y3Var = (yh.y3) this.e;
        yh.j2 j2Var = y3Var.f48326d0;
        j2Var.setTranslationY(d - j2Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - j2Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        j2Var.setAlpha(y3Var.Y0.a(0) * clamp01);
        j2Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        j2Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        yh.v3 v3Var = y3Var.f48328e0;
        v3Var.setTranslationY(d);
        y3Var.f48330f0.setTranslationY(v3Var.getRealHeight() + d);
        y3Var.f48351r0.setTranslationY(v3Var.getRealHeight() + d);
        y3Var.f48358y0.setTranslationY(v3Var.getRealHeight() + d);
        y3Var.A0.setTranslationY(v3Var.getRealHeight() + d);
        FrameLayout frameLayout = y3Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(y3Var.f48344n0, y3Var.d.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f37644a) {
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f37644a) {
            case 2:
                super.onAttachedToWindow();
                org.telegram.ui.Components.pc.a(this, new ci.d9(9));
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f37644a) {
            case 2:
                super.onDetachedFromWindow();
                org.telegram.ui.Components.pc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f37644a) {
            case 1:
                RectF rectF = (RectF) this.f37645b;
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
                Path path = (Path) this.f37646c;
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
        switch (this.f37644a) {
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
                    dc1 dc1Var = photoViewer.H0;
                    dc1Var.layout(measuredWidth, dc1Var.getTop(), photoViewer.H0.getMeasuredWidth() + measuredWidth, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    return;
                }
                return;
            case 6:
                ci.c6 c6Var = (ci.c6) this.e;
                qg.y0 y0Var = c6Var.f41665r0;
                int measuredWidth2 = y0Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < y0Var.getChildCount(); i17++) {
                    View childAt = y0Var.getChildAt(i17);
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
                y0Var.layout(-measuredWidth2, 0, y0Var.getMeasuredWidth() - measuredWidth2, y0Var.getMeasuredHeight());
                TextureView textureView = c6Var.f41670w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), y0Var.getMeasuredHeight());
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
                yh.y3 y3Var = (yh.y3) this.e;
                gg.n0 n0Var = y3Var.Q0;
                if (n0Var != null) {
                    int finalHeight = y3Var.f48328e0.getFinalHeight();
                    int z12 = y3Var.z1();
                    if (y3Var.Y0.d(1) && y3Var.m0.getVisibility() == 0) {
                        i15 = y3Var.m0.getMeasuredHeight();
                    } else {
                        i15 = 0;
                    }
                    n0Var.F(finalHeight, z12 + i15);
                }
                y3Var.T1();
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
        int v02;
        int v03;
        int i14;
        int i15;
        switch (this.f37644a) {
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
                ci.c6 c6Var = (ci.c6) this.e;
                qg.y0 y0Var = c6Var.f41665r0;
                y0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = c6Var.f41670w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(y0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(y0Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = y0Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < y0Var.getChildCount(); i17++) {
                    View childAt = y0Var.getChildAt(i17);
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
                setMeasuredDimension(i16 - measuredWidth2, y0Var.getMeasuredHeight());
                return;
            case 7:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f37645b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                TextView textView = limitPreviewView.f22356w;
                org.telegram.ui.Components.vg0 vg0Var = limitPreviewView.f22348g0;
                org.telegram.ui.Components.o6 o6Var = limitPreviewView.N;
                org.telegram.ui.Components.vg0 vg0Var2 = limitPreviewView.f22347f0;
                org.telegram.ui.Components.o6 o6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    vg0Var2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    int measuredWidth3 = vg0Var2.getMeasuredWidth();
                    int measuredWidth4 = o6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    int i18 = 0;
                    if (textView.getVisibility() == 0) {
                        i13 = textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    } else {
                        i13 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i13);
                    vg0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    if (limitPreviewView.P) {
                        float f7 = limitPreviewView.f22338a;
                        float f10 = 0.0f;
                        int i19 = -1;
                        if (f7 == 0.0f) {
                            limitPreviewView.f22353n = 0;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (limitPreviewView.L || limitPreviewView.f22345e0 != null) {
                                    v03 = -1;
                                } else {
                                    v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var);
                                }
                                o6Var2.setTextColor(v03);
                                if (limitPreviewView.f22345e0 == null) {
                                    i19 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var);
                                }
                                o6Var.setTextColor(i19);
                            }
                        } else if (f7 < 1.0f) {
                            if (limitPreviewView.L) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = vg0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            if (!limitPreviewView.L) {
                                f10 = vg0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            limitPreviewView.f22353n = (int) ((((size - measuredWidth) - f10) * limitPreviewView.f22338a) + measuredWidth);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (limitPreviewView.L || limitPreviewView.f22345e0 != null) {
                                    v02 = -1;
                                } else {
                                    v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var);
                                }
                                o6Var2.setTextColor(v02);
                                o6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.f22353n = size;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                o6Var2.setTextColor(-1);
                                o6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int measuredWidth5 = vg0Var.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.O.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        if (o6Var2.getVisibility() == 0) {
                            i18 = o6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        }
                        int clamp = (int) Utilities.clamp(size * limitPreviewView.f22338a, size - Math.max(measuredWidth5, measuredWidth6 + i18), max);
                        limitPreviewView.f22353n = clamp;
                        vg0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        vg0Var.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.f22353n, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    setMeasuredDimension(size, size2);
                    return;
                }
                super.onMeasure(i10, i11);
                return;
            case 9:
                rg.x0 x0Var = (rg.x0) this.e;
                x0Var.L = 0;
                ScrollView scrollView = (ScrollView) this.d;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE));
                int size3 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i14 = ((org.telegram.ui.ActionBar.f3) x0Var).backgroundPaddingTop;
                x0Var.L = i14 + size3;
                super.onMeasure(i10, i11);
                x0Var.y();
                return;
            case 11:
                yh.y3 y3Var = (yh.y3) this.e;
                int bottomInset = y3Var.getBottomInset();
                int i20 = 0;
                setPadding(0, 0, 0, bottomInset);
                y3Var.f48328e0.L.setPadding(0, 0, 0, bottomInset);
                int size4 = View.MeasureSpec.getSize(i11);
                y3Var.h = size4;
                int size5 = View.MeasureSpec.getSize(i10);
                for (int i21 = 0; i21 < getChildCount(); i21++) {
                    View childAt2 = getChildAt(i21);
                    if (childAt2 instanceof ci.f4) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                    } else if (childAt2 == y3Var.d) {
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
                gg.n0 n0Var = y3Var.Q0;
                if (n0Var != null) {
                    int finalHeight = y3Var.f48328e0.getFinalHeight();
                    int z12 = y3Var.z1();
                    if (y3Var.Y0.d(1) && y3Var.m0.getVisibility() == 0) {
                        i20 = y3Var.m0.getMeasuredHeight();
                    }
                    n0Var.F(finalHeight, z12 + i20);
                    return;
                }
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f37644a) {
            case 3:
                super.setAlpha(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f7);
                }
                bt0 bt0Var = photoViewer.U1;
                if (bt0Var != null && bt0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.f31427y7[0] * f7);
                }
                ct0 ct0Var = photoViewer.V1;
                if (ct0Var != null && ct0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(f7 * photoViewer.f31436z7[0]);
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
        switch (this.f37644a) {
            case 2:
                super.setTranslationY(f7);
                org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) this.e;
                FrameLayout frameLayout = l41Var.topBulletinContainer;
                frameLayout.setTranslationY(Math.max(l41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, l41Var.z(true)) + ((-frameLayout.getTop()) - l41Var.topBulletinContainer.getHeight()) + f7);
                return;
            case 3:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout2 = photoViewer.R7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.R7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * org.telegram.messenger.l0.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                j0 j0Var = photoViewer.X1;
                if (j0Var != null) {
                    j0Var.setTranslationY(f7);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f7);
                    return;
                }
                return;
            case 9:
                super.setTranslationY(f7);
                ((rg.x0) this.e).onContainerTranslationYChanged(f7);
                return;
            case 11:
                super.setTranslationY(f7);
                FrameLayout frameLayout3 = ((yh.y3) this.e).topBulletinContainer;
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
        switch (this.f37644a) {
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

    public t5(ci.c6 c6Var, Context context) {
        super(context);
        this.e = c6Var;
        this.f37646c = new Matrix();
        this.d = new float[8];
        this.f37645b = new Path();
    }

    public t5(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = limitPreviewView;
        this.f37645b = f6Var;
        this.f37646c = new Paint();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(-1);
    }

    public t5(Context context, org.telegram.ui.ActionBar.f6 f6Var, th.f fVar) {
        super(context);
        this.e = fVar;
        this.f37645b = f6Var;
        this.f37646c = new yf.y(2);
        this.d = new yf.y(8);
    }

    public t5(rg.x0 x0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = x0Var;
        this.d = scrollView;
        this.f37645b = drawable;
        this.f37646c = new Path();
    }

    public t5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.rk.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19216j5, f6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f37646c = imageView;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f37645b = g2Var;
        imageView.setImageDrawable(g2Var);
        g2Var.a(-1);
        addView(imageView, w7.y5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new k60(this, 29));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    public t5(v5 v5Var, Context context) {
        super(context);
        this.e = v5Var;
        this.f37645b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f37646c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, w7.y5.e(-2, -2, 1));
        addView(textView, w7.y5.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k10 = i0.a.k(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
    }

    public t5(org.telegram.ui.Components.l41 l41Var, Context context) {
        super(context);
        this.e = l41Var;
        this.f37646c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(l41Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19180h5));
        org.telegram.ui.ActionBar.j6.m(paint);
    }

    public t5(xd1 xd1Var, Activity activity) {
        super(activity);
        this.e = xd1Var;
        this.f37646c = new Paint(1);
        this.d = new Paint(1);
        this.f37645b = new Paint(1);
    }

    public t5(yh.y3 y3Var, Context context) {
        super(context);
        this.e = y3Var;
        this.f37645b = new RectF();
        this.f37646c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public t5(rg.f0 f0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = f0Var;
        this.f37645b = f6Var;
        this.f37646c = new rg.z0(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, f6Var);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public t5(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.f37646c = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f37645b = new Matrix();
    }
}
