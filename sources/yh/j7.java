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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
public final class j7 extends LinearLayout {
    public static HashMap E;
    public final int f52746a;
    public final j9 f52747b;
    public final y9 f52748c;
    public final y9 d;
    public int f52749e;
    public final TextView f52750f;
    public final LinearLayout.LayoutParams h;
    public final ea0 f52751n;
    public final TextView f52752r;
    public final TextView f52753s;
    public final SpannableString v;
    public final SpannableString f52754w;
    public boolean f52755x;
    public boolean f52756y;

    public j7(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f52749e = 1;
        this.f52746a = i10;
        setOrientation(0);
        ai.x7 x7Var = new ai.x7(this, context, e6Var);
        addView(x7Var, w7.x5.o(72, -1, 0.0f, 115));
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        x7Var.addView(y9Var, w7.x5.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 16));
        this.f52747b = new j9((org.telegram.ui.ActionBar.e6) null);
        y9 y9Var2 = new y9(context);
        this.f52748c = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        x7Var.addView(y9Var2, w7.x5.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.x5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f52750f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        bi.o(i11, e6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.x5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        ea0 ea0Var = new ea0(context, null);
        this.f52751n = ea0Var;
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        ea0Var.setTextSize(1, 13.0f);
        ea0Var.setEllipsize(truncateAt);
        ea0Var.setSingleLine(true);
        linearLayout.addView(ea0Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f52752r = textView2;
        bi.o(org.telegram.ui.ActionBar.i6.f21199z6, e6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView2, w7.x5.n(-1, -2), context);
        this.f52753s = h;
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
        this.f52754w = spannableString2;
        er erVar = new er(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        erVar.recolorDrawable = false;
        erVar.setSize(AndroidUtilities.dp(18.0f));
        erVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(erVar, 0, spannableString2.length(), 33);
    }

    public static fr a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.v6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        fr frVar = (fr) E.get(str);
        if (frVar == null) {
            HashMap hashMap = E;
            fr a2 = org.telegram.ui.Cells.v6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return frVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f52756y) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f20919k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f52755x) {
            f7 = 71.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
