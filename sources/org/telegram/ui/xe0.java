package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class xe0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
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
    public int W;
    public boolean X;
    public int Y;
    public Drawable Z;
    public we0 f51983a;
    public Drawable f51984a0;
    public org.telegram.ui.Components.tj0 f51985b;
    public Drawable f51986b0;
    public TLRPC.Chat f51987c;
    public boolean f51988c0;
    public TLRPC.ChatFull d;
    public boolean f51989d0;
    public TLRPC.TL_chatInviteExported f51990e;
    public boolean f51991e0;
    public final long f51992f;
    public boolean f51993f0;
    public final int f51994g0;
    public final boolean h;
    public boolean f51995h0;
    public org.telegram.ui.Components.wi0 f51996i0;
    public final ArrayList f51997j0;
    public final ArrayList f51998k0;
    public final HashMap f51999l0;
    public org.telegram.ui.Components.i50 m0;
    public final long f52000n;
    public final ArrayList f52001n0;
    public long f52002o0;
    public boolean f52003p0;
    public final boolean f52004q0;
    public int f52005r;
    public final ne0 f52006r0;
    public int f52007s;
    public boolean f52008s0;
    public final oe0 f52009t0;
    public final g2.g f52010u0;
    public int f52011w;
    public int f52012x;
    public int f52013y;

    public xe0(long j10, int i3, long j11) {
        super(null);
        boolean z10;
        this.f51997j0 = new ArrayList();
        this.f51998k0 = new ArrayList();
        this.f51999l0 = new HashMap();
        this.f52001n0 = new ArrayList();
        this.f52006r0 = new ne0(this);
        boolean z11 = false;
        this.f52008s0 = false;
        this.f52009t0 = new oe0(this);
        this.f52010u0 = new g2.g((int[]) null);
        this.f52000n = j10;
        this.f51994g0 = i3;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.currentAccount).M0(Long.valueOf(j10));
        this.f51987c = M0;
        if (org.telegram.messenger.t3.T(M0) && !this.f51987c.megagroup) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        if (j11 == 0) {
            this.f51992f = org.telegram.messenger.h10.i(getAccountInstance().f21919a).f22848n;
        } else {
            this.f51992f = j11;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f51992f));
        if (this.f51992f == org.telegram.messenger.h10.i(getAccountInstance().f21919a).f22848n || (a22 != null && !a22.bot)) {
            z11 = true;
        }
        this.f52004q0 = z11;
    }

    public static void Z(org.telegram.ui.xe0 r9, org.telegram.tgnet.TLRPC.TL_chatInviteExported r10, org.telegram.tgnet.TLRPC.TL_error r11, org.telegram.tgnet.TLObject r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xe0.Z(org.telegram.ui.xe0, org.telegram.tgnet.TLRPC$TL_chatInviteExported, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, boolean):void");
    }

    public static void a0(org.telegram.ui.xe0 r7, org.telegram.tgnet.TLRPC.TL_error r8, org.telegram.tgnet.TLObject r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xe0.a0(org.telegram.ui.xe0, org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject):void");
    }

    public static void b0(xe0 xe0Var) {
        if (xe0Var.f51992f == org.telegram.messenger.h10.i(xe0Var.getAccountInstance().f21919a).f22848n) {
            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
            tL_messages_exportChatInvite.peer = xe0Var.getMessagesController().j1(-xe0Var.f52000n);
            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = xe0Var.f51990e;
            xe0Var.f51990e = null;
            xe0Var.d.exported_invite = null;
            int sendRequest = xe0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ie0(xe0Var, tL_chatInviteExported, 0));
            org.telegram.messenger.g0.b4(xe0Var.f51985b);
            xe0Var.getConnectionsManager().bindRequestToGuid(sendRequest, xe0Var.classGuid);
            return;
        }
        xe0Var.k0(xe0Var.f51990e);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28273y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28081o6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28214v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28196u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27939g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        int i3;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131749148, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 16));
        l0 l0Var = new l0(15, context, this);
        this.fragmentView = l0Var;
        l0Var.setTag(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27824a7));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f51985b = tj0Var;
        tj0Var.r1();
        this.f51985b.setSectionsDrawBackground(true);
        kg.y yVar = new kg.y(1, false, 12);
        this.f51985b.setLayoutManager(yVar);
        org.telegram.ui.Components.tj0 tj0Var2 = this.f51985b;
        we0 we0Var = new we0(this, context);
        this.f51983a = we0Var;
        tj0Var2.setAdapter(we0Var);
        this.f51985b.setOnScrollListener(new ai.i4(8, this, yVar));
        this.f51996i0 = new org.telegram.ui.Components.wi0(this.f51985b, false);
        u4.k kVar = new u4.k();
        kVar.n(420L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        this.f51985b.setItemAnimator(kVar);
        org.telegram.ui.Components.tj0 tj0Var3 = this.f51985b;
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        tj0Var3.setVerticalScrollbarPosition(i3);
        frameLayout.addView(this.f51985b, b8.mf.c(-1.0f, -1));
        this.f51985b.setOnItemClickListener(new ei.q4(19, this, context));
        this.f51985b.setOnItemLongClickListener(new ke0(this));
        this.Z = context.getDrawable(2131232205);
        this.f51984a0 = context.getDrawable(2131232206);
        this.f51986b0 = context.getDrawable(2131231609);
        this.Z.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        o0(true);
        this.f52002o0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23341y1 && ((Long) objArr[0]).longValue() == (-this.f52000n)) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var != null && q4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void g0() {
        org.telegram.ui.Components.tj0 tj0Var = this.f51985b;
        if (tj0Var != null) {
            int childCount = tj0Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f51985b.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Components.m70) {
                    ((org.telegram.ui.Components.m70) childAt).f();
                }
            }
        }
        org.telegram.ui.Components.i50 i50Var = this.m0;
        if (i50Var != null) {
            i50Var.updateColors();
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f51985b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(12, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51985b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28273y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51985b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28062n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51985b, 32, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51985b, 0, new Class[]{org.telegram.ui.Cells.i2.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28008k7));
        return arrayList;
    }

    public final void h0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().j1(-this.f52000n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ie0(this, tL_chatInviteExported, 1));
    }

    public final void i0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        boolean z10 = false;
        if (tL_chatInviteExported.expire_date > 0) {
            if (getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date) {
                z10 = true;
            }
            tL_chatInviteExported.expired = z10;
            return;
        }
        int i3 = tL_chatInviteExported.usage_limit;
        if (i3 > 0) {
            if (tL_chatInviteExported.usage >= i3) {
                z10 = true;
            }
            tL_chatInviteExported.expired = z10;
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z11 = this.f51991e0;
        long j10 = this.f52000n;
        if (z11 && !this.f51993f0) {
            this.X = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().j1(-j10);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new he0(this, 0)), getClassGuid());
        } else {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-j10);
            long e10 = getUserConfig().e();
            long j11 = this.f51992f;
            if (j11 == e10) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().o1(j11);
            }
            boolean z12 = this.f52008s0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.f51998k0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) k2.p1.h(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) k2.p1.h(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.f51997j0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) k2.p1.h(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) k2.p1.h(1, arrayList2)).date;
                }
            }
            this.X = true;
            if (this.f52003p0) {
                tL_chatInviteExported = null;
            } else {
                tL_chatInviteExported = this.f51990e;
            }
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ci.t8(this, tL_chatInviteExported, z12, 7)), getClassGuid());
        }
        if (z10) {
            o0(true);
        }
    }

    public final void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().j1(-this.f52000n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ie0(this, tL_chatInviteExported, 2));
    }

    public final pe0 l0() {
        pe0 pe0Var = new pe0(this);
        pe0Var.f(pe0Var.f48563i);
        pe0Var.f48559c = this.E;
        pe0Var.d = this.F;
        pe0Var.f48560e = this.I;
        pe0Var.f48561f = this.J;
        pe0Var.f48562g = this.V;
        pe0Var.h = this.W;
        pe0Var.f48558b = this.Y;
        pe0Var.f48565k.clear();
        pe0Var.f48565k.addAll(this.f51997j0);
        pe0Var.f48566l.clear();
        pe0Var.f48566l.addAll(this.f51998k0);
        return pe0Var;
    }

    public final void m0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.f51990e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.f52003p0 = org.telegram.messenger.t3.t0(this.f51987c);
        j0(true);
    }

    public final void n0(pe0 pe0Var) {
        if (!this.isPaused && this.f51983a != null && this.f51985b != null) {
            o0(false);
            pe0Var.f(pe0Var.f48564j);
            u4.o.c(pe0Var, true).c(this.f51983a);
            org.telegram.messenger.g0.b4(this.f51985b);
            return;
        }
        o0(true);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(boolean z10) {
        we0 we0Var;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.currentAccount).M0(Long.valueOf(this.f52000n));
        this.f51987c = M0;
        if (M0 != null) {
            this.R = -1;
            this.S = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.I = -1;
            this.J = -1;
            this.M = -1;
            this.K = -1;
            this.L = -1;
            this.O = -1;
            this.N = -1;
            this.P = -1;
            this.f52005r = -1;
            this.f52013y = -1;
            this.W = -1;
            this.V = -1;
            this.U = -1;
            this.T = -1;
            this.Q = -1;
            this.f52012x = -1;
            this.H = -1;
            boolean z11 = false;
            this.Y = 0;
            if (this.f51992f != org.telegram.messenger.h10.i(getAccountInstance().f21919a).f22848n) {
                z11 = true;
            }
            if (z11) {
                int i3 = this.Y;
                this.R = i3;
                this.Y = i3 + 2;
                this.S = i3 + 1;
            } else {
                int i10 = this.Y;
                this.Y = i10 + 1;
                this.f52005r = i10;
            }
            int i11 = this.Y;
            this.f52007s = i11;
            int i12 = i11 + 2;
            this.Y = i12;
            this.f52011w = i11 + 1;
            ArrayList arrayList = this.f51997j0;
            if (!z11) {
                this.f52012x = i12;
                this.Y = i11 + 4;
                this.f52013y = i11 + 3;
            } else if (!arrayList.isEmpty()) {
                int i13 = this.Y;
                this.f52012x = i13;
                this.Y = i13 + 2;
                this.Q = i13 + 1;
            }
            if (!arrayList.isEmpty()) {
                int i14 = this.Y;
                this.E = i14;
                int size = arrayList.size() + i14;
                this.Y = size;
                this.F = size;
            }
            if (!z11 && arrayList.isEmpty() && this.f52013y >= 0 && (!this.X || this.f51991e0 || this.f52008s0)) {
                int i15 = this.Y;
                this.Y = i15 + 1;
                this.P = i15;
            }
            if (!z11) {
                ArrayList arrayList2 = this.f52001n0;
                if (arrayList2.size() > 0) {
                    if ((!arrayList.isEmpty() || this.f52013y >= 0) && this.P == -1) {
                        int i16 = this.Y;
                        this.Y = i16 + 1;
                        this.U = i16;
                    }
                    int i17 = this.Y;
                    int i18 = i17 + 1;
                    this.Y = i18;
                    this.T = i17;
                    this.V = i18;
                    int size2 = arrayList2.size() + i18;
                    this.Y = size2;
                    this.W = size2;
                }
            }
            ArrayList arrayList3 = this.f51998k0;
            if (!arrayList3.isEmpty()) {
                if (this.V >= 0) {
                    int i19 = this.Y;
                    this.Y = i19 + 1;
                    this.K = i19;
                } else if ((!arrayList.isEmpty() || this.f52013y >= 0) && this.P == -1) {
                    int i20 = this.Y;
                    this.Y = i20 + 1;
                    this.K = i20;
                } else if (z11 && this.E == -1) {
                    int i21 = this.Y;
                    this.Y = i21 + 1;
                    this.K = i21;
                }
                int i22 = this.Y;
                int i23 = i22 + 1;
                this.Y = i23;
                this.M = i22;
                this.I = i23;
                int size3 = arrayList3.size() + i23;
                this.J = size3;
                this.N = size3;
                this.Y = size3 + 2;
                this.O = size3 + 1;
            }
            if (!this.f51991e0 && !this.f52008s0 && ((this.X || this.f51988c0) && !z11)) {
                int i24 = this.Y;
                this.Y = i24 + 1;
                this.G = i24;
            }
            if (!arrayList.isEmpty()) {
                int i25 = this.F;
                int i26 = this.Y;
                if (i25 == i26) {
                    this.Y = i26 + 1;
                    this.H = i26;
                    we0Var = this.f51983a;
                    if (we0Var == null && z10) {
                        we0Var.f();
                        return;
                    }
                }
            }
            if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
                int i27 = this.Y;
                this.Y = i27 + 1;
                this.L = i27;
            }
            we0Var = this.f51983a;
            if (we0Var == null) {
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23341y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23341y1);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        we0 we0Var = this.f51983a;
        if (we0Var != null) {
            we0Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.i50 i50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.f51995h0 = true;
            if (z11 && (i50Var = this.m0) != null && i50Var.f34601d2) {
                i50Var.show();
            }
        }
        this.f52010u0.e();
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.f52010u0.d();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
