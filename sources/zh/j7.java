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
import org.telegram.messenger.yh;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
public final class j7 extends LinearLayout {
    public static HashMap E;
    public final int f50723a;
    public final k9 f50724b;
    public final z9 f50725c;
    public final z9 d;
    public int e;
    public final TextView f50726f;
    public final LinearLayout.LayoutParams h;
    public final da0 f50727n;
    public final TextView f50728r;
    public final TextView f50729s;
    public final SpannableString v;
    public final SpannableString f50730w;
    public boolean f50731x;
    public boolean f50732y;

    public j7(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = 1;
        this.f50723a = i10;
        setOrientation(0);
        bi.i7 i7Var = new bi.i7(this, context, c6Var);
        addView(i7Var, w7.a6.o(72, -1, 0.0f, 115));
        z9 z9Var = new z9(context);
        this.d = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        i7Var.addView(z9Var, w7.a6.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 16));
        this.f50724b = new k9((org.telegram.ui.ActionBar.c6) null);
        z9 z9Var2 = new z9(context);
        this.f50725c = z9Var2;
        z9Var2.setRoundRadius(AndroidUtilities.dp(46.0f));
        i7Var.addView(z9Var2, w7.a6.a(46.0f, 13.0f, 0.0f, 13.0f, 0.0f, 46, 16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(19);
        addView(linearLayout, w7.a6.o(-2, -1, 1.0f, 119));
        TextView textView = new TextView(context);
        this.f50726f = textView;
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        yh.n(i11, c6Var, textView, 1, 16.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams k10 = w7.a6.k(0.0f, 0.0f, 0.0f, 4.33f, -1, -2);
        this.h = k10;
        linearLayout.addView(textView, k10);
        da0 da0Var = new da0(context, null);
        this.f50727n = da0Var;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        da0Var.setTextSize(1, 13.0f);
        da0Var.setEllipsize(truncateAt);
        da0Var.setSingleLine(true);
        linearLayout.addView(da0Var, w7.a6.k(0.0f, 0.0f, 0.0f, 0.33f, -1, -2));
        TextView textView2 = new TextView(context);
        this.f50728r = textView2;
        yh.n(org.telegram.ui.ActionBar.g6.f20305z6, c6Var, textView2, 1, 14.0f);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView2, w7.a6.n(-1, -2), context);
        this.f50729s = i12;
        i12.setTypeface(AndroidUtilities.bold());
        i12.setTextSize(1, 15.3f);
        i12.setGravity(5);
        addView(i12, w7.a6.p(-2, -2, 0.0f, 21, 8, 0, 20, 0));
        SpannableString spannableString = new SpannableString("⭐️");
        this.v = spannableString;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        mutate.setBounds(0, 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f));
        spannableString.setSpan(new ImageSpan(mutate), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("TON");
        this.f50730w = spannableString2;
        br brVar = new br(0, context.getResources().getDrawable(R.drawable.mini_gram_72).mutate());
        brVar.recolorDrawable = false;
        brVar.setSize(AndroidUtilities.dp(18.0f));
        brVar.setTranslateY(AndroidUtilities.dp(0.5f));
        spannableString2.setSpan(brVar, 0, spannableString2.length(), 33);
    }

    public static cr a(int i10, String str) {
        if (i10 != 44) {
            return org.telegram.ui.Cells.v6.a(i10, str);
        }
        if (E == null) {
            E = new HashMap();
        }
        cr crVar = (cr) E.get(str);
        if (crVar == null) {
            HashMap hashMap = E;
            cr a2 = org.telegram.ui.Cells.v6.a(44, str);
            hashMap.put(str, a2);
            return a2;
        }
        return crVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f50732y) {
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
            canvas.drawRect(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f20022k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f50731x) {
            f7 = 71.0f;
        } else {
            f7 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7), 1073741824));
    }
}
