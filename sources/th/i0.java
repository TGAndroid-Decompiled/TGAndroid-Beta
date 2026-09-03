package th;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import hg.y1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k7.c6;
import oh.c7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ek;
import org.telegram.ui.nw0;
import org.telegram.ui.ry0;
import org.telegram.ui.rz;
import org.telegram.ui.sf1;
import org.telegram.ui.t10;
import org.telegram.ui.web.a2;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.l6;
public final class i0 extends h3 implements NotificationCenter.NotificationCenterDelegate, xd.b, n2 {
    public static final int S = 0;
    public final d20 B;
    public final t10 C;
    public final h61 D;
    public final nw0 E;
    public final nw0 F;
    public final lf.b0 G;
    public final lf.b0 H;
    public final View I;
    public final n0 J;
    public final boolean K;
    public final Utilities.Callback L;
    public final Paint M;
    public ArrayList N;
    public String O;
    public String P;
    public i0.b Q;
    public i0.b R;
    public final xd.a f48168b;
    public final xd.a f48169c;
    public final ek d;
    public final long f48170e;
    public TLRPC.Chat f48171f;
    public boolean h;
    public qh.d f48172n;
    public qh.d f48173r;
    public final p2 f48174s;
    public final d0 v;
    public final h0 f48175w;
    public final c0 f48176x;
    public final d20 f48177y;

    public i0(p2 p2Var, long j10) {
        this(p2Var, j10, null, null);
    }

