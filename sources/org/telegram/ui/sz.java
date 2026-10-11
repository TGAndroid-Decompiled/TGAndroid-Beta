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
public final class sz implements View.OnClickListener {
    public final int f42051a;
    public final zz f42052b;

    public sz(zz zzVar, int i10) {
        this.f42051a = i10;
        this.f42052b = zzVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42051a) {
            case 0:
                zz zzVar = this.f42052b;
                String str = zzVar.f42839s;
                if (str != null) {
                    AndroidUtilities.addToClipboard(str);
                    org.telegram.messenger.ai.p(R.string.LinkCopied, org.telegram.ui.Components.ad.a0(zzVar.f42838r));
                    return;
                }
                return;
            case 1:
                zz zzVar2 = this.f42052b;
                FrameLayout frameLayout = zzVar2.f42832a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    zzVar2.postDelayed(new tz(zzVar2, 0), 180L);
                }
                float[] fArr = zzVar2.f42842y;
                if (zzVar2.f42841x == null && zzVar2.f42839s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(zzVar2.getContext(), null);
                    org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(zzVar2.getContext(), true, false);
                    e1Var.g(LocaleController.getString(R.string.EditName), R.drawable.msg_edit, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, w7.x5.n(-1, 48));
                    e1Var.setOnClickListener(new sz(zzVar2, 4));
                    org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(zzVar2.getContext(), false, false);
                    e1Var2.g(LocaleController.getString(R.string.GetQRCode), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var2, w7.x5.n(-1, 48));
                    e1Var2.setOnClickListener(new sz(zzVar2, 5));
                    org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(zzVar2.getContext(), false, true);
                    e1Var3.g(LocaleController.getString(R.string.DeleteLink), R.drawable.msg_delete, null);
                    int i10 = org.telegram.ui.ActionBar.h6.f21043p7;
                    e1Var3.c(org.telegram.ui.ActionBar.h6.x0(null, i10, false), org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    e1Var3.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i10, false)));
                    e1Var3.setOnClickListener(new sz(zzVar2, 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var3, w7.x5.n(-1, 48));
                    FrameLayout overlayContainerView = zzVar2.f42838r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        uz.a(frameLayout, overlayContainerView, fArr);
                        float f7 = fArr[1];
                        ci.r6 r6Var = new ci.r6(zzVar2, zzVar2.getContext(), overlayContainerView, 9);
                        ei eiVar = new ei(r6Var, 1);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(eiVar);
                        overlayContainerView.addView(r6Var, w7.x5.d(-1.0f, -1));
                        float f10 = 0.0f;
                        r6Var.setAlpha(0.0f);
                        r6Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        zzVar2.f42841x = m1Var;
                        m1Var.setOnDismissListener(new org.telegram.ui.Components.t90(zzVar2, r6Var, overlayContainerView, eiVar, 1));
                        zzVar2.f42841x.setOutsideTouchable(true);
                        zzVar2.f42841x.setFocusable(true);
                        zzVar2.f42841x.setBackgroundDrawable(new ColorDrawable(0));
                        zzVar2.f42841x.setAnimationStyle(R.style.PopupContextAnimation);
                        zzVar2.f42841x.setInputMethodMode(2);
                        zzVar2.f42841x.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new fu(zzVar2, 8));
                        if (AndroidUtilities.isTablet()) {
                            f7 += overlayContainerView.getPaddingTop();
                            f10 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        zzVar2.f42841x.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - AndroidUtilities.dp(16.0f)) + f10), (int) (overlayContainerView.getY() + f7 + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                zz zzVar3 = this.f42052b;
                String str2 = zzVar3.f42839s;
                if (str2 != null) {
                    AndroidUtilities.addToClipboard(str2);
                    org.telegram.messenger.ai.p(R.string.LinkCopied, org.telegram.ui.Components.ad.a0(zzVar3.f42838r));
                    return;
                }
                return;
            case 3:
                zz zzVar4 = this.f42052b;
                if (zzVar4.f42839s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", zzVar4.f42839s);
                        zzVar4.f42838r.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 4:
                zz zzVar5 = this.f42052b;
                org.telegram.ui.ActionBar.m1 m1Var2 = zzVar5.f42841x;
                if (m1Var2 != null) {
                    m1Var2.d(true);
                }
                b00 b00Var = zzVar5.E.f35861c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = b00Var.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(zzVar5.getContext());
                    editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.T(zzVar5.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zzVar5.getContext());
                    alertDialog$Builder.f20404a.I = org.telegram.ui.ActionBar.h6.H5;
                    alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.FilterInviteEditName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new vz(0, editTextBoldCursor));
                    LinearLayout linearLayout = new LinearLayout(zzVar5.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i11 = org.telegram.ui.ActionBar.h6.f20930j5;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(b00Var.f36253c.name);
                    editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21117t5, false));
                    editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new wz(alertDialog$Builder, 0));
                    editTextBoldCursor.addTextChangedListener(new yz(0, editTextBoldCursor));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), new z6(zzVar5, editTextBoldCursor, alertDialog$Builder, 13));
                    iq iqVar = new iq(1, editTextBoldCursor);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                    a2Var.setOnShowListener(iqVar);
                    a2Var.setOnDismissListener(new xz(0, editTextBoldCursor));
                    a2Var.show();
                    a2Var.o(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                zz zzVar6 = this.f42052b;
                org.telegram.ui.ActionBar.m1 m1Var3 = zzVar6.f42841x;
                if (m1Var3 != null) {
                    m1Var3.d(true);
                }
                if (zzVar6.f42839s != null) {
                    org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(zzVar6.getContext(), LocaleController.getString(R.string.InviteByQRCode), zzVar6.f42839s, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
                    pj0Var.o(R.raw.qr_code_logo);
                    pj0Var.show();
                    return;
                }
                return;
            default:
                zz zzVar7 = this.f42052b;
                org.telegram.ui.ActionBar.m1 m1Var4 = zzVar7.f42841x;
                if (m1Var4 != null) {
                    m1Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                b00 b00Var2 = zzVar7.E.f35861c;
                tL_inputChatlistDialogFilter.filter_id = b00Var2.f36253c.f17287id;
                tL_chatlists_deleteExportedInvite.slug = b00Var2.b0();
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(zzVar7.getContext(), 3, null);
                a2Var2.q(180L);
                b00Var2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new oo(19, zzVar7, a2Var2));
                return;
        }
    }
}
