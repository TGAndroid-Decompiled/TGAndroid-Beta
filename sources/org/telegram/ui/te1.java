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
public final class te1 extends org.telegram.ui.Components.l91 implements h10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.mm0 U;
    public final s4.b0 V;
    public final qe1 W;
    public o71 f41974a0;
    public String f41975b0;
    public final ArrayList f41976c0;
    public final ArrayList f41977d0;
    public int f41978e0;
    public int f41979f0;
    public int f41980g0;
    public int f41981h0;
    public int f41982i0;
    public int f41983j0;
    public int f41984k0;
    public boolean f41985l0;
    public boolean m0;
    public final org.telegram.ui.Components.wx0 f41986n0;
    public final org.telegram.ui.Components.rl0 f41987o0;
    public boolean f41988p0;
    public final se1 f41989q0;
    public final rv0 f41990r0;
    public final ArrayList f41991s0;
    public final ye1 f41992t0;

    public te1(ye1 ye1Var, Context context) {
        super(context, null);
        this.f41992t0 = ye1Var;
        this.f41975b0 = "empty";
        this.f41976c0 = new ArrayList();
        this.f41977d0 = new ArrayList();
        this.f41991s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f41990r0 = new rv0(this, 6);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.U = mm0Var;
        qe1 qe1Var = new qe1(this);
        this.W = qe1Var;
        mm0Var.setAdapter(qe1Var);
        s4.b0 b0Var = new s4.b0();
        this.V = b0Var;
        mm0Var.setLayoutManager(b0Var);
        mm0Var.setOnItemClickListener(new j11(this, 11));
        mm0Var.setOnScrollListener(new hd1(this, 1));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(7);
        b10Var.f24923w = false;
        b10Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(context, b10Var, 1, null);
        this.f41986n0 = wx0Var;
        wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        wx0Var.e.setVisibility(8);
        wx0Var.setVisibility(8);
        wx0Var.addView(b10Var, 0);
        wx0Var.setAnimateLayoutChange(true);
        mm0Var.setEmptyView(wx0Var);
        mm0Var.W1 = true;
        mm0Var.X1 = 0;
        frameLayout.addView(wx0Var);
        frameLayout.addView(mm0Var);
        L();
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(mm0Var, true);
        this.f41987o0 = rl0Var;
        mm0Var.setItemsEnterAnimator(rl0Var);
        se1 se1Var = new se1(this);
        this.f41989q0 = se1Var;
        setAdapter(se1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f41988p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        ye1 ye1Var = this.f41992t0;
        tL_messages_search.peer = ye1Var.getMessagesController().getInputPeer(-ye1Var.f43792a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f20452q = str;
        ArrayList arrayList = this.f41977d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) i2.o1.i(1, arrayList)).getId();
        }
        this.f41988p0 = true;
        i10 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new q71(4, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f41975b0 = str;
        FrameLayout frameLayout = this.T;
        ye1 ye1Var = this.f41992t0;
        int i11 = 0;
        if (view == frameLayout) {
            o71 o71Var = this.f41974a0;
            if (o71Var != null) {
                AndroidUtilities.cancelRunOnUIThread(o71Var);
                this.f41974a0 = null;
            }
            this.f41988p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f41976c0;
            arrayList.clear();
            this.f41977d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f41985l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = ye1Var.f43795b;
                    if (i11 < arrayList2.size()) {
                        if (((oe1) arrayList2.get(i11)).f40146c != null) {
                            arrayList.add(((oe1) arrayList2.get(i11)).f40146c);
                            ((oe1) arrayList2.get(i11)).f40146c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f41985l0 = true;
                this.f41986n0.e(true, true);
                o71 o71Var2 = new o71(13, this, str);
                this.f41974a0 = o71Var2;
                AndroidUtilities.runOnUIThread(o71Var2, 200L);
            }
        } else if (view instanceof i10) {
            i10 i10Var = (i10) view;
            i10Var.f38014c.b(0, false);
            i10Var.h(-ye1Var.f43792a, 0L, 0L, 0L, hg.q0.f12042d3[((pe1) this.f41989q0.f41396a.get(i10)).f40460b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.xn0) {
            org.telegram.ui.Components.xn0 xn0Var = (org.telegram.ui.Components.xn0) view;
            xn0Var.f32606a.b(0, false);
            xn0Var.K = str;
            xn0Var.d(false);
        }
    }

    public final void L() {
        this.f41978e0 = -1;
        this.f41979f0 = -1;
        this.f41980g0 = -1;
        this.f41981h0 = -1;
        this.f41982i0 = -1;
        this.f41983j0 = -1;
        this.f41984k0 = 0;
        ArrayList arrayList = this.f41976c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f41984k0;
            int i11 = i10 + 1;
            this.f41984k0 = i11;
            this.f41978e0 = i10;
            this.f41979f0 = i11;
            int size = arrayList.size() + i11;
            this.f41984k0 = size;
            this.f41980g0 = size;
        }
        ArrayList arrayList2 = this.f41977d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f41984k0;
            int i13 = i12 + 1;
            this.f41984k0 = i13;
            this.f41981h0 = i12;
            this.f41982i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f41984k0 = size2;
            this.f41983j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.f41992t0).actionBar;
        kVar.N(null, null);
    }

    @Override
    public final boolean b(a10 a10Var) {
        if (a10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f41991s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == a10Var.f35547b && messageObject.getDialogId() == a10Var.f35546a) {
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
        ye1 ye1Var = this.f41992t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.o2) ye1Var).currentAccount;
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
        ye1Var.presentFragment(new sn(bundle));
    }

    @Override
    public final void d(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f41991s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.o2) this.f41992t0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.f41992t0).actionBar;
        return kVar.s();
    }
}
