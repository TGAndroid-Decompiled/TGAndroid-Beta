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
    public final int f41035a;
    public final Object f41036b;
    public final Object f41037c;

    public tv(int i10, Object obj, Object obj2) {
        this.f41035a = i10;
        this.f41036b = obj;
        this.f41037c = obj2;
    }

    @Override
    public final void onClick(View view) {
        ArrayList<TLRPC.InputPeer> arrayList;
        ArrayList<Long> arrayList2;
        org.telegram.ui.ActionBar.h6 N0;
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
        switch (this.f41035a) {
            case 0:
                uy uyVar = (uy) this.f41036b;
                uyVar.getClass();
                ((org.telegram.ui.Components.b80) this.f41037c).u();
                uyVar.presentFragment(new ProxyListActivity());
                return;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.b2[]) this.f41037c, r0, r0.currentAccount, ((uy) this.f41036b).Y2);
                return;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f41036b)[0].getSwipeBack().e(((int[]) this.f41037c)[0]);
                return;
            case 3:
                uy uyVar2 = (uy) this.f41036b;
                uyVar2.A4((ArrayList) this.f41037c, 102, false, false, null);
                uyVar2.finishPreviewFragment();
                return;
            case 4:
                uy.I0((uy) this.f41036b, (BirthdayController.BirthdayState) this.f41037c);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new cu(1, (uy) this.f41036b, (String) this.f41037c), 250L);
                return;
            case 6:
                d20 d20Var = (d20) this.f41036b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((e20) this.f41037c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f17266id = 2;
                while (d20Var.f35619e.getMessagesController().dialogFiltersById.get(dialogFilter.f17266id) != null) {
                    dialogFilter.f17266id++;
                }
                dialogFilter.order = d20Var.f35619e.getMessagesController().getDialogFilters().size();
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
                f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, d20Var.f35619e, new cu(17, d20Var, suggestedFilter));
                return;
            case 7:
                nf.f.s((Context) this.f41036b, ((TL_fragment.TL_collectibleInfo) this.f41037c).url);
                return;
            case 8:
                ((org.telegram.ui.Components.r21) this.f41036b).run();
                ((org.telegram.ui.ActionBar.f3) this.f41037c).dismiss();
                return;
            case 9:
                TextView textView = (TextView) this.f41037c;
                h60 h60Var = ((s30) this.f41036b).E;
                ChatObject.Call call = h60Var.f36906a1;
                if (call != null && call.recording) {
                    h60Var.G1(textView);
                    return;
                }
                return;
            case 10:
                new r50((Context) this.f41037c, (n20) this.f41036b).show();
                return;
            case 11:
                c80 c80Var = (c80) this.f41036b;
                org.telegram.ui.Components.nj0 nj0Var = (org.telegram.ui.Components.nj0) this.f41037c;
                c80Var.getClass();
                if (!uy.f41408v4) {
                    uy.f41408v4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        N0 = org.telegram.ui.ActionBar.i6.N0("Night");
                    } else {
                        N0 = org.telegram.ui.ActionBar.i6.N0("Blue");
                    }
                    org.telegram.ui.ActionBar.i6.f21023o = 0;
                    org.telegram.ui.ActionBar.i6.q1();
                    org.telegram.ui.ActionBar.i6.A();
                    org.telegram.ui.Components.kj0 kj0Var = c80Var.v;
                    if (!q6) {
                        i10 = kj0Var.f28216e[0] - 1;
                    } else {
                        i10 = 0;
                    }
                    kj0Var.P(i10);
                    nj0Var.d();
                    nj0Var.getLocationInWindow(r0);
                    int[] iArr = {(nj0Var.getMeasuredWidth() / 2) + iArr[0], (nj0Var.getMeasuredHeight() / 2) + iArr[1]};
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z11), nj0Var);
                    if (!q6) {
                        i11 = R.string.AccDescrSwitchToDayTheme;
                    } else {
                        i11 = R.string.AccDescrSwitchToNightTheme;
                    }
                    nj0Var.setContentDescription(LocaleController.getString(i11));
                    return;
                }
                return;
            case 12:
                o80 o80Var = (o80) this.f41036b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f41037c;
                o80Var.Q.dismiss();
                if (o80Var.f39118f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = o80Var.f39115c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    uy uyVar3 = new uy(bundle);
                    uyVar3.C2 = new pw(o80Var, uyVar3);
                    n2Var.presentFragment(uyVar3);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", o80Var.f39115c0);
                b6 b6Var = new b6(bundle2);
                b6Var.d = o80Var.f39118f0;
                b6Var.S();
                n2Var.presentFragment(b6Var);
                return;
            case 13:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f41037c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f41036b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f22686a.a(z10, true);
                }
                return;
            case 14:
                org.telegram.ui.Components.e5.y((Context) this.f41037c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new lb0((vb0) this.f41036b, 0));
                return;
            case 15:
                vb0 vb0Var = (vb0) this.f41036b;
                Runnable[] runnableArr = (Runnable[]) this.f41037c;
                if (vb0Var.f41696e == null) {
                    sb0 sb0Var = vb0Var.f41697f;
                    if (sb0Var.f23699e.h) {
                        int i24 = -vb0Var.N;
                        vb0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(sb0Var, i24);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    Switch r42 = w8Var.f23699e;
                    w8Var.setChecked(!r42.h);
                    tb0 tb0Var = vb0Var.f41699r;
                    if (r42.h) {
                        i19 = 0;
                    }
                    tb0Var.setVisibility(i19);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        vb0Var.f41697f.setChecked(false);
                        vb0Var.f41697f.setCheckBoxIcon(R.drawable.permission_locked);
                        vb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        kb0 kb0Var = new kb0(vb0Var, 0);
                        runnableArr[0] = kb0Var;
                        AndroidUtilities.runOnUIThread(kb0Var, 60L);
                        return;
                    }
                    vb0Var.f41697f.setCheckBoxIcon(0);
                    vb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    kb0 kb0Var2 = new kb0(vb0Var, 1);
                    runnableArr[0] = kb0Var2;
                    AndroidUtilities.runOnUIThread(kb0Var2);
                    return;
                }
                return;
            case 16:
                gd0 gd0Var = (gd0) this.f41036b;
                gd0Var.r0((ad0) this.f41037c);
                yc0 yc0Var = gd0Var.I0;
                if (yc0Var != null) {
                    yc0Var.dismiss();
                    return;
                }
                return;
            case 17:
                gd0 gd0Var2 = ((dd0) this.f41036b).f35788b;
                gd0Var2.getClass();
                gd0Var2.F0.b(((fd0) this.f41037c).f36274c, gd0Var2.G0, true, 0, 0L);
                gd0Var2.finishFragment();
                return;
            case 18:
                ee0 ee0Var = (ee0) this.f41036b;
                Context context = (Context) this.f41037c;
                String string = ee0Var.f36023y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28925a |= 256;
                    obj.f28926b = indexOf;
                    int i25 = lastIndexOf + 1;
                    obj.f28927c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o11(obj, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
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
                alertDialog$Builder.f20377a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, formatString);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new bu(ee0Var, 18));
                hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 19:
                ne0 ne0Var = (ne0) this.f41036b;
                Context context2 = (Context) this.f41037c;
                ug0 ug0Var = ne0Var.f38948y;
                if (ug0Var.V.getTag() == null) {
                    if (ne0Var.f38943n.has_recovery) {
                        ug0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new le0(ne0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(ne0Var.f38938a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f20377a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f20377a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new bu(ne0Var, 19));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 20:
                xf0 xf0Var = (xf0) this.f41036b;
                Context context3 = (Context) this.f41037c;
                Bundle bundle3 = xf0Var.f42928o0;
                if (bundle3 != null && (tL_auth_sentCode = xf0Var.f42929p0) != null) {
                    xf0Var.f42934s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!xf0Var.f42915d0) {
                    vf0 vf0Var = xf0Var.v;
                    if ((vf0Var == null || vf0Var.getVisibility() == 8) && !xf0Var.f42922i0) {
                        if (xf0Var.f42920g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = xf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = xf0Var.f42913c;
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
                            xf0Var.f42934s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f20377a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f20377a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, xf0Var.f42911b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new pw(21, xf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new mf0(xf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (xf0Var.f42934s0.V.getTag() == null) {
                            xf0Var.x();
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
                tg0 tg0Var = (tg0) this.f41036b;
                Context context4 = (Context) this.f41037c;
                Toast toast = tg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    tg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (tg0Var.M > 0 && currentTimeMillis - tg0Var.N > 1500) {
                    tg0Var.M = 0;
                }
                int i31 = tg0Var.M + 1;
                tg0Var.M = i31;
                tg0Var.N = currentTimeMillis;
                if (i31 >= 5) {
                    tg0Var.M = 0;
                    tg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(tg0Var.getContext());
                    alertDialog$Builder4.f20377a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new vv(tg0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i31 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i31, new Object[0]), 0);
                    tg0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) this.f41037c;
                hj0 hj0Var = ((fj0) this.f41036b).d;
                if (!hj0Var.Z(messageObject)) {
                    hj0Var.getOrCreateStoryViewer().F(hj0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(hj0Var.f37110f));
                    return;
                }
                return;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41036b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f41037c;
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
                ImageView imageView = passcodeActivity.f33866s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.i6.f20974l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.i6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
                return;
            case 24:
                so0.h0((so0) this.f41036b, (String) this.f41037c, view);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.f41036b;
                org.telegram.ui.Components.b80 b80Var = (org.telegram.ui.Components.b80) this.f41037c;
                if (photoViewer.T4 != null) {
                    b80Var.u();
                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer.f33985m4;
                    if (n2Var2 instanceof yn) {
                        ((yn) n2Var2).I9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f41036b;
                Activity activity = (Activity) this.f41037c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.I1() && !photoViewer2.f34025r) {
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.f33938g7.size()) {
                        Object obj2 = photoViewer2.f33938g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f33959j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.e4 e4Var = photoViewer2.f33967k1;
                                if (e4Var != null) {
                                    e4Var.e(true);
                                    photoViewer2.f33967k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f33967k1 = new ci.e4(photoViewer2.E, 3);
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
                                    append.setSpan(new org.telegram.ui.Components.rq(i17, 0), 0, 1, 33);
                                    photoViewer2.f33967k1.s(append);
                                    photoViewer2.f33914e0.addView(photoViewer2.f33967k1, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f33967k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f33967k1.m(0.0f, (photoViewer2.f33959j1.getWidth() / 2.0f) + photoViewer2.f33959j1.getX() + photoViewer2.H0.getX());
                                    ci.e4 e4Var2 = photoViewer2.f33967k1;
                                    e4Var2.f4998l0 = new gh(2, e4Var2);
                                    e4Var2.d = 3500L;
                                    e4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f33959j1.getTag() == null) {
                        if (photoViewer2.f33974k8) {
                            if (photoViewer2.f33982m1 == null) {
                                qu0 qu0Var = photoViewer2.f33914e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.gq0((Object) textView2, 20);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                qu0Var.addView((View) textView2, w7.z5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView2.setVisibility(8);
                                photoViewer2.f33982m1 = textView2;
                            }
                            photoViewer2.f33982m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.x21 x21Var = photoViewer2.f33982m1;
                            org.telegram.ui.Components.s71 s71Var = photoViewer2.f33959j1;
                            org.telegram.ui.Components.gq0 gq0Var = x21Var.d;
                            if (s71Var != null) {
                                x21Var.f32809a = s71Var;
                                x21Var.a();
                                x21Var.f32811c = true;
                                AndroidUtilities.cancelRunOnUIThread(gq0Var);
                                AndroidUtilities.runOnUIThread(gq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = x21Var.f32810b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    x21Var.f32810b.cancel();
                                    x21Var.f32810b = null;
                                }
                                if (x21Var.getVisibility() != 0) {
                                    x21Var.setAlpha(0.0f);
                                    x21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = x21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    x21Var.f32810b = listener;
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
                ((org.telegram.ui.Components.b80) this.f41037c).K((org.telegram.ui.Components.b80) this.f41036b);
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f41036b;
                ((AlertDialog$Builder) this.f41037c).f20377a.L0.run();
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
                b2Var.f20432g0 = false;
                b2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new is0(privacySettingsActivity, b2Var, setaccountttl, 2));
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f41036b;
                profileActivity.getClass();
                org.telegram.ui.Components.rc.e();
                nf.f.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f41037c).url);
                return;
        }
    }

    public tv(org.telegram.ui.Components.b80 b80Var, org.telegram.ui.Components.b80 b80Var2) {
        this.f41035a = 27;
        this.f41037c = b80Var;
        this.f41036b = b80Var2;
    }
}
