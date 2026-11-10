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
public final class rq extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public int A0;
    public boolean A1;
    public int B0;
    public org.telegram.ui.Components.lz B1;
    public int C0;
    public RadialProgressView C1;
    public TLRPC.TL_chatBannedRights D;
    public int D0;
    public int D1;
    public final ArrayList E;
    public int E0;
    public int E1;
    public final ArrayList F;
    public int F0;
    public final ArrayList G;
    public int G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public int I0;
    public final a0.h J;
    public int J0;
    public final a0.h K;
    public int K0;
    public final a0.h L;
    public int L0;
    public long M;
    public int M0;
    public final int N;
    public int N0;
    public final boolean O;
    public int O0;
    public boolean P;
    public int P0;
    public boolean Q;
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
    public nq f49496a;
    public int f49497a0;
    public int f49498a1;
    public org.telegram.ui.Components.bv0 f49499b;
    public int f49500b0;
    public int f49501b1;
    public bi.q1 f49502c;
    public int f49503c0;
    public int f49504c1;
    public jg.i0 d;
    public int f49505d0;
    public final int f49506d1;
    public qq f49507e;
    public int f49508e0;
    public int f49509e1;
    public org.telegram.ui.ActionBar.g5 f49510f;
    public int f49511f0;
    public int f49512f1;
    public int f49513g0;
    public int f49514g1;
    public UndoView h;
    public int f49515h0;
    public int f49516h1;
    public int f49517i0;
    public int f49518i1;
    public int f49519j0;
    public int f49520j1;
    public int f49521k0;
    public boolean f49522k1;
    public int f49523l0;
    public kq l1;
    public int m0;
    public final boolean f49524m1;
    public TLRPC.Chat f49525n;
    public int f49526n0;
    public boolean n1;
    public int f49527o0;
    public int f49528o1;
    public int f49529p0;
    public int f49530p1;
    public int f49531q0;
    public boolean f49532q1;
    public TLRPC.ChatFull f49533r;
    public int f49534r0;
    public int f49535r1;
    public final boolean f49536s;
    public int f49537s0;
    public final boolean f49538s1;
    public int f49539t0;
    public final boolean f49540t1;
    public int f49541u0;
    public boolean f49542u1;
    public boolean f49543v0;
    public boolean f49544v1;
    public final boolean f49545w;
    public int f49546w0;
    public boolean f49547w1;
    public final boolean f49548x;
    public int f49549x0;
    public boolean f49550x1;
    public final String f49551y;
    public int f49552y0;
    public long f49553y1;
    public int f49554z0;
    public long f49555z1;

    public rq(Bundle bundle) {
        super(bundle);
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        this.D = new TLRPC.TL_chatBannedRights();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.J = new a0.h();
        this.K = new a0.h();
        this.L = new a0.h();
        this.f49553y1 = 10L;
        this.f49555z1 = 10L;
        this.M = this.arguments.getLong("chat_id");
        this.N = this.arguments.getInt("type");
        this.O = this.arguments.getBoolean("transfer");
        this.f49524m1 = this.arguments.getBoolean("open_search");
        this.f49506d1 = this.arguments.getInt("selectType");
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
        this.f49525n = M0;
        boolean z9 = false;
        if (M0 != null && (tL_chatBannedRights = M0.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.D;
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
        this.f49551y = org.telegram.messenger.t3.D(this.D);
        boolean Y = org.telegram.messenger.t3.Y(this.f49525n);
        this.f49545w = Y;
        if (org.telegram.messenger.t3.T(this.f49525n) && !this.f49525n.megagroup && !Y) {
            z9 = true;
        }
        this.f49536s = z9;
        this.f49548x = org.telegram.messenger.t3.c0(this.f49525n);
        TLRPC.Chat chat = this.f49525n;
        if (chat != null) {
            boolean z17 = chat.signatures;
            this.f49542u1 = z17;
            this.f49538s1 = z17;
            boolean z18 = chat.signature_profiles;
            this.f49544v1 = z18;
            this.f49540t1 = z18;
        }
    }

    public static void Z(rq rqVar, long j3) {
        if (j3 != 0) {
            rqVar.M = j3;
            rqVar.f49525n = org.telegram.messenger.qp.s1(rqVar.currentAccount).M0(Long.valueOf(j3));
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
                hVar = rqVar.L;
            } else if (i7 == 1) {
                hVar = rqVar.K;
            } else {
                hVar = rqVar.J;
            }
            TLObject tLObject = (TLObject) hVar.f(org.telegram.messenger.ij.B1(channelParticipant.peer));
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
        boolean z9;
        boolean z10;
        a0.h hVar2 = rqVar.J;
        ArrayList arrayList2 = rqVar.E;
        UndoView undoView = rqVar.h;
        long j3 = -rqVar.M;
        boolean z11 = rqVar.f49536s;
        if (z11) {
            i7 = 9;
        } else {
            i7 = 10;
        }
        undoView.m(j3, user, i7);
        boolean z12 = false;
        rqVar.f49525n.creator = false;
        int i10 = 0;
        boolean z13 = false;
        while (i10 < 3) {
            boolean z14 = true;
            if (i10 == 0) {
                hVar = rqVar.L;
                arrayList = rqVar.G;
            } else if (i10 == 1) {
                hVar = rqVar.K;
                arrayList = rqVar.F;
            } else {
                hVar = hVar2;
                arrayList = arrayList2;
            }
            TLObject tLObject = (TLObject) hVar.f(user.f27109id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j10 = user.f27109id;
                tL_peerUser.user_id = j10;
                hVar.k(tL_channelParticipantCreator, j10);
                int indexOf = arrayList.indexOf(tLObject);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_channelParticipantCreator);
                }
                z13 = true;
                z9 = true;
            } else {
                z9 = z12;
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
                z10 = z13;
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
                hVar.k(tL_channelParticipantAdmin, e10);
                int indexOf2 = arrayList.indexOf(tLObject2);
                if (indexOf2 >= 0) {
                    arrayList.set(indexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z10 = z13;
                z14 = z9;
            }
            if (z14) {
                Collections.sort(arrayList, new pe(5));
            }
            i10++;
            z13 = z10;
            z12 = false;
        }
        if (!z13) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j11 = user.f27109id;
            tL_peerUser3.user_id = j11;
            hVar2.k(tL_channelParticipantCreator2, j11);
            arrayList2.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList2, new pe(4));
            rqVar.G0();
        }
        rqVar.f49496a.f();
        kq kqVar = rqVar.l1;
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
        boolean z9 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            if (i7 == 0) {
                hVar = this.L;
                arrayList = this.G;
            } else if (i7 == 1) {
                hVar = this.K;
                arrayList = this.F;
            } else {
                hVar = this.J;
                arrayList = this.E;
            }
            TLObject tLObject = (TLObject) hVar.f(j3);
            if (tLObject != null) {
                hVar.l(j3);
                arrayList.remove(tLObject);
                if (this.N == 0 && (chatFull = this.f49533r) != null) {
                    chatFull.kicked_count--;
                }
                z9 = true;
            }
        }
        if (z9) {
            F0(B0);
        }
        v4.g0 adapter = this.f49502c.getAdapter();
        qq qqVar = this.f49507e;
        if (adapter == qqVar) {
            jg.z1 z1Var = qqVar.h;
            Object f10 = z1Var.f16996f.f(j3);
            if (f10 != null) {
                z1Var.f16995e.remove(f10);
            }
            Object f11 = z1Var.h.f(j3);
            if (f11 != null) {
                z1Var.f16997g.remove(f11);
            }
            Object f12 = qqVar.f49124e.f(j3);
            if (f12 != null) {
                qqVar.d.remove(f12);
            }
            qqVar.f();
        }
    }

    public final lq B0() {
        lq lqVar = new lq(this);
        lqVar.f47652b = this.f49504c1;
        lqVar.f47657i = this.W0;
        lqVar.f47658j = this.X0;
        lqVar.f47660l.clear();
        lqVar.f47660l.addAll(this.F);
        lqVar.h = this.U0;
        lqVar.f47656g = this.T0;
        lqVar.f47661m.clear();
        lqVar.f47661m.addAll(this.G);
        lqVar.f47654e = this.D0;
        lqVar.f47655f = this.E0;
        lqVar.f47659k.clear();
        lqVar.f47659k.addAll(this.E);
        lqVar.f(lqVar.f47653c);
        return lqVar;
    }

    public final void C0(TLRPC.ChatFull chatFull) {
        boolean z9;
        long j3;
        this.f49533r = chatFull;
        if (chatFull != null) {
            int p02 = p0();
            this.f49530p1 = p02;
            this.f49528o1 = p02;
            int i7 = this.f49533r.boosts_unrestrict;
            boolean z10 = false;
            if (i7 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f49532q1 = z9;
            this.f49535r1 = i7;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
            if (M0 == null) {
                j3 = 0;
            } else {
                j3 = M0.send_paid_messages_stars;
            }
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 > 0) {
                z10 = true;
            }
            this.f49550x1 = z10;
            this.f49547w1 = z10;
            if (i10 <= 0) {
                j3 = 10;
            }
            long k10 = Utilities.k(j3, getMessagesController().I6, 1L);
            this.f49555z1 = k10;
            this.f49553y1 = k10;
        }
    }

    public final void D0(int i7) {
        if (!this.isPaused && this.A1) {
            if (this.f49502c.getAdapter() != this.f49496a || !this.Q) {
                org.telegram.ui.Components.lz lzVar = null;
                for (int i10 = 0; i10 < this.f49502c.getChildCount(); i10++) {
                    View childAt = this.f49502c.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Components.lz) {
                        lzVar = childAt;
                    }
                }
                if (lzVar != null) {
                    this.f49502c.removeView(lzVar);
                    i7--;
                }
                this.f49502c.getViewTreeObserver().addOnPreDrawListener(new xp(this, lzVar, i7, 0));
            }
        }
    }

    public final void E0(ArrayList arrayList) {
        Collections.sort(arrayList, new up(this, getConnectionsManager().getCurrentTime(), 0));
    }

    public final void F0(lq lqVar) {
        View view;
        if (this.f49496a == null) {
            G0();
            return;
        }
        G0();
        lqVar.f(lqVar.d);
        v4.o.c(lqVar, true).c(this.f49496a);
        bi.q1 q1Var = this.f49502c;
        if (q1Var != null && this.d != null && q1Var.getChildCount() > 0) {
            int i7 = 0;
            int i10 = -1;
            while (true) {
                if (i7 < this.f49502c.getChildCount()) {
                    i10 = RecyclerView.R(this.f49502c.getChildAt(i7));
                    if (i10 != -1) {
                        view = this.f49502c.getChildAt(i7);
                        break;
                    }
                    i7++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                this.d.h1(i10, view.getTop() - this.f49502c.getPaddingTop());
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
            if (this.f49502c != null) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28072n6, false);
                if (x02 != this.D1 || x03 != this.E1) {
                    this.D1 = x02;
                    this.E1 = x03;
                    for (int i7 = 1; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f49502c.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f49502c.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f49502c.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f49502c.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f49502c.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f49502c.V(i10);
                            } else if (i7 == 2) {
                                O = this.f49502c.P(i10);
                            } else {
                                O = this.f49502c.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.a5) {
                                ((org.telegram.ui.Cells.a5) O).updateColors();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28225v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28206u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28055m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27929f7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27854b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
    }

    @Override
    public final boolean canBeginSlide() {
        return l0(true);
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.n1 = false;
        this.simpleActionBar.setBackButtonImage(2131231240);
        int i10 = this.f49506d1;
        int i11 = this.N;
        if (i11 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752333, "ChannelPermissions"));
        } else if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752453, "ChannelBlacklist"));
        } else if (i11 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752517, null));
        } else if (i11 == 2) {
            if (i10 == 0) {
                if (this.f49536s) {
                    this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752289, null));
                } else {
                    this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752377, "ChannelMembers"));
                }
            } else if (i10 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752528, "ChannelAddAdmin"));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752452, "ChannelBlockUser"));
            } else if (i10 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131752527, "ChannelAddException"));
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 9));
        if (i10 == 0 && i11 != 2 && i11 != 0 && i11 != 3) {
            if (i11 == 1 && org.telegram.messenger.t3.V(this.f49525n) && org.telegram.messenger.t3.N(this.f49525n)) {
                this.simpleActionBar.p(org.telegram.messenger.id.M0(2131745946, null));
            }
        } else {
            this.f49507e = new qq(this, context);
            org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.q().b(0, 2131232486);
            b10.N();
            b10.B0 = new kg.v1(this, 3);
            this.f49510f = b10;
            if (i11 == 0 && !this.Q) {
                b10.setVisibility(8);
            }
            if (i11 == 3) {
                this.f49510f.setSearchFieldHint(org.telegram.messenger.id.M0(2131752307, "ChannelSearchException"));
            } else {
                this.f49510f.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, "Search"));
            }
            if (!org.telegram.messenger.t3.T(this.f49525n) && !this.f49525n.creator) {
                this.f49510f.setVisibility(8);
            }
            if (i11 == 3) {
                this.simpleActionBar.p(org.telegram.messenger.id.M0(2131745946, null));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        this.B1 = lzVar;
        lzVar.setViewType(6);
        org.telegram.ui.Components.lz lzVar2 = this.B1;
        lzVar2.f35774x = false;
        lzVar2.setUseHeaderOffset(false);
        org.telegram.ui.Components.lz lzVar3 = this.B1;
        int i12 = org.telegram.ui.ActionBar.m6.G8;
        int i13 = org.telegram.ui.ActionBar.m6.f27982i6;
        lzVar3.e(i12, i13, i13);
        frameLayout2.addView(this.B1, c8.ha.d(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.C1 = radialProgressView;
        frameLayout2.addView(radialProgressView, c8.ha.e(-2, -2, 17));
        this.B1.setVisibility(8);
        this.C1.setVisibility(8);
        org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, frameLayout2, 1, null);
        this.f49499b = bv0Var;
        bv0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        this.f49499b.f32368e.setText(org.telegram.messenger.id.M0(2131745807, null));
        this.f49499b.setVisibility(8);
        this.f49499b.setAnimateLayoutChange(true);
        this.f49499b.e(true, false);
        this.f49499b.addView(frameLayout2, 0);
        bi.q1 q1Var = new bi.q1(12, context, this);
        this.f49502c = q1Var;
        q1Var.r1();
        this.f49502c.setSectionsDrawBackground(true);
        bi.q1 q1Var2 = this.f49502c;
        jg.i0 i0Var = new jg.i0(1, this, false);
        this.d = i0Var;
        q1Var2.setLayoutManager(i0Var);
        dq dqVar = new dq(this);
        dqVar.n(420L);
        dqVar.o(org.telegram.ui.Components.wq.h);
        dqVar.C = false;
        dqVar.f57079m = false;
        this.f49502c.setItemAnimator(dqVar);
        bi.q1 q1Var3 = this.f49502c;
        q1Var3.W1 = true;
        q1Var3.X1 = 0;
        nq nqVar = new nq(this, context);
        this.f49496a = nqVar;
        q1Var3.setAdapter(nqVar);
        bi.q1 q1Var4 = this.f49502c;
        if (!org.telegram.messenger.id.f23161a0) {
            i7 = 2;
        }
        q1Var4.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f49502c, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.f49499b, c8.ha.c(-1.0f, -1));
        this.f49502c.setOnItemClickListener(new pp(this, 3));
        this.f49502c.setOnItemLongClickListener(new pp(this, 4));
        if (this.f49510f != null) {
            this.f49502c.setOnScrollListener(new g3(this, 8));
        }
        UndoView undoView = new UndoView(context);
        this.h = undoView;
        frameLayout.addView(undoView, c8.ha.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        G0();
        this.f49502c.setEmptyView(this.f49499b);
        bi.q1 q1Var5 = this.f49502c;
        q1Var5.W1 = false;
        q1Var5.X1 = 0;
        if (this.f49524m1) {
            this.f49510f.F(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z9;
        boolean z10;
        long j3;
        boolean z11 = false;
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (chatFull.f26961id == this.M) {
                if (!booleanValue || !org.telegram.messenger.t3.T(this.f49525n)) {
                    if (this.f49533r != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    this.f49533r = chatFull;
                    if (!z9) {
                        int p02 = p0();
                        this.f49530p1 = p02;
                        this.f49528o1 = p02;
                        int i11 = this.f49533r.boosts_unrestrict;
                        if (i11 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f49532q1 = z10;
                        this.f49535r1 = i11;
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.M));
                        if (M0 == null) {
                            j3 = 0;
                        } else {
                            j3 = M0.send_paid_messages_stars;
                        }
                        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                        if (i12 > 0) {
                            z11 = true;
                        }
                        this.f49550x1 = z11;
                        this.f49547w1 = z11;
                        if (i12 <= 0) {
                            j3 = 10;
                        }
                        long k10 = Utilities.k(j3, getMessagesController().I6, 1L);
                        this.f49555z1 = k10;
                        this.f49553y1 = k10;
                    }
                    org.telegram.messenger.g0.h3(new np(this, 0));
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25116y1 && ((Long) objArr[0]).longValue() == (-this.M)) {
            org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
            if (r4Var != null && r4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f49502c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(5, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49502c, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.a5.class, org.telegram.ui.Cells.x4.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.w9.class, org.telegram.ui.Components.wt0.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27890d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49502c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49502c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.V6));
        int i7 = org.telegram.ui.ActionBar.m6.f28282y6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49502c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49502c, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f28072n6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49499b.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f49499b.f32368e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
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
        if (this.f49545w) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().j1(j3);
            tL_communities_toggleParticipantBanned.community = getMessagesController().h1(this.M);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new d3.b(1), new a5(this, 5));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().j1(j3);
        tL_channels_editBanned.channel = getMessagesController().h1(this.M);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new l(this, 4));
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        return l0(z9);
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
        getNotificationCenter().c(this, org.telegram.messenger.qs.T);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25116y1);
        w0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.T);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25116y1);
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
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        nq nqVar = this.f49496a;
        if (nqVar != null) {
            nqVar.f();
        }
        org.telegram.ui.Components.bv0 bv0Var = this.f49499b;
        if (bv0Var != null) {
            bv0Var.requestLayout();
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
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            this.A1 = true;
        }
        if (z9 && !z10 && this.f49524m1) {
            this.f49510f.getSearchField().requestFocus();
            org.telegram.messenger.g0.K3(this.f49510f.getSearchField());
            this.f49510f.setVisibility(8);
        }
    }

    public final int p0() {
        TLRPC.ChatFull chatFull = this.f49533r;
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
        TLRPC.ChatFull chatFull = this.f49533r;
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
        boolean z9;
        if (this.f49532q1 && v0()) {
            z9 = true;
        } else {
            z9 = false;
        }
        TLRPC.ChatFull chatFull = this.f49533r;
        if (chatFull != null) {
            int i7 = chatFull.boosts_unrestrict;
            int i10 = this.f49535r1;
            if (i7 != i10 || ((z9 && i10 == 0) || (!z9 && i10 != 0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean u0(int i7) {
        if (i7 != this.U && i7 != this.V && i7 != this.W && i7 != this.X && i7 != this.Y && i7 != this.Z && i7 != this.f49519j0 && i7 != this.f49497a0 && i7 != this.f49500b0 && i7 != this.f49503c0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        TLRPC.Chat chat = this.f49525n;
        if (chat.megagroup && !chat.gigagroup && org.telegram.messenger.t3.y(13, chat)) {
            if (this.f49528o1 <= 0) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights = this.D;
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
        if (!this.P) {
            int i7 = 0;
            this.I = false;
            this.H = false;
            boolean z9 = this.f49545w;
            int i10 = this.N;
            a0.h hVar = this.K;
            ArrayList arrayList = this.F;
            a0.h hVar2 = this.L;
            ArrayList arrayList2 = this.G;
            a0.h hVar3 = this.J;
            ArrayList arrayList3 = this.E;
            if (z9 && i10 == 2) {
                this.P = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                HashMap hashMap = org.telegram.messenger.g5.r(this.currentAccount).f22615g0;
                ArrayList arrayList4 = org.telegram.messenger.g5.r(this.currentAccount).f22616h0;
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
                        arrayList3.add(getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)));
                    }
                }
                G0();
                nq nqVar = this.f49496a;
                if (nqVar != null) {
                    nqVar.f();
                }
            } else if (!org.telegram.messenger.t3.T(this.f49525n)) {
                this.P = false;
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                hVar3.b();
                hVar2.b();
                hVar.b();
                if (i10 == 1) {
                    TLRPC.ChatFull chatFull2 = this.f49533r;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        int size3 = chatParticipants.participants.size();
                        while (i7 < size3) {
                            TLRPC.ChatParticipant chatParticipant = this.f49533r.participants.participants.get(i7);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                arrayList3.add(chatParticipant);
                            }
                            hVar3.k(chatParticipant, chatParticipant.user_id);
                            i7++;
                        }
                    }
                } else if (i10 == 2 && (chatFull = this.f49533r) != null && chatFull.participants != null) {
                    long j3 = getUserConfig().f24493n;
                    int size4 = this.f49533r.participants.participants.size();
                    while (i7 < size4) {
                        TLRPC.ChatParticipant chatParticipant2 = this.f49533r.participants.participants.get(i7);
                        int i13 = this.f49506d1;
                        if (i13 == 0 || chatParticipant2.user_id != j3) {
                            if (i13 == 1) {
                                if (getContactsController().x(chatParticipant2.user_id)) {
                                    arrayList2.add(chatParticipant2);
                                    hVar2.k(chatParticipant2, chatParticipant2.user_id);
                                } else if (!org.telegram.messenger.t10.x(getMessagesController().a2(Long.valueOf(chatParticipant2.user_id)))) {
                                    arrayList3.add(chatParticipant2);
                                    hVar3.k(chatParticipant2, chatParticipant2.user_id);
                                }
                            } else if (getContactsController().x(chatParticipant2.user_id)) {
                                arrayList2.add(chatParticipant2);
                                hVar2.k(chatParticipant2, chatParticipant2.user_id);
                            } else {
                                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(chatParticipant2.user_id));
                                if (a22 != null && a22.bot) {
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
                nq nqVar2 = this.f49496a;
                if (nqVar2 != null) {
                    nqVar2.f();
                }
                G0();
                nq nqVar3 = this.f49496a;
                if (nqVar3 != null) {
                    nqVar3.f();
                }
            } else {
                this.P = true;
                org.telegram.ui.Components.bv0 bv0Var = this.f49499b;
                if (bv0Var != null) {
                    bv0Var.e(true, false);
                }
                nq nqVar4 = this.f49496a;
                if (nqVar4 != null) {
                    nqVar4.f();
                }
                ArrayList x02 = x0();
                ArrayList arrayList6 = new ArrayList();
                tp tpVar = new tp(this, x02, arrayList6, 0);
                AtomicInteger atomicInteger = new AtomicInteger(0);
                for (int i14 = 0; i14 < x02.size(); i14++) {
                    arrayList6.add(null);
                    getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) x02.get(i14), new bg.k0(arrayList6, i14, atomicInteger, x02, tpVar, 6)), this.classGuid);
                }
            }
        }
    }

    public final ArrayList x0() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().h1(this.M);
        int i7 = this.N;
        if (i7 == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i7 == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i7 == 2) {
            TLRPC.ChatFull chatFull = this.f49533r;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.f49525n) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.f49506d1 == 1) {
                if (!this.I) {
                    this.f49520j1 = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.I = true;
                    arrayList.addAll(x0());
                } else {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                }
            } else if (!this.I) {
                this.f49520j1 = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.I = true;
                arrayList.addAll(x0());
            } else if (!this.H) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.H = true;
                arrayList.addAll(x0());
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            }
        } else if (i7 == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.f26959q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    public final void y0(long j3, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z9, int i7, boolean z10) {
        boolean z11;
        long j10 = this.M;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.D;
        if (tLObject == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        mp mpVar = new mp(j3, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, i7, z9, z11, null);
        mpVar.X0 = new aq(this, tLObject, j3, z10);
        presentFragment(mpVar, z10);
    }

    public final void z0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rq.z0():void");
    }
}
