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
public final class uo extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public qo D;
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
    public ro f50527a;
    public org.telegram.ui.Components.pj0 f50528b;
    public org.telegram.ui.ActionBar.g5 f50529c;
    public org.telegram.ui.Components.iy d;
    public to f50530e;
    public TLRPC.Chat f50531f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f50532n;
    public org.telegram.ui.ActionBar.u1 f50533r;
    public boolean f50534s;
    public ArrayList f50535w;
    public boolean f50536x;
    public boolean f50537y;

    public static void Z(uo uoVar, org.telegram.ui.ActionBar.u1[] u1VarArr) {
        try {
            u1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        u1VarArr[0] = null;
        uoVar.h.linked_chat_id = 0L;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(uoVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.qs.T, uoVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new jo(uoVar, 2), 1000L);
        if (!uoVar.f50534s) {
            uoVar.finishFragment();
        }
    }

    public static void b0(uo uoVar, org.telegram.ui.ActionBar.u1[] u1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.f2 f2Var) {
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            try {
                u1Var.dismiss();
            } catch (Throwable unused) {
            }
            u1VarArr[0] = null;
        }
        uoVar.h.linked_chat_id = chat.f26960id;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(uoVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.qs.T, uoVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new jo(uoVar, 1), 1000L);
        if (f2Var != null) {
            uoVar.removeSelfFromStack();
            f2Var.finishFragment();
            return;
        }
        uoVar.finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28225v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28206u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28055m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27948g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27854b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.N = false;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131751389, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 6));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.q().b(0, 2131232486);
        b10.N();
        b10.B0 = new kg.v1(this, 2);
        this.f50529c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745836, null));
        this.f50530e = new to(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.d = iyVar;
        iyVar.b();
        this.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f50528b = pj0Var;
        pj0Var.r1();
        this.f50528b.setSectionsDrawBackground(true);
        this.f50528b.setEmptyView(this.d);
        this.f50528b.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.Components.pj0 pj0Var2 = this.f50528b;
        ro roVar = new ro(this, context);
        this.f50527a = roVar;
        pj0Var2.setAdapter(roVar);
        org.telegram.ui.Components.pj0 pj0Var3 = this.f50528b;
        if (!org.telegram.messenger.id.f23161a0) {
            i7 = 2;
        }
        pj0Var3.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f50528b, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        this.f50528b.setOnItemClickListener(new h(this, 4));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, org.telegram.ui.ActionBar.f2 f2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.t3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.f26960id, this, new ni.c(19, this, f2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = null;
        if (f2Var == null) {
            u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = {u1Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.qp.i1(this.f50531f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.qp.i1(chat);
        org.telegram.messenger.g0.i3(new ko(this, u1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.g2(this, u1VarArr, chat, f2Var, 10), 64), 1), 500L);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        qo qoVar;
        TLRPC.Chat M0;
        TLRPC.Chat chat = null;
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f26961id;
            if (j3 == this.E) {
                this.h = chatFull;
                e0();
                g0();
                return;
            }
            TLRPC.Chat chat2 = this.f50532n;
            if (chat2 != null && chat2.f26960id == j3) {
                try {
                    this.f50533r.dismiss();
                } catch (Throwable unused) {
                }
                this.f50533r = null;
                f0(this.f50532n, false);
                this.f50532n = null;
            }
        } else if (i7 == org.telegram.messenger.qs.f25067r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.qp.C8;
            if ((intValue & 8192) != 0 && this.f50531f != null) {
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f50531f.f26960id));
                if (M02 != null) {
                    this.f50531f = M02;
                }
                if (this.f50535w.size() > 0 && (M0 = getMessagesController().M0(Long.valueOf(((TLRPC.Chat) this.f50535w.get(0)).f26960id))) != null) {
                    this.f50535w.set(0, M0);
                }
                if (this.f50534s) {
                    if (this.f50535w.size() > 0) {
                        chat = (TLRPC.Chat) this.f50535w.get(0);
                    }
                } else {
                    chat = this.f50531f;
                }
                if (chat != null && (qoVar = this.D) != null) {
                    if (!this.P) {
                        qoVar.setJoinRequest(chat.join_request);
                    }
                    if (!this.O) {
                        this.D.setJoinToSend(chat.join_to_send);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25116y1) {
            if ((-this.E) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                if (r4Var != null && r4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        if (this.h.linked_chat_id != 0) {
            this.f50535w.clear();
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.h.linked_chat_id));
            if (M0 != null) {
                this.f50535w.add(M0);
            }
            org.telegram.ui.ActionBar.g5 g5Var = this.f50529c;
            if (g5Var != null) {
                g5Var.setVisibility(8);
            }
        }
        if (!this.f50536x && this.f50534s && this.h.linked_chat_id == 0) {
            this.f50536x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new l(this, 3));
        }
    }

    public final void f0(TLRPC.Chat chat, boolean z9) {
        int i7;
        String a02;
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.ChatFull N0 = getMessagesController().N0(chat.f26960id);
        int i14 = 3;
        if (N0 == null) {
            if (z9) {
                getMessagesController().V2(0, chat.f26960id, true);
                this.f50532n = chat;
                this.f50533r = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
                org.telegram.messenger.g0.i3(new jo(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27998j5, null);
        textView.setTextSize(1, 16.0f);
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        if (!org.telegram.messenger.t3.t0(chat)) {
            a02 = org.telegram.messenger.id.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751376, chat.title, this.f50531f.title);
        } else if (!org.telegram.messenger.t3.t0(this.f50531f)) {
            a02 = org.telegram.messenger.id.a0("DiscussionLinkGroupPrivateAlert", null, 2131751378, chat.title, this.f50531f.title);
        } else {
            a02 = org.telegram.messenger.id.a0("DiscussionLinkGroupPublicAlert", null, 2131751377, chat.title, this.f50531f.title);
        }
        if (N0.hidden_prehistory) {
            a02 = jg.g.l(2131751379, null, rf.b.j(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.g0.X2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getParentActivity());
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.id.f23161a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(k9Var, c8.ha.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.m6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.id.f23161a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z10 = org.telegram.messenger.id.f23161a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i15 = i12 | 48;
        int i16 = 76;
        if (z10) {
            i13 = 21;
        } else {
            i13 = 76;
        }
        float f10 = i13;
        if (!z10) {
            i16 = 21;
        }
        frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
        if (org.telegram.messenger.id.f23161a0) {
            i14 = 5;
        }
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        v8Var.q(chat);
        k9Var.e(chat, v8Var);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751380, null), new a7(this, N0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        showDialog(alertDialog$Builder.f27300a);
    }

    public final void g0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z9 = this.f50534s;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.E));
        this.f50531f = M0;
        if (M0 != null) {
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = 1;
            if (z9) {
                if (this.h.linked_chat_id == 0) {
                    this.M = 2;
                    this.F = 1;
                }
                int i7 = this.M;
                this.G = i7;
                int size = this.f50535w.size() + i7;
                this.M = size;
                this.H = size;
                if (this.h.linked_chat_id != 0) {
                    this.M = size + 1;
                    this.F = size;
                }
            } else {
                this.G = 1;
                int size2 = this.f50535w.size();
                int i10 = 1 + size2;
                this.H = i10;
                this.M = size2 + 2;
                this.F = i10;
            }
            int i11 = this.M;
            this.M = i11 + 1;
            this.J = i11;
            int i12 = 0;
            if (!z9 || (this.f50535w.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z9) {
                    chat = (TLRPC.Chat) this.f50535w.get(0);
                } else {
                    chat = this.f50531f;
                }
                if (chat != null && ((!org.telegram.messenger.t3.t0(chat) || z9) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i13 = this.M;
                    this.M = i13 + 1;
                    this.K = i13;
                }
            }
            ro roVar = this.f50527a;
            if (roVar != null) {
                roVar.f();
            }
            org.telegram.ui.ActionBar.g5 g5Var = this.f50529c;
            if (g5Var != null) {
                if (this.f50535w.size() <= 10) {
                    i12 = 8;
                }
                g5Var.setVisibility(i12);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f50528b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50528b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f28282y6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f50528b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f28072n6));
        return arrayList;
    }

    public final void h0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f50528b != null) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28072n6, false);
                if (!this.Q || x02 != this.R || x03 != this.S) {
                    this.Q = true;
                    this.R = x02;
                    this.S = x03;
                    for (int i7 = 0; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f50528b.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f50528b.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f50528b.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f50528b.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f50528b.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f50528b.V(i10);
                            } else if (i7 == 2) {
                                O = this.f50528b.P(i10);
                            } else {
                                O = this.f50528b.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.a5) {
                                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) O;
                                a5Var.O = true;
                                a5Var.H = x02;
                                a5Var.I = x03;
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
        getNotificationCenter().c(this, org.telegram.messenger.qs.T);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25067r);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25116y1);
        e0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.T);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25067r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25116y1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ro roVar = this.f50527a;
        if (roVar != null) {
            roVar.f();
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
