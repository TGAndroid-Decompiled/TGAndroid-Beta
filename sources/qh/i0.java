package qh;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.n3;
import eg.z1;
import i7.f6;
import j7.l1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lh.b7;
import nh.g1;
import nh.i8;
import nh.w9;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.x10;
import org.telegram.ui.h10;
import org.telegram.ui.op0;
import org.telegram.ui.th;
import org.telegram.ui.tn;
import org.telegram.ui.yu0;
import org.telegram.ui.ze1;
public final class i0 extends f3 implements NotificationCenter.NotificationCenterDelegate, vd.b, l2 {
    public static final int R = 0;
    public final x10 A;
    public final h10 B;
    public final u51 C;
    public final op0 D;
    public final op0 E;
    public final jf.b0 F;
    public final jf.b0 G;
    public final View H;
    public final o0 I;
    public final boolean J;
    public final Utilities.Callback K;
    public final Paint L;
    public ArrayList M;
    public String N;
    public String O;
    public i0.b P;
    public i0.b Q;
    public final vd.a f46713b;
    public final vd.a f46714c;
    public final g1 d;
    public final long f46715e;
    public TLRPC.Chat f46716f;
    public boolean h;
    public nh.d f46717n;
    public nh.d f46718r;
    public final o2 f46719s;
    public final d0 v;
    public final h0 f46720w;
    public final c0 f46721x;
    public final x10 f46722y;

    public i0(o2 o2Var, long j10) {
        this(o2Var, j10, null, null);
    }

