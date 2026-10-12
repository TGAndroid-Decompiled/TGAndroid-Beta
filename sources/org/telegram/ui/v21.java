package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
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
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class v21 extends org.telegram.ui.ActionBar.m2 {
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public SharedConfig.ProxyInfo J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public EditTextBoldCursor[] f40869a;
    public s21 f40870b;
    public r21 f40871c;
    public LinearLayout d;
    public org.telegram.ui.Cells.b7[] e;
    public org.telegram.ui.Cells.e9[] f40872f;
    public org.telegram.ui.Cells.ca h;
    public org.telegram.ui.Cells.ca f40873n;
    public org.telegram.ui.ActionBar.u0 f40874r;
    public org.telegram.ui.Cells.k6[] f40875s;
    public int v;
    public qi.a f40876w;
    public String f40877x;
    public float f40878y;

    public v21() {
        super(null);
        this.e = new org.telegram.ui.Cells.b7[3];
        this.f40872f = new org.telegram.ui.Cells.e9[2];
        this.f40875s = new org.telegram.ui.Cells.k6[3];
        this.f40878y = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new o21(this);
        this.J = new SharedConfig.ProxyInfo(qi.a.f43649i);
        this.I = true;
    }

    public final void U(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i10;
        if (this.h != null && this.f40874r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f40869a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f40869a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(qi.i.j(editTextBoldCursor.getText().toString())) || qi.i.d(this.f40869a[4].getText().toString()) == null)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.F != z11) {
                ValueAnimator valueAnimator = this.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                } else if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.G = ofFloat;
                    ofFloat.setDuration(200L);
                    this.G.addUpdateListener(new f21(this, 1));
                }
                float f7 = 0.0f;
                float f10 = 1.0f;
                if (z10) {
                    float[] fArr = this.E;
                    fArr[0] = this.f40878y;
                    if (z11) {
                        f7 = 1.0f;
                    }
                    fArr[1] = f7;
                    this.G.start();
                } else {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    this.f40878y = f7;
                    org.telegram.ui.Cells.ca caVar = this.h;
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.g6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.g6.f20305z6;
                    }
                    caVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
                    org.telegram.ui.ActionBar.u0 u0Var = this.f40874r;
                    if (!z11) {
                        f10 = 0.5f;
                    }
                    u0Var.setAlpha(f10);
                }
                this.h.setEnabled(z11);
                this.f40874r.setEnabled(z11);
                this.F = z11;
            }
        }
    }

    public final void V(int i10, boolean z10, org.telegram.ui.Components.o8 o8Var) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f40875s;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f40872f;
        if (this.v != i10) {
            this.v = i10;
            TransitionManager.endTransitions(this.f40871c);
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.es.f24771f).setDuration(250L);
                if (o8Var != null) {
                    duration.addListener((Transition.TransitionListener) new u21(o8Var));
                }
                TransitionManager.beginDelayedTransition(this.f40871c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                e9VarArr[0].setVisibility(0);
                e9VarArr[1].setVisibility(8);
                ((View) this.f40869a[4].getParent()).setVisibility(8);
                ((View) this.f40869a[3].getParent()).setVisibility(0);
                ((View) this.f40869a[2].getParent()).setVisibility(0);
                ((View) this.f40869a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.e9 e9Var = e9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.d0.n(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                ((View) this.f40869a[4].getParent()).setVisibility(0);
                ((View) this.f40869a[3].getParent()).setVisibility(8);
                ((View) this.f40869a[2].getParent()).setVisibility(8);
                ((View) this.f40869a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                e9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f40869a[4].getParent()).setVisibility(0);
                ((View) this.f40869a[3].getParent()).setVisibility(8);
                ((View) this.f40869a[2].getParent()).setVisibility(8);
                ((View) this.f40869a[1].getParent()).setVisibility(8);
                this.f40869a[1].setText("443");
            }
            org.telegram.ui.Cells.ca caVar = this.h;
            if (this.v != 3) {
                i12 = 0;
            }
            caVar.setVisibility(i12);
            org.telegram.ui.Cells.k6 k6Var = k6VarArr[0];
            if (this.v == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            k6Var.a(z11, z10);
            org.telegram.ui.Cells.k6 k6Var2 = k6VarArr[1];
            if (this.v == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            k6Var2.a(z12, z10);
            org.telegram.ui.Cells.k6 k6Var3 = k6VarArr[2];
            if (this.v != 3) {
                z13 = false;
            }
            k6Var3.a(z13, z10);
            U(z10);
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v21.W():void");
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f40872f;
        SharedConfig.ProxyInfo proxyInfo = this.J;
        org.telegram.ui.Cells.b7[] b7VarArr = this.e;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f40875s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new q21(this));
        org.telegram.ui.ActionBar.u0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f40874r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19843a7, false));
        this.f40871c = new ee(context);
        ?? ap0Var = new org.telegram.ui.Components.ap0(context, this.f40871c, this.resourceProvider, true);
        this.f40870b = ap0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.ap0) ap0Var);
        this.f40870b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f40870b, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20180s8, false));
        int i11 = -1;
        frameLayout.addView(this.f40870b, w7.a6.d(-1.0f, -1));
        this.f40871c.setOrientation(1);
        this.f40870b.addView(this.f40871c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final v21 f39110b;

            {
                this.f39110b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f39110b.V(qi.a.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        v21 v21Var = this.f39110b;
                        qi.a aVar = v21Var.f40876w;
                        if (aVar != null) {
                            int i12 = aVar.f43650a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = v21Var.f40869a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = v21Var.f40876w.f43651b;
                                        } else if (i13 == 1) {
                                            int i14 = v21Var.f40876w.f43652c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = v21Var.f40876w.d;
                                        } else if (i13 == 3) {
                                            str = v21Var.f40876w.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = v21Var.f40876w.f43653f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                v21Var.f40869a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                v21Var.f40869a[i13].setText(str);
                                            }
                                        } else {
                                            v21Var.f40869a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    v21Var.V(i12, true, new org.telegram.ui.Components.o8(v21Var, i12, 27));
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
        for (int i12 = 0; i12 < 3; i12++) {
            int e = qi.a.e(i12);
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
            k6VarArr[i12] = k6Var;
            k6Var.setBackground(org.telegram.ui.ActionBar.g6.L0(true));
            k6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.k6 k6Var2 = k6VarArr[i12];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (e == this.v) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                k6Var2.c(string, z12, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.k6 k6Var3 = k6VarArr[i12];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (e == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                k6Var3.c(string2, z11, true);
            } else {
                org.telegram.ui.Cells.k6 k6Var4 = k6VarArr[i12];
                String string3 = LocaleController.getString(R.string.UseProxyWeb);
                if (e == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k6Var4.c(string3, z10, false);
            }
            this.f40871c.addView(k6VarArr[i12], w7.a6.n(-1, 50));
            k6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
        b7VarArr[0] = b7Var;
        this.f40871c.addView(b7Var, w7.a6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f40871c.addView(this.d, w7.a6.n(-1, -2));
        int i13 = 5;
        this.f40869a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, w7.a6.n(i11, 64));
            this.f40869a[i14] = new EditTextBoldCursor(context);
            this.f40869a[i14].setTag(Integer.valueOf(i14));
            this.f40869a[i14].setTextSize(1, 16.0f);
            this.f40869a[i14].setHintColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f40869a[i14];
            int i15 = org.telegram.ui.ActionBar.g6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
            this.f40869a[i14].setBackground(null);
            this.f40869a[i14].setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
            this.f40869a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f40869a[i14].setCursorWidth(1.5f);
            this.f40869a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f40869a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f40869a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L6, false));
            this.f40869a[i14].setTransformHintToHeader(true);
            this.f40869a[i14].setLineColors(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20028k6, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20045l6, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20122p7, false));
            if (i14 == 0) {
                this.f40869a[i14].setInputType(524305);
                this.f40869a[i14].addTextChangedListener(new t21(this, 0));
            } else if (i14 == 1) {
                this.f40869a[i14].setInputType(2);
                this.f40869a[i14].addTextChangedListener(new t21(this, 1));
            } else if (i14 == 3) {
                this.f40869a[i14].setInputType(129);
                this.f40869a[i14].setTypeface(Typeface.DEFAULT);
                this.f40869a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f40869a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f40869a[i14].addTextChangedListener(new t21(this, 2));
            }
            this.f40869a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f40869a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f40869a[i14].setText(proxyInfo.settings.f43653f);
                            }
                        } else {
                            this.f40869a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f40869a[i14].setText(proxyInfo.settings.e);
                        }
                    } else {
                        this.f40869a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f40869a[i14].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f40869a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f40869a[i14].setText(Integer.toString(proxyInfo.settings.f43652c));
                }
            } else {
                this.f40869a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f40869a[i14].setText(proxyInfo.settings.f43651b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f40869a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f40869a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f40869a[i14];
            if (i14 == 0) {
                f7 = 12.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, w7.a6.a(-1.0f, 17.0f, f7, 17.0f, 0.0f, -1, 51));
            this.f40869a[i14].setOnEditorActionListener(new na(this, 10));
            i14++;
            i13 = 5;
            i11 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9VarArr[i16] = e9Var;
            if (i16 == 0) {
                e9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.d0.n(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                e9VarArr[i16].setVisibility(8);
            }
            this.f40871c.addView(e9VarArr[i16], w7.a6.n(-1, -2));
        }
        org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(this.fragmentView.getContext());
        this.f40873n = caVar;
        caVar.setBackground(org.telegram.ui.ActionBar.g6.L0(true));
        this.f40873n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.ca caVar2 = this.f40873n;
        int i17 = org.telegram.ui.ActionBar.g6.q6;
        caVar2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
        this.f40873n.setOnClickListener(new View.OnClickListener(this) {
            public final v21 f39110b;

            {
                this.f39110b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f39110b.V(qi.a.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        v21 v21Var = this.f39110b;
                        qi.a aVar = v21Var.f40876w;
                        if (aVar != null) {
                            int i122 = aVar.f43650a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = v21Var.f40869a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = v21Var.f40876w.f43651b;
                                        } else if (i132 == 1) {
                                            int i142 = v21Var.f40876w.f43652c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = v21Var.f40876w.d;
                                        } else if (i132 == 3) {
                                            str = v21Var.f40876w.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = v21Var.f40876w.f43653f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                v21Var.f40869a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                v21Var.f40869a[i132].setText(str);
                                            }
                                        } else {
                                            v21Var.f40869a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    v21Var.V(i122, true, new org.telegram.ui.Components.o8(v21Var, i122, 27));
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
        this.f40871c.addView(this.f40873n, 0, w7.a6.n(-1, -2));
        this.f40873n.setVisibility(8);
        org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(this.fragmentView.getContext(), (org.telegram.ui.Cells.d0) null);
        b7VarArr[2] = b7Var2;
        this.f40871c.addView(b7Var2, 1, w7.a6.n(-1, -2));
        b7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ca caVar3 = new org.telegram.ui.Cells.ca(context);
        this.h = caVar3;
        caVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
        this.f40871c.addView(this.h, w7.a6.n(-1, -2));
        this.h.setOnClickListener(new bz0(1, this, context));
        org.telegram.ui.Cells.b7 b7Var3 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
        b7VarArr[1] = b7Var3;
        this.f40871c.addView(b7Var3, w7.a6.n(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.f40878y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.f43650a, false, null);
        this.f40876w = null;
        this.f40877x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.e9[] e9VarArr = this.f40872f;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f40875s;
        cz0 cz0Var = new cz0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f20180s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40870b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f20235v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f20199t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.g6.f19901d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40871c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.ca caVar = this.h;
        int i12 = org.telegram.ui.ActionBar.g6.f19990i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(caVar, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, cz0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, cz0Var, org.telegram.ui.ActionBar.g6.f20305z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40873n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40873n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40873n, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < k6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(k6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(k6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(k6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(k6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19955g7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(k6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19974h7));
        }
        if (this.f40869a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f40869a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.g6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40869a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40869a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.g6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40869a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.f20028k6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.f20045l6));
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, cz0Var, org.telegram.ui.ActionBar.g6.f20122p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19901d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.b7[] b7VarArr = this.e;
            if (i17 >= b7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.b7 b7Var = b7VarArr[i17];
            if (b7Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.i6(b7Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19863b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < e9VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(e9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19863b7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(e9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(e9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.J6));
        }
        return arrayList;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.H.removePrimaryClipChangedListener(this.L);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.H.addPrimaryClipChangedListener(this.L);
        W();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.I) {
            this.f40869a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f40869a[0]);
        }
    }
}
