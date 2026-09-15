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
public final class zf1 extends org.telegram.ui.Components.i81 implements w10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.ll0 U;
    public final s4.c0 V;
    public final wf1 W;
    public nb1 f40189a0;
    public String f40190b0;
    public final ArrayList f40191c0;
    public final ArrayList f40192d0;
    public int f40193e0;
    public int f40194f0;
    public int f40195g0;
    public int f40196h0;
    public int f40197i0;
    public int f40198j0;
    public int f40199k0;
    public boolean f40200l0;
    public boolean m0;
    public final org.telegram.ui.Components.yw0 f40201n0;
    public final org.telegram.ui.Components.qk0 f40202o0;
    public boolean f40203p0;
    public final yf1 f40204q0;
    public final jw0 f40205r0;
    public final ArrayList f40206s0;
    public final dg1 f40207t0;

    public zf1(dg1 dg1Var, Context context) {
        super(context, null);
        this.f40207t0 = dg1Var;
        this.f40190b0 = "empty";
        this.f40191c0 = new ArrayList();
        this.f40192d0 = new ArrayList();
        this.f40206s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f40205r0 = new jw0(this, 7);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.U = ll0Var;
        wf1 wf1Var = new wf1(this);
        this.W = wf1Var;
        ll0Var.setAdapter(wf1Var);
        s4.c0 c0Var = new s4.c0();
        this.V = c0Var;
        ll0Var.setLayoutManager(c0Var);
        ll0Var.setOnItemClickListener(new z21(this, 10));
        ll0Var.setOnScrollListener(new ne1(this, 1));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(7);
        t00Var.f28018w = false;
        t00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.yw0 yw0Var = new org.telegram.ui.Components.yw0(context, t00Var, 1, null);
        this.f40201n0 = yw0Var;
        yw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        yw0Var.e.setVisibility(8);
        yw0Var.setVisibility(8);
        yw0Var.addView(t00Var, 0);
        yw0Var.setAnimateLayoutChange(true);
        ll0Var.setEmptyView(yw0Var);
        ll0Var.Y1 = true;
        ll0Var.Z1 = 0;
        frameLayout.addView(yw0Var);
        frameLayout.addView(ll0Var);
        L();
        org.telegram.ui.Components.qk0 qk0Var = new org.telegram.ui.Components.qk0(ll0Var, true);
        this.f40202o0 = qk0Var;
        ll0Var.setItemsEnterAnimator(qk0Var);
        yf1 yf1Var = new yf1(this);
        this.f40204q0 = yf1Var;
        setAdapter(yf1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f40203p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        dg1 dg1Var = this.f40207t0;
        tL_messages_search.peer = dg1Var.getMessagesController().getInputPeer(-dg1Var.f33012a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f18221q = str;
        ArrayList arrayList = this.f40192d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.h(1, arrayList)).getId();
        }
        this.f40203p0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new bc0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f40190b0 = str;
        FrameLayout frameLayout = this.T;
        dg1 dg1Var = this.f40207t0;
        int i11 = 0;
        if (view == frameLayout) {
            nb1 nb1Var = this.f40189a0;
            if (nb1Var != null) {
                AndroidUtilities.cancelRunOnUIThread(nb1Var);
                this.f40189a0 = null;
            }
            this.f40203p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f40191c0;
            arrayList.clear();
            this.f40192d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f40200l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = dg1Var.f33015b;
                    if (i11 < arrayList2.size()) {
                        if (((uf1) arrayList2.get(i11)).f37995c != null) {
                            arrayList.add(((uf1) arrayList2.get(i11)).f37995c);
                            ((uf1) arrayList2.get(i11)).f37995c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f40200l0 = true;
                this.f40201n0.e(true, true);
                nb1 nb1Var2 = new nb1(7, this, str);
                this.f40189a0 = nb1Var2;
                AndroidUtilities.runOnUIThread(nb1Var2, 200L);
            }
        } else if (view instanceof x10) {
            x10 x10Var = (x10) view;
            x10Var.f39442c.b(0, false);
            x10Var.h(-dg1Var.f33012a, 0L, 0L, 0L, gg.s0.f9910c3[((vf1) this.f40204q0.f39867a.get(i10)).f38593b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.vm0) {
            org.telegram.ui.Components.vm0 vm0Var = (org.telegram.ui.Components.vm0) view;
            vm0Var.f28832a.b(0, false);
            vm0Var.K = str;
            vm0Var.d(false);
        }
    }

    public final void L() {
        this.f40193e0 = -1;
        this.f40194f0 = -1;
        this.f40195g0 = -1;
        this.f40196h0 = -1;
        this.f40197i0 = -1;
        this.f40198j0 = -1;
        this.f40199k0 = 0;
        ArrayList arrayList = this.f40191c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f40199k0;
            int i11 = i10 + 1;
            this.f40199k0 = i11;
            this.f40193e0 = i10;
            this.f40194f0 = i11;
            int size = arrayList.size() + i11;
            this.f40199k0 = size;
            this.f40195g0 = size;
        }
        ArrayList arrayList2 = this.f40192d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f40199k0;
            int i13 = i12 + 1;
            this.f40199k0 = i13;
            this.f40196h0 = i12;
            this.f40197i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f40199k0 = size2;
            this.f40198j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f40207t0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean c(p10 p10Var) {
        if (p10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f40206s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == p10Var.f36389b && messageObject.getDialogId() == p10Var.f36388a) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final void d(MessageObject messageObject) {
        int i10;
        Bundle bundle = new Bundle();
        long dialogId = messageObject.getDialogId();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
        dg1 dg1Var = this.f40207t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
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
        dg1Var.presentFragment(new bo(bundle));
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f40206s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.f40207t0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f40207t0).actionBar;
        return kVar.s();
    }
}
