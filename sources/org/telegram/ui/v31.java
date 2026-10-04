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
public final class v31 extends org.telegram.ui.ActionBar.f3 {
    public static final int v = 0;
    public final ci.i1 f41549b;
    public final Paint f41550c;
    public final boolean d;
    public final boolean f41551e;
    public final boolean f41552f;
    public final ArrayList h;
    public final byte[] f41553n;
    public final long f41554r;
    public r31 f41555s;

    public v31(Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, byte[] bArr) {
        this(true, context, d6Var, j3, false, false, null, bArr);
    }

    public static void F(v31 v31Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = v31Var.f41554r;
        ArrayList arrayList = v31Var.h;
        if (v31Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = v31Var.f41553n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (v31Var.f41551e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(v31Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_stories_report.f20291id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (v31Var.f41552f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(v31Var.currentAccount).getInputPeer(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f20259id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(v31Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_messages_report2.f20146id.addAll(arrayList);
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
        ConnectionsManager.getInstance(v31Var.currentAccount).sendRequest(r02, new ai.p3(v31Var, charSequence, bArr, str, 12));
    }

    public static void I(int i10, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.yc ycVar, final org.telegram.ui.ActionBar.d6 d6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_stories_report.f20291id.addAll(arrayList);
                tL_stories_report.option = bArr;
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_messages_report2 = tL_stories_report;
            } else if (z11) {
                TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                if (!arrayList.isEmpty()) {
                    tL_reportMessage.f20259id = ((Integer) arrayList.get(0)).intValue();
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
                        v31.m(context, d6Var, z10, z11, j3, arrayList, zArr, callback, ycVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_messages_report3.f20146id.addAll(arrayList);
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
                    v31.m(context, d6Var, z10, z11, j3, arrayList, zArr, callback, ycVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void J(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        int currentAccount = n2Var.getCurrentAccount();
        Context context = n2Var.getContext();
        if (context == null) {
            return;
        }
        I(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void K(yn ynVar, MessageObject messageObject) {
        int id2;
        int currentAccount = ynVar.getCurrentAccount();
        Activity parentActivity = ynVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        if (messageObject.isEphemeral()) {
            id2 = messageObject.getEphemeralId();
        } else {
            id2 = messageObject.getId();
        }
        I(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.yc.a0(ynVar), ynVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void L(yn ynVar, MessageObject messageObject, org.telegram.ui.ActionBar.d6 d6Var) {
        int currentAccount = ynVar.getCurrentAccount();
        Activity parentActivity = ynVar.getParentActivity();
        long a2 = ynVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ei.c1(parentActivity, d6Var, a2, bArr, ynVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, long j3, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.yc ycVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new g31(0, callback, zArr), 200L);
            return;
        }
        v31 v31Var = new v31(false, context, d6Var, j3, z10, z11, arrayList, null);
        if (z12) {
            v31Var.N((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = v31Var.f41549b.getViewPages();
            View view = viewPages[0];
            if (view instanceof u31) {
                ((u31) view).a(0);
                v31Var.containerView.post(new wx0(20, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof u31) {
                ((u31) view2).a(1);
            }
        }
        v31Var.f41555s = new m31(zArr, callback, ycVar);
        v31Var.setOnDismissListener(new g31(1, callback, zArr));
        v31Var.show();
    }

    public static void n(v31 v31Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        r31 r31Var;
        r31 r31Var2;
        ci.d dVar;
        ci.i1 i1Var = v31Var.f41549b;
        if ((i1Var.getCurrentView() instanceof u31) && (dVar = ((u31) i1Var.getCurrentView()).f41050s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(v31Var.currentAccount).disableAds(false);
                    r31 r31Var3 = v31Var.f41555s;
                    if (r31Var3 != null) {
                        r31Var3.b();
                        v31Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (r31Var2 = v31Var.f41555s) != null) {
                    r31Var2.a();
                    v31Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            i1Var.E(i1Var.f26736b + 1);
            u31 u31Var = (u31) i1Var.getViewPages()[1];
            if (u31Var != null) {
                org.telegram.ui.Components.c71 c71Var = u31Var.f41047f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    u31Var.f41044b = null;
                    u31Var.f41045c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    u31Var.d = null;
                    c71Var.f25250f3.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    u31Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    u31Var.f41044b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    u31Var.f41045c = null;
                    u31Var.d = null;
                    c71Var.f25250f3.N(false);
                }
                if (charSequence != null) {
                    u5 u5Var = u31Var.h;
                    ((TextView) u5Var.d).setText(charSequence);
                    ((TextView) u5Var.d).getText();
                    u5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (c71Var != null) {
                        c71Var.f25250f3.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!v31Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j3 = v31Var.f41554r;
                String charSequence2 = charSequence.toString();
                int i10 = yn.Bc;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    Bundle bundle = new Bundle();
                    if (DialogObject.isUserDialog(j3)) {
                        bundle.putLong("user_id", j3);
                    } else {
                        bundle.putLong("chat_id", -j3);
                    }
                    bundle.putString("reportTitle", charSequence2);
                    bundle.putByteArray("reportOption", bArr);
                    bundle.putString("reportMessage", str);
                    U.presentFragment(new yn(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                r31 r31Var4 = v31Var.f41555s;
                if (r31Var4 != null) {
                    r31Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (r31Var = v31Var.f41555s) != null) {
                r31Var.a();
            }
            v31Var.dismiss();
        }
    }

    public static ViewGroup t(v31 v31Var) {
        return v31Var.containerView;
    }

    public final void M(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f41549b.getViewPages();
        View view = viewPages[0];
        if (view instanceof u31) {
            ((u31) view).a(0);
            this.containerView.post(new wx0(19, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof u31) {
            ((u31) view2).a(1);
        }
    }

    public final void N(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f41549b.getViewPages();
        View view = viewPages[0];
        if (view instanceof u31) {
            ((u31) view).a(0);
            this.containerView.post(new wx0(21, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof u31) {
            ((u31) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f41549b.getCurrentView();
        if (!(currentView instanceof u31)) {
            return true;
        }
        return !((u31) currentView).f41047f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        t31 t31Var;
        ci.i1 i1Var = this.f41549b;
        if ((i1Var.getCurrentView() instanceof u31) && (t31Var = ((u31) i1Var.getCurrentView()).f41048n) != null) {
            AndroidUtilities.hideKeyboard(t31Var);
        }
        if (i1Var.getCurrentPosition() > 0) {
            i1Var.E(i1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public v31(boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, d6Var, true);
        Paint paint = new Paint(1);
        this.f41550c = paint;
        this.d = z10;
        this.h = arrayList;
        this.f41551e = z11;
        this.f41552f = z12;
        this.f41553n = bArr;
        this.f41554r = j3;
        int i10 = org.telegram.ui.ActionBar.i6.f20894h5;
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new q31(this, context);
        ci.i1 i1Var = new ci.i1(this, context, 6);
        this.f41549b = i1Var;
        int i11 = this.backgroundPaddingLeft;
        i1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(i1Var, w7.z5.e(-1, -1, 119));
        i1Var.setAdapter(new cw0(this, context, 1));
        if (arrayList == null && bArr == null) {
            if (z10) {
                M(null);
            } else {
                N(null);
            }
        }
    }
}
