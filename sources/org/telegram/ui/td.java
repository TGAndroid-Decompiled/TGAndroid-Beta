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
    public static final int f52251y = 0;
    public final int f52252a;
    public final qd f52253b;
    public final sd f52254c;
    public final k0 d;
    public final long f52255e;
    public final cd f52256f;
    public String h;
    public final ArrayList f52257n;
    public final ArrayList f52258r;
    public String f52259s;
    public final boolean[] f52260w;
    public final xd f52261x;

    public td(xd xdVar, Context context, int i7, long j3, int i10, cd cdVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f52261x = xdVar;
        this.h = "";
        this.f52257n = new ArrayList();
        this.f52258r = new ArrayList();
        this.f52259s = "";
        this.f52260w = new boolean[]{false, false};
        this.f52252a = i7;
        this.f52255e = j3;
        this.f52256f = cdVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        qd qdVar = new qd(this, context, h6Var, xdVar);
        this.f52253b = qdVar;
        sd sdVar = new sd(this, context, i7, j3, i10, h6Var);
        this.f52254c = sdVar;
        qdVar.setAdapter(sdVar);
        org.telegram.ui.Components.i71 i11 = qdVar.i(-2, true);
        ri.q qVar = xdVar.f53757e1;
        if (qVar != null) {
            qVar.c(qdVar);
        }
        k0 k0Var = new k0(5, context, this);
        this.d = k0Var;
        k0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        k0Var.addView(i11, c8.na.e(-1, 48, 48));
        addView(qdVar, c8.na.o(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.f52257n.isEmpty() && this.f52258r.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i7) {
        boolean isEmpty;
        if (i7 == 1) {
            isEmpty = this.f52257n.isEmpty();
        } else if (i7 == 0) {
            isEmpty = this.f52258r.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i7) {
        boolean[] zArr = this.f52260w;
        if (!zArr[i7]) {
            final boolean a10 = a();
            final boolean b10 = b(i7);
            int i10 = 20;
            long j3 = this.f52255e;
            xd xdVar = this.f52261x;
            int i11 = this.f52252a;
            if (i7 == 1) {
                if (this.h != null && xdVar.f53755c1) {
                    zArr[i7] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = org.telegram.messenger.np.u1(i11).l1(j3);
                    tL_payments_getStarsTransactions.offset = this.h;
                    if (this.f52257n.isEmpty()) {
                        i10 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i10;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final td f50545b;

                        {
                            this.f50545b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final td tdVar = this.f50545b;
                                    final int i12 = i7;
                                    final boolean z10 = a10;
                                    final boolean z11 = b10;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            cd cdVar;
                                            cd cdVar2;
                                            switch (r7) {
                                                case 0:
                                                    td tdVar2 = tdVar;
                                                    int i13 = tdVar2.f52252a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i14 = i12;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        org.telegram.messenger.np.u1(i13).f4(starsStatus.users, false);
                                                        org.telegram.messenger.np.u1(i13).Z3(starsStatus.chats, false);
                                                        tdVar2.f52258r.addAll(starsStatus.history);
                                                        tdVar2.f52259s = starsStatus.next_offset;
                                                        tdVar2.f52260w[i14] = false;
                                                        tdVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.lc.e0(tL_error2);
                                                        }
                                                    }
                                                    if (tdVar2.a() != z10 && (cdVar = tdVar2.f52256f) != null) {
                                                        cdVar.run();
                                                    }
                                                    if (tdVar2.b(i14) != z11) {
                                                        tdVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    td tdVar3 = tdVar;
                                                    int i15 = tdVar3.f52252a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i16 = i12;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        org.telegram.messenger.np.u1(i15).f4(starsStatus2.users, false);
                                                        org.telegram.messenger.np.u1(i15).Z3(starsStatus2.chats, false);
                                                        tdVar3.f52257n.addAll(starsStatus2.history);
                                                        tdVar3.h = starsStatus2.next_offset;
                                                        tdVar3.f52260w[i16] = false;
                                                        tdVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.lc.e0(tL_error3);
                                                        }
                                                    }
                                                    if (tdVar3.a() != z10 && (cdVar2 = tdVar3.f52256f) != null) {
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
                                    final td tdVar2 = this.f50545b;
                                    final int i13 = i7;
                                    final boolean z12 = a10;
                                    final boolean z13 = b10;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            cd cdVar;
                                            cd cdVar2;
                                            switch (r7) {
                                                case 0:
                                                    td tdVar22 = tdVar2;
                                                    int i132 = tdVar22.f52252a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i14 = i13;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        org.telegram.messenger.np.u1(i132).f4(starsStatus.users, false);
                                                        org.telegram.messenger.np.u1(i132).Z3(starsStatus.chats, false);
                                                        tdVar22.f52258r.addAll(starsStatus.history);
                                                        tdVar22.f52259s = starsStatus.next_offset;
                                                        tdVar22.f52260w[i14] = false;
                                                        tdVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.lc.e0(tL_error2);
                                                        }
                                                    }
                                                    if (tdVar22.a() != z12 && (cdVar = tdVar22.f52256f) != null) {
                                                        cdVar.run();
                                                    }
                                                    if (tdVar22.b(i14) != z13) {
                                                        tdVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    td tdVar3 = tdVar2;
                                                    int i15 = tdVar3.f52252a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i16 = i13;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        org.telegram.messenger.np.u1(i15).f4(starsStatus2.users, false);
                                                        org.telegram.messenger.np.u1(i15).Z3(starsStatus2.chats, false);
                                                        tdVar3.f52257n.addAll(starsStatus2.history);
                                                        tdVar3.h = starsStatus2.next_offset;
                                                        tdVar3.f52260w[i16] = false;
                                                        tdVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.lc.e0(tL_error3);
                                                        }
                                                    }
                                                    if (tdVar3.a() != z12 && (cdVar2 = tdVar3.f52256f) != null) {
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
            } else if (i7 == 0 && this.f52259s != null && xdVar.f53756d1) {
                zArr[i7] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = org.telegram.messenger.np.u1(i11).l1(j3);
                tL_payments_getStarsTransactions2.offset = this.f52259s;
                if (this.f52258r.isEmpty()) {
                    i10 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i10;
                ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final td f50545b;

                    {
                        this.f50545b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final td tdVar = this.f50545b;
                                final int i12 = i7;
                                final boolean z10 = a10;
                                final boolean z11 = b10;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        cd cdVar;
                                        cd cdVar2;
                                        switch (r7) {
                                            case 0:
                                                td tdVar22 = tdVar;
                                                int i132 = tdVar22.f52252a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i14 = i12;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    org.telegram.messenger.np.u1(i132).f4(starsStatus.users, false);
                                                    org.telegram.messenger.np.u1(i132).Z3(starsStatus.chats, false);
                                                    tdVar22.f52258r.addAll(starsStatus.history);
                                                    tdVar22.f52259s = starsStatus.next_offset;
                                                    tdVar22.f52260w[i14] = false;
                                                    tdVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.lc.e0(tL_error2);
                                                    }
                                                }
                                                if (tdVar22.a() != z10 && (cdVar = tdVar22.f52256f) != null) {
                                                    cdVar.run();
                                                }
                                                if (tdVar22.b(i14) != z11) {
                                                    tdVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                td tdVar3 = tdVar;
                                                int i15 = tdVar3.f52252a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i16 = i12;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    org.telegram.messenger.np.u1(i15).f4(starsStatus2.users, false);
                                                    org.telegram.messenger.np.u1(i15).Z3(starsStatus2.chats, false);
                                                    tdVar3.f52257n.addAll(starsStatus2.history);
                                                    tdVar3.h = starsStatus2.next_offset;
                                                    tdVar3.f52260w[i16] = false;
                                                    tdVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.lc.e0(tL_error3);
                                                    }
                                                }
                                                if (tdVar3.a() != z10 && (cdVar2 = tdVar3.f52256f) != null) {
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
                                final td tdVar2 = this.f50545b;
                                final int i13 = i7;
                                final boolean z12 = a10;
                                final boolean z13 = b10;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        cd cdVar;
                                        cd cdVar2;
                                        switch (r7) {
                                            case 0:
                                                td tdVar22 = tdVar2;
                                                int i132 = tdVar22.f52252a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i14 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    org.telegram.messenger.np.u1(i132).f4(starsStatus.users, false);
                                                    org.telegram.messenger.np.u1(i132).Z3(starsStatus.chats, false);
                                                    tdVar22.f52258r.addAll(starsStatus.history);
                                                    tdVar22.f52259s = starsStatus.next_offset;
                                                    tdVar22.f52260w[i14] = false;
                                                    tdVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.lc.e0(tL_error2);
                                                    }
                                                }
                                                if (tdVar22.a() != z12 && (cdVar = tdVar22.f52256f) != null) {
                                                    cdVar.run();
                                                }
                                                if (tdVar22.b(i14) != z13) {
                                                    tdVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                td tdVar3 = tdVar2;
                                                int i15 = tdVar3.f52252a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i16 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    org.telegram.messenger.np.u1(i15).f4(starsStatus2.users, false);
                                                    org.telegram.messenger.np.u1(i15).Z3(starsStatus2.chats, false);
                                                    tdVar3.f52257n.addAll(starsStatus2.history);
                                                    tdVar3.h = starsStatus2.next_offset;
                                                    tdVar3.f52260w[i16] = false;
                                                    tdVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.lc.e0(tL_error3);
                                                    }
                                                }
                                                if (tdVar3.a() != z12 && (cdVar2 = tdVar3.f52256f) != null) {
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
        int i7 = 0;
        while (true) {
            qd qdVar = this.f52253b;
            if (i7 < qdVar.getViewPages().length) {
                View view = qdVar.getViewPages()[i7];
                if (view instanceof rd) {
                    rd rdVar = (rd) view;
                    org.telegram.ui.Components.h51 h51Var = rdVar.f51588a;
                    h51Var.f35742g3.O(true);
                    if (h51Var.canScrollVertically(1)) {
                        for (int i10 = 0; i10 < h51Var.getChildCount(); i10++) {
                            if (!(h51Var.getChildAt(i10) instanceof org.telegram.ui.Components.yz)) {
                            }
                        }
                    }
                    rdVar.f51591e.run();
                    break;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        int h;
        sd sdVar = this.f52254c;
        ArrayList arrayList = sdVar.f51996e;
        ArrayList arrayList2 = sdVar.f51996e;
        int size = arrayList.size();
        qd qdVar = this.f52253b;
        if (size == 0) {
            h = -1;
        } else {
            h = sdVar.h(qdVar.getCurrentPosition());
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            i7 |= 1 << sdVar.h(i10);
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
        if (i7 == i11) {
            return;
        }
        qdVar.onTouchEvent(null);
        qdVar.setPosition(i12);
        qdVar.F();
        qdVar.j(false);
        this.f52261x.p();
    }

    public org.telegram.ui.Components.ek0 getCurrentListView() {
        View currentView = this.f52253b.getCurrentView();
        if (!(currentView instanceof rd)) {
            return null;
        }
        return ((rd) currentView).f51588a;
    }
}
