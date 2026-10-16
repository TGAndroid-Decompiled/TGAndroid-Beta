package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.sk;
import org.telegram.ui.Components.z9;
public final class h7 extends LinearLayout {
    public final int f50634a;
    public final org.telegram.ui.ActionBar.c6 f50635b;
    public final z9 f50636c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final TextView e;
    public final TextView f50637f;
    public final TextView h;
    public final TextView f50638n;
    public boolean f50639r;
    public boolean f50640s;

    public h7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f50634a = i10;
        this.f50635b = c6Var;
        setOrientation(0);
        z9 z9Var = new z9(context);
        this.f50636c = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(z9Var, w7.z5.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        h5Var.setTextSize(16);
        h5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(h5Var);
        linearLayout.addView(h5Var, w7.z5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        sk.o(i11, c6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f50637f = i12;
        int i13 = org.telegram.ui.ActionBar.g6.f20005z6;
        sk.o(i13, c6Var, i12, 1, 14.0f);
        linearLayout.addView(i12, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, w7.z5.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.ui.Cells.c1.n(i11, c6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView i14 = com.google.android.gms.internal.play_billing.k3.i(linearLayout2, textView2, w7.z5.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f50638n = i14;
        sk.o(i13, c6Var, i14, 1, 13.0f);
        i14.setGravity(5);
        linearLayout2.addView(i14, w7.z5.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f50640s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f19722k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f50639r) {
            f7 = 68.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
