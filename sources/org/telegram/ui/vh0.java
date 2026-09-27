package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vh0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
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
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public int X;
    public Drawable Y;
    public Drawable Z;
    public uh0 f38582a;
    public Drawable f38583a0;
    public org.telegram.ui.Components.yl0 f38584b;
    public boolean f38585b0;
    public TLRPC.Chat f38586c;
    public boolean f38587c0;
    public TLRPC.ChatFull d;
    public boolean f38588d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f38589e0;
    public final long f38590f;
    public final int f38591f0;
    public boolean f38592g0;
    public final boolean h;
    public org.telegram.ui.Components.dl0 f38593h0;
    public final ArrayList f38594i0;
    public final ArrayList f38595j0;
    public final HashMap f38596k0;
    public org.telegram.ui.Components.e70 f38597l0;
    public final ArrayList m0;
    public final long f38598n;
    public long f38599n0;
    public boolean f38600o0;
    public final boolean f38601p0;
    public final kh0 f38602q0;
    public int f38603r;
    public boolean f38604r0;
    public int f38605s;
    public final lh0 f38606s0;
    public final AnimationNotificationsLocker f38607t0;
    public int v;
    public int f38608w;
    public int f38609x;
    public int f38610y;

    public vh0(long j3, long j10, int i10) {
        super(null);
        boolean z10;
        this.f38594i0 = new ArrayList();
        this.f38595j0 = new ArrayList();
        this.f38596k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f38602q0 = new kh0(this);
        boolean z11 = false;
        this.f38604r0 = false;
        this.f38606s0 = new lh0(this);
        this.f38607t0 = new AnimationNotificationsLocker();
        this.f38598n = j3;
        this.f38591f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        this.f38586c = chat;
        if (ChatObject.isChannel(chat) && !this.f38586c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j10 == 0) {
            this.f38590f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f38590f = j10;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f38590f));
        if (this.f38590f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f38601p0 = z11;
    }

    public static void U(org.telegram.ui.vh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vh0.U(org.telegram.ui.vh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.vh0 r8, org.telegram.tgnet.TLRPC.TL_error r9, org.telegram.tgnet.TLObject r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vh0.V(org.telegram.ui.vh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(vh0 vh0Var) {
        if (vh0Var.f38590f == vh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = vh0Var.getMessagesController().getInputPeer(-vh0Var.f38598n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = vh0Var.e;
            vh0Var.e = null;
            vh0Var.d.exported_invite = null;
            int sendRequest = vh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new fh0(vh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(vh0Var.f38584b);
            vh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, vh0Var.classGuid);
            return;
        }
        vh0Var.e0(vh0Var.e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f38598n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new fh0(this, tL_chatInviteExported, 1));
    }

    public final void c0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        boolean z10 = false;
        if (tL_chatInviteExported.expire_date > 0) {
            if (getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date) {
                z10 = true;
            }
            tL_chatInviteExported.expired = z10;
            return;
        }
        int i10 = tL_chatInviteExported.usage_limit;
        if (i10 > 0) {
            if (tL_chatInviteExported.usage >= i10) {
                z10 = true;
            }
            tL_chatInviteExported.expired = z10;
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new t70(this, 7));
        l0 l0Var = new l0(this, context, 13);
        this.fragmentView = l0Var;
        int i11 = org.telegram.ui.ActionBar.i6.f19001a7;
        l0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f38584b = yl0Var;
        yl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f38584b);
        gg.b0 b0Var = new gg.b0(1, false, 12);
        this.f38584b.setLayoutManager(b0Var);
        org.telegram.ui.Components.yl0 yl0Var2 = this.f38584b;
        uh0 uh0Var = new uh0(this, context);
        this.f38582a = uh0Var;
        yl0Var2.setAdapter(uh0Var);
        this.f38584b.setOnScrollListener(new ii.n3(6, this, b0Var));
        this.f38593h0 = new org.telegram.ui.Components.dl0(this.f38584b, false);
        s4.j jVar = new s4.j();
        jVar.n(420L);
        jVar.o(org.telegram.ui.Components.sr.h);
        jVar.C = false;
        jVar.f43040m = false;
        this.f38584b.setItemAnimator(jVar);
        org.telegram.ui.Components.yl0 yl0Var3 = this.f38584b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        yl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f38584b, w7.y5.c(-1.0f, -1));
        this.f38584b.setOnItemClickListener(new ai.n6(19, this, context));
        this.f38584b.setOnItemLongClickListener(new hh0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f38583a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f38599n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f38588d0;
        long j3 = this.f38598n;
        if (z11 && !this.f38589e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new eh0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
            long clientUserId = getUserConfig().getClientUserId();
            long j10 = this.f38590f;
            if (j10 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j10);
            }
            boolean z12 = this.f38604r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f38595j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hg.k0.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hg.k0.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f38594i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hg.k0.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hg.k0.g(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f38600o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ci.v1(this, tL_chatInviteExported, z12, 6)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f38598n)) {
            org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
            if (d5Var != null && d5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f38598n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new fh0(this, tL_chatInviteExported, 2));
    }

    public final mh0 f0() {
        mh0 mh0Var = new mh0(this);
        mh0Var.f(mh0Var.f35699i);
        mh0Var.f35696c = this.f38610y;
        mh0Var.d = this.E;
        mh0Var.e = this.H;
        mh0Var.f35697f = this.I;
        mh0Var.f35698g = this.U;
        mh0Var.h = this.V;
        mh0Var.f35695b = this.X;
        mh0Var.f35701k.clear();
        mh0Var.f35701k.addAll(this.f38594i0);
        mh0Var.f35702l.clear();
        mh0Var.f35702l.addAll(this.f38595j0);
        return mh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f38600o0 = ChatObject.isPublic(this.f38586c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.i6.f19057d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.g2.class, org.telegram.ui.Components.i90.class, sh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.i6.f19001a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f19147i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f19179k0, null, null, org.telegram.ui.ActionBar.i6.f19058d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19021b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.f19442y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f19242n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.i6.f19310r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{oh0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19114g9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19372u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19390v6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19259o6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 32, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19186k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{sh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 0, new Class[]{sh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38584b, 8, new Class[]{sh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Uh));
        return arrayList;
    }

    public final void h0(mh0 mh0Var) {
        if (!this.isPaused && this.f38582a != null && this.f38584b != null) {
            i0(false);
            mh0Var.f(mh0Var.f35700j);
            s4.o.c(mh0Var, true).b(this.f38582a);
            AndroidUtilities.updateVisibleRows(this.f38584b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z10) {
        uh0 uh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f38598n));
        this.f38586c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f38610y = -1;
            this.E = -1;
            this.F = -1;
            this.H = -1;
            this.I = -1;
            this.L = -1;
            this.J = -1;
            this.K = -1;
            this.N = -1;
            this.M = -1;
            this.O = -1;
            this.f38603r = -1;
            this.f38609x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f38608w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f38590f != getAccountInstance().getUserConfig().clientUserId) {
                z11 = true;
            }
            if (z11) {
                int i10 = this.X;
                this.Q = i10;
                this.X = i10 + 2;
                this.R = i10 + 1;
            } else {
                int i11 = this.X;
                this.X = i11 + 1;
                this.f38603r = i11;
            }
            int i12 = this.X;
            this.f38605s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f38594i0;
            if (!z11) {
                this.f38608w = i13;
                this.X = i12 + 4;
                this.f38609x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f38608w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f38610y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f38609x >= 0 && (!this.W || this.f38588d0 || this.f38604r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f38609x >= 0) && this.O == -1) {
                        int i17 = this.X;
                        this.X = i17 + 1;
                        this.T = i17;
                    }
                    int i18 = this.X;
                    int i19 = i18 + 1;
                    this.X = i19;
                    this.S = i18;
                    this.U = i19;
                    int size2 = arrayList2.size() + i19;
                    this.X = size2;
                    this.V = size2;
                }
            }
            ArrayList arrayList3 = this.f38595j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f38609x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f38610y == -1) {
                    int i22 = this.X;
                    this.X = i22 + 1;
                    this.J = i22;
                }
                int i23 = this.X;
                int i24 = i23 + 1;
                this.X = i24;
                this.L = i23;
                this.H = i24;
                int size3 = arrayList3.size() + i24;
                this.I = size3;
                this.M = size3;
                this.X = size3 + 2;
                this.N = size3 + 1;
            }
            if (!this.f38588d0 && !this.f38604r0 && ((this.W || this.f38585b0) && !z11)) {
                int i25 = this.X;
                this.X = i25 + 1;
                this.F = i25;
            }
            if (!arrayList.isEmpty()) {
                int i26 = this.E;
                int i27 = this.X;
                if (i26 == i27) {
                    this.X = i27 + 1;
                    this.G = i27;
                    uh0Var = this.f38582a;
                    if (uh0Var == null && z10) {
                        uh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            uh0Var = this.f38582a;
            if (uh0Var == null) {
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        uh0 uh0Var = this.f38582a;
        if (uh0Var != null) {
            uh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.e70 e70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f38592g0 = true;
            if (z11 && (e70Var = this.f38597l0) != null && e70Var.f23953l0) {
                e70Var.show();
            }
        }
        this.f38607t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f38607t0.lock();
    }
}
