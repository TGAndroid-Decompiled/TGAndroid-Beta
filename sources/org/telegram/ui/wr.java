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
public final class wr extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public long A1;
    public int B0;
    public boolean B1;
    public int C0;
    public org.telegram.ui.Components.a10 C1;
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
    public sr f38317a;
    public int f38318a0;
    public int f38319a1;
    public org.telegram.ui.Components.jx0 f38320b;
    public int f38321b0;
    public int f38322b1;
    public bi.y1 f38323c;
    public int f38324c0;
    public int f38325c1;
    public fg.i0 d;
    public int f38326d0;
    public int f38327d1;
    public vr e;
    public int f38328e0;
    public final int f38329e1;
    public org.telegram.ui.ActionBar.w0 f38330f;
    public int f38331f0;
    public int f38332f1;
    public int f38333g0;
    public int f38334g1;
    public org.telegram.ui.ActionBar.w0 h;
    public int f38335h0;
    public int f38336h1;
    public int f38337i0;
    public int f38338i1;
    public int f38339j0;
    public int f38340j1;
    public int f38341k0;
    public int f38342k1;
    public int f38343l0;
    public boolean l1;
    public int m0;
    public pr f38344m1;
    public UndoView f38345n;
    public int f38346n0;
    public final boolean f38347n1;
    public int f38348o0;
    public boolean f38349o1;
    public int f38350p0;
    public int f38351p1;
    public int f38352q0;
    public int f38353q1;
    public TLRPC.Chat f38354r;
    public int f38355r0;
    public boolean f38356r1;
    public TLRPC.ChatFull f38357s;
    public int f38358s0;
    public int f38359s1;
    public int f38360t0;
    public final boolean f38361t1;
    public int f38362u0;
    public final boolean f38363u1;
    public final boolean v;
    public int f38364v0;
    public boolean f38365v1;
    public final boolean f38366w;
    public boolean f38367w0;
    public boolean f38368w1;
    public final boolean f38369x;
    public int f38370x0;
    public boolean f38371x1;
    public final String f38372y;
    public int f38373y0;
    public boolean f38374y1;
    public int f38375z0;
    public long f38376z1;

    public wr(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.E = new TLRPC.TL_chatBannedRights();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.K = new a0.i();
        this.L = new a0.i();
        this.M = new a0.i();
        this.f38376z1 = 10L;
        this.A1 = 10L;
        this.N = this.arguments.getLong("chat_id");
        this.O = this.arguments.getInt("type");
        this.P = this.arguments.getBoolean("transfer");
        this.f38347n1 = this.arguments.getBoolean("open_search");
        this.f38329e1 = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.N));
        this.f38354r = chat;
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
        this.f38372y = ChatObject.getBannedRightsString(this.E);
        boolean isCommunity = ChatObject.isCommunity(this.f38354r);
        this.f38366w = isCommunity;
        if (ChatObject.isChannel(this.f38354r) && !this.f38354r.megagroup && !isCommunity) {
            z10 = true;
        }
        this.v = z10;
        this.f38369x = ChatObject.isForum(this.f38354r);
        TLRPC.Chat chat2 = this.f38354r;
        if (chat2 != null) {
            boolean z18 = chat2.signatures;
            this.f38365v1 = z18;
            this.f38361t1 = z18;
            boolean z19 = chat2.signature_profiles;
            this.f38368w1 = z19;
            this.f38363u1 = z19;
        }
    }

    public static void U(wr wrVar, long j3) {
        if (j3 != 0) {
            wrVar.N = j3;
            wrVar.f38354r = MessagesController.getInstance(wrVar.currentAccount).getChat(Long.valueOf(j3));
            wrVar.u0();
        }
    }

    public static void V(org.telegram.ui.wr r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wr.V(org.telegram.ui.wr, android.view.View, int):void");
    }

    public static void W(wr wrVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.i iVar;
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 == 0) {
                iVar = wrVar.M;
            } else if (i10 == 1) {
                iVar = wrVar.L;
            } else {
                iVar = wrVar.K;
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

    public static org.telegram.ui.ActionBar.f5 X(wr wrVar) {
        return wrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 Y(wr wrVar) {
        return wrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 Z(wr wrVar) {
        return wrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 a0(wr wrVar) {
        return wrVar.parentLayout;
    }

    public static org.telegram.ui.ActionBar.f5 b0(wr wrVar) {
        return wrVar.parentLayout;
    }

    public static void c0(wr wrVar, TLRPC.User user) {
        int i10;
        a0.i iVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.i iVar2 = wrVar.K;
        ArrayList arrayList2 = wrVar.F;
        UndoView undoView = wrVar.f38345n;
        long j3 = -wrVar.N;
        boolean z12 = wrVar.v;
        if (z12) {
            i10 = 9;
        } else {
            i10 = 10;
        }
        undoView.m(j3, user, i10);
        wrVar.f38354r.creator = false;
        int i11 = 0;
        boolean z13 = false;
        while (i11 < 3) {
            boolean z14 = true;
            if (i11 == 0) {
                iVar = wrVar.M;
                arrayList = wrVar.H;
            } else if (i11 == 1) {
                iVar = wrVar.L;
                arrayList = wrVar.G;
            } else {
                iVar = iVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) iVar.f(user.f17342id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j10 = user.f17342id;
                tL_peerUser.user_id = j10;
                iVar.k(tL_channelParticipantCreator, j10);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z13 = true;
                z10 = true;
            } else {
                z10 = false;
            }
            long clientUserId = wrVar.getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) iVar.f(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
                z11 = z13;
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
                z11 = z13;
                z14 = z10;
            }
            if (z14) {
                Collections.sort(arrayList, new a4.e(28));
            }
            i11++;
            z13 = z11;
        }
        if (!z13) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j11 = user.f17342id;
            tL_peerUser3.user_id = j11;
            iVar2.k(tL_channelParticipantCreator2, j11);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new a4.e(27));
            wrVar.B0();
        }
        wrVar.f38317a.l();
        pr prVar = wrVar.f38344m1;
        if (prVar != null) {
            prVar.a(user);
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

    public final void A0(qr qrVar) {
        View view;
        if (this.f38317a == null) {
            B0();
            return;
        }
        B0();
        qrVar.f(qrVar.d);
        s4.o.c(qrVar, true).b(this.f38317a);
        bi.y1 y1Var = this.f38323c;
        if (y1Var != null && this.d != null && y1Var.getChildCount() > 0) {
            int i10 = 0;
            int i11 = -1;
            while (true) {
                if (i10 < this.f38323c.getChildCount()) {
                    i11 = RecyclerView.R(this.f38323c.getChildAt(i10));
                    if (i11 != -1) {
                        view = this.f38323c.getChildAt(i10);
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i11, view.getTop() - this.f38323c.getPaddingTop());
            }
        }
    }

    public final void B0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wr.B0():void");
    }

    @Override
    public final boolean canBeginSlide() {
        return g0(true);
    }

    @Override
    public final View createView(Context context) {
        this.f38349o1 = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        int i11 = this.f38329e1;
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
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 5));
        if (i11 == 0 && i12 != 2 && i12 != 0 && i12 != 3) {
            if (i12 == 1 && ChatObject.isChannelAndNotMegaGroup(this.f38354r) && ChatObject.hasAdminRights(this.f38354r)) {
                this.h = this.actionBar.n().h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else {
            this.e = new vr(this, context);
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            a2.F();
            a2.H = new gg.m2(this, 3);
            this.f38330f = a2;
            if (i12 == 0 && !this.R) {
                a2.setVisibility(8);
            }
            if (i12 == 3) {
                this.f38330f.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.f38330f.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.f38354r) && !this.f38354r.creator) {
                this.f38330f.setVisibility(8);
            }
            if (i12 == 3) {
                this.h = n10.h(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
        this.C1 = a10Var;
        a10Var.setViewType(6);
        org.telegram.ui.Components.a10 a10Var2 = this.C1;
        a10Var2.f21345w = false;
        a10Var2.setUseHeaderOffset(false);
        org.telegram.ui.Components.a10 a10Var3 = this.C1;
        int i13 = org.telegram.ui.ActionBar.j6.G8;
        int i14 = org.telegram.ui.ActionBar.j6.f18017i6;
        a10Var3.f(i13, i14, i14);
        frameLayout3.addView(this.C1, w7.a6.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D1 = radialProgressView;
        frameLayout3.addView(radialProgressView, w7.a6.e(-2, -2, 17));
        this.C1.setVisibility(8);
        this.D1.setVisibility(8);
        org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(context, frameLayout3, 1, null);
        this.f38320b = jx0Var;
        jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        this.f38320b.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.f38320b.setVisibility(8);
        this.f38320b.setAnimateLayoutChange(true);
        this.f38320b.e(true, false);
        frameLayout2.addView(this.f38320b, w7.a6.c(-1.0f, -1));
        this.f38320b.addView(frameLayout3, 0);
        bi.y1 y1Var = new bi.y1(this, context, 8);
        this.f38323c = y1Var;
        y1Var.o1();
        bi.y1 y1Var2 = this.f38323c;
        fg.i0 i0Var = new fg.i0(this);
        this.d = i0Var;
        y1Var2.setLayoutManager(i0Var);
        jr jrVar = new jr(this);
        jrVar.n(420L);
        jrVar.o(org.telegram.ui.Components.wr.h);
        jrVar.C = false;
        jrVar.f41645m = false;
        this.f38323c.setItemAnimator(jrVar);
        bi.y1 y1Var3 = this.f38323c;
        y1Var3.Y1 = true;
        y1Var3.Z1 = 0;
        sr srVar = new sr(this, context);
        this.f38317a = srVar;
        y1Var3.setAdapter(srVar);
        bi.y1 y1Var4 = this.f38323c;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        y1Var4.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f38323c, w7.a6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f38323c);
        this.f38323c.setOnItemClickListener(new uq(this, 3));
        this.f38323c.setOnItemLongClickListener(new uq(this, 4));
        if (this.f38330f != null) {
            this.f38323c.setOnScrollListener(new j3(this, 7));
        }
        UndoView undoView = new UndoView(context);
        this.f38345n = undoView;
        frameLayout2.addView(undoView, w7.a6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        B0();
        this.f38323c.setEmptyView(this.f38320b);
        bi.y1 y1Var5 = this.f38323c;
        y1Var5.Y1 = false;
        y1Var5.Z1 = 0;
        if (this.f38347n1) {
            this.f38330f.z(false);
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
            if (chatFull.f17196id == this.N) {
                if (!booleanValue || !ChatObject.isChannel(this.f38354r)) {
                    if (this.f38357s != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f38357s = chatFull;
                    if (!z10) {
                        int k02 = k0();
                        this.f38353q1 = k02;
                        this.f38351p1 = k02;
                        int i12 = this.f38357s.boosts_unrestrict;
                        if (i12 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f38356r1 = z11;
                        this.f38359s1 = i12;
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
                        this.f38374y1 = z12;
                        this.f38371x1 = z12;
                        if (i13 <= 0) {
                            j3 = 10;
                        }
                        long clamp = Utilities.clamp(j3, getMessagesController().starsPaidMessageAmountMax, 1L);
                        this.A1 = clamp;
                        this.f38376z1 = clamp;
                    }
                    AndroidUtilities.runOnUIThread(new sq(this, 0));
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.N)) {
            org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
            if (f5Var != null && f5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final boolean g0(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wr.g0(boolean):boolean");
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 10);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.ga.class, org.telegram.ui.Components.ew0.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        int i10 = org.telegram.ui.ActionBar.j6.f17892b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.u3.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f7));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18325z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f18306y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38345n, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.Fi));
        int i13 = org.telegram.ui.ActionBar.j6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38345n, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38345n, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38345n, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38345n, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38345n, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38345n, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18091m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18236u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18254v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Components.jx0.class}, new String[]{"title"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Components.jx0.class}, new String[]{"subtitle"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38320b.d, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38320b.e, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38323c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
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
        wr wrVar;
        final long j10;
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
        if (tLObject == null || (i10 = this.f38329e1) != 0) {
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
                z11 = ChatObject.canAddAdmins(this.f38354r);
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
            if (ChatObject.canAddAdmins(this.f38354r) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || z11)) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z22 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
            if ((!z22 && !(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantCreator) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || z11) {
                z14 = z13;
                j11 = j3;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z15 = true;
            } else {
                z14 = z13;
                j11 = j3;
                tL_chatBannedRights2 = tL_chatBannedRights;
                z15 = false;
            }
            if (!z22 && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (ChatObject.canBlockUsers(this.f38354r) && z15 && !z21 && ChatObject.isChannel(this.f38354r) && !this.f38354r.gigagroup) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i10 == 0) {
                z14 = (!UserObject.isDeleted(user)) & z14;
            }
            if (!z14 && (!ChatObject.canBlockUsers(this.f38354r) || !z15)) {
                z18 = false;
            } else {
                z18 = true;
            }
            if (!z10 && z18) {
                boolean z23 = z17;
                br brVar = new br(this, j11, i11, tLObject, tL_chatAdminRights, tL_chatBannedRights2, str, z15);
                long j12 = j11;
                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(this, view);
                H.W(this.f38323c.U0(view, false));
                int i17 = R.drawable.msg_admins;
                if (z16) {
                    i13 = R.string.EditAdminRights;
                } else {
                    i13 = R.string.SetAsAdmin;
                }
                H.l(i17, LocaleController.getString(i13), new fj(brVar, 11), z14);
                H.l(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new da(this, tLObject, user, brVar, 9), z23);
                if (ChatObject.canBlockUsers(this.f38354r) && z15) {
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
                H.m(z19, i18, LocaleController.getString(str2, i14), true, new a3.h0(this, user, j12, 10));
                H.S = 190;
                H.Z();
                return true;
            }
            return z18;
        }
        final long j13 = j3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        org.telegram.ui.Components.w70 H2 = org.telegram.ui.Components.w70.H(this, view);
        if (i16 == 3 && ChatObject.canBlockUsers(this.f38354r)) {
            wrVar = this;
            H2.c(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new org.telegram.messenger.voip.g(wrVar, j13, (TLObject) tL_chatBannedRights, str, tLObject, 1), false);
            H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(wrVar) {
                public final wr f36988b;

                {
                    this.f36988b = wrVar;
                }

                @Override
                public final void run() {
                    switch (r4) {
                        case 0:
                            this.f36988b.i0(j13);
                            return;
                        case 1:
                            wr wrVar2 = this.f36988b;
                            long j14 = j13;
                            wrVar2.i0(j14);
                            wrVar2.getMessagesController().addUserToChat(wrVar2.N, wrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, wrVar2, null);
                            return;
                        case 2:
                            this.f36988b.i0(j13);
                            return;
                        default:
                            wr wrVar3 = this.f36988b;
                            MessagesController messagesController = wrVar3.getMessagesController();
                            long j15 = wrVar3.N;
                            MessagesController messagesController2 = wrVar3.getMessagesController();
                            long j16 = j13;
                            messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !wrVar3.v, wrVar3, false, false, null, null);
                            wrVar3.v0(j16);
                            return;
                    }
                }
            }, true);
        } else {
            String str3 = str;
            wrVar = this;
            if (i16 == 0 && ChatObject.canBlockUsers(wrVar.f38354r)) {
                if (ChatObject.canAddUsers(wrVar.f38354r) && i15 > 0 && !ChatObject.isCommunity(wrVar.f38354r)) {
                    int i19 = R.drawable.msg_contact_add;
                    if (z21) {
                        i12 = R.string.ChannelAddToChannel;
                    } else {
                        i12 = R.string.ChannelAddToGroup;
                    }
                    H2.c(i19, LocaleController.getString(i12), new Runnable(wrVar) {
                        public final wr f36988b;

                        {
                            this.f36988b = wrVar;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    this.f36988b.i0(j13);
                                    return;
                                case 1:
                                    wr wrVar2 = this.f36988b;
                                    long j14 = j13;
                                    wrVar2.i0(j14);
                                    wrVar2.getMessagesController().addUserToChat(wrVar2.N, wrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, wrVar2, null);
                                    return;
                                case 2:
                                    this.f36988b.i0(j13);
                                    return;
                                default:
                                    wr wrVar3 = this.f36988b;
                                    MessagesController messagesController = wrVar3.getMessagesController();
                                    long j15 = wrVar3.N;
                                    MessagesController messagesController2 = wrVar3.getMessagesController();
                                    long j16 = j13;
                                    messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !wrVar3.v, wrVar3, false, false, null, null);
                                    wrVar3.v0(j16);
                                    return;
                            }
                        }
                    }, false);
                }
                H2.c(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(wrVar) {
                    public final wr f36988b;

                    {
                        this.f36988b = wrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f36988b.i0(j13);
                                return;
                            case 1:
                                wr wrVar2 = this.f36988b;
                                long j14 = j13;
                                wrVar2.i0(j14);
                                wrVar2.getMessagesController().addUserToChat(wrVar2.N, wrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, wrVar2, null);
                                return;
                            case 2:
                                this.f36988b.i0(j13);
                                return;
                            default:
                                wr wrVar3 = this.f36988b;
                                MessagesController messagesController = wrVar3.getMessagesController();
                                long j15 = wrVar3.N;
                                MessagesController messagesController2 = wrVar3.getMessagesController();
                                long j16 = j13;
                                messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !wrVar3.v, wrVar3, false, false, null, null);
                                wrVar3.v0(j16);
                                return;
                        }
                    }
                }, true);
            } else if (i16 == 1 && ChatObject.canAddAdmins(wrVar.f38354r) && z11) {
                if (!wrVar.f38354r.creator && (tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                    j10 = j13;
                } else {
                    j10 = j13;
                    H2.c(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new org.telegram.messenger.voip.g(wrVar, j10, (TLObject) tL_chatAdminRights2, str3, tLObject, 2), false);
                }
                H2.c(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(wrVar) {
                    public final wr f36988b;

                    {
                        this.f36988b = wrVar;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.f36988b.i0(j10);
                                return;
                            case 1:
                                wr wrVar2 = this.f36988b;
                                long j14 = j10;
                                wrVar2.i0(j14);
                                wrVar2.getMessagesController().addUserToChat(wrVar2.N, wrVar2.getMessagesController().getUser(Long.valueOf(j14)), 0, null, wrVar2, null);
                                return;
                            case 2:
                                this.f36988b.i0(j10);
                                return;
                            default:
                                wr wrVar3 = this.f36988b;
                                MessagesController messagesController = wrVar3.getMessagesController();
                                long j15 = wrVar3.N;
                                MessagesController messagesController2 = wrVar3.getMessagesController();
                                long j16 = j10;
                                messagesController.setUserAdminRole(j15, messagesController2.getUser(Long.valueOf(j16)), new TLRPC.TL_chatAdminRights(), "", !wrVar3.v, wrVar3, false, false, null, null);
                                wrVar3.v0(j16);
                                return;
                        }
                    }
                }, true);
            }
        }
        H2.W(wrVar.f38323c.U0(view, false));
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
        if (this.f38366w) {
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
        TLRPC.ChatFull chatFull = this.f38357s;
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
        TLRPC.ChatFull chatFull = this.f38357s;
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
        if (this.f38356r1 && q0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        TLRPC.ChatFull chatFull = this.f38357s;
        if (chatFull != null) {
            int i10 = chatFull.boosts_unrestrict;
            int i11 = this.f38359s1;
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
        UndoView undoView = this.f38345n;
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
        this.f38323c.setPadding(0, 0, 0, i13);
        this.f38323c.setClipToPadding(false);
        this.f38345n.setTranslationY(-i13);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.f38345n;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        sr srVar = this.f38317a;
        if (srVar != null) {
            srVar.l();
        }
        org.telegram.ui.Components.jx0 jx0Var = this.f38320b;
        if (jx0Var != null) {
            jx0Var.requestLayout();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.B1 = true;
        }
        if (z10 && !z11 && this.f38347n1) {
            this.f38330f.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.f38330f.getSearchField());
            this.f38330f.setVisibility(8);
        }
    }

    public final boolean p0(int i10) {
        if (i10 != this.V && i10 != this.W && i10 != this.X && i10 != this.Y && i10 != this.Z && i10 != this.f38318a0 && i10 != this.f38341k0 && i10 != this.f38321b0 && i10 != this.f38324c0 && i10 != this.f38326d0) {
            return false;
        }
        return true;
    }

    public final boolean q0() {
        TLRPC.Chat chat = this.f38354r;
        if (chat.megagroup && !chat.gigagroup && ChatObject.canUserDoAdminAction(chat, 13)) {
            if (this.f38351p1 <= 0) {
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
            boolean z10 = this.f38366w;
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
                sr srVar = this.f38317a;
                if (srVar != null) {
                    srVar.l();
                }
            } else if (!ChatObject.isChannel(this.f38354r)) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                iVar3.b();
                iVar2.b();
                iVar.b();
                if (i11 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f38357s;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i10 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f38357s.participants.participants.get(i10);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            iVar3.k(chatParticipant, chatParticipant.user_id);
                            i10++;
                        }
                    }
                } else if (i11 == 2 && (chatFull = this.f38357s) != null && chatFull.participants != null) {
                    long j3 = getUserConfig().clientUserId;
                    int size4 = this.f38357s.participants.participants.size();
                    while (i10 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f38357s.participants.participants.get(i10);
                        int i14 = this.f38329e1;
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
                sr srVar2 = this.f38317a;
                if (srVar2 != null) {
                    srVar2.l();
                }
                B0();
                sr srVar3 = this.f38317a;
                if (srVar3 != null) {
                    srVar3.l();
                }
            } else {
                this.Q = true;
                org.telegram.ui.Components.jx0 jx0Var = this.f38320b;
                if (jx0Var != null) {
                    jx0Var.e(true, false);
                }
                sr srVar4 = this.f38317a;
                if (srVar4 != null) {
                    srVar4.l();
                }
                ArrayList s02 = s0();
                ArrayList arrayList6 = new ArrayList();
                zq zqVar = new zq(this, s02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i15 = 0; i15 < s02.size(); i15++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) s02.get(i15), new fg.e1(arrayList6, i15, atomicInteger, s02, zqVar)), this.classGuid);
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
            TLRPC.ChatFull chatFull = this.f38357s;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f38354r) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f38329e1 == 1) {
                if (!this.J) {
                    this.f38342k1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.J = true;
                    arrayList.addAll(s0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.J) {
                this.f38342k1 = 3;
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
        tL_channels_getParticipants.filter.f17194q = "";
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
        rq rqVar = new rq(j3, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i10, z10, z12, null);
        rqVar.X0 = new gr(this, tLObject, j3, z11);
        presentFragment(rqVar, z11);
    }

    public final void u0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wr.u0():void");
    }

    public final void v0(long j3) {
        a0.i iVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        qr w02 = w0();
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
                if (this.O == 0 && (chatFull = this.f38357s) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            A0(w02);
        }
        s4.h0 adapter = this.f38323c.getAdapter();
        vr vrVar = this.e;
        if (adapter == vrVar) {
            fg.d2 d2Var = vrVar.h;
            Object f7 = d2Var.f7982f.f(j3);
            if (f7 != null) {
                d2Var.e.remove(f7);
            }
            Object f10 = d2Var.h.f(j3);
            if (f10 != null) {
                d2Var.f7983g.remove(f10);
            }
            Object f11 = vrVar.e.f(j3);
            if (f11 != null) {
                vrVar.d.remove(f11);
            }
            vrVar.l();
        }
    }

    public final qr w0() {
        qr qrVar = new qr(this);
        qrVar.f36120b = this.f38327d1;
        qrVar.f36124i = this.X0;
        qrVar.f36125j = this.Y0;
        qrVar.f36127l.clear();
        qrVar.f36127l.addAll(this.G);
        qrVar.h = this.V0;
        qrVar.f36123g = this.U0;
        qrVar.f36128m.clear();
        qrVar.f36128m.addAll(this.H);
        qrVar.e = this.E0;
        qrVar.f36122f = this.F0;
        qrVar.f36126k.clear();
        qrVar.f36126k.addAll(this.F);
        qrVar.f(qrVar.f36121c);
        return qrVar;
    }

    public final void x0(TLRPC.ChatFull chatFull) {
        boolean z10;
        long j3;
        this.f38357s = chatFull;
        if (chatFull != null) {
            int k02 = k0();
            this.f38353q1 = k02;
            this.f38351p1 = k02;
            int i10 = this.f38357s.boosts_unrestrict;
            boolean z11 = false;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f38356r1 = z10;
            this.f38359s1 = i10;
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
            this.f38374y1 = z11;
            this.f38371x1 = z11;
            if (i11 <= 0) {
                j3 = 10;
            }
            long clamp = Utilities.clamp(j3, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.A1 = clamp;
            this.f38376z1 = clamp;
        }
    }

    public final void y0(int i10) {
        if (!this.isPaused && this.B1) {
            if (this.f38323c.getAdapter() != this.f38317a || !this.R) {
                org.telegram.ui.Components.a10 a10Var = null;
                for (int i11 = 0; i11 < this.f38323c.getChildCount(); i11++) {
                    View childAt = this.f38323c.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Components.a10) {
                        a10Var = childAt;
                    }
                }
                if (a10Var != null) {
                    this.f38323c.removeView(a10Var);
                    i10--;
                }
                this.f38323c.getViewTreeObserver().addOnPreDrawListener(new dr(this, a10Var, i10, 0));
            }
        }
    }

    public final void z0(ArrayList arrayList) {
        Collections.sort(arrayList, new ar(this, getConnectionsManager().getCurrentTime(), 0));
    }
}
