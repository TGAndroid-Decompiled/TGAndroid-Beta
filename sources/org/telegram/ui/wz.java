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
public final class wz implements View.OnClickListener {
    public final int f38542a;
    public final c00 f38543b;

    public wz(c00 c00Var, int i10) {
        this.f38542a = i10;
        this.f38543b = c00Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38542a) {
            case 0:
                c00 c00Var = this.f38543b;
                String str = c00Var.f38848s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.em.o(R.string.LinkCopied, org.telegram.ui.Components.wc.a0(c00Var.f38847r));
                    return;
                }
                return;
            case 1:
                c00 c00Var2 = this.f38543b;
                FrameLayout frameLayout = c00Var2.f38842a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    c00Var2.postDelayed(new fj(c00Var2, 29), 180L);
                }
                float[] fArr = c00Var2.f38851y;
                if (c00Var2.f38850x == null && c00Var2.f38848s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(c00Var2.getContext(), null);
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(c00Var2.getContext(), true, false);
                    g1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var, w7.a6.n(-1, 48));
                    g1Var.setOnClickListener(new wz(c00Var2, 4));
                    org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(c00Var2.getContext(), false, false);
                    g1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var2, w7.a6.n(-1, 48));
                    g1Var2.setOnClickListener(new wz(c00Var2, 5));
                    org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(c00Var2.getContext(), false, true);
                    g1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.j6.f18144p7;
                    g1Var3.c(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    g1Var3.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
                    g1Var3.setOnClickListener(new wz(c00Var2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(g1Var3, w7.a6.n(-1, 48));
                    FrameLayout overlayContainerView = c00Var2.f38847r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        xz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        bi.s7 s7Var = new bi.s7(c00Var2, c00Var2.getContext(), overlayContainerView, 9);
                        gi giVar = new gi(s7Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(giVar);
                        overlayContainerView.addView(s7Var, w7.a6.c(-1.0f, -1));
                        float f10 = 0.0f;
                        s7Var.setAlpha(0.0f);
                        s7Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        c00Var2.f38850x = p1Var;
                        p1Var.setOnDismissListener(new org.telegram.ui.Components.b90(c00Var2, s7Var, overlayContainerView, giVar, 1));
                        c00Var2.f38850x.setOutsideTouchable(true);
                        c00Var2.f38850x.setFocusable(true);
                        c00Var2.f38850x.setBackgroundDrawable(new ColorDrawable(0));
                        c00Var2.f38850x.setAnimationStyle(R.style.PopupContextAnimation);
                        c00Var2.f38850x.setInputMethodMode(2);
                        c00Var2.f38850x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new iu(c00Var2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        c00Var2.f38850x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                c00 c00Var3 = this.f38543b;
                String str2 = c00Var3.f38848s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.em.o(R.string.LinkCopied, org.telegram.ui.Components.wc.a0(c00Var3.f38847r));
                    return;
                }
                return;
            case 3:
                c00 c00Var4 = this.f38543b;
                if (c00Var4.f38848s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", c00Var4.f38848s);
                        c00Var4.f38847r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                c00 c00Var5 = this.f38543b;
                org.telegram.ui.ActionBar.p1 p1Var2 = c00Var5.f38850x;
                if (p1Var2 != null) {
                    p1Var2.d(true);
                }
                e00 e00Var = c00Var5.E.f31799c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = e00Var.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(c00Var5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.S(c00Var5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c00Var5.getContext());
                    alertDialog$Builder.f17528a.I = org.telegram.ui.ActionBar.j6.H5;
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new yz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(c00Var5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(e00Var.f32004c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18217t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.a6.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new zz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new b00(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new a7(c00Var5, editTextBoldCursor, alertDialog$Builder, 13));
                    mq mqVar = new mq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                    d2Var.setOnShowListener(mqVar);
                    d2Var.setOnDismissListener(new a00(0, editTextBoldCursor));
                    d2Var.show();
                    d2Var.o(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                c00 c00Var6 = this.f38543b;
                org.telegram.ui.ActionBar.p1 p1Var3 = c00Var6.f38850x;
                if (p1Var3 != null) {
                    p1Var3.d(true);
                }
                if (c00Var6.f38848s != null) {
                    org.telegram.ui.Components.ti0 ti0Var = new org.telegram.ui.Components.ti0(c00Var6.getContext(), LocaleController.getString(R.string.InviteByQRCode), c00Var6.f38848s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    ti0Var.m(R.raw.qr_code_logo);
                    ti0Var.show();
                    return;
                }
                return;
            default:
                c00 c00Var7 = this.f38543b;
                org.telegram.ui.ActionBar.p1 p1Var4 = c00Var7.f38850x;
                if (p1Var4 != null) {
                    p1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                e00 e00Var2 = c00Var7.E.f31799c;
                tL_inputChatlistDialogFilter.filter_id = e00Var2.f32004c.f14645id;
                tL_chatlists_deleteExportedInvite.slug = e00Var2.b0();
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(c00Var7.getContext(), 3, null);
                d2Var2.q(180L);
                e00Var2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new org.telegram.ui.Components.th(14, c00Var7, d2Var2));
                return;
        }
    }
}
