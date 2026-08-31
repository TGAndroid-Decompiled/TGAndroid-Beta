package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class qr extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public RadialProgressView A1;
    public TLRPC.TL_chatBannedRights B;
    public int B0;
    public final ArrayList C;
    public int C0;
    public final ArrayList D;
    public int D0;
    public final ArrayList E;
    public int E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public int G0;
    public final a0.h H;
    public int H0;
    public final a0.h I;
    public int I0;
    public final a0.h J;
    public int J0;
    public long K;
    public int K0;
    public final int L;
    public int L0;
    public final boolean M;
    public int M0;
    public boolean N;
    public int N0;
    public boolean O;
    public int O0;
    public int P;
    public int P0;
    public int Q;
    public int Q0;
    public int R;
    public int R0;
    public int S;
    public int S0;
    public int T;
    public int T0;
    public int U;
    public int U0;
    public int V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public int Y0;
    public int Z;
    public int Z0;
    public mr f40599a;
    public int f40600a0;
    public int f40601a1;
    public org.telegram.ui.Components.ax0 f40602b;
    public int f40603b0;
    public final int f40604b1;
    public mh.d1 f40605c;
    public int f40606c0;
    public int f40607c1;
    public cr d;
    public int f40608d0;
    public int f40609d1;
    public pr f40610e;
    public int f40611e0;
    public int f40612e1;
    public org.telegram.ui.ActionBar.w0 f40613f;
    public int f40614f0;
    public int f40615f1;
    public int f40616g0;
    public int f40617g1;
    public org.telegram.ui.ActionBar.w0 h;
    public int f40618h0;
    public int f40619h1;
    public int f40620i0;
    public boolean f40621i1;
    public int f40622j0;
    public jr f40623j1;
    public int f40624k0;
    public final boolean f40625k1;
    public int f40626l0;
    public boolean l1;
    public int m0;
    public int f40627m1;
    public UndoView f40628n;
    public int f40629n0;
    public int f40630n1;
    public int f40631o0;
    public boolean f40632o1;
    public int f40633p0;
    public int f40634p1;
    public int f40635q0;
    public final boolean f40636q1;
    public TLRPC.Chat f40637r;
    public int f40638r0;
    public final boolean f40639r1;
    public TLRPC.ChatFull f40640s;
    public int f40641s0;
    public boolean f40642s1;
    public boolean f40643t0;
    public boolean f40644t1;
    public int f40645u0;
    public boolean f40646u1;
    public final boolean v;
    public int f40647v0;
    public boolean f40648v1;
    public final boolean f40649w;
    public int f40650w0;
    public long f40651w1;
    public final boolean f40652x;
    public int f40653x0;
    public long f40654x1;
    public final String f40655y;
    public int f40656y0;
    public boolean f40657y1;
    public int f40658z0;
    public org.telegram.ui.Components.u00 f40659z1;

    public qr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.B = new TLRPC.TL_chatBannedRights();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.H = new a0.h();
        this.I = new a0.h();
        this.J = new a0.h();
        this.f40651w1 = 10L;
        this.f40654x1 = 10L;
        this.K = this.arguments.getLong("chat_id");
        this.L = this.arguments.getInt("type");
        this.M = this.arguments.getBoolean("transfer");
        this.f40625k1 = this.arguments.getBoolean("open_search");
        this.f40604b1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.K));
        this.f40637r = chat;
        boolean z4 = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.B;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z10 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z10;
            tL_chatBannedRights2.embed_links = tL_chatBannedRights.embed_links;
            tL_chatBannedRights2.send_messages = tL_chatBannedRights.send_messages;
            tL_chatBannedRights2.send_games = tL_chatBannedRights.send_games;
            tL_chatBannedRights2.send_inline = tL_chatBannedRights.send_inline;
            tL_chatBannedRights2.send_gifs = tL_chatBannedRights.send_gifs;
            tL_chatBannedRights2.pin_messages = tL_chatBannedRights.pin_messages;
            tL_chatBannedRights2.edit_rank = tL_chatBannedRights.edit_rank;
            tL_chatBannedRights2.send_reactions = tL_chatBannedRights.send_reactions;
            tL_chatBannedRights2.send_polls = tL_chatBannedRights.send_polls;
            tL_chatBannedRights2.invite_users = tL_chatBannedRights.invite_users;
            tL_chatBannedRights2.manage_topics = tL_chatBannedRights.manage_topics;
            tL_chatBannedRights2.change_info = tL_chatBannedRights.change_info;
            tL_chatBannedRights2.manage_linked_peers = tL_chatBannedRights.manage_linked_peers;
            boolean z11 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z11;
            boolean z12 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z12;
            boolean z13 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z13;
            boolean z14 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z14;
            boolean z15 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z15;
            boolean z16 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z16;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z10 && z16 && z15 && z14 && z13 && z12 && z11) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.f40655y = ChatObject.getBannedRightsString(this.B);
        boolean isCommunity = ChatObject.isCommunity(this.f40637r);
        this.f40649w = isCommunity;
        if (ChatObject.isChannel(this.f40637r) && !this.f40637r.megagroup && !isCommunity) {
            z4 = true;
        }
        this.v = z4;
        this.f40652x = ChatObject.isForum(this.f40637r);
        TLRPC.Chat chat2 = this.f40637r;
        if (chat2 != null) {
            boolean z17 = chat2.signatures;
            this.f40642s1 = z17;
            this.f40636q1 = z17;
            boolean z18 = chat2.signature_profiles;
            this.f40644t1 = z18;
            this.f40639r1 = z18;
        }
    }

    public static void U(qr qrVar, long j10) {
        if (j10 != 0) {
            qrVar.K = j10;
            qrVar.f40637r = MessagesController.getInstance(qrVar.currentAccount).getChat(Long.valueOf(j10));
            qrVar.u0();
        }
    }

    public static void V(org.telegram.ui.qr r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qr.V(org.telegram.ui.qr, android.view.View, int):void");
    }

    public static void W(qr qrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.h hVar;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = qrVar.J;
            } else if (i10 == 1) {
                hVar = qrVar.I;
            } else {
                hVar = qrVar.H;
            }
            TLObject tLObject = (TLObject) hVar.f(MessageObject.getPeerId(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
        }
    }

    public static org.telegram.ui.ActionBar.f5 X(qr qrVar) {
        return qrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 Y(qr qrVar) {
        return qrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 Z(qr qrVar) {
        return qrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 a0(qr qrVar) {
        return qrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 b0(qr qrVar) {
        return qrVar.parentLayout;
    }

    public static void c0(qr qrVar, TLRPC.User user) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        boolean z4;
        boolean z10;
        a0.h hVar2 = qrVar.H;
        ArrayList arrayList2 = qrVar.C;
        UndoView undoView = qrVar.f40628n;
        long j10 = -qrVar.K;
        boolean z11 = qrVar.v;
        if (z11) {
            i10 = 9;
        } else {
            i10 = 10;
        }
        undoView.m(j10, user, i10);
        qrVar.f40637r.creator = false;
        int i11 = 0;
        boolean z12 = false;
        while (i11 < 3) {
            boolean z13 = true;
            if (i11 == 0) {
                hVar = qrVar.J;
                arrayList = qrVar.E;
            } else if (i11 == 1) {
                hVar = qrVar.I;
                arrayList = qrVar.D;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.f20990id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j11 = user.f20990id;
                tL_peerUser.user_id = j11;
                hVar.k(tL_channelParticipantCreator, j11);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z12 = true;
                z4 = true;
            } else {
                z4 = false;
            }
            long clientUserId = qrVar.getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) hVar.f(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
                z10 = z12;
                tL_channelParticipantAdmin.date = (int) (System.currentTimeMillis() / 1000);
                TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                tL_chatAdminRights.add_admins = true;
                tL_chatAdminRights.manage_ranks = true;
                tL_chatAdminRights.pin_messages = true;
                tL_chatAdminRights.manage_topics = true;
                tL_chatAdminRights.invite_users = true;
                tL_chatAdminRights.ban_users = true;
                tL_chatAdminRights.delete_messages = true;
                tL_chatAdminRights.edit_messages = true;
                tL_chatAdminRights.post_messages = true;
                tL_chatAdminRights.change_info = true;
                if (!z11) {
                    tL_chatAdminRights.manage_call = true;
                }
                hVar.k(tL_channelParticipantAdmin, clientUserId);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z10 = z12;
                z13 = z4;
            }
            if (z13) {
                Collections.sort(arrayList, new oh.k0(16));
            }
            i11++;
            z12 = z10;
        }
        if (!z12) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.f20990id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new oh.k0(15));
            qrVar.B0();
        }
        qrVar.f40599a.l();
        jr jrVar = qrVar.f40623j1;
        if (jrVar != null) {
            jrVar.a(user);
        }
    }

    public static int j0(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_channelParticipant)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int m0(int i10) {
        if (i10 == 1) {
            return 5;
        }
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 3) {
            return 30;
        }
        if (i10 == 4) {
            return 60;
        }
        if (i10 == 5) {
            return 300;
        }
        if (i10 == 6) {
            return 900;
        }
        if (i10 == 7) {
            return 3600;
        }
        return 0;
    }

    public static int n0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i10 = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i10++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i10++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i10++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i10++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i10++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i10++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i10++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i10++;
        }
        if (!tL_chatBannedRights.send_reactions) {
            return i10 + 1;
        }
        return i10;
    }

    public final void A0(kr krVar) {
        View view;
        if (this.f40599a == null) {
            B0();
            return;
        }
        B0();
        krVar.f(krVar.d);
        f2.q.c(krVar, true).b(this.f40599a);
        mh.d1 d1Var = this.f40605c;
        if (d1Var != null && this.d != null && d1Var.getChildCount() > 0) {
            int i10 = 0;
            int i11 = -1;
            while (true) {
                if (i10 < this.f40605c.getChildCount()) {
                    i11 = RecyclerView.R(this.f40605c.getChildAt(i10));
                    if (i11 != -1) {
                        view = this.f40605c.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i11, view.getTop() - this.f40605c.getPaddingTop());
            }
        }
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qr.B0():void");
    }

    @Override
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override
    public final View createView(Context context) {
        this.l1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f40604b1;
        int i12 = this.L;
        if (i12 == 3) {
            this.actionBar.setTitle(LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions));
        } else if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist));
        } else if (i12 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAdministrators));
        } else if (i12 == 2) {
            if (i11 == 0) {
                if (this.v) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSubscribers));
                } else {
                    this.actionBar.setTitle(LocaleController.getString("ChannelMembers", R.string.ChannelMembers));
                }
            } else if (i11 == 1) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin));
            } else if (i11 == 2) {
                this.actionBar.setTitle(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser));
            } else if (i11 == 3) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddException", R.string.ChannelAddException));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 22));
        if (i11 == 0 && i12 != 2 && i12 != 0 && i12 != 3) {
            if (i12 == 1 && ChatObject.isChannelAndNotMegaGroup(this.f40637r) && ChatObject.hasAdminRights(this.f40637r)) {
                this.h = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else {
            this.f40610e = new pr(this, context);
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.E = new fb(this, 2);
            this.f40613f = a2;
            if (i12 == 0 && !this.O) {
                a2.setVisibility(8);
            }
            if (i12 == 3) {
                this.f40613f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f40613f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.f40637r) && !this.f40637r.creator) {
                this.f40613f.setVisibility(8);
            }
            if (i12 == 3) {
                this.h = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.f40659z1 = u00Var;
        u00Var.setViewType(6);
        org.telegram.ui.Components.u00 u00Var2 = this.f40659z1;
        u00Var2.f31509w = false;
        u00Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.u00 u00Var3 = this.f40659z1;
        int i13 = org.telegram.ui.ActionBar.k6.G8;
        int i14 = org.telegram.ui.ActionBar.k6.f21750i6;
        u00Var3.f(i13, i14, i14);
        frameLayout3.addView(this.f40659z1, k7.c6.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.A1 = radialProgressView;
        frameLayout3.addView(radialProgressView, k7.c6.e(-2, -2, 17));
        this.f40659z1.setVisibility(8);
        this.A1.setVisibility(8);
        org.telegram.ui.Components.ax0 ax0Var = new org.telegram.ui.Components.ax0(context, frameLayout3, 1, null);
        this.f40602b = ax0Var;
        ax0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.f40602b.f25364e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f40602b.setVisibility(8);
        this.f40602b.setAnimateLayoutChange(true);
        this.f40602b.e(true, false);
        frameLayout2.addView(this.f40602b, k7.c6.c(-1.0f, -1));
        this.f40602b.addView(frameLayout3, 0);
        mh.d1 d1Var = new mh.d1(this, context, 7);
        this.f40605c = d1Var;
        d1Var.p1();
        mh.d1 d1Var2 = this.f40605c;
        cr crVar = new cr(this);
        this.d = crVar;
        d1Var2.setLayoutManager(crVar);
        dr drVar = new dr(this);
        drVar.n(420L);
        drVar.o(org.telegram.ui.Components.pr.h);
        drVar.C = false;
        drVar.f5910m = false;
        this.f40605c.setItemAnimator(drVar);
        mh.d1 d1Var3 = this.f40605c;
        d1Var3.V1 = true;
        d1Var3.W1 = 0;
        mr mrVar = new mr(this, context);
        this.f40599a = mrVar;
        d1Var3.setAdapter(mrVar);
        mh.d1 d1Var4 = this.f40605c;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        d1Var4.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f40605c, k7.c6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f40605c);
        this.f40605c.setOnItemClickListener(new nq(this, 3));
        this.f40605c.setOnItemLongClickListener(new nq(this, 4));
        if (this.f40613f != null) {
            this.f40605c.setOnScrollListener(new l3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.f40628n = undoView;
        frameLayout2.addView(undoView, k7.c6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        B0();
        this.f40605c.setEmptyView(this.f40602b);
        mh.d1 d1Var5 = this.f40605c;
        d1Var5.V1 = false;
        d1Var5.W1 = 0;
        if (this.f40625k1) {
            this.f40613f.z(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z4;
        boolean z10;
        long j10;
        boolean z11 = false;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.f20844id == this.K) {
                if (!booleanValue || !ChatObject.isChannel(this.f40637r)) {
                    if (this.f40640s != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f40640s = chatFull;
                    if (!z4) {
                        int k02 = k0();
                        this.f40630n1 = k02;
                        this.f40627m1 = k02;
                        int i12 = this.f40640s.boosts_unrestrict;
                        if (i12 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f40632o1 = z10;
                        this.f40634p1 = i12;
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.K));
                        if (chat == null) {
                            j10 = 0;
                        } else {
                            j10 = chat.send_paid_messages_stars;
                        }
                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i13 > 0) {
                            z11 = true;
                        }
                        this.f40648v1 = z11;
                        this.f40646u1 = z11;
                        if (i13 <= 0) {
                            j10 = 10;
                        }
                        long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                        this.f40654x1 = clamp;
                        this.f40651w1 = clamp;
                    }
                    AndroidUtilities.runOnUIThread(new lq(this, 0));
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.K)) {
            org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
            if (f5Var != null && f5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final boolean g0(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qr.g0(boolean):boolean");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Components.vv0.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        int i10 = org.telegram.ui.ActionBar.k6.f21624b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21697f7));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22053z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.f22036y6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, fVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.f21839n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40628n, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.Fi));
        int i13 = org.telegram.ui.ActionBar.k6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40628n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40628n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.k6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40628n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40628n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40628n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40628n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21821m6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21961u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21979v6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Components.ax0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Components.ax0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40602b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40602b.f25364e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f40605c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.k6.f21906r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        return arrayList;
    }

    public final boolean h0(TLObject tLObject, boolean z4, View view) {
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j10;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10;
        int i11;
        qr qrVar;
        final long j11;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        long j12;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i13;
        boolean z18;
        String str2;
        int i14;
        if (tLObject == null || (i10 = this.f40604b1) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            j10 = MessageObject.getPeerId(channelParticipant.peer);
            boolean z19 = channelParticipant.can_edit;
            tL_chatBannedRights = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i11 = channelParticipant.date;
            str = channelParticipant.rank;
            z10 = z19;
        } else {
            tL_chatBannedRights = null;
            if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j10 = chatParticipant.user_id;
                i11 = chatParticipant.date;
                str = "";
                z10 = ChatObject.canAddAdmins(this.f40637r);
                tL_chatAdminRights = null;
            } else {
                j10 = 0;
                str = null;
                tL_chatAdminRights = null;
                z10 = false;
                i11 = 0;
            }
        }
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i15 == 0 || j10 == getUserConfig().getClientUserId()) {
            return false;
        }
        boolean z20 = this.v;
        int i16 = this.L;
        if (i16 == 2) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (ChatObject.canAddAdmins(this.f40637r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z10)) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z21 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
            if ((!z21 && !(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z10) {
                z13 = z12;
                j12 = j10;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z14 = true;
            } else {
                z13 = z12;
                j12 = j10;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z14 = false;
            }
            if (!z21 && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                z15 = false;
            } else {
                z15 = true;
            }
            if (ChatObject.canBlockUsers(this.f40637r) && z14 && !z20 && ChatObject.isChannel(this.f40637r) && !this.f40637r.gigagroup) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (i10 == 0) {
                z13 = (!UserObject.isDeleted(user)) & z13;
            }
            if (!z13 && (!ChatObject.canBlockUsers(this.f40637r) || !z14)) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (!z4 && z17) {
                boolean z22 = z16;
                uq uqVar = new uq(this, j12, i11, tLObject, tL_chatAdminRights, tL_chatBannedRights2, str, z14);
                long j13 = j12;
                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(this, view);
                H.W(this.f40605c.V0(view, false));
                int i17 = R.drawable.msg_admins;
                if (z15) {
                    i13 = R.string.EditAdminRights;
                } else {
                    i13 = R.string.SetAsAdmin;
                }
                H.l(i17, LocaleController.getString(i13), new zi(uqVar, 11), z13);
                H.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new ih((Object) this, (Object) tLObject, (Object) user, (Object) uqVar, 4), z22);
                if (ChatObject.canBlockUsers(this.f40637r) && z14) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                int i18 = R.drawable.msg_remove;
                if (z20) {
                    str2 = "ChannelRemoveUser";
                    i14 = R.string.ChannelRemoveUser;
                } else {
                    str2 = "KickFromGroup";
                    i14 = R.string.KickFromGroup;
                }
                H.m(z18, i18, LocaleController.getString(str2, i14), true, new i5.v(this, user, j13, 17));
                H.S = 190;
                H.Z();
                return true;
            }
            return z17;
        }
        final long j14 = j10;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        org.telegram.ui.Components.q70 H2 = org.telegram.ui.Components.q70.H(this, view);
        if (i16 == 3 && ChatObject.canBlockUsers(this.f40637r)) {
            qrVar = this;
            H2.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new lh.g1(qrVar, j14, tL_chatBannedRights, str, tLObject, 9), false);
            H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(qrVar) {
                public final qr f39196b;

                {
                    this.f39196b = qrVar;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f39196b.i0(j14);
                            return;
                        case 1:
                            qr qrVar2 = this.f39196b;
                            long j15 = j14;
                            qrVar2.i0(j15);
                            qrVar2.getMessagesController().addUserToChat(qrVar2.K, qrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, qrVar2, null);
                            return;
                        case 2:
                            this.f39196b.i0(j14);
                            return;
                        default:
                            qr qrVar3 = this.f39196b;
                            MessagesController messagesController = qrVar3.getMessagesController();
                            long j16 = qrVar3.K;
                            MessagesController messagesController2 = qrVar3.getMessagesController();
                            long j17 = j14;
                            messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !qrVar3.v, qrVar3, false, false, null, null);
                            qrVar3.v0(j17);
                            return;
                    }
                }
            }, true);
        } else {
            String str3 = str;
            qrVar = this;
            if (i16 == 0 && ChatObject.canBlockUsers(qrVar.f40637r)) {
                if (ChatObject.canAddUsers(qrVar.f40637r) && i15 > 0 && !ChatObject.isCommunity(qrVar.f40637r)) {
                    int i19 = R.drawable.msg_contact_add;
                    if (z20) {
                        i12 = R.string.ChannelAddToChannel;
                    } else {
                        i12 = R.string.ChannelAddToGroup;
                    }
                    H2.c(i19, LocaleController.getString(i12), new Runnable(qrVar) {
                        public final qr f39196b;

                        {
                            this.f39196b = qrVar;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    this.f39196b.i0(j14);
                                    return;
                                case 1:
                                    qr qrVar2 = this.f39196b;
                                    long j15 = j14;
                                    qrVar2.i0(j15);
                                    qrVar2.getMessagesController().addUserToChat(qrVar2.K, qrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, qrVar2, null);
                                    return;
                                case 2:
                                    this.f39196b.i0(j14);
                                    return;
                                default:
                                    qr qrVar3 = this.f39196b;
                                    MessagesController messagesController = qrVar3.getMessagesController();
                                    long j16 = qrVar3.K;
                                    MessagesController messagesController2 = qrVar3.getMessagesController();
                                    long j17 = j14;
                                    messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !qrVar3.v, qrVar3, false, false, null, null);
                                    qrVar3.v0(j17);
                                    return;
                            }
                        }
                    }, false);
                }
                H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(qrVar) {
                    public final qr f39196b;

                    {
                        this.f39196b = qrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f39196b.i0(j14);
                                return;
                            case 1:
                                qr qrVar2 = this.f39196b;
                                long j15 = j14;
                                qrVar2.i0(j15);
                                qrVar2.getMessagesController().addUserToChat(qrVar2.K, qrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, qrVar2, null);
                                return;
                            case 2:
                                this.f39196b.i0(j14);
                                return;
                            default:
                                qr qrVar3 = this.f39196b;
                                MessagesController messagesController = qrVar3.getMessagesController();
                                long j16 = qrVar3.K;
                                MessagesController messagesController2 = qrVar3.getMessagesController();
                                long j17 = j14;
                                messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !qrVar3.v, qrVar3, false, false, null, null);
                                qrVar3.v0(j17);
                                return;
                        }
                    }
                }, true);
            } else if (i16 == 1 && ChatObject.canAddAdmins(qrVar.f40637r) && z10) {
                if (!qrVar.f40637r.creator && (tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    j11 = j14;
                } else {
                    j11 = j14;
                    H2.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new lh.g1(qrVar, j11, tL_chatAdminRights2, str3, tLObject, 10), false);
                }
                H2.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(qrVar) {
                    public final qr f39196b;

                    {
                        this.f39196b = qrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f39196b.i0(j11);
                                return;
                            case 1:
                                qr qrVar2 = this.f39196b;
                                long j15 = j11;
                                qrVar2.i0(j15);
                                qrVar2.getMessagesController().addUserToChat(qrVar2.K, qrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, qrVar2, null);
                                return;
                            case 2:
                                this.f39196b.i0(j11);
                                return;
                            default:
                                qr qrVar3 = this.f39196b;
                                MessagesController messagesController = qrVar3.getMessagesController();
                                long j16 = qrVar3.K;
                                MessagesController messagesController2 = qrVar3.getMessagesController();
                                long j17 = j11;
                                messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !qrVar3.v, qrVar3, false, false, null, null);
                                qrVar3.v0(j17);
                                return;
                        }
                    }
                }, true);
            }
        }
        H2.W(qrVar.f40605c.V0(view, false));
        H2.S = 190;
        if (H2.x() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z4 && z11) {
            H2.Z();
            return true;
        }
        return z11;
    }

    public final void i0(long j10) {
        if (this.f40649w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.K);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new Object(), new d5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j10);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.K);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new o(this, 4));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        TLRPC.ChatFull chatFull = this.f40640s;
        if (chatFull != null) {
            int i10 = chatFull.slowmode_seconds;
            if (i10 == 5) {
                return 1;
            }
            if (i10 == 10) {
                return 2;
            }
            if (i10 == 30) {
                return 3;
            }
            if (i10 == 60) {
                return 4;
            }
            if (i10 == 300) {
                return 5;
            }
            if (i10 == 900) {
                return 6;
            }
            if (i10 == 3600) {
                return 7;
            }
            return 0;
        }
        return 0;
    }

    public final int l0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.f40640s;
        if (chatFull == null) {
            return 0;
        }
        int i10 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
            return Math.max(i10, arrayList.size());
        }
        return i10;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final boolean o0() {
        boolean z4;
        if (this.f40632o1 && q0()) {
            z4 = true;
        } else {
            z4 = false;
        }
        TLRPC.ChatFull chatFull = this.f40640s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.f40634p1;
            if (i10 != i11 || ((z4 && i11 == 0) || (!z4 && i11 != 0))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        return g0(z4);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f40628n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        r0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f40605c.setPadding(0, 0, 0, i13);
        this.f40605c.setClipToPadding(false);
        this.f40628n.setTranslationY(-i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.f40628n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        mr mrVar = this.f40599a;
        if (mrVar != null) {
            mrVar.l();
        }
        org.telegram.ui.Components.ax0 ax0Var = this.f40602b;
        if (ax0Var != null) {
            ax0Var.requestLayout();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            this.f40657y1 = true;
        }
        if (z4 && !z10 && this.f40625k1) {
            this.f40613f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f40613f.getSearchField());
            this.f40613f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        if (i10 != this.S && i10 != this.T && i10 != this.U && i10 != this.V && i10 != this.W && i10 != this.X && i10 != this.f40618h0 && i10 != this.Y && i10 != this.Z && i10 != this.f40600a0) {
            return false;
        }
        return true;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.f40637r;
        if (chat.megagroup && !chat.gigagroup && ChatObject.canUserDoAdminAction(chat, 13)) {
            if (this.f40627m1 <= 0) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.B;
                if (tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void r0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.N) {
            int i10 = 0;
            this.G = false;
            this.F = false;
            boolean z4 = this.f40649w;
            int i11 = this.L;
            a0.h hVar = this.I;
            ArrayList arrayList = this.D;
            a0.h hVar2 = this.J;
            ArrayList arrayList2 = this.E;
            a0.h hVar3 = this.H;
            ArrayList arrayList3 = this.C;
            if (z4 && i11 == 2) {
                this.N = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                HashMap<String, ArrayList<TLRPC.TL_contact>> hashMap = ContactsController.getInstance(this.currentAccount).usersSectionsDict;
                ArrayList<String> arrayList4 = ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    String str = arrayList4.get(i12);
                    i12++;
                    ArrayList<TLRPC.TL_contact> arrayList5 = hashMap.get(str);
                    int size2 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        TLRPC.TL_contact tL_contact = arrayList5.get(i13);
                        i13++;
                        arrayList3.add(getMessagesController().getUser(Long.valueOf(tL_contact.user_id)));
                    }
                }
                B0();
                mr mrVar = this.f40599a;
                if (mrVar != null) {
                    mrVar.l();
                }
            } else if (!ChatObject.isChannel(this.f40637r)) {
                this.N = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                if (i11 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f40640s;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i10 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f40640s.participants.participants.get(i10);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            hVar3.k(chatParticipant, chatParticipant.user_id);
                            i10++;
                        }
                    }
                } else if (i11 == 2 && (chatFull = this.f40640s) != null && chatFull.participants != null) {
                    long j10 = getUserConfig().clientUserId;
                    int size4 = this.f40640s.participants.participants.size();
                    while (i10 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f40640s.participants.participants.get(i10);
                        int i14 = this.f40604b1;
                        if (i14 == 0 || chatParticipant2.user_id != j10) {
                            if (i14 == 1) {
                                if (getContactsController().isContact(chatParticipant2.user_id)) {
                                    arrayList2.add(chatParticipant2);
                                    hVar2.k(chatParticipant2, chatParticipant2.user_id);
                                } else if (!UserObject.isDeleted(getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id)))) {
                                    arrayList3.add(chatParticipant2);
                                    hVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            } else if (getContactsController().isContact(chatParticipant2.user_id)) {
                                arrayList2.add(chatParticipant2);
                                hVar2.k(chatParticipant2, chatParticipant2.user_id);
                            } else {
                                TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id));
                                if (user != null && user.bot) {
                                    arrayList.add(chatParticipant2);
                                    hVar.k(chatParticipant2, chatParticipant2.user_id);
                                } else {
                                    arrayList3.add(chatParticipant2);
                                    hVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            }
                        }
                        i10++;
                    }
                }
                mr mrVar2 = this.f40599a;
                if (mrVar2 != null) {
                    mrVar2.l();
                }
                B0();
                mr mrVar3 = this.f40599a;
                if (mrVar3 != null) {
                    mrVar3.l();
                }
            } else {
                this.N = true;
                org.telegram.ui.Components.ax0 ax0Var = this.f40602b;
                if (ax0Var != null) {
                    ax0Var.e(true, false);
                }
                mr mrVar4 = this.f40599a;
                if (mrVar4 != null) {
                    mrVar4.l();
                }
                ArrayList s02 = s0();
                ArrayList arrayList6 = new ArrayList();
                sq sqVar = new sq(this, s02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i15 = 0; i15 < s02.size(); i15++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) s02.get(i15), new lf.i0(arrayList6, i15, atomicInteger, s02, sqVar, 6)), this.classGuid);
                }
            }
        }
    }

    public final ArrayList s0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.K);
        int i10 = this.L;
        if (i10 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i10 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i10 == 2) {
            TLRPC.ChatFull chatFull = this.f40640s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f40637r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f40604b1 == 1) {
                if (!this.G) {
                    this.f40619h1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.G = true;
                    arrayList.addAll(s0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.G) {
                this.f40619h1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.G = true;
                arrayList.addAll(s0());
            } else if (!this.F) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.F = true;
                arrayList.addAll(s0());
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i10 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.f20842q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void t0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4, int i10, boolean z10) {
        boolean z11;
        long j11 = this.K;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.B;
        if (tLObject == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        kq kqVar = new kq(j10, j11, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i10, z4, z11, null);
        kqVar.U0 = new zq(this, tLObject, j10, z10);
        presentFragment(kqVar, z10);
    }

    public final void u0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qr.u0():void");
    }

    public final void v0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        kr w02 = w0();
        boolean z4 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = this.J;
                arrayList = this.E;
            } else if (i10 == 1) {
                hVar = this.I;
                arrayList = this.D;
            } else {
                hVar = this.H;
                arrayList = this.C;
            }
            TLObject tLObject = (TLObject) hVar.f(j10);
            if (tLObject != null) {
                hVar.l(j10);
                arrayList.remove(tLObject);
                if (this.L == 0 && (chatFull = this.f40640s) != null) {
                    chatFull.kicked_count--;
                }
                z4 = true;
            }
        }
        if (z4) {
            A0(w02);
        }
        f2.p0 adapter = this.f40605c.getAdapter();
        pr prVar = this.f40610e;
        if (adapter == prVar) {
            uf.k1 k1Var = prVar.h;
            Object f10 = k1Var.f48622f.f(j10);
            if (f10 != null) {
                k1Var.f48621e.remove(f10);
            }
            Object f11 = k1Var.h.f(j10);
            if (f11 != null) {
                k1Var.f48623g.remove(f11);
            }
            Object f12 = prVar.f40141e.f(j10);
            if (f12 != null) {
                prVar.d.remove(f12);
            }
            prVar.l();
        }
    }

    public final kr w0() {
        kr krVar = new kr(this);
        krVar.f38496b = this.f40601a1;
        krVar.f38501i = this.U0;
        krVar.f38502j = this.V0;
        krVar.f38504l.clear();
        krVar.f38504l.addAll(this.D);
        krVar.h = this.S0;
        krVar.f38500g = this.R0;
        krVar.f38505m.clear();
        krVar.f38505m.addAll(this.E);
        krVar.f38498e = this.B0;
        krVar.f38499f = this.C0;
        krVar.f38503k.clear();
        krVar.f38503k.addAll(this.C);
        krVar.f(krVar.f38497c);
        return krVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        boolean z4;
        long j10;
        this.f40640s = chatFull;
        if (chatFull != null) {
            int k02 = k0();
            this.f40630n1 = k02;
            this.f40627m1 = k02;
            int i10 = this.f40640s.boosts_unrestrict;
            boolean z10 = false;
            if (i10 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f40632o1 = z4;
            this.f40634p1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.K));
            if (chat == null) {
                j10 = 0;
            } else {
                j10 = chat.send_paid_messages_stars;
            }
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i11 > 0) {
                z10 = true;
            }
            this.f40648v1 = z10;
            this.f40646u1 = z10;
            if (i11 <= 0) {
                j10 = 10;
            }
            long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.f40654x1 = clamp;
            this.f40651w1 = clamp;
        }
    }

    public final void y0(int i10) {
        if (!this.isPaused && this.f40657y1) {
            if (this.f40605c.getAdapter() != this.f40599a || !this.O) {
                org.telegram.ui.Components.u00 u00Var = null;
                for (int i11 = 0; i11 < this.f40605c.getChildCount(); i11++) {
                    View childAt = this.f40605c.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Components.u00) {
                        u00Var = childAt;
                    }
                }
                if (u00Var != null) {
                    this.f40605c.removeView(u00Var);
                    i10--;
                }
                this.f40605c.getViewTreeObserver().addOnPreDrawListener(new wq(this, u00Var, i10, 0));
            }
        }
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new tq(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
