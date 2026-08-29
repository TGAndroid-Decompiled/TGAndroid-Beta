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
public final class rm0 extends org.telegram.ui.Components.mv0 implements NotificationCenter.NotificationCenterDelegate {
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
    public final vm0 M;
    public String f42141a;
    public String f42142b;
    public final LinearLayout f42143c;
    public EditTextBoldCursor[] d;
    public final TextView f42144e;
    public final TextView f42145f;
    public final ImageView h;
    public final eg.r f42146n;
    public final om0 f42147r;
    public final sm0 f42148s;
    public Timer v;
    public Timer f42149w;
    public final Object f42150x;
    public int f42151y;

    public rm0(vm0 vm0Var, Context context, int i10) {
        super(context);
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.M = vm0Var;
        this.f42150x = new Object();
        this.f42151y = 60000;
        this.A = 15000;
        this.G = "";
        this.J = "*";
        this.H = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f42144e = textView;
        int i18 = org.telegram.ui.ActionBar.g6.D6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f42145f = textView2;
        int i19 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.messenger.x3.t(textView2, org.telegram.ui.ActionBar.g6.w0(null, i19, false), 1, 18.0f);
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
            addView(frameLayout, i7.f6.q(-2, -2, i15));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.phone_activate);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                frameLayout.addView(imageView, i7.f6.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                if (LocaleController.isRTL) {
                    i17 = 5;
                } else {
                    i17 = 3;
                }
                frameLayout.addView(textView, i7.f6.d(-1, -2.0f, i17, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                if (z10) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout.addView(textView, i7.f6.d(-1, -2.0f, i16, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(imageView, i7.f6.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, i7.f6.q(-2, -2, 49));
            if (i10 == 1) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.sms_devices);
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, i19, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
                frameLayout2.addView(imageView2, i7.f6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView3 = new ImageView(context);
                this.h = imageView3;
                imageView3.setImageResource(R.drawable.sms_bubble);
                imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false), mode));
                frameLayout2.addView(imageView3, i7.f6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentAppCodeTitle));
            } else {
                ImageView imageView4 = new ImageView(context);
                this.h = imageView4;
                imageView4.setImageResource(R.drawable.sms_code);
                imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView4, i7.f6.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentSmsCodeTitle));
            }
            addView(textView2, i7.f6.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, i7.f6.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42143c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, i7.f6.q(-2, 36, 1));
        if (i10 == 3) {
            linearLayout.setVisibility(8);
        }
        eg.r rVar = new eg.r(context, 29);
        this.f42146n = rVar;
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
        rVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        if (i10 == 3) {
            rVar.setTextSize(1, 14.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(rVar, i7.f6.q(-2, -2, i12));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f42429a = paint;
            Paint paint2 = new Paint();
            view.f42430b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gi, false));
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hi, false));
            this.f42148s = view;
            if (LocaleController.isRTL) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            rVar.setGravity(i13);
            addView((View) view, i7.f6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            rVar.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
            rVar.setTextSize(1, 15.0f);
            rVar.setGravity(49);
            addView(rVar, i7.f6.q(-2, -2, 49));
        }
        om0 om0Var = new om0(context, 0);
        this.f42147r = om0Var;
        om0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        om0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        om0Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
        om0Var.setTextSize(1, 15.0f);
        om0Var.setGravity(49);
        if (i10 == 1) {
            om0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
        } else {
            om0Var.setText(LocaleController.getString(R.string.DidNotGetTheCode));
        }
        addView(om0Var, i7.f6.q(-2, -2, 49));
        om0Var.setOnClickListener(new t50(this, 16));
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
                sb2.append(qe.b.d(editTextBoldCursorArr[i10].getText().toString(), false));
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
        vm0 vm0Var = this.M;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vm0Var.getParentActivity());
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.StopVerification);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new mm0(this, 1));
            vm0Var.showDialog(alertDialog$Builder.f22714a);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.f42141a;
        tL_auth_cancelCode.phone_code_hash = this.f42142b;
        i10 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_cancelCode, new lh.o5(16), 2);
        s();
        r();
        int i11 = this.H;
        if (i11 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i11 == 3) {
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.E && (editTextBoldCursorArr = this.d) != null) {
            if (i10 == NotificationCenter.didReceiveSmsCode) {
                editTextBoldCursorArr[0].setText("" + objArr[0]);
                h(null);
            } else if (i10 == NotificationCenter.didReceiveCall) {
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
        int i10 = this.H;
        if (i10 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i10 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.E = false;
        s();
        r();
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.F) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            AndroidUtilities.shakeView(this.f42143c);
            return;
        }
        this.F = true;
        int i11 = this.H;
        if (i11 == 2) {
            AndroidUtilities.setWaitingForSms(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i11 == 3) {
            AndroidUtilities.setWaitingForCall(false);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
        }
        this.E = false;
        vm0 vm0Var = this.M;
        vm0Var.N1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.f42141a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.f42142b;
        s();
        vm0Var.y1();
        i10 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(verifyphone, new u80(11, this, verifyphone), 2);
    }

    @Override
    public final void j() {
        LinearLayout linearLayout = this.f42143c;
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
            this.E = true;
            int i17 = this.H;
            if (i17 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i17 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
            }
            this.f42141a = bundle.getString("phone");
            this.f42142b = bundle.getString("phoneHash");
            int i18 = bundle.getInt("timeout");
            this.f42151y = i18;
            this.L = i18;
            this.I = bundle.getInt("nextType");
            this.J = bundle.getString("pattern");
            int i19 = bundle.getInt("length");
            this.K = i19;
            if (i19 == 0) {
                this.K = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            CharSequence charSequence = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.K) {
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
                this.d = new EditTextBoldCursor[this.K];
                for (final int i21 = 0; i21 < this.K; i21++) {
                    this.d[i21] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.d[i21];
                    int i22 = org.telegram.ui.ActionBar.g6.G6;
                    editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i22, false));
                    this.d[i21].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i22, false));
                    this.d[i21].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.d[i21].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23206l6, false), PorterDuff.Mode.MULTIPLY));
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
                    if (i21 != this.K - 1) {
                        i10 = 7;
                    } else {
                        i10 = 0;
                    }
                    this.f42143c.addView(editTextBoldCursor2, i7.f6.t(34, 36, 1, 0, 0, i10, 0));
                    this.d[i21].addTextChangedListener(new pm0(this, i21));
                    this.d[i21].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i23, KeyEvent keyEvent) {
                            rm0 rm0Var = rm0.this;
                            if (i23 == 67) {
                                EditTextBoldCursor[] editTextBoldCursorArr3 = rm0Var.d;
                                int i24 = i21;
                                if (editTextBoldCursorArr3[i24].length() == 0 && i24 > 0) {
                                    int i25 = i24 - 1;
                                    EditTextBoldCursor editTextBoldCursor3 = rm0Var.d[i25];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    rm0Var.d[i25].requestFocus();
                                    rm0Var.d[i25].dispatchKeyEvent(keyEvent);
                                    return true;
                                }
                                return false;
                            }
                            rm0Var.getClass();
                            return false;
                        }
                    });
                    this.d[i21].setOnEditorActionListener(new da(this, 9));
                }
            }
            sm0 sm0Var = this.f42148s;
            if (sm0Var != null) {
                if (this.I != 0) {
                    i15 = 0;
                } else {
                    i15 = 8;
                }
                sm0Var.setVisibility(i15);
            }
            if (this.f42141a == null) {
                return;
            }
            String k9 = org.telegram.messenger.x3.k(new StringBuilder("+"), this.f42141a, qe.b.c());
            if (i17 == 2) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(k9)));
            } else if (i17 == 3) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(k9)));
            } else if (i17 == 4) {
                charSequence = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(k9)));
            }
            this.f42144e.setText(charSequence);
            if (i17 != 3) {
                AndroidUtilities.showKeyboard(this.d[0]);
                this.d[0].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.d[0]);
            }
            s();
            r();
            this.B = System.currentTimeMillis();
            om0 om0Var = this.f42147r;
            eg.r rVar = this.f42146n;
            if (i17 == 3) {
                int i23 = this.I;
                i11 = 2;
                if (i23 == 4 || i23 == 2) {
                    om0Var.setVisibility(8);
                    rVar.setVisibility(0);
                    int i24 = this.I;
                    if (i24 == 4) {
                        rVar.setText(LocaleController.formatString("CallText", R.string.CallText, 1, 0));
                    } else if (i24 == 2) {
                        rVar.setText(LocaleController.formatString("SmsText", R.string.SmsText, 1, 0));
                    }
                    q();
                    return;
                }
            } else {
                i11 = 2;
            }
            if (i17 == i11 && ((i13 = this.I) == 4 || i13 == 3)) {
                int i25 = R.string.CallText;
                Object[] objArr = new Object[i11];
                objArr[0] = 2;
                objArr[1] = 0;
                rVar.setText(LocaleController.formatString("CallText", i25, objArr));
                if (this.f42151y < 1000) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                om0Var.setVisibility(i14);
                if (this.f42151y < 1000) {
                    i16 = 8;
                }
                rVar.setVisibility(i16);
                q();
            } else if (i17 == 4 && this.I == 2) {
                rVar.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
                if (this.f42151y < 1000) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                om0Var.setVisibility(i12);
                if (this.f42151y < 1000) {
                    i16 = 8;
                }
                rVar.setVisibility(i16);
                q();
            } else {
                rVar.setVisibility(8);
                om0Var.setVisibility(8);
                p();
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.H != 3 && this.h != null) {
            int bottom = this.f42144e.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            om0 om0Var = this.f42147r;
            if (om0Var.getVisibility() == 0) {
                int measuredHeight2 = om0Var.getMeasuredHeight();
                i14 = (measuredHeight + bottom) - measuredHeight2;
                om0Var.layout(om0Var.getLeft(), i14, om0Var.getRight(), measuredHeight2 + i14);
            } else {
                eg.r rVar = this.f42146n;
                if (rVar.getVisibility() == 0) {
                    int measuredHeight3 = rVar.getMeasuredHeight();
                    i14 = (measuredHeight + bottom) - measuredHeight3;
                    rVar.layout(rVar.getLeft(), i14, rVar.getRight(), measuredHeight3 + i14);
                } else {
                    i14 = measuredHeight + bottom;
                }
            }
            LinearLayout linearLayout = this.f42143c;
            int measuredHeight4 = linearLayout.getMeasuredHeight();
            int e10 = j7.l1.e(i14 - bottom, measuredHeight4, 2, bottom);
            linearLayout.layout(linearLayout.getLeft(), e10, linearLayout.getRight(), measuredHeight4 + e10);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        super.onMeasure(i10, i11);
        if (this.H != 3 && (imageView = this.h) != null) {
            int dp = AndroidUtilities.dp(35.0f) + this.f42144e.getMeasuredHeight() + this.f42145f.getMeasuredHeight() + imageView.getMeasuredHeight();
            int dp2 = AndroidUtilities.dp(80.0f);
            int dp3 = AndroidUtilities.dp(291.0f);
            vm0 vm0Var = this.M;
            if (vm0Var.f43654o0 - dp < dp2) {
                setMeasuredDimension(getMeasuredWidth(), dp + dp2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(vm0Var.f43654o0, dp3));
            }
        }
    }

    public final void p() {
        if (this.f42149w != null) {
            return;
        }
        this.A = 15000;
        this.f42149w = new Timer();
        this.C = System.currentTimeMillis();
        this.f42149w.schedule(new nh.g2(this, 3), 0L, 1000L);
    }

    public final void q() {
        if (this.v != null) {
            return;
        }
        Timer timer = new Timer();
        this.v = timer;
        timer.schedule(new qm0(this), 0L, 1000L);
    }

    public final void r() {
        try {
            synchronized (this.f42150x) {
                Timer timer = this.f42149w;
                if (timer != null) {
                    timer.cancel();
                    this.f42149w = null;
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void s() {
        try {
            synchronized (this.f42150x) {
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
        int i10;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f42141a);
        this.F = true;
        vm0 vm0Var = this.M;
        vm0Var.y1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.f42141a;
        tL_auth_resendCode.phone_code_hash = this.f42142b;
        i10 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_resendCode, new x9(this, bundle, tL_auth_resendCode, 27), 2);
    }
}
