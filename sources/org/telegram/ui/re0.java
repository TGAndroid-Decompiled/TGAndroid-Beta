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
public final class re0 extends org.telegram.ui.Components.ax0 implements org.telegram.ui.Components.f50 {
    public String E;
    public String F;
    public Bundle G;
    public boolean H;
    public final org.telegram.ui.Components.xj0 I;
    public final org.telegram.ui.Components.xj0 J;
    public boolean K;
    public final org.telegram.ui.Components.g50 L;
    public TLRPC.FileLocation M;
    public TLRPC.FileLocation N;
    public final gg0 O;
    public final org.telegram.ui.Components.rd0 f43122a;
    public final org.telegram.ui.Components.rd0 f43123b;
    public final EditTextBoldCursor f43124c;
    public final EditTextBoldCursor d;
    public final di.k4 e;
    public final org.telegram.ui.Components.j9 f43125f;
    public final fi.f6 h;
    public final kd f43126n;
    public final ld f43127r;
    public AnimatorSet f43128s;
    public final TextView v;
    public final TextView f43129w;
    public final TextView f43130x;
    public final TextView f43131y;

    public re0(gg0 gg0Var, Context context) {
        super(context);
        int i10;
        float f7;
        this.O = gg0Var;
        this.H = false;
        this.K = true;
        setOrientation(1);
        org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, false, false);
        this.L = g50Var;
        g50Var.H = true;
        g50Var.J = false;
        g50Var.G = false;
        g50Var.K = false;
        g50Var.f28419a = gg0Var;
        g50Var.f28420b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, org.telegram.ui.Components.gb1.u(78, 78, 1));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.f43125f = j9Var;
        di.k4 k4Var = new di.k4(this, context, 10);
        this.e = k4Var;
        k4Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        j9Var.g(13);
        j9Var.n(5L, null, null);
        k4Var.setImageDrawable(j9Var);
        frameLayout.addView(k4Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        fi.f6 f6Var = new fi.f6(this, context, paint, 13);
        this.h = f6Var;
        frameLayout.addView(f6Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        f6Var.setOnClickListener(new View.OnClickListener(this) {
            public final re0 f41254b;

            {
                this.f41254b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        re0 re0Var = this.f41254b;
                        kd kdVar = re0Var.f43126n;
                        org.telegram.ui.Components.xj0 xj0Var = re0Var.I;
                        org.telegram.ui.Components.g50 g50Var2 = re0Var.L;
                        if (re0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g50Var2.n(z10, new bd0(re0Var, 1), new u5(re0Var, 8), 0);
                        re0Var.K = false;
                        kdVar.setAnimation(xj0Var);
                        xj0Var.M(0);
                        xj0Var.P(43);
                        kdVar.d();
                        return;
                    default:
                        re0 re0Var2 = this.f41254b;
                        if (re0Var2.O.V.getTag() == null) {
                            re0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.camera, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.I = xj0Var;
        this.J = new org.telegram.ui.Components.xj0(R.raw.camera_wait, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        kd kdVar = new kd(this, context, 3);
        this.f43126n = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        kdVar.setAnimation(xj0Var);
        kdVar.setEnabled(false);
        kdVar.setClickable(false);
        frameLayout.addView(kdVar, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        kdVar.addOnAttachStateChangeListener(new qe0(this));
        ld ldVar = new ld(this, context, 2);
        this.f43127r = ldVar;
        ldVar.setSize(AndroidUtilities.dp(30.0f));
        ldVar.setProgressColor(-1);
        frameLayout.addView(ldVar, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        o(false);
        TextView textView = new TextView(context);
        this.f43131y = textView;
        textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, org.telegram.ui.Components.gb1.x(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.v = textView2;
        textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, org.telegram.ui.Components.gb1.x(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, org.telegram.ui.Components.gb1.o(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.rd0 rd0Var = new org.telegram.ui.Components.rd0(context, null);
        this.f43122a = rd0Var;
        rd0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f43124c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final re0 f41540b;

            {
                this.f41540b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.rd0 rd0Var2 = this.f41540b.f43122a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        rd0Var2.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.rd0 rd0Var3 = this.f41540b.f43123b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        rd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        rd0Var.e(editTextBoldCursor);
        rd0Var.addView(editTextBoldCursor, org.telegram.ui.Components.gb1.i(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final re0 f41880b;

            {
                this.f41880b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        re0 re0Var = this.f41880b;
                        if (i11 == 5) {
                            re0Var.d.requestFocus();
                            return true;
                        }
                        re0Var.getClass();
                        return false;
                    default:
                        re0 re0Var2 = this.f41880b;
                        re0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        re0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.rd0 rd0Var2 = new org.telegram.ui.Components.rd0(context, null);
        this.f43123b = rd0Var2;
        rd0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final re0 f41540b;

            {
                this.f41540b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.rd0 rd0Var22 = this.f41540b.f43122a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        rd0Var22.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.rd0 rd0Var3 = this.f41540b.f43123b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        rd0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        rd0Var2.e(editTextBoldCursor2);
        rd0Var2.addView(editTextBoldCursor2, org.telegram.ui.Components.gb1.i(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final re0 f41880b;

            {
                this.f41880b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        re0 re0Var = this.f41880b;
                        if (i11 == 5) {
                            re0Var.d.requestFocus();
                            return true;
                        }
                        re0Var.getClass();
                        return false;
                    default:
                        re0 re0Var2 = this.f41880b;
                        re0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        re0Var2.h(null);
                        return true;
                }
            }
        });
        boolean isSmallScreen = AndroidUtilities.isSmallScreen();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (isSmallScreen) {
            LinearLayout linearLayout = new LinearLayout(gg0Var.getParentActivity());
            linearLayout.setOrientation(0);
            rd0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            rd0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(rd0Var, org.telegram.ui.Components.gb1.q(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(rd0Var2, org.telegram.ui.Components.gb1.q(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            rd0Var.setText(LocaleController.getString(R.string.FirstName));
            rd0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(rd0Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(rd0Var2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f43129w = textView3;
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
        addView(textView3, org.telegram.ui.Components.gb1.x(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final re0 f41254b;

            {
                this.f41254b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        re0 re0Var = this.f41254b;
                        kd kdVar2 = re0Var.f43126n;
                        org.telegram.ui.Components.xj0 xj0Var2 = re0Var.I;
                        org.telegram.ui.Components.g50 g50Var2 = re0Var.L;
                        if (re0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g50Var2.n(z10, new bd0(re0Var, 1), new u5(re0Var, 8), 0);
                        re0Var.K = false;
                        kdVar2.setAnimation(xj0Var2);
                        xj0Var2.M(0);
                        xj0Var2.P(43);
                        kdVar2.d();
                        return;
                    default:
                        re0 re0Var2 = this.f41254b;
                        if (re0Var2.O.V.getTag() == null) {
                            re0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, org.telegram.ui.Components.gb1.u(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f43130x = textView4;
        textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        if (AndroidUtilities.isSmallScreen()) {
            f7 = 13.0f;
        } else {
            f7 = 14.0f;
        }
        textView4.setTextSize(1, f7);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, org.telegram.ui.Components.gb1.h(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
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
        AndroidUtilities.runOnUIThread(new oe0(this, photoSize2, photoSize, 0));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        gg0 gg0Var = this.O;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gg0Var.getParentActivity());
            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.Warning);
            alertDialog$Builder.f22366a.T = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
            alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new ke0(this, 0));
            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
            gg0Var.showDialog(alertDialog$Builder.f22366a);
            return false;
        }
        gg0Var.p1(true, true);
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
    public qu0 getCloseIntoObject() {
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
        gg0 gg0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = gg0Var.f39667p0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            p(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f43124c;
        if (editTextBoldCursor.length() == 0) {
            gg0.X0(gg0Var, this.f43122a, true);
            return;
        }
        this.H = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.F;
        tL_auth_signUp.phone_number = this.E;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        gg0Var.s1(0, true);
        i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signUp, new l(this, 12), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f43130x;
        if (textView != null) {
            if (this.O.f39656f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f43124c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new bd0(this, 3), gg0.f39647x0);
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
                this.O.f39667p0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f43124c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f43124c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        gg0 gg0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = gg0Var.f39667p0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            gg0Var.f39667p0.serializeToStream(serializedData);
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
        this.f43124c.setText("");
        this.d.setText("");
        this.E = bundle.getString("phoneFormated");
        this.F = bundle.getString("phoneHash");
        this.G = bundle;
    }

    public final void n() {
        this.f43130x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void o(boolean z10) {
        kd kdVar = this.f43126n;
        if (kdVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f43128s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f43128s = null;
        }
        ld ldVar = this.f43127r;
        if (z10) {
            this.f43128s = new AnimatorSet();
            kdVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f43128s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, property, 1.0f), ObjectAnimator.ofFloat(ldVar, property, 0.0f));
            this.f43128s.setDuration(180L);
            this.f43128s.addListener(new i50(this, 3));
            this.f43128s.start();
            return;
        }
        kdVar.setAlpha(1.0f);
        kdVar.setVisibility(0);
        ldVar.setAlpha(0.0f);
        ldVar.setVisibility(4);
    }

    public final void p(boolean z10) {
        gg0 gg0Var = this.O;
        if (gg0Var.f39667p0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gg0Var.getParentActivity());
        alertDialog$Builder.f22366a.R = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z10) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new ke0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ke0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gg0Var.f39667p0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, gg0Var.f39667p0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.T = spannableStringBuilder;
        gg0Var.showDialog(e2Var);
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void updateColors() {
        this.f43125f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        this.f43131y.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.y6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f43124c;
        editTextBoldCursor.setTextColor(x02);
        int i12 = org.telegram.ui.ActionBar.y6.f23500l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(x03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, i12, false));
        this.f43129w.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23595q6, false));
        int x04 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        TextView textView = this.f43130x;
        textView.setTextColor(x04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.J6, false));
        this.f43122a.f();
        this.f43123b.f();
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
