package pf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.z8;
public final class l1 extends FrameLayout {
    public final z8 f45678a;
    public final ImageReceiver f45679b;
    public final TextView f45680c;
    public final TextView d;
    public final dp f45681e;
    public final Path f45682f;
    public final Paint h;
    public final b6 f45683n;
    public final int[] f45684r;
    public boolean f45685s;

    public l1(Context context, b6 b6Var) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        this.f45678a = new z8((b6) null);
        this.f45679b = new ImageReceiver(this);
        this.f45682f = new Path();
        this.h = new Paint(1);
        this.f45684r = new int[1];
        this.f45683n = b6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f45680c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(f6.v0(f6.G6, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f10 = 40.0f;
        } else {
            f10 = 78.0f;
        }
        if (z10) {
            f11 = 78.0f;
        } else {
            f11 = 40.0f;
        }
        addView(textView, e6.d(-1, -2.0f, 7, f10, 10.33f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        ll.n(f6.f23386z6, b6Var, textView2, 1, 15.0f);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            f12 = 40.0f;
        } else {
            f12 = 78.0f;
        }
        if (z11) {
            f13 = 78.0f;
        } else {
            f13 = 40.0f;
        }
        addView(textView2, e6.d(-1, -2.0f, 7, f12, 32.0f, f13, 0.0f));
        dp dpVar = new dp(getContext(), 21, b6Var);
        this.f45681e = dpVar;
        dpVar.b(-1, f6.f23001d6, f6.f23128k7);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(3);
        addView(dpVar, e6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        float f10;
        if (LocaleController.isRTL) {
            dp = getMeasuredWidth() - AndroidUtilities.dp(65.0f);
        } else {
            dp = AndroidUtilities.dp(9.0f);
        }
        float f11 = dp;
        ImageReceiver imageReceiver = this.f45679b;
        imageReceiver.setImageCoords(f11, AndroidUtilities.dp(11.33f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        canvas.drawPath(this.f45682f, this.h);
        if (this.f45685s) {
            Paint T0 = f6.T0("paintDivider", this.f45683n);
            if (T0 == null) {
                T0 = f6.f23121k0;
            }
            Paint paint = T0;
            float f12 = 78.0f;
            if (LocaleController.isRTL) {
                f10 = 0.0f;
            } else {
                f10 = 78.0f;
            }
            float dp2 = AndroidUtilities.dp(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f12 = 0.0f;
            }
            canvas.drawRect(dp2, measuredHeight, width - AndroidUtilities.dp(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float measuredWidth;
        int i11;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.f45685s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(f6.l1(0.85f, f6.v0(f6.f23386z6, this.f45683n)));
        Path path = this.f45682f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dpf2(29.66f);
        } else {
            measuredWidth = getMeasuredWidth() - AndroidUtilities.dpf2(24.33f);
        }
        path.moveTo(measuredWidth, measuredHeight - AndroidUtilities.dpf2(5.66f));
        if (LocaleController.isRTL) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        path.lineTo((AndroidUtilities.dpf2(5.33f) * i11) + measuredWidth, measuredHeight);
        path.lineTo(measuredWidth, AndroidUtilities.dpf2(5.66f) + measuredHeight);
    }
}