    public static void A(i0 i0Var, ArrayList arrayList) {
        String formatPluralString;
        String str;
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(w41.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(w41.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        w41 w41Var = new w41(39);
        w41Var.d = 101;
        w41Var.f34300l = string;
        w41Var.f34313z = 0;
        w41Var.K(i0Var.h);
        arrayList.add(w41Var);
        arrayList.add(w41.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        o0 o0Var = i0Var.I;
        boolean z11 = true;
        if (o0Var.f46759n && o0Var.f46757l == 1 && (arrayList2 = o0Var.f46755j) != null && arrayList2.size() == 1) {
            arrayList.add(w41.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            o0Var.c(arrayList);
            arrayList.add(w41.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = o0Var.f46757l;
            if (i11 > 0) {
                int i12 = o0Var.f46761p;
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
                int i14 = rh.h.f47454a;
                w41 J = w41.J(rh.h.class);
                J.d = 100;
                J.f34299k = i13;
                J.f34300l = formatPluralString;
                J.f34302n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f34305q = true;
                arrayList.add(J);
                arrayList.add(w41.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(i0Var.currentAccount).buildCommunityPeers(i0Var.f46715e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(w41.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                    i15++;
                    arrayList.add(k0.a(communityPeerDialog, i0Var));
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
                if (z10) {
                    arrayList.add(w41.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(w41.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                    i16++;
                    arrayList.add(k0.a(communityPeerDialog2, i0Var));
                }
                z10 = true;
            }
            if (!buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
                if (z10) {
                    arrayList.add(w41.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(w41.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
                int size3 = arrayList5.size();
                int i17 = 0;
                while (i17 < size3) {
                    MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                    i17++;
                    arrayList.add(k0.a(communityPeerDialog3, i0Var));
                }
            } else {
                z11 = z10;
            }
            if (!buildCommunityPeers.chatsOther.isEmpty()) {
                if (z11) {
                    arrayList.add(w41.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(w41.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
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

    public static ViewGroup L(i0 i0Var) {
        return i0Var.containerView;
    }

    public static void m(i0 i0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                p0.f(new tc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), 2, z10);
                i0Var.d.D(0);
                return;
            }
            th.t((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
            return;
        }
        p0.f(new tc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), 1, z10);
        i0Var.d.D(0);
    }

    public static void n(i0 i0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        i0Var.f46717n.setLoading(false);
        if (tL_error != null) {
            th.t((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            i0Var.M = arrayList;
            if (arrayList.isEmpty()) {
                l1.v(R.string.CommunityNoChatsToAdd, new tc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            i0Var.f46721x.d.U2.N(false);
            i0Var.d.D(2);
        }
    }

    public static void o(i0 i0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            th.t((FrameLayout) i0Var.containerView, i0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void p(i0 i0Var, c2 c2Var, long j10, boolean z10, long j11) {
        c2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        i0Var.V(MessagesController.getInstance(i0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void q(i0 i0Var, boolean z10, boolean z11, long j10) {
        int i10;
        Context context = i0Var.getContext();
        c6 c6Var = i0Var.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z10) {
            i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z11) {
            i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        c2 P = c5.P(context, c6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new z1(i0Var, j10, 29));
        P.show();
        TextView textView = (TextView) P.d(-1);
        if (textView != null) {
            textView.setTextColor(g6.w0(null, g6.f23295q7, false));
        }
    }

    public static int t(i0 i0Var) {
        return i0Var.currentAccount;
    }

    public static c6 u(i0 i0Var) {
        return i0Var.resourcesProvider;
    }

    public static c6 v(i0 i0Var) {
        return i0Var.resourcesProvider;
    }

    public static c6 w(i0 i0Var) {
        return i0Var.resourcesProvider;
    }

    public static void x(i0 i0Var) {
        if (!ChatObject.canAddChatToCommunity(i0Var.f46716f)) {
            i0Var.dismiss();
            return;
        }
        nh.d dVar = i0Var.f46717n;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(i0Var.currentAccount).fetchChatsToAddToCommunity(new r(i0Var, 2));
    }

    public static void y(i0 i0Var, w41 w41Var, View view) {
        long j10;
        TLRPC.Chat chat;
        int i10;
        o2 o2Var = i0Var.f46719s;
        if (!i0Var.T(w41Var)) {
            int i11 = w41Var.d;
            boolean z10 = false;
            if (i11 == 101) {
                i0Var.h = !i0Var.h;
                MessagesController.getInstance(i0Var.currentAccount).toggleCommunityCollapsedInDialogs(i0Var.f46715e, i0Var.h);
                if (view instanceof p8) {
                    ((p8) view).getCheckBox().c(i0Var.h, true);
                } else {
                    i0Var.v.d.U2.N(false);
                }
            } else if (i11 == 100) {
                i0Var.d.D(1);
                i0Var.I.e();
            } else {
                Object obj = w41Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f22392id;
                } else if (obj instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) obj).f22539id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = p0.b(i0Var.currentAccount, j10);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        c80 c80Var = new c80(i0Var.getContext(), chat2, null, i0Var.f46719s, i0Var.resourcesProvider);
                        c80Var.f27372n = new tc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider);
                        c80Var.show();
                        return;
                    } else if (b10 == 4) {
                        tc tcVar = new tc((FrameLayout) i0Var.containerView, i0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z10) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        l1.v(i10, tcVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (o2Var instanceof tn) {
                    tn tnVar = (tn) o2Var;
                    TLRPC.Chat chat3 = tnVar.f42787e;
                    TLRPC.User i13 = tnVar.i();
                    if ((chat3 != null && chat3.f22392id == (-j10)) || (i13 != null && i13.f22539id == j10)) {
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
                        tn tnVar2 = new tn(bundle);
                        yf.d.a(tnVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(i0Var.currentAccount).getForumLastTopicId(chat2.f22392id)));
                        o2Var.presentFragment(tnVar2);
                    } else {
                        o2Var.presentFragment(new ze1(bundle));
                    }
                } else {
                    o2Var.presentFragment(new tn(bundle));
                }
                i0Var.dismiss();
            }
        }
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
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
            float b10 = jf.l0.b(f9);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            d0 d0Var = this.v;
            d0Var.f46695a.setAlpha(b10);
            d0Var.f46695a.setScaleX(lerp);
            d0Var.f46695a.setScaleY(lerp);
            org.telegram.ui.ActionBar.l lVar = d0Var.f46695a;
            int i21 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            lVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f9);
            x10 x10Var = this.f46722y;
            x10Var.setAlpha(f9);
            x10Var.setScaleX(lerp2);
            x10Var.setScaleY(lerp2);
            int i22 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            x10Var.setVisibility(i16);
            d0Var.d.setAlpha(b10);
            u51 u51Var = d0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            u51Var.setVisibility(i17);
            this.f46717n.setAlpha(b10);
            this.f46717n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.f46717n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            nh.d dVar = this.f46717n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            h10 h10Var = this.B;
            h10Var.setAlpha(f9);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            h10Var.setVisibility(i19);
            this.containerView.invalidate();
            this.D.invalidate();
        }
        if (i10 == 2) {
            float b11 = jf.l0.b(f9);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            c0 c0Var = this.f46721x;
            c0Var.f46695a.setAlpha(b11);
            c0Var.f46695a.setScaleX(lerp3);
            c0Var.f46695a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.l lVar2 = c0Var.f46695a;
            int i23 = (b11 > 0.0f ? 1 : (b11 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            lVar2.setVisibility(i11);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f9);
            x10 x10Var2 = this.A;
            x10Var2.setAlpha(f9);
            x10Var2.setScaleX(lerp4);
            x10Var2.setScaleY(lerp4);
            int i24 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            x10Var2.setVisibility(i12);
            c0Var.d.setAlpha(b11);
            u51 u51Var2 = c0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            u51Var2.setVisibility(i13);
            if (!this.J) {
                this.f46718r.setAlpha(b11);
                this.f46718r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.f46718r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                nh.d dVar2 = this.f46718r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            u51 u51Var3 = this.C;
            u51Var3.setAlpha(f9);
            if (i24 > 0) {
                i20 = 0;
            }
            u51Var3.setVisibility(i20);
            this.containerView.invalidate();
            this.E.invalidate();
        }
    }

    public final boolean T(w41 w41Var) {
        Object obj = w41Var.G;
        if (obj instanceof rh.e) {
            rh.e eVar = (rh.e) obj;
            long j10 = eVar.f47439a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            o2 o2Var = this.f46719s;
            if (user != null) {
                o2Var.presentFragment(tn.R9(user.f22539id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new sh.b(getContext(), chat, new org.telegram.ui.web.y(17, this, eVar)).show();
                return true;
            } else {
                o2Var.presentFragment(tn.R9(-chat.f22392id));
                return true;
            }
        }
        return false;
    }

    public final void U(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i10 = 0;
        if (!z10) {
            arrayList.add(w41.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(w41.D(0, AndroidUtilities.dp(56.0f)));
        }
        if (this.M != null) {
            if (z10 && (str2 = this.O) != null) {
                str = str2.toLowerCase();
            } else {
                str = null;
            }
            ArrayList arrayList2 = this.M;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (z10 && !TextUtils.isEmpty(str)) {
                    String str3 = chat.title;
                    if (str3 != null && str3.toLowerCase().contains(str)) {
                        arrayList.add(w41.v(chat));
                    }
                } else {
                    arrayList.add(w41.v(chat));
                }
            }
        }
    }

    public final void V(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.f22392id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            c2 c2Var = new c2(getContext(), 3, null);
            c2Var.q(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, c2Var, j10, z10, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new w9(isChannelAndNotMegaGroup, this, 2));
    }

    public final void W(w41 w41Var) {
        Object obj = w41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.J) {
                this.K.run(chat);
                dismiss();
                return;
            }
            new sh.a(getContext(), this.f46716f, -chat.f22392id, new yu0(16, this, chat)).show();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f46713b.f49506f && !this.f46714c.f49506f) {
            View currentView = this.d.getCurrentView();
            if (currentView instanceof f0) {
                return ((f0) currentView).f46698e;
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
    public final void d(p2 p2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (p2Var.getMessage() != null && (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-p2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, p2Var.getMessage().messageOwner, true))) != null) {
            yf.d.m(this.f46719s, -p2Var.getDialogId(), findTopic, 0);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.f46715e;
        d0 d0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f22393id == j10) {
                d0Var.d.U2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
                this.f46716f = chat;
                d0Var.f46695a.setTitle(DialogObject.getName(chat));
                d0Var.h.e(this.f46716f, d0Var.f46688n);
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
    public final void e(p2 p2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(p2Var.getDialogId())) {
            o2 o2Var = this.f46719s;
            o2Var.getOrCreateStoryViewer().getClass();
            o2Var.getOrCreateStoryViewer().D(o2Var.getContext(), p2Var.getDialogId(), b7.a((jl0) p2Var.getParent()));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                vd.a aVar = this.f46714c;
                if (aVar.f49506f) {
                    this.f46721x.d.T2.h1(1, this.Q.f8187b);
                    aVar.a(false, true);
                    setAllowNestedScroll(true);
                    x10 x10Var = this.A;
                    AndroidUtilities.hideKeyboard(x10Var.f34546r);
                    x10Var.f34546r.clearFocus();
                    return;
                }
            }
            this.d.D(0);
            return;
        }
        super.onBackPressed();
    }

    public i0(o2 o2Var, long j10, ArrayList arrayList, n3 n3Var) {
        super(o2Var.getContext(), o2Var.getResourceProvider(), true, true);
        jr jrVar = jr.h;
        this.f46713b = new vd.a(1, this, jrVar, 350L, false);
        this.f46714c = new vd.a(2, this, jrVar, 350L, false);
        this.F = new jf.b0(2);
        this.G = new jf.b0(8);
        Paint paint = new Paint(1);
        this.L = paint;
        i0.b bVar = i0.b.f8185e;
        this.P = bVar;
        this.Q = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f46719s = o2Var;
        this.J = arrayList != null;
        this.M = arrayList;
        this.K = n3Var;
        Context context = o2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = g6.f23009a7;
        paint.setColor(g6.v0(i10, this.resourcesProvider));
        fixNavigationBar(g6.v0(i10, this.resourcesProvider));
        this.containerView = new i8(this, context);
        g1 g1Var = new g1(this, context, 8);
        this.d = g1Var;
        int i11 = this.backgroundPaddingLeft;
        g1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, f6.e(-1, -1, 119));
        this.D = new op0(this, context, 9);
        this.E = new op0(this, context, 9);
        x10 x10Var = new x10(context, this.resourcesProvider);
        this.f46722y = x10Var;
        x10Var.setCloseButtonVisible(true);
        x10Var.f34549x = true;
        x10Var.e();
        String string = LocaleController.getString(R.string.Search);
        ig.f fVar = x10Var.f34546r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new u(this));
        x10Var.setVisibility(8);
        x10 x10Var2 = new x10(context, this.resourcesProvider);
        this.A = x10Var2;
        x10Var2.setCloseButtonVisible(true);
        x10Var2.f34549x = true;
        x10Var2.e();
        String string2 = LocaleController.getString(R.string.Search);
        ig.f fVar2 = x10Var2.f34546r;
        fVar2.setHint(string2);
        fVar2.addTextChangedListener(new v(this));
        x10Var2.setVisibility(8);
        u51 u51Var = new u51(context, this.currentAccount, 0, false, new r(this, 0), new s(this, 0), null, this.resourcesProvider);
        this.C = u51Var;
        u51Var.j(new w(this));
        u51Var.setClipToPadding(false);
        u51Var.setVisibility(8);
        u51Var.p1();
        u51Var.U2.f29939r = false;
        u51Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        h10 h10Var = new h10(o2Var);
        this.B = h10Var;
        h10Var.setVisibility(8);
        h10Var.setBackground(null);
        h10Var.setChatPreviewDelegate(new Object());
        h10Var.setUiCallback(new y(this));
        h10Var.f38720b.setClipToPadding(false);
        this.H = new View(getContext());
        Context context2 = getContext();
        c6 c6Var = this.resourcesProvider;
        o0 o0Var = new o0(context2, c6Var, new tc((FrameLayout) this.containerView, c6Var), this.currentAccount, j10);
        this.I = o0Var;
        o0Var.h = new z(this, o2Var);
        this.f46715e = j10;
        this.f46716f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f46716f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        rf.f0 f0Var = new rf.f0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        f0Var.f47224f = this.f46716f;
        f0Var.h = false;
        ArrayList arrayList2 = x10Var.B;
        arrayList2.add(f0Var);
        x10Var.E = arrayList2.size() - 1;
        x10Var.f();
        setBackgroundColor(g6.v0(i10, this.resourcesProvider));
        this.f46720w = new h0(this, context);
        this.v = new d0(this, context);
        this.f46721x = new c0(this, context);
        this.d.setAdapter(new a0(this));
        x10Var.setCloseButtonOnClickListener(new t(this, 0));
        x10Var2.setCloseButtonOnClickListener(new t(this, 1));
        o0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        mc.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        s sVar = new s(this, 1);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(viewGroup, sVar);
    }

    @Override
    public final void c() {
    }

    @Override
    public final void a(p2 p2Var) {
    }

    @Override
    public final void f(p2 p2Var) {
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
