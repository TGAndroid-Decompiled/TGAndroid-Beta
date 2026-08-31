package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
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
public final class z11 extends org.telegram.ui.ActionBar.p2 {
    public float[] B;
    public boolean C;
    public ValueAnimator D;
    public ClipboardManager E;
    public final boolean F;
    public SharedConfig.ProxyInfo G;
    public boolean H;
    public ClipboardManager.OnPrimaryClipChangedListener I;
    public EditTextBoldCursor[] f43772a;
    public w11 f43773b;
    public v11 f43774c;
    public LinearLayout d;
    public org.telegram.ui.Cells.z6[] f43775e;
    public org.telegram.ui.Cells.a9[] f43776f;
    public org.telegram.ui.Cells.aa h;
    public org.telegram.ui.Cells.aa f43777n;
    public org.telegram.ui.ActionBar.w0 f43778r;
    public org.telegram.ui.Cells.j6[] f43779s;
    public int v;
    public sf.a f43780w;
    public String f43781x;
    public float f43782y;

    public z11() {
        super(null);
        this.f43775e = new org.telegram.ui.Cells.z6[3];
        this.f43776f = new org.telegram.ui.Cells.a9[2];
        this.f43779s = new org.telegram.ui.Cells.j6[3];
        this.f43782y = 1.0f;
        this.B = new float[2];
        this.C = true;
        this.I = new s11(this);
        this.G = new SharedConfig.ProxyInfo(sf.a.f47299g);
        this.F = true;
    }

