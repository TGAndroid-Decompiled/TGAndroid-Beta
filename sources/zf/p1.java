package zf;

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
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.ep;
import org.telegram.ui.hw0;
public class p1 extends ViewGroup {
    public p1 A;
    public int B;
    public int C;
    public final Matrix D;
    public long E;
    public int F;
    public float G;
    public boolean H;
    public boolean I;
    public final dp f50656a;
    public final TextView f50657b;
    public final TextView f50658c;
    public final TextView d;
    public final TextView f50659e;
    public final int f50660f;
    public final int h;
    public hw0 f50661n;
    public final TextView f50662r;
    public final int f50663s;
    public final int v;
    public int f50664w;
    public LinearGradient f50665x;
    public final Paint f50666y;

    public p1(Context context) {
        super(context);
        int i9;
        int i10;
        int i11;
        this.f50660f = 12;
        this.h = 8;
        this.f50663s = f6.f23001d6;
        this.v = f6.f22947a7;
        this.f50666y = new Paint();
        this.D = new Matrix();
        dp dpVar = new dp(context, 24, null);
        this.f50656a = dpVar;
        dpVar.setDrawBackgroundAsArc(10);
        int i12 = f6.f23056g7;
        dpVar.b(i12, i12, f6.f23128k7);
        addView(dpVar);
        TextView textView = new TextView(context);
        this.f50657b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(f6.w0(null, f6.G6, false));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine();
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        addView(textView, e6.d(-2, -2.0f, i9 | 48, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f50662r = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        textView2.setTypeface(AndroidUtilities.bold());
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView2, e6.d(-2, -2.0f, i10 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 14.0f);
        int i13 = f6.f23369y6;
        textView3.setTextColor(f6.w0(null, i13, false));
        textView3.getPaint().setStrikeThruText(true);
        textView3.setSingleLine();
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView3, e6.d(-2, -2.0f, i11 | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView4 = new TextView(context);
        this.f50659e = textView4;
        textView4.setTextSize(1, 14.0f);
        textView4.setTextColor(f6.w0(null, i13, false));
        textView4.setSingleLine();
        addView(textView4, e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, 0.0f, 0.0f, 0.0f, 8.0f));
        TextView textView5 = new TextView(context);
        this.f50658c = textView5;
        textView5.setTextSize(1, 15.0f);
        textView5.setTextColor(f6.w0(null, i13, false));
        textView5.setSingleLine();
        addView(textView5, e6.e(-2, -2, 8388613));
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
        setWillNotDraw(false);
    }

    public final void a(org.telegram.ui.hw0 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: zf.p1.a(org.telegram.ui.hw0, boolean):void");
    }

    public final void b(View view) {
        Rect rect = AndroidUtilities.rectTmp2;
        rect.right = view.getMeasuredWidth() + rect.left;
        rect.bottom = view.getMeasuredHeight() + rect.top;
        if (LocaleController.isRTL) {
            int i9 = rect.right;
            rect.right = getWidth() - rect.left;
            rect.left = getWidth() - i9;
        }
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void c(boolean z10, boolean z11) {
        this.f50656a.a(z10, z11);
    }

    public final void d() {
        p1 p1Var = this.A;
        if (p1Var != null) {
            p1Var.d();
            return;
        }
        int w02 = f6.w0(null, this.f50663s, false);
        int w03 = f6.w0(null, this.v, false);
        if (this.C == w03 && this.B == w02) {
            return;
        }
        this.B = w02;
        this.C = w03;
        int dp = AndroidUtilities.dp(200.0f);
        this.f50664w = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, w02, w02, w03}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
        this.f50665x = linearGradient;
        this.f50666y.setShader(linearGradient);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint paint;
        if (this.H) {
            p1 p1Var = this.A;
            if (p1Var != null) {
                paint = p1Var.f50666y;
            } else {
                paint = this.f50666y;
            }
            drawChild(canvas, this.f50656a, getDrawingTime());
            d();
            e();
            RectF rectF = AndroidUtilities.rectTmp;
            TextView textView = this.f50658c;
            rectF.set(textView.getLeft(), AndroidUtilities.dp(4.0f) + textView.getTop(), textView.getRight(), textView.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView2 = this.d;
            rectF.set(textView2.getLeft(), AndroidUtilities.dp(3.0f) + textView2.getTop(), textView2.getRight(), textView2.getBottom() - AndroidUtilities.dp(3.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            TextView textView3 = this.f50657b;
            rectF.set(textView3.getLeft(), AndroidUtilities.dp(4.0f) + textView3.getTop(), textView3.getRight(), textView3.getBottom() - AndroidUtilities.dp(4.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), paint);
            invalidate();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        p1 p1Var = this.A;
        if (p1Var != null) {
            p1Var.e();
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.E - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        if (abs < 4) {
            abs = 0;
        }
        int measuredWidth = getMeasuredWidth();
        this.E = elapsedRealtime;
        int i9 = (int) ((((float) (abs * measuredWidth)) / 400.0f) + this.F);
        this.F = i9;
        if (i9 >= measuredWidth * 4) {
            this.F = (-this.f50664w) * 2;
        }
        Matrix matrix = this.D;
        matrix.setTranslate(this.F + this.G, 0.0f);
        LinearGradient linearGradient = this.f50665x;
        if (linearGradient != null) {
            linearGradient.setLocalMatrix(matrix);
        }
    }

    public hw0 getTier() {
        return this.f50661n;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.I) {
            boolean z10 = LocaleController.isRTL;
            TextView textView = this.f50657b;
            if (z10) {
                canvas.drawLine(0.0f, getHeight() - 1, textView.getRight(), getHeight() - 1, f6.f23121k0);
            } else {
                canvas.drawLine(textView.getLeft(), getHeight() - 1, getWidth(), getHeight() - 1, f6.f23121k0);
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int paddingTop;
        int i14;
        Rect rect = AndroidUtilities.rectTmp2;
        int i15 = this.h;
        int paddingLeft = getPaddingLeft() + AndroidUtilities.dp(i15);
        int measuredHeight = getMeasuredHeight();
        dp dpVar = this.f50656a;
        rect.set(paddingLeft, (int) ((measuredHeight - dpVar.getMeasuredHeight()) / 2.0f), 0, 0);
        b(dpVar);
        int measuredHeight2 = getMeasuredHeight();
        TextView textView = this.f50658c;
        int measuredHeight3 = (int) ((measuredHeight2 - textView.getMeasuredHeight()) / 2.0f);
        int i16 = i15 + this.f50660f;
        int measuredWidth = dpVar.getMeasuredWidth() + AndroidUtilities.dp(i16 + 24);
        TextView textView2 = this.d;
        if (textView2.getVisibility() == 0) {
            i13 = textView2.getMeasuredWidth();
        } else {
            i13 = 0;
        }
        int i17 = measuredWidth + i13;
        TextView textView3 = this.f50659e;
        int paddingLeft2 = getPaddingLeft() + textView3.getMeasuredWidth() + i17;
        int measuredWidth2 = getMeasuredWidth() - textView.getMeasuredWidth();
        TextView textView4 = this.f50662r;
        if (paddingLeft2 > measuredWidth2 && textView4.getVisibility() == 0) {
            measuredHeight3 = getPaddingTop() + AndroidUtilities.dp(2.0f);
        }
        rect.set(((getMeasuredWidth() - textView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) - getPaddingRight(), measuredHeight3, 0, 0);
        b(textView);
        float f10 = i16;
        int paddingLeft3 = getPaddingLeft() + dpVar.getMeasuredWidth() + AndroidUtilities.dp(f10);
        int visibility = textView3.getVisibility();
        TextView textView5 = this.f50657b;
        if (visibility == 8) {
            paddingTop = (int) ((getMeasuredHeight() - textView5.getMeasuredHeight()) / 2.0f);
        } else {
            paddingTop = getPaddingTop();
        }
        rect.set(paddingLeft3, paddingTop, 0, 0);
        b(textView5);
        if (textView4.getVisibility() == 0) {
            rect.set(textView5.getMeasuredWidth() + getPaddingLeft() + dpVar.getMeasuredWidth() + AndroidUtilities.dp(i16 + 6), AndroidUtilities.dp(2.0f) + getPaddingTop(), 0, 0);
            b(textView4);
        }
        rect.set(getPaddingLeft() + dpVar.getMeasuredWidth() + AndroidUtilities.dp(f10), (getMeasuredHeight() - textView2.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView2);
        int measuredWidth3 = dpVar.getMeasuredWidth() + AndroidUtilities.dp(f10);
        if (textView2.getVisibility() == 0) {
            i14 = AndroidUtilities.dp(6.0f) + textView2.getMeasuredWidth();
        } else {
            i14 = 0;
        }
        rect.set(getPaddingLeft() + measuredWidth3 + i14, (getMeasuredHeight() - textView3.getMeasuredHeight()) - getPaddingBottom(), 0, 0);
        b(textView3);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(58.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824);
        dp dpVar = this.f50656a;
        dpVar.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size - dpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView = this.f50658c;
        textView.measure(makeMeasureSpec2, makeMeasureSpec3);
        this.f50657b.measure(View.MeasureSpec.makeMeasureSpec((size - dpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        TextView textView2 = this.f50662r;
        int i11 = 0;
        if (textView2.getVisibility() == 0) {
            textView2.measure(View.MeasureSpec.makeMeasureSpec((size - dpVar.getMeasuredWidth()) - textView.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
        } else {
            textView2.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size - dpVar.getMeasuredWidth(), Integer.MIN_VALUE);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView3 = this.d;
        textView3.measure(makeMeasureSpec4, makeMeasureSpec5);
        int measuredWidth = size - dpVar.getMeasuredWidth();
        if (textView3.getVisibility() == 0) {
            i11 = textView3.getMeasuredWidth();
        }
        int d = ll.d(6.0f, measuredWidth - i11, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE);
        TextView textView4 = this.f50659e;
        textView4.measure(d, makeMeasureSpec6);
        if (textView4.getVisibility() != 0) {
            dp -= AndroidUtilities.dp(8.0f);
        }
        setMeasuredDimension(size, dp);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.f50656a.setCirclePaintProvider(genericProvider);
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
        this.f50657b.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        this.f50658c.setAlpha(f11);
        if (z10) {
            f12 = 1.0f;
        }
        this.f50656a.setAlpha(f12);
    }

    public void setGlobalGradientView(p1 p1Var) {
        this.A = p1Var;
    }

    public void setParentXOffset(float f10) {
        this.G = f10;
    }

    public void setProgressDelegate(ep epVar) {
        this.f50656a.setProgressDelegate(epVar);
    }
}
