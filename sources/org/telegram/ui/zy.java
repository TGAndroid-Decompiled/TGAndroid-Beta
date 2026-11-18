package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class zy extends org.telegram.ui.Components.sa {
    public int T1;
    public final org.telegram.messenger.ro U1;
    public final ArrayList V1;
    public final FrameLayout W1;
    public yy X1;
    public final TextView Y1;
    public final ArrayList Z1;
    public final ArrayList f54613a2;

    public zy(org.telegram.ui.ActionBar.h2 h2Var, org.telegram.messenger.ro roVar, ArrayList arrayList) {
        super(h2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.V1 = arrayList2;
        this.Z1 = new ArrayList();
        this.f54613a2 = new ArrayList();
        this.U1 = roVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        i1(false);
        this.f39535p1.setTitle(f1(null));
        P(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29469h5, false));
        this.T1 = this.H0;
        TextView textView = new TextView(getContext());
        this.Y1 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 8.0f));
        textView.setText(org.telegram.messenger.gd.M0(2131750630, null));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 21));
        FrameLayout.LayoutParams d = c8.ma.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i7 = d.leftMargin;
        int i10 = this.f30227u0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f30192b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.W1 = frameLayout;
        this.f30192b.addView(frameLayout, c8.ma.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        h1();
    }

    public static void g1(org.telegram.ui.ActionBar.h2 h2Var, org.telegram.messenger.ro roVar, lz lzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = roVar.f26674a;
        h2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new di.y(h2Var, roVar, lzVar, currentTimeMillis, 4));
    }

    @Override
    public final org.telegram.ui.Components.bk0 M0(org.telegram.ui.Components.ck0 ck0Var) {
        yy yyVar = new yy(this);
        this.X1 = yyVar;
        return yyVar;
    }

    @Override
    public final CharSequence P0() {
        return f1(null);
    }

    @Override
    public final void V0(org.telegram.ui.Components.au0 au0Var) {
        org.telegram.ui.Components.ck0 ck0Var = this.f39534o1;
        ck0Var.setOverScrollMode(2);
        ck0Var.setOnItemClickListener(new h(this, 11));
        v4.k kVar = new v4.k();
        kVar.f59151m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.lr.h);
        kVar.n(350L);
        ck0Var.setItemAnimator(kVar);
    }

    public final void e1() {
        org.telegram.messenger.ro roVar;
        org.telegram.ui.ActionBar.h2 h2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            roVar = this.U1;
            int size = roVar.h.size();
            h2Var = this.f39538s1;
            if (i7 >= size) {
                break;
            }
            long longValue = ((Long) roVar.h.get(i7)).longValue();
            if (longValue < 0 && kz.m0(h2Var.getMessagesController().O0(Long.valueOf(-longValue)))) {
                arrayList.add(h2Var.getMessagesController().l1(longValue));
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            h2Var.presentFragment(new ky(roVar, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = roVar.f26674a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        h2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new l(this, 7));
    }

    public final CharSequence f1(xh.l lVar) {
        Object obj;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.messenger.ro roVar = this.U1;
        if (roVar != null) {
            if (lVar == null) {
                fontMetricsInt = null;
            } else {
                fontMetricsInt = lVar.getPaint().getFontMetricsInt();
            }
            obj = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(new SpannableStringBuilder(roVar.f26675b), fontMetricsInt, false, null, 0), roVar.f26676c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return org.telegram.messenger.gd.V(null, null, 2131750627, obj);
    }

    public final void h1() {
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
        this.f39534o1.setPadding(L, 0, L2, i10);
    }

    public final void i1(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        ArrayList arrayList2 = this.f54613a2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        ?? aVar = new rg.a(0, false);
        aVar.d = null;
        arrayList2.add(aVar);
        ArrayList arrayList3 = this.V1;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(cz.d(null));
            arrayList2.add(new rg.a(8, false));
            for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                ?? aVar2 = new rg.a(7, false);
                aVar2.f46801m = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i7);
                arrayList2.add(aVar2);
            }
        }
        yy yyVar = this.X1;
        if (yyVar != null) {
            if (z10) {
                yyVar.E(arrayList, arrayList2);
            } else {
                this.f39534o1.getAdapter().f();
            }
        }
    }

    @Override
    public final void s0() {
        int x02;
        super.s0();
        try {
            if (this.H0 == this.T1 && (x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29469h5, false)) != this.H0) {
                P(x02);
                this.T1 = this.H0;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
