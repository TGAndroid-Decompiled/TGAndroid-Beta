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
public final class ye1 extends org.telegram.ui.Components.v91 implements i10 {
    public final FrameLayout V;
    public final org.telegram.ui.Components.nm0 W;
    public final s4.c0 f45983a0;
    public final ve1 f45984b0;
    public yc1 f45985c0;
    public String f45986d0;
    public final ArrayList f45987e0;
    public final ArrayList f45988f0;
    public int f45989g0;
    public int f45990h0;
    public int f45991i0;
    public int f45992j0;
    public int f45993k0;
    public int f45994l0;
    public int m0;
    public boolean f45995n0;
    public boolean f45996o0;
    public final org.telegram.ui.Components.fy0 f45997p0;
    public final org.telegram.ui.Components.rl0 f45998q0;
    public boolean f45999r0;
    public final xe1 f46000s0;
    public final wv0 f46001t0;
    public final ArrayList f46002u0;
    public final cf1 f46003v0;

    public ye1(cf1 cf1Var, Context context) {
        super(context, null);
        this.f46003v0 = cf1Var;
        this.f45986d0 = "empty";
        this.f45987e0 = new ArrayList();
        this.f45988f0 = new ArrayList();
        this.f46002u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.f46001t0 = new wv0(this, 6);
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.W = nm0Var;
        ve1 ve1Var = new ve1(this);
        this.f45984b0 = ve1Var;
        nm0Var.setAdapter(ve1Var);
        s4.c0 c0Var = new s4.c0();
        this.f45983a0 = c0Var;
        nm0Var.setLayoutManager(c0Var);
        nm0Var.setOnItemClickListener(new o11(this, 11));
        nm0Var.setOnScrollListener(new z81(this, 3));
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context, null);
        c10Var.setViewType(7);
        c10Var.f27026w = false;
        c10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(context, c10Var, 1, null);
        this.f45997p0 = fy0Var;
        fy0Var.d.setText(LocaleController.getString(R.string.NoResult));
        fy0Var.e.setVisibility(8);
        fy0Var.setVisibility(8);
        fy0Var.addView(c10Var, 0);
        fy0Var.setAnimateLayoutChange(true);
        nm0Var.setEmptyView(fy0Var);
        nm0Var.W1 = true;
        nm0Var.X1 = 0;
        frameLayout.addView(fy0Var);
        frameLayout.addView(nm0Var);
        N();
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(nm0Var, true);
        this.f45998q0 = rl0Var;
        nm0Var.setItemsEnterAnimator(rl0Var);
        xe1 xe1Var = new xe1(this);
        this.f46000s0 = xe1Var;
        setAdapter(xe1Var);
    }

    public final void L(String str) {
        int i10;
        if (this.f45999r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        cf1 cf1Var = this.f46003v0;
        tL_messages_search.peer = cf1Var.getMessagesController().getInputPeer(-cf1Var.f38288a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f22139q = str;
        ArrayList arrayList = this.f45988f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) ic.a.g(1, arrayList)).getId();
        }
        this.f45999r0 = true;
        i10 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new n71(6, this, str));
    }

    public final void M(View view, int i10, String str, boolean z10) {
        this.f45986d0 = str;
        FrameLayout frameLayout = this.V;
        cf1 cf1Var = this.f46003v0;
        int i11 = 0;
        if (view == frameLayout) {
            yc1 yc1Var = this.f45985c0;
            if (yc1Var != null) {
                AndroidUtilities.cancelRunOnUIThread(yc1Var);
                this.f45985c0 = null;
            }
            this.f45999r0 = false;
            this.f45996o0 = false;
            ArrayList arrayList = this.f45987e0;
            arrayList.clear();
            this.f45988f0.clear();
            N();
            if (TextUtils.isEmpty(str)) {
                this.f45995n0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = cf1Var.f38291b;
                    if (i11 < arrayList2.size()) {
                        if (((te1) arrayList2.get(i11)).f43620c != null) {
                            arrayList.add(((te1) arrayList2.get(i11)).f43620c);
                            ((te1) arrayList2.get(i11)).f43620c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        N();
                        return;
                    }
                }
            } else {
                N();
                this.f45995n0 = true;
                this.f45997p0.e(true, true);
                yc1 yc1Var2 = new yc1(4, this, str);
                this.f45985c0 = yc1Var2;
                AndroidUtilities.runOnUIThread(yc1Var2, 200L);
            }
        } else if (view instanceof j10) {
            j10 j10Var = (j10) view;
            j10Var.f40324c.b(0, false);
            j10Var.h(-cf1Var.f38288a, 0L, 0L, 0L, ig.r0.f14212k3[((ue1) this.f46000s0.f45673a.get(i10)).f44009b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.do0) {
            org.telegram.ui.Components.do0 do0Var = (org.telegram.ui.Components.do0) view;
            do0Var.f27500a.b(0, false);
            do0Var.K = str;
            do0Var.d(false);
        }
    }

    public final void N() {
        this.f45989g0 = -1;
        this.f45990h0 = -1;
        this.f45991i0 = -1;
        this.f45992j0 = -1;
        this.f45993k0 = -1;
        this.f45994l0 = -1;
        this.m0 = 0;
        ArrayList arrayList = this.f45987e0;
        if (!arrayList.isEmpty()) {
            int i10 = this.m0;
            int i11 = i10 + 1;
            this.m0 = i11;
            this.f45989g0 = i10;
            this.f45990h0 = i11;
            int size = arrayList.size() + i11;
            this.m0 = size;
            this.f45991i0 = size;
        }
        ArrayList arrayList2 = this.f45988f0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.m0;
            int i13 = i12 + 1;
            this.m0 = i13;
            this.f45992j0 = i12;
            this.f45993k0 = i13;
            int size2 = arrayList2.size() + i13;
            this.m0 = size2;
            this.f45994l0 = size2;
        }
        this.f45984b0.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.r2) this.f46003v0).actionBar;
        kVar.K(null, null);
    }

    @Override
    public final boolean c(b10 b10Var) {
        if (b10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f46002u0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == b10Var.f37863b && messageObject.getDialogId() == b10Var.f37862a) {
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
        cf1 cf1Var = this.f46003v0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.r2) cf1Var).currentAccount;
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
        cf1Var.presentFragment(new wn(bundle));
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f46002u0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.r2) this.f46003v0).actionBar;
            kVar.p();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.r2) this.f46003v0).actionBar;
        return kVar.q();
    }
}
