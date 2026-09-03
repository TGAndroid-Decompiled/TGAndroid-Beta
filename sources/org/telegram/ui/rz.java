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
public final class rz implements View.OnClickListener {
    public final int f38077a;
    public final yz f38078b;

    public rz(yz yzVar, int i10) {
        this.f38077a = i10;
        this.f38078b = yzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38077a) {
            case 0:
                yz yzVar = this.f38078b;
                String str = yzVar.f38620s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    b.m(R.string.LinkCopied, org.telegram.ui.Components.qc.a0(yzVar.f38619r));
                    return;
                }
                return;
            case 1:
                yz yzVar2 = this.f38078b;
                FrameLayout frameLayout = yzVar2.f38614a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    yzVar2.postDelayed(new bj(yzVar2, 29), 180L);
                }
                float[] fArr = yzVar2.f38623y;
                if (yzVar2.f38622x == null && yzVar2.f38620s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(yzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(yzVar2.getContext(), true, false);
                    g1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, k7.b6.n(-1, 48));
                    g1Var.setOnClickListener(new rz(yzVar2, 4));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(yzVar2.getContext(), false, false);
                    g1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, k7.b6.n(-1, 48));
                    g1Var2.setOnClickListener(new rz(yzVar2, 5));
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(yzVar2.getContext(), false, true);
                    g1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.j6.f20097p7;
                    g1Var3.c(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    g1Var3.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
                    g1Var3.setOnClickListener(new rz(yzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, k7.b6.n(-1, 48));
                    FrameLayout overlayContainerView = yzVar2.f38619r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        tz.a(frameLayout, overlayContainerView, fArr);
                        float f10 = fArr[1];
                        eg.i0 i0Var = new eg.i0(yzVar2, yzVar2.getContext(), overlayContainerView, 8);
                        ci ciVar = new ci(i0Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(ciVar);
                        overlayContainerView.addView(i0Var, k7.b6.c(-1.0f, -1));
                        float f11 = 0.0f;
                        i0Var.setAlpha(0.0f);
                        i0Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        yzVar2.f38622x = p1Var;
                        p1Var.setOnDismissListener(new org.telegram.ui.Components.t80(yzVar2, i0Var, overlayContainerView, ciVar, 1));
                        yzVar2.f38622x.setOutsideTouchable(true);
                        yzVar2.f38622x.setFocusable(true);
                        yzVar2.f38622x.setBackgroundDrawable(new ColorDrawable(0));
                        yzVar2.f38622x.setAnimationStyle(R.style.PopupContextAnimation);
                        yzVar2.f38622x.setInputMethodMode(2);
                        yzVar2.f38622x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new hu(yzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f10 += overlayContainerView.getPaddingTop();
                            f11 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        yzVar2.f38622x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f11), (int) (overlayContainerView.getY() + f10 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                yz yzVar3 = this.f38078b;
                String str2 = yzVar3.f38620s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    b.m(R.string.LinkCopied, org.telegram.ui.Components.qc.a0(yzVar3.f38619r));
                    return;
                }
                return;
            case 3:
                yz yzVar4 = this.f38078b;
                if (yzVar4.f38620s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", yzVar4.f38620s);
                        yzVar4.f38619r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                yz yzVar5 = this.f38078b;
                org.telegram.ui.ActionBar.p1 p1Var2 = yzVar5.f38622x;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                }
                a00 a00Var = yzVar5.B.f40905c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = a00Var.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(yzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.S(yzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yzVar5.getContext());
                    alertDialog$Builder.f19478a.F = org.telegram.ui.ActionBar.j6.H5;
                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new uz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(yzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.j6.f19987j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(a00Var.f32400c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20165t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, k7.b6.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new vz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new xz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new f7(yzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    gq gqVar = new gq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    d2Var.setOnShowListener(gqVar);
                    d2Var.setOnDismissListener(new wz(0, editTextBoldCursor));
                    d2Var.show();
                    d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                yz yzVar6 = this.f38078b;
                org.telegram.ui.ActionBar.p1 p1Var3 = yzVar6.f38622x;
                if (p1Var3 != null) {
                    p1Var3.d(true);
                }
                if (yzVar6.f38620s != null) {
                    org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(yzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), yzVar6.f38620s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    ri0Var.m(R.raw.qr_code_logo);
                    ri0Var.show();
                    return;
                }
                return;
            default:
                yz yzVar7 = this.f38078b;
                org.telegram.ui.ActionBar.p1 p1Var4 = yzVar7.f38622x;
                if (p1Var4 != null) {
                    p1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                a00 a00Var2 = yzVar7.B.f40905c;
                tL_inputChatlistDialogFilter.filter_id = a00Var2.f32400c.f16649id;
                tL_chatlists_deleteExportedInvite.slug = a00Var2.b0();
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(yzVar7.getContext(), 3, null);
                d2Var2.q(180L);
                a00Var2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new no(19, yzVar7, d2Var2));
                return;
        }
    }
}
