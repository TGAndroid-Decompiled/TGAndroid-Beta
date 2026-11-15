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
public final class to extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public po E;
    public long F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public qo f51617a;
    public org.telegram.ui.Components.uj0 f51618b;
    public org.telegram.ui.ActionBar.d5 f51619c;
    public org.telegram.ui.Components.ny d;
    public so f51620e;
    public TLRPC.Chat f51621f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f51622n;
    public org.telegram.ui.ActionBar.t1 f51623r;
    public boolean f51624s;
    public ArrayList f51625w;
    public boolean f51626x;
    public boolean f51627y;

    public static void Z(to toVar, org.telegram.ui.ActionBar.t1[] t1VarArr) {
        try {
            t1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        t1VarArr[0] = null;
        toVar.h.linked_chat_id = 0L;
        org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(toVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.ns.T, toVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new io(toVar, 2), 1000L);
        if (!toVar.f51624s) {
            toVar.finishFragment();
        }
    }

    public static void b0(to toVar, org.telegram.ui.ActionBar.t1[] t1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.e2 e2Var) {
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            try {
                t1Var.dismiss();
            } catch (Throwable unused) {
            }
            t1VarArr[0] = null;
        }
        toVar.h.linked_chat_id = chat.f28051id;
        org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(toVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.ns.T, toVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new io(toVar, 1), 1000L);
        if (e2Var != null) {
            toVar.removeSelfFromStack();
            e2Var.finishFragment();
            return;
        }
        toVar.finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29184v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29165u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29014m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28907g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751389, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p9(this, 7));
        org.telegram.ui.ActionBar.d5 b10 = this.simpleActionBar.r().b(0, 2131232487);
        b10.O();
        b10.C0 = new kg.x1(this, 2);
        this.f51619c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        this.f51620e = new so(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ny nyVar = new org.telegram.ui.Components.ny(context, null);
        this.d = nyVar;
        nyVar.b();
        this.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f51618b = uj0Var;
        uj0Var.r1();
        this.f51618b.setSectionsDrawBackground(true);
        this.f51618b.setEmptyView(this.d);
        this.f51618b.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.Components.uj0 uj0Var2 = this.f51618b;
        qo qoVar = new qo(this, context);
        this.f51617a = qoVar;
        uj0Var2.setAdapter(qoVar);
        org.telegram.ui.Components.uj0 uj0Var3 = this.f51618b;
        if (!org.telegram.messenger.hd.f24101a0) {
            i7 = 2;
        }
        uj0Var3.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f51618b, c8.ja.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ja.c(-1.0f, -1));
        this.f51618b.setOnItemClickListener(new h(this, 4));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, org.telegram.ui.ActionBar.e2 e2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.t3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.f28051id, this, new m2.d(23, this, e2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = null;
        if (e2Var == null) {
            t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = {t1Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.np.i1(this.f51621f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.np.i1(chat);
        org.telegram.messenger.g0.i3(new jo(this, t1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.l1(this, t1VarArr, chat, e2Var, 11), 64), 1), 500L);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        po poVar;
        TLRPC.Chat M0;
        TLRPC.Chat chat = null;
        if (i7 == org.telegram.messenger.ns.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f28052id;
            if (j3 == this.F) {
                this.h = chatFull;
                e0();
                g0();
                return;
            }
            TLRPC.Chat chat2 = this.f51622n;
            if (chat2 != null && chat2.f28051id == j3) {
                try {
                    this.f51623r.dismiss();
                } catch (Throwable unused) {
                }
                this.f51623r = null;
                f0(this.f51622n, false);
                this.f51622n = null;
            }
        } else if (i7 == org.telegram.messenger.ns.f25559r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.np.D8;
            if ((intValue & 8192) != 0 && this.f51621f != null) {
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f51621f.f28051id));
                if (M02 != null) {
                    this.f51621f = M02;
                }
                if (this.f51625w.size() > 0 && (M0 = getMessagesController().M0(Long.valueOf(((TLRPC.Chat) this.f51625w.get(0)).f28051id))) != null) {
                    this.f51625w.set(0, M0);
                }
                if (this.f51624s) {
                    if (this.f51625w.size() > 0) {
                        chat = (TLRPC.Chat) this.f51625w.get(0);
                    }
                } else {
                    chat = this.f51621f;
                }
                if (chat != null && (poVar = this.E) != null) {
                    if (!this.Q) {
                        poVar.setJoinRequest(chat.join_request);
                    }
                    if (!this.P) {
                        this.E.setJoinToSend(chat.join_to_send);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.f25608y1) {
            if ((-this.F) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
                if (o4Var != null && o4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        if (this.h.linked_chat_id != 0) {
            this.f51625w.clear();
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.h.linked_chat_id));
            if (M0 != null) {
                this.f51625w.add(M0);
            }
            org.telegram.ui.ActionBar.d5 d5Var = this.f51619c;
            if (d5Var != null) {
                d5Var.setVisibility(8);
            }
        }
        if (!this.f51626x && this.f51624s && this.h.linked_chat_id == 0) {
            this.f51626x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new l(this, 3));
        }
    }

    public final void f0(TLRPC.Chat chat, boolean z10) {
        int i7;
        String a02;
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.ChatFull N0 = getMessagesController().N0(chat.f28051id);
        int i14 = 3;
        if (N0 == null) {
            if (z10) {
                getMessagesController().V2(0, chat.f28051id, true);
                this.f51622n = chat;
                this.f51623r = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
                org.telegram.messenger.g0.i3(new io(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f28957j5, null);
        textView.setTextSize(1, 16.0f);
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        if (!org.telegram.messenger.t3.t0(chat)) {
            a02 = org.telegram.messenger.hd.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751376, chat.title, this.f51621f.title);
        } else if (!org.telegram.messenger.t3.t0(this.f51621f)) {
            a02 = org.telegram.messenger.hd.a0("DiscussionLinkGroupPrivateAlert", null, 2131751378, chat.title, this.f51621f.title);
        } else {
            a02 = org.telegram.messenger.hd.a0("DiscussionLinkGroupPublicAlert", null, 2131751377, chat.title, this.f51621f.title);
        }
        if (N0.hidden_prehistory) {
            a02 = i5.c.k(2131751379, null, r.b.m(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.g0.X2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(getParentActivity());
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(i9Var, c8.ja.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.hd.f24101a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = org.telegram.messenger.hd.f24101a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 48;
        int i16 = 76;
        if (z11) {
            i13 = 21;
        } else {
            i13 = 76;
        }
        float f10 = i13;
        if (!z11) {
            i16 = 21;
        }
        frameLayout.addView(textView2, c8.ja.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
        if (org.telegram.messenger.hd.f24101a0) {
            i14 = 5;
        }
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        t8Var.q(chat);
        i9Var.f(chat, t8Var);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751380, null), new a7(this, N0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(alertDialog$Builder.f28392a);
    }

    public final void g0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f51624s;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.F));
        this.f51621f = M0;
        if (M0 != null) {
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = 1;
            if (z10) {
                if (this.h.linked_chat_id == 0) {
                    this.N = 2;
                    this.G = 1;
                }
                int i7 = this.N;
                this.H = i7;
                int size = this.f51625w.size() + i7;
                this.N = size;
                this.I = size;
                if (this.h.linked_chat_id != 0) {
                    this.N = size + 1;
                    this.G = size;
                }
            } else {
                this.H = 1;
                int size2 = this.f51625w.size();
                int i10 = 1 + size2;
                this.I = i10;
                this.N = size2 + 2;
                this.G = i10;
            }
            int i11 = this.N;
            this.N = i11 + 1;
            this.K = i11;
            int i12 = 0;
            if (!z10 || (this.f51625w.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z10) {
                    chat = (TLRPC.Chat) this.f51625w.get(0);
                } else {
                    chat = this.f51621f;
                }
                if (chat != null && ((!org.telegram.messenger.t3.t0(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i13 = this.N;
                    this.N = i13 + 1;
                    this.L = i13;
                }
            }
            qo qoVar = this.f51617a;
            if (qoVar != null) {
                qoVar.f();
            }
            org.telegram.ui.ActionBar.d5 d5Var = this.f51619c;
            if (d5Var != null) {
                if (this.f51625w.size() <= 10) {
                    i12 = 8;
                }
                d5Var.setVisibility(i12);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f51618b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51618b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f29241y6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51618b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f29031n6));
        return arrayList;
    }

    public final void h0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f51618b != null) {
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29241y6, false);
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29031n6, false);
                if (!this.R || x02 != this.S || x03 != this.T) {
                    this.R = true;
                    this.S = x02;
                    this.T = x03;
                    for (int i7 = 0; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f51618b.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f51618b.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f51618b.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f51618b.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f51618b.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f51618b.V(i10);
                            } else if (i7 == 2) {
                                O = this.f51618b.P(i10);
                            } else {
                                O = this.f51618b.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.a5) {
                                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) O;
                                a5Var.P = true;
                                a5Var.I = x02;
                                a5Var.J = x03;
                                if (i7 != 0) {
                                    ((org.telegram.ui.Cells.a5) O).d(0);
                                }
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
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.ns.T);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25559r);
        getNotificationCenter().c(this, org.telegram.messenger.ns.f25608y1);
        e0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.T);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25559r);
        getNotificationCenter().n(this, org.telegram.messenger.ns.f25608y1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        qo qoVar = this.f51617a;
        if (qoVar != null) {
            qoVar.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            h0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
