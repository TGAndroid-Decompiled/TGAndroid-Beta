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
import c8.ma;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.zi0;
public final class a extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public final RectF H;
    public boolean I;
    public String J;
    public final TextPaint K;
    public final h6 f61331a;
    public final ke f61332b;
    public final i f61333c;
    public final Paint d;
    public final Paint f61334e;
    public final Paint f61335f;
    public final TextPaint h;
    public final n6 f61336n;
    public final we0 f61337r;
    public LinearGradient f61338s;
    public final Matrix f61339w;
    public final d6 f61340x;
    public final d6 f61341y;

    public a(Context context, h6 h6Var, ke keVar) {
        super(context);
        this.d = new Paint(1);
        this.f61334e = new Paint(1);
        this.f61335f = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        this.f61339w = new Matrix();
        nr nrVar = nr.h;
        this.f61340x = new d6(this, 0L, 420L, nrVar);
        this.f61341y = new d6(this, 0L, 200L, nrVar);
        this.F = -1.0f;
        this.G = 1.0f;
        this.H = new RectF();
        this.J = "0:01";
        this.K = new TextPaint(1);
        this.f61331a = h6Var;
        this.f61332b = keVar;
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        n6 n6Var = new n6(false, false, false);
        this.f61336n = n6Var;
        n6Var.n(0.35f, 260L, nrVar);
        n6Var.setCallback(this);
        n6Var.w(g0.L(14.0f));
        n6Var.x(g0.o1("fonts/rmedium.ttf"));
        n6Var.N = g0.f24046q.x;
        we0 we0Var = new we0(10);
        this.f61337r = we0Var;
        we0Var.f41789f = this;
        we0Var.setCallback(this);
        we0Var.h = 260;
        textPaint.setTextSize(g0.L(15.0f));
        i iVar = new i(12, context, this);
        this.f61333c = iVar;
        iVar.setBackground(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setTextSize(1, cz.W0);
        iVar.setMaxLines(6);
        iVar.setGravity(51);
        iVar.setImeOptions(268435456);
        iVar.setInputType(147457);
        iVar.setCursorSize(g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setHint("Nothing recognised — type here");
        iVar.setVisibility(8);
        iVar.setAlpha(0.0f);
        addView(iVar, ma.d(-1, -2.0f, 51, 10.0f, 40.0f, 6.0f, 11.0f));
        int w02 = m6.w0(m6.Uf, h6Var);
        int i7 = m6.Le;
        iVar.setTextColor(m6.w0(i7, h6Var));
        iVar.setHintTextColor(m6.w0(m6.Me, h6Var));
        iVar.setCursorColor(w02);
        iVar.setHandlesColor(w02);
        iVar.setHighlightColor(m6.r1(0.25f, w02));
        textPaint.setColor(m6.r1(0.5f, m6.w0(i7, h6Var)));
        this.f61338s = null;
        invalidate();
        setMinimumHeight(g0.L(44.0f));
    }

    public final float a() {
        ke keVar = this.f61332b;
        if (keVar != null) {
            float a12 = keVar.f36896b.a1(this);
            if (!Float.isNaN(a12)) {
                return a12;
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
        zi0 zi0Var;
        int i7 = m6.Uf;
        h6 h6Var = this.f61331a;
        int w02 = m6.w0(i7, h6Var);
        d6 d6Var = this.f61340x;
        d6Var.getClass();
        float e10 = d6Var.e(false, 0.0f);
        float a10 = a();
        float d = this.f61341y.d(this.I);
        i iVar = this.f61333c;
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
        int r12 = m6.r1(0.12f * f12, w02);
        Paint paint2 = this.d;
        paint2.setColor(r12);
        canvas.drawRoundRect(rectF, L3, L3, paint2);
        int L4 = g0.L(10.0f);
        ke keVar = this.f61332b;
        if (keVar != null && (zi0Var = keVar.f36896b.f32638i1) != null && zi0Var.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        we0 we0Var = this.f61337r;
        we0Var.a(z10, true);
        we0Var.f41785a.setColor(w02);
        we0Var.f41790g = (int) (f12 * 255.0f);
        float f16 = L4 / 2.0f;
        we0Var.setBounds((int) (rectF.left + g0.L(10.0f)), (int) (T1 - f16), ((int) (rectF.left + g0.L(10.0f))) + L4, (int) (f16 + T1));
        we0Var.draw(canvas);
        paint.setColor(m6.r1(f12, w02));
        canvas.drawText(this.J, rectF.left + g0.L(26.0f), T1 - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        canvas.restore();
        float f17 = (1.0f - e10) * this.G;
        if (f17 > 0.0f) {
            float L5 = f14 + g0.L(12.0f);
            float width = getWidth() - g0.L(12.0f);
            float f18 = (-g0.L(6.0f)) * e10;
            Paint paint3 = this.h;
            paint3.setAlpha((int) (127.5f * f17));
            int i10 = m6.Le;
            paint3.setColor(m6.r1(0.5f * f17, m6.w0(i10, h6Var)));
            canvas.drawText("Transcribing…", L5, g0.L(19.0f) + a10 + f18, paint3);
            float L6 = a10 + g0.L(28.0f) + f18;
            int w03 = m6.w0(i10, h6Var);
            int r13 = m6.r1(0.08f * f17, w03);
            Paint paint4 = this.f61334e;
            paint4.setColor(r13);
            RectF rectF2 = g0.P;
            rectF2.set(L5, L6, width, g0.L(6.0f) + L6);
            canvas.drawRoundRect(rectF2, g0.L(3.0f), g0.L(3.0f), paint4);
            float f19 = width - L5;
            if (f19 > 0.0f) {
                LinearGradient linearGradient = this.f61338s;
                Paint paint5 = this.f61335f;
                if (linearGradient == null) {
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, g0.L(90.0f), 0.0f, new int[]{0, m6.r1(0.14f, w03), 0}, (float[]) null, Shader.TileMode.CLAMP);
                    this.f61338s = linearGradient2;
                    paint5.setShader(linearGradient2);
                }
                float L7 = f19 + g0.L(90.0f);
                nr nrVar = nr.f37964j;
                Matrix matrix = this.f61339w;
                matrix.setTranslate((nrVar.getInterpolation(((float) (SystemClock.elapsedRealtime() % 1300)) / 1300.0f) * L7) + (L5 - g0.L(90.0f)), 0.0f);
                this.f61338s.setLocalMatrix(matrix);
                paint5.setAlpha((int) (f17 * 255.0f));
                canvas.drawRoundRect(rectF2, g0.L(3.0f), g0.L(3.0f), paint5);
                invalidate();
            }
        }
        super.dispatchDraw(canvas);
    }

    public String getText() {
        i iVar = this.f61333c;
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
        this.f61333c.setTranslationY(a());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setMeasuredDimension(getMeasuredWidth(), g0.L(44.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ke keVar;
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
            if (actionMasked == 1 && (keVar = this.f61332b) != null) {
                ChatActivityEnterView chatActivityEnterView = keVar.f36896b;
                zi0 zi0Var = chatActivityEnterView.f32638i1;
                if (zi0Var != null) {
                    zi0Var.setPlaying(!zi0Var.g());
                }
                a aVar = chatActivityEnterView.T1;
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
            this.f61333c.setTranslationY(a());
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f61336n && drawable != this.f61337r && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
