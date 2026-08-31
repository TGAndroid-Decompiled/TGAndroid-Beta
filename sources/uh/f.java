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
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.sj0;
public final class f extends i51 {
    public static final int f48810a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        int i10;
        g gVar = (g) view;
        e eVar = (e) j51Var.G;
        TLRPC.User user = eVar.f48808b;
        long j10 = eVar.f48807a;
        boolean z10 = eVar.f48809c;
        boolean z11 = !j51Var.f28012j;
        p9 p9Var = gVar.f48813c;
        TextView textView = gVar.f48816n;
        TextView textView2 = gVar.d;
        gVar.f48820x = (d) j51Var.H;
        gVar.f48821y = j10;
        gVar.B = user.f20990id;
        int i11 = gVar.f48812b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        gVar.f48815f.setText(DialogObject.getName(j10));
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
            spannableStringBuilder.setSpan(gVar.f48817r, 0, 1, 33);
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
        gVar.f48819w = z11;
        if (user2 != null) {
            p9Var.e(user2, new z8(0, user2));
        } else {
            p9Var.e(chat, new z8(chat));
        }
        gVar.f48814e.e(user, new z8(0, user));
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        g gVar = new g(context, i10, g6Var);
        gVar.setLayoutParams(new x0(-1, -2));
        gVar.setClickable(false);
        return gVar;
    }

    @Override
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        e eVar = (e) j51Var.G;
        e eVar2 = (e) j51Var2.G;
        if (eVar.f48807a == eVar2.f48807a && DialogObject.getDialogId(eVar.f48808b) == DialogObject.getDialogId(eVar2.f48808b)) {
            return true;
        }
        return false;
    }
}
