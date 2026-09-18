package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;
public final class w11 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.wl0 f38665a;
    public boolean f38666a0;
    public u11 f38667b;
    public AnimatorSet f38668c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long e;
    public final long f38669f;
    public final boolean h;
    public boolean f38670n;
    public v11 f38671r;
    public org.telegram.ui.Components.eo f38672s;
    public int v;
    public int f38673w;
    public int f38674x;
    public int f38675y;

    public w11(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.d = e6Var;
        this.e = bundle.getLong("dialog_id");
        this.f38669f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(w11 w11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(w11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        u11 u11Var = w11Var.f38667b;
        if (u11Var != null) {
            u11Var.m(w11Var.H);
        }
    }

    public static void V(final w11 w11Var, Context context, String str, View view, int i10) {
        String str2;
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        String str3;
        long j3 = w11Var.f38669f;
        long j10 = w11Var.e;
        org.telegram.ui.ActionBar.e6 e6Var = w11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == w11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18622a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new r11(w11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                w11Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19301q7, false));
                }
            } else if (i10 == w11Var.F) {
                Bundle f7 = t8.b.f(j10, "dialog_id");
                f7.putLong("topic_id", j3);
                w11Var.presentFragment(new bl0(f7, e6Var));
            } else if (i10 == w11Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(w11Var.currentAccount);
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    if (uri != null) {
                        str2 = uri.getPath();
                    } else {
                        str2 = null;
                    }
                    String string2 = notificationsSettings.getString("ringtone_path_" + str, str2);
                    if (string2 != null && !string2.equals("NoSound")) {
                        parcelable = string2.equals(str2) ? uri : Uri.parse(string2);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    w11Var.startActivityForResult(intent, 13);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i10 == w11Var.G) {
                Activity parentActivity = w11Var.getParentActivity();
                long j11 = w11Var.e;
                long j12 = w11Var.f38669f;
                Runnable runnable = new Runnable(w11Var) {
                    public final w11 f37182b;

                    {
                        this.f37182b = w11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                w11 w11Var2 = this.f37182b;
                                u11 u11Var = w11Var2.f38667b;
                                if (u11Var != null) {
                                    u11Var.m(w11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                w11 w11Var3 = this.f37182b;
                                u11 u11Var2 = w11Var3.f38667b;
                                if (u11Var2 != null) {
                                    u11Var2.m(w11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                w11 w11Var4 = this.f37182b;
                                u11 u11Var3 = w11Var4.f38667b;
                                if (u11Var3 != null) {
                                    u11Var3.m(w11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                w11 w11Var5 = this.f37182b;
                                u11 u11Var4 = w11Var5.f38667b;
                                if (u11Var4 != null) {
                                    u11Var4.m(w11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.e6 e6Var2 = w11Var.d;
                Pattern pattern = org.telegram.ui.Components.e5.f23785a;
                if (j11 != 0) {
                    str3 = a4.a.o(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                w11Var.showDialog(org.telegram.ui.Components.e5.Y(parentActivity, j11, j12, str3, runnable, e6Var2));
            } else {
                int i11 = 2;
                if (i10 == w11Var.f38675y) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    boolean z10 = !w8Var.e.h;
                    w11Var.f38670n = z10;
                    w8Var.setChecked(z10);
                    int childCount = w11Var.f38665a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.gl0 gl0Var = (org.telegram.ui.Components.gl0) w11Var.f38665a.U(w11Var.f38665a.getChildAt(i12));
                        int i13 = gl0Var.f42932f;
                        View view2 = gl0Var.f42929a;
                        int b10 = gl0Var.b();
                        if (b10 != w11Var.f38675y && b10 != w11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == w11Var.E) {
                                                    ((org.telegram.ui.Cells.w8) view2).e(arrayList, w11Var.f38670n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.k6) view2).b(arrayList, w11Var.f38670n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, w11Var.f38670n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.e9) view2).c(arrayList, w11Var.f38670n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ea) view2).a(arrayList, w11Var.f38670n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, w11Var.f38670n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = w11Var.f38668c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        w11Var.f38668c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        w11Var.f38668c.addListener(new gp0(w11Var, 16));
                        w11Var.f38668c.setDuration(150L);
                        w11Var.f38668c.start();
                    }
                } else if (i10 == w11Var.E) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    Switch r32 = w8Var2.e;
                    MessagesController.getNotificationsSettings(w11Var.currentAccount).edit().putBoolean(t8.b.i("content_preview_", str), !r32.h).apply();
                    w8Var2.setChecked(!r32.h);
                } else if (i10 == w11Var.R) {
                    w11Var.showDialog(org.telegram.ui.Components.e5.Y(w11Var.getParentActivity(), w11Var.e, w11Var.f38669f, t8.b.i("calls_vibrate_", str), new Runnable(w11Var) {
                        public final w11 f37182b;

                        {
                            this.f37182b = w11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    w11 w11Var2 = this.f37182b;
                                    u11 u11Var = w11Var2.f38667b;
                                    if (u11Var != null) {
                                        u11Var.m(w11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    w11 w11Var3 = this.f37182b;
                                    u11 u11Var2 = w11Var3.f38667b;
                                    if (u11Var2 != null) {
                                        u11Var2.m(w11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    w11 w11Var4 = this.f37182b;
                                    u11 u11Var3 = w11Var4.f38667b;
                                    if (u11Var3 != null) {
                                        u11Var3.m(w11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    w11 w11Var5 = this.f37182b;
                                    u11 u11Var4 = w11Var5.f38667b;
                                    if (u11Var4 != null) {
                                        u11Var4.m(w11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, w11Var.d));
                } else if (i10 == w11Var.I) {
                    w11Var.showDialog(org.telegram.ui.Components.e5.I(w11Var.getParentActivity(), w11Var.e, w11Var.f38669f, -1, new Runnable(w11Var) {
                        public final w11 f37182b;

                        {
                            this.f37182b = w11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    w11 w11Var2 = this.f37182b;
                                    u11 u11Var = w11Var2.f38667b;
                                    if (u11Var != null) {
                                        u11Var.m(w11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    w11 w11Var3 = this.f37182b;
                                    u11 u11Var2 = w11Var3.f38667b;
                                    if (u11Var2 != null) {
                                        u11Var2.m(w11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    w11 w11Var4 = this.f37182b;
                                    u11 u11Var3 = w11Var4.f38667b;
                                    if (u11Var3 != null) {
                                        u11Var3.m(w11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    w11 w11Var5 = this.f37182b;
                                    u11 u11Var4 = w11Var5.f38667b;
                                    if (u11Var4 != null) {
                                        u11Var4.m(w11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, w11Var.d));
                } else if (i10 == w11Var.H) {
                    if (w11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(w11Var.currentAccount);
                        int d = org.telegram.messenger.q.d("smart_max_count_", str, notificationsSettings2, 2);
                        int d10 = org.telegram.messenger.q.d("smart_delay_", str, notificationsSettings2, 180);
                        if (d != 0) {
                            i11 = d;
                        }
                        Activity parentActivity2 = w11Var.getParentActivity();
                        r11 r11Var = new r11(w11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.e5.f23785a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.j6.f19169j5;
                            if (e6Var != null) {
                                w02 = e6Var.g0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.j6.f19133h5;
                            if (e6Var != null) {
                                w03 = e6Var.g0(i15);
                            } else {
                                w03 = org.telegram.ui.ActionBar.j6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.j6.Ji;
                            if (e6Var != null) {
                                e6Var.g0(i16);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.j6.Ni;
                            if (e6Var != null) {
                                e6Var.g0(i17);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.j6.E8;
                            if (e6Var != null) {
                                e6Var.g0(i18);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.j6.G8;
                            if (e6Var != null) {
                                e6Var.g0(i19);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.j6.f19152i6;
                            if (e6Var != null) {
                                e6Var.g0(i20);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.j6.Sh;
                            if (e6Var != null) {
                                w04 = e6Var.g0(i21);
                            } else {
                                w04 = org.telegram.ui.ActionBar.j6.w0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.j6.Oh;
                            if (e6Var != null) {
                                w05 = e6Var.g0(i22);
                            } else {
                                w05 = org.telegram.ui.ActionBar.j6.w0(null, i22, false);
                            }
                            int i23 = w05;
                            int i24 = org.telegram.ui.ActionBar.j6.Qh;
                            if (e6Var != null) {
                                w06 = e6Var.g0(i24);
                            } else {
                                w06 = org.telegram.ui.ActionBar.j6.w0(null, i24, false);
                            }
                            int i25 = w06;
                            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, e6Var);
                            a3Var.a();
                            ?? dd0Var = new org.telegram.ui.Components.dd0(parentActivity2, e6Var);
                            dd0Var.setMinValue(0);
                            dd0Var.setMaxValue(10);
                            dd0Var.setTextColor(w02);
                            dd0Var.setValue(i11 - 1);
                            dd0Var.setWrapSelectorWheel(false);
                            dd0Var.setFormatter(new es(21));
                            ?? dd0Var2 = new org.telegram.ui.Components.dd0(parentActivity2, e6Var);
                            dd0Var2.setMinValue(0);
                            dd0Var2.setMaxValue(10);
                            dd0Var2.setTextColor(w02);
                            dd0Var2.setValue((d10 / 60) - 1);
                            dd0Var2.setWrapSelectorWheel(false);
                            dd0Var2.setFormatter(new es(22));
                            org.telegram.ui.Components.dd0 dd0Var3 = new org.telegram.ui.Components.dd0(parentActivity2, e6Var);
                            dd0Var3.setMinValue(0);
                            dd0Var3.setMaxValue(0);
                            dd0Var3.setTextColor(w02);
                            dd0Var3.setValue(0);
                            dd0Var3.setWrapSelectorWheel(false);
                            dd0Var3.setFormatter(new es(23));
                            org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(parentActivity2, dd0Var, dd0Var2, dd0Var3);
                            w3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            w3Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(w02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new bi.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            w3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ai.p4 p4Var = new ai.p4(parentActivity2, 18);
                            linearLayout.addView((View) dd0Var, w7.y5.l(0.4f, 0, 270));
                            linearLayout.addView(dd0Var3, w7.y5.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) dd0Var2, w7.y5.l(0.4f, 0, 270));
                            p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            p4Var.setGravity(17);
                            p4Var.setTextColor(w04);
                            p4Var.setTextSize(1, 14.0f);
                            p4Var.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, i23, i25, i25));
                            p4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            w3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                            es esVar = new es(10);
                            dd0Var.setOnValueChangedListener(esVar);
                            dd0Var2.setOnValueChangedListener(esVar);
                            p4Var.setOnClickListener(new ai.p5((Object) dd0Var, (Object) dd0Var2, r11Var, a3Var, 7));
                            a3Var.b(w3Var);
                            org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18627a;
                            f3Var.show();
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == w11Var.U) {
                    if (w11Var.getParentActivity() != null) {
                        w11Var.showDialog(org.telegram.ui.Components.e5.u(w11Var.getParentActivity(), w11Var.e, w11Var.f38669f, -1, new Runnable(w11Var) {
                            public final w11 f37182b;

                            {
                                this.f37182b = w11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        w11 w11Var2 = this.f37182b;
                                        u11 u11Var = w11Var2.f38667b;
                                        if (u11Var != null) {
                                            u11Var.m(w11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        w11 w11Var3 = this.f37182b;
                                        u11 u11Var2 = w11Var3.f38667b;
                                        if (u11Var2 != null) {
                                            u11Var2.m(w11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        w11 w11Var4 = this.f37182b;
                                        u11 u11Var3 = w11Var4.f38667b;
                                        if (u11Var3 != null) {
                                            u11Var3.m(w11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        w11 w11Var5 = this.f37182b;
                                        u11 u11Var4 = w11Var5.f38667b;
                                        if (u11Var4 != null) {
                                            u11Var4.m(w11Var5.U);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, w11Var.d));
                    }
                } else if (i10 == w11Var.L) {
                    MessagesController.getNotificationsSettings(w11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag = w11Var.f38665a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == w11Var.M) {
                    MessagesController.getNotificationsSettings(w11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = w11Var.f38665a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == w11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(w11Var.currentAccount).edit();
                    if (w11Var.Z && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    w11Var.getNotificationsController().updateServerNotificationsSettings(j10, j3);
                }
            }
        }
    }

    public static void W(w11 w11Var, String str) {
        w11Var.f38666a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(w11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        w11Var.finishFragment();
        v11 v11Var = w11Var.f38671r;
        if (v11Var != null) {
            v11Var.c0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19099f8;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.j6.v0(i10, e6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19395v8, e6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.e;
        long j10 = this.f38669f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new t11(this, sharedPrefKey));
        org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(context, null, false, e6Var);
        this.f38672s = eoVar;
        eoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.eo eoVar2 = this.f38672s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(eoVar2, 0, w7.y5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
                ng.d.p(this.f38672s.getAvatarImageView(), findTopic, false, true, e6Var);
                this.f38672s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f38672s.setChatAvatar(chat);
                this.f38672s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f38672s.setUserAvatar(user);
                this.f38672s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f38672s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f38672s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19006a7, e6Var));
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.f38665a = wl0Var;
        wl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f38665a);
        frameLayout.addView(this.f38665a, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.wl0 wl0Var2 = this.f38665a;
        u11 u11Var = new u11(this, context);
        this.f38667b = u11Var;
        wl0Var2.setAdapter(u11Var);
        this.f38665a.setItemAnimator(null);
        this.f38665a.setLayoutAnimation(null);
        this.f38665a.setLayoutManager(new gg.b0(17));
        this.f38665a.setOnItemClickListener(new yb1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f38667b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        wy0 wy0Var = new wy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.ya.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19062d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19006a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19340s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19395v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19359t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19152i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19184k0, null, null, org.telegram.ui.ActionBar.j6.f19063d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19117g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19135h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19464z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusColor"}, null, null, -1, wy0Var, org.telegram.ui.ActionBar.j6.f19445y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusOnlineColor"}, null, null, -1, wy0Var, org.telegram.ui.ActionBar.j6.f19247n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38665a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, null, org.telegram.ui.ActionBar.j6.f19313r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.j6.U7));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        String str;
        int i12;
        Ringtone ringtone;
        if (i11 == -1 && intent != null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(ApplicationLoader.applicationContext, uri)) != null) {
                if (i10 == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = LocaleController.getString(R.string.DefaultRingtone);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = LocaleController.getString(R.string.SoundDefault);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            } else {
                str = null;
            }
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f38669f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.e, this.f38669f);
            } else if (i10 == 13) {
                if (str != null) {
                    edit.putString("ringtone_" + sharedPrefKey, str);
                    edit.putString("ringtone_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("ringtone_" + sharedPrefKey, "NoSound");
                    edit.putString("ringtone_path_" + sharedPrefKey, "NoSound");
                }
            }
            edit.apply();
            u11 u11Var = this.f38667b;
            if (u11Var != null) {
                if (i10 == 13) {
                    i12 = this.Q;
                } else {
                    i12 = this.F;
                }
                u11Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f38666a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f38669f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f38665a.setPadding(0, 0, 0, i13);
        this.f38665a.setClipToPadding(false);
    }
}
