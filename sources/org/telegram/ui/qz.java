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
    public final int f40717a;
    public final xz f40718b;

    public qz(xz xzVar, int i10) {
        this.f40717a = i10;
        this.f40718b = xzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40717a) {
            case 0:
                xz xzVar = this.f40718b;
                String str = xzVar.f41339s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    b.m(R.string.LinkCopied, org.telegram.ui.Components.qc.a0(xzVar.f41338r));
                    return;
                }
                return;
            case 1:
                xz xzVar2 = this.f40718b;
                FrameLayout frameLayout = xzVar2.f41332a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    xzVar2.postDelayed(new zi(xzVar2, 29), 180L);
                }
                float[] fArr = xzVar2.f41342y;
                if (xzVar2.f41341x == null && xzVar2.f41339s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(xzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(xzVar2.getContext(), true, false);
                    g1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, k7.c6.n(-1, 48));
                    g1Var.setOnClickListener(new qz(xzVar2, 4));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(xzVar2.getContext(), false, false);
                    g1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, k7.c6.n(-1, 48));
                    g1Var2.setOnClickListener(new qz(xzVar2, 5));
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(xzVar2.getContext(), false, true);
                    g1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.k6.f21878p7;
                    g1Var3.c(org.telegram.ui.ActionBar.k6.w0(null, i10, false), org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                    g1Var3.setSelectorColor(org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
                    g1Var3.setOnClickListener(new qz(xzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, k7.c6.n(-1, 48));
                    FrameLayout overlayContainerView = xzVar2.f41338r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        sz.a(frameLayout, overlayContainerView, fArr);
                        float f10 = fArr[1];
                        fg.i0 i0Var = new fg.i0(xzVar2, xzVar2.getContext(), overlayContainerView, 8);
                        ai aiVar = new ai(i0Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(aiVar);
                        overlayContainerView.addView(i0Var, k7.c6.c(-1.0f, -1));
                        float f11 = 0.0f;
                        i0Var.setAlpha(0.0f);
                        i0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        xzVar2.f41341x = p1Var;
                        p1Var.setOnDismissListener(new org.telegram.ui.Components.u80(xzVar2, i0Var, overlayContainerView, aiVar, 1));
                        xzVar2.f41341x.setOutsideTouchable(true);
                        xzVar2.f41341x.setFocusable(true);
                        xzVar2.f41341x.setBackgroundDrawable(new ColorDrawable(0));
                        xzVar2.f41341x.setAnimationStyle(R.style.PopupContextAnimation);
                        xzVar2.f41341x.setInputMethodMode(2);
                        xzVar2.f41341x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new gu(xzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f10 += overlayContainerView.getPaddingTop();
                            f11 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        xzVar2.f41341x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f11), (int) (overlayContainerView.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                xz xzVar3 = this.f40718b;
                String str2 = xzVar3.f41339s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    b.m(R.string.LinkCopied, org.telegram.ui.Components.qc.a0(xzVar3.f41338r));
                    return;
                }
                return;
            case 3:
                xz xzVar4 = this.f40718b;
                if (xzVar4.f41339s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", xzVar4.f41339s);
                        xzVar4.f41338r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                return;
            case 4:
                xz xzVar5 = this.f40718b;
                org.telegram.ui.ActionBar.p1 p1Var2 = xzVar5.f41341x;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                }
                zz zzVar = xzVar5.B.f43740c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = zzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(xzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.S(xzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xzVar5.getContext());
                    alertDialog$Builder.f21168a.F = org.telegram.ui.ActionBar.k6.H5;
                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(xzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.k6.f21768j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(zzVar.f44050c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21946t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, k7.c6.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new uz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new wz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new d7(xzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    fq fqVar = new fq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.setOnShowListener(fqVar);
                    d2Var.setOnDismissListener(new vz(0, editTextBoldCursor));
                    d2Var.show();
                    d2Var.o(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                xz xzVar6 = this.f40718b;
                org.telegram.ui.ActionBar.p1 p1Var3 = xzVar6.f41341x;
                if (p1Var3 != null) {
                    p1Var3.d(true);
                }
                if (xzVar6.f41339s != null) {
                    org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(xzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), xzVar6.f41339s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    si0Var.m(R.raw.qr_code_logo);
                    si0Var.show();
                    return;
                }
                return;
            default:
                xz xzVar7 = this.f40718b;
                org.telegram.ui.ActionBar.p1 p1Var4 = xzVar7.f41341x;
                if (p1Var4 != null) {
                    p1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                zz zzVar2 = xzVar7.B.f43740c;
                tL_inputChatlistDialogFilter.filter_id = zzVar2.f44050c.f18057id;
                tL_chatlists_deleteExportedInvite.slug = zzVar2.b0();
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(xzVar7.getContext(), 3, null);
                d2Var2.q(180L);
                zzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new lo(19, xzVar7, d2Var2));
                return;
        }
    }
}
