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
public final class zj0 extends org.telegram.ui.Components.yt0 implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.b6 {
    public static final int R = 0;
    public int D;
    public int E;
    public double F;
    public double G;
    public boolean H;
    public boolean I;
    public boolean J;
    public String K;
    public final int L;
    public int M;
    public String N;
    public int O;
    public int P;
    public final dk0 Q;
    public String f52575a;
    public String f52576b;
    public final LinearLayout f52577c;
    public EditTextBoldCursor[] d;
    public final TextView f52578e;
    public final TextView f52579f;
    public final ImageView h;
    public final ob0 f52580n;
    public final ob0 f52581r;
    public final ak0 f52582s;
    public Timer f52583w;
    public Timer f52584x;
    public final Object f52585y;

    public zj0(dk0 dk0Var, Context context, int i7) {
        super(context);
        int i10;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.Q = dk0Var;
        this.f52585y = new Object();
        this.D = 60000;
        this.E = 15000;
        this.K = "";
        this.N = "*";
        this.L = i7;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f52578e = textView;
        int i17 = org.telegram.ui.ActionBar.l6.D6;
        org.telegram.ui.ActionBar.s6.U(textView, i17, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f52579f = textView2;
        int i18 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.messenger.k5.n(textView2, i18, null, 1, 18.0f);
        if (org.telegram.messenger.id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setGravity(i10);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i7 == 3) {
            if (org.telegram.messenger.id.f23157a0) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            textView.setGravity(i13 | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            if (org.telegram.messenger.id.f23157a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            addView(frameLayout, c8.ha.r(-2, -2, i14));
            ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131232518);
            boolean z9 = org.telegram.messenger.id.f23157a0;
            if (z9) {
                f10 = 2.0f;
                frameLayout.addView(e10, c8.ha.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                if (org.telegram.messenger.id.f23157a0) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, i16, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                f10 = 2.0f;
                if (z9) {
                    i15 = 5;
                } else {
                    i15 = 3;
                }
                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, i15, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(e10, c8.ha.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            f10 = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, c8.ha.r(-2, -2, 49));
            if (i7 == 1) {
                ImageView e11 = org.telegram.messenger.camera.q.e(context, 2131232747);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.s6.s(e11, i18, null, mode);
                frameLayout2.addView(e11, c8.ha.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                this.h = imageView;
                imageView.setImageResource(2131232745);
                org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.P9, null, mode);
                frameLayout2.addView(imageView, c8.ha.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.id.M0(2131745572, null));
            } else {
                ImageView imageView2 = new ImageView(context);
                this.h = imageView2;
                imageView2.setImageResource(2131232746);
                org.telegram.ui.ActionBar.s6.s(imageView2, org.telegram.ui.ActionBar.l6.P9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView2, c8.ha.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(org.telegram.messenger.id.M0(2131745566, null));
            }
            addView(textView2, c8.ha.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, c8.ha.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.f52577c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.r(-2, 36, 1));
        if (i7 == 3) {
            linearLayout.setVisibility(8);
        }
        ob0 ob0Var = new ob0(context, 2);
        this.f52580n = ob0Var;
        org.telegram.ui.ActionBar.s6.U(ob0Var, i17, null);
        ob0Var.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        if (i7 == 3) {
            ob0Var.setTextSize(1, 14.0f);
            if (org.telegram.messenger.id.f23157a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(ob0Var, c8.ha.r(-2, -2, i11));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f43714a = paint;
            Paint paint2 = new Paint();
            view.f43715b = paint2;
            paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ui, false));
            paint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Vi, false));
            this.f52582s = view;
            if (org.telegram.messenger.id.f23157a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            ob0Var.setGravity(i12);
            addView((View) view, c8.ha.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            ob0Var.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
            ob0Var.setTextSize(1, 15.0f);
            ob0Var.setGravity(49);
            addView(ob0Var, c8.ha.r(-2, -2, 49));
        }
        ob0 ob0Var2 = new ob0(context, 3);
        this.f52581r = ob0Var2;
        org.telegram.ui.ActionBar.s6.U(ob0Var2, org.telegram.ui.ActionBar.l6.f28105q6, null);
        ob0Var2.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
        ob0Var2.setPadding(0, org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(10.0f));
        ob0Var2.setTextSize(1, 15.0f);
        ob0Var2.setGravity(49);
        if (i7 == 1) {
            ob0Var2.setText(org.telegram.messenger.id.M0(2131751443, null));
        } else {
            ob0Var2.setText(org.telegram.messenger.id.M0(2131751449, null));
        }
        addView(ob0Var2, c8.ha.r(-2, -2, 49));
        ob0Var2.setOnClickListener(new i40(this, 17));
    }

    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i7 < editTextBoldCursorArr.length) {
                sb2.append(pf.b.d(editTextBoldCursorArr[i7].getText().toString(), false));
                i7++;
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
    public final boolean c(boolean z9) {
        int i7;
        dk0 dk0Var = this.Q;
        if (!z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dk0Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131744823, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), null);
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131744841, null), new vj0(this, 1));
            dk0Var.showDialog(u1Var);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.f52575a;
        tL_auth_cancelCode.phone_code_hash = this.f52576b;
        i7 = ((org.telegram.ui.ActionBar.f2) dk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_cancelCode, new di.v5(25), 2);
        r();
        q();
        int i10 = this.L;
        if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25006g4);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25012h4);
        }
        this.I = false;
        return true;
    }

    @Override
    public final void d() {
        this.J = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.I && (editTextBoldCursorArr = this.d) != null) {
            if (i7 == org.telegram.messenger.qs.f25006g4) {
                editTextBoldCursorArr[0].setText("" + objArr[0]);
                h(null);
            } else if (i7 == org.telegram.messenger.qs.f25012h4) {
                String str = "" + objArr[0];
                if (org.telegram.messenger.g0.x(this.N, str)) {
                    this.H = true;
                    this.d[0].setText(str);
                    this.H = false;
                    h(null);
                }
            }
        }
    }

    @Override
    public final void f() {
        int i7 = this.L;
        if (i7 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25006g4);
        } else if (i7 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25012h4);
        }
        this.I = false;
        r();
        q();
    }

    @Override
    public final void h(String str) {
        int i7;
        if (this.J) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            org.telegram.messenger.g0.F3(this.f52577c);
            return;
        }
        this.J = true;
        int i10 = this.L;
        if (i10 == 2) {
            org.telegram.messenger.g0.E3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25006g4);
        } else if (i10 == 3) {
            org.telegram.messenger.g0.D3(false);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25012h4);
        }
        this.I = false;
        dk0 dk0Var = this.Q;
        dk0Var.R1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.f52575a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.f52576b;
        r();
        dk0Var.C1();
        i7 = ((org.telegram.ui.ActionBar.f2) dk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(verifyphone, new j50(14, this, verifyphone), 2);
    }

    @Override
    public final void j() {
        LinearLayout linearLayout = this.f52577c;
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
    public final void m(Bundle bundle, boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (bundle != null) {
            this.I = true;
            int i17 = this.L;
            if (i17 == 2) {
                org.telegram.messenger.g0.E3(true);
                org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.f25006g4);
            } else if (i17 == 3) {
                org.telegram.messenger.g0.D3(true);
                org.telegram.messenger.qs.e().b(this, org.telegram.messenger.qs.f25012h4);
            }
            this.f52575a = bundle.getString("phone");
            this.f52576b = bundle.getString("phoneHash");
            int i18 = bundle.getInt("timeout");
            this.D = i18;
            this.P = i18;
            this.M = bundle.getInt("nextType");
            this.N = bundle.getString("pattern");
            int i19 = bundle.getInt("length");
            this.O = i19;
            if (i19 == 0) {
                this.O = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            CharSequence charSequence = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == this.O) {
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
                this.d = new EditTextBoldCursor[this.O];
                for (final int i21 = 0; i21 < this.O; i21++) {
                    this.d[i21] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.d[i21];
                    int i22 = org.telegram.ui.ActionBar.l6.G6;
                    org.telegram.ui.ActionBar.s6.U(editTextBoldCursor, i22, null);
                    org.telegram.ui.ActionBar.s6.v(this.d[i21], i22, null);
                    this.d[i21].setCursorSize(org.telegram.messenger.g0.L(20.0f));
                    this.d[i21].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(2131232684).mutate();
                    org.telegram.ui.ActionBar.s6.x(this, mutate, org.telegram.ui.ActionBar.l6.f28012l6, null, PorterDuff.Mode.MULTIPLY);
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
                    if (i21 != this.O - 1) {
                        i7 = 7;
                    } else {
                        i7 = 0;
                    }
                    this.f52577c.addView(editTextBoldCursor2, c8.ha.t(34, 36, 1, 0, 0, i7, 0));
                    this.d[i21].addTextChangedListener(new xj0(this, i21));
                    this.d[i21].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i23, KeyEvent keyEvent) {
                            zj0 zj0Var = zj0.this;
                            if (i23 == 67) {
                                EditTextBoldCursor[] editTextBoldCursorArr3 = zj0Var.d;
                                int i24 = i21;
                                if (editTextBoldCursorArr3[i24].length() == 0 && i24 > 0) {
                                    int i25 = i24 - 1;
                                    EditTextBoldCursor editTextBoldCursor3 = zj0Var.d[i25];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    zj0Var.d[i25].requestFocus();
                                    zj0Var.d[i25].dispatchKeyEvent(keyEvent);
                                    return true;
                                }
                                return false;
                            }
                            zj0Var.getClass();
                            return false;
                        }
                    });
                    this.d[i21].setOnEditorActionListener(new fa(this, 9));
                }
            }
            ak0 ak0Var = this.f52582s;
            if (ak0Var != null) {
                if (this.M != 0) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                ak0Var.setVisibility(i16);
            }
            if (this.f52575a == null) {
                return;
            }
            String i23 = org.telegram.messenger.k5.i(new StringBuilder("+"), this.f52575a, pf.b.c());
            if (i17 == 2) {
                charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SentSmsCode", null, 2131745567, org.telegram.messenger.id.a(i23)));
            } else if (i17 == 3) {
                charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SentCallCode", null, 2131745570, org.telegram.messenger.id.a(i23)));
            } else if (i17 == 4) {
                charSequence = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("SentCallOnly", null, 2131745569, org.telegram.messenger.id.a(i23)));
            }
            this.f52578e.setText(charSequence);
            if (i17 != 3) {
                org.telegram.messenger.g0.K3(this.d[0]);
                this.d[0].requestFocus();
            } else {
                org.telegram.messenger.g0.v1(this.d[0]);
            }
            r();
            q();
            this.F = System.currentTimeMillis();
            ob0 ob0Var = this.f52581r;
            ob0 ob0Var2 = this.f52580n;
            if (i17 == 3) {
                int i24 = this.M;
                i10 = 2;
                if (i24 == 4 || i24 == 2) {
                    ob0Var.setVisibility(8);
                    ob0Var2.setVisibility(0);
                    int i25 = this.M;
                    if (i25 == 4) {
                        ob0Var2.setText(org.telegram.messenger.id.a0("CallText", null, 2131752601, 1, 0));
                    } else if (i25 == 2) {
                        ob0Var2.setText(org.telegram.messenger.id.a0("SmsText", null, 2131745295, 1, 0));
                    }
                    p();
                    return;
                }
            } else {
                i10 = 2;
            }
            if (i17 == i10) {
                int i26 = this.M;
                i11 = 0;
                if (i26 == 4 || i26 == 3) {
                    Object[] objArr = new Object[i10];
                    objArr[0] = 2;
                    objArr[1] = 0;
                    ob0Var2.setText(org.telegram.messenger.id.a0("CallText", null, 2131752601, objArr));
                    if (this.D < 1000) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    ob0Var.setVisibility(i14);
                    if (this.D < 1000) {
                        i15 = 8;
                    } else {
                        i15 = 0;
                    }
                    ob0Var2.setVisibility(i15);
                    p();
                    return;
                }
            } else {
                i11 = 0;
            }
            if (i17 == 4 && this.M == 2) {
                Object[] objArr2 = new Object[2];
                objArr2[i11] = 2;
                objArr2[1] = 0;
                ob0Var2.setText(org.telegram.messenger.id.a0("SmsText", null, 2131745295, objArr2));
                if (this.D < 1000) {
                    i12 = i11;
                } else {
                    i12 = 8;
                }
                ob0Var.setVisibility(i12);
                if (this.D < 1000) {
                    i13 = 8;
                } else {
                    i13 = i11;
                }
                ob0Var2.setVisibility(i13);
                p();
                return;
            }
            ob0Var2.setVisibility(8);
            ob0Var.setVisibility(8);
            o();
        }
    }

    public final void o() {
        if (this.f52584x != null) {
            return;
        }
        this.E = 15000;
        this.f52584x = new Timer();
        this.G = System.currentTimeMillis();
        this.f52584x.schedule(new fi.h2(this, 4), 0L, 1000L);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.L != 3 && this.h != null) {
            int bottom = this.f52578e.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            ob0 ob0Var = this.f52581r;
            if (ob0Var.getVisibility() == 0) {
                int measuredHeight2 = ob0Var.getMeasuredHeight();
                i13 = (measuredHeight + bottom) - measuredHeight2;
                ob0Var.layout(ob0Var.getLeft(), i13, ob0Var.getRight(), measuredHeight2 + i13);
            } else {
                ob0 ob0Var2 = this.f52580n;
                if (ob0Var2.getVisibility() == 0) {
                    int measuredHeight3 = ob0Var2.getMeasuredHeight();
                    i13 = (measuredHeight + bottom) - measuredHeight3;
                    ob0Var2.layout(ob0Var2.getLeft(), i13, ob0Var2.getRight(), measuredHeight3 + i13);
                } else {
                    i13 = measuredHeight + bottom;
                }
            }
            LinearLayout linearLayout = this.f52577c;
            int measuredHeight4 = linearLayout.getMeasuredHeight();
            int D = jg.g.D(i13 - bottom, measuredHeight4, 2, bottom);
            linearLayout.layout(linearLayout.getLeft(), D, linearLayout.getRight(), measuredHeight4 + D);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ImageView imageView;
        super.onMeasure(i7, i10);
        if (this.L != 3 && (imageView = this.h) != null) {
            int L = org.telegram.messenger.g0.L(35.0f) + this.f52578e.getMeasuredHeight() + this.f52579f.getMeasuredHeight() + imageView.getMeasuredHeight();
            int L2 = org.telegram.messenger.g0.L(80.0f);
            int L3 = org.telegram.messenger.g0.L(291.0f);
            dk0 dk0Var = this.Q;
            if (dk0Var.f45032s0 - L < L2) {
                setMeasuredDimension(getMeasuredWidth(), L + L2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(dk0Var.f45032s0, L3));
            }
        }
    }

    public final void p() {
        if (this.f52583w != null) {
            return;
        }
        Timer timer = new Timer();
        this.f52583w = timer;
        timer.schedule(new yj0(this), 0L, 1000L);
    }

    public final void q() {
        try {
            synchronized (this.f52585y) {
                Timer timer = this.f52584x;
                if (timer != null) {
                    timer.cancel();
                    this.f52584x = null;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void r() {
        try {
            synchronized (this.f52585y) {
                Timer timer = this.f52583w;
                if (timer != null) {
                    timer.cancel();
                    this.f52583w = null;
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s() {
        int i7;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f52575a);
        this.J = true;
        dk0 dk0Var = this.Q;
        dk0Var.C1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.f52575a;
        tL_auth_resendCode.phone_code_hash = this.f52576b;
        i7 = ((org.telegram.ui.ActionBar.f2) dk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_resendCode, new z9(this, bundle, tL_auth_resendCode, 27), 2);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null) {
                int i7 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.d;
                    if (i7 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                        if (editTextBoldCursor != null) {
                            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
                        }
                        i7++;
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
