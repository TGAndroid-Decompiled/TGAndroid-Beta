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
public final class xf implements View.OnClickListener {
    public final int f41555a;
    public final Object f41556b;
    public final Object f41557c;

    public xf(int i10, Object obj, Object obj2) {
        this.f41555a = i10;
        this.f41556b = obj;
        this.f41557c = obj2;
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
        org.telegram.ui.Components.ss ssVar;
        int i11 = this.f41555a;
        s4.b1 b1Var = null;
        Object obj = this.f41557c;
        Object obj2 = this.f41556b;
        switch (i11) {
            case 0:
                fo foVar = (fo) obj2;
                if (foVar.getMediaDataController().saveToRingtones(((MessageObject) obj).getDocument())) {
                    foVar.T7();
                    UndoView undoView = foVar.y3;
                    if (undoView != null) {
                        long j10 = foVar.T5;
                        int i12 = UndoView.f23047e0;
                        undoView.j(83, j10, new m4(foVar, 1));
                    }
                }
                foVar.D7(true);
                return;
            case 1:
                fo.W0((fo) obj2, (String) obj);
                return;
            case 2:
                fo.S0((fo) obj2, (org.telegram.ui.Components.l80) obj);
                return;
            case 3:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) obj2;
                boolean z10 = !a2Var.b();
                a2Var.c(z10, true);
                ((AtomicBoolean) obj).set(z10);
                return;
            case 4:
                fo.g1((fo) obj2, (Context) obj);
                return;
            case 5:
                zo zoVar = (zo) obj2;
                Context context = (Context) obj;
                org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(context, null);
                org.telegram.ui.ActionBar.e3 e3Var = z2Var.f20538a;
                e3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.g6.f19783n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString("ChatHistory", R.string.ChatHistory));
                linearLayout.addView(m4Var);
                LinearLayout e = org.telegram.messenger.sk.e(context, 1);
                linearLayout.addView(e, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.j6[] j6VarArr = new org.telegram.ui.Cells.j6[2];
                int i13 = 0;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, true);
                    j6VarArr[i13] = j6Var;
                    j6Var.setTag(Integer.valueOf(i13));
                    j6VarArr[i13].setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
                    if (i13 == 0) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryVisible", R.string.ChatHistoryVisible), LocaleController.getString("ChatHistoryVisibleInfo", R.string.ChatHistoryVisibleInfo), true, !zoVar.J0);
                    } else if (ChatObject.isChannel(zoVar.f42394x0)) {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo", R.string.ChatHistoryHiddenInfo), false, zoVar.J0);
                    } else {
                        j6VarArr[i13].b(LocaleController.getString("ChatHistoryHidden", R.string.ChatHistoryHidden), LocaleController.getString("ChatHistoryHiddenInfo2", R.string.ChatHistoryHiddenInfo2), false, zoVar.J0);
                    }
                    e.addView(j6VarArr[i13], w7.z5.n(-1, -2));
                    j6VarArr[i13].setOnClickListener(new a0(zoVar, j6VarArr, z2Var, 8));
                    i13++;
                }
                z2Var.b(linearLayout);
                zoVar.showDialog(e3Var);
                return;
            case 6:
                zo.U((zo) obj2, (FrameLayout) obj, view);
                return;
            case 7:
                tq.V((tq) obj2, (org.telegram.ui.ActionBar.z2) obj, view);
                return;
            case 8:
                new sg.y0(((org.telegram.ui.Components.e0) obj2).getContext(), 42, (org.telegram.ui.ActionBar.c6) obj).show();
                return;
            case 9:
                org.telegram.ui.Components.y.R((org.telegram.ui.Components.y) obj2, (org.telegram.ui.ActionBar.c6) obj);
                return;
            case 10:
                ((Utilities.Callback) obj2).run((TL_aicompose.AiComposeTone) obj);
                return;
            case 11:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.Components.e5 e5Var = (org.telegram.ui.Components.e5) obj;
                u0Var.M(null, null);
                u0Var.G(e5Var.d, false);
                u0Var.setupPopupRadialSelectors(e5Var.f24309f);
                u0Var.B(e5Var.e);
                return;
            case 12:
                boolean[] zArr = (boolean[]) obj2;
                boolean z11 = !zArr[0];
                zArr[0] = z11;
                ((org.telegram.ui.Cells.a2) view).c(z11, true);
                ((bi.h4) obj).run();
                return;
            case 13:
                int intValue = ((Integer) view.getTag()).intValue();
                ((AlertDialog$Builder) obj2).f19248a.L0.run();
                ((ru) obj).onClick(null, intValue);
                return;
            case 14:
                runnable = ((org.telegram.ui.ActionBar.z2) obj2).f20538a.dismissRunnable;
                runnable.run();
                ((Utilities.Callback) obj).run(null);
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                ((Runnable) obj).run();
                return;
            case 16:
                org.telegram.ui.Components.m8.G((org.telegram.ui.Components.m8) obj2, (float[]) obj);
                return;
            case 17:
                org.telegram.ui.Components.m8 m8Var = (org.telegram.ui.Components.m8) obj2;
                m8Var.getClass();
                ((org.telegram.ui.Components.l80) obj).u();
                m8Var.u0(6);
                return;
            case 18:
                org.telegram.ui.Components.sa0 sa0Var = (org.telegram.ui.Components.sa0) obj;
                org.telegram.ui.Components.m8 m8Var2 = ((org.telegram.ui.Components.d8) obj2).F;
                int i02 = org.telegram.ui.Components.m8.i0(m8Var2);
                LaunchActivity launchActivity = m8Var2.G0;
                if (MessagesController.getInstance(i02).getTotalDialogsCount() > 10 && !TextUtils.isEmpty(sa0Var.getText().toString())) {
                    String charSequence = sa0Var.getText().toString();
                    if (launchActivity.O().getLastFragment() instanceof yy) {
                        yy yyVar = (yy) launchActivity.O().getLastFragment();
                        int totalDialogsCount = yyVar.getMessagesController().getTotalDialogsCount();
                        if (!yyVar.f42041l2 && (totalDialogsCount > 10 || yyVar.K)) {
                            if (!yyVar.f42032j2) {
                                yyVar.f42101x = 3;
                                yyVar.X.f27510r.setText(charSequence);
                                yyVar.X.f27510r.setSelection(charSequence.length());
                            } else {
                                yyVar.X.f27510r.setText(charSequence);
                                yyVar.X.f27510r.setSelection(charSequence.length());
                                iy iyVar = yyVar.C0;
                                if (iyVar != null && (L = iyVar.L(3)) >= 0 && yyVar.C0.getTabsView().getCurrentTabId() != L) {
                                    yyVar.C0.getTabsView().d(L, L);
                                }
                            }
                            m8Var2.dismiss();
                            return;
                        }
                    }
                    yy yyVar2 = new yy(null);
                    yyVar2.f42050n2 = charSequence;
                    yyVar2.f42101x = 3;
                    launchActivity.q0(yyVar2, false, false);
                    m8Var2.dismiss();
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.h9 h9Var = (org.telegram.ui.Components.h9) obj2;
                ((boolean[]) obj)[0] = true;
                h9Var.J.x1(h9Var.Y);
                h9Var.S.dismiss();
                return;
            case 20:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) obj2;
                LaunchActivity launchActivity2 = (LaunchActivity) obj;
                if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.DEBUG_VERSION) {
                    if (BuildVars.isHuaweiStoreApp()) {
                        pf.d.r(launchActivity2, BuildVars.HUAWEI_STORE_URL);
                        return;
                    } else {
                        pf.d.r(launchActivity2, BuildVars.PLAYSTORE_APP_URL);
                        return;
                    }
                } else if (ApplicationLoader.applicationLoaderInstance.checkApkInstallPermissions(faVar.getContext())) {
                    TLRPC.TL_help_appUpdate tL_help_appUpdate = faVar.f24670n;
                    if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
                        if (!ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) faVar.getContext(), faVar.f24670n.document)) {
                            FileLoader.getInstance(faVar.f24672s).loadFile(faVar.f24670n.document, "update", 3, 1);
                            faVar.a(true);
                            return;
                        }
                        return;
                    } else if (tL_help_appUpdate.url != null) {
                        pf.d.r(faVar.getContext(), faVar.f24670n.url);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.Components.md mdVar = (org.telegram.ui.Components.md) obj2;
                FrameLayout frameLayout = (FrameLayout) obj;
                org.telegram.ui.Components.l80 l80Var = mdVar.X0;
                if (l80Var != null && l80Var.D()) {
                    mdVar.X0.u();
                    mdVar.X0 = null;
                    return;
                }
                mdVar.f27071d1.e(true);
                org.telegram.ui.Components.l80 F = org.telegram.ui.Components.l80.F(frameLayout, new bi.b(), mdVar.V0);
                mdVar.X0 = F;
                F.f26668s = 0;
                F.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.TimerPeriodHint));
                mdVar.X0.k();
                for (int i15 : mdVar.f27070c1) {
                    if (i15 == 0) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
                    } else if (i15 == Integer.MAX_VALUE) {
                        formatPluralString = LocaleController.getString(R.string.TimerPeriodOnce);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Seconds", i15, new Object[0]);
                    }
                    mdVar.X0.c(0, formatPluralString, new org.telegram.ui.Components.o8(mdVar, i15, 1), false);
                    if (mdVar.f27069b1 == i15) {
                        mdVar.X0.L();
                    }
                }
                mdVar.X0.Z();
                return;
            case 22:
                org.telegram.ui.Components.ql qlVar = (org.telegram.ui.Components.ql) obj2;
                org.telegram.ui.Components.sl slVar = (org.telegram.ui.Components.sl) obj;
                org.telegram.ui.Components.tl tlVar = qlVar.f28321b;
                org.telegram.ui.Components.vi viVar = tlVar.f27360b;
                fo foVar2 = (fo) viVar.f29672f0;
                if (foVar2.c()) {
                    parentActivity = tlVar.getParentActivity();
                    org.telegram.ui.Components.g5.L(parentActivity, foVar2.a(), new org.telegram.ui.Components.u2(6, qlVar, slVar), tlVar.f27359a);
                    return;
                }
                org.telegram.ui.Components.g5.Z(viVar.M1, viVar.l1() + 1, viVar.p1(), new uc(20, qlVar, slVar));
                return;
            case 23:
                org.telegram.ui.Components.io ioVar = ((org.telegram.ui.Components.go) obj2).d;
                kc1 kc1Var = ioVar.f25694s;
                View F2 = kc1Var.F((org.telegram.ui.Components.fo) obj);
                if (F2 != null) {
                    b1Var = kc1Var.T(F2);
                }
                if (b1Var != null && (b10 = b1Var.b() - ioVar.f25696t0) >= 0 && b10 < ioVar.K.length) {
                    org.telegram.ui.Components.io.R(ioVar, b10);
                    return;
                }
                return;
            case 24:
                org.telegram.ui.Components.ro roVar = (org.telegram.ui.Components.ro) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj;
                fo foVar3 = roVar.G;
                if (roVar.T) {
                    foVar3.showDialog(org.telegram.ui.Components.g5.U(roVar.getContext(), foVar3.h, c6Var).f19248a);
                    return;
                }
                org.telegram.ui.Components.no noVar = roVar.e;
                if (foVar3.getParentActivity() != null) {
                    TLRPC.Chat chat = foVar3.e;
                    if (chat != null && !ChatObject.canUserDoAdminAction(chat, 13)) {
                        if (roVar.f28586a.f16004f && foVar3.getParentActivity() != null && foVar3.fragmentView != null && foVar3.Z7 != null) {
                            if (foVar3.f35749o2 == null) {
                                org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(7, foVar3.getParentActivity(), foVar3.f35633ea, true);
                                foVar3.f35749o2 = v40Var;
                                v40Var.setAlpha(0.0f);
                                foVar3.f35749o2.setVisibility(4);
                                foVar3.f35749o2.setShowingDuration(4000L);
                                foVar3.X0.addView(foVar3.f35749o2, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
                            }
                            int i16 = foVar3.Z7.ttl_period;
                            if (i16 > 86400) {
                                formatPluralString2 = LocaleController.formatPluralString("Days", i16 / 86400, new Object[0]);
                            } else if (i16 >= 3600) {
                                formatPluralString2 = LocaleController.formatPluralString("Hours", i16 / 3600, new Object[0]);
                            } else if (i16 >= 60) {
                                formatPluralString2 = LocaleController.formatPluralString("Minutes", i16 / 60, new Object[0]);
                            } else {
                                formatPluralString2 = LocaleController.formatPluralString("Seconds", i16, new Object[0]);
                            }
                            foVar3.f35749o2.setText(LocaleController.formatString("AutoDeleteSetInfo", R.string.AutoDeleteSetInfo, formatPluralString2));
                            foVar3.f35749o2.f(foVar3.f35573a1.getTimeItem(), true);
                            return;
                        }
                        return;
                    }
                    TLRPC.ChatFull chatFull = foVar3.Z7;
                    TLRPC.UserFull userFull = foVar3.f35579a8;
                    if (userFull != null) {
                        i10 = userFull.ttl_period;
                    } else if (chatFull != null) {
                        i10 = chatFull.ttl_period;
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.s8 s8Var = new org.telegram.ui.Components.s8(roVar.getContext(), null, new org.telegram.ui.Components.oo(roVar, r4), true, 0, roVar.f28592d0);
                    s8Var.b(i10);
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = s8Var.f28761a;
                    org.telegram.ui.Components.po poVar = new org.telegram.ui.Components.po(roVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
                    org.telegram.ui.ActionBar.m1[] m1VarArr = {poVar};
                    poVar.e = true;
                    poVar.f20221c = 220;
                    poVar.setOutsideTouchable(true);
                    m1VarArr[0].setClippingEnabled(true);
                    m1VarArr[0].setAnimationStyle(R.style.PopupContextAnimation);
                    m1VarArr[0].setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                    m1VarArr[0].setInputMethodMode(2);
                    m1VarArr[0].getContentView().setFocusableInTouchMode(true);
                    m1VarArr[0].showAtLocation(noVar, 0, (int) (roVar.getX() + noVar.getX()), (int) noVar.getY());
                    foVar3.j8(false, true, 0.2f);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.zp.o((org.telegram.ui.Components.zp) obj, (fo) obj2);
                return;
            case 26:
                org.telegram.ui.Components.as.Q((org.telegram.ui.Components.as) obj2, (TLRPC.Peer) obj);
                return;
            case 27:
                org.telegram.ui.Components.is isVar = (org.telegram.ui.Components.is) obj2;
                String str = (String) obj;
                if (isVar.f25776b == null && (view2 = isVar.d) != null) {
                    View findFocus = view2.findFocus();
                    if (findFocus instanceof EditText) {
                        isVar.f25776b = (EditText) findFocus;
                    }
                }
                if (isVar.f25776b != null) {
                    try {
                        isVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    EditText editText = isVar.f25776b;
                    if (editText instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
                    }
                    Editable text = isVar.f25776b.getText();
                    if (isVar.f25776b.getSelectionEnd() == isVar.f25776b.length()) {
                        length = -1;
                    } else {
                        length = str.length() + isVar.f25776b.getSelectionStart();
                    }
                    if (isVar.f25776b.getSelectionStart() != -1 && isVar.f25776b.getSelectionEnd() != -1) {
                        EditText editText2 = isVar.f25776b;
                        editText2.setText(text.replace(editText2.getSelectionStart(), isVar.f25776b.getSelectionEnd(), str));
                        EditText editText3 = isVar.f25776b;
                        if (length == -1) {
                            length = editText3.length();
                        }
                        editText3.setSelection(length);
                    } else {
                        isVar.f25776b.setText(str);
                        EditText editText4 = isVar.f25776b;
                        editText4.setSelection(editText4.length());
                    }
                    EditText editText5 = isVar.f25776b;
                    if (editText5 instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.ss ssVar2 = (org.telegram.ui.Components.ss) obj2;
                org.telegram.ui.Components.rs rsVar = (org.telegram.ui.Components.rs) obj;
                ssVar2.K();
                rsVar.f28635f = !rsVar.f28635f;
                rsVar.f28638j.X.N(true);
                ssVar2.u();
                return;
            default:
                ((org.telegram.ui.Components.ss) obj2).B0 = !ssVar.B0;
                ((org.telegram.ui.Components.a71) obj).N(true);
                return;
        }
    }

    public xf(org.telegram.ui.Components.zp zpVar, fo foVar) {
        this.f41555a = 25;
        this.f41557c = zpVar;
        this.f41556b = foVar;
    }
}
