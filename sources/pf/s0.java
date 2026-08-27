package pf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.o00;

public final class s0 extends LinearLayout {

    public final c6 f45909a;

    public final n9 f45910b;

    public final y8 f45911c;
    public final TextView d;

    public final TextView f45912e;

    public s0(Context context, c6 c6Var, boolean z10) {
        super(context);
        this.f45911c = new y8((c6) null);
        this.f45909a = c6Var;
        setOrientation(0);
        n9 n9Var = new n9(context);
        this.f45910b = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(n9Var, z5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = g6.G6;
        textView.setTextColor(g6.v0(i10, c6Var));
        TextView textViewI = pa.i(linearLayout, textView, z5.n(-1, -2), context);
        this.f45912e = textViewI;
        textViewI.setTextSize(1, 13.0f);
        textViewI.setTextColor(z10 ? g6.l1(0.5f, g6.v0(i10, c6Var)) : g6.v0(g6.f23441z6, c6Var));
        linearLayout.addView(textViewI, z5.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.f45912e;
        TextView textView2 = this.d;
        n9 n9Var = this.f45910b;
        if (i10 == 0) {
            dq dqVar = new dq(g6.b0(AndroidUtilities.dp(28.0f), g6.v0(g6.Oh, this.f45909a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            dqVar.f27827s = AndroidUtilities.dp(-0.66f);
            dqVar.v = 0;
            int iDp = AndroidUtilities.dp(20.0f);
            int iDp2 = AndroidUtilities.dp(20.0f);
            dqVar.f27823e = iDp;
            dqVar.f27824f = iDp2;
            n9Var.setImageDrawable(dqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        y8 y8Var = this.f45911c;
        y8Var.q(chat);
        n9Var.e(chat, y8Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder sbF = s3.c.f(str, "@");
        sbF.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, sbF.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        o00 o00Var = new o00(8);
        o00Var.f40970f = g6.w0(null, g6.Lj, false);
        spannableStringBuilder.setSpan(o00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
