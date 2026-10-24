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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;
public final class r21 extends org.telegram.ui.ActionBar.h3 {
    public static final int f40991w = 0;
    public final ei.h1 f40992b;
    public final Paint f40993c;
    public int d;
    public final boolean e;
    public final boolean f40994f;
    public final boolean h;
    public final ArrayList f40995n;
    public final byte[] f40996r;
    public final long f40997s;
    public n21 v;

    public r21(Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, byte[] bArr) {
        this(true, context, g6Var, j10, false, false, null, bArr);
    }

    public static void J(r21 r21Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = r21Var.f40997s;
        ArrayList arrayList = r21Var.f40995n;
        if (r21Var.e) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = r21Var.f40996r;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (r21Var.f40994f) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(r21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.f20590id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (r21Var.h) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(r21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f20558id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(r21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.f20448id.addAll(arrayList);
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
        ConnectionsManager.getInstance(r21Var.currentAccount).sendRequest(r02, new ai.k2(r21Var, charSequence, bArr, str, 17));
    }

    public static void N(int i10, final Context context, final long j10, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.vc vcVar, final org.telegram.ui.ActionBar.g6 g6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_report.f20590id.addAll(arrayList);
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
                    tL_reportMessage.f20558id = ((Integer) arrayList.get(0)).intValue();
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
                        r21.m(context, g6Var, z10, z11, j10, arrayList, zArr, callback, vcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.f20448id.addAll(arrayList);
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
                    r21.m(context, g6Var, z10, z11, j10, arrayList, zArr, callback, vcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void O(long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        int currentAccount = o2Var.getCurrentAccount();
        Context context = o2Var.getContext();
        if (context == null) {
            return;
        }
        N(currentAccount, context, j10, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void P(sn snVar, MessageObject messageObject) {
        int id2;
        int currentAccount = snVar.getCurrentAccount();
        Activity parentActivity = snVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        N(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.vc.a0(snVar), snVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void Q(sn snVar, MessageObject messageObject, org.telegram.ui.ActionBar.g6 g6Var) {
        int currentAccount = snVar.getCurrentAccount();
        Activity parentActivity = snVar.getParentActivity();
        long a2 = snVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new gi.z0(parentActivity, g6Var, a2, bArr, snVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.vc vcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new ai.x8(1, callback, zArr), 200L);
            return;
        }
        r21 r21Var = new r21(false, context, g6Var, j10, z10, z11, arrayList, null);
        if (z12) {
            r21Var.S((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = r21Var.f40992b.getViewPages();
            View view = viewPages[0];
            if (view instanceof q21) {
                ((q21) view).a(0);
                r21Var.containerView.post(new lv0(23, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof q21) {
                ((q21) view2).a(1);
            }
        }
        r21Var.v = new i21(zArr, callback, vcVar);
        r21Var.setOnDismissListener(new ai.x8(2, callback, zArr));
        r21Var.show();
    }

    public static void n(r21 r21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        n21 n21Var;
        n21 n21Var2;
        ei.d dVar;
        ei.h1 h1Var = r21Var.f40992b;
        if ((h1Var.getCurrentView() instanceof q21) && (dVar = ((q21) h1Var.getCurrentView()).f40699s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(r21Var.currentAccount).disableAds(false);
                    n21 n21Var3 = r21Var.v;
                    if (n21Var3 != null) {
                        n21Var3.b();
                        r21Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (n21Var2 = r21Var.v) != null) {
                    n21Var2.a();
                    r21Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            h1Var.D(h1Var.f28281b + 1);
            q21 q21Var = (q21) h1Var.getViewPages()[1];
            if (q21Var != null) {
                org.telegram.ui.Components.i71 i71Var = q21Var.f40696f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    q21Var.f40694b = null;
                    q21Var.f40695c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    q21Var.d = null;
                    i71Var.Z2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    q21Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    q21Var.f40694b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    q21Var.f40695c = null;
                    q21Var.d = null;
                    i71Var.Z2.N(false);
                }
                if (charSequence != null) {
                    ai.o5 o5Var = q21Var.h;
                    ((TextView) o5Var.f1936c).setText(charSequence);
                    ((TextView) o5Var.f1936c).getText();
                    o5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (i71Var != null) {
                        i71Var.Z2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!r21Var.e && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j10 = r21Var.f40997s;
                String charSequence2 = charSequence.toString();
                int i10 = sn.Vc;
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
                    U.presentFragment(new sn(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                n21 n21Var4 = r21Var.v;
                if (n21Var4 != null) {
                    n21Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (n21Var = r21Var.v) != null) {
                n21Var.a();
            }
            r21Var.dismiss();
        }
    }

    public static ViewGroup u(r21 r21Var) {
        return r21Var.containerView;
    }

    public final void R(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f40992b.getViewPages();
        View view = viewPages[0];
        if (view instanceof q21) {
            ((q21) view).a(0);
            this.containerView.post(new lv0(22, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof q21) {
            ((q21) view2).a(1);
        }
    }

    public final void S(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f40992b.getViewPages();
        View view = viewPages[0];
        if (view instanceof q21) {
            ((q21) view).a(0);
            this.containerView.post(new lv0(24, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof q21) {
            ((q21) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f40992b.getCurrentView();
        if (!(currentView instanceof q21)) {
            return true;
        }
        return !((q21) currentView).f40696f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        p21 p21Var;
        ei.h1 h1Var = this.f40992b;
        if ((h1Var.getCurrentView() instanceof q21) && (p21Var = ((q21) h1Var.getCurrentView()).f40697n) != null) {
            AndroidUtilities.hideKeyboard(p21Var);
        }
        if (h1Var.getCurrentPosition() > 0) {
            h1Var.D(h1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        Paint paint = this.f40993c;
        super.onThemeColorsChanged();
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21255h5, this.resourcesProvider);
            if (paint.getColor() != w02) {
                paint.setColor(w02);
                ViewGroup viewGroup = this.containerView;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            if (this.navBarColorKey < 0 && (i10 = this.navBarColor) == this.d && w02 != i10) {
                this.navBarColor = w02;
                this.d = w02;
                setOverlayNavBarColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public r21(boolean z10, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, g6Var, true);
        Paint paint = new Paint(1);
        this.f40993c = paint;
        this.e = z10;
        this.f40995n = arrayList;
        this.f40994f = z11;
        this.h = z12;
        this.f40996r = bArr;
        this.f40997s = j10;
        int i10 = org.telegram.ui.ActionBar.k6.f21255h5;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        fixNavigationBarKey(i10);
        this.d = this.navBarColor;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new m21(this, context);
        ei.h1 h1Var = new ei.h1(this, context, 6);
        this.f40992b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(h1Var, w7.z5.e(-1, -1, 119));
        h1Var.setAdapter(new ai.j5(this, context, 2));
        if (arrayList == null && bArr == null) {
            if (z10) {
                R(null);
            } else {
                S(null);
            }
        }
    }
}
