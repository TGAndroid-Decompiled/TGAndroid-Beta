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
public final class sf1 extends org.telegram.ui.Components.x81 implements s10 {
    public final FrameLayout T;
    public final org.telegram.ui.Components.xl0 U;
    public final s4.c0 V;
    public final pf1 W;
    public p81 f37734a0;
    public String f37735b0;
    public final ArrayList f37736c0;
    public final ArrayList f37737d0;
    public int f37738e0;
    public int f37739f0;
    public int f37740g0;
    public int f37741h0;
    public int f37742i0;
    public int f37743j0;
    public int f37744k0;
    public boolean f37745l0;
    public boolean m0;
    public final org.telegram.ui.Components.jx0 f37746n0;
    public final org.telegram.ui.Components.cl0 f37747o0;
    public boolean f37748p0;
    public final rf1 f37749q0;
    public final aw0 f37750r0;
    public final ArrayList f37751s0;
    public final wf1 f37752t0;

    public sf1(wf1 wf1Var, Context context) {
        super(context, null);
        this.f37752t0 = wf1Var;
        this.f37735b0 = "empty";
        this.f37736c0 = new ArrayList();
        this.f37737d0 = new ArrayList();
        this.f37751s0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        this.f37750r0 = new aw0(this, 7);
        org.telegram.ui.Components.xl0 xl0Var = new org.telegram.ui.Components.xl0(context, null);
        this.U = xl0Var;
        pf1 pf1Var = new pf1(this);
        this.W = pf1Var;
        xl0Var.setAdapter(pf1Var);
        s4.c0 c0Var = new s4.c0();
        this.V = c0Var;
        xl0Var.setLayoutManager(c0Var);
        xl0Var.setOnItemClickListener(new r21(this, 11));
        xl0Var.setOnScrollListener(new ge1(this, 1));
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(context, null);
        v00Var.setViewType(7);
        v00Var.f28952w = false;
        v00Var.setUseHeaderOffset(true);
        org.telegram.ui.Components.jx0 jx0Var = new org.telegram.ui.Components.jx0(context, v00Var, 1, null);
        this.f37746n0 = jx0Var;
        jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
        jx0Var.e.setVisibility(8);
        jx0Var.setVisibility(8);
        jx0Var.addView(v00Var, 0);
        jx0Var.setAnimateLayoutChange(true);
        xl0Var.setEmptyView(jx0Var);
        xl0Var.Y1 = true;
        xl0Var.Z1 = 0;
        frameLayout.addView(jx0Var);
        frameLayout.addView(xl0Var);
        L();
        org.telegram.ui.Components.cl0 cl0Var = new org.telegram.ui.Components.cl0(xl0Var, true);
        this.f37747o0 = cl0Var;
        xl0Var.setItemsEnterAnimator(cl0Var);
        rf1 rf1Var = new rf1(this);
        this.f37749q0 = rf1Var;
        setAdapter(rf1Var);
    }

    public final void J(String str) {
        int i10;
        if (this.f37748p0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        wf1 wf1Var = this.f37752t0;
        tL_messages_search.peer = wf1Var.getMessagesController().getInputPeer(-wf1Var.f39307a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f18444q = str;
        ArrayList arrayList = this.f37737d0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((MessageObject) hg.c.g(1, arrayList)).getId();
        }
        this.f37748p0 = true;
        i10 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_search, new vb0(27, this, str));
    }

    public final void K(View view, int i10, String str, boolean z10) {
        this.f37735b0 = str;
        FrameLayout frameLayout = this.T;
        wf1 wf1Var = this.f37752t0;
        int i11 = 0;
        if (view == frameLayout) {
            p81 p81Var = this.f37734a0;
            if (p81Var != null) {
                AndroidUtilities.cancelRunOnUIThread(p81Var);
                this.f37734a0 = null;
            }
            this.f37748p0 = false;
            this.m0 = false;
            ArrayList arrayList = this.f37736c0;
            arrayList.clear();
            this.f37737d0.clear();
            L();
            if (TextUtils.isEmpty(str)) {
                this.f37745l0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = wf1Var.f39310b;
                    if (i11 < arrayList2.size()) {
                        if (((nf1) arrayList2.get(i11)).f35872c != null) {
                            arrayList.add(((nf1) arrayList2.get(i11)).f35872c);
                            ((nf1) arrayList2.get(i11)).f35872c.searchQuery = null;
                        }
                        i11++;
                    } else {
                        L();
                        return;
                    }
                }
            } else {
                L();
                this.f37745l0 = true;
                this.f37746n0.e(true, true);
                p81 p81Var2 = new p81(12, this, str);
                this.f37734a0 = p81Var2;
                AndroidUtilities.runOnUIThread(p81Var2, 200L);
            }
        } else if (view instanceof t10) {
            t10 t10Var = (t10) view;
            t10Var.f37922c.b(0, false);
            t10Var.h(-wf1Var.f39307a, 0L, 0L, 0L, gg.s0.f9896c3[((of1) this.f37749q0.f37325a.get(i10)).f36230b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.jn0) {
            org.telegram.ui.Components.jn0 jn0Var = (org.telegram.ui.Components.jn0) view;
            jn0Var.f25473a.b(0, false);
            jn0Var.K = str;
            jn0Var.d(false);
        }
    }

    public final void L() {
        this.f37738e0 = -1;
        this.f37739f0 = -1;
        this.f37740g0 = -1;
        this.f37741h0 = -1;
        this.f37742i0 = -1;
        this.f37743j0 = -1;
        this.f37744k0 = 0;
        ArrayList arrayList = this.f37736c0;
        if (!arrayList.isEmpty()) {
            int i10 = this.f37744k0;
            int i11 = i10 + 1;
            this.f37744k0 = i11;
            this.f37738e0 = i10;
            this.f37739f0 = i11;
            int size = arrayList.size() + i11;
            this.f37744k0 = size;
            this.f37740g0 = size;
        }
        ArrayList arrayList2 = this.f37737d0;
        if (!arrayList2.isEmpty()) {
            int i12 = this.f37744k0;
            int i13 = i12 + 1;
            this.f37744k0 = i13;
            this.f37741h0 = i12;
            this.f37742i0 = i13;
            int size2 = arrayList2.size() + i13;
            this.f37744k0 = size2;
            this.f37743j0 = size2;
        }
        this.W.l();
    }

    @Override
    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.f37752t0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean c(l10 l10Var) {
        if (l10Var == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f37751s0;
            if (i10 >= arrayList.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (messageObject != null && messageObject.getId() == l10Var.f35205b && messageObject.getDialogId() == l10Var.f35204a) {
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
        wf1 wf1Var = this.f37752t0;
        if (isEncryptedDialog) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
        } else if (!DialogObject.isUserDialog(dialogId)) {
            i10 = ((org.telegram.ui.ActionBar.m2) wf1Var).currentAccount;
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
        wf1Var.presentFragment(new wn(bundle));
    }

    @Override
    public final void e(MessageObject messageObject, View view, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f37751s0;
        if (!arrayList.remove(messageObject)) {
            arrayList.add(messageObject);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.m2) this.f37752t0).actionBar;
            kVar.r();
        }
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.m2) this.f37752t0).actionBar;
        return kVar.s();
    }
}
