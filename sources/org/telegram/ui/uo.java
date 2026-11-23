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
public final class uo extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public qo E;
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
    public ro f52696a;
    public org.telegram.ui.Components.ek0 f52697b;
    public org.telegram.ui.ActionBar.g5 f52698c;
    public org.telegram.ui.Components.sy d;
    public to f52699e;
    public TLRPC.Chat f52700f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f52701n;
    public org.telegram.ui.ActionBar.t1 f52702r;
    public boolean f52703s;
    public ArrayList f52704w;
    public boolean f52705x;
    public boolean f52706y;

    public static void Z(uo uoVar, org.telegram.ui.ActionBar.t1[] t1VarArr) {
        try {
            t1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        t1VarArr[0] = null;
        uoVar.h.linked_chat_id = 0L;
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(uoVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.ks.T, uoVar.h, 0, bool, bool);
        org.telegram.messenger.g0.h3(new jo(uoVar, 2), 1000L);
        if (!uoVar.f52703s) {
            uoVar.finishFragment();
        }
    }

    public static void b0(uo uoVar, org.telegram.ui.ActionBar.t1[] t1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.g2 g2Var) {
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            try {
                t1Var.dismiss();
            } catch (Throwable unused) {
            }
            t1VarArr[0] = null;
        }
        uoVar.h.linked_chat_id = chat.f28492id;
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(uoVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.ks.T, uoVar.h, 0, bool, bool);
        org.telegram.messenger.g0.h3(new jo(uoVar, 1), 1000L);
        if (g2Var != null) {
            uoVar.removeSelfFromStack();
            g2Var.finishFragment();
            return;
        }
        uoVar.finishFragment();
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29767u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29616m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29509g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131751377, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new y7(this, 9));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, 2131232491);
        b10.O();
        b10.C0 = new bi.x1(this, 3);
        this.f52698c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        this.f52699e = new to(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sy syVar = new org.telegram.ui.Components.sy(context, null);
        this.d = syVar;
        syVar.b();
        this.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f52697b = ek0Var;
        ek0Var.r1();
        this.f52697b.setSectionsDrawBackground(true);
        this.f52697b.setEmptyView(this.d);
        this.f52697b.setLayoutManager(new v4.c0(1, false));
        org.telegram.ui.Components.ek0 ek0Var2 = this.f52697b;
        ro roVar = new ro(this, context);
        this.f52696a = roVar;
        ek0Var2.setAdapter(roVar);
        org.telegram.ui.Components.ek0 ek0Var3 = this.f52697b;
        if (!org.telegram.messenger.gd.f24314a0) {
            i7 = 2;
        }
        ek0Var3.setVerticalScrollbarPosition(i7);
        frameLayout.addView(this.f52697b, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.na.c(-1.0f, -1));
        this.f52697b.setOnItemClickListener(new h(this, 4));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, org.telegram.ui.ActionBar.g2 g2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.v3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.f28492id, this, new oi.f0(21, this, g2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = null;
        if (g2Var == null) {
            t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = {t1Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.mp.k1(this.f52700f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.mp.k1(chat);
        org.telegram.messenger.g0.h3(new ko(this, t1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.m2(this, t1VarArr, chat, g2Var, 11), 64), 1), 500L);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        qo qoVar;
        TLRPC.Chat O0;
        TLRPC.Chat chat = null;
        if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f28493id;
            if (j3 == this.F) {
                this.h = chatFull;
                e0();
                g0();
                return;
            }
            TLRPC.Chat chat2 = this.f52701n;
            if (chat2 != null && chat2.f28492id == j3) {
                try {
                    this.f52702r.dismiss();
                } catch (Throwable unused) {
                }
                this.f52702r = null;
                f0(this.f52701n, false);
                this.f52701n = null;
            }
        } else if (i7 == org.telegram.messenger.ks.f25276r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i11 = org.telegram.messenger.mp.I8;
            if ((intValue & 8192) != 0 && this.f52700f != null) {
                TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(this.f52700f.f28492id));
                if (O02 != null) {
                    this.f52700f = O02;
                }
                if (this.f52704w.size() > 0 && (O0 = getMessagesController().O0(Long.valueOf(((TLRPC.Chat) this.f52704w.get(0)).f28492id))) != null) {
                    this.f52704w.set(0, O0);
                }
                if (this.f52703s) {
                    if (this.f52704w.size() > 0) {
                        chat = (TLRPC.Chat) this.f52704w.get(0);
                    }
                } else {
                    chat = this.f52700f;
                }
                if (chat != null && (qoVar = this.E) != null) {
                    if (!this.Q) {
                        qoVar.setJoinRequest(chat.join_request);
                    }
                    if (!this.P) {
                        this.E.setJoinToSend(chat.join_to_send);
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25325y1) {
            if ((-this.F) == ((Long) objArr[0]).longValue()) {
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
            this.f52704w.clear();
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.h.linked_chat_id));
            if (O0 != null) {
                this.f52704w.add(O0);
            }
            org.telegram.ui.ActionBar.g5 g5Var = this.f52698c;
            if (g5Var != null) {
                g5Var.setVisibility(8);
            }
        }
        if (!this.f52705x && this.f52703s && this.h.linked_chat_id == 0) {
            this.f52705x = true;
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
        TLRPC.ChatFull P0 = getMessagesController().P0(chat.f28492id);
        int i14 = 3;
        if (P0 == null) {
            if (z10) {
                getMessagesController().b3(0, chat.f28492id, true);
                this.f52701n = chat;
                this.f52702r = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
                org.telegram.messenger.g0.h3(new jo(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29559j5, null);
        textView.setTextSize(1, 16.0f);
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 48);
        if (!org.telegram.messenger.v3.t0(chat)) {
            a02 = org.telegram.messenger.gd.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751364, chat.title, this.f52700f.title);
        } else if (!org.telegram.messenger.v3.t0(this.f52700f)) {
            a02 = org.telegram.messenger.gd.a0("DiscussionLinkGroupPrivateAlert", null, 2131751366, chat.title, this.f52700f.title);
        } else {
            a02 = org.telegram.messenger.gd.a0("DiscussionLinkGroupPublicAlert", null, 2131751365, chat.title, this.f52700f.title);
        }
        if (P0.hidden_prehistory) {
            a02 = i5.c.k(2131751367, null, p5.c.n(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.g0.W2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getParentActivity());
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout.addView(p9Var, c8.na.d(40, 40.0f, i10 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = org.telegram.messenger.gd.f24314a0;
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
        frameLayout.addView(textView2, c8.na.d(-1, -2.0f, i15, f10, 11.0f, i16, 0.0f));
        if (org.telegram.messenger.gd.f24314a0) {
            i14 = 5;
        }
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, i14 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        a9Var.q(chat);
        p9Var.f(chat, a9Var);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751368, null), new a7(this, P0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        showDialog(alertDialog$Builder.f28835a);
    }

    public final void g0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f52703s;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.F));
        this.f52700f = O0;
        if (O0 != null) {
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
                int size = this.f52704w.size() + i7;
                this.N = size;
                this.I = size;
                if (this.h.linked_chat_id != 0) {
                    this.N = size + 1;
                    this.G = size;
                }
            } else {
                this.H = 1;
                int size2 = this.f52704w.size();
                int i10 = 1 + size2;
                this.I = i10;
                this.N = size2 + 2;
                this.G = i10;
            }
            int i11 = this.N;
            this.N = i11 + 1;
            this.K = i11;
            int i12 = 0;
            if (!z10 || (this.f52704w.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z10) {
                    chat = (TLRPC.Chat) this.f52704w.get(0);
                } else {
                    chat = this.f52700f;
                }
                if (chat != null && ((!org.telegram.messenger.v3.t0(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i13 = this.N;
                    this.N = i13 + 1;
                    this.L = i13;
                }
            }
            ro roVar = this.f52696a;
            if (roVar != null) {
                roVar.f();
            }
            org.telegram.ui.ActionBar.g5 g5Var = this.f52698c;
            if (g5Var != null) {
                if (this.f52704w.size() <= 10) {
                    i12 = 8;
                }
                g5Var.setVisibility(i12);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f52697b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52697b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.f29843y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f52697b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.f29633n6));
        return arrayList;
    }

    public final void h0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.f52697b != null) {
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29843y6, false);
                int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29633n6, false);
                if (!this.R || x02 != this.S || x03 != this.T) {
                    this.R = true;
                    this.S = x02;
                    this.T = x03;
                    for (int i7 = 0; i7 < 4; i7++) {
                        if (i7 == 0) {
                            attachedScrapChildCount = this.f52697b.getChildCount();
                        } else if (i7 == 1) {
                            attachedScrapChildCount = this.f52697b.getHiddenChildCount();
                        } else if (i7 == 2) {
                            attachedScrapChildCount = this.f52697b.getCachedChildCount();
                        } else {
                            attachedScrapChildCount = this.f52697b.getAttachedScrapChildCount();
                        }
                        for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                            if (i7 == 0) {
                                O = this.f52697b.getChildAt(i10);
                            } else if (i7 == 1) {
                                O = this.f52697b.V(i10);
                            } else if (i7 == 2) {
                                O = this.f52697b.P(i10);
                            } else {
                                O = this.f52697b.O(i10);
                            }
                            if (O instanceof org.telegram.ui.Cells.b5) {
                                org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) O;
                                b5Var.P = true;
                                b5Var.I = x02;
                                b5Var.J = x03;
                                if (i7 != 0) {
                                    ((org.telegram.ui.Cells.b5) O).d(0);
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
        getNotificationCenter().c(this, org.telegram.messenger.ks.T);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25276r);
        getNotificationCenter().c(this, org.telegram.messenger.ks.f25325y1);
        e0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.T);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25276r);
        getNotificationCenter().n(this, org.telegram.messenger.ks.f25325y1);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ro roVar = this.f52696a;
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
