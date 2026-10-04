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
public final class wd1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public g91 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.h6 J;
    public final org.telegram.ui.ActionBar.f6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f42070a;
    public EditTextBoldCursor f42071b;
    public org.telegram.ui.ActionBar.v0 f42072c;
    public org.telegram.ui.Cells.e9 d;
    public org.telegram.ui.Cells.e9 f42073e;
    public org.telegram.ui.Cells.ia f42074f;
    public org.telegram.ui.Cells.ea h;
    public org.telegram.ui.Cells.e9 f42075n;
    public org.telegram.ui.ActionBar.b2 f42076r;
    public org.telegram.ui.Components.nn f42077s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f42078w;
    public LinearLayout f42079x;
    public int f42080y;

    public wd1(org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = h6Var;
        this.K = f6Var;
        if (f6Var != null) {
            tL_theme = f6Var.f20630r;
        } else {
            tL_theme = h6Var.F;
        }
        this.L = tL_theme;
        if (f6Var != null) {
            i10 = f6Var.f20632t;
        } else {
            i10 = h6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void S(wd1 wd1Var, int i10) {
        ConnectionsManager.getInstance(wd1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void T(wd1 wd1Var, TLRPC.TL_theme tL_theme) {
        try {
            wd1Var.f42076r.dismiss();
            wd1Var.f42076r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.ActionBar.i6.C1(wd1Var.J, wd1Var.K, tL_theme, wd1Var.currentAccount, false);
        wd1Var.finishFragment();
    }

    public static void U(wd1 wd1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            wd1Var.f42076r.dismiss();
            wd1Var.f42076r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.Components.e5.f0(wd1Var.currentAccount, tL_error, wd1Var, updatetheme, new Object[0]);
    }

    public static void W(wd1 wd1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        wd1Var.f42080y = ConnectionsManager.getInstance(wd1Var.currentAccount).sendRequest(createtheme, new zb0(25, wd1Var, str), 2);
    }

    public static void X(wd1 wd1Var) {
        org.telegram.ui.ActionBar.h6 h6Var = wd1Var.J;
        TLRPC.TL_theme tL_theme = wd1Var.L;
        if (!wd1Var.Y(wd1Var.f42070a.getText().toString(), true) || wd1Var.getParentActivity() == null) {
            return;
        }
        if (wd1Var.f42071b.length() == 0) {
            org.telegram.ui.Components.e5.u0(wd1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (wd1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(wd1Var.getParentActivity(), 3, null);
            wd1Var.f42076r = b2Var;
            b2Var.setOnCancelListener(new Object());
            wd1Var.f42076r.show();
            String obj = wd1Var.f42071b.getText().toString();
            tL_theme.title = obj;
            h6Var.f20692a = obj;
            h6Var.F.slug = wd1Var.f42070a.getText().toString();
            org.telegram.ui.ActionBar.i6.r1(h6Var, true, true, true);
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
            String obj2 = wd1Var.f42070a.getText().toString();
            String obj3 = wd1Var.f42071b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                wd1Var.finishFragment();
                return;
            }
            wd1Var.f42076r = new org.telegram.ui.ActionBar.b2(wd1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f20113id = tL_theme.f20179id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(wd1Var.currentAccount).sendRequest(updatetheme, new zb0(26, wd1Var, updatetheme), 2);
            ConnectionsManager.getInstance(wd1Var.currentAccount).bindRequestToGuid(sendRequest, wd1Var.classGuid);
            wd1Var.f42076r.setOnCancelListener(new da(wd1Var, sendRequest, 8));
            wd1Var.f42076r.show();
        }
    }

    public final boolean Y(String str, boolean z10) {
        g91 g91Var = this.F;
        if (g91Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g91Var);
            this.F = null;
            this.E = null;
            if (this.f42080y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f42080y, true);
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
                        Z(org.telegram.ui.ActionBar.i6.f21044p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        Z(org.telegram.ui.ActionBar.i6.f21044p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                Z(org.telegram.ui.ActionBar.i6.f21044p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                Z(org.telegram.ui.ActionBar.i6.f21044p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    Z(org.telegram.ui.ActionBar.i6.f21175w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                Z(org.telegram.ui.ActionBar.i6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.E = str;
                g91 g91Var2 = new g91(5, this, str);
                this.F = g91Var2;
                AndroidUtilities.runOnUIThread(g91Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            Z(org.telegram.ui.ActionBar.i6.f21044p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void Z(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.f42073e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f20786b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20786b7));
                return;
            }
        }
        this.f42073e.setVisibility(0);
        this.f42073e.setText(str);
        this.f42073e.setTag(Integer.valueOf(i10));
        this.f42073e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.i6.f20786b7));
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
        this.actionBar.setActionBarMenuOnItemClick(new h81(this, 4));
        this.f42072c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f42079x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f42079x.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false));
        linearLayout2.addView(this.f42079x, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f42079x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f42071b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f42071b;
        int i11 = org.telegram.ui.ActionBar.i6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f42071b;
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f42071b.setMaxLines(1);
        this.f42071b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f42071b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f42071b.setBackgroundDrawable(null);
        this.f42071b.setPadding(0, 0, 0, 0);
        this.f42071b.setSingleLine(true);
        this.f42071b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f42071b.setInputType(163872);
        this.f42071b.setImeOptions(6);
        this.f42071b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f42071b.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f42071b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f42071b.setCursorWidth(1.5f);
        this.f42079x.addView(this.f42071b, w7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f42071b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final wd1 f40468b;

            {
                this.f40468b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        wd1 wd1Var = this.f40468b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(wd1Var.f42071b);
                            return true;
                        }
                        wd1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f40468b.f42072c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.nn nnVar = new org.telegram.ui.Components.nn(context, 27);
        this.f42077s = nnVar;
        this.f42079x.addView(nnVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f42079x.addView(linearLayout4, w7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f42078w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f42078w.setTextSize(1, 18.0f);
        this.f42078w.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.f42078w.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f42078w.setMaxLines(1);
        this.f42078w.setLines(1);
        this.f42078w.setEnabled(false);
        this.f42078w.setBackgroundDrawable(null);
        this.f42078w.setPadding(0, 0, 0, 0);
        this.f42078w.setSingleLine(true);
        this.f42078w.setInputType(163840);
        this.f42078w.setImeOptions(6);
        linearLayout4.addView(this.f42078w, w7.z5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f42070a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f42070a.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.f42070a.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f42070a.setMaxLines(1);
        this.f42070a.setLines(1);
        this.f42070a.setBackgroundDrawable(null);
        this.f42070a.setPadding(0, 0, 0, 0);
        this.f42070a.setSingleLine(true);
        this.f42070a.setInputType(163872);
        this.f42070a.setImeOptions(6);
        this.f42070a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f42070a.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f42070a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f42070a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f42070a, w7.z5.n(-1, 50));
        this.f42070a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final wd1 f40468b;

            {
                this.f40468b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        wd1 wd1Var = this.f40468b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(wd1Var.f42071b);
                            return true;
                        }
                        wd1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f40468b.f42072c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f42070a.addTextChangedListener(new vd1(this));
        if (z10) {
            this.f42070a.setOnFocusChangeListener(new rd(this, 11));
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.f42073e = e9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.i6.f20786b7;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, i13, i14));
        this.f42073e.setVisibility(8);
        this.f42073e.setBottomPadding(0);
        linearLayout2.addView(this.f42073e, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
        this.d = e9Var2;
        e9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.uv(2));
        this.d.getTextView().setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.K6, false));
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.e9 e9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.H = replaceTags;
            e9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, w7.z5.n(-1, -2));
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider, i14));
            org.telegram.ui.Cells.ia iaVar = new org.telegram.ui.Cells.ia(context, this.parentLayout, 1);
            this.f42074f = iaVar;
            linearLayout2.addView(iaVar, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
            this.h = eaVar;
            eaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.z5.n(-1, -2));
            this.h.setOnClickListener(new py0(9, this, context));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f42075n = e9Var4;
            e9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f42075n.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f42075n, w7.z5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f42071b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f42071b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f42070a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f42070a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.b2 b2Var;
        org.telegram.ui.ActionBar.b2 b2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.f6 f6Var = this.K;
        org.telegram.ui.ActionBar.h6 h6Var = this.J;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[0];
            org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) objArr[1];
            if (h6Var2 == h6Var && f6Var2 == f6Var && (b2Var2 = this.f42076r) != null) {
                try {
                    b2Var2.dismiss();
                    this.f42076r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.i6.t(h6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[0];
            org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) objArr[1];
            if (h6Var3 == h6Var && f6Var3 == f6Var && (b2Var = this.f42076r) != null) {
                try {
                    b2Var.dismiss();
                    this.f42076r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20766a7));
        LinearLayout linearLayout = this.f42079x;
        int i10 = org.telegram.ui.ActionBar.i6.f20822d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f21104s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i11 = org.telegram.ui.ActionBar.i6.f20786b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42075n, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42075n, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42073e, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42073e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21044p7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42073e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42073e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21175w6));
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.i6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42070a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f42070a;
        int i14 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42070a, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.f20951k6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42070a, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.f20969l6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42070a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42070a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42070a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42071b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42071b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42071b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42078w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42078w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.nn nnVar = this.f42077s;
        Paint paint = org.telegram.ui.ActionBar.i6.f20945k0;
        int i15 = org.telegram.ui.ActionBar.i6.f20823d7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(nnVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42077s, 1, null, org.telegram.ui.ActionBar.i6.f20945k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20985m3, org.telegram.ui.ActionBar.i6.f21060q3}, null, org.telegram.ui.ActionBar.i6.f21086ra));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21005n3, org.telegram.ui.ActionBar.i6.f21079r3}, null, org.telegram.ui.ActionBar.i6.f20828dc));
        org.telegram.ui.Cells.ia iaVar = this.f42074f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.i6.f20985m3.f20577y;
        int i16 = org.telegram.ui.ActionBar.i6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.k6(iaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, org.telegram.ui.ActionBar.i6.f21060q3.f20577y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21022o3, org.telegram.ui.ActionBar.i6.f21099s3}, null, org.telegram.ui.ActionBar.i6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21022o3, org.telegram.ui.ActionBar.i6.f21099s3}, null, org.telegram.ui.ActionBar.i6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21022o3, org.telegram.ui.ActionBar.i6.f21099s3}, null, org.telegram.ui.ActionBar.i6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21022o3, org.telegram.ui.ActionBar.i6.f21099s3}, null, org.telegram.ui.ActionBar.i6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21041p3, org.telegram.ui.ActionBar.i6.f21118t3}, null, org.telegram.ui.ActionBar.i6.Ba));
        org.telegram.ui.Cells.ia iaVar2 = this.f42074f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.i6.f21022o3.f20577y;
        int i17 = org.telegram.ui.ActionBar.i6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.k6(iaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, org.telegram.ui.ActionBar.i6.f21099s3.f20577y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20864fc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.y3}, null, org.telegram.ui.ActionBar.i6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21225z3}, null, org.telegram.ui.ActionBar.i6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.A3, org.telegram.ui.ActionBar.i6.C3}, null, org.telegram.ui.ActionBar.i6.La));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.B3, org.telegram.ui.ActionBar.i6.D3}, null, org.telegram.ui.ActionBar.i6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.F3, org.telegram.ui.ActionBar.i6.G3}, null, org.telegram.ui.ActionBar.i6.f21108sc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20770ab));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20827db));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20772ad));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20863fb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21013nd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21107sb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21031od));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42074f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.nb));
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
            this.f42070a.requestFocus();
            AndroidUtilities.showKeyboard(this.f42070a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f42070a.requestFocus();
            AndroidUtilities.showKeyboard(this.f42070a);
        }
    }
}
