package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;
public final class qy0 extends org.telegram.ui.ActionBar.x2 {
    public static final int f51336w1 = 0;
    public final hi.i1 f51337m1;
    public final Paint n1;
    public int f51338o1;
    public final boolean f51339p1;
    public final boolean f51340q1;
    public final boolean f51341r1;
    public final ArrayList f51342s1;
    public final byte[] f51343t1;
    public final long f51344u1;
    public ly0 f51345v1;

    public qy0(Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, byte[] bArr) {
        this(true, context, i6Var, j3, false, false, null, bArr);
    }

    public static void J0(qy0 qy0Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = qy0Var.f51344u1;
        ArrayList arrayList = qy0Var.f51342s1;
        if (qy0Var.f51339p1) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = qy0Var.f51343t1;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (qy0Var.f51340q1) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.mp.u1(qy0Var.f30187a).l1(j3);
                if (arrayList != null) {
                    tL_stories_report.f28654id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (qy0Var.f51341r1) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.mp.u1(qy0Var.f30187a).l1(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f28622id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = org.telegram.messenger.mp.u1(qy0Var.f30187a).l1(j3);
                if (arrayList != null) {
                    tL_messages_report2.f28509id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_messages_report2.message = str2;
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
            r02 = tL_messages_report;
        }
        ConnectionsManager.getInstance(qy0Var.f30187a).sendRequest(r02, new bi.g2(qy0Var, charSequence, bArr, str, 18));
    }

    public static void K0(int i7, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.lc lcVar, final org.telegram.ui.ActionBar.i6 i6Var, byte[] bArr, String str, final org.telegram.messenger.x10 x10Var) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.mp.u1(i7).l1(j3);
                tL_stories_report.f28654id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report2 = tL_stories_report;
            } else if (z11) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.mp.u1(i7).l1(j3);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.f28622id = ((Integer) arrayList.get(0)).intValue();
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
                ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(1), new org.telegram.messenger.q10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                        boolean[] zArr2 = zArr;
                        org.telegram.messenger.x10 x10Var2 = x10Var;
                        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                            org.telegram.messenger.g0.h3(new di.f8(1, x10Var2, zArr2), 200L);
                            return;
                        }
                        qy0 qy0Var = new qy0(false, context, i6Var, j3, z10, z11, arrayList, null);
                        if (z12) {
                            qy0Var.P0((TLRPC.TL_reportResultChooseOption) reportResult);
                        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                            View[] viewPages = qy0Var.f51337m1.getViewPages();
                            View view = viewPages[0];
                            if (view instanceof py0) {
                                ((py0) view).a(0);
                                qy0Var.f30190b.post(new tr0(23, viewPages, tL_reportResultAddComment));
                            }
                            View view2 = viewPages[1];
                            if (view2 instanceof py0) {
                                ((py0) view2).a(1);
                            }
                        }
                        qy0Var.f51345v1 = new nd0(zArr2, x10Var2, lcVar, 1);
                        qy0Var.n(new di.f8(2, x10Var2, zArr2));
                        qy0Var.show();
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = org.telegram.messenger.mp.u1(i7).l1(j3);
                tL_messages_report3.f28509id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_messages_report3.message = str2;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(1), new org.telegram.messenger.q10() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                    boolean[] zArr2 = zArr;
                    org.telegram.messenger.x10 x10Var2 = x10Var;
                    if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                        org.telegram.messenger.g0.h3(new di.f8(1, x10Var2, zArr2), 200L);
                        return;
                    }
                    qy0 qy0Var = new qy0(false, context, i6Var, j3, z10, z11, arrayList, null);
                    if (z12) {
                        qy0Var.P0((TLRPC.TL_reportResultChooseOption) reportResult);
                    } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                        TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                        View[] viewPages = qy0Var.f51337m1.getViewPages();
                        View view = viewPages[0];
                        if (view instanceof py0) {
                            ((py0) view).a(0);
                            qy0Var.f30190b.post(new tr0(23, viewPages, tL_reportResultAddComment));
                        }
                        View view2 = viewPages[1];
                        if (view2 instanceof py0) {
                            ((py0) view2).a(1);
                        }
                    }
                    qy0Var.f51345v1 = new nd0(zArr2, x10Var2, lcVar, 1);
                    qy0Var.n(new di.f8(2, x10Var2, zArr2));
                    qy0Var.show();
                }
            });
        }
    }

    public static void L0(long j3, org.telegram.ui.ActionBar.h2 h2Var) {
        int currentAccount = h2Var.getCurrentAccount();
        Context context = h2Var.getContext();
        if (context == null) {
            return;
        }
        K0(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void M0(bn bnVar, org.telegram.messenger.fj fjVar) {
        int e12;
        int currentAccount = bnVar.getCurrentAccount();
        Activity parentActivity = bnVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (org.telegram.messenger.fj.c3(fjVar.f23965k)) {
            e12 = fjVar.P0();
        } else {
            e12 = fjVar.e1();
        }
        K0(currentAccount, parentActivity, org.telegram.messenger.fj.B0(fjVar.f23965k), false, org.telegram.messenger.fj.c3(fjVar.f23965k), new ArrayList(Collections.singleton(Integer.valueOf(e12))), org.telegram.ui.Components.lc.b0(bnVar), bnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void N0(bn bnVar, org.telegram.messenger.fj fjVar, org.telegram.ui.ActionBar.i6 i6Var) {
        int currentAccount = bnVar.getCurrentAccount();
        Activity parentActivity = bnVar.getParentActivity();
        long a10 = bnVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = fjVar.R0;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ii.f(parentActivity, i6Var, a10, bArr, bnVar, fjVar, currentAccount));
    }

    @Override
    public final boolean G() {
        View currentView = this.f51337m1.getCurrentView();
        if (!(currentView instanceof py0)) {
            return true;
        }
        return !((py0) currentView).f50961f.canScrollVertically(-1);
    }

    public final void O0(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f51337m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof py0) {
            ((py0) view).a(0);
            this.f30190b.post(new tr0(22, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof py0) {
            ((py0) view2).a(1);
        }
    }

    public final void P0(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f51337m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof py0) {
            ((py0) view).a(0);
            this.f30190b.post(new tr0(24, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof py0) {
            ((py0) view2).a(1);
        }
    }

    @Override
    public final void onBackPressed() {
        ny0 ny0Var;
        hi.i1 i1Var = this.f51337m1;
        if ((i1Var.getCurrentView() instanceof py0) && (ny0Var = ((py0) i1Var.getCurrentView()).f50962n) != null) {
            org.telegram.messenger.g0.v1(ny0Var);
        }
        if (i1Var.getCurrentPosition() > 0) {
            i1Var.A(i1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        int i7;
        Paint paint = this.n1;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, this.J0);
            if (paint.getColor() != w02) {
                paint.setColor(w02);
                ViewGroup viewGroup = this.f30190b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            if (this.G0 < 0 && (i7 = this.H0) == this.f51338o1 && w02 != i7) {
                this.H0 = w02;
                this.f51338o1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public qy0(boolean z10, Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, i6Var, true);
        Paint paint = new Paint(1);
        this.n1 = paint;
        this.f51339p1 = z10;
        this.f51342s1 = arrayList;
        this.f51340q1 = z11;
        this.f51341r1 = z12;
        this.f51343t1 = bArr;
        this.f51344u1 = j3;
        int i7 = org.telegram.ui.ActionBar.n6.f29467h5;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        Q(i7);
        this.f51338o1 = this.H0;
        this.Q0 = true;
        this.R0 = true;
        this.f30190b = new y50(this, context);
        hi.i1 i1Var = new hi.i1(6, context, this);
        this.f51337m1 = i1Var;
        int i10 = this.f30225u0;
        i1Var.setPadding(i10, 0, i10, 0);
        this.f30190b.addView(i1Var, c8.ma.e(-1, -1, 119));
        i1Var.setAdapter(new di.i4(5, context, this));
        if (arrayList == null && bArr == null) {
            if (z10) {
                O0(null);
            } else {
                P0(null);
            }
        }
    }
}
