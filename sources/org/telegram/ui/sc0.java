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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sc0 extends org.telegram.ui.Components.xt0 implements org.telegram.ui.Components.i30 {
    public final TextView D;
    public String E;
    public String F;
    public boolean G;
    public Bundle H;
    public boolean I;
    public final org.telegram.ui.Components.zg0 J;
    public final org.telegram.ui.Components.zg0 K;
    public boolean L;
    public final org.telegram.ui.Components.j30 M;
    public TLRPC.FileLocation N;
    public TLRPC.FileLocation O;
    public final fe0 P;
    public final org.telegram.ui.Components.lb0 f49819a;
    public final org.telegram.ui.Components.lb0 f49820b;
    public final EditTextBoldCursor f49821c;
    public final EditTextBoldCursor d;
    public final di.d4 f49822e;
    public final org.telegram.ui.Components.v8 f49823f;
    public final fi.p5 h;
    public final yc f49824n;
    public final zc f49825r;
    public AnimatorSet f49826s;
    public final TextView f49827w;
    public final TextView f49828x;
    public final TextView f49829y;

    public sc0(fe0 fe0Var, Context context) {
        super(context);
        int i7;
        float f10;
        this.P = fe0Var;
        this.I = false;
        this.L = true;
        setOrientation(1);
        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, false, false);
        this.M = j30Var;
        j30Var.H = true;
        j30Var.J = false;
        j30Var.G = false;
        j30Var.K = false;
        j30Var.f34825a = fe0Var;
        j30Var.f34826b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ha.r(78, 78, 1));
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.f49823f = v8Var;
        di.d4 d4Var = new di.d4(10, context, this);
        this.f49822e = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(64.0f));
        v8Var.g(13);
        v8Var.k(5L, null, null, null);
        d4Var.setImageDrawable(v8Var);
        frameLayout.addView(d4Var, c8.ha.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        fi.p5 p5Var = new fi.p5(this, context, paint, 14);
        this.h = p5Var;
        frameLayout.addView(p5Var, c8.ha.c(-1.0f, -1));
        p5Var.setOnClickListener(new View.OnClickListener(this) {
            public final sc0 f47916b;

            {
                this.f47916b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z9;
                switch (r2) {
                    case 0:
                        sc0 sc0Var = this.f47916b;
                        yc ycVar = sc0Var.f49824n;
                        org.telegram.ui.Components.zg0 zg0Var = sc0Var.J;
                        org.telegram.ui.Components.j30 j30Var2 = sc0Var.M;
                        if (sc0Var.N != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        j30Var2.n(z9, new eb0(sc0Var, 1), new q5(sc0Var, 8), 0);
                        sc0Var.L = false;
                        ycVar.setAnimation(zg0Var);
                        zg0Var.M(0);
                        zg0Var.P(43);
                        ycVar.d();
                        return;
                    default:
                        sc0 sc0Var2 = this.f47916b;
                        if (sc0Var2.P.V.getTag() == null) {
                            sc0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131623959, org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f), false, null);
        this.J = zg0Var;
        this.K = new org.telegram.ui.Components.zg0(2131623967, org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f), false, null);
        yc ycVar = new yc(4, context, this);
        this.f49824n = ycVar;
        ycVar.setScaleType(ImageView.ScaleType.CENTER);
        ycVar.setAnimation(zg0Var);
        ycVar.setEnabled(false);
        ycVar.setClickable(false);
        frameLayout.addView(ycVar, c8.ha.c(-1.0f, -1));
        ycVar.addOnAttachStateChangeListener(new rc0(this));
        zc zcVar = new zc(this, context, 2);
        this.f49825r = zcVar;
        zcVar.setSize(org.telegram.messenger.g0.L(30.0f));
        zcVar.setProgressColor(-1);
        frameLayout.addView(zcVar, c8.ha.c(-1.0f, -1));
        o(false);
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setText(org.telegram.messenger.id.M0(2131746338, null));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, c8.ha.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.f49827w = textView2;
        textView2.setText(org.telegram.messenger.id.M0(2131746339, "RegisterText2"));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.ha.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, c8.ha.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context, null);
        this.f49819a = lb0Var;
        lb0Var.setText(org.telegram.messenger.id.M0(2131750694, null));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f49821c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final sc0 f48186b;

            {
                this.f48186b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z9) {
                float f11;
                float f12;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.lb0 lb0Var2 = this.f48186b.f49819a;
                        if (z9) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        lb0Var2.b(f11, f11, true);
                        return;
                    default:
                        org.telegram.ui.Components.lb0 lb0Var3 = this.f48186b.f49820b;
                        if (z9) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        lb0Var3.b(f12, f12, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        lb0Var.e(editTextBoldCursor);
        lb0Var.addView(editTextBoldCursor, c8.ha.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final sc0 f48498b;

            {
                this.f48498b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        sc0 sc0Var = this.f48498b;
                        if (i10 == 5) {
                            sc0Var.d.requestFocus();
                            return true;
                        }
                        sc0Var.getClass();
                        return false;
                    default:
                        sc0 sc0Var2 = this.f48498b;
                        sc0Var2.getClass();
                        if (i10 != 6 && i10 != 5) {
                            return false;
                        }
                        sc0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.lb0 lb0Var2 = new org.telegram.ui.Components.lb0(context, null);
        this.f49820b = lb0Var2;
        lb0Var2.setText(org.telegram.messenger.id.M0(2131749032, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final sc0 f48186b;

            {
                this.f48186b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z9) {
                float f11;
                float f12;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.lb0 lb0Var22 = this.f48186b.f49819a;
                        if (z9) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        lb0Var22.b(f11, f11, true);
                        return;
                    default:
                        org.telegram.ui.Components.lb0 lb0Var3 = this.f48186b.f49820b;
                        if (z9) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        lb0Var3.b(f12, f12, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        lb0Var2.e(editTextBoldCursor2);
        lb0Var2.addView(editTextBoldCursor2, c8.ha.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final sc0 f48498b;

            {
                this.f48498b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        sc0 sc0Var = this.f48498b;
                        if (i10 == 5) {
                            sc0Var.d.requestFocus();
                            return true;
                        }
                        sc0Var.getClass();
                        return false;
                    default:
                        sc0 sc0Var2 = this.f48498b;
                        sc0Var2.getClass();
                        if (i10 != 6 && i10 != 5) {
                            return false;
                        }
                        sc0Var2.h(null);
                        return true;
                }
            }
        });
        boolean O1 = org.telegram.messenger.g0.O1();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (O1) {
            LinearLayout linearLayout = new LinearLayout(fe0Var.getParentActivity());
            linearLayout.setOrientation(0);
            lb0Var.setText(org.telegram.messenger.id.M0(2131750693, null));
            lb0Var2.setText(org.telegram.messenger.id.M0(2131749031, null));
            linearLayout.addView(lb0Var, c8.ha.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(lb0Var2, c8.ha.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor2);
            }
        } else {
            lb0Var.setText(org.telegram.messenger.id.M0(2131750694, null));
            lb0Var2.setText(org.telegram.messenger.id.M0(2131749032, null));
            frameLayout2.addView(lb0Var, c8.ha.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(lb0Var2, c8.ha.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f49828x = textView3;
        textView3.setText(org.telegram.messenger.id.M0(2131752572, "CancelRegistration"));
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView3.setGravity(i7 | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView3.setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, c8.ha.t(-2, -2, (org.telegram.messenger.id.f23161a0 ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final sc0 f47916b;

            {
                this.f47916b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z9;
                switch (r2) {
                    case 0:
                        sc0 sc0Var = this.f47916b;
                        yc ycVar2 = sc0Var.f49824n;
                        org.telegram.ui.Components.zg0 zg0Var2 = sc0Var.J;
                        org.telegram.ui.Components.j30 j30Var2 = sc0Var.M;
                        if (sc0Var.N != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        j30Var2.n(z9, new eb0(sc0Var, 1), new q5(sc0Var, 8), 0);
                        sc0Var.L = false;
                        ycVar2.setAnimation(zg0Var2);
                        zg0Var2.M(0);
                        zg0Var2.P(43);
                        ycVar2.d();
                        return;
                    default:
                        sc0 sc0Var2 = this.f47916b;
                        if (sc0Var2.P.V.getTag() == null) {
                            sc0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, c8.ha.r(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f49829y = textView4;
        textView4.setMovementMethod(new org.telegram.messenger.c0(false));
        if (org.telegram.messenger.g0.O1()) {
            f10 = 13.0f;
        } else {
            f10 = 14.0f;
        }
        textView4.setTextSize(1, f10);
        textView4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, c8.ha.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        h6.m.g(textView4);
        String M0 = org.telegram.messenger.id.M0(2131744197, "TermsOfServiceLogin");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int lastIndexOf = M0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new fi.ka(this, 8), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new pc0(this, photoSize2, photoSize, 0));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z9) {
        fe0 fe0Var = this.P;
        if (!z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131742948, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131754080, "AreYouSureRegistration");
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131744841, "Stop"), new lc0(this, 0));
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, "Continue"), null);
            fe0Var.showDialog(u1Var);
            return false;
        }
        fe0Var.C1(true, true);
        this.I = false;
        this.H = null;
        return true;
    }

    @Override
    public final void d() {
        this.I = false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public zq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131742810, "YourName");
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signUp tL_auth_signUp;
        int i7;
        if (this.I) {
            return;
        }
        fe0 fe0Var = this.P;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = fe0Var.f45713q0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            p(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f49821c;
        if (editTextBoldCursor.length() == 0) {
            fe0.c1(fe0Var, this.f49819a, true);
            return;
        }
        this.I = true;
        boolean z9 = this.G;
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        if (z9) {
            TLRPC.TL_auth_firebasePnvSignUp tL_auth_firebasePnvSignUp = new TLRPC.TL_auth_firebasePnvSignUp();
            tL_auth_firebasePnvSignUp.first_name = editTextBoldCursor.getText().toString();
            tL_auth_firebasePnvSignUp.last_name = editTextBoldCursor2.getText().toString();
            tL_auth_signUp = tL_auth_firebasePnvSignUp;
        } else {
            TLRPC.TL_auth_signUp tL_auth_signUp2 = new TLRPC.TL_auth_signUp();
            tL_auth_signUp2.phone_code_hash = this.F;
            tL_auth_signUp2.phone_number = this.E;
            tL_auth_signUp2.first_name = editTextBoldCursor.getText().toString();
            tL_auth_signUp2.last_name = editTextBoldCursor2.getText().toString();
            tL_auth_signUp = tL_auth_signUp2;
        }
        fe0Var.F1(0, true);
        i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_auth_signUp, new d3.b(1), new a5(this, 15), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f49829y;
        if (textView != null) {
            if (this.P.f45701f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(org.telegram.messenger.g0.F).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f49821c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            org.telegram.messenger.g0.K3(editTextBoldCursor);
        }
        org.telegram.messenger.g0.i3(new eb0(this, 3), fe0.f45691y0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.H = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.P.f45713q0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f49821c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f49821c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        fe0 fe0Var = this.P;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = fe0Var.f45713q0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            fe0Var.f45713q0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.H;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        if (bundle == null) {
            return;
        }
        this.f49821c.setText("");
        this.d.setText("");
        this.E = bundle.getString("phoneFormated");
        this.F = bundle.getString("phoneHash");
        this.G = bundle.getBoolean("fromFirebasePhoneNumberVerification");
        this.H = bundle;
    }

    public final void n() {
        this.f49829y.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(org.telegram.messenger.g0.G).start();
    }

    public final void o(boolean z9) {
        yc ycVar = this.f49824n;
        if (ycVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f49826s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f49826s = null;
        }
        zc zcVar = this.f49825r;
        if (z9) {
            this.f49826s = new AnimatorSet();
            ycVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f49826s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(ycVar, property, 1.0f), ObjectAnimator.ofFloat(zcVar, property, 0.0f));
            this.f49826s.setDuration(180L);
            this.f49826s.addListener(new g30(this, 4));
            this.f49826s.start();
            return;
        }
        ycVar.setAlpha(1.0f);
        ycVar.setVisibility(0);
        zcVar.setAlpha(0.0f);
        zcVar.setVisibility(4);
    }

    public final void p(boolean z9) {
        fe0 fe0Var = this.P;
        if (fe0Var.f45713q0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fe0Var.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131744198, "TermsOfService");
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        if (z9) {
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754717, "Accept"), new lc0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751604, "Decline"), new lc0(this, 2));
        } else {
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, "OK"), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fe0Var.f45713q0.text);
        org.telegram.messenger.ij.b(spannableStringBuilder, fe0Var.f45713q0.entities, false, false, false, false, 0);
        u1Var.T = spannableStringBuilder;
        fe0Var.showDialog(u1Var);
    }

    @Override
    public final void updateColors() {
        this.f49823f.invalidateSelf();
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        this.D.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.m6.D6;
        this.f49827w.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor = this.f49821c;
        editTextBoldCursor.setTextColor(x02);
        int i11 = org.telegram.ui.ActionBar.m6.f28037l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(x03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        this.f49828x.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28130q6, false));
        int x04 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        TextView textView = this.f49829y;
        textView.setTextColor(x04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.J6, false));
        this.f49819a.f();
        this.f49820b.f();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void H(float f10) {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void O(boolean z9, boolean z10) {
    }
}
