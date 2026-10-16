package sg;

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
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bq;
import org.telegram.ui.rx0;
import w7.z5;
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
    public final aq f45337a;
    public final TextView f45338b;
    public final TextView f45339c;
    public final TextView d;
    public final TextView e;
    public final int f45340f;
    public final int h;
    public rx0 f45341n;
    public final TextView f45342r;
    public final int f45343s;
    public final int v;
    public int f45344w;
    public LinearGradient f45345x;
    public final Paint f45346y;

    public r1(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f45340f = 12;
        this.h = 8;
        this.f45343s = g6.f19601d6;
        this.v = g6.f19543a7;
        this.f45346y = new Paint();
        this.H = new Matrix();
        aq aqVar = new aq(context, 24, null);
        this.f45337a = aqVar;
        aqVar.setDrawBackgroundAsArc(10);
        int i13 = g6.f19655g7;
        aqVar.b(i13, i13, g6.f19729k7);
        addView(aqVar);
        TextView textView = new TextView(context);
        this.f45338b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.x0(null, g6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, z5.a(-2.0f, 0.0f, 8.0f, 0.0f, 0.0f, -2, i10 | 48));
        TextView textView2 = new TextView(context);
        this.f45342r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        textView2.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView2, z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 8.0f, -2, i11 | 80));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i14 = g6.f19988y6;
        textView3.setTextColor(g6.x0(null, i14, false));
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(textView3, z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 8.0f, -2, i12 | 80));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(g6.x0(null, i14, false));
        textView4.setSingleLine();
        addView(textView4, z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 8.0f, -2, (LocaleController.isRTL ? 5 : 3) | 80));
        TextView textView5 = new TextView(context);
        this.f45339c = textView5;
        textView5.setTextSize(1, 15.0f);
        textView5.setTextColor(g6.x0(null, i14, false));
        textView5.setSingleLine();
        addView(textView5, z5.e(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void a(org.telegram.ui.rx0 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: sg.r1.a(org.telegram.ui.rx0, boolean):void");
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
        this.f45337a.a(z10, z11);
    }

    public final void d() {
        r1 r1Var = this.E;
        if (r1Var != null) {
            r1Var.d();
            return;
        }
        int x02 = g6.x0(null, this.f45343s, false);
        int x03 = g6.x0(null, this.v, false);
        if (this.G == x03 && this.F == x02) {
            return;
        }
        this.F = x02;
        this.G = x03;
        int dp = AndroidUtilities.dp(200.0f);
        this.f45344w = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{x03, x02, x02, x03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.f45345x = linearGradient;
        this.f45346y.setShader(linearGradient);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        if (this.L) {
            r1 r1Var = this.E;
            if (r1Var != null) {
                paint = r1Var.f45346y;
            } else {
                paint = this.f45346y;
            }
            drawChild(canvas, this.f45337a, getDrawingTime());
            d();
            e();
            RectF rectF = AndroidUtilities.rectTmp;
            TextView textView = this.f45339c;
            rectF.set(textView.getLeft(), AndroidUtilities.dp(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView2 = this.d;
            rectF.set(textView2.getLeft(), AndroidUtilities.dp(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - AndroidUtilities.dp(3.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView3 = this.f45338b;
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
            this.J = (-this.f45344w) * 2;
        }
        Matrix matrix = this.H;
        matrix.setTranslate(this.J + this.K, 0.0f);
        LinearGradient linearGradient = this.f45345x;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public rx0 getTier() {
        return this.f45341n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.M) {
            boolean z10 = LocaleController.isRTL;
            TextView textView = this.f45338b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, g6.f19722k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, g6.f19722k0);
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
        aq aqVar = this.f45337a;
        rect.set(paddingLeft, (int) ((measuredHeight - aqVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(aqVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.f45339c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i17 = i16 + this.f45340f;
        int measuredWidth = aqVar.getMeasuredWidth() + AndroidUtilities.dp(i17 + 24);
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
        TextView textView4 = this.f45342r;
        if (paddingLeft2 > measuredWidth2 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + AndroidUtilities.dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f7 = i17;
        int paddingLeft3 = getPaddingLeft() + aqVar.getMeasuredWidth() + AndroidUtilities.dp(f7);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.f45338b;
        if (visibility == 8) {
            paddingTop = (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f);
        } else {
            paddingTop = getPaddingTop();
        }
        rect.set(paddingLeft3, paddingTop, 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + aqVar.getMeasuredWidth() + AndroidUtilities.dp(i17 + 6), AndroidUtilities.dp(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + aqVar.getMeasuredWidth() + AndroidUtilities.dp(f7), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        int measuredWidth3 = aqVar.getMeasuredWidth() + AndroidUtilities.dp(f7);
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
        aq aqVar = this.f45337a;
        aqVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - aqVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView = this.f45339c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.f45338b.measure(View.MeasureSpec.makeMeasureSpec((size - aqVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        TextView textView2 = this.f45342r;
        int i12 = 0;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - aqVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - aqVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int measuredWidth = size - aqVar.getMeasuredWidth();
        if (textView3.getVisibility() == 0) {
            i12 = textView3.getMeasuredWidth();
        }
        int c10 = sk.c(6.0f, measuredWidth - i12, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView4 = this.e;
        textView4.measure(c10, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            dp -= AndroidUtilities.dp(8.0f);
        }
        setMeasuredDimension(size, dp);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.f45337a.setCirclePaintProvider(genericProvider);
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
        this.f45338b.setAlpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        this.f45339c.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        }
        this.f45337a.setAlpha(f11);
    }

    public void setGlobalGradientView(r1 r1Var) {
        this.E = r1Var;
    }

    public void setParentXOffset(float f7) {
        this.K = f7;
    }

    public void setProgressDelegate(bq bqVar) {
        this.f45337a.setProgressDelegate(bqVar);
    }
}
