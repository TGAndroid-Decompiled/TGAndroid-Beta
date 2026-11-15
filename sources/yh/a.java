package yh;

import ah.i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.u5;
public final class a extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public final RectF H;
    public boolean I;
    public String J;
    public final TextPaint K;
    public final e6 f60718a;
    public final be f60719b;
    public final i f60720c;
    public final Paint d;
    public final Paint f60721e;
    public final Paint f60722f;
    public final TextPaint h;
    public final g6 f60723n;
    public final ke0 f60724r;
    public LinearGradient f60725s;
    public final Matrix f60726w;
    public final u5 f60727x;
    public final u5 f60728y;

    public a(Context context, e6 e6Var, be beVar) {
        super(context);
        this.d = new Paint(1);
        this.f60721e = new Paint(1);
        this.f60722f = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f60726w = new Matrix();
        er erVar = er.h;
        this.f60727x = new u5(this, 0L, 420L, erVar);
        this.f60728y = new u5(this, 0L, 200L, erVar);
        this.F = -1.0f;
        this.G = 1.0f;
        this.H = new RectF();
        this.J = "0:01";
        this.K = new TextPaint(1);
        this.f60718a = e6Var;
        this.f60719b = beVar;
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        g6 g6Var = new g6(false, false, false);
        this.f60723n = g6Var;
        g6Var.n(0.35f, 260L, erVar);
        g6Var.setCallback(this);
        g6Var.w(g0.L(14.0f));
        g6Var.x(g0.o1("fonts/rmedium.ttf"));
        g6Var.N = g0.f23611q.x;
        ke0 ke0Var = new ke0(10);
        this.f60724r = ke0Var;
        ke0Var.f36394f = this;
        ke0Var.setCallback(this);
        ke0Var.h = 260;
        textPaint.setTextSize(g0.L(15.0f));
        i iVar = new i(12, context, this);
        this.f60720c = iVar;
        iVar.setBackground(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setTextSize(1, gz.W0);
        iVar.setMaxLines(6);
        iVar.setGravity(51);
        iVar.setImeOptions(268435456);
        iVar.setInputType(147457);
        iVar.setCursorSize(g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setHint("Nothing recognised — type here");
        iVar.setVisibility(8);
        iVar.setAlpha(0.0f);
        addView(iVar, ja.d(-1, -2.0f, 51, 10.0f, 40.0f, 6.0f, 11.0f));
        int w02 = j6.w0(j6.Uf, e6Var);
        int i7 = j6.Le;
        iVar.setTextColor(j6.w0(i7, e6Var));
        iVar.setHintTextColor(j6.w0(j6.Me, e6Var));
        iVar.setCursorColor(w02);
        iVar.setHandlesColor(w02);
        iVar.setHighlightColor(j6.r1(0.25f, w02));
        textPaint.setColor(j6.r1(0.5f, j6.w0(i7, e6Var)));
        this.f60725s = null;
        invalidate();
        setMinimumHeight(g0.L(44.0f));
    }

    public final float a() {
        be beVar = this.f60719b;
        if (beVar != null) {
            float O0 = beVar.f33267b.O0(this);
            if (!Float.isNaN(O0)) {
                return O0;
            }
        }
        if (this.F <= 0.0f) {
            return 0.0f;
        }
        return getHeight() - this.F;
    }

    public final boolean b(MotionEvent motionEvent) {
        RectF rectF = g0.P;
        rectF.set(this.H);
        rectF.inset(-g0.L(6.0f), -g0.L(8.0f));
        return rectF.contains(motionEvent.getX(), motionEvent.getY());
    }

    public final void c(int i7) {
        this.J = g0.g0(Math.max(1, i7), false, false);
        TextPaint textPaint = this.K;
        textPaint.setTextSize(g0.L(14.0f));
        textPaint.setTypeface(g0.o1("fonts/rmedium.ttf"));
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        float f10;
        float f11;
        float f12;
        boolean z10;
        oi0 oi0Var;
        int i7 = j6.Uf;
        e6 e6Var = this.f60718a;
        int w02 = j6.w0(i7, e6Var);
        u5 u5Var = this.f60727x;
        u5Var.getClass();
        float e10 = u5Var.e(false, 0.0f);
        float a10 = a();
        float d = this.f60728y.d(this.I);
        i iVar = this.f60720c;
        iVar.setTranslationY(a10);
        if (iVar.getVisibility() == 0) {
            L = g0.L(11.0f) + iVar.getBottom();
        } else {
            L = g0.L(44.0f);
        }
        if (L > g0.L(44.0f) + 1) {
            f10 = Math.max(0.0f, Math.min(1.0f, ((getHeight() - a10) - g0.L(44.0f)) / (L - g0.L(44.0f))));
        } else {
            f10 = 1.0f;
        }
        if (this.E) {
            float f13 = this.G;
            f11 = f13 * f13 * f13;
        } else {
            f11 = this.G;
        }
        iVar.setAlpha(Math.min(e10, f10 * f10) * f11);
        String str = this.J;
        Paint paint = this.K;
        float measureText = paint.measureText(str) + g0.L(36.0f);
        float L2 = g0.L(8.0f);
        float L3 = g0.L(26.0f) / 2.0f;
        float T1 = g0.T1(g0.L(22.0f), g0.L(8.0f) + L3, e10) + a10;
        float f14 = measureText + L2;
        RectF rectF = this.H;
        rectF.set(L2, T1 - L3, f14, T1 + L3);
        float T12 = (1.0f - (d * 0.06f)) * g0.T1(0.7f, 1.0f, this.G);
        canvas.save();
        canvas.scale(T12, T12, rectF.left, rectF.centerY());
        if (this.E) {
            float f15 = this.G;
            f12 = f15 * f15;
        } else {
            f12 = this.G;
        }
        int r12 = j6.r1(0.12f * f12, w02);
        Paint paint2 = this.d;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        int L4 = g0.L(10.0f);
        be beVar = this.f60719b;
        if (beVar != null && (oi0Var = beVar.f33267b.f32214i1) != null && oi0Var.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ke0 ke0Var = this.f60724r;
        ke0Var.a(z10, true);
        ke0Var.f36390a.setColor(w02);
        ke0Var.f36395g = (int) (f12 * 255.0f);
        float f16 = L4 / 2.0f;
        ke0Var.setBounds((int) (rectF.left + g0.L(10.0f)), (int) (T1 - f16), ((int) (rectF.left + g0.L(10.0f))) + L4, (int) (f16 + T1));
        ke0Var.draw(canvas);
        paint.setColor(j6.r1(f12, w02));
        canvas.drawText(this.J, rectF.left + g0.L(26.0f), T1 - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        canvas.restore();
        float f17 = (1.0f - e10) * this.G;
        if (f17 > 0.0f) {
            float L5 = f14 + g0.L(12.0f);
            float width = getWidth() - g0.L(12.0f);
            float f18 = (-g0.L(6.0f)) * e10;
            Paint paint3 = this.h;
            paint3.setAlpha((int) (127.5f * f17));
            int i10 = j6.Le;
            paint3.setColor(j6.r1(0.5f * f17, j6.w0(i10, e6Var)));
            canvas.drawText("Transcribing…", L5, g0.L(19.0f) + a10 + f18, paint3);
            float L6 = a10 + g0.L(28.0f) + f18;
            int w03 = j6.w0(i10, e6Var);
            int r13 = j6.r1(0.08f * f17, w03);
            Paint paint4 = this.f60721e;
            paint4.setColor(r13);
            RectF rectF2 = g0.P;
            rectF2.set(L5, L6, width, g0.L(6.0f) + L6);
            canvas.drawRoundRect(rectF2, g0.L(3.0f), g0.L(3.0f), paint4);
            float f19 = width - L5;
            if (f19 > 0.0f) {
                LinearGradient linearGradient = this.f60725s;
                Paint paint5 = this.f60722f;
                if (linearGradient == null) {
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, g0.L(90.0f), 0.0f, new int[]{0, j6.r1(0.14f, w03), 0}, (float[]) null, Shader.TileMode.CLAMP);
                    this.f60725s = linearGradient2;
                    paint5.setShader(linearGradient2);
                }
                float L7 = f19 + g0.L(90.0f);
                er erVar = er.f34422j;
                Matrix matrix = this.f60726w;
                matrix.setTranslate((erVar.getInterpolation(((float) (SystemClock.elapsedRealtime() % 1300)) / 1300.0f) * L7) + (L5 - g0.L(90.0f)), 0.0f);
                this.f60725s.setLocalMatrix(matrix);
                paint5.setAlpha((int) (f17 * 255.0f));
                canvas.drawRoundRect(rectF2, g0.L(3.0f), g0.L(3.0f), paint5);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    public String getText() {
        i iVar = this.f60720c;
        if (iVar.getText() == null) {
            return "";
        }
        return iVar.getText().toString();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && b(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f60720c.setTranslationY(a());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setMeasuredDimension(getMeasuredWidth(), g0.L(44.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        be beVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (!b(motionEvent)) {
                return false;
            }
            this.I = true;
            invalidate();
            return true;
        } else if ((actionMasked == 1 || actionMasked == 3) && this.I) {
            this.I = false;
            if (actionMasked == 1 && (beVar = this.f60719b) != null) {
                ChatActivityEnterView chatActivityEnterView = beVar.f33267b;
                oi0 oi0Var = chatActivityEnterView.f32214i1;
                if (oi0Var != null) {
                    oi0Var.setPlaying(!oi0Var.g());
                }
                a aVar = chatActivityEnterView.L1;
                if (aVar != null) {
                    aVar.invalidate();
                }
            }
            invalidate();
            return true;
        } else {
            return this.I;
        }
    }

    public void setCollapsing(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            requestLayout();
        }
    }

    public void setModeProgress(float f10) {
        this.G = f10;
        invalidate();
    }

    public void setVisibleHeight(float f10) {
        if (this.F != f10) {
            this.F = f10;
            this.f60720c.setTranslationY(a());
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f60723n && drawable != this.f60724r && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
