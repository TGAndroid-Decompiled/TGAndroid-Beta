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
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.messenger.i9;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mp;
import org.telegram.ui.ws0;
public class n1 extends ViewGroup {
    public final Paint E;
    public n1 F;
    public int G;
    public int H;
    public final Matrix I;
    public long J;
    public int K;
    public float L;
    public boolean M;
    public boolean N;
    public final lp f58921a;
    public final TextView f58922b;
    public final TextView f58923c;
    public final TextView d;
    public final TextView f58924e;
    public final int f58925f;
    public final int h;
    public ws0 f58926n;
    public final TextView f58927r;
    public final int f58928s;
    public final int f58929w;
    public int f58930x;
    public LinearGradient f58931y;

    public n1(Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        this.f58925f = 12;
        this.h = 8;
        this.f58928s = n6.f29451d6;
        this.f58929w = n6.f29394a7;
        this.E = new Paint();
        this.I = new Matrix();
        lp lpVar = new lp(24, context, null);
        this.f58921a = lpVar;
        lpVar.setDrawBackgroundAsArc(10);
        int i12 = n6.f29507g7;
        lpVar.b(i12, i12, n6.f29581k7);
        addView(lpVar);
        TextView textView = new TextView(context);
        this.f58922b = textView;
        textView.setTextSize(1, 16.0f);
        u6.U(textView, n6.G6, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(textView, na.d(-2, -2.0f, i7 | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f58927r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), 0);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView2, na.d(-2, -2.0f, i10 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i13 = n6.f29843y6;
        u6.U(textView3, i13, null);
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        if (gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView3, na.d(-2, -2.0f, i11 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.f58924e = textView4;
        textView4.setTextSize(1, 14.0f);
        u6.U(textView4, i13, null);
        textView4.setSingleLine();
        addView(textView4, na.d(-2, -2.0f, (gd.f24314a0 ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.f58923c = textView5;
        textView5.setTextSize(1, 15.0f);
        u6.U(textView5, i13, null);
        textView5.setSingleLine();
        addView(textView5, na.e(-2, -2, 8388613));
        setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void a(org.telegram.ui.ws0 r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: ug.n1.a(org.telegram.ui.ws0, boolean):void");
    }

    public final void b(View view) {
        Rect rect = org.telegram.messenger.g0.Q;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (gd.f24314a0) {
            int i7 = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i7;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z10, boolean z11) {
        this.f58921a.a(z10, z11);
    }

    public final void d() {
        n1 n1Var = this.F;
        if (n1Var != null) {
            n1Var.d();
            return;
        }
        int x02 = n6.x0(null, this.f58928s, false);
        int x03 = n6.x0(null, this.f58929w, false);
        if (this.H == x03 && this.G == x02) {
            return;
        }
        this.G = x02;
        this.H = x03;
        int L = org.telegram.messenger.g0.L(200.0f);
        this.f58930x = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, x02, x02, x03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.f58931y = linearGradient;
        this.E.setShader(linearGradient);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        if (this.M) {
            n1 n1Var = this.F;
            if (n1Var != null) {
                paint = n1Var.E;
            } else {
                paint = this.E;
            }
            drawChild(canvas, this.f58921a, getDrawingTime());
            d();
            e();
            RectF rectF = org.telegram.messenger.g0.P;
            TextView textView = this.f58923c;
            rectF.set(textView.getLeft(), org.telegram.messenger.g0.L(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - org.telegram.messenger.g0.L(4.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
            TextView textView2 = this.d;
            rectF.set(textView2.getLeft(), org.telegram.messenger.g0.L(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - org.telegram.messenger.g0.L(3.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
            TextView textView3 = this.f58922b;
            rectF.set(textView3.getLeft(), org.telegram.messenger.g0.L(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - org.telegram.messenger.g0.L(4.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
            invalidate();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        n1 n1Var = this.F;
        if (n1Var != null) {
            n1Var.e();
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
            this.K = (-this.f58930x) * 2;
        }
        Matrix matrix = this.I;
        matrix.setTranslate(this.K + this.L, 0.0f);
        LinearGradient linearGradient = this.f58931y;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public ws0 getTier() {
        return this.f58926n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.N) {
            boolean z10 = gd.f24314a0;
            TextView textView = this.f58922b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, n6.f29574k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, n6.f29574k0);
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
        lp lpVar = this.f58921a;
        rect.set(paddingLeft, (int) ((measuredHeight - lpVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(lpVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.f58923c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i16 = i15 + this.f58925f;
        int measuredWidth = lpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(i16 + 24);
        TextView textView2 = this.d;
        if (textView2.getVisibility() == 0) {
            i13 = textView2.getMeasuredWidth();
        } else {
            i13 = 0;
        }
        int i17 = measuredWidth + i13;
        TextView textView3 = this.f58924e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + i17;
        int measuredWidth2 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.f58927r;
        if (paddingLeft2 > measuredWidth2 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + org.telegram.messenger.g0.L(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f10 = i16;
        int paddingLeft3 = getPaddingLeft() + lpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.f58922b;
        if (visibility == 8) {
            paddingTop = (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f);
        } else {
            paddingTop = getPaddingTop();
        }
        rect.set(paddingLeft3, paddingTop, 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + lpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(i16 + 6), org.telegram.messenger.g0.L(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + lpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        int measuredWidth3 = lpVar.getMeasuredWidth() + org.telegram.messenger.g0.L(f10);
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
        lp lpVar = this.f58921a;
        lpVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - lpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView = this.f58923c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.f58922b.measure(View.MeasureSpec.makeMeasureSpec((size - lpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        TextView textView2 = this.f58927r;
        int i11 = 0;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - lpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - lpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int measuredWidth = size - lpVar.getMeasuredWidth();
        if (textView3.getVisibility() == 0) {
            i11 = textView3.getMeasuredWidth();
        }
        int c10 = m10.c(6.0f, measuredWidth - i11, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE);
        TextView textView4 = this.f58924e;
        textView4.measure(c10, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            L -= org.telegram.messenger.g0.L(8.0f);
        }
        setMeasuredDimension(size, L);
    }

    public void setCirclePaintProvider(i9 i9Var) {
        this.f58921a.setCirclePaintProvider(i9Var);
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
        this.f58922b.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        this.f58923c.setAlpha(f11);
        if (z10) {
            f12 = 1.0f;
        }
        this.f58921a.setAlpha(f12);
    }

    public void setGlobalGradientView(n1 n1Var) {
        this.F = n1Var;
    }

    public void setParentXOffset(float f10) {
        this.L = f10;
    }

    public void setProgressDelegate(mp mpVar) {
        this.f58921a.setProgressDelegate(mpVar);
    }
}
