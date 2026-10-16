package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class xv implements View.OnClickListener {
    public final int f41666a;
    public final Object f41667b;
    public final Object f41668c;

    public xv(int i10, Object obj, Object obj2) {
        this.f41666a = i10;
        this.f41667b = obj;
        this.f41668c = obj2;
    }

    @Override
    public final void onClick(View view) {
        ArrayList<TLRPC.InputPeer> arrayList;
        ArrayList<Long> arrayList2;
        org.telegram.ui.ActionBar.f6 O0;
        int i10;
        int i11;
        boolean z10;
        String formatString;
        int i12;
        TLRPC.TL_auth_sentCode tL_auth_sentCode;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j10 = 0;
        int i19 = 8;
        switch (this.f41666a) {
            case 0:
                yy yyVar = (yy) this.f41667b;
                yyVar.getClass();
                ((org.telegram.ui.Components.l80) this.f41668c).u();
                yyVar.presentFragment(new ProxyListActivity());
                return;
            case 1:
                gi.u0.e((org.telegram.ui.ActionBar.a2[]) this.f41668c, r0, r0.currentAccount, ((yy) this.f41667b).Z2);
                return;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f41667b)[0].getSwipeBack().e(((int[]) this.f41668c)[0]);
                return;
            case 3:
                yy yyVar2 = (yy) this.f41667b;
                yyVar2.p4((ArrayList) this.f41668c, 102, false, false, null);
                yyVar2.finishPreviewFragment();
                return;
            case 4:
                yy.D0((yy) this.f41667b, (BirthdayController.BirthdayState) this.f41668c);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.n51(14, (yy) this.f41667b, (String) this.f41668c), 250L);
                return;
            case 6:
                i20 i20Var = (i20) this.f41667b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((j20) this.f41668c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f16400id = 2;
                while (i20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.f16400id) != null) {
                    dialogFilter.f16400id++;
                }
                dialogFilter.order = i20Var.e.getMessagesController().getDialogFilters().size();
                dialogFilter.unreadCount = -1;
                dialogFilter.pendingUnreadCount = -1;
                for (int i20 = 0; i20 < 2; i20++) {
                    TLRPC.DialogFilter dialogFilter2 = suggestedFilter.filter;
                    if (i20 == 0) {
                        arrayList = dialogFilter2.include_peers;
                    } else {
                        arrayList = dialogFilter2.exclude_peers;
                    }
                    if (i20 == 0) {
                        arrayList2 = dialogFilter.alwaysShow;
                    } else {
                        arrayList2 = dialogFilter.neverShow;
                    }
                    int size = arrayList.size();
                    int i21 = 0;
                    while (i21 < size) {
                        TLRPC.InputPeer inputPeer = arrayList.get(i21);
                        long j11 = j10;
                        long j12 = inputPeer.user_id;
                        if (j12 == j11) {
                            long j13 = inputPeer.chat_id;
                            if (j13 == j11) {
                                j13 = inputPeer.channel_id;
                            }
                            j12 = -j13;
                        }
                        i21 = com.google.android.gms.internal.play_billing.k3.h(j12, arrayList2, i21, 1);
                        j10 = j11;
                    }
                }
                TLRPC.DialogFilter dialogFilter3 = suggestedFilter.filter;
                if (dialogFilter3.groups) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                }
                if (dialogFilter3.bots) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_BOTS;
                }
                if (dialogFilter3.contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                }
                if (dialogFilter3.non_contacts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                }
                if (dialogFilter3.broadcasts) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                }
                if (dialogFilter3.exclude_archived) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED;
                }
                if (dialogFilter3.exclude_read) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ;
                }
                if (dialogFilter3.exclude_muted) {
                    dialogFilter.flags |= MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED;
                }
                k10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, i20Var.e, new d20(1, i20Var, suggestedFilter));
                return;
            case 7:
                pf.d.r((Context) this.f41667b, ((TL_fragment.TL_collectibleInfo) this.f41668c).url);
                return;
            case 8:
                ((org.telegram.ui.Components.n21) this.f41667b).run();
                ((org.telegram.ui.ActionBar.e3) this.f41668c).dismiss();
                return;
            case 9:
                TextView textView = (TextView) this.f41668c;
                n60 n60Var = ((w30) this.f41667b).E;
                ChatObject.Call call = n60Var.f38157a1;
                if (call != null && call.recording) {
                    n60Var.H1(textView);
                    return;
                }
                return;
            case 10:
                new w50((Context) this.f41668c, (x50) this.f41667b).show();
                return;
            case 11:
                h80 h80Var = (h80) this.f41667b;
                org.telegram.ui.Components.bk0 bk0Var = (org.telegram.ui.Components.bk0) this.f41668c;
                h80Var.getClass();
                if (!yy.f41979x4) {
                    yy.f41979x4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        O0 = org.telegram.ui.ActionBar.g6.O0("Night");
                    } else {
                        O0 = org.telegram.ui.ActionBar.g6.O0("Blue");
                    }
                    org.telegram.ui.ActionBar.g6.f19797o = 0;
                    org.telegram.ui.ActionBar.g6.r1();
                    org.telegram.ui.ActionBar.g6.A();
                    org.telegram.ui.Components.yj0 yj0Var = h80Var.v;
                    if (!q6) {
                        i10 = yj0Var.e[0] - 1;
                    } else {
                        i10 = 0;
                    }
                    yj0Var.P(i10);
                    bk0Var.d();
                    bk0Var.getLocationInWindow(r0);
                    int[] iArr = {(bk0Var.getMeasuredWidth() / 2) + iArr[0], (bk0Var.getMeasuredHeight() / 2) + iArr[1]};
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z11), bk0Var);
                    if (!q6) {
                        i11 = R.string.AccDescrSwitchToDayTheme;
                    } else {
                        i11 = R.string.AccDescrSwitchToNightTheme;
                    }
                    bk0Var.setContentDescription(LocaleController.getString(i11));
                    return;
                }
                return;
            case 12:
                t80 t80Var = (t80) this.f41667b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f41668c;
                t80Var.Q.dismiss();
                if (t80Var.f40026f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = t80Var.f40023c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    yy yyVar3 = new yy(bundle);
                    yyVar3.C2 = new qw(t80Var, yyVar3);
                    m2Var.presentFragment(yyVar3);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", t80Var.f40023c0);
                e6 e6Var = new e6(bundle2);
                e6Var.d = t80Var.f40026f0;
                e6Var.U();
                m2Var.presentFragment(e6Var);
                return;
            case 13:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f41668c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f41667b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f21422a.a(z10, true);
                }
                return;
            case 14:
                org.telegram.ui.Components.g5.x((Context) this.f41668c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new pb0((zb0) this.f41667b, 0));
                return;
            case 15:
                zb0 zb0Var = (zb0) this.f41667b;
                Runnable[] runnableArr = (Runnable[]) this.f41668c;
                if (zb0Var.e == null) {
                    wb0 wb0Var = zb0Var.f42264f;
                    if (wb0Var.e.h) {
                        int i24 = -zb0Var.N;
                        zb0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(wb0Var, i24);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    Switch r42 = w8Var.e;
                    w8Var.setChecked(!r42.h);
                    xb0 xb0Var = zb0Var.f42266r;
                    if (r42.h) {
                        i19 = 0;
                    }
                    xb0Var.setVisibility(i19);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        zb0Var.f42264f.setChecked(false);
                        zb0Var.f42264f.setCheckBoxIcon(R.drawable.permission_locked);
                        zb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        ob0 ob0Var = new ob0(zb0Var, 0);
                        runnableArr[0] = ob0Var;
                        AndroidUtilities.runOnUIThread(ob0Var, 60L);
                        return;
                    }
                    zb0Var.f42264f.setCheckBoxIcon(0);
                    zb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    ob0 ob0Var2 = new ob0(zb0Var, 1);
                    runnableArr[0] = ob0Var2;
                    AndroidUtilities.runOnUIThread(ob0Var2);
                    return;
                }
                return;
            case 16:
                ld0 ld0Var = (ld0) this.f41667b;
                ld0Var.q0((fd0) this.f41668c);
                dd0 dd0Var = ld0Var.I0;
                if (dd0Var != null) {
                    dd0Var.dismiss();
                    return;
                }
                return;
            case 17:
                ld0 ld0Var2 = ((id0) this.f41667b).f36787b;
                ld0Var2.getClass();
                ld0Var2.F0.b(((kd0) this.f41668c).f37352c, ld0Var2.G0, true, 0, 0L);
                ld0Var2.finishFragment();
                return;
            case 18:
                je0 je0Var = (je0) this.f41667b;
                Context context = (Context) this.f41668c;
                String string = je0Var.f37039y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28163a |= 256;
                    obj.f28164b = indexOf;
                    int i25 = lastIndexOf + 1;
                    obj.f28165c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.r11(obj, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i26 = je0Var.G;
                int i27 = i26 / 86400;
                int i28 = i26 % 86400;
                int i29 = i28 / 3600;
                int i30 = (i28 % 3600) / 60;
                if (i27 == 0 && i29 == 0) {
                    i30 = Math.max(1, i30);
                }
                if (i27 != 0 && i29 != 0) {
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i27, new Object[0]), LocaleController.formatPluralString("Hours", i29, new Object[0]));
                } else if (i29 != 0 && i30 != 0) {
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i29, new Object[0]), LocaleController.formatPluralString("Minutes", i30, new Object[0]));
                } else if (i27 != 0) {
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i27, new Object[0]));
                } else if (i29 != 0) {
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i27, new Object[0]));
                } else {
                    formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", i30, new Object[0]));
                }
                alertDialog$Builder.f19248a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, formatString);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new mu(je0Var, 17));
                i2.d.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 19:
                te0 te0Var = (te0) this.f41667b;
                Context context2 = (Context) this.f41668c;
                ah0 ah0Var = te0Var.f40095y;
                if (ah0Var.V.getTag() == null) {
                    if (te0Var.f40090n.has_recovery) {
                        ah0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new qe0(te0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(te0Var.f40086a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f19248a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f19248a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new mu(te0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 20:
                dg0 dg0Var = (dg0) this.f41667b;
                Context context3 = (Context) this.f41668c;
                Bundle bundle3 = dg0Var.f35004o0;
                if (bundle3 != null && (tL_auth_sentCode = dg0Var.f35005p0) != null) {
                    dg0Var.f35010s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!dg0Var.f34992d0) {
                    bg0 bg0Var = dg0Var.v;
                    if ((bg0Var == null || bg0Var.getVisibility() == 8) && !dg0Var.f34998i0) {
                        if (dg0Var.f34996g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = dg0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = dg0Var.f34990c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            dg0Var.f35010s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f19248a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f19248a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, dg0Var.f34988b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new qw(22, dg0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new sf0(dg0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (dg0Var.f35010s0.V.getTag() == null) {
                            dg0Var.x();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 21:
                zg0 zg0Var = (zg0) this.f41667b;
                Context context4 = (Context) this.f41668c;
                Toast toast = zg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    zg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (zg0Var.M > 0 && currentTimeMillis - zg0Var.N > 1500) {
                    zg0Var.M = 0;
                }
                int i31 = zg0Var.M + 1;
                zg0Var.M = i31;
                zg0Var.N = currentTimeMillis;
                if (i31 >= 5) {
                    zg0Var.M = 0;
                    zg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zg0Var.getContext());
                    alertDialog$Builder4.f19248a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new o4(zg0Var, 2));
                    alertDialog$Builder4.o();
                    return;
                } else if (i31 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i31, new Object[0]), 0);
                    zg0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) this.f41668c;
                pj0 pj0Var = ((nj0) this.f41667b).d;
                if (!pj0Var.a0(messageObject)) {
                    pj0Var.getOrCreateStoryViewer().F(pj0Var.getParentActivity(), messageObject.storyItem, bi.g9.a(pj0Var.f38954f));
                    return;
                }
                return;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41667b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f41668c;
                passcodeActivity.getClass();
                atomicBoolean.set(!atomicBoolean.get());
                int selectionStart = passcodeActivity.h.getSelectionStart();
                int selectionEnd = passcodeActivity.h.getSelectionEnd();
                EditTextBoldCursor editTextBoldCursor = passcodeActivity.h;
                if (atomicBoolean.get()) {
                    i14 = 144;
                } else {
                    i14 = 128;
                }
                editTextBoldCursor.setInputType(i14 | 1);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f31881s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.g6.f19745l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.g6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
                return;
            case 24:
                ap0.h0((ap0) this.f41667b, (String) this.f41668c, view);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.f41667b;
                org.telegram.ui.Components.l80 l80Var = (org.telegram.ui.Components.l80) this.f41668c;
                if (photoViewer.T4 != null) {
                    l80Var.u();
                    org.telegram.ui.ActionBar.m2 m2Var2 = photoViewer.f32000m4;
                    if (m2Var2 instanceof fo) {
                        ((fo) m2Var2).O9(photoViewer.T4, false, true);
                    }
                    pf.d.q(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f41667b;
                Activity activity = (Activity) this.f41668c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.I1() && !photoViewer2.f32040r) {
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.f31952g7.size()) {
                        Object obj2 = photoViewer2.f31952g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f31973j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                di.d4 d4Var = photoViewer2.f31982k1;
                                if (d4Var != null) {
                                    d4Var.e(true);
                                    photoViewer2.f31982k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f31982k1 = new di.d4(photoViewer2.E, 3);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                                    if (isHighQuality) {
                                        i16 = R.string.PhotoWillBeSentInHD;
                                    } else {
                                        i16 = R.string.PhotoWillBeSentInSD;
                                    }
                                    SpannableStringBuilder append = spannableStringBuilder2.append((CharSequence) LocaleController.getString(i16));
                                    if (isHighQuality) {
                                        i17 = R.drawable.menu_quality_hd_filled;
                                    } else {
                                        i17 = R.drawable.menu_quality_sd_filled;
                                    }
                                    append.setSpan(new org.telegram.ui.Components.br(i17, 0), 0, 1, 33);
                                    photoViewer2.f31982k1.s(append);
                                    photoViewer2.f31928e0.addView(photoViewer2.f31982k1, w7.z5.a(100.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 87));
                                    photoViewer2.f31982k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f31982k1.m(0.0f, (photoViewer2.f31973j1.getWidth() / 2.0f) + photoViewer2.f31973j1.getX() + photoViewer2.H0.getX());
                                    di.d4 d4Var2 = photoViewer2.f31982k1;
                                    d4Var2.f6804l0 = new rh(2, d4Var2);
                                    d4Var2.d = 3500L;
                                    d4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f31973j1.getTag() == null) {
                        if (photoViewer2.f31989k8) {
                            if (photoViewer2.f31997m1 == null) {
                                bv0 bv0Var = photoViewer2.f31928e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.kr0(textView2, 18);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                bv0Var.addView((View) textView2, w7.z5.a(-2.0f, 5.0f, 0.0f, 5.0f, 3.0f, -2, 51));
                                textView2.setVisibility(8);
                                photoViewer2.f31997m1 = textView2;
                            }
                            photoViewer2.f31997m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.a31 a31Var = photoViewer2.f31997m1;
                            org.telegram.ui.Components.v71 v71Var = photoViewer2.f31973j1;
                            org.telegram.ui.Components.kr0 kr0Var = a31Var.d;
                            if (v71Var != null) {
                                a31Var.f23116a = v71Var;
                                a31Var.a();
                                a31Var.f23118c = true;
                                AndroidUtilities.cancelRunOnUIThread(kr0Var);
                                AndroidUtilities.runOnUIThread(kr0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = a31Var.f23117b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    a31Var.f23117b.cancel();
                                    a31Var.f23117b = null;
                                }
                                if (a31Var.getVisibility() != 0) {
                                    a31Var.setAlpha(0.0f);
                                    a31Var.setVisibility(0);
                                    ViewPropertyAnimator listener = a31Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    a31Var.f23117b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.Y2(true);
                    photoViewer2.p2(1);
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.Components.l80) this.f41668c).K((org.telegram.ui.Components.l80) this.f41667b);
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f41667b;
                ((AlertDialog$Builder) this.f41668c).f19248a.L0.run();
                Integer num2 = (Integer) view.getTag();
                if (num2.intValue() == 0) {
                    i18 = 30;
                } else if (num2.intValue() == 1) {
                    i18 = 90;
                } else if (num2.intValue() == 2) {
                    i18 = 182;
                } else if (num2.intValue() == 3) {
                    i18 = 365;
                } else if (num2.intValue() == 4) {
                    i18 = 548;
                } else if (num2.intValue() == 5) {
                    i18 = 730;
                } else {
                    i18 = 0;
                }
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(privacySettingsActivity.getParentActivity(), 3, null);
                a2Var.f19269g0 = false;
                a2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ts0(privacySettingsActivity, a2Var, setaccountttl, 2));
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f41667b;
                profileActivity.getClass();
                org.telegram.ui.Components.sc.e();
                pf.d.r(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f41668c).url);
                return;
        }
    }

    public xv(org.telegram.ui.Components.l80 l80Var, org.telegram.ui.Components.l80 l80Var2) {
        this.f41666a = 27;
        this.f41668c = l80Var;
        this.f41667b = l80Var2;
    }
}
