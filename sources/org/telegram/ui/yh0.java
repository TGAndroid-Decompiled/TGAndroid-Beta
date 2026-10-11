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
public final class yh0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public xh0 f44437a;
    public Drawable f44438a0;
    public org.telegram.ui.Components.rm0 f44439b;
    public boolean f44440b0;
    public TLRPC.Chat f44441c;
    public boolean f44442c0;
    public TLRPC.ChatFull d;
    public boolean f44443d0;
    public TLRPC.TL_chatInviteExported f44444e;
    public boolean f44445e0;
    public final long f44446f;
    public final int f44447f0;
    public boolean f44448g0;
    public final boolean h;
    public org.telegram.ui.Components.wl0 f44449h0;
    public final ArrayList f44450i0;
    public final ArrayList f44451j0;
    public final HashMap f44452k0;
    public org.telegram.ui.Components.t70 f44453l0;
    public final ArrayList m0;
    public final long f44454n;
    public long f44455n0;
    public boolean f44456o0;
    public final boolean f44457p0;
    public final nh0 f44458q0;
    public int f44459r;
    public boolean f44460r0;
    public int f44461s;
    public final oh0 f44462s0;
    public final AnimationNotificationsLocker f44463t0;
    public int v;
    public int f44464w;
    public int f44465x;
    public int f44466y;

    public yh0(long j3, long j10, int i10) {
        super(null);
        boolean z10;
        this.f44450i0 = new ArrayList();
        this.f44451j0 = new ArrayList();
        this.f44452k0 = new HashMap();
        this.m0 = new ArrayList();
        this.f44458q0 = new nh0(this);
        boolean z11 = false;
        this.f44460r0 = false;
        this.f44462s0 = new oh0(this);
        this.f44463t0 = new AnimationNotificationsLocker();
        this.f44454n = j3;
        this.f44447f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        this.f44441c = chat;
        if (ChatObject.isChannel(chat) && !this.f44441c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j10 == 0) {
            this.f44446f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f44446f = j10;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f44446f));
        if (this.f44446f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z11 = true;
        }
        this.f44457p0 = z11;
    }

    public static void U(org.telegram.ui.yh0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yh0.U(org.telegram.ui.yh0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void V(org.telegram.ui.yh0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yh0.V(org.telegram.ui.yh0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void W(yh0 yh0Var) {
        if (yh0Var.f44446f == yh0Var.getAccountInstance().getUserConfig().clientUserId) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = yh0Var.getMessagesController().getInputPeer(-yh0Var.f44454n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = yh0Var.f44444e;
            yh0Var.f44444e = null;
            yh0Var.d.exported_invite = null;
            int sendRequest = yh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ih0(yh0Var, tL_chatInviteExported, 0));
            AndroidUtilities.updateVisibleRows(yh0Var.f44439b);
            yh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, yh0Var.classGuid);
            return;
        }
        yh0Var.e0(yh0Var.f44444e);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f44454n);
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
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 7));
        j0 j0Var = new j0(this, context, 14);
        this.fragmentView = j0Var;
        int i11 = org.telegram.ui.ActionBar.h6.f20766a7;
        j0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(context, null);
        this.f44439b = rm0Var;
        rm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f44439b);
        gg.a0 a0Var = new gg.a0(1, false, 12);
        this.f44439b.setLayoutManager(a0Var);
        org.telegram.ui.Components.rm0 rm0Var2 = this.f44439b;
        xh0 xh0Var = new xh0(this, context);
        this.f44437a = xh0Var;
        rm0Var2.setAdapter(xh0Var);
        this.f44439b.setOnScrollListener(new ii.n3(6, this, a0Var));
        this.f44449h0 = new org.telegram.ui.Components.wl0(this.f44439b, false);
        s4.j jVar = new s4.j();
        jVar.n(420L);
        jVar.o(org.telegram.ui.Components.is.h);
        jVar.C = false;
        jVar.f47822m = false;
        this.f44439b.setItemAnimator(jVar);
        org.telegram.ui.Components.rm0 rm0Var3 = this.f44439b;
        if (LocaleController.isRTL) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        rm0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f44439b, w7.x5.d(-1.0f, -1));
        this.f44439b.setOnItemClickListener(new ai.o6(19, this, context));
        this.f44439b.setOnItemLongClickListener(new kh0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.f44438a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.f44455n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f44443d0;
        long j3 = this.f44454n;
        if (z11 && !this.f44445e0) {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new hh0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
            long clientUserId = getUserConfig().getClientUserId();
            long j10 = this.f44446f;
            if (j10 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j10);
            }
            boolean z12 = this.f44460r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f44451j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f44450i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList2)).date;
                }
            }
            this.W = true;
            if (this.f44456o0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f44444e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ci.u1(this, tL_chatInviteExported, z12, 6)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.f44454n)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var != null && b5Var.getLastFragment() == this) {
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
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.f44454n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ih0(this, tL_chatInviteExported, 2));
    }

    public final ph0 f0() {
        ph0 ph0Var = new ph0(this);
        ph0Var.f(ph0Var.f40902i);
        ph0Var.f40898c = this.f44466y;
        ph0Var.d = this.E;
        ph0Var.f40899e = this.H;
        ph0Var.f40900f = this.I;
        ph0Var.f40901g = this.U;
        ph0Var.h = this.V;
        ph0Var.f40897b = this.X;
        ph0Var.f40904k.clear();
        ph0Var.f40904k.addAll(this.f44450i0);
        ph0Var.f40905l.clear();
        ph0Var.f40905l.addAll(this.f44451j0);
        return ph0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f44444e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f44456o0 = ChatObject.isPublic(this.f44441c);
        d0(true);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.h6.f20822d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.g2.class, org.telegram.ui.Components.x90.class, vh0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.f20766a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21101s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21156v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20944k0, null, null, org.telegram.ui.ActionBar.h6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20786b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.f21207y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.f21007n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.h6.f21075r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{rh0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20881g9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21136u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21154v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21025o6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 32, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20951k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{vh0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 0, new Class[]{vh0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44439b, 8, new Class[]{vh0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Uh));
        return arrayList;
    }

    public final void h0(ph0 ph0Var) {
        if (!this.isPaused && this.f44437a != null && this.f44439b != null) {
            i0(false);
            ph0Var.f(ph0Var.f40903j);
            s4.o.c(ph0Var, true).b(this.f44437a);
            AndroidUtilities.updateVisibleRows(this.f44439b);
            return;
        }
        i0(true);
    }

    public final void i0(boolean z10) {
        xh0 xh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.f44454n));
        this.f44441c = chat;
        if (chat != null) {
            this.Q = -1;
            this.R = -1;
            this.f44466y = -1;
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
            this.f44459r = -1;
            this.f44465x = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.S = -1;
            this.P = -1;
            this.f44464w = -1;
            this.G = -1;
            boolean z11 = false;
            this.X = 0;
            if (this.f44446f != getAccountInstance().getUserConfig().clientUserId) {
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
                this.f44459r = i11;
            }
            int i12 = this.X;
            this.f44461s = i12;
            int i13 = i12 + 2;
            this.X = i13;
            this.v = i12 + 1;
            ArrayList arrayList = this.f44450i0;
            if (!z11) {
                this.f44464w = i13;
                this.X = i12 + 4;
                this.f44465x = i12 + 3;
            } else if (!arrayList.isEmpty()) {
                int i14 = this.X;
                this.f44464w = i14;
                this.X = i14 + 2;
                this.P = i14 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i15 = this.X;
                this.f44466y = i15;
                int size = arrayList.size() + i15;
                this.X = size;
                this.E = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f44465x >= 0 && (!this.W || this.f44443d0 || this.f44460r0)) {
                int i16 = this.X;
                this.X = i16 + 1;
                this.O = i16;
            }
            if (!z11) {
                ArrayList arrayList2 = this.m0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f44465x >= 0) && this.O == -1) {
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
            ArrayList arrayList3 = this.f44451j0;
            if (!arrayList3.isEmpty()) {
                if (this.U >= 0) {
                    int i20 = this.X;
                    this.X = i20 + 1;
                    this.J = i20;
                } else if ((!arrayList.isEmpty() || this.f44465x >= 0) && this.O == -1) {
                    int i21 = this.X;
                    this.X = i21 + 1;
                    this.J = i21;
                } else if (z11 && this.f44466y == -1) {
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
            if (!this.f44443d0 && !this.f44460r0 && ((this.W || this.f44440b0) && !z11)) {
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
                    xh0Var = this.f44437a;
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
            xh0Var = this.f44437a;
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
        xh0 xh0Var = this.f44437a;
        if (xh0Var != null) {
            xh0Var.l();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.t70 t70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f44448g0 = true;
            if (z11 && (t70Var = this.f44453l0) != null && t70Var.f31149l0) {
                t70Var.show();
            }
        }
        this.f44463t0.unlock();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f44463t0.lock();
    }
}
