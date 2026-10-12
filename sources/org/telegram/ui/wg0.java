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
public final class wg0 extends org.telegram.ui.Components.dx0 implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
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
    public final ck0 f43517a;
    public final tg0 f43518b;
    public final TextView f43519c;
    public final org.telegram.ui.Components.b21 d;
    public final org.telegram.ui.Components.de0 f43520e;
    public final org.telegram.ui.Components.de0 f43521f;
    public final TextView h;
    public final org.telegram.ui.Components.ia0 f43522n;
    public final View f43523r;
    public final ImageView f43524s;
    public final org.telegram.ui.Cells.a2 v;
    public final org.telegram.ui.Cells.a2 f43525w;
    public int f43526x;
    public xt f43527y;

    public wg0(xg0 xg0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        this.V = xg0Var;
        this.f43526x = 0;
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
        this.f43519c = textView;
        com.google.android.gms.internal.vision.e2.l(18.0f, 1, textView);
        if (xg0Var.F == 2) {
            i10 = R.string.ChangePhoneNewNumber;
        } else {
            i10 = R.string.YourNumber;
        }
        textView.setText(LocaleController.getString(i10));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.w5.a(-2.0f, 32.0f, 0.0f, 32.0f, 0.0f, -1, 1));
        textView.setOnClickListener(new uv(21, this, context));
        org.telegram.ui.Components.ia0 ia0Var = new org.telegram.ui.Components.ia0(context, null);
        this.f43522n = ia0Var;
        if (xg0Var.F == 2) {
            i11 = R.string.ChangePhoneHelp;
        } else {
            i11 = R.string.StartText;
        }
        ia0Var.setText(LocaleController.getString(i11));
        ia0Var.setTextSize(1, 14.0f);
        ia0Var.setGravity(17);
        ia0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(ia0Var, w7.w5.t(-1, -2, 1, 32, 8, 32, 0));
        ?? viewSwitcher = new ViewSwitcher(context);
        this.d = viewSwitcher;
        viewSwitcher.setFactory(new sg0(context, 0));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
        loadAnimation.setInterpolator(org.telegram.ui.Components.du.f25466e);
        viewSwitcher.setInAnimation(loadAnimation);
        ImageView imageView = new ImageView(context);
        this.f43524s = imageView;
        imageView.setImageResource(R.drawable.msg_inputarrow);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.addView((View) viewSwitcher, w7.w5.m(1.0f, 0, -2, 0, 0, 0));
        linearLayout.addView(imageView, w7.w5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.Components.de0 de0Var = new org.telegram.ui.Components.de0(context, null);
        this.f43520e = de0Var;
        de0Var.setText(LocaleController.getString(R.string.Country));
        de0Var.addView(linearLayout, w7.w5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        de0Var.setForceUseCenter(true);
        de0Var.setFocusable(true);
        de0Var.setContentDescription(LocaleController.getString(R.string.Country));
        de0Var.setOnFocusChangeListener(new td(this, 9));
        addView(de0Var, w7.w5.k(16.0f, 24.0f, 16.0f, 14.0f, -1, 58));
        de0Var.setOnClickListener(new View.OnClickListener(this) {
            public final wg0 f40714b;

            {
                this.f40714b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        xg0 xg0Var2 = this.f40714b.V;
                        if (xg0Var2.getParentActivity() != null) {
                            boolean z11 = !xg0Var2.f43965y;
                            xg0Var2.f43965y = z11;
                            ((org.telegram.ui.Cells.a2) view).c(z11, true);
                            if (xg0Var2.f43965y) {
                                new org.telegram.ui.Components.zc(xg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                return;
                            } else {
                                new org.telegram.ui.Components.zc(xg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                return;
                            }
                        }
                        return;
                    default:
                        wg0 wg0Var = this.f40714b;
                        cu cuVar = new cu(wg0Var.E, true);
                        cuVar.f36517r = new ju(wg0Var, 20);
                        wg0Var.V.presentFragment(cuVar);
                        return;
                }
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        org.telegram.ui.Components.de0 de0Var2 = new org.telegram.ui.Components.de0(context, null);
        this.f43521f = de0Var2;
        de0Var2.addView(linearLayout2, w7.w5.a(-2.0f, 16.0f, 8.0f, 16.0f, 8.0f, -1, 16));
        de0Var2.setText(LocaleController.getString(R.string.PhoneNumber));
        addView(de0Var2, w7.w5.k(16.0f, 8.0f, 16.0f, 8.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setText("+");
        textView2.setTextSize(1, 16.0f);
        textView2.setFocusable(false);
        linearLayout2.addView(textView2, w7.w5.n(-2, -2));
        ck0 ck0Var = new ck0(this, context, 2);
        this.f43517a = ck0Var;
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
        linearLayout2.addView(ck0Var, w7.w5.k(-9.0f, 0.0f, 0.0f, 0.0f, 55, 36));
        ck0Var.addTextChangedListener(new m0(this, 10));
        ck0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final wg0 f40411b;

            {
                this.f40411b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        wg0 wg0Var = this.f40411b;
                        if (i14 == 5) {
                            lg0 lg0Var = wg0Var.V.f43940b0;
                            if (lg0Var != null) {
                                lg0Var.h.callOnClick();
                                return true;
                            }
                            wg0Var.h(null);
                            return true;
                        }
                        wg0Var.getClass();
                        return false;
                    default:
                        tg0 tg0Var = this.f40411b.f43518b;
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
        this.f43523r = view;
        LinearLayout.LayoutParams k10 = w7.w5.k(4.0f, 8.0f, 12.0f, 8.0f, 0, -1);
        k10.width = Math.max(2, AndroidUtilities.dp(0.5f));
        linearLayout2.addView(view, k10);
        tg0 tg0Var = new tg0(this, context);
        this.f43518b = tg0Var;
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
        linearLayout2.addView(tg0Var, w7.w5.d(36.0f, -1));
        tg0Var.addTextChangedListener(new es(this, 1));
        tg0Var.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final wg0 f40411b;

            {
                this.f40411b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        wg0 wg0Var = this.f40411b;
                        if (i14 == 5) {
                            lg0 lg0Var = wg0Var.V.f43940b0;
                            if (lg0Var != null) {
                                lg0Var.h.callOnClick();
                                return true;
                            }
                            wg0Var.h(null);
                            return true;
                        }
                        wg0Var.getClass();
                        return false;
                    default:
                        tg0 tg0Var2 = this.f40411b.f43518b;
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
        if (xg0Var.f43964x && xg0Var.F == 0) {
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 2);
            this.v = a2Var;
            a2Var.e(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", xg0Var.f43965y, false, false);
            if (LocaleController.isRTL && AndroidUtilities.isSmallScreen()) {
                i13 = 56;
            } else {
                i13 = 0;
            }
            addView(a2Var, w7.w5.t(-2, -1, 51, 16, 0, 16 + i13, 0));
            a2Var.setOnClickListener(new View.OnClickListener(this) {
                public final wg0 f40714b;

                {
                    this.f40714b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            xg0 xg0Var2 = this.f40714b.V;
                            if (xg0Var2.getParentActivity() != null) {
                                boolean z11 = !xg0Var2.f43965y;
                                xg0Var2.f43965y = z11;
                                ((org.telegram.ui.Cells.a2) view2).c(z11, true);
                                if (xg0Var2.f43965y) {
                                    new org.telegram.ui.Components.zc(xg0Var2.Z, null).Q(R.raw.contacts_sync_on, 36, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).j();
                                    return;
                                } else {
                                    new org.telegram.ui.Components.zc(xg0Var2.Z, null).Q(R.raw.contacts_sync_off, 36, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).j();
                                    return;
                                }
                            }
                            return;
                        default:
                            wg0 wg0Var = this.f40714b;
                            cu cuVar = new cu(wg0Var.E, true);
                            cuVar.f36517r = new ju(wg0Var, 20);
                            wg0Var.V.presentFragment(cuVar);
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
            org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(context, 2);
            this.f43525w = a2Var2;
            String string = LocaleController.getString(R.string.DebugTestBackend);
            boolean isTestBackend = xg0Var.getConnectionsManager().isTestBackend();
            xg0Var.E = isTestBackend;
            a2Var2.e(string, "", isTestBackend, false, false);
            addView(a2Var2, w7.w5.t(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? i14 : 0), 0));
            i12 -= 24;
            a2Var2.setOnClickListener(new ai.k3(8, this, z10));
        }
        if (i12 > 0 && !AndroidUtilities.isSmallScreen()) {
            View space = new Space(context);
            space.setMinimumHeight(AndroidUtilities.dp(i12));
            addView(space, w7.w5.n(-2, -2));
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
                obj.f44161a = split[2];
                String str = split[0];
                obj.f44163c = str;
                obj.d = split[1];
                if (!TextUtils.equals(str, "FT")) {
                    String countryName = LocaleController.getCountryName(obj.d);
                    if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(obj.d, countryName)) {
                        obj.f44162b = obj.f44161a;
                        obj.f44161a = countryName;
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
        Collections.sort(this.E, Comparator$CC.comparing(new n8(6)));
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        xg0Var.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new bc0(4, this, hashMap), 10);
        if (this.f43517a.length() == 0) {
            setCountryButtonText(null);
            this.f43518b.setHintText((String) null);
            this.f43526x = 1;
        }
        if (this.f43517a.length() != 0) {
            this.f43518b.requestFocus();
            tg0 tg0Var2 = this.f43518b;
            tg0Var2.setSelection(tg0Var2.length());
        } else {
            this.f43517a.requestFocus();
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
        loadAnimation.setInterpolator(org.telegram.ui.Components.du.f25466e);
        this.d.setOutAnimation(loadAnimation);
        CharSequence text = this.d.getCurrentView().getText();
        org.telegram.ui.Components.b21 b21Var = this.d;
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(text)) && !Objects.equals(text, charSequence)) {
            z10 = true;
        } else {
            z10 = false;
        }
        b21Var.a(charSequence, z10, false);
        org.telegram.ui.Components.de0 de0Var = this.f43520e;
        if (charSequence != null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        de0Var.b(f7, f7, true);
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
        if (this.V.getParentActivity() != null && !this.K && !this.V.f43956o0) {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.f43517a.length() != 0 && this.f43518b.length() != 0) {
                String str2 = "+" + ((Object) this.f43517a.getText()) + " " + ((Object) this.f43518b.getText());
                if (!this.L) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y && !this.V.h1() && this.V.S.R() > AndroidUtilities.dp(20.0f)) {
                        xg0 xg0Var = this.V;
                        xg0Var.T = new mg0(this, 1);
                        AndroidUtilities.hideKeyboard(xg0Var.fragmentView);
                        return;
                    }
                    xg0 xg0Var2 = this.V;
                    Context context = this.V.fragmentView.getContext();
                    xg0 xg0Var3 = this.V;
                    xg0Var2.f43940b0 = new lg0(context, (ViewGroup) xg0Var3.fragmentView, xg0Var3.N, str2, new vg0(this));
                    lg0 lg0Var = this.V.f43940b0;
                    lg0Var.getClass();
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                    duration.addListener(new kg0(lg0Var, 0));
                    duration.addUpdateListener(new hg0(lg0Var, 1));
                    duration.setInterpolator(org.telegram.ui.Components.js.f27634f);
                    duration.start();
                    return;
                }
                this.L = false;
                lg0 lg0Var2 = this.V.f43940b0;
                if (lg0Var2 != null) {
                    int i11 = lg0.E;
                    lg0Var2.a();
                }
                boolean isSimAvailable = AndroidUtilities.isSimAvailable();
                int i12 = Build.VERSION.SDK_INT;
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
                        xg0Var4.f43959r.clear();
                        if (!z12) {
                            this.V.f43959r.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z13) {
                            this.V.f43959r.add("android.permission.CALL_PHONE");
                        }
                        if (!z14) {
                            this.V.f43959r.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z17 && i12 >= 26) {
                            this.V.f43959r.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!this.V.f43959r.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !this.V.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    this.V.getParentActivity().requestPermissions((String[]) this.V.f43959r.toArray(new String[0]), 6);
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
                                alertDialog$Builder.f20142a.T = LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog);
                                i10 = R.raw.calls_log;
                            } else if (z13 && z14) {
                                alertDialog$Builder.f20142a.T = LocaleController.getString("AllowReadCall", R.string.AllowReadCall);
                                i10 = R.raw.incoming_calls;
                            } else {
                                alertDialog$Builder.f20142a.T = LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog);
                                i10 = R.raw.calls_log;
                            }
                            alertDialog$Builder.m(i10, 46, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                            xg0 xg0Var5 = this.V;
                            xg0Var5.h = xg0Var5.showDialog(alertDialog$Builder.f20142a);
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
                int i13 = this.f43526x;
                if (i13 == z11) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                    this.V.k1(false, z11);
                    return;
                } else if (i13 == 2 && !BuildVars.DEBUG_VERSION) {
                    this.V.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                    this.V.k1(false, true);
                    return;
                } else {
                    String d = hf.b.d("" + ((Object) this.f43517a.getText()) + ((Object) this.f43518b.getText()), false);
                    xg0 xg0Var6 = this.V;
                    if (xg0Var6.F == 0 && (xg0Var6.getParentActivity() instanceof LaunchActivity)) {
                        for (int i14 = 0; i14 < 4; i14++) {
                            UserConfig userConfig = UserConfig.getInstance(i14);
                            if (userConfig.isClientActivated() && PhoneNumberUtils.compare(d, userConfig.getCurrentUser().phone)) {
                                boolean isTestBackend = ConnectionsManager.getInstance(i14).isTestBackend();
                                xg0 xg0Var7 = this.V;
                                if (isTestBackend == xg0Var7.E) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xg0Var7.getParentActivity());
                                    alertDialog$Builder2.f20142a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder2.f20142a.T = LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn);
                                    alertDialog$Builder2.k(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new i2.s(this, i14, 14));
                                    alertDialog$Builder2.h(LocaleController.getString("OK", R.string.OK), null);
                                    this.V.showDialog(alertDialog$Builder2.f20142a);
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
                    if (this.V.f43953l0 || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
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
                                tL_codeSettings.current_number = Collection.EL.stream(V0).anyMatch(new t80(d, 1));
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
                    bundle.putString("phone", "+" + ((Object) this.f43517a.getText()) + " " + ((Object) this.f43518b.getText()));
                    try {
                        bundle.putString("ephone", "+" + hf.b.d(this.f43517a.getText().toString(), false) + " " + hf.b.d(this.f43518b.getText().toString(), false));
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        bundle.putString("ephone", "+" + d);
                    }
                    bundle.putString("phoneFormated", d);
                    xt xtVar = this.f43527y;
                    if (xtVar != null) {
                        bundle.putString("country", xtVar.f44163c);
                    }
                    this.K = true;
                    m.f3 f3Var = new m.f3(16, false);
                    f3Var.d = "+" + ((Object) this.f43517a.getText()) + " " + ((Object) this.f43518b.getText());
                    f3Var.f15424b = this.f43527y;
                    f3Var.f15425c = (List) this.G.get(this.f43517a.getText().toString());
                    this.V.n1(ConnectionsManager.getInstance(xg0.X0(this.V)).sendRequest(tL_auth_sendCode3, new ci.hd(this, bundle, d, f3Var, tL_auth_sendCode3, 9), 27), true);
                    return;
                }
            }
            xg0.U0(this.V, this.f43521f, false);
        }
    }

    @Override
    public final void j() {
        p();
        org.telegram.ui.Cells.a2 a2Var = this.v;
        if (a2Var != null) {
            a2Var.c(this.V.f43965y, false);
        }
        AndroidUtilities.runOnUIThread(new mg0(this, 0), xg0.f43936t0);
    }

    @Override
    public final void k(Bundle bundle) {
        String string = bundle.getString("phoneview_code");
        if (string != null) {
            this.f43517a.setText(string);
        }
        String string2 = bundle.getString("phoneview_phone");
        if (string2 != null) {
            this.f43518b.setText(string2);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f43517a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("phoneview_code", obj);
        }
        String obj2 = this.f43518b.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("phoneview_phone", obj2);
        }
    }

    @Override
    public final void n() {
        this.f43519c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false);
        org.telegram.ui.Components.ia0 ia0Var = this.f43522n;
        ia0Var.setTextColor(x02);
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.gc, false));
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.b21 b21Var = this.d;
            if (i10 >= b21Var.getChildCount()) {
                break;
            }
            TextView textView = (TextView) b21Var.getChildAt(i10);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
            textView.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H6, false));
            i10++;
        }
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
        ImageView imageView = this.f43524s;
        imageView.setColorFilter(x03);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(this.V.getThemedColor(org.telegram.ui.ActionBar.h6.f20651i6), 1, -1));
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        this.h.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        int x04 = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
        ck0 ck0Var = this.f43517a;
        ck0Var.setTextColor(x04);
        int i13 = org.telegram.ui.ActionBar.h6.f20706l6;
        ck0Var.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        this.f43523r.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20688k6, false));
        int x05 = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
        tg0 tg0Var = this.f43518b;
        tg0Var.setTextColor(x05);
        tg0Var.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        tg0Var.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        org.telegram.ui.Cells.a2 a2Var = this.v;
        if (a2Var != null) {
            int i14 = org.telegram.ui.ActionBar.h6.Y6;
            int i15 = org.telegram.ui.ActionBar.h6.W6;
            int i16 = org.telegram.ui.ActionBar.h6.X6;
            CheckBoxSquare checkBoxSquare = a2Var.f21552n;
            if (checkBoxSquare != null) {
                checkBoxSquare.f23891s = i14;
                checkBoxSquare.v = i15;
                checkBoxSquare.f23892w = i16;
                checkBoxSquare.invalidate();
            }
            a2Var.g();
        }
        org.telegram.ui.Cells.a2 a2Var2 = this.f43525w;
        if (a2Var2 != null) {
            int i17 = org.telegram.ui.ActionBar.h6.Y6;
            int i18 = org.telegram.ui.ActionBar.h6.W6;
            int i19 = org.telegram.ui.ActionBar.h6.X6;
            CheckBoxSquare checkBoxSquare2 = a2Var2.f21552n;
            if (checkBoxSquare2 != null) {
                checkBoxSquare2.f23891s = i17;
                checkBoxSquare2.v = i18;
                checkBoxSquare2.f23892w = i19;
                checkBoxSquare2.invalidate();
            }
            a2Var2.g();
        }
        this.f43521f.f();
        this.f43520e.f();
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
        this.f43517a.setText(((xt) this.E.get(i10)).f44163c);
        this.I = false;
    }

    public final void p() {
        boolean z10;
        boolean z11;
        xg0 xg0Var;
        boolean z12;
        xt xtVar;
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
                        xg0Var = this.V;
                        if (!xg0Var.f43963w && (!z10 || !z11)) {
                            xg0Var.f43961s.clear();
                            if (!z10) {
                                this.V.f43961s.add("android.permission.READ_PHONE_STATE");
                            }
                            if (!z11 && i10 >= 26) {
                                this.V.f43961s.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (!this.V.f43961s.isEmpty()) {
                                new cg0(1, this, new ArrayList(this.V.f43961s)).run();
                                return;
                            }
                            return;
                        }
                        this.R = true;
                        if (xg0Var.f43964x && z10 && z11) {
                            this.f43517a.setAlpha(0.0f);
                            this.f43518b.setAlpha(0.0f);
                            String d = hf.b.d(telephonyManager.getLine1Number(), false);
                            if (!TextUtils.isEmpty(d)) {
                                int i11 = 4;
                                String str = null;
                                if (d.length() > 4) {
                                    while (true) {
                                        if (i11 >= 1) {
                                            String substring = d.substring(0, i11);
                                            List list = (List) this.F.get(substring);
                                            if (list == null) {
                                                xtVar = null;
                                            } else if (list.size() > 1) {
                                                String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + substring, null);
                                                xtVar = (xt) list.get(list.size() - 1);
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
                                                        xt xtVar2 = (xt) obj;
                                                        if (Objects.equals(xtVar2.d, string)) {
                                                            xtVar = xtVar2;
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                xtVar = (xt) list.get(0);
                                            }
                                            if (xtVar != null) {
                                                str = d.substring(i11);
                                                this.f43517a.setText(substring);
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
                                        this.f43517a.setText(d.substring(0, 1));
                                    }
                                }
                                if (str != null) {
                                    this.f43518b.requestFocus();
                                    this.f43518b.setText(str);
                                    tg0 tg0Var = this.f43518b;
                                    tg0Var.setSelection(tg0Var.length());
                                }
                            }
                            if (this.f43518b.length() > 0) {
                                AnimatorSet duration = new AnimatorSet().setDuration(300L);
                                ck0 ck0Var = this.f43517a;
                                Property property = View.ALPHA;
                                duration.playTogether(ObjectAnimator.ofFloat(ck0Var, property, 1.0f), ObjectAnimator.ofFloat(this.f43518b, property, 1.0f));
                                duration.start();
                                this.L = true;
                                return;
                            }
                            this.f43517a.setAlpha(1.0f);
                            this.f43518b.setAlpha(1.0f);
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    xg0Var = this.V;
                    if (!xg0Var.f43963w) {
                    }
                    this.R = true;
                    if (xg0Var.f43964x) {
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public final void q() {
        String str;
        int i10;
        String str2 = this.P;
        tg0 tg0Var = this.f43518b;
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

    public final void r() {
        String country;
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        this.V.getConnectionsManager().sendRequest(tL_help_getCountriesList, new qg0(this, 0), 10);
    }

    public final void s(boolean z10) {
        xg0 xg0Var = this.V;
        if (xg0Var.F == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.T) {
            if (z10 || !this.S) {
                this.T = true;
                this.S = true;
                this.U = PasskeysController.login(getContext(), xg0.Y0(xg0Var), z10, new pg0(this, 0));
            }
        }
    }

    public final void t(String str, xt xtVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(xtVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e00(4), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) xtVar.f44161a);
        setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.d.getCurrentView().getPaint().getFontMetricsInt(), false));
        this.P = str;
        this.Q = -1;
        q();
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
