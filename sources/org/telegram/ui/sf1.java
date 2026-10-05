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
public final class sf1 extends org.telegram.ui.Components.h91 implements w10 {
    public final FrameLayout V;
    public final org.telegram.ui.Components.zl0 W;
    public final s4.c0 f40469a0;
    public final pf1 f40470b0;
    public e91 f40471c0;
    public String f40472d0;
    public final ArrayList f40473e0;
    public final ArrayList f40474f0;
    public int f40475g0;
    public int f40476h0;
    public int f40477i0;
    public int f40478j0;
    public int f40479k0;
    public int f40480l0;
    public int m0;
    public boolean f40481n0;
    public boolean f40482o0;
    public final org.telegram.ui.Components.ux0 f40483p0;
    public final org.telegram.ui.Components.dl0 f40484q0;
    public boolean f40485r0;
    public final rf1 f40486s0;
    public final dw0 f40487t0;
    public final ArrayList f40488u0;
    public final wf1 f40489v0;

    public sf1(wf1 wf1Var, Context context) {
        super(context, null);
        this.f40489v0 = wf1Var;
        this.f40472d0 = "empty";
        this.f40473e0 = new ArrayList();
        this.f40474f0 = new ArrayList();
        this.f40488u0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.V = frameLayout;
        this.f40487t0 = new dw0(this, 7);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.W = zl0Var;
        pf1 pf1Var = new pf1(this);
        this.f40470b0 = pf1Var;
        zl0Var.setAdapter(pf1Var);
        s4.c0 c0Var = new s4.c0();
        this.f40469a0 = c0Var;
        zl0Var.setLayoutManager(c0Var);
        zl0Var.setOnItemClickListener(new t21(this, 11));
        zl0Var.setOnScrollListener(new u91(this, 3));
        org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context, null);
        w00Var.setViewType(7);
        w00Var.f32460w = false;
        w00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(context, w00Var, 1, null);
        this.f40483p0 = ux0Var;
        ux0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ux0Var.f31551e.setVisibility(8);
        ux0Var.setVisibility(8);
        ux0Var.addView(w00Var, 0);
        ux0Var.setAnimateLayoutChange(true);
        zl0Var.setEmptyView(ux0Var);
        zl0Var.Y1 = true;
        zl0Var.Z1 = 0;
        frameLayout.addView(ux0Var);
        frameLayout.addView(zl0Var);
        N();
        org.telegram.ui.Components.dl0 dl0Var = new org.telegram.ui.Components.dl0(zl0Var, true);
        this.f40484q0 = dl0Var;
        zl0Var.setItemsEnterAnimator(dl0Var);
        rf1 rf1Var = new rf1(this);
        this.f40486s0 = rf1Var;
        setAdapter(rf1Var);
    }

    public final void L(String str) {
        int i10;
        if (this.f40485r0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        wf1 wf1Var = this.f40489v0;
        tL_messages_search.peer = wf1Var.getMessagesController().getInputPeer(-wf1Var.f42467a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20156q = str;
        ArrayList arrayList = this.f40474f0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        this.f40485r0 = true;
        i10 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new zb0(27, this, str));
    }

    public final void M(View view, int i10, String str, boolean z10) {
        this.f40472d0 = str;
        FrameLayout frameLayout = this.V;
        wf1 wf1Var = this.f40489v0;
        int i11 = 0;
        if (view == frameLayout) {
            e91 e91Var = this.f40471c0;
            if (e91Var != null) {
                AndroidUtilities.cancelRunOnUIThread(e91Var);
                this.f40471c0 = null;
            }
            this.f40485r0 = false;
            this.f40482o0 = false;
            ArrayList arrayList = this.f40473e0;
            arrayList.clear();
            this.f40474f0.clear();
            N();
            if (TextUtils.isEmpty(str)) {
                this.f40481n0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = wf1Var.f42470b;
                    if (i11 < arrayList2.size()) {
                        if (((nf1) arrayList2.get(i11)).f38956c != null) {
                            arrayList.add(((nf1) arrayList2.get(i11)).f38956c);
                            ((nf1) arrayList2.get(i11)).f38956c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        N();
                        return;
                    }
                }
            } else {
                N();
                this.f40481n0 = true;
                this.f40483p0.e(true, true);
                e91 e91Var2 = new e91(10, this, str);
                this.f40471c0 = e91Var2;
                AndroidUtilities.runOnUIThread(e91Var2, 200L);
            }
        } else if (view instanceof x10) {
            x10 x10Var = (x10) view;
            x10Var.f42759c.b(0, false);
            x10Var.h(-wf1Var.f42467a, 0L, 0L, 0L, gg.s0.j3[((of1) this.f40486s0.f40091a.get(i10)).f39193b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.on0) {
            org.telegram.ui.Components.on0 on0Var = (org.telegram.ui.Components.on0) view;
            on0Var.f29512a.b(0, false);
            on0Var.K = str;
            on0Var.d(false);
        }
    }

    public final void N() {
        this.f40475g0 = -1;
        this.f40476h0 = -1;
        this.f40477i0 = -1;
        this.f40478j0 = -1;
        this.f40479k0 = -1;
        this.f40480l0 = -1;
        this.m0 = 0;
        ArrayList arrayList = this.f40473e0;
        if (!arrayList.isEmpty()) {
            int i10 = this.m0;
            int i11 = i10 + 1;
            this.m0 = i11;
            this.f40475g0 = i10;
            this.f40476h0 = i11;
            int size = arrayList.size() + i11;
            this.m0 = size;
            this.f40477i0 = size;
        }
        ArrayList arrayList2 = this.f40474f0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.m0;
            int i13 = i12 + 1;
            this.m0 = i13;
            this.f40478j0 = i12;
            this.f40479k0 = i13;
            int size2 = arrayList2.size() + i13;
            this.m0 = size2;
            this.f40480l0 = size2;
        }
        this.f40470b0.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f40489v0).actionBar;
        kVar.L(null, null);
    }

    @Override
    public final boolean c(p10 p10Var) {
        if (p10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f40488u0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == p10Var.f39327b && messageObject.getDialogId() == p10Var.f39326a) {
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
        wf1 wf1Var = this.f40489v0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.n2) wf1Var).currentAccount;
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
        wf1Var.presentFragment(new yn(bundle));
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f40488u0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.n2) this.f40489v0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.n2) this.f40489v0).actionBar;
        return kVar.s();
    }
}
