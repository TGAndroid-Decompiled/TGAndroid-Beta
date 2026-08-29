package rf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.t9;
import org.telegram.ui.n00;
import org.telegram.ui.th;
public final class t0 extends LinearLayout {
    public final c6 f47350a;
    public final t9 f47351b;
    public final e9 f47352c;
    public final TextView d;
    public final TextView f47353e;

    public t0(Context context, c6 c6Var, boolean z10) {
        super(context);
        int v02;
        this.f47352c = new e9((c6) null);
        this.f47350a = c6Var;
        setOrientation(0);
        t9 t9Var = new t9(context);
        this.f47351b = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(t9Var, f6.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, f6.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = g6.G6;
        textView.setTextColor(g6.v0(i10, c6Var));
        TextView i11 = th.i(linearLayout, textView, f6.n(-1, -2), context);
        this.f47353e = i11;
        i11.setTextSize(1, 13.0f);
        if (z10) {
            v02 = g6.l1(0.5f, g6.v0(i10, c6Var));
        } else {
            v02 = g6.v0(g6.f23450z6, c6Var);
        }
        i11.setTextColor(v02);
        linearLayout.addView(i11, f6.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f47353e;
        TextView textView2 = this.d;
        t9 t9Var = this.f47351b;
        if (i10 == 0) {
            jq jqVar = new jq(g6.b0(AndroidUtilities.dp(28.0f), g6.v0(g6.Oh, this.f47350a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            jqVar.f29791s = AndroidUtilities.dp(-0.66f);
            jqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            jqVar.f29787e = dp;
            jqVar.f29788f = dp2;
            t9Var.setImageDrawable(jqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        e9 e9Var = this.f47352c;
        e9Var.q(chat);
        t9Var.e(chat, e9Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder f9 = u3.c.f(str, "@");
        f9.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, f9.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        n00 n00Var = new n00(8);
        n00Var.f40665f = g6.w0(null, g6.Lj, false);
        spannableStringBuilder.setSpan(n00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
