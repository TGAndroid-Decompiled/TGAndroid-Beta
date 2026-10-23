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
public final class s21 extends org.telegram.ui.ActionBar.h3 {
    public static final int f41291w = 0;
    public final ei.h1 f41292b;
    public final Paint f41293c;
    public int d;
    public final boolean e;
    public final boolean f41294f;
    public final boolean h;
    public final ArrayList f41295n;
    public final byte[] f41296r;
    public final long f41297s;
    public o21 v;

    public s21(Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, byte[] bArr) {
        this(true, context, g6Var, j10, false, false, null, bArr);
    }

    public static void J(s21 s21Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = s21Var.f41297s;
        ArrayList arrayList = s21Var.f41295n;
        if (s21Var.e) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = s21Var.f41296r;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (s21Var.f41294f) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(s21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.f20589id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (s21Var.h) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(s21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f20557id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(s21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.f20447id.addAll(arrayList);
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
        ConnectionsManager.getInstance(s21Var.currentAccount).sendRequest(r02, new ai.k2(s21Var, charSequence, bArr, str, 17));
    }

    public static void N(int i10, final Context context, final long j10, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.xc xcVar, final org.telegram.ui.ActionBar.g6 g6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_report.f20589id.addAll(arrayList);
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
                    tL_reportMessage.f20557id = ((Integer) arrayList.get(0)).intValue();
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
                        s21.m(context, g6Var, z10, z11, j10, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.f20447id.addAll(arrayList);
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
                    s21.m(context, g6Var, z10, z11, j10, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
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
        N(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.xc.a0(snVar), snVar.getResourceProvider(), new byte[0], null, null);
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

    public static void m(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new ai.x8(1, callback, zArr), 200L);
            return;
        }
        s21 s21Var = new s21(false, context, g6Var, j10, z10, z11, arrayList, null);
        if (z12) {
            s21Var.S((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = s21Var.f41292b.getViewPages();
            View view = viewPages[0];
            if (view instanceof r21) {
                ((r21) view).a(0);
                s21Var.containerView.post(new mv0(23, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof r21) {
                ((r21) view2).a(1);
            }
        }
        s21Var.v = new j21(zArr, callback, xcVar);
        s21Var.setOnDismissListener(new ai.x8(2, callback, zArr));
        s21Var.show();
    }

    public static void n(s21 s21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        o21 o21Var;
        o21 o21Var2;
        ei.d dVar;
        ei.h1 h1Var = s21Var.f41292b;
        if ((h1Var.getCurrentView() instanceof r21) && (dVar = ((r21) h1Var.getCurrentView()).f40985s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(s21Var.currentAccount).disableAds(false);
                    o21 o21Var3 = s21Var.v;
                    if (o21Var3 != null) {
                        o21Var3.b();
                        s21Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (o21Var2 = s21Var.v) != null) {
                    o21Var2.a();
                    s21Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            h1Var.D(h1Var.f28307b + 1);
            r21 r21Var = (r21) h1Var.getViewPages()[1];
            if (r21Var != null) {
                org.telegram.ui.Components.j71 j71Var = r21Var.f40982f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    r21Var.f40980b = null;
                    r21Var.f40981c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    r21Var.d = null;
                    j71Var.Z2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    r21Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    r21Var.f40980b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    r21Var.f40981c = null;
                    r21Var.d = null;
                    j71Var.Z2.N(false);
                }
                if (charSequence != null) {
                    ai.o5 o5Var = r21Var.h;
                    ((TextView) o5Var.f1936c).setText(charSequence);
                    ((TextView) o5Var.f1936c).getText();
                    o5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (j71Var != null) {
                        j71Var.Z2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!s21Var.e && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j10 = s21Var.f41297s;
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
                o21 o21Var4 = s21Var.v;
                if (o21Var4 != null) {
                    o21Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (o21Var = s21Var.v) != null) {
                o21Var.a();
            }
            s21Var.dismiss();
        }
    }

    public static ViewGroup u(s21 s21Var) {
        return s21Var.containerView;
    }

    public final void R(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f41292b.getViewPages();
        View view = viewPages[0];
        if (view instanceof r21) {
            ((r21) view).a(0);
            this.containerView.post(new mv0(22, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof r21) {
            ((r21) view2).a(1);
        }
    }

    public final void S(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f41292b.getViewPages();
        View view = viewPages[0];
        if (view instanceof r21) {
            ((r21) view).a(0);
            this.containerView.post(new mv0(24, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof r21) {
            ((r21) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f41292b.getCurrentView();
        if (!(currentView instanceof r21)) {
            return true;
        }
        return !((r21) currentView).f40982f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        q21 q21Var;
        ei.h1 h1Var = this.f41292b;
        if ((h1Var.getCurrentView() instanceof r21) && (q21Var = ((r21) h1Var.getCurrentView()).f40983n) != null) {
            AndroidUtilities.hideKeyboard(q21Var);
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
        Paint paint = this.f41293c;
        super.onThemeColorsChanged();
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21254h5, this.resourcesProvider);
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

    public s21(boolean z10, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, g6Var, true);
        Paint paint = new Paint(1);
        this.f41293c = paint;
        this.e = z10;
        this.f41295n = arrayList;
        this.f41294f = z11;
        this.h = z12;
        this.f41296r = bArr;
        this.f41297s = j10;
        int i10 = org.telegram.ui.ActionBar.k6.f21254h5;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        fixNavigationBarKey(i10);
        this.d = this.navBarColor;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new n21(this, context);
        ei.h1 h1Var = new ei.h1(this, context, 6);
        this.f41292b = h1Var;
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
