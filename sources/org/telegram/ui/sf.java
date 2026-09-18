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
    public final int f37275a;
    public final Object f37276b;
    public final Object f37277c;

    public sf(int i10, Object obj, Object obj2) {
        this.f37275a = i10;
        this.f37276b = obj;
        this.f37277c = obj2;
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
        int i11 = this.f37275a;
        s4.c1 c1Var = null;
        Object obj = this.f37277c;
        Object obj2 = this.f37276b;
        switch (i11) {
            case 0:
                zn znVar = (zn) obj2;
                if (znVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    znVar.Q7();
                    UndoView undoView = znVar.y3;
                    if (undoView != null) {
                        long j3 = znVar.T5;
                        int i12 = UndoView.f22414e0;
                        undoView.j(83, j3, new j4(znVar, 1));
                    }
                }
                znVar.A7(true);
                return;
            case 1:
                zn.X((zn) obj2, (String) obj);
                return;
            case 2:
                zn.a1((zn) obj2, (org.telegram.ui.Components.w70) obj);
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
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18627a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.j6.f19246n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout e = org.telegram.messenger.wh.e(context, 1);
                linearLayout.addView(e, w7.y5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i13] = j6Var;
                    j6Var.setTag(Integer.valueOf(i13));
                    j6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                    if (i13 == 0) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !uoVar.J0);
                    } else if (ChatObject.isChannel(uoVar.f38065x0)) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, uoVar.J0);
                    } else {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, uoVar.J0);
                    }
                    e.addView(j6VarArr[i13], w7.y5.n(-1, -2));
                    j6VarArr[i13].setOnClickListener(new z(uoVar, j6VarArr, a3Var, 8));
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
                new rg.x0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.e6) obj).show();
                return;
            case 9:
                org.telegram.ui.Components.y.Q((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.e6) obj);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 11:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj2;
                org.telegram.ui.Components.c5 c5Var = (org.telegram.ui.Components.c5) obj;
                v0Var.M(null, null);
                v0Var.G(c5Var.d, false);
                v0Var.setupPopupRadialSelectors(c5Var.f23201f);
                v0Var.B(c5Var.e);
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
                ((AlertDialog$Builder) obj2).f18622a.L0.run();
                ((nu) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).f18627a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 16:
                org.telegram.ui.Components.j8.F((org.telegram.ui.Components.j8) obj2, (float[]) obj);
                return;
            case 17:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) obj2;
                j8Var.getClass();
                ((org.telegram.ui.Components.w70) obj).u();
                j8Var.t0(6);
                return;
            case 18:
                org.telegram.ui.Components.aa0 aa0Var = (org.telegram.ui.Components.aa0) obj;
                org.telegram.ui.Components.j8 j8Var2 = ((org.telegram.ui.Components.a8) obj2).F;
                int h02 = org.telegram.ui.Components.j8.h0(j8Var2);
                LaunchActivity launchActivity = j8Var2.G0;
                if (MessagesController.getInstance(h02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(aa0Var.getText().toString())) {
                    String charSequence = aa0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof uy) {
                        uy uyVar = (uy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = uyVar.getMessagesController().getTotalDialogsCount();
                        if (!uyVar.f38185l2 && (totalDialogsCount > 10 || uyVar.K)) {
                            if (!uyVar.f38177j2) {
                                uyVar.f38244x = 3;
                                uyVar.X.f22787r.setText(charSequence);
                                uyVar.X.f22787r.setSelection(charSequence.length());
                            } else {
                                uyVar.X.f22787r.setText(charSequence);
                                uyVar.X.f22787r.setSelection(charSequence.length());
                                ey eyVar = uyVar.C0;
                                if (eyVar != null && (M = eyVar.M(3)) >= 0 && uyVar.C0.getTabsView().getCurrentTabId() != M) {
                                    uyVar.C0.getTabsView().d(M, M);
                                }
                            }
                            j8Var2.dismiss();
                            return;
                        }
                    }
                    uy uyVar2 = new uy(null);
                    uyVar2.f38194n2 = charSequence;
                    uyVar2.f38244x = 3;
                    launchActivity.q0(uyVar2, false, false);
                    j8Var2.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) obj2;
                ((boolean[]) obj)[0] = true;
                e9Var.J.x1(e9Var.Y);
                e9Var.S.dismiss();
                return;
            case 20:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        nf.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(daVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = daVar.f23503n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) daVar.getContext(), daVar.f23503n.document)) {
                            FileLoader.getInstance(daVar.f23505s).loadFile(daVar.f23503n.document, "update", 3, 1);
                            daVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        nf.f.s(daVar.getContext(), daVar.f23503n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.Components.kd kdVar = (org.telegram.ui.Components.kd) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.w70 w70Var = kdVar.X0;
                if (w70Var != null && w70Var.D()) {
                    kdVar.X0.u();
                    kdVar.X0 = null;
                    return;
                }
                kdVar.f25686d1.e(true);
                org.telegram.ui.Components.w70 F = org.telegram.ui.Components.w70.F(frameLayout, new ai.d(), kdVar.V0);
                kdVar.X0 = F;
                F.f29924s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                kdVar.X0.k();
                for (int i15 : kdVar.f25685c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    kdVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.x2(kdVar, i15, 2), false);
                    if (kdVar.f25684b1 == i15) {
                        kdVar.X0.L();
                    }
                }
                kdVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.dl dlVar = (org.telegram.ui.Components.dl) obj2;
                org.telegram.ui.Components.fl flVar = (org.telegram.ui.Components.fl) obj;
                org.telegram.ui.Components.gl glVar = dlVar.f23602b;
                org.telegram.ui.Components.vi viVar = glVar.f26688b;
                zn znVar2 = (zn) viVar.f29021f0;
                if (znVar2.c()) {
                    parentActivity = glVar.getParentActivity();
                    org.telegram.ui.Components.e5.M(parentActivity, znVar2.a(), new org.telegram.ui.Components.b3(3, dlVar, flVar), glVar.f26687a);
                    return;
                }
                org.telegram.ui.Components.e5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new of(13, dlVar, flVar));
                return;
            case 23:
                org.telegram.ui.Components.un unVar = ((org.telegram.ui.Components.sn) obj2).d;
                dc1 dc1Var = unVar.f28765s;
                View G = dc1Var.G((org.telegram.ui.Components.rn) obj);
                if (G != null) {
                    c1Var = dc1Var.U(G);
                }
                if (c1Var != null && (b10 = c1Var.b() - unVar.f28767t0) >= 0 && b10 < unVar.K.length) {
                    org.telegram.ui.Components.un.O(unVar, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.eo eoVar = (org.telegram.ui.Components.eo) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                zn znVar3 = eoVar.G;
                if (eoVar.T) {
                    znVar3.showDialog(org.telegram.ui.Components.e5.V(eoVar.getContext(), znVar3.h, e6Var).f18622a);
                    return;
                }
                org.telegram.ui.Components.zn znVar4 = eoVar.e;
                if (znVar3.getParentActivity() != null) {
                    TLRPC.Chat chat = znVar3.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (eoVar.f23913a.f14131f && znVar3.getParentActivity() != null && znVar3.fragmentView != null && znVar3.Z7 != null) {
                            if (znVar3.f40375o2 == null) {
                                org.telegram.ui.Components.i40 i40Var = new org.telegram.ui.Components.i40(7, znVar3.getParentActivity(), znVar3.f40261ea, true);
                                znVar3.f40375o2 = i40Var;
                                i40Var.setAlpha(0.0f);
                                znVar3.f40375o2.setVisibility(4);
                                znVar3.f40375o2.setShowingDuration(4000L);
                                znVar3.X0.addView(znVar3.f40375o2, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
                            znVar3.f40375o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            znVar3.f40375o2.f(znVar3.f40201a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = znVar3.Z7;
                    TLRPC.UserFull userFull = znVar3.f40207a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.o8 o8Var = new org.telegram.ui.Components.o8(eoVar.getContext(), null, new org.telegram.ui.Components.ao(eoVar, r4), true, 0, eoVar.f23919d0);
                    o8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o8Var.f26898a;
                    org.telegram.ui.Components.bo boVar = new org.telegram.ui.Components.bo(eoVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.n1[] n1VarArr = {boVar};
                    boVar.e = true;
                    boVar.f19609c = 220;
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
                if (urVar.f28807b == null && (view2 = urVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        urVar.f28807b = (EditText) findFocus;
                    }
                }
                if (urVar.f28807b != null) {
                    try {
                        urVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = urVar.f28807b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = urVar.f28807b.getText();
                    if (urVar.f28807b.getSelectionEnd() == urVar.f28807b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + urVar.f28807b.getSelectionStart();
                    }
                    if (urVar.f28807b.getSelectionStart() != -1 && urVar.f28807b.getSelectionEnd() != -1) {
                        EditText editText2 = urVar.f28807b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), urVar.f28807b.getSelectionEnd(), str));
                        EditText editText3 = urVar.f28807b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        urVar.f28807b.setText(str);
                        EditText editText4 = urVar.f28807b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = urVar.f28807b;
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
                esVar.f23959f = !esVar.f23959f;
                esVar.f23962j.X.N(true);
                fsVar2.s();
                return;
            default:
                ((org.telegram.ui.Components.fs) obj2).B0 = !fsVar.B0;
                ((org.telegram.ui.Components.l61) obj).N(true);
                return;
        }
    }

    public sf(org.telegram.ui.Components.mp mpVar, zn znVar) {
        this.f37275a = 25;
        this.f37277c = mpVar;
        this.f37276b = znVar;
    }
}
