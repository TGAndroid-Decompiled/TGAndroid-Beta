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
    public final int f41684a;
    public final Object f41685b;
    public final Object f41686c;

    public sf(int i10, Object obj, Object obj2) {
        this.f41684a = i10;
        this.f41685b = obj;
        this.f41686c = obj2;
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
        org.telegram.ui.Components.vs vsVar;
        int i11 = this.f41684a;
        s4.d1 d1Var = null;
        Object obj = this.f41686c;
        Object obj2 = this.f41685b;
        switch (i11) {
            case 0:
                zn znVar = (zn) obj2;
                if (znVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    znVar.T7();
                    UndoView undoView = znVar.y3;
                    if (undoView != null) {
                        long j3 = znVar.T5;
                        int i12 = UndoView.f24370e0;
                        undoView.j(83, j3, new k4(znVar, 1));
                    }
                }
                znVar.D7(true);
                return;
            case 1:
                zn.W0((zn) obj2, (String) obj);
                return;
            case 2:
                zn.S0((zn) obj2, (org.telegram.ui.Components.p80) obj);
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
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20380a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.i6.f20981n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
                linearLayout.addView(e7, w7.x5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i13] = j6Var;
                    j6Var.setTag(Integer.valueOf(i13));
                    j6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.i6.L0(false));
                    if (i13 == 0) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !uoVar.J0);
                    } else if (ChatObject.isChannel(uoVar.f42494x0)) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, uoVar.J0);
                    } else {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, uoVar.J0);
                    }
                    e7.addView(j6VarArr[i13], w7.x5.n(-1, -2));
                    j6VarArr[i13].setOnClickListener(new a0(uoVar, j6VarArr, a3Var, 8));
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
                new rg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.e6) obj).show();
                return;
            case 9:
                org.telegram.ui.Components.y.R((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.e6) obj);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 11:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj2;
                org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) obj;
                v0Var.M(null, null);
                v0Var.G(e5Var.d, false);
                v0Var.setupPopupRadialSelectors(e5Var.f25953f);
                v0Var.B(e5Var.f25952e);
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
                ((AlertDialog$Builder) obj2).f20374a.L0.run();
                ((lu) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.a3) obj2).f20380a.dismissRunnable;
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
                ((org.telegram.ui.Components.p80) obj).u();
                l8Var.u0(6);
                return;
            case 18:
                org.telegram.ui.Components.ta0 ta0Var = (org.telegram.ui.Components.ta0) obj;
                org.telegram.ui.Components.l8 l8Var2 = ((org.telegram.ui.Components.c8) obj2).F;
                int i02 = org.telegram.ui.Components.l8.i0(l8Var2);
                LaunchActivity launchActivity = l8Var2.G0;
                if (MessagesController.getInstance(i02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(ta0Var.getText().toString())) {
                    String charSequence = ta0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof ty) {
                        ty tyVar = (ty) launchActivity.O().getLastFragment();
                        int totalDialogsCount = tyVar.getMessagesController().getTotalDialogsCount();
                        if (!tyVar.f42208l2 && (totalDialogsCount > 10 || tyVar.K)) {
                            if (!tyVar.f42200j2) {
                                tyVar.f42267x = 3;
                                tyVar.X.f30614r.setText(charSequence);
                                tyVar.X.f30614r.setSelection(charSequence.length());
                            } else {
                                tyVar.X.f30614r.setText(charSequence);
                                tyVar.X.f30614r.setSelection(charSequence.length());
                                dy dyVar = tyVar.C0;
                                if (dyVar != null && (L = dyVar.L(3)) >= 0 && tyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    tyVar.C0.getTabsView().d(L, L);
                                }
                            }
                            l8Var2.dismiss();
                            return;
                        }
                    }
                    ty tyVar2 = new ty(null);
                    tyVar2.f42217n2 = charSequence;
                    tyVar2.f42267x = 3;
                    launchActivity.q0(tyVar2, false, false);
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
                org.telegram.ui.Components.ga gaVar = (org.telegram.ui.Components.ga) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        of.f.s(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        of.f.s(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(gaVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = gaVar.f26644n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) gaVar.getContext(), gaVar.f26644n.document)) {
                            FileLoader.getInstance(gaVar.f26646s).loadFile(gaVar.f26644n.document, "update", 3, 1);
                            gaVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        of.f.s(gaVar.getContext(), gaVar.f26644n.url);
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
                org.telegram.ui.Components.p80 p80Var = odVar.X0;
                if (p80Var != null && p80Var.D()) {
                    odVar.X0.u();
                    odVar.X0 = null;
                    return;
                }
                odVar.f29454d1.e(true);
                org.telegram.ui.Components.p80 F = org.telegram.ui.Components.p80.F(frameLayout, new ai.d(), odVar.V0);
                odVar.X0 = F;
                F.f29789s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                odVar.X0.k();
                for (int i15 : odVar.f29453c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    odVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.nd(odVar, i15, 0), false);
                    if (odVar.f29452b1 == i15) {
                        odVar.X0.L();
                    }
                }
                odVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.ul ulVar = (org.telegram.ui.Components.ul) obj2;
                org.telegram.ui.Components.wl wlVar = (org.telegram.ui.Components.wl) obj;
                org.telegram.ui.Components.xl xlVar = ulVar.f31533b;
                org.telegram.ui.Components.yi yiVar = xlVar.f30173b;
                zn znVar2 = (zn) yiVar.f33228f0;
                if (znVar2.c()) {
                    parentActivity = xlVar.getParentActivity();
                    org.telegram.ui.Components.g5.L(parentActivity, znVar2.a(), new org.telegram.ui.Components.y2(4, ulVar, wlVar), xlVar.f30172a);
                    return;
                }
                org.telegram.ui.Components.g5.Z(yiVar.M1, yiVar.l1() + 1, yiVar.p1(), new pc(20, ulVar, wlVar));
                return;
            case 23:
                org.telegram.ui.Components.lo loVar = ((org.telegram.ui.Components.jo) obj2).d;
                fc1 fc1Var = loVar.f28525s;
                View F2 = fc1Var.F((org.telegram.ui.Components.io) obj);
                if (F2 != null) {
                    d1Var = fc1Var.T(F2);
                }
                if (d1Var != null && (b10 = d1Var.b() - loVar.f28527t0) >= 0 && b10 < loVar.K.length) {
                    org.telegram.ui.Components.lo.R(loVar, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.uo uoVar2 = (org.telegram.ui.Components.uo) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                zn znVar3 = uoVar2.G;
                if (uoVar2.T) {
                    znVar3.showDialog(org.telegram.ui.Components.g5.U(uoVar2.getContext(), znVar3.h, e6Var).f20374a);
                    return;
                }
                org.telegram.ui.Components.qo qoVar = uoVar2.f31561e;
                if (znVar3.getParentActivity() != null) {
                    TLRPC.Chat chat = znVar3.f44751e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (uoVar2.f31554a.f16338f && znVar3.getParentActivity() != null && znVar3.fragmentView != null && znVar3.Z7 != null) {
                            if (znVar3.f44874o2 == null) {
                                org.telegram.ui.Components.z40 z40Var = new org.telegram.ui.Components.z40(7, znVar3.getParentActivity(), znVar3.f44761ea, true);
                                znVar3.f44874o2 = z40Var;
                                z40Var.setAlpha(0.0f);
                                znVar3.f44874o2.setVisibility(4);
                                znVar3.f44874o2.setShowingDuration(4000L);
                                znVar3.X0.addView(znVar3.f44874o2, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
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
                            znVar3.f44874o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            znVar3.f44874o2.f(znVar3.f44700a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = znVar3.Z7;
                    TLRPC.UserFull userFull = znVar3.f44706a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.q8 q8Var = new org.telegram.ui.Components.q8(uoVar2.getContext(), null, new org.telegram.ui.Components.ro(uoVar2, r4), true, 0, uoVar2.f31560d0);
                    q8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q8Var.f30101a;
                    org.telegram.ui.Components.so soVar = new org.telegram.ui.Components.so(uoVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.n1[] n1VarArr = {soVar};
                    soVar.f21415e = true;
                    soVar.f21414c = 220;
                    soVar.setOutsideTouchable(true);
                    n1VarArr[0].setClippingEnabled(true);
                    n1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    n1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    n1VarArr[0].setInputMethodMode(2);
                    n1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    n1VarArr[0].showAtLocation(qoVar, 0, (int) (uoVar2.getX() + qoVar.getX()), (int) qoVar.getY());
                    znVar3.j8(false, true, 0.2f);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.cq.p((org.telegram.ui.Components.cq) obj, (zn) obj2);
                return;
            case 26:
                org.telegram.ui.Components.ds.Q((org.telegram.ui.Components.ds) obj2, (TLRPC.Peer) obj);
                return;
            case 27:
                org.telegram.ui.Components.ls lsVar = (org.telegram.ui.Components.ls) obj2;
                String str = (String) obj;
                if (lsVar.f28581b == null && (view2 = lsVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        lsVar.f28581b = (EditText) findFocus;
                    }
                }
                if (lsVar.f28581b != null) {
                    try {
                        lsVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = lsVar.f28581b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = lsVar.f28581b.getText();
                    if (lsVar.f28581b.getSelectionEnd() == lsVar.f28581b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + lsVar.f28581b.getSelectionStart();
                    }
                    if (lsVar.f28581b.getSelectionStart() != -1 && lsVar.f28581b.getSelectionEnd() != -1) {
                        EditText editText2 = lsVar.f28581b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), lsVar.f28581b.getSelectionEnd(), str));
                        EditText editText3 = lsVar.f28581b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        lsVar.f28581b.setText(str);
                        EditText editText4 = lsVar.f28581b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = lsVar.f28581b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.vs vsVar2 = (org.telegram.ui.Components.vs) obj2;
                org.telegram.ui.Components.us usVar = (org.telegram.ui.Components.us) obj;
                vsVar2.K();
                usVar.f31605f = !usVar.f31605f;
                usVar.f31608j.X.N(true);
                vsVar2.u();
                return;
            default:
                ((org.telegram.ui.Components.vs) obj2).B0 = !vsVar.B0;
                ((org.telegram.ui.Components.c71) obj).N(true);
                return;
        }
    }

    public sf(org.telegram.ui.Components.cq cqVar, zn znVar) {
        this.f41684a = 25;
        this.f41686c = cqVar;
        this.f41685b = znVar;
    }
}
