package qf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.y8;

public final class l1 extends FrameLayout {

    public final y8 f46343a;

    public final ImageReceiver f46344b;

    public final TextView f46345c;
    public final TextView d;

    public final bp f46346e;

    public final Path f46347f;
    public final Paint h;

    public final c6 f46348n;

    public final int[] f46349r;

    public boolean f46350s;

    public l1(Context context, c6 c6Var) {
        super(context);
        this.f46343a = new y8((c6) null);
        this.f46344b = new ImageReceiver(this);
        this.f46347f = new Path();
        this.h = new Paint(1);
        this.f46349r = new int[1];
        this.f46348n = c6Var;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f46345c = textView;
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(g6.v0(g6.G6, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        boolean z10 = LocaleController.isRTL;
        addView(textView, z5.d(-1, -2.0f, 7, z10 ? 40.0f : 78.0f, 10.33f, z10 ? 78.0f : 40.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setLines(2);
        textView2.setEllipsize(truncateAt);
        rl.l(g6.f23441z6, c6Var, textView2, 1, 15.0f);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, z5.d(-1, -2.0f, 7, z11 ? 40.0f : 78.0f, 32.0f, z11 ? 78.0f : 40.0f, 0.0f));
        bp bpVar = new bp(getContext(), 21, c6Var);
        this.f46346e = bpVar;
        bpVar.b(-1, g6.f23053d6, g6.f23182k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(3);
        addView(bpVar, z5.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(65.0f) : AndroidUtilities.dp(9.0f);
        float fDp = AndroidUtilities.dp(11.33f);
        float fDp2 = AndroidUtilities.dp(56.0f);
        float fDp3 = AndroidUtilities.dp(56.0f);
        ImageReceiver imageReceiver = this.f46344b;
        imageReceiver.setImageCoords(measuredWidth, fDp, fDp2, fDp3);
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        canvas.drawPath(this.f46347f, this.h);
        if (this.f46350s) {
            Paint paintT0 = g6.T0("paintDivider", this.f46348n);
            if (paintT0 == null) {
                paintT0 = g6.f23175k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 78.0f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 78.0f : 0.0f), getMeasuredHeight(), paintT0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(78.0f) + (this.f46350s ? 1 : 0), 1073741824));
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.h;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(g6.l1(0.85f, g6.v0(g6.f23441z6, this.f46348n)));
        Path path = this.f46347f;
        path.rewind();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float fDpf2 = LocaleController.isRTL ? AndroidUtilities.dpf2(29.66f) : getMeasuredWidth() - AndroidUtilities.dpf2(24.33f);
        path.moveTo(fDpf2, measuredHeight - AndroidUtilities.dpf2(5.66f));
        path.lineTo((AndroidUtilities.dpf2(5.33f) * (LocaleController.isRTL ? -1 : 1)) + fDpf2, measuredHeight);
        path.lineTo(fDpf2, AndroidUtilities.dpf2(5.66f) + measuredHeight);
    }
}
