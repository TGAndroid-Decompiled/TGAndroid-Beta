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
    public rp f38179a;
    public org.telegram.ui.Components.vl0 f38180b;
    public org.telegram.ui.ActionBar.v0 f38181c;
    public org.telegram.ui.Components.mz d;
    public tp e;
    public TLRPC.Chat f38182f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f38183n;
    public org.telegram.ui.ActionBar.b2 f38184r;
    public boolean f38185s;
    public ArrayList v;
    public boolean f38186w;
    public boolean f38187x;
    public qp f38188y;

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
        if (!upVar.f38185s) {
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
        upVar.h.linked_chat_id = chat.f18328id;
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
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.f18328id, this, new l4(15, this, n2Var));
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = null;
        if (n2Var == null) {
            b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = {b2Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f38182f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new kp(this, b2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ai.p3(this, b2VarArr, chat, n2Var, 5), 64), 1), 500L);
    }

    public final void Z() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.f38181c;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
        }
        if (!this.f38186w && this.f38185s && this.h.linked_chat_id == 0) {
            this.f38186w = true;
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
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.f18328id);
        int i15 = 3;
        if (chatFull == null) {
            if (z10) {
                getMessagesController().loadFullChat(chat.f18328id, 0, true);
                this.f38183n = chat;
                this.f38184r = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new jp(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19201j5, false));
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (!ChatObject.isPublic(chat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f38182f.title);
        } else if (!ChatObject.isPublic(this.f38182f)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f38182f.title);
        } else {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f38182f.title);
        }
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.l0.g(R.string.DiscussionLinkGroupAlertHistory, v7.j0.h(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(getParentActivity());
        v9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(v9Var, w7.y5.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
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
        frameLayout.addView(textView2, w7.y5.d(-1, -2.0f, i16, f7, 11.0f, i17, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        }
        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        g9Var.k(this.currentAccount, chat);
        v9Var.e(chat, g9Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new b7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f18654a);
    }

    public final void b0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.f38185s;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.E));
        this.f38182f = chat2;
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
                    chat = this.f38182f;
                }
                if (chat != null && ((!ChatObject.isPublic(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i14 = this.M;
                    this.M = i14 + 1;
                    this.K = i14;
                }
            }
            rp rpVar = this.f38179a;
            if (rpVar != null) {
                rpVar.l();
            }
            org.telegram.ui.ActionBar.v0 v0Var = this.f38181c;
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
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 2);
        this.f38181c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new tp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i11 = org.telegram.ui.ActionBar.j6.f19038a7;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.d = mzVar;
        mzVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.d, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f38180b = vl0Var;
        vl0Var.q1();
        this.f38180b.setEmptyView(this.d);
        this.f38180b.setLayoutManager(new s4.c0(1, false));
        org.telegram.ui.Components.vl0 vl0Var2 = this.f38180b;
        rp rpVar = new rp(this, context);
        this.f38179a = rpVar;
        vl0Var2.setAdapter(rpVar);
        org.telegram.ui.Components.vl0 vl0Var3 = this.f38180b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        vl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f38180b, w7.y5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f38180b);
        this.f38180b.setOnItemClickListener(new i(this, 3));
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
            long j3 = chatFull.f18329id;
            if (j3 == this.E) {
                this.h = chatFull;
                Z();
                b0();
                return;
            }
            TLRPC.Chat chat3 = this.f38183n;
            if (chat3 != null && chat3.f18328id == j3) {
                try {
                    this.f38184r.dismiss();
                } catch (Throwable unused) {
                }
                this.f38184r = null;
                a0(this.f38183n, false);
                this.f38183n = null;
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 && this.f38182f != null) {
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f38182f.f18328id));
                if (chat4 != null) {
                    this.f38182f = chat4;
                }
                if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).f18328id))) != null) {
                    this.v.set(0, chat);
                }
                if (this.f38185s) {
                    if (this.v.size() > 0) {
                        chat2 = (TLRPC.Chat) this.v.get(0);
                    }
                } else {
                    chat2 = this.f38182f;
                }
                if (chat2 != null && (qpVar = this.f38188y) != null) {
                    if (!this.P) {
                        qpVar.setJoinRequest(chat2.join_request);
                    }
                    if (!this.O) {
                        this.f38188y.setJoinToSend(chat2.join_to_send);
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
        int i10 = org.telegram.ui.ActionBar.j6.f19094d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 16, new Class[]{org.telegram.ui.Cells.c5.class, org.telegram.ui.Cells.z4.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f19038a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19372s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19427v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19391t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19184i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19216k0, null, null, org.telegram.ui.ActionBar.j6.f19095d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19058b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 0, new Class[]{org.telegram.ui.Cells.c5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 0, new Class[]{org.telegram.ui.Cells.c5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f19477y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 0, new Class[]{org.telegram.ui.Cells.c5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.f19279n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 0, new Class[]{org.telegram.ui.Cells.c5.class}, null, org.telegram.ui.ActionBar.j6.f19345r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 0, new Class[]{op.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19151g9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 262144, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 262144, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19259m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 262144, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19407u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38180b, 262144, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19425v6));
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
        rp rpVar = this.f38179a;
        if (rpVar != null) {
            rpVar.l();
        }
    }
}
