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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uj0 extends org.telegram.ui.Components.vt0 implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public static final int S = 0;
    public int E;
    public int F;
    public double G;
    public double H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public final int M;
    public int N;
    public String O;
    public int P;
    public int Q;
    public final yj0 R;
    public String f50100a;
    public String f50101b;
    public final LinearLayout f50102c;
    public EditTextBoldCursor[] d;
    public final TextView f50103e;
    public final TextView f50104f;
    public final ImageView h;
    public final jb0 f50105n;
    public final jb0 f50106r;
    public final vj0 f50107s;
    public Timer f50108w;
    public Timer f50109x;
    public final Object f50110y;

    public uj0(yj0 yj0Var, Context context, int i3) {
        super(context);
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.R = yj0Var;
        this.f50110y = new Object();
        this.E = 60000;
        this.F = 15000;
        this.L = "";
        this.O = "*";
        this.M = i3;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f50103e = textView;
        int i17 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.V(textView, i17, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f50104f = textView2;
        int i18 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.messenger.k5.n(textView2, i18, null, 1, 18.0f);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setGravity(i10);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i3 == 3) {
            if (org.telegram.messenger.bd.f21784a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView.setGravity(i13 | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            if (org.telegram.messenger.bd.f21784a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            addView(frameLayout, b8.mf.r(-2, -2, i14));
            ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232518);
            boolean z10 = org.telegram.messenger.bd.f21784a0;
            if (z10) {
                f10 = 2.0f;
                frameLayout.addView(e10, b8.mf.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                if (org.telegram.messenger.bd.f21784a0) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout.addView(textView, b8.mf.d(-1, -2.0f, i16, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                f10 = 2.0f;
                if (z10) {
                    i15 = 5;
                } else {
                    i15 = 3;
                }
                frameLayout.addView(textView, b8.mf.d(-1, -2.0f, i15, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(e10, b8.mf.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            f10 = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, b8.mf.r(-2, -2, 49));
            if (i3 == 1) {
                ImageView e11 = org.telegram.messenger.camera.q.e(context, 2131232745);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.r6.t(e11, i18, null, mode);
                frameLayout2.addView(e11, b8.mf.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                this.h = imageView;
                imageView.setImageResource(2131232743);
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.P9, null, mode);
                frameLayout2.addView(imageView, b8.mf.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.bd.M0(2131745582, null));
            } else {
                ImageView imageView2 = new ImageView(context);
                this.h = imageView2;
                imageView2.setImageResource(2131232744);
                org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.P9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView2, b8.mf.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.bd.M0(2131745576, null));
            }
            addView(textView2, b8.mf.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, b8.mf.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f50102c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, b8.mf.r(-2, 36, 1));
        if (i3 == 3) {
            linearLayout.setVisibility(8);
        }
        jb0 jb0Var = new jb0(context, 2);
        this.f50105n = jb0Var;
        org.telegram.ui.ActionBar.r6.V(jb0Var, i17, null);
        jb0Var.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        if (i3 == 3) {
            jb0Var.setTextSize(1, 14.0f);
            if (org.telegram.messenger.bd.f21784a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(jb0Var, b8.mf.r(-2, -2, i11));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f50543a = paint;
            Paint paint2 = new Paint();
            view.f50544b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ui, false));
            paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vi, false));
            this.f50107s = view;
            if (org.telegram.messenger.bd.f21784a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            jb0Var.setGravity(i12);
            addView((View) view, b8.mf.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            jb0Var.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
            jb0Var.setTextSize(1, 15.0f);
            jb0Var.setGravity(49);
            addView(jb0Var, b8.mf.r(-2, -2, 49));
        }
        jb0 jb0Var2 = new jb0(context, 3);
        this.f50106r = jb0Var2;
        org.telegram.ui.ActionBar.r6.V(jb0Var2, org.telegram.ui.ActionBar.k6.f28121q6, null);
        jb0Var2.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        jb0Var2.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
        jb0Var2.setTextSize(1, 15.0f);
        jb0Var2.setGravity(49);
        if (i3 == 1) {
            jb0Var2.setText(org.telegram.messenger.bd.M0(2131751444, null));
        } else {
            jb0Var2.setText(org.telegram.messenger.bd.M0(2131751450, null));
        }
        addView(jb0Var2, b8.mf.r(-2, -2, 49));
        jb0Var2.setOnClickListener(new b40(this, 17));
    }

    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i3 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i3 < editTextBoldCursorArr.length) {
                sb2.append(mf.b.d(editTextBoldCursorArr[i3].getText().toString(), false));
                i3++;
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
        int i3;
        yj0 yj0Var = this.R;
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yj0Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131689472, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131744833, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), null);
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131744851, null), new qj0(this, 1));
            yj0Var.showDialog(s1Var);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.f50100a;
        tL_auth_cancelCode.phone_code_hash = this.f50101b;
        i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_cancelCode, new ei.u5(25), 2);
        r();
        q();
        int i10 = this.M;
        if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23235g4);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23241h4);
        }
        this.J = false;
        return true;
    }

    @Override
    public final void d() {
        this.K = false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.J && (editTextBoldCursorArr = this.d) != null) {
            if (i3 == org.telegram.messenger.hs.f23235g4) {
                editTextBoldCursorArr[0].setText("" + objArr[0]);
                h(null);
            } else if (i3 == org.telegram.messenger.hs.f23241h4) {
                String str = "" + objArr[0];
                if (org.telegram.messenger.g0.x(this.O, str)) {
                    this.I = true;
                    this.d[0].setText(str);
                    this.I = false;
                    h(null);
                }
            }
        }
    }

    @Override
    public final void f() {
        int i3 = this.M;
        if (i3 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23235g4);
        } else if (i3 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23241h4);
        }
        this.J = false;
        r();
        q();
    }

    @Override
    public final void h(String str) {
        int i3;
        if (this.K) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            org.telegram.messenger.g0.F3(this.f50102c);
            return;
        }
        this.K = true;
        int i10 = this.M;
        if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23235g4);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23241h4);
        }
        this.J = false;
        yj0 yj0Var = this.R;
        yj0Var.R1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.f50100a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.f50101b;
        r();
        yj0Var.C1();
        i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(verifyphone, new xy(17, this, verifyphone), 2);
    }

    @Override
    public final void j() {
        LinearLayout linearLayout = this.f50102c;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            for (int length = this.d.length - 1; length >= 0; length--) {
                if (length == 0 || this.d[length].length() != 0) {
                    this.d[length].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = this.d[length];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.g0.K3(this.d[length]);
                    return;
                }
            }
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (bundle != null) {
            this.J = true;
            int i17 = this.M;
            if (i17 == 2) {
                org.telegram.messenger.g0.E3(true);
                org.telegram.messenger.hs.e().b(this, org.telegram.messenger.hs.f23235g4);
            } else if (i17 == 3) {
                org.telegram.messenger.g0.D3(true);
                org.telegram.messenger.hs.e().b(this, org.telegram.messenger.hs.f23241h4);
            }
            this.f50100a = bundle.getString("phone");
            this.f50101b = bundle.getString("phoneHash");
            int i18 = bundle.getInt("timeout");
            this.E = i18;
            this.Q = i18;
            this.N = bundle.getInt("nextType");
            this.O = bundle.getString("pattern");
            int i19 = bundle.getInt("length");
            this.P = i19;
            if (i19 == 0) {
                this.P = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            CharSequence charSequence = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.P) {
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
                this.d = new EditTextBoldCursor[this.P];
                for (final int i21 = 0; i21 < this.P; i21++) {
                    this.d[i21] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.d[i21];
                    int i22 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i22, null);
                    org.telegram.ui.ActionBar.r6.w(this.d[i21], i22, null);
                    this.d[i21].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    this.d[i21].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(2131232682).mutate();
                    org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.f28026l6, null, PorterDuff.Mode.MULTIPLY);
                    this.d[i21].setBackgroundDrawable(mutate);
                    this.d[i21].setImeOptions(268435461);
                    this.d[i21].setTextSize(1, 20.0f);
                    this.d[i21].setMaxLines(1);
                    this.d[i21].setTypeface(org.telegram.messenger.g0.o());
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
                    if (i21 != this.P - 1) {
                        i3 = 7;
                    } else {
                        i3 = 0;
                    }
                    this.f50102c.addView(editTextBoldCursor2, b8.mf.t(34, 36, 1, 0, 0, i3, 0));
                    this.d[i21].addTextChangedListener(new sj0(this, i21));
                    this.d[i21].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i23, KeyEvent keyEvent) {
                            uj0 uj0Var = uj0.this;
                            if (i23 == 67) {
                                EditTextBoldCursor[] editTextBoldCursorArr3 = uj0Var.d;
                                int i24 = i21;
                                if (editTextBoldCursorArr3[i24].length() == 0 && i24 > 0) {
                                    int i25 = i24 - 1;
                                    EditTextBoldCursor editTextBoldCursor3 = uj0Var.d[i25];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    uj0Var.d[i25].requestFocus();
                                    uj0Var.d[i25].dispatchKeyEvent(keyEvent);
                                    return true;
                                }
                                return false;
                            }
                            uj0Var.getClass();
                            return false;
                        }
                    });
                    this.d[i21].setOnEditorActionListener(new ea(this, 9));
                }
            }
            vj0 vj0Var = this.f50107s;
            if (vj0Var != null) {
                if (this.N != 0) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                vj0Var.setVisibility(i16);
            }
            if (this.f50100a == null) {
                return;
            }
            String i23 = org.telegram.messenger.k5.i(new StringBuilder("+"), this.f50100a, mf.b.c());
            if (i17 == 2) {
                charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SentSmsCode", null, 2131745577, org.telegram.messenger.bd.a(i23)));
            } else if (i17 == 3) {
                charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SentCallCode", null, 2131745580, org.telegram.messenger.bd.a(i23)));
            } else if (i17 == 4) {
                charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SentCallOnly", null, 2131745579, org.telegram.messenger.bd.a(i23)));
            }
            this.f50103e.setText(charSequence);
            if (i17 != 3) {
                org.telegram.messenger.g0.K3(this.d[0]);
                this.d[0].requestFocus();
            } else {
                org.telegram.messenger.g0.v1(this.d[0]);
            }
            r();
            q();
            this.G = System.currentTimeMillis();
            jb0 jb0Var = this.f50106r;
            jb0 jb0Var2 = this.f50105n;
            if (i17 == 3) {
                int i24 = this.N;
                i10 = 2;
                if (i24 == 4 || i24 == 2) {
                    jb0Var.setVisibility(8);
                    jb0Var2.setVisibility(0);
                    int i25 = this.N;
                    if (i25 == 4) {
                        jb0Var2.setText(org.telegram.messenger.bd.a0("CallText", null, 2131752601, 1, 0));
                    } else if (i25 == 2) {
                        jb0Var2.setText(org.telegram.messenger.bd.a0("SmsText", null, 2131745305, 1, 0));
                    }
                    p();
                    return;
                }
            } else {
                i10 = 2;
            }
            if (i17 == i10) {
                int i26 = this.N;
                i11 = 0;
                if (i26 == 4 || i26 == 3) {
                    Object[] objArr = new Object[i10];
                    objArr[0] = 2;
                    objArr[1] = 0;
                    jb0Var2.setText(org.telegram.messenger.bd.a0("CallText", null, 2131752601, objArr));
                    if (this.E < 1000) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    jb0Var.setVisibility(i14);
                    if (this.E < 1000) {
                        i15 = 8;
                    } else {
                        i15 = 0;
                    }
                    jb0Var2.setVisibility(i15);
                    p();
                    return;
                }
            } else {
                i11 = 0;
            }
            if (i17 == 4 && this.N == 2) {
                Object[] objArr2 = new Object[2];
                objArr2[i11] = 2;
                objArr2[1] = 0;
                jb0Var2.setText(org.telegram.messenger.bd.a0("SmsText", null, 2131745305, objArr2));
                if (this.E < 1000) {
                    i12 = i11;
                } else {
                    i12 = 8;
                }
                jb0Var.setVisibility(i12);
                if (this.E < 1000) {
                    i13 = 8;
                } else {
                    i13 = i11;
                }
                jb0Var2.setVisibility(i13);
                p();
                return;
            }
            jb0Var2.setVisibility(8);
            jb0Var.setVisibility(8);
            o();
        }
    }

    public final void o() {
        if (this.f50109x != null) {
            return;
        }
        this.F = 15000;
        this.f50109x = new Timer();
        this.H = System.currentTimeMillis();
        this.f50109x.schedule(new g6.q(this, 5), 0L, 1000L);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.M != 3 && this.h != null) {
            int bottom = this.f50103e.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            jb0 jb0Var = this.f50106r;
            if (jb0Var.getVisibility() == 0) {
                int measuredHeight2 = jb0Var.getMeasuredHeight();
                i13 = (measuredHeight + bottom) - measuredHeight2;
                jb0Var.layout(jb0Var.getLeft(), i13, jb0Var.getRight(), measuredHeight2 + i13);
            } else {
                jb0 jb0Var2 = this.f50105n;
                if (jb0Var2.getVisibility() == 0) {
                    int measuredHeight3 = jb0Var2.getMeasuredHeight();
                    i13 = (measuredHeight + bottom) - measuredHeight3;
                    jb0Var2.layout(jb0Var2.getLeft(), i13, jb0Var2.getRight(), measuredHeight3 + i13);
                } else {
                    i13 = measuredHeight + bottom;
                }
            }
            LinearLayout linearLayout = this.f50102c;
            int measuredHeight4 = linearLayout.getMeasuredHeight();
            int e10 = k2.p1.e(i13 - bottom, measuredHeight4, 2, bottom);
            linearLayout.layout(linearLayout.getLeft(), e10, linearLayout.getRight(), measuredHeight4 + e10);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        ImageView imageView;
        super.onMeasure(i3, i10);
        if (this.M != 3 && (imageView = this.h) != null) {
            int L = org.telegram.messenger.g0.L(35.0f) + this.f50103e.getMeasuredHeight() + this.f50104f.getMeasuredHeight() + imageView.getMeasuredHeight();
            int L2 = org.telegram.messenger.g0.L(80.0f);
            int L3 = org.telegram.messenger.g0.L(291.0f);
            yj0 yj0Var = this.R;
            if (yj0Var.f52327t0 - L < L2) {
                setMeasuredDimension(getMeasuredWidth(), L + L2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(yj0Var.f52327t0, L3));
            }
        }
    }

    public final void p() {
        if (this.f50108w != null) {
            return;
        }
        Timer timer = new Timer();
        this.f50108w = timer;
        timer.schedule(new tj0(this), 0L, 1000L);
    }

    public final void q() {
        try {
            synchronized (this.f50110y) {
                Timer timer = this.f50109x;
                if (timer != null) {
                    timer.cancel();
                    this.f50109x = null;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void r() {
        try {
            synchronized (this.f50110y) {
                Timer timer = this.f50108w;
                if (timer != null) {
                    timer.cancel();
                    this.f50108w = null;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s() {
        int i3;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f50100a);
        this.K = true;
        yj0 yj0Var = this.R;
        yj0Var.C1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.f50100a;
        tL_auth_resendCode.phone_code_hash = this.f50101b;
        i3 = ((org.telegram.ui.ActionBar.d2) yj0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_resendCode, new y9(this, bundle, tL_auth_resendCode, 27), 2);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null) {
                int i3 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.d;
                    if (i3 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i3];
                        if (editTextBoldCursor != null) {
                            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
