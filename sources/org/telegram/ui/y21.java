package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;
public final class y21 extends org.telegram.ui.ActionBar.f3 {
    public static final int v = 0;
    public final kh.j1 f44691b;
    public final Paint f44692c;
    public final boolean d;
    public final boolean f44693e;
    public final boolean f44694f;
    public final ArrayList h;
    public final byte[] f44695n;
    public final long f44696r;
    public t21 f44697s;

    public y21(Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, byte[] bArr) {
        this(true, context, b6Var, j10, false, false, null, bArr);
    }

    public static void G(y21 y21Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = y21Var.f44696r;
        ArrayList arrayList = y21Var.h;
        if (y21Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = y21Var.f44695n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (y21Var.f44693e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(y21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.f22629id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (y21Var.f44694f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(y21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f22597id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(y21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.f22484id.addAll(arrayList);
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
        ConnectionsManager.getInstance(y21Var.currentAccount).sendRequest(r02, new fh.h1(y21Var, charSequence, bArr, str, 18));
    }

    public static void J(int i9, final Context context, final long j10, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.oc ocVar, final org.telegram.ui.ActionBar.b6 b6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i9).getInputPeer(j10);
                tL_stories_report.f22629id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report2 = tL_stories_report;
            } else if (z11) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(i9).getInputPeer(j10);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.f22597id = ((Integer) arrayList.get(0)).intValue();
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
                ConnectionsManager.getInstance(i9).sendRequestTyped(tL_messages_report, new Object(), new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        y21.m(context, b6Var, z10, z11, j10, arrayList, zArr, callback, ocVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i9).getInputPeer(j10);
                tL_messages_report3.f22484id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_messages_report3.message = str2;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i9).sendRequestTyped(tL_messages_report, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    y21.m(context, b6Var, z10, z11, j10, arrayList, zArr, callback, ocVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void K(long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        int currentAccount = o2Var.getCurrentAccount();
        Context context = o2Var.getContext();
        if (context == null) {
            return;
        }
        J(currentAccount, context, j10, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void L(qn qnVar, MessageObject messageObject) {
        int id2;
        int currentAccount = qnVar.getCurrentAccount();
        Activity parentActivity = qnVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        J(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.oc.a0(qnVar), qnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void M(qn qnVar, MessageObject messageObject, org.telegram.ui.ActionBar.b6 b6Var) {
        int currentAccount = qnVar.getCurrentAccount();
        Activity parentActivity = qnVar.getParentActivity();
        long a2 = qnVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new mh.z0(parentActivity, b6Var, a2, bArr, qnVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.oc ocVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new gh.o6(zArr, callback, 1), 200L);
            return;
        }
        y21 y21Var = new y21(false, context, b6Var, j10, z10, z11, arrayList, null);
        if (z12) {
            y21Var.O((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = y21Var.f44691b.getViewPages();
            View view = viewPages[0];
            if (view instanceof x21) {
                ((x21) view).a(0);
                y21Var.containerView.post(new ys0(29, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof x21) {
                ((x21) view2).a(1);
            }
        }
        y21Var.f44697s = new o21(zArr, callback, ocVar);
        y21Var.setOnDismissListener(new gh.o6(zArr, callback, 2));
        y21Var.show();
    }

    public static void n(y21 y21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        t21 t21Var;
        t21 t21Var2;
        kh.d dVar;
        kh.j1 j1Var = y21Var.f44691b;
        if ((j1Var.getCurrentView() instanceof x21) && (dVar = ((x21) j1Var.getCurrentView()).f44343s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(y21Var.currentAccount).disableAds(false);
                    t21 t21Var3 = y21Var.f44697s;
                    if (t21Var3 != null) {
                        t21Var3.b();
                        y21Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (t21Var2 = y21Var.f44697s) != null) {
                    t21Var2.a();
                    y21Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            j1Var.D(j1Var.f31033b + 1);
            x21 x21Var = (x21) j1Var.getViewPages()[1];
            if (x21Var != null) {
                org.telegram.ui.Components.i51 i51Var = x21Var.f44340f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    x21Var.f44337b = null;
                    x21Var.f44338c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    x21Var.d = null;
                    i51Var.U2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    x21Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    x21Var.f44337b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    x21Var.f44338c = null;
                    x21Var.d = null;
                    i51Var.U2.N(false);
                }
                if (charSequence != null) {
                    bh.g gVar = x21Var.h;
                    ((TextView) gVar.f2028c).setText(charSequence);
                    ((TextView) gVar.f2028c).getText();
                    gVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (i51Var != null) {
                        i51Var.U2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!y21Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j10 = y21Var.f44696r;
                String charSequence2 = charSequence.toString();
                int i9 = qn.Dc;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    Bundle bundle = new Bundle();
                    if (DialogObject.isUserDialog(j10)) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    bundle.putString("reportTitle", charSequence2);
                    bundle.putByteArray("reportOption", bArr);
                    bundle.putString("reportMessage", str);
                    U.presentFragment(new qn(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                t21 t21Var4 = y21Var.f44697s;
                if (t21Var4 != null) {
                    t21Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (t21Var = y21Var.f44697s) != null) {
                t21Var.a();
            }
            y21Var.dismiss();
        }
    }

    public static ViewGroup t(y21 y21Var) {
        return y21Var.containerView;
    }

    public final void N(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f44691b.getViewPages();
        View view = viewPages[0];
        if (view instanceof x21) {
            ((x21) view).a(0);
            this.containerView.post(new ys0(28, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof x21) {
            ((x21) view2).a(1);
        }
    }

    public final void O(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f44691b.getViewPages();
        View view = viewPages[0];
        if (view instanceof x21) {
            ((x21) view).a(0);
            this.containerView.post(new n21(0, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof x21) {
            ((x21) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f44691b.getCurrentView();
        if (!(currentView instanceof x21)) {
            return true;
        }
        return !((x21) currentView).f44340f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        v21 v21Var;
        kh.j1 j1Var = this.f44691b;
        if ((j1Var.getCurrentView() instanceof x21) && (v21Var = ((x21) j1Var.getCurrentView()).f44341n) != null) {
            AndroidUtilities.hideKeyboard(v21Var);
        }
        if (j1Var.getCurrentPosition() > 0) {
            j1Var.D(j1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public y21(boolean z10, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(context, b6Var, true, false);
        Paint paint = new Paint(1);
        this.f44692c = paint;
        this.d = z10;
        this.h = arrayList;
        this.f44693e = z11;
        this.f44694f = z12;
        this.f44695n = bArr;
        this.f44696r = j10;
        int i9 = org.telegram.ui.ActionBar.f6.f23072h5;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new s21(this, context);
        kh.j1 j1Var = new kh.j1(this, context, 6);
        this.f44691b = j1Var;
        int i10 = this.backgroundPaddingLeft;
        j1Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(j1Var, g7.e6.e(-1, -1, 119));
        j1Var.setAdapter(new bg.x(this, context, 3));
        if (arrayList == null && bArr == null) {
            if (z10) {
                N(null);
            } else {
                O(null);
            }
        }
    }
}
