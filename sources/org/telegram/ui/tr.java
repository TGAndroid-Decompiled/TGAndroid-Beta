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
public final class tr extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public long A1;
    public int B0;
    public boolean B1;
    public int C0;
    public org.telegram.ui.Components.j10 C1;
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
    public final a0.i K;
    public int K0;
    public final a0.i L;
    public int L0;
    public final a0.i M;
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
    public pr f42050a;
    public int f42051a0;
    public int f42052a1;
    public org.telegram.ui.Components.ay0 f42053b;
    public int f42054b0;
    public int f42055b1;
    public ai.w0 f42056c;
    public int f42057c0;
    public int f42058c1;
    public gg.i0 d;
    public int f42059d0;
    public int f42060d1;
    public sr f42061e;
    public int f42062e0;
    public final int f42063e1;
    public org.telegram.ui.ActionBar.v0 f42064f;
    public int f42065f0;
    public int f42066f1;
    public int f42067g0;
    public int f42068g1;
    public org.telegram.ui.ActionBar.v0 h;
    public int f42069h0;
    public int f42070h1;
    public int f42071i0;
    public int f42072i1;
    public int f42073j0;
    public int f42074j1;
    public int f42075k0;
    public int f42076k1;
    public int f42077l0;
    public boolean l1;
    public int m0;
    public lr f42078m1;
    public UndoView f42079n;
    public int f42080n0;
    public final boolean f42081n1;
    public int f42082o0;
    public boolean f42083o1;
    public int f42084p0;
    public int f42085p1;
    public int f42086q0;
    public int f42087q1;
    public TLRPC.Chat f42088r;
    public int f42089r0;
    public boolean f42090r1;
    public TLRPC.ChatFull f42091s;
    public int f42092s0;
    public int f42093s1;
    public int f42094t0;
    public final boolean f42095t1;
    public int f42096u0;
    public final boolean f42097u1;
    public final boolean v;
    public int f42098v0;
    public boolean f42099v1;
    public final boolean f42100w;
    public boolean f42101w0;
    public boolean f42102w1;
    public final boolean f42103x;
    public int f42104x0;
    public boolean f42105x1;
    public final String f42106y;
    public int f42107y0;
    public boolean f42108y1;
    public int f42109z0;
    public long f42110z1;

    public tr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.E = new TLRPC.TL_chatBannedRights();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.K = new a0.i();
        this.L = new a0.i();
        this.M = new a0.i();
        this.f42110z1 = 10L;
        this.A1 = 10L;
        this.N = this.arguments.getLong("chat_id");
        this.O = this.arguments.getInt("type");
        this.P = this.arguments.getBoolean("transfer");
        this.f42081n1 = this.arguments.getBoolean("open_search");
        this.f42063e1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
        this.f42088r = chat;
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
        this.f42106y = ChatObject.getBannedRightsString(this.E);
        boolean isCommunity = ChatObject.isCommunity(this.f42088r);
        this.f42100w = isCommunity;
        if (ChatObject.isChannel(this.f42088r) && !this.f42088r.megagroup && !isCommunity) {
            z10 = true;
        }
        this.v = z10;
        this.f42103x = ChatObject.isForum(this.f42088r);
        TLRPC.Chat chat2 = this.f42088r;
        if (chat2 != null) {
            boolean z18 = chat2.signatures;
            this.f42099v1 = z18;
            this.f42095t1 = z18;
            boolean z19 = chat2.signature_profiles;
            this.f42102w1 = z19;
            this.f42097u1 = z19;
        }
    }

    public static void U(tr trVar, long j3) {
        if (j3 != 0) {
            trVar.N = j3;
            trVar.f42088r = MessagesController.getInstance(trVar.currentAccount).getChat(Long.valueOf(j3));
            trVar.u0();
        }
    }

    public static void V(org.telegram.ui.tr r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tr.V(org.telegram.ui.tr, android.view.View, int):void");
    }

    public static void W(tr trVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.i iVar;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                iVar = trVar.M;
            } else if (i10 == 1) {
                iVar = trVar.L;
            } else {
                iVar = trVar.K;
            }
            TLObject tLObject = (TLObject) iVar.f(MessageObject.getPeerId(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
        }
    }

    public static org.telegram.ui.ActionBar.d5 X(tr trVar) {
        return trVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 Y(tr trVar) {
        return trVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 Z(tr trVar) {
        return trVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 a0(tr trVar) {
        return trVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.d5 b0(tr trVar) {
        return trVar.parentLayout;
    }

    public static void c0(tr trVar, TLRPC.User user) {
        int i10;
        a0.i iVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.i iVar2 = trVar.K;
        ArrayList arrayList2 = trVar.F;
        UndoView undoView = trVar.f42079n;
        long j3 = -trVar.N;
        boolean z12 = trVar.v;
        if (z12) {
            i10 = 9;
        } else {
            i10 = 10;
        }
        undoView.m(j3, user, i10);
        boolean z13 = false;
        trVar.f42088r.creator = false;
        int i11 = 0;
        boolean z14 = false;
        while (i11 < 3) {
            boolean z15 = true;
            if (i11 == 0) {
                iVar = trVar.M;
                arrayList = trVar.H;
            } else if (i11 == 1) {
                iVar = trVar.L;
                arrayList = trVar.G;
            } else {
                iVar = iVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) iVar.f(user.f20185id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j10 = user.f20185id;
                tL_peerUser.user_id = j10;
                iVar.k(tL_channelParticipantCreator, j10);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z14 = true;
                z10 = true;
            } else {
                z10 = z13;
            }
            long clientUserId = trVar.getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) iVar.f(clientUserId);
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
                iVar.k(tL_channelParticipantAdmin, clientUserId);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z14;
                z15 = z10;
            }
            if (z15) {
                Collections.sort(arrayList, new gf(5));
            }
            i11++;
            z14 = z11;
            z13 = false;
        }
        if (!z14) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j11 = user.f20185id;
            tL_peerUser3.user_id = j11;
            iVar2.k(tL_channelParticipantCreator2, j11);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new gf(4));
            trVar.B0();
        }
        trVar.f42050a.l();
        lr lrVar = trVar.f42078m1;
        if (lrVar != null) {
            lrVar.a(user);
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

    public final void A0(mr mrVar) {
        View view;
        if (this.f42050a == null) {
            B0();
            return;
        }
        B0();
        mrVar.f(mrVar.d);
        s4.o.c(mrVar, true).b(this.f42050a);
        ai.w0 w0Var = this.f42056c;
        if (w0Var != null && this.d != null && w0Var.getChildCount() > 0) {
            int i10 = 0;
            int i11 = -1;
            while (true) {
                if (i10 < this.f42056c.getChildCount()) {
                    i11 = RecyclerView.R(this.f42056c.getChildAt(i10));
                    if (i11 != -1) {
                        view = this.f42056c.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i11, view.getTop() - this.f42056c.getPaddingTop());
            }
        }
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tr.B0():void");
    }

    @Override
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override
    public final View createView(Context context) {
        this.f42083o1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f42063e1;
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
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 5));
        if (i11 == 0 && i12 != 2 && i12 != 0 && i12 != 3) {
            if (i12 == 1 && ChatObject.isChannelAndNotMegaGroup(this.f42088r) && ChatObject.hasAdminRights(this.f42088r)) {
                this.h = this.actionBar.o().h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else {
            this.f42061e = new sr(this, context);
            org.telegram.ui.ActionBar.z o9 = this.actionBar.o();
            org.telegram.ui.ActionBar.v0 a2 = o9.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new hg.e2(this, 3);
            this.f42064f = a2;
            if (i12 == 0 && !this.R) {
                a2.setVisibility(8);
            }
            if (i12 == 3) {
                this.f42064f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f42064f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.f42088r) && !this.f42088r.creator) {
                this.f42064f.setVisibility(8);
            }
            if (i12 == 3) {
                this.h = o9.h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20741a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, null);
        this.C1 = j10Var;
        j10Var.setViewType(6);
        org.telegram.ui.Components.j10 j10Var2 = this.C1;
        j10Var2.f27555w = false;
        j10Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.j10 j10Var3 = this.C1;
        int i13 = org.telegram.ui.ActionBar.i6.G8;
        int i14 = org.telegram.ui.ActionBar.i6.f20888i6;
        j10Var3.f(i13, i14, i14);
        frameLayout3.addView(this.C1, w7.x5.a(-1.0f, 12.0f, 30.0f, 12.0f, 0.0f, -1, 0));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D1 = radialProgressView;
        frameLayout3.addView(radialProgressView, w7.x5.e(-2, -2, 17));
        this.C1.setVisibility(8);
        this.D1.setVisibility(8);
        org.telegram.ui.Components.ay0 ay0Var = new org.telegram.ui.Components.ay0(context, frameLayout3, 1, null);
        this.f42053b = ay0Var;
        ay0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.f42053b.f24802e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f42053b.setVisibility(8);
        this.f42053b.setAnimateLayoutChange(true);
        this.f42053b.e(true, false);
        frameLayout2.addView(this.f42053b, w7.x5.d(-1.0f, -1));
        this.f42053b.addView(frameLayout3, 0);
        ai.w0 w0Var = new ai.w0(this, context, 9);
        this.f42056c = w0Var;
        w0Var.p1();
        ai.w0 w0Var2 = this.f42056c;
        gg.i0 i0Var = new gg.i0(this);
        this.d = i0Var;
        w0Var2.setLayoutManager(i0Var);
        fr frVar = new fr(this);
        frVar.n(420L);
        frVar.o(org.telegram.ui.Components.hs.h);
        frVar.C = false;
        frVar.f47696m = false;
        this.f42056c.setItemAnimator(frVar);
        ai.w0 w0Var3 = this.f42056c;
        w0Var3.W1 = true;
        w0Var3.X1 = 0;
        pr prVar = new pr(this, context);
        this.f42050a = prVar;
        w0Var3.setAdapter(prVar);
        ai.w0 w0Var4 = this.f42056c;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        w0Var4.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f42056c, w7.x5.d(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f42056c);
        this.f42056c.setOnItemClickListener(new qq(this, 3));
        this.f42056c.setOnItemLongClickListener(new qq(this, 4));
        if (this.f42064f != null) {
            this.f42056c.setOnScrollListener(new i3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.f42079n = undoView;
        frameLayout2.addView(undoView, w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        B0();
        this.f42056c.setEmptyView(this.f42053b);
        ai.w0 w0Var5 = this.f42056c;
        w0Var5.W1 = false;
        w0Var5.X1 = 0;
        if (this.f42081n1) {
            this.f42064f.z(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        long j3;
        boolean z12 = false;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.f20039id == this.N) {
                if (!booleanValue || !ChatObject.isChannel(this.f42088r)) {
                    if (this.f42091s != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f42091s = chatFull;
                    if (!z10) {
                        int k02 = k0();
                        this.f42087q1 = k02;
                        this.f42085p1 = k02;
                        int i12 = this.f42091s.boosts_unrestrict;
                        if (i12 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f42090r1 = z11;
                        this.f42093s1 = i12;
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
                        if (chat == null) {
                            j3 = 0;
                        } else {
                            j3 = chat.send_paid_messages_stars;
                        }
                        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        if (i13 > 0) {
                            z12 = true;
                        }
                        this.f42108y1 = z12;
                        this.f42105x1 = z12;
                        if (i13 <= 0) {
                            j3 = 10;
                        }
                        long clamp = Utilities.clamp(j3, getMessagesController().starsPaidMessageAmountMax, 1L);
                        this.A1 = clamp;
                        this.f42110z1 = clamp;
                    }
                    AndroidUtilities.runOnUIThread(new oq(this, 0));
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.N)) {
            org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
            if (d5Var != null && d5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final boolean g0(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tr.g0(boolean):boolean");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.ca.class, org.telegram.ui.Components.ww0.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20797d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21075s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        int i10 = org.telegram.ui.ActionBar.i6.f20761b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.v3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f7));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21199z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.f21181y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f20982n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42079n, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.Fi));
        int i13 = org.telegram.ui.ActionBar.i6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42079n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42079n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.i6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42079n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42079n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42079n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42079n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20962m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21110u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21128v6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Components.ay0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Components.ay0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42053b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42053b.f24802e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42056c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.i6.f21049r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        return arrayList;
    }

    public final boolean h0(TLObject tLObject, boolean z10, View view) {
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        long j3;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z11;
        int i11;
        tr trVar;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        int i13;
        boolean z19;
        String str2;
        int i14;
        if (tLObject == null || (i10 = this.f42063e1) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            j3 = MessageObject.getPeerId(channelParticipant.peer);
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
                j3 = chatParticipant.user_id;
                i11 = chatParticipant.date;
                str = "";
                z11 = ChatObject.canAddAdmins(this.f42088r);
                tL_chatAdminRights = null;
            } else {
                j3 = 0;
                str = null;
                tL_chatAdminRights = null;
                z11 = false;
                i11 = 0;
            }
        }
        int i15 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i15 == 0 || j3 == getUserConfig().getClientUserId()) {
            return false;
        }
        boolean z21 = this.v;
        int i16 = this.O;
        if (i16 == 2) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (ChatObject.canAddAdmins(this.f42088r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11)) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z22 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
            if ((!z22 && !(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z11) {
                z14 = z13;
                j10 = j3;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z15 = true;
            } else {
                z14 = z13;
                j10 = j3;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z15 = false;
            }
            if (!z22 && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (ChatObject.canBlockUsers(this.f42088r) && z15 && !z21 && ChatObject.isChannel(this.f42088r) && !this.f42088r.gigagroup) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i10 == 0) {
                z14 = (!UserObject.isDeleted(user)) & z14;
            }
            if (!z14 && (!ChatObject.canBlockUsers(this.f42088r) || !z15)) {
                z18 = false;
            } else {
                z18 = true;
            }
            if (!z10 && z18) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
                boolean z23 = z17;
                xq xqVar = new xq(this, j10, i11, tLObject, tL_chatAdminRights2, tL_chatBannedRights2, str, z15);
                long j11 = j10;
                org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(this, view);
                H.W(this.f42056c.V0(view, false));
                int i17 = R.drawable.msg_admins;
                if (z16) {
                    i13 = R.string.EditAdminRights;
                } else {
                    i13 = R.string.SetAsAdmin;
                }
                H.l(i17, LocaleController.getString(i13), new cj(xqVar, 12), z14);
                H.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new org.telegram.ui.ActionBar.n5(this, tLObject, user, xqVar, 14), z23);
                if (ChatObject.canBlockUsers(this.f42088r) && z15) {
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
                H.m(z19, i18, LocaleController.getString(str2, i14), true, new a3.h0(this, user, j11, 16));
                H.S = 190;
                H.Z();
                return true;
            }
            return z18;
        }
        boolean z24 = z11;
        final long j12 = j3;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
        org.telegram.ui.Components.p80 H2 = org.telegram.ui.Components.p80.H(this, view);
        if (i16 == 3 && ChatObject.canBlockUsers(this.f42088r)) {
            trVar = this;
            H2.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new org.telegram.messenger.voip.f(trVar, j12, (TLObject) tL_chatBannedRights3, str, tLObject, 1), false);
            H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(trVar) {
                public final tr f40866b;

                {
                    this.f40866b = trVar;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f40866b.i0(j12);
                            return;
                        case 1:
                            tr trVar2 = this.f40866b;
                            long j13 = j12;
                            trVar2.i0(j13);
                            trVar2.getMessagesController().addUserToChat(trVar2.N, trVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, trVar2, null);
                            return;
                        case 2:
                            this.f40866b.i0(j12);
                            return;
                        default:
                            tr trVar3 = this.f40866b;
                            MessagesController messagesController = trVar3.getMessagesController();
                            long j14 = trVar3.N;
                            MessagesController messagesController2 = trVar3.getMessagesController();
                            long j15 = j12;
                            messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !trVar3.v, trVar3, false, false, null, null);
                            trVar3.v0(j15);
                            return;
                    }
                }
            }, true);
        } else {
            String str3 = str;
            trVar = this;
            if (i16 == 0 && ChatObject.canBlockUsers(trVar.f42088r)) {
                if (ChatObject.canAddUsers(trVar.f42088r) && i15 > 0 && !ChatObject.isCommunity(trVar.f42088r)) {
                    int i19 = R.drawable.msg_contact_add;
                    if (z21) {
                        i12 = R.string.ChannelAddToChannel;
                    } else {
                        i12 = R.string.ChannelAddToGroup;
                    }
                    H2.c(i19, LocaleController.getString(i12), new Runnable(trVar) {
                        public final tr f40866b;

                        {
                            this.f40866b = trVar;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    this.f40866b.i0(j12);
                                    return;
                                case 1:
                                    tr trVar2 = this.f40866b;
                                    long j13 = j12;
                                    trVar2.i0(j13);
                                    trVar2.getMessagesController().addUserToChat(trVar2.N, trVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, trVar2, null);
                                    return;
                                case 2:
                                    this.f40866b.i0(j12);
                                    return;
                                default:
                                    tr trVar3 = this.f40866b;
                                    MessagesController messagesController = trVar3.getMessagesController();
                                    long j14 = trVar3.N;
                                    MessagesController messagesController2 = trVar3.getMessagesController();
                                    long j15 = j12;
                                    messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !trVar3.v, trVar3, false, false, null, null);
                                    trVar3.v0(j15);
                                    return;
                            }
                        }
                    }, false);
                }
                H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(trVar) {
                    public final tr f40866b;

                    {
                        this.f40866b = trVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f40866b.i0(j12);
                                return;
                            case 1:
                                tr trVar2 = this.f40866b;
                                long j13 = j12;
                                trVar2.i0(j13);
                                trVar2.getMessagesController().addUserToChat(trVar2.N, trVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, trVar2, null);
                                return;
                            case 2:
                                this.f40866b.i0(j12);
                                return;
                            default:
                                tr trVar3 = this.f40866b;
                                MessagesController messagesController = trVar3.getMessagesController();
                                long j14 = trVar3.N;
                                MessagesController messagesController2 = trVar3.getMessagesController();
                                long j15 = j12;
                                messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !trVar3.v, trVar3, false, false, null, null);
                                trVar3.v0(j15);
                                return;
                        }
                    }
                }, true);
            } else if (i16 == 1 && ChatObject.canAddAdmins(trVar.f42088r) && z24) {
                if (trVar.f42088r.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    H2.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new org.telegram.messenger.voip.f(trVar, j12, (TLObject) tL_chatAdminRights3, str3, tLObject, 2), false);
                }
                H2.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(trVar) {
                    public final tr f40866b;

                    {
                        this.f40866b = trVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f40866b.i0(j12);
                                return;
                            case 1:
                                tr trVar2 = this.f40866b;
                                long j13 = j12;
                                trVar2.i0(j13);
                                trVar2.getMessagesController().addUserToChat(trVar2.N, trVar2.getMessagesController().getUser(Long.valueOf(j13)), 0, null, trVar2, null);
                                return;
                            case 2:
                                this.f40866b.i0(j12);
                                return;
                            default:
                                tr trVar3 = this.f40866b;
                                MessagesController messagesController = trVar3.getMessagesController();
                                long j14 = trVar3.N;
                                MessagesController messagesController2 = trVar3.getMessagesController();
                                long j15 = j12;
                                messagesController.setUserAdminRole(j14, messagesController2.getUser(Long.valueOf(j15)), new TLRPC.TL_chatAdminRights(), "", !trVar3.v, trVar3, false, false, null, null);
                                trVar3.v0(j15);
                                return;
                        }
                    }
                }, true);
            }
        }
        H2.W(trVar.f42056c.V0(view, false));
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

    public final void i0(long j3) {
        if (this.f42100w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j3);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.N);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new Object(), new b5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j3);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.N);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new m(this, 4));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final int k0() {
        TLRPC.ChatFull chatFull = this.f42091s;
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
        TLRPC.ChatFull chatFull = this.f42091s;
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
        if (this.f42090r1 && q0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        TLRPC.ChatFull chatFull = this.f42091s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.f42093s1;
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
        UndoView undoView = this.f42079n;
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
        this.f42056c.setPadding(0, 0, 0, i13);
        this.f42056c.setClipToPadding(false);
        this.f42079n.setTranslationY(-i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.f42079n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        pr prVar = this.f42050a;
        if (prVar != null) {
            prVar.l();
        }
        org.telegram.ui.Components.ay0 ay0Var = this.f42053b;
        if (ay0Var != null) {
            ay0Var.requestLayout();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.B1 = true;
        }
        if (z10 && !z11 && this.f42081n1) {
            this.f42064f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f42064f.getSearchField());
            this.f42064f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        if (i10 != this.V && i10 != this.W && i10 != this.X && i10 != this.Y && i10 != this.Z && i10 != this.f42051a0 && i10 != this.f42075k0 && i10 != this.f42054b0 && i10 != this.f42057c0 && i10 != this.f42059d0) {
            return false;
        }
        return true;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.f42088r;
        if (chat.megagroup && !chat.gigagroup && ChatObject.canUserDoAdminAction(chat, 13)) {
            if (this.f42085p1 <= 0) {
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
            boolean z10 = this.f42100w;
            int i11 = this.O;
            a0.i iVar = this.L;
            ArrayList arrayList = this.G;
            a0.i iVar2 = this.M;
            ArrayList arrayList2 = this.H;
            a0.i iVar3 = this.K;
            ArrayList arrayList3 = this.F;
            if (z10 && i11 == 2) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                iVar3.b();
                iVar2.b();
                iVar.b();
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
                pr prVar = this.f42050a;
                if (prVar != null) {
                    prVar.l();
                }
            } else if (!ChatObject.isChannel(this.f42088r)) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                iVar3.b();
                iVar2.b();
                iVar.b();
                if (i11 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f42091s;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i10 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f42091s.participants.participants.get(i10);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            iVar3.k(chatParticipant, chatParticipant.user_id);
                            i10++;
                        }
                    }
                } else if (i11 == 2 && (chatFull = this.f42091s) != null && chatFull.participants != null) {
                    long j3 = getUserConfig().clientUserId;
                    int size4 = this.f42091s.participants.participants.size();
                    while (i10 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f42091s.participants.participants.get(i10);
                        int i14 = this.f42063e1;
                        if (i14 == 0 || chatParticipant2.user_id != j3) {
                            if (i14 == 1) {
                                if (getContactsController().isContact(chatParticipant2.user_id)) {
                                    arrayList2.add(chatParticipant2);
                                    iVar2.k(chatParticipant2, chatParticipant2.user_id);
                                } else if (!UserObject.isDeleted(getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id)))) {
                                    arrayList3.add(chatParticipant2);
                                    iVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            } else if (getContactsController().isContact(chatParticipant2.user_id)) {
                                arrayList2.add(chatParticipant2);
                                iVar2.k(chatParticipant2, chatParticipant2.user_id);
                            } else {
                                TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id));
                                if (user != null && user.bot) {
                                    arrayList.add(chatParticipant2);
                                    iVar.k(chatParticipant2, chatParticipant2.user_id);
                                } else {
                                    arrayList3.add(chatParticipant2);
                                    iVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            }
                        }
                        i10++;
                    }
                }
                pr prVar2 = this.f42050a;
                if (prVar2 != null) {
                    prVar2.l();
                }
                B0();
                pr prVar3 = this.f42050a;
                if (prVar3 != null) {
                    prVar3.l();
                }
            } else {
                this.Q = true;
                org.telegram.ui.Components.ay0 ay0Var = this.f42053b;
                if (ay0Var != null) {
                    ay0Var.e(true, false);
                }
                pr prVar4 = this.f42050a;
                if (prVar4 != null) {
                    prVar4.l();
                }
                ArrayList s02 = s0();
                ArrayList arrayList6 = new ArrayList();
                vq vqVar = new vq(this, s02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i15 = 0; i15 < s02.size(); i15++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) s02.get(i15), new ai.za(arrayList6, i15, atomicInteger, s02, vqVar)), this.classGuid);
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
            TLRPC.ChatFull chatFull = this.f42091s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f42088r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f42063e1 == 1) {
                if (!this.J) {
                    this.f42076k1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.J = true;
                    arrayList.addAll(s0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.J) {
                this.f42076k1 = 3;
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
        tL_channels_getParticipants.filter.f20037q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void t0(long j3, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i10, boolean z11) {
        boolean z12;
        long j10 = this.N;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
        if (tLObject == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        nq nqVar = new nq(j3, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i10, z10, z12, null);
        nqVar.X0 = new cr(this, tLObject, j3, z11);
        presentFragment(nqVar, z11);
    }

    public final void u0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tr.u0():void");
    }

    public final void v0(long j3) {
        a0.i iVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        mr w02 = w0();
        boolean z10 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                iVar = this.M;
                arrayList = this.H;
            } else if (i10 == 1) {
                iVar = this.L;
                arrayList = this.G;
            } else {
                iVar = this.K;
                arrayList = this.F;
            }
            TLObject tLObject = (TLObject) iVar.f(j3);
            if (tLObject != null) {
                iVar.l(j3);
                arrayList.remove(tLObject);
                if (this.O == 0 && (chatFull = this.f42091s) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            A0(w02);
        }
        s4.i0 adapter = this.f42056c.getAdapter();
        sr srVar = this.f42061e;
        if (adapter == srVar) {
            gg.b2 b2Var = srVar.h;
            Object f7 = b2Var.f10536f.f(j3);
            if (f7 != null) {
                b2Var.f10535e.remove(f7);
            }
            Object f10 = b2Var.h.f(j3);
            if (f10 != null) {
                b2Var.f10537g.remove(f10);
            }
            Object f11 = srVar.f41750e.f(j3);
            if (f11 != null) {
                srVar.d.remove(f11);
            }
            srVar.l();
        }
    }

    public final mr w0() {
        mr mrVar = new mr(this);
        mrVar.f39963b = this.f42060d1;
        mrVar.f39968i = this.X0;
        mrVar.f39969j = this.Y0;
        mrVar.f39971l.clear();
        mrVar.f39971l.addAll(this.G);
        mrVar.h = this.V0;
        mrVar.f39967g = this.U0;
        mrVar.f39972m.clear();
        mrVar.f39972m.addAll(this.H);
        mrVar.f39965e = this.E0;
        mrVar.f39966f = this.F0;
        mrVar.f39970k.clear();
        mrVar.f39970k.addAll(this.F);
        mrVar.f(mrVar.f39964c);
        return mrVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        boolean z10;
        long j3;
        this.f42091s = chatFull;
        if (chatFull != null) {
            int k02 = k0();
            this.f42087q1 = k02;
            this.f42085p1 = k02;
            int i10 = this.f42091s.boosts_unrestrict;
            boolean z11 = false;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f42090r1 = z10;
            this.f42093s1 = i10;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
            if (chat == null) {
                j3 = 0;
            } else {
                j3 = chat.send_paid_messages_stars;
            }
            int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i11 > 0) {
                z11 = true;
            }
            this.f42108y1 = z11;
            this.f42105x1 = z11;
            if (i11 <= 0) {
                j3 = 10;
            }
            long clamp = Utilities.clamp(j3, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.A1 = clamp;
            this.f42110z1 = clamp;
        }
    }

    public final void y0(int i10) {
        if (!this.isPaused && this.B1) {
            if (this.f42056c.getAdapter() != this.f42050a || !this.R) {
                org.telegram.ui.Components.j10 j10Var = null;
                for (int i11 = 0; i11 < this.f42056c.getChildCount(); i11++) {
                    View childAt = this.f42056c.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Components.j10) {
                        j10Var = childAt;
                    }
                }
                if (j10Var != null) {
                    this.f42056c.removeView(j10Var);
                    i10--;
                }
                this.f42056c.getViewTreeObserver().addOnPreDrawListener(new zq(this, j10Var, i10, 0));
            }
        }
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new wq(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
