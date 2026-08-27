package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class tc1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public String A;
    public m21 B;
    public boolean C;
    public SpannableStringBuilder D;
    public final boolean E;
    public final org.telegram.ui.ActionBar.f6 F;
    public final org.telegram.ui.ActionBar.e6 G;
    public final TLRPC.TL_theme H;

    public EditTextBoldCursor f42891a;

    public EditTextBoldCursor f42892b;

    public org.telegram.ui.ActionBar.v0 f42893c;
    public org.telegram.ui.Cells.x8 d;

    public org.telegram.ui.Cells.x8 f42894e;

    public org.telegram.ui.Cells.ba f42895f;
    public org.telegram.ui.Cells.x9 h;

    public org.telegram.ui.Cells.x8 f42896n;

    public org.telegram.ui.ActionBar.b2 f42897r;

    public org.telegram.ui.Components.zm f42898s;
    public org.telegram.ui.Cells.j4 v;

    public EditTextBoldCursor f42899w;

    public LinearLayout f42900x;

    public int f42901y;

    public tc1(org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(null);
        this.F = f6Var;
        this.G = e6Var;
        this.H = e6Var != null ? e6Var.f22898r : f6Var.B;
        this.currentAccount = e6Var != null ? e6Var.f22900t : f6Var.A;
        this.E = z10;
    }

    public static void V(tc1 tc1Var, TLRPC.TL_theme tL_theme) {
        try {
            tc1Var.f42897r.dismiss();
            tc1Var.f42897r = null;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        org.telegram.ui.ActionBar.g6.C1(tc1Var.F, tc1Var.G, tL_theme, tc1Var.currentAccount, false);
        tc1Var.finishFragment();
    }

    public static void W(tc1 tc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            tc1Var.f42897r.dismiss();
            tc1Var.f42897r = null;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        org.telegram.ui.Components.y4.f0(tc1Var.currentAccount, tL_error, tc1Var, updatetheme, new Object[0]);
    }

    public static void X(tc1 tc1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        tc1Var.f42901y = ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(createtheme, new v80(29, tc1Var, str), 2);
    }

    public static void Y(tc1 tc1Var) {
        org.telegram.ui.ActionBar.f6 f6Var = tc1Var.F;
        TLRPC.TL_theme tL_theme = tc1Var.H;
        if (tc1Var.Z(tc1Var.f42891a.getText().toString(), true) && tc1Var.getParentActivity() != null) {
            if (tc1Var.f42892b.length() == 0) {
                org.telegram.ui.Components.y4.u0(tc1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
                return;
            }
            if (tc1Var.E) {
                String str = tL_theme.title;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(tc1Var.getParentActivity(), 3, null);
                tc1Var.f42897r = b2Var;
                b2Var.setOnCancelListener(new qc1());
                tc1Var.f42897r.show();
                String string = tc1Var.f42892b.getText().toString();
                tL_theme.title = string;
                f6Var.f22941a = string;
                f6Var.B.slug = tc1Var.f42891a.getText().toString();
                org.telegram.ui.ActionBar.g6.r1(f6Var, true, true, true);
                return;
            }
            String str2 = tL_theme.slug;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = tL_theme.title;
            String str4 = str3 != null ? str3 : "";
            String string2 = tc1Var.f42891a.getText().toString();
            String string3 = tc1Var.f42892b.getText().toString();
            if (str2.equals(string2) && str4.equals(string3)) {
                tc1Var.finishFragment();
                return;
            }
            tc1Var.f42897r = new org.telegram.ui.ActionBar.b2(tc1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f22451id = tL_theme.f22517id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = string2;
            int i10 = updatetheme.flags;
            updatetheme.title = string3;
            updatetheme.flags = i10 | 3;
            int iSendRequest = ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(updatetheme, new rc1(0, tc1Var, updatetheme), 2);
            ConnectionsManager.getInstance(tc1Var.currentAccount).bindRequestToGuid(iSendRequest, tc1Var.classGuid);
            tc1Var.f42897r.setOnCancelListener(new hh.x(tc1Var, iSendRequest, 9));
            tc1Var.f42897r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        String str2;
        m21 m21Var = this.B;
        if (m21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(m21Var);
            this.B = null;
            this.A = null;
            if (this.f42901y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f42901y, true);
            }
        }
        if (str != null) {
            if (str.startsWith("_") || str.endsWith("_")) {
                a0(org.telegram.ui.ActionBar.g6.f23269p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (i10 == 0 && cCharAt >= '0' && cCharAt <= '9') {
                    if (z10) {
                        org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                        return false;
                    }
                    a0(org.telegram.ui.ActionBar.g6.f23269p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                    return false;
                }
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != '_'))) {
                    if (z10) {
                        org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                        return false;
                    }
                    a0(org.telegram.ui.ActionBar.g6.f23269p7, LocaleController.getString(R.string.SetUrlInvalid));
                    return false;
                }
            }
        }
        if (str == null || str.length() < 5) {
            if (z10) {
                org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
                return false;
            }
            a0(org.telegram.ui.ActionBar.g6.f23269p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
        if (str.length() > 64) {
            if (z10) {
                org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                return false;
            }
            a0(org.telegram.ui.ActionBar.g6.f23269p7, LocaleController.getString(R.string.SetUrlInvalidLong));
            return false;
        }
        if (!z10) {
            TLRPC.TL_theme tL_theme = this.H;
            if (tL_theme == null || (str2 = tL_theme.slug) == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                a0(org.telegram.ui.ActionBar.g6.f23391w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                return true;
            }
            a0(org.telegram.ui.ActionBar.g6.F6, LocaleController.getString(R.string.SetUrlChecking));
            this.A = str;
            m21 m21Var2 = new m21(14, this, str);
            this.B = m21Var2;
            AndroidUtilities.runOnUIThread(m21Var2, 300L);
        }
        return true;
    }

    public final void a0(int i10, String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.E;
        if (zIsEmpty) {
            this.f42894e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7));
                return;
            }
        }
        this.f42894e.setVisibility(0);
        this.f42894e.setText(str);
        this.f42894e.setTag(Integer.valueOf(i10));
        this.f42894e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.g6.f23018b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i10 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.E;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 29));
        this.f42893c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        final int i11 = 0;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new kh.e(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f42900x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f42900x.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        linearLayout2.addView(this.f42900x, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, 23);
        this.v = j4Var;
        j4Var.setText(LocaleController.getString(R.string.Info));
        this.f42900x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f42892b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f42892b;
        int i12 = org.telegram.ui.ActionBar.g6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f42892b;
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.f42892b.setMaxLines(1);
        this.f42892b.setLines(1);
        this.f42892b.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        this.f42892b.setBackgroundDrawable(null);
        this.f42892b.setPadding(0, 0, 0, 0);
        this.f42892b.setSingleLine(true);
        this.f42892b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f42892b.setInputType(163872);
        this.f42892b.setImeOptions(6);
        this.f42892b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f42892b.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.f42892b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f42892b.setCursorWidth(1.5f);
        this.f42900x.addView(this.f42892b, h7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f42892b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final tc1 f41062b;

            {
                this.f41062b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (i11) {
                    case 0:
                        tc1 tc1Var = this.f41062b;
                        if (i14 == 6) {
                            AndroidUtilities.hideKeyboard(tc1Var.f42892b);
                            return true;
                        }
                        tc1Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (v0Var = this.f41062b.f42893c) == null) {
                            return false;
                        }
                        v0Var.performClick();
                        return true;
                }
            }
        });
        org.telegram.ui.Components.zm zmVar = new org.telegram.ui.Components.zm(context, 26);
        this.f42898s = zmVar;
        this.f42900x.addView(zmVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f42900x.addView(linearLayout4, h7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
        this.f42899w = editTextBoldCursor4;
        editTextBoldCursor4.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f42899w.setTextSize(1, 18.0f);
        this.f42899w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f42899w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.f42899w.setMaxLines(1);
        this.f42899w.setLines(1);
        this.f42899w.setEnabled(false);
        this.f42899w.setBackgroundDrawable(null);
        this.f42899w.setPadding(0, 0, 0, 0);
        this.f42899w.setSingleLine(true);
        this.f42899w.setInputType(163840);
        this.f42899w.setImeOptions(6);
        linearLayout4.addView(this.f42899w, h7.z5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f42891a = editTextBoldCursor5;
        editTextBoldCursor5.setTextSize(1, 18.0f);
        this.f42891a.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f42891a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.f42891a.setMaxLines(1);
        this.f42891a.setLines(1);
        this.f42891a.setBackgroundDrawable(null);
        this.f42891a.setPadding(0, 0, 0, 0);
        this.f42891a.setSingleLine(true);
        this.f42891a.setInputType(163872);
        this.f42891a.setImeOptions(6);
        this.f42891a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f42891a.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.f42891a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f42891a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f42891a, h7.z5.n(-1, 50));
        this.f42891a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final tc1 f41062b;

            {
                this.f41062b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (i10) {
                    case 0:
                        tc1 tc1Var = this.f41062b;
                        if (i14 == 6) {
                            AndroidUtilities.hideKeyboard(tc1Var.f42892b);
                            return true;
                        }
                        tc1Var.getClass();
                        return false;
                    default:
                        if (i14 != 6 || (v0Var = this.f41062b.f42893c) == null) {
                            return false;
                        }
                        v0Var.performClick();
                        return true;
                }
            }
        });
        this.f42891a.addTextChangedListener(new sc1(this));
        if (z10) {
            this.f42891a.setOnFocusChangeListener(new ld(this, 11));
        }
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
        this.f42894e = x8Var;
        int i14 = R.drawable.greydivider_bottom;
        int i15 = org.telegram.ui.ActionBar.g6.f23018b7;
        x8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, i14, i15));
        this.f42894e.setVisibility(8);
        this.f42894e.setBottomPadding(0);
        linearLayout2.addView(this.f42894e, h7.z5.n(-1, -2));
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context);
        this.d = x8Var2;
        x8Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.av(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.x8 x8Var3 = this.d;
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.D = spannableStringBuilderReplaceTags;
            x8Var3.setText(spannableStringBuilderReplaceTags);
        }
        linearLayout2.addView(this.d, h7.z5.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, i15));
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, this.parentLayout, 1);
            this.f42895f = baVar;
            linearLayout2.addView(baVar, h7.z5.n(-1, -2));
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.h = x9Var;
            x9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, h7.z5.n(-1, -2));
            this.h.setOnClickListener(new u70(27, this, context));
            org.telegram.ui.Cells.x8 x8Var4 = new org.telegram.ui.Cells.x8(context);
            this.f42896n = x8Var4;
            x8Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f42896n.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i15));
            linearLayout2.addView(this.f42896n, h7.z5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, i15));
        }
        TLRPC.TL_theme tL_theme = this.H;
        if (tL_theme != null) {
            this.C = true;
            this.f42892b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor6 = this.f42892b;
            editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
            this.f42891a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor7 = this.f42891a;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.C = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.b2 b2Var;
        org.telegram.ui.ActionBar.b2 b2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.e6 e6Var = this.G;
        org.telegram.ui.ActionBar.f6 f6Var = this.F;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (f6Var2 == f6Var && e6Var2 == e6Var && (b2Var2 = this.f42897r) != null) {
                try {
                    b2Var2.dismiss();
                    this.f42897r = null;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                org.telegram.ui.ActionBar.g6.t(f6Var, true, false);
                finishFragment();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) objArr[0];
            org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) objArr[1];
            if (f6Var3 == f6Var && e6Var3 == e6Var && (b2Var = this.f42897r) != null) {
                try {
                    b2Var.dismiss();
                    this.f42897r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        LinearLayout linearLayout = this.f42900x;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.f23018b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42896n, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42896n, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42894e, 32, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42894e, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23269p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42894e, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42894e, 262144, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23391w6));
        int i13 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42891a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f42891a;
        int i14 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42891a, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23181k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42891a, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23198l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42891a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42891a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42891a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42892b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42892b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42892b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42899w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42899w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.zm zmVar = this.f42898s;
        Paint paint = org.telegram.ui.ActionBar.g6.f23175k0;
        int i15 = org.telegram.ui.ActionBar.g6.f23054d7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(zmVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42898s, 1, null, org.telegram.ui.ActionBar.g6.f23175k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23212m3, org.telegram.ui.ActionBar.g6.f23281q3}, null, org.telegram.ui.ActionBar.g6.f23305ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23231n3, org.telegram.ui.ActionBar.g6.f23298r3}, null, org.telegram.ui.ActionBar.g6.f23059dc));
        org.telegram.ui.Cells.ba baVar = this.f42895f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f23212m3.f22864y;
        int i16 = org.telegram.ui.ActionBar.g6.f23343ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(baVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, org.telegram.ui.ActionBar.g6.f23281q3.f22864y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23266p3, org.telegram.ui.ActionBar.g6.f23336t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        org.telegram.ui.Cells.ba baVar2 = this.f42895f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.f23248o3.f22864y;
        int i17 = org.telegram.ui.ActionBar.g6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.i6(baVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, org.telegram.ui.ActionBar.g6.f23317s3.f22864y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23077ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23420y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23438z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f23326sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23003ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23040cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23058db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23005ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23095fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23240nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23325sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42895f, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.nb));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().addObserver(this, NotificationCenter.themeUploadError);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadedToServer);
        getNotificationCenter().removeObserver(this, NotificationCenter.themeUploadError);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.E) {
            this.f42891a.requestFocus();
            AndroidUtilities.showKeyboard(this.f42891a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.E) {
            return;
        }
        this.f42891a.requestFocus();
        AndroidUtilities.showKeyboard(this.f42891a);
    }
}
