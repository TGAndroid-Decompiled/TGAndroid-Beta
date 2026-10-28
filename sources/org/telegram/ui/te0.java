package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class te0 extends org.telegram.ui.Components.bx0 implements org.telegram.ui.Components.f50 {
    public String E;
    public String F;
    public Bundle G;
    public boolean H;
    public final org.telegram.ui.Components.yj0 I;
    public final org.telegram.ui.Components.yj0 J;
    public boolean K;
    public final org.telegram.ui.Components.g50 L;
    public TLRPC.FileLocation M;
    public TLRPC.FileLocation N;
    public final ig0 O;
    public final org.telegram.ui.Components.sd0 f43610a;
    public final org.telegram.ui.Components.sd0 f43611b;
    public final EditTextBoldCursor f43612c;
    public final EditTextBoldCursor d;
    public final di.k4 e;
    public final org.telegram.ui.Components.j9 f43613f;
    public final fi.f6 h;
    public final kd f43614n;
    public final ld f43615r;
    public AnimatorSet f43616s;
    public final TextView v;
    public final TextView f43617w;
    public final TextView f43618x;
    public final TextView f43619y;

    public te0(ig0 ig0Var, Context context) {
        super(context);
        int i10;
        float f7;
        this.O = ig0Var;
        this.H = false;
        this.K = true;
        setOrientation(1);
        org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, false, false);
        this.L = g50Var;
        g50Var.H = true;
        g50Var.J = false;
        g50Var.G = false;
        g50Var.K = false;
        g50Var.f28388a = ig0Var;
        g50Var.f28389b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, org.telegram.ui.Components.kb1.u(78, 78, 1));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.f43613f = j9Var;
        di.k4 k4Var = new di.k4(this, context, 10);
        this.e = k4Var;
        k4Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        j9Var.g(13);
        j9Var.n(5L, null, null);
        k4Var.setImageDrawable(j9Var);
        frameLayout.addView(k4Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        fi.f6 f6Var = new fi.f6(this, context, paint, 13);
        this.h = f6Var;
        frameLayout.addView(f6Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        f6Var.setOnClickListener(new View.OnClickListener(this) {
            public final te0 f42072b;

            {
                this.f42072b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        te0 te0Var = this.f42072b;
                        kd kdVar = te0Var.f43614n;
                        org.telegram.ui.Components.yj0 yj0Var = te0Var.I;
                        org.telegram.ui.Components.g50 g50Var2 = te0Var.L;
                        if (te0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g50Var2.n(z10, new dd0(te0Var, 1), new u5(te0Var, 8), 0);
                        te0Var.K = false;
                        kdVar.setAnimation(yj0Var);
                        yj0Var.M(0);
                        yj0Var.P(43);
                        kdVar.d();
                        return;
                    default:
                        te0 te0Var2 = this.f42072b;
                        if (te0Var2.O.V.getTag() == null) {
                            te0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.camera, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.I = yj0Var;
        this.J = new org.telegram.ui.Components.yj0(R.raw.camera_wait, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        kd kdVar = new kd(this, context, 3);
        this.f43614n = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        kdVar.setAnimation(yj0Var);
        kdVar.setEnabled(false);
        kdVar.setClickable(false);
        frameLayout.addView(kdVar, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        kdVar.addOnAttachStateChangeListener(new se0(this));
        ld ldVar = new ld(this, context, 2);
        this.f43615r = ldVar;
        ldVar.setSize(AndroidUtilities.dp(30.0f));
        ldVar.setProgressColor(-1);
        frameLayout.addView(ldVar, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        o(false);
        TextView textView = new TextView(context);
        this.f43619y = textView;
        textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, org.telegram.ui.Components.kb1.x(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.v = textView2;
        textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, org.telegram.ui.Components.kb1.x(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, org.telegram.ui.Components.kb1.o(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(context, null);
        this.f43610a = sd0Var;
        sd0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f43612c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final te0 f42387b;

            {
                this.f42387b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.sd0 sd0Var2 = this.f42387b.f43610a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sd0Var2.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.sd0 sd0Var3 = this.f42387b.f43611b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        sd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        sd0Var.e(editTextBoldCursor);
        sd0Var.addView(editTextBoldCursor, org.telegram.ui.Components.kb1.i(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final te0 f42687b;

            {
                this.f42687b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        te0 te0Var = this.f42687b;
                        if (i11 == 5) {
                            te0Var.d.requestFocus();
                            return true;
                        }
                        te0Var.getClass();
                        return false;
                    default:
                        te0 te0Var2 = this.f42687b;
                        te0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        te0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.sd0 sd0Var2 = new org.telegram.ui.Components.sd0(context, null);
        this.f43611b = sd0Var2;
        sd0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final te0 f42387b;

            {
                this.f42387b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.sd0 sd0Var22 = this.f42387b.f43610a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        sd0Var22.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.sd0 sd0Var3 = this.f42387b.f43611b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        sd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        sd0Var2.e(editTextBoldCursor2);
        sd0Var2.addView(editTextBoldCursor2, org.telegram.ui.Components.kb1.i(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final te0 f42687b;

            {
                this.f42687b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        te0 te0Var = this.f42687b;
                        if (i11 == 5) {
                            te0Var.d.requestFocus();
                            return true;
                        }
                        te0Var.getClass();
                        return false;
                    default:
                        te0 te0Var2 = this.f42687b;
                        te0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        te0Var2.h(null);
                        return true;
                }
            }
        });
        boolean isSmallScreen = AndroidUtilities.isSmallScreen();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (isSmallScreen) {
            LinearLayout linearLayout = new LinearLayout(ig0Var.getParentActivity());
            linearLayout.setOrientation(0);
            sd0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            sd0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(sd0Var, org.telegram.ui.Components.kb1.q(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(sd0Var2, org.telegram.ui.Components.kb1.q(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            sd0Var.setText(LocaleController.getString(R.string.FirstName));
            sd0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(sd0Var, org.telegram.ui.Components.kb1.h(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(sd0Var2, org.telegram.ui.Components.kb1.h(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f43617w = textView3;
        textView3.setText(LocaleController.getString("CancelRegistration", R.string.CancelRegistration));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView3.setGravity(i10 | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, org.telegram.ui.Components.kb1.x(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final te0 f42072b;

            {
                this.f42072b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        te0 te0Var = this.f42072b;
                        kd kdVar2 = te0Var.f43614n;
                        org.telegram.ui.Components.yj0 yj0Var2 = te0Var.I;
                        org.telegram.ui.Components.g50 g50Var2 = te0Var.L;
                        if (te0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g50Var2.n(z10, new dd0(te0Var, 1), new u5(te0Var, 8), 0);
                        te0Var.K = false;
                        kdVar2.setAnimation(yj0Var2);
                        yj0Var2.M(0);
                        yj0Var2.P(43);
                        kdVar2.d();
                        return;
                    default:
                        te0 te0Var2 = this.f42072b;
                        if (te0Var2.O.V.getTag() == null) {
                            te0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, org.telegram.ui.Components.kb1.u(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f43618x = textView4;
        textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (AndroidUtilities.isSmallScreen()) {
            f7 = 13.0f;
        } else {
            f7 = 14.0f;
        }
        textView4.setTextSize(1, f7);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, org.telegram.ui.Components.kb1.h(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        k6.c.h(textView4);
        String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new fi.hb(this, 8), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ne0(this, photoSize2, photoSize, 1));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        ig0 ig0Var = this.O;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.Warning);
            alertDialog$Builder.f22369a.T = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new me0(this, 0));
            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
            ig0Var.showDialog(alertDialog$Builder.f22369a);
            return false;
        }
        ig0Var.p1(true, true);
        this.H = false;
        this.G = null;
        return true;
    }

    @Override
    public final void d() {
        this.H = false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public su0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("YourName", R.string.YourName);
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.H) {
            return;
        }
        ig0 ig0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = ig0Var.f40160q0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            p(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f43612c;
        if (editTextBoldCursor.length() == 0) {
            ig0.X0(ig0Var, this.f43610a, true);
            return;
        }
        this.H = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.F;
        tL_auth_signUp.phone_number = this.E;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        ig0Var.s1(0, true);
        i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signUp, new l(this, 12), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f43618x;
        if (textView != null) {
            if (this.O.f40148f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f43612c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new dd0(this, 3), ig0.f40139y0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.G = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.O.f40160q0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f43612c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f43612c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        ig0 ig0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = ig0Var.f40160q0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            ig0Var.f40160q0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.G;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f43612c.setText("");
        this.d.setText("");
        this.E = bundle.getString("phoneFormated");
        this.F = bundle.getString("phoneHash");
        this.G = bundle;
    }

    public final void n() {
        this.f43618x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void o(boolean z10) {
        kd kdVar = this.f43614n;
        if (kdVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f43616s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f43616s = null;
        }
        ld ldVar = this.f43615r;
        if (z10) {
            this.f43616s = new AnimatorSet();
            kdVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f43616s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, property, 1.0f), ObjectAnimator.ofFloat(ldVar, property, 0.0f));
            this.f43616s.setDuration(180L);
            this.f43616s.addListener(new k50(this, 3));
            this.f43616s.start();
            return;
        }
        kdVar.setAlpha(1.0f);
        kdVar.setVisibility(0);
        ldVar.setAlpha(0.0f);
        ldVar.setVisibility(4);
    }

    public final void p(boolean z10) {
        ig0 ig0Var = this.O;
        if (ig0Var.f40160q0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
        alertDialog$Builder.f22369a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z10) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new me0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new me0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ig0Var.f40160q0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, ig0Var.f40160q0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.T = spannableStringBuilder;
        ig0Var.showDialog(e2Var);
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void updateColors() {
        this.f43613f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        this.f43619y.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.y6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f43612c;
        editTextBoldCursor.setTextColor(x02);
        int i12 = org.telegram.ui.ActionBar.y6.f23503l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(x03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        this.f43617w.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23598q6, false));
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        TextView textView = this.f43618x;
        textView.setTextColor(x04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J6, false));
        this.f43610a.f();
        this.f43611b.f();
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void F(float f7) {
    }

    @Override
    public final void L(boolean z10, boolean z11) {
    }
}
