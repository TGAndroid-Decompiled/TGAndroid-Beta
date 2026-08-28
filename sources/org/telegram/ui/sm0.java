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
public final class sm0 extends org.telegram.ui.Components.cv0 implements NotificationCenter.NotificationCenterDelegate {
    public static final int N = 0;
    public int A;
    public double B;
    public double C;
    public boolean D;
    public boolean E;
    public boolean F;
    public String G;
    public final int H;
    public int I;
    public String J;
    public int K;
    public int L;
    public final wm0 M;
    public String f42720a;
    public String f42721b;
    public final LinearLayout f42722c;
    public EditTextBoldCursor[] d;
    public final TextView f42723e;
    public final TextView f42724f;
    public final ImageView h;
    public final nd0 f42725n;
    public final nd0 f42726r;
    public final tm0 f42727s;
    public Timer v;
    public Timer f42728w;
    public final Object f42729x;
    public int f42730y;

    public sm0(wm0 wm0Var, Context context, int i9) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.M = wm0Var;
        this.f42729x = new Object();
        this.f42730y = 60000;
        this.A = 15000;
        this.G = "";
        this.J = "*";
        this.H = i9;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f42723e = textView;
        int i17 = org.telegram.ui.ActionBar.f6.D6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i17, false));
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f42724f = textView2;
        int i18 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.messenger.l0.q(textView2, org.telegram.ui.ActionBar.f6.w0(null, i18, false), 1, 18.0f);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setGravity(i10);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i9 == 3) {
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView.setGravity(i13 | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            addView(frameLayout, g7.e6.q(-2, -2, i14));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.phone_activate);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                frameLayout.addView(imageView, g7.e6.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                if (LocaleController.isRTL) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout.addView(textView, g7.e6.d(-1, -2.0f, i16, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                if (z10) {
                    i15 = 5;
                } else {
                    i15 = 3;
                }
                frameLayout.addView(textView, g7.e6.d(-1, -2.0f, i15, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(imageView, g7.e6.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, g7.e6.q(-2, -2, 49));
            if (i9 == 1) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.sms_devices);
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, i18, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                frameLayout2.addView(imageView2, g7.e6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView3 = new ImageView(context);
                this.h = imageView3;
                imageView3.setImageResource(R.drawable.sms_bubble);
                imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false), mode));
                frameLayout2.addView(imageView3, g7.e6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentAppCodeTitle));
            } else {
                ImageView imageView4 = new ImageView(context);
                this.h = imageView4;
                imageView4.setImageResource(R.drawable.sms_code);
                imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView4, g7.e6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentSmsCodeTitle));
            }
            addView(textView2, g7.e6.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, g7.e6.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42722c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, g7.e6.q(-2, 36, 1));
        if (i9 == 3) {
            linearLayout.setVisibility(8);
        }
        nd0 nd0Var = new nd0(context, 1);
        this.f42725n = nd0Var;
        nd0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i17, false));
        nd0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        if (i9 == 3) {
            nd0Var.setTextSize(1, 14.0f);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(nd0Var, g7.e6.q(-2, -2, i11));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f43031a = paint;
            Paint paint2 = new Paint();
            view.f43032b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.gi, false));
            paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hi, false));
            this.f42727s = view;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            nd0Var.setGravity(i12);
            addView((View) view, g7.e6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            nd0Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
            nd0Var.setTextSize(1, 15.0f);
            nd0Var.setGravity(49);
            addView(nd0Var, g7.e6.q(-2, -2, 49));
        }
        nd0 nd0Var2 = new nd0(context, 2);
        this.f42726r = nd0Var2;
        nd0Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false));
        nd0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        nd0Var2.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
        nd0Var2.setTextSize(1, 15.0f);
        nd0Var2.setGravity(49);
        if (i9 == 1) {
            nd0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
        } else {
            nd0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCode));
        }
        addView(nd0Var2, g7.e6.q(-2, -2, 49));
        nd0Var2.setOnClickListener(new q50(this, 16));
    }

    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i9 < editTextBoldCursorArr.length) {
                sb2.append(ne.b.d(editTextBoldCursorArr[i9].getText().toString(), false));
                i9++;
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
        int i9;
        wm0 wm0Var = this.M;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wm0Var.getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.StopVerification);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new om0(this, 1));
            wm0Var.showDialog(alertDialog$Builder.f22702a);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.f42720a;
        tL_auth_cancelCode.phone_code_hash = this.f42721b;
        i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_auth_cancelCode, new ih.q5(16), 2);
        s();
        r();
        int i10 = this.H;
        if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.E = false;
        return true;
    }

    @Override
    public final void d() {
        this.F = false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.E && (editTextBoldCursorArr = this.d) != null) {
            if (i9 == NotificationCenter.didReceiveSmsCode) {
                editTextBoldCursorArr[0].setText("" + objArr[0]);
                h(null);
            } else if (i9 == NotificationCenter.didReceiveCall) {
                String str = "" + objArr[0];
                if (AndroidUtilities.checkPhonePattern(this.J, str)) {
                    this.D = true;
                    this.d[0].setText(str);
                    this.D = false;
                    h(null);
                }
            }
        }
    }

    @Override
    public final void f() {
        int i9 = this.H;
        if (i9 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i9 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.E = false;
        s();
        r();
    }

    @Override
    public final void h(String str) {
        int i9;
        if (this.F) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            AndroidUtilities.shakeView(this.f42722c);
            return;
        }
        this.F = true;
        int i10 = this.H;
        if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.E = false;
        wm0 wm0Var = this.M;
        wm0Var.N1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.f42720a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.f42721b;
        s();
        wm0Var.y1();
        i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(verifyphone, new v40(15, this, verifyphone), 2);
    }

    @Override
    public final void j() {
        LinearLayout linearLayout = this.f42722c;
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
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (bundle != null) {
            this.E = true;
            int i16 = this.H;
            if (i16 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i16 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f42720a = bundle.getString("phone");
            this.f42721b = bundle.getString("phoneHash");
            int i17 = bundle.getInt("timeout");
            this.f42730y = i17;
            this.L = i17;
            this.I = bundle.getInt("nextType");
            this.J = bundle.getString("pattern");
            int i18 = bundle.getInt("length");
            this.K = i18;
            if (i18 == 0) {
                this.K = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            CharSequence charSequence = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.K) {
                int i19 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.d;
                    if (i19 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    editTextBoldCursorArr2[i19].setText("");
                    i19++;
                }
            } else {
                this.d = new EditTextBoldCursor[this.K];
                for (final int i20 = 0; i20 < this.K; i20++) {
                    this.d[i20] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.d[i20];
                    int i21 = org.telegram.ui.ActionBar.f6.G6;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i21, false));
                    this.d[i20].setCursorColor(org.telegram.ui.ActionBar.f6.w0(null, i21, false));
                    this.d[i20].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.d[i20].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23144l6, false), PorterDuff.Mode.MULTIPLY));
                    this.d[i20].setBackgroundDrawable(mutate);
                    this.d[i20].setImeOptions(268435461);
                    this.d[i20].setTextSize(1, 20.0f);
                    this.d[i20].setMaxLines(1);
                    this.d[i20].setTypeface(AndroidUtilities.bold());
                    this.d[i20].setPadding(0, 0, 0, 0);
                    this.d[i20].setGravity(49);
                    if (i16 == 3) {
                        this.d[i20].setEnabled(false);
                        this.d[i20].setInputType(0);
                        this.d[i20].setVisibility(8);
                    } else {
                        this.d[i20].setInputType(3);
                    }
                    EditTextBoldCursor editTextBoldCursor2 = this.d[i20];
                    if (i20 != this.K - 1) {
                        i9 = 7;
                    } else {
                        i9 = 0;
                    }
                    this.f42722c.addView(editTextBoldCursor2, g7.e6.t(34, 36, 1, 0, 0, i9, 0));
                    this.d[i20].addTextChangedListener(new qm0(this, i20));
                    this.d[i20].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i22, KeyEvent keyEvent) {
                            sm0 sm0Var = sm0.this;
                            if (i22 == 67) {
                                EditTextBoldCursor[] editTextBoldCursorArr3 = sm0Var.d;
                                int i23 = i20;
                                if (editTextBoldCursorArr3[i23].length() == 0 && i23 > 0) {
                                    int i24 = i23 - 1;
                                    EditTextBoldCursor editTextBoldCursor3 = sm0Var.d[i24];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    sm0Var.d[i24].requestFocus();
                                    sm0Var.d[i24].dispatchKeyEvent(keyEvent);
                                    return true;
                                }
                                return false;
                            }
                            sm0Var.getClass();
                            return false;
                        }
                    });
                    this.d[i20].setOnEditorActionListener(new ea(this, 9));
                }
            }
            tm0 tm0Var = this.f42727s;
            if (tm0Var != null) {
                if (this.I != 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                tm0Var.setVisibility(i14);
            }
            if (this.f42720a == null) {
                return;
            }
            String g10 = org.telegram.messenger.ll.g(new StringBuilder("+"), this.f42720a, ne.b.c());
            if (i16 == 2) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(g10)));
            } else if (i16 == 3) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(g10)));
            } else if (i16 == 4) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(g10)));
            }
            this.f42723e.setText(charSequence);
            if (i16 != 3) {
                AndroidUtilities.showKeyboard(this.d[0]);
                this.d[0].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.d[0]);
            }
            s();
            r();
            this.B = System.currentTimeMillis();
            nd0 nd0Var = this.f42726r;
            nd0 nd0Var2 = this.f42725n;
            if (i16 == 3) {
                int i22 = this.I;
                i10 = 2;
                if (i22 == 4 || i22 == 2) {
                    nd0Var.setVisibility(8);
                    nd0Var2.setVisibility(0);
                    int i23 = this.I;
                    if (i23 == 4) {
                        nd0Var2.setText(LocaleController.formatString("CallText", R.string.CallText, 1, 0));
                    } else if (i23 == 2) {
                        nd0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 1, 0));
                    }
                    q();
                    return;
                }
            } else {
                i10 = 2;
            }
            if (i16 == i10 && ((i12 = this.I) == 4 || i12 == 3)) {
                int i24 = R.string.CallText;
                Object[] objArr = new Object[i10];
                objArr[0] = 2;
                objArr[1] = 0;
                nd0Var2.setText(LocaleController.formatString("CallText", i24, objArr));
                if (this.f42730y < 1000) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                nd0Var.setVisibility(i13);
                if (this.f42730y < 1000) {
                    i15 = 8;
                }
                nd0Var2.setVisibility(i15);
                q();
            } else if (i16 == 4 && this.I == 2) {
                nd0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
                if (this.f42730y < 1000) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                nd0Var.setVisibility(i11);
                if (this.f42730y < 1000) {
                    i15 = 8;
                }
                nd0Var2.setVisibility(i15);
                q();
            } else {
                nd0Var2.setVisibility(8);
                nd0Var.setVisibility(8);
                p();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.H != 3 && this.h != null) {
            int bottom = this.f42723e.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            nd0 nd0Var = this.f42726r;
            if (nd0Var.getVisibility() == 0) {
                int measuredHeight2 = nd0Var.getMeasuredHeight();
                i13 = (measuredHeight + bottom) - measuredHeight2;
                nd0Var.layout(nd0Var.getLeft(), i13, nd0Var.getRight(), measuredHeight2 + i13);
            } else {
                nd0 nd0Var2 = this.f42725n;
                if (nd0Var2.getVisibility() == 0) {
                    int measuredHeight3 = nd0Var2.getMeasuredHeight();
                    i13 = (measuredHeight + bottom) - measuredHeight3;
                    nd0Var2.layout(nd0Var2.getLeft(), i13, nd0Var2.getRight(), measuredHeight3 + i13);
                } else {
                    i13 = measuredHeight + bottom;
                }
            }
            LinearLayout linearLayout = this.f42722c;
            int measuredHeight4 = linearLayout.getMeasuredHeight();
            int d = j3.r0.d(i13 - bottom, measuredHeight4, 2, bottom);
            linearLayout.layout(linearLayout.getLeft(), d, linearLayout.getRight(), measuredHeight4 + d);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        ImageView imageView;
        super.onMeasure(i9, i10);
        if (this.H != 3 && (imageView = this.h) != null) {
            int dp = AndroidUtilities.dp(35.0f) + this.f42723e.getMeasuredHeight() + this.f42724f.getMeasuredHeight() + imageView.getMeasuredHeight();
            int dp2 = AndroidUtilities.dp(80.0f);
            int dp3 = AndroidUtilities.dp(291.0f);
            wm0 wm0Var = this.M;
            if (wm0Var.f44180o0 - dp < dp2) {
                setMeasuredDimension(getMeasuredWidth(), dp + dp2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(wm0Var.f44180o0, dp3));
            }
        }
    }

    public final void p() {
        if (this.f42728w != null) {
            return;
        }
        this.A = 15000;
        this.f42728w = new Timer();
        this.C = System.currentTimeMillis();
        this.f42728w.schedule(new kh.j2(this, 4), 0L, 1000L);
    }

    public final void q() {
        if (this.v != null) {
            return;
        }
        Timer timer = new Timer();
        this.v = timer;
        timer.schedule(new rm0(this), 0L, 1000L);
    }

    public final void r() {
        try {
            synchronized (this.f42729x) {
                Timer timer = this.f42728w;
                if (timer != null) {
                    timer.cancel();
                    this.f42728w = null;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void s() {
        try {
            synchronized (this.f42729x) {
                Timer timer = this.v;
                if (timer != null) {
                    timer.cancel();
                    this.v = null;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void t() {
        int i9;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f42720a);
        this.F = true;
        wm0 wm0Var = this.M;
        wm0Var.y1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.f42720a;
        tL_auth_resendCode.phone_code_hash = this.f42721b;
        i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_auth_resendCode, new y9(this, bundle, tL_auth_resendCode, 27), 2);
    }
}
