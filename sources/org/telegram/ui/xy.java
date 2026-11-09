package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class xy extends org.telegram.ui.Components.na {
    public int P1;
    public final org.telegram.messenger.vo Q1;
    public final ArrayList R1;
    public final FrameLayout S1;
    public wy T1;
    public final TextView U1;
    public final ArrayList V1;
    public final ArrayList W1;

    public xy(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.vo voVar, ArrayList arrayList) {
        super(f2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.R1 = arrayList2;
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.Q1 = voVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        h1(false);
        this.l1.setTitle(e1(null));
        O(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false));
        this.P1 = this.G0;
        TextView textView = new TextView(getContext());
        this.U1 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Gi, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 8.0f));
        textView.setText(org.telegram.messenger.id.M0(2131750646, null));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 21));
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i7 = d.leftMargin;
        int i10 = this.f28654t0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f28624b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.S1 = frameLayout;
        this.f28624b.addView(frameLayout, c8.ha.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        g1();
    }

    public static void f1(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.vo voVar, jz jzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = voVar.f26070a;
        f2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new bi.f0(f2Var, voVar, jzVar, currentTimeMillis, 4));
    }

    @Override
    public final org.telegram.ui.Components.pj0 L0(org.telegram.ui.Components.qj0 qj0Var) {
        wy wyVar = new wy(this);
        this.T1 = wyVar;
        return wyVar;
    }

    @Override
    public final CharSequence O0() {
        return e1(null);
    }

    @Override
    public final void U0(org.telegram.ui.Components.tt0 tt0Var) {
        org.telegram.ui.Components.qj0 qj0Var = this.f36303k1;
        qj0Var.setOverScrollMode(2);
        qj0Var.setOnItemClickListener(new h(this, 11));
        v4.k kVar = new v4.k();
        kVar.f57083m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.n(350L);
        qj0Var.setItemAnimator(kVar);
    }

    public final void d1() {
        org.telegram.messenger.vo voVar;
        org.telegram.ui.ActionBar.f2 f2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            voVar = this.Q1;
            int size = voVar.h.size();
            f2Var = this.f36305o1;
            if (i7 >= size) {
                break;
            }
            long longValue = ((Long) voVar.h.get(i7)).longValue();
            if (longValue < 0 && iz.m0(f2Var.getMessagesController().M0(Long.valueOf(-longValue)))) {
                arrayList.add(f2Var.getMessagesController().j1(longValue));
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            f2Var.presentFragment(new iy(voVar, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = voVar.f26070a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        f2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new l(this, 7));
    }

    public final CharSequence e1(xh.l lVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.messenger.vo voVar = this.Q1;
        if (voVar != null) {
            if (lVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = lVar.getPaint().getFontMetricsInt();
            }
            obj = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(new SpannableStringBuilder(voVar.f26071b), fontMetricsInt, false, null, 0), voVar.f26072c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return org.telegram.messenger.id.V(null, null, 2131750643, obj);
    }

    public final void g1() {
        int i7;
        int i10;
        ArrayList arrayList = this.R1;
        if (arrayList.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.U1.setVisibility(i7);
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (arrayList.isEmpty()) {
            i10 = org.telegram.messenger.g0.L(68.0f);
        } else {
            i10 = 0;
        }
        this.f36303k1.setPadding(L, 0, L2, i10);
    }

    public final void h1(boolean z9) {
        ArrayList arrayList = this.V1;
        arrayList.clear();
        ArrayList arrayList2 = this.W1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? aVar = new rg.a(0, false);
        aVar.d = null;
        arrayList2.add(aVar);
        ArrayList arrayList3 = this.R1;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(az.d(null));
            arrayList2.add(new rg.a(8, false));
            for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                ?? aVar2 = new rg.a(7, false);
                aVar2.f43836m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i7);
                arrayList2.add(aVar2);
            }
        }
        wy wyVar = this.T1;
        if (wyVar != null) {
            if (z9) {
                wyVar.E(arrayList, arrayList2);
            } else {
                this.f36303k1.getAdapter().f();
            }
        }
    }

    @Override
    public final void s0() {
        int x02;
        super.s0();
        try {
            if (this.G0 == this.P1 && (x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27938h5, false)) != this.G0) {
                O(x02);
                this.P1 = this.G0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
