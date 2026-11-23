package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public final class rq extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public int A0;
    public long A1;
    public int B0;
    public boolean B1;
    public int C0;
    public org.telegram.ui.Components.vz C1;
    public int D0;
    public RadialProgressView D1;
    public TLRPC.TL_chatBannedRights E;
    public int E0;
    public int E1;
    public final ArrayList F;
    public int F0;
    public int F1;
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
    public nq f51810a;
    public int f51811a0;
    public int f51812a1;
    public org.telegram.ui.Components.mv0 f51813b;
    public int f51814b0;
    public int f51815b1;
    public di.b1 f51816c;
    public int f51817c0;
    public int f51818c1;
    public jg.i0 d;
    public int f51819d0;
    public int f51820d1;
    public qq f51821e;
    public int f51822e0;
    public final int f51823e1;
    public org.telegram.ui.ActionBar.g5 f51824f;
    public int f51825f0;
    public int f51826f1;
    public int f51827g0;
    public int f51828g1;
    public UndoView h;
    public int f51829h0;
    public int f51830h1;
    public int f51831i0;
    public int f51832i1;
    public int f51833j0;
    public int f51834j1;
    public int f51835k0;
    public int f51836k1;
    public int f51837l0;
    public boolean l1;
    public int m0;
    public kq f51838m1;
    public TLRPC.Chat f51839n;
    public int f51840n0;
    public final boolean n1;
    public int f51841o0;
    public boolean f51842o1;
    public int f51843p0;
    public int f51844p1;
    public int f51845q0;
    public int f51846q1;
    public TLRPC.ChatFull f51847r;
    public int f51848r0;
    public boolean f51849r1;
    public final boolean f51850s;
    public int f51851s0;
    public int f51852s1;
    public int f51853t0;
    public final boolean f51854t1;
    public int f51855u0;
    public final boolean f51856u1;
    public int f51857v0;
    public boolean f51858v1;
    public final boolean f51859w;
    public boolean f51860w0;
    public boolean f51861w1;
    public final boolean f51862x;
    public int f51863x0;
    public boolean f51864x1;
    public final String f51865y;
    public int f51866y0;
    public boolean f51867y1;
    public int f51868z0;
    public long f51869z1;

    public rq(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.E = new TLRPC.TL_chatBannedRights();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.K = new a0.h();
        this.L = new a0.h();
        this.M = new a0.h();
        this.f51869z1 = 10L;
        this.A1 = 10L;
        this.N = this.arguments.getLong("chat_id");
        this.O = this.arguments.getInt("type");
        this.P = this.arguments.getBoolean("transfer");
        this.n1 = this.arguments.getBoolean("open_search");
        this.f51823e1 = this.arguments.getInt("selectType");
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.N));
        this.f51839n = O0;
        boolean z10 = false;
        if (O0 != null && (tL_chatBannedRights = O0.default_banned_rights) != null) {
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
        this.f51865y = org.telegram.messenger.v3.D(this.E);
        boolean Y = org.telegram.messenger.v3.Y(this.f51839n);
        this.f51859w = Y;
        if (org.telegram.messenger.v3.T(this.f51839n) && !this.f51839n.megagroup && !Y) {
            z10 = true;
        }
        this.f51850s = z10;
        this.f51862x = org.telegram.messenger.v3.c0(this.f51839n);
        TLRPC.Chat chat = this.f51839n;
        if (chat != null) {
            boolean z18 = chat.signatures;
            this.f51858v1 = z18;
            this.f51854t1 = z18;
            boolean z19 = chat.signature_profiles;
            this.f51861w1 = z19;
            this.f51856u1 = z19;
        }
    }

    public static void Z(rq rqVar, long j3) {
        if (j3 != 0) {
            rqVar.N = j3;
            rqVar.f51839n = org.telegram.messenger.mp.u1(rqVar.currentAccount).O0(Long.valueOf(j3));
            rqVar.z0();
        }
    }

    public static void a0(final org.telegram.ui.rq r32, android.view.View r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rq.a0(org.telegram.ui.rq, android.view.View, int):void");
    }

    public static void b0(rq rqVar, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        a0.h hVar;
        for (int i7 = 0; i7 < 3; i7++) {
            if (i7 == 0) {
                hVar = rqVar.M;
            } else if (i7 == 1) {
                hVar = rqVar.L;
            } else {
                hVar = rqVar.K;
            }
            TLObject tLObject = (TLObject) hVar.f(org.telegram.messenger.fj.B1(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
        }
    }

    public static void h0(rq rqVar, TLRPC.User user) {
        int i7;
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        a0.h hVar2 = rqVar.K;
        ArrayList arrayList2 = rqVar.F;
        UndoView undoView = rqVar.h;
        long j3 = -rqVar.N;
        boolean z12 = rqVar.f51850s;
        if (z12) {
            i7 = 9;
        } else {
            i7 = 10;
        }
        undoView.m(j3, user, i7);
        boolean z13 = false;
        rqVar.f51839n.creator = false;
        int i10 = 0;
        boolean z14 = false;
        while (i10 < 3) {
            boolean z15 = true;
            if (i10 == 0) {
                hVar = rqVar.M;
                arrayList = rqVar.H;
            } else if (i10 == 1) {
                hVar = rqVar.L;
                arrayList = rqVar.G;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.f28641id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j10 = user.f28641id;
                tL_peerUser.user_id = j10;
                hVar.k(tL_channelParticipantCreator, j10);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z14 = true;
                z10 = true;
            } else {
                z10 = z13;
            }
            long e10 = rqVar.getUserConfig().e();
            TLObject tLObject2 = (TLObject) hVar.f(e10);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = e10;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = e10;
                tL_channelParticipantAdmin.promoted_by = e10;
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
                hVar.k(tL_channelParticipantAdmin, e10);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z11 = z14;
                z15 = z10;
            }
            if (z15) {
                Collections.sort(arrayList, new pe(4));
            }
            i10++;
            z14 = z11;
            z13 = false;
        }
        if (!z14) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j11 = user.f28641id;
            tL_peerUser3.user_id = j11;
            hVar2.k(tL_channelParticipantCreator2, j11);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new pe(3));
            rqVar.G0();
        }
        rqVar.f51810a.f();
        kq kqVar = rqVar.f51838m1;
        if (kqVar != null) {
            kqVar.a(user);
        }
    }

    public static int o0(TLObject tLObject) {
        if (!(tLObject instanceof TLRPC.TL_channelParticipantCreator) && !(tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_channelParticipant)) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static int r0(int i7) {
        if (i7 == 1) {
            return 5;
        }
        if (i7 == 2) {
            return 10;
        }
        if (i7 == 3) {
            return 30;
        }
        if (i7 == 4) {
            return 60;
        }
        if (i7 == 5) {
            return 300;
        }
        if (i7 == 6) {
            return 900;
        }
        if (i7 == 7) {
            return 3600;
        }
        return 0;
    }

    public static int s0(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i7 = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i7++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i7++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i7++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i7++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i7++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i7++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i7++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i7++;
        }
        if (!tL_chatBannedRights.send_reactions) {
            return i7 + 1;
        }
        return i7;
    }

    public final void A0(long j3) {
        a0.h hVar;
        ArrayList arrayList;
        TLRPC.ChatFull chatFull;
        lq B0 = B0();
        boolean z10 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            if (i7 == 0) {
                hVar = this.M;
                arrayList = this.H;
            } else if (i7 == 1) {
                hVar = this.L;
                arrayList = this.G;
            } else {
                hVar = this.K;
                arrayList = this.F;
            }
            TLObject tLObject = (TLObject) hVar.f(j3);
            if (tLObject != null) {
                hVar.l(j3);
                arrayList.remove(tLObject);
                if (this.O == 0 && (chatFull = this.f51847r) != null) {
                    chatFull.kicked_count--;
                }
                z10 = true;
            }
        }
        if (z10) {
            F0(B0);
        }
        v4.i0 adapter = this.f51816c.getAdapter();
        qq qqVar = this.f51821e;
        if (adapter == qqVar) {
            jg.z1 z1Var = qqVar.h;
            Object f10 = z1Var.f17827f.f(j3);
            if (f10 != null) {
                z1Var.f17826e.remove(f10);
            }
            Object f11 = z1Var.h.f(j3);
            if (f11 != null) {
                z1Var.f17828g.remove(f11);
            }
            Object f12 = qqVar.f51505e.f(j3);
            if (f12 != null) {
                qqVar.d.remove(f12);
            }
            qqVar.f();
        }
    }

    public final lq B0() {
        lq lqVar = new lq(this);
        lqVar.f49798b = this.f51820d1;
        lqVar.f49803i = this.X0;
        lqVar.f49804j = this.Y0;
        lqVar.f49806l.clear();
        lqVar.f49806l.addAll(this.G);
        lqVar.h = this.V0;
        lqVar.f49802g = this.U0;
        lqVar.f49807m.clear();
        lqVar.f49807m.addAll(this.H);
        lqVar.f49800e = this.E0;
        lqVar.f49801f = this.F0;
        lqVar.f49805k.clear();
        lqVar.f49805k.addAll(this.F);
        lqVar.f(lqVar.f49799c);
        return lqVar;
    }

    public final void C0(TLRPC.ChatFull chatFull) {
        boolean z10;
        long j3;
        this.f51847r = chatFull;
        if (chatFull != null) {
            int p02 = p0();
            this.f51846q1 = p02;
            this.f51844p1 = p02;
            int i7 = this.f51847r.boosts_unrestrict;
            boolean z11 = false;
            if (i7 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f51849r1 = z10;
            this.f51852s1 = i7;
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.N));
            if (O0 == null) {
                j3 = 0;
            } else {
                j3 = O0.send_paid_messages_stars;
            }
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 > 0) {
                z11 = true;
            }
            this.f51867y1 = z11;
            this.f51864x1 = z11;
            if (i10 <= 0) {
                j3 = 10;
            }
            long k10 = Utilities.k(j3, getMessagesController().L6, 1L);
            this.A1 = k10;
            this.f51869z1 = k10;
        }
    }

    public final void D0(int i7) {
        if (!this.isPaused && this.B1) {
            if (this.f51816c.getAdapter() != this.f51810a || !this.R) {
                org.telegram.ui.Components.vz vzVar = null;
                for (int i10 = 0; i10 < this.f51816c.getChildCount(); i10++) {
                    View childAt = this.f51816c.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.vz) {
                        vzVar = childAt;
                    }
                }
                if (vzVar != null) {
                    this.f51816c.removeView(vzVar);
                    i7--;
                }
                this.f51816c.getViewTreeObserver().addOnPreDrawListener(new yp(this, vzVar, i7, 0));
            }
        }
    }

    public final void E0(ArrayList arrayList) {
        Collections.sort(arrayList, new vp(this, getConnectionsManager().getCurrentTime(), 0));
    }

    public final void F0(lq lqVar) {
        View view;
        if (this.f51810a == null) {
            G0();
            return;
        }
        G0();
        lqVar.f(lqVar.d);
        v4.p.c(lqVar, true).c(this.f51810a);
        di.b1 b1Var = this.f51816c;
        if (b1Var != null && this.d != null && b1Var.getChildCount() > 0) {
            int i7 = 0;
            int i10 = -1;
            while (true) {
                if (i7 < this.f51816c.getChildCount()) {
                    i10 = RecyclerView.R(this.f51816c.getChildAt(i7));
                    if (i10 != -1) {
                        view = this.f51816c.getChildAt(i7);
                        break;
                    }
                    i7++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i10, view.getTop() - this.f51816c.getPaddingTop());
            }
        }
    }

    public final void G0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rq.G0():void");
    }

    public final void H0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f51816c != null) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29633n6, false);
                if (x02 != this.E1 || x03 != this.F1) {
                    this.E1 = x02;
                    this.F1 = x03;
                    for (int i7 = 1; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f51816c.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f51816c.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f51816c.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f51816c.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f51816c.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f51816c.V(i10);
                            } else if (i7 == 2) {
                                O = this.f51816c.P(i10);
                            } else {
                                O = this.f51816c.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.b5) {
                                ((org.telegram.ui.Cells.b5) O).updateColors();
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29767u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29616m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.yj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.wj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29490f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return l0(true);
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.f51842o1 = false;
        this.simpleActionBar.setBackButtonImage(2131231243);
        int i10 = this.f51823e1;
        int i11 = this.O;
        if (i11 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752321, "ChannelPermissions"));
        } else if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752441, "ChannelBlacklist"));
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752505, null));
        } else if (i11 == 2) {
            if (i10 == 0) {
                if (this.f51850s) {
                    this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752277, null));
                } else {
                    this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752365, "ChannelMembers"));
                }
            } else if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752516, "ChannelAddAdmin"));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752440, "ChannelBlockUser"));
            } else if (i10 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752515, "ChannelAddException"));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new y7(this, 12));
        if (i10 == 0 && i11 != 2 && i11 != 0 && i11 != 3) {
            if (i11 == 1 && org.telegram.messenger.v3.V(this.f51839n) && org.telegram.messenger.v3.N(this.f51839n)) {
                this.simpleActionBar.s(org.telegram.messenger.gd.N0(2131745750, null));
            }
        } else {
            this.f51821e = new qq(this, context);
            org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131232491);
            b10.O();
            b10.C0 = new bi.x1(this, 4);
            this.f51824f = b10;
            if (i11 == 0 && !this.R) {
                b10.setVisibility(8);
            }
            if (i11 == 3) {
                this.f51824f.setSearchFieldHint(org.telegram.messenger.gd.N0(2131752295, "ChannelSearchException"));
            } else {
                this.f51824f.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, "Search"));
            }
            if (!org.telegram.messenger.v3.T(this.f51839n) && !this.f51839n.creator) {
                this.f51824f.setVisibility(8);
            }
            if (i11 == 3) {
                this.simpleActionBar.s(org.telegram.messenger.gd.N0(2131745750, null));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.C1 = vzVar;
        vzVar.setViewType(6);
        org.telegram.ui.Components.vz vzVar2 = this.C1;
        vzVar2.f41457x = false;
        vzVar2.setUseHeaderOffset(false);
        org.telegram.ui.Components.vz vzVar3 = this.C1;
        int i12 = org.telegram.ui.ActionBar.n6.G8;
        int i13 = org.telegram.ui.ActionBar.n6.f29543i6;
        vzVar3.e(i12, i13, i13);
        frameLayout2.addView(this.C1, c8.na.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.D1 = radialProgressView;
        frameLayout2.addView(radialProgressView, c8.na.e(-2, -2, 17));
        this.C1.setVisibility(8);
        this.D1.setVisibility(8);
        org.telegram.ui.Components.mv0 mv0Var = new org.telegram.ui.Components.mv0(context, frameLayout2, 1, null);
        this.f51813b = mv0Var;
        mv0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        this.f51813b.f37553e.setText(org.telegram.messenger.gd.N0(2131745611, null));
        this.f51813b.setVisibility(8);
        this.f51813b.setAnimateLayoutChange(true);
        this.f51813b.e(true, false);
        this.f51813b.addView(frameLayout2, 0);
        di.b1 b1Var = new di.b1(12, context, this);
        this.f51816c = b1Var;
        b1Var.r1();
        this.f51816c.setSectionsDrawBackground(true);
        di.b1 b1Var2 = this.f51816c;
        jg.i0 i0Var = new jg.i0(1, this, false);
        this.d = i0Var;
        b1Var2.setLayoutManager(i0Var);
        eq eqVar = new eq(this);
        eqVar.n(420L);
        eqVar.o(org.telegram.ui.Components.kr.h);
        eqVar.C = false;
        eqVar.f59274m = false;
        this.f51816c.setItemAnimator(eqVar);
        di.b1 b1Var3 = this.f51816c;
        b1Var3.X1 = true;
        b1Var3.Y1 = 0;
        nq nqVar = new nq(this, context);
        this.f51810a = nqVar;
        b1Var3.setAdapter(nqVar);
        di.b1 b1Var4 = this.f51816c;
        if (!org.telegram.messenger.gd.f24314a0) {
            i7 = 2;
        }
        b1Var4.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f51816c, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.f51813b, c8.na.c(-1.0f, -1));
        this.f51816c.setOnItemClickListener(new qp(this, 3));
        this.f51816c.setOnItemLongClickListener(new qp(this, 4));
        if (this.f51824f != null) {
            this.f51816c.setOnScrollListener(new g3(this, 8));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, c8.na.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        G0();
        this.f51816c.setEmptyView(this.f51813b);
        di.b1 b1Var5 = this.f51816c;
        b1Var5.X1 = false;
        b1Var5.Y1 = 0;
        if (this.n1) {
            this.f51824f.G(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        boolean z11;
        long j3;
        boolean z12 = false;
        if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.f28493id == this.N) {
                if (!booleanValue || !org.telegram.messenger.v3.T(this.f51839n)) {
                    if (this.f51847r != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f51847r = chatFull;
                    if (!z10) {
                        int p02 = p0();
                        this.f51846q1 = p02;
                        this.f51844p1 = p02;
                        int i11 = this.f51847r.boosts_unrestrict;
                        if (i11 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f51849r1 = z11;
                        this.f51852s1 = i11;
                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.N));
                        if (O0 == null) {
                            j3 = 0;
                        } else {
                            j3 = O0.send_paid_messages_stars;
                        }
                        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        if (i12 > 0) {
                            z12 = true;
                        }
                        this.f51867y1 = z12;
                        this.f51864x1 = z12;
                        if (i12 <= 0) {
                            j3 = 10;
                        }
                        long k10 = Utilities.k(j3, getMessagesController().L6, 1L);
                        this.A1 = k10;
                        this.f51869z1 = k10;
                    }
                    org.telegram.messenger.g0.g3(new op(this, 0));
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25325y1 && ((Long) objArr[0]).longValue() == (-this.N)) {
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var != null && r4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f51816c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(5, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f51816c, 16, new Class[]{org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Components.gu0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29451d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f51816c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f51816c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.V6));
        int i7 = org.telegram.ui.ActionBar.n6.f29843y6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f51816c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f51816c, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.f29633n6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f51813b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f51813b.f37553e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean l0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rq.l0(boolean):boolean");
    }

    public final boolean m0(org.telegram.tgnet.TLObject r24, boolean r25, android.view.View r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rq.m0(org.telegram.tgnet.TLObject, boolean, android.view.View):boolean");
    }

    public final void n0(long j3) {
        if (this.f51859w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().l1(j3);
            tL_communities_toggleParticipantBanned.community = getMessagesController().j1(this.N);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new d3.b(1), new a5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().l1(j3);
        tL_channels_editBanned.channel = getMessagesController().j1(this.N);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new l(this, 4));
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return l0(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.ks.T);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25325y1);
        w0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.T);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25325y1);
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.h;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        nq nqVar = this.f51810a;
        if (nqVar != null) {
            nqVar.f();
        }
        org.telegram.ui.Components.mv0 mv0Var = this.f51813b;
        if (mv0Var != null) {
            mv0Var.requestLayout();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            H0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            this.B1 = true;
        }
        if (z10 && !z11 && this.n1) {
            this.f51824f.getSearchField().requestFocus();
            org.telegram.messenger.g0.I3(this.f51824f.getSearchField());
            this.f51824f.setVisibility(8);
        }
    }

    public final int p0() {
        TLRPC.ChatFull chatFull = this.f51847r;
        if (chatFull != null) {
            int i7 = chatFull.slowmode_seconds;
            if (i7 == 5) {
                return 1;
            }
            if (i7 == 10) {
                return 2;
            }
            if (i7 == 30) {
                return 3;
            }
            if (i7 == 60) {
                return 4;
            }
            if (i7 == 300) {
                return 5;
            }
            if (i7 == 900) {
                return 6;
            }
            if (i7 == 3600) {
                return 7;
            }
            return 0;
        }
        return 0;
    }

    public final int q0() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.f51847r;
        if (chatFull == null) {
            return 0;
        }
        int i7 = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        if (chatParticipants != null && (arrayList = chatParticipants.participants) != null) {
            return Math.max(i7, arrayList.size());
        }
        return i7;
    }

    public final boolean t0() {
        boolean z10;
        if (this.f51849r1 && v0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        TLRPC.ChatFull chatFull = this.f51847r;
        if (chatFull != null) {
            int i7 = chatFull.boosts_unrestrict;
            int i10 = this.f51852s1;
            if (i7 != i10 || ((z10 && i10 == 0) || (!z10 && i10 != 0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean u0(int i7) {
        if (i7 != this.V && i7 != this.W && i7 != this.X && i7 != this.Y && i7 != this.Z && i7 != this.f51811a0 && i7 != this.f51835k0 && i7 != this.f51814b0 && i7 != this.f51817c0 && i7 != this.f51819d0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        TLRPC.Chat chat = this.f51839n;
        if (chat.megagroup && !chat.gigagroup && org.telegram.messenger.v3.y(13, chat)) {
            if (this.f51844p1 <= 0) {
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

    public final void w0() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (!this.Q) {
            int i7 = 0;
            this.J = false;
            this.I = false;
            boolean z10 = this.f51859w;
            int i10 = this.O;
            a0.h hVar = this.L;
            ArrayList arrayList = this.G;
            a0.h hVar2 = this.M;
            ArrayList arrayList2 = this.H;
            a0.h hVar3 = this.K;
            ArrayList arrayList3 = this.F;
            if (z10 && i10 == 2) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                HashMap hashMap = org.telegram.messenger.i5.r(this.currentAccount).f24695h0;
                ArrayList arrayList4 = org.telegram.messenger.i5.r(this.currentAccount).f24696i0;
                int size = arrayList4.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList4.get(i11);
                    i11++;
                    ArrayList arrayList5 = (ArrayList) hashMap.get((String) obj);
                    int size2 = arrayList5.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList5.get(i12);
                        i12++;
                        arrayList3.add(getMessagesController().c2(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)));
                    }
                }
                G0();
                nq nqVar = this.f51810a;
                if (nqVar != null) {
                    nqVar.f();
                }
            } else if (!org.telegram.messenger.v3.T(this.f51839n)) {
                this.Q = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                if (i10 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f51847r;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i7 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f51847r.participants.participants.get(i7);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            hVar3.k(chatParticipant, chatParticipant.user_id);
                            i7++;
                        }
                    }
                } else if (i10 == 2 && (chatFull = this.f51847r) != null && chatFull.participants != null) {
                    long j3 = getUserConfig().f24656n;
                    int size4 = this.f51847r.participants.participants.size();
                    while (i7 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f51847r.participants.participants.get(i7);
                        int i13 = this.f51823e1;
                        if (i13 == 0 || chatParticipant2.user_id != j3) {
                            if (i13 == 1) {
                                if (getContactsController().x(chatParticipant2.user_id)) {
                                    arrayList2.add(chatParticipant2);
                                    hVar2.k(chatParticipant2, chatParticipant2.user_id);
                                } else if (!org.telegram.messenger.n10.y(getMessagesController().c2(Long.valueOf(chatParticipant2.user_id)))) {
                                    arrayList3.add(chatParticipant2);
                                    hVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            } else if (getContactsController().x(chatParticipant2.user_id)) {
                                arrayList2.add(chatParticipant2);
                                hVar2.k(chatParticipant2, chatParticipant2.user_id);
                            } else {
                                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(chatParticipant2.user_id));
                                if (c22 != null && c22.bot) {
                                    arrayList.add(chatParticipant2);
                                    hVar.k(chatParticipant2, chatParticipant2.user_id);
                                } else {
                                    arrayList3.add(chatParticipant2);
                                    hVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            }
                        }
                        i7++;
                    }
                }
                nq nqVar2 = this.f51810a;
                if (nqVar2 != null) {
                    nqVar2.f();
                }
                G0();
                nq nqVar3 = this.f51810a;
                if (nqVar3 != null) {
                    nqVar3.f();
                }
            } else {
                this.Q = true;
                org.telegram.ui.Components.mv0 mv0Var = this.f51813b;
                if (mv0Var != null) {
                    mv0Var.e(true, false);
                }
                nq nqVar4 = this.f51810a;
                if (nqVar4 != null) {
                    nqVar4.f();
                }
                ArrayList x02 = x0();
                ArrayList arrayList6 = new ArrayList();
                up upVar = new up(this, x02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i14 = 0; i14 < x02.size(); i14++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) x02.get(i14), new bg.l0(arrayList6, i14, atomicInteger, x02, upVar, 6)), this.classGuid);
                }
            }
        }
    }

    public final ArrayList x0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().j1(this.N);
        int i7 = this.O;
        if (i7 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i7 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i7 == 2) {
            TLRPC.ChatFull chatFull = this.f51847r;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f51839n) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f51823e1 == 1) {
                if (!this.J) {
                    this.f51836k1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.J = true;
                    arrayList.addAll(x0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.J) {
                this.f51836k1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.J = true;
                arrayList.addAll(x0());
            } else if (!this.I) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.I = true;
                arrayList.addAll(x0());
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i7 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.f28491q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void y0(long j3, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10, int i7, boolean z11) {
        boolean z12;
        long j10 = this.N;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.E;
        if (tLObject == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        np npVar = new np(j3, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i7, z10, z12, null);
        npVar.Y0 = new bq(this, tLObject, j3, z11);
        presentFragment(npVar, z11);
    }

    public final void z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rq.z0():void");
    }
}
