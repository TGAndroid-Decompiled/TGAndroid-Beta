package sh;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import dg.j3;
import gg.y1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k7.b6;
import nh.c7;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ai;
import org.telegram.ui.gk;
import org.telegram.ui.nw0;
import org.telegram.ui.ry0;
import org.telegram.ui.sf1;
import org.telegram.ui.sz;
import org.telegram.ui.u10;
import org.telegram.ui.zn;
import ph.e6;
import ph.s1;
public final class i0 extends g3 implements NotificationCenter.NotificationCenterDelegate, xd.b, m2 {
    public static final int S = 0;
    public final d20 B;
    public final u10 C;
    public final g61 D;
    public final nw0 E;
    public final nw0 F;
    public final kf.b0 G;
    public final kf.b0 H;
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
    public final xd.a f44416b;
    public final xd.a f44417c;
    public final gk d;
    public final long e;
    public TLRPC.Chat f44418f;
    public boolean h;
    public ph.d f44419n;
    public ph.d f44420r;
    public final p2 f44421s;
    public final d0 v;
    public final h0 f44422w;
    public final c0 f44423x;
    public final d20 f44424y;

    public i0(p2 p2Var, long j10) {
        this(p2Var, j10, null, null);
    }

    public static void A(i0 i0Var, ArrayList arrayList) {
        String formatPluralString;
        String str;
        boolean z4;
        ArrayList arrayList2;
        arrayList.add(i51.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(i51.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        i51 i51Var = new i51(39);
        i51Var.d = 101;
        i51Var.f25585l = string;
        i51Var.f25598z = 0;
        i51Var.K(i0Var.h);
        arrayList.add(i51Var);
        arrayList.add(i51.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        n0 n0Var = i0Var.J;
        boolean z10 = true;
        if (n0Var.f44455n && n0Var.f44453l == 1 && (arrayList2 = n0Var.f44451j) != null && arrayList2.size() == 1) {
            arrayList.add(i51.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            n0Var.c(arrayList);
            arrayList.add(i51.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = n0Var.f44453l;
            if (i11 > 0) {
                int i12 = n0Var.f44457p;
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
                int i14 = th.h.f45019a;
                i51 J = i51.J(th.h.class);
                J.d = 100;
                J.f25584k = i13;
                J.f25585l = formatPluralString;
                J.f25587n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f25590q = true;
                arrayList.add(J);
                arrayList.add(i51.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(i0Var.currentAccount).buildCommunityPeers(i0Var.e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(i51.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
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
                    arrayList.add(i51.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(i51.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
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
                    arrayList.add(i51.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(i51.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
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
                    arrayList.add(i51.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(i51.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
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
            ai.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
            return;
        }
        o0.f(new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), 1, z4);
        i0Var.d.D(0);
    }

    public static void n(i0 i0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        i0Var.f44419n.setLoading(false);
        if (tL_error != null) {
            ai.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            i0Var.N = arrayList;
            if (arrayList.isEmpty()) {
                kf.k0.v(R.string.CommunityNoChatsToAdd, new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            i0Var.f44423x.d.V2.N(false);
            i0Var.d.D(2);
        }
    }

    public static void o(i0 i0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            ai.u((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
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
        f6 f6Var = i0Var.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z4) {
            i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z10) {
            i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        d2 P = z4.P(context, f6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new y1(i0Var, j10, 28));
        P.show();
        TextView textView = (TextView) P.d(-1);
        if (textView != null) {
            textView.setTextColor(j6.w0(null, j6.f20116q7, false));
        }
    }

    public static void x(i0 i0Var) {
        if (!ChatObject.canAddChatToCommunity(i0Var.f44418f)) {
            i0Var.dismiss();
            return;
        }
        ph.d dVar = i0Var.f44419n;
        if (dVar.K) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(i0Var.currentAccount).fetchChatsToAddToCommunity(new r(i0Var, 2));
    }

    public static void y(i0 i0Var, i51 i51Var, View view) {
        long j10;
        TLRPC.Chat chat;
        int i10;
        p2 p2Var = i0Var.f44421s;
        if (!i0Var.T(i51Var)) {
            int i11 = i51Var.d;
            boolean z4 = false;
            if (i11 == 101) {
                i0Var.h = !i0Var.h;
                MessagesController.getInstance(i0Var.currentAccount).toggleCommunityCollapsedInDialogs(i0Var.e, i0Var.h);
                if (view instanceof q8) {
                    ((q8) view).getCheckBox().c(i0Var.h, true);
                } else {
                    i0Var.v.d.V2.N(false);
                }
            } else if (i11 == 100) {
                i0Var.d.D(1);
                i0Var.J.e();
            } else {
                Object obj = i51Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z4 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f19159id;
                } else if (obj instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) obj).f19306id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = o0.b(i0Var.currentAccount, j10);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        i80 i80Var = new i80(i0Var.getContext(), chat2, null, i0Var.f44421s, i0Var.resourcesProvider);
                        i80Var.f25642n = new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider);
                        i80Var.show();
                        return;
                    } else if (b10 == 4) {
                        qc qcVar = new qc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z4) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        kf.k0.v(i10, qcVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (p2Var instanceof zn) {
                    zn znVar = (zn) p2Var;
                    TLRPC.Chat chat3 = znVar.e;
                    TLRPC.User i13 = znVar.i();
                    if ((chat3 != null && chat3.f19159id == (-j10)) || (i13 != null && i13.f19306id == j10)) {
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
                        zn znVar2 = new zn(bundle);
                        ag.f.a(znVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(i0Var.currentAccount).getForumLastTopicId(chat2.f19159id)));
                        p2Var.presentFragment(znVar2);
                    } else {
                        p2Var.presentFragment(new sf1(bundle));
                    }
                } else {
                    p2Var.presentFragment(new zn(bundle));
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
            float b10 = kf.m0.b(f10);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            d0 d0Var = this.v;
            d0Var.f44400a.setAlpha(b10);
            d0Var.f44400a.setScaleX(lerp);
            d0Var.f44400a.setScaleY(lerp);
            org.telegram.ui.ActionBar.k kVar = d0Var.f44400a;
            int i21 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            kVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            d20 d20Var = this.f44424y;
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
            g61 g61Var = d0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            g61Var.setVisibility(i17);
            this.f44419n.setAlpha(b10);
            this.f44419n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.f44419n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            ph.d dVar = this.f44419n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            u10 u10Var = this.C;
            u10Var.setAlpha(f10);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            u10Var.setVisibility(i19);
            this.containerView.invalidate();
            this.E.invalidate();
        }
        if (i10 == 2) {
            float b11 = kf.m0.b(f10);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            c0 c0Var = this.f44423x;
            c0Var.f44400a.setAlpha(b11);
            c0Var.f44400a.setScaleX(lerp3);
            c0Var.f44400a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.k kVar2 = c0Var.f44400a;
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
            g61 g61Var2 = c0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            g61Var2.setVisibility(i13);
            if (!this.K) {
                this.f44420r.setAlpha(b11);
                this.f44420r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.f44420r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                ph.d dVar2 = this.f44420r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            g61 g61Var3 = this.D;
            g61Var3.setAlpha(f10);
            if (i24 > 0) {
                i20 = 0;
            }
            g61Var3.setVisibility(i20);
            this.containerView.invalidate();
            this.F.invalidate();
        }
    }

    public final boolean T(i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof th.e) {
            th.e eVar = (th.e) obj;
            long j10 = eVar.f45005a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            p2 p2Var = this.f44421s;
            if (user != null) {
                p2Var.presentFragment(zn.R9(user.f19306id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new uh.b(getContext(), chat, new e6(21, this, eVar)).show();
                return true;
            } else {
                p2Var.presentFragment(zn.R9(-chat.f19159id));
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
            arrayList.add(i51.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(i51.D(0, AndroidUtilities.dp(56.0f)));
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
                        arrayList.add(i51.v(chat));
                    }
                } else {
                    arrayList.add(i51.v(chat));
                }
            }
        }
    }

    public final void V(TLRPC.Chat chat, long j10, boolean z4) {
        long j11 = -chat.f19159id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            d2 d2Var = new d2(getContext(), 3, null);
            d2Var.q(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, d2Var, j10, z4, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z4, new ry0(isChannelAndNotMegaGroup, this, 2));
    }

    public final void W(i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.K) {
                this.L.run(chat);
                dismiss();
                return;
            }
            new uh.a(getContext(), this.f44418f, -chat.f19159id, new s1(14, this, chat)).show();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f44416b.f46961f && !this.f44417c.f46961f) {
            View currentView = this.d.getCurrentView();
            if (currentView instanceof f0) {
                return ((f0) currentView).e;
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
    public final void d(q2 q2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (q2Var.getMessage() != null && (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-q2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, q2Var.getMessage().messageOwner, true))) != null) {
            ag.f.m(this.f44421s, -q2Var.getDialogId(), findTopic, 0);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.e;
        d0 d0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f19160id == j10) {
                d0Var.d.V2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
                this.f44418f = chat;
                d0Var.f44400a.setTitle(DialogObject.getName(chat));
                d0Var.h.e(this.f44418f, d0Var.f44393n);
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
    public final void e(q2 q2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(q2Var.getDialogId())) {
            p2 p2Var = this.f44421s;
            p2Var.getOrCreateStoryViewer().getClass();
            p2Var.getOrCreateStoryViewer().D(p2Var.getContext(), q2Var.getDialogId(), c7.a((rl0) q2Var.getParent()));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                xd.a aVar = this.f44417c;
                if (aVar.f46961f) {
                    this.f44423x.d.U2.h1(1, this.R.f7197b);
                    aVar.a(false, true);
                    setAllowNestedScroll(true);
                    d20 d20Var = this.B;
                    AndroidUtilities.hideKeyboard(d20Var.f24117r);
                    d20Var.f24117r.clearFocus();
                    return;
                }
            }
            this.d.D(0);
            return;
        }
        super.onBackPressed();
    }

    public i0(p2 p2Var, long j10, ArrayList arrayList, j3 j3Var) {
        super(p2Var.getContext(), p2Var.getResourceProvider(), true, true);
        mr mrVar = mr.h;
        this.f44416b = new xd.a(1, this, mrVar, 350L, false);
        this.f44417c = new xd.a(2, this, mrVar, 350L, false);
        this.G = new kf.b0(2);
        this.H = new kf.b0(8);
        Paint paint = new Paint(1);
        this.M = paint;
        i0.b bVar = i0.b.e;
        this.Q = bVar;
        this.R = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f44421s = p2Var;
        this.K = arrayList != null;
        this.N = arrayList;
        this.L = j3Var;
        Context context = p2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = j6.f19827a7;
        paint.setColor(j6.v0(i10, this.resourcesProvider));
        fixNavigationBar(j6.v0(i10, this.resourcesProvider));
        this.containerView = new sz(this, context);
        gk gkVar = new gk(this, context, 8);
        this.d = gkVar;
        int i11 = this.backgroundPaddingLeft;
        gkVar.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, b6.e(-1, -1, 119));
        this.E = new nw0(this, context, 9);
        this.F = new nw0(this, context, 9);
        d20 d20Var = new d20(context, this.resourcesProvider);
        this.f44424y = d20Var;
        d20Var.setCloseButtonVisible(true);
        d20Var.f24120x = true;
        d20Var.e();
        String string = LocaleController.getString(R.string.Search);
        kg.f fVar = d20Var.f24117r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new u(this));
        d20Var.setVisibility(8);
        d20 d20Var2 = new d20(context, this.resourcesProvider);
        this.B = d20Var2;
        d20Var2.setCloseButtonVisible(true);
        d20Var2.f24120x = true;
        d20Var2.e();
        String string2 = LocaleController.getString(R.string.Search);
        kg.f fVar2 = d20Var2.f24117r;
        fVar2.setHint(string2);
        fVar2.addTextChangedListener(new v(this));
        d20Var2.setVisibility(8);
        g61 g61Var = new g61(context, this.currentAccount, 0, false, new r(this, 0), new s(this, 0), null, this.resourcesProvider);
        this.D = g61Var;
        g61Var.j(new w(this));
        g61Var.setClipToPadding(false);
        g61Var.setVisibility(8);
        g61Var.o1();
        g61Var.V2.f30148r = false;
        g61Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        u10 u10Var = new u10(p2Var);
        this.C = u10Var;
        u10Var.setVisibility(8);
        u10Var.setBackground(null);
        u10Var.setChatPreviewDelegate(new Object());
        u10Var.setUiCallback(new y(this));
        u10Var.f38640b.setClipToPadding(false);
        this.I = new View(getContext());
        Context context2 = getContext();
        f6 f6Var = this.resourcesProvider;
        n0 n0Var = new n0(context2, f6Var, new qc((FrameLayout) this.containerView, f6Var), this.currentAccount, j10);
        this.J = n0Var;
        n0Var.h = new z(this, p2Var);
        this.e = j10;
        this.f44418f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f44418f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        tf.e0 e0Var = new tf.e0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        e0Var.f44768f = this.f44418f;
        e0Var.h = false;
        ArrayList arrayList2 = d20Var.C;
        arrayList2.add(e0Var);
        d20Var.F = arrayList2.size() - 1;
        d20Var.f();
        setBackgroundColor(j6.v0(i10, this.resourcesProvider));
        this.f44422w = new h0(this, context);
        this.v = new d0(this, context);
        this.f44423x = new c0(this, context);
        this.d.setAdapter(new a0(this));
        d20Var.setCloseButtonOnClickListener(new t(this, 0));
        d20Var2.setCloseButtonOnClickListener(new t(this, 1));
        n0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        ic.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        s sVar = new s(this, 1);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(viewGroup, sVar);
    }

    @Override
    public final void c() {
    }

    @Override
    public final void a(q2 q2Var) {
    }

    @Override
    public final void f(q2 q2Var) {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
