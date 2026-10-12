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
public final class vz implements View.OnClickListener {
    public final int f43015a;
    public final c00 f43016b;

    public vz(c00 c00Var, int i10) {
        this.f43015a = i10;
        this.f43016b = c00Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43015a) {
            case 0:
                c00 c00Var = this.f43016b;
                String str = c00Var.f44215s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.am.p(R.string.LinkCopied, org.telegram.ui.Components.zc.a0(c00Var.f44214r));
                    return;
                }
                return;
            case 1:
                c00 c00Var2 = this.f43016b;
                FrameLayout frameLayout = c00Var2.f44208a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    c00Var2.postDelayed(new wz(c00Var2, 0), 180L);
                }
                float[] fArr = c00Var2.f44218y;
                if (c00Var2.f44217x == null && c00Var2.f44215s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(c00Var2.getContext(), null);
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(c00Var2.getContext(), true, false);
                    e1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.w5.n(-1, 48));
                    e1Var.setOnClickListener(new vz(c00Var2, 4));
                    org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(c00Var2.getContext(), false, false);
                    e1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.w5.n(-1, 48));
                    e1Var2.setOnClickListener(new vz(c00Var2, 5));
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(c00Var2.getContext(), false, true);
                    e1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.h6.f20781p7;
                    e1Var3.c(org.telegram.ui.ActionBar.h6.x0(null, i10, false), org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    e1Var3.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i10, false)));
                    e1Var3.setOnClickListener(new vz(c00Var2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.w5.n(-1, 48));
                    FrameLayout overlayContainerView = c00Var2.f44214r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        xz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        ci.r6 r6Var = new ci.r6(c00Var2, c00Var2.getContext(), overlayContainerView, 9);
                        ii iiVar = new ii(r6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(iiVar);
                        overlayContainerView.addView(r6Var, w7.w5.d(-1.0f, -1));
                        float f10 = 0.0f;
                        r6Var.setAlpha(0.0f);
                        r6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        c00Var2.f44217x = m1Var;
                        m1Var.setOnDismissListener(new org.telegram.ui.Components.x90(c00Var2, r6Var, overlayContainerView, iiVar, 1));
                        c00Var2.f44217x.setOutsideTouchable(true);
                        c00Var2.f44217x.setFocusable(true);
                        c00Var2.f44217x.setBackgroundDrawable(new ColorDrawable(0));
                        c00Var2.f44217x.setAnimationStyle(R.style.PopupContextAnimation);
                        c00Var2.f44217x.setInputMethodMode(2);
                        c00Var2.f44217x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new ju(c00Var2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        c00Var2.f44217x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                c00 c00Var3 = this.f43016b;
                String str2 = c00Var3.f44215s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.am.p(R.string.LinkCopied, org.telegram.ui.Components.zc.a0(c00Var3.f44214r));
                    return;
                }
                return;
            case 3:
                c00 c00Var4 = this.f43016b;
                if (c00Var4.f44215s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", c00Var4.f44215s);
                        c00Var4.f44214r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 4:
                c00 c00Var5 = this.f43016b;
                org.telegram.ui.ActionBar.m1 m1Var2 = c00Var5.f44217x;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                }
                e00 e00Var = c00Var5.E.f36591c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = e00Var.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(c00Var5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.T(c00Var5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c00Var5.getContext());
                    alertDialog$Builder.f20142a.I = org.telegram.ui.ActionBar.h6.H5;
                    alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new yz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(c00Var5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.h6.f20668j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(e00Var.f36947c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20856t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.w5.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new zz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new b00(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new d7(c00Var5, editTextBoldCursor, alertDialog$Builder, 13));
                    lq lqVar = new lq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                    a2Var.setOnShowListener(lqVar);
                    a2Var.setOnDismissListener(new a00(0, editTextBoldCursor));
                    a2Var.show();
                    a2Var.o(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                c00 c00Var6 = this.f43016b;
                org.telegram.ui.ActionBar.m1 m1Var3 = c00Var6.f44217x;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                if (c00Var6.f44215s != null) {
                    org.telegram.ui.Components.rj0 rj0Var = new org.telegram.ui.Components.rj0(c00Var6.getContext(), LocaleController.getString(R.string.InviteByQRCode), c00Var6.f44215s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    rj0Var.o(R.raw.qr_code_logo);
                    rj0Var.show();
                    return;
                }
                return;
            default:
                c00 c00Var7 = this.f43016b;
                org.telegram.ui.ActionBar.m1 m1Var4 = c00Var7.f44217x;
                if (m1Var4 != null) {
                    m1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                e00 e00Var2 = c00Var7.E.f36591c;
                tL_inputChatlistDialogFilter.filter_id = e00Var2.f36947c.f17004id;
                tL_chatlists_deleteExportedInvite.slug = e00Var2.b0();
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(c00Var7.getContext(), 3, null);
                a2Var2.q(180L);
                e00Var2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new so(19, c00Var7, a2Var2));
                return;
        }
    }
}
