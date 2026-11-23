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
public final class yx0 extends org.telegram.ui.ActionBar.g2 {
    public float E;
    public float[] F;
    public boolean G;
    public ValueAnimator H;
    public ClipboardManager I;
    public final boolean J;
    public org.telegram.messenger.bz K;
    public boolean L;
    public ClipboardManager.OnPrimaryClipChangedListener M;
    public int N;
    public EditTextBoldCursor[] f54323a;
    public vx0 f54324b;
    public ux0 f54325c;
    public LinearLayout d;
    public org.telegram.ui.Cells.z6[] f54326e;
    public org.telegram.ui.Cells.a9[] f54327f;
    public org.telegram.ui.Cells.x9 h;
    public org.telegram.ui.Cells.x9 f54328n;
    public org.telegram.ui.ActionBar.c5 f54329r;
    public org.telegram.ui.Cells.j6[] f54330s;
    public int f54331w;
    public xi.a f54332x;
    public String f54333y;

    public yx0() {
        super(null);
        this.f54326e = new org.telegram.ui.Cells.z6[3];
        this.f54327f = new org.telegram.ui.Cells.a9[2];
        this.f54330s = new org.telegram.ui.Cells.j6[3];
        this.E = 1.0f;
        this.F = new float[2];
        this.G = true;
        this.M = new sx0(this);
        this.K = new org.telegram.messenger.bz(xi.a.f60651i);
        this.J = true;
    }

