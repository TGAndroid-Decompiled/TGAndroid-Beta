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
public final class qp extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public long B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public np f37803a;
    public org.telegram.ui.Components.sl0 f37804b;
    public org.telegram.ui.ActionBar.w0 f37805c;
    public org.telegram.ui.Components.mz d;
    public pp e;
    public TLRPC.Chat f37806f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat f37807n;
    public org.telegram.ui.ActionBar.d2 f37808r;
    public boolean f37809s;
    public ArrayList v;
    public boolean f37810w;
    public boolean f37811x;
    public mp f37812y;

    public static void U(qp qpVar, org.telegram.ui.ActionBar.d2[] d2VarArr) {
        try {
            d2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        d2VarArr[0] = null;
        qpVar.h.linked_chat_id = 0L;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(qpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, qpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new ep(qpVar, 2), 1000L);
        if (!qpVar.f37809s) {
            qpVar.finishFragment();
        }
    }

    public static void W(qp qpVar, org.telegram.ui.ActionBar.d2[] d2VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.p2 p2Var) {
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            try {
                d2Var.dismiss();
            } catch (Throwable unused) {
            }
            d2VarArr[0] = null;
        }
        qpVar.h.linked_chat_id = chat.f19184id;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(qpVar.currentAccount);
        int i10 = NotificationCenter.chatInfoDidLoad;
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, qpVar.h, 0, bool, bool);
        AndroidUtilities.runOnUIThread(new ep(qpVar, 1), 1000L);
        if (p2Var != null) {
            qpVar.removeSelfFromStack();
            p2Var.finishFragment();
            return;
        }
        qpVar.finishFragment();
    }

    public final void Y(TLRPC.Chat chat, org.telegram.ui.ActionBar.p2 p2Var) {
        if (chat == null) {
            return;
        }
        if (!ChatObject.isChannel(chat)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), chat.f19184id, this, new mg.w(23, this, p2Var));
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = null;
        if (p2Var == null) {
            d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
        }
        org.telegram.ui.ActionBar.d2[] d2VarArr = {d2Var};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(this.f37806f);
        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(chat);
        AndroidUtilities.runOnUIThread(new fp(this, d2VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new kh.b1(this, d2VarArr, chat, p2Var, 8), 64), 1), 500L);
    }

    public final void Z() {
        if (this.h.linked_chat_id != 0) {
            this.v.clear();
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.h.linked_chat_id));
            if (chat != null) {
                this.v.add(chat);
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f37805c;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
        }
        if (!this.f37810w && this.f37809s && this.h.linked_chat_id == 0) {
            this.f37810w = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new o(this, 3));
        }
    }

    public final void a0(TLRPC.Chat chat, boolean z4) {
        int i10;
        String formatString;
        int i11;
        int i12;
        int i13;
        int i14;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.f19184id);
        int i15 = 3;
        if (chatFull == null) {
            if (z4) {
                getMessagesController().loadFullChat(chat.f19184id, 0, true);
                this.f37807n = chat;
                this.f37808r = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
                AndroidUtilities.runOnUIThread(new ep(this, 0), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
        textView.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        if (!ChatObject.isPublic(chat)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicPrivateAlert", R.string.DiscussionLinkGroupPublicPrivateAlert, chat.title, this.f37806f.title);
        } else if (!ChatObject.isPublic(this.f37806f)) {
            formatString = LocaleController.formatString("DiscussionLinkGroupPrivateAlert", R.string.DiscussionLinkGroupPrivateAlert, chat.title, this.f37806f.title);
        } else {
            formatString = LocaleController.formatString("DiscussionLinkGroupPublicAlert", R.string.DiscussionLinkGroupPublicAlert, chat.title, this.f37806f.title);
        }
        if (chatFull.hidden_prehistory) {
            formatString = org.telegram.messenger.y3.h(R.string.DiscussionLinkGroupAlertHistory, vh.v2.f(formatString, "\n\n"));
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        z8Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getParentActivity());
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout.addView(p9Var, k7.b6.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
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
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i16 = i13 | 48;
        int i17 = 76;
        if (z10) {
            i14 = 21;
        } else {
            i14 = 76;
        }
        float f10 = i14;
        if (!z10) {
            i17 = 21;
        }
        frameLayout.addView(textView2, k7.b6.d(-1, -2.0f, i16, f10, 11.0f, i17, 0.0f));
        if (LocaleController.isRTL) {
            i15 = 5;
        }
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        z8Var.k(this.currentAccount, chat);
        p9Var.e(chat, z8Var);
        alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionLinkGroup), new d7(this, chatFull, chat, 9));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f19503a);
    }

    public final void b0() {
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z4 = this.f37809s;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.B));
        this.f37806f = chat2;
        if (chat2 != null) {
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.I = -1;
            this.J = 1;
            if (z4) {
                if (this.h.linked_chat_id == 0) {
                    this.J = 2;
                    this.C = 1;
                }
                int i10 = this.J;
                this.D = i10;
                int size = this.v.size() + i10;
                this.J = size;
                this.E = size;
                if (this.h.linked_chat_id != 0) {
                    this.J = size + 1;
                    this.C = size;
                }
            } else {
                this.D = 1;
                int size2 = this.v.size();
                int i11 = 1 + size2;
                this.E = i11;
                this.J = size2 + 2;
                this.C = i11;
            }
            int i12 = this.J;
            this.J = i12 + 1;
            this.G = i12;
            int i13 = 0;
            if (!z4 || (this.v.size() > 0 && this.h.linked_chat_id != 0)) {
                if (z4) {
                    chat = (TLRPC.Chat) this.v.get(0);
                } else {
                    chat = this.f37806f;
                }
                if (chat != null && ((!ChatObject.isPublic(chat) || z4) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                    int i14 = this.J;
                    this.J = i14 + 1;
                    this.H = i14;
                }
            }
            np npVar = this.f37803a;
            if (npVar != null) {
                npVar.l();
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f37805c;
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
        this.K = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Discussion));
        this.actionBar.setActionBarMenuOnItemClick(new eg.m1(this, 19));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 1);
        this.f37805c = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.e = new pp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        int i11 = org.telegram.ui.ActionBar.j6.f19852a7;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.fragmentView.setTag(Integer.valueOf(i11));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.d = mzVar;
        mzVar.b();
        this.d.setText(LocaleController.getString(R.string.NoResult));
        frameLayout2.addView(this.d, k7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f37804b = sl0Var;
        sl0Var.p1();
        this.f37804b.setEmptyView(this.d);
        this.f37804b.setLayoutManager(new f2.i0(1, false));
        org.telegram.ui.Components.sl0 sl0Var2 = this.f37804b;
        np npVar = new np(this, context);
        this.f37803a = npVar;
        sl0Var2.setAdapter(npVar);
        org.telegram.ui.Components.sl0 sl0Var3 = this.f37804b;
        if (!LocaleController.isRTL) {
            i10 = 2;
        }
        sl0Var3.setVerticalScrollbarPosition(i10);
        frameLayout2.addView(this.f37804b, k7.b6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.f37804b);
        this.f37804b.setOnItemClickListener(new j(this, 3));
        b0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        mp mpVar;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = null;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.f19185id;
            if (j10 == this.B) {
                this.h = chatFull;
                Z();
                b0();
                return;
            }
            TLRPC.Chat chat3 = this.f37807n;
            if (chat3 != null && chat3.f19184id == j10) {
                try {
                    this.f37808r.dismiss();
                } catch (Throwable unused) {
                }
                this.f37808r = null;
                a0(this.f37807n, false);
                this.f37807n = null;
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if ((((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 && this.f37806f != null) {
                TLRPC.Chat chat4 = getMessagesController().getChat(Long.valueOf(this.f37806f.f19184id));
                if (chat4 != null) {
                    this.f37806f = chat4;
                }
                if (this.v.size() > 0 && (chat = getMessagesController().getChat(Long.valueOf(((TLRPC.Chat) this.v.get(0)).f19184id))) != null) {
                    this.v.set(0, chat);
                }
                if (this.f37809s) {
                    if (this.v.size() > 0) {
                        chat2 = (TLRPC.Chat) this.v.get(0);
                    }
                } else {
                    chat2 = this.f37806f;
                }
                if (chat2 != null && (mpVar = this.f37812y) != null) {
                    if (!this.M) {
                        mpVar.setJoinRequest(chat2.join_request);
                    }
                    if (!this.L) {
                        this.f37812y.setJoinToSend(chat2.join_to_send);
                    }
                }
            }
        } else if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.B) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
                if (e5Var != null && e5Var.getLastFragment() == this) {
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
        f fVar = new f(this, 7);
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 16, new Class[]{org.telegram.ui.Cells.b5.class, org.telegram.ui.Cells.y4.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19871b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20281y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.j6.f20085n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.j6.f20152r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 0, new Class[]{kp.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19963g9));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20067m6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20207u6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37804b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20225v6));
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
        np npVar = this.f37803a;
        if (npVar != null) {
            npVar.l();
        }
    }
}
