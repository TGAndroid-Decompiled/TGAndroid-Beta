package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.u9;
public final class q7 extends LinearLayout {
    public final int f47670a;
    public final org.telegram.ui.ActionBar.e6 f47671b;
    public final u9 f47672c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final TextView e;
    public final TextView f47673f;
    public final TextView h;
    public final TextView f47674n;
    public boolean f47675r;
    public boolean f47676s;

    public q7(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f47670a = i10;
        this.f47671b = e6Var;
        setOrientation(0);
        u9 u9Var = new u9(context);
        this.f47672c = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(u9Var, w7.x5.p(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        j5Var.setTextSize(16);
        j5Var.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(j5Var);
        linearLayout.addView(j5Var, w7.x5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        wl.n(i11, e6Var, textView, 1, 13.0f);
        textView.setVisibility(8);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f47673f = h;
        int i12 = org.telegram.ui.ActionBar.i6.f19237z6;
        wl.n(i12, e6Var, h, 1, 14.0f);
        linearLayout.addView(h, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, w7.x5.p(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        wl.x(i11, e6Var, textView2, 1, 16.0f);
        textView2.setGravity(5);
        TextView h10 = com.google.android.gms.internal.vision.e2.h(linearLayout2, textView2, w7.x5.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f47674n = h10;
        wl.n(i12, e6Var, h10, 1, 13.0f);
        h10.setGravity(5);
        linearLayout2.addView(h10, w7.x5.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f47676s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f18958k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f47675r) {
            f7 = 68.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
