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
public final class x21 extends org.telegram.ui.ActionBar.k3 {
    public static final int f45461w = 0;
    public final fi.h1 f45462b;
    public final Paint f45463c;
    public int d;
    public final boolean e;
    public final boolean f45464f;
    public final boolean h;
    public final ArrayList f45465n;
    public final byte[] f45466r;
    public final long f45467s;
    public s21 v;

    public x21(Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, byte[] bArr) {
        this(true, context, u6Var, j10, false, false, null, bArr);
    }

    public static void J(x21 x21Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = x21Var.f45467s;
        ArrayList arrayList = x21Var.f45465n;
        if (x21Var.e) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = x21Var.f45466r;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (x21Var.f45464f) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(x21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.f22279id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (x21Var.h) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(x21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f22245id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(x21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.f22134id.addAll(arrayList);
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
        ConnectionsManager.getInstance(x21Var.currentAccount).sendRequest(r02, new bi.i2(x21Var, charSequence, bArr, str, 17));
    }

    public static void N(int i10, final Context context, final long j10, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.wc wcVar, final org.telegram.ui.ActionBar.u6 u6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_report.f22279id.addAll(arrayList);
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
                    tL_reportMessage.f22245id = ((Integer) arrayList.get(0)).intValue();
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
                        x21.m(context, u6Var, z10, z11, j10, arrayList, zArr, callback, wcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.f22134id.addAll(arrayList);
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
                    x21.m(context, u6Var, z10, z11, j10, arrayList, zArr, callback, wcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void O(long j10, org.telegram.ui.ActionBar.r2 r2Var) {
        int currentAccount = r2Var.getCurrentAccount();
        Context context = r2Var.getContext();
        if (context == null) {
            return;
        }
        N(currentAccount, context, j10, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void P(wn wnVar, MessageObject messageObject) {
        int id2;
        int currentAccount = wnVar.getCurrentAccount();
        Activity parentActivity = wnVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        N(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.wc.b0(wnVar), wnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void Q(wn wnVar, MessageObject messageObject, org.telegram.ui.ActionBar.u6 u6Var) {
        int currentAccount = wnVar.getCurrentAccount();
        Activity parentActivity = wnVar.getParentActivity();
        long a2 = wnVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new hi.g1(parentActivity, u6Var, a2, bArr, wnVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new bi.s8(1, callback, zArr), 200L);
            return;
        }
        x21 x21Var = new x21(false, context, u6Var, j10, z10, z11, arrayList, null);
        if (z12) {
            x21Var.S((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = x21Var.f45462b.getViewPages();
            View view = viewPages[0];
            if (view instanceof w21) {
                ((w21) view).a(0);
                x21Var.containerView.post(new by0(14, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof w21) {
                ((w21) view2).a(1);
            }
        }
        x21Var.v = new o21(zArr, callback, wcVar);
        x21Var.setOnDismissListener(new bi.s8(2, callback, zArr));
        x21Var.show();
    }

    public static void n(x21 x21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        s21 s21Var;
        s21 s21Var2;
        fi.d dVar;
        fi.h1 h1Var = x21Var.f45462b;
        if ((h1Var.getCurrentView() instanceof w21) && (dVar = ((w21) h1Var.getCurrentView()).f44505s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(x21Var.currentAccount).disableAds(false);
                    s21 s21Var3 = x21Var.v;
                    if (s21Var3 != null) {
                        s21Var3.b();
                        x21Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (s21Var2 = x21Var.v) != null) {
                    s21Var2.a();
                    x21Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            h1Var.E(h1Var.f33632b + 1);
            w21 w21Var = (w21) h1Var.getViewPages()[1];
            if (w21Var != null) {
                org.telegram.ui.Components.s71 s71Var = w21Var.f44502f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    w21Var.f44500b = null;
                    w21Var.f44501c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    w21Var.d = null;
                    s71Var.f32504g3.O(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    w21Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    w21Var.f44500b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    w21Var.f44501c = null;
                    w21Var.d = null;
                    s71Var.f32504g3.O(false);
                }
                if (charSequence != null) {
                    bi.j5 j5Var = w21Var.h;
                    ((TextView) j5Var.f4872c).setText(charSequence);
                    ((TextView) j5Var.f4872c).getText();
                    j5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (s71Var != null) {
                        s71Var.f32504g3.O(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!x21Var.e && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j10 = x21Var.f45467s;
                String charSequence2 = charSequence.toString();
                int i10 = wn.f45035fd;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
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
                    U.presentFragment(new wn(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                s21 s21Var4 = x21Var.v;
                if (s21Var4 != null) {
                    s21Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (s21Var = x21Var.v) != null) {
                s21Var.a();
            }
            x21Var.dismiss();
        }
    }

    public static ViewGroup t(x21 x21Var) {
        return x21Var.containerView;
    }

    public final void R(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f45462b.getViewPages();
        View view = viewPages[0];
        if (view instanceof w21) {
            ((w21) view).a(0);
            this.containerView.post(new by0(13, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof w21) {
            ((w21) view2).a(1);
        }
    }

    public final void S(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f45462b.getViewPages();
        View view = viewPages[0];
        if (view instanceof w21) {
            ((w21) view).a(0);
            this.containerView.post(new by0(15, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof w21) {
            ((w21) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f45462b.getCurrentView();
        if (!(currentView instanceof w21)) {
            return true;
        }
        return !((w21) currentView).f44502f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        u21 u21Var;
        fi.h1 h1Var = this.f45462b;
        if ((h1Var.getCurrentView() instanceof w21) && (u21Var = ((w21) h1Var.getCurrentView()).f44503n) != null) {
            AndroidUtilities.hideKeyboard(u21Var);
        }
        if (h1Var.getCurrentPosition() > 0) {
            h1Var.E(h1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        Paint paint = this.f45463c;
        super.onThemeColorsChanged();
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23428h5, this.resourcesProvider);
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

    public x21(boolean z10, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, u6Var, true);
        Paint paint = new Paint(1);
        this.f45463c = paint;
        this.e = z10;
        this.f45465n = arrayList;
        this.f45464f = z11;
        this.h = z12;
        this.f45466r = bArr;
        this.f45467s = j10;
        int i10 = org.telegram.ui.ActionBar.y6.f23428h5;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        fixNavigationBarKey(i10);
        this.d = this.navBarColor;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new w70(this, context);
        fi.h1 h1Var = new fi.h1(this, context, 7);
        this.f45462b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(h1Var, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        h1Var.setAdapter(new bi.e5(this, context, 3));
        if (arrayList == null && bArr == null) {
            if (z10) {
                R(null);
            } else {
                S(null);
            }
        }
    }
}
