package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.em;
import org.telegram.ui.Components.w9;
public final class r7 extends LinearLayout {
    public final int f45981a;
    public final org.telegram.ui.ActionBar.f6 f45982b;
    public final w9 f45983c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final TextView e;
    public final TextView f45984f;
    public final TextView h;
    public final TextView f45985n;
    public boolean f45986r;
    public boolean f45987s;

    public r7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f45981a = i10;
        this.f45982b = f6Var;
        setOrientation(0);
        w9 w9Var = new w9(context);
        this.f45983c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(w9Var, w7.a6.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.a6.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        l5Var.setTextSize(16);
        l5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(l5Var);
        linearLayout.addView(l5Var, w7.a6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        em.n(i11, f6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f45984f = g10;
        int i12 = org.telegram.ui.ActionBar.j6.f18325z6;
        em.n(i12, f6Var, g10, 1, 14.0f);
        linearLayout.addView(g10, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, w7.a6.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        em.x(i11, f6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView g11 = com.google.android.gms.internal.vision.e2.g(linearLayout2, textView2, w7.a6.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f45985n = g11;
        em.n(i12, f6Var, g11, 1, 13.0f);
        g11.setGravity(5);
        linearLayout2.addView(g11, w7.a6.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f45987s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f45986r) {
            f7 = 68.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
