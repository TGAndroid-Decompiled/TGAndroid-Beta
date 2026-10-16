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
public final class yr extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public long A1;
    public int B0;
    public boolean B1;
    public int C0;
    public org.telegram.ui.Components.f10 C1;
    public int D0;
    public RadialProgressView D1;
    public TLRPC.TL_chatBannedRights E;
    public int E0;
    public final ArrayList F;
    public int F0;
    public final ArrayList G;
    public int G0;
    public final ArrayList H;
    public int H0;
    public boolean I;
    public boolean I0;
    public boolean J;
    public int J0;
    public final a0.h K;
    public int K0;
    public final a0.h L;
    public int L0;
    public final a0.h M;
    public int M0;
    public long N;
    public int N0;
    public final int O;
    public int O0;
    public final boolean P;
    public int P0;
    public boolean Q;
    public int Q0;
    public boolean R;
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
    public ur f41889a;
    public int f41890a0;
    public int f41891a1;
    public org.telegram.ui.Components.wx0 f41892b;
    public int f41893b0;
    public int f41894b1;
    public bi.o0 f41895c;
    public int f41896c0;
    public int f41897c1;
    public hg.i0 d;
    public int f41898d0;
    public int f41899d1;
    public xr e;
    public int f41900e0;
    public final int f41901e1;
    public org.telegram.ui.ActionBar.u0 f41902f;
    public int f41903f0;
    public int f41904f1;
    public int f41905g0;
    public int f41906g1;
    public org.telegram.ui.ActionBar.u0 h;
    public int f41907h0;
    public int f41908h1;
    public int f41909i0;
    public int f41910i1;
    public int f41911j0;
    public int f41912j1;
    public int f41913k0;
    public int f41914k1;
    public int f41915l0;
    public boolean l1;
    public int m0;
    public rr f41916m1;
    public UndoView f41917n;
    public int f41918n0;
    public final boolean f41919n1;
    public int f41920o0;
    public boolean f41921o1;
    public int f41922p0;
    public int f41923p1;
    public int f41924q0;
    public int f41925q1;
    public TLRPC.Chat f41926r;
    public int f41927r0;
    public boolean f41928r1;
    public TLRPC.ChatFull f41929s;
    public int f41930s0;
    public int f41931s1;
    public int f41932t0;
    public final boolean f41933t1;
    public int f41934u0;
    public final boolean f41935u1;
    public final boolean v;
    public int f41936v0;
    public boolean f41937v1;
    public final boolean f41938w;
    public boolean f41939w0;
    public boolean f41940w1;
    public final boolean f41941x;
    public int f41942x0;
    public boolean f41943x1;
    public final String f41944y;
    public int f41945y0;
    public boolean f41946y1;
    public int f41947z0;
    public long f41948z1;

    public yr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.E = new TLRPC.TL_chatBannedRights();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.K = new a0.h();
        this.L = new a0.h();
        this.M = new a0.h();
        this.f41948z1 = 10L;
        this.A1 = 10L;
        this.N = this.arguments.getLong("chat_id");
        this.O = this.arguments.getInt("type");
        this.P = this.arguments.getBoolean("transfer");
        this.f41919n1 = this.arguments.getBoolean("open_search");
        this.f41901e1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
        this.f41926r = chat;
        boolean z10 = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z11 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z11;
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
            boolean z12 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z12;
            boolean z13 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z13;
            boolean z14 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z14;
            boolean z15 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z15;
            boolean z16 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z16;
            boolean z17 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z17;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z11 && z17 && z16 && z15 && z14 && z13 && z12) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.f41944y = ChatObject.getBannedRightsString(this.E);
        boolean isCommunity = ChatObject.isCommunity(this.f41926r);
        this.f41938w = isCommunity;
        if (ChatObject.isChannel(this.f41926r) && !this.f41926r.megagroup && !isCommunity) {
            z10 = true;
        }
        this.v = z10;
        this.f41941x = ChatObject.isForum(this.f41926r);
        TLRPC.Chat chat2 = this.f41926r;
        if (chat2 != null) {
            boolean z18 = chat2.signatures;
            this.f41937v1 = z18;
            this.f41933t1 = z18;
            boolean z19 = chat2.signature_profiles;
            this.f41940w1 = z19;
            this.f41935u1 = z19;
        }
    }

    public static void U(yr yrVar, long j10) {
        if (j10 != 0) {
            yrVar.N = j10;
            yrVar.f41926r = MessagesController.getInstance(yrVar.currentAccount).getChat(Long.valueOf(j10));
            yrVar.u0();
        }
    }

    public static void V(org.telegram.ui.yr r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yr.V(org.telegram.ui.yr, android.view.View, int):void");
    }

    public static void W(yr yrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.h hVar;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = yrVar.M;
            } else if (i10 == 1) {
                hVar = yrVar.L;
            } else {
                hVar = yrVar.K;
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

    public static org.telegram.ui.ActionBar.b5 X(yr yrVar) {
        return yrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 Y(yr yrVar) {
        return yrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 Z(yr yrVar) {
        return yrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 a0(yr yrVar) {
        return yrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.b5 b0(yr yrVar) {
        return yrVar.parentLayout;
    }

    public static void c0(yr yrVar, TLRPC.User user) {
        int i10;
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = yrVar.K;
        ArrayList arrayList2 = yrVar.F;
        UndoView undoView = yrVar.f41917n;
        long j10 = -yrVar.N;
        boolean z12 = yrVar.v;
        if (z12) {
            i10 = 9;
        } else {
            i10 = 10;
        }
        undoView.m(j10, user, i10);
        boolean z13 = false;
        yrVar.f41926r.creator = false;
        int i11 = 0;
        boolean z14 = false;
        while (i11 < 3) {
            boolean z15 = true;
            if (i11 == 0) {
                hVar = yrVar.M;
                arrayList = yrVar.H;
            } else if (i11 == 1) {
                hVar = yrVar.L;
                arrayList = yrVar.G;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.f19063id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j11 = user.f19063id;
                tL_peerUser.user_id = j11;
                hVar.k(tL_channelParticipantCreator, j11);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z14 = true;
                z10 = true;
            } else {
                z10 = z13;
            }
            long clientUserId = yrVar.getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) hVar.f(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
                z11 = z14;
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
                if (!z12) {
                    tL_chatAdminRights.manage_call = true;
                }
                hVar.k(tL_channelParticipantAdmin, clientUserId);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z14;
                z15 = z10;
            }
            if (z15) {
                Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(9));
            }
            i11++;
            z14 = z11;
            z13 = false;
        }
        if (!z14) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j12 = user.f19063id;
            tL_peerUser3.user_id = j12;
            hVar2.k(tL_channelParticipantCreator2, j12);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new org.telegram.ui.ActionBar.l5(8));
            yrVar.B0();
        }
        yrVar.f41889a.l();
        rr rrVar = yrVar.f41916m1;
        if (rrVar != null) {
            rrVar.a(user);
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

    public final void A0(sr srVar) {
        View view;
        if (this.f41889a == null) {
            B0();
            return;
        }
        B0();
        srVar.f(srVar.d);
        s4.o.c(srVar, true).c(this.f41889a);
        bi.o0 o0Var = this.f41895c;
        if (o0Var != null && this.d != null && o0Var.getChildCount() > 0) {
            int i10 = 0;
            int i11 = -1;
            while (true) {
                if (i10 < this.f41895c.getChildCount()) {
                    i11 = RecyclerView.R(this.f41895c.getChildAt(i10));
                    if (i11 != -1) {
                        view = this.f41895c.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i11, view.getTop() - this.f41895c.getPaddingTop());
            }
        }
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yr.B0():void");
    }

    @Override
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override
    public final View createView(Context context) {
        this.f41921o1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f41901e1;
        int i12 = this.O;
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
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 7));
        if (i11 == 0 && i12 != 2 && i12 != 0 && i12 != 3) {
            if (i12 == 1 && ChatObject.isChannelAndNotMegaGroup(this.f41926r) && ChatObject.hasAdminRights(this.f41926r)) {
                this.h = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else {
            this.e = new xr(this, context);
            org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
            org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new ig.d2(this, 3);
            this.f41902f = a2;
            if (i12 == 0 && !this.R) {
                a2.setVisibility(8);
            }
            if (i12 == 3) {
                this.f41902f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f41902f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.f41926r) && !this.f41926r.creator) {
                this.f41902f.setVisibility(8);
            }
            if (i12 == 3) {
                this.h = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, null);
        this.C1 = f10Var;
        f10Var.setViewType(6);
        org.telegram.ui.Components.f10 f10Var2 = this.C1;
        f10Var2.f24549w = false;
        f10Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.f10 f10Var3 = this.C1;
        int i13 = org.telegram.ui.ActionBar.g6.G8;
        int i14 = org.telegram.ui.ActionBar.g6.f19690i6;
        f10Var3.f(i13, i14, i14);
        frameLayout3.addView(this.C1, w7.z5.a(-1.0f, 12.0f, 30.0f, 12.0f, 0.0f, -1, 0));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D1 = radialProgressView;
        frameLayout3.addView(radialProgressView, w7.z5.e(-2, -2, 17));
        this.C1.setVisibility(8);
        this.D1.setVisibility(8);
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, frameLayout3, 1, null);
        this.f41892b = wx0Var;
        wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.f41892b.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f41892b.setVisibility(8);
        this.f41892b.setAnimateLayoutChange(true);
        this.f41892b.e(true, false);
        frameLayout2.addView(this.f41892b, w7.z5.d(-1.0f, -1));
        this.f41892b.addView(frameLayout3, 0);
        bi.o0 o0Var = new bi.o0(this, context, 9);
        this.f41895c = o0Var;
        o0Var.p1();
        bi.o0 o0Var2 = this.f41895c;
        hg.i0 i0Var = new hg.i0(this);
        this.d = i0Var;
        o0Var2.setLayoutManager(i0Var);
        lr lrVar = new lr(this);
        lrVar.n(420L);
        lrVar.o(org.telegram.ui.Components.es.h);
        lrVar.C = false;
        lrVar.f44872m = false;
        this.f41895c.setItemAnimator(lrVar);
        bi.o0 o0Var3 = this.f41895c;
        o0Var3.W1 = true;
        o0Var3.X1 = 0;
        ur urVar = new ur(this, context);
        this.f41889a = urVar;
        o0Var3.setAdapter(urVar);
        bi.o0 o0Var4 = this.f41895c;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        o0Var4.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f41895c, w7.z5.d(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f41895c);
        this.f41895c.setOnItemClickListener(new wq(this, 3));
        this.f41895c.setOnItemLongClickListener(new wq(this, 4));
        if (this.f41902f != null) {
            this.f41895c.setOnScrollListener(new k3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.f41917n = undoView;
        frameLayout2.addView(undoView, w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        B0();
        this.f41895c.setEmptyView(this.f41892b);
        bi.o0 o0Var5 = this.f41895c;
        o0Var5.W1 = false;
        o0Var5.X1 = 0;
        if (this.f41919n1) {
            this.f41902f.z(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12 = false;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.f18917id == this.N) {
                if (!booleanValue || !ChatObject.isChannel(this.f41926r)) {
                    if (this.f41929s != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f41929s = chatFull;
                    if (!z10) {
                        int k02 = k0();
                        this.f41925q1 = k02;
                        this.f41923p1 = k02;
                        int i12 = this.f41929s.boosts_unrestrict;
                        if (i12 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f41928r1 = z11;
                        this.f41931s1 = i12;
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
                        if (chat == null) {
                            j10 = 0;
                        } else {
                            j10 = chat.send_paid_messages_stars;
                        }
                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i13 > 0) {
                            z12 = true;
                        }
                        this.f41946y1 = z12;
                        this.f41943x1 = z12;
                        if (i13 <= 0) {
                            j10 = 10;
                        }
                        long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
                        this.A1 = clamp;
                        this.f41948z1 = clamp;
                    }
                    AndroidUtilities.runOnUIThread(new uq(this, 0));
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.N)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var != null && b5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final boolean g0(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yr.g0(boolean):boolean");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.ca.class, org.telegram.ui.Components.sw0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        int i10 = org.telegram.ui.ActionBar.g6.f19563b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f7));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20005z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.f19988y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.g6.f19784n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41917n, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i13 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41917n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41917n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41917n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41917n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41917n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41917n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19764m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19916u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19933v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Components.wx0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Components.wx0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41892b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41892b.e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41895c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.g6.f19852r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    public final boolean h0(TLObject tLObject, boolean z10, View view) {
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j10;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z11;
        int i11;
        yr yrVar;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        long j11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i13;
        boolean z19;
        String str2;
        int i14;
        if (tLObject == null || (i10 = this.f41901e1) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            j10 = MessageObject.getPeerId(channelParticipant.peer);
            boolean z20 = channelParticipant.can_edit;
            tL_chatBannedRights = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i11 = channelParticipant.date;
            str = channelParticipant.rank;
            z11 = z20;
        } else {
            tL_chatBannedRights = null;
            if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                j10 = chatParticipant.user_id;
                i11 = chatParticipant.date;
                str = "";
                z11 = ChatObject.canAddAdmins(this.f41926r);
                tL_chatAdminRights = null;
            } else {
                j10 = 0;
                str = null;
                tL_chatAdminRights = null;
                z11 = false;
                i11 = 0;
            }
        }
        int i15 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i15 == 0 || j10 == getUserConfig().getClientUserId()) {
            return false;
        }
        boolean z21 = this.v;
        int i16 = this.O;
        if (i16 == 2) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (ChatObject.canAddAdmins(this.f41926r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11)) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z22 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
            if ((!z22 && !(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z11) {
                z14 = z13;
                j11 = j10;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z15 = true;
            } else {
                z14 = z13;
                j11 = j10;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z15 = false;
            }
            if (!z22 && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (ChatObject.canBlockUsers(this.f41926r) && z15 && !z21 && ChatObject.isChannel(this.f41926r) && !this.f41926r.gigagroup) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i10 == 0) {
                z14 = (!UserObject.isDeleted(user)) & z14;
            }
            if (!z14 && (!ChatObject.canBlockUsers(this.f41926r) || !z15)) {
                z18 = false;
            } else {
                z18 = true;
            }
            if (!z10 && z18) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
                boolean z23 = z17;
                dr drVar = new dr(this, j11, i11, tLObject, tL_chatAdminRights2, tL_chatBannedRights2, str, z15);
                long j12 = j11;
                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(this, view);
                H.W(this.f41895c.V0(view, false));
                int i17 = R.drawable.msg_admins;
                if (z16) {
                    i13 = R.string.EditAdminRights;
                } else {
                    i13 = R.string.SetAsAdmin;
                }
                H.l(i17, LocaleController.getString(i13), new gj(drVar, 12), z14);
                H.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new p6(this, tLObject, user, drVar, 11), z23);
                if (ChatObject.canBlockUsers(this.f41926r) && z15) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                int i18 = R.drawable.msg_remove;
                if (z21) {
                    str2 = "ChannelRemoveUser";
                    i14 = R.string.ChannelRemoveUser;
                } else {
                    str2 = "KickFromGroup";
                    i14 = R.string.KickFromGroup;
                }
                H.m(z19, i18, LocaleController.getString(str2, i14), true, new a3.i0(this, user, j12, 15));
                H.S = 190;
                H.Z();
                return true;
            }
            return z18;
        }
        boolean z24 = z11;
        final long j13 = j10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
        org.telegram.ui.Components.l80 H2 = org.telegram.ui.Components.l80.H(this, view);
        if (i16 == 3 && ChatObject.canBlockUsers(this.f41926r)) {
            yrVar = this;
            H2.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new org.telegram.messenger.voip.f(yrVar, j13, (TLObject) tL_chatBannedRights3, str, tLObject, 1), false);
            H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(yrVar) {
                public final yr f40749b;

                {
                    this.f40749b = yrVar;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f40749b.i0(j13);
                            return;
                        case 1:
                            yr yrVar2 = this.f40749b;
                            long j14 = j13;
                            yrVar2.i0(j14);
                            yrVar2.getMessagesController().addUserToChat(yrVar2.N, yrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, yrVar2, null);
                            return;
                        case 2:
                            this.f40749b.i0(j13);
                            return;
                        default:
                            yr yrVar3 = this.f40749b;
                            MessagesController messagesController = yrVar3.getMessagesController();
                            long j15 = yrVar3.N;
                            MessagesController messagesController2 = yrVar3.getMessagesController();
                            long j16 = j13;
                            messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !yrVar3.v, yrVar3, false, false, null, null);
                            yrVar3.v0(j16);
                            return;
                    }
                }
            }, true);
        } else {
            String str3 = str;
            yrVar = this;
            if (i16 == 0 && ChatObject.canBlockUsers(yrVar.f41926r)) {
                if (ChatObject.canAddUsers(yrVar.f41926r) && i15 > 0 && !ChatObject.isCommunity(yrVar.f41926r)) {
                    int i19 = R.drawable.msg_contact_add;
                    if (z21) {
                        i12 = R.string.ChannelAddToChannel;
                    } else {
                        i12 = R.string.ChannelAddToGroup;
                    }
                    H2.c(i19, LocaleController.getString(i12), new Runnable(yrVar) {
                        public final yr f40749b;

                        {
                            this.f40749b = yrVar;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    this.f40749b.i0(j13);
                                    return;
                                case 1:
                                    yr yrVar2 = this.f40749b;
                                    long j14 = j13;
                                    yrVar2.i0(j14);
                                    yrVar2.getMessagesController().addUserToChat(yrVar2.N, yrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, yrVar2, null);
                                    return;
                                case 2:
                                    this.f40749b.i0(j13);
                                    return;
                                default:
                                    yr yrVar3 = this.f40749b;
                                    MessagesController messagesController = yrVar3.getMessagesController();
                                    long j15 = yrVar3.N;
                                    MessagesController messagesController2 = yrVar3.getMessagesController();
                                    long j16 = j13;
                                    messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !yrVar3.v, yrVar3, false, false, null, null);
                                    yrVar3.v0(j16);
                                    return;
                            }
                        }
                    }, false);
                }
                H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(yrVar) {
                    public final yr f40749b;

                    {
                        this.f40749b = yrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f40749b.i0(j13);
                                return;
                            case 1:
                                yr yrVar2 = this.f40749b;
                                long j14 = j13;
                                yrVar2.i0(j14);
                                yrVar2.getMessagesController().addUserToChat(yrVar2.N, yrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, yrVar2, null);
                                return;
                            case 2:
                                this.f40749b.i0(j13);
                                return;
                            default:
                                yr yrVar3 = this.f40749b;
                                MessagesController messagesController = yrVar3.getMessagesController();
                                long j15 = yrVar3.N;
                                MessagesController messagesController2 = yrVar3.getMessagesController();
                                long j16 = j13;
                                messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !yrVar3.v, yrVar3, false, false, null, null);
                                yrVar3.v0(j16);
                                return;
                        }
                    }
                }, true);
            } else if (i16 == 1 && ChatObject.canAddAdmins(yrVar.f41926r) && z24) {
                if (yrVar.f41926r.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    H2.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new org.telegram.messenger.voip.f(yrVar, j13, (TLObject) tL_chatAdminRights3, str3, tLObject, 2), false);
                }
                H2.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(yrVar) {
                    public final yr f40749b;

                    {
                        this.f40749b = yrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f40749b.i0(j13);
                                return;
                            case 1:
                                yr yrVar2 = this.f40749b;
                                long j14 = j13;
                                yrVar2.i0(j14);
                                yrVar2.getMessagesController().addUserToChat(yrVar2.N, yrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, yrVar2, null);
                                return;
                            case 2:
                                this.f40749b.i0(j13);
                                return;
                            default:
                                yr yrVar3 = this.f40749b;
                                MessagesController messagesController = yrVar3.getMessagesController();
                                long j15 = yrVar3.N;
                                MessagesController messagesController2 = yrVar3.getMessagesController();
                                long j16 = j13;
                                messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !yrVar3.v, yrVar3, false, false, null, null);
                                yrVar3.v0(j16);
                                return;
                        }
                    }
                }, true);
            }
        }
        H2.W(yrVar.f41895c.V0(view, false));
        H2.S = 190;
        if (H2.x() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 && z12) {
            H2.Z();
            return true;
        }
        return z12;
    }

    public final void i0(long j10) {
        if (this.f41938w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j10);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.N);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new Object(), new f5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j10);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.N);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new m(this, 4));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        TLRPC.ChatFull chatFull = this.f41929s;
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
        TLRPC.ChatFull chatFull = this.f41929s;
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
        boolean z10;
        if (this.f41928r1 && q0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        TLRPC.ChatFull chatFull = this.f41929s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.f41931s1;
            if (i10 != i11 || ((z10 && i11 == 0) || (!z10 && i11 != 0))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return g0(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.f41917n;
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
        this.f41895c.setPadding(0, 0, 0, i13);
        this.f41895c.setClipToPadding(false);
        this.f41917n.setTranslationY(-i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.f41917n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ur urVar = this.f41889a;
        if (urVar != null) {
            urVar.l();
        }
        org.telegram.ui.Components.wx0 wx0Var = this.f41892b;
        if (wx0Var != null) {
            wx0Var.requestLayout();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.B1 = true;
        }
        if (z10 && !z11 && this.f41919n1) {
            this.f41902f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f41902f.getSearchField());
            this.f41902f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        if (i10 != this.V && i10 != this.W && i10 != this.X && i10 != this.Y && i10 != this.Z && i10 != this.f41890a0 && i10 != this.f41913k0 && i10 != this.f41893b0 && i10 != this.f41896c0 && i10 != this.f41898d0) {
            return false;
        }
        return true;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.f41926r;
        if (chat.megagroup && !chat.gigagroup && ChatObject.canUserDoAdminAction(chat, 13)) {
            if (this.f41923p1 <= 0) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.E;
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
        if (!this.Q) {
            int i10 = 0;
            this.J = false;
            this.I = false;
            boolean z10 = this.f41938w;
            int i11 = this.O;
            a0.h hVar = this.L;
            ArrayList arrayList = this.G;
            a0.h hVar2 = this.M;
            ArrayList arrayList2 = this.H;
            a0.h hVar3 = this.K;
            ArrayList arrayList3 = this.F;
            if (z10 && i11 == 2) {
                this.Q = false;
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
                ur urVar = this.f41889a;
                if (urVar != null) {
                    urVar.l();
                }
            } else if (!ChatObject.isChannel(this.f41926r)) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                if (i11 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f41929s;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i10 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f41929s.participants.participants.get(i10);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            hVar3.k(chatParticipant, chatParticipant.user_id);
                            i10++;
                        }
                    }
                } else if (i11 == 2 && (chatFull = this.f41929s) != null && chatFull.participants != null) {
                    long j10 = getUserConfig().clientUserId;
                    int size4 = this.f41929s.participants.participants.size();
                    while (i10 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f41929s.participants.participants.get(i10);
                        int i14 = this.f41901e1;
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
                ur urVar2 = this.f41889a;
                if (urVar2 != null) {
                    urVar2.l();
                }
                B0();
                ur urVar3 = this.f41889a;
                if (urVar3 != null) {
                    urVar3.l();
                }
            } else {
                this.Q = true;
                org.telegram.ui.Components.wx0 wx0Var = this.f41892b;
                if (wx0Var != null) {
                    wx0Var.e(true, false);
                }
                ur urVar4 = this.f41889a;
                if (urVar4 != null) {
                    urVar4.l();
                }
                ArrayList s02 = s0();
                ArrayList arrayList6 = new ArrayList();
                br brVar = new br(this, s02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i15 = 0; i15 < s02.size(); i15++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) s02.get(i15), new bi.ia(arrayList6, i15, atomicInteger, s02, brVar)), this.classGuid);
                }
            }
        }
    }

    public final ArrayList s0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.N);
        int i10 = this.O;
        if (i10 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i10 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i10 == 2) {
            TLRPC.ChatFull chatFull = this.f41929s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f41926r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f41901e1 == 1) {
                if (!this.J) {
                    this.f41914k1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.J = true;
                    arrayList.addAll(s0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.J) {
                this.f41914k1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.J = true;
                arrayList.addAll(s0());
            } else if (!this.I) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.I = true;
                arrayList.addAll(s0());
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i10 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.f18915q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void t0(long j10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i10, boolean z11) {
        boolean z12;
        long j11 = this.N;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
        if (tLObject == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        tq tqVar = new tq(j10, j11, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i10, z10, z12, null);
        tqVar.X0 = new ir(this, tLObject, j10, z11);
        presentFragment(tqVar, z11);
    }

    public final void u0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yr.u0():void");
    }

    public final void v0(long j10) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        sr w02 = w0();
        boolean z10 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                hVar = this.M;
                arrayList = this.H;
            } else if (i10 == 1) {
                hVar = this.L;
                arrayList = this.G;
            } else {
                hVar = this.K;
                arrayList = this.F;
            }
            TLObject tLObject = (TLObject) hVar.f(j10);
            if (tLObject != null) {
                hVar.l(j10);
                arrayList.remove(tLObject);
                if (this.O == 0 && (chatFull = this.f41929s) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            A0(w02);
        }
        s4.g0 adapter = this.f41895c.getAdapter();
        xr xrVar = this.e;
        if (adapter == xrVar) {
            hg.a2 a2Var = xrVar.h;
            Object f7 = a2Var.f10491f.f(j10);
            if (f7 != null) {
                a2Var.e.remove(f7);
            }
            Object f10 = a2Var.h.f(j10);
            if (f10 != null) {
                a2Var.f10492g.remove(f10);
            }
            Object f11 = xrVar.e.f(j10);
            if (f11 != null) {
                xrVar.d.remove(f11);
            }
            xrVar.l();
        }
    }

    public final sr w0() {
        sr srVar = new sr(this);
        srVar.f39926b = this.f41899d1;
        srVar.f39930i = this.X0;
        srVar.f39931j = this.Y0;
        srVar.f39933l.clear();
        srVar.f39933l.addAll(this.G);
        srVar.h = this.V0;
        srVar.f39929g = this.U0;
        srVar.f39934m.clear();
        srVar.f39934m.addAll(this.H);
        srVar.e = this.E0;
        srVar.f39928f = this.F0;
        srVar.f39932k.clear();
        srVar.f39932k.addAll(this.F);
        srVar.f(srVar.f39927c);
        return srVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        boolean z10;
        long j10;
        this.f41929s = chatFull;
        if (chatFull != null) {
            int k02 = k0();
            this.f41925q1 = k02;
            this.f41923p1 = k02;
            int i10 = this.f41929s.boosts_unrestrict;
            boolean z11 = false;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41928r1 = z10;
            this.f41931s1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
            if (chat == null) {
                j10 = 0;
            } else {
                j10 = chat.send_paid_messages_stars;
            }
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i11 > 0) {
                z11 = true;
            }
            this.f41946y1 = z11;
            this.f41943x1 = z11;
            if (i11 <= 0) {
                j10 = 10;
            }
            long clamp = Utilities.clamp(j10, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.A1 = clamp;
            this.f41948z1 = clamp;
        }
    }

    public final void y0(int i10) {
        if (!this.isPaused && this.B1) {
            if (this.f41895c.getAdapter() != this.f41889a || !this.R) {
                org.telegram.ui.Components.f10 f10Var = null;
                for (int i11 = 0; i11 < this.f41895c.getChildCount(); i11++) {
                    View childAt = this.f41895c.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Components.f10) {
                        f10Var = childAt;
                    }
                }
                if (f10Var != null) {
                    this.f41895c.removeView(f10Var);
                    i10--;
                }
                this.f41895c.getViewTreeObserver().addOnPreDrawListener(new fr(this, f10Var, i10, 0));
            }
        }
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new cr(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
