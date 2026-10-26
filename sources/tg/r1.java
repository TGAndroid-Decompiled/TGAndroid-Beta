package tg;

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
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.zp;
import org.telegram.ui.xw0;
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
    public final zp f49023a;
    public final TextView f49024b;
    public final TextView f49025c;
    public final TextView d;
    public final TextView e;
    public final int f49026f;
    public final int h;
    public xw0 f49027n;
    public final TextView f49028r;
    public final int f49029s;
    public final int v;
    public int f49030w;
    public LinearGradient f49031x;
    public final Paint f49032y;

    public r1(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f49026f = 12;
        this.h = 8;
        this.f49029s = y6.f23356d6;
        this.v = y6.f23299a7;
        this.f49032y = new Paint();
        this.H = new Matrix();
        zp zpVar = new zp(context, 24, null);
        this.f49023a = zpVar;
        zpVar.setDrawBackgroundAsArc(10);
        int i13 = y6.g7;
        zpVar.b(i13, i13, y6.f23485k7);
        addView(zpVar);
        TextView textView = new TextView(context);
        this.f49024b = textView;
        textView.setTextSize(1, 16.0f);
        f7.V(textView, y6.G6, null);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, gb1.h(-2, -2.0f, i10 | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f49028r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        textView2.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView2, gb1.h(-2, -2.0f, i11 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i14 = y6.f23748y6;
        f7.V(textView3, i14, null);
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(textView3, gb1.h(-2, -2.0f, i12 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setTextSize(1, 14.0f);
        f7.V(textView4, i14, null);
        textView4.setSingleLine();
        addView(textView4, gb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.f49025c = textView5;
        textView5.setTextSize(1, 15.0f);
        f7.V(textView5, i14, null);
        textView5.setSingleLine();
        addView(textView5, gb1.i(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void a(org.telegram.ui.xw0 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: tg.r1.a(org.telegram.ui.xw0, boolean):void");
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
        this.f49023a.a(z10, z11);
    }

    public final void d() {
        r1 r1Var = this.E;
        if (r1Var != null) {
            r1Var.d();
            return;
        }
        int x02 = y6.x0(null, this.f49029s, false);
        int x03 = y6.x0(null, this.v, false);
        if (this.G == x03 && this.F == x02) {
            return;
        }
        this.F = x02;
        this.G = x03;
        int dp = AndroidUtilities.dp(200.0f);
        this.f49030w = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{x03, x02, x02, x03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.f49031x = linearGradient;
        this.f49032y.setShader(linearGradient);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        if (this.L) {
            r1 r1Var = this.E;
            if (r1Var != null) {
                paint = r1Var.f49032y;
            } else {
                paint = this.f49032y;
            }
            drawChild(canvas, this.f49023a, getDrawingTime());
            d();
            e();
            RectF rectF = AndroidUtilities.rectTmp;
            TextView textView = this.f49025c;
            rectF.set(textView.getLeft(), AndroidUtilities.dp(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView2 = this.d;
            rectF.set(textView2.getLeft(), AndroidUtilities.dp(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - AndroidUtilities.dp(3.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView3 = this.f49024b;
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
            this.J = (-this.f49030w) * 2;
        }
        Matrix matrix = this.H;
        matrix.setTranslate(this.J + this.K, 0.0f);
        LinearGradient linearGradient = this.f49031x;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public xw0 getTier() {
        return this.f49027n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.M) {
            boolean z10 = LocaleController.isRTL;
            TextView textView = this.f49024b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, y6.f23478k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, y6.f23478k0);
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
        zp zpVar = this.f49023a;
        rect.set(paddingLeft, (int) ((measuredHeight - zpVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(zpVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.f49025c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i17 = i16 + this.f49026f;
        int measuredWidth = zpVar.getMeasuredWidth() + AndroidUtilities.dp(i17 + 24);
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
        TextView textView4 = this.f49028r;
        if (paddingLeft2 > measuredWidth2 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + AndroidUtilities.dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f7 = i17;
        int paddingLeft3 = getPaddingLeft() + zpVar.getMeasuredWidth() + AndroidUtilities.dp(f7);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.f49024b;
        if (visibility == 8) {
            paddingTop = (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f);
        } else {
            paddingTop = getPaddingTop();
        }
        rect.set(paddingLeft3, paddingTop, 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + zpVar.getMeasuredWidth() + AndroidUtilities.dp(i17 + 6), AndroidUtilities.dp(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + zpVar.getMeasuredWidth() + AndroidUtilities.dp(f7), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        int measuredWidth3 = zpVar.getMeasuredWidth() + AndroidUtilities.dp(f7);
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
        zp zpVar = this.f49023a;
        zpVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - zpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView = this.f49025c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.f49024b.measure(View.MeasureSpec.makeMeasureSpec((size - zpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        TextView textView2 = this.f49028r;
        int i12 = 0;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - zpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - zpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int measuredWidth = size - zpVar.getMeasuredWidth();
        if (textView3.getVisibility() == 0) {
            i12 = textView3.getMeasuredWidth();
        }
        int x9 = vh.x(6.0f, measuredWidth - i12, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView4 = this.e;
        textView4.measure(x9, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            dp -= AndroidUtilities.dp(8.0f);
        }
        setMeasuredDimension(size, dp);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.f49023a.setCirclePaintProvider(genericProvider);
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
        this.f49024b.setAlpha(f7);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        this.f49025c.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        }
        this.f49023a.setAlpha(f11);
    }

    public void setGlobalGradientView(r1 r1Var) {
        this.E = r1Var;
    }

    public void setParentXOffset(float f7) {
        this.K = f7;
    }

    public void setProgressDelegate(aq aqVar) {
        this.f49023a.setProgressDelegate(aqVar);
    }
}
