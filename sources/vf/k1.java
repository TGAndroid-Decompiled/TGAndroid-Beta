package vf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.z8;
public final class k1 extends FrameLayout {
    public final z8 f49123a;
    public final ImageReceiver f49124b;
    public final TextView f49125c;
    public final TextView d;
    public final np f49126e;
    public final Path f49127f;
    public final Paint h;
    public final g6 f49128n;
    public final int[] f49129r;
    public boolean f49130s;

    public k1(Context context, g6 g6Var) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        this.f49123a = new z8((g6) null);
        this.f49124b = new ImageReceiver(this);
        this.f49127f = new Path();
        this.h = new Paint(1);
        this.f49129r = new int[1];
        this.f49128n = g6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f49125c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(k6.v0(k6.G6, g6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            f10 = 40.0f;
        } else {
            f10 = 78.0f;
        }
        if (z4) {
            f11 = 78.0f;
        } else {
            f11 = 40.0f;
        }
        addView(textView, c6.d(-1, -2.0f, 7, f10, 10.33f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        org.telegram.ui.b.l(k6.f22055z6, g6Var, textView2, 1, 15.0f);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f12 = 40.0f;
        } else {
            f12 = 78.0f;
        }
        if (z10) {
            f13 = 78.0f;
        } else {
            f13 = 40.0f;
        }
        addView(textView2, c6.d(-1, -2.0f, 7, f12, 32.0f, f13, 0.0f));
        np npVar = new np(getContext(), 21, g6Var);
        this.f49126e = npVar;
        npVar.b(-1, k6.f21661d6, k6.f21788k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(3);
        addView(npVar, c6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
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
        ImageReceiver imageReceiver = this.f49124b;
        imageReceiver.setImageCoords(f11, AndroidUtilities.dp(11.33f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        canvas.drawPath(this.f49127f, this.h);
        if (this.f49130s) {
            Paint T0 = k6.T0("paintDivider", this.f49128n);
            if (T0 == null) {
                T0 = k6.f21781k0;
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
    public final void onMeasure(int i10, int i11) {
        float measuredWidth;
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.f49130s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(k6.l1(0.85f, k6.v0(k6.f22055z6, this.f49128n)));
        Path path = this.f49127f;
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
