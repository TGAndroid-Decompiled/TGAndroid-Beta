package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p80;
public final class c8 extends LinearLayout {
    public static HashMap E;
    public boolean D;
    public final int f46749a;
    public final org.telegram.ui.Components.r8 f46750b;
    public final g9 f46751c;
    public final g9 d;
    public int e;
    public final TextView f46752f;
    public final LinearLayout.LayoutParams h;
    public final p80 f46753n;
    public final TextView f46754r;
    public final TextView f46755s;
    public final SpannableString f46756w;
    public final SpannableString f46757x;
    public boolean f46758y;

    public c8(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = 1;
        this.f46749a = i10;
        setOrientation(0);
        jg.a3 a3Var = new jg.a3(this, context, p6Var);
        addView(a3Var, w7.b6.p(72, -1, 0.0f, 115));
        g9 g9Var = new g9(context);
        this.d = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(46.0f));
        a3Var.addView(g9Var, w7.b6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f46750b = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        g9 g9Var2 = new g9(context);
        this.f46751c = g9Var2;
        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(46.0f));
        a3Var.addView(g9Var2, w7.b6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.b6.p(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f46752f = textView;
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i11, p6Var);
        textView.setTextSize(1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.b6.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        p80 p80Var = new p80(context, null);
        this.f46753n = p80Var;
        org.telegram.ui.ActionBar.a7.V(p80Var, i11, p6Var);
        p80Var.setTextSize(1, 13.0f);
        p80Var.setEllipsize(truncateAt);
        p80Var.setSingleLine(true);
        linearLayout.addView(p80Var, w7.b6.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f46754r = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        linearLayout.addView(textView2, w7.b6.o(-1, -2));
        TextView textView3 = new TextView(context);
        this.f46755s = textView3;
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextSize(1, 15.3f);
        textView3.setGravity(5);
        addView(textView3, w7.b6.q(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.f46756w = spannableString;
        Drawable f7 = i0.a.f(context, 2131232749);
        f7.setBounds(0, 0, org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(21.0f));
        spannableString.setSpan(new ImageSpan(f7), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f46757x = spannableString2;
        dq dqVar = new dq(0, i0.a.f(context, 2131231956));
        dqVar.d = false;
        dqVar.c(org.telegram.messenger.i0.L(18.0f));
        dqVar.f25569s = org.telegram.messenger.i0.L(0.5f);
        spannableString2.setSpan(dqVar, 0, spannableString2.length(), 33);
    }

    public static eq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.w6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        eq eqVar = (eq) E.get(str);
        if (eqVar == null) {
            HashMap hashMap = E;
            eq a2 = org.telegram.ui.Cells.w6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return eqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        super.onDraw(canvas);
        if (this.D) {
            if (dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(72.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f46758y) {
            f7 = 71.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7), 1073741824));
    }
}
