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
    public final int f41966a;
    public final Object f41967b;
    public final Object f41968c;

    public xv(int i10, Object obj, Object obj2) {
        this.f41966a = i10;
        this.f41967b = obj;
        this.f41968c = obj2;
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
        switch (this.f41966a) {
            case 0:
                yy yyVar = (yy) this.f41967b;
                yyVar.getClass();
                ((org.telegram.ui.Components.m80) this.f41968c).u();
                yyVar.presentFragment(new ProxyListActivity());
                return;
            case 1:
                gi.u0.e((org.telegram.ui.ActionBar.a2[]) this.f41968c, r0, r0.currentAccount, ((yy) this.f41967b).Y2);
                return;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f41967b)[0].getSwipeBack().e(((int[]) this.f41968c)[0]);
                return;
            case 3:
                yy yyVar2 = (yy) this.f41967b;
                yyVar2.o4((ArrayList) this.f41968c, 102, false, false, null);
                yyVar2.finishPreviewFragment();
                return;
            case 4:
                yy.E0((yy) this.f41967b, (BirthdayController.BirthdayState) this.f41968c);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k31(19, (yy) this.f41967b, (String) this.f41968c), 250L);
                return;
            case 6:
                i20 i20Var = (i20) this.f41967b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((j20) this.f41968c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f16708id = 2;
                while (i20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.f16708id) != null) {
                    dialogFilter.f16708id++;
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
                l10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, i20Var.e, new o00(6, i20Var, suggestedFilter));
                return;
            case 7:
                pf.d.s((Context) this.f41967b, ((TL_fragment.TL_collectibleInfo) this.f41968c).url);
                return;
            case 8:
                ((org.telegram.ui.Components.m21) this.f41967b).run();
                ((org.telegram.ui.ActionBar.e3) this.f41968c).dismiss();
                return;
            case 9:
                TextView textView = (TextView) this.f41968c;
                n60 n60Var = ((w30) this.f41967b).E;
                ChatObject.Call call = n60Var.f38442a1;
                if (call != null && call.recording) {
                    n60Var.H1(textView);
                    return;
                }
                return;
            case 10:
                new w50((Context) this.f41968c, (x50) this.f41967b).show();
                return;
            case 11:
                h80 h80Var = (h80) this.f41967b;
                org.telegram.ui.Components.bk0 bk0Var = (org.telegram.ui.Components.bk0) this.f41968c;
                h80Var.getClass();
                if (!yy.f42299w4) {
                    yy.f42299w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        O0 = org.telegram.ui.ActionBar.g6.O0("Night");
                    } else {
                        O0 = org.telegram.ui.ActionBar.g6.O0("Blue");
                    }
                    org.telegram.ui.ActionBar.g6.f20097o = 0;
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
                t80 t80Var = (t80) this.f41967b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f41968c;
                t80Var.Q.dismiss();
                if (t80Var.f40311f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = t80Var.f40308c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    yy yyVar3 = new yy(bundle);
                    yyVar3.C2 = new gw(t80Var, yyVar3);
                    m2Var.presentFragment(yyVar3);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", t80Var.f40308c0);
                e6 e6Var = new e6(bundle2);
                e6Var.d = t80Var.f40311f0;
                e6Var.U();
                m2Var.presentFragment(e6Var);
                return;
            case 13:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f41968c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f41967b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f21724a.a(z10, true);
                }
                return;
            case 14:
                org.telegram.ui.Components.g5.x((Context) this.f41968c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new qb0((ac0) this.f41967b, 0));
                return;
            case 15:
                ac0 ac0Var = (ac0) this.f41967b;
                Runnable[] runnableArr = (Runnable[]) this.f41968c;
                if (ac0Var.e == null) {
                    xb0 xb0Var = ac0Var.f34168f;
                    if (xb0Var.e.h) {
                        int i24 = -ac0Var.N;
                        ac0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(xb0Var, i24);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    Switch r42 = w8Var.e;
                    w8Var.setChecked(!r42.h);
                    yb0 yb0Var = ac0Var.f34170r;
                    if (r42.h) {
                        i19 = 0;
                    }
                    yb0Var.setVisibility(i19);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        ac0Var.f34168f.setChecked(false);
                        ac0Var.f34168f.setCheckBoxIcon(R.drawable.permission_locked);
                        ac0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        pb0 pb0Var = new pb0(ac0Var, 0);
                        runnableArr[0] = pb0Var;
                        AndroidUtilities.runOnUIThread(pb0Var, 60L);
                        return;
                    }
                    ac0Var.f34168f.setCheckBoxIcon(0);
                    ac0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    pb0 pb0Var2 = new pb0(ac0Var, 1);
                    runnableArr[0] = pb0Var2;
                    AndroidUtilities.runOnUIThread(pb0Var2);
                    return;
                }
                return;
            case 16:
                nd0 nd0Var = (nd0) this.f41967b;
                nd0Var.q0((hd0) this.f41968c);
                fd0 fd0Var = nd0Var.I0;
                if (fd0Var != null) {
                    fd0Var.dismiss();
                    return;
                }
                return;
            case 17:
                nd0 nd0Var2 = ((kd0) this.f41967b).f37626b;
                nd0Var2.getClass();
                nd0Var2.F0.b(((md0) this.f41968c).f38224c, nd0Var2.G0, true, 0, 0L);
                nd0Var2.finishFragment();
                return;
            case 18:
                le0 le0Var = (le0) this.f41967b;
                Context context = (Context) this.f41968c;
                String string = le0Var.f37939y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28135a |= 256;
                    obj.f28136b = indexOf;
                    int i25 = lastIndexOf + 1;
                    obj.f28137c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.q11(obj, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i26 = le0Var.G;
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
                alertDialog$Builder.f19548a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, formatString);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new mu(le0Var, 17));
                org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 19:
                ue0 ue0Var = (ue0) this.f41967b;
                Context context2 = (Context) this.f41968c;
                bh0 bh0Var = ue0Var.f40665y;
                if (bh0Var.V.getTag() == null) {
                    if (ue0Var.f40660n.has_recovery) {
                        bh0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new se0(ue0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(ue0Var.f40656a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f19548a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f19548a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new mu(ue0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 20:
                eg0 eg0Var = (eg0) this.f41967b;
                Context context3 = (Context) this.f41968c;
                Bundle bundle3 = eg0Var.f35560o0;
                if (bundle3 != null && (tL_auth_sentCode = eg0Var.f35561p0) != null) {
                    eg0Var.f35566s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!eg0Var.f35548d0) {
                    cg0 cg0Var = eg0Var.v;
                    if ((cg0Var == null || cg0Var.getVisibility() == 8) && !eg0Var.f35554i0) {
                        if (eg0Var.f35552g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = eg0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = eg0Var.f35546c;
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
                            eg0Var.f35566s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f19548a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f19548a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, eg0Var.f35544b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new gw(23, eg0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new tf0(eg0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (eg0Var.f35566s0.V.getTag() == null) {
                            eg0Var.x();
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
                ah0 ah0Var = (ah0) this.f41967b;
                Context context4 = (Context) this.f41968c;
                Toast toast = ah0Var.O;
                if (toast != null) {
                    toast.cancel();
                    ah0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (ah0Var.M > 0 && currentTimeMillis - ah0Var.N > 1500) {
                    ah0Var.M = 0;
                }
                int i31 = ah0Var.M + 1;
                ah0Var.M = i31;
                ah0Var.N = currentTimeMillis;
                if (i31 >= 5) {
                    ah0Var.M = 0;
                    ah0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ah0Var.getContext());
                    alertDialog$Builder4.f19548a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new o4(ah0Var, 2));
                    alertDialog$Builder4.o();
                    return;
                } else if (i31 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i31, new Object[0]), 0);
                    ah0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) this.f41968c;
                qj0 qj0Var = ((oj0) this.f41967b).d;
                if (!qj0Var.a0(messageObject)) {
                    qj0Var.getOrCreateStoryViewer().F(qj0Var.getParentActivity(), messageObject.storyItem, bi.g9.a(qj0Var.f39477f));
                    return;
                }
                return;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41967b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f41968c;
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
                ImageView imageView = passcodeActivity.f32179s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.g6.f20045l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.g6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
                return;
            case 24:
                cp0.h0((cp0) this.f41967b, (String) this.f41968c, view);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.f41967b;
                org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) this.f41968c;
                if (photoViewer.T4 != null) {
                    m80Var.u();
                    org.telegram.ui.ActionBar.m2 m2Var2 = photoViewer.f32298m4;
                    if (m2Var2 instanceof fo) {
                        ((fo) m2Var2).O9(photoViewer.T4, false, true);
                    }
                    pf.d.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f41967b;
                Activity activity = (Activity) this.f41968c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.I1() && !photoViewer2.f32338r) {
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.f32250g7.size()) {
                        Object obj2 = photoViewer2.f32250g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f32271j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                di.d4 d4Var = photoViewer2.f32280k1;
                                if (d4Var != null) {
                                    d4Var.e(true);
                                    photoViewer2.f32280k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f32280k1 = new di.d4(photoViewer2.E, 3);
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
                                    photoViewer2.f32280k1.s(append);
                                    photoViewer2.f32226e0.addView(photoViewer2.f32280k1, w7.a6.a(100.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 87));
                                    photoViewer2.f32280k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f32280k1.m(0.0f, (photoViewer2.f32271j1.getWidth() / 2.0f) + photoViewer2.f32271j1.getX() + photoViewer2.H0.getX());
                                    di.d4 d4Var2 = photoViewer2.f32280k1;
                                    d4Var2.f6801l0 = new rh(2, d4Var2);
                                    d4Var2.d = 3500L;
                                    d4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f32271j1.getTag() == null) {
                        if (photoViewer2.f32287k8) {
                            if (photoViewer2.f32295m1 == null) {
                                cv0 cv0Var = photoViewer2.f32226e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.lr0(textView2, 18);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                cv0Var.addView((View) textView2, w7.a6.a(-2.0f, 5.0f, 0.0f, 5.0f, 3.0f, -2, 51));
                                textView2.setVisibility(8);
                                photoViewer2.f32295m1 = textView2;
                            }
                            photoViewer2.f32295m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.z21 z21Var = photoViewer2.f32295m1;
                            org.telegram.ui.Components.u71 u71Var = photoViewer2.f32271j1;
                            org.telegram.ui.Components.lr0 lr0Var = z21Var.d;
                            if (u71Var != null) {
                                z21Var.f31742a = u71Var;
                                z21Var.a();
                                z21Var.f31744c = true;
                                AndroidUtilities.cancelRunOnUIThread(lr0Var);
                                AndroidUtilities.runOnUIThread(lr0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = z21Var.f31743b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    z21Var.f31743b.cancel();
                                    z21Var.f31743b = null;
                                }
                                if (z21Var.getVisibility() != 0) {
                                    z21Var.setAlpha(0.0f);
                                    z21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = z21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    z21Var.f31743b = listener;
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
                ((org.telegram.ui.Components.m80) this.f41968c).K((org.telegram.ui.Components.m80) this.f41967b);
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f41967b;
                ((AlertDialog$Builder) this.f41968c).f19548a.L0.run();
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
                a2Var.f19569g0 = false;
                a2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new us0(privacySettingsActivity, a2Var, setaccountttl, 2));
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f41967b;
                profileActivity.getClass();
                org.telegram.ui.Components.sc.e();
                pf.d.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f41968c).url);
                return;
        }
    }

    public xv(org.telegram.ui.Components.m80 m80Var, org.telegram.ui.Components.m80 m80Var2) {
        this.f41966a = 27;
        this.f41968c = m80Var;
        this.f41967b = m80Var2;
    }
}
