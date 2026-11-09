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
public final class z71 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public String D;
    public ax0 E;
    public boolean F;
    public SpannableStringBuilder G;
    public final boolean H;
    public final org.telegram.ui.ActionBar.k6 I;
    public final org.telegram.ui.ActionBar.i6 J;
    public final TLRPC.TL_theme K;
    public EditTextBoldCursor f52457a;
    public EditTextBoldCursor f52458b;
    public org.telegram.ui.ActionBar.r0 f52459c;
    public org.telegram.ui.Cells.z8 d;
    public org.telegram.ui.Cells.z8 f52460e;
    public org.telegram.ui.Cells.z9 f52461f;
    public org.telegram.ui.Cells.w9 h;
    public org.telegram.ui.Cells.z8 f52462n;
    public org.telegram.ui.ActionBar.u1 f52463r;
    public org.telegram.ui.Cells.n4 f52464s;
    public EditTextBoldCursor f52465w;
    public LinearLayout f52466x;
    public int f52467y;

    public z71(org.telegram.ui.ActionBar.k6 k6Var, org.telegram.ui.ActionBar.i6 i6Var, boolean z9) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i7;
        this.I = k6Var;
        this.J = i6Var;
        if (i6Var != null) {
            tL_theme = i6Var.f27586r;
        } else {
            tL_theme = k6Var.F;
        }
        this.K = tL_theme;
        if (i6Var != null) {
            i7 = i6Var.f27588t;
        } else {
            i7 = k6Var.E;
        }
        this.currentAccount = i7;
        this.H = z9;
    }

    public static void Z(z71 z71Var, int i7) {
        ConnectionsManager.getInstance(z71Var.currentAccount).cancelRequest(i7, true);
    }

    public static void a0(z71 z71Var, TLRPC.TL_theme tL_theme) {
        try {
            z71Var.f52463r.dismiss();
            z71Var.f52463r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.l6.I1(z71Var.I, z71Var.J, tL_theme, z71Var.currentAccount, false);
        z71Var.finishFragment();
    }

    public static void b0(z71 z71Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            z71Var.f52463r.dismiss();
            z71Var.f52463r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.v4.c0(z71Var.currentAccount, tL_error, z71Var, updatetheme, new Object[0]);
    }

    public static void c0(z71 z71Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        z71Var.f52467y = ConnectionsManager.getInstance(z71Var.currentAccount).sendRequest(createtheme, new o41(1, z71Var, str), 2);
    }

    public static void d0(z71 z71Var) {
        org.telegram.ui.ActionBar.k6 k6Var = z71Var.I;
        TLRPC.TL_theme tL_theme = z71Var.K;
        if (!z71Var.e0(z71Var.f52457a.getText().toString(), true) || z71Var.getParentActivity() == null) {
            return;
        }
        if (z71Var.f52458b.length() == 0) {
            org.telegram.ui.Components.v4.r0(z71Var, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131744177, null), null);
        } else if (z71Var.H) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, z71Var.getParentActivity(), null);
            z71Var.f52463r = u1Var;
            u1Var.setOnCancelListener(new Object());
            z71Var.f52463r.show();
            String obj = z71Var.f52458b.getText().toString();
            tL_theme.title = obj;
            k6Var.f27736a = obj;
            k6Var.F.slug = z71Var.f52457a.getText().toString();
            org.telegram.ui.ActionBar.l6.x1(k6Var, true, true, true);
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
            String obj2 = z71Var.f52457a.getText().toString();
            String obj3 = z71Var.f52458b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                z71Var.finishFragment();
                return;
            }
            z71Var.f52463r = new org.telegram.ui.ActionBar.u1(3, z71Var.getParentActivity(), null);
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
            int sendRequest = ConnectionsManager.getInstance(z71Var.currentAccount).sendRequest(updatetheme, new o41(2, z71Var, updatetheme), 2);
            ConnectionsManager.getInstance(z71Var.currentAccount).bindRequestToGuid(sendRequest, z71Var.classGuid);
            z71Var.f52463r.setOnCancelListener(new bi.g0(z71Var, sendRequest, 8));
            z71Var.f52463r.show();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27927gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28279zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28261yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28243xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28110qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28090pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28166tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28147sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28129rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28070ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28165ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28128ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28219w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28086p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z9 = this.H;
        if (z9) {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131748252, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.id.M0(2131751218, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new pt0(this, 14));
        this.f52459c = this.actionBar.r().e(1, org.telegram.messenger.id.M0(2131751354, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27809a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new ei.b(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f52466x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.f52466x;
        int i10 = org.telegram.ui.ActionBar.l6.f27865d6;
        org.telegram.ui.ActionBar.s6.h(i10, linearLayout4, null);
        linearLayout2.addView(this.f52466x, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f52464s = n4Var;
        n4Var.setText(org.telegram.messenger.id.M0(2131749197, null));
        this.f52466x.addView(this.f52464s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f52458b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f52458b;
        int i11 = org.telegram.ui.ActionBar.l6.H6;
        org.telegram.ui.ActionBar.s6.D(editTextBoldCursor2, i11, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f52458b;
        int i12 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.U(editTextBoldCursor3, i12, null);
        this.f52458b.setMaxLines(1);
        this.f52458b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f52458b;
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor4.setGravity(i7 | 16);
        this.f52458b.setBackgroundDrawable(null);
        this.f52458b.setPadding(0, 0, 0, 0);
        this.f52458b.setSingleLine(true);
        this.f52458b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f52458b.setInputType(163872);
        this.f52458b.setImeOptions(6);
        this.f52458b.setHint(org.telegram.messenger.id.M0(2131744176, null));
        org.telegram.ui.ActionBar.s6.v(this.f52458b, i12, null);
        this.f52458b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f52458b.setCursorWidth(1.5f);
        this.f52466x.addView(this.f52458b, c8.ha.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f52458b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final z71 f51590b;

            {
                this.f51590b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        z71 z71Var = this.f51590b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(z71Var.f52458b);
                            return true;
                        }
                        z71Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (r0Var = this.f51590b.f52459c) != null) {
                            r0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f52466x.addView(new org.telegram.ui.Components.tm(context, 26), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.f52466x.addView(linearLayout5, c8.ha.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f52465w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().U2 + "/addtheme/");
        this.f52465w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.s6.D(this.f52465w, i11, null);
        org.telegram.ui.ActionBar.s6.U(this.f52465w, i12, null);
        this.f52465w.setMaxLines(1);
        this.f52465w.setLines(1);
        this.f52465w.setEnabled(false);
        this.f52465w.setBackgroundDrawable(null);
        this.f52465w.setPadding(0, 0, 0, 0);
        this.f52465w.setSingleLine(true);
        this.f52465w.setInputType(163840);
        this.f52465w.setImeOptions(6);
        linearLayout5.addView(this.f52465w, c8.ha.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f52457a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.s6.D(this.f52457a, i11, null);
        org.telegram.ui.ActionBar.s6.U(this.f52457a, i12, null);
        this.f52457a.setMaxLines(1);
        this.f52457a.setLines(1);
        this.f52457a.setBackgroundDrawable(null);
        this.f52457a.setPadding(0, 0, 0, 0);
        this.f52457a.setSingleLine(true);
        this.f52457a.setInputType(163872);
        this.f52457a.setImeOptions(6);
        this.f52457a.setHint(org.telegram.messenger.id.M0(2131745501, null));
        org.telegram.ui.ActionBar.s6.v(this.f52457a, i12, null);
        this.f52457a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f52457a.setCursorWidth(1.5f);
        linearLayout5.addView(this.f52457a, c8.ha.o(-1, 50));
        this.f52457a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final z71 f51590b;

            {
                this.f51590b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (r2) {
                    case 0:
                        z71 z71Var = this.f51590b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(z71Var.f52458b);
                            return true;
                        }
                        z71Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (r0Var = this.f51590b.f52459c) != null) {
                            r0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f52457a.addTextChangedListener(new m0(this, 16));
        if (z9) {
            this.f52457a.setOnFocusChangeListener(new fd(this, 11));
        }
        org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
        this.f52460e = z8Var;
        int i13 = org.telegram.ui.ActionBar.l6.f27829b7;
        org.telegram.ui.ActionBar.s6.Z(z8Var, context, 2131231230, i13);
        this.f52460e.setVisibility(8);
        this.f52460e.setBottomPadding(0);
        linearLayout2.addView(this.f52460e, c8.ha.o(-1, -2));
        org.telegram.ui.Cells.z8 z8Var2 = new org.telegram.ui.Cells.z8(context);
        this.d = z8Var2;
        z8Var2.getTextView().setMovementMethod(new org.telegram.messenger.c0(3));
        org.telegram.ui.ActionBar.s6.C(this.d.getTextView(), org.telegram.ui.ActionBar.l6.K6, null);
        if (z9) {
            this.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744185, null)));
        } else {
            org.telegram.ui.Cells.z8 z8Var3 = this.d;
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131744144, null));
            this.G = X2;
            z8Var3.setText(X2);
        }
        linearLayout2.addView(this.d, c8.ha.o(-1, -2));
        if (z9) {
            org.telegram.ui.ActionBar.s6.Z(this.d, context, 2131231229, i13);
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, this.parentLayout, 1);
            this.f52461f = z9Var;
            linearLayout2.addView(z9Var, c8.ha.o(-1, -2));
            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(context);
            this.h = w9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.l6.N0(true);
            org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
            org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(org.telegram.ui.ActionBar.l6.f27957i6);
            w9Var.setBackground(N0);
            org.telegram.ui.ActionBar.s6.j(w9Var, N0, M, M2, null);
            this.h.b(org.telegram.messenger.id.M0(2131743799, null), false);
            linearLayout2.addView(this.h, c8.ha.o(-1, -2));
            this.h.setOnClickListener(new hk0(14, this, context));
            org.telegram.ui.Cells.z8 z8Var4 = new org.telegram.ui.Cells.z8(context);
            this.f52462n = z8Var4;
            z8Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131743798, null)));
            org.telegram.ui.ActionBar.s6.Z(this.f52462n, context, 2131231230, i13);
            linearLayout2.addView(this.f52462n, c8.ha.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.s6.Z(this.d, context, 2131231230, i13);
        }
        TLRPC.TL_theme tL_theme = this.K;
        if (tL_theme != null) {
            this.F = true;
            this.f52458b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f52458b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f52457a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f52457a;
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
        org.telegram.ui.ActionBar.i6 i6Var = this.J;
        org.telegram.ui.ActionBar.k6 k6Var = this.I;
        if (i7 == i11) {
            org.telegram.ui.ActionBar.k6 k6Var2 = (org.telegram.ui.ActionBar.k6) objArr[0];
            org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[1];
            if (k6Var2 == k6Var && i6Var2 == i6Var && (u1Var2 = this.f52463r) != null) {
                try {
                    u1Var2.dismiss();
                    this.f52463r = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.l6.u(k6Var, true, false);
                finishFragment();
            }
        } else if (i7 == org.telegram.messenger.qs.N2) {
            org.telegram.ui.ActionBar.k6 k6Var3 = (org.telegram.ui.ActionBar.k6) objArr[0];
            org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) objArr[1];
            if (k6Var3 == k6Var && i6Var3 == i6Var && (u1Var = this.f52463r) != null) {
                try {
                    u1Var.dismiss();
                    this.f52463r = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    public final boolean e0(String str, boolean z9) {
        ax0 ax0Var = this.E;
        if (ax0Var != null) {
            org.telegram.messenger.g0.r(ax0Var);
            this.E = null;
            this.D = null;
            if (this.f52467y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f52467y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z9) {
                            org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131745502, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.l6.f28086p7, org.telegram.messenger.id.M0(2131745502, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z9) {
                            org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131745505, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.l6.f28086p7, org.telegram.messenger.id.M0(2131745505, null));
                        return false;
                    }
                }
            } else {
                f0(org.telegram.ui.ActionBar.l6.f28086p7, org.telegram.messenger.id.M0(2131745505, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z9) {
                    org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131745504, null), null);
                    return false;
                }
                f0(org.telegram.ui.ActionBar.l6.f28086p7, org.telegram.messenger.id.M0(2131745504, null));
                return false;
            }
            if (!z9) {
                TLRPC.TL_theme tL_theme = this.K;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    f0(org.telegram.ui.ActionBar.l6.f28219w6, org.telegram.messenger.id.a0("SetUrlAvailable", null, 2131745508, str));
                    return true;
                }
                f0(org.telegram.ui.ActionBar.l6.F6, org.telegram.messenger.id.M0(2131745507, null));
                this.D = str;
                ax0 ax0Var2 = new ax0(16, this, str);
                this.E = ax0Var2;
                org.telegram.messenger.g0.i3(ax0Var2, 300L);
            }
            return true;
        } else if (z9) {
            org.telegram.ui.Components.v4.r0(this, org.telegram.messenger.id.M0(2131744190, null), org.telegram.messenger.id.M0(2131745503, null), null);
            return false;
        } else {
            f0(org.telegram.ui.ActionBar.l6.f28086p7, org.telegram.messenger.id.M0(2131745503, null));
            return false;
        }
    }

    public final void f0(int i7, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z9 = this.H;
        if (isEmpty) {
            this.f52460e.setVisibility(8);
            if (z9) {
                org.telegram.ui.ActionBar.s6.Z(this.d, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.l6.f27829b7);
                return;
            } else {
                org.telegram.ui.ActionBar.s6.Z(this.d, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.l6.f27829b7);
                return;
            }
        }
        this.f52460e.setVisibility(0);
        this.f52460e.setText(str);
        this.f52460e.setTag(Integer.valueOf(i7));
        this.f52460e.setTextColorByKey(i7);
        if (z9) {
            org.telegram.ui.ActionBar.s6.Z(this.d, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.l6.f27829b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52457a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27994k6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52457a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f28012l6));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27835be));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27926gc));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27855ce));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f52461f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27834bc));
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
            this.f52457a.requestFocus();
            org.telegram.messenger.g0.K3(this.f52457a);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.f52458b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.s6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.l6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f52457a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.s6.l(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.l6.G6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9 && !this.H) {
            this.f52457a.requestFocus();
            org.telegram.messenger.g0.K3(this.f52457a);
        }
    }
}
