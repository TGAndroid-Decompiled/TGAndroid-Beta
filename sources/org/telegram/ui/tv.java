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
public final class tv implements View.OnClickListener {
    public final int f37809a;
    public final Object f37810b;
    public final Object f37811c;

    public tv(int i10, Object obj, Object obj2) {
        this.f37809a = i10;
        this.f37810b = obj;
        this.f37811c = obj2;
    }

    @Override
    public final void onClick(View view) {
        ArrayList<TLRPC.InputPeer> arrayList;
        ArrayList<Long> arrayList2;
        org.telegram.ui.ActionBar.i6 N0;
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
        switch (this.f37809a) {
            case 0:
                uy uyVar = (uy) this.f37810b;
                uyVar.getClass();
                ((org.telegram.ui.Components.w70) this.f37811c).u();
                uyVar.presentFragment(new ProxyListActivity());
                return;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.b2[]) this.f37811c, r0, r0.currentAccount, ((uy) this.f37810b).Y2);
                return;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f37810b)[0].getSwipeBack().e(((int[]) this.f37811c)[0]);
                return;
            case 3:
                uy uyVar2 = (uy) this.f37810b;
                uyVar2.r4((ArrayList) this.f37811c, 102, false, false, null);
                uyVar2.finishPreviewFragment();
                return;
            case 4:
                uy.H0((uy) this.f37810b, (BirthdayController.BirthdayState) this.f37811c);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new cu(1, (uy) this.f37810b, (String) this.f37811c), 250L);
                return;
            case 6:
                e20 e20Var = (e20) this.f37810b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((f20) this.f37811c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f15790id = 2;
                while (e20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.f15790id) != null) {
                    dialogFilter.f15790id++;
                }
                dialogFilter.order = e20Var.e.getMessagesController().getDialogFilters().size();
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
                f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, e20Var.e, new cu(18, e20Var, suggestedFilter));
                return;
            case 7:
                nf.f.s((Context) this.f37810b, ((TL_fragment.TL_collectibleInfo) this.f37811c).url);
                return;
            case 8:
                ((org.telegram.ui.Components.h21) this.f37810b).run();
                ((org.telegram.ui.ActionBar.f3) this.f37811c).dismiss();
                return;
            case 9:
                TextView textView = (TextView) this.f37811c;
                i60 i60Var = ((s30) this.f37810b).E;
                ChatObject.Call call = i60Var.f34329a1;
                if (call != null && call.recording) {
                    i60Var.G1(textView);
                    return;
                }
                return;
            case 10:
                new r50((Context) this.f37811c, (s50) this.f37810b).show();
                return;
            case 11:
                d80 d80Var = (d80) this.f37810b;
                org.telegram.ui.Components.lj0 lj0Var = (org.telegram.ui.Components.lj0) this.f37811c;
                d80Var.getClass();
                if (!uy.f38123w4) {
                    uy.f38123w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        N0 = org.telegram.ui.ActionBar.j6.N0("Night");
                    } else {
                        N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    }
                    org.telegram.ui.ActionBar.j6.f19257o = 0;
                    org.telegram.ui.ActionBar.j6.q1();
                    org.telegram.ui.ActionBar.j6.A();
                    org.telegram.ui.Components.ij0 ij0Var = d80Var.v;
                    if (!q6) {
                        i10 = ij0Var.e[0] - 1;
                    } else {
                        i10 = 0;
                    }
                    ij0Var.P(i10);
                    lj0Var.d();
                    lj0Var.getLocationInWindow(r0);
                    int[] iArr = {(lj0Var.getMeasuredWidth() / 2) + iArr[0], (lj0Var.getMeasuredHeight() / 2) + iArr[1]};
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z11), lj0Var);
                    if (!q6) {
                        i11 = R.string.AccDescrSwitchToDayTheme;
                    } else {
                        i11 = R.string.AccDescrSwitchToNightTheme;
                    }
                    lj0Var.setContentDescription(LocaleController.getString(i11));
                    return;
                }
                return;
            case 12:
                p80 p80Var = (p80) this.f37810b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f37811c;
                p80Var.Q.dismiss();
                if (p80Var.f36381f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = p80Var.f36378c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    uy uyVar3 = new uy(bundle);
                    uyVar3.C2 = new z10(5, p80Var, uyVar3);
                    n2Var.presentFragment(uyVar3);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", p80Var.f36378c0);
                a6 a6Var = new a6(bundle2);
                a6Var.d = p80Var.f36381f0;
                a6Var.U();
                n2Var.presentFragment(a6Var);
                return;
            case 13:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f37811c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f37810b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f20800a.a(z10, true);
                }
                return;
            case 14:
                org.telegram.ui.Components.e5.y((Context) this.f37811c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new ob0((yb0) this.f37810b, 0));
                return;
            case 15:
                yb0 yb0Var = (yb0) this.f37810b;
                Runnable[] runnableArr = (Runnable[]) this.f37811c;
                if (yb0Var.e == null) {
                    vb0 vb0Var = yb0Var.f39774f;
                    if (vb0Var.e.h) {
                        int i24 = -yb0Var.N;
                        yb0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(vb0Var, i24);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    Switch r52 = w8Var.e;
                    w8Var.setChecked(!r52.h);
                    wb0 wb0Var = yb0Var.f39776r;
                    if (r52.h) {
                        i19 = 0;
                    }
                    wb0Var.setVisibility(i19);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r52.h) {
                        yb0Var.f39774f.setChecked(false);
                        yb0Var.f39774f.setCheckBoxIcon(R.drawable.permission_locked);
                        yb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        nb0 nb0Var = new nb0(yb0Var, 0);
                        runnableArr[0] = nb0Var;
                        AndroidUtilities.runOnUIThread(nb0Var, 60L);
                        return;
                    }
                    yb0Var.f39774f.setCheckBoxIcon(0);
                    yb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    nb0 nb0Var2 = new nb0(yb0Var, 1);
                    runnableArr[0] = nb0Var2;
                    AndroidUtilities.runOnUIThread(nb0Var2);
                    return;
                }
                return;
            case 16:
                jd0 jd0Var = (jd0) this.f37810b;
                jd0Var.r0((dd0) this.f37811c);
                bd0 bd0Var = jd0Var.I0;
                if (bd0Var != null) {
                    bd0Var.dismiss();
                    return;
                }
                return;
            case 17:
                jd0 jd0Var2 = ((gd0) this.f37810b).f33815b;
                jd0Var2.getClass();
                jd0Var2.F0.b(((id0) this.f37811c).f34500c, jd0Var2.G0, true, 0, 0L);
                jd0Var2.finishFragment();
                return;
            case 18:
                he0 he0Var = (he0) this.f37810b;
                Context context = (Context) this.f37811c;
                String string = he0Var.f34143y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f23395a |= 256;
                    obj.f23396b = indexOf;
                    int i25 = lastIndexOf + 1;
                    obj.f23397c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.e11(obj, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18622a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i26 = he0Var.G;
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
                alertDialog$Builder.f18622a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, formatString);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new fu(he0Var, 18));
                hg.k0.o(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 19:
                qe0 qe0Var = (qe0) this.f37810b;
                Context context2 = (Context) this.f37811c;
                xg0 xg0Var = qe0Var.f36808y;
                if (xg0Var.V.getTag() == null) {
                    if (qe0Var.f36803n.has_recovery) {
                        xg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.n2) xg0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new oe0(qe0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(qe0Var.f36799a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f18622a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f18622a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new fu(qe0Var, 19));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 20:
                ag0 ag0Var = (ag0) this.f37810b;
                Context context3 = (Context) this.f37811c;
                Bundle bundle3 = ag0Var.f32048o0;
                if (bundle3 != null && (tL_auth_sentCode = ag0Var.f32049p0) != null) {
                    ag0Var.f32054s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!ag0Var.f32036d0) {
                    yf0 yf0Var = ag0Var.v;
                    if ((yf0Var == null || yf0Var.getVisibility() == 8) && !ag0Var.f32042i0) {
                        if (ag0Var.f32040g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = ag0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = ag0Var.f32034c;
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
                            ag0Var.f32054s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f18622a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f18622a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, ag0Var.f32032b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new z10(19, ag0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new pf0(ag0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (ag0Var.f32054s0.V.getTag() == null) {
                            ag0Var.x();
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
                wg0 wg0Var = (wg0) this.f37810b;
                Context context4 = (Context) this.f37811c;
                Toast toast = wg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    wg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (wg0Var.M > 0 && currentTimeMillis - wg0Var.N > 1500) {
                    wg0Var.M = 0;
                }
                int i31 = wg0Var.M + 1;
                wg0Var.M = i31;
                wg0Var.N = currentTimeMillis;
                if (i31 >= 5) {
                    wg0Var.M = 0;
                    wg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wg0Var.getContext());
                    alertDialog$Builder4.f18622a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new vv(wg0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i31 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i31, new Object[0]), 0);
                    wg0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) this.f37811c;
                kj0 kj0Var = ((ij0) this.f37810b).d;
                if (!kj0Var.a0(messageObject)) {
                    kj0Var.getOrCreateStoryViewer().F(kj0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(kj0Var.f35127f));
                    return;
                }
                return;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37810b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f37811c;
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
                editTextBoldCursor.setInputType(1 | i14);
                passcodeActivity.h.setSelection(selectionStart, selectionEnd);
                ImageView imageView = passcodeActivity.f31134s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.j6.f19208l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.j6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                return;
            case 24:
                xo0.h0((xo0) this.f37810b, (String) this.f37811c, view);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.f37810b;
                org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) this.f37811c;
                if (photoViewer.T4 != null) {
                    w70Var.u();
                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer.f31252m4;
                    if (n2Var2 instanceof zn) {
                        ((zn) n2Var2).J9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f37810b;
                Activity activity = (Activity) this.f37811c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.H1() && !photoViewer2.f31292r) {
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.f31205g7.size()) {
                        Object obj2 = photoViewer2.f31205g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f31226j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.f4 f4Var = photoViewer2.f31234k1;
                                if (f4Var != null) {
                                    f4Var.e(true);
                                    photoViewer2.f31234k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f31234k1 = new ci.f4(photoViewer2.E, 3);
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
                                    append.setSpan(new org.telegram.ui.Components.oq(i17, 0), 0, 1, 33);
                                    photoViewer2.f31234k1.s(append);
                                    photoViewer2.f31181e0.addView(photoViewer2.f31234k1, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f31234k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f31234k1.m(0.0f, (photoViewer2.f31226j1.getWidth() / 2.0f) + photoViewer2.f31226j1.getX() + photoViewer2.H0.getX());
                                    ci.f4 f4Var2 = photoViewer2.f31234k1;
                                    f4Var2.f4638l0 = new mh(2, f4Var2);
                                    f4Var2.d = 3500L;
                                    f4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f31226j1.getTag() == null) {
                        if (photoViewer2.f31241k8) {
                            if (photoViewer2.f31249m1 == null) {
                                vu0 vu0Var = photoViewer2.f31181e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.xq0(textView2, 17);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                vu0Var.addView((View) textView2, w7.y5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView2.setVisibility(8);
                                photoViewer2.f31249m1 = textView2;
                            }
                            photoViewer2.f31249m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.n21 n21Var = photoViewer2.f31249m1;
                            org.telegram.ui.Components.h71 h71Var = photoViewer2.f31226j1;
                            org.telegram.ui.Components.xq0 xq0Var = n21Var.d;
                            if (h71Var != null) {
                                n21Var.f26603a = h71Var;
                                n21Var.a();
                                n21Var.f26605c = true;
                                AndroidUtilities.cancelRunOnUIThread(xq0Var);
                                AndroidUtilities.runOnUIThread(xq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = n21Var.f26604b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    n21Var.f26604b.cancel();
                                    n21Var.f26604b = null;
                                }
                                if (n21Var.getVisibility() != 0) {
                                    n21Var.setAlpha(0.0f);
                                    n21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = n21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    n21Var.f26604b = listener;
                                    listener.start();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    photoViewer2.X2(true);
                    photoViewer2.o2(1);
                    return;
                }
                return;
            case 27:
                ((org.telegram.ui.Components.w70) this.f37811c).K((org.telegram.ui.Components.w70) this.f37810b);
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37810b;
                ((AlertDialog$Builder) this.f37811c).f18622a.L0.run();
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
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(privacySettingsActivity.getParentActivity(), 3, null);
                b2Var.f18658g0 = false;
                b2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ns0(privacySettingsActivity, b2Var, setaccountttl, 2));
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f37810b;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                nf.f.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f37811c).url);
                return;
        }
    }

    public tv(org.telegram.ui.Components.w70 w70Var, org.telegram.ui.Components.w70 w70Var2) {
        this.f37809a = 27;
        this.f37811c = w70Var;
        this.f37810b = w70Var2;
    }
}
