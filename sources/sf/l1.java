package sf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.hp;
public final class l1 extends FrameLayout {
    public final e9 f47871a;
    public final ImageReceiver f47872b;
    public final TextView f47873c;
    public final TextView d;
    public final hp f47874e;
    public final Path f47875f;
    public final Paint h;
    public final c6 f47876n;
    public final int[] f47877r;
    public boolean f47878s;

    public l1(Context context, c6 c6Var) {
        super(context);
        float f9;
        float f10;
        float f11;
        float f12;
        this.f47871a = new e9((c6) null);
        this.f47872b = new ImageReceiver(this);
        this.f47875f = new Path();
        this.h = new Paint(1);
        this.f47877r = new int[1];
        this.f47876n = c6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f47873c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(g6.v0(g6.G6, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f9 = 40.0f;
        } else {
            f9 = 78.0f;
        }
        if (z10) {
            f10 = 78.0f;
        } else {
            f10 = 40.0f;
        }
        addView(textView, f6.d(-1, -2.0f, 7, f9, 10.33f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        org.telegram.ui.b.m(g6.f23450z6, c6Var, textView2, 1, 15.0f);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f11 = 40.0f;
        } else {
            f11 = 78.0f;
        }
        if (z11) {
            f12 = 78.0f;
        } else {
            f12 = 40.0f;
        }
        addView(textView2, f6.d(-1, -2.0f, 7, f11, 32.0f, f12, 0.0f));
        hp hpVar = new hp(getContext(), 21, c6Var);
        this.f47874e = hpVar;
        hpVar.b(-1, g6.f23062d6, g6.f23190k7);
        hpVar.setDrawUnchecked(false);
        hpVar.setDrawBackgroundAsArc(3);
        addView(hpVar, f6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        float f9;
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - AndroidUtilities.dp(65.0f);
        } else {
            dp = AndroidUtilities.dp(9.0f);
        }
        float f10 = dp;
        ImageReceiver imageReceiver = this.f47872b;
        imageReceiver.setImageCoords(f10, AndroidUtilities.dp(11.33f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        canvas.drawPath(this.f47875f, this.h);
        if (this.f47878s) {
            Paint T0 = g6.T0("paintDivider", this.f47876n);
            if (T0 == null) {
                T0 = g6.f23183k0;
            }
            Paint paint = T0;
            float f11 = 78.0f;
            if (LocaleController.isRTL) {
                f9 = 0.0f;
            } else {
                f9 = 78.0f;
            }
            float dp2 = AndroidUtilities.dp(f9);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f11 = 0.0f;
            }
            canvas.drawRect(dp2, measuredHeight, width - AndroidUtilities.dp(f11), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float measuredWidth;
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.f47878s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(g6.l1(0.85f, g6.v0(g6.f23450z6, this.f47876n)));
        Path path = this.f47875f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dpf2(29.66f);
        } else {
            measuredWidth = getMeasuredWidth() - AndroidUtilities.dpf2(24.33f);
        }
        path.moveTo(measuredWidth, measuredHeight - AndroidUtilities.dpf2(5.66f));
        if (LocaleController.isRTL) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        path.lineTo((AndroidUtilities.dpf2(5.33f) * i12) + measuredWidth, measuredHeight);
        path.lineTo(measuredWidth, AndroidUtilities.dpf2(5.66f) + measuredHeight);
    }
}
