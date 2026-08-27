package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import f2.y0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.tq0;

public final class f extends m41 {

    public static final int f46038a = 0;

    static {
        m41.setup(new f());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        int i10;
        g gVar = (g) view;
        e eVar = (e) n41Var.G;
        TLRPC.User user = eVar.f46036b;
        long j10 = eVar.f46035a;
        d dVar = (d) n41Var.H;
        boolean z11 = eVar.f46037c;
        boolean z12 = !n41Var.f30842j;
        n9 n9Var = gVar.f46041c;
        TextView textView = gVar.f46044n;
        TextView textView2 = gVar.d;
        gVar.f46048x = dVar;
        gVar.f46049y = j10;
        gVar.A = user.f22527id;
        int i11 = gVar.f46040b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        gVar.f46043f.setText(DialogObject.getName(j10));
        TextView textView3 = gVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else {
            i10 = ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.CommunityPendingRequestSuggestedChannel : R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), g6.w0(null, g6.il, false), new tq0(13)));
        if (user2 == null && chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(gVar.f46045r, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumberWithMillion(chat.participants_count, ','));
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (z11) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        gVar.f46047w = z12;
        if (user2 != null) {
            n9Var.e(user2, new y8(0, user2));
        } else {
            n9Var.e(chat, new y8(chat));
        }
        gVar.f46042e.e(user, new y8(0, user));
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        g gVar = new g(context, i10, c6Var);
        gVar.setLayoutParams(new y0(-1, -2));
        gVar.setClickable(false);
        return gVar;
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        e eVar = (e) n41Var.G;
        e eVar2 = (e) n41Var2.G;
        return eVar.f46035a == eVar2.f46035a && DialogObject.getDialogId(eVar.f46036b) == DialogObject.getDialogId(eVar2.f46036b);
    }
}
