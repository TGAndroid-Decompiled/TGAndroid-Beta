package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class wy extends org.telegram.ui.Components.ja {
    public int T1;
    public final org.telegram.messenger.so U1;
    public final ArrayList V1;
    public final FrameLayout W1;
    public vy X1;
    public final TextView Y1;
    public final ArrayList Z1;
    public final ArrayList f53028a2;

    public wy(org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.so soVar, ArrayList arrayList) {
        super(e2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.V1 = arrayList2;
        this.Z1 = new ArrayList();
        this.f53028a2 = new ArrayList();
        this.U1 = soVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        h1(false);
        this.f35937p1.setTitle(e1(null));
        P(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false));
        this.T1 = this.H0;
        TextView textView = new TextView(getContext());
        this.Y1 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 8.0f));
        textView.setText(org.telegram.messenger.hd.M0(2131750646, null));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 21));
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i7 = d.leftMargin;
        int i10 = this.f29717u0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f29682b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.W1 = frameLayout;
        this.f29682b.addView(frameLayout, c8.ja.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        g1();
    }

    public static void f1(org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.so soVar, iz izVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = soVar.f26542a;
        e2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new di.y(e2Var, soVar, izVar, currentTimeMillis, 4));
    }

    @Override
    public final org.telegram.ui.Components.tj0 L0(org.telegram.ui.Components.uj0 uj0Var) {
        vy vyVar = new vy(this);
        this.X1 = vyVar;
        return vyVar;
    }

    @Override
    public final CharSequence O0() {
        return e1(null);
    }

    @Override
    public final void U0(org.telegram.ui.Components.st0 st0Var) {
        org.telegram.ui.Components.uj0 uj0Var = this.f35936o1;
        uj0Var.setOverScrollMode(2);
        uj0Var.setOnItemClickListener(new h(this, 11));
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.er.h);
        kVar.n(350L);
        uj0Var.setItemAnimator(kVar);
    }

    public final void d1() {
        org.telegram.messenger.so soVar;
        org.telegram.ui.ActionBar.e2 e2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            soVar = this.U1;
            int size = soVar.h.size();
            e2Var = this.f35940s1;
            if (i7 >= size) {
                break;
            }
            long longValue = ((Long) soVar.h.get(i7)).longValue();
            if (longValue < 0 && hz.m0(e2Var.getMessagesController().M0(Long.valueOf(-longValue)))) {
                arrayList.add(e2Var.getMessagesController().j1(longValue));
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            e2Var.presentFragment(new hy(soVar, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = soVar.f26542a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        e2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new l(this, 7));
    }

    public final CharSequence e1(xh.l lVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.messenger.so soVar = this.U1;
        if (soVar != null) {
            if (lVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = lVar.getPaint().getFontMetricsInt();
            }
            obj = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(new SpannableStringBuilder(soVar.f26543b), fontMetricsInt, false, null, 0), soVar.f26544c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return org.telegram.messenger.hd.V(null, null, 2131750643, obj);
    }

    public final void g1() {
        int i7;
        int i10;
        ArrayList arrayList = this.V1;
        if (arrayList.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.Y1.setVisibility(i7);
        int L = org.telegram.messenger.g0.L(6.0f);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        if (arrayList.isEmpty()) {
            i10 = org.telegram.messenger.g0.L(68.0f);
        } else {
            i10 = 0;
        }
        this.f35936o1.setPadding(L, 0, L2, i10);
    }

    public final void h1(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        ArrayList arrayList2 = this.f53028a2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? aVar = new rg.a(0, false);
        aVar.d = null;
        arrayList2.add(aVar);
        ArrayList arrayList3 = this.V1;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(zy.d(null));
            arrayList2.add(new rg.a(8, false));
            for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                ?? aVar2 = new rg.a(7, false);
                aVar2.f54068m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i7);
                arrayList2.add(aVar2);
            }
        }
        vy vyVar = this.X1;
        if (vyVar != null) {
            if (z10) {
                vyVar.E(arrayList, arrayList2);
            } else {
                this.f35936o1.getAdapter().f();
            }
        }
    }

    @Override
    public final void s0() {
        int x02;
        super.s0();
        try {
            if (this.H0 == this.T1 && (x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false)) != this.H0) {
                P(x02);
                this.T1 = this.H0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
