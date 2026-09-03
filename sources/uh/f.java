package uh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import f2.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.sj0;
public final class f extends g51 {
    public static final int f48846a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        int i10;
        g gVar = (g) view;
        e eVar = (e) h51Var.G;
        TLRPC.User user = eVar.f48844b;
        long j10 = eVar.f48843a;
        boolean z10 = eVar.f48845c;
        boolean z11 = !h51Var.f27373j;
        p9 p9Var = gVar.f48849c;
        TextView textView = gVar.f48852n;
        TextView textView2 = gVar.d;
        gVar.f48856x = (d) h51Var.H;
        gVar.f48857y = j10;
        gVar.B = user.f20992id;
        int i11 = gVar.f48848b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        gVar.f48851f.setText(DialogObject.getName(j10));
        TextView textView3 = gVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), k6.w0(null, k6.il, false), new sj0(19)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(gVar.f48853r, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumberWithMillion(chat.participants_count, ','));
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (z10) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        gVar.f48855w = z11;
        if (user2 != null) {
            p9Var.e(user2, new z8(0, user2));
        } else {
            p9Var.e(chat, new z8(chat));
        }
        gVar.f48850e.e(user, new z8(0, user));
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        g gVar = new g(context, i10, g6Var);
        gVar.setLayoutParams(new x0(-1, -2));
        gVar.setClickable(false);
        return gVar;
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        e eVar = (e) h51Var.G;
        e eVar2 = (e) h51Var2.G;
        if (eVar.f48843a == eVar2.f48843a && DialogObject.getDialogId(eVar.f48844b) == DialogObject.getDialogId(eVar2.f48844b)) {
            return true;
        }
        return false;
    }
}
