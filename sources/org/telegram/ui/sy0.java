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
public final class sy0 extends org.telegram.ui.ActionBar.w2 {
    public static final int f49991v1 = 0;
    public final fi.g1 l1;
    public final Paint f49992m1;
    public int n1;
    public final boolean f49993o1;
    public final boolean f49994p1;
    public final boolean f49995q1;
    public final ArrayList f49996r1;
    public final byte[] f49997s1;
    public final long f49998t1;
    public ny0 f49999u1;

    public sy0(Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, byte[] bArr) {
        this(true, context, h6Var, j3, false, false, null, bArr);
    }

    public static void I0(sy0 sy0Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = sy0Var.f49998t1;
        ArrayList arrayList = sy0Var.f49996r1;
        if (sy0Var.f49993o1) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = sy0Var.f49997s1;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (sy0Var.f49994p1) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.qp.s1(sy0Var.f28669a).j1(j3);
                if (arrayList != null) {
                    tL_stories_report.f27211id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (sy0Var.f49995q1) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.qp.s1(sy0Var.f28669a).j1(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f27179id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = org.telegram.messenger.qp.s1(sy0Var.f28669a).j1(j3);
                if (arrayList != null) {
                    tL_messages_report2.f27066id.addAll(arrayList);
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
        ConnectionsManager.getInstance(sy0Var.f28669a).sendRequest(r02, new bi.g2(sy0Var, charSequence, bArr, str, 17));
    }

    public static void J0(int i7, final Context context, final long j3, final boolean z9, final boolean z10, final ArrayList arrayList, final org.telegram.ui.Components.gc gcVar, final org.telegram.ui.ActionBar.h6 h6Var, byte[] bArr, String str, final org.telegram.messenger.c20 c20Var) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z9) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
                tL_stories_report.f27211id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report2 = tL_stories_report;
            } else if (z10) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.f27179id = ((Integer) arrayList.get(0)).intValue();
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
                ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(1), new org.telegram.messenger.v10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        boolean z11 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                        boolean[] zArr2 = zArr;
                        org.telegram.messenger.c20 c20Var2 = c20Var;
                        if (!z11 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                            org.telegram.messenger.g0.i3(new bi.l9(1, c20Var2, zArr2), 200L);
                            return;
                        }
                        sy0 sy0Var = new sy0(false, context, h6Var, j3, z9, z10, arrayList, null);
                        if (z11) {
                            sy0Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                            View[] viewPages = sy0Var.l1.getViewPages();
                            View view = viewPages[0];
                            if (view instanceof ry0) {
                                ((ry0) view).a(0);
                                sy0Var.f28672b.post(new rw0(3, viewPages, tL_reportResultAddComment));
                            }
                            View view2 = viewPages[1];
                            if (view2 instanceof ry0) {
                                ((ry0) view2).a(1);
                            }
                        }
                        sy0Var.f49999u1 = new ly0(zArr2, c20Var2, gcVar, 0);
                        sy0Var.n(new bi.l9(2, c20Var2, zArr2));
                        sy0Var.show();
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = org.telegram.messenger.qp.s1(i7).j1(j3);
                tL_messages_report3.f27066id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_messages_report3.message = str2;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(1), new org.telegram.messenger.v10() {
                @Override
                public final void a(Object obj, Object obj2) {
                    TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    boolean z11 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                    boolean[] zArr2 = zArr;
                    org.telegram.messenger.c20 c20Var2 = c20Var;
                    if (!z11 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                        org.telegram.messenger.g0.i3(new bi.l9(1, c20Var2, zArr2), 200L);
                        return;
                    }
                    sy0 sy0Var = new sy0(false, context, h6Var, j3, z9, z10, arrayList, null);
                    if (z11) {
                        sy0Var.O0((TLRPC.TL_reportResultChooseOption) reportResult);
                    } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                        TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                        View[] viewPages = sy0Var.l1.getViewPages();
                        View view = viewPages[0];
                        if (view instanceof ry0) {
                            ((ry0) view).a(0);
                            sy0Var.f28672b.post(new rw0(3, viewPages, tL_reportResultAddComment));
                        }
                        View view2 = viewPages[1];
                        if (view2 instanceof ry0) {
                            ((ry0) view2).a(1);
                        }
                    }
                    sy0Var.f49999u1 = new ly0(zArr2, c20Var2, gcVar, 0);
                    sy0Var.n(new bi.l9(2, c20Var2, zArr2));
                    sy0Var.show();
                }
            });
        }
    }

    public static void K0(long j3, org.telegram.ui.ActionBar.f2 f2Var) {
        int currentAccount = f2Var.getCurrentAccount();
        Context context = f2Var.getContext();
        if (context == null) {
            return;
        }
        J0(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void L0(cn cnVar, org.telegram.messenger.ij ijVar) {
        int e12;
        int currentAccount = cnVar.getCurrentAccount();
        Activity parentActivity = cnVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (org.telegram.messenger.ij.c3(ijVar.f23266k)) {
            e12 = ijVar.P0();
        } else {
            e12 = ijVar.e1();
        }
        J0(currentAccount, parentActivity, org.telegram.messenger.ij.B0(ijVar.f23266k), false, org.telegram.messenger.ij.c3(ijVar.f23266k), new ArrayList(Collections.singleton(Integer.valueOf(e12))), org.telegram.ui.Components.gc.a0(cnVar), cnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void M0(cn cnVar, org.telegram.messenger.ij ijVar, org.telegram.ui.ActionBar.h6 h6Var) {
        int currentAccount = cnVar.getCurrentAccount();
        Activity parentActivity = cnVar.getParentActivity();
        long a10 = cnVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = ijVar.P0;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new hi.w0(parentActivity, h6Var, a10, bArr, cnVar, ijVar, currentAccount));
    }

    @Override
    public final boolean G() {
        View currentView = this.l1.getCurrentView();
        if (!(currentView instanceof ry0)) {
            return true;
        }
        return !((ry0) currentView).f49599f.canScrollVertically(-1);
    }

    public final void N0(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof ry0) {
            ((ry0) view).a(0);
            this.f28672b.post(new rw0(2, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof ry0) {
            ((ry0) view2).a(1);
        }
    }

    public final void O0(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.l1.getViewPages();
        View view = viewPages[0];
        if (view instanceof ry0) {
            ((ry0) view).a(0);
            this.f28672b.post(new rw0(4, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof ry0) {
            ((ry0) view2).a(1);
        }
    }

    @Override
    public final void onBackPressed() {
        py0 py0Var;
        fi.g1 g1Var = this.l1;
        if ((g1Var.getCurrentView() instanceof ry0) && (py0Var = ((ry0) g1Var.getCurrentView()).f49600n) != null) {
            org.telegram.messenger.g0.v1(py0Var);
        }
        if (g1Var.getCurrentPosition() > 0) {
            g1Var.E(g1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        int i7;
        Paint paint = this.f49992m1;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0);
            if (paint.getColor() != w02) {
                paint.setColor(w02);
                ViewGroup viewGroup = this.f28672b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            if (this.F0 < 0 && (i7 = this.G0) == this.n1 && w02 != i7) {
                this.G0 = w02;
                this.n1 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public sy0(boolean z9, Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, boolean z10, boolean z11, ArrayList arrayList, byte[] bArr) {
        super(1, context, h6Var, true);
        Paint paint = new Paint(1);
        this.f49992m1 = paint;
        this.f49993o1 = z9;
        this.f49996r1 = arrayList;
        this.f49994p1 = z10;
        this.f49995q1 = z11;
        this.f49997s1 = bArr;
        this.f49998t1 = j3;
        int i7 = org.telegram.ui.ActionBar.m6.f27963h5;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        P(i7);
        this.n1 = this.G0;
        this.P0 = true;
        this.Q0 = true;
        this.f28672b = new a60(this, context);
        fi.g1 g1Var = new fi.g1(6, context, this);
        this.l1 = g1Var;
        int i10 = this.f28705t0;
        g1Var.setPadding(i10, 0, i10, 0);
        this.f28672b.addView(g1Var, c8.ha.e(-1, -1, 119));
        g1Var.setAdapter(new bi.g5(5, context, this));
        if (arrayList == null && bArr == null) {
            if (z9) {
                N0(null);
            } else {
                O0(null);
            }
        }
    }
}
