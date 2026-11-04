package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class td extends LinearLayout {
    public static final int f49774y = 0;
    public final int f49775a;
    public final qd f49776b;
    public final sd f49777c;
    public final l0 d;
    public final long f49778e;
    public final cd f49779f;
    public String h;
    public final ArrayList f49780n;
    public final ArrayList f49781r;
    public String f49782s;
    public final boolean[] f49783w;
    public final xd f49784x;

    public td(xd xdVar, Context context, int i3, long j10, int i10, cd cdVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f49784x = xdVar;
        this.h = "";
        this.f49780n = new ArrayList();
        this.f49781r = new ArrayList();
        this.f49782s = "";
        this.f49783w = new boolean[]{false, false};
        this.f49775a = i3;
        this.f49778e = j10;
        this.f49779f = cdVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        qd qdVar = new qd(this, context, e6Var, xdVar);
        this.f49776b = qdVar;
        sd sdVar = new sd(this, context, i3, j10, i10, e6Var);
        this.f49777c = sdVar;
        qdVar.setAdapter(sdVar);
        org.telegram.ui.Components.m61 j11 = qdVar.j(-2, true);
        pi.q qVar = xdVar.f51918e1;
        if (qVar != null) {
            qVar.c(qdVar);
        }
        l0 l0Var = new l0(5, context, this);
        this.d = l0Var;
        l0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        l0Var.addView(j11, b8.mf.e(-1, 48, 48));
        addView(qdVar, b8.mf.o(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.f49780n.isEmpty() && this.f49781r.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i3) {
        boolean isEmpty;
        if (i3 == 1) {
            isEmpty = this.f49780n.isEmpty();
        } else if (i3 == 0) {
            isEmpty = this.f49781r.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i3) {
        boolean[] zArr = this.f49783w;
        if (!zArr[i3]) {
            final boolean a10 = a();
            final boolean b10 = b(i3);
            int i10 = 20;
            long j10 = this.f49778e;
            xd xdVar = this.f49784x;
            int i11 = this.f49775a;
            if (i3 == 1) {
                if (this.h != null && xdVar.f51916c1) {
                    zArr[i3] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = org.telegram.messenger.hp.s1(i11).j1(j10);
                    tL_payments_getStarsTransactions.offset = this.h;
                    if (this.f49780n.isEmpty()) {
                        i10 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i10;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final td f48271b;

                        {
                            this.f48271b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final td tdVar = this.f48271b;
                                    final int i12 = i3;
                                    final boolean z10 = a10;
                                    final boolean z11 = b10;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            cd cdVar;
                                            cd cdVar2;
                                            switch (r7) {
                                                case 0:
                                                    td tdVar2 = tdVar;
                                                    int i13 = tdVar2.f49775a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i14 = i12;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        org.telegram.messenger.hp.s1(i13).Y3(starsStatus.users, false);
                                                        org.telegram.messenger.hp.s1(i13).S3(starsStatus.chats, false);
                                                        tdVar2.f49781r.addAll(starsStatus.history);
                                                        tdVar2.f49782s = starsStatus.next_offset;
                                                        tdVar2.f49783w[i14] = false;
                                                        tdVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.fc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (tdVar2.a() != z10 && (cdVar = tdVar2.f49779f) != null) {
                                                        cdVar.run();
                                                    }
                                                    if (tdVar2.b(i14) != z11) {
                                                        tdVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    td tdVar3 = tdVar;
                                                    int i15 = tdVar3.f49775a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i16 = i12;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        org.telegram.messenger.hp.s1(i15).Y3(starsStatus2.users, false);
                                                        org.telegram.messenger.hp.s1(i15).S3(starsStatus2.chats, false);
                                                        tdVar3.f49780n.addAll(starsStatus2.history);
                                                        tdVar3.h = starsStatus2.next_offset;
                                                        tdVar3.f49783w[i16] = false;
                                                        tdVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.fc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (tdVar3.a() != z10 && (cdVar2 = tdVar3.f49779f) != null) {
                                                        cdVar2.run();
                                                    }
                                                    if (tdVar3.b(i16) != z11) {
                                                        tdVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final td tdVar2 = this.f48271b;
                                    final int i13 = i3;
                                    final boolean z12 = a10;
                                    final boolean z13 = b10;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            cd cdVar;
                                            cd cdVar2;
                                            switch (r7) {
                                                case 0:
                                                    td tdVar22 = tdVar2;
                                                    int i132 = tdVar22.f49775a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i14 = i13;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        org.telegram.messenger.hp.s1(i132).Y3(starsStatus.users, false);
                                                        org.telegram.messenger.hp.s1(i132).S3(starsStatus.chats, false);
                                                        tdVar22.f49781r.addAll(starsStatus.history);
                                                        tdVar22.f49782s = starsStatus.next_offset;
                                                        tdVar22.f49783w[i14] = false;
                                                        tdVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.fc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (tdVar22.a() != z12 && (cdVar = tdVar22.f49779f) != null) {
                                                        cdVar.run();
                                                    }
                                                    if (tdVar22.b(i14) != z13) {
                                                        tdVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    td tdVar3 = tdVar2;
                                                    int i15 = tdVar3.f49775a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i16 = i13;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        org.telegram.messenger.hp.s1(i15).Y3(starsStatus2.users, false);
                                                        org.telegram.messenger.hp.s1(i15).S3(starsStatus2.chats, false);
                                                        tdVar3.f49780n.addAll(starsStatus2.history);
                                                        tdVar3.h = starsStatus2.next_offset;
                                                        tdVar3.f49783w[i16] = false;
                                                        tdVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.fc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (tdVar3.a() != z12 && (cdVar2 = tdVar3.f49779f) != null) {
                                                        cdVar2.run();
                                                    }
                                                    if (tdVar3.b(i16) != z13) {
                                                        tdVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    });
                }
            } else if (i3 == 0 && this.f49782s != null && xdVar.f51917d1) {
                zArr[i3] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = org.telegram.messenger.hp.s1(i11).j1(j10);
                tL_payments_getStarsTransactions2.offset = this.f49782s;
                if (this.f49781r.isEmpty()) {
                    i10 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i10;
                ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final td f48271b;

                    {
                        this.f48271b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final td tdVar = this.f48271b;
                                final int i12 = i3;
                                final boolean z10 = a10;
                                final boolean z11 = b10;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        cd cdVar;
                                        cd cdVar2;
                                        switch (r7) {
                                            case 0:
                                                td tdVar22 = tdVar;
                                                int i132 = tdVar22.f49775a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i14 = i12;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    org.telegram.messenger.hp.s1(i132).Y3(starsStatus.users, false);
                                                    org.telegram.messenger.hp.s1(i132).S3(starsStatus.chats, false);
                                                    tdVar22.f49781r.addAll(starsStatus.history);
                                                    tdVar22.f49782s = starsStatus.next_offset;
                                                    tdVar22.f49783w[i14] = false;
                                                    tdVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.fc.d0(tL_error2);
                                                    }
                                                }
                                                if (tdVar22.a() != z10 && (cdVar = tdVar22.f49779f) != null) {
                                                    cdVar.run();
                                                }
                                                if (tdVar22.b(i14) != z11) {
                                                    tdVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                td tdVar3 = tdVar;
                                                int i15 = tdVar3.f49775a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i16 = i12;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    org.telegram.messenger.hp.s1(i15).Y3(starsStatus2.users, false);
                                                    org.telegram.messenger.hp.s1(i15).S3(starsStatus2.chats, false);
                                                    tdVar3.f49780n.addAll(starsStatus2.history);
                                                    tdVar3.h = starsStatus2.next_offset;
                                                    tdVar3.f49783w[i16] = false;
                                                    tdVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.fc.d0(tL_error3);
                                                    }
                                                }
                                                if (tdVar3.a() != z10 && (cdVar2 = tdVar3.f49779f) != null) {
                                                    cdVar2.run();
                                                }
                                                if (tdVar3.b(i16) != z11) {
                                                    tdVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final td tdVar2 = this.f48271b;
                                final int i13 = i3;
                                final boolean z12 = a10;
                                final boolean z13 = b10;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        cd cdVar;
                                        cd cdVar2;
                                        switch (r7) {
                                            case 0:
                                                td tdVar22 = tdVar2;
                                                int i132 = tdVar22.f49775a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i14 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    org.telegram.messenger.hp.s1(i132).Y3(starsStatus.users, false);
                                                    org.telegram.messenger.hp.s1(i132).S3(starsStatus.chats, false);
                                                    tdVar22.f49781r.addAll(starsStatus.history);
                                                    tdVar22.f49782s = starsStatus.next_offset;
                                                    tdVar22.f49783w[i14] = false;
                                                    tdVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.fc.d0(tL_error2);
                                                    }
                                                }
                                                if (tdVar22.a() != z12 && (cdVar = tdVar22.f49779f) != null) {
                                                    cdVar.run();
                                                }
                                                if (tdVar22.b(i14) != z13) {
                                                    tdVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                td tdVar3 = tdVar2;
                                                int i15 = tdVar3.f49775a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i16 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    org.telegram.messenger.hp.s1(i15).Y3(starsStatus2.users, false);
                                                    org.telegram.messenger.hp.s1(i15).S3(starsStatus2.chats, false);
                                                    tdVar3.f49780n.addAll(starsStatus2.history);
                                                    tdVar3.h = starsStatus2.next_offset;
                                                    tdVar3.f49783w[i16] = false;
                                                    tdVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.fc.d0(tL_error3);
                                                    }
                                                }
                                                if (tdVar3.a() != z12 && (cdVar2 = tdVar3.f49779f) != null) {
                                                    cdVar2.run();
                                                }
                                                if (tdVar3.b(i16) != z13) {
                                                    tdVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void d() {
        int i3 = 0;
        while (true) {
            qd qdVar = this.f49776b;
            if (i3 < qdVar.getViewPages().length) {
                View view = qdVar.getViewPages()[i3];
                if (view instanceof rd) {
                    rd rdVar = (rd) view;
                    org.telegram.ui.Components.l41 l41Var = rdVar.f49199a;
                    l41Var.f35594g3.O(true);
                    if (l41Var.canScrollVertically(1)) {
                        for (int i10 = 0; i10 < l41Var.getChildCount(); i10++) {
                            if (!(l41Var.getChildAt(i10) instanceof org.telegram.ui.Components.iz)) {
                            }
                        }
                    }
                    rdVar.f49202e.run();
                    break;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        int h;
        sd sdVar = this.f49777c;
        ArrayList arrayList = sdVar.f49479e;
        ArrayList arrayList2 = sdVar.f49479e;
        int size = arrayList.size();
        qd qdVar = this.f49776b;
        if (size == 0) {
            h = -1;
        } else {
            h = sdVar.h(qdVar.getCurrentPosition());
        }
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            i3 |= 1 << sdVar.h(i10);
        }
        sdVar.i();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            int h7 = sdVar.h(i13);
            i11 |= 1 << h7;
            if (h7 == h) {
                i12 = i13;
            }
        }
        if (i3 == i11) {
            return;
        }
        qdVar.onTouchEvent(null);
        qdVar.setPosition(i12);
        qdVar.J();
        qdVar.k(false);
        this.f49784x.l();
    }

    public org.telegram.ui.Components.tj0 getCurrentListView() {
        View currentView = this.f49776b.getCurrentView();
        if (!(currentView instanceof rd)) {
            return null;
        }
        return ((rd) currentView).f49199a;
    }
}
