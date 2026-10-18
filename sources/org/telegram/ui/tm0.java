package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tm0 extends org.telegram.ui.Components.ow0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int R = 0;
    public int E;
    public double F;
    public double G;
    public boolean H;
    public boolean I;
    public boolean J;
    public String K;
    public final int L;
    public int M;
    public String N;
    public int O;
    public int P;
    public final xm0 Q;
    public String f41764a;
    public String f41765b;
    public final LinearLayout f41766c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f41767f;
    public final ImageView h;
    public final md0 f41768n;
    public final md0 f41769r;
    public final um0 f41770s;
    public Timer v;
    public Timer f41771w;
    public final Object f41772x;
    public int f41773y;

    public tm0(xm0 xm0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.Q = xm0Var;
        this.f41772x = new Object();
        this.f41773y = 60000;
        this.E = 15000;
        this.K = "";
        this.N = "*";
        this.L = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i18 = org.telegram.ui.ActionBar.h6.D6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f41767f = textView2;
        int i19 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.messenger.g0.m(18.0f, org.telegram.ui.ActionBar.h6.x0(null, i19, false), 1, textView2);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i10 == 3) {
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView.setGravity(i14 | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            addView(frameLayout, w7.z5.q(-2, -2, i15));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.phone_activate);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                frameLayout.addView(imageView, w7.z5.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                if (LocaleController.isRTL) {
                    i17 = 5;
                } else {
                    i17 = 3;
                }
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, i17, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                if (z10) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, i16, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(imageView, w7.z5.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, w7.z5.q(-2, -2, 49));
            if (i10 == 1) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.sms_devices);
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i19, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView2.setColorFilter(new PorterDuffColorFilter(x02, mode));
                frameLayout2.addView(imageView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView3 = new ImageView(context);
                this.h = imageView3;
                imageView3.setImageResource(R.drawable.sms_bubble);
                imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.P9, false), mode));
                frameLayout2.addView(imageView3, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentAppCodeTitle));
            } else {
                ImageView imageView4 = new ImageView(context);
                this.h = imageView4;
                imageView4.setImageResource(R.drawable.sms_code);
                imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.P9, false), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView4, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentSmsCodeTitle));
            }
            addView(textView2, w7.z5.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, w7.z5.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f41766c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.q(-2, 36, 1));
        if (i10 == 3) {
            linearLayout.setVisibility(8);
        }
        md0 md0Var = new md0(context, 1);
        this.f41768n = md0Var;
        md0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
        md0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        if (i10 == 3) {
            md0Var.setTextSize(1, 14.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(md0Var, w7.z5.q(-2, -2, i12));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f41986a = paint;
            Paint paint2 = new Paint();
            view.f41987b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21051gi, false));
            paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21067hi, false));
            this.f41770s = view;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            md0Var.setGravity(i13);
            addView((View) view, w7.z5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            md0Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
            md0Var.setTextSize(1, 15.0f);
            md0Var.setGravity(49);
            addView(md0Var, w7.z5.q(-2, -2, 49));
        }
        md0 md0Var2 = new md0(context, 2);
        this.f41769r = md0Var2;
        md0Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        md0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        md0Var2.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
        md0Var2.setTextSize(1, 15.0f);
        md0Var2.setGravity(49);
        if (i10 == 1) {
            md0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
        } else {
            md0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCode));
        }
        addView(md0Var2, w7.z5.q(-2, -2, 49));
        md0Var2.setOnClickListener(new y50(this, 15));
    }

    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i10 < editTextBoldCursorArr.length) {
                sb2.append(jf.b.d(editTextBoldCursorArr[i10].getText().toString(), false));
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        int i10;
        xm0 xm0Var = this.Q;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.StopVerification);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new pm0(this, 1));
            xm0Var.showDialog(alertDialog$Builder.f20601a);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.f41764a;
        tL_auth_cancelCode.phone_code_hash = this.f41765b;
        i10 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ci.d6(19), 2);
        s();
        r();
        int i11 = this.L;
        if (i11 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i11 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.I = false;
        return true;
    }

    @Override
    public final void d() {
        this.J = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.I && (editTextBoldCursorArr = this.d) != null) {
            if (i10 == NotificationCenter.didReceiveSmsCode) {
                editTextBoldCursorArr[0].setText("" + objArr[0]);
                h(null);
            } else if (i10 == NotificationCenter.didReceiveCall) {
                String str = "" + objArr[0];
                if (AndroidUtilities.checkPhonePattern(this.N, str)) {
                    this.H = true;
                    this.d[0].setText(str);
                    this.H = false;
                    h(null);
                }
            }
        }
    }

    @Override
    public final void f() {
        int i10 = this.L;
        if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.I = false;
        s();
        r();
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.J) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            AndroidUtilities.shakeView(this.f41766c);
            return;
        }
        this.J = true;
        int i11 = this.L;
        if (i11 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i11 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.I = false;
        xm0 xm0Var = this.Q;
        xm0Var.M1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.f41764a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.f41765b;
        s();
        xm0Var.x1();
        i10 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(verifyphone, new z40(15, this, verifyphone), 2);
    }

    @Override
    public final void j() {
        LinearLayout linearLayout = this.f41766c;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            for (int length = this.d.length - 1; length >= 0; length--) {
                if (length == 0 || this.d[length].length() != 0) {
                    this.d[length].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = this.d[length];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(this.d[length]);
                    return;
                }
            }
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        if (bundle != null) {
            this.I = true;
            int i17 = this.L;
            if (i17 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i17 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f41764a = bundle.getString("phone");
            this.f41765b = bundle.getString("phoneHash");
            int i18 = bundle.getInt("timeout");
            this.f41773y = i18;
            this.P = i18;
            this.M = bundle.getInt("nextType");
            this.N = bundle.getString("pattern");
            int i19 = bundle.getInt("length");
            this.O = i19;
            if (i19 == 0) {
                this.O = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            CharSequence charSequence = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.O) {
                int i20 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.d;
                    if (i20 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    editTextBoldCursorArr2[i20].setText("");
                    i20++;
                }
            } else {
                this.d = new EditTextBoldCursor[this.O];
                for (final int i21 = 0; i21 < this.O; i21++) {
                    this.d[i21] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.d[i21];
                    int i22 = org.telegram.ui.ActionBar.h6.G6;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i22, false));
                    this.d[i21].setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i22, false));
                    this.d[i21].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.d[i21].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21130l6, false), PorterDuff.Mode.MULTIPLY));
                    this.d[i21].setBackgroundDrawable(mutate);
                    this.d[i21].setImeOptions(268435461);
                    this.d[i21].setTextSize(1, 20.0f);
                    this.d[i21].setMaxLines(1);
                    this.d[i21].setTypeface(AndroidUtilities.bold());
                    this.d[i21].setPadding(0, 0, 0, 0);
                    this.d[i21].setGravity(49);
                    if (i17 == 3) {
                        this.d[i21].setEnabled(false);
                        this.d[i21].setInputType(0);
                        this.d[i21].setVisibility(8);
                    } else {
                        this.d[i21].setInputType(3);
                    }
                    EditTextBoldCursor editTextBoldCursor2 = this.d[i21];
                    if (i21 != this.O - 1) {
                        i10 = 7;
                    } else {
                        i10 = 0;
                    }
                    this.f41766c.addView(editTextBoldCursor2, w7.z5.t(34, 36, 1, 0, 0, i10, 0));
                    this.d[i21].addTextChangedListener(new rm0(this, i21));
                    this.d[i21].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i23, KeyEvent keyEvent) {
                            tm0 tm0Var = tm0.this;
                            if (i23 == 67) {
                                EditTextBoldCursor[] editTextBoldCursorArr3 = tm0Var.d;
                                int i24 = i21;
                                if (editTextBoldCursorArr3[i24].length() == 0 && i24 > 0) {
                                    int i25 = i24 - 1;
                                    EditTextBoldCursor editTextBoldCursor3 = tm0Var.d[i25];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    tm0Var.d[i25].requestFocus();
                                    tm0Var.d[i25].dispatchKeyEvent(keyEvent);
                                    return true;
                                }
                                return false;
                            }
                            tm0Var.getClass();
                            return false;
                        }
                    });
                    this.d[i21].setOnEditorActionListener(new ma(this, 9));
                }
            }
            um0 um0Var = this.f41770s;
            if (um0Var != null) {
                if (this.M != 0) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                um0Var.setVisibility(i15);
            }
            if (this.f41764a == null) {
                return;
            }
            String g10 = org.telegram.messenger.lk.g(new StringBuilder("+"), this.f41764a, jf.b.c());
            if (i17 == 2) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(g10)));
            } else if (i17 == 3) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(g10)));
            } else if (i17 == 4) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(g10)));
            }
            this.e.setText(charSequence);
            if (i17 != 3) {
                AndroidUtilities.showKeyboard(this.d[0]);
                this.d[0].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.d[0]);
            }
            s();
            r();
            this.F = System.currentTimeMillis();
            md0 md0Var = this.f41769r;
            md0 md0Var2 = this.f41768n;
            if (i17 == 3) {
                int i23 = this.M;
                i11 = 2;
                if (i23 == 4 || i23 == 2) {
                    md0Var.setVisibility(8);
                    md0Var2.setVisibility(0);
                    int i24 = this.M;
                    if (i24 == 4) {
                        md0Var2.setText(LocaleController.formatString("CallText", R.string.CallText, 1, 0));
                    } else if (i24 == 2) {
                        md0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 1, 0));
                    }
                    q();
                    return;
                }
            } else {
                i11 = 2;
            }
            if (i17 == i11 && ((i13 = this.M) == 4 || i13 == 3)) {
                int i25 = R.string.CallText;
                Object[] objArr = new Object[i11];
                objArr[0] = 2;
                objArr[1] = 0;
                md0Var2.setText(LocaleController.formatString("CallText", i25, objArr));
                if (this.f41773y < 1000) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                md0Var.setVisibility(i14);
                if (this.f41773y < 1000) {
                    i16 = 8;
                }
                md0Var2.setVisibility(i16);
                q();
            } else if (i17 == 4 && this.M == 2) {
                md0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
                if (this.f41773y < 1000) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                md0Var.setVisibility(i12);
                if (this.f41773y < 1000) {
                    i16 = 8;
                }
                md0Var2.setVisibility(i16);
                q();
            } else {
                md0Var2.setVisibility(8);
                md0Var.setVisibility(8);
                p();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.L != 3 && this.h != null) {
            int bottom = this.e.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            md0 md0Var = this.f41769r;
            if (md0Var.getVisibility() == 0) {
                int measuredHeight2 = md0Var.getMeasuredHeight();
                i14 = (measuredHeight + bottom) - measuredHeight2;
                md0Var.layout(md0Var.getLeft(), i14, md0Var.getRight(), measuredHeight2 + i14);
            } else {
                md0 md0Var2 = this.f41768n;
                if (md0Var2.getVisibility() == 0) {
                    int measuredHeight3 = md0Var2.getMeasuredHeight();
                    i14 = (measuredHeight + bottom) - measuredHeight3;
                    md0Var2.layout(md0Var2.getLeft(), i14, md0Var2.getRight(), measuredHeight3 + i14);
                } else {
                    i14 = measuredHeight + bottom;
                }
            }
            LinearLayout linearLayout = this.f41766c;
            int measuredHeight4 = linearLayout.getMeasuredHeight();
            int C = i2.d.C(i14 - bottom, measuredHeight4, 2, bottom);
            linearLayout.layout(linearLayout.getLeft(), C, linearLayout.getRight(), measuredHeight4 + C);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        super.onMeasure(i10, i11);
        if (this.L != 3 && (imageView = this.h) != null) {
            int dp = AndroidUtilities.dp(35.0f) + this.e.getMeasuredHeight() + this.f41767f.getMeasuredHeight() + imageView.getMeasuredHeight();
            int dp2 = AndroidUtilities.dp(80.0f);
            int dp3 = AndroidUtilities.dp(291.0f);
            xm0 xm0Var = this.Q;
            if (xm0Var.f43186s0 - dp < dp2) {
                setMeasuredDimension(getMeasuredWidth(), dp + dp2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(xm0Var.f43186s0, dp3));
            }
        }
    }

    public final void p() {
        if (this.f41771w != null) {
            return;
        }
        this.E = 15000;
        this.f41771w = new Timer();
        this.G = System.currentTimeMillis();
        this.f41771w.schedule(new e6.r(this, 4), 0L, 1000L);
    }

    public final void q() {
        if (this.v != null) {
            return;
        }
        Timer timer = new Timer();
        this.v = timer;
        timer.schedule(new sm0(this), 0L, 1000L);
    }

    public final void r() {
        try {
            synchronized (this.f41772x) {
                Timer timer = this.f41771w;
                if (timer != null) {
                    timer.cancel();
                    this.f41771w = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void s() {
        try {
            synchronized (this.f41772x) {
                Timer timer = this.v;
                if (timer != null) {
                    timer.cancel();
                    this.v = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t() {
        int i10;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f41764a);
        this.J = true;
        xm0 xm0Var = this.Q;
        xm0Var.x1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.f41764a;
        tL_auth_resendCode.phone_code_hash = this.f41765b;
        i10 = ((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new ea(this, bundle, tL_auth_resendCode, 27), 2);
    }
}
