package xh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w9;
public final class t7 extends LinearLayout {
    public static HashMap E;
    public final int f46068a;
    public final g9 f46069b;
    public final w9 f46070c;
    public final w9 d;
    public int e;
    public final TextView f46071f;
    public final LinearLayout.LayoutParams h;
    public final m90 f46072n;
    public final TextView f46073r;
    public final TextView f46074s;
    public final SpannableString v;
    public final SpannableString f46075w;
    public boolean f46076x;
    public boolean f46077y;

    public t7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = 1;
        this.f46068a = i10;
        setOrientation(0);
        bi.w7 w7Var = new bi.w7(this, context, f6Var);
        addView(w7Var, w7.a6.o(72, -1, 0.0f, 115));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        w7Var.addView(w9Var, w7.a6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f46069b = new g9((org.telegram.ui.ActionBar.f6) null);
        w9 w9Var2 = new w9(context);
        this.f46070c = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        w7Var.addView(w9Var2, w7.a6.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.a6.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f46071f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        em.n(i11, f6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.a6.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        m90 m90Var = new m90(context, null);
        this.f46072n = m90Var;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        m90Var.setTextSize(1, 13.0f);
        m90Var.setEllipsize(truncateAt);
        m90Var.setSingleLine(true);
        linearLayout.addView(m90Var, w7.a6.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f46073r = textView2;
        em.n(org.telegram.ui.ActionBar.j6.f18325z6, f6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView2, w7.a6.n(-1, -2), context);
        this.f46074s = g10;
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextSize(1, 15.3f);
        g10.setGravity(5);
        addView(g10, w7.a6.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f46075w = spannableString2;
        uq uqVar = new uq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        uqVar.setSize(AndroidUtilities.dp(18.0f));
        uqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(uqVar, 0, spannableString2.length(), 33);
    }

    public static vq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.w6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        vq vqVar = (vq) E.get(str);
        if (vqVar == null) {
            HashMap hashMap = E;
            vq a2 = org.telegram.ui.Cells.w6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return vqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f46077y) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f46076x) {
            f7 = 71.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
