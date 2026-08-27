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

public final class te0 extends org.telegram.ui.Components.ev0 implements org.telegram.ui.Components.i40 {
    public String A;
    public String B;
    public Bundle C;
    public boolean D;
    public final org.telegram.ui.Components.oi0 E;
    public final org.telegram.ui.Components.oi0 F;
    public boolean G;
    public final org.telegram.ui.Components.j40 H;
    public TLRPC.FileLocation I;
    public TLRPC.FileLocation J;
    public final ig0 K;

    public final org.telegram.ui.Components.jc0 f42915a;

    public final org.telegram.ui.Components.jc0 f42916b;

    public final EditTextBoldCursor f42917c;
    public final EditTextBoldCursor d;

    public final jh.z3 f42918e;

    public final org.telegram.ui.Components.y8 f42919f;
    public final ag.t0 h;

    public final fd f42920n;

    public final gd f42921r;

    public AnimatorSet f42922s;
    public final TextView v;

    public final TextView f42923w;

    public final TextView f42924x;

    public final TextView f42925y;

    public te0(ig0 ig0Var, Context context) {
        super(context);
        this.K = ig0Var;
        this.D = false;
        this.G = true;
        setOrientation(1);
        org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(0, false, false);
        this.H = j40Var;
        j40Var.D = true;
        j40Var.F = false;
        j40Var.C = false;
        j40Var.G = false;
        j40Var.f29569a = ig0Var;
        j40Var.f29570b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, h7.z5.q(78, 78, 1));
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.f42919f = y8Var;
        jh.z3 z3Var = new jh.z3(this, context, 9);
        this.f42918e = z3Var;
        z3Var.setRoundRadius(AndroidUtilities.dp(64.0f));
        y8Var.g(13);
        y8Var.n(5L, null, null);
        z3Var.setImageDrawable(y8Var);
        frameLayout.addView(z3Var, h7.z5.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ag.t0 t0Var = new ag.t0(this, context, paint, 13);
        this.h = t0Var;
        frameLayout.addView(t0Var, h7.z5.c(-1.0f, -1));
        final int i10 = 0;
        t0Var.setOnClickListener(new View.OnClickListener(this) {

            public final te0 f41071b;

            {
                this.f41071b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        te0 te0Var = this.f41071b;
                        fd fdVar = te0Var.f42920n;
                        org.telegram.ui.Components.oi0 oi0Var = te0Var.E;
                        te0Var.H.o(te0Var.I != null, new fd0(te0Var, 1), new s5(te0Var, 8), 0);
                        te0Var.G = false;
                        fdVar.setAnimation(oi0Var);
                        oi0Var.K(0);
                        oi0Var.N(43);
                        fdVar.d();
                        break;
                    default:
                        te0 te0Var2 = this.f41071b;
                        if (te0Var2.K.R.getTag() == null) {
                            te0Var2.c(false);
                            break;
                        }
                        break;
                }
            }
        });
        int i11 = R.raw.camera;
        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(i11, String.valueOf(i11), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        this.E = oi0Var;
        int i12 = R.raw.camera_wait;
        this.F = new org.telegram.ui.Components.oi0(i12, String.valueOf(i12), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
        fd fdVar = new fd(this, context, 3);
        this.f42920n = fdVar;
        fdVar.setScaleType(ImageView.ScaleType.CENTER);
        fdVar.setAnimation(oi0Var);
        fdVar.setEnabled(false);
        fdVar.setClickable(false);
        frameLayout.addView(fdVar, h7.z5.c(-1.0f, -1));
        fdVar.addOnAttachStateChangeListener(new se0(this));
        gd gdVar = new gd(this, context, 2);
        this.f42921r = gdVar;
        gdVar.setSize(AndroidUtilities.dp(30.0f));
        gdVar.setProgressColor(-1);
        frameLayout.addView(gdVar, h7.z5.c(-1.0f, -1));
        p(false);
        TextView textView = new TextView(context);
        this.f42925y = textView;
        textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, h7.z5.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.v = textView2;
        textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, h7.z5.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, h7.z5.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context, null);
        this.f42915a = jc0Var;
        jc0Var.setText(LocaleController.getString(R.string.FirstName));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f42917c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        final int i13 = 0;
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {

            public final te0 f41336b;

            {
                this.f41336b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                switch (i13) {
                    case 0:
                        org.telegram.ui.Components.jc0 jc0Var2 = this.f41336b.f42915a;
                        float f10 = z10 ? 1.0f : 0.0f;
                        jc0Var2.b(f10, f10, true);
                        break;
                    default:
                        org.telegram.ui.Components.jc0 jc0Var3 = this.f41336b.f42916b;
                        float f11 = z10 ? 1.0f : 0.0f;
                        jc0Var3.b(f11, f11, true);
                        break;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        jc0Var.e(editTextBoldCursor);
        jc0Var.addView(editTextBoldCursor, h7.z5.e(-1, -2, 48));
        final int i14 = 0;
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final te0 f41645b;

            {
                this.f41645b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i15, KeyEvent keyEvent) {
                switch (i14) {
                    case 0:
                        te0 te0Var = this.f41645b;
                        if (i15 == 5) {
                            te0Var.d.requestFocus();
                            return true;
                        }
                        te0Var.getClass();
                        return false;
                    default:
                        te0 te0Var2 = this.f41645b;
                        te0Var2.getClass();
                        if (i15 != 6 && i15 != 5) {
                            return false;
                        }
                        te0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.jc0 jc0Var2 = new org.telegram.ui.Components.jc0(context, null);
        this.f42916b = jc0Var2;
        jc0Var2.setText(LocaleController.getString(R.string.LastName));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        final int i15 = 1;
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {

            public final te0 f41336b;

            {
                this.f41336b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                switch (i15) {
                    case 0:
                        org.telegram.ui.Components.jc0 jc0Var3 = this.f41336b.f42915a;
                        float f10 = z10 ? 1.0f : 0.0f;
                        jc0Var3.b(f10, f10, true);
                        break;
                    default:
                        org.telegram.ui.Components.jc0 jc0Var4 = this.f41336b.f42916b;
                        float f11 = z10 ? 1.0f : 0.0f;
                        jc0Var4.b(f11, f11, true);
                        break;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        jc0Var2.e(editTextBoldCursor2);
        jc0Var2.addView(editTextBoldCursor2, h7.z5.e(-1, -2, 48));
        final int i16 = 1;
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final te0 f41645b;

            {
                this.f41645b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i17, KeyEvent keyEvent) {
                switch (i16) {
                    case 0:
                        te0 te0Var = this.f41645b;
                        if (i17 == 5) {
                            te0Var.d.requestFocus();
                            return true;
                        }
                        te0Var.getClass();
                        return false;
                    default:
                        te0 te0Var2 = this.f41645b;
                        te0Var2.getClass();
                        if (i17 != 6 && i17 != 5) {
                            return false;
                        }
                        te0Var2.h(null);
                        return true;
                }
            }
        });
        boolean zIsSmallScreen = AndroidUtilities.isSmallScreen();
        boolean zHasFocus = editTextBoldCursor.hasFocus();
        boolean zHasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (zIsSmallScreen) {
            LinearLayout linearLayout = new LinearLayout(ig0Var.getParentActivity());
            linearLayout.setOrientation(0);
            jc0Var.setText(LocaleController.getString(R.string.FirstNameSmall));
            jc0Var2.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(jc0Var, h7.z5.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(jc0Var2, h7.z5.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (zHasFocus) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            } else if (zHasFocus2) {
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor2);
            }
        } else {
            jc0Var.setText(LocaleController.getString(R.string.FirstName));
            jc0Var2.setText(LocaleController.getString(R.string.LastName));
            frameLayout2.addView(jc0Var, h7.z5.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(jc0Var2, h7.z5.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f42923w = textView3;
        textView3.setText(LocaleController.getString("CancelRegistration", R.string.CancelRegistration));
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView3.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, h7.z5.t(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
        final int i17 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) {

            public final te0 f41071b;

            {
                this.f41071b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        te0 te0Var = this.f41071b;
                        fd fdVar2 = te0Var.f42920n;
                        org.telegram.ui.Components.oi0 oi0Var2 = te0Var.E;
                        te0Var.H.o(te0Var.I != null, new fd0(te0Var, 1), new s5(te0Var, 8), 0);
                        te0Var.G = false;
                        fdVar2.setAnimation(oi0Var2);
                        oi0Var2.K(0);
                        oi0Var2.N(43);
                        fdVar2.d();
                        break;
                    default:
                        te0 te0Var2 = this.f41071b;
                        if (te0Var2.K.R.getTag() == null) {
                            te0Var2.c(false);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, h7.z5.q(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f42924x = textView4;
        textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        textView4.setTextSize(1, AndroidUtilities.isSmallScreen() ? 13.0f : 14.0f);
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, h7.z5.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        i6.q2(textView4);
        String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf(42);
        int iLastIndexOf = string.lastIndexOf(42);
        if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf != iLastIndexOf) {
            spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new ag.x0(this, 8), iIndexOf, iLastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new lq(this, photoSize2, photoSize, 28));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        ig0 ig0Var = this.K;
        if (z10) {
            ig0Var.k1(true, true);
            this.D = false;
            this.C = null;
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f22702a.P = LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration);
        alertDialog$Builder.h(LocaleController.getString("Stop", R.string.Stop), new ne0(this, 0));
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        ig0Var.showDialog(alertDialog$Builder.f22702a);
        return false;
    }

    @Override
    public final void d() {
        this.D = false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public cu0 getCloseIntoObject() {
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
        if (this.D) {
            return;
        }
        ig0 ig0Var = this.K;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = ig0Var.f39095l0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            q(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f42917c;
        if (editTextBoldCursor.length() == 0) {
            ig0.U0(ig0Var, this.f42915a, true);
            return;
        }
        this.D = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.B;
        tL_auth_signUp.phone_number = this.A;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        ig0Var.n1(0, true);
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(tL_auth_signUp, new n(this, 11), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f42924x;
        if (textView != null) {
            if (this.K.f39088f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f42917c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            AndroidUtilities.showKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.runOnUIThread(new fd0(this, 3), ig0.f39078p0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] bArrDecode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.C = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (bArrDecode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(bArrDecode);
                this.K.f39095l0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f42917c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String string = this.f42917c.getText().toString();
        if (string.length() != 0) {
            bundle.putString("registerview_first", string);
        }
        String string2 = this.d.getText().toString();
        if (string2.length() != 0) {
            bundle.putString("registerview_last", string2);
        }
        ig0 ig0Var = this.K;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = ig0Var.f39095l0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            ig0Var.f39095l0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.C;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.f42917c.setText("");
        this.d.setText("");
        this.A = bundle.getString("phoneFormated");
        this.B = bundle.getString("phoneHash");
        this.C = bundle;
    }

    @Override
    public final void n() {
        this.f42919f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.f42925y.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.g6.D6;
        this.v.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f42917c;
        editTextBoldCursor.setTextColor(iW0);
        int i12 = org.telegram.ui.ActionBar.g6.f23198l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(iW1);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f42923w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        int iW2 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        TextView textView = this.f42924x;
        textView.setTextColor(iW2);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
        this.f42915a.f();
        this.f42916b.f();
    }

    public final void o() {
        this.f42924x.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
    }

    public final void p(boolean z10) {
        fd fdVar = this.f42920n;
        if (fdVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f42922s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f42922s = null;
        }
        gd gdVar = this.f42921r;
        if (!z10) {
            fdVar.setAlpha(1.0f);
            fdVar.setVisibility(0);
            gdVar.setAlpha(0.0f);
            gdVar.setVisibility(4);
            return;
        }
        this.f42922s = new AnimatorSet();
        fdVar.setVisibility(0);
        AnimatorSet animatorSet2 = this.f42922s;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(fdVar, (Property<fd, Float>) property, 1.0f), ObjectAnimator.ofFloat(gdVar, (Property<gd, Float>) property, 0.0f));
        this.f42922s.setDuration(180L);
        this.f42922s.addListener(new f50(this, 3));
        this.f42922s.start();
    }

    public final void q(boolean z10) {
        ig0 ig0Var = this.K;
        if (ig0Var.f39095l0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ig0Var.getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString("TermsOfService", R.string.TermsOfService);
        if (z10) {
            alertDialog$Builder.k(LocaleController.getString("Accept", R.string.Accept), new ne0(this, 1));
            alertDialog$Builder.h(LocaleController.getString("Decline", R.string.Decline), new ne0(this, 2));
        } else {
            alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ig0Var.f39095l0.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, ig0Var.f39095l0.entities, false, false, false, false);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.P = spannableStringBuilder;
        ig0Var.showDialog(b2Var);
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void E(float f10) {
    }

    @Override
    public final void P() {
    }

    @Override
    public final void J(boolean z10, boolean z11) {
    }
}
