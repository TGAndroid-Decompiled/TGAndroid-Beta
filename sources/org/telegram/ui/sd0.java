package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class sd0 extends org.telegram.ui.Components.ev0 {
    public boolean A;
    public GoogleSignInAccount B;
    public int C;
    public int D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public boolean J;
    public int K;
    public final boolean L;
    public final rd0 M;
    public boolean N;
    public final kd0 O;
    public final kd0 P;
    public final kd0 Q;
    public boolean R;
    public final ig0 S;

    public final od0 f42580a;

    public final TextView f42581b;

    public final eh.s f42582c;
    public final TextView d;

    public final FrameLayout f42583e;

    public final TextView f42584f;
    public final FrameLayout h;

    public final cg.q f42585n;

    public final qd0 f42586r;

    public final TextView f42587s;
    public final org.telegram.ui.Components.w80 v;

    public final org.telegram.ui.Components.ri0 f42588w;

    public boolean f42589x;

    public Bundle f42590y;

    public sd0(ig0 ig0Var, Context context, boolean z10) {
        int i10;
        super(context);
        this.S = ig0Var;
        this.O = new kd0(this, 4);
        this.P = new kd0(this, 6);
        this.Q = new kd0(this, 7);
        this.L = z10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.f42588w = ri0Var;
        if (!z10 || ig0Var.B == 3) {
            ri0Var.f(R.raw.email_check_inbox, 120, 120, null);
        } else {
            ri0Var.f(R.raw.email_setup_heart, 120, 120, null);
        }
        ri0Var.setAutoRepeat(false);
        frameLayout.addView(ri0Var, h7.z5.e(120, 120, 1));
        if (AndroidUtilities.isSmallScreen()) {
            i10 = 8;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
        }
        frameLayout.setVisibility(i10);
        addView(frameLayout, h7.z5.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.f42581b = textView;
        org.telegram.ui.Cells.pa.m(18.0f, 1, textView);
        textView.setText(LocaleController.getString(ig0Var.B == 3 ? R.string.CheckYourNewEmail : z10 ? R.string.VerificationCode : R.string.CheckYourEmail));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, h7.z5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        eh.s sVar = new eh.s(context, null, false);
        this.f42582c = sVar;
        sVar.setTextSize(1, 14.0f);
        sVar.setGravity(17);
        sVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(sVar, h7.z5.t(-2, -2, 1, 24, 8, 24, 0));
        od0 od0Var = new od0(this, context, 0);
        this.f42580a = od0Var;
        addView(od0Var, h7.z5.t(-2, 42, 1, 0, z10 ? 48 : 32, 0, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        textView2.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
        Drawable drawable = context.getDrawable(2131231175);
        drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
        spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.zy(2), 1, 2, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
        textView2.setText(spannableStringBuilder);
        final int i11 = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) {

            public final sd0 f40804b;

            {
                this.f40804b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        sd0 sd0Var = this.f40804b;
                        globalInstance.addObserver(new pd0(sd0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = sd0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap map = new HashMap();
                        String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                        y5.l.f(str);
                        hashSet.add(GoogleSignInOptions.f3111w);
                        if (hashSet.contains(GoogleSignInOptions.A)) {
                            Scope scope = GoogleSignInOptions.f3113y;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.f3112x);
                        com.google.android.gms.internal.clearcut.v0 v0VarA = g7.m8.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, map, null));
                        v0VarA.g().addOnCompleteListener(new zr(24, sd0Var, v0VarA));
                        break;
                    case 1:
                        this.f40804b.p();
                        break;
                    default:
                        sd0 sd0Var2 = this.f40804b;
                        TextView textView3 = sd0Var2.f42584f;
                        if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                            sd0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = sd0Var2.H;
                            tL_auth_resendCode.phone_code_hash = sd0Var2.I;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", sd0Var2.E);
                            bundle.putString("ephone", sd0Var2.F);
                            bundle.putString("phoneFormated", sd0Var2.H);
                            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) sd0Var2.S).currentAccount).sendRequest(tL_auth_resendCode, new z9(sd0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.h = frameLayout2;
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, (ig0Var.B == 3 || z10) ? false : true, 1.0f, false);
        cg.q qVar = new cg.q(context, 29);
        this.f42585n = qVar;
        qVar.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
        qVar.setGravity(17);
        qVar.setTextSize(1, 14.0f);
        qVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        qVar.setMaxLines(2);
        qVar.setOnClickListener(new u70(6, this, context));
        frameLayout2.addView(qVar);
        qd0 qd0Var = new qd0(context, 0);
        this.f42586r = qd0Var;
        qd0Var.setGravity(17);
        qd0Var.setTextSize(1, 14.0f);
        qd0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        qd0Var.setMaxLines(3);
        final int i12 = 1;
        qd0Var.setOnClickListener(new View.OnClickListener(this) {

            public final sd0 f40804b;

            {
                this.f40804b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        sd0 sd0Var = this.f40804b;
                        globalInstance.addObserver(new pd0(sd0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = sd0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap map = new HashMap();
                        String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                        y5.l.f(str);
                        hashSet.add(GoogleSignInOptions.f3111w);
                        if (hashSet.contains(GoogleSignInOptions.A)) {
                            Scope scope = GoogleSignInOptions.f3113y;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.f3112x);
                        com.google.android.gms.internal.clearcut.v0 v0VarA = g7.m8.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, map, null));
                        v0VarA.g().addOnCompleteListener(new zr(24, sd0Var, v0VarA));
                        break;
                    case 1:
                        this.f40804b.p();
                        break;
                    default:
                        sd0 sd0Var2 = this.f40804b;
                        TextView textView3 = sd0Var2.f42584f;
                        if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                            sd0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = sd0Var2.H;
                            tL_auth_resendCode.phone_code_hash = sd0Var2.I;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", sd0Var2.E);
                            bundle.putString("ephone", sd0Var2.F);
                            bundle.putString("phoneFormated", sd0Var2.H);
                            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) sd0Var2.S).currentAccount).sendRequest(tL_auth_resendCode, new z9(sd0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        qd0Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
        qd0Var.setVisibility(8);
        frameLayout2.addView(qd0Var);
        TextView textView3 = new TextView(context);
        this.f42584f = textView3;
        textView3.setGravity(17);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        textView3.setMaxLines(2);
        textView3.setText(LocaleController.getString(R.string.ResendCode));
        final int i13 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) {

            public final sd0 f40804b;

            {
                this.f40804b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        sd0 sd0Var = this.f40804b;
                        globalInstance.addObserver(new pd0(sd0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = sd0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap map = new HashMap();
                        String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                        y5.l.f(str);
                        hashSet.add(GoogleSignInOptions.f3111w);
                        if (hashSet.contains(GoogleSignInOptions.A)) {
                            Scope scope = GoogleSignInOptions.f3113y;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.f3112x);
                        com.google.android.gms.internal.clearcut.v0 v0VarA = g7.m8.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, map, null));
                        v0VarA.g().addOnCompleteListener(new zr(24, sd0Var, v0VarA));
                        break;
                    case 1:
                        this.f40804b.p();
                        break;
                    default:
                        sd0 sd0Var2 = this.f40804b;
                        TextView textView4 = sd0Var2.f42584f;
                        if (textView4.getVisibility() == 0 && textView4.getAlpha() == 1.0f) {
                            sd0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = sd0Var2.H;
                            tL_auth_resendCode.phone_code_hash = sd0Var2.I;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", sd0Var2.E);
                            bundle.putString("ephone", sd0Var2.F);
                            bundle.putString("phoneFormated", sd0Var2.H);
                            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) sd0Var2.S).currentAccount).sendRequest(tL_auth_resendCode, new z9(sd0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 1.0f, false);
        org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(context);
        this.v = w80Var;
        i6.q2(w80Var);
        rd0 rd0Var = new rd0(context, 0);
        this.M = rd0Var;
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.ws.f34319e;
        animationLoadAnimation.setInterpolator(erVar);
        rd0Var.setInAnimation(animationLoadAnimation);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        animationLoadAnimation2.setInterpolator(erVar);
        rd0Var.setOutAnimation(animationLoadAnimation2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f42583e = frameLayout3;
        frameLayout3.addView(textView3, h7.z5.e(-2, -2, 17));
        rd0Var.addView(frameLayout3);
        TextView textView4 = new TextView(context);
        this.f42587s = textView4;
        textView4.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setTextSize(1, 15.0f);
        textView4.setGravity(49);
        textView4.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        rd0Var.addView(textView4);
        FrameLayout frameLayout4 = new FrameLayout(context);
        if (z10) {
            frameLayout4.addView(rd0Var, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        } else {
            frameLayout4.addView(rd0Var, h7.z5.e(-1, -2, 48));
            frameLayout4.addView(frameLayout2, h7.z5.e(-1, -2, 48));
            frameLayout4.addView(w80Var, h7.z5.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
            frameLayout4.addView(textView2, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
        }
        addView(frameLayout4, h7.z5.l(1.0f, -1, 0));
    }

    @Override
    public final void g() {
        if (this.D != 0) {
            AndroidUtilities.cancelRunOnUIThread(this.Q);
        }
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString(R.string.VerificationCode);
    }

    @Override
    public final void h(String str) {
        TLObject tLObject;
        if (this.A) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.P);
        od0 od0Var = this.f42580a;
        od0Var.f43278e = true;
        wr[] wrVarArr = od0Var.f43279f;
        if (wrVarArr != null) {
            for (wr wrVar : wrVarArr) {
                wrVar.j(0.0f);
            }
        }
        String code = od0Var.getCode();
        int length = code.length();
        ig0 ig0Var = this.S;
        if (length == 0 && this.B == null) {
            if (ig0Var.getParentActivity() == null) {
                return;
            }
            try {
                od0Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (wr wrVar2 : od0Var.f43279f) {
                wrVar2.i(1.0f);
            }
            od0Var.f43279f[0].requestFocus();
            AndroidUtilities.shakeViewSpring(od0Var, new kd0(this, 1));
            return;
        }
        this.A = true;
        ig0Var.n1(0, true);
        if (ig0Var.B == 3) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode.code = code;
            verifyemail.verification = tL_emailVerificationCode;
            tLObject = verifyemail;
        } else if (this.J) {
            TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup.phone_number = this.H;
            tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.I;
            verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode2.code = code;
            verifyemail2.verification = tL_emailVerificationCode2;
            tLObject = verifyemail2;
        } else {
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.H;
            tL_auth_signIn.phone_code_hash = this.I;
            if (this.B != null) {
                TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                tL_emailVerificationGoogle.token = this.B.f3103c;
                tL_auth_signIn.email_verification = tL_emailVerificationGoogle;
            } else {
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode3.code = code;
                tL_auth_signIn.email_verification = tL_emailVerificationCode3;
            }
            tL_auth_signIn.flags = 2 | tL_auth_signIn.flags;
            tLObject = tL_auth_signIn;
        }
        od0Var.f43278e = true;
        wr[] wrVarArr2 = od0Var.f43279f;
        if (wrVarArr2 != null) {
            for (wr wrVar3 : wrVarArr2) {
                wrVar3.j(0.0f);
            }
        }
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(tLObject, new hd0(this, code, 0), 10);
    }

    @Override
    public final void j() {
        if (this.f42589x) {
            this.f42589x = false;
        } else {
            AndroidUtilities.runOnUIThread(new kd0(this, 8), ig0.f39078p0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f42590y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f42580a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f42580a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f42590y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f42590y = bundle;
        this.H = bundle.getString("phoneFormated");
        this.I = this.f42590y.getString("phoneHash");
        this.E = this.f42590y.getString("phone");
        this.F = this.f42590y.getString("ephone");
        this.J = this.f42590y.getBoolean("setup");
        this.K = this.f42590y.getInt("length");
        this.G = this.f42590y.getString("email");
        this.C = this.f42590y.getInt("resetAvailablePeriod");
        this.D = this.f42590y.getInt("resetPendingDate");
        ig0 ig0Var = this.S;
        int i10 = ig0Var.B;
        int i11 = 8;
        FrameLayout frameLayout = this.h;
        eh.s sVar = this.f42582c;
        if (i10 == 3) {
            sVar.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.G));
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
        } else if (this.L) {
            sVar.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.G));
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
            this.f42585n.setVisibility(this.D == 0 ? 0 : 8);
            this.f42586r.setVisibility(this.D != 0 ? 0 : 8);
            if (this.D != 0) {
                r();
            }
        }
        int i12 = this.K;
        od0 od0Var = this.f42580a;
        od0Var.b(i12, 1);
        for (wr wrVar : od0Var.f43279f) {
            wrVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            wrVar.addTextChangedListener(new p0(this, 7));
            wrVar.setOnFocusChangeListener(new ld(this, 2));
        }
        od0Var.setText("");
        if (!this.J && ig0Var.B != 3) {
            String string = this.f42590y.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iIndexOf = string.indexOf(42);
            int iLastIndexOf = string.lastIndexOf(42);
            if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0();
                xz0Var.f34734a |= 256;
                xz0Var.f34735b = iIndexOf;
                int i13 = iLastIndexOf + 1;
                xz0Var.f34736c = i13;
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), iIndexOf, i13, 0);
            }
            sVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
        }
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i11 = 0;
        }
        this.v.setVisibility(i11);
        this.d.setVisibility(i11);
        ig0.T0(ig0Var, od0Var.f43279f[0]);
        od0Var.requestFocus();
        if (!z10 && bundle.containsKey("nextType")) {
            AndroidUtilities.runOnUIThread(this.P, bundle.getInt("timeout"));
        }
        if (this.D != 0) {
            AndroidUtilities.runOnUIThread(this.Q, 1000L);
        }
    }

    @Override
    public final void n() {
        this.f42581b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int i10 = org.telegram.ui.ActionBar.g6.D6;
        this.f42582c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.g6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.v.a();
        this.f42584f.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f42585n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.f42586r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f42587s.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        this.f42580a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.B != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            od0 od0Var = this.f42580a;
            wr[] wrVarArr = od0Var.f43279f;
            if (i10 >= wrVarArr.length) {
                od0Var.postDelayed(new a30(23, this, runnable), (((long) wrVarArr.length) * 75) + 400);
                return;
            } else {
                od0Var.postDelayed(new org.telegram.ui.Components.xl(this, i10, 16), ((long) i10) * 75);
                i10++;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
        removeCallbacks(this.P);
    }

    public final void p() {
        if (this.R) {
            return;
        }
        this.R = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.E);
        bundle.putString("ephone", this.F);
        bundle.putString("phoneFormated", this.H);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.H;
        tL_auth_resetLoginEmail.phone_code_hash = this.I;
        this.S.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new id0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z10) {
        AndroidUtilities.updateViewVisibilityAnimated(this.f42584f, z10);
        AndroidUtilities.updateViewVisibilityAnimated(this.h, (z10 || this.S.B == 3 || this.L) ? false : true);
        org.telegram.ui.Components.w80 w80Var = this.v;
        if (w80Var.getVisibility() != 8) {
            w80Var.setLayoutParams(h7.z5.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z10 ? 8.0f : 16.0f));
            w80Var.requestLayout();
        }
    }

    public final void r() {
        String string;
        int iCurrentTimeMillis = (int) (((long) this.D) - (System.currentTimeMillis() / 1000));
        int i10 = this.D;
        int i11 = 0;
        qd0 qd0Var = this.f42586r;
        if (i10 <= 0 || iCurrentTimeMillis <= 0) {
            qd0Var.setVisibility(0);
            qd0Var.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
            AndroidUtilities.runOnUIThread(new kd0(this, i11), 1000L);
            return;
        }
        int i12 = R.string.LoginEmailResetInTime;
        int i13 = iCurrentTimeMillis / 86400;
        int i14 = iCurrentTimeMillis % 86400;
        int i15 = i14 / 3600;
        int i16 = i14 % 3600;
        int i17 = i16 / 60;
        int i18 = i16 % 60;
        if (i15 >= 16) {
            i13++;
        }
        if (i13 != 0) {
            string = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i13, new Object[0]));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i15 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i15)) : "");
            Locale locale = Locale.ROOT;
            sb2.append(String.format(locale, "%02d:", Integer.valueOf(i17)));
            sb2.append(String.format(locale, "%02d", Integer.valueOf(i18)));
            string = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb2.toString());
        }
        String string2 = LocaleController.formatString(i12, string);
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string2);
        int iIndexOf = string2.indexOf(42);
        int iLastIndexOf = string2.lastIndexOf(42);
        if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
            spannableStringBuilderValueOf.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
            spannableStringBuilderValueOf.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
            spannableStringBuilderValueOf.setSpan(new ForegroundColorSpan(this.S.getThemedColor(org.telegram.ui.ActionBar.g6.q6)), iIndexOf, iLastIndexOf - 1, 33);
        }
        qd0Var.setText(spannableStringBuilderValueOf);
        AndroidUtilities.runOnUIThread(this.Q, 1000L);
    }
}
