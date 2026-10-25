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
public final class v21 extends org.telegram.ui.ActionBar.k3 {
    public static final int f44574w = 0;
    public final fi.h1 f44575b;
    public final Paint f44576c;
    public int d;
    public final boolean e;
    public final boolean f44577f;
    public final boolean h;
    public final ArrayList f44578n;
    public final byte[] f44579r;
    public final long f44580s;
    public q21 v;

    public v21(Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, byte[] bArr) {
        this(true, context, u6Var, j10, false, false, null, bArr);
    }

    public static void J(v21 v21Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = v21Var.f44580s;
        ArrayList arrayList = v21Var.f44578n;
        if (v21Var.e) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = v21Var.f44579r;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (v21Var.f44577f) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(v21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.f22276id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (v21Var.h) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(v21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f22242id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(v21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.f22131id.addAll(arrayList);
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
        ConnectionsManager.getInstance(v21Var.currentAccount).sendRequest(r02, new bi.i2(v21Var, charSequence, bArr, str, 17));
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
                tL_stories_report.f22276id.addAll(arrayList);
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
                    tL_reportMessage.f22242id = ((Integer) arrayList.get(0)).intValue();
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
                        v21.m(context, u6Var, z10, z11, j10, arrayList, zArr, callback, wcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.f22131id.addAll(arrayList);
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
                    v21.m(context, u6Var, z10, z11, j10, arrayList, zArr, callback, wcVar, (TLRPC.ReportResult) obj);
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

    public static void P(un unVar, MessageObject messageObject) {
        int id2;
        int currentAccount = unVar.getCurrentAccount();
        Activity parentActivity = unVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        N(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.wc.b0(unVar), unVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void Q(un unVar, MessageObject messageObject, org.telegram.ui.ActionBar.u6 u6Var) {
        int currentAccount = unVar.getCurrentAccount();
        Activity parentActivity = unVar.getParentActivity();
        long a2 = unVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new hi.g1(parentActivity, u6Var, a2, bArr, unVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.wc wcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new bi.s8(1, callback, zArr), 200L);
            return;
        }
        v21 v21Var = new v21(false, context, u6Var, j10, z10, z11, arrayList, null);
        if (z12) {
            v21Var.S((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = v21Var.f44575b.getViewPages();
            View view = viewPages[0];
            if (view instanceof u21) {
                ((u21) view).a(0);
                v21Var.containerView.post(new fy0(13, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof u21) {
                ((u21) view2).a(1);
            }
        }
        v21Var.v = new m21(zArr, callback, wcVar);
        v21Var.setOnDismissListener(new bi.s8(2, callback, zArr));
        v21Var.show();
    }

    public static void n(v21 v21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        q21 q21Var;
        q21 q21Var2;
        fi.d dVar;
        fi.h1 h1Var = v21Var.f44575b;
        if ((h1Var.getCurrentView() instanceof u21) && (dVar = ((u21) h1Var.getCurrentView()).f43987s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(v21Var.currentAccount).disableAds(false);
                    q21 q21Var3 = v21Var.v;
                    if (q21Var3 != null) {
                        q21Var3.b();
                        v21Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (q21Var2 = v21Var.v) != null) {
                    q21Var2.a();
                    v21Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            h1Var.E(h1Var.f33314b + 1);
            u21 u21Var = (u21) h1Var.getViewPages()[1];
            if (u21Var != null) {
                org.telegram.ui.Components.r71 r71Var = u21Var.f43984f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    u21Var.f43982b = null;
                    u21Var.f43983c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    u21Var.d = null;
                    r71Var.f32150g3.O(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    u21Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    u21Var.f43982b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    u21Var.f43983c = null;
                    u21Var.d = null;
                    r71Var.f32150g3.O(false);
                }
                if (charSequence != null) {
                    bi.j5 j5Var = u21Var.h;
                    ((TextView) j5Var.f4872c).setText(charSequence);
                    ((TextView) j5Var.f4872c).getText();
                    j5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (r71Var != null) {
                        r71Var.f32150g3.O(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!v21Var.e && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j10 = v21Var.f44580s;
                String charSequence2 = charSequence.toString();
                int i10 = un.f44168bd;
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
                    U.presentFragment(new un(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                q21 q21Var4 = v21Var.v;
                if (q21Var4 != null) {
                    q21Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (q21Var = v21Var.v) != null) {
                q21Var.a();
            }
            v21Var.dismiss();
        }
    }

    public static ViewGroup t(v21 v21Var) {
        return v21Var.containerView;
    }

    public final void R(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f44575b.getViewPages();
        View view = viewPages[0];
        if (view instanceof u21) {
            ((u21) view).a(0);
            this.containerView.post(new fy0(12, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof u21) {
            ((u21) view2).a(1);
        }
    }

    public final void S(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f44575b.getViewPages();
        View view = viewPages[0];
        if (view instanceof u21) {
            ((u21) view).a(0);
            this.containerView.post(new fy0(14, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof u21) {
            ((u21) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f44575b.getCurrentView();
        if (!(currentView instanceof u21)) {
            return true;
        }
        return !((u21) currentView).f43984f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        s21 s21Var;
        fi.h1 h1Var = this.f44575b;
        if ((h1Var.getCurrentView() instanceof u21) && (s21Var = ((u21) h1Var.getCurrentView()).f43985n) != null) {
            AndroidUtilities.hideKeyboard(s21Var);
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
        Paint paint = this.f44576c;
        super.onThemeColorsChanged();
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23425h5, this.resourcesProvider);
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

    public v21(boolean z10, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, u6Var, true);
        Paint paint = new Paint(1);
        this.f44576c = paint;
        this.e = z10;
        this.f44578n = arrayList;
        this.f44577f = z11;
        this.h = z12;
        this.f44579r = bArr;
        this.f44580s = j10;
        int i10 = org.telegram.ui.ActionBar.y6.f23425h5;
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        fixNavigationBarKey(i10);
        this.d = this.navBarColor;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new u70(this, context);
        fi.h1 h1Var = new fi.h1(this, context, 7);
        this.f44575b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(h1Var, org.telegram.ui.Components.gb1.i(-1, -1, 119));
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
