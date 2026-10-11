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
public final class qv implements View.OnClickListener {
    public final int f41266a;
    public final Object f41267b;
    public final Object f41268c;

    public qv(int i10, Object obj, Object obj2) {
        this.f41266a = i10;
        this.f41267b = obj;
        this.f41268c = obj2;
    }

    @Override
    public final void onClick(View view) {
        ArrayList<TLRPC.InputPeer> arrayList;
        ArrayList<Long> arrayList2;
        org.telegram.ui.ActionBar.g6 O0;
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
        long j3 = 0;
        int i19 = 8;
        switch (this.f41266a) {
            case 0:
                sy syVar = (sy) this.f41267b;
                syVar.getClass();
                ((org.telegram.ui.Components.q80) this.f41268c).u();
                syVar.presentFragment(new ProxyListActivity());
                return;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.a2[]) this.f41268c, r0, r0.currentAccount, ((sy) this.f41267b).Y2);
                return;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f41267b)[0].getSwipeBack().e(((int[]) this.f41268c)[0]);
                return;
            case 3:
                sy syVar2 = (sy) this.f41267b;
                syVar2.o4((ArrayList) this.f41268c, 102, false, false, null);
                syVar2.finishPreviewFragment();
                return;
            case 4:
                sy.E0((sy) this.f41267b, (BirthdayController.BirthdayState) this.f41268c);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.i(7, (sy) this.f41267b, (String) this.f41268c), 250L);
                return;
            case 6:
                b20 b20Var = (b20) this.f41267b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((c20) this.f41268c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f17251id = 2;
                while (b20Var.f36245e.getMessagesController().dialogFiltersById.get(dialogFilter.f17251id) != null) {
                    dialogFilter.f17251id++;
                }
                dialogFilter.order = b20Var.f36245e.getMessagesController().getDialogFilters().size();
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
                        long j10 = j3;
                        long j11 = inputPeer.user_id;
                        if (j11 == j10) {
                            long j12 = inputPeer.chat_id;
                            if (j12 == j10) {
                                j12 = inputPeer.channel_id;
                            }
                            j11 = -j12;
                        }
                        i21 = com.google.android.gms.internal.vision.e2.g(j11, arrayList2, i21, 1);
                        j3 = j10;
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
                e10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, b20Var.f36245e, new org.telegram.ui.Components.voip.i(24, b20Var, suggestedFilter));
                return;
            case 7:
                of.f.s((Context) this.f41267b, ((TL_fragment.TL_collectibleInfo) this.f41268c).url);
                return;
            case 8:
                ((org.telegram.ui.Components.s21) this.f41267b).run();
                ((org.telegram.ui.ActionBar.e3) this.f41268c).dismiss();
                return;
            case 9:
                TextView textView = (TextView) this.f41268c;
                g60 g60Var = ((q30) this.f41267b).E;
                ChatObject.Call call = g60Var.f37869a1;
                if (call != null && call.recording) {
                    g60Var.H1(textView);
                    return;
                }
                return;
            case 10:
                new p50((Context) this.f41268c, (q50) this.f41267b).show();
                return;
            case 11:
                c80 c80Var = (c80) this.f41267b;
                org.telegram.ui.Components.hk0 hk0Var = (org.telegram.ui.Components.hk0) this.f41268c;
                c80Var.getClass();
                if (!sy.f41880w4) {
                    sy.f41880w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        O0 = org.telegram.ui.ActionBar.h6.O0("Night");
                    } else {
                        O0 = org.telegram.ui.ActionBar.h6.O0("Blue");
                    }
                    org.telegram.ui.ActionBar.h6.f20982o = 0;
                    org.telegram.ui.ActionBar.h6.r1();
                    org.telegram.ui.ActionBar.h6.A();
                    org.telegram.ui.Components.ek0 ek0Var = c80Var.v;
                    if (!q6) {
                        i10 = ek0Var.f26043e[0] - 1;
                    } else {
                        i10 = 0;
                    }
                    ek0Var.P(i10);
                    hk0Var.d();
                    hk0Var.getLocationInWindow(r0);
                    int[] iArr = {(hk0Var.getMeasuredWidth() / 2) + iArr[0], (hk0Var.getMeasuredHeight() / 2) + iArr[1]};
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z11), hk0Var);
                    if (!q6) {
                        i11 = R.string.AccDescrSwitchToDayTheme;
                    } else {
                        i11 = R.string.AccDescrSwitchToNightTheme;
                    }
                    hk0Var.setContentDescription(LocaleController.getString(i11));
                    return;
                }
                return;
            case 12:
                o80 o80Var = (o80) this.f41267b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f41268c;
                o80Var.Q.dismiss();
                if (o80Var.f40443f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = o80Var.f40440c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    sy syVar3 = new sy(bundle);
                    syVar3.C2 = new nw(o80Var, syVar3);
                    m2Var.presentFragment(syVar3);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", o80Var.f40440c0);
                z5 z5Var = new z5(bundle2);
                z5Var.d = o80Var.f40443f0;
                z5Var.U();
                m2Var.presentFragment(z5Var);
                return;
            case 13:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f41268c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f41267b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f22672a.a(z10, true);
                }
                return;
            case 14:
                org.telegram.ui.Components.g5.x((Context) this.f41268c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new kb0((ub0) this.f41267b, 0));
                return;
            case 15:
                ub0 ub0Var = (ub0) this.f41267b;
                Runnable[] runnableArr = (Runnable[]) this.f41268c;
                if (ub0Var.f42507e == null) {
                    rb0 rb0Var = ub0Var.f42508f;
                    if (rb0Var.f23680e.h) {
                        int i24 = -ub0Var.N;
                        ub0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(rb0Var, i24);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    Switch r42 = w8Var.f23680e;
                    w8Var.setChecked(!r42.h);
                    sb0 sb0Var = ub0Var.f42510r;
                    if (r42.h) {
                        i19 = 0;
                    }
                    sb0Var.setVisibility(i19);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        ub0Var.f42508f.setChecked(false);
                        ub0Var.f42508f.setCheckBoxIcon(R.drawable.permission_locked);
                        ub0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        jb0 jb0Var = new jb0(ub0Var, 0);
                        runnableArr[0] = jb0Var;
                        AndroidUtilities.runOnUIThread(jb0Var, 60L);
                        return;
                    }
                    ub0Var.f42508f.setCheckBoxIcon(0);
                    ub0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    jb0 jb0Var2 = new jb0(ub0Var, 1);
                    runnableArr[0] = jb0Var2;
                    AndroidUtilities.runOnUIThread(jb0Var2);
                    return;
                }
                return;
            case 16:
                gd0 gd0Var = (gd0) this.f41267b;
                gd0Var.q0((ad0) this.f41268c);
                yc0 yc0Var = gd0Var.I0;
                if (yc0Var != null) {
                    yc0Var.dismiss();
                    return;
                }
                return;
            case 17:
                gd0 gd0Var2 = ((dd0) this.f41267b).f36988b;
                gd0Var2.getClass();
                gd0Var2.F0.b(((fd0) this.f41268c).f37644c, gd0Var2.G0, true, 0, 0L);
                gd0Var2.finishFragment();
                return;
            case 18:
                ee0 ee0Var = (ee0) this.f41267b;
                Context context = (Context) this.f41268c;
                String string = ee0Var.f37288y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f31643a |= 256;
                    obj.f31644b = indexOf;
                    int i25 = lastIndexOf + 1;
                    obj.f31645c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.w11(obj, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i26 = ee0Var.G;
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
                alertDialog$Builder.f20368a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, formatString);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new fu(ee0Var, 17));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 19:
                ne0 ne0Var = (ne0) this.f41267b;
                Context context2 = (Context) this.f41268c;
                vg0 vg0Var = ne0Var.f40235y;
                if (vg0Var.V.getTag() == null) {
                    if (ne0Var.f40230n.has_recovery) {
                        vg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new le0(ne0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(ne0Var.f40225a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f20368a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f20368a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new fu(ne0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 20:
                yf0 yf0Var = (yf0) this.f41267b;
                Context context3 = (Context) this.f41268c;
                Bundle bundle3 = yf0Var.f44376o0;
                if (bundle3 != null && (tL_auth_sentCode = yf0Var.f44377p0) != null) {
                    yf0Var.f44382s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!yf0Var.f44363d0) {
                    wf0 wf0Var = yf0Var.v;
                    if ((wf0Var == null || wf0Var.getVisibility() == 8) && !yf0Var.f44370i0) {
                        if (yf0Var.f44368g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = yf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = yf0Var.f44361c;
                            tL_auth_reportMissingCode.mnc = "";
                            try {
                                String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                                if (!TextUtils.isEmpty(networkOperator)) {
                                    networkOperator.substring(0, 3);
                                    tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            yf0Var.f44382s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f20368a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f20368a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, yf0Var.f44359b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new nw(21, yf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new mf0(yf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (yf0Var.f44382s0.V.getTag() == null) {
                            yf0Var.x();
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
                ug0 ug0Var = (ug0) this.f41267b;
                Context context4 = (Context) this.f41268c;
                Toast toast = ug0Var.O;
                if (toast != null) {
                    toast.cancel();
                    ug0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (ug0Var.M > 0 && currentTimeMillis - ug0Var.N > 1500) {
                    ug0Var.M = 0;
                }
                int i31 = ug0Var.M + 1;
                ug0Var.M = i31;
                ug0Var.N = currentTimeMillis;
                if (i31 >= 5) {
                    ug0Var.M = 0;
                    ug0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ug0Var.getContext());
                    alertDialog$Builder4.f20368a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new sv(ug0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i31 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i31, new Object[0]), 0);
                    ug0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) this.f41268c;
                kj0 kj0Var = ((ij0) this.f41267b).d;
                if (!kj0Var.a0(messageObject)) {
                    kj0Var.getOrCreateStoryViewer().F(kj0Var.getParentActivity(), messageObject.storyItem, ai.v9.a(kj0Var.f39358f));
                    return;
                }
                return;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41267b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f41268c;
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
                ImageView imageView = passcodeActivity.f33884s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.h6.f20932l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.h6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                return;
            case 24:
                uo0.h0((uo0) this.f41267b, (String) this.f41268c, view);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.f41267b;
                org.telegram.ui.Components.q80 q80Var = (org.telegram.ui.Components.q80) this.f41268c;
                if (photoViewer.T4 != null) {
                    q80Var.u();
                    org.telegram.ui.ActionBar.m2 m2Var2 = photoViewer.f34003m4;
                    if (m2Var2 instanceof zn) {
                        ((zn) m2Var2).O9(photoViewer.T4, false, true);
                    }
                    of.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f41267b;
                Activity activity = (Activity) this.f41268c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.I1() && !photoViewer2.f34043r) {
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.f33956g7.size()) {
                        Object obj2 = photoViewer2.f33956g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f33977j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.d4 d4Var = photoViewer2.f33985k1;
                                if (d4Var != null) {
                                    d4Var.e(true);
                                    photoViewer2.f33985k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f33985k1 = new ci.d4(photoViewer2.E, 3);
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
                                    append.setSpan(new org.telegram.ui.Components.er(i17, 0), 0, 1, 33);
                                    photoViewer2.f33985k1.s(append);
                                    photoViewer2.f33932e0.addView(photoViewer2.f33985k1, w7.x5.a(100.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 87));
                                    photoViewer2.f33985k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f33985k1.m(0.0f, (photoViewer2.f33977j1.getWidth() / 2.0f) + photoViewer2.f33977j1.getX() + photoViewer2.H0.getX());
                                    ci.d4 d4Var2 = photoViewer2.f33985k1;
                                    d4Var2.f4917l0 = new nh(2, d4Var2);
                                    d4Var2.d = 3500L;
                                    d4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f33977j1.getTag() == null) {
                        if (photoViewer2.f33992k8) {
                            if (photoViewer2.f34000m1 == null) {
                                vu0 vu0Var = photoViewer2.f33932e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.qr0(textView2, 17);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                vu0Var.addView((View) textView2, w7.x5.a(-2.0f, 5.0f, 0.0f, 5.0f, 3.0f, -2, 51));
                                textView2.setVisibility(8);
                                photoViewer2.f34000m1 = textView2;
                            }
                            photoViewer2.f34000m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.f31 f31Var = photoViewer2.f34000m1;
                            org.telegram.ui.Components.z71 z71Var = photoViewer2.f33977j1;
                            org.telegram.ui.Components.qr0 qr0Var = f31Var.d;
                            if (z71Var != null) {
                                f31Var.f26213a = z71Var;
                                f31Var.a();
                                f31Var.f26215c = true;
                                AndroidUtilities.cancelRunOnUIThread(qr0Var);
                                AndroidUtilities.runOnUIThread(qr0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = f31Var.f26214b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    f31Var.f26214b.cancel();
                                    f31Var.f26214b = null;
                                }
                                if (f31Var.getVisibility() != 0) {
                                    f31Var.setAlpha(0.0f);
                                    f31Var.setVisibility(0);
                                    ViewPropertyAnimator listener = f31Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    f31Var.f26214b = listener;
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
                ((org.telegram.ui.Components.q80) this.f41268c).K((org.telegram.ui.Components.q80) this.f41267b);
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f41267b;
                ((AlertDialog$Builder) this.f41268c).f20368a.L0.run();
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
                a2Var.f20390g0 = false;
                a2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ms0(privacySettingsActivity, a2Var, setaccountttl, 2));
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f41267b;
                profileActivity.getClass();
                org.telegram.ui.Components.sc.e();
                of.f.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f41268c).url);
                return;
        }
    }

    public qv(org.telegram.ui.Components.q80 q80Var, org.telegram.ui.Components.q80 q80Var2) {
        this.f41266a = 27;
        this.f41268c = q80Var;
        this.f41267b = q80Var2;
    }
}
