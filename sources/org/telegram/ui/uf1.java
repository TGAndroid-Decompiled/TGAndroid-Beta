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
public final class uf1 extends org.telegram.ui.Components.g91 implements w10 {
    public final FrameLayout U;
    public final org.telegram.ui.Components.zl0 V;
    public final s4.c0 W;
    public final rf1 f41169a0;
    public g91 f41170b0;
    public String f41171c0;
    public final ArrayList f41172d0;
    public final ArrayList f41173e0;
    public int f41174f0;
    public int f41175g0;
    public int f41176h0;
    public int f41177i0;
    public int f41178j0;
    public int f41179k0;
    public int f41180l0;
    public boolean m0;
    public boolean f41181n0;
    public final org.telegram.ui.Components.tx0 f41182o0;
    public final org.telegram.ui.Components.dl0 f41183p0;
    public boolean f41184q0;
    public final tf1 f41185r0;
    public final dw0 f41186s0;
    public final ArrayList f41187t0;
    public final yf1 f41188u0;

    public uf1(yf1 yf1Var, Context context) {
        super(context, null);
        this.f41188u0 = yf1Var;
        this.f41171c0 = "empty";
        this.f41172d0 = new ArrayList();
        this.f41173e0 = new ArrayList();
        this.f41187t0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        this.f41186s0 = new dw0(this, 7);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.V = zl0Var;
        rf1 rf1Var = new rf1(this);
        this.f41169a0 = rf1Var;
        zl0Var.setAdapter(rf1Var);
        s4.c0 c0Var = new s4.c0();
        this.W = c0Var;
        zl0Var.setLayoutManager(c0Var);
        zl0Var.setOnItemClickListener(new t21(this, 11));
        zl0Var.setOnScrollListener(new w91(this, 3));
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
        w00Var.setViewType(7);
        w00Var.f32416w = false;
        w00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, w00Var, 1, null);
        this.f41182o0 = tx0Var;
        tx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        tx0Var.f31194e.setVisibility(8);
        tx0Var.setVisibility(8);
        tx0Var.addView(w00Var, 0);
        tx0Var.setAnimateLayoutChange(true);
        zl0Var.setEmptyView(tx0Var);
        zl0Var.Y1 = true;
        zl0Var.Z1 = 0;
        frameLayout.addView(tx0Var);
        frameLayout.addView(zl0Var);
        N();
        org.telegram.ui.Components.dl0 dl0Var = new org.telegram.ui.Components.dl0(zl0Var, true);
        this.f41183p0 = dl0Var;
        zl0Var.setItemsEnterAnimator(dl0Var);
        tf1 tf1Var = new tf1(this);
        this.f41185r0 = tf1Var;
        setAdapter(tf1Var);
    }

    public final void L(String str) {
        int i10;
        if (this.f41184q0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        yf1 yf1Var = this.f41188u0;
        tL_messages_search.peer = yf1Var.getMessagesController().getInputPeer(-yf1Var.f43162a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20146q = str;
        ArrayList arrayList = this.f41173e0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.g(1, arrayList)).getId();
        }
        this.f41184q0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new zb0(27, this, str));
    }

    public final void M(View view, int i10, String str, boolean z10) {
        this.f41171c0 = str;
        FrameLayout frameLayout = this.U;
        yf1 yf1Var = this.f41188u0;
        int i11 = 0;
        if (view == frameLayout) {
            g91 g91Var = this.f41170b0;
            if (g91Var != null) {
                AndroidUtilities.cancelRunOnUIThread(g91Var);
                this.f41170b0 = null;
            }
            this.f41184q0 = false;
            this.f41181n0 = false;
            ArrayList arrayList = this.f41172d0;
            arrayList.clear();
            this.f41173e0.clear();
            N();
            if (TextUtils.isEmpty(str)) {
                this.m0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = yf1Var.f43165b;
                    if (i11 < arrayList2.size()) {
                        if (((pf1) arrayList2.get(i11)).f39471c != null) {
                            arrayList.add(((pf1) arrayList2.get(i11)).f39471c);
                            ((pf1) arrayList2.get(i11)).f39471c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        N();
                        return;
                    }
                }
            } else {
                N();
                this.m0 = true;
                this.f41182o0.e(true, true);
                g91 g91Var2 = new g91(10, this, str);
                this.f41170b0 = g91Var2;
                AndroidUtilities.runOnUIThread(g91Var2, 200L);
            }
        } else if (view instanceof x10) {
            x10 x10Var = (x10) view;
            x10Var.f42684c.b(0, false);
            x10Var.h(-yf1Var.f43162a, 0L, 0L, 0L, gg.s0.j3[((qf1) this.f41185r0.f40811a.get(i10)).f39715b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.on0) {
            org.telegram.ui.Components.on0 on0Var = (org.telegram.ui.Components.on0) view;
            on0Var.f29406a.b(0, false);
            on0Var.K = str;
            on0Var.d(false);
        }
    }

    public final void N() {
        this.f41174f0 = -1;
        this.f41175g0 = -1;
        this.f41176h0 = -1;
        this.f41177i0 = -1;
        this.f41178j0 = -1;
        this.f41179k0 = -1;
        this.f41180l0 = 0;
        ArrayList arrayList = this.f41172d0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f41180l0;
            int i11 = i10 + 1;
            this.f41180l0 = i11;
            this.f41174f0 = i10;
            this.f41175g0 = i11;
            int size = arrayList.size() + i11;
            this.f41180l0 = size;
            this.f41176h0 = size;
        }
        ArrayList arrayList2 = this.f41173e0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f41180l0;
            int i13 = i12 + 1;
            this.f41180l0 = i13;
            this.f41177i0 = i12;
            this.f41178j0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f41180l0 = size2;
            this.f41179k0 = size2;
        }
        this.f41169a0.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f41188u0).actionBar;
        kVar.M(null, null);
    }

    @Override
    public final boolean c(p10 p10Var) {
        if (p10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f41187t0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == p10Var.f39311b && messageObject.getDialogId() == p10Var.f39310a) {
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
        yf1 yf1Var = this.f41188u0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
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
        yf1Var.presentFragment(new yn(bundle));
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f41187t0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.f41188u0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f41188u0).actionBar;
        return kVar.s();
    }
}
