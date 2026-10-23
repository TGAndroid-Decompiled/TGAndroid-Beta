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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xd0 extends org.telegram.ui.Components.tw0 {
    public int E;
    public int F;
    public final ig0 G;
    public final org.telegram.ui.Components.vd0[] f43573a;
    public final EditTextBoldCursor[] f43574b;
    public final TextView f43575c;
    public final TextView d;
    public final TextView e;
    public final ImageView f43576f;
    public String h;
    public String f43577n;
    public String f43578r;
    public TL_account.Password f43579s;
    public Bundle v;
    public boolean f43580w;
    public final int f43581x;
    public boolean f43582y;

    public xd0(ig0 ig0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        float f7;
        this.G = ig0Var;
        this.f43581x = i10;
        setOrientation(1);
        if (i10 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f43574b = new EditTextBoldCursor[i11];
        this.f43573a = new org.telegram.ui.Components.vd0[i11];
        TextView textView = new TextView(context);
        this.f43575c = textView;
        float f10 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        float f11 = 2.0f;
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(LocaleController.getString(R.string.SetNewPassword));
        if (AndroidUtilities.isSmallScreen()) {
            i12 = 16;
        } else {
            i12 = 72;
        }
        addView(textView, w7.z5.t(-2, -2, 1, 8, i12, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, w7.z5.t(-2, -2, 1, 8, 6, 8, 16));
        final int i15 = 0;
        while (i15 < this.f43574b.length) {
            org.telegram.ui.Components.vd0 vd0Var = new org.telegram.ui.Components.vd0(context, null);
            this.f43573a[i15] = vd0Var;
            if (i10 == 0) {
                if (i15 == 0) {
                    i13 = R.string.PleaseEnterNewFirstPasswordHint;
                } else {
                    i13 = R.string.PleaseEnterNewSecondPasswordHint;
                }
            } else {
                i13 = R.string.PasswordHintPlaceholder;
            }
            vd0Var.setText(LocaleController.getString(i13));
            this.f43574b[i15] = new EditTextBoldCursor(context);
            this.f43574b[i15].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f43574b[i15].setCursorWidth(1.5f);
            this.f43574b[i15].setImeOptions(268435461);
            this.f43574b[i15].setTextSize(1, f10);
            this.f43574b[i15].setMaxLines(1);
            this.f43574b[i15].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.f43574b[i15].setPadding(dp, dp, dp, dp);
            if (i10 == 0) {
                this.f43574b[i15].setInputType(129);
                this.f43574b[i15].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f43574b[i15].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f43574b[i15];
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            editTextBoldCursor.setGravity(i14);
            EditTextBoldCursor editTextBoldCursor2 = this.f43574b[i15];
            if (i15 == 0 && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            editTextBoldCursor2.addTextChangedListener(new wd0(this, z10));
            this.f43574b[i15].setOnFocusChangeListener(new pd(vd0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f43574b[i15], w7.z5.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f43576f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                f7 = f11;
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final xd0 f41957b;

                    {
                        this.f41957b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i16;
                        int i17;
                        switch (r2) {
                            case 0:
                                xd0 xd0Var = this.f41957b;
                                ImageView imageView2 = xd0Var.f43576f;
                                EditTextBoldCursor[] editTextBoldCursorArr = xd0Var.f43574b;
                                xd0Var.f43582y = !xd0Var.f43582y;
                                for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                                    int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                                    if (xd0Var.f43582y) {
                                        i17 = 144;
                                    } else {
                                        i17 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i17 | 1);
                                    editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(xd0Var.f43582y));
                                if (xd0Var.f43582y) {
                                    i16 = org.telegram.ui.ActionBar.k6.f21327l6;
                                } else {
                                    i16 = org.telegram.ui.ActionBar.k6.H6;
                                }
                                org.telegram.ui.ActionBar.r6.t(imageView2, i16, null, PorterDuff.Mode.SRC_ATOP);
                                return;
                            default:
                                xd0 xd0Var2 = this.f41957b;
                                if (xd0Var2.f43581x == 0) {
                                    xd0Var2.n(null, null);
                                    return;
                                } else {
                                    xd0Var2.n(xd0Var2.f43577n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, w7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                vd0Var.addView(linearLayout, w7.z5.c(-2.0f, -1));
            } else {
                f7 = f11;
                vd0Var.addView(this.f43574b[i15], w7.z5.c(-2.0f, -1));
            }
            vd0Var.e(this.f43574b[i15]);
            addView(vd0Var, w7.z5.t(-1, -2, 1, 16, 16, 16, 0));
            this.f43574b[i15].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                    xd0 xd0Var = xd0.this;
                    if (i15 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = xd0Var.f43574b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i16 == 5) {
                        xd0Var.h(null);
                        return true;
                    }
                    xd0Var.getClass();
                    return false;
                }
            });
            i15++;
            f11 = f7;
            f10 = 18.0f;
        }
        float f12 = f11;
        if (i10 == 0) {
            this.d.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", R.string.PleaseEnterNewFirstPasswordLogin));
        } else {
            this.d.setText(LocaleController.getString("PasswordHintTextLogin", R.string.PasswordHintTextLogin));
        }
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(f12), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView3.setText(LocaleController.getString(R.string.YourEmailSkip));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, w7.z5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, w7.z5.q(-1, -1, 80));
        m.g3.p(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final xd0 f41957b;

            {
                this.f41957b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16;
                int i17;
                switch (r2) {
                    case 0:
                        xd0 xd0Var = this.f41957b;
                        ImageView imageView2 = xd0Var.f43576f;
                        EditTextBoldCursor[] editTextBoldCursorArr = xd0Var.f43574b;
                        xd0Var.f43582y = !xd0Var.f43582y;
                        for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                            int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                            if (xd0Var.f43582y) {
                                i17 = 144;
                            } else {
                                i17 = 128;
                            }
                            editTextBoldCursor3.setInputType(i17 | 1);
                            editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(xd0Var.f43582y));
                        if (xd0Var.f43582y) {
                            i16 = org.telegram.ui.ActionBar.k6.f21327l6;
                        } else {
                            i16 = org.telegram.ui.ActionBar.k6.H6;
                        }
                        org.telegram.ui.ActionBar.r6.t(imageView2, i16, null, PorterDuff.Mode.SRC_ATOP);
                        return;
                    default:
                        xd0 xd0Var2 = this.f41957b;
                        if (xd0Var2.f43581x == 0) {
                            xd0Var2.n(null, null);
                            return;
                        } else {
                            xd0Var2.n(xd0Var2.f43577n, null);
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
        this.G.o1(true, true);
        this.v = null;
        this.f43580w = false;
        return true;
    }

    @Override
    public final void d() {
        this.f43580w = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.f43580w) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f43574b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            ig0 ig0Var = this.G;
            if (length == 0) {
                if (ig0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
                }
            } else if (this.f43581x == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (ig0Var.getParentActivity() == null) {
                        return;
                    }
                    try {
                        editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[1]);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.h);
                bundle.putString("new_password", obj);
                bundle.putString("password", this.f43578r);
                ig0Var.y1(10, true, bundle, false);
            } else {
                this.f43580w = true;
                ig0Var.r1(0, true);
                n(this.f43577n, obj);
            }
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new fz(this, 20), ig0.f38191x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f43581x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.f43581x, this.v);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            editTextBoldCursorArr = this.f43574b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.f43578r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f43579s = TLdeserialize;
            TwoStepVerificationActivity.m0(TLdeserialize);
        }
        this.f43577n = this.v.getString("new_password");
        ig0.V0(this.G, editTextBoldCursorArr[0]);
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
            passwordinputsettings.new_algo = this.f43579s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.j90(this, str, str2, tL_auth_recoverPassword, 22));
    }

    @Override
    public final void updateColors() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i10;
        this.f43575c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f43574b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21327l6, false));
        }
        for (org.telegram.ui.Components.vd0 vd0Var : this.f43573a) {
            vd0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        ImageView imageView = this.f43576f;
        if (imageView != null) {
            if (this.f43582y) {
                i10 = org.telegram.ui.ActionBar.k6.f21327l6;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.H6;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            ig0.g1(imageView, x02, this.E, PorterDuff.Mode.SRC_ATOP);
            this.E = x02;
            int themedColor = this.G.getThemedColor(org.telegram.ui.ActionBar.k6.f21272i6);
            ig0.h1(imageView, themedColor, this.F);
            this.F = themedColor;
        }
    }
}
