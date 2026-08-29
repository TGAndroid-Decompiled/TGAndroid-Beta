package sh;

import ag.v;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import i7.f6;
import mh.n;
import nh.d;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.xa;
import org.telegram.ui.web.c;
public final class b extends xa {
    public final v T;
    public k51 U;

    public b(Context context, TLRPC.Chat chat, Runnable runnable) {
        super(context, null, false, true, false, false, false, 2, null);
        int i10;
        int i11;
        this.G = AndroidUtilities.dp(30.0f);
        jl0 jl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(130.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        d dVar = new d(context, this.resourcesProvider, true);
        dVar.setText(LocaleController.getString(R.string.Cancel));
        dVar.d();
        dVar.e();
        dVar.setOnClickListener(new n(this, 25));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        d dVar2 = new d(context, this.resourcesProvider, true);
        if (isChannelAndNotMegaGroup) {
            i10 = R.string.CommunityInviteOnlyChannelMessageOwner;
        } else {
            i10 = R.string.CommunityInviteOnlyGroupMessageOwner;
        }
        dVar2.setText(LocaleController.getString(i10));
        dVar2.e();
        dVar2.setOnClickListener(new c(6, this, runnable));
        v vVar = new v(context, 5);
        TextView textView = (TextView) vVar.d;
        TextView textView2 = (TextView) vVar.f681c;
        this.T = vVar;
        vVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(17.0f));
        ((t9) vVar.f680b).e(chat, new e9(chat));
        textView2.setText(DialogObject.getName(chat));
        int i13 = g6.G6;
        textView2.setTextColor(getThemedColor(i13));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new iq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        if (isChannelAndNotMegaGroup) {
            i11 = R.string.CommunityInviteOnlyChannelInfo;
        } else {
            i11 = R.string.CommunityInviteOnlyGroupInfo;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i11));
        textView.setTextColor(getThemedColor(i13));
        textView.setText(spannableStringBuilder);
        this.containerView.addView(dVar2, f6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(70.0f) + AndroidUtilities.navigationBarHeight));
        this.containerView.addView(dVar, f6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.U.N(false);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new t4(this, 26), this.resourcesProvider);
        this.U = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
