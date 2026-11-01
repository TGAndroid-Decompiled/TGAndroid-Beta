package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class qp extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public mp D;
    public long E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public np f40869a;
    public org.telegram.ui.Components.uk0 f40870b;
    public org.telegram.ui.ActionBar.p5 f40871c;
    public org.telegram.ui.Components.xy d;
    public pp e;
    public TLRPC.Chat f40872f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f40873n;
    public org.telegram.ui.ActionBar.x1 f40874r;
    public boolean f40875s;
    public ArrayList f40876w;
    public boolean f40877x;
    public boolean f40878y;

    public static void Z(qp qpVar, org.telegram.ui.ActionBar.x1[] x1VarArr) {
        try {
            x1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        x1VarArr[0] = null;
        qpVar.h.linked_chat_id = 0L;
        org.telegram.messenger.at f7 = org.telegram.messenger.at.f(qpVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f7.k(org.telegram.messenger.at.T, qpVar.h, 0, bool, bool);
        org.telegram.messenger.i0.h3(new dp(qpVar, 2), 1000L);
        if (!qpVar.f40875s) {
            qpVar.finishFragment();
        }
    }

    public static void b0(qp qpVar, org.telegram.ui.ActionBar.x1[] x1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.k2 k2Var) {
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            try {
                x1Var.dismiss();
            } catch (Throwable unused) {
            }
            x1VarArr[0] = null;
        }
        qpVar.h.linked_chat_id = chat.f19794id;
        org.telegram.messenger.at f7 = org.telegram.messenger.at.f(qpVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f7.k(org.telegram.messenger.at.T, qpVar.h, 0, bool, bool);
        org.telegram.messenger.i0.h3(new dp(qpVar, 1), 1000L);
        if (k2Var != null) {
            qpVar.removeSelfFromStack();
            k2Var.finishFragment();
            return;
        }
        qpVar.finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21260v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21243u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21096m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20989g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.N = false;
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131751390, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 27));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, 2131232485);
        b10.N();
        b10.B0 = new ag.l3(this, 2);
        this.f40871c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.dd.L0(2131745853, null));
        this.e = new pp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.d = xyVar;
        xyVar.b();
        this.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f40870b = uk0Var;
        uk0Var.r1();
        this.f40870b.setSectionsDrawBackground(true);
        this.f40870b.setEmptyView(this.d);
        this.f40870b.setLayoutManager(new s4.a0(1, false));
        org.telegram.ui.Components.uk0 uk0Var2 = this.f40870b;
        np npVar = new np(this, context);
        this.f40869a = npVar;
        uk0Var2.setAdapter(npVar);
        org.telegram.ui.Components.uk0 uk0Var3 = this.f40870b;
        if (!org.telegram.messenger.dd.X) {
            i10 = 2;
        }
        uk0Var3.setVerticalScrollbarPosition(i10);
        frameLayout.addView(this.f40870b, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        this.f40870b.setOnItemClickListener(new g(this, 4));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, org.telegram.ui.ActionBar.k2 k2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.w3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.f19794id, this, new ng.d(19, this, k2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = null;
        if (k2Var == null) {
            x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
        }
        org.telegram.ui.ActionBar.x1[] x1VarArr = {x1Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.wp.h1(this.f40872f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.wp.h1(chat);
        org.telegram.messenger.i0.h3(new ep(this, x1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new mb(this, x1VarArr, chat, k2Var, 1), 64), 1), 500L);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        mp mpVar;
        TLRPC.Chat L0;
        TLRPC.Chat chat = null;
        if (i10 == org.telegram.messenger.at.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f19795id;
            if (j10 == this.E) {
                this.h = chatFull;
                e0();
                g0();
                return;
            }
            TLRPC.Chat chat2 = this.f40873n;
            if (chat2 != null && chat2.f19794id == j10) {
                try {
                    this.f40874r.dismiss();
                } catch (Throwable unused) {
                }
                this.f40874r = null;
                f0(this.f40873n, false);
                this.f40873n = null;
            }
        } else if (i10 == org.telegram.messenger.at.f14772r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.wp.D8;
            if ((intValue & 8192) != 0 && this.f40872f != null) {
                TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.f40872f.f19794id));
                if (L02 != null) {
                    this.f40872f = L02;
                }
                if (this.f40876w.size() > 0 && (L0 = getMessagesController().L0(Long.valueOf(((TLRPC.Chat) this.f40876w.get(0)).f19794id))) != null) {
                    this.f40876w.set(0, L0);
                }
                if (this.f40875s) {
                    if (this.f40876w.size() > 0) {
                        chat = (TLRPC.Chat) this.f40876w.get(0);
                    }
                } else {
                    chat = this.f40872f;
                }
                if (chat != null && (mpVar = this.D) != null) {
                    if (!this.P) {
                        mpVar.setJoinRequest(chat.join_request);
                    }
                    if (!this.O) {
                        this.D.setJoinToSend(chat.join_to_send);
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14822y1) {
            if ((-this.E) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                if (z4Var != null && z4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        if (this.h.linked_chat_id != 0) {
            this.f40876w.clear();
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.h.linked_chat_id));
            if (L0 != null) {
                this.f40876w.add(L0);
            }
            org.telegram.ui.ActionBar.p5 p5Var = this.f40871c;
            if (p5Var != null) {
                p5Var.setVisibility(8);
            }
        }
        if (!this.f40877x && this.f40875s && this.h.linked_chat_id == 0) {
            this.f40877x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new k(this, 3));
        }
    }

    public final void f0(TLRPC.Chat chat, boolean z10) {
        int i10;
        String a02;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.ChatFull M0 = getMessagesController().M0(chat.f19794id);
        int i15 = 3;
        if (M0 == null) {
            if (z10) {
                getMessagesController().T2(0, chat.f19794id, true);
                this.f40873n = chat;
                this.f40874r = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
                org.telegram.messenger.i0.h3(new dp(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, null);
        textView.setTextSize(1, 16.0f);
        if (org.telegram.messenger.dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (!org.telegram.messenger.w3.t0(chat)) {
            a02 = org.telegram.messenger.dd.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751377, chat.title, this.f40872f.title);
        } else if (!org.telegram.messenger.w3.t0(this.f40872f)) {
            a02 = org.telegram.messenger.dd.a0("DiscussionLinkGroupPrivateAlert", null, 2131751379, chat.title, this.f40872f.title);
        } else {
            a02 = org.telegram.messenger.dd.a0("DiscussionLinkGroupPublicAlert", null, 2131751378, chat.title, this.f40872f.title);
        }
        if (M0.hidden_prehistory) {
            a02 = a1.g.m(null, 2131751380, sc.e.i(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.i0.W2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.u(org.telegram.messenger.i0.L(12.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getParentActivity());
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
        if (org.telegram.messenger.dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(g9Var, w7.b6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = org.telegram.messenger.dd.X;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i16 = i13 | 48;
        int i17 = 76;
        if (z11) {
            i14 = 21;
        } else {
            i14 = 76;
        }
        float f7 = i14;
        if (!z11) {
            i17 = 21;
        }
        frameLayout.addView(textView2, w7.b6.d(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
        if (org.telegram.messenger.dd.X) {
            i15 = 5;
        }
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        r8Var.q(chat);
        g9Var.e(chat, r8Var);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751381, null), new a7(this, M0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        showDialog(alertDialog$Builder.f20135a);
    }

    public final void g0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f40875s;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.E));
        this.f40872f = L0;
        if (L0 != null) {
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = 1;
            if (z10) {
                if (this.h.linked_chat_id == 0) {
                    this.M = 2;
                    this.F = 1;
                }
                int i10 = this.M;
                this.G = i10;
                int size = this.f40876w.size() + i10;
                this.M = size;
                this.H = size;
                if (this.h.linked_chat_id != 0) {
                    this.M = size + 1;
                    this.F = size;
                }
            } else {
                this.G = 1;
                int size2 = this.f40876w.size();
                int i11 = 1 + size2;
                this.H = i11;
                this.M = size2 + 2;
                this.F = i11;
            }
            int i12 = this.M;
            this.M = i12 + 1;
            this.J = i12;
            int i13 = 0;
            if (!z10 || (this.f40876w.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z10) {
                    chat = (TLRPC.Chat) this.f40876w.get(0);
                } else {
                    chat = this.f40872f;
                }
                if (chat != null && ((!org.telegram.messenger.w3.t0(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i14 = this.M;
                    this.M = i14 + 1;
                    this.K = i14;
                }
            }
            np npVar = this.f40869a;
            if (npVar != null) {
                npVar.f();
            }
            org.telegram.ui.ActionBar.p5 p5Var = this.f40871c;
            if (p5Var != null) {
                if (this.f40876w.size() <= 10) {
                    i13 = 8;
                }
                p5Var.setVisibility(i13);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f40870b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40870b, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21312y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f40870b, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21116n6));
        return arrayList;
    }

    public final void h0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f40870b != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21312y6, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21116n6, false);
                if (!this.Q || x02 != this.R || x03 != this.S) {
                    this.Q = true;
                    this.R = x02;
                    this.S = x03;
                    for (int i10 = 0; i10 < 4; i10++) {
                        if (i10 == 0) {
                            attachedScrapChildCount = this.f40870b.getChildCount();
                        } else if (i10 == 1) {
                            attachedScrapChildCount = this.f40870b.getHiddenChildCount();
                        } else if (i10 == 2) {
                            attachedScrapChildCount = this.f40870b.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f40870b.getAttachedScrapChildCount();
                        }
                        for (int i11 = 0; i11 < attachedScrapChildCount; i11++) {
                            if (i10 == 0) {
                                O = this.f40870b.getChildAt(i11);
                            } else if (i10 == 1) {
                                O = this.f40870b.V(i11);
                            } else if (i10 == 2) {
                                O = this.f40870b.P(i11);
                            } else {
                                O = this.f40870b.O(i11);
                            }
                            if (O instanceof org.telegram.ui.Cells.e5) {
                                org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) O;
                                e5Var.O = true;
                                e5Var.H = x02;
                                e5Var.I = x03;
                                if (i10 != 0) {
                                    ((org.telegram.ui.Cells.e5) O).d(0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.at.T);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14772r);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14822y1);
        e0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.at.T);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14772r);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14822y1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        np npVar = this.f40869a;
        if (npVar != null) {
            npVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            h0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
