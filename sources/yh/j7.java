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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
public final class j7 extends LinearLayout {
    public static HashMap E;
    public final int f52790a;
    public final j9 f52791b;
    public final y9 f52792c;
    public final y9 d;
    public int f52793e;
    public final TextView f52794f;
    public final LinearLayout.LayoutParams h;
    public final fa0 f52795n;
    public final TextView f52796r;
    public final TextView f52797s;
    public final SpannableString v;
    public final SpannableString f52798w;
    public boolean f52799x;
    public boolean f52800y;

    public j7(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f52793e = 1;
        this.f52790a = i10;
        setOrientation(0);
        ai.x7 x7Var = new ai.x7(this, context, e6Var);
        addView(x7Var, w7.x5.o(72, -1, 0.0f, 115));
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        x7Var.addView(y9Var, w7.x5.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 16));
        this.f52791b = new j9((org.telegram.ui.ActionBar.e6) null);
        y9 y9Var2 = new y9(context);
        this.f52792c = y9Var2;
        y9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        x7Var.addView(y9Var2, w7.x5.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.x5.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f52794f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        bi.o(i11, e6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.x5.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        fa0 fa0Var = new fa0(context, null);
        this.f52795n = fa0Var;
        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        fa0Var.setTextSize(1, 13.0f);
        fa0Var.setEllipsize(truncateAt);
        fa0Var.setSingleLine(true);
        linearLayout.addView(fa0Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f52796r = textView2;
        bi.o(org.telegram.ui.ActionBar.i6.f21203z6, e6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView2, w7.x5.n(-1, -2), context);
        this.f52797s = h;
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
        this.f52798w = spannableString2;
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
        if (this.f52800y) {
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
            canvas.drawRect(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.i6.f20923k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f52799x) {
            f7 = 71.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
