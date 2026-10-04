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
import org.telegram.messenger.ok;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.w9;
public final class r7 extends LinearLayout {
    public static HashMap E;
    public final int f51907a;
    public final h9 f51908b;
    public final w9 f51909c;
    public final w9 d;
    public int f51910e;
    public final TextView f51911f;
    public final LinearLayout.LayoutParams h;
    public final q90 f51912n;
    public final TextView f51913r;
    public final TextView f51914s;
    public final SpannableString v;
    public final SpannableString f51915w;
    public boolean f51916x;
    public boolean f51917y;

    public r7(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f51910e = 1;
        this.f51907a = i10;
        setOrientation(0);
        ai.w7 w7Var = new ai.w7(this, context, d6Var);
        addView(w7Var, w7.z5.o(72, -1, 0.0f, 115));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        w7Var.addView(w9Var, w7.z5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f51908b = new h9((org.telegram.ui.ActionBar.d6) null);
        w9 w9Var2 = new w9(context);
        this.f51909c = w9Var2;
        w9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        w7Var.addView(w9Var2, w7.z5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.z5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f51911f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        ok.n(i11, d6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.z5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        q90 q90Var = new q90(context, null);
        this.f51912n = q90Var;
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        q90Var.setTextSize(1, 13.0f);
        q90Var.setEllipsize(truncateAt);
        q90Var.setSingleLine(true);
        linearLayout.addView(q90Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f51913r = textView2;
        ok.n(org.telegram.ui.ActionBar.i6.f21223z6, d6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView2, w7.z5.n(-1, -2), context);
        this.f51914s = h;
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 15.3f);
        h.setGravity(5);
        addView(h, w7.z5.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f51915w = spannableString2;
        rq rqVar = new rq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        rqVar.setSize(AndroidUtilities.dp(18.0f));
        rqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(rqVar, 0, spannableString2.length(), 33);
    }

    public static sq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.v6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        sq sqVar = (sq) E.get(str);
        if (sqVar == null) {
            HashMap hashMap = E;
            sq a2 = org.telegram.ui.Cells.v6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return sqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f51917y) {
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
            canvas.drawRect(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f20940k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f51916x) {
            f7 = 71.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