    public static void A(i0 i0Var, ArrayList arrayList) {
        String formatPluralString;
        String str;
        boolean z4;
        ArrayList arrayList2;
        arrayList.add(h51.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(h51.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        h51 h51Var = new h51(39);
        h51Var.d = 101;
        h51Var.f27375l = string;
        h51Var.f27388z = 0;
        h51Var.K(i0Var.h);
        arrayList.add(h51Var);
        arrayList.add(h51.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        n0 n0Var = i0Var.J;
        boolean z10 = true;
        if (n0Var.f48210n && n0Var.f48208l == 1 && (arrayList2 = n0Var.f48206j) != null && arrayList2.size() == 1) {
            arrayList.add(h51.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            n0Var.c(arrayList);
            arrayList.add(h51.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = n0Var.f48208l;
            if (i11 > 0) {
                int i12 = n0Var.f48212p;
                int i13 = R.drawable.filled_requests_24;
                if (i11 == i12) {
                    formatPluralString = LocaleController.getString(R.string.CommunityPendingRequests);
                } else {
                    formatPluralString = LocaleController.formatPluralString("CommunityPendingRequestsRow", i11, new Object[0]);
                }
                if (i12 > 0) {
                    str = Integer.toString(i12);
                } else {
                    str = null;
                }
                int i14 = uh.h.f48858a;
                h51 J = h51.J(uh.h.class);
                J.d = 100;
                J.f27374k = i13;
                J.f27375l = formatPluralString;
                J.f27377n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f27380q = true;
                arrayList.add(J);
                arrayList.add(h51.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(i0Var.currentAccount).buildCommunityPeers(i0Var.f48170e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(h51.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                    i15++;
                    arrayList.add(k0.a(communityPeerDialog, i0Var));
                }
                z4 = true;
            } else {
                z4 = false;
            }
            if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
                if (z4) {
                    arrayList.add(h51.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(h51.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                    i16++;
                    arrayList.add(k0.a(communityPeerDialog2, i0Var));
                }
                z4 = true;
            }
            if (!buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
                if (z4) {
                    arrayList.add(h51.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(h51.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
                int size3 = arrayList5.size();
                int i17 = 0;
                while (i17 < size3) {
                    MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                    i17++;
                    arrayList.add(k0.a(communityPeerDialog3, i0Var));
                }
            } else {
                z10 = z4;
            }
            if (!buildCommunityPeers.chatsOther.isEmpty()) {
                if (z10) {
                    arrayList.add(h51.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(h51.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
                int size4 = arrayList6.size();
                while (i10 < size4) {
                    MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
                    i10++;
                    arrayList.add(k0.a(communityPeerDialog4, i0Var));
                }
            }
        }
    }

    public static ViewGroup M(i0 i0Var) {
        return i0Var.containerView;
    }

    public static void m(i0 i0Var, boolean z4, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                o0.f(new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), 2, z4);
                i0Var.d.D(0);
                return;
            }
            yh.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
            return;
        }
        o0.f(new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), 1, z4);
        i0Var.d.D(0);
    }

    public static void n(i0 i0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        i0Var.f48172n.setLoading(false);
        if (tL_error != null) {
            yh.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            i0Var.N = arrayList;
            if (arrayList.isEmpty()) {
                l.d.v(R.string.CommunityNoChatsToAdd, new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            i0Var.f48176x.d.V2.N(false);
            i0Var.d.D(2);
        }
    }

    public static void o(i0 i0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            yh.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void p(i0 i0Var, d2 d2Var, long j10, boolean z4, long j11) {
        d2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        i0Var.V(MessagesController.getInstance(i0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z4);
    }

    public static void q(i0 i0Var, boolean z4, boolean z10, long j10) {
        int i10;
        Context context = i0Var.getContext();
        g6 g6Var = i0Var.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z4) {
            i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z10) {
            i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        d2 P = z4.P(context, g6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new y1(i0Var, j10, 28));
        P.show();
        TextView textView = (TextView) P.d(-1);
        if (textView != null) {
            textView.setTextColor(k6.w0(null, k6.f21897q7, false));
        }
    }

    public static void x(i0 i0Var) {
        if (!ChatObject.canAddChatToCommunity(i0Var.f48171f)) {
            i0Var.dismiss();
            return;
        }
        qh.d dVar = i0Var.f48172n;
        if (dVar.K) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(i0Var.currentAccount).fetchChatsToAddToCommunity(new r(i0Var, 2));
    }

    public static void y(i0 i0Var, h51 h51Var, View view) {
        long j10;
        TLRPC.Chat chat;
        int i10;
        p2 p2Var = i0Var.f48174s;
        if (!i0Var.T(h51Var)) {
            int i11 = h51Var.d;
            boolean z4 = false;
            if (i11 == 101) {
                i0Var.h = !i0Var.h;
                MessagesController.getInstance(i0Var.currentAccount).toggleCommunityCollapsedInDialogs(i0Var.f48170e, i0Var.h);
                if (view instanceof r8) {
                    ((r8) view).getCheckBox().c(i0Var.h, true);
                } else {
                    i0Var.v.d.V2.N(false);
                }
            } else if (i11 == 100) {
                i0Var.d.D(1);
                i0Var.J.e();
            } else {
                Object obj = h51Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z4 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f20845id;
                } else if (obj instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) obj).f20992id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = o0.b(i0Var.currentAccount, j10);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        j80 j80Var = new j80(i0Var.getContext(), chat2, null, i0Var.f48174s, i0Var.resourcesProvider);
                        j80Var.f28067n = new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider);
                        j80Var.show();
                        return;
                    } else if (b10 == 4) {
                        qc qcVar = new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z4) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        l.d.v(i10, qcVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (p2Var instanceof xn) {
                    xn xnVar = (xn) p2Var;
                    TLRPC.Chat chat3 = xnVar.f43143e;
                    TLRPC.User i13 = xnVar.i();
                    if ((chat3 != null && chat3.f20845id == (-j10)) || (i13 != null && i13.f20992id == j10)) {
                        i0Var.dismiss();
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                if (ChatObject.isForum(chat2)) {
                    if (ChatObject.areTabsEnabled(chat2)) {
                        xn xnVar2 = new xn(bundle);
                        bg.e.a(xnVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(i0Var.currentAccount).getForumLastTopicId(chat2.f20845id)));
                        p2Var.presentFragment(xnVar2);
                    } else {
                        p2Var.presentFragment(new sf1(bundle));
                    }
                } else {
                    p2Var.presentFragment(new xn(bundle));
                }
                i0Var.dismiss();
            }
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        if (i10 == 1) {
            float b10 = lf.l0.b(f10);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            d0 d0Var = this.v;
            d0Var.f48150a.setAlpha(b10);
            d0Var.f48150a.setScaleX(lerp);
            d0Var.f48150a.setScaleY(lerp);
            org.telegram.ui.ActionBar.k kVar = d0Var.f48150a;
            int i21 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            kVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            d20 d20Var = this.f48177y;
            d20Var.setAlpha(f10);
            d20Var.setScaleX(lerp2);
            d20Var.setScaleY(lerp2);
            int i22 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            d20Var.setVisibility(i16);
            d0Var.d.setAlpha(b10);
            h61 h61Var = d0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            h61Var.setVisibility(i17);
            this.f48172n.setAlpha(b10);
            this.f48172n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.f48172n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            qh.d dVar = this.f48172n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            t10 t10Var = this.C;
            t10Var.setAlpha(f10);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            t10Var.setVisibility(i19);
            this.containerView.invalidate();
            this.E.invalidate();
        }
        if (i10 == 2) {
            float b11 = lf.l0.b(f10);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            c0 c0Var = this.f48176x;
            c0Var.f48150a.setAlpha(b11);
            c0Var.f48150a.setScaleX(lerp3);
            c0Var.f48150a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.k kVar2 = c0Var.f48150a;
            int i23 = (b11 > 0.0f ? 1 : (b11 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            kVar2.setVisibility(i11);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            d20 d20Var2 = this.B;
            d20Var2.setAlpha(f10);
            d20Var2.setScaleX(lerp4);
            d20Var2.setScaleY(lerp4);
            int i24 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            d20Var2.setVisibility(i12);
            c0Var.d.setAlpha(b11);
            h61 h61Var2 = c0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            h61Var2.setVisibility(i13);
            if (!this.K) {
                this.f48173r.setAlpha(b11);
                this.f48173r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.f48173r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                qh.d dVar2 = this.f48173r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            h61 h61Var3 = this.D;
            h61Var3.setAlpha(f10);
            if (i24 > 0) {
                i20 = 0;
            }
            h61Var3.setVisibility(i20);
            this.containerView.invalidate();
            this.F.invalidate();
        }
    }

    public final boolean T(h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof uh.e) {
            uh.e eVar = (uh.e) obj;
            long j10 = eVar.f48843a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            p2 p2Var = this.f48174s;
            if (user != null) {
                p2Var.presentFragment(xn.R9(user.f20992id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new vh.b(getContext(), chat, new l6(20, this, eVar)).show();
                return true;
            } else {
                p2Var.presentFragment(xn.R9(-chat.f20845id));
                return true;
            }
        }
        return false;
    }

    public final void U(ArrayList arrayList, boolean z4) {
        String str;
        String str2;
        int i10 = 0;
        if (!z4) {
            arrayList.add(h51.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(h51.D(0, AndroidUtilities.dp(56.0f)));
        }
        if (this.N != null) {
            if (z4 && (str2 = this.P) != null) {
                str = str2.toLowerCase();
            } else {
                str = null;
            }
            ArrayList arrayList2 = this.N;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (z4 && !TextUtils.isEmpty(str)) {
                    String str3 = chat.title;
                    if (str3 != null && str3.toLowerCase().contains(str)) {
                        arrayList.add(h51.v(chat));
                    }
                } else {
                    arrayList.add(h51.v(chat));
                }
            }
        }
    }

    public final void V(TLRPC.Chat chat, long j10, boolean z4) {
        long j11 = -chat.f20845id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            d2 d2Var = new d2(getContext(), 3, null);
            d2Var.q(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, d2Var, j10, z4, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z4, new ry0(isChannelAndNotMegaGroup, this, 2));
    }

    public final void W(h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.K) {
                this.L.run(chat);
                dismiss();
                return;
            }
            new vh.a(getContext(), this.f48171f, -chat.f20845id, new a2(15, this, chat)).show();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f48168b.f50542f && !this.f48169c.f50542f) {
            View currentView = this.d.getCurrentView();
            if (currentView instanceof f0) {
                return ((f0) currentView).f48153e;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void d(r2 r2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (r2Var.getMessage() != null && (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, r2Var.getMessage().messageOwner, true))) != null) {
            bg.e.m(this.f48174s, -r2Var.getDialogId(), findTopic, 0);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.f48170e;
        d0 d0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f20846id == j10) {
                d0Var.d.V2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
                this.f48171f = chat;
                d0Var.f48150a.setTitle(DialogObject.getName(chat));
                d0Var.h.e(this.f48171f, d0Var.f48143n);
            }
        }
    }

    @Override
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    @Override
    public final void e(r2 r2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(r2Var.getDialogId())) {
            p2 p2Var = this.f48174s;
            p2Var.getOrCreateStoryViewer().getClass();
            p2Var.getOrCreateStoryViewer().D(p2Var.getContext(), r2Var.getDialogId(), c7.a((sl0) r2Var.getParent()));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                xd.a aVar = this.f48169c;
                if (aVar.f50542f) {
                    this.f48176x.d.U2.h1(1, this.R.f7758b);
                    aVar.a(false, true);
                    setAllowNestedScroll(true);
                    d20 d20Var = this.B;
                    AndroidUtilities.hideKeyboard(d20Var.f26132r);
                    d20Var.f26132r.clearFocus();
                    return;
                }
            }
            this.d.D(0);
            return;
        }
        super.onBackPressed();
    }

    public i0(p2 p2Var, long j10, ArrayList arrayList, eg.h3 h3Var) {
        super(p2Var.getContext(), p2Var.getResourceProvider(), true, true);
        pr prVar = pr.h;
        this.f48168b = new xd.a(1, this, prVar, 350L, false);
        this.f48169c = new xd.a(2, this, prVar, 350L, false);
        this.G = new lf.b0(2);
        this.H = new lf.b0(8);
        Paint paint = new Paint(1);
        this.M = paint;
        i0.b bVar = i0.b.f7756e;
        this.Q = bVar;
        this.R = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f48174s = p2Var;
        this.K = arrayList != null;
        this.N = arrayList;
        this.L = h3Var;
        Context context = p2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = k6.f21607a7;
        paint.setColor(k6.v0(i10, this.resourcesProvider));
        fixNavigationBar(k6.v0(i10, this.resourcesProvider));
        this.containerView = new rz(this, context);
        ek ekVar = new ek(this, context, 8);
        this.d = ekVar;
        int i11 = this.backgroundPaddingLeft;
        ekVar.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, c6.e(-1, -1, 119));
        this.E = new nw0(this, context, 9);
        this.F = new nw0(this, context, 9);
        d20 d20Var = new d20(context, this.resourcesProvider);
        this.f48177y = d20Var;
        d20Var.setCloseButtonVisible(true);
        d20Var.f26135x = true;
        d20Var.e();
        String string = LocaleController.getString(R.string.Search);
        lg.f fVar = d20Var.f26132r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new u(this));
        d20Var.setVisibility(8);
        d20 d20Var2 = new d20(context, this.resourcesProvider);
        this.B = d20Var2;
        d20Var2.setCloseButtonVisible(true);
        d20Var2.f26135x = true;
        d20Var2.e();
        String string2 = LocaleController.getString(R.string.Search);
        lg.f fVar2 = d20Var2.f26132r;
        fVar2.setHint(string2);
        fVar2.addTextChangedListener(new v(this));
        d20Var2.setVisibility(8);
        h61 h61Var = new h61(context, this.currentAccount, 0, false, new r(this, 0), new s(this, 0), null, this.resourcesProvider);
        this.D = h61Var;
        h61Var.j(new w(this));
        h61Var.setClipToPadding(false);
        h61Var.setVisibility(8);
        h61Var.o1();
        h61Var.V2.f32651r = false;
        h61Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        t10 t10Var = new t10(p2Var);
        this.C = t10Var;
        t10Var.setVisibility(8);
        t10Var.setBackground(null);
        t10Var.setChatPreviewDelegate(new Object());
        t10Var.setUiCallback(new y(this));
        t10Var.f41357b.setClipToPadding(false);
        this.I = new View(getContext());
        Context context2 = getContext();
        g6 g6Var = this.resourcesProvider;
        n0 n0Var = new n0(context2, g6Var, new qc((FrameLayout) this.containerView, g6Var), this.currentAccount, j10);
        this.J = n0Var;
        n0Var.h = new z(this, p2Var);
        this.f48170e = j10;
        this.f48171f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f48171f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        uf.e0 e0Var = new uf.e0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        e0Var.f48586f = this.f48171f;
        e0Var.h = false;
        ArrayList arrayList2 = d20Var.C;
        arrayList2.add(e0Var);
        d20Var.F = arrayList2.size() - 1;
        d20Var.f();
        setBackgroundColor(k6.v0(i10, this.resourcesProvider));
        this.f48175w = new h0(this, context);
        this.v = new d0(this, context);
        this.f48176x = new c0(this, context);
        this.d.setAdapter(new a0(this));
        d20Var.setCloseButtonOnClickListener(new t(this, 0));
        d20Var2.setCloseButtonOnClickListener(new t(this, 1));
        n0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        ic.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        s sVar = new s(this, 1);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.b0.j(viewGroup, sVar);
    }

    @Override
    public final void c() {
    }

    @Override
    public final void a(r2 r2Var) {
    }

    @Override
    public final void f(r2 r2Var) {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
