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
public final class ub0 extends org.telegram.ui.Components.wt0 {
    public boolean D;
    public int E;
    public int F;
    public final ce0 G;
    public final org.telegram.ui.Components.lb0[] f50292a;
    public final EditTextBoldCursor[] f50293b;
    public final TextView f50294c;
    public final TextView d;
    public final TextView f50295e;
    public final ImageView f50296f;
    public String h;
    public String f50297n;
    public String f50298r;
    public TL_account.Password f50299s;
    public Bundle f50300w;
    public boolean f50301x;
    public final int f50302y;

    public ub0(ce0 ce0Var, Context context, int i7) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        this.G = ce0Var;
        this.f50302y = i7;
        setOrientation(1);
        if (i7 == 1) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        this.f50293b = new EditTextBoldCursor[i10];
        this.f50292a = new org.telegram.ui.Components.lb0[i10];
        TextView textView = new TextView(context);
        this.f50294c = textView;
        float f10 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        float f11 = 2.0f;
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(org.telegram.messenger.id.M0(2131745525, null));
        if (org.telegram.messenger.g0.O1()) {
            i11 = 16;
        } else {
            i11 = 72;
        }
        addView(textView, c8.ha.t(-2, -2, 1, 8, i11, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.ha.t(-2, -2, 1, 8, 6, 8, 16));
        final int i14 = 0;
        while (i14 < this.f50293b.length) {
            org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context, null);
            this.f50292a[i14] = lb0Var;
            if (i7 == 0) {
                if (i14 == 0) {
                    i12 = 2131747211;
                } else {
                    i12 = 2131747209;
                }
            } else {
                i12 = 2131747443;
            }
            lb0Var.setText(org.telegram.messenger.id.M0(i12, null));
            this.f50293b[i14] = new EditTextBoldCursor(context);
            this.f50293b[i14].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.f50293b[i14].setCursorWidth(1.5f);
            this.f50293b[i14].setImeOptions(268435461);
            this.f50293b[i14].setTextSize(1, f10);
            this.f50293b[i14].setMaxLines(1);
            this.f50293b[i14].setBackground(null);
            int L = org.telegram.messenger.g0.L(16.0f);
            this.f50293b[i14].setPadding(L, L, L, L);
            if (i7 == 0) {
                this.f50293b[i14].setInputType(129);
                this.f50293b[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f50293b[i14].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f50293b[i14];
            if (org.telegram.messenger.id.f23157a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            editTextBoldCursor.setGravity(i13);
            EditTextBoldCursor editTextBoldCursor2 = this.f50293b[i14];
            if (i14 == 0 && i7 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            float f12 = f11;
            editTextBoldCursor2.addTextChangedListener(new tb0(this, z9));
            this.f50293b[i14].setOnFocusChangeListener(new fd(lb0Var, 3));
            if (z9) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f50293b[i14], c8.ha.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f50296f = imageView;
                imageView.setImageResource(2131232224);
                org.telegram.messenger.g0.Z3(imageView, true, 0.1f, true, false);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final ub0 f49185b;

                    {
                        this.f49185b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i15;
                        int i16;
                        switch (r2) {
                            case 0:
                                ub0 ub0Var = this.f49185b;
                                ImageView imageView2 = ub0Var.f50296f;
                                EditTextBoldCursor[] editTextBoldCursorArr = ub0Var.f50293b;
                                ub0Var.D = !ub0Var.D;
                                for (int i17 = 0; i17 < editTextBoldCursorArr.length; i17++) {
                                    int selectionStart = editTextBoldCursorArr[i17].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i17].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i17];
                                    if (ub0Var.D) {
                                        i16 = 144;
                                    } else {
                                        i16 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i16 | 1);
                                    editTextBoldCursorArr[i17].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(ub0Var.D));
                                if (ub0Var.D) {
                                    i15 = org.telegram.ui.ActionBar.k6.f27999l6;
                                } else {
                                    i15 = org.telegram.ui.ActionBar.k6.H6;
                                }
                                org.telegram.ui.ActionBar.r6.t(imageView2, i15, null, PorterDuff.Mode.SRC_ATOP);
                                return;
                            default:
                                ub0 ub0Var2 = this.f49185b;
                                if (ub0Var2.f50302y == 0) {
                                    ub0Var2.n(null, null);
                                    return;
                                } else {
                                    ub0Var2.n(ub0Var2.f50297n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, c8.ha.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                lb0Var.addView(linearLayout, c8.ha.c(-2.0f, -1));
            } else {
                lb0Var.addView(this.f50293b[i14], c8.ha.c(-2.0f, -1));
            }
            lb0Var.e(this.f50293b[i14]);
            addView(lb0Var, c8.ha.t(-1, -2, 1, 16, 16, 16, 0));
            this.f50293b[i14].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i15, KeyEvent keyEvent) {
                    ub0 ub0Var = ub0.this;
                    if (i14 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = ub0Var.f50293b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i15 == 5) {
                        ub0Var.h(null);
                        return true;
                    }
                    ub0Var.getClass();
                    return false;
                }
            });
            i14++;
            f11 = f12;
            f10 = 18.0f;
        }
        float f13 = f11;
        if (i7 == 0) {
            this.d.setText(org.telegram.messenger.id.M0(2131747210, "PleaseEnterNewFirstPasswordLogin"));
        } else {
            this.d.setText(org.telegram.messenger.id.M0(2131747441, "PasswordHintTextLogin"));
        }
        TextView textView3 = new TextView(context);
        this.f50295e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(f13), 1.0f);
        textView3.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        textView3.setText(org.telegram.messenger.id.M0(2131742820, null));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, c8.ha.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, c8.ha.r(-1, -1, 80));
        h6.m.g(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final ub0 f49185b;

            {
                this.f49185b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15;
                int i16;
                switch (r2) {
                    case 0:
                        ub0 ub0Var = this.f49185b;
                        ImageView imageView2 = ub0Var.f50296f;
                        EditTextBoldCursor[] editTextBoldCursorArr = ub0Var.f50293b;
                        ub0Var.D = !ub0Var.D;
                        for (int i17 = 0; i17 < editTextBoldCursorArr.length; i17++) {
                            int selectionStart = editTextBoldCursorArr[i17].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i17].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i17];
                            if (ub0Var.D) {
                                i16 = 144;
                            } else {
                                i16 = 128;
                            }
                            editTextBoldCursor3.setInputType(i16 | 1);
                            editTextBoldCursorArr[i17].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(ub0Var.D));
                        if (ub0Var.D) {
                            i15 = org.telegram.ui.ActionBar.k6.f27999l6;
                        } else {
                            i15 = org.telegram.ui.ActionBar.k6.H6;
                        }
                        org.telegram.ui.ActionBar.r6.t(imageView2, i15, null, PorterDuff.Mode.SRC_ATOP);
                        return;
                    default:
                        ub0 ub0Var2 = this.f49185b;
                        if (ub0Var2.f50302y == 0) {
                            ub0Var2.n(null, null);
                            return;
                        } else {
                            ub0Var2.n(ub0Var2.f50297n, null);
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
    public final boolean c(boolean z9) {
        this.G.C1(true, true);
        this.f50300w = null;
        this.f50301x = false;
        return true;
    }

    @Override
    public final void d() {
        this.f50301x = false;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131748267, "NewPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.f50301x) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f50293b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            ce0 ce0Var = this.G;
            if (length == 0) {
                if (ce0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.F3(editTextBoldCursorArr[0]);
                }
            } else if (this.f50302y == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (ce0Var.getParentActivity() == null) {
                        return;
                    }
                    try {
                        editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    org.telegram.messenger.g0.F3(editTextBoldCursorArr[1]);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.h);
                bundle.putString("new_password", obj);
                bundle.putString("password", this.f50298r);
                ce0Var.M1(10, true, bundle, false);
            } else {
                this.f50301x = true;
                ce0Var.F1(0, true);
                n(this.f50297n, obj);
            }
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new hz(this, 21), ce0.f44760y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f50302y);
        this.f50300w = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.f50300w != null) {
            bundle.putBundle("recoveryview_params" + this.f50302y, this.f50300w);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            editTextBoldCursorArr = this.f50293b;
            if (i7 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i7].setText("");
            i7++;
        }
        this.f50300w = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.f50300w.getString("password");
        this.f50298r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f50299s = TLdeserialize;
            TwoStepVerificationActivity.r0(TLdeserialize);
        }
        this.f50297n = this.f50300w.getString("new_password");
        ce0.b1(this.G, editTextBoldCursorArr[0]);
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
            passwordinputsettings.new_algo = this.f50299s.new_algo;
        }
        Utilities.f21336e.c(new org.telegram.ui.Components.kn0(this, str, str2, tL_auth_recoverPassword, 17));
    }

    @Override
    public final void updateColors() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i7;
        this.f50294c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f50293b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27999l6, false));
        }
        for (org.telegram.ui.Components.lb0 lb0Var : this.f50292a) {
            lb0Var.f();
        }
        this.f50295e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28092q6, false));
        ImageView imageView = this.f50296f;
        if (imageView != null) {
            if (this.D) {
                i7 = org.telegram.ui.ActionBar.k6.f27999l6;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.H6;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            ce0.u1(imageView, x02, this.E, PorterDuff.Mode.SRC_ATOP);
            this.E = x02;
            int themedColor = this.G.getThemedColor(org.telegram.ui.ActionBar.k6.f27944i6);
            ce0.v1(imageView, themedColor, this.F);
            this.F = themedColor;
        }
    }
}
