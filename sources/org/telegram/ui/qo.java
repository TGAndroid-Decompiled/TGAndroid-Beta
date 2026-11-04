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
public final class qo extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public mo E;
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
    public no f48920a;
    public org.telegram.ui.Components.tj0 f48921b;
    public org.telegram.ui.ActionBar.f5 f48922c;
    public org.telegram.ui.Components.gy d;
    public po f48923e;
    public TLRPC.Chat f48924f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f48925n;
    public org.telegram.ui.ActionBar.s1 f48926r;
    public boolean f48927s;
    public ArrayList f48928w;
    public boolean f48929x;
    public boolean f48930y;

    public static void Z(qo qoVar, org.telegram.ui.ActionBar.s1[] s1VarArr) {
        try {
            s1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        s1VarArr[0] = null;
        qoVar.h.linked_chat_id = 0L;
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(qoVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.hs.T, qoVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new co(qoVar, 2), 1000L);
        if (!qoVar.f48927s) {
            qoVar.finishFragment();
        }
    }

    public static void b0(qo qoVar, org.telegram.ui.ActionBar.s1[] s1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.d2 d2Var) {
        org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
        if (s1Var != null) {
            try {
                s1Var.dismiss();
            } catch (Throwable unused) {
            }
            s1VarArr[0] = null;
        }
        qoVar.h.linked_chat_id = chat.f27001id;
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(qoVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.hs.T, qoVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new co(qoVar, 1), 1000L);
        if (d2Var != null) {
            qoVar.removeSelfFromStack();
            d2Var.finishFragment();
            return;
        }
        qoVar.finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28214v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28196u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28043m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
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
    }

    @Override
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751390, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 7));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, 2131232486);
        b10.N();
        b10.C0 = new lg.w1(this, 2);
        this.f48922c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.f48923e = new po(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.d = gyVar;
        gyVar.b();
        this.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f48921b = tj0Var;
        tj0Var.r1();
        this.f48921b.setSectionsDrawBackground(true);
        this.f48921b.setEmptyView(this.d);
        this.f48921b.setLayoutManager(new u4.b0(1, false));
        org.telegram.ui.Components.tj0 tj0Var2 = this.f48921b;
        no noVar = new no(this, context);
        this.f48920a = noVar;
        tj0Var2.setAdapter(noVar);
        org.telegram.ui.Components.tj0 tj0Var3 = this.f48921b;
        if (!org.telegram.messenger.bd.f21784a0) {
            i3 = 2;
        }
        tj0Var3.setVerticalScrollbarPosition(i3);
        frameLayout.addView(this.f48921b, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.d, b8.mf.c(-1.0f, -1));
        this.f48921b.setOnItemClickListener(new h(this, 4));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, org.telegram.ui.ActionBar.d2 d2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.t3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.f27001id, this, new mi.d4(29, this, d2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = null;
        if (d2Var == null) {
            s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
        }
        org.telegram.ui.ActionBar.s1[] s1VarArr = {s1Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.hp.i1(this.f48924f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.hp.i1(chat);
        org.telegram.messenger.g0.i3(new eo(this, s1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ai.q1(this, s1VarArr, chat, d2Var, 11), 64), 1), 500L);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        mo moVar;
        TLRPC.Chat M0;
        TLRPC.Chat chat = null;
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f27002id;
            if (j10 == this.F) {
                this.h = chatFull;
                e0();
                g0();
                return;
            }
            TLRPC.Chat chat2 = this.f48925n;
            if (chat2 != null && chat2.f27001id == j10) {
                try {
                    this.f48926r.dismiss();
                } catch (Throwable unused) {
                }
                this.f48926r = null;
                f0(this.f48925n, false);
                this.f48925n = null;
            }
        } else if (i3 == org.telegram.messenger.hs.f23292r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.hp.C8;
            if ((intValue & 8192) != 0 && this.f48924f != null) {
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f48924f.f27001id));
                if (M02 != null) {
                    this.f48924f = M02;
                }
                if (this.f48928w.size() > 0 && (M0 = getMessagesController().M0(Long.valueOf(((TLRPC.Chat) this.f48928w.get(0)).f27001id))) != null) {
                    this.f48928w.set(0, M0);
                }
                if (this.f48927s) {
                    if (this.f48928w.size() > 0) {
                        chat = (TLRPC.Chat) this.f48928w.get(0);
                    }
                } else {
                    chat = this.f48924f;
                }
                if (chat != null && (moVar = this.E) != null) {
                    if (!this.Q) {
                        moVar.setJoinRequest(chat.join_request);
                    }
                    if (!this.P) {
                        this.E.setJoinToSend(chat.join_to_send);
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23341y1) {
            if ((-this.F) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var != null && q4Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0() {
        if (this.h.linked_chat_id != 0) {
            this.f48928w.clear();
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.h.linked_chat_id));
            if (M0 != null) {
                this.f48928w.add(M0);
            }
            org.telegram.ui.ActionBar.f5 f5Var = this.f48922c;
            if (f5Var != null) {
                f5Var.setVisibility(8);
            }
        }
        if (!this.f48929x && this.f48927s && this.h.linked_chat_id == 0) {
            this.f48929x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new l(this, 3));
        }
    }

    public final void f0(TLRPC.Chat chat, boolean z10) {
        int i3;
        String a02;
        int i10;
        int i11;
        int i12;
        int i13;
        TLRPC.ChatFull N0 = getMessagesController().N0(chat.f27001id);
        int i14 = 3;
        if (N0 == null) {
            if (z10) {
                getMessagesController().V2(0, chat.f27001id, true);
                this.f48925n = chat;
                this.f48926r = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
                org.telegram.messenger.g0.i3(new co(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27988j5, null);
        textView.setTextSize(1, 16.0f);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 48);
        if (!org.telegram.messenger.t3.t0(chat)) {
            a02 = org.telegram.messenger.bd.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751377, chat.title, this.f48924f.title);
        } else if (!org.telegram.messenger.t3.t0(this.f48924f)) {
            a02 = org.telegram.messenger.bd.a0("DiscussionLinkGroupPrivateAlert", null, 2131751379, chat.title, this.f48924f.title);
        } else {
            a02 = org.telegram.messenger.bd.a0("DiscussionLinkGroupPublicAlert", null, 2131751378, chat.title, this.f48924f.title);
        }
        if (N0.hidden_prehistory) {
            a02 = k2.p1.k(2131751380, null, t4.c.h(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.g0.X2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getParentActivity());
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(k9Var, b8.mf.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = org.telegram.messenger.bd.f21784a0;
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
        frameLayout.addView(textView2, b8.mf.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
        if (org.telegram.messenger.bd.f21784a0) {
            i14 = 5;
        }
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        u8Var.q(chat);
        k9Var.e(chat, u8Var);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751381, null), new b7(this, N0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        showDialog(alertDialog$Builder.f27343a);
    }

    public final void g0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f48927s;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.F));
        this.f48924f = M0;
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
                int i3 = this.N;
                this.H = i3;
                int size = this.f48928w.size() + i3;
                this.N = size;
                this.I = size;
                if (this.h.linked_chat_id != 0) {
                    this.N = size + 1;
                    this.G = size;
                }
            } else {
                this.H = 1;
                int size2 = this.f48928w.size();
                int i10 = 1 + size2;
                this.I = i10;
                this.N = size2 + 2;
                this.G = i10;
            }
            int i11 = this.N;
            this.N = i11 + 1;
            this.K = i11;
            int i12 = 0;
            if (!z10 || (this.f48928w.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z10) {
                    chat = (TLRPC.Chat) this.f48928w.get(0);
                } else {
                    chat = this.f48924f;
                }
                if (chat != null && ((!org.telegram.messenger.t3.t0(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i13 = this.N;
                    this.N = i13 + 1;
                    this.L = i13;
                }
            }
            no noVar = this.f48920a;
            if (noVar != null) {
                noVar.f();
            }
            org.telegram.ui.ActionBar.f5 f5Var = this.f48922c;
            if (f5Var != null) {
                if (this.f48928w.size() <= 10) {
                    i12 = 8;
                }
                f5Var.setVisibility(i12);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f48921b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48921b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28273y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f48921b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28062n6));
        return arrayList;
    }

    public final void h0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f48921b != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28062n6, false);
                if (!this.R || x02 != this.S || x03 != this.T) {
                    this.R = true;
                    this.S = x02;
                    this.T = x03;
                    for (int i3 = 0; i3 < 4; i3++) {
                        if (i3 == 0) {
                            attachedScrapChildCount = this.f48921b.getChildCount();
                        } else if (i3 == 1) {
                            attachedScrapChildCount = this.f48921b.getHiddenChildCount();
                        } else if (i3 == 2) {
                            attachedScrapChildCount = this.f48921b.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f48921b.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i3 == 0) {
                                O = this.f48921b.getChildAt(i10);
                            } else if (i3 == 1) {
                                O = this.f48921b.V(i10);
                            } else if (i3 == 2) {
                                O = this.f48921b.P(i10);
                            } else {
                                O = this.f48921b.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.a5) {
                                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) O;
                                a5Var.P = true;
                                a5Var.I = x02;
                                a5Var.J = x03;
                                if (i3 != 0) {
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
        getNotificationCenter().c(this, org.telegram.messenger.hs.T);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23292r);
        getNotificationCenter().c(this, org.telegram.messenger.hs.f23341y1);
        e0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.T);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23292r);
        getNotificationCenter().n(this, org.telegram.messenger.hs.f23341y1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        no noVar = this.f48920a;
        if (noVar != null) {
            noVar.f();
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
