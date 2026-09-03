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
public final class rr extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public nr f37955a;
    public int f37956a0;
    public int f37957a1;
    public org.telegram.ui.Components.zw0 f37958b;
    public int f37959b0;
    public final int f37960b1;
    public lh.e1 f37961c;
    public int f37962c0;
    public int f37963c1;
    public dr d;
    public int f37964d0;
    public int f37965d1;
    public qr e;
    public int f37966e0;
    public int f37967e1;
    public org.telegram.ui.ActionBar.w0 f37968f;
    public int f37969f0;
    public int f37970f1;
    public int f37971g0;
    public int f37972g1;
    public org.telegram.ui.ActionBar.w0 h;
    public int f37973h0;
    public int f37974h1;
    public int f37975i0;
    public boolean f37976i1;
    public int f37977j0;
    public kr f37978j1;
    public int f37979k0;
    public final boolean f37980k1;
    public int f37981l0;
    public boolean l1;
    public int m0;
    public int f37982m1;
    public UndoView f37983n;
    public int f37984n0;
    public int f37985n1;
    public int f37986o0;
    public boolean f37987o1;
    public int f37988p0;
    public int f37989p1;
    public int f37990q0;
    public final boolean f37991q1;
    public TLRPC.Chat f37992r;
    public int f37993r0;
    public final boolean f37994r1;
    public TLRPC.ChatFull f37995s;
    public int f37996s0;
    public boolean f37997s1;
    public boolean f37998t0;
    public boolean f37999t1;
    public int f38000u0;
    public boolean f38001u1;
    public final boolean v;
    public int f38002v0;
    public boolean f38003v1;
    public final boolean f38004w;
    public int f38005w0;
    public long f38006w1;
    public final boolean f38007x;
    public int f38008x0;
    public long f38009x1;
    public final String f38010y;
    public int f38011y0;
    public boolean f38012y1;
    public int f38013z0;
    public org.telegram.ui.Components.u00 f38014z1;

    public rr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.B = new TLRPC.TL_chatBannedRights();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.H = new a0.h();
        this.I = new a0.h();
        this.J = new a0.h();
        this.f38006w1 = 10L;
        this.f38009x1 = 10L;
        this.K = this.arguments.getLong("chat_id");
        this.L = this.arguments.getInt("type");
        this.M = this.arguments.getBoolean("transfer");
        this.f37980k1 = this.arguments.getBoolean("open_search");
        this.f37960b1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.K));
        this.f37992r = chat;
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
        this.f38010y = ChatObject.getBannedRightsString(this.B);
        boolean isCommunity = ChatObject.isCommunity(this.f37992r);
        this.f38004w = isCommunity;
        if (ChatObject.isChannel(this.f37992r) && !this.f37992r.megagroup && !isCommunity) {
            z4 = true;
        }
        this.v = z4;
        this.f38007x = ChatObject.isForum(this.f37992r);
        TLRPC.Chat chat2 = this.f37992r;
        if (chat2 != null) {
            boolean z17 = chat2.signatures;
            this.f37997s1 = z17;
            this.f37991q1 = z17;
            boolean z18 = chat2.signature_profiles;
            this.f37999t1 = z18;
            this.f37994r1 = z18;
        }
    }

    public static void U(rr rrVar, long j10) {
        if (j10 != 0) {
            rrVar.K = j10;
            rrVar.f37992r = MessagesController.getInstance(rrVar.currentAccount).getChat(Long.valueOf(j10));
            rrVar.u0();
        }
    }

    public static void V(org.telegram.ui.rr r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rr.V(org.telegram.ui.rr, android.view.View, int):void");
    }

    public static void W(rr rrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.h hVar;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = rrVar.J;
            } else if (i10 == 1) {
                hVar = rrVar.I;
            } else {
                hVar = rrVar.H;
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

    public static org.telegram.ui.ActionBar.e5 X(rr rrVar) {
        return rrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 Y(rr rrVar) {
        return rrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 Z(rr rrVar) {
        return rrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 a0(rr rrVar) {
        return rrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.e5 b0(rr rrVar) {
        return rrVar.parentLayout;
    }

    public static void c0(rr rrVar, TLRPC.User user) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        boolean z4;
        boolean z10;
        a0.h hVar2 = rrVar.H;
        ArrayList arrayList2 = rrVar.C;
        UndoView undoView = rrVar.f37983n;
        long j10 = -rrVar.K;
        boolean z11 = rrVar.v;
        if (z11) {
            i10 = 9;
        } else {
            i10 = 10;
        }
        undoView.m(j10, user, i10);
        rrVar.f37992r.creator = false;
        int i11 = 0;
        boolean z12 = false;
        while (i11 < 3) {
            boolean z13 = true;
            if (i11 == 0) {
                hVar = rrVar.J;
                arrayList = rrVar.E;
            } else if (i11 == 1) {
                hVar = rrVar.I;
                arrayList = rrVar.D;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.f19306id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j11 = user.f19306id;
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
            long clientUserId = rrVar.getUserConfig().getClientUserId();
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
                Collections.sort(arrayList, new nh.e4(16));
            }
            i11++;
            z12 = z10;
        }
        if (!z12) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.f19306id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new nh.e4(15));
            rrVar.B0();
        }
        rrVar.f37955a.l();
        kr krVar = rrVar.f37978j1;
        if (krVar != null) {
            krVar.a(user);
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

    public final void A0(lr lrVar) {
        View view;
        if (this.f37955a == null) {
            B0();
            return;
        }
        B0();
        lrVar.f(lrVar.d);
        f2.q.c(lrVar, true).b(this.f37955a);
        lh.e1 e1Var = this.f37961c;
        if (e1Var != null && this.d != null && e1Var.getChildCount() > 0) {
            int i10 = 0;
            int i11 = -1;
            while (true) {
                if (i10 < this.f37961c.getChildCount()) {
                    i11 = RecyclerView.R(this.f37961c.getChildAt(i10));
                    if (i11 != -1) {
                        view = this.f37961c.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i11, view.getTop() - this.f37961c.getPaddingTop());
            }
        }
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rr.B0():void");
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
        int i11 = this.f37960b1;
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
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 22));
        if (i11 == 0 && i12 != 2 && i12 != 0 && i12 != 3) {
            if (i12 == 1 && ChatObject.isChannelAndNotMegaGroup(this.f37992r) && ChatObject.hasAdminRights(this.f37992r)) {
                this.h = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else {
            this.e = new qr(this, context);
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.E = new hb(this, 2);
            this.f37968f = a2;
            if (i12 == 0 && !this.O) {
                a2.setVisibility(8);
            }
            if (i12 == 3) {
                this.f37968f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f37968f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.f37992r) && !this.f37992r.creator) {
                this.f37968f.setVisibility(8);
            }
            if (i12 == 3) {
                this.h = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19827a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.f38014z1 = u00Var;
        u00Var.setViewType(6);
        org.telegram.ui.Components.u00 u00Var2 = this.f38014z1;
        u00Var2.f29071w = false;
        u00Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.u00 u00Var3 = this.f38014z1;
        int i13 = org.telegram.ui.ActionBar.j6.G8;
        int i14 = org.telegram.ui.ActionBar.j6.f19971i6;
        u00Var3.f(i13, i14, i14);
        frameLayout3.addView(this.f38014z1, k7.b6.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.A1 = radialProgressView;
        frameLayout3.addView(radialProgressView, k7.b6.e(-2, -2, 17));
        this.f38014z1.setVisibility(8);
        this.A1.setVisibility(8);
        org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(context, frameLayout3, 1, null);
        this.f37958b = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.f37958b.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f37958b.setVisibility(8);
        this.f37958b.setAnimateLayoutChange(true);
        this.f37958b.e(true, false);
        frameLayout2.addView(this.f37958b, k7.b6.c(-1.0f, -1));
        this.f37958b.addView(frameLayout3, 0);
        lh.e1 e1Var = new lh.e1(this, context, 7);
        this.f37961c = e1Var;
        e1Var.o1();
        lh.e1 e1Var2 = this.f37961c;
        dr drVar = new dr(this);
        this.d = drVar;
        e1Var2.setLayoutManager(drVar);
        er erVar = new er(this);
        erVar.n(420L);
        erVar.o(org.telegram.ui.Components.mr.h);
        erVar.C = false;
        erVar.f5807m = false;
        this.f37961c.setItemAnimator(erVar);
        lh.e1 e1Var3 = this.f37961c;
        e1Var3.V1 = true;
        e1Var3.W1 = 0;
        nr nrVar = new nr(this, context);
        this.f37955a = nrVar;
        e1Var3.setAdapter(nrVar);
        lh.e1 e1Var4 = this.f37961c;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        e1Var4.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f37961c, k7.b6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f37961c);
        this.f37961c.setOnItemClickListener(new oq(this, 3));
        this.f37961c.setOnItemLongClickListener(new oq(this, 4));
        if (this.f37968f != null) {
            this.f37961c.setOnScrollListener(new n3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.f37983n = undoView;
        frameLayout2.addView(undoView, k7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        B0();
        this.f37961c.setEmptyView(this.f37958b);
        lh.e1 e1Var5 = this.f37961c;
        e1Var5.V1 = false;
        e1Var5.W1 = 0;
        if (this.f37980k1) {
            this.f37968f.z(false);
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
            if (chatFull.f19160id == this.K) {
                if (!booleanValue || !ChatObject.isChannel(this.f37992r)) {
                    if (this.f37995s != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f37995s = chatFull;
                    if (!z4) {
                        int k02 = k0();
                        this.f37985n1 = k02;
                        this.f37982m1 = k02;
                        int i12 = this.f37995s.boosts_unrestrict;
                        if (i12 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f37987o1 = z10;
                        this.f37989p1 = i12;
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
                        this.f38003v1 = z11;
                        this.f38001u1 = z11;
                        if (i13 <= 0) {
                            j10 = 10;
                        }
                        long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                        this.f38009x1 = clamp;
                        this.f38006w1 = clamp;
                    }
                    AndroidUtilities.runOnUIThread(new mq(this, 0));
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.K)) {
            org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
            if (e5Var != null && e5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final boolean g0(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rr.g0(boolean):boolean");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.z9.class, org.telegram.ui.Components.uv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        int i10 = org.telegram.ui.ActionBar.j6.f19846b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 32, new Class[]{org.telegram.ui.Cells.z8.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.t3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19918f7));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.z9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20273z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f20256y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, null, null, -1, fVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20060n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37983n, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i13 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37983n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37983n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37983n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37983n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37983n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37983n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20042m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20182u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20200v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Components.zw0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Components.zw0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37958b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37958b.e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37961c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, null, org.telegram.ui.ActionBar.j6.f20126r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
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
        rr rrVar;
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
        if (tLObject == null || (i10 = this.f37960b1) != 0) {
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
                z10 = ChatObject.canAddAdmins(this.f37992r);
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
            if (ChatObject.canAddAdmins(this.f37992r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z10)) {
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
            if (ChatObject.canBlockUsers(this.f37992r) && z14 && !z20 && ChatObject.isChannel(this.f37992r) && !this.f37992r.gigagroup) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (i10 == 0) {
                z13 = (!UserObject.isDeleted(user)) & z13;
            }
            if (!z13 && (!ChatObject.canBlockUsers(this.f37992r) || !z14)) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (!z4 && z17) {
                boolean z22 = z16;
                vq vqVar = new vq(this, j12, i11, tLObject, tL_chatAdminRights, tL_chatBannedRights2, str, z14);
                long j13 = j12;
                org.telegram.ui.Components.p70 H = org.telegram.ui.Components.p70.H(this, view);
                H.W(this.f37961c.U0(view, false));
                int i17 = R.drawable.msg_admins;
                if (z15) {
                    i13 = R.string.EditAdminRights;
                } else {
                    i13 = R.string.SetAsAdmin;
                }
                H.l(i17, LocaleController.getString(i13), new bj(vqVar, 11), z13);
                H.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new kh((Object) this, (Object) tLObject, (Object) user, (Object) vqVar, 4), z22);
                if (ChatObject.canBlockUsers(this.f37992r) && z14) {
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
        org.telegram.ui.Components.p70 H2 = org.telegram.ui.Components.p70.H(this, view);
        if (i16 == 3 && ChatObject.canBlockUsers(this.f37992r)) {
            rrVar = this;
            H2.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new kh.g1(rrVar, j14, tL_chatBannedRights, str, tLObject, 9), false);
            H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(rrVar) {
                public final rr f36572b;

                {
                    this.f36572b = rrVar;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f36572b.i0(j14);
                            return;
                        case 1:
                            rr rrVar2 = this.f36572b;
                            long j15 = j14;
                            rrVar2.i0(j15);
                            rrVar2.getMessagesController().addUserToChat(rrVar2.K, rrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, rrVar2, null);
                            return;
                        case 2:
                            this.f36572b.i0(j14);
                            return;
                        default:
                            rr rrVar3 = this.f36572b;
                            MessagesController messagesController = rrVar3.getMessagesController();
                            long j16 = rrVar3.K;
                            MessagesController messagesController2 = rrVar3.getMessagesController();
                            long j17 = j14;
                            messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !rrVar3.v, rrVar3, false, false, null, null);
                            rrVar3.v0(j17);
                            return;
                    }
                }
            }, true);
        } else {
            String str3 = str;
            rrVar = this;
            if (i16 == 0 && ChatObject.canBlockUsers(rrVar.f37992r)) {
                if (ChatObject.canAddUsers(rrVar.f37992r) && i15 > 0 && !ChatObject.isCommunity(rrVar.f37992r)) {
                    int i19 = R.drawable.msg_contact_add;
                    if (z20) {
                        i12 = R.string.ChannelAddToChannel;
                    } else {
                        i12 = R.string.ChannelAddToGroup;
                    }
                    H2.c(i19, LocaleController.getString(i12), new Runnable(rrVar) {
                        public final rr f36572b;

                        {
                            this.f36572b = rrVar;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    this.f36572b.i0(j14);
                                    return;
                                case 1:
                                    rr rrVar2 = this.f36572b;
                                    long j15 = j14;
                                    rrVar2.i0(j15);
                                    rrVar2.getMessagesController().addUserToChat(rrVar2.K, rrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, rrVar2, null);
                                    return;
                                case 2:
                                    this.f36572b.i0(j14);
                                    return;
                                default:
                                    rr rrVar3 = this.f36572b;
                                    MessagesController messagesController = rrVar3.getMessagesController();
                                    long j16 = rrVar3.K;
                                    MessagesController messagesController2 = rrVar3.getMessagesController();
                                    long j17 = j14;
                                    messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !rrVar3.v, rrVar3, false, false, null, null);
                                    rrVar3.v0(j17);
                                    return;
                            }
                        }
                    }, false);
                }
                H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(rrVar) {
                    public final rr f36572b;

                    {
                        this.f36572b = rrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f36572b.i0(j14);
                                return;
                            case 1:
                                rr rrVar2 = this.f36572b;
                                long j15 = j14;
                                rrVar2.i0(j15);
                                rrVar2.getMessagesController().addUserToChat(rrVar2.K, rrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, rrVar2, null);
                                return;
                            case 2:
                                this.f36572b.i0(j14);
                                return;
                            default:
                                rr rrVar3 = this.f36572b;
                                MessagesController messagesController = rrVar3.getMessagesController();
                                long j16 = rrVar3.K;
                                MessagesController messagesController2 = rrVar3.getMessagesController();
                                long j17 = j14;
                                messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !rrVar3.v, rrVar3, false, false, null, null);
                                rrVar3.v0(j17);
                                return;
                        }
                    }
                }, true);
            } else if (i16 == 1 && ChatObject.canAddAdmins(rrVar.f37992r) && z10) {
                if (!rrVar.f37992r.creator && (tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    j11 = j14;
                } else {
                    j11 = j14;
                    H2.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new kh.g1(rrVar, j11, tL_chatAdminRights2, str3, tLObject, 10), false);
                }
                H2.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(rrVar) {
                    public final rr f36572b;

                    {
                        this.f36572b = rrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f36572b.i0(j11);
                                return;
                            case 1:
                                rr rrVar2 = this.f36572b;
                                long j15 = j11;
                                rrVar2.i0(j15);
                                rrVar2.getMessagesController().addUserToChat(rrVar2.K, rrVar2.getMessagesController().getUser(Long.valueOf(j15)), 0, null, rrVar2, null);
                                return;
                            case 2:
                                this.f36572b.i0(j11);
                                return;
                            default:
                                rr rrVar3 = this.f36572b;
                                MessagesController messagesController = rrVar3.getMessagesController();
                                long j16 = rrVar3.K;
                                MessagesController messagesController2 = rrVar3.getMessagesController();
                                long j17 = j11;
                                messagesController.setUserAdminRole(j16, messagesController2.getUser(Long.valueOf(j17)), new TLRPC.TL_chatAdminRights(), "", !rrVar3.v, rrVar3, false, false, null, null);
                                rrVar3.v0(j17);
                                return;
                        }
                    }
                }, true);
            }
        }
        H2.W(rrVar.f37961c.U0(view, false));
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
        if (this.f38004w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.K);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new Object(), new f5(this, 5));
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
        TLRPC.ChatFull chatFull = this.f37995s;
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
        TLRPC.ChatFull chatFull = this.f37995s;
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
        if (this.f37987o1 && q0()) {
            z4 = true;
        } else {
            z4 = false;
        }
        TLRPC.ChatFull chatFull = this.f37995s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.f37989p1;
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
        UndoView undoView = this.f37983n;
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
        this.f37961c.setPadding(0, 0, 0, i13);
        this.f37961c.setClipToPadding(false);
        this.f37983n.setTranslationY(-i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.f37983n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        nr nrVar = this.f37955a;
        if (nrVar != null) {
            nrVar.l();
        }
        org.telegram.ui.Components.zw0 zw0Var = this.f37958b;
        if (zw0Var != null) {
            zw0Var.requestLayout();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            this.f38012y1 = true;
        }
        if (z4 && !z10 && this.f37980k1) {
            this.f37968f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f37968f.getSearchField());
            this.f37968f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        if (i10 != this.S && i10 != this.T && i10 != this.U && i10 != this.V && i10 != this.W && i10 != this.X && i10 != this.f37973h0 && i10 != this.Y && i10 != this.Z && i10 != this.f37956a0) {
            return false;
        }
        return true;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.f37992r;
        if (chat.megagroup && !chat.gigagroup && ChatObject.canUserDoAdminAction(chat, 13)) {
            if (this.f37982m1 <= 0) {
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
            boolean z4 = this.f38004w;
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
                nr nrVar = this.f37955a;
                if (nrVar != null) {
                    nrVar.l();
                }
            } else if (!ChatObject.isChannel(this.f37992r)) {
                this.N = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                if (i11 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f37995s;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i10 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f37995s.participants.participants.get(i10);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            hVar3.k(chatParticipant, chatParticipant.user_id);
                            i10++;
                        }
                    }
                } else if (i11 == 2 && (chatFull = this.f37995s) != null && chatFull.participants != null) {
                    long j10 = getUserConfig().clientUserId;
                    int size4 = this.f37995s.participants.participants.size();
                    while (i10 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f37995s.participants.participants.get(i10);
                        int i14 = this.f37960b1;
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
                nr nrVar2 = this.f37955a;
                if (nrVar2 != null) {
                    nrVar2.l();
                }
                B0();
                nr nrVar3 = this.f37955a;
                if (nrVar3 != null) {
                    nrVar3.l();
                }
            } else {
                this.N = true;
                org.telegram.ui.Components.zw0 zw0Var = this.f37958b;
                if (zw0Var != null) {
                    zw0Var.e(true, false);
                }
                nr nrVar4 = this.f37955a;
                if (nrVar4 != null) {
                    nrVar4.l();
                }
                ArrayList s02 = s0();
                ArrayList arrayList6 = new ArrayList();
                tq tqVar = new tq(this, s02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i15 = 0; i15 < s02.size(); i15++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) s02.get(i15), new kf.i0(arrayList6, i15, atomicInteger, s02, tqVar, 6)), this.classGuid);
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
            TLRPC.ChatFull chatFull = this.f37995s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f37992r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f37960b1 == 1) {
                if (!this.G) {
                    this.f37974h1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.G = true;
                    arrayList.addAll(s0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.G) {
                this.f37974h1 = 3;
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
        tL_channels_getParticipants.filter.f19158q = "";
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
        lq lqVar = new lq(j10, j11, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i10, z4, z11, null);
        lqVar.U0 = new ar(this, tLObject, j10, z10);
        presentFragment(lqVar, z10);
    }

    public final void u0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rr.u0():void");
    }

    public final void v0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        lr w02 = w0();
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
                if (this.L == 0 && (chatFull = this.f37995s) != null) {
                    chatFull.kicked_count--;
                }
                z4 = true;
            }
        }
        if (z4) {
            A0(w02);
        }
        f2.o0 adapter = this.f37961c.getAdapter();
        qr qrVar = this.e;
        if (adapter == qrVar) {
            tf.j1 j1Var = qrVar.h;
            Object f10 = j1Var.f44822f.f(j10);
            if (f10 != null) {
                j1Var.e.remove(f10);
            }
            Object f11 = j1Var.h.f(j10);
            if (f11 != null) {
                j1Var.f44823g.remove(f11);
            }
            Object f12 = qrVar.e.f(j10);
            if (f12 != null) {
                qrVar.d.remove(f12);
            }
            qrVar.l();
        }
    }

    public final lr w0() {
        lr lrVar = new lr(this);
        lrVar.f35898b = this.f37957a1;
        lrVar.f35902i = this.U0;
        lrVar.f35903j = this.V0;
        lrVar.f35905l.clear();
        lrVar.f35905l.addAll(this.D);
        lrVar.h = this.S0;
        lrVar.f35901g = this.R0;
        lrVar.f35906m.clear();
        lrVar.f35906m.addAll(this.E);
        lrVar.e = this.B0;
        lrVar.f35900f = this.C0;
        lrVar.f35904k.clear();
        lrVar.f35904k.addAll(this.C);
        lrVar.f(lrVar.f35899c);
        return lrVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        boolean z4;
        long j10;
        this.f37995s = chatFull;
        if (chatFull != null) {
            int k02 = k0();
            this.f37985n1 = k02;
            this.f37982m1 = k02;
            int i10 = this.f37995s.boosts_unrestrict;
            boolean z10 = false;
            if (i10 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f37987o1 = z4;
            this.f37989p1 = i10;
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
            this.f38003v1 = z10;
            this.f38001u1 = z10;
            if (i11 <= 0) {
                j10 = 10;
            }
            long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.f38009x1 = clamp;
            this.f38006w1 = clamp;
        }
    }

    public final void y0(int i10) {
        if (!this.isPaused && this.f38012y1) {
            if (this.f37961c.getAdapter() != this.f37955a || !this.O) {
                org.telegram.ui.Components.u00 u00Var = null;
                for (int i11 = 0; i11 < this.f37961c.getChildCount(); i11++) {
                    View childAt = this.f37961c.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Components.u00) {
                        u00Var = childAt;
                    }
                }
                if (u00Var != null) {
                    this.f37961c.removeView(u00Var);
                    i10--;
                }
                this.f37961c.getViewTreeObserver().addOnPreDrawListener(new xq(this, u00Var, i10, 0));
            }
        }
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new uq(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
