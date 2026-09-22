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
    public org.telegram.ui.Components.yl0 f38666a;
    public boolean f38667a0;
    public u11 f38668b;
    public AnimatorSet f38669c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final long f38670f;
    public final boolean h;
    public boolean f38671n;
    public v11 f38672r;
    public org.telegram.ui.Components.eo f38673s;
    public int v;
    public int f38674w;
    public int f38675x;
    public int f38676y;

    public w11(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.d = f6Var;
        this.e = bundle.getLong("dialog_id");
        this.f38670f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(w11 w11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(w11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        u11 u11Var = w11Var.f38668b;
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
        long j3 = w11Var.f38670f;
        long j10 = w11Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = w11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == w11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new r11(w11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                w11Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
                }
            } else if (i10 == w11Var.F) {
                Bundle e = v7.j0.e(j10, "dialog_id");
                e.putLong("topic_id", j3);
                w11Var.presentFragment(new bl0(e, f6Var));
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == w11Var.G) {
                Activity parentActivity = w11Var.getParentActivity();
                long j11 = w11Var.e;
                long j12 = w11Var.f38670f;
                Runnable runnable = new Runnable(w11Var) {
                    public final w11 f37299b;

                    {
                        this.f37299b = w11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                w11 w11Var2 = this.f37299b;
                                u11 u11Var = w11Var2.f38668b;
                                if (u11Var != null) {
                                    u11Var.m(w11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                w11 w11Var3 = this.f37299b;
                                u11 u11Var2 = w11Var3.f38668b;
                                if (u11Var2 != null) {
                                    u11Var2.m(w11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                w11 w11Var4 = this.f37299b;
                                u11 u11Var3 = w11Var4.f38668b;
                                if (u11Var3 != null) {
                                    u11Var3.m(w11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                w11 w11Var5 = this.f37299b;
                                u11 u11Var4 = w11Var5.f38668b;
                                if (u11Var4 != null) {
                                    u11Var4.m(w11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.f6 f6Var2 = w11Var.d;
                Pattern pattern = org.telegram.ui.Components.d5.f23562a;
                if (j11 != 0) {
                    str3 = a4.a.o(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                w11Var.showDialog(org.telegram.ui.Components.d5.Y(parentActivity, j11, j12, str3, runnable, f6Var2));
            } else {
                int i11 = 2;
                if (i10 == w11Var.f38676y) {
                    org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                    boolean z10 = !x8Var.e.h;
                    w11Var.f38671n = z10;
                    x8Var.setChecked(z10);
                    int childCount = w11Var.f38666a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.il0 il0Var = (org.telegram.ui.Components.il0) w11Var.f38666a.U(w11Var.f38666a.getChildAt(i12));
                        int i13 = il0Var.f42998f;
                        View view2 = il0Var.f42995a;
                        int b10 = il0Var.b();
                        if (b10 != w11Var.f38676y && b10 != w11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == w11Var.E) {
                                                    ((org.telegram.ui.Cells.x8) view2).e(arrayList, w11Var.f38671n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.l6) view2).b(arrayList, w11Var.f38671n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.z8) view2).a(arrayList, w11Var.f38671n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.f9) view2).c(arrayList, w11Var.f38671n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.fa) view2).a(arrayList, w11Var.f38671n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.n4) view2).a(arrayList, w11Var.f38671n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = w11Var.f38669c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        w11Var.f38669c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        w11Var.f38669c.addListener(new gp0(w11Var, 16));
                        w11Var.f38669c.setDuration(150L);
                        w11Var.f38669c.start();
                    }
                } else if (i10 == w11Var.E) {
                    org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
                    Switch r32 = x8Var2.e;
                    MessagesController.getNotificationsSettings(w11Var.currentAccount).edit().putBoolean(v7.j0.g("content_preview_", str), !r32.h).apply();
                    x8Var2.setChecked(!r32.h);
                } else if (i10 == w11Var.R) {
                    w11Var.showDialog(org.telegram.ui.Components.d5.Y(w11Var.getParentActivity(), w11Var.e, w11Var.f38670f, v7.j0.g("calls_vibrate_", str), new Runnable(w11Var) {
                        public final w11 f37299b;

                        {
                            this.f37299b = w11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    w11 w11Var2 = this.f37299b;
                                    u11 u11Var = w11Var2.f38668b;
                                    if (u11Var != null) {
                                        u11Var.m(w11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    w11 w11Var3 = this.f37299b;
                                    u11 u11Var2 = w11Var3.f38668b;
                                    if (u11Var2 != null) {
                                        u11Var2.m(w11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    w11 w11Var4 = this.f37299b;
                                    u11 u11Var3 = w11Var4.f38668b;
                                    if (u11Var3 != null) {
                                        u11Var3.m(w11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    w11 w11Var5 = this.f37299b;
                                    u11 u11Var4 = w11Var5.f38668b;
                                    if (u11Var4 != null) {
                                        u11Var4.m(w11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, w11Var.d));
                } else if (i10 == w11Var.I) {
                    w11Var.showDialog(org.telegram.ui.Components.d5.I(w11Var.getParentActivity(), w11Var.e, w11Var.f38670f, -1, new Runnable(w11Var) {
                        public final w11 f37299b;

                        {
                            this.f37299b = w11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    w11 w11Var2 = this.f37299b;
                                    u11 u11Var = w11Var2.f38668b;
                                    if (u11Var != null) {
                                        u11Var.m(w11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    w11 w11Var3 = this.f37299b;
                                    u11 u11Var2 = w11Var3.f38668b;
                                    if (u11Var2 != null) {
                                        u11Var2.m(w11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    w11 w11Var4 = this.f37299b;
                                    u11 u11Var3 = w11Var4.f38668b;
                                    if (u11Var3 != null) {
                                        u11Var3.m(w11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    w11 w11Var5 = this.f37299b;
                                    u11 u11Var4 = w11Var5.f38668b;
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
                        int c10 = org.telegram.messenger.l0.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.l0.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = w11Var.getParentActivity();
                        r11 r11Var = new r11(w11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.d5.f23562a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.j6.f19216j5;
                            if (f6Var != null) {
                                w02 = f6Var.f0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.j6.f19180h5;
                            if (f6Var != null) {
                                w03 = f6Var.f0(i15);
                            } else {
                                w03 = org.telegram.ui.ActionBar.j6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.j6.Ji;
                            if (f6Var != null) {
                                f6Var.f0(i16);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.j6.Ni;
                            if (f6Var != null) {
                                f6Var.f0(i17);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.j6.E8;
                            if (f6Var != null) {
                                f6Var.f0(i18);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.j6.G8;
                            if (f6Var != null) {
                                f6Var.f0(i19);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.j6.f19199i6;
                            if (f6Var != null) {
                                f6Var.f0(i20);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.j6.Sh;
                            if (f6Var != null) {
                                w04 = f6Var.f0(i21);
                            } else {
                                w04 = org.telegram.ui.ActionBar.j6.w0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.j6.Oh;
                            if (f6Var != null) {
                                w05 = f6Var.f0(i22);
                            } else {
                                w05 = org.telegram.ui.ActionBar.j6.w0(null, i22, false);
                            }
                            int i23 = w05;
                            int i24 = org.telegram.ui.ActionBar.j6.Qh;
                            if (f6Var != null) {
                                w06 = f6Var.f0(i24);
                            } else {
                                w06 = org.telegram.ui.ActionBar.j6.w0(null, i24, false);
                            }
                            int i25 = w06;
                            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, f6Var);
                            a3Var.a();
                            ?? fd0Var = new org.telegram.ui.Components.fd0(parentActivity2, f6Var);
                            fd0Var.setMinValue(0);
                            fd0Var.setMaxValue(10);
                            fd0Var.setTextColor(w02);
                            fd0Var.setValue(i11 - 1);
                            fd0Var.setWrapSelectorWheel(false);
                            fd0Var.setFormatter(new es(23));
                            ?? fd0Var2 = new org.telegram.ui.Components.fd0(parentActivity2, f6Var);
                            fd0Var2.setMinValue(0);
                            fd0Var2.setMaxValue(10);
                            fd0Var2.setTextColor(w02);
                            fd0Var2.setValue((c11 / 60) - 1);
                            fd0Var2.setWrapSelectorWheel(false);
                            fd0Var2.setFormatter(new es(24));
                            org.telegram.ui.Components.fd0 fd0Var3 = new org.telegram.ui.Components.fd0(parentActivity2, f6Var);
                            fd0Var3.setMinValue(0);
                            fd0Var3.setMaxValue(0);
                            fd0Var3.setTextColor(w02);
                            fd0Var3.setValue(0);
                            fd0Var3.setWrapSelectorWheel(false);
                            fd0Var3.setFormatter(new es(25));
                            org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(parentActivity2, fd0Var, fd0Var2, fd0Var3);
                            v3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            v3Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
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
                            v3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ai.p4 p4Var = new ai.p4(parentActivity2, 18);
                            linearLayout.addView((View) fd0Var, w7.y5.l(0.4f, 0, 270));
                            linearLayout.addView(fd0Var3, w7.y5.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) fd0Var2, w7.y5.l(0.4f, 0, 270));
                            p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            p4Var.setGravity(17);
                            p4Var.setTextColor(w04);
                            p4Var.setTextSize(1, 14.0f);
                            p4Var.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, i23, i25, i25));
                            p4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            v3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                            es esVar = new es(12);
                            fd0Var.setOnValueChangedListener(esVar);
                            fd0Var2.setOnValueChangedListener(esVar);
                            p4Var.setOnClickListener(new ai.p5((Object) fd0Var, (Object) fd0Var2, r11Var, a3Var, 7));
                            a3Var.b(v3Var);
                            org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18674a;
                            f3Var.show();
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == w11Var.U) {
                    if (w11Var.getParentActivity() != null) {
                        w11Var.showDialog(org.telegram.ui.Components.d5.u(w11Var.getParentActivity(), w11Var.e, w11Var.f38670f, -1, new Runnable(w11Var) {
                            public final w11 f37299b;

                            {
                                this.f37299b = w11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        w11 w11Var2 = this.f37299b;
                                        u11 u11Var = w11Var2.f38668b;
                                        if (u11Var != null) {
                                            u11Var.m(w11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        w11 w11Var3 = this.f37299b;
                                        u11 u11Var2 = w11Var3.f38668b;
                                        if (u11Var2 != null) {
                                            u11Var2.m(w11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        w11 w11Var4 = this.f37299b;
                                        u11 u11Var3 = w11Var4.f38668b;
                                        if (u11Var3 != null) {
                                            u11Var3.m(w11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        w11 w11Var5 = this.f37299b;
                                        u11 u11Var4 = w11Var5.f38668b;
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
                    ((org.telegram.ui.Cells.l6) view).a(true, true);
                    View findViewWithTag = w11Var.f38666a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.l6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == w11Var.M) {
                    MessagesController.getNotificationsSettings(w11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.l6) view).a(true, true);
                    View findViewWithTag2 = w11Var.f38666a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.l6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == w11Var.O) {
                    org.telegram.ui.Cells.x8 x8Var3 = (org.telegram.ui.Cells.x8) view;
                    boolean z11 = x8Var3.e.h;
                    boolean z12 = !z11;
                    x8Var3.setChecked(z12);
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
        w11Var.f38667a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(w11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        w11Var.finishFragment();
        v11 v11Var = w11Var.f38672r;
        if (v11Var != null) {
            v11Var.c0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19146f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19442v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.e;
        long j10 = this.f38670f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new t11(this, sharedPrefKey));
        org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(context, null, false, f6Var);
        this.f38673s = eoVar;
        eoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.eo eoVar2 = this.f38673s;
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
                ng.d.p(this.f38673s.getAvatarImageView(), findTopic, false, true, f6Var);
                this.f38673s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f38673s.setChatAvatar(chat);
                this.f38673s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f38673s.setUserAvatar(user);
                this.f38673s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f38673s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f38673s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19053a7, f6Var));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f38666a = yl0Var;
        yl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f38666a);
        frameLayout.addView(this.f38666a, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.yl0 yl0Var2 = this.f38666a;
        u11 u11Var = new u11(this, context);
        this.f38668b = u11Var;
        yl0Var2.setAdapter(u11Var);
        this.f38666a.setItemAnimator(null);
        this.f38666a.setLayoutAnimation(null);
        this.f38666a.setLayoutManager(new gg.b0(17));
        this.f38666a.setOnItemClickListener(new ac1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f38668b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        wy0 wy0Var = new wy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 16, new Class[]{org.telegram.ui.Cells.n4.class, org.telegram.ui.Cells.fa.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.l6.class, org.telegram.ui.Cells.za.class, org.telegram.ui.Cells.x8.class, org.telegram.ui.Cells.t8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19109d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19053a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19387s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19442v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19406t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19199i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19231k0, null, null, org.telegram.ui.ActionBar.j6.f19110d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 8192, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19164g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 16384, new Class[]{org.telegram.ui.Cells.l6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19182h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19511z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, wy0Var, org.telegram.ui.ActionBar.j6.f19492y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, wy0Var, org.telegram.ui.ActionBar.j6.f19294n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38666a, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, org.telegram.ui.ActionBar.j6.f19360r0, null, org.telegram.ui.ActionBar.j6.J7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f38670f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.e, this.f38670f);
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
            u11 u11Var = this.f38668b;
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
        if (!this.f38667a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f38670f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f38666a.setPadding(0, 0, 0, i13);
        this.f38666a.setClipToPadding(false);
    }
}
