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
public final class sf implements View.OnClickListener {
    public final int f37390a;
    public final Object f37391b;
    public final Object f37392c;

    public sf(int i10, Object obj, Object obj2) {
        this.f37390a = i10;
        this.f37391b = obj;
        this.f37392c = obj2;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        int M;
        int[] iArr;
        String formatPluralString;
        Activity parentActivity;
        int b10;
        int i10;
        String formatPluralString2;
        int length;
        View view2;
        org.telegram.ui.Components.fs fsVar;
        int i11 = this.f37390a;
        s4.c1 c1Var = null;
        Object obj = this.f37392c;
        Object obj2 = this.f37391b;
        switch (i11) {
            case 0:
                zn znVar = (zn) obj2;
                if (znVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    znVar.Q7();
                    UndoView undoView = znVar.y3;
                    if (undoView != null) {
                        long j3 = znVar.T5;
                        int i12 = UndoView.f22449e0;
                        undoView.j(83, j3, new j4(znVar, 1));
                    }
                }
                znVar.A7(true);
                return;
            case 1:
                zn.X((zn) obj2, (String) obj);
                return;
            case 2:
                zn.a1((zn) obj2, (org.telegram.ui.Components.v70) obj);
                return;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                return;
            case 4:
                zn.z1((zn) obj2, (Context) obj);
                return;
            case 5:
                uo uoVar = (uo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18659a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, org.telegram.ui.ActionBar.j6.f19278n5, 23, 15, false, null);
                n4Var.setHeight(47);
                n4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(n4Var);
                LinearLayout f7 = org.telegram.messenger.rk.f(context, 1);
                linearLayout.addView(f7, w7.y5.n(-1, -2));
                org.telegram.ui.Cells.k6[] k6VarArr = new org.telegram.ui.Cells.k6[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, true);
                    k6VarArr[i13] = k6Var;
                    k6Var.setTag(Integer.valueOf(i13));
                    k6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    if (i13 == 0) {
                        k6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !uoVar.J0);
                    } else if (ChatObject.isChannel(uoVar.f38174x0)) {
                        k6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, uoVar.J0);
                    } else {
                        k6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, uoVar.J0);
                    }
                    f7.addView(k6VarArr[i13], w7.y5.n(-1, -2));
                    k6VarArr[i13].setOnClickListener(new z(uoVar, k6VarArr, a3Var, 8));
                    i13++;
                }
                a3Var.b(linearLayout);
                uoVar.showDialog(f3Var);
                return;
            case 6:
                uo.U((uo) obj2, (FrameLayout) obj, view);
                return;
            case 7:
                nq.V((nq) obj2, (org.telegram.ui.ActionBar.a3) obj, view);
                return;
            case 8:
                new rg.x0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.f6) obj).show();
                return;
            case 9:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.f6) obj);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 11:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj2;
                org.telegram.ui.Components.b5 b5Var = (org.telegram.ui.Components.b5) obj;
                v0Var.M(null, null);
                v0Var.G(b5Var.d, false);
                v0Var.setupPopupRadialSelectors(b5Var.f22889f);
                v0Var.B(b5Var.e);
                return;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                ((ai.s4) obj).run();
                return;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f18654a.L0.run();
                ((nu) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).f18659a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 16:
                org.telegram.ui.Components.i8.F((org.telegram.ui.Components.i8) obj2, (float[]) obj);
                return;
            case 17:
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) obj2;
                i8Var.getClass();
                ((org.telegram.ui.Components.v70) obj).u();
                i8Var.t0(6);
                return;
            case 18:
                org.telegram.ui.Components.z90 z90Var = (org.telegram.ui.Components.z90) obj;
                org.telegram.ui.Components.i8 i8Var2 = ((org.telegram.ui.Components.z7) obj2).F;
                int h02 = org.telegram.ui.Components.i8.h0(i8Var2);
                LaunchActivity launchActivity = i8Var2.G0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(z90Var.getText().toString())) {
                    String charSequence = z90Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof uy) {
                        uy uyVar = (uy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = uyVar.getMessagesController().getTotalDialogsCount();
                        if (!uyVar.f38292l2 && (totalDialogsCount > 10 || uyVar.K)) {
                            if (!uyVar.f38284j2) {
                                uyVar.f38351x = 3;
                                uyVar.X.f22856r.setText(charSequence);
                                uyVar.X.f22856r.setSelection(charSequence.length());
                            } else {
                                uyVar.X.f22856r.setText(charSequence);
                                uyVar.X.f22856r.setSelection(charSequence.length());
                                ey eyVar = uyVar.C0;
                                if (eyVar != null && (M = eyVar.M(3)) >= 0 && uyVar.C0.getTabsView().getCurrentTabId() != M) {
                                    uyVar.C0.getTabsView().d(M, M);
                                }
                            }
                            i8Var2.dismiss();
                            return;
                        }
                    }
                    uy uyVar2 = new uy(null);
                    uyVar2.f38301n2 = charSequence;
                    uyVar2.f38351x = 3;
                    launchActivity.q0(uyVar2, false, false);
                    i8Var2.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) obj2;
                ((boolean[]) obj)[0] = true;
                d9Var.J.x1(d9Var.Y);
                d9Var.S.dismiss();
                return;
            case 20:
                org.telegram.ui.Components.ca caVar = (org.telegram.ui.Components.ca) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        nf.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(caVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = caVar.f23220n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) caVar.getContext(), caVar.f23220n.document)) {
                            FileLoader.getInstance(caVar.f23222s).loadFile(caVar.f23220n.document, "update", 3, 1);
                            caVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        nf.f.s(caVar.getContext(), caVar.f23220n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.Components.ld ldVar = (org.telegram.ui.Components.ld) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.v70 v70Var = ldVar.X0;
                if (v70Var != null && v70Var.D()) {
                    ldVar.X0.u();
                    ldVar.X0 = null;
                    return;
                }
                ldVar.f26102d1.e(true);
                org.telegram.ui.Components.v70 F = org.telegram.ui.Components.v70.F(frameLayout, new ai.d(), ldVar.V0);
                ldVar.X0 = F;
                F.f28994s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                ldVar.X0.k();
                for (int i15 : ldVar.f26101c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    ldVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.kd(ldVar, i15, 0), false);
                    if (ldVar.f26100b1 == i15) {
                        ldVar.X0.L();
                    }
                }
                ldVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.dl dlVar = (org.telegram.ui.Components.dl) obj2;
                org.telegram.ui.Components.fl flVar = (org.telegram.ui.Components.fl) obj;
                org.telegram.ui.Components.gl glVar = dlVar.f23606b;
                org.telegram.ui.Components.vi viVar = glVar.f26655b;
                zn znVar2 = (zn) viVar.f29098f0;
                if (znVar2.c()) {
                    parentActivity = glVar.getParentActivity();
                    org.telegram.ui.Components.d5.M(parentActivity, znVar2.a(), new org.telegram.ui.Components.a3(3, dlVar, flVar), glVar.f26654a);
                    return;
                }
                org.telegram.ui.Components.d5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new of(13, dlVar, flVar));
                return;
            case 23:
                org.telegram.ui.Components.un unVar = ((org.telegram.ui.Components.sn) obj2).d;
                fc1 fc1Var = unVar.f28764s;
                View G = fc1Var.G((org.telegram.ui.Components.rn) obj);
                if (G != null) {
                    c1Var = fc1Var.U(G);
                }
                if (c1Var != null && (b10 = c1Var.b() - unVar.f28766t0) >= 0 && b10 < unVar.K.length) {
                    org.telegram.ui.Components.un.O(unVar, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.eo eoVar = (org.telegram.ui.Components.eo) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                zn znVar3 = eoVar.G;
                if (eoVar.T) {
                    znVar3.showDialog(org.telegram.ui.Components.d5.V(eoVar.getContext(), znVar3.h, f6Var).f18654a);
                    return;
                }
                org.telegram.ui.Components.zn znVar4 = eoVar.e;
                if (znVar3.getParentActivity() != null) {
                    TLRPC.Chat chat = znVar3.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (eoVar.f23885a.f14170f && znVar3.getParentActivity() != null && znVar3.fragmentView != null && znVar3.Z7 != null) {
                            if (znVar3.f40417o2 == null) {
                                org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, znVar3.getParentActivity(), znVar3.f40303ea, true);
                                znVar3.f40417o2 = i40Var;
                                i40Var.setAlpha(0.0f);
                                znVar3.f40417o2.setVisibility(4);
                                znVar3.f40417o2.setShowingDuration(4000L);
                                znVar3.X0.addView(znVar3.f40417o2, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
                            znVar3.f40417o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            znVar3.f40417o2.f(znVar3.f40243a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = znVar3.Z7;
                    TLRPC.UserFull userFull = znVar3.f40249a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.n8 n8Var = new org.telegram.ui.Components.n8(eoVar.getContext(), null, new org.telegram.ui.Components.ao(eoVar, r4), true, 0, eoVar.f23891d0);
                    n8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n8Var.f26605a;
                    org.telegram.ui.Components.bo boVar = new org.telegram.ui.Components.bo(eoVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.n1[] n1VarArr = {boVar};
                    boVar.e = true;
                    boVar.f19641c = 220;
                    boVar.setOutsideTouchable(true);
                    n1VarArr[0].setClippingEnabled(true);
                    n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    n1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    n1VarArr[0].setInputMethodMode(2);
                    n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    n1VarArr[0].showAtLocation(znVar4, 0, (int) (eoVar.getX() + znVar4.getX()), (int) znVar4.getY());
                    znVar3.g8(false, true, 0.2f);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.mp.n((org.telegram.ui.Components.mp) obj, (zn) obj2);
                return;
            case 26:
                org.telegram.ui.Components.mr.P((org.telegram.ui.Components.mr) obj2, (TLRPC.Peer) obj);
                return;
            case 27:
                org.telegram.ui.Components.ur urVar = (org.telegram.ui.Components.ur) obj2;
                String str = (String) obj;
                if (urVar.f28840b == null && (view2 = urVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.f28840b = (EditText) findFocus;
                    }
                }
                if (urVar.f28840b != null) {
                    try {
                        urVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = urVar.f28840b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = urVar.f28840b.getText();
                    if (urVar.f28840b.getSelectionEnd() == urVar.f28840b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + urVar.f28840b.getSelectionStart();
                    }
                    if (urVar.f28840b.getSelectionStart() != -1 && urVar.f28840b.getSelectionEnd() != -1) {
                        EditText editText2 = urVar.f28840b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), urVar.f28840b.getSelectionEnd(), str));
                        EditText editText3 = urVar.f28840b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        urVar.f28840b.setText(str);
                        EditText editText4 = urVar.f28840b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = urVar.f28840b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.fs fsVar2 = (org.telegram.ui.Components.fs) obj2;
                org.telegram.ui.Components.es esVar = (org.telegram.ui.Components.es) obj;
                fsVar2.J();
                esVar.f23927f = !esVar.f23927f;
                esVar.f23930j.X.N(true);
                fsVar2.s();
                return;
            default:
                ((org.telegram.ui.Components.fs) obj2).B0 = !fsVar.B0;
                ((org.telegram.ui.Components.k61) obj).N(true);
                return;
        }
    }

    public sf(org.telegram.ui.Components.mp mpVar, zn znVar) {
        this.f37390a = 25;
        this.f37392c = mpVar;
        this.f37391b = znVar;
    }
}
