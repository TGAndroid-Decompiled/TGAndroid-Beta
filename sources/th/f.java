package th;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import f2.w0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.j21;
public final class f extends h51 {
    public static final int f45008a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        int i10;
        g gVar = (g) view;
        e eVar = (e) i51Var.G;
        TLRPC.User user = eVar.f45006b;
        long j10 = eVar.f45005a;
        boolean z10 = eVar.f45007c;
        boolean z11 = !i51Var.f25583j;
        p9 p9Var = gVar.f45011c;
        TextView textView = gVar.f45013n;
        TextView textView2 = gVar.d;
        gVar.f45017x = (d) i51Var.H;
        gVar.f45018y = j10;
        gVar.B = user.f19306id;
        int i11 = gVar.f45010b;
        TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
        TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
        gVar.f45012f.setText(DialogObject.getName(j10));
        TextView textView3 = gVar.h;
        if (user2 != null) {
            i10 = R.string.CommunityPendingRequestSuggestedBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
            i10 = R.string.CommunityPendingRequestSuggestedChannel;
        } else {
            i10 = R.string.CommunityPendingRequestSuggestedGroup;
        }
        textView3.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(i10, DialogObject.getShortName(user)), j6.w0(null, j6.il, false), new j21(17)));
        if (user2 != null) {
            textView2.setVisibility(8);
        } else if (chat != null && chat.participants_count > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("* ");
            spannableStringBuilder.setSpan(gVar.f45014r, 0, 1, 33);
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
        gVar.f45016w = z11;
        if (user2 != null) {
            p9Var.e(user2, new z8(0, user2));
        } else {
            p9Var.e(chat, new z8(chat));
        }
        gVar.e.e(user, new z8(0, user));
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        g gVar = new g(context, i10, f6Var);
        gVar.setLayoutParams(new w0(-1, -2));
        gVar.setClickable(false);
        return gVar;
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        e eVar = (e) i51Var.G;
        e eVar2 = (e) i51Var2.G;
        if (eVar.f45005a == eVar2.f45005a && DialogObject.getDialogId(eVar.f45006b) == DialogObject.getDialogId(eVar2.f45006b)) {
            return true;
        }
        return false;
    }
}
