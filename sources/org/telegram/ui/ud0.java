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
public final class ud0 extends org.telegram.ui.Components.ax0 {
    public int E;
    public int F;
    public final gg0 G;
    public final org.telegram.ui.Components.rd0[] f44102a;
    public final EditTextBoldCursor[] f44103b;
    public final TextView f44104c;
    public final TextView d;
    public final TextView e;
    public final ImageView f44105f;
    public String h;
    public String f44106n;
    public String f44107r;
    public TL_account.Password f44108s;
    public Bundle v;
    public boolean f44109w;
    public final int f44110x;
    public boolean f44111y;

    public ud0(gg0 gg0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        float f7;
        this.G = gg0Var;
        this.f44110x = i10;
        setOrientation(1);
        if (i10 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f44103b = new EditTextBoldCursor[i11];
        this.f44102a = new org.telegram.ui.Components.rd0[i11];
        TextView textView = new TextView(context);
        this.f44104c = textView;
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
        addView(textView, org.telegram.ui.Components.gb1.x(-2, -2, 1, 8, i12, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, org.telegram.ui.Components.gb1.x(-2, -2, 1, 8, 6, 8, 16));
        final int i15 = 0;
        while (i15 < this.f44103b.length) {
            org.telegram.ui.Components.rd0 rd0Var = new org.telegram.ui.Components.rd0(context, null);
            this.f44102a[i15] = rd0Var;
            if (i10 == 0) {
                if (i15 == 0) {
                    i13 = R.string.PleaseEnterNewFirstPasswordHint;
                } else {
                    i13 = R.string.PleaseEnterNewSecondPasswordHint;
                }
            } else {
                i13 = R.string.PasswordHintPlaceholder;
            }
            rd0Var.setText(LocaleController.getString(i13));
            this.f44103b[i15] = new EditTextBoldCursor(context);
            this.f44103b[i15].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f44103b[i15].setCursorWidth(1.5f);
            this.f44103b[i15].setImeOptions(268435461);
            this.f44103b[i15].setTextSize(1, f10);
            this.f44103b[i15].setMaxLines(1);
            this.f44103b[i15].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.f44103b[i15].setPadding(dp, dp, dp, dp);
            if (i10 == 0) {
                this.f44103b[i15].setInputType(129);
                this.f44103b[i15].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f44103b[i15].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f44103b[i15];
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            editTextBoldCursor.setGravity(i14);
            EditTextBoldCursor editTextBoldCursor2 = this.f44103b[i15];
            if (i15 == 0 && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            editTextBoldCursor2.addTextChangedListener(new td0(this, z10));
            this.f44103b[i15].setOnFocusChangeListener(new rd(rd0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f44103b[i15], org.telegram.ui.Components.gb1.p(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f44105f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                f7 = f11;
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final ud0 f42815b;

                    {
                        this.f42815b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i16;
                        int i17;
                        switch (r2) {
                            case 0:
                                ud0 ud0Var = this.f42815b;
                                ImageView imageView2 = ud0Var.f44105f;
                                EditTextBoldCursor[] editTextBoldCursorArr = ud0Var.f44103b;
                                ud0Var.f44111y = !ud0Var.f44111y;
                                for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                                    int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                                    if (ud0Var.f44111y) {
                                        i17 = 144;
                                    } else {
                                        i17 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i17 | 1);
                                    editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(ud0Var.f44111y));
                                if (ud0Var.f44111y) {
                                    i16 = org.telegram.ui.ActionBar.y6.f23502l6;
                                } else {
                                    i16 = org.telegram.ui.ActionBar.y6.H6;
                                }
                                org.telegram.ui.ActionBar.f7.t(imageView2, i16, null, PorterDuff.Mode.SRC_ATOP);
                                return;
                            default:
                                ud0 ud0Var2 = this.f42815b;
                                if (ud0Var2.f44110x == 0) {
                                    ud0Var2.n(null, null);
                                    return;
                                } else {
                                    ud0Var2.n(ud0Var2.f44106n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, org.telegram.ui.Components.gb1.y(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                rd0Var.addView(linearLayout, org.telegram.ui.Components.gb1.g(-2.0f, -1));
            } else {
                f7 = f11;
                rd0Var.addView(this.f44103b[i15], org.telegram.ui.Components.gb1.g(-2.0f, -1));
            }
            rd0Var.e(this.f44103b[i15]);
            addView(rd0Var, org.telegram.ui.Components.gb1.x(-1, -2, 1, 16, 16, 16, 0));
            this.f44103b[i15].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                    ud0 ud0Var = ud0.this;
                    if (i15 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = ud0Var.f44103b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i16 == 5) {
                        ud0Var.h(null);
                        return true;
                    }
                    ud0Var.getClass();
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
        frameLayout.addView(textView3, org.telegram.ui.Components.gb1.h(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, org.telegram.ui.Components.gb1.u(-1, -1, 80));
        k6.c.h(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final ud0 f42815b;

            {
                this.f42815b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16;
                int i17;
                switch (r2) {
                    case 0:
                        ud0 ud0Var = this.f42815b;
                        ImageView imageView2 = ud0Var.f44105f;
                        EditTextBoldCursor[] editTextBoldCursorArr = ud0Var.f44103b;
                        ud0Var.f44111y = !ud0Var.f44111y;
                        for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                            int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                            if (ud0Var.f44111y) {
                                i17 = 144;
                            } else {
                                i17 = 128;
                            }
                            editTextBoldCursor3.setInputType(i17 | 1);
                            editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(ud0Var.f44111y));
                        if (ud0Var.f44111y) {
                            i16 = org.telegram.ui.ActionBar.y6.f23502l6;
                        } else {
                            i16 = org.telegram.ui.ActionBar.y6.H6;
                        }
                        org.telegram.ui.ActionBar.f7.t(imageView2, i16, null, PorterDuff.Mode.SRC_ATOP);
                        return;
                    default:
                        ud0 ud0Var2 = this.f42815b;
                        if (ud0Var2.f44110x == 0) {
                            ud0Var2.n(null, null);
                            return;
                        } else {
                            ud0Var2.n(ud0Var2.f44106n, null);
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
        this.f44109w = false;
        return true;
    }

    @Override
    public final void d() {
        this.f44109w = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.f44109w) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f44103b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            gg0 gg0Var = this.G;
            if (length == 0) {
                if (gg0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
                }
            } else if (this.f44110x == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (gg0Var.getParentActivity() == null) {
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
                bundle.putString("password", this.f44107r);
                gg0Var.z1(10, true, bundle, false);
            } else {
                this.f44109w = true;
                gg0Var.s1(0, true);
                n(this.f44106n, obj);
            }
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new p00(this, 20), gg0.f39650x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f44110x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.f44110x, this.v);
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
            editTextBoldCursorArr = this.f44103b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.f44107r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f44108s = TLdeserialize;
            TwoStepVerificationActivity.n0(TLdeserialize);
        }
        this.f44106n = this.v.getString("new_password");
        gg0.W0(this.G, editTextBoldCursorArr[0]);
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
            passwordinputsettings.new_algo = this.f44108s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.e10(this, str, str2, tL_auth_recoverPassword, 25));
    }

    @Override
    public final void updateColors() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i10;
        this.f44104c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f44103b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23502l6, false));
        }
        for (org.telegram.ui.Components.rd0 rd0Var : this.f44102a) {
            rd0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23597q6, false));
        ImageView imageView = this.f44105f;
        if (imageView != null) {
            if (this.f44111y) {
                i10 = org.telegram.ui.ActionBar.y6.f23502l6;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.H6;
            }
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            gg0.h1(imageView, x02, this.E, PorterDuff.Mode.SRC_ATOP);
            this.E = x02;
            int themedColor = this.G.getThemedColor(org.telegram.ui.ActionBar.y6.f23448i6);
            gg0.i1(imageView, themedColor, this.F);
            this.F = themedColor;
        }
    }
}
