package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class rf implements View.OnClickListener {
    public final int f41429a;
    public final Object f41430b;
    public final Object f41431c;

    public rf(int i10, Object obj, Object obj2) {
        this.f41429a = i10;
        this.f41430b = obj;
        this.f41431c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        int L;
        int[] iArr;
        String formatPluralString;
        Activity parentActivity;
        int b10;
        int i10;
        String formatPluralString2;
        int length;
        View view2;
        org.telegram.ui.Components.ws wsVar;
        int i11 = this.f41429a;
        s4.d1 d1Var = null;
        Object obj = this.f41431c;
        Object obj2 = this.f41430b;
        switch (i11) {
            case 0:
                zn znVar = (zn) obj2;
                if (znVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    znVar.T7();
                    UndoView undoView = znVar.y3;
                    if (undoView != null) {
                        long j3 = znVar.T5;
                        int i12 = UndoView.f24362e0;
                        undoView.j(83, j3, new j4(znVar, 1));
                    }
                }
                znVar.D7(true);
                return;
            case 1:
                zn.W0((zn) obj2, (String) obj);
                return;
            case 2:
                zn.S0((zn) obj2, (org.telegram.ui.Components.q80) obj);
                return;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                return;
            case 4:
                zn.g1((zn) obj2, (Context) obj);
                return;
            case 5:
                uo uoVar = (uo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, null);
                org.telegram.ui.ActionBar.e3 e3Var = z2Var.f21710a;
                e3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.h6.f20970n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout e7 = org.telegram.messenger.ai.e(context, 1);
                linearLayout.addView(e7, w7.x5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i13] = j6Var;
                    j6Var.setTag(Integer.valueOf(i13));
                    j6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
                    if (i13 == 0) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !uoVar.J0);
                    } else if (ChatObject.isChannel(uoVar.f42686x0)) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, uoVar.J0);
                    } else {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, uoVar.J0);
                    }
                    e7.addView(j6VarArr[i13], w7.x5.n(-1, -2));
                    j6VarArr[i13].setOnClickListener(new z(uoVar, j6VarArr, z2Var, 8));
                    i13++;
                }
                z2Var.b(linearLayout);
                uoVar.showDialog(e3Var);
                return;
            case 6:
                uo.U((uo) obj2, (FrameLayout) obj, view);
                return;
            case 7:
                nq.V((nq) obj2, (org.telegram.ui.ActionBar.z2) obj, view);
                return;
            case 8:
                new rg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.d6) obj).show();
                return;
            case 9:
                org.telegram.ui.Components.y.R((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.d6) obj);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 11:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) obj;
                u0Var.M(null, null);
                u0Var.G(e5Var.d, false);
                u0Var.setupPopupRadialSelectors(e5Var.f25860f);
                u0Var.B(e5Var.f25859e);
                return;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                ((ai.t4) obj).run();
                return;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f20368a.L0.run();
                ((ku) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.z2) obj2).f21710a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 16:
                org.telegram.ui.Components.l8.G((org.telegram.ui.Components.l8) obj2, (float[]) obj);
                return;
            case 17:
                org.telegram.ui.Components.l8 l8Var = (org.telegram.ui.Components.l8) obj2;
                l8Var.getClass();
                ((org.telegram.ui.Components.q80) obj).u();
                l8Var.u0(6);
                return;
            case 18:
                org.telegram.ui.Components.ua0 ua0Var = (org.telegram.ui.Components.ua0) obj;
                org.telegram.ui.Components.l8 l8Var2 = ((org.telegram.ui.Components.c8) obj2).F;
                int i02 = org.telegram.ui.Components.l8.i0(l8Var2);
                LaunchActivity launchActivity = l8Var2.G0;
                if (MessagesController.getInstance(i02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(ua0Var.getText().toString())) {
                    String charSequence = ua0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof sy) {
                        sy syVar = (sy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = syVar.getMessagesController().getTotalDialogsCount();
                        if (!syVar.f41943l2 && (totalDialogsCount > 10 || syVar.K)) {
                            if (!syVar.f41935j2) {
                                syVar.f42002x = 3;
                                syVar.X.f30964r.setText(charSequence);
                                syVar.X.f30964r.setSelection(charSequence.length());
                            } else {
                                syVar.X.f30964r.setText(charSequence);
                                syVar.X.f30964r.setSelection(charSequence.length());
                                cy cyVar = syVar.C0;
                                if (cyVar != null && (L = cyVar.L(3)) >= 0 && syVar.C0.getTabsView().getCurrentTabId() != L) {
                                    syVar.C0.getTabsView().d(L, L);
                                }
                            }
                            l8Var2.dismiss();
                            return;
                        }
                    }
                    sy syVar2 = new sy(null);
                    syVar2.f41952n2 = charSequence;
                    syVar2.f42002x = 3;
                    launchActivity.q0(syVar2, false, false);
                    l8Var2.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) obj2;
                ((boolean[]) obj)[0] = true;
                g9Var.J.x1(g9Var.Y);
                g9Var.S.dismiss();
                return;
            case 20:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        of.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        of.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(faVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = faVar.f26312n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) faVar.getContext(), faVar.f26312n.document)) {
                            FileLoader.getInstance(faVar.f26314s).loadFile(faVar.f26312n.document, "update", 3, 1);
                            faVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        of.f.s(faVar.getContext(), faVar.f26312n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.Components.od odVar = (org.telegram.ui.Components.od) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.q80 q80Var = odVar.X0;
                if (q80Var != null && q80Var.D()) {
                    odVar.X0.u();
                    odVar.X0 = null;
                    return;
                }
                odVar.f29374d1.e(true);
                org.telegram.ui.Components.q80 F = org.telegram.ui.Components.q80.F(frameLayout, new ai.d(), odVar.V0);
                odVar.X0 = F;
                F.f30083s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                odVar.X0.k();
                for (int i15 : odVar.f29373c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    odVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.nd(odVar, i15, 0), false);
                    if (odVar.f29372b1 == i15) {
                        odVar.X0.L();
                    }
                }
                odVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.ul ulVar = (org.telegram.ui.Components.ul) obj2;
                org.telegram.ui.Components.wl wlVar = (org.telegram.ui.Components.wl) obj;
                org.telegram.ui.Components.xl xlVar = ulVar.f31485b;
                org.telegram.ui.Components.yi yiVar = xlVar.f30161b;
                zn znVar2 = (zn) yiVar.f33216f0;
                if (znVar2.c()) {
                    parentActivity = xlVar.getParentActivity();
                    org.telegram.ui.Components.g5.L(parentActivity, znVar2.a(), new org.telegram.ui.Components.y2(5, ulVar, wlVar), xlVar.f30160a);
                    return;
                }
                org.telegram.ui.Components.g5.Z(yiVar.M1, yiVar.l1() + 1, yiVar.p1(), new oc(20, ulVar, wlVar));
                return;
            case 23:
                org.telegram.ui.Components.lo loVar = ((org.telegram.ui.Components.jo) obj2).d;
                ec1 ec1Var = loVar.f28403s;
                View F2 = ec1Var.F((org.telegram.ui.Components.io) obj);
                if (F2 != null) {
                    d1Var = ec1Var.T(F2);
                }
                if (d1Var != null && (b10 = d1Var.b() - loVar.f28405t0) >= 0 && b10 < loVar.K.length) {
                    org.telegram.ui.Components.lo.R(loVar, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.uo uoVar2 = (org.telegram.ui.Components.uo) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                zn znVar3 = uoVar2.G;
                if (uoVar2.T) {
                    znVar3.showDialog(org.telegram.ui.Components.g5.U(uoVar2.getContext(), znVar3.h, d6Var).f20368a);
                    return;
                }
                org.telegram.ui.Components.qo qoVar = uoVar2.f31514e;
                if (znVar3.getParentActivity() != null) {
                    TLRPC.Chat chat = znVar3.f44752e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (uoVar2.f31507a.f16366f && znVar3.getParentActivity() != null && znVar3.fragmentView != null && znVar3.Z7 != null) {
                            if (znVar3.f44875o2 == null) {
                                org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(7, znVar3.getParentActivity(), znVar3.f44762ea, true);
                                znVar3.f44875o2 = a50Var;
                                a50Var.setAlpha(0.0f);
                                znVar3.f44875o2.setVisibility(4);
                                znVar3.f44875o2.setShowingDuration(4000L);
                                znVar3.X0.addView(znVar3.f44875o2, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                            }
                            int i16 = znVar3.Z7.ttl_period;
                            if (i16 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i16 / 86400, new Object[0]);
                            } else if (i16 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i16 / 3600, new Object[0]);
                            } else if (i16 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i16 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i16, new Object[0]);
                            }
                            znVar3.f44875o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            znVar3.f44875o2.f(znVar3.f44701a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = znVar3.Z7;
                    TLRPC.UserFull userFull = znVar3.f44707a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.q8 q8Var = new org.telegram.ui.Components.q8(uoVar2.getContext(), null, new org.telegram.ui.Components.ro(uoVar2, r4), true, 0, uoVar2.f31513d0);
                    q8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q8Var.f30047a;
                    org.telegram.ui.Components.so soVar = new org.telegram.ui.Components.so(uoVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.m1[] m1VarArr = {soVar};
                    soVar.f21372e = true;
                    soVar.f21371c = 220;
                    soVar.setOutsideTouchable(true);
                    m1VarArr[0].setClippingEnabled(true);
                    m1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    m1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1VarArr[0].setInputMethodMode(2);
                    m1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    m1VarArr[0].showAtLocation(qoVar, 0, (int) (uoVar2.getX() + qoVar.getX()), (int) qoVar.getY());
                    znVar3.j8(false, true, 0.2f);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.cq.p((org.telegram.ui.Components.cq) obj, (zn) obj2);
                return;
            case 26:
                org.telegram.ui.Components.es.Q((org.telegram.ui.Components.es) obj2, (TLRPC.Peer) obj);
                return;
            case 27:
                org.telegram.ui.Components.ms msVar = (org.telegram.ui.Components.ms) obj2;
                String str = (String) obj;
                if (msVar.f28846b == null && (view2 = msVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        msVar.f28846b = (EditText) findFocus;
                    }
                }
                if (msVar.f28846b != null) {
                    try {
                        msVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = msVar.f28846b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = msVar.f28846b.getText();
                    if (msVar.f28846b.getSelectionEnd() == msVar.f28846b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + msVar.f28846b.getSelectionStart();
                    }
                    if (msVar.f28846b.getSelectionStart() != -1 && msVar.f28846b.getSelectionEnd() != -1) {
                        EditText editText2 = msVar.f28846b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), msVar.f28846b.getSelectionEnd(), str));
                        EditText editText3 = msVar.f28846b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        msVar.f28846b.setText(str);
                        EditText editText4 = msVar.f28846b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = msVar.f28846b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.ws wsVar2 = (org.telegram.ui.Components.ws) obj2;
                org.telegram.ui.Components.vs vsVar = (org.telegram.ui.Components.vs) obj;
                wsVar2.K();
                vsVar.f32472f = !vsVar.f32472f;
                vsVar.f32475j.X.N(true);
                wsVar2.u();
                return;
            default:
                ((org.telegram.ui.Components.ws) obj2).B0 = !wsVar.B0;
                ((org.telegram.ui.Components.e71) obj).N(true);
                return;
        }
    }

    public rf(org.telegram.ui.Components.cq cqVar, zn znVar) {
        this.f41429a = 25;
        this.f41431c = cqVar;
        this.f41430b = znVar;
    }
}
