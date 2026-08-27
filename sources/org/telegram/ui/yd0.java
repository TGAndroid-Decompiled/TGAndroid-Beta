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

public final class yd0 extends org.telegram.ui.Components.ev0 {
    public final ig0 A;

    public final org.telegram.ui.Components.jc0[] f44781a;

    public final EditTextBoldCursor[] f44782b;

    public final TextView f44783c;
    public final TextView d;

    public final TextView f44784e;

    public final ImageView f44785f;
    public String h;

    public String f44786n;

    public String f44787r;

    public TL_account.Password f44788s;
    public Bundle v;

    public boolean f44789w;

    public final int f44790x;

    public boolean f44791y;

    public yd0(ig0 ig0Var, Context context, int i10) {
        super(context);
        this.A = ig0Var;
        this.f44790x = i10;
        setOrientation(1);
        int i11 = i10 == 1 ? 1 : 2;
        this.f44782b = new EditTextBoldCursor[i11];
        this.f44781a = new org.telegram.ui.Components.jc0[i11];
        TextView textView = new TextView(context);
        this.f44783c = textView;
        float f10 = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(LocaleController.getString(R.string.SetNewPassword));
        addView(textView, h7.z5.t(-2, -2, 1, 8, AndroidUtilities.isSmallScreen() ? 16 : 72, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, h7.z5.t(-2, -2, 1, 8, 6, 8, 16));
        final int i12 = 0;
        while (i12 < this.f44782b.length) {
            org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context, null);
            this.f44781a[i12] = jc0Var;
            jc0Var.setText(LocaleController.getString(i10 == 0 ? i12 == 0 ? R.string.PleaseEnterNewFirstPasswordHint : R.string.PleaseEnterNewSecondPasswordHint : R.string.PasswordHintPlaceholder));
            this.f44782b[i12] = new EditTextBoldCursor(context);
            this.f44782b[i12].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f44782b[i12].setCursorWidth(1.5f);
            this.f44782b[i12].setImeOptions(268435461);
            this.f44782b[i12].setTextSize(1, f10);
            this.f44782b[i12].setMaxLines(1);
            this.f44782b[i12].setBackground(null);
            int iDp = AndroidUtilities.dp(16.0f);
            this.f44782b[i12].setPadding(iDp, iDp, iDp, iDp);
            if (i10 == 0) {
                this.f44782b[i12].setInputType(129);
                this.f44782b[i12].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f44782b[i12].setTypeface(Typeface.DEFAULT);
            this.f44782b[i12].setGravity(LocaleController.isRTL ? 5 : 3);
            EditTextBoldCursor editTextBoldCursor = this.f44782b[i12];
            boolean z10 = i12 == 0 && i10 == 0;
            editTextBoldCursor.addTextChangedListener(new xd0(this, z10));
            this.f44782b[i12].setOnFocusChangeListener(new ld(jc0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f44782b[i12], h7.z5.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f44785f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                final int i13 = 0;
                imageView.setOnClickListener(new View.OnClickListener(this) {

                    public final yd0 f43191b;

                    {
                        this.f43191b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                yd0 yd0Var = this.f43191b;
                                ImageView imageView2 = yd0Var.f44785f;
                                EditTextBoldCursor[] editTextBoldCursorArr = yd0Var.f44782b;
                                yd0Var.f44791y = !yd0Var.f44791y;
                                for (int i14 = 0; i14 < editTextBoldCursorArr.length; i14++) {
                                    int selectionStart = editTextBoldCursorArr[i14].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i14].getSelectionEnd();
                                    editTextBoldCursorArr[i14].setInputType((yd0Var.f44791y ? 144 : 128) | 1);
                                    editTextBoldCursorArr[i14].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(yd0Var.f44791y));
                                imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, yd0Var.f44791y ? org.telegram.ui.ActionBar.g6.f23198l6 : org.telegram.ui.ActionBar.g6.H6, false));
                                break;
                            default:
                                yd0 yd0Var2 = this.f43191b;
                                if (yd0Var2.f44790x == 0) {
                                    yd0Var2.o(null, null);
                                } else {
                                    yd0Var2.o(yd0Var2.f44786n, null);
                                }
                                break;
                        }
                    }
                });
                linearLayout.addView(imageView, h7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                jc0Var.addView(linearLayout, h7.z5.c(-2.0f, -1));
            } else {
                jc0Var.addView(this.f44782b[i12], h7.z5.c(-2.0f, -1));
            }
            jc0Var.e(this.f44782b[i12]);
            addView(jc0Var, h7.z5.t(-1, -2, 1, 16, 16, 16, 0));
            this.f44782b[i12].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                    yd0 yd0Var = this.f43431a;
                    if (i12 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = yd0Var.f44782b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i14 == 5) {
                        yd0Var.h(null);
                        return true;
                    }
                    yd0Var.getClass();
                    return false;
                }
            });
            i12++;
            f10 = 18.0f;
        }
        if (i10 == 0) {
            this.d.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", R.string.PleaseEnterNewFirstPasswordLogin));
        } else {
            this.d.setText(LocaleController.getString("PasswordHintTextLogin", R.string.PasswordHintTextLogin));
        }
        TextView textView3 = new TextView(context);
        this.f44784e = textView3;
        textView3.setGravity(19);
        textView3.setTextSize(1, 15.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView3.setText(LocaleController.getString(R.string.YourEmailSkip));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView3, h7.z5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, h7.z5.q(-1, -1, 80));
        i6.q2(textView3);
        final int i14 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) {

            public final yd0 f43191b;

            {
                this.f43191b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        yd0 yd0Var = this.f43191b;
                        ImageView imageView2 = yd0Var.f44785f;
                        EditTextBoldCursor[] editTextBoldCursorArr = yd0Var.f44782b;
                        yd0Var.f44791y = !yd0Var.f44791y;
                        for (int i15 = 0; i15 < editTextBoldCursorArr.length; i15++) {
                            int selectionStart = editTextBoldCursorArr[i15].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i15].getSelectionEnd();
                            editTextBoldCursorArr[i15].setInputType((yd0Var.f44791y ? 144 : 128) | 1);
                            editTextBoldCursorArr[i15].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(yd0Var.f44791y));
                        imageView2.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, yd0Var.f44791y ? org.telegram.ui.ActionBar.g6.f23198l6 : org.telegram.ui.ActionBar.g6.H6, false));
                        break;
                    default:
                        yd0 yd0Var2 = this.f43191b;
                        if (yd0Var2.f44790x == 0) {
                            yd0Var2.o(null, null);
                        } else {
                            yd0Var2.o(yd0Var2.f44786n, null);
                        }
                        break;
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
        this.f44789w = false;
        return true;
    }

    @Override
    public final void d() {
        this.f44789w = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (this.f44789w) {
            return;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.f44782b;
        String string = editTextBoldCursorArr[0].getText().toString();
        int length = string.length();
        ig0 ig0Var = this.A;
        if (length == 0) {
            if (ig0Var.getParentActivity() == null) {
                return;
            }
            try {
                editTextBoldCursorArr[0].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
            return;
        }
        if (this.f44790x != 0) {
            this.f44789w = true;
            ig0Var.n1(0, true);
            o(this.f44786n, string);
        } else {
            if (!string.equals(editTextBoldCursorArr[1].getText().toString())) {
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
            bundle.putString("new_password", string);
            bundle.putString("password", this.f44787r);
            ig0Var.u1(10, true, bundle, false);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new r00(this, 18), ig0.f39078p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f44790x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.f44790x, this.v);
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
            editTextBoldCursorArr = this.f44782b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.f44787r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password passwordTLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f44788s = passwordTLdeserialize;
            TwoStepVerificationActivity.m0(passwordTLdeserialize);
        }
        this.f44786n = this.v.getString("new_password");
        ig0.T0(this.A, editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    @Override
    public final void n() {
        this.f44783c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f44782b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false));
        }
        for (org.telegram.ui.Components.jc0 jc0Var : this.f44781a) {
            jc0Var.f();
        }
        this.f44784e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        ImageView imageView = this.f44785f;
        if (imageView != null) {
            imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, this.f44791y ? org.telegram.ui.ActionBar.g6.f23198l6 : org.telegram.ui.ActionBar.g6.H6, false));
            imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(this.A.getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
        }
    }

    public final void o(String str, String str2) {
        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
        tL_auth_recoverPassword.code = this.h;
        if (!TextUtils.isEmpty(str)) {
            tL_auth_recoverPassword.flags |= 1;
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            passwordinputsettings.flags |= 1;
            passwordinputsettings.hint = str2 != null ? str2 : "";
            passwordinputsettings.new_algo = this.f44788s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.l11(this, str, str2, tL_auth_recoverPassword, 13));
    }
}
