package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
public class sh0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public boolean D;
    public boolean E;
    public boolean F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final a0.g R;
    public org.telegram.ui.Components.ei0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final m4 Z;
    public TLRPC.ChatFull f41512a;
    public FrameLayout f41513a0;
    public final long f41514b;
    public oh0 f41515b0;
    public final int f41516c;
    public bg.h f41517c0;
    public qh0 d;
    public final boolean f41518d0;
    public org.telegram.ui.Components.xy e;
    public r61 f41519e0;
    public org.telegram.ui.Components.tk0 f41520f;
    public s4.a0 h;
    public final org.telegram.messenger.jj f41521n;
    public g61 f41522r;
    public g61 f41523s;
    public final e2.j0 f41524w;
    public t61 f41525x;
    public final ArrayList f41526y;

    public sh0(long j10, org.telegram.messenger.jj jjVar, boolean z10) {
        super(null);
        this.f41524w = new e2.j0(15, 3);
        this.f41526y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.f41521n = jjVar;
        this.f41516c = 0;
        this.f41514b = j10;
        this.f41512a = getMessagesController().M0(j10);
        this.f41518d0 = z10;
    }

    public static void Y(sh0 sh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        sh0Var.D = true;
        if (tL_error != null) {
            sh0Var.l0();
            return;
        }
        if (tLObject instanceof TL_stories.TL_stats_storyStats) {
            TL_stories.TL_stats_storyStats tL_stats_storyStats = (TL_stories.TL_stats_storyStats) tLObject;
            statsGraph = tL_stats_storyStats.views_graph;
            statsGraph2 = tL_stats_storyStats.reactions_by_emotion_graph;
        } else {
            TL_stats.TL_messageStats tL_messageStats = (TL_stats.TL_messageStats) tLObject;
            statsGraph = tL_messageStats.views_graph;
            statsGraph2 = tL_messageStats.reactions_by_emotion_graph;
        }
        sh0Var.f41522r = u61.h0(statsGraph, org.telegram.messenger.cd.L0(2131743556, null), 1, false);
        sh0Var.f41523s = u61.h0(statsGraph2, org.telegram.messenger.cd.L0(2131746400, null), 2, false);
        g61 g61Var = sh0Var.f41522r;
        if (g61Var != null && g61Var.d.f4164a.length <= 5) {
            sh0Var.D = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            g61 g61Var2 = sh0Var.f41522r;
            tL_loadAsyncGraph.token = g61Var2.f37437g;
            long[] jArr = g61Var2.d.f4164a;
            tL_loadAsyncGraph.f20025x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(sh0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(sh0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new aa(sh0Var, sh0Var.f41522r.f37437g + "_" + tL_loadAsyncGraph.f20025x, tL_loadAsyncGraph, 24), null, null, 0, sh0Var.f41512a.stats_dc, 1, true), sh0Var.classGuid);
            return;
        }
        sh0Var.l0();
    }

    public static void Z(sh0 sh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = sh0Var.f41526y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                sh0Var.G = tL_publicForwards.next_offset;
            } else {
                sh0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                sh0Var.U = i10;
            } else if (sh0Var.U == 0) {
                sh0Var.U = tL_publicForwards.forwards.size();
            }
            if (sh0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sh0Var.V = z10;
            sh0Var.getMessagesController().P3(tL_publicForwards.chats, false);
            sh0Var.getMessagesController().V3(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.o5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f20031id;
                    org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(sh0Var.currentAccount, storyItem);
                    jjVar.r0(false);
                    arrayList.add(jjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.jj(sh0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.xy xyVar = sh0Var.e;
            if (xyVar != null) {
                xyVar.c();
            }
        }
        sh0Var.F = true;
        sh0Var.E = false;
        sh0Var.l0();
    }

    public static void a0(sh0 sh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        boolean z10;
        ArrayList arrayList = sh0Var.f41526y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                sh0Var.G = tL_publicForwards.next_offset;
            } else {
                sh0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                sh0Var.U = i10;
            } else if (sh0Var.U == 0) {
                sh0Var.U = tL_publicForwards.forwards.size();
            }
            if (sh0Var.G == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            sh0Var.V = z10;
            sh0Var.getMessagesController().P3(tL_publicForwards.chats, false);
            sh0Var.getMessagesController().V3(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.o5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.f20031id;
                    org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(sh0Var.currentAccount, storyItem);
                    jjVar.r0(false);
                    arrayList.add(jjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.jj(sh0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.xy xyVar = sh0Var.e;
            if (xyVar != null) {
                xyVar.c();
            }
        }
        sh0Var.F = true;
        sh0Var.E = false;
        sh0Var.l0();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.fk));
    }

    @Override
    public final android.view.View createView(android.content.Context r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sh0.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.f41512a == null && chatFull.f19794id == this.f41514b) {
                j0();
                this.f41512a = chatFull;
                h0();
                g0();
                k0();
            }
        }
    }

    public final void e0() {
        View subtitleTextView;
        org.telegram.ui.Components.tk0 tk0Var = this.f41520f;
        if (tk0Var != null) {
            int childCount = tk0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                i0(this.f41520f.getChildAt(i10));
            }
            int hiddenChildCount = this.f41520f.getHiddenChildCount();
            for (int i11 = 0; i11 < hiddenChildCount; i11++) {
                i0(this.f41520f.V(i11));
            }
            int cachedChildCount = this.f41520f.getCachedChildCount();
            for (int i12 = 0; i12 < cachedChildCount; i12++) {
                i0(this.f41520f.P(i12));
            }
            int attachedScrapChildCount = this.f41520f.getAttachedScrapChildCount();
            for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
                i0(this.f41520f.O(i13));
            }
            this.f41520f.getRecycledViewPool().a();
        }
        bg.h hVar = this.f41517c0;
        if (hVar != null) {
            hVar.f2686c = true;
        }
        oh0 oh0Var = this.f41515b0;
        if (oh0Var == null) {
            subtitleTextView = null;
        } else {
            subtitleTextView = oh0Var.getSubtitleTextView();
        }
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.u5) {
            ((org.telegram.ui.ActionBar.u5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Dj, getResourceProvider()));
        }
    }

    public final boolean f0(org.telegram.messenger.jj jjVar) {
        if (jjVar.x4() && (jjVar.f16341l instanceof TL_stories.TL_storyItemDeleted)) {
            org.telegram.messenger.m5.n(null, 2131744625, org.telegram.ui.Components.cc.a0(this), 2131624233, 36);
            return true;
        }
        return false;
    }

    public final void g0() {
        if (this.E) {
            return;
        }
        this.E = true;
        qh0 qh0Var = this.d;
        if (qh0Var != null) {
            qh0Var.f();
        }
        org.telegram.messenger.jj jjVar = this.f41521n;
        String str = "";
        if (jjVar.x4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.f20024id = jjVar.f16341l.f20031id;
            tL_getStoryPublicForwards.peer = getMessagesController().i1(-this.f41514b);
            String str2 = this.G;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new mh0(this, 1), null, null, 0, this.f41512a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = jjVar.f16337k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().g1(-jjVar.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = jjVar.f1();
            tL_getMessagePublicForwards.channel = getMessagesController().g1(-org.telegram.messenger.jj.B0(jjVar.f16337k));
        }
        String str3 = this.G;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new mh0(this, 2), null, null, 0, this.f41512a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.u5 u5Var;
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(13, this);
        oh0 oh0Var = this.f41515b0;
        View view = null;
        if (oh0Var != null) {
            u5Var = oh0Var.getTitleTextView();
        } else {
            u5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(u5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Cj));
        oh0 oh0Var2 = this.f41515b0;
        if (oh0Var2 != null) {
            view = oh0Var2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(org.telegram.ui.ActionBar.t6.Dj, view));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41520f, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21311y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41520f, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21115n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        u61.m0(this.f41522r, arrayList, g6Var);
        u61.m0(this.f41523s, arrayList, g6Var);
        return arrayList;
    }

    public final void h0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        org.telegram.messenger.jj jjVar = this.f41521n;
        if (jjVar.x4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.f20033id = jjVar.f16341l.f20031id;
            tL_stats_getStoryStats.peer = getMessagesController().i1(-this.f41514b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = jjVar.f16337k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().g1(-jjVar.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = jjVar.f1();
                tL_getMessageStats2.channel = getMessagesController().g1(-org.telegram.messenger.jj.B0(jjVar.f16337k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new mh0(this, 0), null, null, 0, this.f41512a.stats_dc, 1, true);
    }

    public final void i0(View view) {
        if (view instanceof org.telegram.ui.Cells.e5) {
            org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21311y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21115n6, getResourceProvider());
            e5Var.O = true;
            e5Var.H = w02;
            e5Var.I = w03;
            e5Var.d(0);
        } else if (view instanceof e61) {
            ((e61) view).d();
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, view, getResourceProvider());
        } else {
            boolean z10 = view instanceof org.telegram.ui.Cells.c7;
            if (z10 && (view.getBackground() instanceof org.telegram.ui.Components.eq) && (((org.telegram.ui.Components.eq) view.getBackground()).f25839a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.eq) view.getBackground()).f25839a).setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, getResourceProvider()));
                view.invalidate();
            } else if (z10) {
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20872a7, getResourceProvider())), org.telegram.ui.ActionBar.t6.Y0(org.telegram.messenger.w0.f19025b, 2131231230, org.telegram.ui.ActionBar.t6.f20892b7), 0, 0);
                eqVar.f25847x = true;
                view.setBackground(eqVar);
            } else if (view instanceof dg.d) {
                ((dg.d) view).a();
            } else if (view instanceof rh0) {
                int i10 = rh0.d;
                ((rh0) view).a();
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.o3) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, view, getResourceProvider());
        }
    }

    @Override
    public boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0() {
        org.telegram.messenger.jj jjVar = this.f41521n;
        if (jjVar.x4()) {
            this.f41515b0.setTitle(org.telegram.messenger.cd.L0(2131744484, null));
            oh0 oh0Var = this.f41515b0;
            if (oh0Var.getSubtitleTextView() != null) {
                oh0Var.getSubtitleTextView().setVisibility(8);
            }
            oh0 oh0Var2 = this.f41515b0;
            oh0Var2.f30268b = true;
            oh0Var2.setStoriesForceState(1);
            ArrayList arrayList = jjVar.f16348n0;
            if (arrayList != null) {
                this.f41515b0.getAvatarImageView().l(org.telegram.messenger.ic.f(org.telegram.messenger.b8.w(arrayList, org.telegram.messenger.i0.Z0(false), false, null, false), jjVar.f16342l0), "50_50", org.telegram.messenger.ic.f(org.telegram.messenger.b8.w(jjVar.f16348n0, 50, false, null, false), jjVar.f16342l0), "b1", 0, this.f41521n);
                this.f41515b0.setClipChildren(false);
                this.f41515b0.getAvatarImageView().setScaleX(0.96f);
                this.f41515b0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        this.f41515b0.setTitle(org.telegram.messenger.cd.L0(2131747112, null));
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.f41514b));
        if (L0 != null && !this.Y) {
            this.f41515b0.setChatAvatar(L0);
        }
    }

    public final void k0() {
        TLRPC.ChatFull chatFull;
        if (this.f41518d0 && (chatFull = this.f41512a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
            ArrayList arrayList = p5.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            p5.removeAllViews();
            p5.a(0, 2131231245).e(1, 2131232377, org.telegram.messenger.cd.L0(2131743585, null));
        }
    }

    public final void l0() {
        a0.g gVar = this.R;
        gVar.clear();
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.O = -1;
        this.N = -1;
        this.Q = 0;
        if (this.F && this.D) {
            org.telegram.messenger.i0.r(this.Z);
            if (this.f41513a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.voip.h2(this, 16));
                this.f41513a0.setVisibility(0);
                this.f41513a0.setAlpha(0.0f);
                this.f41513a0.animate().alpha(1.0f).start();
            }
            int i10 = this.Q;
            this.O = i10;
            this.N = i10 + 1;
            this.Q = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.f41522r != null) {
                int i11 = this.Q;
                this.L = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.f41523s != null) {
                int i12 = this.Q;
                this.M = i12;
                this.Q = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.f41526y;
            if (!arrayList.isEmpty()) {
                int i13 = this.Q;
                int i14 = i13 + 1;
                this.Q = i14;
                this.H = i13;
                this.I = i14;
                int size = arrayList.size() + i14;
                this.J = size;
                this.P = size;
                this.Q = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.V) {
                    int i15 = this.Q;
                    this.Q = i15 + 1;
                    this.K = i15;
                }
            }
        }
        qh0 qh0Var = this.d;
        if (qh0Var != null) {
            qh0Var.f();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.f41512a != null) {
            h0();
            g0();
        } else {
            org.telegram.messenger.vp.r1(this.currentAccount).T2(this.classGuid, this.f41514b, true);
        }
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.T);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        qh0 qh0Var = this.d;
        if (qh0Var != null) {
            qh0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            oh0 oh0Var = this.f41515b0;
            if (oh0Var != null) {
                oh0Var.i(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, getResourceProvider()), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Dj, getResourceProvider()));
            }
            e0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public sh0(org.telegram.messenger.jj jjVar) {
        super(null);
        this.f41524w = new e2.j0(15, 3);
        this.f41526y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.f41521n = jjVar;
        if (jjVar.f16337k.fwd_from == null) {
            this.f41514b = jjVar.x0();
            this.f41516c = jjVar.f1();
        } else {
            this.f41514b = -jjVar.Z0();
            this.f41516c = jjVar.f16337k.fwd_msg_id;
        }
        this.f41512a = getMessagesController().M0(this.f41514b);
    }
}