    public final void Z(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i7;
        if (this.h != null && this.f54329r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f54323a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.f54331w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.f54323a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(xi.i.l(editTextBoldCursor.getText().toString())) || xi.i.f(this.f54323a[4].getText().toString()) == null)) {
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
                        i7 = org.telegram.ui.ActionBar.m6.f29621q6;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.f29792z6;
                    }
                    org.telegram.ui.ActionBar.t6.U(textView, i7, null);
                }
                this.h.setEnabled(z11);
                this.f54329r.a(z11, z10);
                this.G = z11;
            }
        }
    }

    public final void a0(int i7, boolean z10, jw0 jw0Var) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f54330s;
        org.telegram.ui.Cells.a9[] a9VarArr = this.f54327f;
        if (this.f54331w != i7) {
            this.f54331w = i7;
            TransitionManager.endTransitions(this.f54325c);
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.nr.f37960f).setDuration(250L);
                if (jw0Var != null) {
                    duration.addListener((Transition.TransitionListener) new xx0(jw0Var));
                }
                TransitionManager.beginDelayedTransition(this.f54325c, duration);
            }
            int i10 = this.f54331w;
            if (i10 == 1) {
                a9VarArr[0].setVisibility(0);
                a9VarArr[1].setVisibility(8);
                ((View) this.f54323a[4].getParent()).setVisibility(8);
                ((View) this.f54323a[3].getParent()).setVisibility(0);
                ((View) this.f54323a[2].getParent()).setVisibility(0);
                ((View) this.f54323a[1].getParent()).setVisibility(0);
            } else if (i10 == 2) {
                a9VarArr[0].setVisibility(8);
                a9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.a9 a9Var = a9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131743532, sb2, "\n\n");
                sb2.append(org.telegram.messenger.hd.N0(2131743531, null));
                a9Var.setText(sb2.toString());
                ((View) this.f54323a[4].getParent()).setVisibility(0);
                ((View) this.f54323a[3].getParent()).setVisibility(8);
                ((View) this.f54323a[2].getParent()).setVisibility(8);
                ((View) this.f54323a[1].getParent()).setVisibility(0);
            } else if (i10 == 3) {
                a9VarArr[0].setVisibility(8);
                a9VarArr[1].setVisibility(0);
                a9VarArr[1].setText(org.telegram.messenger.hd.N0(2131743527, null));
                ((View) this.f54323a[4].getParent()).setVisibility(0);
                ((View) this.f54323a[3].getParent()).setVisibility(8);
                ((View) this.f54323a[2].getParent()).setVisibility(8);
                ((View) this.f54323a[1].getParent()).setVisibility(8);
                this.f54323a[1].setText("443");
            }
            org.telegram.ui.Cells.j6 j6Var = j6VarArr[0];
            if (this.f54331w == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            j6Var.a(z11, z10);
            org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[1];
            if (this.f54331w == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            j6Var2.a(z12, z10);
            org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[2];
            if (this.f54331w != 3) {
                z13 = false;
            }
            j6Var3.a(z13, z10);
            Z(z10);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29437g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
    }

    public final void b0(Context context, String str) {
        org.telegram.ui.Components.ah0 ah0Var = new org.telegram.ui.Components.ah0(context, org.telegram.messenger.hd.N0(2131745252, null), str, org.telegram.messenger.hd.N0(2131746308, null), true);
        ah0Var.f33526r1.setImageBitmap(org.telegram.messenger.nz.e(org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.y2(null, 2131624169)));
        showDialog(ah0Var);
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx0.c0():void");
    }

    @Override
    public final View createView(Context context) {
        int i7;
        float f10;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.a9[] a9VarArr = this.f54327f;
        org.telegram.messenger.bz bzVar = this.K;
        org.telegram.ui.Cells.z6[] z6VarArr = this.f54326e;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f54330s;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131746408, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 7));
        this.f54329r = this.simpleActionBar.s(org.telegram.messenger.hd.N0(2131745750, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f54325c = new org.telegram.ui.Components.vm0(context);
        ?? wm0Var = new org.telegram.ui.Components.wm0(context, this.f54325c, this.resourceProvider, true);
        this.f54324b = wm0Var;
        wm0Var.setDrawBackground(true);
        this.f54324b.setFillViewport(true);
        this.f54324b.setOverScrollMode(0);
        org.telegram.messenger.g0.x3(this.f54324b, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29661s8, false));
        int i10 = -1;
        frameLayout.addView(this.f54324b, c8.ma.c(-1.0f, -1));
        this.f54325c.setOrientation(1);
        this.f54324b.addView(this.f54325c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final yx0 f52412b;

            {
                this.f52412b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f52412b.a0(xi.a.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        yx0 yx0Var = this.f52412b;
                        xi.a aVar = yx0Var.f54332x;
                        if (aVar != null) {
                            int i11 = aVar.f60652a;
                            int i12 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = yx0Var.f54323a;
                                if (i12 < editTextBoldCursorArr.length) {
                                    if ((i11 != 1 || i12 != 4) && (i11 != 2 || (i12 != 2 && i12 != 3))) {
                                        if (i12 == 0) {
                                            str = yx0Var.f54332x.f60653b;
                                        } else if (i12 == 1) {
                                            int i13 = yx0Var.f54332x.f60654c;
                                            if (i13 != 0) {
                                                str = Integer.toString(i13);
                                            }
                                            str = null;
                                        } else if (i12 == 2) {
                                            str = yx0Var.f54332x.d;
                                        } else if (i12 == 3) {
                                            str = yx0Var.f54332x.f60655e;
                                        } else {
                                            if (i12 == 4) {
                                                str = yx0Var.f54332x.f60656f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                yx0Var.f54323a[i12].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                yx0Var.f54323a[i12].setText(str);
                                            }
                                        } else {
                                            yx0Var.f54323a[i12].setText((CharSequence) null);
                                        }
                                    }
                                    i12++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    yx0Var.a0(i11, true, new jw0(yx0Var, i11, 1));
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
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
            j6VarArr[i11] = j6Var;
            org.telegram.ui.ActionBar.t6.Q(j6Var, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.f29381d6), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.f29473i6), null);
            j6VarArr[i11].setTag(Integer.valueOf(i11));
            if (i11 == 0) {
                org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[i11];
                String N0 = org.telegram.messenger.hd.N0(2131743537, null);
                if (f11 == this.f54331w) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j6Var2.c(N0, z12, true);
            } else if (i11 == 1) {
                org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[i11];
                String N02 = org.telegram.messenger.hd.N0(2131743534, null);
                if (f11 == this.f54331w) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j6Var3.c(N02, z11, true);
            } else {
                org.telegram.ui.Cells.j6 j6Var4 = j6VarArr[i11];
                String N03 = org.telegram.messenger.hd.N0(2131743528, null);
                if (f11 == this.f54331w) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j6Var4.c(N03, z10, false);
            }
            this.f54325c.addView(j6VarArr[i11], c8.ma.o(-1, 50));
            j6VarArr[i11].setOnClickListener(onClickListener);
            i11++;
            i10 = -1;
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        z6VarArr[0] = z6Var;
        this.f54325c.addView(z6Var, c8.ma.o(i10, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(org.telegram.messenger.g0.L(1.0f));
        this.d.setOutlineProvider(null);
        this.f54325c.addView(this.d, c8.ma.o(-1, -2));
        this.f54323a = new EditTextBoldCursor[5];
        int i12 = 0;
        for (int i13 = 5; i12 < i13; i13 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, c8.ma.o(-1, 64));
            this.f54323a[i12] = new EditTextBoldCursor(context);
            this.f54323a[i12].setTag(Integer.valueOf(i12));
            this.f54323a[i12].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.t6.A(this.f54323a[i12], org.telegram.ui.ActionBar.m6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.f54323a[i12];
            int i14 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i14, null);
            this.f54323a[i12].setBackground(null);
            org.telegram.ui.ActionBar.t6.v(this.f54323a[i12], i14, null);
            this.f54323a[i12].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.f54323a[i12].setCursorWidth(1.5f);
            this.f54323a[i12].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f54323a[i12];
            if (org.telegram.messenger.hd.f24444a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            editTextBoldCursor2.setGravity(i7 | 16);
            org.telegram.ui.ActionBar.t6.z(this.f54323a[i12], org.telegram.ui.ActionBar.m6.L6, null);
            this.f54323a[i12].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.t6.F(this.f54323a[i12], org.telegram.ui.ActionBar.m6.f29510k6, org.telegram.ui.ActionBar.m6.f29528l6, org.telegram.ui.ActionBar.m6.f29602p7, null);
            if (i12 == 0) {
                this.f54323a[i12].setInputType(524305);
                this.f54323a[i12].addTextChangedListener(new wx0(this, 0));
            } else if (i12 == 1) {
                this.f54323a[i12].setInputType(2);
                this.f54323a[i12].addTextChangedListener(new wx0(this, 1));
            } else if (i12 == 3) {
                this.f54323a[i12].setInputType(129);
                this.f54323a[i12].setTypeface(Typeface.DEFAULT);
                this.f54323a[i12].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f54323a[i12].setInputType(524289);
            }
            if (i12 == 4) {
                this.f54323a[i12].addTextChangedListener(new wx0(this, 2));
            }
            this.f54323a[i12].setImeOptions(268435461);
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                this.f54323a[i12].setHintText(org.telegram.messenger.hd.N0(2131743539, null));
                                this.f54323a[i12].setText(bzVar.f23197a.f60656f);
                            }
                        } else {
                            this.f54323a[i12].setHintText(org.telegram.messenger.hd.N0(2131743542, null));
                            this.f54323a[i12].setText(bzVar.f23197a.f60655e);
                        }
                    } else {
                        this.f54323a[i12].setHintText(org.telegram.messenger.hd.N0(2131743529, null));
                        this.f54323a[i12].setText(bzVar.f23197a.d);
                    }
                } else {
                    this.f54323a[i12].setHintText(org.telegram.messenger.hd.N0(2131743541, null));
                    this.f54323a[i12].setText(Integer.toString(bzVar.f23197a.f60654c));
                }
            } else {
                this.f54323a[i12].setHintText(org.telegram.messenger.hd.N0(2131743546, null));
                this.f54323a[i12].setText(bzVar.f23197a.f60653b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f54323a[i12];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f54323a[i12].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f54323a[i12];
            if (i12 == 0) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, c8.ma.d(-1, -1.0f, 51, 17.0f, f10, 17.0f, 0.0f));
            this.f54323a[i12].setOnEditorActionListener(new fa(this, 10));
            i12++;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9VarArr[i15] = a9Var;
            if (i15 == 0) {
                a9Var.setText(org.telegram.messenger.hd.N0(2131743543, null));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131743532, sb2, "\n\n");
                sb2.append(org.telegram.messenger.hd.N0(2131743531, null));
                a9Var.setText(sb2.toString());
                a9VarArr[i15].setVisibility(8);
            }
            this.f54325c.addView(a9VarArr[i15], c8.ma.o(-1, -2));
        }
        org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(this.fragmentView.getContext());
        this.f54328n = x9Var;
        org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.m6.N0(true);
        int i16 = org.telegram.ui.ActionBar.m6.f29381d6;
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
        int i17 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i17);
        x9Var.setBackground(N04);
        org.telegram.ui.ActionBar.t6.j(x9Var, N04, M, M2, null);
        this.f54328n.b(org.telegram.messenger.hd.N0(2131747240, null), false);
        TextView textView = this.f54328n.getTextView();
        int i18 = org.telegram.ui.ActionBar.m6.f29621q6;
        org.telegram.ui.ActionBar.t6.U(textView, i18, null);
        this.f54328n.setOnClickListener(new View.OnClickListener(this) {
            public final yx0 f52412b;

            {
                this.f52412b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f52412b.a0(xi.a.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        yx0 yx0Var = this.f52412b;
                        xi.a aVar = yx0Var.f54332x;
                        if (aVar != null) {
                            int i112 = aVar.f60652a;
                            int i122 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = yx0Var.f54323a;
                                if (i122 < editTextBoldCursorArr.length) {
                                    if ((i112 != 1 || i122 != 4) && (i112 != 2 || (i122 != 2 && i122 != 3))) {
                                        if (i122 == 0) {
                                            str = yx0Var.f54332x.f60653b;
                                        } else if (i122 == 1) {
                                            int i132 = yx0Var.f54332x.f60654c;
                                            if (i132 != 0) {
                                                str = Integer.toString(i132);
                                            }
                                            str = null;
                                        } else if (i122 == 2) {
                                            str = yx0Var.f54332x.d;
                                        } else if (i122 == 3) {
                                            str = yx0Var.f54332x.f60655e;
                                        } else {
                                            if (i122 == 4) {
                                                str = yx0Var.f54332x.f60656f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                yx0Var.f54323a[i122].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                yx0Var.f54323a[i122].setText(str);
                                            }
                                        } else {
                                            yx0Var.f54323a[i122].setText((CharSequence) null);
                                        }
                                    }
                                    i122++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    yx0Var.a0(i112, true, new jw0(yx0Var, i112, 1));
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
        this.f54325c.addView(this.f54328n, 0, c8.ma.o(-1, -2));
        this.f54328n.setVisibility(8);
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(this.fragmentView.getContext(), (org.telegram.ui.Cells.c0) null);
        z6VarArr[2] = z6Var2;
        this.f54325c.addView(z6Var2, 1, c8.ma.o(-1, -2));
        z6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context);
        this.h = x9Var2;
        org.telegram.ui.Cells.y N05 = org.telegram.ui.ActionBar.m6.N0(true);
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i16);
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i17);
        x9Var2.setBackground(N05);
        org.telegram.ui.ActionBar.t6.j(x9Var2, N05, M3, M4, null);
        this.h.b(org.telegram.messenger.hd.N0(2131745263, null), false);
        org.telegram.ui.ActionBar.t6.U(this.h.getTextView(), i18, null);
        this.f54325c.addView(this.h, c8.ma.o(-1, -2));
        this.h.setOnClickListener(new jg0(9, this, context));
        org.telegram.ui.Cells.z6 z6Var3 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
        z6VarArr[1] = z6Var3;
        this.f54325c.addView(z6Var3, c8.ma.o(-1, -2));
        this.I = (ClipboardManager) context.getSystemService("clipboard");
        this.G = true;
        this.E = 1.0f;
        Z(false);
        this.f54331w = 0;
        a0(bzVar.f23197a.f60652a, false, null);
        this.f54332x = null;
        this.f54333y = null;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        int x02;
        try {
            int i7 = 0;
            if (this.f54324b != null && (x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29661s8, false)) != this.N) {
                this.N = x02;
                org.telegram.messenger.g0.x3(this.f54324b, x02);
            }
            if (this.f54323a != null) {
                org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.H6);
                org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.G6);
                org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.L6);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f54323a;
                    if (i7 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 34, org.telegram.ui.ActionBar.m6.H6, null);
                            org.telegram.ui.ActionBar.t6.v(this.f54323a[i7], org.telegram.ui.ActionBar.m6.G6, null);
                            org.telegram.ui.ActionBar.t6.z(this.f54323a[i7], org.telegram.ui.ActionBar.m6.L6, null);
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
    public final org.telegram.ui.Components.wm0 getScrollViewForSimpleGlass() {
        return this.f54324b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54324b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29661s8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29381d6));
        for (int i7 = 0; i7 < this.f54330s.length; i7++) {
        }
        if (this.f54323a != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f54323a;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.v6(editTextBoldCursorArr[i10], 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.f54323a[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.L6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29381d6));
        int i11 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.f54326e;
            if (i11 >= z6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.z6 z6Var = z6VarArr[i11];
            i11++;
        }
        for (int i12 = 0; i12 < this.f54327f.length; i12++) {
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
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
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
                    i7 = org.telegram.ui.ActionBar.m6.f29621q6;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.f29792z6;
                }
                org.telegram.ui.ActionBar.t6.U(textView, i7, null);
            }
            d0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.J) {
            this.f54323a[0].requestFocus();
            org.telegram.messenger.g0.I3(this.f54323a[0]);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
