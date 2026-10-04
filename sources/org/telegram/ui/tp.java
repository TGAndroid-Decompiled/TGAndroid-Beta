package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tp extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public qp f40926a;
    public org.telegram.ui.Components.zl0 f40927b;
    public org.telegram.ui.ActionBar.v0 f40928c;
    public org.telegram.ui.Components.pz d;
    public sp f40929e;
    public TLRPC.Chat f40930f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f40931n;
    public org.telegram.ui.ActionBar.b2 f40932r;
    public boolean f40933s;
    public ArrayList v;
    public boolean f40934w;
    public boolean f40935x;
    public pp f40936y;

    public static void S(tp tpVar, org.telegram.ui.ActionBar.b2[] b2VarArr) {
        try {
            b2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        b2VarArr[0] = null;
        tpVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(tpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, tpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new ip(tpVar, 2), 1000L);
        if (!tpVar.f40933s) {
            tpVar.finishFragment();
        }
    }

    public static void U(tp tpVar, org.telegram.ui.ActionBar.b2[] b2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            try {
                b2Var.dismiss();
            } catch (Throwable unused) {
            }
            b2VarArr[0] = null;
        }
        tpVar.h.linked_chat_id = chat.f20042id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(tpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, tpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new ip(tpVar, 1), 1000L);
        if (n2Var != null) {
            tpVar.removeSelfFromStack();
            n2Var.finishFragment();
            return;
        }
        tpVar.finishFragment();
    }

    public final void X(TLRPC.Chat chat, org.telegram.ui.ActionBar.n2 n2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.f20042id, this, new o(18, this, n2Var));
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = null;
        if (n2Var == null) {
            b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = {b2Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f40930f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new jp(this, b2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ai.p3(this, b2VarArr, chat, n2Var, 5), 64), 1), 500L);
    }

    public final void Y() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.f40928c;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
        }
        if (!this.f40934w && this.f40933s && this.h.linked_chat_id == 0) {
            this.f40934w = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new m(this, 3));
        }
    }

    public final void Z(TLRPC.Chat chat, boolean z10) {
        int i10;
        String formatString;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.f20042id);
        int i15 = 3;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.f20042id, 0, true);
                this.f40931n = chat;
                this.f40932r = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new ip(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20930j5, false));
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (!ChatObject.isPublic(chat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f40930f.title);
        } else if (!ChatObject.isPublic(this.f40930f)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f40930f.title);
        } else {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f40930f.title);
        }
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.q.g(R.string.DiscussionLinkGroupAlertHistory, sa.e.j(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(w9Var, w7.z5.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false));
        textView2.setTextSize(1, 20.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12 | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = LocaleController.isRTL;
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
        frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        }
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        h9Var.k(this.currentAccount, chat);
        w9Var.e(chat, h9Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new c7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f20372a);
    }

    public final void b0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f40933s;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.E));
        this.f40930f = chat2;
        if (chat2 != null) {
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
                int size = this.v.size() + i10;
                this.M = size;
                this.H = size;
                if (this.h.linked_chat_id != 0) {
                    this.M = size + 1;
                    this.F = size;
                }
            } else {
                this.G = 1;
                int size2 = this.v.size();
                int i11 = 1 + size2;
                this.H = i11;
                this.M = size2 + 2;
                this.F = i11;
            }
            int i12 = this.M;
            this.M = i12 + 1;
            this.J = i12;
            int i13 = 0;
            if (!z10 || (this.v.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z10) {
                    chat = (TLRPC.Chat) this.v.get(0);
                } else {
                    chat = this.f40930f;
                }
                if (chat != null && ((!ChatObject.isPublic(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i14 = this.M;
                    this.M = i14 + 1;
                    this.K = i14;
                }
            }
            qp qpVar = this.f40926a;
            if (qpVar != null) {
                qpVar.l();
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.f40928c;
            if (v0Var != null) {
                if (this.v.size() <= 10) {
                    i13 = 8;
                }
                v0Var.setVisibility(i13);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.N = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 2));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 2);
        this.f40928c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f40929e = new sp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i11 = org.telegram.ui.ActionBar.i6.f20766a7;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.d = pzVar;
        pzVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.d, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f40927b = zl0Var;
        zl0Var.s1();
        this.f40927b.setEmptyView(this.d);
        this.f40927b.setLayoutManager(new s4.c0(1, false));
        org.telegram.ui.Components.zl0 zl0Var2 = this.f40927b;
        qp qpVar = new qp(this, context);
        this.f40926a = qpVar;
        zl0Var2.setAdapter(qpVar);
        org.telegram.ui.Components.zl0 zl0Var3 = this.f40927b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        zl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f40927b, w7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f40927b);
        this.f40927b.setOnItemClickListener(new i(this, 3));
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        pp ppVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f20043id;
            if (j3 == this.E) {
                this.h = chatFull;
                Y();
                b0();
                return;
            }
            TLRPC.Chat chat3 = this.f40931n;
            if (chat3 != null && chat3.f20042id == j3) {
                try {
                    this.f40932r.dismiss();
                } catch (Throwable unused) {
                }
                this.f40932r = null;
                Z(this.f40931n, false);
                this.f40931n = null;
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 && this.f40930f != null) {
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f40930f.f20042id));
                if (chat4 != null) {
                    this.f40930f = chat4;
                }
                if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).f20042id))) != null) {
                    this.v.set(0, chat);
                }
                if (this.f40933s) {
                    if (this.v.size() > 0) {
                        chat2 = (TLRPC.Chat) this.v.get(0);
                    }
                } else {
                    chat2 = this.f40930f;
                }
                if (chat2 != null && (ppVar = this.f40936y) != null) {
                    if (!this.P) {
                        ppVar.setJoinRequest(chat2.join_request);
                    }
                    if (!this.O) {
                        this.f40936y.setJoinToSend(chat2.join_to_send);
                    }
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.E) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
                if (c5Var != null && c5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 7);
        int i10 = org.telegram.ui.ActionBar.i6.f20822d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.i6.f20766a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21104s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20945k0, null, null, org.telegram.ui.ActionBar.i6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20786b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21209y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21008n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.i6.f21076r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 0, new Class[]{np.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20880g9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20988m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21139u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f40927b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21157v6));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        Y();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onResume() {
        super.onResume();
        qp qpVar = this.f40926a;
        if (qpVar != null) {
            qpVar.l();
        }
    }
}
