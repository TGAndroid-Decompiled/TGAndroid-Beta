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
public final class wd0 extends org.telegram.ui.Components.zu0 implements org.telegram.ui.Components.a40 {
    public final TextView D;
    public String E;
    public String F;
    public Bundle G;
    public boolean H;
    public final org.telegram.ui.Components.bi0 I;
    public final org.telegram.ui.Components.bi0 J;
    public boolean K;
    public final org.telegram.ui.Components.b40 L;
    public TLRPC.FileLocation M;
    public TLRPC.FileLocation N;
    public final hf0 O;
    public final org.telegram.ui.Components.ec0 f42942a;
    public final org.telegram.ui.Components.ec0 f42943b;
    public final EditTextBoldCursor f42944c;
    public final EditTextBoldCursor d;
    public final ag.d2 e;
    public final org.telegram.ui.Components.r8 f42945f;
    public final kg.f0 h;
    public final hd f42946n;
    public final id f42947r;
    public AnimatorSet f42948s;
    public final TextView f42949w;
    public final TextView f42950x;
    public final TextView f42951y;

    public wd0(hf0 hf0Var, Context context) {
        super(context);
        int i10;
        float f7;
        this.O = hf0Var;
        this.H = false;
        this.K = true;
        setOrientation(1);
        org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, false, false);
        this.L = b40Var;
        b40Var.H = true;
        b40Var.J = false;
        b40Var.G = false;
        b40Var.K = false;
        b40Var.f24523a = hf0Var;
        b40Var.f24524b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.b6.r(78, 78, 1));
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.f42945f = r8Var;
        ag.d2 d2Var = new ag.d2(this, context, 9);
        this.e = d2Var;
        d2Var.setRoundRadius(org.telegram.messenger.i0.L(64.0f));
        r8Var.g(13);
        r8Var.k(5L, null, null, null);
        d2Var.setImageDrawable(r8Var);
        frameLayout.addView(d2Var, w7.b6.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        kg.f0 f0Var = new kg.f0(this, context, paint, 13);
        this.h = f0Var;
        frameLayout.addView(f0Var, w7.b6.c(-1.0f, -1));
        f0Var.setOnClickListener(new View.OnClickListener(this) {
            public final wd0 f41205b;

            {
                this.f41205b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        wd0 wd0Var = this.f41205b;
                        hd hdVar = wd0Var.f42946n;
                        org.telegram.ui.Components.bi0 bi0Var = wd0Var.I;
                        org.telegram.ui.Components.b40 b40Var2 = wd0Var.L;
                        if (wd0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b40Var2.n(z10, new kc0(wd0Var, 1), new q5(wd0Var, 8), 0);
                        wd0Var.K = false;
                        hdVar.setAnimation(bi0Var);
                        bi0Var.M(0);
                        bi0Var.P(43);
                        hdVar.d();
                        return;
                    default:
                        wd0 wd0Var2 = this.f41205b;
                        if (wd0Var2.O.V.getTag() == null) {
                            wd0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(2131623959, org.telegram.messenger.i0.L(70.0f), org.telegram.messenger.i0.L(70.0f), false, null);
        this.I = bi0Var;
        this.J = new org.telegram.ui.Components.bi0(2131623967, org.telegram.messenger.i0.L(70.0f), org.telegram.messenger.i0.L(70.0f), false, null);
        hd hdVar = new hd(this, context, 4);
        this.f42946n = hdVar;
        hdVar.setScaleType(ImageView.ScaleType.CENTER);
        hdVar.setAnimation(bi0Var);
        hdVar.setEnabled(false);
        hdVar.setClickable(false);
        frameLayout.addView(hdVar, w7.b6.c(-1.0f, -1));
        hdVar.addOnAttachStateChangeListener(new vd0(this));
        id idVar = new id(this, context, 2);
        this.f42947r = idVar;
        idVar.setSize(org.telegram.messenger.i0.L(30.0f));
        idVar.setProgressColor(-1);
        frameLayout.addView(idVar, w7.b6.c(-1.0f, -1));
        o(false);
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setText(org.telegram.messenger.cd.L0(2131746353, null));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, w7.b6.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.f42949w = textView2;
        textView2.setText(org.telegram.messenger.cd.L0(2131746354, "RegisterText2"));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView2, w7.b6.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, w7.b6.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context, null);
        this.f42942a = ec0Var;
        ec0Var.setText(org.telegram.messenger.cd.L0(2131750695, null));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f42944c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final wd0 f41480b;

            {
                this.f41480b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.ec0 ec0Var2 = this.f41480b.f42942a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ec0Var2.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.ec0 ec0Var3 = this.f41480b.f42943b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        ec0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        ec0Var.e(editTextBoldCursor);
        ec0Var.addView(editTextBoldCursor, w7.b6.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final wd0 f41817b;

            {
                this.f41817b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        wd0 wd0Var = this.f41817b;
                        if (i11 == 5) {
                            wd0Var.d.requestFocus();
                            return true;
                        }
                        wd0Var.getClass();
                        return false;
                    default:
                        wd0 wd0Var2 = this.f41817b;
                        wd0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        wd0Var2.h(null);
                        return true;
                }
            }
        });
        org.telegram.ui.Components.ec0 ec0Var2 = new org.telegram.ui.Components.ec0(context, null);
        this.f42943b = ec0Var2;
        ec0Var2.setText(org.telegram.messenger.cd.L0(2131749042, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final wd0 f41480b;

            {
                this.f41480b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z10) {
                float f10;
                float f11;
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.ec0 ec0Var22 = this.f41480b.f42942a;
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        ec0Var22.b(f10, f10, true);
                        return;
                    default:
                        org.telegram.ui.Components.ec0 ec0Var3 = this.f41480b.f42943b;
                        if (z10) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        ec0Var3.b(f11, f11, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        ec0Var2.e(editTextBoldCursor2);
        ec0Var2.addView(editTextBoldCursor2, w7.b6.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final wd0 f41817b;

            {
                this.f41817b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i11, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        wd0 wd0Var = this.f41817b;
                        if (i11 == 5) {
                            wd0Var.d.requestFocus();
                            return true;
                        }
                        wd0Var.getClass();
                        return false;
                    default:
                        wd0 wd0Var2 = this.f41817b;
                        wd0Var2.getClass();
                        if (i11 != 6 && i11 != 5) {
                            return false;
                        }
                        wd0Var2.h(null);
                        return true;
                }
            }
        });
        boolean O1 = org.telegram.messenger.i0.O1();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (O1) {
            LinearLayout linearLayout = new LinearLayout(hf0Var.getParentActivity());
            linearLayout.setOrientation(0);
            ec0Var.setText(org.telegram.messenger.cd.L0(2131750694, null));
            ec0Var2.setText(org.telegram.messenger.cd.L0(2131749041, null));
            linearLayout.addView(ec0Var, w7.b6.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(ec0Var2, w7.b6.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor2);
            }
        } else {
            ec0Var.setText(org.telegram.messenger.cd.L0(2131750695, null));
            ec0Var2.setText(org.telegram.messenger.cd.L0(2131749042, null));
            frameLayout2.addView(ec0Var, w7.b6.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(ec0Var2, w7.b6.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.f42950x = textView3;
        textView3.setText(org.telegram.messenger.cd.L0(2131752572, "CancelRegistration"));
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView3.setGravity(i10 | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView3.setPadding(0, org.telegram.messenger.i0.L(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, w7.b6.t(-2, -2, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final wd0 f41205b;

            {
                this.f41205b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        wd0 wd0Var = this.f41205b;
                        hd hdVar2 = wd0Var.f42946n;
                        org.telegram.ui.Components.bi0 bi0Var2 = wd0Var.I;
                        org.telegram.ui.Components.b40 b40Var2 = wd0Var.L;
                        if (wd0Var.M != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b40Var2.n(z10, new kc0(wd0Var, 1), new q5(wd0Var, 8), 0);
                        wd0Var.K = false;
                        hdVar2.setAnimation(bi0Var2);
                        bi0Var2.M(0);
                        bi0Var2.P(43);
                        hdVar2.d();
                        return;
                    default:
                        wd0 wd0Var2 = this.f41205b;
                        if (wd0Var2.O.V.getTag() == null) {
                            wd0Var2.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, w7.b6.r(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.f42951y = textView4;
        textView4.setMovementMethod(new org.telegram.messenger.e0(false));
        if (org.telegram.messenger.i0.O1()) {
            f7 = 13.0f;
        } else {
            f7 = 14.0f;
        }
        textView4.setTextSize(1, f7);
        textView4.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, w7.b6.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        li.k.i(textView4);
        String L0 = org.telegram.messenger.cd.L0(2131744222, "TermsOfServiceLogin");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
        int indexOf = L0.indexOf(42);
        int lastIndexOf = L0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new dh.a(this, 9), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new qd0(this, photoSize2, photoSize, 1));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        hf0 hf0Var = this.O;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131742974, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131754080, "AreYouSureRegistration");
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131744859, "Stop"), new pd0(this, 0));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, "Continue"), null);
            hf0Var.showDialog(x1Var);
            return false;
        }
        hf0Var.s1(true, true);
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
    public gs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131742835, "YourName");
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
        hf0 hf0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = hf0Var.f37938q0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            p(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f42944c;
        if (editTextBoldCursor.length() == 0) {
            hf0.a1(hf0Var, this.f42942a, true);
            return;
        }
        this.H = true;
        TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
        tL_auth_signUp.phone_code_hash = this.F;
        tL_auth_signUp.phone_number = this.E;
        tL_auth_signUp.first_name = editTextBoldCursor.getText().toString();
        tL_auth_signUp.last_name = this.d.getText().toString();
        hf0Var.v1(0, true);
        i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signUp, new k(this, 12), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.f42951y;
        if (textView != null) {
            if (this.O.f37926f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(org.telegram.messenger.i0.F).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.f42944c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            org.telegram.messenger.i0.J3(editTextBoldCursor);
        }
        org.telegram.messenger.i0.h3(new kc0(this, 3), hf0.f37917y0);
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
                this.O.f37938q0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.f42944c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f42944c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        hf0 hf0Var = this.O;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = hf0Var.f37938q0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            hf0Var.f37938q0.serializeToStream(serializedData);
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
        this.f42944c.setText("");
        this.d.setText("");
        this.E = bundle.getString("phoneFormated");
        this.F = bundle.getString("phoneHash");
        this.G = bundle;
    }

    public final void n() {
        this.f42951y.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(org.telegram.messenger.i0.G).start();
    }

    public final void o(boolean z10) {
        hd hdVar = this.f42946n;
        if (hdVar == null) {
            return;
        }
        AnimatorSet animatorSet = this.f42948s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f42948s = null;
        }
        id idVar = this.f42947r;
        if (z10) {
            this.f42948s = new AnimatorSet();
            hdVar.setVisibility(0);
            AnimatorSet animatorSet2 = this.f42948s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(hdVar, property, 1.0f), ObjectAnimator.ofFloat(idVar, property, 0.0f));
            this.f42948s.setDuration(180L);
            this.f42948s.addListener(new org.telegram.ui.Components.voip.h2(this, 15));
            this.f42948s.start();
            return;
        }
        hdVar.setAlpha(1.0f);
        hdVar.setVisibility(0);
        idVar.setAlpha(0.0f);
        idVar.setVisibility(4);
    }

    public final void p(boolean z10) {
        hf0 hf0Var = this.O;
        if (hf0Var.f37938q0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131744223, "TermsOfService");
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        if (z10) {
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754717, "Accept"), new pd0(this, 1));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751605, "Decline"), new pd0(this, 2));
        } else {
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, "OK"), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hf0Var.f37938q0.text);
        org.telegram.messenger.jj.b(spannableStringBuilder, hf0Var.f37938q0.entities, false, false, false, false, 0);
        x1Var.T = spannableStringBuilder;
        hf0Var.showDialog(x1Var);
    }

    @Override
    public final void updateColors() {
        this.f42945f.invalidateSelf();
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        this.D.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.t6.D6;
        this.f42949w.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor = this.f42944c;
        editTextBoldCursor.setTextColor(x02);
        int i12 = org.telegram.ui.ActionBar.t6.f21076l6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(x03);
        editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        this.f42950x.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        int x04 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        TextView textView = this.f42951y;
        textView.setTextColor(x04);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
        this.f42942a.f();
        this.f42943b.f();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void H(float f7) {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void O(boolean z10, boolean z11) {
    }
}
