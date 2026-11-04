package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
public final class wd0 extends org.telegram.ui.Components.vt0 implements AdapterView.OnItemSelectedListener, org.telegram.messenger.cs {
    public final org.telegram.ui.Cells.c2 E;
    public int F;
    public ks G;
    public final ArrayList H;
    public final HashMap I;
    public final HashMap J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public Toast R;
    public String S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final ud0 f50782a;
    public org.telegram.messenger.jk f50783a0;
    public final ud0 f50784b;
    public final xd0 f50785b0;
    public final TextView f50786c;
    public final org.telegram.ui.Components.vy0 d;
    public final org.telegram.ui.Components.gb0 f50787e;
    public final org.telegram.ui.Components.gb0 f50788f;
    public final TextView h;
    public final org.telegram.ui.Components.s70 f50789n;
    public final View f50790r;
    public final ImageView f50791s;
    public int f50792w;
    public int f50793x;
    public final org.telegram.ui.Cells.c2 f50794y;

    public wd0(xd0 xd0Var, Context context) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        this.f50785b0 = xd0Var;
        this.F = 0;
        this.H = new ArrayList();
        this.I = new HashMap();
        this.J = new HashMap();
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = 0;
        this.Q = 0L;
        this.T = -1;
        this.V = false;
        this.W = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.f50786c = textView;
        k2.p1.t(textView, 1, 18.0f);
        if (xd0Var.G == 2) {
            i3 = 2131752538;
        } else {
            i3 = 2131742816;
        }
        textView.setText(org.telegram.messenger.bd.M0(i3, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView, b8.mf.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new hb0(3, this, context));
        org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(context, null);
        this.f50789n = s70Var;
        if (xd0Var.G == 2) {
            i10 = 2131752539;
        } else {
            i10 = 2131744917;
        }
        s70Var.setText(org.telegram.messenger.bd.M0(i10, null));
        s70Var.setTextSize(1, 14.0f);
        s70Var.setGravity(17);
        s70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(s70Var, b8.mf.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new td0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, 2130772019);
        loadAnimation.setInterpolator(org.telegram.ui.Components.ks.f35477e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f50791s = imageView;
        imageView.setImageResource(2131232189);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, b8.mf.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, b8.mf.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.gb0 gb0Var = new org.telegram.ui.Components.gb0(context, null);
        this.f50787e = gb0Var;
        gb0Var.setText(org.telegram.messenger.bd.M0(2131751754, null));
        gb0Var.addView(linearLayout, b8.mf.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        gb0Var.setForceUseCenter(true);
        gb0Var.setFocusable(true);
        gb0Var.setContentDescription(org.telegram.messenger.bd.M0(2131751754, null));
        gb0Var.setOnFocusChangeListener(new ed(this, 9));
        addView(gb0Var, b8.mf.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        gb0Var.setOnClickListener(new View.OnClickListener(this) {
            public final wd0 f48554b;

            {
                this.f48554b = this;
            }

            @Override
            public final void onClick(View view) {
                org.telegram.ui.Components.fc fcVar;
                String str;
                int i13;
                int i14;
                int i15 = r2;
                wd0 wd0Var = this.f48554b;
                switch (i15) {
                    case 0:
                        xd0 xd0Var2 = wd0Var.f50785b0;
                        if (xd0Var2.getParentActivity() != null) {
                            boolean z10 = !xd0Var2.E;
                            xd0Var2.E = z10;
                            ((org.telegram.ui.Cells.c2) view).c(z10, true);
                            if (xd0Var2.E) {
                                fcVar = new org.telegram.ui.Components.fc(xd0Var2.f51947a0, null);
                                str = "SyncContactsOn";
                                i13 = 2131744300;
                                i14 = 2131623991;
                            } else {
                                fcVar = new org.telegram.ui.Components.fc(xd0Var2.f51947a0, null);
                                str = "SyncContactsOff";
                                i13 = 2131744301;
                                i14 = 2131623990;
                            }
                            org.telegram.messenger.k5.o(str, i13, fcVar, i14, 36);
                            return;
                        }
                        return;
                    case 1:
                        xd0 xd0Var3 = wd0Var.f50785b0;
                        if (xd0Var3.getParentActivity() != null) {
                            boolean z11 = !xd0Var3.F;
                            xd0Var3.F = z11;
                            ((org.telegram.ui.Cells.c2) view).c(z11, true);
                            if (xd0Var3.getConnectionsManager().isTestBackend() != xd0Var3.F) {
                                xd0Var3.getConnectionsManager().switchBackend(false);
                            }
                            wd0Var.q();
                            return;
                        }
                        return;
                    default:
                        os osVar = new os(wd0Var.H, true);
                        osVar.f48344r = new ur(wd0Var, 22);
                        wd0Var.f50785b0.presentFragment(osVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.gb0 gb0Var2 = new org.telegram.ui.Components.gb0(context, null);
        this.f50788f = gb0Var2;
        gb0Var2.addView(linearLayout2, b8.mf.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        gb0Var2.setText(org.telegram.messenger.bd.M0(2131747298, null));
        addView(gb0Var2, b8.mf.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, b8.mf.o(-2, -2));
        ud0 ud0Var = new ud0(this, context, 0);
        this.f50782a = ud0Var;
        ud0Var.setInputType(3);
        ud0Var.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ud0Var.setCursorWidth(1.5f);
        ud0Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, 0, 0);
        ud0Var.setTextSize(1, 16.0f);
        ud0Var.setMaxLines(1);
        ud0Var.setGravity(19);
        ud0Var.setImeOptions(268435461);
        ud0Var.setBackground(null);
        ud0Var.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        ud0Var.setContentDescription(org.telegram.messenger.bd.M0(2131748748, null));
        linearLayout2.addView(ud0Var, b8.mf.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        ud0Var.addTextChangedListener(new n0(this, 12));
        ud0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final wd0 f48275b;

            {
                this.f48275b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        wd0 wd0Var = this.f48275b;
                        if (i13 == 5) {
                            md0 md0Var = wd0Var.f50785b0.f51951c0;
                            if (md0Var != null) {
                                md0Var.h.callOnClick();
                                return true;
                            }
                            wd0Var.h(null);
                            return true;
                        }
                        wd0Var.getClass();
                        return false;
                    default:
                        ud0 ud0Var2 = this.f48275b.f50784b;
                        if (i13 == 5) {
                            ud0Var2.requestFocus();
                            ud0Var2.setSelection(ud0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f50790r = view;
        LinearLayout.LayoutParams k10 = b8.mf.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, org.telegram.messenger.g0.L(0.5f));
        linearLayout2.addView(view, k10);
        ud0 ud0Var2 = new ud0(this, context, 1);
        this.f50784b = ud0Var2;
        ud0Var2.setInputType(3);
        ud0Var2.setPadding(0, 0, 0, 0);
        ud0Var2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        ud0Var2.setCursorWidth(1.5f);
        ud0Var2.setTextSize(1, 16.0f);
        ud0Var2.setMaxLines(1);
        ud0Var2.setGravity(19);
        ud0Var2.setImeOptions(268435461);
        ud0Var2.setBackground(null);
        ud0Var2.setShowSoftInputOnFocus(org.telegram.messenger.g0.C1());
        ud0Var2.setContentDescription(org.telegram.messenger.bd.M0(2131747298, null));
        linearLayout2.addView(ud0Var2, b8.mf.c(36.0f, -1));
        ud0Var2.addTextChangedListener(new wq(this, 1));
        ud0Var2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final wd0 f48275b;

            {
                this.f48275b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i13, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        wd0 wd0Var = this.f48275b;
                        if (i13 == 5) {
                            md0 md0Var = wd0Var.f50785b0.f51951c0;
                            if (md0Var != null) {
                                md0Var.h.callOnClick();
                                return true;
                            }
                            wd0Var.h(null);
                            return true;
                        }
                        wd0Var.getClass();
                        return false;
                    default:
                        ud0 ud0Var22 = this.f48275b.f50784b;
                        if (i13 == 5) {
                            ud0Var22.requestFocus();
                            ud0Var22.setSelection(ud0Var22.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i13 = 56;
        if (xd0Var.f51979y && xd0Var.G == 0) {
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 2);
            this.f50794y = c2Var;
            c2Var.e(org.telegram.messenger.bd.M0(2131744308, "SyncContacts"), "", xd0Var.E, false, false);
            if (org.telegram.messenger.bd.f21784a0 && org.telegram.messenger.g0.O1()) {
                i12 = 56;
            } else {
                i12 = 0;
            }
            addView(c2Var, b8.mf.t(-2, -1, 51, 16, 0, 16 + i12, 0));
            c2Var.setOnClickListener(new View.OnClickListener(this) {
                public final wd0 f48554b;

                {
                    this.f48554b = this;
                }

                @Override
                public final void onClick(View view2) {
                    org.telegram.ui.Components.fc fcVar;
                    String str;
                    int i132;
                    int i14;
                    int i15 = r2;
                    wd0 wd0Var = this.f48554b;
                    switch (i15) {
                        case 0:
                            xd0 xd0Var2 = wd0Var.f50785b0;
                            if (xd0Var2.getParentActivity() != null) {
                                boolean z10 = !xd0Var2.E;
                                xd0Var2.E = z10;
                                ((org.telegram.ui.Cells.c2) view2).c(z10, true);
                                if (xd0Var2.E) {
                                    fcVar = new org.telegram.ui.Components.fc(xd0Var2.f51947a0, null);
                                    str = "SyncContactsOn";
                                    i132 = 2131744300;
                                    i14 = 2131623991;
                                } else {
                                    fcVar = new org.telegram.ui.Components.fc(xd0Var2.f51947a0, null);
                                    str = "SyncContactsOff";
                                    i132 = 2131744301;
                                    i14 = 2131623990;
                                }
                                org.telegram.messenger.k5.o(str, i132, fcVar, i14, 36);
                                return;
                            }
                            return;
                        case 1:
                            xd0 xd0Var3 = wd0Var.f50785b0;
                            if (xd0Var3.getParentActivity() != null) {
                                boolean z11 = !xd0Var3.F;
                                xd0Var3.F = z11;
                                ((org.telegram.ui.Cells.c2) view2).c(z11, true);
                                if (xd0Var3.getConnectionsManager().isTestBackend() != xd0Var3.F) {
                                    xd0Var3.getConnectionsManager().switchBackend(false);
                                }
                                wd0Var.q();
                                return;
                            }
                            return;
                        default:
                            os osVar = new os(wd0Var.H, true);
                            osVar.f48344r = new ur(wd0Var, 22);
                            wd0Var.f50785b0.presentFragment(osVar);
                            return;
                    }
                }
            });
            i11 = 48;
        } else {
            i11 = 72;
        }
        boolean z10 = org.telegram.messenger.r2.f25040a;
        if (xd0Var.G == 0) {
            org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(context, 2);
            this.E = c2Var2;
            String M0 = org.telegram.messenger.bd.M0(2131751607, null);
            boolean isTestBackend = xd0Var.getConnectionsManager().isTestBackend();
            xd0Var.F = isTestBackend;
            c2Var2.e(M0, "", isTestBackend, false, false);
            addView(c2Var2, b8.mf.t(-2, -1, 51, 16, 0, 16 + ((org.telegram.messenger.bd.f21784a0 && org.telegram.messenger.g0.O1()) ? i13 : 0), 0));
            i11 -= 24;
            c2Var2.setOnClickListener(new View.OnClickListener(this) {
                public final wd0 f48554b;

                {
                    this.f48554b = this;
                }

                @Override
                public final void onClick(View view2) {
                    org.telegram.ui.Components.fc fcVar;
                    String str;
                    int i132;
                    int i14;
                    int i15 = r2;
                    wd0 wd0Var = this.f48554b;
                    switch (i15) {
                        case 0:
                            xd0 xd0Var2 = wd0Var.f50785b0;
                            if (xd0Var2.getParentActivity() != null) {
                                boolean z102 = !xd0Var2.E;
                                xd0Var2.E = z102;
                                ((org.telegram.ui.Cells.c2) view2).c(z102, true);
                                if (xd0Var2.E) {
                                    fcVar = new org.telegram.ui.Components.fc(xd0Var2.f51947a0, null);
                                    str = "SyncContactsOn";
                                    i132 = 2131744300;
                                    i14 = 2131623991;
                                } else {
                                    fcVar = new org.telegram.ui.Components.fc(xd0Var2.f51947a0, null);
                                    str = "SyncContactsOff";
                                    i132 = 2131744301;
                                    i14 = 2131623990;
                                }
                                org.telegram.messenger.k5.o(str, i132, fcVar, i14, 36);
                                return;
                            }
                            return;
                        case 1:
                            xd0 xd0Var3 = wd0Var.f50785b0;
                            if (xd0Var3.getParentActivity() != null) {
                                boolean z11 = !xd0Var3.F;
                                xd0Var3.F = z11;
                                ((org.telegram.ui.Cells.c2) view2).c(z11, true);
                                if (xd0Var3.getConnectionsManager().isTestBackend() != xd0Var3.F) {
                                    xd0Var3.getConnectionsManager().switchBackend(false);
                                }
                                wd0Var.q();
                                return;
                            }
                            return;
                        default:
                            os osVar = new os(wd0Var.H, true);
                            osVar.f48344r = new ur(wd0Var, 22);
                            wd0Var.f50785b0.presentFragment(osVar);
                            return;
                    }
                }
            });
        }
        if (i11 > 0 && !org.telegram.messenger.g0.O1()) {
            View space = new Space(context);
            space.setMinimumHeight(org.telegram.messenger.g0.L(i11));
            addView(space, b8.mf.o(-2, -2));
        }
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                ?? obj = new Object();
                obj.f47004a = split[2];
                String str = split[0];
                obj.f47006c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String i02 = org.telegram.messenger.bd.i0(2131750529, obj.d);
                    if (!TextUtils.isEmpty(i02) && !TextUtils.equals(obj.d, i02)) {
                        obj.f47005b = obj.f47004a;
                        obj.f47004a = i02;
                    }
                }
                this.H.add(0, obj);
                List list = (List) this.I.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.I;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(obj);
                if (split.length > 3) {
                    this.J.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Collections.sort(this.H, Comparator$CC.comparing(new fa.b(13)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f25457b.getSystemService("phone");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        ConnectionsManager.getInstance(xd0Var.getAccountInstance().f21919a).sendRequest(new TLRPC.TL_help_getNearestDc(), new xy(13, this, hashMap), 10);
        if (this.f50782a.length() == 0) {
            setCountryButtonText(null);
            this.f50784b.setHintText((String) null);
            this.F = 1;
        }
        if (this.f50782a.length() != 0) {
            this.f50784b.requestFocus();
            ud0 ud0Var3 = this.f50784b;
            ud0Var3.setSelection(ud0Var3.length());
        } else {
            this.f50782a.requestFocus();
        }
        q();
    }

    public void setCountryButtonText(CharSequence charSequence) {
        int i3;
        boolean z10;
        float f10;
        Context context = org.telegram.messenger.t0.f25457b;
        if (this.d.getCurrentView().getText() != null && charSequence == null) {
            i3 = 2130772021;
        } else {
            i3 = 2130772020;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i3);
        loadAnimation.setInterpolator(org.telegram.ui.Components.ks.f35477e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.vy0 vy0Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        vy0Var.a(charSequence, z10, false);
        org.telegram.ui.Components.gb0 gb0Var = this.f50787e;
        if (charSequence != null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        gb0Var.b(f10, f10, true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void d() {
        this.N = false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override
    public final void f() {
        org.telegram.messenger.jk jkVar = this.f50783a0;
        if (jkVar != null) {
            jkVar.run();
            this.f50783a0 = null;
        }
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131742806, "YourPhone");
    }

    @Override
    public final void h(String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i3;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i10;
        boolean z17;
        if (this.f50785b0.getParentActivity() != null && !this.N && !this.f50785b0.f51967q0) {
            boolean z18 = org.telegram.messenger.r2.f25040a;
            org.telegram.messenger.a8.b("sim status = " + ((TelephonyManager) org.telegram.messenger.t0.f25457b.getSystemService("phone")).getSimState());
            if (this.f50782a.length() != 0 && this.f50784b.length() != 0) {
                String str2 = "+" + ((Object) this.f50782a.getText()) + " " + ((Object) this.f50784b.getText());
                if (!this.O) {
                    Point point = org.telegram.messenger.g0.f22608q;
                    if (point.x > point.y && !this.f50785b0.q1() && this.f50785b0.T.Q() > org.telegram.messenger.g0.L(20.0f)) {
                        xd0 xd0Var = this.f50785b0;
                        xd0Var.U = new nd0(this, 1);
                        org.telegram.messenger.g0.v1(xd0Var.fragmentView);
                        return;
                    }
                    xd0 xd0Var2 = this.f50785b0;
                    Context context = this.f50785b0.fragmentView.getContext();
                    xd0 xd0Var3 = this.f50785b0;
                    xd0Var2.f51951c0 = new md0(context, (ViewGroup) xd0Var3.fragmentView, xd0Var3.O, str2, new f(this, 21));
                    md0 md0Var = this.f50785b0.f51951c0;
                    md0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new ld0(md0Var, 0));
                    duration.addUpdateListener(new jd0(md0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                    duration.start();
                    return;
                }
                this.O = false;
                md0 md0Var2 = this.f50785b0.f51951c0;
                if (md0Var2 != null) {
                    int i11 = md0.G;
                    md0Var2.a();
                }
                boolean N1 = org.telegram.messenger.g0.N1();
                int i12 = Build.VERSION.SDK_INT;
                if (N1) {
                    if (this.f50785b0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.f50785b0.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i12 >= 28 && this.f50785b0.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (i12 >= 26 && this.f50785b0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    xd0 xd0Var4 = this.f50785b0;
                    z10 = N1;
                    if (xd0Var4.f51975w) {
                        xd0Var4.f51968r.clear();
                        if (!z12) {
                            this.f50785b0.f51968r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.f50785b0.f51968r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.f50785b0.f51968r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i12 >= 26) {
                            this.f50785b0.f51968r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.f50785b0.f51968r.isEmpty()) {
                            SharedPreferences e12 = org.telegram.messenger.hp.e1();
                            if (!e12.getBoolean("firstlogin", true) && !this.f50785b0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.f50785b0.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.f50785b0.getParentActivity().requestPermissions((String[]) this.f50785b0.f51968r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            e12.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f50785b0.getParentActivity());
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, "Continue"), null);
                            int i13 = 2131623958;
                            if (!z12 && (!z13 || !z14)) {
                                alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131754274, "AllowReadCallAndLog");
                            } else if (z13 && z14) {
                                alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131754275, "AllowReadCall");
                                i13 = 2131624066;
                            } else {
                                alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131754273, "AllowReadCallLog");
                            }
                            int i14 = org.telegram.ui.ActionBar.k6.L5;
                            alertDialog$Builder.m(i13, 46, org.telegram.ui.ActionBar.k6.x0(null, i14, false), null);
                            alertDialog$Builder.n(i14, null);
                            xd0 xd0Var5 = this.f50785b0;
                            xd0Var5.h = xd0Var5.showDialog(alertDialog$Builder.f27343a);
                            this.O = true;
                            return;
                        }
                    }
                    z11 = true;
                } else {
                    z10 = N1;
                    z11 = true;
                    z12 = true;
                    z13 = true;
                    z14 = true;
                }
                if (this.F == z11) {
                    this.f50785b0.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752134, "ChooseCountry"));
                    this.f50785b0.t1(false, z11);
                    return;
                }
                String str3 = "";
                String d = mf.b.d("" + ((Object) this.f50782a.getText()) + ((Object) this.f50784b.getText()), false);
                xd0 xd0Var6 = this.f50785b0;
                if (xd0Var6.G == 0 && (xd0Var6.getParentActivity() instanceof LaunchActivity)) {
                    for (int i15 = 0; i15 < 4; i15++) {
                        org.telegram.messenger.h10 i16 = org.telegram.messenger.h10.i(i15);
                        if (i16.p() && PhoneNumberUtils.compare(d, i16.f().phone)) {
                            boolean isTestBackend = ConnectionsManager.getInstance(i15).isTestBackend();
                            xd0 xd0Var7 = this.f50785b0;
                            if (isTestBackend == xd0Var7.F) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xd0Var7.getParentActivity());
                                alertDialog$Builder2.f27343a.S = org.telegram.messenger.bd.M0(2131689472, null);
                                alertDialog$Builder2.f27343a.U = org.telegram.messenger.bd.M0(2131754709, "AccountAlreadyLoggedIn");
                                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131754694, "AccountSwitch"), new k2.q(this, i15, 14));
                                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747839, "OK"), null);
                                this.f50785b0.showDialog(alertDialog$Builder2.f27343a);
                                this.f50785b0.t1(false, true);
                                return;
                            }
                        }
                    }
                }
                ArrayList arrayList = null;
                TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
                if (z10 && z12 && z13 && z14) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                tL_codeSettings.allow_flashcall = z15;
                if (z10 && z12) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                tL_codeSettings.allow_missed_call = z16;
                boolean hasServices = org.telegram.messenger.lt.f24103b.hasServices();
                tL_codeSettings.allow_firebase = hasServices;
                tL_codeSettings.allow_app_hash = hasServices;
                if (this.f50785b0.m0 || TextUtils.isEmpty(org.telegram.messenger.r2.f25044f)) {
                    tL_codeSettings.allow_firebase = false;
                }
                ArrayList b10 = org.telegram.messenger.v0.b();
                if (b10 != null) {
                    for (int i17 = 0; i17 < b10.size(); i17++) {
                        if (((TLRPC.TL_auth_authorization) b10.get(i17)).future_auth_token != null) {
                            if (tL_codeSettings.logout_tokens == null) {
                                tL_codeSettings.logout_tokens = new ArrayList<>();
                            }
                            boolean z19 = org.telegram.messenger.r2.f25040a;
                            org.telegram.messenger.a8.b("login token to check ".concat(new String(((TLRPC.TL_auth_authorization) b10.get(i17)).future_auth_token, StandardCharsets.UTF_8)));
                            tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_authorization) b10.get(i17)).future_auth_token);
                            if (tL_codeSettings.logout_tokens.size() >= 20) {
                                break;
                            }
                        }
                    }
                }
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("saved_tokens", 0);
                int i18 = sharedPreferences.getInt("count", 0);
                if (i18 != 0) {
                    arrayList = new ArrayList();
                    int i19 = 0;
                    while (i19 < i18) {
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        SerializedData serializedData = new SerializedData(Utilities.v(sharedPreferences.getString("log_out_token_" + i19, str3)));
                        String str4 = str3;
                        TLRPC.TL_auth_loggedOut TLdeserialize = TLRPC.TL_auth_loggedOut.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                        if (TLdeserialize != null) {
                            arrayList.add(TLdeserialize);
                        }
                        i19++;
                        sharedPreferences = sharedPreferences2;
                        str3 = str4;
                    }
                }
                if (arrayList != null) {
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        if (tL_codeSettings.logout_tokens == null) {
                            tL_codeSettings.logout_tokens = new ArrayList<>();
                        }
                        tL_codeSettings.logout_tokens.add(((TLRPC.TL_auth_loggedOut) arrayList.get(i20)).future_auth_token);
                        if (tL_codeSettings.logout_tokens.size() >= 20) {
                            break;
                        }
                    }
                    SharedPreferences sharedPreferences3 = org.telegram.messenger.t0.f25457b.getSharedPreferences("saved_tokens", 0);
                    ArrayList arrayList2 = new ArrayList();
                    sharedPreferences3.edit().clear().apply();
                    System.currentTimeMillis();
                    for (int i21 = 0; i21 < Math.min(20, arrayList.size()); i21++) {
                        arrayList2.add((TLRPC.TL_auth_loggedOut) arrayList.get(i21));
                    }
                    if (arrayList2.size() > 0) {
                        SharedPreferences.Editor edit = sharedPreferences3.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                            SerializedData serializedData2 = new SerializedData(((TLRPC.TL_auth_loggedOut) arrayList2.get(i22)).getObjectSize());
                            ((TLRPC.TL_auth_loggedOut) arrayList2.get(i22)).serializeToStream(serializedData2);
                            edit.putString("log_out_token_" + i22, Utilities.f(serializedData2.toByteArray()));
                        }
                        edit.apply();
                    }
                }
                if (tL_codeSettings.logout_tokens != null) {
                    tL_codeSettings.flags |= 64;
                }
                SharedPreferences sharedPreferences4 = org.telegram.messenger.t0.f25457b.getSharedPreferences("mainconfig", 0);
                sharedPreferences4.edit().remove("sms_hash_code").apply();
                if (tL_codeSettings.allow_app_hash) {
                    SharedPreferences.Editor edit2 = sharedPreferences4.edit();
                    org.telegram.messenger.t0.u();
                    edit2.putString("sms_hash", "O2P2z+/jBpJ").apply();
                } else {
                    sharedPreferences4.edit().remove("sms_hash").apply();
                }
                if (tL_codeSettings.allow_flashcall) {
                    try {
                        HashSet c12 = xd0.c1(this.f50785b0);
                        if (!c12.isEmpty()) {
                            tL_codeSettings.unknown_number = false;
                            tL_codeSettings.current_number = Collection.EL.stream(c12).anyMatch(new c60(d, 1));
                        } else {
                            tL_codeSettings.unknown_number = true;
                            if (org.telegram.messenger.h10.c() > 0) {
                                tL_codeSettings.allow_flashcall = false;
                            } else {
                                tL_codeSettings.current_number = false;
                            }
                        }
                    } catch (Exception e11) {
                        tL_codeSettings.unknown_number = true;
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                xd0 xd0Var8 = this.f50785b0;
                if (xd0Var8.G != 2) {
                    i3 = ((org.telegram.ui.ActionBar.d2) xd0Var8).currentAccount;
                    ConnectionsManager.getInstance(i3).cleanup(false);
                    TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                    tL_auth_sendCode2.api_hash = org.telegram.messenger.r2.f25043e;
                    tL_auth_sendCode2.api_id = org.telegram.messenger.r2.d;
                    tL_auth_sendCode2.phone_number = d;
                    tL_auth_sendCode2.settings = tL_codeSettings;
                    tL_auth_sendCode = tL_auth_sendCode2;
                } else {
                    TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                    sendchangephonecode.phone_number = d;
                    sendchangephonecode.settings = tL_codeSettings;
                    tL_auth_sendCode = sendchangephonecode;
                }
                TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
                Bundle bundle = new Bundle();
                bundle.putString("phone", "+" + ((Object) this.f50782a.getText()) + " " + ((Object) this.f50784b.getText()));
                try {
                    bundle.putString("ephone", "+" + mf.b.d(this.f50782a.getText().toString(), false) + " " + mf.b.d(this.f50784b.getText().toString(), false));
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    bundle.putString("ephone", "+" + d);
                }
                bundle.putString("phoneFormated", d);
                ks ksVar = this.G;
                if (ksVar != null) {
                    bundle.putString("country", ksVar.f47006c);
                }
                this.N = true;
                ?? obj = new Object();
                obj.f16871c = "+" + ((Object) this.f50782a.getText()) + " " + ((Object) this.f50784b.getText());
                obj.f16870b = this.G;
                obj.f16869a = (List) this.J.get(this.f50782a.getText().toString());
                i10 = ((org.telegram.ui.ActionBar.d2) this.f50785b0).currentAccount;
                this.f50785b0.w1(ConnectionsManager.getInstance(i10).sendRequest(tL_auth_sendCode3, new ci.s7(this, bundle, d, obj, tL_auth_sendCode3, 10), 27), true);
                return;
            }
            xd0.b1(this.f50785b0, this.f50788f, false);
        }
    }

    @Override
    public final void j() {
        o();
        org.telegram.ui.Cells.c2 c2Var = this.f50794y;
        if (c2Var != null) {
            c2Var.c(this.f50785b0.E, false);
        }
        org.telegram.messenger.g0.i3(new nd0(this, 0), xd0.f51945z0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f50782a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f50784b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f50782a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f50784b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    public final void o() {
        boolean z10;
        boolean z11;
        xd0 xd0Var;
        boolean z12;
        ks ksVar;
        if (!this.U && this.f50785b0.G == 0) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) org.telegram.messenger.t0.f25457b.getSystemService("phone");
                if (org.telegram.messenger.g0.N1()) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (this.f50785b0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i3 >= 26 && this.f50785b0.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z11 = false;
                        xd0Var = this.f50785b0;
                        if (!xd0Var.f51977x && (!z10 || !z11)) {
                            xd0Var.f51970s.clear();
                            if (!z10) {
                                this.f50785b0.f51970s.add("android.permission.READ_PHONE_STATE");
                            }
                            if (!z11 && i3 >= 26) {
                                this.f50785b0.f51970s.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (!this.f50785b0.f51970s.isEmpty()) {
                                new tb0(10, this, new ArrayList(this.f50785b0.f51970s)).run();
                                return;
                            }
                            return;
                        }
                        this.U = true;
                        if (xd0Var.f51979y && z10 && z11) {
                            this.f50782a.setAlpha(0.0f);
                            this.f50784b.setAlpha(0.0f);
                            String d = mf.b.d(telephonyManager.getLine1Number(), false);
                            if (!TextUtils.isEmpty(d)) {
                                int i10 = 4;
                                String str = null;
                                if (d.length() > 4) {
                                    while (true) {
                                        if (i10 >= 1) {
                                            String substring = d.substring(0, i10);
                                            List list = (List) this.I.get(substring);
                                            if (list == null) {
                                                ksVar = null;
                                            } else if (list.size() > 1) {
                                                String string = org.telegram.messenger.hp.e1().getString("phone_code_last_matched_" + substring, null);
                                                ksVar = (ks) list.get(list.size() - 1);
                                                if (string != null) {
                                                    ArrayList arrayList = this.H;
                                                    int size = arrayList.size();
                                                    int i11 = 0;
                                                    while (true) {
                                                        if (i11 >= size) {
                                                            break;
                                                        }
                                                        Object obj = arrayList.get(i11);
                                                        i11++;
                                                        ks ksVar2 = (ks) obj;
                                                        if (Objects.equals(ksVar2.d, string)) {
                                                            ksVar = ksVar2;
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                ksVar = (ks) list.get(0);
                                            }
                                            if (ksVar != null) {
                                                str = d.substring(i10);
                                                this.f50782a.setText(substring);
                                                z12 = true;
                                                break;
                                            }
                                            i10--;
                                        } else {
                                            z12 = false;
                                            break;
                                        }
                                    }
                                    if (!z12) {
                                        str = d.substring(1);
                                        this.f50782a.setText(d.substring(0, 1));
                                    }
                                }
                                if (str != null) {
                                    this.f50784b.requestFocus();
                                    this.f50784b.setText(str);
                                    ud0 ud0Var = this.f50784b;
                                    ud0Var.setSelection(ud0Var.length());
                                }
                            }
                            if (this.f50784b.length() > 0) {
                                AnimatorSet duration = new AnimatorSet().setDuration(300L);
                                ud0 ud0Var2 = this.f50782a;
                                Property property = View.ALPHA;
                                duration.playTogether(ObjectAnimator.ofFloat(ud0Var2, property, 1.0f), ObjectAnimator.ofFloat(this.f50784b, property, 1.0f));
                                duration.start();
                                this.O = true;
                                return;
                            }
                            this.f50782a.setAlpha(1.0f);
                            this.f50784b.setAlpha(1.0f);
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    xd0Var = this.f50785b0;
                    if (!xd0Var.f51977x) {
                    }
                    this.U = true;
                    if (xd0Var.f51979y) {
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j10) {
        if (this.K) {
            this.K = false;
            return;
        }
        this.L = true;
        this.f50782a.setText(((ks) this.H.get(i3)).f47006c);
        this.L = false;
    }

    public final void p() {
        String str;
        int i3;
        String str2 = this.S;
        ud0 ud0Var = this.f50784b;
        if (ud0Var.getText() == null) {
            str = "";
        } else {
            str = ud0Var.getText().toString().replace(" ", "");
        }
        HashMap hashMap = this.J;
        String str3 = null;
        if (hashMap.get(str2) != null && !((List) hashMap.get(str2)).isEmpty()) {
            List list = (List) hashMap.get(str2);
            if (!str.isEmpty()) {
                i3 = 0;
                while (i3 < list.size()) {
                    if (str.startsWith(((String) list.get(i3)).replace(" ", "").replace("X", "").replace("0", ""))) {
                        break;
                    }
                    i3++;
                }
            }
            i3 = -1;
            if (i3 == -1) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    String str4 = (String) list.get(i10);
                    if (str4.startsWith("X") || str4.startsWith("0")) {
                        i3 = i10;
                        break;
                    }
                }
                if (i3 == -1) {
                    i3 = 0;
                }
            }
            if (this.T != i3) {
                String str5 = (String) ((List) hashMap.get(str2)).get(i3);
                int selectionStart = ud0Var.getSelectionStart();
                int selectionEnd = ud0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                ud0Var.setHintText(str3);
                ud0Var.setSelection(Math.max(0, Math.min(ud0Var.length(), selectionStart)), Math.max(0, Math.min(ud0Var.length(), selectionEnd)));
                this.T = i3;
            }
        } else if (this.T != -1) {
            int selectionStart2 = ud0Var.getSelectionStart();
            int selectionEnd2 = ud0Var.getSelectionEnd();
            ud0Var.setHintText((String) null);
            ud0Var.setSelection(selectionStart2, selectionEnd2);
            this.T = -1;
        }
    }

    public final void q() {
        String country;
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (org.telegram.messenger.bd.E0().B != null) {
            country = org.telegram.messenger.bd.E0().B.c();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        this.f50785b0.getConnectionsManager().sendRequest(tL_help_getCountriesList, new rd0(this, 0), 10);
    }

    public final void r(final boolean z10) {
        boolean z11;
        final int i3;
        org.telegram.messenger.jk jkVar;
        xd0 xd0Var = this.f50785b0;
        if (xd0Var.G == 0 && Build.VERSION.SDK_INT >= 28 && (z11 = org.telegram.messenger.r2.f25046i) && !this.W) {
            if (z10 || !this.V) {
                this.W = true;
                this.V = true;
                final Context context = getContext();
                i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                final qd0 qd0Var = new qd0(this, 0);
                if (!z11) {
                    jkVar = null;
                } else {
                    kotlin.jvm.internal.j.e(context, "context");
                    final androidx.biometric.t tVar = new androidx.biometric.t(context, 2);
                    final boolean[] zArr = new boolean[1];
                    TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
                    initpasskeylogin.api_id = org.telegram.messenger.r2.d;
                    initpasskeylogin.api_hash = org.telegram.messenger.r2.f25043e;
                    final Runnable[] runnableArr = {new org.telegram.messenger.rd(i3, ConnectionsManager.getInstance(i3).sendRequestTyped(initpasskeylogin, new c3.b(1), new org.telegram.messenger.n10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            gt.a(zArr, qd0Var, z10, tVar, context, i3, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
                        }
                    }, 8), 1)};
                    jkVar = new org.telegram.messenger.jk(zArr, runnableArr, 1);
                }
                this.f50783a0 = jkVar;
            }
        }
    }

    public final void s(String str, ks ksVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String F0 = org.telegram.messenger.bd.F0(ksVar.d);
        if (F0 != null) {
            spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.fy(4), F0.length(), F0.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) ksVar.f47004a);
        setCountryButtonText(org.telegram.messenger.i6.m(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false, null, 0));
        this.S = str;
        this.T = -1;
        p();
    }

    @Override
    public final void updateColors() {
        this.f50786c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false);
        org.telegram.ui.Components.s70 s70Var = this.f50789n;
        s70Var.setTextColor(x02);
        s70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        int i3 = 0;
        while (true) {
            org.telegram.ui.Components.vy0 vy0Var = this.d;
            if (i3 >= vy0Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) vy0Var.getChildAt(i3);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.H6, false));
            i3++;
        }
        int i10 = org.telegram.ui.ActionBar.k6.H6;
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = this.f50792w;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        ImageView imageView = this.f50791s;
        xd0.l1(imageView, x03, i11, mode);
        this.f50792w = x03;
        int themedColor = this.f50785b0.getThemedColor(org.telegram.ui.ActionBar.k6.f27972i6);
        xd0.m1(imageView, themedColor, this.f50793x);
        this.f50793x = themedColor;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        ud0 ud0Var = this.f50782a;
        ud0Var.setTextColor(x04);
        int i13 = org.telegram.ui.ActionBar.k6.f28026l6;
        ud0Var.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        this.f50790r.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28007k6, false));
        int x05 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        ud0 ud0Var2 = this.f50784b;
        ud0Var2.setTextColor(x05);
        ud0Var2.setHintTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        ud0Var2.setCursorColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        org.telegram.ui.Cells.c2 c2Var = this.f50794y;
        if (c2Var != null) {
            int i14 = org.telegram.ui.ActionBar.k6.Y6;
            int i15 = org.telegram.ui.ActionBar.k6.W6;
            int i16 = org.telegram.ui.ActionBar.k6.X6;
            CheckBoxSquare checkBoxSquare = c2Var.f29037n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f31350s = i14;
                checkBoxSquare.f31351w = i15;
                checkBoxSquare.f31352x = i16;
                checkBoxSquare.invalidate();
            }
            c2Var.g();
        }
        org.telegram.ui.Cells.c2 c2Var2 = this.E;
        if (c2Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.k6.Y6;
            int i18 = org.telegram.ui.ActionBar.k6.W6;
            int i19 = org.telegram.ui.ActionBar.k6.X6;
            CheckBoxSquare checkBoxSquare2 = c2Var2.f29037n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f31350s = i17;
                checkBoxSquare2.f31351w = i18;
                checkBoxSquare2.f31352x = i19;
                checkBoxSquare2.invalidate();
            }
            c2Var2.g();
        }
        this.f50788f.f();
        this.f50787e.f();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
