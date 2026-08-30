package sh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.web.u1;
import org.telegram.ui.web.y0;
import org.telegram.ui.yh;
public final class g extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public long f44339a;
    public TLRPC.Chat f44340b;
    public TLRPC.User f44341c;
    public FrameLayout d;
    public g61 e;
    public f f44342f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup f44343n;

    public static void U(g gVar, i51 i51Var) {
        g gVar2;
        if (i51Var.d == 1) {
            gVar2 = gVar;
            z4.R(gVar.getParentActivity(), gVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), gVar.resourceProvider, new c(gVar));
        } else {
            gVar2 = gVar;
        }
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            gVar2.getMessagesController().getChat(Long.valueOf(-gVar2.f44339a));
            gVar2.showDialog(new uh.a(gVar2.getParentActivity(), chat, gVar2.f44339a, new u1(14, gVar2, chat)));
        }
    }

    public final void V(String str, boolean z4) {
        if (!ChatObject.isChannel(this.f44340b) && this.f44341c == null) {
            d2 d2Var = new d2(getParentActivity(), 3, null);
            d2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f44339a, this, new o9.b(this, d2Var, str, z4, 5));
            return;
        }
        getMessagesController().createCommunity(str, this.f44339a, z4, new b(this, 1));
    }

    public final void W(long j10, boolean z4) {
        if (!ChatObject.isChannel(this.f44340b) && this.f44341c == null) {
            d2 d2Var = new d2(getParentActivity(), 3, null);
            d2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f44339a, this, new d(this, d2Var, j10, z4, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j11 = -this.f44339a;
        MessagesController.getInstance(i10).linkCommunity(-j11, j10, z4, new kh.l(this, j11, 3));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setAllowOverlayTitle(false);
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 0));
        sg.c cVar = new sg.c();
        cVar.a(getThemedColor(j6.f19906d6));
        ng.a aVar = new ng.a(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(aVar, rg.b.n(this.resourceProvider), false);
        this.actionBar.M0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(j6.w0(null, j6.f19852a7, false));
        f fVar = new f(context, this.resourceProvider);
        this.f44342f = fVar;
        fVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        f fVar2 = this.f44342f;
        if (this.f44341c != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f44340b)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        fVar2.setSubtitle(LocaleController.getString(i10));
        this.f44342f.setTag(-33024);
        TLRPC.User user = this.f44341c;
        if (user != null) {
            this.f44342f.f44332a.e(user, new z8(0, this.f44341c));
        } else {
            TLRPC.Chat chat = this.f44340b;
            if (chat != null) {
                this.f44342f.f44332a.e(chat, new z8(this.f44340b));
            }
        }
        g61 g61Var = new g61(this, new b(this, 0), new c(this), new c(this));
        this.e = g61Var;
        g61Var.setClipToPadding(false);
        g61 g61Var2 = this.e;
        g61Var2.V2.f30240r = false;
        g61Var2.p1();
        this.d.addView(this.e, b6.c(-1.0f, -1));
        this.d.addView(this.actionBar, b6.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f19185id;
            View y12 = this.e.y1((int) (j10 ^ (j10 >>> 32)));
            if (y12 instanceof h6) {
                h6 h6Var = (h6) y12;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i12 = arrayList.size();
                } else {
                    i12 = 0;
                }
                h6Var.setSubLabel(LocaleController.formatPluralString("Chats", i12, new Object[0]));
                return;
            }
            this.e.V2.N(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f44339a = this.arguments.getLong("dialog_id", 0L);
        this.f44340b = getMessagesController().getChat(Long.valueOf(-this.f44339a));
        this.f44341c = getMessagesController().getUser(Long.valueOf(this.f44339a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new y0(this, 14), this.classGuid);
        this.f44343n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f44343n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f44343n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.e.setPadding(0, i11, 0, i13);
    }
}
