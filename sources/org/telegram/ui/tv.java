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
    public final int f37884a;
    public final Object f37885b;
    public final Object f37886c;

    public tv(int i10, Object obj, Object obj2) {
        this.f37884a = i10;
        this.f37885b = obj;
        this.f37886c = obj2;
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
        switch (this.f37884a) {
            case 0:
                uy uyVar = (uy) this.f37885b;
                uyVar.getClass();
                ((org.telegram.ui.Components.y70) this.f37886c).u();
                uyVar.presentFragment(new ProxyListActivity());
                return;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.b2[]) this.f37886c, r0, r0.currentAccount, ((uy) this.f37885b).Y2);
                return;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f37885b)[0].getSwipeBack().e(((int[]) this.f37886c)[0]);
                return;
            case 3:
                uy uyVar2 = (uy) this.f37885b;
                uyVar2.r4((ArrayList) this.f37886c, 102, false, false, null);
                uyVar2.finishPreviewFragment();
                return;
            case 4:
                uy.H0((uy) this.f37885b, (BirthdayController.BirthdayState) this.f37886c);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new yt(3, (uy) this.f37885b, (String) this.f37886c), 250L);
                return;
            case 6:
                e20 e20Var = (e20) this.f37885b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((f20) this.f37886c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f15837id = 2;
                while (e20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.f15837id) != null) {
                    dialogFilter.f15837id++;
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
                f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, e20Var.e, new yt(20, e20Var, suggestedFilter));
                return;
            case 7:
                nf.f.s((Context) this.f37885b, ((TL_fragment.TL_collectibleInfo) this.f37886c).url);
                return;
            case 8:
                ((org.telegram.ui.Components.i21) this.f37885b).run();
                ((org.telegram.ui.ActionBar.f3) this.f37886c).dismiss();
                return;
            case 9:
                TextView textView = (TextView) this.f37886c;
                i60 i60Var = ((s30) this.f37885b).E;
                ChatObject.Call call = i60Var.f34380a1;
                if (call != null && call.recording) {
                    i60Var.G1(textView);
                    return;
                }
                return;
            case 10:
                new r50((Context) this.f37886c, (s50) this.f37885b).show();
                return;
            case 11:
                d80 d80Var = (d80) this.f37885b;
                org.telegram.ui.Components.nj0 nj0Var = (org.telegram.ui.Components.nj0) this.f37886c;
                d80Var.getClass();
                if (!uy.f38251w4) {
                    uy.f38251w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.j6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        N0 = org.telegram.ui.ActionBar.j6.N0("Night");
                    } else {
                        N0 = org.telegram.ui.ActionBar.j6.N0("Blue");
                    }
                    org.telegram.ui.ActionBar.j6.f19304o = 0;
                    org.telegram.ui.ActionBar.j6.q1();
                    org.telegram.ui.ActionBar.j6.A();
                    org.telegram.ui.Components.kj0 kj0Var = d80Var.v;
                    if (!q6) {
                        i10 = kj0Var.e[0] - 1;
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
                p80 p80Var = (p80) this.f37885b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f37886c;
                p80Var.Q.dismiss();
                if (p80Var.f36522f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = p80Var.f36519c0;
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
                bundle2.putInt("type", p80Var.f36519c0);
                a6 a6Var = new a6(bundle2);
                a6Var.d = p80Var.f36522f0;
                a6Var.U();
                n2Var.presentFragment(a6Var);
                return;
            case 13:
                org.telegram.ui.Cells.r4[] r4VarArr = (org.telegram.ui.Cells.r4[]) this.f37886c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f37885b)[0] = ((org.telegram.ui.Cells.r4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.r4 r4Var = r4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r4Var.f20890a.a(z10, true);
                }
                return;
            case 14:
                org.telegram.ui.Components.d5.y((Context) this.f37886c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new pb0((zb0) this.f37885b, 0));
                return;
            case 15:
                zb0 zb0Var = (zb0) this.f37885b;
                Runnable[] runnableArr = (Runnable[]) this.f37886c;
                if (zb0Var.e == null) {
                    wb0 wb0Var = zb0Var.f40182f;
                    if (wb0Var.e.h) {
                        int i24 = -zb0Var.N;
                        zb0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(wb0Var, i24);
                        return;
                    }
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    Switch r52 = x8Var.e;
                    x8Var.setChecked(!r52.h);
                    xb0 xb0Var = zb0Var.f40184r;
                    if (r52.h) {
                        i19 = 0;
                    }
                    xb0Var.setVisibility(i19);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r52.h) {
                        zb0Var.f40182f.setChecked(false);
                        zb0Var.f40182f.setCheckBoxIcon(R.drawable.permission_locked);
                        zb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        ob0 ob0Var = new ob0(zb0Var, 0);
                        runnableArr[0] = ob0Var;
                        AndroidUtilities.runOnUIThread(ob0Var, 60L);
                        return;
                    }
                    zb0Var.f40182f.setCheckBoxIcon(0);
                    zb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    ob0 ob0Var2 = new ob0(zb0Var, 1);
                    runnableArr[0] = ob0Var2;
                    AndroidUtilities.runOnUIThread(ob0Var2);
                    return;
                }
                return;
            case 16:
                kd0 kd0Var = (kd0) this.f37885b;
                kd0Var.r0((ed0) this.f37886c);
                cd0 cd0Var = kd0Var.I0;
                if (cd0Var != null) {
                    cd0Var.dismiss();
                    return;
                }
                return;
            case 17:
                kd0 kd0Var2 = ((hd0) this.f37885b).f34188b;
                kd0Var2.getClass();
                kd0Var2.F0.b(((jd0) this.f37886c).f34922c, kd0Var2.G0, true, 0, 0L);
                kd0Var2.finishFragment();
                return;
            case 18:
                ie0 ie0Var = (ie0) this.f37885b;
                Context context = (Context) this.f37886c;
                String string = ie0Var.f34568y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f23827a |= 256;
                    obj.f23828b = indexOf;
                    int i25 = lastIndexOf + 1;
                    obj.f23829c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.f11(obj, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i26 = ie0Var.G;
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
                alertDialog$Builder.f18669a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, formatString);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new fu(ie0Var, 18));
                hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 19:
                re0 re0Var = (re0) this.f37885b;
                Context context2 = (Context) this.f37886c;
                yg0 yg0Var = re0Var.f37158y;
                if (yg0Var.V.getTag() == null) {
                    if (re0Var.f37153n.has_recovery) {
                        yg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.n2) yg0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new pe0(re0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(re0Var.f37149a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f18669a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f18669a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new fu(re0Var, 19));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 20:
                bg0 bg0Var = (bg0) this.f37885b;
                Context context3 = (Context) this.f37886c;
                Bundle bundle3 = bg0Var.f32448o0;
                if (bundle3 != null && (tL_auth_sentCode = bg0Var.f32449p0) != null) {
                    bg0Var.f32454s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!bg0Var.f32436d0) {
                    zf0 zf0Var = bg0Var.v;
                    if ((zf0Var == null || zf0Var.getVisibility() == 8) && !bg0Var.f32442i0) {
                        if (bg0Var.f32440g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = bg0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = bg0Var.f32434c;
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
                            bg0Var.f32454s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f18669a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f18669a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, bg0Var.f32432b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new z10(19, bg0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new qf0(bg0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (bg0Var.f32454s0.V.getTag() == null) {
                            bg0Var.x();
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
                xg0 xg0Var = (xg0) this.f37885b;
                Context context4 = (Context) this.f37886c;
                Toast toast = xg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    xg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (xg0Var.M > 0 && currentTimeMillis - xg0Var.N > 1500) {
                    xg0Var.M = 0;
                }
                int i31 = xg0Var.M + 1;
                xg0Var.M = i31;
                xg0Var.N = currentTimeMillis;
                if (i31 >= 5) {
                    xg0Var.M = 0;
                    xg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xg0Var.getContext());
                    alertDialog$Builder4.f18669a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new vv(xg0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i31 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i31, new Object[0]), 0);
                    xg0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) this.f37886c;
                mj0 mj0Var = ((kj0) this.f37885b).d;
                if (!mj0Var.a0(messageObject)) {
                    mj0Var.getOrCreateStoryViewer().F(mj0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(mj0Var.f35775f));
                    return;
                }
                return;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37885b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f37886c;
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
                ImageView imageView = passcodeActivity.f31195s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.j6.f19255l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.j6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                return;
            case 24:
                xo0.h0((xo0) this.f37885b, (String) this.f37886c, view);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.f37885b;
                org.telegram.ui.Components.y70 y70Var = (org.telegram.ui.Components.y70) this.f37886c;
                if (photoViewer.T4 != null) {
                    y70Var.u();
                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer.f31313m4;
                    if (n2Var2 instanceof zn) {
                        ((zn) n2Var2).J9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f37885b;
                Activity activity = (Activity) this.f37886c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.H1() && !photoViewer2.f31353r) {
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.f31266g7.size()) {
                        Object obj2 = photoViewer2.f31266g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f31287j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.f4 f4Var = photoViewer2.f31295k1;
                                if (f4Var != null) {
                                    f4Var.e(true);
                                    photoViewer2.f31295k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f31295k1 = new ci.f4(photoViewer2.E, 3);
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
                                    photoViewer2.f31295k1.s(append);
                                    photoViewer2.f31242e0.addView(photoViewer2.f31295k1, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f31295k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f31295k1.m(0.0f, (photoViewer2.f31287j1.getWidth() / 2.0f) + photoViewer2.f31287j1.getX() + photoViewer2.H0.getX());
                                    ci.f4 f4Var2 = photoViewer2.f31295k1;
                                    f4Var2.f4637l0 = new nh(2, f4Var2);
                                    f4Var2.d = 3500L;
                                    f4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f31287j1.getTag() == null) {
                        if (photoViewer2.f31302k8) {
                            if (photoViewer2.f31310m1 == null) {
                                vu0 vu0Var = photoViewer2.f31242e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.yq0(textView2, 18);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                vu0Var.addView((View) textView2, w7.y5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView2.setVisibility(8);
                                photoViewer2.f31310m1 = textView2;
                            }
                            photoViewer2.f31310m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.o21 o21Var = photoViewer2.f31310m1;
                            org.telegram.ui.Components.i71 i71Var = photoViewer2.f31287j1;
                            org.telegram.ui.Components.yq0 yq0Var = o21Var.d;
                            if (i71Var != null) {
                                o21Var.f26975a = i71Var;
                                o21Var.a();
                                o21Var.f26977c = true;
                                AndroidUtilities.cancelRunOnUIThread(yq0Var);
                                AndroidUtilities.runOnUIThread(yq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = o21Var.f26976b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    o21Var.f26976b.cancel();
                                    o21Var.f26976b = null;
                                }
                                if (o21Var.getVisibility() != 0) {
                                    o21Var.setAlpha(0.0f);
                                    o21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = o21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    o21Var.f26976b = listener;
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
                ((org.telegram.ui.Components.y70) this.f37886c).K((org.telegram.ui.Components.y70) this.f37885b);
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37885b;
                ((AlertDialog$Builder) this.f37886c).f18669a.L0.run();
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
                b2Var.f18705g0 = false;
                b2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ns0(privacySettingsActivity, b2Var, setaccountttl, 2));
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f37885b;
                profileActivity.getClass();
                org.telegram.ui.Components.pc.e();
                nf.f.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f37886c).url);
                return;
        }
    }

    public tv(org.telegram.ui.Components.y70 y70Var, org.telegram.ui.Components.y70 y70Var2) {
        this.f37884a = 27;
        this.f37886c = y70Var;
        this.f37885b = y70Var2;
    }
}
