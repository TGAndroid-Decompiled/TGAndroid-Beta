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
public final class ve1 extends org.telegram.ui.Components.z71 implements g10 {
    public final FrameLayout P;
    public final org.telegram.ui.Components.jl0 Q;
    public final f2.j0 R;
    public final se1 S;
    public t31 T;
    public String U;
    public final ArrayList V;
    public final ArrayList W;
    public int f43560a0;
    public int f43561b0;
    public int f43562c0;
    public int f43563d0;
    public int f43564e0;
    public int f43565f0;
    public int f43566g0;
    public boolean f43567h0;
    public boolean f43568i0;
    public final org.telegram.ui.Components.qw0 f43569j0;
    public final org.telegram.ui.Components.pk0 f43570k0;
    public boolean f43571l0;
    public final ue1 m0;
    public final fv0 f43572n0;
    public final ArrayList f43573o0;
    public final ze1 f43574p0;

    public ve1(ze1 ze1Var, Context context) {
        super(context, null);
        this.f43574p0 = ze1Var;
        this.U = "empty";
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f43573o0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        this.f43572n0 = new fv0(this, 7);
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.Q = jl0Var;
        se1 se1Var = new se1(this);
        this.S = se1Var;
        jl0Var.setAdapter(se1Var);
        f2.j0 j0Var = new f2.j0();
        this.R = j0Var;
        jl0Var.setLayoutManager(j0Var);
        jl0Var.setOnItemClickListener(new d21(this, 9));
        jl0Var.setOnScrollListener(new lb1(this, 2));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
        p00Var.setViewType(7);
        p00Var.f31529w = false;
        p00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(context, p00Var, 1, null);
        this.f43569j0 = qw0Var;
        qw0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qw0Var.f32122e.setVisibility(8);
        qw0Var.setVisibility(8);
        qw0Var.addView(p00Var, 0);
        qw0Var.setAnimateLayoutChange(true);
        jl0Var.setEmptyView(qw0Var);
        jl0Var.U1 = true;
        jl0Var.V1 = 0;
        frameLayout.addView(qw0Var);
        frameLayout.addView(jl0Var);
        L();
        org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0(jl0Var, true);
        this.f43570k0 = pk0Var;
        jl0Var.setItemsEnterAnimator(pk0Var);
        ue1 ue1Var = new ue1(this);
        this.m0 = ue1Var;
        setAdapter(ue1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f43571l0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        ze1 ze1Var = this.f43574p0;
        tL_messages_search.peer = ze1Var.getMessagesController().getInputPeer(-ze1Var.f45155a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f22501q = str;
        ArrayList arrayList = this.W;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) j7.l1.i(1, arrayList)).getId();
        }
        this.f43571l0 = true;
        i10 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new qe1(0, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.U = str;
        FrameLayout frameLayout = this.P;
        ze1 ze1Var = this.f43574p0;
        int i11 = 0;
        if (view == frameLayout) {
            t31 t31Var = this.T;
            if (t31Var != null) {
                AndroidUtilities.cancelRunOnUIThread(t31Var);
                this.T = null;
            }
            this.f43571l0 = false;
            this.f43568i0 = false;
            ArrayList arrayList = this.V;
            arrayList.clear();
            this.W.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f43567h0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = ze1Var.f45158b;
                    if (i11 < arrayList2.size()) {
                        if (((pe1) arrayList2.get(i11)).f41396c != null) {
                            arrayList.add(((pe1) arrayList2.get(i11)).f41396c);
                            ((pe1) arrayList2.get(i11)).f41396c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f43567h0 = true;
                this.f43569j0.e(true, true);
                t31 t31Var2 = new t31(16, this, str);
                this.T = t31Var2;
                AndroidUtilities.runOnUIThread(t31Var2, 200L);
            }
        } else if (view instanceof h10) {
            h10 h10Var = (h10) view;
            h10Var.f38722c.b(0, false);
            h10Var.h(-ze1Var.f45155a, 0L, 0L, 0L, rf.h0.Y2[((re1) this.m0.f43248a.get(i10)).f42084b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.tm0) {
            org.telegram.ui.Components.tm0 tm0Var = (org.telegram.ui.Components.tm0) view;
            tm0Var.f32977a.b(0, false);
            tm0Var.G = str;
            tm0Var.d(false);
        }
    }

    public final void L() {
        this.f43560a0 = -1;
        this.f43561b0 = -1;
        this.f43562c0 = -1;
        this.f43563d0 = -1;
        this.f43564e0 = -1;
        this.f43565f0 = -1;
        this.f43566g0 = 0;
        ArrayList arrayList = this.V;
        if (!arrayList.isEmpty()) {
            int i10 = this.f43566g0;
            int i11 = i10 + 1;
            this.f43566g0 = i11;
            this.f43560a0 = i10;
            this.f43561b0 = i11;
            int size = arrayList.size() + i11;
            this.f43566g0 = size;
            this.f43562c0 = size;
        }
        ArrayList arrayList2 = this.W;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f43566g0;
            int i13 = i12 + 1;
            this.f43566g0 = i13;
            this.f43563d0 = i12;
            this.f43564e0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f43566g0 = size2;
            this.f43565f0 = size2;
        }
        this.S.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.o2) this.f43574p0).actionBar;
        lVar.O(null, null);
    }

    @Override
    public final boolean b(z00 z00Var) {
        if (z00Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f43573o0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == z00Var.f45006b && messageObject.getDialogId() == z00Var.f45005a) {
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
        ze1 ze1Var = this.f43574p0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
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
        ze1Var.presentFragment(new tn(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        ArrayList arrayList = this.f43573o0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            lVar = ((org.telegram.ui.ActionBar.o2) this.f43574p0).actionBar;
            lVar.r();
        }
    }

    @Override
    public final boolean f() {
        org.telegram.ui.ActionBar.l lVar;
        lVar = ((org.telegram.ui.ActionBar.o2) this.f43574p0).actionBar;
        return lVar.s();
    }
}
