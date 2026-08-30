package tf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.yh;
import org.telegram.ui.z00;
import vh.v2;
public final class s0 extends LinearLayout {
    public final f6 f44827a;
    public final p9 f44828b;
    public final z8 f44829c;
    public final TextView d;
    public final TextView e;

    public s0(Context context, f6 f6Var, boolean z4) {
        super(context);
        int v02;
        this.f44829c = new z8((f6) null);
        this.f44827a = f6Var;
        setOrientation(0);
        p9 p9Var = new p9(context);
        this.f44828b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(p9Var, b6.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b6.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = j6.G6;
        textView.setTextColor(j6.v0(i10, f6Var));
        TextView j10 = yh.j(linearLayout, textView, b6.n(-1, -2), context);
        this.e = j10;
        j10.setTextSize(1, 13.0f);
        if (z4) {
            v02 = j6.l1(0.5f, j6.v0(i10, f6Var));
        } else {
            v02 = j6.v0(j6.f20298z6, f6Var);
        }
        j10.setTextColor(v02);
        linearLayout.addView(j10, b6.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.e;
        TextView textView2 = this.d;
        p9 p9Var = this.f44828b;
        if (i10 == 0) {
            nq nqVar = new nq(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(j6.Oh, this.f44827a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            nqVar.f27341s = AndroidUtilities.dp(-0.66f);
            nqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            nqVar.e = dp;
            nqVar.f27338f = dp2;
            p9Var.setImageDrawable(nqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        z8 z8Var = this.f44829c;
        z8Var.q(chat);
        p9Var.e(chat, z8Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder f10 = v2.f(str, "@");
        f10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, f10.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        z00 z00Var = new z00(8);
        z00Var.f40623f = j6.w0(null, j6.Lj, false);
        spannableStringBuilder.setSpan(z00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
