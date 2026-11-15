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
public final class w71 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public String E;
    public fy0 F;
    public boolean G;
    public SpannableStringBuilder H;
    public final boolean I;
    public final org.telegram.ui.ActionBar.i6 J;
    public final org.telegram.ui.ActionBar.g6 K;
    public final TLRPC.TL_theme L;
    public EditTextBoldCursor f52482a;
    public EditTextBoldCursor f52483b;
    public org.telegram.ui.ActionBar.q0 f52484c;
    public org.telegram.ui.Cells.y8 d;
    public org.telegram.ui.Cells.y8 f52485e;
    public org.telegram.ui.Cells.z9 f52486f;
    public org.telegram.ui.Cells.v9 h;
    public org.telegram.ui.Cells.y8 f52487n;
    public org.telegram.ui.ActionBar.t1 f52488r;
    public org.telegram.ui.Cells.n4 f52489s;
    public EditTextBoldCursor f52490w;
    public LinearLayout f52491x;
    public int f52492y;

    public w71(org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(null);
        TLRPC.TL_theme tL_theme;
        int i7;
        this.J = i6Var;
        this.K = g6Var;
        if (g6Var != null) {
            tL_theme = g6Var.f28617r;
        } else {
            tL_theme = i6Var.G;
        }
        this.L = tL_theme;
        if (g6Var != null) {
            i7 = g6Var.f28619t;
        } else {
            i7 = i6Var.F;
        }
        this.currentAccount = i7;
        this.I = z10;
    }

    public static void a0(w71 w71Var, TLRPC.TL_theme tL_theme) {
        try {
            w71Var.f52488r.dismiss();
            w71Var.f52488r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.j6.I1(w71Var.J, w71Var.K, tL_theme, w71Var.currentAccount, false);
        w71Var.finishFragment();
    }

    public static void b0(w71 w71Var, TLRPC.TL_error tL_error, TL_account.updateTheme updatetheme) {
        try {
            w71Var.f52488r.dismiss();
            w71Var.f52488r = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.Components.t4.c0(w71Var.currentAccount, tL_error, w71Var, updatetheme, new Object[0]);
    }

    public static void c0(w71 w71Var, String str) {
        TL_account.createTheme createtheme = new TL_account.createTheme();
        createtheme.slug = str;
        createtheme.title = "";
        createtheme.document = new TLRPC.TL_inputDocumentEmpty();
        w71Var.f52492y = ConnectionsManager.getInstance(w71Var.currentAccount).sendRequest(createtheme, new a31(3, w71Var, str), 2);
    }

    public static void d0(w71 w71Var) {
        org.telegram.ui.ActionBar.i6 i6Var = w71Var.J;
        TLRPC.TL_theme tL_theme = w71Var.L;
        if (!w71Var.e0(w71Var.f52482a.getText().toString(), true) || w71Var.getParentActivity() == null) {
            return;
        }
        if (w71Var.f52483b.length() == 0) {
            org.telegram.ui.Components.t4.r0(w71Var, org.telegram.messenger.hd.M0(2131744190, null), org.telegram.messenger.hd.M0(2131744177, null), null);
        } else if (w71Var.I) {
            String str = tL_theme.title;
            org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, w71Var.getParentActivity(), null);
            w71Var.f52488r = t1Var;
            t1Var.setOnCancelListener(new Object());
            w71Var.f52488r.show();
            String obj = w71Var.f52483b.getText().toString();
            tL_theme.title = obj;
            i6Var.f28698a = obj;
            i6Var.G.slug = w71Var.f52482a.getText().toString();
            org.telegram.ui.ActionBar.j6.x1(i6Var, true, true, true);
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
            String obj2 = w71Var.f52482a.getText().toString();
            String obj3 = w71Var.f52483b.getText().toString();
            if (str2.equals(obj2) && str3.equals(obj3)) {
                w71Var.finishFragment();
                return;
            }
            w71Var.f52488r = new org.telegram.ui.ActionBar.t1(3, w71Var.getParentActivity(), null);
            TL_account.updateTheme updatetheme = new TL_account.updateTheme();
            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
            tL_inputTheme.f28122id = tL_theme.f28190id;
            tL_inputTheme.access_hash = tL_theme.access_hash;
            updatetheme.theme = tL_inputTheme;
            updatetheme.format = "android";
            updatetheme.slug = obj2;
            int i7 = updatetheme.flags;
            updatetheme.title = obj3;
            updatetheme.flags = i7 | 3;
            int sendRequest = ConnectionsManager.getInstance(w71Var.currentAccount).sendRequest(updatetheme, new a31(4, w71Var, updatetheme), 2);
            ConnectionsManager.getInstance(w71Var.currentAccount).bindRequestToGuid(sendRequest, w71Var.classGuid);
            w71Var.f52488r.setOnCancelListener(new di.z(w71Var, sendRequest, 8));
            w71Var.f52488r.show();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28965jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29150tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29131sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29208wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29189vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29170ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29113rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29149ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29112ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29203w6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.F6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29070p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        boolean z10 = this.I;
        if (z10) {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131748252, null));
        } else {
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131751218, null));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ct0(this, 15));
        this.f52484c = this.actionBar.s().e(1, org.telegram.messenger.hd.M0(2131751354, null).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.fragmentView = linearLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, linearLayout, null);
        LinearLayout linearLayout2 = (LinearLayout) this.fragmentView;
        linearLayout2.setOrientation(1);
        this.fragmentView.setOnTouchListener(new gi.a(2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.f52491x = linearLayout3;
        linearLayout3.setOrientation(1);
        LinearLayout linearLayout4 = this.f52491x;
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.q6.h(i10, linearLayout4, null);
        linearLayout2.addView(this.f52491x, c8.ja.o(-1, -2));
        org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, 23);
        this.f52489s = n4Var;
        n4Var.setText(org.telegram.messenger.hd.M0(2131749197, null));
        this.f52491x.addView(this.f52489s);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f52483b = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 18.0f);
        EditTextBoldCursor editTextBoldCursor2 = this.f52483b;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        org.telegram.ui.ActionBar.q6.D(editTextBoldCursor2, i11, null);
        EditTextBoldCursor editTextBoldCursor3 = this.f52483b;
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(editTextBoldCursor3, i12, null);
        this.f52483b.setMaxLines(1);
        this.f52483b.setLines(1);
        EditTextBoldCursor editTextBoldCursor4 = this.f52483b;
        if (org.telegram.messenger.hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor4.setGravity(i7 | 16);
        this.f52483b.setBackgroundDrawable(null);
        this.f52483b.setPadding(0, 0, 0, 0);
        this.f52483b.setSingleLine(true);
        this.f52483b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        this.f52483b.setInputType(163872);
        this.f52483b.setImeOptions(6);
        this.f52483b.setHint(org.telegram.messenger.hd.M0(2131744176, null));
        org.telegram.ui.ActionBar.q6.v(this.f52483b, i12, null);
        this.f52483b.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f52483b.setCursorWidth(1.5f);
        this.f52491x.addView(this.f52483b, c8.ja.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        this.f52483b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final w71 f51825b;

            {
                this.f51825b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (r2) {
                    case 0:
                        w71 w71Var = this.f51825b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(w71Var.f52483b);
                            return true;
                        }
                        w71Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (q0Var = this.f51825b.f52484c) != null) {
                            q0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f52491x.addView(new org.telegram.ui.Components.bn(context, 26), new LinearLayout.LayoutParams(-1, 1));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        this.f52491x.addView(linearLayout5, c8.ja.k(23.0f, 0.0f, 23.0f, 0.0f, -1, 50));
        EditTextBoldCursor editTextBoldCursor5 = new EditTextBoldCursor(context);
        this.f52490w = editTextBoldCursor5;
        editTextBoldCursor5.setText(getMessagesController().V2 + "/addtheme/");
        this.f52490w.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.D(this.f52490w, i11, null);
        org.telegram.ui.ActionBar.q6.U(this.f52490w, i12, null);
        this.f52490w.setMaxLines(1);
        this.f52490w.setLines(1);
        this.f52490w.setEnabled(false);
        this.f52490w.setBackgroundDrawable(null);
        this.f52490w.setPadding(0, 0, 0, 0);
        this.f52490w.setSingleLine(true);
        this.f52490w.setInputType(163840);
        this.f52490w.setImeOptions(6);
        linearLayout5.addView(this.f52490w, c8.ja.o(-2, 50));
        EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
        this.f52482a = editTextBoldCursor6;
        editTextBoldCursor6.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.D(this.f52482a, i11, null);
        org.telegram.ui.ActionBar.q6.U(this.f52482a, i12, null);
        this.f52482a.setMaxLines(1);
        this.f52482a.setLines(1);
        this.f52482a.setBackgroundDrawable(null);
        this.f52482a.setPadding(0, 0, 0, 0);
        this.f52482a.setSingleLine(true);
        this.f52482a.setInputType(163872);
        this.f52482a.setImeOptions(6);
        this.f52482a.setHint(org.telegram.messenger.hd.M0(2131745501, null));
        org.telegram.ui.ActionBar.q6.v(this.f52482a, i12, null);
        this.f52482a.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.f52482a.setCursorWidth(1.5f);
        linearLayout5.addView(this.f52482a, c8.ja.o(-1, 50));
        this.f52482a.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final w71 f51825b;

            {
                this.f51825b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView, int i13, KeyEvent keyEvent) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (r2) {
                    case 0:
                        w71 w71Var = this.f51825b;
                        if (i13 == 6) {
                            org.telegram.messenger.g0.v1(w71Var.f52483b);
                            return true;
                        }
                        w71Var.getClass();
                        return false;
                    default:
                        if (i13 == 6 && (q0Var = this.f51825b.f52484c) != null) {
                            q0Var.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f52482a.addTextChangedListener(new m0(this, 16));
        if (z10) {
            this.f52482a.setOnFocusChangeListener(new ed(this, 11));
        }
        org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
        this.f52485e = y8Var;
        int i13 = org.telegram.ui.ActionBar.j6.f28813b7;
        org.telegram.ui.ActionBar.q6.Z(y8Var, context, 2131231230, i13);
        this.f52485e.setVisibility(8);
        this.f52485e.setBottomPadding(0);
        linearLayout2.addView(this.f52485e, c8.ja.o(-1, -2));
        org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context);
        this.d = y8Var2;
        y8Var2.getTextView().setMovementMethod(new org.telegram.messenger.c0(3));
        org.telegram.ui.ActionBar.q6.C(this.d.getTextView(), org.telegram.ui.ActionBar.j6.K6, null);
        if (z10) {
            this.d.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744185, null)));
        } else {
            org.telegram.ui.Cells.y8 y8Var3 = this.d;
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131744144, null));
            this.H = X2;
            y8Var3.setText(X2);
        }
        linearLayout2.addView(this.d, c8.ja.o(-1, -2));
        if (z10) {
            org.telegram.ui.ActionBar.q6.Z(this.d, context, 2131231229, i13);
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, this.parentLayout, 1);
            this.f52486f = z9Var;
            linearLayout2.addView(z9Var, c8.ja.o(-1, -2));
            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context);
            this.h = v9Var;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.j6.N0(true);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.f28941i6);
            v9Var.setBackground(N0);
            org.telegram.ui.ActionBar.q6.j(v9Var, N0, M, M2, null);
            this.h.b(org.telegram.messenger.hd.M0(2131743799, null), false);
            linearLayout2.addView(this.h, c8.ja.o(-1, -2));
            this.h.setOnClickListener(new a90(22, this, context));
            org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context);
            this.f52487n = y8Var4;
            y8Var4.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131743798, null)));
            org.telegram.ui.ActionBar.q6.Z(this.f52487n, context, 2131231230, i13);
            linearLayout2.addView(this.f52487n, c8.ja.o(-1, -2));
        } else {
            org.telegram.ui.ActionBar.q6.Z(this.d, context, 2131231230, i13);
        }
        TLRPC.TL_theme tL_theme = this.L;
        if (tL_theme != null) {
            this.G = true;
            this.f52483b.setText(tL_theme.title);
            EditTextBoldCursor editTextBoldCursor7 = this.f52483b;
            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
            this.f52482a.setText(tL_theme.slug);
            EditTextBoldCursor editTextBoldCursor8 = this.f52482a;
            editTextBoldCursor8.setSelection(editTextBoldCursor8.length());
            this.G = false;
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.ui.ActionBar.t1 t1Var;
        org.telegram.ui.ActionBar.t1 t1Var2;
        int i11 = org.telegram.messenger.ns.M2;
        org.telegram.ui.ActionBar.g6 g6Var = this.K;
        org.telegram.ui.ActionBar.i6 i6Var = this.J;
        if (i7 == i11) {
            org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[1];
            if (i6Var2 == i6Var && g6Var2 == g6Var && (t1Var2 = this.f52488r) != null) {
                try {
                    t1Var2.dismiss();
                    this.f52488r = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.ui.ActionBar.j6.u(i6Var, true, false);
                finishFragment();
            }
        } else if (i7 == org.telegram.messenger.ns.N2) {
            org.telegram.ui.ActionBar.i6 i6Var3 = (org.telegram.ui.ActionBar.i6) objArr[0];
            org.telegram.ui.ActionBar.g6 g6Var3 = (org.telegram.ui.ActionBar.g6) objArr[1];
            if (i6Var3 == i6Var && g6Var3 == g6Var && (t1Var = this.f52488r) != null) {
                try {
                    t1Var.dismiss();
                    this.f52488r = null;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        }
    }

    public final boolean e0(String str, boolean z10) {
        fy0 fy0Var = this.F;
        if (fy0Var != null) {
            org.telegram.messenger.g0.r(fy0Var);
            this.F = null;
            this.E = null;
            if (this.f52492y != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f52492y, true);
            }
        }
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                for (int i7 = 0; i7 < str.length(); i7++) {
                    char charAt = str.charAt(i7);
                    if (i7 == 0 && charAt >= '0' && charAt <= '9') {
                        if (z10) {
                            org.telegram.ui.Components.t4.r0(this, org.telegram.messenger.hd.M0(2131744190, null), org.telegram.messenger.hd.M0(2131745502, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.j6.f29070p7, org.telegram.messenger.hd.M0(2131745502, null));
                        return false;
                    } else if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        if (z10) {
                            org.telegram.ui.Components.t4.r0(this, org.telegram.messenger.hd.M0(2131744190, null), org.telegram.messenger.hd.M0(2131745505, null), null);
                            return false;
                        }
                        f0(org.telegram.ui.ActionBar.j6.f29070p7, org.telegram.messenger.hd.M0(2131745505, null));
                        return false;
                    }
                }
            } else {
                f0(org.telegram.ui.ActionBar.j6.f29070p7, org.telegram.messenger.hd.M0(2131745505, null));
                return false;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 64) {
                if (z10) {
                    org.telegram.ui.Components.t4.r0(this, org.telegram.messenger.hd.M0(2131744190, null), org.telegram.messenger.hd.M0(2131745504, null), null);
                    return false;
                }
                f0(org.telegram.ui.ActionBar.j6.f29070p7, org.telegram.messenger.hd.M0(2131745504, null));
                return false;
            }
            if (!z10) {
                TLRPC.TL_theme tL_theme = this.L;
                if (str.equals((tL_theme == null || (r11 = tL_theme.slug) == null) ? "" : "")) {
                    f0(org.telegram.ui.ActionBar.j6.f29203w6, org.telegram.messenger.hd.a0("SetUrlAvailable", null, 2131745508, str));
                    return true;
                }
                f0(org.telegram.ui.ActionBar.j6.F6, org.telegram.messenger.hd.M0(2131745507, null));
                this.E = str;
                fy0 fy0Var2 = new fy0(12, this, str);
                this.F = fy0Var2;
                org.telegram.messenger.g0.i3(fy0Var2, 300L);
            }
            return true;
        } else if (z10) {
            org.telegram.ui.Components.t4.r0(this, org.telegram.messenger.hd.M0(2131744190, null), org.telegram.messenger.hd.M0(2131745503, null), null);
            return false;
        } else {
            f0(org.telegram.ui.ActionBar.j6.f29070p7, org.telegram.messenger.hd.M0(2131745503, null));
            return false;
        }
    }

    public final void f0(int i7, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = this.I;
        if (isEmpty) {
            this.f52485e.setVisibility(8);
            if (z10) {
                org.telegram.ui.ActionBar.q6.Z(this.d, getParentActivity(), 2131231229, org.telegram.ui.ActionBar.j6.f28813b7);
                return;
            } else {
                org.telegram.ui.ActionBar.q6.Z(this.d, getParentActivity(), 2131231230, org.telegram.ui.ActionBar.j6.f28813b7);
                return;
            }
        }
        this.f52485e.setVisibility(0);
        this.f52485e.setText(str);
        this.f52485e.setTag(Integer.valueOf(i7));
        this.f52485e.setTextColorByKey(i7);
        if (z10) {
            org.telegram.ui.ActionBar.q6.Z(this.d, getParentActivity(), 2131231231, org.telegram.ui.ActionBar.j6.f28813b7);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52482a, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28978k6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52482a, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28996l6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ub));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Rd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28875ee));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28964jc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f52486f, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28873ec));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ns.M2);
        getNotificationCenter().c(this, org.telegram.messenger.ns.N2);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.M2);
        getNotificationCenter().n(this, org.telegram.messenger.ns.N2);
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (!org.telegram.messenger.np.e1().getBoolean("view_animations", true) && this.I) {
            this.f52482a.requestFocus();
            org.telegram.messenger.g0.J3(this.f52482a);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.f52483b;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.j6.G6, null);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.f52482a;
            if (editTextBoldCursor2 != null) {
                org.telegram.ui.ActionBar.q6.l(editTextBoldCursor2, 30, org.telegram.ui.ActionBar.j6.G6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !this.I) {
            this.f52482a.requestFocus();
            org.telegram.messenger.g0.J3(this.f52482a);
        }
    }
}
