package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.om0;
public final class y extends il0 {
    public ArrayList f46159c;
    public ArrayList d;
    public ArrayList f46160e;

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f46159c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.f46160e;
        arrayList3.clear();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i10);
            for (int i11 = 0; i11 < botInfo.commands.size(); i11++) {
                TLRPC.BotCommand botCommand = botInfo.commands.get(i11);
                if (botCommand != null && botCommand.command != null) {
                    arrayList.add("/" + botCommand.command);
                    arrayList2.add(botCommand.description);
                    arrayList3.add(Boolean.valueOf(botCommand.ephemeral));
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f46159c.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        x xVar = (x) n1Var.f6432a;
        String str = (String) this.f46159c.get(i10);
        if (((Boolean) this.f46160e.get(i10)).booleanValue()) {
            iq iqVar = new iq(R.drawable.mini_ephemeral_hidden_14, 0);
            iqVar.setColorKey(g6.A6);
            iqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(iqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            xVar.f46144a.setText(spannableStringBuilder);
        } else {
            xVar.f46144a.setText(str);
        }
        xVar.f46145b.setText((CharSequence) this.d.get(i10));
        xVar.f46146c = str;
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        om0 om0Var = new om0(context, 3);
        linearLayout.f46145b = om0Var;
        NotificationCenter.listenEmojiLoading(om0Var);
        om0Var.setTextSize(1, 16.0f);
        int i11 = g6.G6;
        om0Var.setTextColor(g6.w0(null, i11, false));
        om0Var.setTag(Integer.valueOf(i11));
        om0Var.setMaxLines(2);
        om0Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(om0Var, f6.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f46144a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = g6.f23433y6;
        textView.setTextColor(g6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        linearLayout.addView(textView, f6.o(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new f2.x0(-1, -2));
        return new f2.n1(linearLayout);
    }
}
