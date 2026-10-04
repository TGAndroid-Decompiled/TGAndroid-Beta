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
public final class wh0 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public vh0 f42474a;
    public Drawable f42475a0;
    public org.telegram.ui.Components.zl0 f42476b;
    public boolean f42477b0;
    public TLRPC.Chat f42478c;
    public boolean f42479c0;
    public TLRPC.ChatFull d;
    public boolean f42480d0;
    public TLRPC.TL_chatInviteExported f42481e;
    public boolean f42482e0;
    public final long f42483f;
    public final int f42484f0;
    public boolean f42485g0;
    public final boolean h;
    public org.telegram.ui.Components.dl0 f42486h0;
    public final ArrayList f42487i0;
    public final ArrayList f42488j0;
    public final HashMap f42489k0;
    public org.telegram.ui.Components.f70 f42490l0;
    public final ArrayList m0;
    public final long f42491n;
    public long f42492n0;
    public boolean f42493o0;
    public final boolean f42494p0;
    public final lh0 f42495q0;
    public int f42496r;
    public boolean f42497r0;
    public int f42498s;
    public final mh0 f42499s0;
    public final AnimationNotificationsLocker f42500t0;
    public int v;
    public int f42501w;
    public int f42502x;
    public int f42503y;

    public wh0(long j3, long j10, int i10) {
        super(null);
        boolean z10;
        this.f42487i0 = new ArrayList();
        this.f42488j0 = new ArrayList();
        this.f42489k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f42495q0 = new lh0(this);
        boolean z11 = false;
        this.f42497r0 = false;
        this.f42499s0 = new mh0(this);
        this.f42500t0 = new AnimationNotificationsLocker();
        this.f42491n = j3;
        this.f42484f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        this.f42478c = chat;
        if (ChatObject.isChannel(chat) && !this.f42478c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j10 == 0) {
            this.f42483f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f42483f = j10;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f42483f));
        if (this.f42483f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f42494p0 = z11;
    }

    public static void S(org.telegram.ui.wh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wh0.S(org.telegram.ui.wh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void T(org.telegram.ui.wh0 r8, org.telegram.tgnet.TLRPC.TL_error r9, org.telegram.tgnet.TLObject r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wh0.T(org.telegram.ui.wh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void U(wh0 wh0Var) {
        if (wh0Var.f42483f == wh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = wh0Var.getMessagesController().getInputPeer(-wh0Var.f42491n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = wh0Var.f42481e;
            wh0Var.f42481e = null;
            wh0Var.d.exported_invite = null;
            int sendRequest = wh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new gh0(wh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(wh0Var.f42476b);
            wh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, wh0Var.classGuid);
            return;
        }
        wh0Var.e0(wh0Var.f42481e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f42491n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new gh0(this, tL_chatInviteExported, 1));
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
        int i11 = org.telegram.ui.ActionBar.i6.f20766a7;
        k0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f42476b = zl0Var;
        zl0Var.s1();
        this.actionBar.setAdaptiveBackground(this.f42476b);
        gg.b0 b0Var = new gg.b0(1, false, 12);
        this.f42476b.setLayoutManager(b0Var);
        org.telegram.ui.Components.zl0 zl0Var2 = this.f42476b;
        vh0 vh0Var = new vh0(this, context);
        this.f42474a = vh0Var;
        zl0Var2.setAdapter(vh0Var);
        this.f42476b.setOnScrollListener(new ii.n3(6, this, b0Var));
        this.f42486h0 = new org.telegram.ui.Components.dl0(this.f42476b, false);
        s4.j jVar = new s4.j();
        jVar.n(420L);
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f46570m = false;
        this.f42476b.setItemAnimator(jVar);
        org.telegram.ui.Components.zl0 zl0Var3 = this.f42476b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        zl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f42476b, w7.z5.c(-1.0f, -1));
        this.f42476b.setOnItemClickListener(new ai.n6(19, this, context));
        this.f42476b.setOnItemLongClickListener(new ih0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f42475a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f42492n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f42480d0;
        long j3 = this.f42491n;
        if (z11 && !this.f42482e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new fh0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
            long clientUserId = getUserConfig().getClientUserId();
            long j10 = this.f42483f;
            if (j10 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j10);
            }
            boolean z12 = this.f42497r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f42488j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f42487i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f42493o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f42481e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ci.v1(this, tL_chatInviteExported, z12, 6)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f42491n)) {
            org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
            if (c5Var != null && c5Var.getLastFragment() == this) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f42491n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new gh0(this, tL_chatInviteExported, 2));
    }

    public final nh0 f0() {
        nh0 nh0Var = new nh0(this);
        nh0Var.f(nh0Var.f38992i);
        nh0Var.f38988c = this.f42503y;
        nh0Var.d = this.E;
        nh0Var.f38989e = this.H;
        nh0Var.f38990f = this.I;
        nh0Var.f38991g = this.U;
        nh0Var.h = this.V;
        nh0Var.f38987b = this.X;
        nh0Var.f38994k.clear();
        nh0Var.f38994k.addAll(this.f42487i0);
        nh0Var.f38995l.clear();
        nh0Var.f38995l.addAll(this.f42488j0);
        return nh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f42481e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f42493o0 = ChatObject.isPublic(this.f42478c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.i6.f20822d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.g2.class, org.telegram.ui.Components.j90.class, th0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.i6.f20766a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21104s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20945k0, null, null, org.telegram.ui.ActionBar.i6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20786b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.f21209y6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21008n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.i6.f21076r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{ph0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20880g9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21139u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21157v6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21025o6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 32, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20952k7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{th0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 0, new Class[]{th0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42476b, 8, new Class[]{th0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Uh));
        return arrayList;
    }

    public final void h0(nh0 nh0Var) {
        if (!this.isPaused && this.f42474a != null && this.f42476b != null) {
            i0(false);
            nh0Var.f(nh0Var.f38993j);
            s4.o.c(nh0Var, true).b(this.f42474a);
            AndroidUtilities.updateVisibleRows(this.f42476b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z10) {
        vh0 vh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f42491n));
        this.f42478c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f42503y = -1;
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
            this.f42496r = -1;
            this.f42502x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f42501w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f42483f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f42496r = i11;
            }
            int i12 = this.X;
            this.f42498s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f42487i0;
            if (!z11) {
                this.f42501w = i13;
                this.X = i12 + 4;
                this.f42502x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f42501w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f42503y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f42502x >= 0 && (!this.W || this.f42480d0 || this.f42497r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f42502x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f42488j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f42502x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f42503y == -1) {
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
            if (!this.f42480d0 && !this.f42497r0 && ((this.W || this.f42477b0) && !z11)) {
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
                    vh0Var = this.f42474a;
                    if (vh0Var == null && z10) {
                        vh0Var.l();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i28 = this.X;
                this.X = i28 + 1;
                this.K = i28;
            }
            vh0Var = this.f42474a;
            if (vh0Var == null) {
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
        vh0 vh0Var = this.f42474a;
        if (vh0Var != null) {
            vh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.f70 f70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f42485g0 = true;
            if (z11 && (f70Var = this.f42490l0) != null && f70Var.f26357l0) {
                f70Var.show();
            }
        }
        this.f42500t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f42500t0.lock();
    }
}
