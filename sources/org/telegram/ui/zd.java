package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zd extends LinearLayout {
    public final int f45138a;
    public final org.telegram.ui.Components.z71 f45139b;
    public final yd f45140c;
    public final long d;
    public final jd f45141e;
    public String f45142f;
    public final ArrayList h;
    public final ArrayList f45143n;
    public String f45144r;
    public final boolean[] f45145s;
    public final de v;

    public zd(de deVar, Context context, int i10, long j10, int i11, jd jdVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.v = deVar;
        this.f45142f = "";
        this.h = new ArrayList();
        this.f45143n = new ArrayList();
        this.f45144r = "";
        this.f45145s = new boolean[]{false, false};
        this.f45138a = i10;
        this.d = j10;
        this.f45141e = jdVar;
        setOrientation(1);
        org.telegram.ui.Components.z71 z71Var = new org.telegram.ui.Components.z71(context, null);
        this.f45139b = z71Var;
        yd ydVar = new yd(this, context, i10, j10, i11, c6Var);
        this.f45140c = ydVar;
        z71Var.setAdapter(ydVar);
        View n10 = z71Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, c6Var));
        addView(n10, i7.f6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(i7.f6.z(-1.0f), i7.f6.z(1.0f / AndroidUtilities.density)));
        addView(z71Var, i7.f6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        if (this.h.isEmpty() && this.f45143n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else if (i10 == 0) {
            isEmpty = this.f45143n.isEmpty();
        } else {
            return false;
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.f45145s;
        if (!zArr[i10]) {
            final boolean a2 = a();
            final boolean b10 = b(i10);
            int i11 = 20;
            long j10 = this.d;
            de deVar = this.v;
            int i12 = this.f45138a;
            if (i10 == 1) {
                if (this.f45142f != null && deVar.f37505b1) {
                    zArr[i10] = true;
                    TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                    tL_payments_getStarsTransactions.ton = true;
                    tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                    tL_payments_getStarsTransactions.offset = this.f45142f;
                    if (this.h.isEmpty()) {
                        i11 = 5;
                    }
                    tL_payments_getStarsTransactions.limit = i11;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                        public final zd f43548b;

                        {
                            this.f43548b = this;
                        }

                        @Override
                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                            switch (r5) {
                                case 0:
                                    final zd zdVar = this.f43548b;
                                    final int i13 = i10;
                                    final boolean z10 = a2;
                                    final boolean z11 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            jd jdVar;
                                            jd jdVar2;
                                            switch (r7) {
                                                case 0:
                                                    zd zdVar2 = zdVar;
                                                    int i14 = zdVar2.f45138a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i13;
                                                    if (z12) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i14).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i14).putChats(starsStatus.chats, false);
                                                        zdVar2.f45143n.addAll(starsStatus.history);
                                                        zdVar2.f45144r = starsStatus.next_offset;
                                                        zdVar2.f45145s[i15] = false;
                                                        zdVar2.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.tc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (zdVar2.a() != z10 && (jdVar = zdVar2.f45141e) != null) {
                                                        jdVar.run();
                                                    }
                                                    if (zdVar2.b(i15) != z11) {
                                                        zdVar2.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    zd zdVar3 = zdVar;
                                                    int i16 = zdVar3.f45138a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i13;
                                                    if (z13) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        zdVar3.h.addAll(starsStatus2.history);
                                                        zdVar3.f45142f = starsStatus2.next_offset;
                                                        zdVar3.f45145s[i17] = false;
                                                        zdVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.tc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (zdVar3.a() != z10 && (jdVar2 = zdVar3.f45141e) != null) {
                                                        jdVar2.run();
                                                    }
                                                    if (zdVar3.b(i17) != z11) {
                                                        zdVar3.e();
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final zd zdVar2 = this.f43548b;
                                    final int i14 = i10;
                                    final boolean z12 = a2;
                                    final boolean z13 = b10;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            jd jdVar;
                                            jd jdVar2;
                                            switch (r7) {
                                                case 0:
                                                    zd zdVar22 = zdVar2;
                                                    int i142 = zdVar22.f45138a;
                                                    TLObject tLObject2 = tLObject;
                                                    boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                    int i15 = i14;
                                                    if (z122) {
                                                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                        MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                        MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                        zdVar22.f45143n.addAll(starsStatus.history);
                                                        zdVar22.f45144r = starsStatus.next_offset;
                                                        zdVar22.f45145s[i15] = false;
                                                        zdVar22.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                        if (tL_error2 != null) {
                                                            org.telegram.ui.Components.tc.b0(tL_error2);
                                                        }
                                                    }
                                                    if (zdVar22.a() != z12 && (jdVar = zdVar22.f45141e) != null) {
                                                        jdVar.run();
                                                    }
                                                    if (zdVar22.b(i15) != z13) {
                                                        zdVar22.e();
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    zd zdVar3 = zdVar2;
                                                    int i16 = zdVar3.f45138a;
                                                    TLObject tLObject3 = tLObject;
                                                    boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                    int i17 = i14;
                                                    if (z132) {
                                                        TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                        MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                        MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                        zdVar3.h.addAll(starsStatus2.history);
                                                        zdVar3.f45142f = starsStatus2.next_offset;
                                                        zdVar3.f45145s[i17] = false;
                                                        zdVar3.d();
                                                    } else {
                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                        if (tL_error3 != null) {
                                                            org.telegram.ui.Components.tc.b0(tL_error3);
                                                        }
                                                    }
                                                    if (zdVar3.a() != z12 && (jdVar2 = zdVar3.f45141e) != null) {
                                                        jdVar2.run();
                                                    }
                                                    if (zdVar3.b(i17) != z13) {
                                                        zdVar3.e();
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
            } else if (i10 == 0 && this.f45144r != null && deVar.f37506c1) {
                zArr[i10] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                tL_payments_getStarsTransactions2.offset = this.f45144r;
                if (this.f45143n.isEmpty()) {
                    i11 = 5;
                }
                tL_payments_getStarsTransactions2.limit = i11;
                ConnectionsManager.getInstance(i12).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final zd f43548b;

                    {
                        this.f43548b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r5) {
                            case 0:
                                final zd zdVar = this.f43548b;
                                final int i13 = i10;
                                final boolean z10 = a2;
                                final boolean z11 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        jd jdVar;
                                        jd jdVar2;
                                        switch (r7) {
                                            case 0:
                                                zd zdVar22 = zdVar;
                                                int i142 = zdVar22.f45138a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i13;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    zdVar22.f45143n.addAll(starsStatus.history);
                                                    zdVar22.f45144r = starsStatus.next_offset;
                                                    zdVar22.f45145s[i15] = false;
                                                    zdVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.tc.b0(tL_error2);
                                                    }
                                                }
                                                if (zdVar22.a() != z10 && (jdVar = zdVar22.f45141e) != null) {
                                                    jdVar.run();
                                                }
                                                if (zdVar22.b(i15) != z11) {
                                                    zdVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                zd zdVar3 = zdVar;
                                                int i16 = zdVar3.f45138a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i13;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    zdVar3.h.addAll(starsStatus2.history);
                                                    zdVar3.f45142f = starsStatus2.next_offset;
                                                    zdVar3.f45145s[i17] = false;
                                                    zdVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.tc.b0(tL_error3);
                                                    }
                                                }
                                                if (zdVar3.a() != z10 && (jdVar2 = zdVar3.f45141e) != null) {
                                                    jdVar2.run();
                                                }
                                                if (zdVar3.b(i17) != z11) {
                                                    zdVar3.e();
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final zd zdVar2 = this.f43548b;
                                final int i14 = i10;
                                final boolean z12 = a2;
                                final boolean z13 = b10;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        jd jdVar;
                                        jd jdVar2;
                                        switch (r7) {
                                            case 0:
                                                zd zdVar22 = zdVar2;
                                                int i142 = zdVar22.f45138a;
                                                TLObject tLObject2 = tLObject;
                                                boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i15 = i14;
                                                if (z122) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    MessagesController.getInstance(i142).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i142).putChats(starsStatus.chats, false);
                                                    zdVar22.f45143n.addAll(starsStatus.history);
                                                    zdVar22.f45144r = starsStatus.next_offset;
                                                    zdVar22.f45145s[i15] = false;
                                                    zdVar22.d();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        org.telegram.ui.Components.tc.b0(tL_error2);
                                                    }
                                                }
                                                if (zdVar22.a() != z12 && (jdVar = zdVar22.f45141e) != null) {
                                                    jdVar.run();
                                                }
                                                if (zdVar22.b(i15) != z13) {
                                                    zdVar22.e();
                                                    return;
                                                }
                                                return;
                                            default:
                                                zd zdVar3 = zdVar2;
                                                int i16 = zdVar3.f45138a;
                                                TLObject tLObject3 = tLObject;
                                                boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i17 = i14;
                                                if (z132) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    MessagesController.getInstance(i16).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i16).putChats(starsStatus2.chats, false);
                                                    zdVar3.h.addAll(starsStatus2.history);
                                                    zdVar3.f45142f = starsStatus2.next_offset;
                                                    zdVar3.f45145s[i17] = false;
                                                    zdVar3.d();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        org.telegram.ui.Components.tc.b0(tL_error3);
                                                    }
                                                }
                                                if (zdVar3.a() != z12 && (jdVar2 = zdVar3.f45141e) != null) {
                                                    jdVar2.run();
                                                }
                                                if (zdVar3.b(i17) != z13) {
                                                    zdVar3.e();
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
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.z71 z71Var = this.f45139b;
            if (i10 < z71Var.getViewPages().length) {
                View view = z71Var.getViewPages()[i10];
                if (view instanceof xd) {
                    xd xdVar = (xd) view;
                    org.telegram.ui.Components.u51 u51Var = xdVar.f44553a;
                    u51Var.U2.N(true);
                    if (u51Var.canScrollVertically(1)) {
                        for (int i11 = 0; i11 < u51Var.getChildCount(); i11++) {
                            if (!(u51Var.getChildAt(i11) instanceof org.telegram.ui.Components.p00)) {
                            }
                        }
                    }
                    xdVar.f44556e.run();
                    break;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e() {
        this.f45140c.i();
        org.telegram.ui.Components.z71 z71Var = this.f45139b;
        z71Var.o(false);
        View[] viewArr = z71Var.f35261e;
        int[] iArr = z71Var.f35262f;
        if (iArr[0] != z71Var.H.h(z71Var.f35259b)) {
            z71Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                z71Var.h.put(iArr[1], view);
                z71Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.jl0 getCurrentListView() {
        View currentView = this.f45139b.getCurrentView();
        if (!(currentView instanceof xd)) {
            return null;
        }
        return ((xd) currentView).f44553a;
    }
}
