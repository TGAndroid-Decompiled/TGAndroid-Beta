package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.rk;
import org.telegram.ui.Components.v9;
public final class o7 extends LinearLayout {
    public final int f47860a;
    public final org.telegram.ui.ActionBar.f6 f47861b;
    public final v9 f47862c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final TextView e;
    public final TextView f47863f;
    public final TextView h;
    public final TextView f47864n;
    public boolean f47865r;
    public boolean f47866s;

    public o7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f47860a = i10;
        this.f47861b = f6Var;
        setOrientation(0);
        v9 v9Var = new v9(context);
        this.f47862c = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(v9Var, w7.y5.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        j5Var.setTextSize(16);
        j5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(j5Var);
        linearLayout.addView(j5Var, w7.y5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        rk.n(i11, f6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.y5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f47863f = h;
        int i12 = org.telegram.ui.ActionBar.j6.f19496z6;
        rk.n(i12, f6Var, h, 1, 14.0f);
        linearLayout.addView(h, w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, w7.y5.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.ui.Cells.c1.q(i11, f6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(linearLayout2, textView2, w7.y5.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f47864n = h10;
        rk.n(i12, f6Var, h10, 1, 13.0f);
        h10.setGravity(5);
        linearLayout2.addView(h10, w7.y5.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f47866s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f19216k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f47865r) {
            f7 = 68.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
