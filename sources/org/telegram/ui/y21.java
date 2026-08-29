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
    public final nh.g1 f44710b;
    public final Paint f44711c;
    public final boolean d;
    public final boolean f44712e;
    public final boolean f44713f;
    public final ArrayList h;
    public final byte[] f44714n;
    public final long f44715r;
    public t21 f44716s;

    public y21(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, byte[] bArr) {
        this(true, context, c6Var, j10, false, false, null, bArr);
    }

    public static void G(y21 y21Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = y21Var.f44715r;
        ArrayList arrayList = y21Var.h;
        if (y21Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = y21Var.f44714n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (y21Var.f44712e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(y21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.f22641id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (y21Var.f44713f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(y21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f22609id = ((Integer) arrayList.get(0)).intValue();
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
                    tL_messages_report2.f22496id.addAll(arrayList);
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
        ConnectionsManager.getInstance(y21Var.currentAccount).sendRequest(r02, new ih.c1(y21Var, charSequence, bArr, str, 16));
    }

    public static void J(int i10, final Context context, final long j10, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.tc tcVar, final org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_report.f22641id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report2 = tL_stories_report;
            } else if (z11) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.f22609id = ((Integer) arrayList.get(0)).intValue();
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
                ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new Object(), new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        y21.m(context, c6Var, z10, z11, j10, arrayList, zArr, callback, tcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.f22496id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_messages_report3.message = str2;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    y21.m(context, c6Var, z10, z11, j10, arrayList, zArr, callback, tcVar, (TLRPC.ReportResult) obj);
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

    public static void L(tn tnVar, MessageObject messageObject) {
        int id2;
        int currentAccount = tnVar.getCurrentAccount();
        Activity parentActivity = tnVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        J(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.tc.a0(tnVar), tnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void M(tn tnVar, MessageObject messageObject, org.telegram.ui.ActionBar.c6 c6Var) {
        int currentAccount = tnVar.getCurrentAccount();
        Activity parentActivity = tnVar.getParentActivity();
        long a2 = tnVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new l20(parentActivity, c6Var, a2, bArr, tnVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.tc tcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new jh.l6(zArr, callback, 1), 200L);
            return;
        }
        y21 y21Var = new y21(false, context, c6Var, j10, z10, z11, arrayList, null);
        if (z12) {
            y21Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = y21Var.f44710b.getViewPages();
            View view = viewPages[0];
            if (view instanceof x21) {
                ((x21) view).a(0);
                y21Var.containerView.post(new av0(26, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof x21) {
                ((x21) view2).a(1);
            }
        }
        y21Var.f44716s = new o21(zArr, callback, tcVar);
        y21Var.setOnDismissListener(new jh.l6(zArr, callback, 2));
        y21Var.show();
    }

    public static void n(y21 y21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        t21 t21Var;
        t21 t21Var2;
        nh.d dVar;
        nh.g1 g1Var = y21Var.f44710b;
        if ((g1Var.getCurrentView() instanceof x21) && (dVar = ((x21) g1Var.getCurrentView()).f44449s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(y21Var.currentAccount).disableAds(false);
                    t21 t21Var3 = y21Var.f44716s;
                    if (t21Var3 != null) {
                        t21Var3.b();
                        y21Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (t21Var2 = y21Var.f44716s) != null) {
                    t21Var2.a();
                    y21Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            g1Var.D(g1Var.f35259b + 1);
            x21 x21Var = (x21) g1Var.getViewPages()[1];
            if (x21Var != null) {
                org.telegram.ui.Components.u51 u51Var = x21Var.f44446f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    x21Var.f44443b = null;
                    x21Var.f44444c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    x21Var.d = null;
                    u51Var.U2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    x21Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    x21Var.f44443b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    x21Var.f44444c = null;
                    x21Var.d = null;
                    u51Var.U2.N(false);
                }
                if (charSequence != null) {
                    bg.u1 u1Var = x21Var.h;
                    ((TextView) u1Var.f2544c).setText(charSequence);
                    ((TextView) u1Var.f2544c).getText();
                    u1Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (u51Var != null) {
                        u51Var.U2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!y21Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j10 = y21Var.f44715r;
                String charSequence2 = charSequence.toString();
                int i10 = tn.Dc;
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
                    U.presentFragment(new tn(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                t21 t21Var4 = y21Var.f44716s;
                if (t21Var4 != null) {
                    t21Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (t21Var = y21Var.f44716s) != null) {
                t21Var.a();
            }
            y21Var.dismiss();
        }
    }

    public static ViewGroup t(y21 y21Var) {
        return y21Var.containerView;
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f44710b.getViewPages();
        View view = viewPages[0];
        if (view instanceof x21) {
            ((x21) view).a(0);
            this.containerView.post(new av0(25, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof x21) {
            ((x21) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f44710b.getViewPages();
        View view = viewPages[0];
        if (view instanceof x21) {
            ((x21) view).a(0);
            this.containerView.post(new av0(27, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof x21) {
            ((x21) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f44710b.getCurrentView();
        if (!(currentView instanceof x21)) {
            return true;
        }
        return !((x21) currentView).f44446f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        v21 v21Var;
        nh.g1 g1Var = this.f44710b;
        if ((g1Var.getCurrentView() instanceof x21) && (v21Var = ((x21) g1Var.getCurrentView()).f44447n) != null) {
            AndroidUtilities.hideKeyboard(v21Var);
        }
        if (g1Var.getCurrentPosition() > 0) {
            g1Var.D(g1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public y21(boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(context, c6Var, true, false);
        Paint paint = new Paint(1);
        this.f44711c = paint;
        this.d = z10;
        this.h = arrayList;
        this.f44712e = z11;
        this.f44713f = z12;
        this.f44714n = bArr;
        this.f44715r = j10;
        int i10 = org.telegram.ui.ActionBar.g6.f23133h5;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new s21(this, context);
        nh.g1 g1Var = new nh.g1(this, context, 5);
        this.f44710b = g1Var;
        int i11 = this.backgroundPaddingLeft;
        g1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(g1Var, i7.f6.e(-1, -1, 119));
        g1Var.setAdapter(new eg.v(this, context, 3));
        if (arrayList == null && bArr == null) {
            if (z10) {
                O(null);
            } else {
                P(null);
            }
        }
    }
}
