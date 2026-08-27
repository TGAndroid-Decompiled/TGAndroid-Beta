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

public final class tm0 extends org.telegram.ui.Components.ev0 implements NotificationCenter.NotificationCenterDelegate {
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
    public final xm0 M;

    public String f42966a;

    public String f42967b;

    public final LinearLayout f42968c;
    public EditTextBoldCursor[] d;

    public final TextView f42969e;

    public final TextView f42970f;
    public final ImageView h;

    public final qd0 f42971n;

    public final qd0 f42972r;

    public final um0 f42973s;
    public Timer v;

    public Timer f42974w;

    public final Object f42975x;

    public int f42976y;

    public tm0(xm0 xm0Var, Context context, int i10) {
        super(context);
        this.M = xm0Var;
        this.f42975x = new Object();
        this.f42976y = 60000;
        this.A = 15000;
        this.G = "";
        this.J = "*";
        this.H = i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f42969e = textView;
        int i11 = org.telegram.ui.ActionBar.g6.D6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f42970f = textView2;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.messenger.y1.s(textView2, org.telegram.ui.ActionBar.g6.w0(null, i12, false), 1, 18.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i10 == 3) {
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, h7.z5.q(-2, -2, LocaleController.isRTL ? 5 : 3));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.phone_activate);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                frameLayout.addView(imageView, h7.z5.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                frameLayout.addView(textView, h7.z5.d(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                frameLayout.addView(textView, h7.z5.d(-1, -2.0f, z10 ? 5 : 3, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(imageView, h7.z5.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, h7.z5.q(-2, -2, 49));
            if (i10 == 1) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.sms_devices);
                int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView2.setColorFilter(new PorterDuffColorFilter(iW0, mode));
                frameLayout2.addView(imageView2, h7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView3 = new ImageView(context);
                this.h = imageView3;
                imageView3.setImageResource(R.drawable.sms_bubble);
                imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false), mode));
                frameLayout2.addView(imageView3, h7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentAppCodeTitle));
            } else {
                ImageView imageView4 = new ImageView(context);
                this.h = imageView4;
                imageView4.setImageResource(R.drawable.sms_code);
                imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.P9, false), PorterDuff.Mode.MULTIPLY));
                frameLayout2.addView(imageView4, h7.z5.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(LocaleController.getString(R.string.SentSmsCodeTitle));
            }
            addView(textView2, h7.z5.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, h7.z5.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42968c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, h7.z5.q(-2, 36, 1));
        if (i10 == 3) {
            linearLayout.setVisibility(8);
        }
        qd0 qd0Var = new qd0(context, 1);
        this.f42971n = qd0Var;
        qd0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        qd0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        if (i10 == 3) {
            qd0Var.setTextSize(1, 14.0f);
            addView(qd0Var, h7.z5.q(-2, -2, LocaleController.isRTL ? 5 : 3));
            um0 um0Var = new um0(context);
            Paint paint = new Paint();
            um0Var.f43251a = paint;
            Paint paint2 = new Paint();
            um0Var.f43252b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gi, false));
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hi, false));
            this.f42973s = um0Var;
            qd0Var.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(um0Var, h7.z5.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            qd0Var.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
            qd0Var.setTextSize(1, 15.0f);
            qd0Var.setGravity(49);
            addView(qd0Var, h7.z5.q(-2, -2, 49));
        }
        qd0 qd0Var2 = new qd0(context, 2);
        this.f42972r = qd0Var2;
        qd0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        qd0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        qd0Var2.setPadding(0, AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(10.0f));
        qd0Var2.setTextSize(1, 15.0f);
        qd0Var2.setGravity(49);
        if (i10 == 1) {
            qd0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
        } else {
            qd0Var2.setText(LocaleController.getString(R.string.DidNotGetTheCode));
        }
        addView(qd0Var2, h7.z5.q(-2, -2, 49));
        qd0Var2.setOnClickListener(new u50(this, 16));
    }

    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i10 >= editTextBoldCursorArr.length) {
                return sb2.toString();
            }
            sb2.append(oe.b.d(editTextBoldCursorArr[i10].getText().toString(), false));
            i10++;
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        xm0 xm0Var = this.M;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xm0Var.getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.StopVerification);
            alertDialog$Builder.k(LocaleController.getString(R.string.Continue), null);
            alertDialog$Builder.h(LocaleController.getString(R.string.Stop), new pm0(this, 1));
            xm0Var.showDialog(alertDialog$Builder.f22702a);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.f42966a;
        tL_auth_cancelCode.phone_code_hash = this.f42967b;
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).sendRequest(tL_auth_cancelCode, new jh.m5(16), 2);
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (!this.E || (editTextBoldCursorArr = this.d) == null) {
            return;
        }
        if (i10 == NotificationCenter.didReceiveSmsCode) {
            editTextBoldCursorArr[0].setText("" + objArr[0]);
            h(null);
            return;
        }
        if (i10 == NotificationCenter.didReceiveCall) {
            String str = "" + objArr[0];
            if (AndroidUtilities.checkPhonePattern(this.J, str)) {
                this.D = true;
                this.d[0].setText(str);
                this.D = false;
                h(null);
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
        if (this.F) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            AndroidUtilities.shakeView(this.f42968c);
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
        xm0 xm0Var = this.M;
        xm0Var.N1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.f42966a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.f42967b;
        s();
        xm0Var.y1();
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).sendRequest(verifyphone, new v80(12, this, verifyphone), 2);
    }

    @Override
    public final void j() {
        LinearLayout linearLayout = this.f42968c;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
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

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        if (bundle == null) {
            return;
        }
        this.E = true;
        int i12 = this.H;
        if (i12 == 2) {
            AndroidUtilities.setWaitingForSms(true);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
        } else if (i12 == 3) {
            AndroidUtilities.setWaitingForCall(true);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
        }
        this.f42966a = bundle.getString("phone");
        this.f42967b = bundle.getString("phoneHash");
        int i13 = bundle.getInt("timeout");
        this.f42976y = i13;
        this.L = i13;
        this.I = bundle.getInt("nextType");
        this.J = bundle.getString("pattern");
        int i14 = bundle.getInt("length");
        this.K = i14;
        if (i14 == 0) {
            this.K = 5;
        }
        EditTextBoldCursor[] editTextBoldCursorArr = this.d;
        CharSequence charSequenceReplaceTags = "";
        if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.K) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr2 = this.d;
                if (i15 >= editTextBoldCursorArr2.length) {
                    break;
                }
                editTextBoldCursorArr2[i15].setText("");
                i15++;
            }
        } else {
            this.d = new EditTextBoldCursor[this.K];
            final int i16 = 0;
            while (i16 < this.K) {
                this.d[i16] = new EditTextBoldCursor(getContext());
                EditTextBoldCursor editTextBoldCursor = this.d[i16];
                int i17 = org.telegram.ui.ActionBar.g6.G6;
                editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                this.d[i16].setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                this.d[i16].setCursorSize(AndroidUtilities.dp(20.0f));
                this.d[i16].setCursorWidth(1.5f);
                Drawable drawableMutate = getResources().getDrawable(R.drawable.search_dark_activated).mutate();
                drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false), PorterDuff.Mode.MULTIPLY));
                this.d[i16].setBackgroundDrawable(drawableMutate);
                this.d[i16].setImeOptions(268435461);
                this.d[i16].setTextSize(1, 20.0f);
                this.d[i16].setMaxLines(1);
                this.d[i16].setTypeface(AndroidUtilities.bold());
                this.d[i16].setPadding(0, 0, 0, 0);
                this.d[i16].setGravity(49);
                if (i12 == 3) {
                    this.d[i16].setEnabled(false);
                    this.d[i16].setInputType(0);
                    this.d[i16].setVisibility(8);
                } else {
                    this.d[i16].setInputType(3);
                }
                this.f42968c.addView(this.d[i16], h7.z5.t(34, 36, 1, 0, 0, i16 != this.K - 1 ? 7 : 0, 0));
                this.d[i16].addTextChangedListener(new rm0(this, i16));
                this.d[i16].setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public final boolean onKey(View view, int i18, KeyEvent keyEvent) {
                        tm0 tm0Var = this.f41710a;
                        if (i18 != 67) {
                            tm0Var.getClass();
                            return false;
                        }
                        EditTextBoldCursor[] editTextBoldCursorArr3 = tm0Var.d;
                        int i19 = i16;
                        if (editTextBoldCursorArr3[i19].length() != 0 || i19 <= 0) {
                            return false;
                        }
                        int i20 = i19 - 1;
                        EditTextBoldCursor editTextBoldCursor2 = tm0Var.d[i20];
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        tm0Var.d[i20].requestFocus();
                        tm0Var.d[i20].dispatchKeyEvent(keyEvent);
                        return true;
                    }
                });
                this.d[i16].setOnEditorActionListener(new fa(this, 9));
                i16++;
            }
        }
        um0 um0Var = this.f42973s;
        if (um0Var != null) {
            um0Var.setVisibility(this.I != 0 ? 0 : 8);
        }
        if (this.f42966a == null) {
            return;
        }
        String strK = org.telegram.messenger.y1.k(new StringBuilder("+"), this.f42966a, oe.b.c());
        if (i12 == 2) {
            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(strK)));
        } else if (i12 == 3) {
            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(strK)));
        } else if (i12 == 4) {
            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(strK)));
        }
        this.f42969e.setText(charSequenceReplaceTags);
        if (i12 != 3) {
            AndroidUtilities.showKeyboard(this.d[0]);
            this.d[0].requestFocus();
        } else {
            AndroidUtilities.hideKeyboard(this.d[0]);
        }
        s();
        r();
        this.B = System.currentTimeMillis();
        qd0 qd0Var = this.f42972r;
        qd0 qd0Var2 = this.f42971n;
        if (i12 == 3) {
            int i18 = this.I;
            i10 = 2;
            if (i18 == 4 || i18 == 2) {
                qd0Var.setVisibility(8);
                qd0Var2.setVisibility(0);
                int i19 = this.I;
                if (i19 == 4) {
                    qd0Var2.setText(LocaleController.formatString("CallText", R.string.CallText, 1, 0));
                } else if (i19 == 2) {
                    qd0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 1, 0));
                }
                q();
                return;
            }
        } else {
            i10 = 2;
        }
        if (i12 == i10 && ((i11 = this.I) == 4 || i11 == 3)) {
            int i20 = R.string.CallText;
            Object[] objArr = new Object[i10];
            objArr[0] = 2;
            objArr[1] = 0;
            qd0Var2.setText(LocaleController.formatString("CallText", i20, objArr));
            qd0Var.setVisibility(this.f42976y < 1000 ? 0 : 8);
            qd0Var2.setVisibility(this.f42976y < 1000 ? 8 : 0);
            q();
            return;
        }
        if (i12 != 4 || this.I != 2) {
            qd0Var2.setVisibility(8);
            qd0Var.setVisibility(8);
            p();
        } else {
            qd0Var2.setText(LocaleController.formatString("SmsText", R.string.SmsText, 2, 0));
            qd0Var.setVisibility(this.f42976y < 1000 ? 0 : 8);
            qd0Var2.setVisibility(this.f42976y < 1000 ? 8 : 0);
            q();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.H == 3 || this.h == null) {
            return;
        }
        int bottom = this.f42969e.getBottom();
        int measuredHeight = getMeasuredHeight() - bottom;
        qd0 qd0Var = this.f42972r;
        if (qd0Var.getVisibility() == 0) {
            int measuredHeight2 = qd0Var.getMeasuredHeight();
            i14 = (measuredHeight + bottom) - measuredHeight2;
            qd0Var.layout(qd0Var.getLeft(), i14, qd0Var.getRight(), measuredHeight2 + i14);
        } else {
            qd0 qd0Var2 = this.f42971n;
            if (qd0Var2.getVisibility() == 0) {
                int measuredHeight3 = qd0Var2.getMeasuredHeight();
                i14 = (measuredHeight + bottom) - measuredHeight3;
                qd0Var2.layout(qd0Var2.getLeft(), i14, qd0Var2.getRight(), measuredHeight3 + i14);
            } else {
                i14 = measuredHeight + bottom;
            }
        }
        LinearLayout linearLayout = this.f42968c;
        int measuredHeight4 = linearLayout.getMeasuredHeight();
        int iB = i0.a.B(i14 - bottom, measuredHeight4, 2, bottom);
        linearLayout.layout(linearLayout.getLeft(), iB, linearLayout.getRight(), measuredHeight4 + iB);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ImageView imageView;
        super.onMeasure(i10, i11);
        if (this.H == 3 || (imageView = this.h) == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(35.0f) + this.f42969e.getMeasuredHeight() + this.f42970f.getMeasuredHeight() + imageView.getMeasuredHeight();
        int iDp2 = AndroidUtilities.dp(80.0f);
        int iDp3 = AndroidUtilities.dp(291.0f);
        xm0 xm0Var = this.M;
        if (xm0Var.f44511o0 - iDp < iDp2) {
            setMeasuredDimension(getMeasuredWidth(), iDp + iDp2);
        } else {
            setMeasuredDimension(getMeasuredWidth(), Math.min(xm0Var.f44511o0, iDp3));
        }
    }

    public final void p() {
        if (this.f42974w != null) {
            return;
        }
        this.A = 15000;
        this.f42974w = new Timer();
        this.C = System.currentTimeMillis();
        this.f42974w.schedule(new lh.h2(this, 4), 0L, 1000L);
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
            synchronized (this.f42975x) {
                try {
                    Timer timer = this.f42974w;
                    if (timer != null) {
                        timer.cancel();
                        this.f42974w = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void s() {
        try {
            synchronized (this.f42975x) {
                try {
                    Timer timer = this.v;
                    if (timer != null) {
                        timer.cancel();
                        this.v = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final void t() {
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f42966a);
        this.F = true;
        xm0 xm0Var = this.M;
        xm0Var.y1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.f42966a;
        tL_auth_resendCode.phone_code_hash = this.f42967b;
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).sendRequest(tL_auth_resendCode, new z9(this, bundle, tL_auth_resendCode, 27), 2);
    }
}
