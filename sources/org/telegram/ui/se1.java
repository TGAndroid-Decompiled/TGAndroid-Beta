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
public final class se1 extends org.telegram.ui.Components.l91 implements h10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.lm0 U;
    public final s4.b0 V;
    public final pe1 W;
    public n71 f41366a0;
    public String f41367b0;
    public final ArrayList f41368c0;
    public final ArrayList f41369d0;
    public int f41370e0;
    public int f41371f0;
    public int f41372g0;
    public int f41373h0;
    public int f41374i0;
    public int f41375j0;
    public int f41376k0;
    public boolean f41377l0;
    public boolean m0;
    public final org.telegram.ui.Components.vx0 f41378n0;
    public final org.telegram.ui.Components.ql0 f41379o0;
    public boolean f41380p0;
    public final re1 f41381q0;
    public final qv0 f41382r0;
    public final ArrayList f41383s0;
    public final xe1 f41384t0;

    public se1(xe1 xe1Var, Context context) {
        super(context, null);
        this.f41384t0 = xe1Var;
        this.f41367b0 = "empty";
        this.f41368c0 = new ArrayList();
        this.f41369d0 = new ArrayList();
        this.f41383s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f41382r0 = new qv0(this, 6);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.U = lm0Var;
        pe1 pe1Var = new pe1(this);
        this.W = pe1Var;
        lm0Var.setAdapter(pe1Var);
        s4.b0 b0Var = new s4.b0();
        this.V = b0Var;
        lm0Var.setLayoutManager(b0Var);
        lm0Var.setOnItemClickListener(new i11(this, 11));
        lm0Var.setOnScrollListener(new gd1(this, 1));
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(context, null);
        z00Var.setViewType(7);
        z00Var.f33104w = false;
        z00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(context, z00Var, 1, null);
        this.f41378n0 = vx0Var;
        vx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        vx0Var.e.setVisibility(8);
        vx0Var.setVisibility(8);
        vx0Var.addView(z00Var, 0);
        vx0Var.setAnimateLayoutChange(true);
        lm0Var.setEmptyView(vx0Var);
        lm0Var.W1 = true;
        lm0Var.X1 = 0;
        frameLayout.addView(vx0Var);
        frameLayout.addView(lm0Var);
        L();
        org.telegram.ui.Components.ql0 ql0Var = new org.telegram.ui.Components.ql0(lm0Var, true);
        this.f41379o0 = ql0Var;
        lm0Var.setItemsEnterAnimator(ql0Var);
        re1 re1Var = new re1(this);
        this.f41381q0 = re1Var;
        setAdapter(re1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f41380p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        xe1 xe1Var = this.f41384t0;
        tL_messages_search.peer = xe1Var.getMessagesController().getInputPeer(-xe1Var.f43545a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20453q = str;
        ArrayList arrayList = this.f41369d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) i2.o1.i(1, arrayList)).getId();
        }
        this.f41380p0 = true;
        i10 = ((org.telegram.ui.ActionBar.o2) xe1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new p71(4, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f41367b0 = str;
        FrameLayout frameLayout = this.T;
        xe1 xe1Var = this.f41384t0;
        int i11 = 0;
        if (view == frameLayout) {
            n71 n71Var = this.f41366a0;
            if (n71Var != null) {
                AndroidUtilities.cancelRunOnUIThread(n71Var);
                this.f41366a0 = null;
            }
            this.f41380p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f41368c0;
            arrayList.clear();
            this.f41369d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f41377l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = xe1Var.f43548b;
                    if (i11 < arrayList2.size()) {
                        if (((ne1) arrayList2.get(i11)).f39813c != null) {
                            arrayList.add(((ne1) arrayList2.get(i11)).f39813c);
                            ((ne1) arrayList2.get(i11)).f39813c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f41377l0 = true;
                this.f41378n0.e(true, true);
                n71 n71Var2 = new n71(13, this, str);
                this.f41366a0 = n71Var2;
                AndroidUtilities.runOnUIThread(n71Var2, 200L);
            }
        } else if (view instanceof i10) {
            i10 i10Var = (i10) view;
            i10Var.f38097c.b(0, false);
            i10Var.h(-xe1Var.f43545a, 0L, 0L, 0L, hg.q0.f12042d3[((oe1) this.f41381q0.f41140a.get(i10)).f40170b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.wn0) {
            org.telegram.ui.Components.wn0 wn0Var = (org.telegram.ui.Components.wn0) view;
            wn0Var.f32302a.b(0, false);
            wn0Var.K = str;
            wn0Var.d(false);
        }
    }

    public final void L() {
        this.f41370e0 = -1;
        this.f41371f0 = -1;
        this.f41372g0 = -1;
        this.f41373h0 = -1;
        this.f41374i0 = -1;
        this.f41375j0 = -1;
        this.f41376k0 = 0;
        ArrayList arrayList = this.f41368c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f41376k0;
            int i11 = i10 + 1;
            this.f41376k0 = i11;
            this.f41370e0 = i10;
            this.f41371f0 = i11;
            int size = arrayList.size() + i11;
            this.f41376k0 = size;
            this.f41372g0 = size;
        }
        ArrayList arrayList2 = this.f41369d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f41376k0;
            int i13 = i12 + 1;
            this.f41376k0 = i13;
            this.f41373h0 = i12;
            this.f41374i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f41376k0 = size2;
            this.f41375j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.f41384t0).actionBar;
        kVar.N(null, null);
    }

    @Override
    public final boolean b(a10 a10Var) {
        if (a10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f41383s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == a10Var.f35548b && messageObject.getDialogId() == a10Var.f35547a) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final void c(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        xe1 xe1Var = this.f41384t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.o2) xe1Var).currentAccount;
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-dialogId));
            if (chat != null && chat.migrated_to != null) {
                bundle.putLong("migrated_to", dialogId);
                dialogId = -chat.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -dialogId);
        } else {
            bundle.putLong("user_id", dialogId);
        }
        bundle.putInt("message_id", messageObject.getId());
        xe1Var.presentFragment(new sn(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f41383s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.o2) this.f41384t0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.f41384t0).actionBar;
        return kVar.s();
    }
}
