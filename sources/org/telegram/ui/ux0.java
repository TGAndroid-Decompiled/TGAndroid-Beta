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
public final class ux0 extends org.telegram.ui.ActionBar.f2 {
    public float D;
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public org.telegram.messenger.hz J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public int M;
    public EditTextBoldCursor[] f50441a;
    public rx0 f50442b;
    public qx0 f50443c;
    public LinearLayout d;
    public org.telegram.ui.Cells.y6[] f50444e;
    public org.telegram.ui.Cells.z8[] f50445f;
    public org.telegram.ui.Cells.w9 h;
    public org.telegram.ui.Cells.w9 f50446n;
    public org.telegram.ui.ActionBar.b5 f50447r;
    public org.telegram.ui.Cells.i6[] f50448s;
    public int f50449w;
    public ui.a f50450x;
    public String f50451y;

    public ux0() {
        super(null);
        this.f50444e = new org.telegram.ui.Cells.y6[3];
        this.f50445f = new org.telegram.ui.Cells.z8[2];
        this.f50448s = new org.telegram.ui.Cells.i6[3];
        this.D = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new ox0(this);
        this.J = new org.telegram.messenger.hz(ui.a.f56914i);
        this.I = true;
    }

    public final void Z(boolean z9) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z10;
        int i7;
        if (this.h != null && this.f50447r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f50441a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.f50449w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.f50441a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(ui.i.l(editTextBoldCursor.getText().toString())) || ui.i.f(this.f50441a[4].getText().toString()) == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.F != z10) {
                ValueAnimator valueAnimator = this.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                } else if (z9) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.G = ofFloat;
                    ofFloat.setDuration(200L);
                    this.G.addUpdateListener(new a3(this, 29));
                }
                float f10 = 1.0f;
                if (z9) {
                    float[] fArr = this.E;
                    fArr[0] = this.D;
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    fArr[1] = f10;
                    this.G.start();
                } else {
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    this.D = f10;
                    TextView textView = this.h.getTextView();
                    if (z10) {
                        i7 = org.telegram.ui.ActionBar.k6.f28092q6;
                    } else {
                        i7 = org.telegram.ui.ActionBar.k6.f28262z6;
                    }
                    org.telegram.ui.ActionBar.r6.V(textView, i7, null);
                }
                this.h.setEnabled(z10);
                this.f50447r.a(z10, z9);
                this.F = z10;
            }
        }
    }

    public final void a0(int i7, boolean z9, org.telegram.ui.Components.r2 r2Var) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.i6[] i6VarArr = this.f50448s;
        org.telegram.ui.Cells.z8[] z8VarArr = this.f50445f;
        if (this.f50449w != i7) {
            this.f50449w = i7;
            TransitionManager.endTransitions(this.f50443c);
            boolean z12 = true;
            if (z9) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.xq.f40366f).setDuration(250L);
                if (r2Var != null) {
                    duration.addListener((Transition.TransitionListener) new tx0(r2Var));
                }
                TransitionManager.beginDelayedTransition(this.f50443c, duration);
            }
            int i10 = this.f50449w;
            if (i10 == 1) {
                z8VarArr[0].setVisibility(0);
                z8VarArr[1].setVisibility(8);
                ((View) this.f50441a[4].getParent()).setVisibility(8);
                ((View) this.f50441a[3].getParent()).setVisibility(0);
                ((View) this.f50441a[2].getParent()).setVisibility(0);
                ((View) this.f50441a[1].getParent()).setVisibility(0);
            } else if (i10 == 2) {
                z8VarArr[0].setVisibility(8);
                z8VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.z8 z8Var = z8VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131743780, sb2, "\n\n");
                sb2.append(org.telegram.messenger.id.M0(2131743779, null));
                z8Var.setText(sb2.toString());
                ((View) this.f50441a[4].getParent()).setVisibility(0);
                ((View) this.f50441a[3].getParent()).setVisibility(8);
                ((View) this.f50441a[2].getParent()).setVisibility(8);
                ((View) this.f50441a[1].getParent()).setVisibility(0);
            } else if (i10 == 3) {
                z8VarArr[0].setVisibility(8);
                z8VarArr[1].setVisibility(0);
                z8VarArr[1].setText(org.telegram.messenger.id.M0(2131743775, null));
                ((View) this.f50441a[4].getParent()).setVisibility(0);
                ((View) this.f50441a[3].getParent()).setVisibility(8);
                ((View) this.f50441a[2].getParent()).setVisibility(8);
                ((View) this.f50441a[1].getParent()).setVisibility(8);
                this.f50441a[1].setText("443");
            }
            org.telegram.ui.Cells.i6 i6Var = i6VarArr[0];
            if (this.f50449w == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i6Var.a(z10, z9);
            org.telegram.ui.Cells.i6 i6Var2 = i6VarArr[1];
            if (this.f50449w == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var2.a(z11, z9);
            org.telegram.ui.Cells.i6 i6Var3 = i6VarArr[2];
            if (this.f50449w != 3) {
                z12 = false;
            }
            i6Var3.a(z12, z9);
            Z(z9);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27816b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27908g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
    }

    public final void b0(Context context, String str) {
        org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(context, org.telegram.messenger.id.M0(2131745451, null), str, org.telegram.messenger.id.M0(2131746505, null), true);
        lg0Var.n1.setImageBitmap(org.telegram.messenger.sz.e(org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.y2(null, 2131624168)));
        showDialog(lg0Var);
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ux0.c0():void");
    }

    @Override
    public final View createView(Context context) {
        int i7;
        float f10;
        boolean z9;
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.z8[] z8VarArr = this.f50445f;
        org.telegram.messenger.hz hzVar = this.J;
        org.telegram.ui.Cells.y6[] y6VarArr = this.f50444e;
        org.telegram.ui.Cells.i6[] i6VarArr = this.f50448s;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131746605, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new nt0(this, 4));
        this.f50447r = this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f50443c = new org.telegram.ui.Components.gm0(context);
        ?? hm0Var = new org.telegram.ui.Components.hm0(context, this.f50443c, this.resourceProvider, true);
        this.f50442b = hm0Var;
        hm0Var.setDrawBackground(true);
        this.f50442b.setFillViewport(true);
        this.f50442b.setOverScrollMode(0);
        org.telegram.messenger.g0.z3(this.f50442b, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28132s8, false));
        int i10 = -1;
        frameLayout.addView(this.f50442b, c8.ha.c(-1.0f, -1));
        this.f50443c.setOrientation(1);
        this.f50442b.addView(this.f50443c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final ux0 f48974b;

            {
                this.f48974b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f48974b.a0(ui.a.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        ux0 ux0Var = this.f48974b;
                        ui.a aVar = ux0Var.f50450x;
                        if (aVar != null) {
                            int i11 = aVar.f56915a;
                            int i12 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = ux0Var.f50441a;
                                if (i12 < editTextBoldCursorArr.length) {
                                    if ((i11 != 1 || i12 != 4) && (i11 != 2 || (i12 != 2 && i12 != 3))) {
                                        if (i12 == 0) {
                                            str = ux0Var.f50450x.f56916b;
                                        } else if (i12 == 1) {
                                            int i13 = ux0Var.f50450x.f56917c;
                                            if (i13 != 0) {
                                                str = Integer.toString(i13);
                                            }
                                            str = null;
                                        } else if (i12 == 2) {
                                            str = ux0Var.f50450x.d;
                                        } else if (i12 == 3) {
                                            str = ux0Var.f50450x.f56918e;
                                        } else {
                                            if (i12 == 4) {
                                                str = ux0Var.f50450x.f56919f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                ux0Var.f50441a[i12].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                ux0Var.f50441a[i12].setText(str);
                                            }
                                        } else {
                                            ux0Var.f50441a[i12].setText((CharSequence) null);
                                        }
                                    }
                                    i12++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    ux0Var.a0(i11, true, new org.telegram.ui.Components.r2(ux0Var, i11, 25));
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
            int f11 = ui.a.f(i11);
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
            i6VarArr[i11] = i6Var;
            org.telegram.ui.ActionBar.r6.R(i6Var, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27852d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.f27944i6), null);
            i6VarArr[i11].setTag(Integer.valueOf(i11));
            if (i11 == 0) {
                org.telegram.ui.Cells.i6 i6Var2 = i6VarArr[i11];
                String M0 = org.telegram.messenger.id.M0(2131743785, null);
                if (f11 == this.f50449w) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i6Var2.c(M0, z11, true);
            } else if (i11 == 1) {
                org.telegram.ui.Cells.i6 i6Var3 = i6VarArr[i11];
                String M02 = org.telegram.messenger.id.M0(2131743782, null);
                if (f11 == this.f50449w) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i6Var3.c(M02, z10, true);
            } else {
                org.telegram.ui.Cells.i6 i6Var4 = i6VarArr[i11];
                String M03 = org.telegram.messenger.id.M0(2131743776, null);
                if (f11 == this.f50449w) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                i6Var4.c(M03, z9, false);
            }
            this.f50443c.addView(i6VarArr[i11], c8.ha.o(-1, 50));
            i6VarArr[i11].setOnClickListener(onClickListener);
            i11++;
            i10 = -1;
        }
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        y6VarArr[0] = y6Var;
        this.f50443c.addView(y6Var, c8.ha.o(i10, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(org.telegram.messenger.g0.L(1.0f));
        this.d.setOutlineProvider(null);
        this.f50443c.addView(this.d, c8.ha.o(-1, -2));
        this.f50441a = new EditTextBoldCursor[5];
        int i12 = 0;
        for (int i13 = 5; i12 < i13; i13 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, c8.ha.o(-1, 64));
            this.f50441a[i12] = new EditTextBoldCursor(context);
            this.f50441a[i12].setTag(Integer.valueOf(i12));
            this.f50441a[i12].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.B(this.f50441a[i12], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.f50441a[i12];
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i14, null);
            this.f50441a[i12].setBackground(null);
            org.telegram.ui.ActionBar.r6.w(this.f50441a[i12], i14, null);
            this.f50441a[i12].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.f50441a[i12].setCursorWidth(1.5f);
            this.f50441a[i12].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f50441a[i12];
            if (org.telegram.messenger.id.f23157a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            editTextBoldCursor2.setGravity(i7 | 16);
            org.telegram.ui.ActionBar.r6.A(this.f50441a[i12], org.telegram.ui.ActionBar.k6.L6, null);
            this.f50441a[i12].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.r6.G(this.f50441a[i12], org.telegram.ui.ActionBar.k6.f27981k6, org.telegram.ui.ActionBar.k6.f27999l6, org.telegram.ui.ActionBar.k6.f28073p7, null);
            if (i12 == 0) {
                this.f50441a[i12].setInputType(524305);
                this.f50441a[i12].addTextChangedListener(new sx0(this, 0));
            } else if (i12 == 1) {
                this.f50441a[i12].setInputType(2);
                this.f50441a[i12].addTextChangedListener(new sx0(this, 1));
            } else if (i12 == 3) {
                this.f50441a[i12].setInputType(129);
                this.f50441a[i12].setTypeface(Typeface.DEFAULT);
                this.f50441a[i12].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f50441a[i12].setInputType(524289);
            }
            if (i12 == 4) {
                this.f50441a[i12].addTextChangedListener(new sx0(this, 2));
            }
            this.f50441a[i12].setImeOptions(268435461);
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                this.f50441a[i12].setHintText(org.telegram.messenger.id.M0(2131743787, null));
                                this.f50441a[i12].setText(hzVar.f22994a.f56919f);
                            }
                        } else {
                            this.f50441a[i12].setHintText(org.telegram.messenger.id.M0(2131743790, null));
                            this.f50441a[i12].setText(hzVar.f22994a.f56918e);
                        }
                    } else {
                        this.f50441a[i12].setHintText(org.telegram.messenger.id.M0(2131743777, null));
                        this.f50441a[i12].setText(hzVar.f22994a.d);
                    }
                } else {
                    this.f50441a[i12].setHintText(org.telegram.messenger.id.M0(2131743789, null));
                    this.f50441a[i12].setText(Integer.toString(hzVar.f22994a.f56917c));
                }
            } else {
                this.f50441a[i12].setHintText(org.telegram.messenger.id.M0(2131743794, null));
                this.f50441a[i12].setText(hzVar.f22994a.f56916b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f50441a[i12];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f50441a[i12].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f50441a[i12];
            if (i12 == 0) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, c8.ha.d(-1, -1.0f, 51, 17.0f, f10, 17.0f, 0.0f));
            this.f50441a[i12].setOnEditorActionListener(new fa(this, 10));
            i12++;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8VarArr[i15] = z8Var;
            if (i15 == 0) {
                z8Var.setText(org.telegram.messenger.id.M0(2131743791, null));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131743780, sb2, "\n\n");
                sb2.append(org.telegram.messenger.id.M0(2131743779, null));
                z8Var.setText(sb2.toString());
                z8VarArr[i15].setVisibility(8);
            }
            this.f50443c.addView(z8VarArr[i15], c8.ha.o(-1, -2));
        }
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(this.fragmentView.getContext());
        this.f50446n = w9Var;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        int i16 = org.telegram.ui.ActionBar.k6.f27852d6;
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i16);
        int i17 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i17);
        w9Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(w9Var, N0, N, N2, null);
        this.f50446n.b(org.telegram.messenger.id.M0(2131747435, null), false);
        TextView textView = this.f50446n.getTextView();
        int i18 = org.telegram.ui.ActionBar.k6.f28092q6;
        org.telegram.ui.ActionBar.r6.V(textView, i18, null);
        this.f50446n.setOnClickListener(new View.OnClickListener(this) {
            public final ux0 f48974b;

            {
                this.f48974b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f48974b.a0(ui.a.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        ux0 ux0Var = this.f48974b;
                        ui.a aVar = ux0Var.f50450x;
                        if (aVar != null) {
                            int i112 = aVar.f56915a;
                            int i122 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = ux0Var.f50441a;
                                if (i122 < editTextBoldCursorArr.length) {
                                    if ((i112 != 1 || i122 != 4) && (i112 != 2 || (i122 != 2 && i122 != 3))) {
                                        if (i122 == 0) {
                                            str = ux0Var.f50450x.f56916b;
                                        } else if (i122 == 1) {
                                            int i132 = ux0Var.f50450x.f56917c;
                                            if (i132 != 0) {
                                                str = Integer.toString(i132);
                                            }
                                            str = null;
                                        } else if (i122 == 2) {
                                            str = ux0Var.f50450x.d;
                                        } else if (i122 == 3) {
                                            str = ux0Var.f50450x.f56918e;
                                        } else {
                                            if (i122 == 4) {
                                                str = ux0Var.f50450x.f56919f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                ux0Var.f50441a[i122].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                ux0Var.f50441a[i122].setText(str);
                                            }
                                        } else {
                                            ux0Var.f50441a[i122].setText((CharSequence) null);
                                        }
                                    }
                                    i122++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    ux0Var.a0(i112, true, new org.telegram.ui.Components.r2(ux0Var, i112, 25));
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
        this.f50443c.addView(this.f50446n, 0, c8.ha.o(-1, -2));
        this.f50446n.setVisibility(8);
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(this.fragmentView.getContext(), (org.telegram.ui.Cells.f1) null);
        y6VarArr[2] = y6Var2;
        this.f50443c.addView(y6Var2, 1, c8.ha.o(-1, -2));
        y6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
        this.h = w9Var2;
        org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i16);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i17);
        w9Var2.setBackground(N02);
        org.telegram.ui.ActionBar.r6.k(w9Var2, N02, N3, N4, null);
        this.h.b(org.telegram.messenger.id.M0(2131745462, null), false);
        org.telegram.ui.ActionBar.r6.V(this.h.getTextView(), i18, null);
        this.f50443c.addView(this.h, c8.ha.o(-1, -2));
        this.h.setOnClickListener(new fk0(7, this, context));
        org.telegram.ui.Cells.y6 y6Var3 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        y6VarArr[1] = y6Var3;
        this.f50443c.addView(y6Var3, c8.ha.o(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.D = 1.0f;
        Z(false);
        this.f50449w = 0;
        a0(hzVar.f22994a.f56915a, false, null);
        this.f50450x = null;
        this.f50451y = null;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        int x02;
        try {
            int i7 = 0;
            if (this.f50442b != null && (x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28132s8, false)) != this.M) {
                this.M = x02;
                org.telegram.messenger.g0.z3(this.f50442b, x02);
            }
            if (this.f50441a != null) {
                org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6);
                org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6);
                org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f50441a;
                    if (i7 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.k6.H6, null);
                            org.telegram.ui.ActionBar.r6.w(this.f50441a[i7], org.telegram.ui.ActionBar.k6.G6, null);
                            org.telegram.ui.ActionBar.r6.A(this.f50441a[i7], org.telegram.ui.ActionBar.k6.L6, null);
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
    public final org.telegram.ui.Components.hm0 getScrollViewForSimpleGlass() {
        return this.f50442b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50442b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28132s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27852d6));
        for (int i7 = 0; i7 < this.f50448s.length; i7++) {
        }
        if (this.f50441a != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f50441a;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i10], 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f50441a[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27852d6));
        int i11 = 0;
        while (true) {
            org.telegram.ui.Cells.y6[] y6VarArr = this.f50444e;
            if (i11 >= y6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.y6 y6Var = y6VarArr[i11];
            i11++;
        }
        for (int i12 = 0; i12 < this.f50445f.length; i12++) {
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
        this.H.removePrimaryClipChangedListener(this.L);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        this.H.addPrimaryClipChangedListener(this.L);
        c0();
    }

    @Override
    public final void onThemeColorsChanged() {
        int i7;
        try {
            super.onThemeColorsChanged();
            if (this.h != null) {
                ValueAnimator valueAnimator = this.G;
                if (valueAnimator != null) {
                    if (!valueAnimator.isRunning()) {
                    }
                }
                TextView textView = this.h.getTextView();
                if (this.F) {
                    i7 = org.telegram.ui.ActionBar.k6.f28092q6;
                } else {
                    i7 = org.telegram.ui.ActionBar.k6.f28262z6;
                }
                org.telegram.ui.ActionBar.r6.V(textView, i7, null);
            }
            d0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9 && !z10 && this.I) {
            this.f50441a[0].requestFocus();
            org.telegram.messenger.g0.K3(this.f50441a[0]);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
