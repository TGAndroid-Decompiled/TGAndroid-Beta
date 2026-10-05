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
public final class ud1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public String E;
    public e91 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.h6 J;
    public final org.telegram.ui.ActionBar.f6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f41207a;
    public EditTextBoldCursor f41208b;
    public org.telegram.ui.ActionBar.v0 f41209c;
    public org.telegram.ui.Cells.e9 d;
    public org.telegram.ui.Cells.e9 f41210e;
    public org.telegram.ui.Cells.ia f41211f;
    public org.telegram.ui.Cells.ea h;
    public org.telegram.ui.Cells.e9 f41212n;
    public org.telegram.ui.ActionBar.b2 f41213r;
    public org.telegram.ui.Components.nn f41214s;
    public org.telegram.ui.Cells.m4 v;
    public EditTextBoldCursor f41215w;
    public LinearLayout f41216x;
    public int f41217y;

    public ud1(org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.J = h6Var;
        this.K = f6Var;
        if (f6Var != null) {
            tL_theme = f6Var.f20635r;
        } else {
            tL_theme = h6Var.F;
        }
        this.L = tL_theme;
        if (f6Var != null) {
            i10 = f6Var.f20637t;
        } else {
            i10 = h6Var.E;
        }
        this.currentAccount = i10;
        this.I = z10;
    }

    public static void S(ud1 ud1Var, int i10) {
        ConnectionsManager.getInstance(ud1Var.currentAccount).cancelRequest(i10, true);
    }

    public static void T(ud1 ud1Var, TLRPC.TL_theme tL_theme) {
        try {
            ud1Var.f41213r.dismiss();
            ud1Var.f41213r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.ActionBar.i6.C1(ud1Var.J, ud1Var.K, tL_theme, ud1Var.currentAccount, false);
        ud1Var.finishFragment();
    }

    public static void U(ud1 ud1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            ud1Var.f41213r.dismiss();
            ud1Var.f41213r = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        org.telegram.ui.Components.e5.f0(ud1Var.currentAccount, tL_error, ud1Var, updatetheme, new Object[0]);
    }

    public static void W(ud1 ud1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        ud1Var.f41217y = ConnectionsManager.getInstance(ud1Var.currentAccount).sendRequest(createtheme, new zb0(25, ud1Var, str), 2);
    }

    public static void X(ud1 ud1Var) {
        org.telegram.ui.ActionBar.h6 h6Var = ud1Var.J;
        TLRPC.TL_theme tL_theme = ud1Var.L;
        if (!ud1Var.Y(ud1Var.f41207a.getText().toString(), true) || ud1Var.getParentActivity() == null) {
            return;
        }
        if (ud1Var.f41208b.length() == 0) {
            org.telegram.ui.Components.e5.u0(ud1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (ud1Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ud1Var.getParentActivity(), 3, null);
            ud1Var.f41213r = b2Var;
            b2Var.setOnCancelListener(new Object());
            ud1Var.f41213r.show();
            String obj = ud1Var.f41208b.getText().toString();
            tL_theme.title = obj;
            h6Var.f20697a = obj;
            h6Var.F.slug = ud1Var.f41207a.getText().toString();
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
            String obj2 = ud1Var.f41207a.getText().toString();
            String obj3 = ud1Var.f41208b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                ud1Var.finishFragment();
                return;
            }
            ud1Var.f41213r = new org.telegram.ui.ActionBar.b2(ud1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f20118id = tL_theme.f20184id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(ud1Var.currentAccount).sendRequest(updatetheme, new zb0(26, ud1Var, updatetheme), 2);
            ConnectionsManager.getInstance(ud1Var.currentAccount).bindRequestToGuid(sendRequest, ud1Var.classGuid);
            ud1Var.f41213r.setOnCancelListener(new da(ud1Var, sendRequest, 8));
            ud1Var.f41213r.show();
        }
    }

    public final boolean Y(String str, boolean z10) {
        e91 e91Var = this.F;
        if (e91Var != null) {
            AndroidUtilities.cancelRunOnUIThread(e91Var);
            this.F = null;
            this.E = null;
            if (this.f41217y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f41217y, true);
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
                        Z(org.telegram.ui.ActionBar.i6.f21049p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        Z(org.telegram.ui.ActionBar.i6.f21049p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                Z(org.telegram.ui.ActionBar.i6.f21049p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                Z(org.telegram.ui.ActionBar.i6.f21049p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    Z(org.telegram.ui.ActionBar.i6.f21180w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                Z(org.telegram.ui.ActionBar.i6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.E = str;
                e91 e91Var2 = new e91(5, this, str);
                this.F = e91Var2;
                AndroidUtilities.runOnUIThread(e91Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.e5.u0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            Z(org.telegram.ui.ActionBar.i6.f21049p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void Z(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.f41210e.setVisibility(8);
            if (z10) {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(getParentActivity(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f20791b7));
                return;
            } else {
                this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20791b7));
                return;
            }
        }
        this.f41210e.setVisibility(0);
        this.f41210e.setText(str);
        this.f41210e.setTag(Integer.valueOf(i10));
        this.f41210e.setTextColorByKey(i10);
        if (z10) {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(getParentActivity(), R.drawable.greydivider_top, org.telegram.ui.ActionBar.i6.f20791b7));
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.I;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        int i10 = 3;
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 3));
        this.f41209c = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20771a7, false));
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f41216x = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f41216x.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false));
        linearLayout2.addView(this.f41216x, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, 23);
        this.v = m4Var;
        m4Var.setText(LocaleController.getString(R.string.Info));
        this.f41216x.addView(this.v);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f41208b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f41208b;
        int i11 = org.telegram.ui.ActionBar.i6.H6;
        editTextBoldCursor2.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        EditTextBoldCursor editTextBoldCursor3 = this.f41208b;
        int i12 = org.telegram.ui.ActionBar.i6.G6;
        editTextBoldCursor3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f41208b.setMaxLines(1);
        this.f41208b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f41208b;
        if (LocaleController.isRTL) {
            i10 = 5;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f41208b.setBackgroundDrawable(null);
        this.f41208b.setPadding(0, 0, 0, 0);
        this.f41208b.setSingleLine(true);
        this.f41208b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f41208b.setInputType(163872);
        this.f41208b.setImeOptions(6);
        this.f41208b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        this.f41208b.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f41208b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f41208b.setCursorWidth(1.5f);
        this.f41216x.addView(this.f41208b, w7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f41208b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ud1 f39772b;

            {
                this.f39772b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        ud1 ud1Var = this.f39772b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(ud1Var.f41208b);
                            return true;
                        }
                        ud1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f39772b.f41209c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        org.telegram.ui.Components.nn nnVar = new org.telegram.ui.Components.nn(context, 27);
        this.f41214s = nnVar;
        this.f41216x.addView(nnVar, new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        this.f41216x.addView(linearLayout4, w7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f41215w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.f41215w.setTextSize(1, 18.0f);
        this.f41215w.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.f41215w.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f41215w.setMaxLines(1);
        this.f41215w.setLines(1);
        this.f41215w.setEnabled(false);
        this.f41215w.setBackgroundDrawable(null);
        this.f41215w.setPadding(0, 0, 0, 0);
        this.f41215w.setSingleLine(true);
        this.f41215w.setInputType(163840);
        this.f41215w.setImeOptions(6);
        linearLayout4.addView(this.f41215w, w7.z5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f41207a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        this.f41207a.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.f41207a.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f41207a.setMaxLines(1);
        this.f41207a.setLines(1);
        this.f41207a.setBackgroundDrawable(null);
        this.f41207a.setPadding(0, 0, 0, 0);
        this.f41207a.setSingleLine(true);
        this.f41207a.setInputType(163872);
        this.f41207a.setImeOptions(6);
        this.f41207a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        this.f41207a.setCursorColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        this.f41207a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f41207a.setCursorWidth(1.5f);
        linearLayout4.addView(this.f41207a, w7.z5.n(-1, 50));
        this.f41207a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ud1 f39772b;

            {
                this.f39772b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.v0 v0Var;
                switch (r2) {
                    case 0:
                        ud1 ud1Var = this.f39772b;
                        if (i13 == 6) {
                            AndroidUtilities.hideKeyboard(ud1Var.f41208b);
                            return true;
                        }
                        ud1Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (v0Var = this.f39772b.f41209c) != null) {
                            v0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f41207a.addTextChangedListener(new td1(this));
        if (z10) {
            this.f41207a.setOnFocusChangeListener(new rd(this, 11));
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.f41210e = e9Var;
        int i13 = R.drawable.greydivider_bottom;
        int i14 = org.telegram.ui.ActionBar.i6.f20791b7;
        e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, i13, i14));
        this.f41210e.setVisibility(8);
        this.f41210e.setBottomPadding(0);
        linearLayout2.addView(this.f41210e, w7.z5.n(-1, -2));
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
            this.f41211f = iaVar;
            linearLayout2.addView(iaVar, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(context);
            this.h = eaVar;
            eaVar.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(true));
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.z5.n(-1, -2));
            this.h.setOnClickListener(new py0(9, this, context));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f41212n = e9Var4;
            e9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            this.f41212n.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, i14));
            linearLayout2.addView(this.f41212n, w7.z5.n(-1, -2));
        } else {
            this.d.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, i14));
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f41208b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f41208b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f41207a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f41207a;
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
            if (h6Var2 == h6Var && f6Var2 == f6Var && (b2Var2 = this.f41213r) != null) {
                try {
                    b2Var2.dismiss();
                    this.f41213r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                org.telegram.ui.ActionBar.i6.t(h6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[0];
            org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) objArr[1];
            if (h6Var3 == h6Var && f6Var3 == f6Var && (b2Var = this.f41213r) != null) {
                try {
                    b2Var.dismiss();
                    this.f41213r = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20771a7));
        LinearLayout linearLayout = this.f41216x;
        int i10 = org.telegram.ui.ActionBar.i6.f20827d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(linearLayout, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f21109s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.v, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i11 = org.telegram.ui.ActionBar.i6.f20791b7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41212n, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41212n, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41210e, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41210e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21049p7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41210e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.F6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41210e, 262144, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21180w6));
        int i13 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 268435456, null, null, null, null, org.telegram.ui.ActionBar.i6.f20918i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 268435456, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41207a, 4, null, null, null, null, i13));
        EditTextBoldCursor editTextBoldCursor = this.f41207a;
        int i14 = org.telegram.ui.ActionBar.i6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41207a, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.f20956k6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41207a, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.f20974l6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41207a, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41207a, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41207a, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41208b, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41208b, 8388608, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41208b, 16777216, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41215w, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41215w, 8388608, null, null, null, null, i14));
        org.telegram.ui.Components.nn nnVar = this.f41214s;
        Paint paint = org.telegram.ui.ActionBar.i6.f20950k0;
        int i15 = org.telegram.ui.ActionBar.i6.f20828d7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(nnVar, 0, null, paint, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41214s, 1, null, org.telegram.ui.ActionBar.i6.f20950k0, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20990m3, org.telegram.ui.ActionBar.i6.f21065q3}, null, org.telegram.ui.ActionBar.i6.f21091ra));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21010n3, org.telegram.ui.ActionBar.i6.f21084r3}, null, org.telegram.ui.ActionBar.i6.f20833dc));
        org.telegram.ui.Cells.ia iaVar = this.f41211f;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.i6.f20990m3.f20582y;
        int i16 = org.telegram.ui.ActionBar.i6.ta;
        arrayList.add(new org.telegram.ui.ActionBar.k6(iaVar, 0, null, null, drawableArr, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, org.telegram.ui.ActionBar.i6.f21065q3.f20582y, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21027o3, org.telegram.ui.ActionBar.i6.f21104s3}, null, org.telegram.ui.ActionBar.i6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21027o3, org.telegram.ui.ActionBar.i6.f21104s3}, null, org.telegram.ui.ActionBar.i6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21027o3, org.telegram.ui.ActionBar.i6.f21104s3}, null, org.telegram.ui.ActionBar.i6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21027o3, org.telegram.ui.ActionBar.i6.f21104s3}, null, org.telegram.ui.ActionBar.i6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21046p3, org.telegram.ui.ActionBar.i6.f21123t3}, null, org.telegram.ui.ActionBar.i6.Ba));
        org.telegram.ui.Cells.ia iaVar2 = this.f41211f;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.i6.f21027o3.f20582y;
        int i17 = org.telegram.ui.ActionBar.i6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.k6(iaVar2, 0, null, null, drawableArr2, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, org.telegram.ui.ActionBar.i6.f21104s3.f20582y, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20869fc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.y3}, null, org.telegram.ui.ActionBar.i6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21230z3}, null, org.telegram.ui.ActionBar.i6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.A3, org.telegram.ui.ActionBar.i6.C3}, null, org.telegram.ui.ActionBar.i6.La));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.B3, org.telegram.ui.ActionBar.i6.D3}, null, org.telegram.ui.ActionBar.i6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.F3, org.telegram.ui.ActionBar.i6.G3}, null, org.telegram.ui.ActionBar.i6.f21113sc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20775ab));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20832db));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20777ad));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20868fb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21018nd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21112sb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21036od));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f41211f, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.nb));
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
            this.f41207a.requestFocus();
            AndroidUtilities.showKeyboard(this.f41207a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f41207a.requestFocus();
            AndroidUtilities.showKeyboard(this.f41207a);
        }
    }
}
