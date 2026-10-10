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
public final class up extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public rp f42544a;
    public org.telegram.ui.Components.rm0 f42545b;
    public org.telegram.ui.ActionBar.v0 f42546c;
    public org.telegram.ui.Components.d00 d;
    public tp f42547e;
    public TLRPC.Chat f42548f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f42549n;
    public org.telegram.ui.ActionBar.b2 f42550r;
    public boolean f42551s;
    public ArrayList v;
    public boolean f42552w;
    public boolean f42553x;
    public qp f42554y;

    public static void U(up upVar, org.telegram.ui.ActionBar.b2[] b2VarArr) {
        try {
            b2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        b2VarArr[0] = null;
        upVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(upVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, upVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new jp(upVar, 2), 1000L);
        if (!upVar.f42551s) {
            upVar.finishFragment();
        }
    }

    public static void W(up upVar, org.telegram.ui.ActionBar.b2[] b2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            try {
                b2Var.dismiss();
            } catch (Throwable unused) {
            }
            b2VarArr[0] = null;
        }
        upVar.h.linked_chat_id = chat.f20042id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(upVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, upVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new jp(upVar, 1), 1000L);
        if (n2Var != null) {
            upVar.removeSelfFromStack();
            n2Var.finishFragment();
            return;
        }
        upVar.finishFragment();
    }

    public final void Y(TLRPC.Chat chat, org.telegram.ui.ActionBar.n2 n2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.f20042id, this, new o(17, this, n2Var));
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = null;
        if (n2Var == null) {
            b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = {b2Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f42548f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new kp(this, b2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ai.q3(this, b2VarArr, chat, n2Var, 5), 64), 1), 500L);
    }

    public final void Z() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.f42546c;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
        }
        if (!this.f42552w && this.f42551s && this.h.linked_chat_id == 0) {
            this.f42552w = true;
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
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.f20042id);
        int i15 = 3;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.f20042id, 0, true);
                this.f42549n = chat;
                this.f42550r = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new jp(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20909j5, false));
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (!ChatObject.isPublic(chat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f42548f.title);
        } else if (!ChatObject.isPublic(this.f42548f)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f42548f.title);
        } else {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f42548f.title);
        }
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.q.g(R.string.DiscussionLinkGroupAlertHistory, sc.v.j(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getParentActivity());
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(y9Var, w7.x5.a(40.0f, 22.0f, 5.0f, 22.0f, 0.0f, 40, i11 | 48));
        TextView textView2 = new TextView(getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false));
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
        frameLayout.addView(textView2, w7.x5.a(-2.0f, f7, 11.0f, i17, 0.0f, -1, i16));
        if (LocaleController.isRTL) {
            i15 = 5;
        }
        frameLayout.addView(textView, w7.x5.a(-2.0f, 24.0f, 57.0f, 24.0f, 9.0f, -2, i15 | 48));
        j9Var.k(this.currentAccount, chat);
        y9Var.e(chat, j9Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new a7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f20378a);
    }

    public final void b0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f42551s;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.E));
        this.f42548f = chat2;
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
                    chat = this.f42548f;
                }
                if (chat != null && ((!ChatObject.isPublic(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i14 = this.M;
                    this.M = i14 + 1;
                    this.K = i14;
                }
            }
            rp rpVar = this.f42544a;
            if (rpVar != null) {
                rpVar.l();
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.f42546c;
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
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 2));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.o().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 2);
        this.f42546c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f42547e = new tp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i11 = org.telegram.ui.ActionBar.i6.f20745a7;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.d00 d00Var = new org.telegram.ui.Components.d00(context, null);
        this.d = d00Var;
        d00Var.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.d, w7.x5.d(-1.0f, -1));
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(context, null);
        this.f42545b = rm0Var;
        rm0Var.p1();
        this.f42545b.setEmptyView(this.d);
        this.f42545b.setLayoutManager(new s4.d0(1, false));
        org.telegram.ui.Components.rm0 rm0Var2 = this.f42545b;
        rp rpVar = new rp(this, context);
        this.f42544a = rpVar;
        rm0Var2.setAdapter(rpVar);
        org.telegram.ui.Components.rm0 rm0Var3 = this.f42545b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        rm0Var3.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f42545b, w7.x5.d(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f42545b);
        this.f42545b.setOnItemClickListener(new i(this, 3));
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        qp qpVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.f20043id;
            if (j3 == this.E) {
                this.h = chatFull;
                Z();
                b0();
                return;
            }
            TLRPC.Chat chat3 = this.f42549n;
            if (chat3 != null && chat3.f20042id == j3) {
                try {
                    this.f42550r.dismiss();
                } catch (Throwable unused) {
                }
                this.f42550r = null;
                a0(this.f42549n, false);
                this.f42549n = null;
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 && this.f42548f != null) {
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f42548f.f20042id));
                if (chat4 != null) {
                    this.f42548f = chat4;
                }
                if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).f20042id))) != null) {
                    this.v.set(0, chat);
                }
                if (this.f42551s) {
                    if (this.v.size() > 0) {
                        chat2 = (TLRPC.Chat) this.v.get(0);
                    }
                } else {
                    chat2 = this.f42548f;
                }
                if (chat2 != null && (qpVar = this.f42554y) != null) {
                    if (!this.P) {
                        qpVar.setJoinRequest(chat2.join_request);
                    }
                    if (!this.O) {
                        this.f42554y.setJoinToSend(chat2.join_to_send);
                    }
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.E) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
                if (d5Var != null && d5Var.getLastFragment() == this) {
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
        int i10 = org.telegram.ui.ActionBar.i6.f20801d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.i6.f20745a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21079s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21134v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21098t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20892i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20923k0, null, null, org.telegram.ui.ActionBar.i6.f20802d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20765b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f21185y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.i6.f20986n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.i6.f21053r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 0, new Class[]{op.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20860g9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20966m6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21114u6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42545b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21132v6));
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
        rp rpVar = this.f42544a;
        if (rpVar != null) {
            rpVar.l();
        }
    }
}
