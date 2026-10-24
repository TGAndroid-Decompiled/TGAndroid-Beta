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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class v11 extends org.telegram.ui.ActionBar.o2 {
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public SharedConfig.ProxyInfo J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public int M;
    public EditTextBoldCursor[] f42536a;
    public s11 f42537b;
    public r11 f42538c;
    public LinearLayout d;
    public org.telegram.ui.Cells.b7[] e;
    public org.telegram.ui.Cells.e9[] f42539f;
    public org.telegram.ui.Cells.ca h;
    public org.telegram.ui.Cells.ca f42540n;
    public org.telegram.ui.ActionBar.u0 f42541r;
    public org.telegram.ui.Cells.k6[] f42542s;
    public int v;
    public qi.a f42543w;
    public String f42544x;
    public float f42545y;

    public v11() {
        super(null);
        this.e = new org.telegram.ui.Cells.b7[3];
        this.f42539f = new org.telegram.ui.Cells.e9[2];
        this.f42542s = new org.telegram.ui.Cells.k6[3];
        this.f42545y = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new o11(this);
        this.J = new SharedConfig.ProxyInfo(qi.a.f45162i);
        this.I = true;
    }

    public final void U(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i10;
        if (this.h != null && this.f42541r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f42536a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f42536a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(qi.i.j(editTextBoldCursor.getText().toString())) || qi.i.d(this.f42536a[4].getText().toString()) == null)) {
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
                    this.G.addUpdateListener(new f11(this, 1));
                }
                float f7 = 0.0f;
                float f10 = 1.0f;
                if (z10) {
                    float[] fArr = this.E;
                    fArr[0] = this.f42545y;
                    if (z11) {
                        f7 = 1.0f;
                    }
                    fArr[1] = f7;
                    this.G.start();
                } else {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    this.f42545y = f7;
                    TextView textView = this.h.getTextView();
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.k6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21589z6;
                    }
                    org.telegram.ui.ActionBar.r6.W(textView, i10, null);
                    org.telegram.ui.ActionBar.u0 u0Var = this.f42541r;
                    if (!z11) {
                        f10 = 0.5f;
                    }
                    u0Var.setAlpha(f10);
                }
                this.h.setEnabled(z11);
                this.f42541r.setEnabled(z11);
                this.F = z11;
            }
        }
    }

    public final void V(int i10, boolean z10, org.telegram.ui.Components.c2 c2Var) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f42542s;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f42539f;
        if (this.v != i10) {
            this.v = i10;
            TransitionManager.endTransitions(this.f42538c);
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.zr.f33337f).setDuration(250L);
                if (c2Var != null) {
                    duration.addListener((Transition.TransitionListener) new u11(c2Var));
                }
                TransitionManager.beginDelayedTransition(this.f42538c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                e9VarArr[0].setVisibility(0);
                e9VarArr[1].setVisibility(8);
                ((View) this.f42536a[4].getParent()).setVisibility(8);
                ((View) this.f42536a[3].getParent()).setVisibility(0);
                ((View) this.f42536a[2].getParent()).setVisibility(0);
                ((View) this.f42536a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.e9 e9Var = e9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.b1.o(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                ((View) this.f42536a[4].getParent()).setVisibility(0);
                ((View) this.f42536a[3].getParent()).setVisibility(8);
                ((View) this.f42536a[2].getParent()).setVisibility(8);
                ((View) this.f42536a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                e9VarArr[0].setVisibility(8);
                e9VarArr[1].setVisibility(0);
                e9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f42536a[4].getParent()).setVisibility(0);
                ((View) this.f42536a[3].getParent()).setVisibility(8);
                ((View) this.f42536a[2].getParent()).setVisibility(8);
                ((View) this.f42536a[1].getParent()).setVisibility(8);
                this.f42536a[1].setText("443");
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v11.W():void");
    }

    public final void X() {
        int x02;
        try {
            int i10 = 0;
            if (this.f42537b != null && (x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21463s8, false)) != this.M) {
                this.M = x02;
                AndroidUtilities.setScrollViewEdgeEffectColor(this.f42537b, x02);
            }
            if (this.f42536a != null) {
                org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6);
                org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6);
                org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.f42536a;
                    if (i10 < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                        if (editTextBoldCursor != null) {
                            org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.k6.H6, null);
                            org.telegram.ui.ActionBar.r6.x(this.f42536a[i10], org.telegram.ui.ActionBar.k6.G6, null);
                            org.telegram.ui.ActionBar.r6.B(this.f42536a[i10], org.telegram.ui.ActionBar.k6.L6, null);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21257h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21238g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.e9[] e9VarArr = this.f42539f;
        SharedConfig.ProxyInfo proxyInfo = this.J;
        org.telegram.ui.Cells.b7[] b7VarArr = this.e;
        org.telegram.ui.Cells.k6[] k6VarArr = this.f42542s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new q11(this));
        org.telegram.ui.ActionBar.u0 g10 = this.actionBar.m().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f42541r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, null);
        this.f42538c = new ai.r(context);
        ?? ap0Var = new org.telegram.ui.Components.ap0(context, this.f42538c, this.resourceProvider, true);
        this.f42537b = ap0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.ap0) ap0Var);
        this.f42537b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f42537b, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21463s8, false));
        int i11 = -1;
        frameLayout.addView(this.f42537b, w7.z5.c(-1.0f, -1));
        this.f42538c.setOrientation(1);
        this.f42537b.addView(this.f42538c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final v11 f40312b;

            {
                this.f40312b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f40312b.V(qi.a.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        v11 v11Var = this.f40312b;
                        qi.a aVar = v11Var.f42543w;
                        if (aVar != null) {
                            int i12 = aVar.f45163a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = v11Var.f42536a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = v11Var.f42543w.f45164b;
                                        } else if (i13 == 1) {
                                            int i14 = v11Var.f42543w.f45165c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = v11Var.f42543w.d;
                                        } else if (i13 == 3) {
                                            str = v11Var.f42543w.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = v11Var.f42543w.f45166f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                v11Var.f42536a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                v11Var.f42536a[i13].setText(str);
                                            }
                                        } else {
                                            v11Var.f42536a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    v11Var.V(i12, true, new org.telegram.ui.Components.c2(v11Var, i12, 28));
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
        int i12 = 0;
        while (i12 < 3) {
            int e = qi.a.e(i12);
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
            k6VarArr[i12] = k6Var;
            org.telegram.ui.ActionBar.r6.S(k6Var, org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21184d6), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.f21273i6), null);
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
            this.f42538c.addView(k6VarArr[i12], w7.z5.n(-1, 50));
            k6VarArr[i12].setOnClickListener(onClickListener);
            i12++;
            i11 = -1;
        }
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        b7VarArr[0] = b7Var;
        this.f42538c.addView(b7Var, w7.z5.n(i11, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f42538c.addView(this.d, w7.z5.n(-1, -2));
        this.f42536a = new EditTextBoldCursor[5];
        int i13 = 0;
        for (int i14 = 5; i13 < i14; i14 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, w7.z5.n(-1, 64));
            this.f42536a[i13] = new EditTextBoldCursor(context);
            this.f42536a[i13].setTag(Integer.valueOf(i13));
            this.f42536a[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.C(this.f42536a[i13], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.f42536a[i13];
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.W(editTextBoldCursor, i15, null);
            this.f42536a[i13].setBackground(null);
            org.telegram.ui.ActionBar.r6.x(this.f42536a[i13], i15, null);
            this.f42536a[i13].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f42536a[i13].setCursorWidth(1.5f);
            this.f42536a[i13].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f42536a[i13];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            org.telegram.ui.ActionBar.r6.B(this.f42536a[i13], org.telegram.ui.ActionBar.k6.L6, null);
            this.f42536a[i13].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.r6.H(this.f42536a[i13], org.telegram.ui.ActionBar.k6.f21311k6, org.telegram.ui.ActionBar.k6.f21328l6, org.telegram.ui.ActionBar.k6.f21405p7, null);
            if (i13 == 0) {
                this.f42536a[i13].setInputType(524305);
                this.f42536a[i13].addTextChangedListener(new t11(this, 0));
            } else if (i13 == 1) {
                this.f42536a[i13].setInputType(2);
                this.f42536a[i13].addTextChangedListener(new t11(this, 1));
            } else if (i13 == 3) {
                this.f42536a[i13].setInputType(129);
                this.f42536a[i13].setTypeface(Typeface.DEFAULT);
                this.f42536a[i13].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f42536a[i13].setInputType(524289);
            }
            if (i13 == 4) {
                this.f42536a[i13].addTextChangedListener(new t11(this, 2));
            }
            this.f42536a[i13].setImeOptions(268435461);
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 4) {
                                this.f42536a[i13].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f42536a[i13].setText(proxyInfo.settings.f45166f);
                            }
                        } else {
                            this.f42536a[i13].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f42536a[i13].setText(proxyInfo.settings.e);
                        }
                    } else {
                        this.f42536a[i13].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f42536a[i13].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f42536a[i13].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f42536a[i13].setText(Integer.toString(proxyInfo.settings.f45165c));
                }
            } else {
                this.f42536a[i13].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f42536a[i13].setText(proxyInfo.settings.f45164b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f42536a[i13];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f42536a[i13].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f42536a[i13];
            if (i13 == 0) {
                f7 = 12.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, w7.z5.d(-1, -1.0f, 51, 17.0f, f7, 17.0f, 0.0f));
            this.f42536a[i13].setOnEditorActionListener(new ka(this, 10));
            i13++;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9VarArr[i16] = e9Var;
            if (i16 == 0) {
                e9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.b1.o(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                e9Var.setText(sb2.toString());
                e9VarArr[i16].setVisibility(8);
            }
            this.f42538c.addView(e9VarArr[i16], w7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(this.fragmentView.getContext());
        this.f42540n = caVar;
        org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(true);
        int i17 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i17);
        int i18 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i18);
        caVar.setBackground(M0);
        org.telegram.ui.ActionBar.r6.k(caVar, M0, O, O2, null);
        this.f42540n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        TextView textView = this.f42540n.getTextView();
        int i19 = org.telegram.ui.ActionBar.k6.q6;
        org.telegram.ui.ActionBar.r6.W(textView, i19, null);
        this.f42540n.setOnClickListener(new View.OnClickListener(this) {
            public final v11 f40312b;

            {
                this.f40312b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f40312b.V(qi.a.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        v11 v11Var = this.f40312b;
                        qi.a aVar = v11Var.f42543w;
                        if (aVar != null) {
                            int i122 = aVar.f45163a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = v11Var.f42536a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = v11Var.f42543w.f45164b;
                                        } else if (i132 == 1) {
                                            int i142 = v11Var.f42543w.f45165c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = v11Var.f42543w.d;
                                        } else if (i132 == 3) {
                                            str = v11Var.f42543w.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = v11Var.f42543w.f45166f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                v11Var.f42536a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                v11Var.f42536a[i132].setText(str);
                                            }
                                        } else {
                                            v11Var.f42536a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    v11Var.V(i122, true, new org.telegram.ui.Components.c2(v11Var, i122, 28));
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
        this.f42538c.addView(this.f42540n, 0, w7.z5.n(-1, -2));
        this.f42540n.setVisibility(8);
        org.telegram.ui.Cells.b7 b7Var2 = new org.telegram.ui.Cells.b7(this.fragmentView.getContext(), (org.telegram.ui.Cells.b1) null);
        b7VarArr[2] = b7Var2;
        this.f42538c.addView(b7Var2, 1, w7.z5.n(-1, -2));
        b7VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ca caVar2 = new org.telegram.ui.Cells.ca(context);
        this.h = caVar2;
        org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.k6.M0(true);
        org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i17);
        org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i18);
        caVar2.setBackground(M02);
        org.telegram.ui.ActionBar.r6.k(caVar2, M02, O3, O4, null);
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        org.telegram.ui.ActionBar.r6.W(this.h.getTextView(), i19, null);
        this.f42538c.addView(this.h, w7.z5.n(-1, -2));
        this.h.setOnClickListener(new zd0(12, this, context));
        org.telegram.ui.Cells.b7 b7Var3 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        b7VarArr[1] = b7Var3;
        this.f42538c.addView(b7Var3, w7.z5.n(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.f42545y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.f45163a, false, null);
        this.f42543w = null;
        this.f42544x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42537b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21463s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21184d6));
        for (int i10 = 0; i10 < this.f42542s.length; i10++) {
        }
        if (this.f42536a != null) {
            int i11 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f42536a;
                if (i11 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i11], 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.f42536a[i11], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                i11++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21184d6));
        int i12 = 0;
        while (true) {
            org.telegram.ui.Cells.b7[] b7VarArr = this.e;
            if (i12 >= b7VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.b7 b7Var = b7VarArr[i12];
            i12++;
        }
        for (int i13 = 0; i13 < this.f42539f.length; i13++) {
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
    public final void onThemeColorsChanged() {
        int i10;
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
                    i10 = org.telegram.ui.ActionBar.k6.q6;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f21589z6;
                }
                org.telegram.ui.ActionBar.r6.W(textView, i10, null);
            }
            X();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.I) {
            this.f42536a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f42536a[0]);
        }
    }
}
