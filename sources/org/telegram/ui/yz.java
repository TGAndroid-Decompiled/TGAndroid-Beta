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
public final class yz implements View.OnClickListener {
    public final int f42436a;
    public final f00 f42437b;

    public yz(f00 f00Var, int i10) {
        this.f42436a = i10;
        this.f42437b = f00Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42436a) {
            case 0:
                f00 f00Var = this.f42437b;
                String str = f00Var.f34006s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.yh.o(R.string.LinkCopied, org.telegram.ui.Components.zc.a0(f00Var.f34005r));
                    return;
                }
                return;
            case 1:
                f00 f00Var2 = this.f42437b;
                FrameLayout frameLayout = f00Var2.f34000a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    f00Var2.postDelayed(new zz(f00Var2, 0), 180L);
                }
                float[] fArr = f00Var2.f34009y;
                if (f00Var2.f34008x == null && f00Var2.f34006s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(f00Var2.getContext(), null);
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(f00Var2.getContext(), true, false);
                    e1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.a6.n(-1, 48));
                    e1Var.setOnClickListener(new yz(f00Var2, 4));
                    org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(f00Var2.getContext(), false, false);
                    e1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.a6.n(-1, 48));
                    e1Var2.setOnClickListener(new yz(f00Var2, 5));
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(f00Var2.getContext(), false, true);
                    e1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.g6.f20122p7;
                    e1Var3.c(org.telegram.ui.ActionBar.g6.x0(null, i10, false), org.telegram.ui.ActionBar.g6.x0(null, i10, false));
                    e1Var3.setSelectorColor(org.telegram.ui.ActionBar.g6.m1(0.12f, org.telegram.ui.ActionBar.g6.x0(null, i10, false)));
                    e1Var3.setOnClickListener(new yz(f00Var2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.a6.n(-1, 48));
                    FrameLayout overlayContainerView = f00Var2.f34005r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        a00.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        di.p6 p6Var = new di.p6(f00Var2, f00Var2.getContext(), overlayContainerView, 9);
                        ii iiVar = new ii(p6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(iiVar);
                        overlayContainerView.addView(p6Var, w7.a6.d(-1.0f, -1));
                        float f10 = 0.0f;
                        p6Var.setAlpha(0.0f);
                        p6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        f00Var2.f34008x = m1Var;
                        m1Var.setOnDismissListener(new org.telegram.ui.Components.s90(f00Var2, p6Var, overlayContainerView, iiVar, 1));
                        f00Var2.f34008x.setOutsideTouchable(true);
                        f00Var2.f34008x.setFocusable(true);
                        f00Var2.f34008x.setBackgroundDrawable(new ColorDrawable(0));
                        f00Var2.f34008x.setAnimationStyle(R.style.PopupContextAnimation);
                        f00Var2.f34008x.setInputMethodMode(2);
                        f00Var2.f34008x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new mu(f00Var2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        f00Var2.f34008x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                f00 f00Var3 = this.f42437b;
                String str2 = f00Var3.f34006s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.yh.o(R.string.LinkCopied, org.telegram.ui.Components.zc.a0(f00Var3.f34005r));
                    return;
                }
                return;
            case 3:
                f00 f00Var4 = this.f42437b;
                if (f00Var4.f34006s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", f00Var4.f34006s);
                        f00Var4.f34005r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                f00 f00Var5 = this.f42437b;
                org.telegram.ui.ActionBar.m1 m1Var2 = f00Var5.f34008x;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                }
                h00 h00Var = f00Var5.E.f36267c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = h00Var.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(f00Var5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.T(f00Var5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f00Var5.getContext());
                    alertDialog$Builder.f19548a.I = org.telegram.ui.ActionBar.g6.H5;
                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new b00(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(f00Var5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.g6.f20007j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(h00Var.f36568c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20196t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.a6.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new c00(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new e00(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new f7(f00Var5, editTextBoldCursor, alertDialog$Builder, 13));
                    oq oqVar = new oq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                    a2Var.setOnShowListener(oqVar);
                    a2Var.setOnDismissListener(new d00(0, editTextBoldCursor));
                    a2Var.show();
                    a2Var.o(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                f00 f00Var6 = this.f42437b;
                org.telegram.ui.ActionBar.m1 m1Var3 = f00Var6.f34008x;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                if (f00Var6.f34006s != null) {
                    org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(f00Var6.getContext(), LocaleController.getString(R.string.InviteByQRCode), f00Var6.f34006s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    kj0Var.n(R.raw.qr_code_logo);
                    kj0Var.show();
                    return;
                }
                return;
            default:
                f00 f00Var7 = this.f42437b;
                org.telegram.ui.ActionBar.m1 m1Var4 = f00Var7.f34008x;
                if (m1Var4 != null) {
                    m1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                h00 h00Var2 = f00Var7.E.f36267c;
                tL_inputChatlistDialogFilter.filter_id = h00Var2.f36568c.f16708id;
                tL_chatlists_deleteExportedInvite.slug = h00Var2.b0();
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(f00Var7.getContext(), 3, null);
                a2Var2.q(180L);
                h00Var2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new to(19, f00Var7, a2Var2));
                return;
        }
    }
}
