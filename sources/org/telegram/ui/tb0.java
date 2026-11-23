package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tb0 extends org.telegram.ui.Components.hu0 {
    public boolean E;
    public int F;
    public int G;
    public final de0 H;
    public final org.telegram.ui.Components.vb0[] f52339a;
    public final EditTextBoldCursor[] f52340b;
    public final TextView f52341c;
    public final TextView d;
    public final TextView f52342e;
    public final ImageView f52343f;
    public String h;
    public String f52344n;
    public String f52345r;
    public TL_account.Password f52346s;
    public Bundle f52347w;
    public boolean f52348x;
    public final int f52349y;

    public tb0(de0 de0Var, Context context, int i7) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        this.H = de0Var;
        this.f52349y = i7;
        setOrientation(1);
        if (i7 == 1) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        this.f52340b = new EditTextBoldCursor[i10];
        this.f52339a = new org.telegram.ui.Components.vb0[i10];
        TextView textView = new TextView(context);
        this.f52341c = textView;
        float f10 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        float f11 = 2.0f;
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(org.telegram.messenger.gd.N0(2131745326, null));
        if (org.telegram.messenger.g0.O1()) {
            i11 = 16;
        } else {
            i11 = 72;
        }
        addView(textView, c8.na.t(-2, -2, 1, 8, i11, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.na.t(-2, -2, 1, 8, 6, 8, 16));
        final int i14 = 0;
        while (i14 < this.f52340b.length) {
            org.telegram.ui.Components.vb0 vb0Var = new org.telegram.ui.Components.vb0(context, null);
            this.f52339a[i14] = vb0Var;
            if (i7 == 0) {
                if (i14 == 0) {
                    i12 = 2131747016;
                } else {
                    i12 = 2131747014;
                }
            } else {
                i12 = 2131747248;
            }
            vb0Var.setText(org.telegram.messenger.gd.N0(i12, null));
            this.f52340b[i14] = new EditTextBoldCursor(context);
            this.f52340b[i14].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.f52340b[i14].setCursorWidth(1.5f);
            this.f52340b[i14].setImeOptions(268435461);
            this.f52340b[i14].setTextSize(1, f10);
            this.f52340b[i14].setMaxLines(1);
            this.f52340b[i14].setBackground(null);
            int L = org.telegram.messenger.g0.L(16.0f);
            this.f52340b[i14].setPadding(L, L, L, L);
            if (i7 == 0) {
                this.f52340b[i14].setInputType(129);
                this.f52340b[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f52340b[i14].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f52340b[i14];
            if (org.telegram.messenger.gd.f24314a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            editTextBoldCursor.setGravity(i13);
            EditTextBoldCursor editTextBoldCursor2 = this.f52340b[i14];
            if (i14 == 0 && i7 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f12 = f11;
            editTextBoldCursor2.addTextChangedListener(new bi.y5(this, z10));
            this.f52340b[i14].setOnFocusChangeListener(new ed(vb0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f52340b[i14], c8.na.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f52343f = imageView;
                imageView.setImageResource(2131232229);
                org.telegram.messenger.g0.X3(imageView, true, 0.1f, true, false);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final tb0 f51398b;

                    {
                        this.f51398b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i15;
                        int i16;
                        switch (r2) {
                            case 0:
                                tb0 tb0Var = this.f51398b;
                                ImageView imageView2 = tb0Var.f52343f;
                                EditTextBoldCursor[] editTextBoldCursorArr = tb0Var.f52340b;
                                tb0Var.E = !tb0Var.E;
                                for (int i17 = 0; i17 < editTextBoldCursorArr.length; i17++) {
                                    int selectionStart = editTextBoldCursorArr[i17].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i17].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i17];
                                    if (tb0Var.E) {
                                        i16 = 144;
                                    } else {
                                        i16 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i16 | 1);
                                    editTextBoldCursorArr[i17].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(tb0Var.E));
                                if (tb0Var.E) {
                                    i15 = org.telegram.ui.ActionBar.n6.f29598l6;
                                } else {
                                    i15 = org.telegram.ui.ActionBar.n6.H6;
                                }
                                org.telegram.ui.ActionBar.u6.s(imageView2, i15, null, PorterDuff.Mode.SRC_ATOP);
                                return;
                            default:
                                tb0 tb0Var2 = this.f51398b;
                                if (tb0Var2.f52349y == 0) {
                                    tb0Var2.n(null, null);
                                    return;
                                } else {
                                    tb0Var2.n(tb0Var2.f52344n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, c8.na.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                vb0Var.addView(linearLayout, c8.na.c(-2.0f, -1));
            } else {
                vb0Var.addView(this.f52340b[i14], c8.na.c(-2.0f, -1));
            }
            vb0Var.e(this.f52340b[i14]);
            addView(vb0Var, c8.na.t(-1, -2, 1, 16, 16, 16, 0));
            this.f52340b[i14].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i15, KeyEvent keyEvent) {
                    tb0 tb0Var = tb0.this;
                    if (i14 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = tb0Var.f52340b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i15 == 5) {
                        tb0Var.h(null);
                        return true;
                    }
                    tb0Var.getClass();
                    return false;
                }
            });
            i14++;
            f11 = f12;
            f10 = 18.0f;
        }
        float f13 = f11;
        if (i7 == 0) {
            this.d.setText(org.telegram.messenger.gd.N0(2131747015, "PleaseEnterNewFirstPasswordLogin"));
        } else {
            this.d.setText(org.telegram.messenger.gd.N0(2131747246, "PasswordHintTextLogin"));
        }
        TextView textView3 = new TextView(context);
        this.f52342e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(f13), 1.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        textView3.setText(org.telegram.messenger.gd.N0(2131742546, null));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, c8.na.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, c8.na.r(-1, -1, 80));
        h6.m.s(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final tb0 f51398b;

            {
                this.f51398b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15;
                int i16;
                switch (r2) {
                    case 0:
                        tb0 tb0Var = this.f51398b;
                        ImageView imageView2 = tb0Var.f52343f;
                        EditTextBoldCursor[] editTextBoldCursorArr = tb0Var.f52340b;
                        tb0Var.E = !tb0Var.E;
                        for (int i17 = 0; i17 < editTextBoldCursorArr.length; i17++) {
                            int selectionStart = editTextBoldCursorArr[i17].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i17].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i17];
                            if (tb0Var.E) {
                                i16 = 144;
                            } else {
                                i16 = 128;
                            }
                            editTextBoldCursor3.setInputType(i16 | 1);
                            editTextBoldCursorArr[i17].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(tb0Var.E));
                        if (tb0Var.E) {
                            i15 = org.telegram.ui.ActionBar.n6.f29598l6;
                        } else {
                            i15 = org.telegram.ui.ActionBar.n6.H6;
                        }
                        org.telegram.ui.ActionBar.u6.s(imageView2, i15, null, PorterDuff.Mode.SRC_ATOP);
                        return;
                    default:
                        tb0 tb0Var2 = this.f51398b;
                        if (tb0Var2.f52349y == 0) {
                            tb0Var2.n(null, null);
                            return;
                        } else {
                            tb0Var2.n(tb0Var2.f52344n, null);
                            return;
                        }
                }
            }
        });
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.H.C1(true, true);
        this.f52347w = null;
        this.f52348x = false;
        return true;
    }

    @Override
    public final void d() {
        this.f52348x = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.gd.N0(2131748073, "NewPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.f52348x) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f52340b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            de0 de0Var = this.H;
            if (length == 0) {
                if (de0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.D3(editTextBoldCursorArr[0]);
                }
            } else if (this.f52349y == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (de0Var.getParentActivity() == null) {
                        return;
                    }
                    try {
                        editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    org.telegram.messenger.g0.D3(editTextBoldCursorArr[1]);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.h);
                bundle.putString("new_password", obj);
                bundle.putString("password", this.f52345r);
                de0Var.M1(10, true, bundle, false);
            } else {
                this.f52348x = true;
                de0Var.F1(0, true);
                n(this.f52344n, obj);
            }
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new kz(this, 21), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f52349y);
        this.f52347w = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.f52347w != null) {
            bundle.putBundle("recoveryview_params" + this.f52349y, this.f52347w);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            editTextBoldCursorArr = this.f52340b;
            if (i7 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i7].setText("");
            i7++;
        }
        this.f52347w = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.f52347w.getString("password");
        this.f52345r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f52346s = TLdeserialize;
            TwoStepVerificationActivity.r0(TLdeserialize);
        }
        this.f52344n = this.f52347w.getString("new_password");
        de0.b1(this.H, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    public final void n(String str, String str2) {
        String str3;
        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
        tL_auth_recoverPassword.code = this.h;
        if (!TextUtils.isEmpty(str)) {
            tL_auth_recoverPassword.flags |= 1;
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            passwordinputsettings.flags |= 1;
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = "";
            }
            passwordinputsettings.hint = str3;
            passwordinputsettings.new_algo = this.f52346s.new_algo;
        }
        Utilities.f22877e.c(new org.telegram.ui.Components.xz(this, str, str2, tL_auth_recoverPassword, 25));
    }

    @Override
    public final void updateColors() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i7;
        this.f52341c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f52340b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29598l6, false));
        }
        for (org.telegram.ui.Components.vb0 vb0Var : this.f52339a) {
            vb0Var.f();
        }
        this.f52342e.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29691q6, false));
        ImageView imageView = this.f52343f;
        if (imageView != null) {
            if (this.E) {
                i7 = org.telegram.ui.ActionBar.n6.f29598l6;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.H6;
            }
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
            de0.u1(imageView, x02, this.F, PorterDuff.Mode.SRC_ATOP);
            this.F = x02;
            int themedColor = this.H.getThemedColor(org.telegram.ui.ActionBar.n6.f29543i6);
            de0.v1(imageView, themedColor, this.G);
            this.G = themedColor;
        }
    }
}
