package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
public final class zg0 extends org.telegram.ui.Components.tw0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
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
    public final ah0 V;
    public final fk0 f42309a;
    public final wg0 f42310b;
    public final TextView f42311c;
    public final org.telegram.ui.Components.s11 d;
    public final org.telegram.ui.Components.yd0 e;
    public final org.telegram.ui.Components.yd0 f42312f;
    public final TextView h;
    public final org.telegram.ui.Components.da0 f42313n;
    public final View f42314r;
    public final ImageView f42315s;
    public final org.telegram.ui.Cells.a2 v;
    public final org.telegram.ui.Cells.a2 f42316w;
    public int f42317x;
    public au f42318y;

    public zg0(ah0 ah0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        this.V = ah0Var;
        this.f42317x = 0;
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
        this.f42311c = textView;
        com.google.android.gms.internal.play_billing.k3.m(18.0f, 1, textView);
        if (ah0Var.F == 2) {
            i10 = R.string.ChangePhoneNewNumber;
        } else {
            i10 = R.string.YourNumber;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.z5.a(-2.0f, 32.0f, 0.0f, 32.0f, 0.0f, -1, 1));
        textView.setOnClickListener(new xv(21, this, context));
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(context, null);
        this.f42313n = da0Var;
        if (ah0Var.F == 2) {
            i11 = R.string.ChangePhoneHelp;
        } else {
            i11 = R.string.StartText;
        }
        da0Var.setText(LocaleController.getString(i11));
        da0Var.setTextSize(1, 14.0f);
        da0Var.setGravity(17);
        da0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(da0Var, w7.z5.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new vg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.xt.e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f42315s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, w7.z5.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.yd0 yd0Var = new org.telegram.ui.Components.yd0(context, null);
        this.e = yd0Var;
        yd0Var.setText(LocaleController.getString(R.string.Country));
        yd0Var.addView(linearLayout, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        yd0Var.setForceUseCenter(true);
        yd0Var.setFocusable(true);
        yd0Var.setContentDescription(LocaleController.getString(R.string.Country));
        yd0Var.setOnFocusChangeListener(new vd(this, 9));
        addView(yd0Var, w7.z5.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        yd0Var.setOnClickListener(new View.OnClickListener(this) {
            public final zg0 f39514b;

            {
                this.f39514b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ah0 ah0Var2 = this.f39514b.V;
                        if (ah0Var2.getParentActivity() != null) {
                            boolean z11 = !ah0Var2.f33932y;
                            ah0Var2.f33932y = z11;
                            ((org.telegram.ui.Cells.a2) view).c(z11, true);
                            if (ah0Var2.f33932y) {
                                new org.telegram.ui.Components.zc(ah0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                return;
                            } else {
                                new org.telegram.ui.Components.zc(ah0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                return;
                            }
                        }
                        return;
                    default:
                        zg0 zg0Var = this.f39514b;
                        fu fuVar = new fu(zg0Var.E, true);
                        fuVar.f35958r = new mu(zg0Var, 20);
                        zg0Var.V.presentFragment(fuVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.yd0 yd0Var2 = new org.telegram.ui.Components.yd0(context, null);
        this.f42312f = yd0Var2;
        yd0Var2.addView(linearLayout2, w7.z5.a(-2.0f, 16.0f, 8.0f, 16.0f, 8.0f, -1, 16));
        yd0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(yd0Var2, w7.z5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, w7.z5.n(-2, -2));
        fk0 fk0Var = new fk0(this, context, 2);
        this.f42309a = fk0Var;
        fk0Var.setInputType(3);
        fk0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        fk0Var.setCursorWidth(1.5f);
        fk0Var.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
        fk0Var.setTextSize(1, 16.0f);
        fk0Var.setMaxLines(1);
        fk0Var.setGravity(19);
        fk0Var.setImeOptions(268435461);
        fk0Var.setBackground(null);
        fk0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        fk0Var.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
        linearLayout2.addView(fk0Var, w7.z5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        fk0Var.addTextChangedListener(new n0(this, 10));
        fk0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final zg0 f39157b;

            {
                this.f39157b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        zg0 zg0Var = this.f39157b;
                        if (i14 == 5) {
                            og0 og0Var = zg0Var.V.f33908b0;
                            if (og0Var != null) {
                                og0Var.h.callOnClick();
                                return true;
                            }
                            zg0Var.h(null);
                            return true;
                        }
                        zg0Var.getClass();
                        return false;
                    default:
                        wg0 wg0Var = this.f39157b.f42310b;
                        if (i14 == 5) {
                            wg0Var.requestFocus();
                            wg0Var.setSelection(wg0Var.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        View view = new View(context);
        this.f42314r = view;
        LinearLayout.LayoutParams k10 = w7.z5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        wg0 wg0Var = new wg0(this, context);
        this.f42310b = wg0Var;
        wg0Var.setInputType(3);
        wg0Var.setPadding(0, 0, 0, 0);
        wg0Var.setCursorSize(AndroidUtilities.dp(20.0f));
        wg0Var.setCursorWidth(1.5f);
        wg0Var.setTextSize(1, 16.0f);
        wg0Var.setMaxLines(1);
        wg0Var.setGravity(19);
        wg0Var.setImeOptions(268435461);
        wg0Var.setBackground(null);
        wg0Var.setShowSoftInputOnFocus(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
        wg0Var.setContentDescription(LocaleController.getString(R.string.PhoneNumber));
        linearLayout2.addView(wg0Var, w7.z5.d(36.0f, -1));
        wg0Var.addTextChangedListener(new gs(this, 1));
        wg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final zg0 f39157b;

            {
                this.f39157b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        zg0 zg0Var = this.f39157b;
                        if (i14 == 5) {
                            og0 og0Var = zg0Var.V.f33908b0;
                            if (og0Var != null) {
                                og0Var.h.callOnClick();
                                return true;
                            }
                            zg0Var.h(null);
                            return true;
                        }
                        zg0Var.getClass();
                        return false;
                    default:
                        wg0 wg0Var2 = this.f39157b.f42310b;
                        if (i14 == 5) {
                            wg0Var2.requestFocus();
                            wg0Var2.setSelection(wg0Var2.length());
                            return true;
                        }
                        return false;
                }
            }
        });
        int i14 = 56;
        if (ah0Var.f33931x && ah0Var.F == 0) {
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 2);
            this.v = a2Var;
            a2Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", ah0Var.f33932y, false, false);
            if (LocaleController.isRTL && AndroidUtilities.isSmallScreen()) {
                i13 = 56;
            } else {
                i13 = 0;
            }
            addView(a2Var, w7.z5.t(-2, -1, 51, 16, 0, 16 + i13, 0));
            a2Var.setOnClickListener(new View.OnClickListener(this) {
                public final zg0 f39514b;

                {
                    this.f39514b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            ah0 ah0Var2 = this.f39514b.V;
                            if (ah0Var2.getParentActivity() != null) {
                                boolean z11 = !ah0Var2.f33932y;
                                ah0Var2.f33932y = z11;
                                ((org.telegram.ui.Cells.a2) view2).c(z11, true);
                                if (ah0Var2.f33932y) {
                                    new org.telegram.ui.Components.zc(ah0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    return;
                                } else {
                                    new org.telegram.ui.Components.zc(ah0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    return;
                                }
                            }
                            return;
                        default:
                            zg0 zg0Var = this.f39514b;
                            fu fuVar = new fu(zg0Var.E, true);
                            fuVar.f35958r = new mu(zg0Var, 20);
                            zg0Var.V.presentFragment(fuVar);
                            return;
                    }
                }
            });
            i12 = 48;
        } else {
            i12 = 72;
        }
        if (!BuildVars.DEBUG_VERSION && !ah0Var.getConnectionsManager().isTestBackend()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && ah0Var.F == 0) {
            org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(context, 2);
            this.f42316w = a2Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = ah0Var.getConnectionsManager().isTestBackend();
            ah0Var.E = isTestBackend;
            a2Var2.e(string, "", isTestBackend, false, false);
            addView(a2Var2, w7.z5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? i14 : 0), 0));
            i12 -= 24;
            a2Var2.setOnClickListener(new bi.z2(8, this, z10));
        }
        if (i12 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i12));
            addView(space, w7.z5.n(-2, -2));
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
                obj.f34084a = split[2];
                String str = split[0];
                obj.f34086c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(obj.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(obj.d, countryName)) {
                        obj.f34085b = obj.f34084a;
                        obj.f34084a = countryName;
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
        Collections.sort(this.E, Comparator$CC.comparing(new k2.f(7)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        ah0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new ec0(4, this, hashMap), 10);
        if (this.f42309a.length() == 0) {
            setCountryButtonText(null);
            this.f42310b.setHintText((String) null);
            this.f42317x = 1;
        }
        if (this.f42309a.length() != 0) {
            this.f42310b.requestFocus();
            wg0 wg0Var2 = this.f42310b;
            wg0Var2.setSelection(wg0Var2.length());
        } else {
            this.f42309a.requestFocus();
        }
        r();
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
        loadAnimation.setInterpolator(org.telegram.ui.Components.xt.e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.s11 s11Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        s11Var.a(charSequence, z10, false);
        org.telegram.ui.Components.yd0 yd0Var = this.e;
        if (charSequence != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        yd0Var.b(f7, f7, true);
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
        int i10;
        TLRPC.TL_auth_sendCode tL_auth_sendCode;
        int i11;
        boolean z17;
        int i12;
        if (this.V.getParentActivity() != null && !this.K && !this.V.f33923o0) {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.f42309a.length() != 0 && this.f42310b.length() != 0) {
                String str2 = "+" + ((Object) this.f42309a.getText()) + " " + ((Object) this.f42310b.getText());
                if (!this.L) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y && !this.V.h1() && this.V.S.R() > AndroidUtilities.dp(20.0f)) {
                        ah0 ah0Var = this.V;
                        ah0Var.T = new pg0(this, 1);
                        AndroidUtilities.hideKeyboard(ah0Var.fragmentView);
                        return;
                    }
                    ah0 ah0Var2 = this.V;
                    Context context = this.V.fragmentView.getContext();
                    ah0 ah0Var3 = this.V;
                    ah0Var2.f33908b0 = new og0(context, (ViewGroup) ah0Var3.fragmentView, ah0Var3.N, str2, new yg0(this));
                    og0 og0Var = this.V.f33908b0;
                    og0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new ng0(og0Var, 0));
                    duration.addUpdateListener(new kg0(og0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.es.f24465f);
                    duration.start();
                    return;
                }
                this.L = false;
                og0 og0Var2 = this.V.f33908b0;
                if (og0Var2 != null) {
                    int i13 = og0.E;
                    og0Var2.a();
                }
                boolean isSimAvailable = AndroidUtilities.isSimAvailable();
                int i14 = Build.VERSION.SDK_INT;
                if (isSimAvailable) {
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
                    if (i14 >= 28 && this.V.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (i14 >= 26 && this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    ah0 ah0Var4 = this.V;
                    z10 = isSimAvailable;
                    if (ah0Var4.v) {
                        ah0Var4.f33926r.clear();
                        if (!z12) {
                            this.V.f33926r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.V.f33926r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.V.f33926r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i14 >= 26) {
                            this.V.f33926r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.V.f33926r.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.V.getParentActivity().requestPermissions((String[]) this.V.f33926r.toArray(new String[0]), 6);
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
                                alertDialog$Builder.f19248a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                                i12 = R.raw.calls_log;
                            } else if (z13 && z14) {
                                alertDialog$Builder.f19248a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                                i12 = R.raw.incoming_calls;
                            } else {
                                alertDialog$Builder.f19248a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                                i12 = R.raw.calls_log;
                            }
                            alertDialog$Builder.m(i12, 46, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                            ah0 ah0Var5 = this.V;
                            ah0Var5.h = ah0Var5.showDialog(alertDialog$Builder.f19248a);
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
                int i15 = this.f42317x;
                if (i15 == z11) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                    this.V.k1(false, z11);
                    return;
                } else if (i15 == 2 && !BuildVars.DEBUG_VERSION) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                    this.V.k1(false, true);
                    return;
                } else {
                    String d = jf.b.d("" + ((Object) this.f42309a.getText()) + ((Object) this.f42310b.getText()), false);
                    ah0 ah0Var6 = this.V;
                    if (ah0Var6.F == 0 && (ah0Var6.getParentActivity() instanceof LaunchActivity)) {
                        for (int i16 = 0; i16 < 4; i16++) {
                            UserConfig userConfig = UserConfig.getInstance(i16);
                            if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                                boolean isTestBackend = ConnectionsManager.getInstance(i16).isTestBackend();
                                ah0 ah0Var7 = this.V;
                                if (isTestBackend == ah0Var7.E) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ah0Var7.getParentActivity());
                                    alertDialog$Builder2.f19248a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder2.f19248a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                                    alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.r(this, i16, 14));
                                    alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                                    this.V.showDialog(alertDialog$Builder2.f19248a);
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
                    if (this.V.f33920l0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
                        tL_codeSettings.allow_firebase = false;
                    }
                    ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = AuthTokensHelper.getSavedLogInTokens();
                    if (savedLogInTokens != null) {
                        for (int i17 = 0; i17 < savedLogInTokens.size(); i17++) {
                            if (savedLogInTokens.get(i17).future_auth_token != null) {
                                if (tL_codeSettings.logout_tokens == null) {
                                    tL_codeSettings.logout_tokens = new ArrayList<>();
                                }
                                if (BuildVars.DEBUG_VERSION) {
                                    FileLog.d("login token to check ".concat(new String(savedLogInTokens.get(i17).future_auth_token, StandardCharsets.UTF_8)));
                                }
                                tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i17).future_auth_token);
                                if (tL_codeSettings.logout_tokens.size() >= 20) {
                                    break;
                                }
                            }
                        }
                    }
                    ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
                    if (savedLogOutTokens != null) {
                        for (int i18 = 0; i18 < savedLogOutTokens.size(); i18++) {
                            if (tL_codeSettings.logout_tokens == null) {
                                tL_codeSettings.logout_tokens = new ArrayList<>();
                            }
                            tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i18).future_auth_token);
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
                            HashSet V0 = ah0.V0(this.V);
                            if (!V0.isEmpty()) {
                                tL_codeSettings.unknown_number = false;
                                tL_codeSettings.current_number = Collection.EL.stream(V0).anyMatch(new v80(d, 1));
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
                    ah0 ah0Var8 = this.V;
                    if (ah0Var8.F != 2) {
                        i10 = ((org.telegram.ui.ActionBar.m2) ah0Var8).currentAccount;
                        ConnectionsManager.getInstance(i10).cleanup(false);
                        TLRPC.TL_auth_sendCode tL_auth_sendCode2 = new TLRPC.TL_auth_sendCode();
                        tL_auth_sendCode2.api_hash = BuildVars.APP_HASH;
                        tL_auth_sendCode2.api_id = BuildVars.APP_ID;
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
                    bundle.putString("phone", "+" + ((Object) this.f42309a.getText()) + " " + ((Object) this.f42310b.getText()));
                    try {
                        bundle.putString("ephone", "+" + jf.b.d(this.f42309a.getText().toString(), false) + " " + jf.b.d(this.f42310b.getText().toString(), false));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        bundle.putString("ephone", "+" + d);
                    }
                    bundle.putString("phoneFormated", d);
                    au auVar = this.f42318y;
                    if (auVar != null) {
                        bundle.putString("country", auVar.f34086c);
                    }
                    this.K = true;
                    m.h3 h3Var = new m.h3(16, false);
                    h3Var.d = "+" + ((Object) this.f42309a.getText()) + " " + ((Object) this.f42310b.getText());
                    h3Var.f14850b = this.f42318y;
                    h3Var.f14851c = (List) this.G.get(this.f42309a.getText().toString());
                    i11 = ((org.telegram.ui.ActionBar.m2) this.V).currentAccount;
                    this.V.n1(ConnectionsManager.getInstance(i11).sendRequest(tL_auth_sendCode3, new di.fd(this, bundle, d, h3Var, tL_auth_sendCode3, 9), 27), true);
                    return;
                }
            }
            ah0.U0(this.V, this.f42312f, false);
        }
    }

    @Override
    public final void j() {
        p();
        org.telegram.ui.Cells.a2 a2Var = this.v;
        if (a2Var != null) {
            a2Var.c(this.V.f33932y, false);
        }
        AndroidUtilities.runOnUIThread(new pg0(this, 0), ah0.f33904t0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f42309a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f42310b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f42309a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f42310b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    @Override
    public final void n() {
        this.f42311c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.D6, false);
        org.telegram.ui.Components.da0 da0Var = this.f42313n;
        da0Var.setTextColor(x02);
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19660gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.s11 s11Var = this.d;
            if (i10 >= s11Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) s11Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, i11, false);
        ImageView imageView = this.f42315s;
        imageView.setColorFilter(x03);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(this.V.getThemedColor(org.telegram.ui.ActionBar.g6.f19690i6), 1, -1));
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        int x04 = org.telegram.ui.ActionBar.g6.x0(null, i12, false);
        fk0 fk0Var = this.f42309a;
        fk0Var.setTextColor(x04);
        int i13 = org.telegram.ui.ActionBar.g6.f19745l6;
        fk0Var.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        this.f42314r.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19728k6, false));
        int x05 = org.telegram.ui.ActionBar.g6.x0(null, i12, false);
        wg0 wg0Var = this.f42310b;
        wg0Var.setTextColor(x05);
        wg0Var.setHintTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        wg0Var.setCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        org.telegram.ui.Cells.a2 a2Var = this.v;
        if (a2Var != null) {
            int i14 = org.telegram.ui.ActionBar.g6.Y6;
            int i15 = org.telegram.ui.ActionBar.g6.W6;
            int i16 = org.telegram.ui.ActionBar.g6.X6;
            CheckBoxSquare checkBoxSquare = a2Var.f20598n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f22807s = i14;
                checkBoxSquare.v = i15;
                checkBoxSquare.f22808w = i16;
                checkBoxSquare.invalidate();
            }
            a2Var.g();
        }
        org.telegram.ui.Cells.a2 a2Var2 = this.f42316w;
        if (a2Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.g6.Y6;
            int i18 = org.telegram.ui.ActionBar.g6.W6;
            int i19 = org.telegram.ui.ActionBar.g6.X6;
            CheckBoxSquare checkBoxSquare2 = a2Var2.f20598n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f22807s = i17;
                checkBoxSquare2.v = i18;
                checkBoxSquare2.f22808w = i19;
                checkBoxSquare2.invalidate();
            }
            a2Var2.g();
        }
        this.f42312f.f();
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
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.H) {
            this.H = false;
            return;
        }
        this.I = true;
        this.f42309a.setText(((au) this.E.get(i10)).f34086c);
        this.I = false;
    }

    public final void p() {
        boolean z10;
        boolean z11;
        ah0 ah0Var;
        boolean z12;
        au auVar;
        if (!this.R && this.V.F == 0) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                if (AndroidUtilities.isSimAvailable()) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 >= 26 && this.V.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") != 0) {
                        z11 = false;
                        ah0Var = this.V;
                        if (!ah0Var.f33930w && (!z10 || !z11)) {
                            ah0Var.f33928s.clear();
                            if (!z10) {
                                this.V.f33928s.add("android.permission.READ_PHONE_STATE");
                            }
                            if (!z11 && i10 >= 26) {
                                this.V.f33928s.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (!this.V.f33928s.isEmpty()) {
                                new se0(9, this, new ArrayList(this.V.f33928s)).run();
                                return;
                            }
                            return;
                        }
                        this.R = true;
                        if (ah0Var.f33931x && z10 && z11) {
                            this.f42309a.setAlpha(0.0f);
                            this.f42310b.setAlpha(0.0f);
                            String d = jf.b.d(telephonyManager.getLine1Number(), false);
                            if (!TextUtils.isEmpty(d)) {
                                int i11 = 4;
                                String str = null;
                                if (d.length() > 4) {
                                    while (true) {
                                        if (i11 >= 1) {
                                            String substring = d.substring(0, i11);
                                            List list = (List) this.F.get(substring);
                                            if (list == null) {
                                                auVar = null;
                                            } else if (list.size() > 1) {
                                                String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                auVar = (au) list.get(list.size() - 1);
                                                if (string != null) {
                                                    ArrayList arrayList = this.E;
                                                    int size = arrayList.size();
                                                    int i12 = 0;
                                                    while (true) {
                                                        if (i12 >= size) {
                                                            break;
                                                        }
                                                        Object obj = arrayList.get(i12);
                                                        i12++;
                                                        au auVar2 = (au) obj;
                                                        if (Objects.equals(auVar2.d, string)) {
                                                            auVar = auVar2;
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                auVar = (au) list.get(0);
                                            }
                                            if (auVar != null) {
                                                str = d.substring(i11);
                                                this.f42309a.setText(substring);
                                                z12 = true;
                                                break;
                                            }
                                            i11--;
                                        } else {
                                            z12 = false;
                                            break;
                                        }
                                    }
                                    if (!z12) {
                                        str = d.substring(1);
                                        this.f42309a.setText(d.substring(0, 1));
                                    }
                                }
                                if (str != null) {
                                    this.f42310b.requestFocus();
                                    this.f42310b.setText(str);
                                    wg0 wg0Var = this.f42310b;
                                    wg0Var.setSelection(wg0Var.length());
                                }
                            }
                            if (this.f42310b.length() > 0) {
                                AnimatorSet duration = new AnimatorSet().setDuration(300L);
                                fk0 fk0Var = this.f42309a;
                                Property property = View.ALPHA;
                                duration.playTogether(ObjectAnimator.ofFloat(fk0Var, property, 1.0f), ObjectAnimator.ofFloat(this.f42310b, property, 1.0f));
                                duration.start();
                                this.L = true;
                                return;
                            }
                            this.f42309a.setAlpha(1.0f);
                            this.f42310b.setAlpha(1.0f);
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    ah0Var = this.V;
                    if (!ah0Var.f33930w) {
                    }
                    this.R = true;
                    if (ah0Var.f33931x) {
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void q() {
        String str;
        int i10;
        String str2 = this.P;
        wg0 wg0Var = this.f42310b;
        if (wg0Var.getText() == null) {
            str = "";
        } else {
            str = wg0Var.getText().toString().replace(" ", "");
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
                int selectionStart = wg0Var.getSelectionStart();
                int selectionEnd = wg0Var.getSelectionEnd();
                if (str5 != null) {
                    str3 = str5.replace('X', '0');
                }
                wg0Var.setHintText(str3);
                wg0Var.setSelection(Math.max(0, Math.min(wg0Var.length(), selectionStart)), Math.max(0, Math.min(wg0Var.length(), selectionEnd)));
                this.Q = i10;
            }
        } else if (this.Q != -1) {
            int selectionStart2 = wg0Var.getSelectionStart();
            int selectionEnd2 = wg0Var.getSelectionEnd();
            wg0Var.setHintText((String) null);
            wg0Var.setSelection(selectionStart2, selectionEnd2);
            this.Q = -1;
        }
    }

    public final void r() {
        String country;
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        this.V.getConnectionsManager().sendRequest(tL_help_getCountriesList, new tg0(this, 0), 10);
    }

    public final void s(boolean z10) {
        int i10;
        ah0 ah0Var = this.V;
        if (ah0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.T) {
            if (z10 || !this.S) {
                this.T = true;
                this.S = true;
                Context context = getContext();
                i10 = ((org.telegram.ui.ActionBar.m2) ah0Var).currentAccount;
                this.U = PasskeysController.login(context, i10, z10, new sg0(this, 0));
            }
        }
    }

    public final void t(String str, au auVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(auVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) auVar.f34084a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.P = str;
        this.Q = -1;
        q();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
