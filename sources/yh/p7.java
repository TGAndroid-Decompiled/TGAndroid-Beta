package yh;

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
import org.telegram.messenger.qk;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.w9;
public final class p7 extends LinearLayout {
    public static HashMap E;
    public final int f47933a;
    public final h9 f47934b;
    public final w9 f47935c;
    public final w9 d;
    public int e;
    public final TextView f47936f;
    public final LinearLayout.LayoutParams h;
    public final p90 f47937n;
    public final TextView f47938r;
    public final TextView f47939s;
    public final SpannableString v;
    public final SpannableString f47940w;
    public boolean f47941x;
    public boolean f47942y;

    public p7(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = 1;
        this.f47933a = i10;
        setOrientation(0);
        ai.w7 w7Var = new ai.w7(this, context, e6Var);
        addView(w7Var, w7.y5.o(72, -1, 0.0f, 115));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        w7Var.addView(w9Var, w7.y5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f47934b = new h9((org.telegram.ui.ActionBar.e6) null);
        w9 w9Var2 = new w9(context);
        this.f47935c = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        w7Var.addView(w9Var2, w7.y5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.y5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f47936f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        qk.n(i11, e6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.y5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        p90 p90Var = new p90(context, null);
        this.f47937n = p90Var;
        p90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        p90Var.setTextSize(1, 13.0f);
        p90Var.setEllipsize(truncateAt);
        p90Var.setSingleLine(true);
        linearLayout.addView(p90Var, w7.y5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f47938r = textView2;
        qk.n(org.telegram.ui.ActionBar.i6.f19461z6, e6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView2, w7.y5.n(-1, -2), context);
        this.f47939s = h;
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 15.3f);
        h.setGravity(5);
        addView(h, w7.y5.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f47940w = spannableString2;
        qq qqVar = new qq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        qqVar.setSize(AndroidUtilities.dp(18.0f));
        qqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(qqVar, 0, spannableString2.length(), 33);
    }

    public static rq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.v6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        rq rqVar = (rq) E.get(str);
        if (rqVar == null) {
            HashMap hashMap = E;
            rq a2 = org.telegram.ui.Cells.v6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return rqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f47942y) {
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
            canvas.drawRect(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f19179k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f47941x) {
            f7 = 71.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
