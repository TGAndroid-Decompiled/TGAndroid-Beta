package sh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.ym0;
public final class y extends sl0 {
    public ArrayList f47784c;
    public ArrayList d;
    public ArrayList f47785e;

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f47784c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.f47785e;
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
        return this.f47784c.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        x xVar = (x) m1Var.f5875a;
        String str = (String) this.f47784c.get(i10);
        if (((Boolean) this.f47785e.get(i10)).booleanValue()) {
            oq oqVar = new oq(R.drawable.mini_ephemeral_hidden_14, 0);
            oqVar.setColorKey(k6.A6);
            oqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            xVar.f47769a.setText(spannableStringBuilder);
        } else {
            xVar.f47769a.setText(str);
        }
        xVar.f47770b.setText((CharSequence) this.d.get(i10));
        xVar.f47771c = str;
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        ym0 ym0Var = new ym0(context, 3);
        linearLayout.f47770b = ym0Var;
        NotificationCenter.listenEmojiLoading(ym0Var);
        ym0Var.setTextSize(1, 16.0f);
        int i11 = k6.G6;
        ym0Var.setTextColor(k6.w0(null, i11, false));
        ym0Var.setTag(Integer.valueOf(i11));
        ym0Var.setMaxLines(2);
        ym0Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(ym0Var, c6.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f47769a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = k6.f22036y6;
        textView.setTextColor(k6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        linearLayout.addView(textView, c6.o(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new f2.x0(-1, -2));
        return new f2.m1(linearLayout);
    }
}
