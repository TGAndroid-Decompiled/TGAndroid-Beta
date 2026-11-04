package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class sy extends org.telegram.ui.Components.ma {
    public int Q1;
    public final org.telegram.messenger.mo R1;
    public final ArrayList S1;
    public final FrameLayout T1;
    public ry U1;
    public final TextView V1;
    public final ArrayList W1;
    public final ArrayList X1;

    public sy(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.mo moVar, ArrayList arrayList) {
        super(d2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.S1 = arrayList2;
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.R1 = moVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        h1(false);
        this.m1.setTitle(e1(null));
        O(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
        this.Q1 = this.H0;
        TextView textView = new TextView(getContext());
        this.V1 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 8.0f));
        textView.setText(org.telegram.messenger.bd.M0(2131750647, null));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 21));
        FrameLayout.LayoutParams d = b8.mf.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i3 = d.leftMargin;
        int i10 = this.f28618u0;
        d.leftMargin = i3 + i10;
        d.rightMargin += i10;
        this.f28586b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.T1 = frameLayout;
        this.f28586b.addView(frameLayout, b8.mf.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        g1();
    }

    public static void f1(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.mo moVar, fz fzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = moVar.f24237a;
        d2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new ci.a0(d2Var, moVar, fzVar, currentTimeMillis, 4));
    }

    @Override
    public final org.telegram.ui.Components.sj0 L0(org.telegram.ui.Components.tj0 tj0Var) {
        ry ryVar = new ry(this);
        this.U1 = ryVar;
        return ryVar;
    }

    @Override
    public final CharSequence O0() {
        return e1(null);
    }

    @Override
    public final void U0(org.telegram.ui.Components.qt0 qt0Var) {
        org.telegram.ui.Components.tj0 tj0Var = this.f36102l1;
        tj0Var.setOverScrollMode(2);
        tj0Var.setOnItemClickListener(new h(this, 11));
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.n(350L);
        tj0Var.setItemAnimator(kVar);
    }

    public final void d1() {
        org.telegram.messenger.mo moVar;
        org.telegram.ui.ActionBar.d2 d2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i3 = 0;
        while (true) {
            moVar = this.R1;
            int size = moVar.h.size();
            d2Var = this.f36105p1;
            if (i3 >= size) {
                break;
            }
            long longValue = ((Long) moVar.h.get(i3)).longValue();
            if (longValue < 0 && ez.m0(d2Var.getMessagesController().M0(Long.valueOf(-longValue)))) {
                arrayList.add(d2Var.getMessagesController().j1(longValue));
            }
            i3++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            d2Var.presentFragment(new cy(moVar, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = moVar.f24237a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        d2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new l(this, 7));
    }

    public final CharSequence e1(yh.l lVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.messenger.mo moVar = this.R1;
        if (moVar != null) {
            if (lVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = lVar.getPaint().getFontMetricsInt();
            }
            obj = org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(new SpannableStringBuilder(moVar.f24238b), fontMetricsInt, false, null, 0), moVar.f24239c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return org.telegram.messenger.bd.V(null, null, 2131750644, obj);
    }

    public final void g1() {
        int i3;
        int i10;
        ArrayList arrayList = this.S1;
        if (arrayList.isEmpty()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.V1.setVisibility(i3);
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (arrayList.isEmpty()) {
            i10 = org.telegram.messenger.g0.L(68.0f);
        } else {
            i10 = 0;
        }
        this.f36102l1.setPadding(L, 0, L2, i10);
    }

    public final void h1(boolean z10) {
        ArrayList arrayList = this.W1;
        arrayList.clear();
        ArrayList arrayList2 = this.X1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? aVar = new sg.a(0, false);
        aVar.d = null;
        arrayList2.add(aVar);
        ArrayList arrayList3 = this.S1;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(vy.d(null));
            arrayList2.add(new sg.a(8, false));
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                ?? aVar2 = new sg.a(7, false);
                aVar2.f50640m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i3);
                arrayList2.add(aVar2);
            }
        }
        ry ryVar = this.U1;
        if (ryVar != null) {
            if (z10) {
                ryVar.E(arrayList, arrayList2);
            } else {
                this.f36102l1.getAdapter().f();
            }
        }
    }

    @Override
    public final void s0() {
        int x02;
        super.s0();
        try {
            if (this.H0 == this.Q1 && (x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false)) != this.H0) {
                O(x02);
                this.Q1 = this.H0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
