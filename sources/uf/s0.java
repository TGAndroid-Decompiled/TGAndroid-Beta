package uf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.z8;
import org.telegram.ui.yh;
import org.telegram.ui.z00;
public final class s0 extends LinearLayout {
    public final g6 f48717a;
    public final p9 f48718b;
    public final z8 f48719c;
    public final TextView d;
    public final TextView f48720e;

    public s0(Context context, g6 g6Var, boolean z4) {
        super(context);
        int v02;
        this.f48719c = new z8((g6) null);
        this.f48717a = g6Var;
        setOrientation(0);
        p9 p9Var = new p9(context);
        this.f48718b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(p9Var, c6.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c6.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = k6.G6;
        textView.setTextColor(k6.v0(i10, g6Var));
        TextView i11 = yh.i(linearLayout, textView, c6.n(-1, -2), context);
        this.f48720e = i11;
        i11.setTextSize(1, 13.0f);
        if (z4) {
            v02 = k6.l1(0.5f, k6.v0(i10, g6Var));
        } else {
            v02 = k6.v0(k6.f22055z6, g6Var);
        }
        i11.setTextColor(v02);
        linearLayout.addView(i11, c6.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f48720e;
        TextView textView2 = this.d;
        p9 p9Var = this.f48718b;
        if (i10 == 0) {
            pq pqVar = new pq(k6.b0(AndroidUtilities.dp(28.0f), k6.v0(k6.Oh, this.f48717a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            pqVar.f30165s = AndroidUtilities.dp(-0.66f);
            pqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            pqVar.f30161e = dp;
            pqVar.f30162f = dp2;
            p9Var.setImageDrawable(pqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        z8 z8Var = this.f48719c;
        z8Var.q(chat);
        p9Var.e(chat, z8Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder f10 = w.c.f(str, "@");
        f10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, f10.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        z00 z00Var = new z00(8);
        z00Var.f43751f = k6.w0(null, k6.Lj, false);
        spannableStringBuilder.setSpan(z00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
