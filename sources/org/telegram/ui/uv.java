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
public final class uv implements View.OnClickListener {
    public final int f42598a;
    public final Object f42599b;
    public final Object f42600c;

    public uv(int i10, Object obj, Object obj2) {
        this.f42598a = i10;
        this.f42599b = obj;
        this.f42600c = obj2;
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
        switch (this.f42598a) {
            case 0:
                vy vyVar = (vy) this.f42599b;
                vyVar.getClass();
                ((org.telegram.ui.Components.s80) this.f42600c).u();
                vyVar.presentFragment(new ProxyListActivity());
                return;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.a2[]) this.f42600c, r0, r0.currentAccount, ((vy) this.f42599b).Y2);
                return;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f42599b)[0].getSwipeBack().e(((int[]) this.f42600c)[0]);
                return;
            case 3:
                vy vyVar2 = (vy) this.f42599b;
                vyVar2.o4((ArrayList) this.f42600c, 102, false, false, null);
                vyVar2.finishPreviewFragment();
                return;
            case 4:
                vy.E0((vy) this.f42599b, (BirthdayController.BirthdayState) this.f42600c);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.p(6, (vy) this.f42599b, (String) this.f42600c), 250L);
                return;
            case 6:
                e20 e20Var = (e20) this.f42599b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((f20) this.f42600c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f17004id = 2;
                while (e20Var.f36964e.getMessagesController().dialogFiltersById.get(dialogFilter.f17004id) != null) {
                    dialogFilter.f17004id++;
                }
                dialogFilter.order = e20Var.f36964e.getMessagesController().getDialogFilters().size();
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
                h10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, e20Var.f36964e, new org.telegram.ui.Components.voip.p(23, e20Var, suggestedFilter));
                return;
            case 7:
                of.f.s((Context) this.f42599b, ((TL_fragment.TL_collectibleInfo) this.f42600c).url);
                return;
            case 8:
                ((org.telegram.ui.Components.w21) this.f42599b).run();
                ((org.telegram.ui.ActionBar.e3) this.f42600c).dismiss();
                return;
            case 9:
                TextView textView = (TextView) this.f42600c;
                i60 i60Var = ((s30) this.f42599b).E;
                ChatObject.Call call = i60Var.f38681a1;
                if (call != null && call.recording) {
                    i60Var.H1(textView);
                    return;
                }
                return;
            case 10:
                new r50((Context) this.f42600c, (s50) this.f42599b).show();
                return;
            case 11:
                f80 f80Var = (f80) this.f42599b;
                org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) this.f42600c;
                f80Var.getClass();
                if (!vy.f42878w4) {
                    vy.f42878w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.h6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        O0 = org.telegram.ui.ActionBar.h6.O0("Night");
                    } else {
                        O0 = org.telegram.ui.ActionBar.h6.O0("Blue");
                    }
                    org.telegram.ui.ActionBar.h6.f20756o = 0;
                    org.telegram.ui.ActionBar.h6.r1();
                    org.telegram.ui.ActionBar.h6.A();
                    org.telegram.ui.Components.fk0 fk0Var = f80Var.v;
                    if (!q6) {
                        i10 = fk0Var.f26109e[0] - 1;
                    } else {
                        i10 = 0;
                    }
                    fk0Var.P(i10);
                    ik0Var.d();
                    ik0Var.getLocationInWindow(r0);
                    int[] iArr = {(ik0Var.getMeasuredWidth() / 2) + iArr[0], (ik0Var.getMeasuredHeight() / 2) + iArr[1]};
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z11), ik0Var);
                    if (!q6) {
                        i11 = R.string.AccDescrSwitchToDayTheme;
                    } else {
                        i11 = R.string.AccDescrSwitchToNightTheme;
                    }
                    ik0Var.setContentDescription(LocaleController.getString(i11));
                    return;
                }
                return;
            case 12:
                r80 r80Var = (r80) this.f42599b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f42600c;
                r80Var.Q.dismiss();
                if (r80Var.f41532f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = r80Var.f41529c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    vy vyVar3 = new vy(bundle);
                    vyVar3.C2 = new tw(6, r80Var, vyVar3);
                    m2Var.presentFragment(vyVar3);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", r80Var.f41529c0);
                d6 d6Var = new d6(bundle2);
                d6Var.d = r80Var.f41532f0;
                d6Var.U();
                m2Var.presentFragment(d6Var);
                return;
            case 13:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f42600c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f42599b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f22444a.a(z10, true);
                }
                return;
            case 14:
                org.telegram.ui.Components.g5.x((Context) this.f42600c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new mb0((wb0) this.f42599b, 0));
                return;
            case 15:
                wb0 wb0Var = (wb0) this.f42599b;
                Runnable[] runnableArr = (Runnable[]) this.f42600c;
                if (wb0Var.f43122e == null) {
                    tb0 tb0Var = wb0Var.f43123f;
                    if (tb0Var.f23452e.h) {
                        int i24 = -wb0Var.N;
                        wb0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(tb0Var, i24);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    Switch r42 = w8Var.f23452e;
                    w8Var.setChecked(!r42.h);
                    ub0 ub0Var = wb0Var.f43125r;
                    if (r42.h) {
                        i19 = 0;
                    }
                    ub0Var.setVisibility(i19);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        wb0Var.f43123f.setChecked(false);
                        wb0Var.f43123f.setCheckBoxIcon(R.drawable.permission_locked);
                        wb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        lb0 lb0Var = new lb0(wb0Var, 0);
                        runnableArr[0] = lb0Var;
                        AndroidUtilities.runOnUIThread(lb0Var, 60L);
                        return;
                    }
                    wb0Var.f43123f.setCheckBoxIcon(0);
                    wb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    lb0 lb0Var2 = new lb0(wb0Var, 1);
                    runnableArr[0] = lb0Var2;
                    AndroidUtilities.runOnUIThread(lb0Var2);
                    return;
                }
                return;
            case 16:
                id0 id0Var = (id0) this.f42599b;
                id0Var.q0((cd0) this.f42600c);
                ad0 ad0Var = id0Var.I0;
                if (ad0Var != null) {
                    ad0Var.dismiss();
                    return;
                }
                return;
            case 17:
                id0 id0Var2 = ((fd0) this.f42599b).f37760b;
                id0Var2.getClass();
                id0Var2.F0.b(((hd0) this.f42600c).f38333c, id0Var2.G0, true, 0, 0L);
                id0Var2.finishFragment();
                return;
            case 18:
                ge0 ge0Var = (ge0) this.f42599b;
                Context context = (Context) this.f42600c;
                String string = ge0Var.f38026y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f33255a |= 256;
                    obj.f33256b = indexOf;
                    int i25 = lastIndexOf + 1;
                    obj.f33257c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.a21(obj, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i26 = ge0Var.G;
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
                alertDialog$Builder.f20142a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, formatString);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new ju(ge0Var, 17));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 19:
                pe0 pe0Var = (pe0) this.f42599b;
                Context context2 = (Context) this.f42600c;
                xg0 xg0Var = pe0Var.f40946y;
                if (xg0Var.V.getTag() == null) {
                    if (pe0Var.f40941n.has_recovery) {
                        xg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.m2) xg0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new ne0(pe0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(pe0Var.f40936a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f20142a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new ju(pe0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 20:
                zf0 zf0Var = (zf0) this.f42599b;
                Context context3 = (Context) this.f42600c;
                Bundle bundle3 = zf0Var.f44832o0;
                if (bundle3 != null && (tL_auth_sentCode = zf0Var.f44833p0) != null) {
                    zf0Var.f44838s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!zf0Var.f44819d0) {
                    xf0 xf0Var = zf0Var.v;
                    if ((xf0Var == null || xf0Var.getVisibility() == 8) && !zf0Var.f44826i0) {
                        if (zf0Var.f44824g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = zf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = zf0Var.f44817c;
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
                            zf0Var.f44838s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f20142a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f20142a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, zf0Var.f44815b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new tw(20, zf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new of0(zf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (zf0Var.f44838s0.V.getTag() == null) {
                            zf0Var.x();
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
                wg0 wg0Var = (wg0) this.f42599b;
                Context context4 = (Context) this.f42600c;
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
                    alertDialog$Builder4.f20142a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new m4(wg0Var, 2));
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
                MessageObject messageObject = (MessageObject) this.f42600c;
                mj0 mj0Var = ((kj0) this.f42599b).d;
                if (!mj0Var.a0(messageObject)) {
                    mj0Var.getOrCreateStoryViewer().F(mj0Var.getParentActivity(), messageObject.storyItem, ai.v9.a(mj0Var.f40070f));
                    return;
                }
                return;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f42599b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f42600c;
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
                ImageView imageView = passcodeActivity.f33695s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.h6.f20706l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.h6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                return;
            case 24:
                xo0.h0((xo0) this.f42599b, (String) this.f42600c, view);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.f42599b;
                org.telegram.ui.Components.s80 s80Var = (org.telegram.ui.Components.s80) this.f42600c;
                if (photoViewer.T4 != null) {
                    s80Var.u();
                    org.telegram.ui.ActionBar.m2 m2Var2 = photoViewer.f33814m4;
                    if (m2Var2 instanceof eo) {
                        ((eo) m2Var2).O9(photoViewer.T4, false, true);
                    }
                    of.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f42599b;
                Activity activity = (Activity) this.f42600c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.I1() && !photoViewer2.f33854r) {
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.f33767g7.size()) {
                        Object obj2 = photoViewer2.f33767g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f33788j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.d4 d4Var = photoViewer2.f33796k1;
                                if (d4Var != null) {
                                    d4Var.e(true);
                                    photoViewer2.f33796k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f33796k1 = new ci.d4(photoViewer2.E, 3);
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
                                    append.setSpan(new org.telegram.ui.Components.gr(i17, 0), 0, 1, 33);
                                    photoViewer2.f33796k1.s(append);
                                    photoViewer2.f33743e0.addView(photoViewer2.f33796k1, w7.w5.a(100.0f, 0.0f, 0.0f, 0.0f, 48.0f, -1, 87));
                                    photoViewer2.f33796k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f33796k1.m(0.0f, (photoViewer2.f33788j1.getWidth() / 2.0f) + photoViewer2.f33788j1.getX() + photoViewer2.H0.getX());
                                    ci.d4 d4Var2 = photoViewer2.f33796k1;
                                    d4Var2.f4916l0 = new rh(2, d4Var2);
                                    d4Var2.d = 3500L;
                                    d4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f33788j1.getTag() == null) {
                        if (photoViewer2.f33803k8) {
                            if (photoViewer2.f33811m1 == null) {
                                yu0 yu0Var = photoViewer2.f33743e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.ur0(textView2, 18);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                yu0Var.addView((View) textView2, w7.w5.a(-2.0f, 5.0f, 0.0f, 5.0f, 3.0f, -2, 51));
                                textView2.setVisibility(8);
                                photoViewer2.f33811m1 = textView2;
                            }
                            photoViewer2.f33811m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.j31 j31Var = photoViewer2.f33811m1;
                            org.telegram.ui.Components.c81 c81Var = photoViewer2.f33788j1;
                            org.telegram.ui.Components.ur0 ur0Var = j31Var.d;
                            if (c81Var != null) {
                                j31Var.f27351a = c81Var;
                                j31Var.a();
                                j31Var.f27353c = true;
                                AndroidUtilities.cancelRunOnUIThread(ur0Var);
                                AndroidUtilities.runOnUIThread(ur0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = j31Var.f27352b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    j31Var.f27352b.cancel();
                                    j31Var.f27352b = null;
                                }
                                if (j31Var.getVisibility() != 0) {
                                    j31Var.setAlpha(0.0f);
                                    j31Var.setVisibility(0);
                                    ViewPropertyAnimator listener = j31Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    j31Var.f27352b = listener;
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
                ((org.telegram.ui.Components.s80) this.f42600c).K((org.telegram.ui.Components.s80) this.f42599b);
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f42599b;
                ((AlertDialog$Builder) this.f42600c).f20142a.L0.run();
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
                a2Var.f20164g0 = false;
                a2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ps0(privacySettingsActivity, a2Var, setaccountttl, 2));
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f42599b;
                profileActivity.getClass();
                org.telegram.ui.Components.sc.e();
                of.f.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f42600c).url);
                return;
        }
    }

    public uv(org.telegram.ui.Components.s80 s80Var, org.telegram.ui.Components.s80 s80Var2) {
        this.f42598a = 27;
        this.f42600c = s80Var;
        this.f42599b = s80Var2;
    }
}
