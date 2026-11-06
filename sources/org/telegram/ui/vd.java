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
public final class vd extends LinearLayout {
    public static final int f50689y = 0;
    public final int f50690a;
    public final sd f50691b;
    public final ud f50692c;
    public final k0 d;
    public final long f50693e;
    public final dd f50694f;
    public String h;
    public final ArrayList f50695n;
    public final ArrayList f50696r;
    public String f50697s;
    public final boolean[] f50698w;
    public final zd f50699x;

    public vd(zd zdVar, Context context, int i7, long j3, int i10, dd ddVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f50699x = zdVar;
        this.h = "";
        this.f50695n = new ArrayList();
        this.f50696r = new ArrayList();
        this.f50697s = "";
        this.f50698w = new boolean[]{false, false};
        this.f50690a = i7;
        this.f50693e = j3;
        this.f50694f = ddVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        sd sdVar = new sd(this, context, f6Var, zdVar);
        this.f50691b = sdVar;
        ud udVar = new ud(this, context, i7, j3, i10, f6Var);
        this.f50692c = udVar;
        sdVar.setAdapter(udVar);
        org.telegram.ui.Components.o61 n10 = sdVar.n(-2, true);
        oi.q qVar = zdVar.f52527d1;
        if (qVar != null) {
            qVar.c(sdVar);
        }
        k0 k0Var = new k0(5, context, this);
        this.d = k0Var;
        k0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        k0Var.addView(n10, c8.ha.e(-1, 48, 48));
        addView(sdVar, c8.ha.o(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.f50695n.isEmpty() && this.f50696r.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i7) {
        boolean isEmpty;
        if (i7 == 1) {
            isEmpty = this.f50695n.isEmpty();
        } else if (i7 == 0) {
            isEmpty = this.f50696r.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i7) {
        boolean[] zArr = this.f50698w;
        if (!zArr[i7]) {
            final boolean a10 = a();
            final boolean b10 = b(i7);
            int i10 = 20;
            long j3 = this.f50693e;
            zd zdVar = this.f50699x;
            int i11 = this.f50690a;
            if (i7 == 1) {
                if (this.h != null && zdVar.f52525b1) {
                    zArr[i7] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = org.telegram.messenger.qp.s1(i11).j1(j3);
                    tL_payments_getStarsTransactions.offset = this.h;
                    if (this.f50695n.isEmpty()) {
                        i10 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i10;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final vd f49176b;

                        {
                            this.f49176b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final vd vdVar = this.f49176b;
                                    final int i12 = i7;
                                    final boolean z9 = a10;
                                    final boolean z10 = b10;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            dd ddVar;
                                            dd ddVar2;
                                            switch (r7) {
                                                case 0:
                                                    vd vdVar2 = vdVar;
                                                    int i13 = vdVar2.f50690a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z11 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i14 = i12;
                                                    if (z11) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        org.telegram.messenger.qp.s1(i13).Y3(starsStatus.users, false);
                                                        org.telegram.messenger.qp.s1(i13).S3(starsStatus.chats, false);
                                                        vdVar2.f50696r.addAll(starsStatus.history);
                                                        vdVar2.f50697s = starsStatus.next_offset;
                                                        vdVar2.f50698w[i14] = false;
                                                        vdVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.hc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (vdVar2.a() != z9 && (ddVar = vdVar2.f50694f) != null) {
                                                        ddVar.run();
                                                    }
                                                    if (vdVar2.b(i14) != z10) {
                                                        vdVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    vd vdVar3 = vdVar;
                                                    int i15 = vdVar3.f50690a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z12 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i16 = i12;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        org.telegram.messenger.qp.s1(i15).Y3(starsStatus2.users, false);
                                                        org.telegram.messenger.qp.s1(i15).S3(starsStatus2.chats, false);
                                                        vdVar3.f50695n.addAll(starsStatus2.history);
                                                        vdVar3.h = starsStatus2.next_offset;
                                                        vdVar3.f50698w[i16] = false;
                                                        vdVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.hc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (vdVar3.a() != z9 && (ddVar2 = vdVar3.f50694f) != null) {
                                                        ddVar2.run();
                                                    }
                                                    if (vdVar3.b(i16) != z10) {
                                                        vdVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final vd vdVar2 = this.f49176b;
                                    final int i13 = i7;
                                    final boolean z11 = a10;
                                    final boolean z12 = b10;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            dd ddVar;
                                            dd ddVar2;
                                            switch (r7) {
                                                case 0:
                                                    vd vdVar22 = vdVar2;
                                                    int i132 = vdVar22.f50690a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i14 = i13;
                                                    if (z112) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        org.telegram.messenger.qp.s1(i132).Y3(starsStatus.users, false);
                                                        org.telegram.messenger.qp.s1(i132).S3(starsStatus.chats, false);
                                                        vdVar22.f50696r.addAll(starsStatus.history);
                                                        vdVar22.f50697s = starsStatus.next_offset;
                                                        vdVar22.f50698w[i14] = false;
                                                        vdVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.hc.d0(tL_error2);
                                                        }
                                                    }
                                                    if (vdVar22.a() != z11 && (ddVar = vdVar22.f50694f) != null) {
                                                        ddVar.run();
                                                    }
                                                    if (vdVar22.b(i14) != z12) {
                                                        vdVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    vd vdVar3 = vdVar2;
                                                    int i15 = vdVar3.f50690a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i16 = i13;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        org.telegram.messenger.qp.s1(i15).Y3(starsStatus2.users, false);
                                                        org.telegram.messenger.qp.s1(i15).S3(starsStatus2.chats, false);
                                                        vdVar3.f50695n.addAll(starsStatus2.history);
                                                        vdVar3.h = starsStatus2.next_offset;
                                                        vdVar3.f50698w[i16] = false;
                                                        vdVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.hc.d0(tL_error3);
                                                        }
                                                    }
                                                    if (vdVar3.a() != z11 && (ddVar2 = vdVar3.f50694f) != null) {
                                                        ddVar2.run();
                                                    }
                                                    if (vdVar3.b(i16) != z12) {
                                                        vdVar3.e();
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
            } else if (i7 == 0 && this.f50697s != null && zdVar.f52526c1) {
                zArr[i7] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = org.telegram.messenger.qp.s1(i11).j1(j3);
                tL_payments_getStarsTransactions2.offset = this.f50697s;
                if (this.f50696r.isEmpty()) {
                    i10 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i10;
                ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final vd f49176b;

                    {
                        this.f49176b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final vd vdVar = this.f49176b;
                                final int i12 = i7;
                                final boolean z9 = a10;
                                final boolean z10 = b10;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        dd ddVar;
                                        dd ddVar2;
                                        switch (r7) {
                                            case 0:
                                                vd vdVar22 = vdVar;
                                                int i132 = vdVar22.f50690a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i14 = i12;
                                                if (z112) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    org.telegram.messenger.qp.s1(i132).Y3(starsStatus.users, false);
                                                    org.telegram.messenger.qp.s1(i132).S3(starsStatus.chats, false);
                                                    vdVar22.f50696r.addAll(starsStatus.history);
                                                    vdVar22.f50697s = starsStatus.next_offset;
                                                    vdVar22.f50698w[i14] = false;
                                                    vdVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.hc.d0(tL_error2);
                                                    }
                                                }
                                                if (vdVar22.a() != z9 && (ddVar = vdVar22.f50694f) != null) {
                                                    ddVar.run();
                                                }
                                                if (vdVar22.b(i14) != z10) {
                                                    vdVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                vd vdVar3 = vdVar;
                                                int i15 = vdVar3.f50690a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i16 = i12;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    org.telegram.messenger.qp.s1(i15).Y3(starsStatus2.users, false);
                                                    org.telegram.messenger.qp.s1(i15).S3(starsStatus2.chats, false);
                                                    vdVar3.f50695n.addAll(starsStatus2.history);
                                                    vdVar3.h = starsStatus2.next_offset;
                                                    vdVar3.f50698w[i16] = false;
                                                    vdVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.hc.d0(tL_error3);
                                                    }
                                                }
                                                if (vdVar3.a() != z9 && (ddVar2 = vdVar3.f50694f) != null) {
                                                    ddVar2.run();
                                                }
                                                if (vdVar3.b(i16) != z10) {
                                                    vdVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final vd vdVar2 = this.f49176b;
                                final int i13 = i7;
                                final boolean z11 = a10;
                                final boolean z12 = b10;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        dd ddVar;
                                        dd ddVar2;
                                        switch (r7) {
                                            case 0:
                                                vd vdVar22 = vdVar2;
                                                int i132 = vdVar22.f50690a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i14 = i13;
                                                if (z112) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    org.telegram.messenger.qp.s1(i132).Y3(starsStatus.users, false);
                                                    org.telegram.messenger.qp.s1(i132).S3(starsStatus.chats, false);
                                                    vdVar22.f50696r.addAll(starsStatus.history);
                                                    vdVar22.f50697s = starsStatus.next_offset;
                                                    vdVar22.f50698w[i14] = false;
                                                    vdVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.hc.d0(tL_error2);
                                                    }
                                                }
                                                if (vdVar22.a() != z11 && (ddVar = vdVar22.f50694f) != null) {
                                                    ddVar.run();
                                                }
                                                if (vdVar22.b(i14) != z12) {
                                                    vdVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                vd vdVar3 = vdVar2;
                                                int i15 = vdVar3.f50690a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i16 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    org.telegram.messenger.qp.s1(i15).Y3(starsStatus2.users, false);
                                                    org.telegram.messenger.qp.s1(i15).S3(starsStatus2.chats, false);
                                                    vdVar3.f50695n.addAll(starsStatus2.history);
                                                    vdVar3.h = starsStatus2.next_offset;
                                                    vdVar3.f50698w[i16] = false;
                                                    vdVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.hc.d0(tL_error3);
                                                    }
                                                }
                                                if (vdVar3.a() != z11 && (ddVar2 = vdVar3.f50694f) != null) {
                                                    ddVar2.run();
                                                }
                                                if (vdVar3.b(i16) != z12) {
                                                    vdVar3.e();
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
            sd sdVar = this.f50691b;
            if (i7 < sdVar.getViewPages().length) {
                View view = sdVar.getViewPages()[i7];
                if (view instanceof td) {
                    td tdVar = (td) view;
                    org.telegram.ui.Components.k41 k41Var = tdVar.f50008a;
                    k41Var.f35167f3.O(true);
                    if (k41Var.canScrollVertically(1)) {
                        for (int i10 = 0; i10 < k41Var.getChildCount(); i10++) {
                            if (!(k41Var.getChildAt(i10) instanceof org.telegram.ui.Components.lz)) {
                            }
                        }
                    }
                    tdVar.f50011e.run();
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
        ud udVar = this.f50692c;
        ArrayList arrayList = udVar.f50379e;
        ArrayList arrayList2 = udVar.f50379e;
        int size = arrayList.size();
        sd sdVar = this.f50691b;
        if (size == 0) {
            h = -1;
        } else {
            h = udVar.h(sdVar.getCurrentPosition());
        }
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            i7 |= 1 << udVar.h(i10);
        }
        udVar.i();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            int h7 = udVar.h(i13);
            i11 |= 1 << h7;
            if (h7 == h) {
                i12 = i13;
            }
        }
        if (i7 == i11) {
            return;
        }
        sdVar.onTouchEvent(null);
        sdVar.setPosition(i12);
        sdVar.J();
        sdVar.o(false);
        this.f50699x.p();
    }

    public org.telegram.ui.Components.pj0 getCurrentListView() {
        View currentView = this.f50691b.getCurrentView();
        if (!(currentView instanceof td)) {
            return null;
        }
        return ((td) currentView).f50008a;
    }
}
