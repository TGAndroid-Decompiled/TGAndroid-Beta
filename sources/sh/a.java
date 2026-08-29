package sh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bg.o;
import f2.x0;
import nh.d;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.mp0;
public final class a extends xa {
    public k51 T;
    public boolean U;
    public final FrameLayout V;
    public final boolean W;
    public final boolean X;
    public int Y;

    public a(Context context, TLRPC.Chat chat, long j10, Utilities.Callback callback) {
        super(context, null, false, true, false, false, false, 2, null);
        int i10;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.X = UserObject.isBot(user);
        this.W = ChatObject.isChannelAndNotMegaGroup(chat2);
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.f34660e.setTitle(y());
        setBackgroundColor(g6.v0(g6.f23009a7, this.resourcesProvider));
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f));
        frameLayout.setLayoutParams(new x0(-1, -2));
        f6 f6Var = new f6(context, null);
        if (chat2 != null) {
            f6Var.t(chat2, null, chat2.title, LocaleController.formatPluralStringSpaced("Members", chat2.participants_count), false, false);
        } else if (user != null) {
            f6Var.t(user, null, DialogObject.getName(user), LocaleController.getString(R.string.Bot), false, false);
        }
        frameLayout.addView(f6Var, i7.f6.c(-2.0f, -1));
        jl0 jl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f) + AndroidUtilities.navigationBarHeight);
        this.d.p1();
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new o(this, 23));
        d dVar = new d(context, this.resourcesProvider, true);
        if (chat != null) {
            if (ChatObject.canAddChatToCommunity(chat)) {
                i10 = R.string.CommunityAddToCommunityButton;
            } else {
                i10 = R.string.CommunityAddToCommunityRequestButton;
            }
            dVar.setText(LocaleController.getString(i10));
        } else {
            dVar.setText(LocaleController.getString(R.string.CommunityCreateCommunity));
        }
        dVar.e();
        dVar.setOnClickListener(new ya0(this, callback, chat, 7));
        this.containerView.addView(dVar, i7.f6.f(48.0f, 80, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(12.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        this.T.N(false);
    }

    public final void P(Utilities.Callback callback, boolean z10, boolean z11) {
        int i10;
        if (z11 && !z10 && !this.X) {
            Context context = getContext();
            c6 c6Var = this.resourcesProvider;
            String string = LocaleController.getString(R.string.CommunityAddToCommunityTitle);
            if (this.W) {
                i10 = R.string.CommunityAddToCommunityChannelMessage;
            } else {
                i10 = R.string.CommunityAddToCommunityGroupMessage;
            }
            c5.P(context, c6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Add), new mp0(this, callback, z10, 11)).show();
            return;
        }
        callback.run(Boolean.valueOf(z10));
        dismiss();
    }

    public final void Q(boolean z10) {
        boolean z11;
        if (this.U != z10) {
            this.U = z10;
            jl0 jl0Var = this.d;
            View U0 = jl0Var.U0(this.Y + 1);
            if (U0 instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) U0).a(!z10);
                z11 = false;
            } else {
                z11 = true;
            }
            View U02 = jl0Var.U0(this.Y + 2);
            if (U02 instanceof org.telegram.ui.Cells.g6) {
                ((org.telegram.ui.Cells.g6) U02).a(z10);
            } else {
                z11 = true;
            }
            if (z11) {
                this.T.N(true);
            }
        }
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, false, new t4(this, 25), this.resourcesProvider);
        this.T = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        int i10;
        if (this.X) {
            i10 = R.string.CommunityAddBotTitle;
        } else {
            i10 = R.string.CommunityAddChatTitle;
        }
        return LocaleController.getString(i10);
    }
}
