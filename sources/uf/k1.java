package uf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.z8;
public final class k1 extends FrameLayout {
    public final z8 f45405a;
    public final ImageReceiver f45406b;
    public final TextView f45407c;
    public final TextView d;
    public final kp e;
    public final Path f45408f;
    public final Paint h;
    public final f6 f45409n;
    public final int[] f45410r;
    public boolean f45411s;

    public k1(Context context, f6 f6Var) {
        super(context);
        float f10;
        float f11;
        float f12;
        float f13;
        this.f45405a = new z8((f6) null);
        this.f45406b = new ImageReceiver(this);
        this.f45408f = new Path();
        this.h = new Paint(1);
        this.f45410r = new int[1];
        this.f45409n = f6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f45407c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(j6.v0(j6.G6, f6Var));
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
        addView(textView, b6.d(-1, -2.0f, 7, f10, 10.33f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        org.telegram.ui.b.l(j6.f20273z6, f6Var, textView2, 1, 15.0f);
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
        addView(textView2, b6.d(-1, -2.0f, 7, f12, 32.0f, f13, 0.0f));
        kp kpVar = new kp(getContext(), 21, f6Var);
        this.e = kpVar;
        kpVar.b(-1, j6.f19881d6, j6.f20007k7);
        kpVar.setDrawUnchecked(false);
        kpVar.setDrawBackgroundAsArc(3);
        addView(kpVar, b6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
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
        ImageReceiver imageReceiver = this.f45406b;
        imageReceiver.setImageCoords(f11, AndroidUtilities.dp(11.33f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        canvas.drawPath(this.f45408f, this.h);
        if (this.f45411s) {
            Paint T0 = j6.T0("paintDivider", this.f45409n);
            if (T0 == null) {
                T0 = j6.f20000k0;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.f45411s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(j6.l1(0.85f, j6.v0(j6.f20273z6, this.f45409n)));
        Path path = this.f45408f;
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
