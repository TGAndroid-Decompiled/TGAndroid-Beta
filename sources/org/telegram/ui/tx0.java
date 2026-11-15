package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tx0 extends org.telegram.ui.ActionBar.e2 {
    public float E;
    public float[] F;
    public boolean G;
    public ValueAnimator H;
    public ClipboardManager I;
    public final boolean J;
    public org.telegram.messenger.fz K;
    public boolean L;
    public ClipboardManager.OnPrimaryClipChangedListener M;
    public int N;
    public EditTextBoldCursor[] f51685a;
    public qx0 f51686b;
    public px0 f51687c;
    public LinearLayout d;
    public org.telegram.ui.Cells.x6[] f51688e;
    public org.telegram.ui.Cells.y8[] f51689f;
    public org.telegram.ui.Cells.v9 h;
    public org.telegram.ui.Cells.v9 f51690n;
    public org.telegram.ui.ActionBar.z4 f51691r;
    public org.telegram.ui.Cells.h6[] f51692s;
    public int f51693w;
    public xi.a f51694x;
    public String f51695y;

    public tx0() {
        super(null);
        this.f51688e = new org.telegram.ui.Cells.x6[3];
        this.f51689f = new org.telegram.ui.Cells.y8[2];
        this.f51692s = new org.telegram.ui.Cells.h6[3];
        this.E = 1.0f;
        this.F = new float[2];
        this.G = true;
        this.M = new nx0(this);
        this.K = new org.telegram.messenger.fz(xi.a.f60040i);
        this.J = true;
    }

    public final void Z(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i7;
        if (this.h != null && this.f51691r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f51685a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.f51693w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.f51685a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(xi.i.l(editTextBoldCursor.getText().toString())) || xi.i.f(this.f51685a[4].getText().toString()) == null)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.G != z11) {
                ValueAnimator valueAnimator = this.H;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                } else if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.H = ofFloat;
                    ofFloat.setDuration(200L);
                    this.H.addUpdateListener(new a3(this, 29));
                }
                float f10 = 1.0f;
                if (z10) {
                    float[] fArr = this.F;
                    fArr[0] = this.E;
                    if (!z11) {
                        f10 = 0.0f;
                    }
                    fArr[1] = f10;
                    this.H.start();
                } else {
                    if (!z11) {
                        f10 = 0.0f;
                    }
                    this.E = f10;
                    TextView textView = this.h.getTextView();
                    if (z11) {
                        i7 = org.telegram.ui.ActionBar.j6.f29089q6;
                    } else {
                        i7 = org.telegram.ui.ActionBar.j6.f29260z6;
                    }
                    org.telegram.ui.ActionBar.q6.U(textView, i7, null);
                }
                this.h.setEnabled(z11);
                this.f51691r.a(z11, z10);
                this.G = z11;
            }
        }
    }

    public final void a0(int i7, boolean z10, org.telegram.ui.Components.a2 a2Var) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.h6[] h6VarArr = this.f51692s;
        org.telegram.ui.Cells.y8[] y8VarArr = this.f51689f;
        if (this.f51693w != i7) {
            this.f51693w = i7;
            TransitionManager.endTransitions(this.f51687c);
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.er.f34420f).setDuration(250L);
                if (a2Var != null) {
                    duration.addListener((Transition.TransitionListener) new sx0(a2Var));
                }
                TransitionManager.beginDelayedTransition(this.f51687c, duration);
            }
            int i10 = this.f51693w;
            if (i10 == 1) {
                y8VarArr[0].setVisibility(0);
                y8VarArr[1].setVisibility(8);
                ((View) this.f51685a[4].getParent()).setVisibility(8);
                ((View) this.f51685a[3].getParent()).setVisibility(0);
                ((View) this.f51685a[2].getParent()).setVisibility(0);
                ((View) this.f51685a[1].getParent()).setVisibility(0);
            } else if (i10 == 2) {
                y8VarArr[0].setVisibility(8);
                y8VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.y8 y8Var = y8VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.y0.r(null, 2131743777, sb2, "\n\n");
                sb2.append(org.telegram.messenger.hd.M0(2131743776, null));
                y8Var.setText(sb2.toString());
                ((View) this.f51685a[4].getParent()).setVisibility(0);
                ((View) this.f51685a[3].getParent()).setVisibility(8);
                ((View) this.f51685a[2].getParent()).setVisibility(8);
                ((View) this.f51685a[1].getParent()).setVisibility(0);
            } else if (i10 == 3) {
                y8VarArr[0].setVisibility(8);
                y8VarArr[1].setVisibility(0);
                y8VarArr[1].setText(org.telegram.messenger.hd.M0(2131743772, null));
                ((View) this.f51685a[4].getParent()).setVisibility(0);
                ((View) this.f51685a[3].getParent()).setVisibility(8);
                ((View) this.f51685a[2].getParent()).setVisibility(8);
                ((View) this.f51685a[1].getParent()).setVisibility(8);
                this.f51685a[1].setText("443");
            }
            org.telegram.ui.Cells.h6 h6Var = h6VarArr[0];
            if (this.f51693w == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            h6Var.a(z11, z10);
            org.telegram.ui.Cells.h6 h6Var2 = h6VarArr[1];
            if (this.f51693w == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            h6Var2.a(z12, z10);
            org.telegram.ui.Cells.h6 h6Var3 = h6VarArr[2];
            if (this.f51693w != 3) {
                z13 = false;
            }
            h6Var3.a(z13, z10);
            Z(z10);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28905g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    public final void b0(Context context, String str) {
        org.telegram.ui.Components.og0 og0Var = new org.telegram.ui.Components.og0(context, org.telegram.messenger.hd.M0(2131745448, null), str, org.telegram.messenger.hd.M0(2131746504, null), true);
        og0Var.f37950r1.setImageBitmap(org.telegram.messenger.qz.e(org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.y2(null, 2131624169)));
        showDialog(og0Var);
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tx0.c0():void");
    }

    @Override
    public final View createView(Context context) {
        int i7;
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.y8[] y8VarArr = this.f51689f;
        org.telegram.messenger.fz fzVar = this.K;
        org.telegram.ui.Cells.x6[] x6VarArr = this.f51688e;
        org.telegram.ui.Cells.h6[] h6VarArr = this.f51692s;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746604, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.o4 o4Var = this.parentLayout;
        if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 5));
        this.f51691r = this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f51687c = new org.telegram.ui.Components.km0(context);
        ?? lm0Var = new org.telegram.ui.Components.lm0(context, this.f51687c, this.resourceProvider, true);
        this.f51686b = lm0Var;
        lm0Var.setDrawBackground(true);
        this.f51686b.setFillViewport(true);
        this.f51686b.setOverScrollMode(0);
        org.telegram.messenger.g0.y3(this.f51686b, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29129s8, false));
        int i10 = -1;
        frameLayout.addView(this.f51686b, c8.ja.c(-1.0f, -1));
        this.f51687c.setOrientation(1);
        this.f51686b.addView(this.f51687c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final tx0 f50079b;

            {
                this.f50079b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f50079b.a0(xi.a.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        tx0 tx0Var = this.f50079b;
                        xi.a aVar = tx0Var.f51694x;
                        if (aVar != null) {
                            int i11 = aVar.f60041a;
                            int i12 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = tx0Var.f51685a;
                                if (i12 < editTextBoldCursorArr.length) {
                                    if ((i11 != 1 || i12 != 4) && (i11 != 2 || (i12 != 2 && i12 != 3))) {
                                        if (i12 == 0) {
                                            str = tx0Var.f51694x.f60042b;
                                        } else if (i12 == 1) {
                                            int i13 = tx0Var.f51694x.f60043c;
                                            if (i13 != 0) {
                                                str = Integer.toString(i13);
                                            }
                                            str = null;
                                        } else if (i12 == 2) {
                                            str = tx0Var.f51694x.d;
                                        } else if (i12 == 3) {
                                            str = tx0Var.f51694x.f60044e;
                                        } else {
                                            if (i12 == 4) {
                                                str = tx0Var.f51694x.f60045f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                tx0Var.f51685a[i12].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                tx0Var.f51685a[i12].setText(str);
                                            }
                                        } else {
                                            tx0Var.f51685a[i12].setText((CharSequence) null);
                                        }
                                    }
                                    i12++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    tx0Var.a0(i11, true, new org.telegram.ui.Components.a2(tx0Var, i11, 28));
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                        break;
                }
            }
        };
        int i11 = 0;
        while (i11 < 3) {
            int f11 = xi.a.f(i11);
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
            h6VarArr[i11] = h6Var;
            org.telegram.ui.ActionBar.q6.Q(h6Var, org.telegram.ui.ActionBar.j6.N0(true), org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.f28849d6), org.telegram.ui.ActionBar.q6.M(org.telegram.ui.ActionBar.j6.f28941i6), null);
            h6VarArr[i11].setTag(Integer.valueOf(i11));
            if (i11 == 0) {
                org.telegram.ui.Cells.h6 h6Var2 = h6VarArr[i11];
                String M0 = org.telegram.messenger.hd.M0(2131743782, null);
                if (f11 == this.f51693w) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h6Var2.c(M0, z12, true);
            } else if (i11 == 1) {
                org.telegram.ui.Cells.h6 h6Var3 = h6VarArr[i11];
                String M02 = org.telegram.messenger.hd.M0(2131743779, null);
                if (f11 == this.f51693w) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                h6Var3.c(M02, z11, true);
            } else {
                org.telegram.ui.Cells.h6 h6Var4 = h6VarArr[i11];
                String M03 = org.telegram.messenger.hd.M0(2131743773, null);
                if (f11 == this.f51693w) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h6Var4.c(M03, z10, false);
            }
            this.f51687c.addView(h6VarArr[i11], c8.ja.o(-1, 50));
            h6VarArr[i11].setOnClickListener(onClickListener);
            i11++;
            i10 = -1;
        }
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
        x6VarArr[0] = x6Var;
        this.f51687c.addView(x6Var, c8.ja.o(i10, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(org.telegram.messenger.g0.L(1.0f));
        this.d.setOutlineProvider(null);
        int i12 = -1;
        this.f51687c.addView(this.d, c8.ja.o(-1, -2));
        int i13 = 5;
        this.f51685a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, c8.ja.o(i12, 64));
            this.f51685a[i14] = new EditTextBoldCursor(context);
            this.f51685a[i14].setTag(Integer.valueOf(i14));
            this.f51685a[i14].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.q6.A(this.f51685a[i14], org.telegram.ui.ActionBar.j6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.f51685a[i14];
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.q6.U(editTextBoldCursor, i15, null);
            this.f51685a[i14].setBackground(null);
            org.telegram.ui.ActionBar.q6.v(this.f51685a[i14], i15, null);
            this.f51685a[i14].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.f51685a[i14].setCursorWidth(1.5f);
            this.f51685a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f51685a[i14];
            if (org.telegram.messenger.hd.f24101a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            editTextBoldCursor2.setGravity(i7 | 16);
            org.telegram.ui.ActionBar.q6.z(this.f51685a[i14], org.telegram.ui.ActionBar.j6.L6, null);
            this.f51685a[i14].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.q6.F(this.f51685a[i14], org.telegram.ui.ActionBar.j6.f28978k6, org.telegram.ui.ActionBar.j6.f28996l6, org.telegram.ui.ActionBar.j6.f29070p7, null);
            if (i14 == 0) {
                this.f51685a[i14].setInputType(524305);
                this.f51685a[i14].addTextChangedListener(new rx0(this, 0));
            } else if (i14 == 1) {
                this.f51685a[i14].setInputType(2);
                this.f51685a[i14].addTextChangedListener(new rx0(this, 1));
            } else if (i14 == 3) {
                this.f51685a[i14].setInputType(129);
                this.f51685a[i14].setTypeface(Typeface.DEFAULT);
                this.f51685a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f51685a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f51685a[i14].addTextChangedListener(new rx0(this, 2));
            }
            this.f51685a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f51685a[i14].setHintText(org.telegram.messenger.hd.M0(2131743784, null));
                                this.f51685a[i14].setText(fzVar.f23575a.f60045f);
                            }
                        } else {
                            this.f51685a[i14].setHintText(org.telegram.messenger.hd.M0(2131743787, null));
                            this.f51685a[i14].setText(fzVar.f23575a.f60044e);
                        }
                    } else {
                        this.f51685a[i14].setHintText(org.telegram.messenger.hd.M0(2131743774, null));
                        this.f51685a[i14].setText(fzVar.f23575a.d);
                    }
                } else {
                    this.f51685a[i14].setHintText(org.telegram.messenger.hd.M0(2131743786, null));
                    this.f51685a[i14].setText(Integer.toString(fzVar.f23575a.f60043c));
                }
            } else {
                this.f51685a[i14].setHintText(org.telegram.messenger.hd.M0(2131743791, null));
                this.f51685a[i14].setText(fzVar.f23575a.f60042b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f51685a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f51685a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f51685a[i14];
            if (i14 == 0) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, c8.ja.d(-1, -1.0f, 51, 17.0f, f10, 17.0f, 0.0f));
            this.f51685a[i14].setOnEditorActionListener(new fa(this, 10));
            i14++;
            i13 = 5;
            i12 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8VarArr[i16] = y8Var;
            if (i16 == 0) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131743788, null));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.y0.r(null, 2131743777, sb2, "\n\n");
                sb2.append(org.telegram.messenger.hd.M0(2131743776, null));
                y8Var.setText(sb2.toString());
                y8VarArr[i16].setVisibility(8);
            }
            this.f51687c.addView(y8VarArr[i16], c8.ja.o(-1, -2));
        }
        org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(this.fragmentView.getContext());
        this.f51690n = v9Var;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.j6.N0(true);
        int i17 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i17);
        int i18 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i18);
        v9Var.setBackground(N0);
        org.telegram.ui.ActionBar.q6.j(v9Var, N0, M, M2, null);
        this.f51690n.b(org.telegram.messenger.hd.M0(2131747434, null), false);
        TextView textView = this.f51690n.getTextView();
        int i19 = org.telegram.ui.ActionBar.j6.f29089q6;
        org.telegram.ui.ActionBar.q6.U(textView, i19, null);
        this.f51690n.setOnClickListener(new View.OnClickListener(this) {
            public final tx0 f50079b;

            {
                this.f50079b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f50079b.a0(xi.a.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        tx0 tx0Var = this.f50079b;
                        xi.a aVar = tx0Var.f51694x;
                        if (aVar != null) {
                            int i112 = aVar.f60041a;
                            int i122 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = tx0Var.f51685a;
                                if (i122 < editTextBoldCursorArr.length) {
                                    if ((i112 != 1 || i122 != 4) && (i112 != 2 || (i122 != 2 && i122 != 3))) {
                                        if (i122 == 0) {
                                            str = tx0Var.f51694x.f60042b;
                                        } else if (i122 == 1) {
                                            int i132 = tx0Var.f51694x.f60043c;
                                            if (i132 != 0) {
                                                str = Integer.toString(i132);
                                            }
                                            str = null;
                                        } else if (i122 == 2) {
                                            str = tx0Var.f51694x.d;
                                        } else if (i122 == 3) {
                                            str = tx0Var.f51694x.f60044e;
                                        } else {
                                            if (i122 == 4) {
                                                str = tx0Var.f51694x.f60045f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                tx0Var.f51685a[i122].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                tx0Var.f51685a[i122].setText(str);
                                            }
                                        } else {
                                            tx0Var.f51685a[i122].setText((CharSequence) null);
                                        }
                                    }
                                    i122++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    tx0Var.a0(i112, true, new org.telegram.ui.Components.a2(tx0Var, i112, 28));
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                        break;
                }
            }
        });
        this.f51687c.addView(this.f51690n, 0, c8.ja.o(-1, -2));
        this.f51690n.setVisibility(8);
        org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(this.fragmentView.getContext(), (org.telegram.ui.Cells.y0) null);
        x6VarArr[2] = x6Var2;
        this.f51687c.addView(x6Var2, 1, c8.ja.o(-1, -2));
        x6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context);
        this.h = v9Var2;
        org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.j6.N0(true);
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i17);
        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i18);
        v9Var2.setBackground(N02);
        org.telegram.ui.ActionBar.q6.j(v9Var2, N02, M3, M4, null);
        this.h.b(org.telegram.messenger.hd.M0(2131745459, null), false);
        org.telegram.ui.ActionBar.q6.U(this.h.getTextView(), i19, null);
        this.f51687c.addView(this.h, c8.ja.o(-1, -2));
        this.h.setOnClickListener(new a90(15, this, context));
        org.telegram.ui.Cells.x6 x6Var3 = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
        x6VarArr[1] = x6Var3;
        this.f51687c.addView(x6Var3, c8.ja.o(-1, -2));
        this.I = (ClipboardManager) context.getSystemService("clipboard");
        this.G = true;
        this.E = 1.0f;
        Z(false);
        this.f51693w = 0;
        a0(fzVar.f23575a.f60041a, false, null);
        this.f51694x = null;
        this.f51695y = null;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        int x02;
        try {
            int i7 = 0;
            if (this.f51686b != null && (x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29129s8, false)) != this.N) {
                this.N = x02;
                org.telegram.messenger.g0.y3(this.f51686b, x02);
            }
            if (this.f51685a != null) {
                org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6);
                org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6);
                org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f51685a;
                    if (i7 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 34, org.telegram.ui.ActionBar.j6.H6, null);
                            org.telegram.ui.ActionBar.q6.v(this.f51685a[i7], org.telegram.ui.ActionBar.j6.G6, null);
                            org.telegram.ui.ActionBar.q6.z(this.f51685a[i7], org.telegram.ui.ActionBar.j6.L6, null);
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
    public final org.telegram.ui.Components.lm0 getScrollViewForSimpleGlass() {
        return this.f51686b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51686b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29129s8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        for (int i7 = 0; i7 < this.f51692s.length; i7++) {
        }
        if (this.f51685a != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f51685a;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.s6(editTextBoldCursorArr[i10], 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.s6(this.f51685a[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.L6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        int i11 = 0;
        while (true) {
            org.telegram.ui.Cells.x6[] x6VarArr = this.f51688e;
            if (i11 >= x6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.x6 x6Var = x6VarArr[i11];
            i11++;
        }
        for (int i12 = 0; i12 < this.f51689f.length; i12++) {
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.I.removePrimaryClipChangedListener(this.M);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        this.I.addPrimaryClipChangedListener(this.M);
        c0();
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        try {
            super.onThemeColorsChanged();
            if (this.h != null) {
                ValueAnimator valueAnimator = this.H;
                if (valueAnimator != null) {
                    if (!valueAnimator.isRunning()) {
                    }
                }
                TextView textView = this.h.getTextView();
                if (this.G) {
                    i7 = org.telegram.ui.ActionBar.j6.f29089q6;
                } else {
                    i7 = org.telegram.ui.ActionBar.j6.f29260z6;
                }
                org.telegram.ui.ActionBar.q6.U(textView, i7, null);
            }
            d0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.J) {
            this.f51685a[0].requestFocus();
            org.telegram.messenger.g0.J3(this.f51685a[0]);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
