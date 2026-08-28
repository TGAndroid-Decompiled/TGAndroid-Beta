package org.telegram.ui;

import android.content.Context;
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
public final class vd0 extends org.telegram.ui.Components.cv0 {
    public final fg0 A;
    public final org.telegram.ui.Components.fc0[] f43446a;
    public final EditTextBoldCursor[] f43447b;
    public final TextView f43448c;
    public final TextView d;
    public final TextView f43449e;
    public final ImageView f43450f;
    public String h;
    public String f43451n;
    public String f43452r;
    public TL_account.Password f43453s;
    public Bundle v;
    public boolean f43454w;
    public final int f43455x;
    public boolean f43456y;

    public vd0(fg0 fg0Var, Context context, int i9) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        this.A = fg0Var;
        this.f43455x = i9;
        setOrientation(1);
        if (i9 == 1) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        this.f43447b = new EditTextBoldCursor[i10];
        this.f43446a = new org.telegram.ui.Components.fc0[i10];
        TextView textView = new TextView(context);
        this.f43448c = textView;
        float f10 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(LocaleController.getString(R.string.SetNewPassword));
        if (AndroidUtilities.isSmallScreen()) {
            i11 = 16;
        } else {
            i11 = 72;
        }
        addView(textView, g7.e6.t(-2, -2, 1, 8, i11, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, g7.e6.t(-2, -2, 1, 8, 6, 8, 16));
        final int i14 = 0;
        while (i14 < this.f43447b.length) {
            org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(context, null);
            this.f43446a[i14] = fc0Var;
            if (i9 == 0) {
                if (i14 == 0) {
                    i12 = R.string.PleaseEnterNewFirstPasswordHint;
                } else {
                    i12 = R.string.PleaseEnterNewSecondPasswordHint;
                }
            } else {
                i12 = R.string.PasswordHintPlaceholder;
            }
            fc0Var.setText(LocaleController.getString(i12));
            this.f43447b[i14] = new EditTextBoldCursor(context);
            this.f43447b[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f43447b[i14].setCursorWidth(1.5f);
            this.f43447b[i14].setImeOptions(268435461);
            this.f43447b[i14].setTextSize(1, f10);
            this.f43447b[i14].setMaxLines(1);
            this.f43447b[i14].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.f43447b[i14].setPadding(dp, dp, dp, dp);
            if (i9 == 0) {
                this.f43447b[i14].setInputType(129);
                this.f43447b[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f43447b[i14].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f43447b[i14];
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            editTextBoldCursor.setGravity(i13);
            EditTextBoldCursor editTextBoldCursor2 = this.f43447b[i14];
            if (i14 == 0 && i9 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            editTextBoldCursor2.addTextChangedListener(new ud0(this, z10));
            this.f43447b[i14].setOnFocusChangeListener(new ld(fc0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f43447b[i14], g7.e6.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f43450f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final vd0 f42368b;

                    {
                        this.f42368b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i15;
                        int i16;
                        switch (r2) {
                            case 0:
                                vd0 vd0Var = this.f42368b;
                                ImageView imageView2 = vd0Var.f43450f;
                                EditTextBoldCursor[] editTextBoldCursorArr = vd0Var.f43447b;
                                vd0Var.f43456y = !vd0Var.f43456y;
                                for (int i17 = 0; i17 < editTextBoldCursorArr.length; i17++) {
                                    int selectionStart = editTextBoldCursorArr[i17].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i17].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i17];
                                    if (vd0Var.f43456y) {
                                        i16 = 144;
                                    } else {
                                        i16 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i16 | 1);
                                    editTextBoldCursorArr[i17].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(vd0Var.f43456y));
                                if (vd0Var.f43456y) {
                                    i15 = org.telegram.ui.ActionBar.f6.f23144l6;
                                } else {
                                    i15 = org.telegram.ui.ActionBar.f6.H6;
                                }
                                imageView2.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                                return;
                            default:
                                vd0 vd0Var2 = this.f42368b;
                                if (vd0Var2.f43455x == 0) {
                                    vd0Var2.o(null, null);
                                    return;
                                } else {
                                    vd0Var2.o(vd0Var2.f43451n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, g7.e6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                fc0Var.addView(linearLayout, g7.e6.c(-2.0f, -1));
            } else {
                fc0Var.addView(this.f43447b[i14], g7.e6.c(-2.0f, -1));
            }
            fc0Var.e(this.f43447b[i14]);
            addView(fc0Var, g7.e6.t(-1, -2, 1, 16, 16, 16, 0));
            this.f43447b[i14].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i15, KeyEvent keyEvent) {
                    vd0 vd0Var = vd0.this;
                    if (i14 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = vd0Var.f43447b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i15 == 5) {
                        vd0Var.h(null);
                        return true;
                    }
                    vd0Var.getClass();
                    return false;
                }
            });
            i14++;
            f10 = 18.0f;
        }
        if (i9 == 0) {
            this.d.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", R.string.PleaseEnterNewFirstPasswordLogin));
        } else {
            this.d.setText(LocaleController.getString("PasswordHintTextLogin", R.string.PasswordHintTextLogin));
        }
        TextView textView3 = new TextView(context);
        this.f43449e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView3.setText(LocaleController.getString(R.string.YourEmailSkip));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, g7.e6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, g7.e6.q(-1, -1, 80));
        org.telegram.ui.Cells.e3.s2(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final vd0 f42368b;

            {
                this.f42368b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15;
                int i16;
                switch (r2) {
                    case 0:
                        vd0 vd0Var = this.f42368b;
                        ImageView imageView2 = vd0Var.f43450f;
                        EditTextBoldCursor[] editTextBoldCursorArr = vd0Var.f43447b;
                        vd0Var.f43456y = !vd0Var.f43456y;
                        for (int i17 = 0; i17 < editTextBoldCursorArr.length; i17++) {
                            int selectionStart = editTextBoldCursorArr[i17].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i17].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i17];
                            if (vd0Var.f43456y) {
                                i16 = 144;
                            } else {
                                i16 = 128;
                            }
                            editTextBoldCursor3.setInputType(i16 | 1);
                            editTextBoldCursorArr[i17].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(vd0Var.f43456y));
                        if (vd0Var.f43456y) {
                            i15 = org.telegram.ui.ActionBar.f6.f23144l6;
                        } else {
                            i15 = org.telegram.ui.ActionBar.f6.H6;
                        }
                        imageView2.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                        return;
                    default:
                        vd0 vd0Var2 = this.f42368b;
                        if (vd0Var2.f43455x == 0) {
                            vd0Var2.o(null, null);
                            return;
                        } else {
                            vd0Var2.o(vd0Var2.f43451n, null);
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
        this.A.k1(true, true);
        this.v = null;
        this.f43454w = false;
        return true;
    }

    @Override
    public final void d() {
        this.f43454w = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.f43454w) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f43447b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            fg0 fg0Var = this.A;
            if (length == 0) {
                if (fg0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
                }
            } else if (this.f43455x == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (fg0Var.getParentActivity() == null) {
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
                bundle.putString("password", this.f43452r);
                fg0Var.u1(10, true, bundle, false);
            } else {
                this.f43454w = true;
                fg0Var.n1(0, true);
                o(this.f43451n, obj);
            }
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new o00(this, 18), fg0.f38258p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f43455x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.f43455x, this.v);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            editTextBoldCursorArr = this.f43447b;
            if (i9 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i9].setText("");
            i9++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.f43452r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f43453s = TLdeserialize;
            TwoStepVerificationActivity.l0(TLdeserialize);
        }
        this.f43451n = this.v.getString("new_password");
        fg0.T0(this.A, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    @Override
    public final void n() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i9;
        this.f43448c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f43447b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23144l6, false));
        }
        for (org.telegram.ui.Components.fc0 fc0Var : this.f43446a) {
            fc0Var.f();
        }
        this.f43449e.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false));
        ImageView imageView = this.f43450f;
        if (imageView != null) {
            if (this.f43456y) {
                i9 = org.telegram.ui.ActionBar.f6.f23144l6;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.H6;
            }
            imageView.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(this.A.getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), 1, -1));
        }
    }

    public final void o(String str, String str2) {
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
            passwordinputsettings.new_algo = this.f43453s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.no0(this, str, str2, tL_auth_recoverPassword, 17));
    }
}
