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
    public static final int f51554y = 0;
    public final int f51555a;
    public final qd f51556b;
    public final sd f51557c;
    public final k0 d;
    public final long f51558e;
    public final cd f51559f;
    public String h;
    public final ArrayList f51560n;
    public final ArrayList f51561r;
    public String f51562s;
    public final boolean[] f51563w;
    public final xd f51564x;

    public td(xd xdVar, Context context, int i7, long j3, int i10, cd cdVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f51564x = xdVar;
        this.h = "";
        this.f51560n = new ArrayList();
        this.f51561r = new ArrayList();
        this.f51562s = "";
        this.f51563w = new boolean[]{false, false};
        this.f51555a = i7;
        this.f51558e = j3;
        this.f51559f = cdVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        qd qdVar = new qd(this, context, e6Var, xdVar);
        this.f51556b = qdVar;
        sd sdVar = new sd(this, context, i7, j3, i10, e6Var);
        this.f51557c = sdVar;
        qdVar.setAdapter(sdVar);
        org.telegram.ui.Components.v61 i11 = qdVar.i(-2, true);
        ri.q qVar = xdVar.f53181e1;
        if (qVar != null) {
            qVar.c(qdVar);
        }
        k0 k0Var = new k0(5, context, this);
        this.d = k0Var;
        k0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        k0Var.addView(i11, c8.ja.e(-1, 48, 48));
        addView(qdVar, c8.ja.o(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.f51560n.isEmpty() && this.f51561r.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i7) {
        boolean isEmpty;
        if (i7 == 1) {
            isEmpty = this.f51560n.isEmpty();
        } else if (i7 == 0) {
            isEmpty = this.f51561r.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i7) {
        boolean[] zArr = this.f51563w;
        if (!zArr[i7]) {
            final boolean a10 = a();
            final boolean b10 = b(i7);
            int i10 = 20;
            long j3 = this.f51558e;
            xd xdVar = this.f51564x;
            int i11 = this.f51555a;
            if (i7 == 1) {
                if (this.h != null && xdVar.f53179c1) {
                    zArr[i7] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = org.telegram.messenger.np.s1(i11).j1(j3);
                    tL_payments_getStarsTransactions.offset = this.h;
                    if (this.f51560n.isEmpty()) {
                        i10 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i10;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final td f49929b;

                        {
                            this.f49929b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final td tdVar = this.f49929b;
                                    final int i12 = i7;
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
                                                    int i13 = tdVar2.f51555a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i14 = i12;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        org.telegram.messenger.np.s1(i13).Y3(starsStatus.users, false);
                                                        org.telegram.messenger.np.s1(i13).S3(starsStatus.chats, false);
                                                        tdVar2.f51561r.addAll(starsStatus.history);
                                                        tdVar2.f51562s = starsStatus.next_offset;
                                                        tdVar2.f51563w[i14] = false;
                                                        tdVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.cc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (tdVar2.a() != z10 && (cdVar = tdVar2.f51559f) != null) {
                                                        cdVar.run();
                                                    }
                                                    if (tdVar2.b(i14) != z11) {
                                                        tdVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    td tdVar3 = tdVar;
                                                    int i15 = tdVar3.f51555a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i16 = i12;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        org.telegram.messenger.np.s1(i15).Y3(starsStatus2.users, false);
                                                        org.telegram.messenger.np.s1(i15).S3(starsStatus2.chats, false);
                                                        tdVar3.f51560n.addAll(starsStatus2.history);
                                                        tdVar3.h = starsStatus2.next_offset;
                                                        tdVar3.f51563w[i16] = false;
                                                        tdVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.cc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (tdVar3.a() != z10 && (cdVar2 = tdVar3.f51559f) != null) {
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
                                    final td tdVar2 = this.f49929b;
                                    final int i13 = i7;
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
                                                    int i132 = tdVar22.f51555a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i14 = i13;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        org.telegram.messenger.np.s1(i132).Y3(starsStatus.users, false);
                                                        org.telegram.messenger.np.s1(i132).S3(starsStatus.chats, false);
                                                        tdVar22.f51561r.addAll(starsStatus.history);
                                                        tdVar22.f51562s = starsStatus.next_offset;
                                                        tdVar22.f51563w[i14] = false;
                                                        tdVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.cc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (tdVar22.a() != z12 && (cdVar = tdVar22.f51559f) != null) {
                                                        cdVar.run();
                                                    }
                                                    if (tdVar22.b(i14) != z13) {
                                                        tdVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    td tdVar3 = tdVar2;
                                                    int i15 = tdVar3.f51555a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i16 = i13;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        org.telegram.messenger.np.s1(i15).Y3(starsStatus2.users, false);
                                                        org.telegram.messenger.np.s1(i15).S3(starsStatus2.chats, false);
                                                        tdVar3.f51560n.addAll(starsStatus2.history);
                                                        tdVar3.h = starsStatus2.next_offset;
                                                        tdVar3.f51563w[i16] = false;
                                                        tdVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.cc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (tdVar3.a() != z12 && (cdVar2 = tdVar3.f51559f) != null) {
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
            } else if (i7 == 0 && this.f51562s != null && xdVar.f53180d1) {
                zArr[i7] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = org.telegram.messenger.np.s1(i11).j1(j3);
                tL_payments_getStarsTransactions2.offset = this.f51562s;
                if (this.f51561r.isEmpty()) {
                    i10 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i10;
                ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final td f49929b;

                    {
                        this.f49929b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final td tdVar = this.f49929b;
                                final int i12 = i7;
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
                                                int i132 = tdVar22.f51555a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i14 = i12;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    org.telegram.messenger.np.s1(i132).Y3(starsStatus.users, false);
                                                    org.telegram.messenger.np.s1(i132).S3(starsStatus.chats, false);
                                                    tdVar22.f51561r.addAll(starsStatus.history);
                                                    tdVar22.f51562s = starsStatus.next_offset;
                                                    tdVar22.f51563w[i14] = false;
                                                    tdVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.cc.d0(tL_error2);
                                                    }
                                                }
                                                if (tdVar22.a() != z10 && (cdVar = tdVar22.f51559f) != null) {
                                                    cdVar.run();
                                                }
                                                if (tdVar22.b(i14) != z11) {
                                                    tdVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                td tdVar3 = tdVar;
                                                int i15 = tdVar3.f51555a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i16 = i12;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    org.telegram.messenger.np.s1(i15).Y3(starsStatus2.users, false);
                                                    org.telegram.messenger.np.s1(i15).S3(starsStatus2.chats, false);
                                                    tdVar3.f51560n.addAll(starsStatus2.history);
                                                    tdVar3.h = starsStatus2.next_offset;
                                                    tdVar3.f51563w[i16] = false;
                                                    tdVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.cc.d0(tL_error3);
                                                    }
                                                }
                                                if (tdVar3.a() != z10 && (cdVar2 = tdVar3.f51559f) != null) {
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
                                final td tdVar2 = this.f49929b;
                                final int i13 = i7;
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
                                                int i132 = tdVar22.f51555a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i14 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    org.telegram.messenger.np.s1(i132).Y3(starsStatus.users, false);
                                                    org.telegram.messenger.np.s1(i132).S3(starsStatus.chats, false);
                                                    tdVar22.f51561r.addAll(starsStatus.history);
                                                    tdVar22.f51562s = starsStatus.next_offset;
                                                    tdVar22.f51563w[i14] = false;
                                                    tdVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.cc.d0(tL_error2);
                                                    }
                                                }
                                                if (tdVar22.a() != z12 && (cdVar = tdVar22.f51559f) != null) {
                                                    cdVar.run();
                                                }
                                                if (tdVar22.b(i14) != z13) {
                                                    tdVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                td tdVar3 = tdVar2;
                                                int i15 = tdVar3.f51555a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i16 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    org.telegram.messenger.np.s1(i15).Y3(starsStatus2.users, false);
                                                    org.telegram.messenger.np.s1(i15).S3(starsStatus2.chats, false);
                                                    tdVar3.f51560n.addAll(starsStatus2.history);
                                                    tdVar3.h = starsStatus2.next_offset;
                                                    tdVar3.f51563w[i16] = false;
                                                    tdVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.cc.d0(tL_error3);
                                                    }
                                                }
                                                if (tdVar3.a() != z12 && (cdVar2 = tdVar3.f51559f) != null) {
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
            qd qdVar = this.f51556b;
            if (i7 < qdVar.getViewPages().length) {
                View view = qdVar.getViewPages()[i7];
                if (view instanceof rd) {
                    rd rdVar = (rd) view;
                    org.telegram.ui.Components.u41 u41Var = rdVar.f50927a;
                    u41Var.f39892g3.O(true);
                    if (u41Var.canScrollVertically(1)) {
                        for (int i10 = 0; i10 < u41Var.getChildCount(); i10++) {
                            if (!(u41Var.getChildAt(i10) instanceof org.telegram.ui.Components.pz)) {
                            }
                        }
                    }
                    rdVar.f50930e.run();
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
        sd sdVar = this.f51557c;
        ArrayList arrayList = sdVar.f51200e;
        ArrayList arrayList2 = sdVar.f51200e;
        int size = arrayList.size();
        qd qdVar = this.f51556b;
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
        qdVar.H();
        qdVar.k(false);
        this.f51564x.p();
    }

    public org.telegram.ui.Components.uj0 getCurrentListView() {
        View currentView = this.f51556b.getCurrentView();
        if (!(currentView instanceof rd)) {
            return null;
        }
        return ((rd) currentView).f50927a;
    }
}
