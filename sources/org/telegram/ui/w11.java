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
import org.telegram.messenger.WebProxyTransport;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class w11 extends org.telegram.ui.ActionBar.p2 {
    public float B;
    public final float[] C;
    public boolean D;
    public ValueAnimator E;
    public ClipboardManager F;
    public boolean G;
    public final SharedConfig.ProxyInfo H;
    public boolean I;
    public final ClipboardManager.OnPrimaryClipChangedListener J;
    public EditTextBoldCursor[] f39299a;
    public t11 f39300b;
    public s11 f39301c;
    public LinearLayout d;
    public final org.telegram.ui.Cells.z6[] e;
    public final org.telegram.ui.Cells.a9[] f39302f;
    public org.telegram.ui.Cells.aa h;
    public org.telegram.ui.Cells.aa f39303n;
    public org.telegram.ui.ActionBar.w0 f39304r;
    public final org.telegram.ui.Cells.j6[] f39305s;
    public int v;
    public int f39306w;
    public String f39307x;
    public String[] f39308y;

    public w11() {
        super(null);
        this.e = new org.telegram.ui.Cells.z6[3];
        this.f39302f = new org.telegram.ui.Cells.a9[2];
        this.f39305s = new org.telegram.ui.Cells.j6[3];
        this.v = -1;
        this.f39306w = -1;
        this.B = 1.0f;
        this.C = new float[2];
        this.D = true;
        this.J = new ClipboardManager.OnPrimaryClipChangedListener() {
            @Override
            public final void onPrimaryClipChanged() {
                w11.this.W();
            }
        };
        this.H = new SharedConfig.ProxyInfo("", 1080, "", "", "");
        this.G = true;
    }

    public final void U(boolean z4) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z10;
        int i10;
        if (this.h != null && this.f39304r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.f39299a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.v != 2 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.f39299a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(WebProxyTransport.normalizeHost(editTextBoldCursor.getText().toString())) || !WebProxyTransport.isValidSecret(this.f39299a[4].getText().toString()))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.D != z10) {
                ValueAnimator valueAnimator = this.E;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                } else if (z4) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.E = ofFloat;
                    ofFloat.setDuration(200L);
                    this.E.addUpdateListener(new h11(this, 1));
                }
                float f10 = 0.0f;
                float f11 = 1.0f;
                if (z4) {
                    float f12 = this.B;
                    float[] fArr = this.C;
                    fArr[0] = f12;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    fArr[1] = f10;
                    this.E.start();
                } else {
                    if (z10) {
                        f10 = 1.0f;
                    }
                    this.B = f10;
                    org.telegram.ui.Cells.aa aaVar = this.h;
                    if (z10) {
                        i10 = org.telegram.ui.ActionBar.j6.f20140q6;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f20298z6;
                    }
                    aaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
                    org.telegram.ui.ActionBar.w0 w0Var = this.f39304r;
                    if (!z10) {
                        f11 = 0.5f;
                    }
                    w0Var.setAlpha(f11);
                }
                this.h.setEnabled(z10);
                this.f39304r.setEnabled(z10);
                this.D = z10;
            }
        }
    }

    public final void V(int i10, boolean z4, vy0 vy0Var) {
        boolean z10;
        boolean z11;
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.f39301c);
            }
            boolean z12 = true;
            if (z4) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.nr.f27346f).setDuration(250L);
                if (vy0Var != null) {
                    duration.addListener((Transition.TransitionListener) new v11(vy0Var));
                }
                TransitionManager.beginDelayedTransition(this.f39301c, duration);
            }
            int i11 = this.v;
            org.telegram.ui.Cells.a9[] a9VarArr = this.f39302f;
            int i12 = 8;
            if (i11 == 0) {
                a9VarArr[0].setVisibility(0);
                a9VarArr[1].setVisibility(8);
                ((View) this.f39299a[4].getParent()).setVisibility(8);
                ((View) this.f39299a[3].getParent()).setVisibility(0);
                ((View) this.f39299a[2].getParent()).setVisibility(0);
                ((View) this.f39299a[1].getParent()).setVisibility(0);
            } else if (i11 == 1) {
                a9VarArr[0].setVisibility(8);
                a9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.a9 a9Var = a9VarArr[1];
                StringBuilder sb = new StringBuilder();
                b.i(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                a9Var.setText(sb.toString());
                ((View) this.f39299a[4].getParent()).setVisibility(0);
                ((View) this.f39299a[3].getParent()).setVisibility(8);
                ((View) this.f39299a[2].getParent()).setVisibility(8);
                ((View) this.f39299a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                a9VarArr[0].setVisibility(8);
                a9VarArr[1].setVisibility(0);
                a9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.f39299a[4].getParent()).setVisibility(0);
                ((View) this.f39299a[3].getParent()).setVisibility(8);
                ((View) this.f39299a[2].getParent()).setVisibility(8);
                ((View) this.f39299a[1].getParent()).setVisibility(8);
                this.f39299a[1].setText("443");
            }
            org.telegram.ui.Cells.aa aaVar = this.h;
            if (this.v != 2) {
                i12 = 0;
            }
            aaVar.setVisibility(i12);
            org.telegram.ui.Cells.j6[] j6VarArr = this.f39305s;
            org.telegram.ui.Cells.j6 j6Var = j6VarArr[0];
            if (this.v == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j6Var.a(z10, z4);
            org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[1];
            if (this.v == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            j6Var2.a(z11, z4);
            org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[2];
            if (this.v != 2) {
                z12 = false;
            }
            j6Var3.a(z12, z4);
            U(z4);
        }
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w11.W():void");
    }

    @Override
    public final View createView(Context context) {
        SharedConfig.ProxyInfo proxyInfo;
        int i10;
        float f10;
        boolean z4;
        boolean z10;
        boolean z11;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new r11(this));
        org.telegram.ui.ActionBar.w0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.f39304r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        this.f39301c = new dg.u3(context);
        ?? eo0Var = new org.telegram.ui.Components.eo0(context, this.f39301c, this.resourceProvider, true);
        this.f39300b = eo0Var;
        this.actionBar.setAdaptiveBackground((org.telegram.ui.Components.eo0) eo0Var);
        this.f39300b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.f39300b, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20176s8, false));
        int i11 = -1;
        frameLayout.addView(this.f39300b, k7.b6.c(-1.0f, -1));
        this.f39301c.setOrientation(1);
        this.f39300b.addView(this.f39301c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final w11 f37575b;

            {
                this.f37575b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37575b.V(((Integer) view.getTag()).intValue(), true, null);
                        return;
                    default:
                        w11 w11Var = this.f37575b;
                        if (w11Var.f39306w != -1) {
                            int i12 = 0;
                            while (true) {
                                String[] strArr = w11Var.f39308y;
                                if (i12 < strArr.length) {
                                    int i13 = w11Var.f39306w;
                                    if ((i13 != 0 || i12 != 4) && (i13 != 1 || (i12 != 2 && i12 != 3))) {
                                        String str = strArr[i12];
                                        if (str != null) {
                                            try {
                                                w11Var.f39299a[i12].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                w11Var.f39299a[i12].setText(w11Var.f39308y[i12]);
                                            }
                                        } else {
                                            w11Var.f39299a[i12].setText((CharSequence) null);
                                        }
                                    }
                                    i12++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = w11Var.f39299a[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    w11Var.V(w11Var.f39306w, true, new vy0(w11Var, 8));
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
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
            org.telegram.ui.Cells.j6[] j6VarArr = this.f39305s;
            j6VarArr[i12] = j6Var;
            j6Var.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
            j6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                org.telegram.ui.Cells.j6 j6Var2 = j6VarArr[i12];
                String string = LocaleController.getString(R.string.UseProxySocks5);
                if (i12 == this.v) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j6Var2.c(string, z11, true);
            } else if (i12 == 1) {
                org.telegram.ui.Cells.j6 j6Var3 = j6VarArr[i12];
                String string2 = LocaleController.getString(R.string.UseProxyTelegram);
                if (i12 == this.v) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j6Var3.c(string2, z10, true);
            } else {
                org.telegram.ui.Cells.j6 j6Var4 = j6VarArr[i12];
                String string3 = LocaleController.getString(R.string.UseProxyWeb);
                if (i12 == this.v) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                j6Var4.c(string3, z4, false);
            }
            this.f39301c.addView(j6VarArr[i12], k7.b6.n(-1, 50));
            j6VarArr[i12].setOnClickListener(onClickListener);
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
        org.telegram.ui.Cells.z6[] z6VarArr = this.e;
        z6VarArr[0] = z6Var;
        this.f39301c.addView(z6Var, k7.b6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.f39301c.addView(this.d, k7.b6.n(-1, -2));
        int i13 = 5;
        this.f39299a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (true) {
            proxyInfo = this.H;
            if (i14 >= i13) {
                break;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, k7.b6.n(i11, 64));
            this.f39299a[i14] = new EditTextBoldCursor(context);
            this.f39299a[i14].setTag(Integer.valueOf(i14));
            this.f39299a[i14].setTextSize(1, 16.0f);
            this.f39299a[i14].setHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.f39299a[i14];
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.f39299a[i14].setBackground(null);
            this.f39299a[i14].setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.f39299a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.f39299a[i14].setCursorWidth(1.5f);
            this.f39299a[i14].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.f39299a[i14];
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            editTextBoldCursor2.setGravity(i10 | 16);
            this.f39299a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
            this.f39299a[i14].setTransformHintToHeader(true);
            this.f39299a[i14].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20031k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20049l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20122p7, false));
            if (i14 == 0) {
                this.f39299a[i14].setInputType(524305);
                this.f39299a[i14].addTextChangedListener(new u11(this, 0));
            } else if (i14 == 1) {
                this.f39299a[i14].setInputType(2);
                this.f39299a[i14].addTextChangedListener(new u11(this, 1));
            } else if (i14 == 3) {
                this.f39299a[i14].setInputType(129);
                this.f39299a[i14].setTypeface(Typeface.DEFAULT);
                this.f39299a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.f39299a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.f39299a[i14].addTextChangedListener(new u11(this, 2));
            }
            this.f39299a[i14].setImeOptions(268435461);
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 4) {
                                this.f39299a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                                this.f39299a[i14].setText(proxyInfo.secret);
                            }
                        } else {
                            this.f39299a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                            this.f39299a[i14].setText(proxyInfo.password);
                        }
                    } else {
                        this.f39299a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                        this.f39299a[i14].setText(proxyInfo.username);
                    }
                } else {
                    this.f39299a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                    EditTextBoldCursor editTextBoldCursor3 = this.f39299a[i14];
                    editTextBoldCursor3.setText("" + proxyInfo.port);
                }
            } else {
                this.f39299a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.f39299a[i14].setText(proxyInfo.address);
            }
            EditTextBoldCursor editTextBoldCursor4 = this.f39299a[i14];
            editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            this.f39299a[i14].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor5 = this.f39299a[i14];
            if (i14 == 0) {
                f10 = 12.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor5, k7.b6.d(-1, -1.0f, 51, 17.0f, f10, 17.0f, 0.0f));
            this.f39299a[i14].setOnEditorActionListener(new ha(this, 10));
            i14++;
            i13 = 5;
            i11 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            org.telegram.ui.Cells.a9[] a9VarArr = this.f39302f;
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
            this.f39301c.addView(a9VarArr[i16], k7.b6.n(-1, -2));
        }
        org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(this.fragmentView.getContext());
        this.f39303n = aaVar;
        aaVar.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
        this.f39303n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.aa aaVar2 = this.f39303n;
        int i17 = org.telegram.ui.ActionBar.j6.f20140q6;
        aaVar2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.f39303n.setOnClickListener(new View.OnClickListener(this) {
            public final w11 f37575b;

            {
                this.f37575b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37575b.V(((Integer) view.getTag()).intValue(), true, null);
                        return;
                    default:
                        w11 w11Var = this.f37575b;
                        if (w11Var.f39306w != -1) {
                            int i122 = 0;
                            while (true) {
                                String[] strArr = w11Var.f39308y;
                                if (i122 < strArr.length) {
                                    int i132 = w11Var.f39306w;
                                    if ((i132 != 0 || i122 != 4) && (i132 != 1 || (i122 != 2 && i122 != 3))) {
                                        String str = strArr[i122];
                                        if (str != null) {
                                            try {
                                                w11Var.f39299a[i122].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                w11Var.f39299a[i122].setText(w11Var.f39308y[i122]);
                                            }
                                        } else {
                                            w11Var.f39299a[i122].setText((CharSequence) null);
                                        }
                                    }
                                    i122++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor6 = w11Var.f39299a[0];
                                    editTextBoldCursor6.setSelection(editTextBoldCursor6.length());
                                    w11Var.V(w11Var.f39306w, true, new vy0(w11Var, 8));
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
        this.f39301c.addView(this.f39303n, 0, k7.b6.n(-1, -2));
        this.f39303n.setVisibility(8);
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(this.fragmentView.getContext(), (b) null);
        z6VarArr[2] = z6Var2;
        this.f39301c.addView(z6Var2, 1, k7.b6.n(-1, -2));
        z6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.aa aaVar3 = new org.telegram.ui.Cells.aa(context);
        this.h = aaVar3;
        aaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.f39301c.addView(this.h, k7.b6.n(-1, -2));
        this.h.setOnClickListener(new gb0(16, this, context));
        org.telegram.ui.Cells.z6 z6Var3 = new org.telegram.ui.Cells.z6(context, (b) null);
        z6VarArr[1] = z6Var3;
        this.f39301c.addView(z6Var3, k7.b6.n(-1, -2));
        this.F = (ClipboardManager) context.getSystemService("clipboard");
        this.D = true;
        this.B = 1.0f;
        U(false);
        this.v = -1;
        V(proxyInfo.type, false, null);
        this.f39306w = -1;
        this.f39307x = null;
        W();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        cy0 cy0Var = new cy0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20176s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39300b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39301c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 268435456, null, null, null, null, i11));
        org.telegram.ui.Cells.aa aaVar = this.h;
        int i12 = org.telegram.ui.ActionBar.j6.f19996i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(aaVar, 268435456, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.f20140q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, cy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, cy0Var, org.telegram.ui.ActionBar.j6.f20298z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39303n, 268435456, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39303n, 268435456, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39303n, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = 0;
        while (true) {
            org.telegram.ui.Cells.j6[] j6VarArr = this.f39305s;
            if (i14 >= j6VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 268435456, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19961g7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19979h7));
            i14++;
        }
        if (this.f39299a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.f39299a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39299a[i15], 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39299a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.j6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39299a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.f20031k6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.f20049l6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.f20122p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.e;
            if (i17 >= z6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.z6 z6Var = z6VarArr[i17];
            if (z6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(z6Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19871b7));
            }
            i17++;
        }
        int i18 = 0;
        while (true) {
            org.telegram.ui.Cells.a9[] a9VarArr = this.f39302f;
            if (i18 < a9VarArr.length) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(a9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19871b7));
                arrayList.add(new org.telegram.ui.ActionBar.l6(a9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(a9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
                i18++;
            } else {
                return arrayList;
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.F.removePrimaryClipChangedListener(this.J);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.F.addPrimaryClipChangedListener(this.J);
        W();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && !z10 && this.G) {
            this.f39299a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.f39299a[0]);
        }
    }

    public w11(SharedConfig.ProxyInfo proxyInfo) {
        super(null);
        this.e = new org.telegram.ui.Cells.z6[3];
        this.f39302f = new org.telegram.ui.Cells.a9[2];
        this.f39305s = new org.telegram.ui.Cells.j6[3];
        this.v = -1;
        this.f39306w = -1;
        this.B = 1.0f;
        this.C = new float[2];
        this.D = true;
        this.J = new ClipboardManager.OnPrimaryClipChangedListener() {
            @Override
            public final void onPrimaryClipChanged() {
                w11.this.W();
            }
        };
        this.H = proxyInfo;
    }
}
