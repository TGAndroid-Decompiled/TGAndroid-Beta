package rh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.wm0;
public final class z extends rl0 {
    public ArrayList f43864c;
    public ArrayList d;
    public ArrayList e;

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f43864c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
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
        return this.f43864c.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        y yVar = (y) l1Var.f5785a;
        String str = (String) this.f43864c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            mq mqVar = new mq(R.drawable.mini_ephemeral_hidden_14, 0);
            mqVar.setColorKey(j6.A6);
            mqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(mqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            yVar.f43849a.setText(spannableStringBuilder);
        } else {
            yVar.f43849a.setText(str);
        }
        yVar.f43850b.setText((CharSequence) this.d.get(i10));
        yVar.f43851c = str;
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        wm0 wm0Var = new wm0(context, 3);
        linearLayout.f43850b = wm0Var;
        NotificationCenter.listenEmojiLoading(wm0Var);
        wm0Var.setTextSize(1, 16.0f);
        int i11 = j6.G6;
        wm0Var.setTextColor(j6.w0(null, i11, false));
        wm0Var.setTag(Integer.valueOf(i11));
        wm0Var.setMaxLines(2);
        wm0Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(wm0Var, b6.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f43849a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = j6.f20281y6;
        textView.setTextColor(j6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        linearLayout.addView(textView, b6.o(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new f2.w0(-1, -2));
        return new f2.l1(linearLayout);
    }
}
