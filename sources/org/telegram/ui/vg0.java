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
public final class vg0 extends org.telegram.ui.Components.tv0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
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
    public final wg0 V;
    public final ck0 f41536a;
    public final sg0 f41537b;
    public final TextView f41538c;
    public final org.telegram.ui.Components.p01 d;
    public final org.telegram.ui.Components.zc0 f41539e;
    public final org.telegram.ui.Components.zc0 f41540f;
    public final TextView h;
    public final org.telegram.ui.Components.d90 f41541n;
    public final View f41542r;
    public final ImageView f41543s;
    public final org.telegram.ui.Cells.z1 v;
    public final org.telegram.ui.Cells.z1 f41544w;
    public int f41545x;
    public vt f41546y;

    public vg0(wg0 wg0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        this.V = wg0Var;
        this.f41545x = 0;
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
        this.f41538c = textView;
        com.google.android.gms.internal.vision.e2.m(18.0f, 1, textView);
        if (wg0Var.F == 2) {
            i10 = R.string.ChangePhoneNewNumber;
        } else {
            i10 = R.string.YourNumber;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.x5.d(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
        textView.setOnClickListener(new tv(21, this, context));
        org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(context, null);
        this.f41541n = d90Var;
        if (wg0Var.F == 2) {
            i11 = R.string.ChangePhoneHelp;
        } else {
            i11 = R.string.StartText;
        }
        d90Var.setText(LocaleController.getString(i11));
        d90Var.setTextSize(1, 14.0f);
        d90Var.setGravity(17);
        d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(d90Var, w7.x5.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new rg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.jt.f27568e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f41543s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, w7.x5.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.x5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.zc0 zc0Var = new org.telegram.ui.Components.zc0(context, null);
        this.f41539e = zc0Var;
        zc0Var.setText(LocaleController.getString(R.string.Country));
        zc0Var.addView(linearLayout, w7.x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        zc0Var.setForceUseCenter(true);
        zc0Var.setFocusable(true);
        zc0Var.setContentDescription(LocaleController.getString(R.string.Country));
        zc0Var.setOnFocusChangeListener(new pd(this, 9));
        addView(zc0Var, w7.x5.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        zc0Var.setOnClickListener(new View.OnClickListener(this) {
            public final vg0 f38952b;

            {
                this.f38952b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        wg0 wg0Var2 = this.f38952b.V;
                        if (wg0Var2.getParentActivity() != null) {
                            boolean z11 = !wg0Var2.f42387y;
                            wg0Var2.f42387y = z11;
                            ((org.telegram.ui.Cells.z1) view).c(z11, true);
                            if (wg0Var2.f42387y) {
                                new org.telegram.ui.Components.yc(wg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                return;
                            } else {
                                new org.telegram.ui.Components.yc(wg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                return;
                            }
                        }
                        return;
                    default:
                        vg0 vg0Var = this.f38952b;
                        bu buVar = new bu(vg0Var.E, true);
                        buVar.f34929r = new iu(vg0Var, 20);
                        vg0Var.V.presentFragment(buVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.zc0 zc0Var2 = new org.telegram.ui.Components.zc0(context, null);
        this.f41540f = zc0Var2;
        zc0Var2.addView(linearLayout2, w7.x5.d(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
        zc0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(zc0Var2, w7.x5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, w7.x5.n(-2, -2));
        ck0 ck0Var = new ck0(this, context, 2);
        this.f41536a = ck0Var;
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
        linearLayout2.addView(ck0Var, w7.x5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        ck0Var.addTextChangedListener(new l0(this, 10));
        ck0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final vg0 f38705b;

            {
                this.f38705b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        vg0 vg0Var = this.f38705b;
                        if (i14 == 5) {
                            kg0 kg0Var = vg0Var.V.f42362b0;
                            if (kg0Var != null) {
                                kg0Var.h.callOnClick();
                                return true;
                            }
                            vg0Var.h(null);
                            return true;
                        }
                        vg0Var.getClass();
                        return false;
                    default:
                        sg0 sg0Var = this.f38705b.f41537b;
                        if (i14 == 5) {
                            sg0Var.requestFocus();
                            sg0Var.setSelection(sg0Var.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f41542r = view;
        LinearLayout.LayoutParams k10 = w7.x5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        sg0 sg0Var = new sg0(this, context);
        this.f41537b = sg0Var;
        sg0Var.setInputType(3);
        sg0Var.setPadding(0, 0, 0, 0);
        sg0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        sg0Var.setCursorWidth(1.5f);
        sg0Var.setTextSize(1, 16.0f);
        sg0Var.setMaxLines(1);
        sg0Var.setGravity(19);
        sg0Var.setImeOptions(268435461);
        sg0Var.setBackground(null);
        sg0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        sg0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(sg0Var, w7.x5.c(36.0f, -1));
        sg0Var.addTextChangedListener(new ds(this, 1));
        sg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final vg0 f38705b;

            {
                this.f38705b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        vg0 vg0Var = this.f38705b;
                        if (i14 == 5) {
                            kg0 kg0Var = vg0Var.V.f42362b0;
                            if (kg0Var != null) {
                                kg0Var.h.callOnClick();
                                return true;
                            }
                            vg0Var.h(null);
                            return true;
                        }
                        vg0Var.getClass();
                        return false;
                    default:
                        sg0 sg0Var2 = this.f38705b.f41537b;
                        if (i14 == 5) {
                            sg0Var2.requestFocus();
                            sg0Var2.setSelection(sg0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i14 = 56;
        if (wg0Var.f42386x && wg0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 2);
            this.v = z1Var;
            z1Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", wg0Var.f42387y, false, false);
            if (LocaleController.isRTL && AndroidUtilities.isSmallScreen()) {
                i13 = 56;
            } else {
                i13 = 0;
            }
            addView(z1Var, w7.x5.t(-2, -1, 51, 16, 0, 16 + i13, 0));
            z1Var.setOnClickListener(new View.OnClickListener(this) {
                public final vg0 f38952b;

                {
                    this.f38952b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            wg0 wg0Var2 = this.f38952b.V;
                            if (wg0Var2.getParentActivity() != null) {
                                boolean z11 = !wg0Var2.f42387y;
                                wg0Var2.f42387y = z11;
                                ((org.telegram.ui.Cells.z1) view2).c(z11, true);
                                if (wg0Var2.f42387y) {
                                    new org.telegram.ui.Components.yc(wg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    return;
                                } else {
                                    new org.telegram.ui.Components.yc(wg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    return;
                                }
                            }
                            return;
                        default:
                            vg0 vg0Var = this.f38952b;
                            bu buVar = new bu(vg0Var.E, true);
                            buVar.f34929r = new iu(vg0Var, 20);
                            vg0Var.V.presentFragment(buVar);
                            return;
                    }
                }
            });
            i12 = 48;
        } else {
            i12 = 72;
        }
        if (!BuildVars.DEBUG_VERSION && !wg0Var.getConnectionsManager().isTestBackend()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && wg0Var.F == 0) {
            org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(context, 2);
            this.f41544w = z1Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = wg0Var.getConnectionsManager().isTestBackend();
            wg0Var.E = isTestBackend;
            z1Var2.e(string, "", isTestBackend, false, false);
            addView(z1Var2, w7.x5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 0 : 0), 0));
            i12 -= 24;
            z1Var2.setOnClickListener(new bi.w2(8, this, z10));
        }
        if (i12 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i12));
            addView(space, w7.x5.n(-2, -2));
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
                obj.f41693a = split[2];
                String str = split[0];
                obj.f41695c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(obj.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(obj.d, countryName)) {
                        obj.f41694b = obj.f41693a;
                        obj.f41693a = countryName;
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        Collections.sort(this.E, Comparator$CC.comparing(new l8(6)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        wg0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new bc0(4, this, hashMap), 10);
        if (this.f41536a.length() == 0) {
            setCountryButtonText(null);
            this.f41537b.setHintText((String) null);
            this.f41545x = 1;
        }
        if (this.f41536a.length() != 0) {
            this.f41537b.requestFocus();
            sg0 sg0Var2 = this.f41537b;
            sg0Var2.setSelection(sg0Var2.length());
        } else {
            this.f41536a.requestFocus();
        }
        s();
    }

    public static void o(vg0 vg0Var, ArrayList arrayList) {
        wg0 wg0Var = vg0Var.V;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!globalMainSettings.getBoolean("firstloginshow", true) && !wg0Var.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
            wg0Var.getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 7);
            return;
        }
        globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
        alertDialog$Builder.m(R.raw.incoming_calls, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
        alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
        String string = LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
        b2Var.T = string;
        wg0Var.f42376n = wg0Var.showDialog(b2Var, true, null);
        wg0Var.f42364c0 = true;
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
        loadAnimation.setInterpolator(org.telegram.ui.Components.jt.f27568e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.p01 p01Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        p01Var.a(charSequence, z10, false);
        org.telegram.ui.Components.zc0 zc0Var = this.f41539e;
        if (charSequence != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        zc0Var.b(f7, f7, true);
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
        if (this.V.getParentActivity() != null && !this.K && !this.V.f42378o0) {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.f41536a.length() != 0 && this.f41537b.length() != 0) {
                String str2 = "+" + ((Object) this.f41536a.getText()) + " " + ((Object) this.f41537b.getText());
                if (!this.L) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y && !this.V.h1() && this.V.S.R() > AndroidUtilities.dp(20.0f)) {
                        wg0 wg0Var = this.V;
                        wg0Var.T = new lg0(this, 1);
                        AndroidUtilities.hideKeyboard(wg0Var.fragmentView);
                        return;
                    }
                    wg0 wg0Var2 = this.V;
                    Context context = this.V.fragmentView.getContext();
                    wg0 wg0Var3 = this.V;
                    wg0Var2.f42362b0 = new kg0(context, (ViewGroup) wg0Var3.fragmentView, wg0Var3.N, str2, new ug0(this));
                    kg0 kg0Var = this.V.f42362b0;
                    kg0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new jg0(kg0Var, 0));
                    duration.addUpdateListener(new gg0(kg0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.pr.f29466f);
                    duration.start();
                    return;
                }
                this.L = false;
                kg0 kg0Var2 = this.V.f42362b0;
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
                    wg0 wg0Var4 = this.V;
                    z10 = isSimAvailable;
                    if (wg0Var4.v) {
                        wg0Var4.f42381r.clear();
                        if (!z12) {
                            this.V.f42381r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.V.f42381r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.V.f42381r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i12 >= 26) {
                            this.V.f42381r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.V.f42381r.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.V.getParentActivity().requestPermissions((String[]) this.V.f42381r.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                            globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.V.getParentActivity());
                            alertDialog$Builder.k(LocaleController.getString("Continue", R.string.Continue), null);
                            if (!z12 && (!z13 || !z14)) {
                                alertDialog$Builder.f20198a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                                i10 = R.raw.calls_log;
                            } else if (z13 && z14) {
                                alertDialog$Builder.f20198a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                                i10 = R.raw.incoming_calls;
                            } else {
                                alertDialog$Builder.f20198a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                                i10 = R.raw.calls_log;
                            }
                            alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                            wg0 wg0Var5 = this.V;
                            wg0Var5.h = wg0Var5.showDialog(alertDialog$Builder.f20198a);
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
                int i13 = this.f41545x;
                if (i13 == z11) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                    this.V.k1(false, z11);
                    return;
                } else if (i13 == 2 && !BuildVars.DEBUG_VERSION) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                    this.V.k1(false, true);
                    return;
                } else {
                    String d = gf.b.d("" + ((Object) this.f41536a.getText()) + ((Object) this.f41537b.getText()), false);
                    wg0 wg0Var6 = this.V;
                    if (wg0Var6.F == 0 && (wg0Var6.getParentActivity() instanceof LaunchActivity)) {
                        for (int i14 = 0; i14 < 4; i14++) {
                            UserConfig userConfig = UserConfig.getInstance(i14);
                            if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                                boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                                wg0 wg0Var7 = this.V;
                                if (isTestBackend == wg0Var7.E) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg0Var7.getParentActivity());
                                    alertDialog$Builder2.f20198a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder2.f20198a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                                    alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.t(this, i14, 13));
                                    alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                                    this.V.showDialog(alertDialog$Builder2.f20198a);
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
                    if (this.V.f42375l0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
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
                            HashSet V0 = wg0.V0(this.V);
                            if (!V0.isEmpty()) {
                                tL_codeSettings.unknown_number = false;
                                tL_codeSettings.current_number = Collection.EL.stream(V0).anyMatch(new s80(d, 1));
                            } else {
                                tL_codeSettings.unknown_number = true;
                                if (UserConfig.getActivatedAccountsCount() > 0) {
                                    tL_codeSettings.allow_flashcall = false;
                                } else {
                                    tL_codeSettings.current_number = false;
                                }
                            }
                        } catch (Exception e10) {
                            tL_codeSettings.unknown_number = true;
                            FileLog.e(e10);
                        }
                    }
                    wg0 wg0Var8 = this.V;
                    if (wg0Var8.F == 2) {
                        TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                        sendchangephonecode.phone_number = d;
                        sendchangephonecode.settings = tL_codeSettings;
                        tL_auth_sendCode = sendchangephonecode;
                    } else {
                        ConnectionsManager.getInstance(wg0.W0(wg0Var8)).cleanup(false);
                        TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                        tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
                        tL_auth_sendCode2.api_id = BuildVars.APP_ID;
                        tL_auth_sendCode2.phone_number = d;
                        tL_auth_sendCode2.settings = tL_codeSettings;
                        tL_auth_sendCode = tL_auth_sendCode2;
                    }
                    TLRPC.TL_auth_sendCode tL_auth_sendCode3 = tL_auth_sendCode;
                    Bundle bundle = new Bundle();
                    bundle.putString("phone", "+" + ((Object) this.f41536a.getText()) + " " + ((Object) this.f41537b.getText()));
                    try {
                        bundle.putString("ephone", "+" + gf.b.d(this.f41536a.getText().toString(), false) + " " + gf.b.d(this.f41537b.getText().toString(), false));
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        bundle.putString("ephone", "+" + d);
                    }
                    bundle.putString("phoneFormated", d);
                    vt vtVar = this.f41546y;
                    if (vtVar != null) {
                        bundle.putString("country", vtVar.f41695c);
                    }
                    this.K = true;
                    m2.t tVar = new m2.t(13, false);
                    tVar.d = "+" + ((Object) this.f41536a.getText()) + " " + ((Object) this.f41537b.getText());
                    tVar.f15817b = this.f41546y;
                    tVar.f15818c = (List) this.G.get(this.f41536a.getText().toString());
                    this.V.n1(ConnectionsManager.getInstance(wg0.X0(this.V)).sendRequest(tL_auth_sendCode3, new di.kd(this, bundle, d, tVar, tL_auth_sendCode3, 9), 27), true);
                    return;
                }
            }
            wg0.U0(this.V, this.f41540f, false);
        }
    }

    @Override
    public final void j() {
        q();
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            z1Var.c(this.V.f42387y, false);
        }
        AndroidUtilities.runOnUIThread(new lg0(this, 0), wg0.f42358t0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f41536a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f41537b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f41536a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f41537b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    @Override
    public final void n() {
        this.f41538c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.d90 d90Var = this.f41541n;
        d90Var.setTextColor(w02);
        d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.p01 p01Var = this.d;
            if (i10 >= p01Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) p01Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        ImageView imageView = this.f41543s;
        imageView.setColorFilter(w03);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(this.V.getThemedColor(org.telegram.ui.ActionBar.j6.f20753i6), 1, -1));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        ck0 ck0Var = this.f41536a;
        ck0Var.setTextColor(w04);
        int i13 = org.telegram.ui.ActionBar.j6.f20809l6;
        ck0Var.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        this.f41542r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20791k6, false));
        int w05 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        sg0 sg0Var = this.f41537b;
        sg0Var.setTextColor(w05);
        sg0Var.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        sg0Var.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        org.telegram.ui.Cells.z1 z1Var = this.v;
        if (z1Var != null) {
            int i14 = org.telegram.ui.ActionBar.j6.Y6;
            int i15 = org.telegram.ui.ActionBar.j6.W6;
            int i16 = org.telegram.ui.ActionBar.j6.X6;
            CheckBoxSquare checkBoxSquare = z1Var.f23596n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f23923s = i14;
                checkBoxSquare.v = i15;
                checkBoxSquare.f23924w = i16;
                checkBoxSquare.invalidate();
            }
            z1Var.g();
        }
        org.telegram.ui.Cells.z1 z1Var2 = this.f41544w;
        if (z1Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.j6.Y6;
            int i18 = org.telegram.ui.ActionBar.j6.W6;
            int i19 = org.telegram.ui.ActionBar.j6.X6;
            CheckBoxSquare checkBoxSquare2 = z1Var2.f23596n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f23923s = i17;
                checkBoxSquare2.v = i18;
                checkBoxSquare2.f23924w = i19;
                checkBoxSquare2.invalidate();
            }
            z1Var2.g();
        }
        this.f41540f.f();
        this.f41539e.f();
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
        this.f41536a.setText(((vt) this.E.get(i10)).f41695c);
        this.I = false;
    }

    public final void q() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vg0.q():void");
    }

    public final void r() {
        String str;
        int i10;
        String str2 = this.P;
        sg0 sg0Var = this.f41537b;
        if (sg0Var.getText() == null) {
            str = "";
        } else {
            str = sg0Var.getText().toString().replace(" ", "");
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
                int selectionStart = sg0Var.getSelectionStart();
                int selectionEnd = sg0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                sg0Var.setHintText(str3);
                sg0Var.setSelection(Math.max(0, Math.min(sg0Var.length(), selectionStart)), Math.max(0, Math.min(sg0Var.length(), selectionEnd)));
                this.Q = i10;
            }
        } else if (this.Q != -1) {
            int selectionStart2 = sg0Var.getSelectionStart();
            int selectionEnd2 = sg0Var.getSelectionEnd();
            sg0Var.setHintText((String) null);
            sg0Var.setSelection(selectionStart2, selectionEnd2);
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
        wg0 wg0Var = this.V;
        if (wg0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.T) {
            if (z10 || !this.S) {
                this.T = true;
                this.S = true;
                this.U = PasskeysController.login(getContext(), wg0.Y0(wg0Var), z10, new og0(this, 0));
            }
        }
    }

    public final void v(String str, vt vtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(vtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) vtVar.f41693a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.P = str;
        this.Q = -1;
        r();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
