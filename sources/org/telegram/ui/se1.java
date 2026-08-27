package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class se1 extends org.telegram.ui.Components.p71 implements h10 {
    public final FrameLayout P;
    public final org.telegram.ui.Components.zk0 Q;
    public final f2.k0 R;
    public final pe1 S;
    public m21 T;
    public String U;
    public final ArrayList V;
    public final ArrayList W;

    public int f42607a0;

    public int f42608b0;

    public int f42609c0;

    public int f42610d0;

    public int f42611e0;

    public int f42612f0;

    public int f42613g0;

    public boolean f42614h0;

    public boolean f42615i0;

    public final org.telegram.ui.Components.iw0 f42616j0;

    public final org.telegram.ui.Components.gk0 f42617k0;

    public boolean f42618l0;
    public final re1 m0;

    public final gv0 f42619n0;

    public final ArrayList f42620o0;

    public final we1 f42621p0;

    public se1(we1 we1Var, Context context) {
        super(context, null);
        this.f42621p0 = we1Var;
        this.U = "empty";
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f42620o0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        this.f42619n0 = new gv0(this, 7);
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.Q = zk0Var;
        pe1 pe1Var = new pe1(this);
        this.S = pe1Var;
        zk0Var.setAdapter(pe1Var);
        f2.k0 k0Var = new f2.k0();
        this.R = k0Var;
        zk0Var.setLayoutManager(k0Var);
        zk0Var.setOnItemClickListener(new b21(this, 9));
        zk0Var.setOnScrollListener(new ib1(this, 2));
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
        h00Var.setViewType(7);
        h00Var.f28887w = false;
        h00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(context, h00Var, 1, null);
        this.f42616j0 = iw0Var;
        iw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        iw0Var.f29506e.setVisibility(8);
        iw0Var.setVisibility(8);
        iw0Var.addView(h00Var, 0);
        iw0Var.setAnimateLayoutChange(true);
        zk0Var.setEmptyView(iw0Var);
        zk0Var.U1 = true;
        zk0Var.V1 = 0;
        frameLayout.addView(iw0Var);
        frameLayout.addView(zk0Var);
        L();
        org.telegram.ui.Components.gk0 gk0Var = new org.telegram.ui.Components.gk0(zk0Var, true);
        this.f42617k0 = gk0Var;
        zk0Var.setItemsEnterAnimator(gk0Var);
        re1 re1Var = new re1(this);
        this.m0 = re1Var;
        setAdapter(re1Var);
    }

    public final void J(String str) {
        if (this.f42618l0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        we1 we1Var = this.f42621p0;
        tL_messages_search.peer = we1Var.getMessagesController().getInputPeer(-we1Var.f43719a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f22489q = str;
        ArrayList arrayList = this.W;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) i0.a.i(1, arrayList)).getId();
        }
        this.f42618l0 = true;
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) we1Var).currentAccount).sendRequest(tL_messages_search, new rc1(1, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.U = str;
        FrameLayout frameLayout = this.P;
        we1 we1Var = this.f42621p0;
        int i11 = 0;
        if (view != frameLayout) {
            if (view instanceof i10) {
                i10 i10Var = (i10) view;
                i10Var.f38938c.b(0, false);
                i10Var.h(-we1Var.f43719a, 0L, 0L, 0L, pf.g0.Y2[((oe1) this.m0.f41913a.get(i10)).f41073b], false, str, z10);
                return;
            }
            if (view instanceof org.telegram.ui.Components.jm0) {
                org.telegram.ui.Components.jm0 jm0Var = (org.telegram.ui.Components.jm0) view;
                jm0Var.f29727a.b(0, false);
                jm0Var.G = str;
                jm0Var.d(false);
                return;
            }
            return;
        }
        m21 m21Var = this.T;
        if (m21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m21Var);
            this.T = null;
        }
        this.f42618l0 = false;
        this.f42615i0 = false;
        ArrayList arrayList = this.V;
        arrayList.clear();
        this.W.clear();
        L();
        if (!TextUtils.isEmpty(str)) {
            L();
            this.f42614h0 = true;
            this.f42616j0.e(true, true);
            m21 m21Var2 = new m21(19, this, str);
            this.T = m21Var2;
            AndroidUtilities.runOnUIThread(m21Var2, 200L);
            return;
        }
        this.f42614h0 = false;
        arrayList.clear();
        while (true) {
            ArrayList arrayList2 = we1Var.f43722b;
            if (i11 >= arrayList2.size()) {
                L();
                return;
            }
            if (((ne1) arrayList2.get(i11)).f40813c != null) {
                arrayList.add(((ne1) arrayList2.get(i11)).f40813c);
                ((ne1) arrayList2.get(i11)).f40813c.searchQuery = null;
            }
            i11++;
        }
    }

    public final void L() {
        this.f42607a0 = -1;
        this.f42608b0 = -1;
        this.f42609c0 = -1;
        this.f42610d0 = -1;
        this.f42611e0 = -1;
        this.f42612f0 = -1;
        this.f42613g0 = 0;
        ArrayList arrayList = this.V;
        if (!arrayList.isEmpty()) {
            int i10 = this.f42613g0;
            int i11 = i10 + 1;
            this.f42613g0 = i11;
            this.f42607a0 = i10;
            this.f42608b0 = i11;
            int size = arrayList.size() + i11;
            this.f42613g0 = size;
            this.f42609c0 = size;
        }
        ArrayList arrayList2 = this.W;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f42613g0;
            int i13 = i12 + 1;
            this.f42613g0 = i13;
            this.f42610d0 = i12;
            this.f42611e0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f42613g0 = size2;
            this.f42612f0 = size2;
        }
        this.S.l();
    }

    @Override
    public final void a() {
        ((org.telegram.ui.ActionBar.n2) this.f42621p0).actionBar.O(null, null);
    }

    @Override
    public final boolean b(a10 a10Var) {
        if (a10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f42620o0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == a10Var.f36333b && messageObject.getDialogId() == a10Var.f36332a) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final void c(MessageObject messageObject) {
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        we1 we1Var = this.f42621p0;
        if (zIsEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (DialogObject.isUserDialog(dialogId)) {
            bundle.putLong("user_id", dialogId);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(((org.telegram.ui.ActionBar.n2) we1Var).currentAccount).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        we1Var.presentFragment(new rn(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        ArrayList arrayList = this.f42620o0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) this.f42621p0).actionBar.s();
        }
    }

    @Override
    public final boolean f() {
        return ((org.telegram.ui.ActionBar.n2) this.f42621p0).actionBar.t();
    }
}
