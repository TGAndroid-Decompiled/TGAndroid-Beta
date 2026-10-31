package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.g9;
public final class a8 extends LinearLayout {
    public final int f46640a;
    public final org.telegram.ui.ActionBar.p6 f46641b;
    public final g9 f46642c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final TextView e;
    public final TextView f46643f;
    public final TextView h;
    public final TextView f46644n;
    public boolean f46645r;
    public boolean f46646s;

    public a8(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f46640a = i10;
        this.f46641b = p6Var;
        setOrientation(0);
        g9 g9Var = new g9(context);
        this.f46642c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(46.0f));
        addView(g9Var, w7.b6.q(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i11, p6Var);
        u5Var.setTextSize(16);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        zs.i(u5Var);
        linearLayout.addView(u5Var, w7.b6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView f7 = z20.f(linearLayout, textView, w7.b6.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f46643f = f7;
        int i12 = org.telegram.ui.ActionBar.t6.f21330z6;
        org.telegram.ui.ActionBar.a7.V(f7, i12, p6Var);
        f7.setTextSize(1, 14.0f);
        linearLayout.addView(f7, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, w7.b6.q(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.messenger.m5.m(textView2, i11, p6Var, 1, 16.0f);
        textView2.setGravity(5);
        TextView f10 = z20.f(linearLayout2, textView2, w7.b6.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f46644n = f10;
        org.telegram.ui.ActionBar.a7.V(f10, i12, p6Var);
        f10.setTextSize(1, 13.0f);
        f10.setGravity(5);
        linearLayout2.addView(f10, w7.b6.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f46646s) {
            canvas.drawRect(org.telegram.messenger.i0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f46645r) {
            f7 = 68.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), 1073741824));
    }
}
