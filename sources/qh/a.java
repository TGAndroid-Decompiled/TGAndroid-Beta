package qh;

import ag.p0;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import f2.y0;
import h7.z5;
import lh.a8;
import lh.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.op0;

public final class a extends qa {
    public b51 T;
    public boolean U;
    public final FrameLayout V;
    public final boolean W;
    public final boolean X;
    public int Y;

    public a(Context context, TLRPC.Chat chat, long j10, Utilities.Callback callback) {
        super(context, null, false, true, false, false, false, 2, null);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.X = UserObject.isBot(user);
        this.W = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.f31853e.setTitle(z());
        setBackgroundColor(g6.v0(g6.f22999a7, this.resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new y0(-1, -2));
        e6 e6Var = new e6(context, null);
        if (chat2 != null) {
            e6Var.u(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else if (user != null) {
            e6Var.u(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
        }
        frameLayout.addView(e6Var, z5.c(-2.0f, -1));
        zk0 zk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.d.p1();
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new p0(this, 21));
        d dVar = new d(context, this.resourcesProvider, true);
        if (chat != null) {
            dVar.setText(LocaleController.getString(ChatObject.canAddChatToCommunity(chat) ? R.string.CommunityAddToCommunityButton : R.string.CommunityAddToCommunityRequestButton));
        } else {
            dVar.setText(LocaleController.getString(R.string.CommunityCreateCommunity));
        }
        dVar.e();
        dVar.setOnClickListener(new ld0(this, callback, chat, 6));
        this.containerView.addView(dVar, z5.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.T.N(false);
    }

    public final void P(Utilities.Callback callback, boolean z10, boolean z11) {
        if (z11 && !z10 && !this.X) {
            y4.P(getContext(), this.resourcesProvider, LocaleController.getString(R.string.CommunityAddToCommunityTitle), LocaleController.getString(this.W ? R.string.CommunityAddToCommunityChannelMessage : R.string.CommunityAddToCommunityGroupMessage), LocaleController.getString(R.string.Add), new op0(this, callback, z10, 11)).show();
        } else {
            callback.run(Boolean.valueOf(z10));
            dismiss();
        }
    }

    public final void Q(boolean z10) {
        boolean z11;
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        int i10 = this.Y + 1;
        zk0 zk0Var = this.d;
        View viewU0 = zk0Var.U0(i10);
        if (viewU0 instanceof f6) {
            ((f6) viewU0).a(!z10);
            z11 = false;
        } else {
            z11 = true;
        }
        View viewU1 = zk0Var.U0(this.Y + 2);
        if (viewU1 instanceof f6) {
            ((f6) viewU1).a(z10);
        } else {
            z11 = true;
        }
        if (z11) {
            this.T.N(true);
        }
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.currentAccount, 0, false, new a8(this, 24), this.resourcesProvider);
        this.T = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(this.X ? R.string.CommunityAddBotTitle : R.string.CommunityAddChatTitle);
    }
}
