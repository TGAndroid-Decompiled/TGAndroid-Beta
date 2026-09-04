package zh;

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
import org.telegram.messenger.wl;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.x9;
public final class p7 extends LinearLayout {
    public static HashMap E;
    public final int f52429a;
    public final i9 f52430b;
    public final x9 f52431c;
    public final x9 d;
    public int f52432e;
    public final TextView f52433f;
    public final LinearLayout.LayoutParams h;
    public final d90 f52434n;
    public final TextView f52435r;
    public final TextView f52436s;
    public final SpannableString v;
    public final SpannableString f52437w;
    public boolean f52438x;
    public boolean f52439y;

    public p7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f52432e = 1;
        this.f52429a = i10;
        setOrientation(0);
        bi.e7 e7Var = new bi.e7(this, context, f6Var);
        addView(e7Var, w7.x5.o(72, -1, 0.0f, 115));
        x9 x9Var = new x9(context);
        this.d = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        e7Var.addView(x9Var, w7.x5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        this.f52430b = new i9((org.telegram.ui.ActionBar.f6) null);
        x9 x9Var2 = new x9(context);
        this.f52431c = x9Var2;
        x9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        e7Var.addView(x9Var2, w7.x5.d(46, 46.0f, 16, 13.0f, 0.0f, 13.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.x5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f52433f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        wl.n(i11, f6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.x5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        d90 d90Var = new d90(context, null);
        this.f52434n = d90Var;
        d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        d90Var.setTextSize(1, 13.0f);
        d90Var.setEllipsize(truncateAt);
        d90Var.setSingleLine(true);
        linearLayout.addView(d90Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f52435r = textView2;
        wl.n(org.telegram.ui.ActionBar.j6.f21061z6, f6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView2, w7.x5.n(-1, -2), context);
        this.f52436s = h;
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 15.3f);
        h.setGravity(5);
        addView(h, w7.x5.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f52437w = spannableString2;
        nq nqVar = new nq(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        nqVar.setSize(AndroidUtilities.dp(18.0f));
        nqVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(nqVar, 0, spannableString2.length(), 33);
    }

    public static oq a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.u6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        oq oqVar = (oq) E.get(str);
        if (oqVar == null) {
            HashMap hashMap = E;
            oq a2 = org.telegram.ui.Cells.u6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return oqVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f52439y) {
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
            canvas.drawRect(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20785k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f52438x) {
            f7 = 71.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
