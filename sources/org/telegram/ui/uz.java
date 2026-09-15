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
public final class uz implements View.OnClickListener {
    public final int f38319a;
    public final a00 f38320b;

    public uz(a00 a00Var, int i10) {
        this.f38319a = i10;
        this.f38320b = a00Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38319a) {
            case 0:
                a00 a00Var = this.f38320b;
                String str = a00Var.f38718s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.wl.o(R.string.LinkCopied, org.telegram.ui.Components.vc.a0(a00Var.f38717r));
                    return;
                }
                return;
            case 1:
                a00 a00Var2 = this.f38320b;
                FrameLayout frameLayout = a00Var2.f38712a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    a00Var2.postDelayed(new dj(a00Var2, 29), 180L);
                }
                float[] fArr = a00Var2.f38721y;
                if (a00Var2.f38720x == null && a00Var2.f38718s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(a00Var2.getContext(), null);
                    org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(a00Var2.getContext(), true, false);
                    f1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var, w7.x5.n(-1, 48));
                    f1Var.setOnClickListener(new uz(a00Var2, 4));
                    org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(a00Var2.getContext(), false, false);
                    f1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var2, w7.x5.n(-1, 48));
                    f1Var2.setOnClickListener(new uz(a00Var2, 5));
                    org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(a00Var2.getContext(), false, true);
                    f1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.i6.f19056p7;
                    f1Var3.c(org.telegram.ui.ActionBar.i6.w0(null, i10, false), org.telegram.ui.ActionBar.i6.w0(null, i10, false));
                    f1Var3.setSelectorColor(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, i10, false)));
                    f1Var3.setOnClickListener(new uz(a00Var2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(f1Var3, w7.x5.n(-1, 48));
                    FrameLayout overlayContainerView = a00Var2.f38717r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        vz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        ci.s6 s6Var = new ci.s6(a00Var2, a00Var2.getContext(), overlayContainerView, 9);
                        ei eiVar = new ei(s6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(eiVar);
                        overlayContainerView.addView(s6Var, w7.x5.c(-1.0f, -1));
                        float f10 = 0.0f;
                        s6Var.setAlpha(0.0f);
                        s6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        a00Var2.f38720x = n1Var;
                        n1Var.setOnDismissListener(new org.telegram.ui.Components.r80(a00Var2, s6Var, overlayContainerView, eiVar, 1));
                        a00Var2.f38720x.setOutsideTouchable(true);
                        a00Var2.f38720x.setFocusable(true);
                        a00Var2.f38720x.setBackgroundDrawable(new ColorDrawable(0));
                        a00Var2.f38720x.setAnimationStyle(R.style.PopupContextAnimation);
                        a00Var2.f38720x.setInputMethodMode(2);
                        a00Var2.f38720x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new hu(a00Var2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        a00Var2.f38720x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                a00 a00Var3 = this.f38320b;
                String str2 = a00Var3.f38718s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.wl.o(R.string.LinkCopied, org.telegram.ui.Components.vc.a0(a00Var3.f38717r));
                    return;
                }
                return;
            case 3:
                a00 a00Var4 = this.f38320b;
                if (a00Var4.f38718s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", a00Var4.f38718s);
                        a00Var4.f38717r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 4:
                a00 a00Var5 = this.f38320b;
                org.telegram.ui.ActionBar.n1 n1Var2 = a00Var5.f38720x;
                if (n1Var2 != null) {
                    n1Var2.d(true);
                }
                c00 c00Var = a00Var5.E.f32015c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = c00Var.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(a00Var5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.S(a00Var5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a00Var5.getContext());
                    alertDialog$Builder.f18437a.I = org.telegram.ui.ActionBar.i6.H5;
                    alertDialog$Builder.f18437a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(a00Var5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.i6.f18943j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(c00Var.f32608c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19129t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new xz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new zz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new b7(a00Var5, editTextBoldCursor, alertDialog$Builder, 13));
                    kq kqVar = new kq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
                    b2Var.setOnShowListener(kqVar);
                    b2Var.setOnDismissListener(new yz(0, editTextBoldCursor));
                    b2Var.show();
                    b2Var.o(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                a00 a00Var6 = this.f38320b;
                org.telegram.ui.ActionBar.n1 n1Var3 = a00Var6.f38720x;
                if (n1Var3 != null) {
                    n1Var3.d(true);
                }
                if (a00Var6.f38718s != null) {
                    org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(a00Var6.getContext(), LocaleController.getString(R.string.InviteByQRCode), a00Var6.f38718s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    ji0Var.m(R.raw.qr_code_logo);
                    ji0Var.show();
                    return;
                }
                return;
            default:
                a00 a00Var7 = this.f38320b;
                org.telegram.ui.ActionBar.n1 n1Var4 = a00Var7.f38720x;
                if (n1Var4 != null) {
                    n1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                c00 c00Var2 = a00Var7.E.f32015c;
                tL_inputChatlistDialogFilter.filter_id = c00Var2.f32608c.f15603id;
                tL_chatlists_deleteExportedInvite.slug = c00Var2.b0();
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(a00Var7.getContext(), 3, null);
                b2Var2.q(180L);
                c00Var2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new qo(19, a00Var7, b2Var2));
                return;
        }
    }
}
