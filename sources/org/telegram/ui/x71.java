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
public final class x71 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public String D;
    public by0 E;
    public boolean F;
    public SpannableStringBuilder G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.j6 I;
    public final org.telegram.ui.ActionBar.h6 J;
    public final TLRPC.TL_theme K;
    public EditTextBoldCursor f51789a;
    public EditTextBoldCursor f51790b;
    public org.telegram.ui.ActionBar.r0 f51791c;
    public org.telegram.ui.Cells.z8 d;
    public org.telegram.ui.Cells.z8 f51792e;
    public org.telegram.ui.Cells.z9 f51793f;
    public org.telegram.ui.Cells.w9 h;
    public org.telegram.ui.Cells.z8 f51794n;
    public org.telegram.ui.ActionBar.u1 f51795r;
    public org.telegram.ui.Cells.n4 f51796s;
    public EditTextBoldCursor f51797w;
    public LinearLayout f51798x;
    public int f51799y;

    public x71(org.telegram.ui.ActionBar.j6 j6Var, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i7;
        this.I = j6Var;
        this.J = h6Var;
        if (h6Var != null) {
            tL_theme = h6Var.f27530r;
        } else {
            tL_theme = j6Var.F;
        }
        this.K = tL_theme;
        if (h6Var != null) {
            i7 = h6Var.f27532t;
        } else {
            i7 = j6Var.E;
        }
        this.currentAccount = i7;
        this.H = z9;
    }

    public static void Z(x71 x71Var, int i7) {
        ConnectionsManager.getInstance(x71Var.currentAccount).cancelRequest(i7, true);
    }

    public static void a0(x71 x71Var, TLRPC.TL_theme tL_theme) {
        try {
            x71Var.f51795r.dismiss();
            x71Var.f51795r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.k6.I1(x71Var.I, x71Var.J, tL_theme, x71Var.currentAccount, false);
        x71Var.finishFragment();
    }

    public static void b0(x71 x71Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            x71Var.f51795r.dismiss();
            x71Var.f51795r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.v4.c0(x71Var.currentAccount, tL_error, x71Var, updatetheme, new Object[0]);
    }

    public static void c0(x71 x71Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        x71Var.f51799y = ConnectionsManager.getInstance(x71Var.currentAccount).sendRequest(createtheme, new n41(1, x71Var, str), 2);
    }

    public static void d0(x71 x71Var) {
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.I;
        TLRPC.TL_theme tL_theme = x71Var.K;
        if (!x71Var.e0(x71Var.f51789a.getText().toString(), true) || x71Var.getParentActivity() == null) {
            return;
        }
        if (x71Var.f51790b.length() == 0) {
            org.telegram.ui.Components.v4.r0(x71Var, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131744178, null), null);
        } else if (x71Var.H) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, x71Var.getParentActivity(), null);
            x71Var.f51795r = u1Var;
            u1Var.setOnCancelListener(new Object());
            x71Var.f51795r.show();
            String obj = x71Var.f51790b.getText().toString();
            tL_theme.title = obj;
            j6Var.f27625a = obj;
            j6Var.F.slug = x71Var.f51789a.getText().toString();
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
            String obj2 = x71Var.f51789a.getText().toString();
            String obj3 = x71Var.f51790b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                x71Var.finishFragment();
                return;
            }
            x71Var.f51795r = new org.telegram.ui.ActionBar.u1(3, x71Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f27023id = tL_theme.f27091id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i7 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i7 | 3;
            int sendRequest = ConnectionsManager.getInstance(x71Var.currentAccount).sendRequest(updatetheme, new n41(2, x71Var, updatetheme), 2);
            ConnectionsManager.getInstance(x71Var.currentAccount).bindRequestToGuid(sendRequest, x71Var.classGuid);
            x71Var.f51795r.setOnCancelListener(new bi.g0(x71Var, sendRequest, 8));
            x71Var.f51795r.show();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27910gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28262zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28244yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28226xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28093qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28073pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28149tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28130sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28112rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28053ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28148ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28111ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28202w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28069p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z9 = this.H;
        if (z9) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748251, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131751219, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 14));
        this.f51791c = this.actionBar.q().e(1, org.telegram.messenger.hd.M0(2131751355, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27792a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new ei.b(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f51798x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.f51798x;
        int i10 = org.telegram.ui.ActionBar.k6.f27848d6;
        org.telegram.ui.ActionBar.r6.i(i10, linearLayout4, null);
        linearLayout2.addView(this.f51798x, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f51796s = n4Var;
        n4Var.setText(org.telegram.messenger.hd.M0(2131749196, null));
        this.f51798x.addView(this.f51796s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f51790b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f51790b;
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor2, i11, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f51790b;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor3, i12, null);
        this.f51790b.setMaxLines(1);
        this.f51790b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f51790b;
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor4.setGravity(i7 | 16);
        this.f51790b.setBackgroundDrawable(null);
        this.f51790b.setPadding(0, 0, 0, 0);
        this.f51790b.setSingleLine(true);
        this.f51790b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f51790b.setInputType(163872);
        this.f51790b.setImeOptions(6);
        this.f51790b.setHint(org.telegram.messenger.hd.M0(2131744177, null));
        org.telegram.ui.ActionBar.r6.w(this.f51790b, i12, null);
        this.f51790b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f51790b.setCursorWidth(1.5f);
        this.f51798x.addView(this.f51790b, c8.ha.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f51790b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final x71 f50607b;

            {
                this.f50607b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        x71 x71Var = this.f50607b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(x71Var.f51790b);
                            return true;
                        }
                        x71Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (r0Var = this.f50607b.f51791c) != null) {
                            r0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f51798x.addView(new org.telegram.ui.Components.tm(context, 26), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.f51798x.addView(linearLayout5, c8.ha.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f51797w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().U2 + "/addtheme/");
        this.f51797w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.f51797w, i11, null);
        org.telegram.ui.ActionBar.r6.V(this.f51797w, i12, null);
        this.f51797w.setMaxLines(1);
        this.f51797w.setLines(1);
        this.f51797w.setEnabled(false);
        this.f51797w.setBackgroundDrawable(null);
        this.f51797w.setPadding(0, 0, 0, 0);
        this.f51797w.setSingleLine(true);
        this.f51797w.setInputType(163840);
        this.f51797w.setImeOptions(6);
        linearLayout5.addView(this.f51797w, c8.ha.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f51789a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.E(this.f51789a, i11, null);
        org.telegram.ui.ActionBar.r6.V(this.f51789a, i12, null);
        this.f51789a.setMaxLines(1);
        this.f51789a.setLines(1);
        this.f51789a.setBackgroundDrawable(null);
        this.f51789a.setPadding(0, 0, 0, 0);
        this.f51789a.setSingleLine(true);
        this.f51789a.setInputType(163872);
        this.f51789a.setImeOptions(6);
        this.f51789a.setHint(org.telegram.messenger.hd.M0(2131745502, null));
        org.telegram.ui.ActionBar.r6.w(this.f51789a, i12, null);
        this.f51789a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f51789a.setCursorWidth(1.5f);
        linearLayout5.addView(this.f51789a, c8.ha.o(-1, 50));
        this.f51789a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final x71 f50607b;

            {
                this.f50607b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        x71 x71Var = this.f50607b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(x71Var.f51790b);
                            return true;
                        }
                        x71Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (r0Var = this.f50607b.f51791c) != null) {
                            r0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f51789a.addTextChangedListener(new m0(this, 16));
        if (z9) {
            this.f51789a.setOnFocusChangeListener(new fd(this, 11));
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.f51792e = z8Var;
        int i13 = org.telegram.ui.ActionBar.k6.f27812b7;
        org.telegram.ui.ActionBar.r6.a0(z8Var, context, 2131231230, i13);
        this.f51792e.setVisibility(8);
        this.f51792e.setBottomPadding(0);
        linearLayout2.addView(this.f51792e, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
        this.d = z8Var2;
        z8Var2.getTextView().setMovementMethod(new org.telegram.messenger.c0(3));
        org.telegram.ui.ActionBar.r6.D(this.d.getTextView(), org.telegram.ui.ActionBar.k6.K6, null);
        if (z9) {
            this.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744186, null)));
        } else {
            org.telegram.ui.Cells.z8 z8Var3 = this.d;
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744145, null));
            this.G = X2;
            z8Var3.setText(X2);
        }
        linearLayout2.addView(this.d, c8.ha.o(-1, -2));
        if (z9) {
            org.telegram.ui.ActionBar.r6.a0(this.d, context, 2131231229, i13);
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, this.parentLayout, 1);
            this.f51793f = z9Var;
            linearLayout2.addView(z9Var, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.h = w9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27940i6);
            w9Var.setBackground(N0);
            org.telegram.ui.ActionBar.r6.k(w9Var, N0, N, N2, null);
            this.h.b(org.telegram.messenger.hd.M0(2131743800, null), false);
            linearLayout2.addView(this.h, c8.ha.o(-1, -2));
            this.h.setOnClickListener(new fk0(14, this, context));
            org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
            this.f51794n = z8Var4;
            z8Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131743799, null)));
            org.telegram.ui.ActionBar.r6.a0(this.f51794n, context, 2131231230, i13);
            linearLayout2.addView(this.f51794n, c8.ha.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.r6.a0(this.d, context, 2131231230, i13);
        }
        TLRPC.TL_theme tL_theme = this.K;
        if (tL_theme != null) {
            this.F = true;
            this.f51790b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f51790b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f51789a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f51789a;
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
            if (j6Var2 == j6Var && h6Var2 == h6Var && (u1Var2 = this.f51795r) != null) {
                try {
                    u1Var2.dismiss();
                    this.f51795r = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.k6.u(j6Var, true, false);
                finishFragment();
            }
        } else if (i7 == org.telegram.messenger.qs.N2) {
            org.telegram.ui.ActionBar.j6 j6Var3 = (org.telegram.ui.ActionBar.j6) objArr[0];
            org.telegram.ui.ActionBar.h6 h6Var3 = (org.telegram.ui.ActionBar.h6) objArr[1];
            if (j6Var3 == j6Var && h6Var3 == h6Var && (u1Var = this.f51795r) != null) {
                try {
                    u1Var.dismiss();
                    this.f51795r = null;
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
            if (this.f51799y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f51799y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z9) {
                            org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131745503, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.k6.f28069p7, org.telegram.messenger.hd.M0(2131745503, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z9) {
                            org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131745506, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.k6.f28069p7, org.telegram.messenger.hd.M0(2131745506, null));
                        return false;
                    }
                }
            } else {
                f0(org.telegram.ui.ActionBar.k6.f28069p7, org.telegram.messenger.hd.M0(2131745506, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z9) {
                    org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131745505, null), null);
                    return false;
                }
                f0(org.telegram.ui.ActionBar.k6.f28069p7, org.telegram.messenger.hd.M0(2131745505, null));
                return false;
            }
            if (!z9) {
                TLRPC.TL_theme tL_theme = this.K;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    f0(org.telegram.ui.ActionBar.k6.f28202w6, org.telegram.messenger.hd.a0("SetUrlAvailable", null, 2131745509, str));
                    return true;
                }
                f0(org.telegram.ui.ActionBar.k6.F6, org.telegram.messenger.hd.M0(2131745508, null));
                this.D = str;
                by0 by0Var2 = new by0(15, this, str);
                this.E = by0Var2;
                org.telegram.messenger.g0.i3(by0Var2, 300L);
            }
            return true;
        } else if (z9) {
            org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.hd.M0(2131744191, null), org.telegram.messenger.hd.M0(2131745504, null), null);
            return false;
        } else {
            f0(org.telegram.ui.ActionBar.k6.f28069p7, org.telegram.messenger.hd.M0(2131745504, null));
            return false;
        }
    }

    public final void f0(int i7, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z9 = this.H;
        if (isEmpty) {
            this.f51792e.setVisibility(8);
            if (z9) {
                org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.k6.f27812b7);
                return;
            } else {
                org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.k6.f27812b7);
                return;
            }
        }
        this.f51792e.setVisibility(0);
        this.f51792e.setText(str);
        this.f51792e.setTag(Integer.valueOf(i7));
        this.f51792e.setTextColorByKey(i7);
        if (z9) {
            org.telegram.ui.ActionBar.r6.a0(this.d, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.k6.f27812b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51789a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27977k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51789a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27995l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27818be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27909gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27838ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51793f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27817bc));
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
            this.f51789a.requestFocus();
            org.telegram.messenger.g0.K3(this.f51789a);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.f51790b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f51789a;
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
            this.f51789a.requestFocus();
            org.telegram.messenger.g0.K3(this.f51789a);
        }
    }
}
