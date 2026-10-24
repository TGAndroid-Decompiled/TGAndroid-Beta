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
public final class wd0 extends org.telegram.ui.Components.sw0 {
    public int E;
    public int F;
    public final hg0 G;
    public final org.telegram.ui.Components.td0[] f42996a;
    public final EditTextBoldCursor[] f42997b;
    public final TextView f42998c;
    public final TextView d;
    public final TextView e;
    public final ImageView f42999f;
    public String h;
    public String f43000n;
    public String f43001r;
    public TL_account.Password f43002s;
    public Bundle v;
    public boolean f43003w;
    public final int f43004x;
    public boolean f43005y;

    public wd0(hg0 hg0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        float f7;
        this.G = hg0Var;
        this.f43004x = i10;
        setOrientation(1);
        if (i10 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        this.f42997b = new EditTextBoldCursor[i11];
        this.f42996a = new org.telegram.ui.Components.td0[i11];
        TextView textView = new TextView(context);
        this.f42998c = textView;
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
        while (i15 < this.f42997b.length) {
            org.telegram.ui.Components.td0 td0Var = new org.telegram.ui.Components.td0(context, null);
            this.f42996a[i15] = td0Var;
            if (i10 == 0) {
                if (i15 == 0) {
                    i13 = R.string.PleaseEnterNewFirstPasswordHint;
                } else {
                    i13 = R.string.PleaseEnterNewSecondPasswordHint;
                }
            } else {
                i13 = R.string.PasswordHintPlaceholder;
            }
            td0Var.setText(LocaleController.getString(i13));
            this.f42997b[i15] = new EditTextBoldCursor(context);
            this.f42997b[i15].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f42997b[i15].setCursorWidth(1.5f);
            this.f42997b[i15].setImeOptions(268435461);
            this.f42997b[i15].setTextSize(1, f10);
            this.f42997b[i15].setMaxLines(1);
            this.f42997b[i15].setBackground(null);
            int dp = AndroidUtilities.dp(16.0f);
            this.f42997b[i15].setPadding(dp, dp, dp, dp);
            if (i10 == 0) {
                this.f42997b[i15].setInputType(129);
                this.f42997b[i15].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f42997b[i15].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.f42997b[i15];
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            editTextBoldCursor.setGravity(i14);
            EditTextBoldCursor editTextBoldCursor2 = this.f42997b[i15];
            if (i15 == 0 && i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            editTextBoldCursor2.addTextChangedListener(new vd0(this, z10));
            this.f42997b[i15].setOnFocusChangeListener(new pd(td0Var, 3));
            if (z10) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.f42997b[i15], w7.z5.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f42999f = imageView;
                imageView.setImageResource(R.drawable.msg_message);
                AndroidUtilities.updateViewVisibilityAnimated(imageView, true, 0.1f, false);
                f7 = f11;
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final wd0 f41349b;

                    {
                        this.f41349b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i16;
                        int i17;
                        switch (r2) {
                            case 0:
                                wd0 wd0Var = this.f41349b;
                                ImageView imageView2 = wd0Var.f42999f;
                                EditTextBoldCursor[] editTextBoldCursorArr = wd0Var.f42997b;
                                wd0Var.f43005y = !wd0Var.f43005y;
                                for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                                    int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                                    if (wd0Var.f43005y) {
                                        i17 = 144;
                                    } else {
                                        i17 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i17 | 1);
                                    editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(wd0Var.f43005y));
                                if (wd0Var.f43005y) {
                                    i16 = org.telegram.ui.ActionBar.k6.f21328l6;
                                } else {
                                    i16 = org.telegram.ui.ActionBar.k6.H6;
                                }
                                org.telegram.ui.ActionBar.r6.t(imageView2, i16, null, PorterDuff.Mode.SRC_ATOP);
                                return;
                            default:
                                wd0 wd0Var2 = this.f41349b;
                                if (wd0Var2.f43004x == 0) {
                                    wd0Var2.n(null, null);
                                    return;
                                } else {
                                    wd0Var2.n(wd0Var2.f43000n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, w7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                td0Var.addView(linearLayout, w7.z5.c(-2.0f, -1));
            } else {
                f7 = f11;
                td0Var.addView(this.f42997b[i15], w7.z5.c(-2.0f, -1));
            }
            td0Var.e(this.f42997b[i15]);
            addView(td0Var, w7.z5.t(-1, -2, 1, 16, 16, 16, 0));
            this.f42997b[i15].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i16, KeyEvent keyEvent) {
                    wd0 wd0Var = wd0.this;
                    if (i15 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = wd0Var.f42997b;
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
        frameLayout.addView(textView3, w7.z5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, w7.z5.q(-1, -1, 80));
        m.g3.p(textView3);
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final wd0 f41349b;

            {
                this.f41349b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16;
                int i17;
                switch (r2) {
                    case 0:
                        wd0 wd0Var = this.f41349b;
                        ImageView imageView2 = wd0Var.f42999f;
                        EditTextBoldCursor[] editTextBoldCursorArr = wd0Var.f42997b;
                        wd0Var.f43005y = !wd0Var.f43005y;
                        for (int i18 = 0; i18 < editTextBoldCursorArr.length; i18++) {
                            int selectionStart = editTextBoldCursorArr[i18].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i18].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i18];
                            if (wd0Var.f43005y) {
                                i17 = 144;
                            } else {
                                i17 = 128;
                            }
                            editTextBoldCursor3.setInputType(i17 | 1);
                            editTextBoldCursorArr[i18].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(wd0Var.f43005y));
                        if (wd0Var.f43005y) {
                            i16 = org.telegram.ui.ActionBar.k6.f21328l6;
                        } else {
                            i16 = org.telegram.ui.ActionBar.k6.H6;
                        }
                        org.telegram.ui.ActionBar.r6.t(imageView2, i16, null, PorterDuff.Mode.SRC_ATOP);
                        return;
                    default:
                        wd0 wd0Var2 = this.f41349b;
                        if (wd0Var2.f43004x == 0) {
                            wd0Var2.n(null, null);
                            return;
                        } else {
                            wd0Var2.n(wd0Var2.f43000n, null);
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
        this.f43003w = false;
        return true;
    }

    @Override
    public final void d() {
        this.f43003w = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (!this.f43003w) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.f42997b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            hg0 hg0Var = this.G;
            if (length == 0) {
                if (hg0Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    AndroidUtilities.shakeView(editTextBoldCursorArr[0]);
                }
            } else if (this.f43004x == 0) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (hg0Var.getParentActivity() == null) {
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
                bundle.putString("password", this.f43001r);
                hg0Var.y1(10, true, bundle, false);
            } else {
                this.f43003w = true;
                hg0Var.r1(0, true);
                n(this.f43000n, obj);
            }
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new fz(this, 20), hg0.f37832x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.f43004x);
        this.v = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.v != null) {
            bundle.putBundle("recoveryview_params" + this.f43004x, this.v);
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
            editTextBoldCursorArr = this.f42997b;
            if (i10 >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i10].setText("");
            i10++;
        }
        this.v = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.v.getString("password");
        this.f43001r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.f43002s = TLdeserialize;
            TwoStepVerificationActivity.m0(TLdeserialize);
        }
        this.f43000n = this.v.getString("new_password");
        hg0.V0(this.G, editTextBoldCursorArr[0]);
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
            passwordinputsettings.new_algo = this.f43002s.new_algo;
        }
        Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.h90(this, str, str2, tL_auth_recoverPassword, 22));
    }

    @Override
    public final void updateColors() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i10;
        this.f42998c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.f42997b) {
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21328l6, false));
        }
        for (org.telegram.ui.Components.td0 td0Var : this.f42996a) {
            td0Var.f();
        }
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        ImageView imageView = this.f42999f;
        if (imageView != null) {
            if (this.f43005y) {
                i10 = org.telegram.ui.ActionBar.k6.f21328l6;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.H6;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            hg0.g1(imageView, x02, this.E, PorterDuff.Mode.SRC_ATOP);
            this.E = x02;
            int themedColor = this.G.getThemedColor(org.telegram.ui.ActionBar.k6.f21273i6);
            hg0.h1(imageView, themedColor, this.F);
            this.F = themedColor;
        }
    }
}
