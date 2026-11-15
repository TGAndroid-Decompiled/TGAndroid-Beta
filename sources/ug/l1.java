package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.j9;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.gp;
import org.telegram.ui.ts0;
public class l1 extends ViewGroup {
    public final Paint E;
    public l1 F;
    public int G;
    public int H;
    public final Matrix I;
    public long J;
    public int K;
    public float L;
    public boolean M;
    public boolean N;
    public final fp f58202a;
    public final TextView f58203b;
    public final TextView f58204c;
    public final TextView d;
    public final TextView f58205e;
    public final int f58206f;
    public final int h;
    public ts0 f58207n;
    public final TextView f58208r;
    public final int f58209s;
    public final int f58210w;
    public int f58211x;
    public LinearGradient f58212y;

    public l1(Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        this.f58206f = 12;
        this.h = 8;
        this.f58209s = j6.f28849d6;
        this.f58210w = j6.f28792a7;
        this.E = new Paint();
        this.I = new Matrix();
        fp fpVar = new fp(24, context, null);
        this.f58202a = fpVar;
        fpVar.setDrawBackgroundAsArc(10);
        int i12 = j6.f28905g7;
        fpVar.b(i12, i12, j6.f28979k7);
        addView(fpVar);
        TextView textView = new TextView(context);
        this.f58203b = textView;
        textView.setTextSize(1, 16.0f);
        q6.U(textView, j6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(textView, ja.d(-2, -2.0f, i7 | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f58208r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (hd.f24104a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView2, ja.d(-2, -2.0f, i10 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i13 = j6.f29241y6;
        q6.U(textView3, i13, null);
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        if (hd.f24104a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView3, ja.d(-2, -2.0f, i11 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.f58205e = textView4;
        textView4.setTextSize(1, 14.0f);
        q6.U(textView4, i13, null);
        textView4.setSingleLine();
        addView(textView4, ja.d(-2, -2.0f, (hd.f24104a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.f58204c = textView5;
        textView5.setTextSize(1, 15.0f);
        q6.U(textView5, i13, null);
        textView5.setSingleLine();
        addView(textView5, ja.e(-2, -2, 8388613));
        setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void a(org.telegram.ui.ts0 r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: ug.l1.a(org.telegram.ui.ts0, boolean):void");
    }

    public final void b(View view) {
        Rect rect = org.telegram.messenger.g0.Q;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (hd.f24104a0) {
            int i7 = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i7;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z10, boolean z11) {
        this.f58202a.a(z10, z11);
    }

    public final void d() {
        l1 l1Var = this.F;
        if (l1Var != null) {
            l1Var.d();
            return;
        }
        int x02 = j6.x0(null, this.f58209s, false);
        int x03 = j6.x0(null, this.f58210w, false);
        if (this.H == x03 && this.G == x02) {
            return;
        }
        this.G = x02;
        this.H = x03;
        int L = org.telegram.messenger.g0.L(200.0f);
        this.f58211x = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, x02, x02, x03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.f58212y = linearGradient;
        this.E.setShader(linearGradient);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        if (this.M) {
            l1 l1Var = this.F;
            if (l1Var != null) {
                paint = l1Var.E;
            } else {
                paint = this.E;
            }
            drawChild(canvas, this.f58202a, getDrawingTime());
            d();
            e();
            RectF rectF = org.telegram.messenger.g0.P;
            TextView textView = this.f58204c;
            rectF.set(textView.getLeft(), org.telegram.messenger.g0.L(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - org.telegram.messenger.g0.L(4.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
            TextView textView2 = this.d;
            rectF.set(textView2.getLeft(), org.telegram.messenger.g0.L(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - org.telegram.messenger.g0.L(3.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
            TextView textView3 = this.f58203b;
            rectF.set(textView3.getLeft(), org.telegram.messenger.g0.L(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - org.telegram.messenger.g0.L(4.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
            invalidate();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        l1 l1Var = this.F;
        if (l1Var != null) {
            l1Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.J - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.J = elapsedRealtime;
        int i7 = (int) ((((float) (abs * measuredWidth)) / 400.0f) + this.K);
        this.K = i7;
        if (i7 >= measuredWidth * 4) {
            this.K = (-this.f58211x) * 2;
        }
        Matrix matrix = this.I;
        matrix.setTranslate(this.K + this.L, 0.0f);
        LinearGradient linearGradient = this.f58212y;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public ts0 getTier() {
        return this.f58207n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.N) {
            boolean z10 = hd.f24104a0;
            TextView textView = this.f58203b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, j6.f28972k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, j6.f28972k0);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        int paddingTop;
        int i14;
        Rect rect = org.telegram.messenger.g0.Q;
        int i15 = this.h;
        int paddingLeft = getPaddingLeft() + org.telegram.messenger.g0.L(i15);
        int measuredHeight = getMeasuredHeight();
        fp fpVar = this.f58202a;
        rect.set(paddingLeft, (int) ((measuredHeight - fpVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(fpVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.f58204c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i16 = i15 + this.f58206f;
        int measuredWidth = fpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(i16 + 24);
        TextView textView2 = this.d;
        if (textView2.getVisibility() == 0) {
            i13 = textView2.getMeasuredWidth();
        } else {
            i13 = 0;
        }
        int i17 = measuredWidth + i13;
        TextView textView3 = this.f58205e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + i17;
        int measuredWidth2 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.f58208r;
        if (paddingLeft2 > measuredWidth2 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + org.telegram.messenger.g0.L(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f10 = i16;
        int paddingLeft3 = getPaddingLeft() + fpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.f58203b;
        if (visibility == 8) {
            paddingTop = (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f);
        } else {
            paddingTop = getPaddingTop();
        }
        rect.set(paddingLeft3, paddingTop, 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + fpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(i16 + 6), org.telegram.messenger.g0.L(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + fpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        int measuredWidth3 = fpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10);
        if (textView2.getVisibility() == 0) {
            i14 = org.telegram.messenger.g0.L(6.0f) + textView2.getMeasuredWidth();
        } else {
            i14 = 0;
        }
        rect.set(getPaddingLeft() + measuredWidth3 + i14, (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824);
        fp fpVar = this.f58202a;
        fpVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - fpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView = this.f58204c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.f58203b.measure(View.MeasureSpec.makeMeasureSpec((size - fpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        TextView textView2 = this.f58208r;
        int i11 = 0;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - fpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - fpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int measuredWidth = size - fpVar.getMeasuredWidth();
        if (textView3.getVisibility() == 0) {
            i11 = textView3.getMeasuredWidth();
        }
        int c10 = i20.c(6.0f, measuredWidth - i11, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView4 = this.f58205e;
        textView4.measure(c10, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            L -= org.telegram.messenger.g0.L(8.0f);
        }
        setMeasuredDimension(size, L);
    }

    public void setCirclePaintProvider(j9 j9Var) {
        this.f58202a.setCirclePaintProvider(j9Var);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z10);
        float f12 = 0.6f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        this.f58203b.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        this.f58204c.setAlpha(f11);
        if (z10) {
            f12 = 1.0f;
        }
        this.f58202a.setAlpha(f12);
    }

    public void setGlobalGradientView(l1 l1Var) {
        this.F = l1Var;
    }

    public void setParentXOffset(float f10) {
        this.L = f10;
    }

    public void setProgressDelegate(gp gpVar) {
        this.f58202a.setProgressDelegate(gpVar);
    }
}
