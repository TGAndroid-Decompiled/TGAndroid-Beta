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
public final class wd0 extends org.telegram.ui.Components.bx0 {
    public int E;
    public int F;
    public final ig0 G;
    public final org.telegram.ui.Components.sd0[] f44637a;
    public final EditTextBoldCursor[] f44638b;
    public final TextView f44639c;
    public final TextView d;
    public final TextView e;
    public final ImageView f44640f;
    public String h;
    public String f44641n;
    public String f44642r;
    public TL_account.Password f44643s;
    public Bundle v;
    public boolean f44644w;
    public final int f44645x;
    public boolean f44646y;

    public wd0(ig0 ig0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        float f7;
        this.G = ig0Var;
        this.f44645x = i10;
        setOrientation(1);
        if (i10 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f44638b = new EditTextBoldCursor[i11];
        this.f44637a = new org.telegram.ui.Components.sd0[i11];
        TextView textView = new TextView(context);
        this.f44639c = textView;
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
        addView(textView, org.telegram.ui.Components.kb1.x(-2, -2, 1, 8, i12, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, org.telegram.ui.Components.kb1.x(-2, -2, 1, 8, 6, 8, 16));
        final int i15 = 0;
        while (i15 < this.f44638b.length) {
            org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(context, null);
            this.f44637a[i15] = sd0Var;
            if (i10 == 0) {
                if (i15 == 0) {
                    i13 = R.string.PleaseEnterNewFirstPasswordHint;
                } else {
                    i13 = R.string.PleaseEnterNewSecondPasswordHint;
                }
            } else {
                i13 = R.string.PasswordHintPlaceholder;
            }
            sd0Var.setText(LocaleController.getString(i13));
            this.f44638b[i15] = new EditTextBoldCursor(context);
            this.f44638b[i15].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f44638b[i15].setCursorWidth(1.5f);
            this.f44638b[i15].setImeOptions(268435461);
            this.f44638b[i15].setTextSize(1, f10);
            this.f44638b[i15].setMaxLines(1);
            this.f44638b[i15].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.f44638b[i15].setPadding(dp, dp, dp, dp);
            if (i10 == 0) {
                this.f44638b[i15].setInputType(129);
                this.f44638b[i15].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f44638b[i15].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f44638b[i15];
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            editTextBoldCursor.setGravity(i14);
            EditTextBoldCursor editTextBoldCursor2 = this.f44638b[i15];
            if (i15 == 0 && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            editTextBoldCursor2.addTextChangedListener(new vd0(this, z10));
            this.f44638b[i15].setOnFocusChangeListener(new rd(sd0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f44638b[i15], org.telegram.ui.Components.kb1.p(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f44640f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                f7 = f11;
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final wd0 f43301b;

                    {
                        this.f43301b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i16;
                        int i17;
                        switch (r2) {
                            case 0:
                                wd0 wd0Var = this.f43301b;
                                ImageView imageView2 = wd0Var.f44640f;
                                EditTextBoldCursor[] editTextBoldCursorArr = wd0Var.f44638b;
                                wd0Var.f44646y = !wd0Var.f44646y;
                                for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                                    int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                                    if (wd0Var.f44646y) {
                                        i17 = 144;
                                    } else {
                                        i17 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i17 | 1);
                                    editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(wd0Var.f44646y));
                                if (wd0Var.f44646y) {
                                    i16 = org.telegram.ui.ActionBar.y6.f23503l6;
                                } else {
                                    i16 = org.telegram.ui.ActionBar.y6.H6;
                                }
                                org.telegram.ui.ActionBar.f7.t(imageView2, i16, null, PorterDuff.Mode.SRC_ATOP);
                                return;
                            default:
                                wd0 wd0Var2 = this.f43301b;
                                if (wd0Var2.f44645x == 0) {
                                    wd0Var2.n(null, null);
                                    return;
                                } else {
                                    wd0Var2.n(wd0Var2.f44641n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, org.telegram.ui.Components.kb1.y(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                sd0Var.addView(linearLayout, org.telegram.ui.Components.kb1.g(-2.0f, -1));
            } else {
                f7 = f11;
                sd0Var.addView(this.f44638b[i15], org.telegram.ui.Components.kb1.g(-2.0f, -1));
            }
            sd0Var.e(this.f44638b[i15]);
            addView(sd0Var, org.telegram.ui.Components.kb1.x(-1, -2, 1, 16, 16, 16, 0));
            this.f44638b[i15].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                    wd0 wd0Var = wd0.this;
                    if (i15 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = wd0Var.f44638b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i16 == 5) {
                        wd0Var.h(null);
                        return true;
                    }
                    wd0Var.getClass();
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
        frameLayout.addView(textView3, org.telegram.ui.Components.kb1.h(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, org.telegram.ui.Components.kb1.u(-1, -1, 80));
        k6.c.h(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final wd0 f43301b;

            {
                this.f43301b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16;
                int i17;
                switch (r2) {
                    case 0:
                        wd0 wd0Var = this.f43301b;
                        ImageView imageView2 = wd0Var.f44640f;
                        EditTextBoldCursor[] editTextBoldCursorArr = wd0Var.f44638b;
                        wd0Var.f44646y = !wd0Var.f44646y;
                        for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                            int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                            if (wd0Var.f44646y) {
                                i17 = 144;
                            } else {
                                i17 = 128;
                            }
                            editTextBoldCursor3.setInputType(i17 | 1);
                            editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(wd0Var.f44646y));
                        if (wd0Var.f44646y) {
                            i16 = org.telegram.ui.ActionBar.y6.f23503l6;
                        } else {
                            i16 = org.telegram.ui.ActionBar.y6.H6;
                        }
                        org.telegram.ui.ActionBar.f7.t(imageView2, i16, null, PorterDuff.Mode.SRC_ATOP);
                        return;
                    default:
                        wd0 wd0Var2 = this.f43301b;
                        if (wd0Var2.f44645x == 0) {
                            wd0Var2.n(null, null);
                            return;
                        } else {
                            wd0Var2.n(wd0Var2.f44641n, null);
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
        this.G.p1(true, true);
        this.v = null;
        this.f44644w = false;
        return true;
    }

    @Override
    public final void d() {
        this.f44644w = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.f44644w) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f44638b;
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
            } else if (this.f44645x == 0) {
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
                bundle.putString("password", this.f44642r);
                ig0Var.z1(10, true, bundle, false);
            } else {
                this.f44644w = true;
                ig0Var.s1(0, true);
                n(this.f44641n, obj);
            }
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new r00(this, 20), ig0.f40139y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f44645x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.f44645x, this.v);
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
            editTextBoldCursorArr = this.f44638b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.f44642r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f44643s = TLdeserialize;
            TwoStepVerificationActivity.n0(TLdeserialize);
        }
        this.f44641n = this.v.getString("new_password");
        ig0.W0(this.G, editTextBoldCursorArr[0]);
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
            passwordinputsettings.new_algo = this.f44643s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.e10(this, str, str2, tL_auth_recoverPassword, 25));
    }

    @Override
    public final void updateColors() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i10;
        this.f44639c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f44638b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23503l6, false));
        }
        for (org.telegram.ui.Components.sd0 sd0Var : this.f44637a) {
            sd0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23598q6, false));
        ImageView imageView = this.f44640f;
        if (imageView != null) {
            if (this.f44646y) {
                i10 = org.telegram.ui.ActionBar.y6.f23503l6;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.H6;
            }
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            ig0.h1(imageView, x02, this.E, PorterDuff.Mode.SRC_ATOP);
            this.E = x02;
            int themedColor = this.G.getThemedColor(org.telegram.ui.ActionBar.y6.f23449i6);
            ig0.i1(imageView, themedColor, this.F);
            this.F = themedColor;
        }
    }
}
