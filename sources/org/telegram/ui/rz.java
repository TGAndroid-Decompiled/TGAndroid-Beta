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
    public final int f37089a;
    public final xz f37090b;

    public rz(xz xzVar, int i10) {
        this.f37089a = i10;
        this.f37090b = xzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37089a) {
            case 0:
                xz xzVar = this.f37090b;
                String str = xzVar.f37470s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.ul.p(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(xzVar.f37469r));
                    return;
                }
                return;
            case 1:
                xz xzVar2 = this.f37090b;
                FrameLayout frameLayout = xzVar2.f37464a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    xzVar2.postDelayed(new aj(xzVar2, 29), 180L);
                }
                float[] fArr = xzVar2.f37473y;
                if (xzVar2.f37472x == null && xzVar2.f37470s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(xzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(xzVar2.getContext(), true, false);
                    f1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.x5.n(-1, 48));
                    f1Var.setOnClickListener(new rz(xzVar2, 4));
                    org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(xzVar2.getContext(), false, false);
                    f1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.x5.n(-1, 48));
                    f1Var2.setOnClickListener(new rz(xzVar2, 5));
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(xzVar2.getContext(), false, true);
                    f1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.h6.f19008p7;
                    f1Var3.c(org.telegram.ui.ActionBar.h6.w0(null, i10, false), org.telegram.ui.ActionBar.h6.w0(null, i10, false));
                    f1Var3.setSelectorColor(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, i10, false)));
                    f1Var3.setOnClickListener(new rz(xzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var3, w7.x5.n(-1, 48));
                    FrameLayout overlayContainerView = xzVar2.f37469r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        sz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        ci.r6 r6Var = new ci.r6(xzVar2, xzVar2.getContext(), overlayContainerView, 9);
                        bi biVar = new bi(r6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(biVar);
                        overlayContainerView.addView(r6Var, w7.x5.c(-1.0f, -1));
                        float f10 = 0.0f;
                        r6Var.setAlpha(0.0f);
                        r6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        xzVar2.f37472x = n1Var;
                        n1Var.setOnDismissListener(new org.telegram.ui.Components.s80(xzVar2, r6Var, overlayContainerView, biVar, 1));
                        xzVar2.f37472x.setOutsideTouchable(true);
                        xzVar2.f37472x.setFocusable(true);
                        xzVar2.f37472x.setBackgroundDrawable(new ColorDrawable(0));
                        xzVar2.f37472x.setAnimationStyle(R.style.PopupContextAnimation);
                        xzVar2.f37472x.setInputMethodMode(2);
                        xzVar2.f37472x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new eu(xzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        xzVar2.f37472x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                xz xzVar3 = this.f37090b;
                String str2 = xzVar3.f37470s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.ul.p(R.string.LinkCopied, org.telegram.ui.Components.xc.a0(xzVar3.f37469r));
                    return;
                }
                return;
            case 3:
                xz xzVar4 = this.f37090b;
                if (xzVar4.f37470s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", xzVar4.f37470s);
                        xzVar4.f37469r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                xz xzVar5 = this.f37090b;
                org.telegram.ui.ActionBar.n1 n1Var2 = xzVar5.f37472x;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                }
                zz zzVar = xzVar5.E.f39915c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = zzVar.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(xzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.S(xzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xzVar5.getContext());
                    alertDialog$Builder.f18409a.I = org.telegram.ui.ActionBar.h6.H5;
                    alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(xzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.h6.f18895j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(zzVar.f40282c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19081t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new uz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new wz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new b7(xzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    gq gqVar = new gq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18409a;
                    b2Var.setOnShowListener(gqVar);
                    b2Var.setOnDismissListener(new vz(0, editTextBoldCursor));
                    b2Var.show();
                    b2Var.o(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                xz xzVar6 = this.f37090b;
                org.telegram.ui.ActionBar.n1 n1Var3 = xzVar6.f37472x;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                if (xzVar6.f37470s != null) {
                    org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(xzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), xzVar6.f37470s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    ki0Var.m(R.raw.qr_code_logo);
                    ki0Var.show();
                    return;
                }
                return;
            default:
                xz xzVar7 = this.f37090b;
                org.telegram.ui.ActionBar.n1 n1Var4 = xzVar7.f37472x;
                if (n1Var4 != null) {
                    n1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                zz zzVar2 = xzVar7.E.f39915c;
                tL_inputChatlistDialogFilter.filter_id = zzVar2.f40282c.f15577id;
                tL_chatlists_deleteExportedInvite.slug = zzVar2.b0();
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(xzVar7.getContext(), 3, null);
                b2Var2.q(180L);
                zzVar2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new mo(19, xzVar7, b2Var2));
                return;
        }
    }
}
