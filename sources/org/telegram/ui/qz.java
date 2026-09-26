package org.telegram.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qz implements View.OnClickListener {
    public final int f37144a;
    public final wz f37145b;

    public qz(wz wzVar, int i10) {
        this.f37144a = i10;
        this.f37145b = wzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37144a) {
            case 0:
                wz wzVar = this.f37145b;
                String str = wzVar.f37547s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.ok.o(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(wzVar.f37546r));
                    return;
                }
                return;
            case 1:
                wz wzVar2 = this.f37145b;
                FrameLayout frameLayout = wzVar2.f37541a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    wzVar2.postDelayed(new aj(wzVar2, 29), 180L);
                }
                float[] fArr = wzVar2.f37550y;
                if (wzVar2.f37549x == null && wzVar2.f37547s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(wzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(wzVar2.getContext(), true, false);
                    e1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.y5.n(-1, 48));
                    e1Var.setOnClickListener(new qz(wzVar2, 4));
                    org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(wzVar2.getContext(), false, false);
                    e1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.y5.n(-1, 48));
                    e1Var2.setOnClickListener(new qz(wzVar2, 5));
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(wzVar2.getContext(), false, true);
                    e1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.h6.f19279p7;
                    e1Var3.c(org.telegram.ui.ActionBar.h6.w0(null, i10, false), org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                    e1Var3.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, i10, false)));
                    e1Var3.setOnClickListener(new qz(wzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.y5.n(-1, 48));
                    FrameLayout overlayContainerView = wzVar2.f37546r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        rz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        ci.r6 r6Var = new ci.r6(wzVar2, wzVar2.getContext(), overlayContainerView, 9);
                        bi biVar = new bi(r6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(biVar);
                        overlayContainerView.addView(r6Var, w7.y5.c(-1.0f, -1));
                        float f10 = 0.0f;
                        r6Var.setAlpha(0.0f);
                        r6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        wzVar2.f37549x = m1Var;
                        m1Var.setOnDismissListener(new org.telegram.ui.Components.c90(wzVar2, r6Var, overlayContainerView, biVar, 1));
                        wzVar2.f37549x.setOutsideTouchable(true);
                        wzVar2.f37549x.setFocusable(true);
                        wzVar2.f37549x.setBackgroundDrawable(new ColorDrawable(0));
                        wzVar2.f37549x.setAnimationStyle(R.style.PopupContextAnimation);
                        wzVar2.f37549x.setInputMethodMode(2);
                        wzVar2.f37549x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new du(wzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        wzVar2.f37549x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                wz wzVar3 = this.f37145b;
                String str2 = wzVar3.f37547s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.ok.o(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(wzVar3.f37546r));
                    return;
                }
                return;
            case 3:
                wz wzVar4 = this.f37145b;
                if (wzVar4.f37547s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", wzVar4.f37547s);
                        wzVar4.f37546r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                wz wzVar5 = this.f37145b;
                org.telegram.ui.ActionBar.m1 m1Var2 = wzVar5.f37549x;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                }
                yz yzVar = wzVar5.E.f40007c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = yzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(wzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.S(wzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wzVar5.getContext());
                    alertDialog$Builder.f18661a.I = org.telegram.ui.ActionBar.h6.H5;
                    alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(wzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.h6.f19165j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(yzVar.f40286c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19353t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.y5.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new tz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new vz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new b7(wzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    fq fqVar = new fq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18661a;
                    a2Var.setOnShowListener(fqVar);
                    a2Var.setOnDismissListener(new uz(0, editTextBoldCursor));
                    a2Var.show();
                    a2Var.o(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                wz wzVar6 = this.f37145b;
                org.telegram.ui.ActionBar.m1 m1Var3 = wzVar6.f37549x;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                if (wzVar6.f37547s != null) {
                    org.telegram.ui.Components.ui0 ui0Var = new org.telegram.ui.Components.ui0(wzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), wzVar6.f37547s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    ui0Var.m(R.raw.qr_code_logo);
                    ui0Var.show();
                    return;
                }
                return;
            default:
                wz wzVar7 = this.f37145b;
                org.telegram.ui.ActionBar.m1 m1Var4 = wzVar7.f37549x;
                if (m1Var4 != null) {
                    m1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                yz yzVar2 = wzVar7.E.f40007c;
                tL_inputChatlistDialogFilter.filter_id = yzVar2.f40286c.f15832id;
                tL_chatlists_deleteExportedInvite.slug = yzVar2.b0();
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(wzVar7.getContext(), 3, null);
                a2Var2.q(180L);
                yzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new lo(19, wzVar7, a2Var2));
                return;
        }
    }
}
