package th;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.web.a2;
import org.telegram.ui.web.d1;
import org.telegram.ui.yh;
public final class g extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public long f48155a;
    public TLRPC.Chat f48156b;
    public TLRPC.User f48157c;
    public FrameLayout d;
    public h61 f48158e;
    public f f48159f;
    public ArrayList h;
    public NotificationCenter.ObserversGroup f48160n;

    public static void U(g gVar, h51 h51Var) {
        g gVar2;
        if (h51Var.d == 1) {
            gVar2 = gVar;
            z4.R(gVar.getParentActivity(), gVar2, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), gVar.resourceProvider, new c(gVar));
        } else {
            gVar2 = gVar;
        }
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            gVar2.getMessagesController().getChat(Long.valueOf(-gVar2.f48155a));
            gVar2.showDialog(new vh.a(gVar2.getParentActivity(), chat, gVar2.f48155a, new a2(13, gVar2, chat)));
        }
    }

    public final void V(String str, boolean z4) {
        if (!ChatObject.isChannel(this.f48156b) && this.f48157c == null) {
            d2 d2Var = new d2(getParentActivity(), 3, null);
            d2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f48155a, this, new o9.b(this, d2Var, str, z4, 5));
            return;
        }
        getMessagesController().createCommunity(str, this.f48155a, z4, new b(this, 1));
    }

    public final void W(long j10, boolean z4) {
        if (!ChatObject.isChannel(this.f48156b) && this.f48157c == null) {
            d2 d2Var = new d2(getParentActivity(), 3, null);
            d2Var.q(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.f48155a, this, new d(this, d2Var, j10, z4, 0));
            return;
        }
        int i10 = this.currentAccount;
        long j11 = -this.f48155a;
        MessagesController.getInstance(i10).linkCommunity(-j11, j10, z4, new lh.l(this, j11, 3));
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
        tg.c cVar = new tg.c();
        cVar.a(getThemedColor(k6.f21661d6));
        og.a aVar = new og.a(cVar);
        this.actionBar.setBackground(null);
        this.actionBar.M(aVar, sg.b.o(this.resourceProvider), false);
        this.actionBar.M0 = true;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21607a7, false));
        f fVar = new f(context, this.resourceProvider);
        this.f48159f = fVar;
        fVar.setTitle(LocaleController.getString(R.string.CommunityTitle));
        f fVar2 = this.f48159f;
        if (this.f48157c != null) {
            i10 = R.string.CommunityDescriptionBot;
        } else if (ChatObject.isChannelAndNotMegaGroup(this.f48156b)) {
            i10 = R.string.CommunityDescriptionChannel;
        } else {
            i10 = R.string.CommunityDescriptionGroup;
        }
        fVar2.setSubtitle(LocaleController.getString(i10));
        this.f48159f.setTag(-33024);
        TLRPC.User user = this.f48157c;
        if (user != null) {
            this.f48159f.f48147a.e(user, new z8(0, this.f48157c));
        } else {
            TLRPC.Chat chat = this.f48156b;
            if (chat != null) {
                this.f48159f.f48147a.e(chat, new z8(this.f48156b));
            }
        }
        h61 h61Var = new h61(this, new b(this, 0), new c(this), new c(this));
        this.f48158e = h61Var;
        h61Var.setClipToPadding(false);
        h61 h61Var2 = this.f48158e;
        h61Var2.V2.f32651r = false;
        h61Var2.o1();
        this.d.addView(this.f48158e, c6.c(-1.0f, -1));
        this.d.addView(this.actionBar, c6.e(-1, -2, 48));
        FrameLayout frameLayout2 = this.d;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f20846id;
            View x12 = this.f48158e.x1((int) (j10 ^ (j10 >>> 32)));
            if (x12 instanceof h6) {
                h6 h6Var = (h6) x12;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                if (arrayList != null) {
                    i12 = arrayList.size();
                } else {
                    i12 = 0;
                }
                h6Var.setSubLabel(LocaleController.formatPluralString("Chats", i12, new Object[0]));
                return;
            }
            this.f48158e.V2.N(false);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f48155a = this.arguments.getLong("dialog_id", 0L);
        this.f48156b = getMessagesController().getChat(Long.valueOf(-this.f48155a));
        this.f48157c = getMessagesController().getUser(Long.valueOf(this.f48155a));
        this.h = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new d1(this, 14), this.classGuid);
        this.f48160n = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.f48160n;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f48160n = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        this.f48158e.setPadding(0, i11, 0, i13);
    }
}
