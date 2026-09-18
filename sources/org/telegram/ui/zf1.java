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
public final class zf1 extends org.telegram.ui.Components.x81 implements w10 {
    public final FrameLayout U;
    public final org.telegram.ui.Components.wl0 V;
    public final s4.c0 W;
    public final wf1 f40114a0;
    public x81 f40115b0;
    public String f40116c0;
    public final ArrayList f40117d0;
    public final ArrayList f40118e0;
    public int f40119f0;
    public int f40120g0;
    public int f40121h0;
    public int f40122i0;
    public int f40123j0;
    public int f40124k0;
    public int f40125l0;
    public boolean m0;
    public boolean f40126n0;
    public final org.telegram.ui.Components.kx0 f40127o0;
    public final org.telegram.ui.Components.bl0 f40128p0;
    public boolean f40129q0;
    public final yf1 f40130r0;
    public final jw0 f40131s0;
    public final ArrayList f40132t0;
    public final dg1 f40133u0;

    public zf1(dg1 dg1Var, Context context) {
        super(context, null);
        this.f40133u0 = dg1Var;
        this.f40116c0 = "empty";
        this.f40117d0 = new ArrayList();
        this.f40118e0 = new ArrayList();
        this.f40132t0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        this.f40131s0 = new jw0(this, 7);
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.V = wl0Var;
        wf1 wf1Var = new wf1(this);
        this.f40114a0 = wf1Var;
        wl0Var.setAdapter(wf1Var);
        s4.c0 c0Var = new s4.c0();
        this.W = c0Var;
        wl0Var.setLayoutManager(c0Var);
        wl0Var.setOnItemClickListener(new z21(this, 10));
        wl0Var.setOnScrollListener(new ne1(this, 1));
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(7);
        t00Var.f28272w = false;
        t00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.kx0 kx0Var = new org.telegram.ui.Components.kx0(context, t00Var, 1, null);
        this.f40127o0 = kx0Var;
        kx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        kx0Var.e.setVisibility(8);
        kx0Var.setVisibility(8);
        kx0Var.addView(t00Var, 0);
        kx0Var.setAnimateLayoutChange(true);
        wl0Var.setEmptyView(kx0Var);
        wl0Var.Y1 = true;
        wl0Var.Z1 = 0;
        frameLayout.addView(kx0Var);
        frameLayout.addView(wl0Var);
        M();
        org.telegram.ui.Components.bl0 bl0Var = new org.telegram.ui.Components.bl0(wl0Var, true);
        this.f40128p0 = bl0Var;
        wl0Var.setItemsEnterAnimator(bl0Var);
        yf1 yf1Var = new yf1(this);
        this.f40130r0 = yf1Var;
        setAdapter(yf1Var);
    }

    public final void K(String str) {
        int i10;
        if (this.f40129q0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        dg1 dg1Var = this.f40133u0;
        tL_messages_search.peer = dg1Var.getMessagesController().getInputPeer(-dg1Var.f32970a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f18405q = str;
        ArrayList arrayList = this.f40118e0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.g(1, arrayList)).getId();
        }
        this.f40129q0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) dg1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new cc0(27, this, str));
    }

    public final void L(View view, int i10, String str, boolean z10) {
        this.f40116c0 = str;
        FrameLayout frameLayout = this.U;
        dg1 dg1Var = this.f40133u0;
        int i11 = 0;
        if (view == frameLayout) {
            x81 x81Var = this.f40115b0;
            if (x81Var != null) {
                AndroidUtilities.cancelRunOnUIThread(x81Var);
                this.f40115b0 = null;
            }
            this.f40129q0 = false;
            this.f40126n0 = false;
            ArrayList arrayList = this.f40117d0;
            arrayList.clear();
            this.f40118e0.clear();
            M();
            if (TextUtils.isEmpty(str)) {
                this.m0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = dg1Var.f32973b;
                    if (i11 < arrayList2.size()) {
                        if (((uf1) arrayList2.get(i11)).f37987c != null) {
                            arrayList.add(((uf1) arrayList2.get(i11)).f37987c);
                            ((uf1) arrayList2.get(i11)).f37987c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        M();
                        return;
                    }
                }
            } else {
                M();
                this.m0 = true;
                this.f40127o0.e(true, true);
                x81 x81Var2 = new x81(11, this, str);
                this.f40115b0 = x81Var2;
                AndroidUtilities.runOnUIThread(x81Var2, 200L);
            }
        } else if (view instanceof x10) {
            x10 x10Var = (x10) view;
            x10Var.f39306c.b(0, false);
            x10Var.h(-dg1Var.f32970a, 0L, 0L, 0L, gg.s0.f9914c3[((vf1) this.f40130r0.f39815a.get(i10)).f38547b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.jn0) {
            org.telegram.ui.Components.jn0 jn0Var = (org.telegram.ui.Components.jn0) view;
            jn0Var.f25379a.b(0, false);
            jn0Var.K = str;
            jn0Var.d(false);
        }
    }

    public final void M() {
        this.f40119f0 = -1;
        this.f40120g0 = -1;
        this.f40121h0 = -1;
        this.f40122i0 = -1;
        this.f40123j0 = -1;
        this.f40124k0 = -1;
        this.f40125l0 = 0;
        ArrayList arrayList = this.f40117d0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f40125l0;
            int i11 = i10 + 1;
            this.f40125l0 = i11;
            this.f40119f0 = i10;
            this.f40120g0 = i11;
            int size = arrayList.size() + i11;
            this.f40125l0 = size;
            this.f40121h0 = size;
        }
        ArrayList arrayList2 = this.f40118e0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f40125l0;
            int i13 = i12 + 1;
            this.f40125l0 = i13;
            this.f40122i0 = i12;
            this.f40123j0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f40125l0 = size2;
            this.f40124k0 = size2;
        }
        this.f40114a0.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f40133u0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean c(p10 p10Var) {
        if (p10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f40132t0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == p10Var.f36296b && messageObject.getDialogId() == p10Var.f36295a) {
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
        dg1 dg1Var = this.f40133u0;
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
        dg1Var.presentFragment(new zn(bundle));
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f40132t0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.f40133u0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f40133u0).actionBar;
        return kVar.s();
    }
}
