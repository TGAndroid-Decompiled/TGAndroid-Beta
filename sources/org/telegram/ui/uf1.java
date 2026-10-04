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
    public final FrameLayout V;
    public final org.telegram.ui.Components.zl0 W;
    public final s4.c0 f41176a0;
    public final rf1 f41177b0;
    public g91 f41178c0;
    public String f41179d0;
    public final ArrayList f41180e0;
    public final ArrayList f41181f0;
    public int f41182g0;
    public int f41183h0;
    public int f41184i0;
    public int f41185j0;
    public int f41186k0;
    public int f41187l0;
    public int m0;
    public boolean f41188n0;
    public boolean f41189o0;
    public final org.telegram.ui.Components.tx0 f41190p0;
    public final org.telegram.ui.Components.dl0 f41191q0;
    public boolean f41192r0;
    public final tf1 f41193s0;
    public final dw0 f41194t0;
    public final ArrayList f41195u0;
    public final yf1 f41196v0;

    public uf1(yf1 yf1Var, Context context) {
        super(context, null);
        this.f41196v0 = yf1Var;
        this.f41179d0 = "empty";
        this.f41180e0 = new ArrayList();
        this.f41181f0 = new ArrayList();
        this.f41195u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.f41194t0 = new dw0(this, 7);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.W = zl0Var;
        rf1 rf1Var = new rf1(this);
        this.f41177b0 = rf1Var;
        zl0Var.setAdapter(rf1Var);
        s4.c0 c0Var = new s4.c0();
        this.f41176a0 = c0Var;
        zl0Var.setLayoutManager(c0Var);
        zl0Var.setOnItemClickListener(new t21(this, 11));
        zl0Var.setOnScrollListener(new w91(this, 3));
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
        w00Var.setViewType(7);
        w00Var.f32423w = false;
        w00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(context, w00Var, 1, null);
        this.f41190p0 = tx0Var;
        tx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        tx0Var.f31201e.setVisibility(8);
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
        this.f41191q0 = dl0Var;
        zl0Var.setItemsEnterAnimator(dl0Var);
        tf1 tf1Var = new tf1(this);
        this.f41193s0 = tf1Var;
        setAdapter(tf1Var);
    }

    public final void L(String str) {
        int i10;
        if (this.f41192r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        yf1 yf1Var = this.f41196v0;
        tL_messages_search.peer = yf1Var.getMessagesController().getInputPeer(-yf1Var.f43170a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20151q = str;
        ArrayList arrayList = this.f41181f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        this.f41192r0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) yf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new zb0(27, this, str));
    }

    public final void M(View view, int i10, String str, boolean z10) {
        this.f41179d0 = str;
        FrameLayout frameLayout = this.V;
        yf1 yf1Var = this.f41196v0;
        int i11 = 0;
        if (view == frameLayout) {
            g91 g91Var = this.f41178c0;
            if (g91Var != null) {
                AndroidUtilities.cancelRunOnUIThread(g91Var);
                this.f41178c0 = null;
            }
            this.f41192r0 = false;
            this.f41189o0 = false;
            ArrayList arrayList = this.f41180e0;
            arrayList.clear();
            this.f41181f0.clear();
            N();
            if (TextUtils.isEmpty(str)) {
                this.f41188n0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = yf1Var.f43173b;
                    if (i11 < arrayList2.size()) {
                        if (((pf1) arrayList2.get(i11)).f39477c != null) {
                            arrayList.add(((pf1) arrayList2.get(i11)).f39477c);
                            ((pf1) arrayList2.get(i11)).f39477c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        N();
                        return;
                    }
                }
            } else {
                N();
                this.f41188n0 = true;
                this.f41190p0.e(true, true);
                g91 g91Var2 = new g91(10, this, str);
                this.f41178c0 = g91Var2;
                AndroidUtilities.runOnUIThread(g91Var2, 200L);
            }
        } else if (view instanceof x10) {
            x10 x10Var = (x10) view;
            x10Var.f42692c.b(0, false);
            x10Var.h(-yf1Var.f43170a, 0L, 0L, 0L, gg.s0.j3[((qf1) this.f41193s0.f40818a.get(i10)).f39721b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.on0) {
            org.telegram.ui.Components.on0 on0Var = (org.telegram.ui.Components.on0) view;
            on0Var.f29412a.b(0, false);
            on0Var.K = str;
            on0Var.d(false);
        }
    }

    public final void N() {
        this.f41182g0 = -1;
        this.f41183h0 = -1;
        this.f41184i0 = -1;
        this.f41185j0 = -1;
        this.f41186k0 = -1;
        this.f41187l0 = -1;
        this.m0 = 0;
        ArrayList arrayList = this.f41180e0;
        if (!arrayList.isEmpty()) {
            int i10 = this.m0;
            int i11 = i10 + 1;
            this.m0 = i11;
            this.f41182g0 = i10;
            this.f41183h0 = i11;
            int size = arrayList.size() + i11;
            this.m0 = size;
            this.f41184i0 = size;
        }
        ArrayList arrayList2 = this.f41181f0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.m0;
            int i13 = i12 + 1;
            this.m0 = i13;
            this.f41185j0 = i12;
            this.f41186k0 = i13;
            int size2 = arrayList2.size() + i13;
            this.m0 = size2;
            this.f41187l0 = size2;
        }
        this.f41177b0.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f41196v0).actionBar;
        kVar.M(null, null);
    }

    @Override
    public final boolean c(p10 p10Var) {
        if (p10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f41195u0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == p10Var.f39317b && messageObject.getDialogId() == p10Var.f39316a) {
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
        yf1 yf1Var = this.f41196v0;
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
        ArrayList arrayList = this.f41195u0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.f41196v0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f41196v0).actionBar;
        return kVar.s();
    }
}
