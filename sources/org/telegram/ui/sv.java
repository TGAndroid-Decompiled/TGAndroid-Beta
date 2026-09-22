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
public final class sv implements View.OnClickListener {
    public final int f37493a;
    public final Object f37494b;
    public final Object f37495c;

    public sv(int i10, Object obj, Object obj2) {
        this.f37493a = i10;
        this.f37494b = obj;
        this.f37495c = obj2;
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
        switch (this.f37493a) {
            case 0:
                uy uyVar = (uy) this.f37494b;
                uyVar.getClass();
                ((org.telegram.ui.Components.n70) this.f37495c).u();
                uyVar.presentFragment(new ProxyListActivity());
                return;
            case 1:
                fi.u0.e((org.telegram.ui.ActionBar.b2[]) this.f37495c, r0, r0.currentAccount, ((uy) this.f37494b).Y2);
                return;
            case 2:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f37494b)[0].getSwipeBack().e(((int[]) this.f37495c)[0]);
                return;
            case 3:
                uy uyVar2 = (uy) this.f37494b;
                uyVar2.r4((ArrayList) this.f37495c, 102, false, false, null);
                uyVar2.finishPreviewFragment();
                return;
            case 4:
                uy.H0((uy) this.f37494b, (BirthdayController.BirthdayState) this.f37495c);
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ar0(27, (uy) this.f37494b, (String) this.f37495c), 250L);
                return;
            case 6:
                e20 e20Var = (e20) this.f37494b;
                TLRPC.TL_dialogFilterSuggested suggestedFilter = ((f20) this.f37495c).getSuggestedFilter();
                MessagesController.DialogFilter dialogFilter = new MessagesController.DialogFilter();
                TLRPC.TL_textWithEntities tL_textWithEntities = suggestedFilter.filter.title;
                dialogFilter.name = tL_textWithEntities.text;
                dialogFilter.entities = tL_textWithEntities.entities;
                dialogFilter.f15601id = 2;
                while (e20Var.e.getMessagesController().dialogFiltersById.get(dialogFilter.f15601id) != null) {
                    dialogFilter.f15601id++;
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
                f10.t0(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, true, true, true, true, true, e20Var.e, new kw(14, e20Var, suggestedFilter));
                return;
            case 7:
                nf.f.s((Context) this.f37494b, ((TL_fragment.TL_collectibleInfo) this.f37495c).url);
                return;
            case 8:
                ((org.telegram.ui.Components.s11) this.f37494b).run();
                ((org.telegram.ui.ActionBar.f3) this.f37495c).dismiss();
                return;
            case 9:
                TextView textView = (TextView) this.f37495c;
                i60 i60Var = ((s30) this.f37494b).E;
                ChatObject.Call call = i60Var.f34428a1;
                if (call != null && call.recording) {
                    i60Var.G1(textView);
                    return;
                }
                return;
            case 10:
                new r50((Context) this.f37495c, (s50) this.f37494b).show();
                return;
            case 11:
                d80 d80Var = (d80) this.f37494b;
                org.telegram.ui.Components.aj0 aj0Var = (org.telegram.ui.Components.aj0) this.f37495c;
                d80Var.getClass();
                if (!uy.f38196w4) {
                    uy.f38196w4 = true;
                    boolean q6 = org.telegram.ui.ActionBar.i6.I.q();
                    boolean z11 = !q6;
                    if (!q6) {
                        N0 = org.telegram.ui.ActionBar.i6.N0("Night");
                    } else {
                        N0 = org.telegram.ui.ActionBar.i6.N0("Blue");
                    }
                    org.telegram.ui.ActionBar.i6.f19028o = 0;
                    org.telegram.ui.ActionBar.i6.q1();
                    org.telegram.ui.ActionBar.i6.A();
                    org.telegram.ui.Components.xi0 xi0Var = d80Var.v;
                    if (!q6) {
                        i10 = xi0Var.e[0] - 1;
                    } else {
                        i10 = 0;
                    }
                    xi0Var.P(i10);
                    aj0Var.d();
                    aj0Var.getLocationInWindow(r0);
                    int[] iArr = {(aj0Var.getMeasuredWidth() / 2) + iArr[0], (aj0Var.getMeasuredHeight() / 2) + iArr[1]};
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z11), aj0Var);
                    if (!q6) {
                        i11 = R.string.AccDescrSwitchToDayTheme;
                    } else {
                        i11 = R.string.AccDescrSwitchToNightTheme;
                    }
                    aj0Var.setContentDescription(LocaleController.getString(i11));
                    return;
                }
                return;
            case 12:
                p80 p80Var = (p80) this.f37494b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f37495c;
                p80Var.Q.dismiss();
                if (p80Var.f36468f0.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i22 = p80Var.f36465c0;
                    if (i22 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i22 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    uy uyVar3 = new uy(bundle);
                    uyVar3.C2 = new d20(4, p80Var, uyVar3);
                    n2Var.presentFragment(uyVar3);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", p80Var.f36465c0);
                b6 b6Var = new b6(bundle2);
                b6Var.d = p80Var.f36468f0;
                b6Var.U();
                n2Var.presentFragment(b6Var);
                return;
            case 13:
                org.telegram.ui.Cells.q4[] q4VarArr = (org.telegram.ui.Cells.q4[]) this.f37495c;
                Pattern pattern = LaunchActivity.B1;
                Integer num = (Integer) view.getTag();
                ((LocaleController.LocaleInfo[]) this.f37494b)[0] = ((org.telegram.ui.Cells.q4) view).getCurrentLocale();
                for (int i23 = 0; i23 < 2; i23++) {
                    org.telegram.ui.Cells.q4 q4Var = q4VarArr[i23];
                    if (i23 == num.intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q4Var.f20602a.a(z10, true);
                }
                return;
            case 14:
                org.telegram.ui.Components.c5.y((Context) this.f37495c, LocaleController.getString(R.string.ExpireAfter), LocaleController.getString(R.string.SetTimeLimit), -1L, new nb0((xb0) this.f37494b, 0));
                return;
            case 15:
                xb0 xb0Var = (xb0) this.f37494b;
                Runnable[] runnableArr = (Runnable[]) this.f37495c;
                if (xb0Var.e == null) {
                    ub0 ub0Var = xb0Var.f39579f;
                    if (ub0Var.e.h) {
                        int i24 = -xb0Var.N;
                        xb0Var.N = i24;
                        AndroidUtilities.shakeViewSpring(ub0Var, i24);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    Switch r52 = w8Var.e;
                    w8Var.setChecked(!r52.h);
                    vb0 vb0Var = xb0Var.f39581r;
                    if (r52.h) {
                        i19 = 0;
                    }
                    vb0Var.setVisibility(i19);
                    AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                    if (r52.h) {
                        xb0Var.f39579f.setChecked(false);
                        xb0Var.f39579f.setCheckBoxIcon(R.drawable.permission_locked);
                        xb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
                        mb0 mb0Var = new mb0(xb0Var, 0);
                        runnableArr[0] = mb0Var;
                        AndroidUtilities.runOnUIThread(mb0Var, 60L);
                        return;
                    }
                    xb0Var.f39579f.setCheckBoxIcon(0);
                    xb0Var.h.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
                    mb0 mb0Var2 = new mb0(xb0Var, 1);
                    runnableArr[0] = mb0Var2;
                    AndroidUtilities.runOnUIThread(mb0Var2);
                    return;
                }
                return;
            case 16:
                id0 id0Var = (id0) this.f37494b;
                id0Var.r0((cd0) this.f37495c);
                ad0 ad0Var = id0Var.I0;
                if (ad0Var != null) {
                    ad0Var.dismiss();
                    return;
                }
                return;
            case 17:
                id0 id0Var2 = ((fd0) this.f37494b).f33571b;
                id0Var2.getClass();
                id0Var2.F0.b(((hd0) this.f37495c).f34228c, id0Var2.G0, true, 0, 0L);
                id0Var2.finishFragment();
                return;
            case 18:
                ge0 ge0Var = (ge0) this.f37494b;
                Context context = (Context) this.f37495c;
                String string = ge0Var.f33836y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f26642a |= 256;
                    obj.f26643b = indexOf;
                    int i25 = lastIndexOf + 1;
                    obj.f26644c = i25;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.p01(obj, 0), indexOf, i25, 0);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.LoginEmailResetTitle);
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
                alertDialog$Builder.f18435a.T = AndroidUtilities.formatSpannable(replaceTags, spannableStringBuilder, formatString);
                alertDialog$Builder.k(LocaleController.getString(R.string.LoginEmailResetButton), new hu(ge0Var, 17));
                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 19:
                pe0 pe0Var = (pe0) this.f37494b;
                Context context2 = (Context) this.f37495c;
                wg0 wg0Var = pe0Var.f36554y;
                if (wg0Var.V.getTag() == null) {
                    if (pe0Var.f36549n.has_recovery) {
                        wg0Var.n1(0, true);
                        TLRPC.TL_auth_requestPasswordRecovery tL_auth_requestPasswordRecovery = new TLRPC.TL_auth_requestPasswordRecovery();
                        i12 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_auth_requestPasswordRecovery, new ne0(pe0Var, 1), 10);
                        return;
                    }
                    AndroidUtilities.hideKeyboard(pe0Var.f36545a);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    alertDialog$Builder2.f18435a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder2.f18435a.T = LocaleController.getString(R.string.RestorePasswordNoEmailText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Close), null);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.ResetAccount), new hu(pe0Var, 18));
                    alertDialog$Builder2.o();
                    return;
                }
                return;
            case 20:
                zf0 zf0Var = (zf0) this.f37494b;
                Context context3 = (Context) this.f37495c;
                Bundle bundle3 = zf0Var.f40185o0;
                if (bundle3 != null && (tL_auth_sentCode = zf0Var.f40186p0) != null) {
                    zf0Var.f40191s0.g1(bundle3, tL_auth_sentCode, true);
                    return;
                } else if (!zf0Var.f40173d0) {
                    xf0 xf0Var = zf0Var.v;
                    if ((xf0Var == null || xf0Var.getVisibility() == 8) && !zf0Var.f40179i0) {
                        if (zf0Var.f40177g0 == 0) {
                            TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                            tL_auth_reportMissingCode.phone_number = zf0Var.d;
                            tL_auth_reportMissingCode.phone_code_hash = zf0Var.f40171c;
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
                            zf0Var.f40191s0.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context3);
                            alertDialog$Builder3.f18435a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            alertDialog$Builder3.f18435a.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, zf0Var.f40169b));
                            alertDialog$Builder3.i(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new d20(18, zf0Var, context3));
                            alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                            alertDialog$Builder3.h(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new of0(zf0Var, 1));
                            alertDialog$Builder3.o();
                            return;
                        } else if (zf0Var.f40191s0.V.getTag() == null) {
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
                vg0 vg0Var = (vg0) this.f37494b;
                Context context4 = (Context) this.f37495c;
                Toast toast = vg0Var.O;
                if (toast != null) {
                    toast.cancel();
                    vg0Var.O = null;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (vg0Var.M > 0 && currentTimeMillis - vg0Var.N > 1500) {
                    vg0Var.M = 0;
                }
                int i31 = vg0Var.M + 1;
                vg0Var.M = i31;
                vg0Var.N = currentTimeMillis;
                if (i31 >= 5) {
                    vg0Var.M = 0;
                    vg0Var.N = 0L;
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vg0Var.getContext());
                    alertDialog$Builder4.f18435a.R = LocaleController.getString(R.string.SettingsDebug);
                    if (BuildVars.LOGS_ENABLED) {
                        i13 = R.string.DebugMenuDisableLogs;
                    } else {
                        i13 = R.string.DebugMenuEnableLogs;
                    }
                    alertDialog$Builder4.f(new String[]{LocaleController.getString(i13), LocaleController.getString(R.string.DebugSendLogs)}, new uv(vg0Var, 1));
                    alertDialog$Builder4.o();
                    return;
                } else if (i31 > 1) {
                    Toast makeText = Toast.makeText(context4, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i31, new Object[0]), 0);
                    vg0Var.O = makeText;
                    makeText.show();
                    return;
                } else {
                    return;
                }
            case 22:
                MessageObject messageObject = (MessageObject) this.f37495c;
                jj0 jj0Var = ((hj0) this.f37494b).d;
                if (!jj0Var.a0(messageObject)) {
                    jj0Var.getOrCreateStoryViewer().F(jj0Var.getParentActivity(), messageObject.storyItem, ai.u9.a(jj0Var.f34930f));
                    return;
                }
                return;
            case 23:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37494b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f37495c;
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
                ImageView imageView = passcodeActivity.f30887s;
                if (atomicBoolean.get()) {
                    i15 = org.telegram.ui.ActionBar.i6.f18979l6;
                } else {
                    i15 = org.telegram.ui.ActionBar.i6.H6;
                }
                imageView.setColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i15, false));
                return;
            case 24:
                wo0.h0((wo0) this.f37494b, (String) this.f37495c, view);
                return;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) this.f37494b;
                org.telegram.ui.Components.n70 n70Var = (org.telegram.ui.Components.n70) this.f37495c;
                if (photoViewer.T4 != null) {
                    n70Var.u();
                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer.f31005m4;
                    if (n2Var2 instanceof bo) {
                        ((bo) n2Var2).J9(photoViewer.T4, false, true);
                    }
                    nf.f.r(photoViewer.E, Uri.parse(photoViewer.T4.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                    return;
                }
                return;
            case 26:
                PhotoViewer photoViewer2 = (PhotoViewer) this.f37494b;
                Activity activity = (Activity) this.f37495c;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (!photoViewer2.H1() && !photoViewer2.f31045r) {
                    int i32 = photoViewer2.P4;
                    if (i32 >= 0 && i32 < photoViewer2.f30958g7.size()) {
                        Object obj2 = photoViewer2.f30958g7.get(photoViewer2.P4);
                        if (obj2 instanceof MediaController.PhotoEntry) {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                                photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                                photoViewer2.f30979j1.setPhotoState(photoEntry.isHighQuality());
                                boolean isHighQuality = photoEntry.isHighQuality();
                                ci.f4 f4Var = photoViewer2.f30987k1;
                                if (f4Var != null) {
                                    f4Var.e(true);
                                    photoViewer2.f30987k1 = null;
                                }
                                if (photoViewer2.E != null) {
                                    photoViewer2.f30987k1 = new ci.f4(photoViewer2.E, 3);
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
                                    photoViewer2.f30987k1.s(append);
                                    photoViewer2.f30934e0.addView(photoViewer2.f30987k1, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
                                    photoViewer2.f30987k1.setTranslationY(photoViewer2.P0.getTranslationY());
                                    photoViewer2.f30987k1.m(0.0f, (photoViewer2.f30979j1.getWidth() / 2.0f) + photoViewer2.f30979j1.getX() + photoViewer2.H0.getX());
                                    ci.f4 f4Var2 = photoViewer2.f30987k1;
                                    f4Var2.f4635l0 = new ih(2, f4Var2);
                                    f4Var2.d = 3500L;
                                    f4Var2.u();
                                }
                                SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                                ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                                return;
                            }
                        }
                    }
                    if (photoViewer2.f30979j1.getTag() == null) {
                        if (photoViewer2.f30994k8) {
                            if (photoViewer2.f31002m1 == null) {
                                vu0 vu0Var = photoViewer2.f30934e0;
                                ?? textView2 = new TextView(activity);
                                textView2.d = new org.telegram.ui.Components.jq0(textView2, 17);
                                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(3.0f), -871296751));
                                textView2.setTextColor(-1);
                                textView2.setTextSize(1, 14.0f);
                                textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.0f));
                                textView2.setGravity(16);
                                vu0Var.addView((View) textView2, w7.x5.d(-2, -2.0f, 51, 5.0f, 0.0f, 5.0f, 3.0f));
                                textView2.setVisibility(8);
                                photoViewer2.f31002m1 = textView2;
                            }
                            photoViewer2.f31002m1.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                            org.telegram.ui.Components.y11 y11Var = photoViewer2.f31002m1;
                            org.telegram.ui.Components.s61 s61Var = photoViewer2.f30979j1;
                            org.telegram.ui.Components.jq0 jq0Var = y11Var.d;
                            if (s61Var != null) {
                                y11Var.f30134a = s61Var;
                                y11Var.a();
                                y11Var.f30136c = true;
                                AndroidUtilities.cancelRunOnUIThread(jq0Var);
                                AndroidUtilities.runOnUIThread(jq0Var, 2000L);
                                ViewPropertyAnimator viewPropertyAnimator = y11Var.f30135b;
                                if (viewPropertyAnimator != null) {
                                    viewPropertyAnimator.setListener(null);
                                    y11Var.f30135b.cancel();
                                    y11Var.f30135b = null;
                                }
                                if (y11Var.getVisibility() != 0) {
                                    y11Var.setAlpha(0.0f);
                                    y11Var.setVisibility(0);
                                    ViewPropertyAnimator listener = y11Var.animate().setDuration(300L).alpha(1.0f).setListener(null);
                                    y11Var.f30135b = listener;
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
                ((org.telegram.ui.Components.n70) this.f37495c).K((org.telegram.ui.Components.n70) this.f37494b);
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f37494b;
                ((AlertDialog$Builder) this.f37495c).f18435a.L0.run();
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
                b2Var.f18471g0 = false;
                b2Var.show();
                TL_account.setAccountTTL setaccountttl = new TL_account.setAccountTTL();
                TLRPC.TL_accountDaysTTL tL_accountDaysTTL = new TLRPC.TL_accountDaysTTL();
                setaccountttl.ttl = tL_accountDaysTTL;
                tL_accountDaysTTL.days = i18;
                privacySettingsActivity.getConnectionsManager().sendRequest(setaccountttl, new ns0(privacySettingsActivity, b2Var, setaccountttl, 2));
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.f37494b;
                profileActivity.getClass();
                org.telegram.ui.Components.oc.e();
                nf.f.s(profileActivity.getParentActivity(), ((TL_fragment.TL_collectibleInfo) this.f37495c).url);
                return;
        }
    }

    public sv(org.telegram.ui.Components.n70 n70Var, org.telegram.ui.Components.n70 n70Var2) {
        this.f37493a = 27;
        this.f37495c = n70Var;
        this.f37494b = n70Var2;
    }
}
