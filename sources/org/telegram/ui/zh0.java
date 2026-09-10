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
public final class zh0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public yh0 f39322a;
    public Drawable f39323a0;
    public org.telegram.ui.Components.vl0 f39324b;
    public boolean f39325b0;
    public TLRPC.Chat f39326c;
    public boolean f39327c0;
    public TLRPC.ChatFull d;
    public boolean f39328d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean f39329e0;
    public final long f39330f;
    public final int f39331f0;
    public boolean f39332g0;
    public final boolean h;
    public org.telegram.ui.Components.zk0 f39333h0;
    public final ArrayList f39334i0;
    public final ArrayList f39335j0;
    public final HashMap f39336k0;
    public org.telegram.ui.Components.a70 f39337l0;
    public final ArrayList m0;
    public final long f39338n;
    public long f39339n0;
    public boolean f39340o0;
    public final boolean f39341p0;
    public final oh0 f39342q0;
    public int f39343r;
    public boolean f39344r0;
    public int f39345s;
    public final ph0 f39346s0;
    public final AnimationNotificationsLocker f39347t0;
    public int v;
    public int f39348w;
    public int f39349x;
    public int f39350y;

    public zh0(long j3, long j10, int i10) {
        super(null);
        boolean z10;
        this.f39334i0 = new ArrayList();
        this.f39335j0 = new ArrayList();
        this.f39336k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f39342q0 = new oh0(this);
        boolean z11 = false;
        this.f39344r0 = false;
        this.f39346s0 = new ph0(this);
        this.f39347t0 = new AnimationNotificationsLocker();
        this.f39338n = j3;
        this.f39331f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        this.f39326c = chat;
        if (ChatObject.isChannel(chat) && !this.f39326c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j10 == 0) {
            this.f39330f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f39330f = j10;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f39330f));
        if (this.f39330f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f39341p0 = z11;
    }

    public static void U(org.telegram.ui.zh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zh0.U(org.telegram.ui.zh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.zh0 r8, org.telegram.tgnet.TLRPC.TL_error r9, org.telegram.tgnet.TLObject r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zh0.V(org.telegram.ui.zh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(zh0 zh0Var) {
        if (zh0Var.f39330f == zh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = zh0Var.getMessagesController().getInputPeer(-zh0Var.f39338n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = zh0Var.e;
            zh0Var.e = null;
            zh0Var.d.exported_invite = null;
            int sendRequest = zh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new jh0(zh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(zh0Var.f39324b);
            zh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, zh0Var.classGuid);
            return;
        }
        zh0Var.e0(zh0Var.e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f39338n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new jh0(this, tL_chatInviteExported, 1));
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
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 7));
        k0 k0Var = new k0(this, context, 14);
        this.fragmentView = k0Var;
        int i11 = org.telegram.ui.ActionBar.j6.f17872a7;
        k0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f39324b = vl0Var;
        vl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f39324b);
        fg.a0 a0Var = new fg.a0(1, false, 12);
        this.f39324b.setLayoutManager(a0Var);
        org.telegram.ui.Components.vl0 vl0Var2 = this.f39324b;
        yh0 yh0Var = new yh0(this, context);
        this.f39322a = yh0Var;
        vl0Var2.setAdapter(yh0Var);
        this.f39324b.setOnScrollListener(new hi.p3(6, this, a0Var));
        this.f39333h0 = new org.telegram.ui.Components.zk0(this.f39324b, false);
        s4.j jVar = new s4.j();
        jVar.n(420L);
        jVar.o(org.telegram.ui.Components.wr.h);
        jVar.C = false;
        jVar.f41645m = false;
        this.f39324b.setItemAnimator(jVar);
        org.telegram.ui.Components.vl0 vl0Var3 = this.f39324b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        vl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f39324b, w7.a6.c(-1.0f, -1));
        this.f39324b.setOnItemClickListener(new ai.b0(18, this, context));
        this.f39324b.setOnItemLongClickListener(new lh0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f39323a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f39339n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f39328d0;
        long j3 = this.f39338n;
        if (z11 && !this.f39329e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new ih0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
            long clientUserId = getUserConfig().getClientUserId();
            long j10 = this.f39330f;
            if (j10 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j10);
            }
            boolean z12 = this.f39344r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f39335j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hc.b.i(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hc.b.i(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f39334i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hc.b.i(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hc.b.i(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f39340o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new bi.f2(this, tL_chatInviteExported, z12, 6)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f39338n)) {
            org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
            if (f5Var != null && f5Var.getLastFragment() == this) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f39338n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new jh0(this, tL_chatInviteExported, 2));
    }

    public final qh0 f0() {
        qh0 qh0Var = new qh0(this);
        qh0Var.f(qh0Var.f36060i);
        qh0Var.f36057c = this.f39350y;
        qh0Var.d = this.E;
        qh0Var.e = this.H;
        qh0Var.f36058f = this.I;
        qh0Var.f36059g = this.U;
        qh0Var.h = this.V;
        qh0Var.f36056b = this.X;
        qh0Var.f36062k.clear();
        qh0Var.f36062k.addAll(this.f39334i0);
        qh0Var.f36063l.clear();
        qh0Var.f36063l.addAll(this.f39335j0);
        return qh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f39340o0 = ChatObject.isPublic(this.f39326c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.f2.class, org.telegram.ui.Components.f90.class, wh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.f18306y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{sh0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f17985g9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18236u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18254v6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18126o6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 32, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{org.telegram.ui.Cells.f2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18056k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{wh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 0, new Class[]{wh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39324b, 8, new Class[]{wh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Uh));
        return arrayList;
    }

    public final void h0(qh0 qh0Var) {
        if (!this.isPaused && this.f39322a != null && this.f39324b != null) {
            i0(false);
            qh0Var.f(qh0Var.f36061j);
            s4.o.c(qh0Var, true).b(this.f39322a);
            AndroidUtilities.updateVisibleRows(this.f39324b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z10) {
        yh0 yh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f39338n));
        this.f39326c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f39350y = -1;
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
            this.f39343r = -1;
            this.f39349x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f39348w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f39330f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f39343r = i11;
            }
            int i12 = this.X;
            this.f39345s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f39334i0;
            if (!z11) {
                this.f39348w = i13;
                this.X = i12 + 4;
                this.f39349x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f39348w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f39350y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f39349x >= 0 && (!this.W || this.f39328d0 || this.f39344r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f39349x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f39335j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f39349x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f39350y == -1) {
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
            if (!this.f39328d0 && !this.f39344r0 && ((this.W || this.f39325b0) && !z11)) {
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
                    yh0Var = this.f39322a;
                    if (yh0Var == null && z10) {
                        yh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            yh0Var = this.f39322a;
            if (yh0Var == null) {
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
        yh0 yh0Var = this.f39322a;
        if (yh0Var != null) {
            yh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.a70 a70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f39332g0 = true;
            if (z11 && (a70Var = this.f39337l0) != null && a70Var.f21411l0) {
                a70Var.show();
            }
        }
        this.f39347t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f39347t0.lock();
    }
}