    public final void U(boolean z4) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z10;
        int i10;
        if (this.h != null && this.f43778r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f43772a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f43772a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(sf.j.i(editTextBoldCursor.getText().toString())) || sf.j.d(this.f43772a[4].getText().toString()) == null)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.C != z10) {
                ValueAnimator valueAnimator = this.D;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                } else if (z4) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.D = ofFloat;
                    ofFloat.setDuration(200L);
                    this.D.addUpdateListener(new j11(this, 1));
                }
                float f10 = 0.0f;
                float f11 = 1.0f;
                if (z4) {
                    float[] fArr = this.B;
                    fArr[0] = this.f43782y;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    fArr[1] = f10;
                    this.D.start();
                } else {
                    if (z10) {
                        f10 = 1.0f;
                    }
                    this.f43782y = f10;
                    org.telegram.ui.Cells.aa aaVar = this.h;
                    if (z10) {
                        i10 = org.telegram.ui.ActionBar.k6.f21894q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f22053z6;
                    }
                    aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
                    org.telegram.ui.ActionBar.w0 w0Var = this.f43778r;
                    if (!z10) {
                        f11 = 0.5f;
                    }
                    w0Var.setAlpha(f11);
                }
                this.h.setEnabled(z10);
                this.f43778r.setEnabled(z10);
                this.C = z10;
            }
        }
    }

    public final void V(int i10, boolean z4, org.telegram.ui.Components.jm jmVar) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f43779s;
        org.telegram.ui.Cells.a9[] a9VarArr = this.f43776f;
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.f43774c);
            }
            boolean z12 = true;
            if (z4) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.pr.f30183f).setDuration(250L);
                if (jmVar != null) {
                    duration.addListener((Transition.TransitionListener) new y11(jmVar));
                }
                TransitionManager.beginDelayedTransition(this.f43774c, duration);
            }
            int i11 = this.v;
            int i12 = 8;
            if (i11 == 1) {
                a9VarArr[0].setVisibility(0);
                a9VarArr[1].setVisibility(8);
                ((View) this.f43772a[4].getParent()).setVisibility(8);
                ((View) this.f43772a[3].getParent()).setVisibility(0);
                ((View) this.f43772a[2].getParent()).setVisibility(0);
                ((View) this.f43772a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                a9VarArr[0].setVisibility(8);
                a9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.a9 a9Var = a9VarArr[1];
                StringBuilder sb = new StringBuilder();
                b.i(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                a9Var.setText(sb.toString());
                ((View) this.f43772a[4].getParent()).setVisibility(0);
                ((View) this.f43772a[3].getParent()).setVisibility(8);
                ((View) this.f43772a[2].getParent()).setVisibility(8);
                ((View) this.f43772a[1].getParent()).setVisibility(0);
            } else if (i11 == 3) {
                a9VarArr[0].setVisibility(8);
                a9VarArr[1].setVisibility(0);
                a9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f43772a[4].getParent()).setVisibility(0);
                ((View) this.f43772a[3].getParent()).setVisibility(8);
                ((View) this.f43772a[2].getParent()).setVisibility(8);
                ((View) this.f43772a[1].getParent()).setVisibility(8);
                this.f43772a[1].setText("443");
            }
            org.telegram.ui.Cells.aa aaVar = this.h;
            if (this.v != 3) {
                i12 = 0;
            }
            aaVar.setVisibility(i12);
            org.telegram.ui.Cells.j6 j6Var = j6VarArr[0];
            if (this.v == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j6Var.a(z10, z4);
            org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[1];
            if (this.v == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            j6Var2.a(z11, z4);
            org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[2];
            if (this.v != 3) {
                z12 = false;
            }
            j6Var3.a(z12, z4);
            U(z4);
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z11.W():void");
    }

    @Override
    public final View createView(Context context) {
        int i10;
        float f10;
        boolean z4;
        boolean z10;
        boolean z11;
        org.telegram.ui.Cells.a9[] a9VarArr = this.f43776f;
        SharedConfig.ProxyInfo proxyInfo = this.G;
        org.telegram.ui.Cells.z6[] z6VarArr = this.f43775e;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f43779s;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new u11(this));
        org.telegram.ui.ActionBar.w0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f43778r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        this.f43774c = new eg.s3(context);
        ?? fo0Var = new org.telegram.ui.Components.fo0(context, this.f43774c, this.resourceProvider, true);
        this.f43773b = fo0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.fo0) fo0Var);
        this.f43773b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f43773b, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21930s8, false));
        int i11 = -1;
        frameLayout.addView(this.f43773b, k7.c6.c(-1.0f, -1));
        this.f43774c.setOrientation(1);
        this.f43773b.addView(this.f43774c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final z11 f41451b;

            {
                this.f41451b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f41451b.V(sf.a.d(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        z11 z11Var = this.f41451b;
                        sf.a aVar = z11Var.f43780w;
                        if (aVar != null) {
                            int i12 = aVar.f47300a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = z11Var.f43772a;
                                if (i13 < editTextBoldCursorArr.length) {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = z11Var.f43780w.f47301b;
                                        } else if (i13 == 1) {
                                            int i14 = z11Var.f43780w.f47302c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = z11Var.f43780w.d;
                                        } else if (i13 == 3) {
                                            str = z11Var.f43780w.f47303e;
                                        } else {
                                            if (i13 == 4) {
                                                str = z11Var.f43780w.f47304f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                z11Var.f43772a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                z11Var.f43772a[i13].setText(str);
                                            }
                                        } else {
                                            z11Var.f43772a[i13].setText((CharSequence) null);
                                        }
                                    }
                                    i13++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    z11Var.V(i12, true, new org.telegram.ui.Components.jm(z11Var, i12, 23));
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
            int d = sf.a.d(i12);
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
            j6VarArr[i12] = j6Var;
            j6Var.setBackground(org.telegram.ui.ActionBar.k6.K0(true));
            j6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[i12];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (d == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j6Var2.c(string, z11, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[i12];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (d == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j6Var3.c(string2, z10, true);
            } else {
                org.telegram.ui.Cells.j6 j6Var4 = j6VarArr[i12];
                String string3 = LocaleController.getString(R.string.UseProxyWeb);
                if (d == this.v) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                j6Var4.c(string3, z4, false);
            }
            this.f43774c.addView(j6VarArr[i12], k7.c6.n(-1, 50));
            j6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
        z6VarArr[0] = z6Var;
        this.f43774c.addView(z6Var, k7.c6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f43774c.addView(this.d, k7.c6.n(-1, -2));
        int i13 = 5;
        this.f43772a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (i14 < i13) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, k7.c6.n(i11, 64));
            this.f43772a[i14] = new EditTextBoldCursor(context);
            this.f43772a[i14].setTag(Integer.valueOf(i14));
            this.f43772a[i14].setTextSize(1, 16.0f);
            this.f43772a[i14].setHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f43772a[i14];
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
            this.f43772a[i14].setBackground(null);
            this.f43772a[i14].setCursorColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
            this.f43772a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f43772a[i14].setCursorWidth(1.5f);
            this.f43772a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f43772a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f43772a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L6, false));
            this.f43772a[i14].setTransformHintToHeader(true);
            this.f43772a[i14].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21785k6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21803l6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21876p7, false));
            if (i14 == 0) {
                this.f43772a[i14].setInputType(524305);
                this.f43772a[i14].addTextChangedListener(new x11(this, 0));
            } else if (i14 == 1) {
                this.f43772a[i14].setInputType(2);
                this.f43772a[i14].addTextChangedListener(new x11(this, 1));
            } else if (i14 == 3) {
                this.f43772a[i14].setInputType(129);
                this.f43772a[i14].setTypeface(Typeface.DEFAULT);
                this.f43772a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f43772a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f43772a[i14].addTextChangedListener(new x11(this, 2));
            }
            this.f43772a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f43772a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f43772a[i14].setText(proxyInfo.settings.f47304f);
                            }
                        } else {
                            this.f43772a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f43772a[i14].setText(proxyInfo.settings.f47303e);
                        }
                    } else {
                        this.f43772a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f43772a[i14].setText(proxyInfo.settings.d);
                    }
                } else {
                    this.f43772a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    this.f43772a[i14].setText(Integer.toString(proxyInfo.settings.f47302c));
                }
            } else {
                this.f43772a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f43772a[i14].setText(proxyInfo.settings.f47301b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.f43772a[i14];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.f43772a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.f43772a[i14];
            if (i14 == 0) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, k7.c6.d(-1, -1.0f, 51, 17.0f, f10, 17.0f, 0.0f));
            this.f43772a[i14].setOnEditorActionListener(new ha(this, 10));
            i14++;
            i13 = 5;
            i11 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9VarArr[i16] = a9Var;
            if (i16 == 0) {
                a9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb = new StringBuilder();
                b.i(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                a9Var.setText(sb.toString());
                a9VarArr[i16].setVisibility(8);
            }
            this.f43774c.addView(a9VarArr[i16], k7.c6.n(-1, -2));
        }
        org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(this.fragmentView.getContext());
        this.f43777n = aaVar;
        aaVar.setBackground(org.telegram.ui.ActionBar.k6.K0(true));
        this.f43777n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.aa aaVar2 = this.f43777n;
        int i17 = org.telegram.ui.ActionBar.k6.f21894q6;
        aaVar2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
        this.f43777n.setOnClickListener(new View.OnClickListener(this) {
            public final z11 f41451b;

            {
                this.f41451b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                switch (r2) {
                    case 0:
                        this.f41451b.V(sf.a.d(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        z11 z11Var = this.f41451b;
                        sf.a aVar = z11Var.f43780w;
                        if (aVar != null) {
                            int i122 = aVar.f47300a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = z11Var.f43772a;
                                if (i132 < editTextBoldCursorArr.length) {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = z11Var.f43780w.f47301b;
                                        } else if (i132 == 1) {
                                            int i142 = z11Var.f43780w.f47302c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = z11Var.f43780w.d;
                                        } else if (i132 == 3) {
                                            str = z11Var.f43780w.f47303e;
                                        } else {
                                            if (i132 == 4) {
                                                str = z11Var.f43780w.f47304f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                z11Var.f43772a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                z11Var.f43772a[i132].setText(str);
                                            }
                                        } else {
                                            z11Var.f43772a[i132].setText((CharSequence) null);
                                        }
                                    }
                                    i132++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    z11Var.V(i122, true, new org.telegram.ui.Components.jm(z11Var, i122, 23));
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
        this.f43774c.addView(this.f43777n, 0, k7.c6.n(-1, -2));
        this.f43777n.setVisibility(8);
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(this.fragmentView.getContext(), (b) null);
        z6VarArr[2] = z6Var2;
        this.f43774c.addView(z6Var2, 1, k7.c6.n(-1, -2));
        z6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.aa aaVar3 = new org.telegram.ui.Cells.aa(context);
        this.h = aaVar3;
        aaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
        this.f43774c.addView(this.h, k7.c6.n(-1, -2));
        this.h.setOnClickListener(new hb0(16, this, context));
        org.telegram.ui.Cells.z6 z6Var3 = new org.telegram.ui.Cells.z6(context, (b) null);
        z6VarArr[1] = z6Var3;
        this.f43774c.addView(z6Var3, k7.c6.n(-1, -2));
        this.E = (ClipboardManager) context.getSystemService("clipboard");
        this.C = true;
        this.f43782y = 1.0f;
        U(false);
        this.v = 0;
        V(proxyInfo.settings.f47300a, false, null);
        this.f43780w = null;
        this.f43781x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Cells.a9[] a9VarArr = this.f43776f;
        org.telegram.ui.Cells.j6[] j6VarArr = this.f43779s;
        ey0 ey0Var = new ey0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21930s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43773b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.k6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43774c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.aa aaVar = this.h;
        int i12 = org.telegram.ui.ActionBar.k6.f21750i6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(aaVar, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.f21894q6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f22053z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43777n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43777n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43777n, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        for (int i14 = 0; i14 < j6VarArr.length; i14++) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21715g7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(j6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21733h7));
        }
        if (this.f43772a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f43772a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.k6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43772a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43772a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.k6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43772a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.f21785k6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.f21803l6));
                arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.f21876p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.f43775e;
            if (i17 >= z6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.z6 z6Var = z6VarArr[i17];
            if (z6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.m6(z6Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21624b7));
            }
            i17++;
        }
        for (int i18 = 0; i18 < a9VarArr.length; i18++) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21624b7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(a9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.J6));
        }
        return arrayList;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.E.removePrimaryClipChangedListener(this.I);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.E.addPrimaryClipChangedListener(this.I);
        W();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && !z10 && this.F) {
            this.f43772a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f43772a[0]);
        }
    }
}
