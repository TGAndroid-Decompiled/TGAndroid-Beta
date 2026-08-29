package rh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
import org.telegram.ui.ef0;
public final class f extends v41 {
    public static final int f47442a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        int i10;
        g gVar = (g) view;
        e eVar = (e) w41Var.G;
        TLRPC.User user = eVar.f47440b;
        long j10 = eVar.f47439a;
        boolean z11 = eVar.f47441c;
        boolean z12 = !w41Var.f34298j;
        t9 t9Var = gVar.f47445c;
        TextView textView = gVar.f47448n;
        TextView textView2 = gVar.d;
        gVar.f47452x = (d) w41Var.H;
        gVar.f47453y = j10;
        gVar.A = user.f22539id;
        int i11 = gVar.f47444b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        gVar.f47447f.setText(DialogObject.getName(j10));
        TextView textView3 = gVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), g6.w0(null, g6.il, false), new ef0(17)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(gVar.f47449r, 0, 1, 33);
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
        gVar.f47451w = z12;
        if (user2 != null) {
            t9Var.e(user2, new e9(0, user2));
        } else {
            t9Var.e(chat, new e9(chat));
        }
        gVar.f47446e.e(user, new e9(0, user));
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        g gVar = new g(context, i10, c6Var);
        gVar.setLayoutParams(new x0(-1, -2));
        gVar.setClickable(false);
        return gVar;
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        e eVar = (e) w41Var.G;
        e eVar2 = (e) w41Var2.G;
        if (eVar.f47439a == eVar2.f47439a && DialogObject.getDialogId(eVar.f47440b) == DialogObject.getDialogId(eVar2.f47440b)) {
            return true;
        }
        return false;
    }
}
