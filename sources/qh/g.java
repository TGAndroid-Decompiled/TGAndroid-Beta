package qh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.th;
import org.telegram.ui.yu0;
public final class g extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public long f46700a;
    public TLRPC.Chat f46701b;
    public TLRPC.User f46702c;
    public FrameLayout d;
    public u51 f46703e;
    public f f46704f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup f46705n;

    public static void U(g gVar, w41 w41Var) {
        g gVar2;
        if (w41Var.d == 1) {
            gVar2 = gVar;
            c5.R(gVar.getParentActivity(), gVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), gVar.resourceProvider, new c(gVar));
        } else {
            gVar2 = gVar;
        }
        Object obj = w41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            gVar2.getMessagesController().getChat(Long.valueOf(-gVar2.f46700a));
            gVar2.showDialog(new sh.a(gVar2.getParentActivity(), chat, gVar2.f46700a, new yu0(14, gVar2, chat)));
        }
    }

    public final void V(String str, boolean z10) {
        if (!ChatObject.isChannel(this.f46701b) && this.f46702c == null) {
            c2 c2Var = new c2(getParentActivity(), 3, null);
            c2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f46700a, this, new m9.b(this, c2Var, str, z10, 5));
            return;
        }
        getMessagesController().createCommunity(str, this.f46700a, z10, new b(this, 1));
    }

    public final void W(long j10, boolean z10) {
        if (!ChatObject.isChannel(this.f46701b) && this.f46702c == null) {
            c2 c2Var = new c2(getParentActivity(), 3, null);
            c2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f46700a, this, new d(this, c2Var, j10, z10, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j11 = -this.f46700a;
        MessagesController.getInstance(i10).linkCommunity(-j11, j10, z10, new ih.m(this, j11, 3));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 0));
        qg.c cVar = new qg.c();
        cVar.a(getThemedColor(g6.f23062d6));
        lg.a aVar = new lg.a(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.L(aVar, pg.a.n(this.resourceProvider), false);
        this.actionBar.L0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(g6.w0(null, g6.f23009a7, false));
        f fVar = new f(context, this.resourceProvider);
        this.f46704f = fVar;
        fVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        f fVar2 = this.f46704f;
        if (this.f46702c != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f46701b)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        fVar2.setSubtitle(LocaleController.getString(i10));
        this.f46704f.setTag(-33024);
        TLRPC.User user = this.f46702c;
        if (user != null) {
            this.f46704f.f46692a.e(user, new e9(0, this.f46702c));
        } else {
            TLRPC.Chat chat = this.f46701b;
            if (chat != null) {
                this.f46704f.f46692a.e(chat, new e9(this.f46701b));
            }
        }
        u51 u51Var = new u51(this, new b(this, 0), new c(this), new c(this));
        this.f46703e = u51Var;
        u51Var.setClipToPadding(false);
        u51 u51Var2 = this.f46703e;
        u51Var2.U2.f29939r = false;
        u51Var2.p1();
        this.d.addView(this.f46703e, f6.c(-1.0f, -1));
        this.d.addView(this.actionBar, f6.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f22393id;
            View y12 = this.f46703e.y1((int) (j10 ^ (j10 >>> 32)));
            if (y12 instanceof org.telegram.ui.Cells.f6) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) y12;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i12 = arrayList.size();
                } else {
                    i12 = 0;
                }
                f6Var.setSubLabel(LocaleController.formatPluralString("Chats", i12, new Object[0]));
                return;
            }
            this.f46703e.U2.N(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f46700a = this.arguments.getLong("dialog_id", 0L);
        this.f46701b = getMessagesController().getChat(Long.valueOf(-this.f46700a));
        this.f46702c = getMessagesController().getUser(Long.valueOf(this.f46700a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new nh.b0(this, 14), this.classGuid);
        this.f46705n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f46705n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f46705n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.f46703e.setPadding(0, i11, 0, i13);
    }
}
