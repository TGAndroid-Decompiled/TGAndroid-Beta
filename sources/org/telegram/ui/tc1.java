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
public final class tc1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public String A;
    public n21 B;
    public boolean C;
    public SpannableStringBuilder D;
    public final boolean E;
    public final org.telegram.ui.ActionBar.e6 F;
    public final org.telegram.ui.ActionBar.d6 G;
    public final TLRPC.TL_theme H;
    public EditTextBoldCursor f42951a;
    public EditTextBoldCursor f42952b;
    public org.telegram.ui.ActionBar.w0 f42953c;
    public org.telegram.ui.Cells.b9 d;
    public org.telegram.ui.Cells.b9 f42954e;
    public org.telegram.ui.Cells.fa f42955f;
    public org.telegram.ui.Cells.ba h;
    public org.telegram.ui.Cells.b9 f42956n;
    public org.telegram.ui.ActionBar.c2 f42957r;
    public org.telegram.ui.Components.an f42958s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f42959w;
    public LinearLayout f42960x;
    public int f42961y;

    public tc1(org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i9;
        this.F = e6Var;
        this.G = d6Var;
        if (d6Var != null) {
            tL_theme = d6Var.f22881r;
        } else {
            tL_theme = e6Var.B;
        }
        this.H = tL_theme;
        if (d6Var != null) {
            i9 = d6Var.f22883t;
        } else {
            i9 = e6Var.A;
        }
        this.currentAccount = i9;
        this.E = z10;
    }

    public static void T(tc1 tc1Var, int i9) {
        ConnectionsManager.getInstance(tc1Var.currentAccount).cancelRequest(i9, true);
    }

    public static void U(tc1 tc1Var, TLRPC.TL_theme tL_theme) {
        try {
            tc1Var.f42957r.dismiss();
            tc1Var.f42957r = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.ActionBar.f6.C1(tc1Var.F, tc1Var.G, tL_theme, tc1Var.currentAccount, false);
        tc1Var.finishFragment();
    }

    public static void V(tc1 tc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            tc1Var.f42957r.dismiss();
            tc1Var.f42957r = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        org.telegram.ui.Components.y4.f0(tc1Var.currentAccount, tL_error, tc1Var, updatetheme, new Object[0]);
    }

    public static void W(tc1 tc1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        tc1Var.f42961y = ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(createtheme, new o71(2, tc1Var, str), 2);
    }

    public static void X(tc1 tc1Var) {
        org.telegram.ui.ActionBar.e6 e6Var = tc1Var.F;
        TLRPC.TL_theme tL_theme = tc1Var.H;
        if (!tc1Var.Y(tc1Var.f42951a.getText().toString(), true) || tc1Var.getParentActivity() == null) {
            return;
        }
        if (tc1Var.f42952b.length() == 0) {
            org.telegram.ui.Components.y4.u0(tc1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (tc1Var.E) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(tc1Var.getParentActivity(), 3, null);
            tc1Var.f42957r = c2Var;
            c2Var.setOnCancelListener(new Object());
            tc1Var.f42957r.show();
            String obj = tc1Var.f42952b.getText().toString();
            tL_theme.title = obj;
            e6Var.f22906a = obj;
            e6Var.B.slug = tc1Var.f42951a.getText().toString();
            org.telegram.ui.ActionBar.f6.r1(e6Var, true, true, true);
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
            String obj2 = tc1Var.f42951a.getText().toString();
            String obj3 = tc1Var.f42952b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                tc1Var.finishFragment();
                return;
            }
            tc1Var.f42957r = new org.telegram.ui.ActionBar.c2(tc1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f22451id = tL_theme.f22517id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i9 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i9 | 3;
            int sendRequest = ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(updatetheme, new o71(3, tc1Var, updatetheme), 2);
            ConnectionsManager.getInstance(tc1Var.currentAccount).bindRequestToGuid(sendRequest, tc1Var.classGuid);
            tc1Var.f42957r.setOnCancelListener(new gh.x(tc1Var, sendRequest, 9));
            tc1Var.f42957r.show();
        }
    }

    public final boolean Y(String str, boolean z10) {
        n21 n21Var = this.B;
        if (n21Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n21Var);
            this.B = null;
            this.A = null;
            if (this.f42961y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f42961y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i9 = 0; i9 < str.length(); i9++) {
                    char charAt = str.charAt(i9);
                    if (i9 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        Z(org.telegram.ui.ActionBar.f6.f23212p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        Z(org.telegram.ui.ActionBar.f6.f23212p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                Z(org.telegram.ui.ActionBar.f6.f23212p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                Z(org.telegram.ui.ActionBar.f6.f23212p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.H;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    Z(org.telegram.ui.ActionBar.f6.f23334w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                Z(org.telegram.ui.ActionBar.f6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.A = str;
                n21 n21Var2 = new n21(14, this, str);
                this.B = n21Var2;
                AndroidUtilities.runOnUIThread(n21Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.y4.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            Z(org.telegram.ui.ActionBar.f6.f23212p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void Z(int i9, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.E;
        if (isEmpty) {
            this.f42954e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.f6.f22966b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
                return;
            }
        }
        this.f42954e.setVisibility(0);
        this.f42954e.setText(str);
        this.f42954e.setTag(Integer.valueOf(i9));
        this.f42954e.setTextColorByKey(i9);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.f6.f22966b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final View createView(Context context) {
        int i9;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.E;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 28));
        this.f42953c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new jh.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f42960x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f42960x.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        linearLayout2.addView(this.f42960x, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f42960x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f42952b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f42952b;
        int i10 = org.telegram.ui.ActionBar.f6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f42952b;
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.f42952b.setMaxLines(1);
        this.f42952b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f42952b;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        editTextBoldCursor4.setGravity(i9 | 16);
        this.f42952b.setBackgroundDrawable(null);
        this.f42952b.setPadding(0, 0, 0, 0);
        this.f42952b.setSingleLine(true);
        this.f42952b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f42952b.setInputType(163872);
        this.f42952b.setImeOptions(6);
        this.f42952b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f42952b.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.f42952b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f42952b.setCursorWidth(1.5f);
        this.f42960x.addView(this.f42952b, g7.e6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f42952b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final tc1 f41478b;

            {
                this.f41478b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        tc1 tc1Var = this.f41478b;
                        if (i12 == 6) {
                            AndroidUtilities.hideKeyboard(tc1Var.f42952b);
                            return true;
                        }
                        tc1Var.getClass();
                        return false;
                    default:
                        if (i12 == 6 && (w0Var = this.f41478b.f42953c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.an anVar = new org.telegram.ui.Components.an(context, 28);
        this.f42958s = anVar;
        this.f42960x.addView(anVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f42960x.addView(linearLayout4, g7.e6.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f42959w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f42959w.setTextSize(1, 18.0f);
        this.f42959w.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.f42959w.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.f42959w.setMaxLines(1);
        this.f42959w.setLines(1);
        this.f42959w.setEnabled(false);
        this.f42959w.setBackgroundDrawable(null);
        this.f42959w.setPadding(0, 0, 0, 0);
        this.f42959w.setSingleLine(true);
        this.f42959w.setInputType(163840);
        this.f42959w.setImeOptions(6);
        linearLayout4.addView(this.f42959w, g7.e6.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f42951a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f42951a.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.f42951a.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.f42951a.setMaxLines(1);
        this.f42951a.setLines(1);
        this.f42951a.setBackgroundDrawable(null);
        this.f42951a.setPadding(0, 0, 0, 0);
        this.f42951a.setSingleLine(true);
        this.f42951a.setInputType(163872);
        this.f42951a.setImeOptions(6);
        this.f42951a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f42951a.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.f42951a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f42951a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f42951a, g7.e6.n(-1, 50));
        this.f42951a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final tc1 f41478b;

            {
                this.f41478b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (r2) {
                    case 0:
                        tc1 tc1Var = this.f41478b;
                        if (i12 == 6) {
                            AndroidUtilities.hideKeyboard(tc1Var.f42952b);
                            return true;
                        }
                        tc1Var.getClass();
                        return false;
                    default:
                        if (i12 == 6 && (w0Var = this.f41478b.f42953c) != null) {
                            w0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f42951a.addTextChangedListener(new sc1(this));
        if (z10) {
            this.f42951a.setOnFocusChangeListener(new ld(this, 11));
        }
        org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
        this.f42954e = b9Var;
        int i12 = R.drawable.greydivider_bottom;
        int i13 = org.telegram.ui.ActionBar.f6.f22966b7;
        b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, i12, i13));
        this.f42954e.setVisibility(8);
        this.f42954e.setBottomPadding(0);
        linearLayout2.addView(this.f42954e, g7.e6.n(-1, -2));
        org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context);
        this.d = b9Var2;
        b9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.bv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.b9 b9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.D = replaceTags;
            b9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, g7.e6.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, i13));
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context, this.parentLayout, 1);
            this.f42955f = faVar;
            linearLayout2.addView(faVar, g7.e6.n(-1, -2));
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
            this.h = baVar;
            baVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, g7.e6.n(-1, -2));
            this.h.setOnClickListener(new v80(26, this, context));
            org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context);
            this.f42956n = b9Var4;
            b9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f42956n.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, i13));
            linearLayout2.addView(this.f42956n, g7.e6.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, i13));
        }
        TLRPC.TL_theme tL_theme = this.H;
        if (tL_theme != null) {
            this.C = true;
            this.f42952b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f42952b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f42951a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f42951a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.C = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.c2 c2Var;
        org.telegram.ui.ActionBar.c2 c2Var2;
        int i11 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.d6 d6Var = this.G;
        org.telegram.ui.ActionBar.e6 e6Var = this.F;
        if (i9 == i11) {
            org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) objArr[0];
            org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) objArr[1];
            if (e6Var2 == e6Var && d6Var2 == d6Var && (c2Var2 = this.f42957r) != null) {
                try {
                    c2Var2.dismiss();
                    this.f42957r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                org.telegram.ui.ActionBar.f6.t(e6Var, true, false);
                finishFragment();
            }
        } else if (i9 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) objArr[0];
            org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) objArr[1];
            if (e6Var3 == e6Var && d6Var3 == d6Var && (c2Var = this.f42957r) != null) {
                try {
                    c2Var.dismiss();
                    this.f42957r = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        LinearLayout linearLayout = this.f42960x;
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(linearLayout, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i10 = org.telegram.ui.ActionBar.f6.f22966b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42956n, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42956n, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42954e, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42954e, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23212p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42954e, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42954e, 262144, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23334w6));
        int i12 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 268435456, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42951a, 4, null, null, null, null, i12));
        EditTextBoldCursor editTextBoldCursor = this.f42951a;
        int i13 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursor, 8388608, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42951a, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.f23127k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42951a, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.f23144l6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42951a, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42951a, 8388608, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42951a, 16777216, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42952b, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42952b, 8388608, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42952b, 16777216, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42959w, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42959w, 8388608, null, null, null, null, i13));
        org.telegram.ui.Components.an anVar = this.f42958s;
        Paint paint = org.telegram.ui.ActionBar.f6.f23121k0;
        int i14 = org.telegram.ui.ActionBar.f6.f23002d7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(anVar, 0, null, paint, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42958s, 1, null, org.telegram.ui.ActionBar.f6.f23121k0, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23159m3, org.telegram.ui.ActionBar.f6.f23226q3}, null, org.telegram.ui.ActionBar.f6.f23252ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23176n3, org.telegram.ui.ActionBar.f6.f23245r3}, null, org.telegram.ui.ActionBar.f6.f23006dc));
        org.telegram.ui.Cells.fa faVar = this.f42955f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.f6.f23159m3.f22864y;
        int i15 = org.telegram.ui.ActionBar.f6.f23289ta;
        arrayList.add(new org.telegram.ui.ActionBar.h6(faVar, 0, null, null, drawableArr, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, org.telegram.ui.ActionBar.f6.f23226q3.f22864y, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23209p3, org.telegram.ui.ActionBar.f6.f23282t3}, null, org.telegram.ui.ActionBar.f6.Ba));
        org.telegram.ui.Cells.fa faVar2 = this.f42955f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.f6.f23194o3.f22864y;
        int i16 = org.telegram.ui.ActionBar.f6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.h6(faVar2, 0, null, null, drawableArr2, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, org.telegram.ui.ActionBar.f6.f23264s3.f22864y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23366y3}, null, org.telegram.ui.ActionBar.f6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23383z3}, null, org.telegram.ui.ActionBar.f6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.A3, org.telegram.ui.ActionBar.f6.C3}, null, org.telegram.ui.ActionBar.f6.La));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.B3, org.telegram.ui.ActionBar.f6.D3}, null, org.telegram.ui.ActionBar.f6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.F3, org.telegram.ui.ActionBar.f6.G3}, null, org.telegram.ui.ActionBar.f6.f23273sc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f22951ab));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f22988cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23005db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f22953ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23042fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23272sb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23201od));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42955f, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23184nb));
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
            this.f42951a.requestFocus();
            AndroidUtilities.showKeyboard(this.f42951a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.E) {
            this.f42951a.requestFocus();
            AndroidUtilities.showKeyboard(this.f42951a);
        }
    }
}
