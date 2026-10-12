package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.am;
import org.telegram.ui.Components.y9;
public final class h7 extends LinearLayout {
    public final int f52877a;
    public final org.telegram.ui.ActionBar.c6 f52878b;
    public final y9 f52879c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final TextView f52880e;
    public final TextView f52881f;
    public final TextView h;
    public final TextView f52882n;
    public boolean f52883r;
    public boolean f52884s;

    public h7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f52877a = i10;
        this.f52878b = c6Var;
        setOrientation(0);
        y9 y9Var = new y9(context);
        this.f52879c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(y9Var, w7.w5.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.w5.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        h5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        h5Var.setTextSize(16);
        h5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(h5Var);
        linearLayout.addView(h5Var, w7.w5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.f52880e = textView;
        am.o(i11, c6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.w5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f52881f = h;
        int i12 = org.telegram.ui.ActionBar.h6.f20964z6;
        am.o(i12, c6Var, h, 1, 14.0f);
        linearLayout.addView(h, w7.w5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, w7.w5.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.ui.Cells.c1.n(i11, c6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(linearLayout2, textView2, w7.w5.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f52882n = h10;
        am.o(i12, c6Var, h10, 1, 13.0f);
        h10.setGravity(5);
        linearLayout2.addView(h10, w7.w5.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f52884s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.h6.f20682k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f52883r) {
            f7 = 68.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
