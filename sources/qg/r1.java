package qg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.up;
import org.telegram.ui.nx0;
import w7.a6;
public class r1 extends ViewGroup {
    public r1 E;
    public int F;
    public int G;
    public final Matrix H;
    public long I;
    public int J;
    public float K;
    public boolean L;
    public boolean M;
    public final tp f40885a;
    public final TextView f40886b;
    public final TextView f40887c;
    public final TextView d;
    public final TextView e;
    public final int f40888f;
    public final int h;
    public nx0 f40889n;
    public final TextView f40890r;
    public final int f40891s;
    public final int v;
    public int f40892w;
    public LinearGradient f40893x;
    public final Paint f40894y;

    public r1(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f40888f = 12;
        this.h = 8;
        this.f40891s = j6.f17928d6;
        this.v = j6.f17872a7;
        this.f40894y = new Paint();
        this.H = new Matrix();
        tp tpVar = new tp(context, 24, null);
        this.f40885a = tpVar;
        tpVar.setDrawBackgroundAsArc(10);
        int i13 = j6.f17983g7;
        tpVar.b(i13, i13, j6.f18056k7);
        addView(tpVar);
        TextView textView = new TextView(context);
        this.f40886b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.w0(null, j6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, a6.d(-2, -2.0f, i10 | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f40890r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        textView2.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView2, a6.d(-2, -2.0f, i11 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i14 = j6.f18306y6;
        textView3.setTextColor(j6.w0(null, i14, false));
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(textView3, a6.d(-2, -2.0f, i12 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(j6.w0(null, i14, false));
        textView4.setSingleLine();
        addView(textView4, a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.f40887c = textView5;
        textView5.setTextSize(1, 15.0f);
        textView5.setTextColor(j6.w0(null, i14, false));
        textView5.setSingleLine();
        addView(textView5, a6.e(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void a(org.telegram.ui.nx0 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: qg.r1.a(org.telegram.ui.nx0, boolean):void");
    }

    public final void b(View view) {
        Rect rect = AndroidUtilities.rectTmp2;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (LocaleController.isRTL) {
            int i10 = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i10;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z10, boolean z11) {
        this.f40885a.a(z10, z11);
    }

    public final void d() {
        r1 r1Var = this.E;
        if (r1Var != null) {
            r1Var.d();
            return;
        }
        int w02 = j6.w0(null, this.f40891s, false);
        int w03 = j6.w0(null, this.v, false);
        if (this.G == w03 && this.F == w02) {
            return;
        }
        this.F = w02;
        this.G = w03;
        int dp = AndroidUtilities.dp(200.0f);
        this.f40892w = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.f40893x = linearGradient;
        this.f40894y.setShader(linearGradient);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        if (this.L) {
            r1 r1Var = this.E;
            if (r1Var != null) {
                paint = r1Var.f40894y;
            } else {
                paint = this.f40894y;
            }
            drawChild(canvas, this.f40885a, getDrawingTime());
            d();
            e();
            RectF rectF = AndroidUtilities.rectTmp;
            TextView textView = this.f40887c;
            rectF.set(textView.getLeft(), AndroidUtilities.dp(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView2 = this.d;
            rectF.set(textView2.getLeft(), AndroidUtilities.dp(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - AndroidUtilities.dp(3.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView3 = this.f40886b;
            rectF.set(textView3.getLeft(), AndroidUtilities.dp(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            invalidate();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        r1 r1Var = this.E;
        if (r1Var != null) {
            r1Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.I - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.I = elapsedRealtime;
        int i10 = (int) ((((float) (abs * measuredWidth)) / 400.0f) + this.J);
        this.J = i10;
        if (i10 >= measuredWidth * 4) {
            this.J = (-this.f40892w) * 2;
        }
        Matrix matrix = this.H;
        matrix.setTranslate(this.J + this.K, 0.0f);
        LinearGradient linearGradient = this.f40893x;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public nx0 getTier() {
        return this.f40889n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.M) {
            boolean z10 = LocaleController.isRTL;
            TextView textView = this.f40886b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, j6.f18049k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, j6.f18049k0);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int paddingTop;
        int i15;
        Rect rect = AndroidUtilities.rectTmp2;
        int i16 = this.h;
        int paddingLeft = getPaddingLeft() + AndroidUtilities.dp(i16);
        int measuredHeight = getMeasuredHeight();
        tp tpVar = this.f40885a;
        rect.set(paddingLeft, (int) ((measuredHeight - tpVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(tpVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.f40887c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i17 = i16 + this.f40888f;
        int measuredWidth = tpVar.getMeasuredWidth() + AndroidUtilities.dp(i17 + 24);
        TextView textView2 = this.d;
        if (textView2.getVisibility() == 0) {
            i14 = textView2.getMeasuredWidth();
        } else {
            i14 = 0;
        }
        int i18 = measuredWidth + i14;
        TextView textView3 = this.e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + i18;
        int measuredWidth2 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.f40890r;
        if (paddingLeft2 > measuredWidth2 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + AndroidUtilities.dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f7 = i17;
        int paddingLeft3 = getPaddingLeft() + tpVar.getMeasuredWidth() + AndroidUtilities.dp(f7);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.f40886b;
        if (visibility == 8) {
            paddingTop = (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f);
        } else {
            paddingTop = getPaddingTop();
        }
        rect.set(paddingLeft3, paddingTop, 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + tpVar.getMeasuredWidth() + AndroidUtilities.dp(i17 + 6), AndroidUtilities.dp(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + tpVar.getMeasuredWidth() + AndroidUtilities.dp(f7), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        int measuredWidth3 = tpVar.getMeasuredWidth() + AndroidUtilities.dp(f7);
        if (textView2.getVisibility() == 0) {
            i15 = AndroidUtilities.dp(6.0f) + textView2.getMeasuredWidth();
        } else {
            i15 = 0;
        }
        rect.set(getPaddingLeft() + measuredWidth3 + i15, (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824);
        tp tpVar = this.f40885a;
        tpVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - tpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView = this.f40887c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.f40886b.measure(View.MeasureSpec.makeMeasureSpec((size - tpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        TextView textView2 = this.f40890r;
        int i12 = 0;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - tpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - tpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int measuredWidth = size - tpVar.getMeasuredWidth();
        if (textView3.getVisibility() == 0) {
            i12 = textView3.getMeasuredWidth();
        }
        int d = em.d(6.0f, measuredWidth - i12, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView4 = this.e;
        textView4.measure(d, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            dp -= AndroidUtilities.dp(8.0f);
        }
        setMeasuredDimension(size, dp);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.f40885a.setCirclePaintProvider(genericProvider);
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        float f10;
        super.setEnabled(z10);
        float f11 = 0.6f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        this.f40886b.setAlpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        this.f40887c.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        }
        this.f40885a.setAlpha(f11);
    }

    public void setGlobalGradientView(r1 r1Var) {
        this.E = r1Var;
    }

    public void setParentXOffset(float f7) {
        this.K = f7;
    }

    public void setProgressDelegate(up upVar) {
        this.f40885a.setProgressDelegate(upVar);
    }
}
