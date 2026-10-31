package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLRPC;
public final class o6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final Paint f49283a;
    public final Paint f49284b;
    public final TextView f49285c;
    public final TextView d;
    public final TextView e;
    public final org.telegram.ui.ActionBar.p6 f49286f;

    public o6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f49283a = paint;
        Paint paint2 = new Paint(1);
        this.f49284b = paint2;
        this.f49286f = p6Var;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21170q7, p6Var));
        paint2.setColor(-1);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f49285c = textView;
        sc.e.u(textView, 1, 14.0f, null, 2131744687);
        textView.setTextColor(-1);
        addView(textView, w7.b6.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 8.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.5f, -1));
        textView2.setVisibility(8);
        textView2.setTranslationY(org.telegram.messenger.i0.L(9.0f));
        addView(textView2, w7.b6.d(-2, -2.0f, 19, 44.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setPadding(org.telegram.messenger.i0.L(13.0f), 0, org.telegram.messenger.i0.L(13.0f), 0);
        int L = org.telegram.messenger.i0.L(16.0f);
        textView3.setBackground(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, 536870911, 956301311, 956301311));
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setText(cd.L0(2131743968, null));
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setGravity(17);
        addView(textView3, w7.b6.d(-2, 32.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float L = org.telegram.messenger.i0.L(23.0f);
        float height = getHeight() / 2.0f;
        canvas.drawCircle(L, height, org.telegram.messenger.i0.L(10.0f), this.f49283a);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(L - org.telegram.messenger.i0.L(1.0f), height - org.telegram.messenger.i0.N(4.6f), org.telegram.messenger.i0.L(1.0f) + L, org.telegram.messenger.i0.N(1.6f) + height);
        Paint paint = this.f49284b;
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), paint);
        rectF.set(L - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.N(2.6f) + height, L + org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.N(4.6f) + height);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), paint);
    }

    public void set(TLRPC.TL_error tL_error) {
        TextView textView = this.f49285c;
        TextView textView2 = this.d;
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            textView.setTranslationY(-org.telegram.messenger.i0.N(5.33f));
            textView2.setText(tL_error.text);
            textView2.setVisibility(0);
            return;
        }
        textView.setTranslationY(0.0f);
        textView2.setVisibility(8);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        try {
            this.f49283a.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21170q7, this.f49286f));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
