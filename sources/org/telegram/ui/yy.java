package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class yy extends org.telegram.ui.Components.ma {
    public int S1;
    public final org.telegram.messenger.vo T1;
    public final ArrayList U1;
    public final FrameLayout V1;
    public xy W1;
    public final TextView X1;
    public final ArrayList Y1;
    public final ArrayList Z1;

    public yy(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.vo voVar, ArrayList arrayList) {
        super(f2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.U1 = arrayList2;
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.T1 = voVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        h1(false);
        this.f35902o1.setTitle(e1(null));
        O(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false));
        this.S1 = this.G0;
        TextView textView = new TextView(getContext());
        this.X1 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 8.0f));
        textView.setText(org.telegram.messenger.id.M0(2131750646, null));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 21));
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i7 = d.leftMargin;
        int i10 = this.f28705t0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f28672b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.V1 = frameLayout;
        this.f28672b.addView(frameLayout, c8.ha.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        g1();
    }

    public static void f1(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.vo voVar, kz kzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = voVar.f26074a;
        f2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new bi.f0(f2Var, voVar, kzVar, currentTimeMillis, 4));
    }

    @Override
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        xy xyVar = new xy(this);
        this.W1 = xyVar;
        return xyVar;
    }

    @Override
    public final CharSequence O0() {
        return e1(null);
    }

    @Override
    public final void U0(org.telegram.ui.Components.st0 st0Var) {
        org.telegram.ui.Components.pj0 pj0Var = this.n1;
        pj0Var.setOverScrollMode(2);
        pj0Var.setOnItemClickListener(new h(this, 11));
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.n(350L);
        pj0Var.setItemAnimator(kVar);
    }

    public final void d1() {
        org.telegram.messenger.vo voVar;
        org.telegram.ui.ActionBar.f2 f2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            voVar = this.T1;
            int size = voVar.h.size();
            f2Var = this.f35905r1;
            if (i7 >= size) {
                break;
            }
            long longValue = ((Long) voVar.h.get(i7)).longValue();
            if (longValue < 0 && jz.m0(f2Var.getMessagesController().M0(Long.valueOf(-longValue)))) {
                arrayList.add(f2Var.getMessagesController().j1(longValue));
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            f2Var.presentFragment(new jy(voVar, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = voVar.f26074a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        f2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new l(this, 7));
    }

    public final CharSequence e1(xh.l lVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.messenger.vo voVar = this.T1;
        if (voVar != null) {
            if (lVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = lVar.getPaint().getFontMetricsInt();
            }
            obj = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(new SpannableStringBuilder(voVar.f26075b), fontMetricsInt, false, null, 0), voVar.f26076c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return org.telegram.messenger.id.V(null, null, 2131750643, obj);
    }

    public final void g1() {
        int i7;
        int i10;
        ArrayList arrayList = this.U1;
        if (arrayList.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.X1.setVisibility(i7);
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (arrayList.isEmpty()) {
            i10 = org.telegram.messenger.g0.L(68.0f);
        } else {
            i10 = 0;
        }
        this.n1.setPadding(L, 0, L2, i10);
    }

    public final void h1(boolean z9) {
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        ArrayList arrayList2 = this.Z1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? aVar = new rg.a(0, false);
        aVar.d = null;
        arrayList2.add(aVar);
        ArrayList arrayList3 = this.U1;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(bz.d(null));
            arrayList2.add(new rg.a(8, false));
            for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                ?? aVar2 = new rg.a(7, false);
                aVar2.f44183m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i7);
                arrayList2.add(aVar2);
            }
        }
        xy xyVar = this.W1;
        if (xyVar != null) {
            if (z9) {
                xyVar.E(arrayList, arrayList2);
            } else {
                this.n1.getAdapter().f();
            }
        }
    }

    @Override
    public final void s0() {
        int x02;
        super.s0();
        try {
            if (this.G0 == this.S1 && (x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27963h5, false)) != this.G0) {
                O(x02);
                this.S1 = this.G0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
