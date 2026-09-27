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
public final class rv implements View.OnClickListener {
    public final int f37239a;
    public final Object f37240b;
    public final Object f37241c;

    public rv(int i10, Object obj, Object obj2) {
        this.f37239a = i10;
        this.f37240b = obj;
        this.f37241c = obj2;
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
        switch (this.f37239a) {
            case 0:
                ty tyVar = (ty) this.f37240b;
                tyVar.getClass();
                ((org.telegram.ui.Components.a80) this.f37241c).u();
                tyVar.presentFragment(new ProxyListActivity());
                return;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.c2[]) this.f37241c, r0, r0.currentAccount, ((ty) this.f37240b).Y2);
                return;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f37240b)[0].getSwipeBack().e(((int[]) this.f37241c)[0]);
                return;
            case 3:
                ty tyVar2 = (ty) this.f37240b;
                tyVar2.A4((ArrayList) this.f37241c, 102, false, false, null);
                tyVar2.finishPreviewFragment();
                return;
            case 4:
                ty.I0((ty) this.f37240b, (BirthdayController.BirthdayState) this.f37241c);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.dp0(29, (ty) this.f37240b, (String) this.f37241c), 250L);
                return;
            case 6:
                c20 c20Var = (c20) this.f37240b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((d20) this.f37241c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f15826id = 2;
                while (c20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.f15826id) != null) {
                    dialogFilter.f15826id++;
                }
                dialogFilter.order = c20Var.e.getMessagesController().getDialogFilters().size();
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
                e10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, c20Var.e, new tv(15, c20Var, suggestedFilter));
                return;
            case 7:
                nf.f.s((Context) this.f37240b, ((TL_fragment.TL_collectibleInfo) this.f37241c).url);
                return;
            case 8:
                ((org.telegram.ui.Components.h21) this.f37240b).run();
                ((org.telegram.ui.ActionBar.g3) this.f37241c).dismiss();
                return;
            case 9:
                TextView textView = (TextView) this.f37241c;
                g60 g60Var = ((q30) this.f37240b).E;
                ChatObject.Call call = g60Var.f33726a1;
                if (call != null && call.recording) {
                    g60Var.G1(textView);
                    return;
                }
                return;
            case 10:
                new p50((Context) this.f37241c, (q50) this.f37240b).show();
                return;
            case 11:
                b80 b80Var = (b80) this.f37240b;
                org.telegram.ui.Components.nj0 nj0Var = (org.telegram.ui.Components.nj0) this.f37241c;
                b80Var.getClass();
                if (!ty.f37950v4) {
                    ty.f37950v4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        N0 = org.telegram.ui.ActionBar.i6.N0("Night");
                    } else {
                        N0 = org.telegram.ui.ActionBar.i6.N0("Blue");
                    }
                    org.telegram.ui.ActionBar.i6.f19252o = 0;
                    org.telegram.ui.ActionBar.i6.q1();
                    org.telegram.ui.ActionBar.i6.A();
                    org.telegram.ui.Components.kj0 kj0Var = b80Var.v;
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
                n80 n80Var = (n80) this.f37240b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f37241c;
                n80Var.Q.dismiss();
                if (n80Var.f35845f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = n80Var.f35842c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    ty tyVar3 = new ty(bundle);
                    tyVar3.C2 = new jy(6, n80Var, tyVar3);
                    o2Var.presentFragment(tyVar3);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", n80Var.f35842c0);
                c6 c6Var = new c6(bundle2);
                c6Var.d = n80Var.f35845f0;
                c6Var.U();
                o2Var.presentFragment(c6Var);
                return;
            case 13:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f37241c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f37240b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f20838a.a(z10, true);
                }
                return;
            case 14:
                org.telegram.ui.Components.e5.y((Context) this.f37241c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new kb0((ub0) this.f37240b, 0));
                return;
            case 15:
                ub0 ub0Var = (ub0) this.f37240b;
                Runnable[] runnableArr = (Runnable[]) this.f37241c;
                if (ub0Var.e == null) {
                    rb0 rb0Var = ub0Var.f38196f;
                    if (rb0Var.e.h) {
                        int i24 = -ub0Var.N;
                        ub0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(rb0Var, i24);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    Switch r42 = w8Var.e;
                    w8Var.setChecked(!r42.h);
                    sb0 sb0Var = ub0Var.f38198r;
                    if (r42.h) {
                        i19 = 0;
                    }
                    sb0Var.setVisibility(i19);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r42.h) {
                        ub0Var.f38196f.setChecked(false);
                        ub0Var.f38196f.setCheckBoxIcon(R.drawable.permission_locked);
                        ub0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        jb0 jb0Var = new jb0(ub0Var, 0);
                        runnableArr[0] = jb0Var;
                        AndroidUtilities.runOnUIThread(jb0Var, 60L);
                        return;
                    }
                    ub0Var.f38196f.setCheckBoxIcon(0);
                    ub0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    jb0 jb0Var2 = new jb0(ub0Var, 1);
                    runnableArr[0] = jb0Var2;
                    AndroidUtilities.runOnUIThread(jb0Var2);
                    return;
                }
                return;
            case 16:
                fd0 fd0Var = (fd0) this.f37240b;
                fd0Var.r0((zc0) this.f37241c);
                xc0 xc0Var = fd0Var.I0;
                if (xc0Var != null) {
                    xc0Var.dismiss();
                    return;
                }
                return;
            case 17:
                fd0 fd0Var2 = ((cd0) this.f37240b).f32696b;
                fd0Var2.getClass();
                fd0Var2.F0.b(((ed0) this.f37241c).f33223c, fd0Var2.G0, true, 0, 0L);
                fd0Var2.finishFragment();
                return;
            case 18:
                de0 de0Var = (de0) this.f37240b;
                Context context = (Context) this.f37241c;
                String string = de0Var.f32950y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f23485a |= 256;
                    obj.f23486b = indexOf;
                    int i25 = lastIndexOf + 1;
                    obj.f23487c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.e11(obj, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage));
                int i26 = de0Var.G;
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
                alertDialog$Builder.f18655a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, formatString);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new au(de0Var, 19));
                hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 19:
                me0 me0Var = (me0) this.f37240b;
                Context context2 = (Context) this.f37241c;
                tg0 tg0Var = me0Var.f35676y;
                if (tg0Var.V.getTag() == null) {
                    if (me0Var.f35671n.has_recovery) {
                        tg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new ke0(me0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(me0Var.f35667a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f18655a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f18655a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new au(me0Var, 20));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 20:
                wf0 wf0Var = (wf0) this.f37240b;
                Context context3 = (Context) this.f37241c;
                Bundle bundle3 = wf0Var.f39276o0;
                if (bundle3 != null && (tL_auth_sentCode = wf0Var.f39277p0) != null) {
                    wf0Var.f39282s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!wf0Var.f39264d0) {
                    uf0 uf0Var = wf0Var.v;
                    if ((uf0Var == null || uf0Var.getVisibility() == 8) && !wf0Var.f39270i0) {
                        if (wf0Var.f39268g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = wf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = wf0Var.f39262c;
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
                            wf0Var.f39282s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f18655a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f18655a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, wf0Var.f39260b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new jy(20, wf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new lf0(wf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (wf0Var.f39282s0.V.getTag() == null) {
                            wf0Var.x();
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
                sg0 sg0Var = (sg0) this.f37240b;
                Context context4 = (Context) this.f37241c;
                Toast toast = sg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    sg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (sg0Var.M > 0 && currentTimeMillis - sg0Var.N > 1500) {
                    sg0Var.M = 0;
                }
                int i31 = sg0Var.M + 1;
                sg0Var.M = i31;
                sg0Var.N = currentTimeMillis;
                if (i31 >= 5) {
                    sg0Var.M = 0;
                    sg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(sg0Var.getContext());
                    alertDialog$Builder4.f18655a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new uv(sg0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i31 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i31, new Object[0]), 0);
                    sg0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) this.f37241c;
                gj0 gj0Var = ((ej0) this.f37240b).d;
                if (!gj0Var.a0(messageObject)) {
                    gj0Var.getOrCreateStoryViewer().F(gj0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(gj0Var.f33962f));
                    return;
                }
                return;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37240b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f37241c;
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
                ImageView imageView = passcodeActivity.f31178s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.i6.f19203l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.i6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
                return;
            case 24:
                ro0.h0((ro0) this.f37240b, (String) this.f37241c, view);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.f37240b;
                org.telegram.ui.Components.a80 a80Var = (org.telegram.ui.Components.a80) this.f37241c;
                if (photoViewer.T4 != null) {
                    a80Var.u();
                    org.telegram.ui.ActionBar.o2 o2Var2 = photoViewer.f31296m4;
                    if (o2Var2 instanceof xn) {
                        ((xn) o2Var2).J9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f37240b;
                Activity activity = (Activity) this.f37241c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.H1() && !photoViewer2.f31336r) {
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.f31249g7.size()) {
                        Object obj2 = photoViewer2.f31249g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f31270j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.e4 e4Var = photoViewer2.f31278k1;
                                if (e4Var != null) {
                                    e4Var.e(true);
                                    photoViewer2.f31278k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f31278k1 = new ci.e4(photoViewer2.E, 3);
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
                                    append.setSpan(new org.telegram.ui.Components.qq(i17, 0), 0, 1, 33);
                                    photoViewer2.f31278k1.s(append);
                                    photoViewer2.f31225e0.addView(photoViewer2.f31278k1, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f31278k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f31278k1.m(0.0f, (photoViewer2.f31270j1.getWidth() / 2.0f) + photoViewer2.f31270j1.getX() + photoViewer2.H0.getX());
                                    ci.e4 e4Var2 = photoViewer2.f31278k1;
                                    e4Var2.f4625l0 = new mh(2, e4Var2);
                                    e4Var2.d = 3500L;
                                    e4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f31270j1.getTag() == null) {
                        if (photoViewer2.f31285k8) {
                            if (photoViewer2.f31293m1 == null) {
                                qu0 qu0Var = photoViewer2.f31225e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.xq0((Object) textView2, 19);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                qu0Var.addView((View) textView2, w7.y5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView2.setVisibility(8);
                                photoViewer2.f31293m1 = textView2;
                            }
                            photoViewer2.f31293m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.n21 n21Var = photoViewer2.f31293m1;
                            org.telegram.ui.Components.i71 i71Var = photoViewer2.f31270j1;
                            org.telegram.ui.Components.xq0 xq0Var = n21Var.d;
                            if (i71Var != null) {
                                n21Var.f26721a = i71Var;
                                n21Var.a();
                                n21Var.f26723c = true;
                                AndroidUtilities.cancelRunOnUIThread(xq0Var);
                                AndroidUtilities.runOnUIThread(xq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = n21Var.f26722b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    n21Var.f26722b.cancel();
                                    n21Var.f26722b = null;
                                }
                                if (n21Var.getVisibility() != 0) {
                                    n21Var.setAlpha(0.0f);
                                    n21Var.setVisibility(0);
                                    ViewPropertyAnimator listener = n21Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    n21Var.f26722b = listener;
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
                ((org.telegram.ui.Components.a80) this.f37241c).K((org.telegram.ui.Components.a80) this.f37240b);
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37240b;
                ((AlertDialog$Builder) this.f37241c).f18655a.L0.run();
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
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(privacySettingsActivity.getParentActivity(), 3, null);
                c2Var.f18729g0 = false;
                c2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new is0(privacySettingsActivity, c2Var, setaccountttl, 2));
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f37240b;
                profileActivity.getClass();
                org.telegram.ui.Components.qc.e();
                nf.f.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f37241c).url);
                return;
        }
    }

    public rv(org.telegram.ui.Components.a80 a80Var, org.telegram.ui.Components.a80 a80Var2) {
        this.f37239a = 27;
        this.f37241c = a80Var;
        this.f37240b = a80Var2;
    }
}
