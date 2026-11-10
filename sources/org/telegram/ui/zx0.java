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
public final class zx0 extends org.telegram.ui.ActionBar.f2 {
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
    public EditTextBoldCursor[] f52694a;
    public wx0 f52695b;
    public vx0 f52696c;
    public LinearLayout d;
    public org.telegram.ui.Cells.y6[] f52697e;
    public org.telegram.ui.Cells.z8[] f52698f;
    public org.telegram.ui.Cells.w9 h;
    public org.telegram.ui.Cells.w9 f52699n;
    public org.telegram.ui.ActionBar.c5 f52700r;
    public org.telegram.ui.Cells.i6[] f52701s;
    public int f52702w;
    public ui.a f52703x;
    public String f52704y;

    public zx0() {
        super(null);
        this.f52697e = new org.telegram.ui.Cells.y6[3];
        this.f52698f = new org.telegram.ui.Cells.z8[2];
        this.f52701s = new org.telegram.ui.Cells.i6[3];
        this.D = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new tx0(this);
        this.J = new org.telegram.messenger.hz(ui.a.f56923i);
        this.I = true;
    }

    public final void Z(boolean z9) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z10;
        int i7;
        if (this.h != null && this.f52700r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f52694a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.f52702w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.f52694a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(ui.i.l(editTextBoldCursor.getText().toString())) || ui.i.f(this.f52694a[4].getText().toString()) == null)) {
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
                        i7 = org.telegram.ui.ActionBar.m6.f28130q6;
                    } else {
                        i7 = org.telegram.ui.ActionBar.m6.f28300z6;
                    }
                    org.telegram.ui.ActionBar.t6.U(textView, i7, null);
                }
                this.h.setEnabled(z10);
                this.f52700r.a(z10, z9);
                this.F = z10;
            }
        }
    }

    public final void a0(int i7, boolean z9, org.telegram.ui.Components.q2 q2Var) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.i6[] i6VarArr = this.f52701s;
        org.telegram.ui.Cells.z8[] z8VarArr = this.f52698f;
        if (this.f52702w != i7) {
            this.f52702w = i7;
            TransitionManager.endTransitions(this.f52696c);
            boolean z12 = true;
            if (z9) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.wq.f40046f).setDuration(250L);
                if (q2Var != null) {
                    duration.addListener((Transition.TransitionListener) new yx0(q2Var));
                }
                TransitionManager.beginDelayedTransition(this.f52696c, duration);
            }
            int i10 = this.f52702w;
            if (i10 == 1) {
                z8VarArr[0].setVisibility(0);
                z8VarArr[1].setVisibility(8);
                ((View) this.f52694a[4].getParent()).setVisibility(8);
                ((View) this.f52694a[3].getParent()).setVisibility(0);
                ((View) this.f52694a[2].getParent()).setVisibility(0);
                ((View) this.f52694a[1].getParent()).setVisibility(0);
            } else if (i10 == 2) {
                z8VarArr[0].setVisibility(8);
                z8VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.z8 z8Var = z8VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131743777, sb2, "\n\n");
                sb2.append(org.telegram.messenger.id.M0(2131743776, null));
                z8Var.setText(sb2.toString());
                ((View) this.f52694a[4].getParent()).setVisibility(0);
                ((View) this.f52694a[3].getParent()).setVisibility(8);
                ((View) this.f52694a[2].getParent()).setVisibility(8);
                ((View) this.f52694a[1].getParent()).setVisibility(0);
            } else if (i10 == 3) {
                z8VarArr[0].setVisibility(8);
                z8VarArr[1].setVisibility(0);
                z8VarArr[1].setText(org.telegram.messenger.id.M0(2131743772, null));
                ((View) this.f52694a[4].getParent()).setVisibility(0);
                ((View) this.f52694a[3].getParent()).setVisibility(8);
                ((View) this.f52694a[2].getParent()).setVisibility(8);
                ((View) this.f52694a[1].getParent()).setVisibility(8);
                this.f52694a[1].setText("443");
            }
            org.telegram.ui.Cells.i6 i6Var = i6VarArr[0];
            if (this.f52702w == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i6Var.a(z10, z9);
            org.telegram.ui.Cells.i6 i6Var2 = i6VarArr[1];
            if (this.f52702w == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            i6Var2.a(z11, z9);
            org.telegram.ui.Cells.i6 i6Var3 = i6VarArr[2];
            if (this.f52702w != 3) {
                z12 = false;
            }
            i6Var3.a(z12, z9);
            Z(z9);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27854b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27946g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
    }

    public final void b0(Context context, String str) {
        org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(context, org.telegram.messenger.id.M0(2131745448, null), str, org.telegram.messenger.id.M0(2131746504, null), true);
        lg0Var.f35672q1.setImageBitmap(org.telegram.messenger.sz.e(org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.y2(null, 2131624168)));
        showDialog(lg0Var);
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zx0.c0():void");
    }

    @Override
    public final View createView(Context context) {
        int i7;
        float f10;
        boolean z9;
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.z8[] z8VarArr = this.f52698f;
        org.telegram.messenger.hz hzVar = this.J;
        org.telegram.ui.Cells.y6[] y6VarArr = this.f52697e;
        org.telegram.ui.Cells.i6[] i6VarArr = this.f52701s;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131746604, null));
        this.simpleActionBar.setBackButtonImage(2131231240);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new qt0(this, 4));
        this.f52700r = this.simpleActionBar.p(org.telegram.messenger.id.M0(2131745946, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f52696c = new org.telegram.ui.Components.gm0(context);
        ?? hm0Var = new org.telegram.ui.Components.hm0(context, this.f52696c, this.resourceProvider, true);
        this.f52695b = hm0Var;
        hm0Var.setDrawBackground(true);
        this.f52695b.setFillViewport(true);
        this.f52695b.setOverScrollMode(0);
        org.telegram.messenger.g0.z3(this.f52695b, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28170s8, false));
        int i10 = -1;
        frameLayout.addView(this.f52695b, c8.ha.c(-1.0f, -1));
        this.f52696c.setOrientation(1);
        this.f52695b.addView(this.f52696c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final zx0 f50582b;

            {
                this.f50582b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f50582b.a0(ui.a.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        zx0 zx0Var = this.f50582b;
                        ui.a aVar = zx0Var.f52703x;
                        if (aVar != null) {
                            int i11 = aVar.f56924a;
                            int i12 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = zx0Var.f52694a;
                                if (i12 < editTextBoldCursorArr.length) {
                                    if ((i11 != 1 || i12 != 4) && (i11 != 2 || (i12 != 2 && i12 != 3))) {
                                        if (i12 == 0) {
                                            str = zx0Var.f52703x.f56925b;
                                        } else if (i12 == 1) {
                                            int i13 = zx0Var.f52703x.f56926c;
                                            if (i13 != 0) {
                                                str = Integer.toString(i13);
                                            }
                                            str = null;
                                        } else if (i12 == 2) {
                                            str = zx0Var.f52703x.d;
                                        } else if (i12 == 3) {
                                            str = zx0Var.f52703x.f56927e;
                                        } else {
                                            if (i12 == 4) {
                                                str = zx0Var.f52703x.f56928f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                zx0Var.f52694a[i12].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                zx0Var.f52694a[i12].setText(str);
                                            }
                                        } else {
                                            zx0Var.f52694a[i12].setText((CharSequence) null);
                                        }
                                    }
                                    i12++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    zx0Var.a0(i11, true, new org.telegram.ui.Components.q2(zx0Var, i11, 25));
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
            org.telegram.ui.ActionBar.t6.Q(i6Var, org.telegram.ui.ActionBar.m6.N0(true), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.f27890d6), org.telegram.ui.ActionBar.t6.M(org.telegram.ui.ActionBar.m6.f27982i6), null);
            i6VarArr[i11].setTag(Integer.valueOf(i11));
            if (i11 == 0) {
                org.telegram.ui.Cells.i6 i6Var2 = i6VarArr[i11];
                String M0 = org.telegram.messenger.id.M0(2131743782, null);
                if (f11 == this.f52702w) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i6Var2.c(M0, z11, true);
            } else if (i11 == 1) {
                org.telegram.ui.Cells.i6 i6Var3 = i6VarArr[i11];
                String M02 = org.telegram.messenger.id.M0(2131743779, null);
                if (f11 == this.f52702w) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i6Var3.c(M02, z10, true);
            } else {
                org.telegram.ui.Cells.i6 i6Var4 = i6VarArr[i11];
                String M03 = org.telegram.messenger.id.M0(2131743773, null);
                if (f11 == this.f52702w) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                i6Var4.c(M03, z9, false);
            }
            this.f52696c.addView(i6VarArr[i11], c8.ha.o(-1, 50));
            i6VarArr[i11].setOnClickListener(onClickListener);
            i11++;
            i10 = -1;
        }
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        y6VarArr[0] = y6Var;
        this.f52696c.addView(y6Var, c8.ha.o(i10, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(org.telegram.messenger.g0.L(1.0f));
        this.d.setOutlineProvider(null);
        this.f52696c.addView(this.d, c8.ha.o(-1, -2));
        this.f52694a = new EditTextBoldCursor[5];
        int i12 = 0;
        for (int i13 = 5; i12 < i13; i13 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, c8.ha.o(-1, 64));
            this.f52694a[i12] = new EditTextBoldCursor(context);
            this.f52694a[i12].setTag(Integer.valueOf(i12));
            this.f52694a[i12].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.t6.A(this.f52694a[i12], org.telegram.ui.ActionBar.m6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.f52694a[i12];
            int i14 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i14, null);
            this.f52694a[i12].setBackground(null);
            org.telegram.ui.ActionBar.t6.v(this.f52694a[i12], i14, null);
            this.f52694a[i12].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.f52694a[i12].setCursorWidth(1.5f);
            this.f52694a[i12].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f52694a[i12];
            if (org.telegram.messenger.id.f23161a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            editTextBoldCursor2.setGravity(i7 | 16);
            org.telegram.ui.ActionBar.t6.z(this.f52694a[i12], org.telegram.ui.ActionBar.m6.L6, null);
            this.f52694a[i12].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.t6.F(this.f52694a[i12], org.telegram.ui.ActionBar.m6.f28019k6, org.telegram.ui.ActionBar.m6.f28037l6, org.telegram.ui.ActionBar.m6.f28111p7, null);
            if (i12 == 0) {
                this.f52694a[i12].setInputType(524305);
                this.f52694a[i12].addTextChangedListener(new xx0(this, 0));
            } else if (i12 == 1) {
                this.f52694a[i12].setInputType(2);
                this.f52694a[i12].addTextChangedListener(new xx0(this, 1));
            } else if (i12 == 3) {
                this.f52694a[i12].setInputType(129);
                this.f52694a[i12].setTypeface(Typeface.DEFAULT);
                this.f52694a[i12].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f52694a[i12].setInputType(524289);
            }
            if (i12 == 4) {
                this.f52694a[i12].addTextChangedListener(new xx0(this, 2));
            }
            this.f52694a[i12].setImeOptions(268435461);
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                this.f52694a[i12].setHintText(org.telegram.messenger.id.M0(2131743784, null));
                                this.f52694a[i12].setText(hzVar.f22998a.f56928f);
                            }
                        } else {
                            this.f52694a[i12].setHintText(org.telegram.messenger.id.M0(2131743787, null));
                            this.f52694a[i12].setText(hzVar.f22998a.f56927e);
                        }
                    } else {
                        this.f52694a[i12].setHintText(org.telegram.messenger.id.M0(2131743774, null));
                        this.f52694a[i12].setText(hzVar.f22998a.d);
                    }
                } else {
                    this.f52694a[i12].setHintText(org.telegram.messenger.id.M0(2131743786, null));
                    this.f52694a[i12].setText(Integer.toString(hzVar.f22998a.f56926c));
                }
            } else {
                this.f52694a[i12].setHintText(org.telegram.messenger.id.M0(2131743791, null));
                this.f52694a[i12].setText(hzVar.f22998a.f56925b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f52694a[i12];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f52694a[i12].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f52694a[i12];
            if (i12 == 0) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, c8.ha.d(-1, -1.0f, 51, 17.0f, f10, 17.0f, 0.0f));
            this.f52694a[i12].setOnEditorActionListener(new fa(this, 10));
            i12++;
        }
        for (int i15 = 0; i15 < 2; i15++) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8VarArr[i15] = z8Var;
            if (i15 == 0) {
                z8Var.setText(org.telegram.messenger.id.M0(2131743788, null));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131743777, sb2, "\n\n");
                sb2.append(org.telegram.messenger.id.M0(2131743776, null));
                z8Var.setText(sb2.toString());
                z8VarArr[i15].setVisibility(8);
            }
            this.f52696c.addView(z8VarArr[i15], c8.ha.o(-1, -2));
        }
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(this.fragmentView.getContext());
        this.f52699n = w9Var;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.m6.N0(true);
        int i16 = org.telegram.ui.ActionBar.m6.f27890d6;
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i16);
        int i17 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i17);
        w9Var.setBackground(N0);
        org.telegram.ui.ActionBar.t6.j(w9Var, N0, M, M2, null);
        this.f52699n.b(org.telegram.messenger.id.M0(2131747434, null), false);
        TextView textView = this.f52699n.getTextView();
        int i18 = org.telegram.ui.ActionBar.m6.f28130q6;
        org.telegram.ui.ActionBar.t6.U(textView, i18, null);
        this.f52699n.setOnClickListener(new View.OnClickListener(this) {
            public final zx0 f50582b;

            {
                this.f50582b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f50582b.a0(ui.a.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        zx0 zx0Var = this.f50582b;
                        ui.a aVar = zx0Var.f52703x;
                        if (aVar != null) {
                            int i112 = aVar.f56924a;
                            int i122 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = zx0Var.f52694a;
                                if (i122 < editTextBoldCursorArr.length) {
                                    if ((i112 != 1 || i122 != 4) && (i112 != 2 || (i122 != 2 && i122 != 3))) {
                                        if (i122 == 0) {
                                            str = zx0Var.f52703x.f56925b;
                                        } else if (i122 == 1) {
                                            int i132 = zx0Var.f52703x.f56926c;
                                            if (i132 != 0) {
                                                str = Integer.toString(i132);
                                            }
                                            str = null;
                                        } else if (i122 == 2) {
                                            str = zx0Var.f52703x.d;
                                        } else if (i122 == 3) {
                                            str = zx0Var.f52703x.f56927e;
                                        } else {
                                            if (i122 == 4) {
                                                str = zx0Var.f52703x.f56928f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                zx0Var.f52694a[i122].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                zx0Var.f52694a[i122].setText(str);
                                            }
                                        } else {
                                            zx0Var.f52694a[i122].setText((CharSequence) null);
                                        }
                                    }
                                    i122++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    zx0Var.a0(i112, true, new org.telegram.ui.Components.q2(zx0Var, i112, 25));
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
        this.f52696c.addView(this.f52699n, 0, c8.ha.o(-1, -2));
        this.f52699n.setVisibility(8);
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(this.fragmentView.getContext(), (org.telegram.ui.Cells.f1) null);
        y6VarArr[2] = y6Var2;
        this.f52696c.addView(y6Var2, 1, c8.ha.o(-1, -2));
        y6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
        this.h = w9Var2;
        org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.m6.N0(true);
        org.telegram.ui.ActionBar.p6 M3 = org.telegram.ui.ActionBar.t6.M(i16);
        org.telegram.ui.ActionBar.p6 M4 = org.telegram.ui.ActionBar.t6.M(i17);
        w9Var2.setBackground(N02);
        org.telegram.ui.ActionBar.t6.j(w9Var2, N02, M3, M4, null);
        this.h.b(org.telegram.messenger.id.M0(2131745459, null), false);
        org.telegram.ui.ActionBar.t6.U(this.h.getTextView(), i18, null);
        this.f52696c.addView(this.h, c8.ha.o(-1, -2));
        this.h.setOnClickListener(new ik0(7, this, context));
        org.telegram.ui.Cells.y6 y6Var3 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        y6VarArr[1] = y6Var3;
        this.f52696c.addView(y6Var3, c8.ha.o(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.D = 1.0f;
        Z(false);
        this.f52702w = 0;
        a0(hzVar.f22998a.f56924a, false, null);
        this.f52703x = null;
        this.f52704y = null;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        int x02;
        try {
            int i7 = 0;
            if (this.f52695b != null && (x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28170s8, false)) != this.M) {
                this.M = x02;
                org.telegram.messenger.g0.z3(this.f52695b, x02);
            }
            if (this.f52694a != null) {
                org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.H6);
                org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.G6);
                org.telegram.ui.ActionBar.m6.v0(org.telegram.ui.ActionBar.m6.L6);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f52694a;
                    if (i7 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 34, org.telegram.ui.ActionBar.m6.H6, null);
                            org.telegram.ui.ActionBar.t6.v(this.f52694a[i7], org.telegram.ui.ActionBar.m6.G6, null);
                            org.telegram.ui.ActionBar.t6.z(this.f52694a[i7], org.telegram.ui.ActionBar.m6.L6, null);
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
        return this.f52695b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52695b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f28170s8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27890d6));
        for (int i7 = 0; i7 < this.f52701s.length; i7++) {
        }
        if (this.f52694a != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f52694a;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.v6(editTextBoldCursorArr[i10], 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.v6(this.f52694a[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.L6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27890d6));
        int i11 = 0;
        while (true) {
            org.telegram.ui.Cells.y6[] y6VarArr = this.f52697e;
            if (i11 >= y6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.y6 y6Var = y6VarArr[i11];
            i11++;
        }
        for (int i12 = 0; i12 < this.f52698f.length; i12++) {
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
                    i7 = org.telegram.ui.ActionBar.m6.f28130q6;
                } else {
                    i7 = org.telegram.ui.ActionBar.m6.f28300z6;
                }
                org.telegram.ui.ActionBar.t6.U(textView, i7, null);
            }
            d0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9 && !z10 && this.I) {
            this.f52694a[0].requestFocus();
            org.telegram.messenger.g0.K3(this.f52694a[0]);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
