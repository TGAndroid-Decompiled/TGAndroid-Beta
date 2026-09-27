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
public final class sf1 extends org.telegram.ui.Components.y81 implements v10 {
    public final FrameLayout U;
    public final org.telegram.ui.Components.yl0 V;
    public final s4.c0 W;
    public final pf1 f37425a0;
    public fb1 f37426b0;
    public String f37427c0;
    public final ArrayList f37428d0;
    public final ArrayList f37429e0;
    public int f37430f0;
    public int f37431g0;
    public int f37432h0;
    public int f37433i0;
    public int f37434j0;
    public int f37435k0;
    public int f37436l0;
    public boolean m0;
    public boolean f37437n0;
    public final org.telegram.ui.Components.kx0 f37438o0;
    public final org.telegram.ui.Components.dl0 f37439p0;
    public boolean f37440q0;
    public final rf1 f37441r0;
    public final dw0 f37442s0;
    public final ArrayList f37443t0;
    public final wf1 f37444u0;

    public sf1(wf1 wf1Var, Context context) {
        super(context, null);
        this.f37444u0 = wf1Var;
        this.f37427c0 = "empty";
        this.f37428d0 = new ArrayList();
        this.f37429e0 = new ArrayList();
        this.f37443t0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        this.f37442s0 = new dw0(this, 7);
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.V = yl0Var;
        pf1 pf1Var = new pf1(this);
        this.f37425a0 = pf1Var;
        yl0Var.setAdapter(pf1Var);
        s4.c0 c0Var = new s4.c0();
        this.W = c0Var;
        yl0Var.setLayoutManager(c0Var);
        yl0Var.setOnItemClickListener(new t21(this, 11));
        yl0Var.setOnScrollListener(new lc1(this, 2));
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
        v00Var.setViewType(7);
        v00Var.f28982w = false;
        v00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.kx0 kx0Var = new org.telegram.ui.Components.kx0(context, v00Var, 1, null);
        this.f37438o0 = kx0Var;
        kx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        kx0Var.e.setVisibility(8);
        kx0Var.setVisibility(8);
        kx0Var.addView(v00Var, 0);
        kx0Var.setAnimateLayoutChange(true);
        yl0Var.setEmptyView(kx0Var);
        yl0Var.Y1 = true;
        yl0Var.Z1 = 0;
        frameLayout.addView(kx0Var);
        frameLayout.addView(yl0Var);
        M();
        org.telegram.ui.Components.dl0 dl0Var = new org.telegram.ui.Components.dl0(yl0Var, true);
        this.f37439p0 = dl0Var;
        yl0Var.setItemsEnterAnimator(dl0Var);
        rf1 rf1Var = new rf1(this);
        this.f37441r0 = rf1Var;
        setAdapter(rf1Var);
    }

    public final void K(String str) {
        int i10;
        if (this.f37440q0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        wf1 wf1Var = this.f37444u0;
        tL_messages_search.peer = wf1Var.getMessagesController().getInputPeer(-wf1Var.f39287a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f18438q = str;
        ArrayList arrayList = this.f37429e0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.k0.g(1, arrayList)).getId();
        }
        this.f37440q0 = true;
        i10 = ((org.telegram.ui.ActionBar.o2) wf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new yb0(27, this, str));
    }

    public final void L(View view, int i10, String str, boolean z10) {
        this.f37427c0 = str;
        FrameLayout frameLayout = this.U;
        wf1 wf1Var = this.f37444u0;
        int i11 = 0;
        if (view == frameLayout) {
            fb1 fb1Var = this.f37426b0;
            if (fb1Var != null) {
                AndroidUtilities.cancelRunOnUIThread(fb1Var);
                this.f37426b0 = null;
            }
            this.f37440q0 = false;
            this.f37437n0 = false;
            ArrayList arrayList = this.f37428d0;
            arrayList.clear();
            this.f37429e0.clear();
            M();
            if (TextUtils.isEmpty(str)) {
                this.m0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = wf1Var.f39290b;
                    if (i11 < arrayList2.size()) {
                        if (((nf1) arrayList2.get(i11)).f35983c != null) {
                            arrayList.add(((nf1) arrayList2.get(i11)).f35983c);
                            ((nf1) arrayList2.get(i11)).f35983c.searchQuery = null;
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
                this.f37438o0.e(true, true);
                fb1 fb1Var2 = new fb1(8, this, str);
                this.f37426b0 = fb1Var2;
                AndroidUtilities.runOnUIThread(fb1Var2, 200L);
            }
        } else if (view instanceof w10) {
            w10 w10Var = (w10) view;
            w10Var.f38759c.b(0, false);
            w10Var.h(-wf1Var.f39287a, 0L, 0L, 0L, gg.s0.f9902c3[((of1) this.f37441r0.f37117a.get(i10)).f36202b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.kn0) {
            org.telegram.ui.Components.kn0 kn0Var = (org.telegram.ui.Components.kn0) view;
            kn0Var.f25797a.b(0, false);
            kn0Var.K = str;
            kn0Var.d(false);
        }
    }

    public final void M() {
        this.f37430f0 = -1;
        this.f37431g0 = -1;
        this.f37432h0 = -1;
        this.f37433i0 = -1;
        this.f37434j0 = -1;
        this.f37435k0 = -1;
        this.f37436l0 = 0;
        ArrayList arrayList = this.f37428d0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f37436l0;
            int i11 = i10 + 1;
            this.f37436l0 = i11;
            this.f37430f0 = i10;
            this.f37431g0 = i11;
            int size = arrayList.size() + i11;
            this.f37436l0 = size;
            this.f37432h0 = size;
        }
        ArrayList arrayList2 = this.f37429e0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f37436l0;
            int i13 = i12 + 1;
            this.f37436l0 = i13;
            this.f37433i0 = i12;
            this.f37434j0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f37436l0 = size2;
            this.f37435k0 = size2;
        }
        this.f37425a0.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.o2) this.f37444u0).actionBar;
        lVar.P(null, null);
    }

    @Override
    public final boolean c(o10 o10Var) {
        if (o10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f37443t0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == o10Var.f36122b && messageObject.getDialogId() == o10Var.f36121a) {
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
        wf1 wf1Var = this.f37444u0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.o2) wf1Var).currentAccount;
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
        wf1Var.presentFragment(new xn(bundle));
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        ArrayList arrayList = this.f37443t0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            lVar = ((org.telegram.ui.ActionBar.o2) this.f37444u0).actionBar;
            lVar.s();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.o2) this.f37444u0).actionBar;
        return lVar.t();
    }
}
