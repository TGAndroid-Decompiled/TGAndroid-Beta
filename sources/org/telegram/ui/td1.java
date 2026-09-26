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
public final class td1 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public p81 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.g6 J;
    public final org.telegram.ui.ActionBar.f6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f38053a;
    public EditTextBoldCursor f38054b;
    public org.telegram.ui.ActionBar.u0 f38055c;
    public org.telegram.ui.Cells.e9 d;
    public org.telegram.ui.Cells.e9 e;
    public org.telegram.ui.Cells.ia f38056f;
    public org.telegram.ui.Cells.ea h;
    public org.telegram.ui.Cells.e9 f38057n;
    public org.telegram.ui.ActionBar.a2 f38058r;
    public org.telegram.ui.Components.ln f38059s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f38060w;
    public LinearLayout f38061x;
    public int f38062y;

    public td1(org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = g6Var;
        this.K = f6Var;
        if (f6Var != null) {
            tL_theme = f6Var.f18899r;
        } else {
            tL_theme = g6Var.F;
        }
        this.L = tL_theme;
        if (f6Var != null) {
            i10 = f6Var.f18901t;
        } else {
            i10 = g6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void U(td1 td1Var, int i10) {
        ConnectionsManager.getInstance(td1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void V(td1 td1Var, TLRPC.TL_theme tL_theme) {
        try {
            td1Var.f38058r.dismiss();
            td1Var.f38058r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.h6.C1(td1Var.J, td1Var.K, tL_theme, td1Var.currentAccount, false);
        td1Var.finishFragment();
    }

    public static void W(td1 td1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            td1Var.f38058r.dismiss();
            td1Var.f38058r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.e5.f0(td1Var.currentAccount, tL_error, td1Var, updatetheme, new Object[0]);
    }

    public static void X(td1 td1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        td1Var.f38062y = ConnectionsManager.getInstance(td1Var.currentAccount).sendRequest(createtheme, new vb0(25, td1Var, str), 2);
    }

    public static void Y(td1 td1Var) {
        org.telegram.ui.ActionBar.g6 g6Var = td1Var.J;
        TLRPC.TL_theme tL_theme = td1Var.L;
        if (!td1Var.Z(td1Var.f38053a.getText().toString(), true) || td1Var.getParentActivity() == null) {
            return;
        }
        if (td1Var.f38054b.length() == 0) {
            org.telegram.ui.Components.e5.u0(td1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (td1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(td1Var.getParentActivity(), 3, null);
            td1Var.f38058r = a2Var;
            a2Var.setOnCancelListener(new Object());
            td1Var.f38058r.show();
            String obj = td1Var.f38054b.getText().toString();
            tL_theme.title = obj;
            g6Var.f18932a = obj;
            g6Var.F.slug = td1Var.f38053a.getText().toString();
            org.telegram.ui.ActionBar.h6.r1(g6Var, true, true, true);
        } else {
            String str2 = tL_theme.slug;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = tL_theme.title;
            if (str4 != null) {
                str3 = str4;
            }
            String obj2 = td1Var.f38053a.getText().toString();
            String obj3 = td1Var.f38054b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                td1Var.finishFragment();
                return;
            }
            td1Var.f38058r = new org.telegram.ui.ActionBar.a2(td1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f18406id = tL_theme.f18472id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(td1Var.currentAccount).sendRequest(updatetheme, new vb0(26, td1Var, updatetheme), 2);
            ConnectionsManager.getInstance(td1Var.currentAccount).bindRequestToGuid(sendRequest, td1Var.classGuid);
            td1Var.f38058r.setOnCancelListener(new ba(td1Var, sendRequest, 8));
            td1Var.f38058r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        p81 p81Var = this.F;
        if (p81Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p81Var);
            this.F = null;
            this.E = null;
            if (this.f38062y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f38062y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.h6.f19279p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.h6.f19279p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.h6.f19279p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.h6.f19279p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.h6.f19408w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.h6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.E = str;
                p81 p81Var2 = new p81(7, this, str);
                this.F = p81Var2;
                AndroidUtilities.runOnUIThread(p81Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.h6.f19279p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f19023b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19023b7));
                return;
            }
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.h6.f19023b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.I;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new f81(this, 4));
        this.f38055c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19003a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f38061x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f38061x.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19059d6, false));
        linearLayout2.addView(this.f38061x, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f38061x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f38054b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f38054b;
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f38054b;
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        this.f38054b.setMaxLines(1);
        this.f38054b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f38054b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f38054b.setBackgroundDrawable(null);
        this.f38054b.setPadding(0, 0, 0, 0);
        this.f38054b.setSingleLine(true);
        this.f38054b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f38054b.setInputType(163872);
        this.f38054b.setImeOptions(6);
        this.f38054b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f38054b.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        this.f38054b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f38054b.setCursorWidth(1.5f);
        this.f38061x.addView(this.f38054b, w7.y5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f38054b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final td1 f36505b;

            {
                this.f36505b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        td1 td1Var = this.f36505b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(td1Var.f38054b);
                            return true;
                        }
                        td1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (u0Var = this.f36505b.f38055c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.ln lnVar = new org.telegram.ui.Components.ln(context, 27);
        this.f38059s = lnVar;
        this.f38061x.addView(lnVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f38061x.addView(linearLayout4, w7.y5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f38060w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f38060w.setTextSize(1, 18.0f);
        this.f38060w.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.f38060w.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        this.f38060w.setMaxLines(1);
        this.f38060w.setLines(1);
        this.f38060w.setEnabled(false);
        this.f38060w.setBackgroundDrawable(null);
        this.f38060w.setPadding(0, 0, 0, 0);
        this.f38060w.setSingleLine(true);
        this.f38060w.setInputType(163840);
        this.f38060w.setImeOptions(6);
        linearLayout4.addView(this.f38060w, w7.y5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f38053a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f38053a.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.f38053a.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        this.f38053a.setMaxLines(1);
        this.f38053a.setLines(1);
        this.f38053a.setBackgroundDrawable(null);
        this.f38053a.setPadding(0, 0, 0, 0);
        this.f38053a.setSingleLine(true);
        this.f38053a.setInputType(163872);
        this.f38053a.setImeOptions(6);
        this.f38053a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f38053a.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
        this.f38053a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f38053a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f38053a, w7.y5.n(-1, 50));
        this.f38053a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final td1 f36505b;

            {
                this.f36505b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        td1 td1Var = this.f36505b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(td1Var.f38054b);
                            return true;
                        }
                        td1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (u0Var = this.f36505b.f38055c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f38053a.addTextChangedListener(new sd1(this));
        if (z10) {
            this.f38053a.setOnFocusChangeListener(new od(this, 11));
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.e = e9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.h6.f19023b7;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, i13, i14));
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, w7.y5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
        this.d = e9Var2;
        e9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.rv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.e9 e9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.H = replaceTags;
            e9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, w7.y5.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, this.parentLayout, 1);
            this.f38056f = iaVar;
            linearLayout2.addView(iaVar, w7.y5.n(-1, -2));
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
            this.h = eaVar;
            eaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.y5.n(-1, -2));
            this.h.setOnClickListener(new ny0(9, this, context));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f38057n = e9Var4;
            e9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f38057n.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f38057n, w7.y5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f38054b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f38054b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f38053a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f38053a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.a2 a2Var;
        org.telegram.ui.ActionBar.a2 a2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.f6 f6Var = this.K;
        org.telegram.ui.ActionBar.g6 g6Var = this.J;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[0];
            org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) objArr[1];
            if (g6Var2 == g6Var && f6Var2 == f6Var && (a2Var2 = this.f38058r) != null) {
                try {
                    a2Var2.dismiss();
                    this.f38058r = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.h6.t(g6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) objArr[0];
            org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) objArr[1];
            if (g6Var3 == g6Var && f6Var3 == f6Var && (a2Var = this.f38058r) != null) {
                try {
                    a2Var.dismiss();
                    this.f38058r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19003a7));
        LinearLayout linearLayout = this.f38061x;
        int i10 = org.telegram.ui.ActionBar.h6.f19059d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19337s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.f19023b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38057n, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38057n, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19279p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19408w6));
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.h6.f19148i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38053a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f38053a;
        int i14 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38053a, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f19186k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38053a, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f19204l6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38053a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38053a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38053a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38054b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38054b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38054b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38060w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38060w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.ln lnVar = this.f38059s;
        Paint paint = org.telegram.ui.ActionBar.h6.f19180k0;
        int i15 = org.telegram.ui.ActionBar.h6.f19060d7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(lnVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38059s, 1, null, org.telegram.ui.ActionBar.h6.f19180k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19220m3, org.telegram.ui.ActionBar.h6.f19295q3}, null, org.telegram.ui.ActionBar.h6.f19320ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19240n3, org.telegram.ui.ActionBar.h6.f19313r3}, null, org.telegram.ui.ActionBar.h6.f19065dc));
        org.telegram.ui.Cells.ia iaVar = this.f38056f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.h6.f19220m3.f18827y;
        int i16 = org.telegram.ui.ActionBar.h6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.j6(iaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, org.telegram.ui.ActionBar.h6.f19295q3.f18827y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19257o3, org.telegram.ui.ActionBar.h6.f19332s3}, null, org.telegram.ui.ActionBar.h6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19257o3, org.telegram.ui.ActionBar.h6.f19332s3}, null, org.telegram.ui.ActionBar.h6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19257o3, org.telegram.ui.ActionBar.h6.f19332s3}, null, org.telegram.ui.ActionBar.h6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19257o3, org.telegram.ui.ActionBar.h6.f19332s3}, null, org.telegram.ui.ActionBar.h6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19276p3, org.telegram.ui.ActionBar.h6.f19351t3}, null, org.telegram.ui.ActionBar.h6.Ba));
        org.telegram.ui.Cells.ia iaVar2 = this.f38056f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.h6.f19257o3.f18827y;
        int i17 = org.telegram.ui.ActionBar.h6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.j6(iaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, org.telegram.ui.ActionBar.h6.f19332s3.f18827y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19100fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.y3}, null, org.telegram.ui.ActionBar.h6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f19458z3}, null, org.telegram.ui.ActionBar.h6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.A3, org.telegram.ui.ActionBar.h6.C3}, null, org.telegram.ui.ActionBar.h6.La));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.B3, org.telegram.ui.ActionBar.h6.D3}, null, org.telegram.ui.ActionBar.h6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f19341sc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19007ab));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19064db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19009ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19099fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19248nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19340sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f19266od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f38056f, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.nb));
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
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.I) {
            this.f38053a.requestFocus();
            AndroidUtilities.showKeyboard(this.f38053a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f38053a.requestFocus();
            AndroidUtilities.showKeyboard(this.f38053a);
        }
    }
}
