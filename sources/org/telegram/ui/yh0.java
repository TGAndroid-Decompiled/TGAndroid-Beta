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
public final class yh0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public xh0 f43119a;
    public Drawable f43120a0;
    public org.telegram.ui.Components.ll0 f43121b;
    public boolean f43122b0;
    public TLRPC.Chat f43123c;
    public boolean f43124c0;
    public TLRPC.ChatFull d;
    public boolean f43125d0;
    public TLRPC.TL_chatInviteExported f43126e;
    public boolean f43127e0;
    public final long f43128f;
    public final int f43129f0;
    public boolean f43130g0;
    public final boolean h;
    public org.telegram.ui.Components.qk0 f43131h0;
    public final ArrayList f43132i0;
    public final ArrayList f43133j0;
    public final HashMap f43134k0;
    public org.telegram.ui.Components.r60 f43135l0;
    public final ArrayList m0;
    public final long f43136n;
    public long f43137n0;
    public boolean f43138o0;
    public final boolean f43139p0;
    public final nh0 f43140q0;
    public int f43141r;
    public boolean f43142r0;
    public int f43143s;
    public final oh0 f43144s0;
    public final AnimationNotificationsLocker f43145t0;
    public int v;
    public int f43146w;
    public int f43147x;
    public int f43148y;

    public yh0(long j3, long j10, int i10) {
        super(null);
        boolean z10;
        this.f43132i0 = new ArrayList();
        this.f43133j0 = new ArrayList();
        this.f43134k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f43140q0 = new nh0(this);
        boolean z11 = false;
        this.f43142r0 = false;
        this.f43144s0 = new oh0(this);
        this.f43145t0 = new AnimationNotificationsLocker();
        this.f43136n = j3;
        this.f43129f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        this.f43123c = chat;
        if (ChatObject.isChannel(chat) && !this.f43123c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j10 == 0) {
            this.f43128f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f43128f = j10;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f43128f));
        if (this.f43128f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f43139p0 = z11;
    }

    public static void U(org.telegram.ui.yh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yh0.U(org.telegram.ui.yh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.yh0 r8, org.telegram.tgnet.TLRPC.TL_error r9, org.telegram.tgnet.TLObject r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yh0.V(org.telegram.ui.yh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(yh0 yh0Var) {
        if (yh0Var.f43128f == yh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = yh0Var.getMessagesController().getInputPeer(-yh0Var.f43136n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = yh0Var.f43126e;
            yh0Var.f43126e = null;
            yh0Var.d.exported_invite = null;
            int sendRequest = yh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ih0(yh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(yh0Var.f43121b);
            yh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, yh0Var.classGuid);
            return;
        }
        yh0Var.e0(yh0Var.f43126e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f43136n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ih0(this, tL_chatInviteExported, 1));
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
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 8));
        j0 j0Var = new j0(this, context, 14);
        this.fragmentView = j0Var;
        int i11 = org.telegram.ui.ActionBar.j6.f20607a7;
        j0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f43121b = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f43121b);
        hg.b0 b0Var = new hg.b0(1, false, 12);
        this.f43121b.setLayoutManager(b0Var);
        org.telegram.ui.Components.ll0 ll0Var2 = this.f43121b;
        xh0 xh0Var = new xh0(this, context);
        this.f43119a = xh0Var;
        ll0Var2.setAdapter(xh0Var);
        this.f43121b.setOnScrollListener(new ji.l3(6, this, b0Var));
        this.f43131h0 = new org.telegram.ui.Components.qk0(this.f43121b, false);
        s4.j jVar = new s4.j();
        jVar.n(420L);
        jVar.o(org.telegram.ui.Components.pr.h);
        jVar.C = false;
        jVar.f45777m = false;
        this.f43121b.setItemAnimator(jVar);
        org.telegram.ui.Components.ll0 ll0Var3 = this.f43121b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        ll0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f43121b, w7.x5.c(-1.0f, -1));
        this.f43121b.setOnItemClickListener(new bi.x5(19, this, context));
        this.f43121b.setOnItemLongClickListener(new kh0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f43120a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f43137n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f43125d0;
        long j3 = this.f43136n;
        if (z11 && !this.f43127e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new hh0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
            long clientUserId = getUserConfig().getClientUserId();
            long j10 = this.f43128f;
            if (j10 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j10);
            }
            boolean z12 = this.f43142r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f43133j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.g.h(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.g.h(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f43132i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) i2.g.h(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) i2.g.h(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f43138o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f43126e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new di.v1(this, tL_chatInviteExported, z12, 6)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f43136n)) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f43136n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ih0(this, tL_chatInviteExported, 2));
    }

    public final ph0 f0() {
        ph0 ph0Var = new ph0(this);
        ph0Var.f(ph0Var.f39519i);
        ph0Var.f39515c = this.f43148y;
        ph0Var.d = this.E;
        ph0Var.f39516e = this.H;
        ph0Var.f39517f = this.I;
        ph0Var.f39518g = this.U;
        ph0Var.h = this.V;
        ph0Var.f39514b = this.X;
        ph0Var.f39521k.clear();
        ph0Var.f39521k.addAll(this.f43132i0);
        ph0Var.f39522l.clear();
        ph0Var.f39522l.addAll(this.f43133j0);
        return ph0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f43126e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f43138o0 = ChatObject.isPublic(this.f43123c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.j6.f20663d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.f2.class, org.telegram.ui.Components.w80.class, vh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f20607a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20937s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20627b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f21042y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f20846n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, null, org.telegram.ui.ActionBar.j6.f20910r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{rh0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20721g9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20972u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 262144, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20990v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20862o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 32, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20792k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{vh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 0, new Class[]{vh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43121b, 8, new Class[]{vh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Uh));
        return arrayList;
    }

    public final void h0(ph0 ph0Var) {
        if (!this.isPaused && this.f43119a != null && this.f43121b != null) {
            i0(false);
            ph0Var.f(ph0Var.f39520j);
            s4.o.c(ph0Var, true).b(this.f43119a);
            AndroidUtilities.updateVisibleRows(this.f43121b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z10) {
        xh0 xh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f43136n));
        this.f43123c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f43148y = -1;
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
            this.f43141r = -1;
            this.f43147x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f43146w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f43128f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f43141r = i11;
            }
            int i12 = this.X;
            this.f43143s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f43132i0;
            if (!z11) {
                this.f43146w = i13;
                this.X = i12 + 4;
                this.f43147x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f43146w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f43148y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f43147x >= 0 && (!this.W || this.f43125d0 || this.f43142r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f43147x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f43133j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f43147x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f43148y == -1) {
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
            if (!this.f43125d0 && !this.f43142r0 && ((this.W || this.f43122b0) && !z11)) {
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
                    xh0Var = this.f43119a;
                    if (xh0Var == null && z10) {
                        xh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            xh0Var = this.f43119a;
            if (xh0Var == null) {
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
        xh0 xh0Var = this.f43119a;
        if (xh0Var != null) {
            xh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.r60 r60Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f43130g0 = true;
            if (z11 && (r60Var = this.f43135l0) != null && r60Var.f29955l0) {
                r60Var.show();
            }
        }
        this.f43145t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f43145t0.lock();
    }
}
