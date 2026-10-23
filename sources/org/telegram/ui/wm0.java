package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
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
public final class wm0 extends org.telegram.ui.Components.tw0 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
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
    public final an0 Q;
    public String f43394a;
    public String f43395b;
    public final LinearLayout f43396c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f43397f;
    public final ImageView h;
    public final tm0 f43398n;
    public final tm0 f43399r;
    public final xm0 f43400s;
    public Timer v;
    public Timer f43401w;
    public final Object f43402x;
    public int f43403y;

    public wm0(an0 an0Var, Context context, int i10) {
        super(context);
        int i11;
        float f7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.Q = an0Var;
        this.f43402x = new Object();
        this.f43403y = 60000;
        this.E = 15000;
        this.K = "";
        this.N = "*";
        this.L = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i18 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.W(textView, i18, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f43397f = textView2;
        int i19 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.v0.q(textView2, i19, null, 1, 18.0f);
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
            f7 = 2.0f;
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
            f7 = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, w7.z5.q(-2, -2, 49));
            if (i10 == 1) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.sms_devices);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.r6.t(imageView2, i19, null, mode);
                frameLayout2.addView(imageView2, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView3 = new ImageView(context);
                this.h = imageView3;
                imageView3.setImageResource(R.drawable.sms_bubble);
                org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.P9, null, mode);
                frameLayout2.addView(imageView3, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentAppCodeTitle));
            } else {
                ImageView imageView4 = new ImageView(context);
                this.h = imageView4;
                imageView4.setImageResource(R.drawable.sms_code);
                org.telegram.ui.ActionBar.r6.t(imageView4, org.telegram.ui.ActionBar.k6.P9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView4, w7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentSmsCodeTitle));
            }
            addView(textView2, w7.z5.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, w7.z5.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f43396c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.z5.q(-2, 36, 1));
        if (i10 == 3) {
            linearLayout.setVisibility(8);
        }
        tm0 tm0Var = new tm0(context, 0);
        this.f43398n = tm0Var;
        org.telegram.ui.ActionBar.r6.W(tm0Var, i18, null);
        tm0Var.setLineSpacing(AndroidUtilities.dp(f7), 1.0f);
        if (i10 == 3) {
            tm0Var.setTextSize(1, 14.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(tm0Var, w7.z5.q(-2, -2, i12));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f43619a = paint;
            Paint paint2 = new Paint();
            view.f43620b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21248gi, false));
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21264hi, false));
            this.f43400s = view;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            tm0Var.setGravity(i13);
            addView((View) view, w7.z5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            tm0Var.setPadding(0, AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(10.0f));
            tm0Var.setTextSize(1, 15.0f);
            tm0Var.setGravity(49);
            addView(tm0Var, w7.z5.q(-2, -2, 49));
        }
        tm0 tm0Var2 = new tm0(context, 1);
        this.f43399r = tm0Var2;
        org.telegram.ui.ActionBar.r6.W(tm0Var2, org.telegram.ui.ActionBar.k6.q6, null);
        tm0Var2.setLineSpacing(AndroidUtilities.dp(f7), 1.0f);
        tm0Var2.setPadding(0, AndroidUtilities.dp(f7), 0, AndroidUtilities.dp(10.0f));
        tm0Var2.setTextSize(1, 15.0f);
        tm0Var2.setGravity(49);
        if (i10 == 1) {
            tm0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
        } else {
            tm0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCode));
        }
        addView(tm0Var2, w7.z5.q(-2, -2, 49));
        tm0Var2.setOnClickListener(new w50(this, 16));
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
        an0 an0Var = this.Q;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(an0Var.getParentActivity());
            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.StopVerification);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new rm0(this, 1));
            an0Var.showDialog(alertDialog$Builder.f20678a);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.f43394a;
        tL_auth_cancelCode.phone_code_hash = this.f43395b;
        i10 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new ci.d6(19), 2);
        r();
        q();
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
        r();
        q();
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.J) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            AndroidUtilities.shakeView(this.f43396c);
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
        an0 an0Var = this.Q;
        an0Var.M1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.f43394a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.f43395b;
        r();
        an0Var.x1();
        i10 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(verifyphone, new a50(15, this, verifyphone), 2);
    }

    @Override
    public final void j() {
        LinearLayout linearLayout = this.f43396c;
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
            this.f43394a = bundle.getString("phone");
            this.f43395b = bundle.getString("phoneHash");
            int i18 = bundle.getInt("timeout");
            this.f43403y = i18;
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
                    int i22 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i22, null);
                    org.telegram.ui.ActionBar.r6.x(this.d[i21], i22, null);
                    this.d[i21].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.d[i21].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                    org.telegram.ui.ActionBar.r6.z(this, mutate, org.telegram.ui.ActionBar.k6.f21327l6, null, PorterDuff.Mode.MULTIPLY);
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
                    this.f43396c.addView(editTextBoldCursor2, w7.z5.t(34, 36, 1, 0, 0, i10, 0));
                    this.d[i21].addTextChangedListener(new um0(this, i21));
                    this.d[i21].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i23, KeyEvent keyEvent) {
                            wm0 wm0Var = wm0.this;
                            if (i23 == 67) {
                                EditTextBoldCursor[] editTextBoldCursorArr3 = wm0Var.d;
                                int i24 = i21;
                                if (editTextBoldCursorArr3[i24].length() == 0 && i24 > 0) {
                                    int i25 = i24 - 1;
                                    EditTextBoldCursor editTextBoldCursor3 = wm0Var.d[i25];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    wm0Var.d[i25].requestFocus();
                                    wm0Var.d[i25].dispatchKeyEvent(keyEvent);
                                    return true;
                                }
                                return false;
                            }
                            wm0Var.getClass();
                            return false;
                        }
                    });
                    this.d[i21].setOnEditorActionListener(new ka(this, 9));
                }
            }
            xm0 xm0Var = this.f43400s;
            if (xm0Var != null) {
                if (this.M != 0) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                xm0Var.setVisibility(i15);
            }
            if (this.f43394a == null) {
                return;
            }
            String h = org.telegram.messenger.sl.h(new StringBuilder("+"), this.f43394a, jf.b.c());
            if (i17 == 2) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(h)));
            } else if (i17 == 3) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(h)));
            } else if (i17 == 4) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(h)));
            }
            this.e.setText(charSequence);
            if (i17 != 3) {
                AndroidUtilities.showKeyboard(this.d[0]);
                this.d[0].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.d[0]);
            }
            r();
            q();
            this.F = System.currentTimeMillis();
            tm0 tm0Var = this.f43399r;
            tm0 tm0Var2 = this.f43398n;
            if (i17 == 3) {
                int i23 = this.M;
                i11 = 2;
                if (i23 == 4 || i23 == 2) {
                    tm0Var.setVisibility(8);
                    tm0Var2.setVisibility(0);
                    int i24 = this.M;
                    if (i24 == 4) {
                        tm0Var2.setText(LocaleController.formatString("CallText", R.string.CallText, 1, 0));
                    } else if (i24 == 2) {
                        tm0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 1, 0));
                    }
                    p();
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
                tm0Var2.setText(LocaleController.formatString("CallText", i25, objArr));
                if (this.f43403y < 1000) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                tm0Var.setVisibility(i14);
                if (this.f43403y < 1000) {
                    i16 = 8;
                }
                tm0Var2.setVisibility(i16);
                p();
            } else if (i17 == 4 && this.M == 2) {
                tm0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
                if (this.f43403y < 1000) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                tm0Var.setVisibility(i12);
                if (this.f43403y < 1000) {
                    i16 = 8;
                }
                tm0Var2.setVisibility(i16);
                p();
            } else {
                tm0Var2.setVisibility(8);
                tm0Var.setVisibility(8);
                o();
            }
        }
    }

    public final void o() {
        if (this.f43401w != null) {
            return;
        }
        this.E = 15000;
        this.f43401w = new Timer();
        this.G = System.currentTimeMillis();
        this.f43401w.schedule(new e6.r(this, 4), 0L, 1000L);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.L != 3 && this.h != null) {
            int bottom = this.e.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            tm0 tm0Var = this.f43399r;
            if (tm0Var.getVisibility() == 0) {
                int measuredHeight2 = tm0Var.getMeasuredHeight();
                i14 = (measuredHeight + bottom) - measuredHeight2;
                tm0Var.layout(tm0Var.getLeft(), i14, tm0Var.getRight(), measuredHeight2 + i14);
            } else {
                tm0 tm0Var2 = this.f43398n;
                if (tm0Var2.getVisibility() == 0) {
                    int measuredHeight3 = tm0Var2.getMeasuredHeight();
                    i14 = (measuredHeight + bottom) - measuredHeight3;
                    tm0Var2.layout(tm0Var2.getLeft(), i14, tm0Var2.getRight(), measuredHeight3 + i14);
                } else {
                    i14 = measuredHeight + bottom;
                }
            }
            LinearLayout linearLayout = this.f43396c;
            int measuredHeight4 = linearLayout.getMeasuredHeight();
            int C = i2.o1.C(i14 - bottom, measuredHeight4, 2, bottom);
            linearLayout.layout(linearLayout.getLeft(), C, linearLayout.getRight(), measuredHeight4 + C);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        super.onMeasure(i10, i11);
        if (this.L != 3 && (imageView = this.h) != null) {
            int dp = AndroidUtilities.dp(35.0f) + this.e.getMeasuredHeight() + this.f43397f.getMeasuredHeight() + imageView.getMeasuredHeight();
            int dp2 = AndroidUtilities.dp(80.0f);
            int dp3 = AndroidUtilities.dp(291.0f);
            an0 an0Var = this.Q;
            if (an0Var.f35742s0 - dp < dp2) {
                setMeasuredDimension(getMeasuredWidth(), dp + dp2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(an0Var.f35742s0, dp3));
            }
        }
    }

    public final void p() {
        if (this.v != null) {
            return;
        }
        Timer timer = new Timer();
        this.v = timer;
        timer.schedule(new vm0(this), 0L, 1000L);
    }

    public final void q() {
        try {
            synchronized (this.f43402x) {
                Timer timer = this.f43401w;
                if (timer != null) {
                    timer.cancel();
                    this.f43401w = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void r() {
        try {
            synchronized (this.f43402x) {
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

    public final void s() {
        int i10;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f43394a);
        this.J = true;
        an0 an0Var = this.Q;
        an0Var.x1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.f43394a;
        tL_auth_resendCode.phone_code_hash = this.f43395b;
        i10 = ((org.telegram.ui.ActionBar.o2) an0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new ca(this, bundle, tL_auth_resendCode, 27), 2);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null) {
                int i10 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.d;
                    if (i10 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                        if (editTextBoldCursor != null) {
                            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
