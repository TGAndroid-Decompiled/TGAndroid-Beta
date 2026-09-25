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
public final class t31 extends org.telegram.ui.ActionBar.e3 {
    public static final int v = 0;
    public final ci.i1 f37957b;
    public final Paint f37958c;
    public final boolean d;
    public final boolean e;
    public final boolean f37959f;
    public final ArrayList h;
    public final byte[] f37960n;
    public final long f37961r;
    public p31 f37962s;

    public t31(Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, byte[] bArr) {
        this(true, context, d6Var, j3, false, false, null, bArr);
    }

    public static void H(t31 t31Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = t31Var.f37961r;
        ArrayList arrayList = t31Var.h;
        if (t31Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = t31Var.f37960n;
            r02.option = bArr;
        } else {
            String str2 = "";
            if (t31Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(t31Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_stories_report.f18583id.addAll(arrayList);
                }
                if (str != null) {
                    str2 = str;
                }
                tL_stories_report.message = str2;
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (t31Var.f37959f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(t31Var.currentAccount).getInputPeer(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.f18551id = ((Integer) arrayList.get(0)).intValue();
                }
                if (str != null) {
                    str2 = str;
                }
                tL_reportMessage.message = str2;
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(t31Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_messages_report2.f18440id.addAll(arrayList);
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
        ConnectionsManager.getInstance(t31Var.currentAccount).sendRequest(r02, new ai.p3(t31Var, charSequence, bArr, str, 12));
    }

    public static void K(int i10, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.xc xcVar, final org.telegram.ui.ActionBar.d6 d6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            String str2 = "";
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_stories_report.f18583id.addAll(arrayList);
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
                    tL_reportMessage.f18551id = ((Integer) arrayList.get(0)).intValue();
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
                        t31.m(context, d6Var, z10, z11, j3, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                    }
                });
            } else {
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_messages_report3.f18440id.addAll(arrayList);
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
                    t31.m(context, d6Var, z10, z11, j3, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void L(long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        int currentAccount = m2Var.getCurrentAccount();
        Context context = m2Var.getContext();
        if (context == null) {
            return;
        }
        K(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void M(wn wnVar, MessageObject messageObject) {
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
        K(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(id2))), org.telegram.ui.Components.xc.a0(wnVar), wnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void N(wn wnVar, MessageObject messageObject, org.telegram.ui.ActionBar.d6 d6Var) {
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
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ei.b1(parentActivity, d6Var, a2, bArr, wnVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, long j3, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new e31(0, callback, zArr), 200L);
            return;
        }
        t31 t31Var = new t31(false, context, d6Var, j3, z10, z11, arrayList, null);
        if (z12) {
            t31Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = t31Var.f37957b.getViewPages();
            View view = viewPages[0];
            if (view instanceof s31) {
                ((s31) view).a(0);
                t31Var.containerView.post(new jx0(22, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof s31) {
                ((s31) view2).a(1);
            }
        }
        t31Var.f37962s = new k31(zArr, callback, xcVar);
        t31Var.setOnDismissListener(new e31(1, callback, zArr));
        t31Var.show();
    }

    public static void n(t31 t31Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        p31 p31Var;
        p31 p31Var2;
        ci.d dVar;
        ci.i1 i1Var = t31Var.f37957b;
        if ((i1Var.getCurrentView() instanceof s31) && (dVar = ((s31) i1Var.getCurrentView()).f37588s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject != null) {
            boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
            if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
                if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                    MessagesController.getInstance(t31Var.currentAccount).disableAds(false);
                    p31 p31Var3 = t31Var.f37962s;
                    if (p31Var3 != null) {
                        p31Var3.b();
                        t31Var.dismiss();
                        return;
                    }
                    return;
                } else if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (p31Var2 = t31Var.f37962s) != null) {
                    p31Var2.a();
                    t31Var.dismiss();
                    return;
                } else {
                    return;
                }
            }
            i1Var.D(i1Var.f29934b + 1);
            s31 s31Var = (s31) i1Var.getViewPages()[1];
            if (s31Var != null) {
                org.telegram.ui.Components.r61 r61Var = s31Var.f37585f;
                if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                    s31Var.f37583b = null;
                    s31Var.f37584c = (TLRPC.TL_reportResultChooseOption) tLObject;
                    s31Var.d = null;
                    r61Var.Y2.N(false);
                } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                    s31Var.b((TLRPC.TL_reportResultAddComment) tLObject);
                } else if (z10) {
                    s31Var.f37583b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                    s31Var.f37584c = null;
                    s31Var.d = null;
                    r61Var.Y2.N(false);
                }
                if (charSequence != null) {
                    t5 t5Var = s31Var.h;
                    ((TextView) t5Var.d).setText(charSequence);
                    ((TextView) t5Var.d).getText();
                    t5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), Integer.MIN_VALUE));
                    if (r61Var != null) {
                        r61Var.Y2.N(true);
                    }
                }
            }
        } else if (tL_error != null) {
            if (!t31Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                long j3 = t31Var.f37961r;
                String charSequence2 = charSequence.toString();
                int i10 = wn.Gc;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
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
                    U.presentFragment(new wn(bundle));
                }
            } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                p31 p31Var4 = t31Var.f37962s;
                if (p31Var4 != null) {
                    p31Var4.c();
                }
            } else if ("AD_EXPIRED".equals(tL_error.text) && (p31Var = t31Var.f37962s) != null) {
                p31Var.a();
            }
            t31Var.dismiss();
        }
    }

    public static ViewGroup t(t31 t31Var) {
        return t31Var.containerView;
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.f37957b.getViewPages();
        View view = viewPages[0];
        if (view instanceof s31) {
            ((s31) view).a(0);
            this.containerView.post(new jx0(21, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof s31) {
            ((s31) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.f37957b.getViewPages();
        View view = viewPages[0];
        if (view instanceof s31) {
            ((s31) view).a(0);
            this.containerView.post(new jx0(23, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof s31) {
            ((s31) view2).a(1);
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        View currentView = this.f37957b.getCurrentView();
        if (!(currentView instanceof s31)) {
            return true;
        }
        return !((s31) currentView).f37585f.canScrollVertically(-1);
    }

    @Override
    public final void onBackPressed() {
        r31 r31Var;
        ci.i1 i1Var = this.f37957b;
        if ((i1Var.getCurrentView() instanceof s31) && (r31Var = ((s31) i1Var.getCurrentView()).f37586n) != null) {
            AndroidUtilities.hideKeyboard(r31Var);
        }
        if (i1Var.getCurrentPosition() > 0) {
            i1Var.D(i1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public t31(boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, d6Var, true);
        Paint paint = new Paint(1);
        this.f37958c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f37959f = z12;
        this.f37960n = bArr;
        this.f37961r = j3;
        int i10 = org.telegram.ui.ActionBar.h6.f19130h5;
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new o31(this, context);
        ci.i1 i1Var = new ci.i1(this, context, 6);
        this.f37957b = i1Var;
        int i11 = this.backgroundPaddingLeft;
        i1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(i1Var, w7.y5.e(-1, -1, 119));
        i1Var.setAdapter(new zv0(this, context, 1));
        if (arrayList == null && bArr == null) {
            if (z10) {
                O(null);
            } else {
                P(null);
            }
        }
    }
}
