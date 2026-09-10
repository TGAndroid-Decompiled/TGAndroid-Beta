package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
public final class wg0 extends org.telegram.ui.Components.fw0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
    public final ArrayList E;
    public final HashMap F;
    public final HashMap G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public long N;
    public Toast O;
    public String P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Runnable U;
    public final xg0 V;
    public final ck0 f38179a;
    public final tg0 f38180b;
    public final TextView f38181c;
    public final org.telegram.ui.Components.d11 d;
    public final org.telegram.ui.Components.hd0 e;
    public final org.telegram.ui.Components.hd0 f38182f;
    public final TextView h;
    public final org.telegram.ui.Components.m90 f38183n;
    public final View f38184r;
    public final ImageView f38185s;
    public final org.telegram.ui.Cells.z1 v;
    public final org.telegram.ui.Cells.z1 f38186w;
    public int f38187x;
    public wt f38188y;

    public wg0(xg0 xg0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        this.V = xg0Var;
        this.f38187x = 0;
        this.E = new ArrayList();
        this.F = new HashMap();
        this.G = new HashMap();
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = 0;
        this.N = 0L;
        this.Q = -1;
        this.S = false;
        this.T = false;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(context);
        this.f38181c = textView;
        com.google.android.gms.internal.vision.e2.k(18.0f, 1, textView);
        if (xg0Var.F == 2) {
            i10 = R.string.ChangePhoneNewNumber;
        } else {
            i10 = R.string.YourNumber;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.a6.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new ow(18, this, context));
        org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(context, null);
        this.f38183n = m90Var;
        if (xg0Var.F == 2) {
            i11 = R.string.ChangePhoneHelp;
        } else {
            i11 = R.string.StartText;
        }
        m90Var.setText(LocaleController.getString(i11));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setGravity(17);
        m90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(m90Var, w7.a6.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new sg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.pt.e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f38185s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, w7.a6.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.a6.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.hd0 hd0Var = new org.telegram.ui.Components.hd0(context, null);
        this.e = hd0Var;
        hd0Var.setText(LocaleController.getString(R.string.Country));
        hd0Var.addView(linearLayout, w7.a6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        hd0Var.setForceUseCenter(true);
        hd0Var.setFocusable(true);
        hd0Var.setContentDescription(LocaleController.getString(R.string.Country));
        hd0Var.setOnFocusChangeListener(new qd(this, 9));
        addView(hd0Var, w7.a6.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        hd0Var.setOnClickListener(new View.OnClickListener(this) {
            public final wg0 f35270b;

            {
                this.f35270b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        xg0 xg0Var2 = this.f35270b.V;
                        if (xg0Var2.getParentActivity() != null) {
                            boolean z11 = !xg0Var2.f38744y;
                            xg0Var2.f38744y = z11;
                            ((org.telegram.ui.Cells.z1) view).c(z11, true);
                            if (xg0Var2.f38744y) {
                                new org.telegram.ui.Components.wc(xg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                return;
                            } else {
                                new org.telegram.ui.Components.wc(xg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                return;
                            }
                        }
                        return;
                    default:
                        wg0 wg0Var = this.f35270b;
                        bu buVar = new bu(wg0Var.E, true);
                        buVar.f31405r = new iu(wg0Var, 20);
                        wg0Var.V.presentFragment(buVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.hd0 hd0Var2 = new org.telegram.ui.Components.hd0(context, null);
        this.f38182f = hd0Var2;
        hd0Var2.addView(linearLayout2, w7.a6.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        hd0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(hd0Var2, w7.a6.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, w7.a6.n(-2, -2));
        ck0 ck0Var = new ck0(this, context, 2);
        this.f38179a = ck0Var;
        ck0Var.setInputType(3);
        ck0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        ck0Var.setCursorWidth(1.5f);
        ck0Var.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        ck0Var.setTextSize(1, 16.0f);
        ck0Var.setMaxLines(1);
        ck0Var.setGravity(19);
        ck0Var.setImeOptions(268435461);
        ck0Var.setBackground(null);
        ck0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        ck0Var.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(ck0Var, w7.a6.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        ck0Var.addTextChangedListener(new m0(this, 10));
        ck0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final wg0 f34945b;

            {
                this.f34945b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        wg0 wg0Var = this.f34945b;
                        if (i14 == 5) {
                            kg0 kg0Var = wg0Var.V.f38720b0;
                            if (kg0Var != null) {
                                kg0Var.h.callOnClick();
                                return true;
                            }
                            wg0Var.h(null);
                            return true;
                        }
                        wg0Var.getClass();
                        return false;
                    default:
                        tg0 tg0Var = this.f34945b.f38180b;
                        if (i14 == 5) {
                            tg0Var.requestFocus();
                            tg0Var.setSelection(tg0Var.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f38184r = view;
        LinearLayout.LayoutParams k10 = w7.a6.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        tg0 tg0Var = new tg0(this, context);
        this.f38180b = tg0Var;
        tg0Var.setInputType(3);
        tg0Var.setPadding(0, 0, 0, 0);
        tg0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        tg0Var.setCursorWidth(1.5f);
        tg0Var.setTextSize(1, 16.0f);
        tg0Var.setMaxLines(1);
        tg0Var.setGravity(19);
        tg0Var.setImeOptions(268435461);
        tg0Var.setBackground(null);
        tg0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        tg0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(tg0Var, w7.a6.c(36.0f, -1));
        tg0Var.addTextChangedListener(new es(this, 1));
        tg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final wg0 f34945b;

            {
                this.f34945b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        wg0 wg0Var = this.f34945b;
                        if (i14 == 5) {
                            kg0 kg0Var = wg0Var.V.f38720b0;
                            if (kg0Var != null) {
                                kg0Var.h.callOnClick();
                                return true;
                            }
                            wg0Var.h(null);
                            return true;
                        }
                        wg0Var.getClass();
                        return false;
                    default:
                        tg0 tg0Var2 = this.f34945b.f38180b;
                        if (i14 == 5) {
                            tg0Var2.requestFocus();
                            tg0Var2.setSelection(tg0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i14 = 56;
        if (xg0Var.f38743x && xg0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 2);
            this.v = z1Var;
            z1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", xg0Var.f38744y, false, false);
            if (LocaleController.isRTL && AndroidUtilities.isSmallScreen()) {
                i13 = 56;
            } else {
                i13 = 0;
            }
            addView(z1Var, w7.a6.t(-2, -1, 51, 16, 0, 16 + i13, 0));
            z1Var.setOnClickListener(new View.OnClickListener(this) {
                public final wg0 f35270b;

                {
                    this.f35270b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            xg0 xg0Var2 = this.f35270b.V;
                            if (xg0Var2.getParentActivity() != null) {
                                boolean z11 = !xg0Var2.f38744y;
                                xg0Var2.f38744y = z11;
                                ((org.telegram.ui.Cells.z1) view2).c(z11, true);
                                if (xg0Var2.f38744y) {
                                    new org.telegram.ui.Components.wc(xg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    return;
                                } else {
                                    new org.telegram.ui.Components.wc(xg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    return;
                                }
                            }
                            return;
                        default:
                            wg0 wg0Var = this.f35270b;
                            bu buVar = new bu(wg0Var.E, true);
                            buVar.f31405r = new iu(wg0Var, 20);
                            wg0Var.V.presentFragment(buVar);
                            return;
                    }
                }
            });
            i12 = 48;
        } else {
            i12 = 72;
        }
        if (!BuildVars.DEBUG_VERSION && !xg0Var.getConnectionsManager().isTestBackend()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && xg0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(context, 2);
            this.f38186w = z1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = xg0Var.getConnectionsManager().isTestBackend();
            xg0Var.E = isTestBackend;
            z1Var2.e(string, "", isTestBackend, false, false);
            addView(z1Var2, w7.a6.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 0 : 0), 0));
            i12 -= 24;
            z1Var2.setOnClickListener(new org.telegram.ui.ActionBar.e0(6, this, z10));
        }
        if (i12 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i12));
            addView(space, w7.a6.n(-2, -2));
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
                obj.f38386a = split[2];
                String str = split[0];
                obj.f38388c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(obj.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(obj.d, countryName)) {
                        obj.f38387b = obj.f38386a;
                        obj.f38386a = countryName;
                    }
                }
                this.E.add(0, obj);
                List list = (List) this.F.get(split[0]);
                if (list == null) {
                    HashMap hashMap2 = this.F;
                    String str2 = split[0];
                    ArrayList arrayList = new ArrayList();
                    hashMap2.put(str2, arrayList);
                    list = arrayList;
                }
                list.add(obj);
                if (split.length > 3) {
                    this.G.put(split[0], Collections.singletonList(split[3]));
                }
                hashMap.put(split[1], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Collections.sort(this.E, Comparator$CC.comparing(new l8(6)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        xg0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new org.telegram.ui.Components.th(29, this, hashMap), 10);
        if (this.f38179a.length() == 0) {
            setCountryButtonText(null);
            this.f38180b.setHintText((String) null);
            this.f38187x = 1;
        }
        if (this.f38179a.length() != 0) {
            this.f38180b.requestFocus();
            tg0 tg0Var2 = this.f38180b;
            tg0Var2.setSelection(tg0Var2.length());
        } else {
            this.f38179a.requestFocus();
        }
        s();
    }

    public static void o(wg0 wg0Var, ArrayList arrayList) {
        xg0 xg0Var = wg0Var.V;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.getBoolean("firstloginshow", true) && !xg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
            xg0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
            return;
        }
        globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var.getParentActivity());
        alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.T = string;
        xg0Var.f38733n = xg0Var.showDialog(d2Var, true, null);
        xg0Var.f38722c0 = true;
    }

    public void setCountryButtonText(CharSequence charSequence) {
        int i10;
        boolean z10;
        float f7;
        Context context = ApplicationLoader.applicationContext;
        if (this.d.getCurrentView().getText() != null && charSequence == null) {
            i10 = R.anim.text_out_down;
        } else {
            i10 = R.anim.text_out;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i10);
        loadAnimation.setInterpolator(org.telegram.ui.Components.pt.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.d11 d11Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        d11Var.a(charSequence, z10, false);
        org.telegram.ui.Components.hd0 hd0Var = this.e;
        if (charSequence != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        hd0Var.b(f7, f7, true);
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final void d() {
        this.K = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            this.d.getCurrentView().invalidate();
        }
    }

    @Override
    public final void f() {
        Runnable runnable = this.U;
        if (runnable != null) {
            runnable.run();
            this.U = null;
        }
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("YourPhone", R.string.YourPhone);
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
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        boolean z17;
        int i10;
        if (this.V.getParentActivity() != null && !this.K && !this.V.f38735o0) {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.f38179a.length() != 0 && this.f38180b.length() != 0) {
                String str2 = "+" + ((Object) this.f38179a.getText()) + " " + ((Object) this.f38180b.getText());
                if (!this.L) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y && !this.V.h1() && this.V.S.R() > AndroidUtilities.dp(20.0f)) {
                        xg0 xg0Var = this.V;
                        xg0Var.T = new lg0(this, 1);
                        AndroidUtilities.hideKeyboard(xg0Var.fragmentView);
                        return;
                    }
                    xg0 xg0Var2 = this.V;
                    Context context = this.V.fragmentView.getContext();
                    xg0 xg0Var3 = this.V;
                    xg0Var2.f38720b0 = new kg0(context, (ViewGroup) xg0Var3.fragmentView, xg0Var3.N, str2, new vg0(this));
                    kg0 kg0Var = this.V.f38720b0;
                    kg0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new jg0(kg0Var, 0));
                    duration.addUpdateListener(new gg0(kg0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                    duration.start();
                    return;
                }
                this.L = false;
                kg0 kg0Var2 = this.V.f38720b0;
                if (kg0Var2 != null) {
                    int i11 = kg0.E;
                    kg0Var2.a();
                }
                boolean isSimAvailable = AndroidUtilities.isSimAvailable();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23 && isSimAvailable) {
                    if (this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.V.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i12 >= 28 && this.V.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (i12 >= 26 && this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    xg0 xg0Var4 = this.V;
                    z10 = isSimAvailable;
                    if (xg0Var4.v) {
                        xg0Var4.f38738r.clear();
                        if (!z12) {
                            this.V.f38738r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.V.f38738r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.V.f38738r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i12 >= 26) {
                            this.V.f38738r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.V.f38738r.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.V.getParentActivity().requestPermissions((String[]) this.V.f38738r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.V.getParentActivity());
                            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                            if (!z12 && (!z13 || !z14)) {
                                alertDialog$Builder.f17528a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                                i10 = R.raw.calls_log;
                            } else if (z13 && z14) {
                                alertDialog$Builder.f17528a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                                i10 = R.raw.incoming_calls;
                            } else {
                                alertDialog$Builder.f17528a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                                i10 = R.raw.calls_log;
                            }
                            alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                            xg0 xg0Var5 = this.V;
                            xg0Var5.h = xg0Var5.showDialog(alertDialog$Builder.f17528a);
                            this.L = true;
                            return;
                        }
                    }
                    z11 = true;
                } else {
                    z10 = isSimAvailable;
                    z11 = true;
                    z12 = true;
                    z13 = true;
                    z14 = true;
                }
                int i13 = this.f38187x;
                if (i13 == z11) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                    this.V.k1(false, z11);
                    return;
                } else if (i13 == 2 && !BuildVars.DEBUG_VERSION) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                    this.V.k1(false, true);
                    return;
                } else {
                    String d = gf.b.d("" + ((Object) this.f38179a.getText()) + ((Object) this.f38180b.getText()), false);
                    xg0 xg0Var6 = this.V;
                    if (xg0Var6.F == 0 && (xg0Var6.getParentActivity() instanceof LaunchActivity)) {
                        for (int i14 = 0; i14 < 4; i14++) {
                            UserConfig userConfig = UserConfig.getInstance(i14);
                            if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                                boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                                xg0 xg0Var7 = this.V;
                                if (isTestBackend == xg0Var7.E) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xg0Var7.getParentActivity());
                                    alertDialog$Builder2.f17528a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder2.f17528a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                                    alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.s(this, i14, 13));
                                    alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                                    this.V.showDialog(alertDialog$Builder2.f17528a);
                                    this.V.k1(false, true);
                                    return;
                                }
                            }
                        }
                    }
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
                    boolean hasServices = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
                    tL_codeSettings.allow_firebase = hasServices;
                    tL_codeSettings.allow_app_hash = hasServices;
                    if (this.V.f38732l0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
                        tL_codeSettings.allow_firebase = false;
                    }
                    ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = AuthTokensHelper.getSavedLogInTokens();
                    if (savedLogInTokens != null) {
                        for (int i15 = 0; i15 < savedLogInTokens.size(); i15++) {
                            if (savedLogInTokens.get(i15).future_auth_token != null) {
                                if (tL_codeSettings.logout_tokens == null) {
                                    tL_codeSettings.logout_tokens = new ArrayList<>();
                                }
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("login token to check ".concat(new String(savedLogInTokens.get(i15).future_auth_token, StandardCharsets.UTF_8)));
                                }
                                tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i15).future_auth_token);
                                if (tL_codeSettings.logout_tokens.size() >= 20) {
                                    break;
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
                    if (savedLogOutTokens != null) {
                        for (int i16 = 0; i16 < savedLogOutTokens.size(); i16++) {
                            if (tL_codeSettings.logout_tokens == null) {
                                tL_codeSettings.logout_tokens = new ArrayList<>();
                            }
                            tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i16).future_auth_token);
                            if (tL_codeSettings.logout_tokens.size() >= 20) {
                                break;
                            }
                        }
                        AuthTokensHelper.saveLogOutTokens(savedLogOutTokens);
                    }
                    if (tL_codeSettings.logout_tokens != null) {
                        tL_codeSettings.flags |= 64;
                    }
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                    sharedPreferences.edit().remove("sms_hash_code").apply();
                    if (tL_codeSettings.allow_app_hash) {
                        sharedPreferences.edit().putString("sms_hash", BuildVars.getSmsHash()).apply();
                    } else {
                        sharedPreferences.edit().remove("sms_hash").apply();
                    }
                    if (tL_codeSettings.allow_flashcall) {
                        try {
                            HashSet V0 = xg0.V0(this.V);
                            if (!V0.isEmpty()) {
                                tL_codeSettings.unknown_number = false;
                                tL_codeSettings.current_number = Collection.EL.stream(V0).anyMatch(new r80(d, 1));
                            } else {
                                tL_codeSettings.unknown_number = true;
                                if (UserConfig.getActivatedAccountsCount() > 0) {
                                    tL_codeSettings.allow_flashcall = false;
                                } else {
                                    tL_codeSettings.current_number = false;
                                }
                            }
                        } catch (Exception e7) {
                            tL_codeSettings.unknown_number = true;
                            FileLog.e(e7);
                        }
                    }
                    xg0 xg0Var8 = this.V;
                    if (xg0Var8.F == 2) {
                        TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                        sendchangephonecode.phone_number = d;
                        sendchangephonecode.settings = tL_codeSettings;
                        tL_auth_sendCode = sendchangephonecode;
                    } else {
                        ConnectionsManager.getInstance(xg0.W0(xg0Var8)).cleanup(false);
                        TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                        tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
                        tL_auth_sendCode2.api_id = BuildVars.APP_ID;
                        tL_auth_sendCode2.phone_number = d;
                        tL_auth_sendCode2.settings = tL_codeSettings;
                        tL_auth_sendCode = tL_auth_sendCode2;
                    }
                    TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", "+" + ((Object) this.f38179a.getText()) + " " + ((Object) this.f38180b.getText()));
                    try {
                        bundle.putString("ephone", "+" + gf.b.d(this.f38179a.getText().toString(), false) + " " + gf.b.d(this.f38180b.getText().toString(), false));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        bundle.putString("ephone", "+" + d);
                    }
                    bundle.putString("phoneFormated", d);
                    wt wtVar = this.f38188y;
                    if (wtVar != null) {
                        bundle.putString("country", wtVar.f38388c);
                    }
                    this.K = true;
                    m.e3 e3Var = new m.e3(14, false);
                    e3Var.d = "+" + ((Object) this.f38179a.getText()) + " " + ((Object) this.f38180b.getText());
                    e3Var.f13001b = this.f38188y;
                    e3Var.f13002c = (List) this.G.get(this.f38179a.getText().toString());
                    this.V.n1(ConnectionsManager.getInstance(xg0.X0(this.V)).sendRequest(tL_auth_sendCode3, new bi.ze(this, bundle, d, e3Var, tL_auth_sendCode3, 9), 27), true);
                    return;
                }
            }
            xg0.U0(this.V, this.f38182f, false);
        }
    }

    @Override
    public final void j() {
        q();
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            z1Var.c(this.V.f38744y, false);
        }
        AndroidUtilities.runOnUIThread(new lg0(this, 0), xg0.f38716t0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f38179a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f38180b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f38179a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f38180b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    @Override
    public final void n() {
        this.f38181c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.m90 m90Var = this.f38183n;
        m90Var.setTextColor(w02);
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.d11 d11Var = this.d;
            if (i10 >= d11Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) d11Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        ImageView imageView = this.f38185s;
        imageView.setColorFilter(w03);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(this.V.getThemedColor(org.telegram.ui.ActionBar.j6.f18017i6), 1, -1));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        ck0 ck0Var = this.f38179a;
        ck0Var.setTextColor(w04);
        int i13 = org.telegram.ui.ActionBar.j6.f18073l6;
        ck0Var.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f38184r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18055k6, false));
        int w05 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        tg0 tg0Var = this.f38180b;
        tg0Var.setTextColor(w05);
        tg0Var.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        tg0Var.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            int i14 = org.telegram.ui.ActionBar.j6.Y6;
            int i15 = org.telegram.ui.ActionBar.j6.W6;
            int i16 = org.telegram.ui.ActionBar.j6.X6;
            CheckBoxSquare checkBoxSquare = z1Var.f20772n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f21072s = i14;
                checkBoxSquare.v = i15;
                checkBoxSquare.f21073w = i16;
                checkBoxSquare.invalidate();
            }
            z1Var.g();
        }
        org.telegram.ui.Cells.z1 z1Var2 = this.f38186w;
        if (z1Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.j6.Y6;
            int i18 = org.telegram.ui.ActionBar.j6.W6;
            int i19 = org.telegram.ui.ActionBar.j6.X6;
            CheckBoxSquare checkBoxSquare2 = z1Var2.f20772n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f21072s = i17;
                checkBoxSquare2.v = i18;
                checkBoxSquare2.f21073w = i19;
                checkBoxSquare2.invalidate();
            }
            z1Var2.g();
        }
        this.f38182f.f();
        this.e.f();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j3) {
        if (this.H) {
            this.H = false;
            return;
        }
        this.I = true;
        this.f38179a.setText(((wt) this.E.get(i10)).f38388c);
        this.I = false;
    }

    public final void q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wg0.q():void");
    }

    public final void r() {
        String str;
        int i10;
        String str2 = this.P;
        tg0 tg0Var = this.f38180b;
        if (tg0Var.getText() == null) {
            str = "";
        } else {
            str = tg0Var.getText().toString().replace(" ", "");
        }
        HashMap hashMap = this.G;
        String str3 = null;
        if (hashMap.get(str2) != null && !((List) hashMap.get(str2)).isEmpty()) {
            List list = (List) hashMap.get(str2);
            if (!str.isEmpty()) {
                i10 = 0;
                while (i10 < list.size()) {
                    if (str.startsWith(((String) list.get(i10)).replace(" ", "").replace("X", "").replace("0", ""))) {
                        break;
                    }
                    i10++;
                }
            }
            i10 = -1;
            if (i10 == -1) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    String str4 = (String) list.get(i11);
                    if (str4.startsWith("X") || str4.startsWith("0")) {
                        i10 = i11;
                        break;
                    }
                }
                if (i10 == -1) {
                    i10 = 0;
                }
            }
            if (this.Q != i10) {
                String str5 = (String) ((List) hashMap.get(str2)).get(i10);
                int selectionStart = tg0Var.getSelectionStart();
                int selectionEnd = tg0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                tg0Var.setHintText(str3);
                tg0Var.setSelection(Math.max(0, Math.min(tg0Var.length(), selectionStart)), Math.max(0, Math.min(tg0Var.length(), selectionEnd)));
                this.Q = i10;
            }
        } else if (this.Q != -1) {
            int selectionStart2 = tg0Var.getSelectionStart();
            int selectionEnd2 = tg0Var.getSelectionEnd();
            tg0Var.setHintText((String) null);
            tg0Var.setSelection(selectionStart2, selectionEnd2);
            this.Q = -1;
        }
    }

    public final void s() {
        String country;
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        this.V.getConnectionsManager().sendRequest(tL_help_getCountriesList, new pg0(this, 0), 10);
    }

    public final void u(boolean z10) {
        xg0 xg0Var = this.V;
        if (xg0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.T) {
            if (z10 || !this.S) {
                this.T = true;
                this.S = true;
                this.U = PasskeysController.login(getContext(), xg0.Y0(xg0Var), z10, new og0(this, 0));
            }
        }
    }

    public final void v(String str, wt wtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(wtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.sz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) wtVar.f38386a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.P = str;
        this.Q = -1;
        r();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
