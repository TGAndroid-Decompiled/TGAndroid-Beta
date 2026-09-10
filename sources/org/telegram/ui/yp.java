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
public final class yp extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
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
    public vp f39076a;
    public org.telegram.ui.Components.vl0 f39077b;
    public org.telegram.ui.ActionBar.w0 f39078c;
    public org.telegram.ui.Components.tz d;
    public xp e;
    public TLRPC.Chat f39079f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f39080n;
    public org.telegram.ui.ActionBar.d2 f39081r;
    public boolean f39082s;
    public ArrayList v;
    public boolean f39083w;
    public boolean f39084x;
    public up f39085y;

    public static void U(yp ypVar, org.telegram.ui.ActionBar.d2[] d2VarArr) {
        try {
            d2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        d2VarArr[0] = null;
        ypVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(ypVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, ypVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new np(ypVar, 2), 1000L);
        if (!ypVar.f39082s) {
            ypVar.finishFragment();
        }
    }

    public static void W(yp ypVar, org.telegram.ui.ActionBar.d2[] d2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.p2 p2Var) {
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            try {
                d2Var.dismiss();
            } catch (Throwable unused) {
            }
            d2VarArr[0] = null;
        }
        ypVar.h.linked_chat_id = chat.f17195id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(ypVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, ypVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new np(ypVar, 1), 1000L);
        if (p2Var != null) {
            ypVar.removeSelfFromStack();
            p2Var.finishFragment();
            return;
        }
        ypVar.finishFragment();
    }

    public final void Y(TLRPC.Chat chat, org.telegram.ui.ActionBar.p2 p2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.f17195id, this, new oe(10, this, p2Var));
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = null;
        if (p2Var == null) {
            d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
        }
        org.telegram.ui.ActionBar.d2[] d2VarArr = {d2Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f39079f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new op(this, d2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.l9(this, d2VarArr, chat, p2Var, 4), 64), 1), 500L);
    }

    public final void Z() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f39078c;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
        }
        if (!this.f39083w && this.f39082s && this.h.linked_chat_id == 0) {
            this.f39083w = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new m(this, 3));
        }
    }

    public final void a0(TLRPC.Chat chat, boolean z10) {
        int i10;
        String formatString;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.f17195id);
        int i15 = 3;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.f17195id, 0, true);
                this.f39080n = chat;
                this.f39081r = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new np(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (!ChatObject.isPublic(chat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f39079f.title);
        } else if (!ChatObject.isPublic(this.f39079f)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f39079f.title);
        } else {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f39079f.title);
        }
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.a2.h(R.string.DiscussionLinkGroupAlertHistory, w.f.g(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(w9Var, w7.a6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
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
        frameLayout.addView(textView2, w7.a6.d(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        }
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        g9Var.k(this.currentAccount, chat);
        w9Var.e(chat, g9Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new a7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f17528a);
    }

    public final void b0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f39082s;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.E));
        this.f39079f = chat2;
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
                    chat = this.f39079f;
                }
                if (chat != null && ((!ChatObject.isPublic(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i14 = this.M;
                    this.M = i14 + 1;
                    this.K = i14;
                }
            }
            vp vpVar = this.f39076a;
            if (vpVar != null) {
                vpVar.l();
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f39078c;
            if (w0Var != null) {
                if (this.v.size() <= 10) {
                    i13 = 8;
                }
                w0Var.setVisibility(i13);
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
        this.actionBar.setActionBarMenuOnItemClick(new vo(this, 2));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 2);
        this.f39078c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new xp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i11 = org.telegram.ui.ActionBar.j6.f17872a7;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.d = tzVar;
        tzVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.d, w7.a6.c(-1.0f, -1));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f39077b = vl0Var;
        vl0Var.o1();
        this.f39077b.setEmptyView(this.d);
        this.f39077b.setLayoutManager(new s4.c0(1, false));
        org.telegram.ui.Components.vl0 vl0Var2 = this.f39077b;
        vp vpVar = new vp(this, context);
        this.f39076a = vpVar;
        vl0Var2.setAdapter(vpVar);
        org.telegram.ui.Components.vl0 vl0Var3 = this.f39077b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        vl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f39077b, w7.a6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f39077b);
        this.f39077b.setOnItemClickListener(new i(this, 3));
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        up upVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f17196id;
            if (j3 == this.E) {
                this.h = chatFull;
                Z();
                b0();
                return;
            }
            TLRPC.Chat chat3 = this.f39080n;
            if (chat3 != null && chat3.f17195id == j3) {
                try {
                    this.f39081r.dismiss();
                } catch (Throwable unused) {
                }
                this.f39081r = null;
                a0(this.f39080n, false);
                this.f39080n = null;
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 && this.f39079f != null) {
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f39079f.f17195id));
                if (chat4 != null) {
                    this.f39079f = chat4;
                }
                if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).f17195id))) != null) {
                    this.v.set(0, chat);
                }
                if (this.f39082s) {
                    if (this.v.size() > 0) {
                        chat2 = (TLRPC.Chat) this.v.get(0);
                    }
                } else {
                    chat2 = this.f39079f;
                }
                if (chat2 != null && (upVar = this.f39085y) != null) {
                    if (!this.P) {
                        upVar.setJoinRequest(chat2.join_request);
                    }
                    if (!this.O) {
                        this.f39085y.setJoinToSend(chat2.join_to_send);
                    }
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.E) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                if (f5Var != null && f5Var.getLastFragment() == this) {
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
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18306y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f18110n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.j6.f18174r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 0, new Class[]{sp.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f17985g9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18091m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18236u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39077b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18254v6));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        Z();
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
        vp vpVar = this.f39076a;
        if (vpVar != null) {
            vpVar.l();
        }
    }
}
