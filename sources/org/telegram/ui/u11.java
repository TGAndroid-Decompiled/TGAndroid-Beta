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
public final class u11 extends org.telegram.ui.ActionBar.n2 {
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public SharedConfig.ProxyInfo J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public EditTextBoldCursor[] f41858a;
    public r11 f41859b;
    public q11 f41860c;
    public LinearLayout d;
    public org.telegram.ui.Cells.z6[] e;
    public org.telegram.ui.Cells.d9[] f41861f;
    public org.telegram.ui.Cells.ba h;
    public org.telegram.ui.Cells.ba f41862n;
    public org.telegram.ui.ActionBar.u0 f41863r;
    public org.telegram.ui.Cells.j6[] f41864s;
    public int v;
    public qi.a f41865w;
    public String f41866x;
    public float f41867y;

    public u11() {
        super(null);
        this.e = new org.telegram.ui.Cells.z6[3];
        this.f41861f = new org.telegram.ui.Cells.d9[2];
        this.f41864s = new org.telegram.ui.Cells.j6[3];
        this.f41867y = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new n11(this);
        this.J = new SharedConfig.ProxyInfo(qi.a.f44764i);
        this.I = true;
    }

    public final void U(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z11;
        int i10;
        if (this.h != null && this.f41863r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f41858a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f41858a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(qi.i.j(editTextBoldCursor.getText().toString())) || qi.i.d(this.f41858a[4].getText().toString()) == null)) {
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
                    this.G.addUpdateListener(new e11(this, 1));
                }
                float f7 = 0.0f;
                float f10 = 1.0f;
                if (z10) {
                    float[] fArr = this.E;
                    fArr[0] = this.f41867y;
                    if (z11) {
                        f7 = 1.0f;
                    }
                    fArr[1] = f7;
                    this.G.start();
                } else {
                    if (z11) {
                        f7 = 1.0f;
                    }
                    this.f41867y = f7;
                    org.telegram.ui.Cells.ba baVar = this.h;
                    if (z11) {
                        i10 = org.telegram.ui.ActionBar.h6.q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f21391z6;
                    }
                    baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
                    org.telegram.ui.ActionBar.u0 u0Var = this.f41863r;
                    if (!z11) {
                        f10 = 0.5f;
                    }
                    u0Var.setAlpha(f10);
                }
                this.h.setEnabled(z11);
                this.f41863r.setEnabled(z11);
                this.F = z11;
            }
        }
    }

    public final void V(int i10, boolean z10, org.telegram.ui.Components.e2 e2Var) {
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f41864s;
        org.telegram.ui.Cells.d9[] d9VarArr = this.f41861f;
        if (this.v != i10) {
            this.v = i10;
            TransitionManager.endTransitions(this.f41860c);
            boolean z13 = true;
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.bs.f25030f).setDuration(250L);
                if (e2Var != null) {
                    duration.addListener((Transition.TransitionListener) new t11(e2Var));
                }
                TransitionManager.beginDelayedTransition(this.f41860c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                d9VarArr[0].setVisibility(0);
                d9VarArr[1].setVisibility(8);
                ((View) this.f41858a[4].getParent()).setVisibility(8);
                ((View) this.f41858a[3].getParent()).setVisibility(0);
                ((View) this.f41858a[2].getParent()).setVisibility(0);
                ((View) this.f41858a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                d9VarArr[0].setVisibility(8);
                d9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.d9 d9Var = d9VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.t0.n(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                d9Var.setText(sb2.toString());
                ((View) this.f41858a[4].getParent()).setVisibility(0);
                ((View) this.f41858a[3].getParent()).setVisibility(8);
                ((View) this.f41858a[2].getParent()).setVisibility(8);
                ((View) this.f41858a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                d9VarArr[0].setVisibility(8);
                d9VarArr[1].setVisibility(0);
                d9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f41858a[4].getParent()).setVisibility(0);
                ((View) this.f41858a[3].getParent()).setVisibility(8);
                ((View) this.f41858a[2].getParent()).setVisibility(8);
                ((View) this.f41858a[1].getParent()).setVisibility(8);
                this.f41858a[1].setText("443");
            }
            org.telegram.ui.Cells.ba baVar = this.h;
            if (this.v != 3) {
                i12 = 0;
            }
            baVar.setVisibility(i12);
            org.telegram.ui.Cells.j6 j6Var = j6VarArr[0];
            if (this.v == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            j6Var.a(z11, z10);
            org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[1];
            if (this.v == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            j6Var2.a(z12, z10);
            org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[2];
            if (this.v != 3) {
                z13 = false;
            }
            j6Var3.a(z13, z10);
            U(z10);
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u11.W():void");
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f7;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.ui.Cells.d9[] d9VarArr = this.f41861f;
        SharedConfig.ProxyInfo proxyInfo = this.J;
        org.telegram.ui.Cells.z6[] z6VarArr = this.e;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f41864s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new p11(this));
        org.telegram.ui.ActionBar.u0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f41863r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20928a7, false));
        this.f41860c = new ai.r(context);
        ?? wo0Var = new org.telegram.ui.Components.wo0(context, this.f41860c, this.resourceProvider, true);
        this.f41859b = wo0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.wo0) wo0Var);
        this.f41859b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f41859b, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21265s8, false));
        int i11 = -1;
        frameLayout.addView(this.f41859b, w7.z5.d(-1.0f, -1));
        this.f41860c.setOrientation(1);
        this.f41859b.addView(this.f41860c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final u11 f39624b;

            {
                this.f39624b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f39624b.V(qi.a.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        u11 u11Var = this.f39624b;
                        qi.a aVar = u11Var.f41865w;
                        if (aVar != null) {
                            int i12 = aVar.f44765a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = u11Var.f41858a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = u11Var.f41865w.f44766b;
                                        } else if (i13 == 1) {
                                            int i14 = u11Var.f41865w.f44767c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = u11Var.f41865w.d;
                                        } else if (i13 == 3) {
                                            str = u11Var.f41865w.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = u11Var.f41865w.f44768f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                u11Var.f41858a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                u11Var.f41858a[i13].setText(str);
                                            }
                                        } else {
                                            u11Var.f41858a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    u11Var.V(i12, true, new org.telegram.ui.Components.e2(u11Var, i12, 27));
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
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
            j6VarArr[i12] = j6Var;
            j6Var.setBackground(org.telegram.ui.ActionBar.h6.L0(true));
            j6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[i12];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (e == this.v) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                j6Var2.c(string, z12, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[i12];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (e == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j6Var3.c(string2, z11, true);
            } else {
                org.telegram.ui.Cells.j6 j6Var4 = j6VarArr[i12];
                String string3 = LocaleController.getString(R.string.UseProxyWeb);
                if (e == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j6Var4.c(string3, z10, false);
            }
            this.f41860c.addView(j6VarArr[i12], w7.z5.n(-1, 50));
            j6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.t0) null);
        z6VarArr[0] = z6Var;
        this.f41860c.addView(z6Var, w7.z5.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f41860c.addView(this.d, w7.z5.n(-1, -2));
        int i13 = 5;
        this.f41858a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, w7.z5.n(i11, 64));
            this.f41858a[i14] = new EditTextBoldCursor(context);
            this.f41858a[i14].setTag(Integer.valueOf(i14));
            this.f41858a[i14].setTextSize(1, 16.0f);
            this.f41858a[i14].setHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f41858a[i14];
            int i15 = org.telegram.ui.ActionBar.h6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
            this.f41858a[i14].setBackground(null);
            this.f41858a[i14].setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
            this.f41858a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f41858a[i14].setCursorWidth(1.5f);
            this.f41858a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f41858a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f41858a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L6, false));
            this.f41858a[i14].setTransformHintToHeader(true);
            this.f41858a[i14].setLineColors(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21113k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21130l6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207p7, false));
            if (i14 == 0) {
                this.f41858a[i14].setInputType(524305);
                this.f41858a[i14].addTextChangedListener(new s11(this, 0));
            } else if (i14 == 1) {
                this.f41858a[i14].setInputType(2);
                this.f41858a[i14].addTextChangedListener(new s11(this, 1));
            } else if (i14 == 3) {
                this.f41858a[i14].setInputType(129);
                this.f41858a[i14].setTypeface(Typeface.DEFAULT);
                this.f41858a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f41858a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f41858a[i14].addTextChangedListener(new s11(this, 2));
            }
            this.f41858a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f41858a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f41858a[i14].setText(proxyInfo.settings.f44768f);
                            }
                        } else {
                            this.f41858a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f41858a[i14].setText(proxyInfo.settings.e);
                        }
                    } else {
                        this.f41858a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f41858a[i14].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f41858a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f41858a[i14].setText(Integer.toString(proxyInfo.settings.f44767c));
                }
            } else {
                this.f41858a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f41858a[i14].setText(proxyInfo.settings.f44766b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f41858a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f41858a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f41858a[i14];
            if (i14 == 0) {
                f7 = 12.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, w7.z5.a(-1.0f, 17.0f, f7, 17.0f, 0.0f, -1, 51));
            this.f41858a[i14].setOnEditorActionListener(new ma(this, 10));
            i14++;
            i13 = 5;
            i11 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            d9VarArr[i16] = d9Var;
            if (i16 == 0) {
                d9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.t0.n(R.string.UseProxyTelegramInfo, "\n\n", sb2);
                sb2.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                d9Var.setText(sb2.toString());
                d9VarArr[i16].setVisibility(8);
            }
            this.f41860c.addView(d9VarArr[i16], w7.z5.n(-1, -2));
        }
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(this.fragmentView.getContext());
        this.f41862n = baVar;
        baVar.setBackground(org.telegram.ui.ActionBar.h6.L0(true));
        this.f41862n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.ba baVar2 = this.f41862n;
        int i17 = org.telegram.ui.ActionBar.h6.q6;
        baVar2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        this.f41862n.setOnClickListener(new View.OnClickListener(this) {
            public final u11 f39624b;

            {
                this.f39624b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f39624b.V(qi.a.e(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        u11 u11Var = this.f39624b;
                        qi.a aVar = u11Var.f41865w;
                        if (aVar != null) {
                            int i122 = aVar.f44765a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = u11Var.f41858a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = u11Var.f41865w.f44766b;
                                        } else if (i132 == 1) {
                                            int i142 = u11Var.f41865w.f44767c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = u11Var.f41865w.d;
                                        } else if (i132 == 3) {
                                            str = u11Var.f41865w.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = u11Var.f41865w.f44768f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                u11Var.f41858a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                u11Var.f41858a[i132].setText(str);
                                            }
                                        } else {
                                            u11Var.f41858a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    u11Var.V(i122, true, new org.telegram.ui.Components.e2(u11Var, i122, 27));
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
        this.f41860c.addView(this.f41862n, 0, w7.z5.n(-1, -2));
        this.f41862n.setVisibility(8);
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(this.fragmentView.getContext(), (org.telegram.ui.Cells.t0) null);
        z6VarArr[2] = z6Var2;
        this.f41860c.addView(z6Var2, 1, w7.z5.n(-1, -2));
        z6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.ba baVar3 = new org.telegram.ui.Cells.ba(context);
        this.h = baVar3;
        baVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        this.f41860c.addView(this.h, w7.z5.n(-1, -2));
        this.h.setOnClickListener(new ef0(11, this, context));
        org.telegram.ui.Cells.z6 z6Var3 = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.t0) null);
        z6VarArr[1] = z6Var3;
        this.f41860c.addView(z6Var3, w7.z5.n(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.f41867y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.f44765a, false, null);
        this.f41865w = null;
        this.f41866x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.d9[] d9VarArr = this.f41861f;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f41864s;
        by0 by0Var = new by0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20928a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21265s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41859b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21321v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21284t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.h6.f20986d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41860c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21107k0, null, null, org.telegram.ui.ActionBar.h6.f20987d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.ba baVar = this.h;
        int i12 = org.telegram.ui.ActionBar.h6.f21075i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(baVar, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, -1, by0Var, org.telegram.ui.ActionBar.h6.f21391z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41862n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41862n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41862n, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < j6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(j6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.h6.f20986d6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(j6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.h6.f21075i6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(j6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(j6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21040g7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(j6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21059h7));
        }
        if (this.f41858a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f41858a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.h6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41858a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41858a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.h6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41858a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.f21113k6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.f21130l6));
                arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, org.telegram.ui.ActionBar.h6.f21207p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20986d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.e;
            if (i17 >= z6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.z6 z6Var = z6VarArr[i17];
            if (z6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.j6(z6Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20948b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < d9VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(d9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20948b7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(d9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(d9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.J6));
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
            this.f41858a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f41858a[0]);
        }
    }
}
