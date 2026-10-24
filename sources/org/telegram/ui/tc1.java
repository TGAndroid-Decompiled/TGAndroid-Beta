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
import java.util.HashSet;
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
    public n71 E;
    public boolean F;
    public SpannableStringBuilder G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.j6 I;
    public final org.telegram.ui.ActionBar.i6 J;
    public final TLRPC.TL_theme K;
    public EditTextBoldCursor f41995a;
    public EditTextBoldCursor f41996b;
    public org.telegram.ui.ActionBar.u0 f41997c;
    public org.telegram.ui.Cells.e9 d;
    public org.telegram.ui.Cells.e9 e;
    public org.telegram.ui.Cells.ga f41998f;
    public org.telegram.ui.Cells.ca h;
    public org.telegram.ui.Cells.e9 f41999n;
    public org.telegram.ui.ActionBar.c2 f42000r;
    public org.telegram.ui.Cells.l4 f42001s;
    public EditTextBoldCursor v;
    public LinearLayout f42002w;
    public int f42003x;
    public String f42004y;

    public tc1(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i10;
        this.I = j6Var;
        this.J = i6Var;
        if (i6Var != null) {
            tL_theme = i6Var.f20979r;
        } else {
            tL_theme = j6Var.F;
        }
        this.K = tL_theme;
        if (i6Var != null) {
            i10 = i6Var.f20981t;
        } else {
            i10 = j6Var.E;
        }
        this.currentAccount = i10;
        this.H = z10;
    }

    public static void V(tc1 tc1Var, TLRPC.TL_theme tL_theme) {
        try {
            tc1Var.f42000r.dismiss();
            tc1Var.f42000r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.k6.F1(tc1Var.I, tc1Var.J, tL_theme, tc1Var.currentAccount, false);
        tc1Var.finishFragment();
    }

    public static void W(tc1 tc1Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            tc1Var.f42000r.dismiss();
            tc1Var.f42000r = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.Components.d5.e0(tc1Var.currentAccount, tL_error, tc1Var, updatetheme, new Object[0]);
    }

    public static void X(tc1 tc1Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        tc1Var.f42003x = ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(createtheme, new p71(2, tc1Var, str), 2);
    }

    public static void Y(tc1 tc1Var) {
        org.telegram.ui.ActionBar.j6 j6Var = tc1Var.I;
        TLRPC.TL_theme tL_theme = tc1Var.K;
        if (!tc1Var.Z(tc1Var.f41995a.getText().toString(), true) || tc1Var.getParentActivity() == null) {
            return;
        }
        if (tc1Var.f41996b.length() == 0) {
            org.telegram.ui.Components.d5.t0(tc1Var, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.ThemeNameInvalid), null);
        } else if (tc1Var.H) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(tc1Var.getParentActivity(), 3, null);
            tc1Var.f42000r = c2Var;
            c2Var.setOnCancelListener(new Object());
            tc1Var.f42000r.show();
            String obj = tc1Var.f41996b.getText().toString();
            tL_theme.title = obj;
            j6Var.f21020a = obj;
            j6Var.F.slug = tc1Var.f41995a.getText().toString();
            org.telegram.ui.ActionBar.k6.u1(j6Var, true, true, true);
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
            String obj2 = tc1Var.f41995a.getText().toString();
            String obj3 = tc1Var.f41996b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                tc1Var.finishFragment();
                return;
            }
            tc1Var.f42000r = new org.telegram.ui.ActionBar.c2(tc1Var.getParentActivity(), 3, null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f20415id = tL_theme.f20481id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i10 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i10 | 3;
            int sendRequest = ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(updatetheme, new p71(3, tc1Var, updatetheme), 2);
            ConnectionsManager.getInstance(tc1Var.currentAccount).bindRequestToGuid(sendRequest, tc1Var.classGuid);
            tc1Var.f42000r.setOnCancelListener(new ai.e0(tc1Var, sendRequest, 9));
            tc1Var.f42000r.show();
        }
    }

    public final boolean Z(String str, boolean z10) {
        n71 n71Var = this.E;
        if (n71Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n71Var);
            this.E = null;
            this.f42004y = null;
            if (this.f42003x != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f42003x, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (i10 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.d5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidStartNumber), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.k6.f21405p7, LocaleController.getString(R.string.SetUrlInvalidStartNumber));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.d5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalid), null);
                            return false;
                        }
                        a0(org.telegram.ui.ActionBar.k6.f21405p7, LocaleController.getString(R.string.SetUrlInvalid));
                        return false;
                    }
                }
            } else {
                a0(org.telegram.ui.ActionBar.k6.f21405p7, LocaleController.getString(R.string.SetUrlInvalid));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.d5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidLong), null);
                    return false;
                }
                a0(org.telegram.ui.ActionBar.k6.f21405p7, LocaleController.getString(R.string.SetUrlInvalidLong));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.K;
                if (str.equals((tL_theme == null || (r9 = tL_theme.slug) == null) ? "" : "")) {
                    a0(org.telegram.ui.ActionBar.k6.f21536w6, LocaleController.formatString("SetUrlAvailable", R.string.SetUrlAvailable, str));
                    return true;
                }
                a0(org.telegram.ui.ActionBar.k6.F6, LocaleController.getString(R.string.SetUrlChecking));
                this.f42004y = str;
                n71 n71Var2 = new n71(8, this, str);
                this.E = n71Var2;
                AndroidUtilities.runOnUIThread(n71Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.d5.t0(this, LocaleController.getString(R.string.Theme), LocaleController.getString(R.string.SetUrlInvalidShort), null);
            return false;
        } else {
            a0(org.telegram.ui.ActionBar.k6.f21405p7, LocaleController.getString(R.string.SetUrlInvalidShort));
            return false;
        }
    }

    public final void a0(int i10, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.H;
        if (isEmpty) {
            this.e.setVisibility(8);
            if (z10) {
                org.telegram.ui.Cells.e9 e9Var = this.d;
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21146b7, getParentActivity(), e9Var, null);
                return;
            }
            org.telegram.ui.Cells.e9 e9Var2 = this.d;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21146b7, getParentActivity(), e9Var2, null);
            return;
        }
        this.e.setVisibility(0);
        this.e.setText(str);
        this.e.setTag(Integer.valueOf(i10));
        this.e.setTextColorByKey(i10);
        if (z10) {
            org.telegram.ui.Cells.e9 e9Var3 = this.d;
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_top, org.telegram.ui.ActionBar.k6.f21146b7, getParentActivity(), e9Var3, null);
            return;
        }
        this.d.setBackgroundDrawable(null);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21467sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21484ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21189dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21445ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21536w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21405p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.H;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewThemeTitle));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditThemeTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new b31(this, 7));
        this.f41997c = this.actionBar.m().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new di.d(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f42002w = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.f42002w;
        int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.r6.i(i11, linearLayout4, null);
        linearLayout2.addView(this.f42002w, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, 23);
        this.f42001s = l4Var;
        l4Var.setText(LocaleController.getString(R.string.Info));
        this.f42002w.addView(this.f42001s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f41996b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f41996b;
        int i12 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.F(editTextBoldCursor2, i12, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f41996b;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor3, i13, null);
        this.f41996b.setMaxLines(1);
        this.f41996b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f41996b;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor4.setGravity(i10 | 16);
        this.f41996b.setBackgroundDrawable(null);
        this.f41996b.setPadding(0, 0, 0, 0);
        this.f41996b.setSingleLine(true);
        this.f41996b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f41996b.setInputType(163872);
        this.f41996b.setImeOptions(6);
        this.f41996b.setHint(LocaleController.getString(R.string.ThemeNamePlaceholder));
        org.telegram.ui.ActionBar.r6.x(this.f41996b, i13, null);
        this.f41996b.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f41996b.setCursorWidth(1.5f);
        this.f42002w.addView(this.f41996b, w7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f41996b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final tc1 f40779b;

            {
                this.f40779b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        tc1 tc1Var = this.f40779b;
                        if (i14 == 6) {
                            AndroidUtilities.hideKeyboard(tc1Var.f41996b);
                            return true;
                        }
                        tc1Var.getClass();
                        return false;
                    default:
                        if (i14 == 6 && (u0Var = this.f40779b.f41997c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f42002w.addView(new org.telegram.ui.Components.sn(context, 27), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.f42002w.addView(linearLayout5, w7.z5.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.v = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().linkPrefix + "/addtheme/");
        this.v.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.F(this.v, i12, null);
        org.telegram.ui.ActionBar.r6.W(this.v, i13, null);
        this.v.setMaxLines(1);
        this.v.setLines(1);
        this.v.setEnabled(false);
        this.v.setBackgroundDrawable(null);
        this.v.setPadding(0, 0, 0, 0);
        this.v.setSingleLine(true);
        this.v.setInputType(163840);
        this.v.setImeOptions(6);
        linearLayout5.addView(this.v, w7.z5.n(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f41995a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.F(this.f41995a, i12, null);
        org.telegram.ui.ActionBar.r6.W(this.f41995a, i13, null);
        this.f41995a.setMaxLines(1);
        this.f41995a.setLines(1);
        this.f41995a.setBackgroundDrawable(null);
        this.f41995a.setPadding(0, 0, 0, 0);
        this.f41995a.setSingleLine(true);
        this.f41995a.setInputType(163872);
        this.f41995a.setImeOptions(6);
        this.f41995a.setHint(LocaleController.getString(R.string.SetUrlPlaceholder));
        org.telegram.ui.ActionBar.r6.x(this.f41995a, i13, null);
        this.f41995a.setCursorSize(AndroidUtilities.dp(20.0f));
        this.f41995a.setCursorWidth(1.5f);
        linearLayout5.addView(this.f41995a, w7.z5.n(-1, 50));
        this.f41995a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final tc1 f40779b;

            {
                this.f40779b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (r2) {
                    case 0:
                        tc1 tc1Var = this.f40779b;
                        if (i14 == 6) {
                            AndroidUtilities.hideKeyboard(tc1Var.f41996b);
                            return true;
                        }
                        tc1Var.getClass();
                        return false;
                    default:
                        if (i14 == 6 && (u0Var = this.f40779b.f41997c) != null) {
                            u0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f41995a.addTextChangedListener(new sc1(this));
        if (z10) {
            this.f41995a.setOnFocusChangeListener(new pd(this, 11));
        }
        org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
        this.e = e9Var;
        int i14 = R.drawable.greydivider_bottom;
        int i15 = org.telegram.ui.ActionBar.k6.f21146b7;
        org.telegram.ui.ActionBar.r6.b0(i14, i15, context, e9Var, null);
        this.e.setVisibility(8);
        this.e.setBottomPadding(0);
        linearLayout2.addView(this.e, w7.z5.n(-1, -2));
        org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context);
        this.d = e9Var2;
        e9Var2.getTextView().setMovementMethod(new org.telegram.ui.Components.wv(2));
        org.telegram.ui.ActionBar.r6.E(this.d.getTextView(), org.telegram.ui.ActionBar.k6.K6, null);
        if (z10) {
            this.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
        } else {
            org.telegram.ui.Cells.e9 e9Var3 = this.d;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeSetUrlHelp));
            this.G = replaceTags;
            e9Var3.setText(replaceTags);
        }
        linearLayout2.addView(this.d, w7.z5.n(-1, -2));
        if (z10) {
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, i15, context, this.d, null);
            org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, this.parentLayout, 1);
            this.f41998f = gaVar;
            linearLayout2.addView(gaVar, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
            this.h = caVar;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(true);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21273i6);
            caVar.setBackground(M0);
            org.telegram.ui.ActionBar.r6.k(caVar, M0, O, O2, null);
            this.h.b(LocaleController.getString(R.string.UseDifferentTheme), false);
            linearLayout2.addView(this.h, w7.z5.n(-1, -2));
            this.h.setOnClickListener(new zd0(20, this, context));
            org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context);
            this.f41999n = e9Var4;
            e9Var4.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UseDifferentThemeInfo)));
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, i15, context, this.f41999n, null);
            linearLayout2.addView(this.f41999n, w7.z5.n(-1, -2));
        } else {
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, i15, context, this.d, null);
        }
        TLRPC.TL_theme tL_theme = this.K;
        if (tL_theme != null) {
            this.F = true;
            this.f41996b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f41996b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f41995a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f41995a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.F = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.ActionBar.c2 c2Var;
        org.telegram.ui.ActionBar.c2 c2Var2;
        int i12 = NotificationCenter.themeUploadedToServer;
        org.telegram.ui.ActionBar.i6 i6Var = this.J;
        org.telegram.ui.ActionBar.j6 j6Var = this.I;
        if (i10 == i12) {
            org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[1];
            if (j6Var2 == j6Var && i6Var2 == i6Var && (c2Var2 = this.f42000r) != null) {
                try {
                    c2Var2.dismiss();
                    this.f42000r = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                org.telegram.ui.ActionBar.k6.t(j6Var, true, false);
                finishFragment();
            }
        } else if (i10 == NotificationCenter.themeUploadError) {
            org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) objArr[1];
            if (j6Var3 == j6Var && i6Var3 == i6Var && (c2Var = this.f42000r) != null) {
                try {
                    c2Var.dismiss();
                    this.f42000r = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41995a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21311k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41995a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21328l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21206ec));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21130ab));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21170cb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.db));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21132ad));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21224fb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21374nd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21466sb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21392od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41998f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21372nb));
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
        if (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && this.H) {
            this.f41995a.requestFocus();
            AndroidUtilities.showKeyboard(this.f41995a);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.f41996b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f41995a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.H) {
            this.f41995a.requestFocus();
            AndroidUtilities.showKeyboard(this.f41995a);
        }
    }
}
