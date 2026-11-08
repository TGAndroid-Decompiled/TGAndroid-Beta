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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class y71 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public String D;
    public by0 E;
    public boolean F;
    public SpannableStringBuilder G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.j6 I;
    public final org.telegram.ui.ActionBar.h6 J;
    public final TLRPC.TL_theme K;
    public EditTextBoldCursor f52155a;
    public EditTextBoldCursor f52156b;
    public org.telegram.ui.ActionBar.r0 f52157c;
    public org.telegram.ui.Cells.z8 d;
    public org.telegram.ui.Cells.z8 f52158e;
    public org.telegram.ui.Cells.z9 f52159f;
    public org.telegram.ui.Cells.w9 h;
    public org.telegram.ui.Cells.z8 f52160n;
    public org.telegram.ui.ActionBar.u1 f52161r;
    public org.telegram.ui.Cells.n4 f52162s;
    public EditTextBoldCursor f52163w;
    public LinearLayout f52164x;
    public int f52165y;

    public y71(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i7;
        this.I = j6Var;
        this.J = h6Var;
        if (h6Var != null) {
            tL_theme = h6Var.f27534r;
        } else {
            tL_theme = j6Var.F;
        }
        this.K = tL_theme;
        if (h6Var != null) {
            i7 = h6Var.f27536t;
        } else {
            i7 = j6Var.E;
        }
        this.currentAccount = i7;
        this.H = z9;
    }

    public static void Z(y71 y71Var, int i7) {
        ConnectionsManager.getInstance(y71Var.currentAccount).cancelRequest(i7, true);
    }

    public static void a0(y71 y71Var, TLRPC.TL_theme tL_theme) {
        try {
            y71Var.f52161r.dismiss();
            y71Var.f52161r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.k6.I1(y71Var.I, y71Var.J, tL_theme, y71Var.currentAccount, false);
        y71Var.finishFragment();
    }

    public static void b0(y71 y71Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            y71Var.f52161r.dismiss();
            y71Var.f52161r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.v4.c0(y71Var.currentAccount, tL_error, y71Var, updatetheme, new Object[0]);
    }

    public static void c0(y71 y71Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        y71Var.f52165y = ConnectionsManager.getInstance(y71Var.currentAccount).sendRequest(createtheme, new n41(1, y71Var, str), 2);
    }

    public static void d0(y71 y71Var) {
        org.telegram.ui.ActionBar.j6 j6Var = y71Var.I;
        TLRPC.TL_theme tL_theme = y71Var.K;
        if (!y71Var.e0(y71Var.f52155a.getText().toString(), true) || y71Var.getParentActivity() == null) {
            return;
        }
        if (y71Var.f52156b.length() == 0) {
            org.telegram.ui.Components.v4.r0(y71Var, org.telegram.messenger.id.M0(2131744193, null), org.telegram.messenger.id.M0(2131744180, null), null);
        } else if (y71Var.H) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, y71Var.getParentActivity(), null);
            y71Var.f52161r = u1Var;
            u1Var.setOnCancelListener(new Object());
            y71Var.f52161r.show();
            String obj = y71Var.f52156b.getText().toString();
            tL_theme.title = obj;
            j6Var.f27629a = obj;
            j6Var.F.slug = y71Var.f52155a.getText().toString();
            org.telegram.ui.ActionBar.k6.x1(j6Var, true, true, true);
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
            String obj2 = y71Var.f52155a.getText().toString();
            String obj3 = y71Var.f52156b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                y71Var.finishFragment();
                return;
            }
            y71Var.f52161r = new org.telegram.ui.ActionBar.u1(3, y71Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f27027id = tL_theme.f27095id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i7 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i7 | 3;
            int sendRequest = ConnectionsManager.getInstance(y71Var.currentAccount).sendRequest(updatetheme, new n41(2, y71Var, updatetheme), 2);
            ConnectionsManager.getInstance(y71Var.currentAccount).bindRequestToGuid(sendRequest, y71Var.classGuid);
            y71Var.f52161r.setOnCancelListener(new bi.g0(y71Var, sendRequest, 8));
            y71Var.f52161r.show();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27914gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28266zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28248yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28230xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28097qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28077pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28153tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28134sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28116rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28057ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28152ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28115ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28206w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28073p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z9 = this.H;
        if (z9) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748253, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131751219, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 14));
        this.f52157c = this.actionBar.q().e(1, org.telegram.messenger.id.M0(2131751355, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27796a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new ei.b(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f52164x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.f52164x;
        int i10 = org.telegram.ui.ActionBar.k6.f27852d6;
        org.telegram.ui.ActionBar.r6.i(i10, linearLayout4, null);
        linearLayout2.addView(this.f52164x, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f52162s = n4Var;
        n4Var.setText(org.telegram.messenger.id.M0(2131749198, null));
        this.f52164x.addView(this.f52162s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f52156b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f52156b;
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor2, i11, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f52156b;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor3, i12, null);
        this.f52156b.setMaxLines(1);
        this.f52156b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f52156b;
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor4.setGravity(i7 | 16);
        this.f52156b.setBackgroundDrawable(null);
        this.f52156b.setPadding(0, 0, 0, 0);
        this.f52156b.setSingleLine(true);
        this.f52156b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f52156b.setInputType(163872);
        this.f52156b.setImeOptions(6);
        this.f52156b.setHint(org.telegram.messenger.id.M0(2131744179, null));
        org.telegram.ui.ActionBar.r6.w(this.f52156b, i12, null);
        this.f52156b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f52156b.setCursorWidth(1.5f);
        this.f52164x.addView(this.f52156b, c8.ha.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f52156b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final y71 f50970b;

            {
                this.f50970b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        y71 y71Var = this.f50970b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(y71Var.f52156b);
                            return true;
                        }
                        y71Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (r0Var = this.f50970b.f52157c) != null) {
                            r0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f52164x.addView(new org.telegram.ui.Components.tm(context, 26), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.f52164x.addView(linearLayout5, c8.ha.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f52163w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().U2 + "/addtheme/");
        this.f52163w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.f52163w, i11, null);
        org.telegram.ui.ActionBar.r6.V(this.f52163w, i12, null);
        this.f52163w.setMaxLines(1);
        this.f52163w.setLines(1);
        this.f52163w.setEnabled(false);
        this.f52163w.setBackgroundDrawable(null);
        this.f52163w.setPadding(0, 0, 0, 0);
        this.f52163w.setSingleLine(true);
        this.f52163w.setInputType(163840);
        this.f52163w.setImeOptions(6);
        linearLayout5.addView(this.f52163w, c8.ha.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f52155a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.f52155a, i11, null);
        org.telegram.ui.ActionBar.r6.V(this.f52155a, i12, null);
        this.f52155a.setMaxLines(1);
        this.f52155a.setLines(1);
        this.f52155a.setBackgroundDrawable(null);
        this.f52155a.setPadding(0, 0, 0, 0);
        this.f52155a.setSingleLine(true);
        this.f52155a.setInputType(163872);
        this.f52155a.setImeOptions(6);
        this.f52155a.setHint(org.telegram.messenger.id.M0(2131745504, null));
        org.telegram.ui.ActionBar.r6.w(this.f52155a, i12, null);
        this.f52155a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f52155a.setCursorWidth(1.5f);
        linearLayout5.addView(this.f52155a, c8.ha.o(-1, 50));
        this.f52155a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final y71 f50970b;

            {
                this.f50970b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        y71 y71Var = this.f50970b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(y71Var.f52156b);
                            return true;
                        }
                        y71Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (r0Var = this.f50970b.f52157c) != null) {
                            r0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f52155a.addTextChangedListener(new m0(this, 16));
        if (z9) {
            this.f52155a.setOnFocusChangeListener(new fd(this, 11));
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.f52158e = z8Var;
        int i13 = org.telegram.ui.ActionBar.k6.f27816b7;
        org.telegram.ui.ActionBar.r6.a0(z8Var, context, 2131231230, i13);
        this.f52158e.setVisibility(8);
        this.f52158e.setBottomPadding(0);
        linearLayout2.addView(this.f52158e, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
        this.d = z8Var2;
        z8Var2.getTextView().setMovementMethod(new org.telegram.messenger.c0(3));
        org.telegram.ui.ActionBar.r6.D(this.d.getTextView(), org.telegram.ui.ActionBar.k6.K6, null);
        if (z9) {
            this.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744188, null)));
        } else {
            org.telegram.ui.Cells.z8 z8Var3 = this.d;
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744147, null));
            this.G = X2;
            z8Var3.setText(X2);
        }
        linearLayout2.addView(this.d, c8.ha.o(-1, -2));
        if (z9) {
            org.telegram.ui.ActionBar.r6.a0(this.d, context, 2131231229, i13);
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, this.parentLayout, 1);
            this.f52159f = z9Var;
            linearLayout2.addView(z9Var, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.h = w9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27944i6);
            w9Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(w9Var, N0, N, N2, null);
            this.h.b(org.telegram.messenger.id.M0(2131743802, null), false);
            linearLayout2.addView(this.h, c8.ha.o(-1, -2));
            this.h.setOnClickListener(new fk0(14, this, context));
            org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
            this.f52160n = z8Var4;
            z8Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743801, null)));
            org.telegram.ui.ActionBar.r6.a0(this.f52160n, context, 2131231230, i13);
            linearLayout2.addView(this.f52160n, c8.ha.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.r6.a0(this.d, context, 2131231230, i13);
        }
        TLRPC.TL_theme tL_theme = this.K;
        if (tL_theme != null) {
            this.F = true;
            this.f52156b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f52156b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f52155a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f52155a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.F = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.u1 u1Var;
        org.telegram.ui.ActionBar.u1 u1Var2;
        int i11 = org.telegram.messenger.qs.M2;
        org.telegram.ui.ActionBar.h6 h6Var = this.J;
        org.telegram.ui.ActionBar.j6 j6Var = this.I;
        if (i7 == i11) {
            org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (j6Var2 == j6Var && h6Var2 == h6Var && (u1Var2 = this.f52161r) != null) {
                try {
                    u1Var2.dismiss();
                    this.f52161r = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.k6.u(j6Var, true, false);
                finishFragment();
            }
        } else if (i7 == org.telegram.messenger.qs.N2) {
            org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (j6Var3 == j6Var && h6Var3 == h6Var && (u1Var = this.f52161r) != null) {
                try {
                    u1Var.dismiss();
                    this.f52161r = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    public final boolean e0(String str, boolean z9) {
        by0 by0Var = this.E;
        if (by0Var != null) {
            org.telegram.messenger.g0.r(by0Var);
            this.E = null;
            this.D = null;
            if (this.f52165y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f52165y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z9) {
                            org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.id.M0(2131744193, null), org.telegram.messenger.id.M0(2131745505, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.k6.f28073p7, org.telegram.messenger.id.M0(2131745505, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z9) {
                            org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.id.M0(2131744193, null), org.telegram.messenger.id.M0(2131745508, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.k6.f28073p7, org.telegram.messenger.id.M0(2131745508, null));
                        return false;
                    }
                }
            } else {
                f0(org.telegram.ui.ActionBar.k6.f28073p7, org.telegram.messenger.id.M0(2131745508, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z9) {
                    org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.id.M0(2131744193, null), org.telegram.messenger.id.M0(2131745507, null), null);
                    return false;
                }
                f0(org.telegram.ui.ActionBar.k6.f28073p7, org.telegram.messenger.id.M0(2131745507, null));
                return false;
            }
            if (!z9) {
                TLRPC.TL_theme tL_theme = this.K;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    f0(org.telegram.ui.ActionBar.k6.f28206w6, org.telegram.messenger.id.a0("SetUrlAvailable", null, 2131745511, str));
                    return true;
                }
                f0(org.telegram.ui.ActionBar.k6.F6, org.telegram.messenger.id.M0(2131745510, null));
                this.D = str;
                by0 by0Var2 = new by0(15, this, str);
                this.E = by0Var2;
                org.telegram.messenger.g0.i3(by0Var2, 300L);
            }
            return true;
        } else if (z9) {
            org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.id.M0(2131744193, null), org.telegram.messenger.id.M0(2131745506, null), null);
            return false;
        } else {
            f0(org.telegram.ui.ActionBar.k6.f28073p7, org.telegram.messenger.id.M0(2131745506, null));
            return false;
        }
    }

    public final void f0(int i7, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z9 = this.H;
        if (isEmpty) {
            this.f52158e.setVisibility(8);
            if (z9) {
                org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.k6.f27816b7);
                return;
            } else {
                org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.k6.f27816b7);
                return;
            }
        }
        this.f52158e.setVisibility(0);
        this.f52158e.setText(str);
        this.f52158e.setTag(Integer.valueOf(i7));
        this.f52158e.setTextColorByKey(i7);
        if (z9) {
            org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.k6.f27816b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52155a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27981k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52155a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27999l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27822be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27913gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27842ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52159f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27821bc));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.N2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.M2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.N2);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.qp.e1().getBoolean("view_animations", true) && this.H) {
            this.f52155a.requestFocus();
            org.telegram.messenger.g0.K3(this.f52155a);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.f52156b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f52155a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9 && !this.H) {
            this.f52155a.requestFocus();
            org.telegram.messenger.g0.K3(this.f52155a);
        }
    }
}
