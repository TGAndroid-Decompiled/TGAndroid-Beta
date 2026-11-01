package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class vz extends org.telegram.ui.Components.ha {
    public int P1;
    public final org.telegram.messenger.bp Q1;
    public final ArrayList R1;
    public final FrameLayout S1;
    public uz T1;
    public final TextView U1;
    public final ArrayList V1;
    public final ArrayList W1;

    public vz(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.bp bpVar, ArrayList arrayList) {
        super(k2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.R1 = arrayList2;
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.Q1 = bpVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        h1(false);
        this.l1.setTitle(e1(null));
        P(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false));
        this.P1 = this.G0;
        TextView textView = new TextView(getContext());
        this.U1 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 8.0f));
        textView.setText(org.telegram.messenger.dd.L0(2131750647, null));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 21));
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i10 = d.leftMargin;
        int i11 = this.f21616t0;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.f21587b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.S1 = frameLayout;
        this.f21587b.addView(frameLayout, w7.b6.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        g1();
    }

    public static void f1(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.bp bpVar, yy yyVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = bpVar.f15000a;
        k2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new org.telegram.ui.Components.c70(k2Var, bpVar, yyVar, currentTimeMillis, 1));
    }

    @Override
    public final org.telegram.ui.Components.tk0 L0(org.telegram.ui.Components.uk0 uk0Var) {
        uz uzVar = new uz(this);
        this.T1 = uzVar;
        return uzVar;
    }

    @Override
    public final CharSequence O0() {
        return e1(null);
    }

    @Override
    public final void U0(org.telegram.ui.Components.vu0 vu0Var) {
        org.telegram.ui.Components.uk0 uk0Var = this.f26724k1;
        uk0Var.setOverScrollMode(2);
        uk0Var.setOnItemClickListener(new g(this, 11));
        s4.j jVar = new s4.j();
        jVar.f47938m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        uk0Var.setItemAnimator(jVar);
    }

    public final void d1() {
        org.telegram.messenger.bp bpVar;
        org.telegram.ui.ActionBar.k2 k2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            bpVar = this.Q1;
            int size = bpVar.h.size();
            k2Var = this.f26727o1;
            if (i10 >= size) {
                break;
            }
            long longValue = ((Long) bpVar.h.get(i10)).longValue();
            if (longValue < 0 && h00.m0(k2Var.getMessagesController().L0(Long.valueOf(-longValue)))) {
                arrayList.add(k2Var.getMessagesController().i1(longValue));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            k2Var.presentFragment(new hz(bpVar, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = bpVar.f15000a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        k2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new k(this, 7));
    }

    public final CharSequence e1(nh.p pVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.messenger.bp bpVar = this.Q1;
        if (bpVar != null) {
            if (pVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = pVar.getPaint().getFontMetricsInt();
            }
            obj = org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(new SpannableStringBuilder(bpVar.f15001b), fontMetricsInt, false, null, 0), bpVar.f15002c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return org.telegram.messenger.dd.V(null, null, 2131750644, obj);
    }

    public final void g1() {
        int i10;
        int i11;
        ArrayList arrayList = this.R1;
        if (arrayList.isEmpty()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.U1.setVisibility(i10);
        int L = org.telegram.messenger.i0.L(6.0f);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        if (arrayList.isEmpty()) {
            i11 = org.telegram.messenger.i0.L(68.0f);
        } else {
            i11 = 0;
        }
        this.f26724k1.setPadding(L, 0, L2, i11);
    }

    public final void h1(boolean z10) {
        ArrayList arrayList = this.V1;
        arrayList.clear();
        ArrayList arrayList2 = this.W1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? bVar = new hg.b(0, false);
        bVar.d = null;
        arrayList2.add(bVar);
        ArrayList arrayList3 = this.R1;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(zz.d(null));
            arrayList2.add(new hg.b(8, false));
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ?? bVar2 = new hg.b(7, false);
                bVar2.f44263m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i10);
                arrayList2.add(bVar2);
            }
        }
        uz uzVar = this.T1;
        if (uzVar != null) {
            if (z10) {
                uzVar.E(arrayList, arrayList2);
            } else {
                this.f26724k1.getAdapter().f();
            }
        }
    }

    @Override
    public final void s0() {
        int x02;
        super.s0();
        try {
            if (this.G0 == this.P1 && (x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h5, false)) != this.G0) {
                P(x02);
                this.P1 = this.G0;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
