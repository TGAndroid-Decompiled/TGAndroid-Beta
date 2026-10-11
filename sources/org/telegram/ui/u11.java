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
public final class u11 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.rm0 f42346a;
    public boolean f42347a0;
    public s11 f42348b;
    public AnimatorSet f42349c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final long f42350e;
    public final long f42351f;
    public final boolean h;
    public boolean f42352n;
    public t11 f42353r;
    public org.telegram.ui.Components.uo f42354s;
    public int v;
    public int f42355w;
    public int f42356x;
    public int f42357y;

    public u11(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.d = d6Var;
        this.f42350e = bundle.getLong("dialog_id");
        this.f42351f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(u11 u11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(u11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        s11 s11Var = u11Var.f42348b;
        if (s11Var != null) {
            s11Var.m(u11Var.H);
        }
    }

    public static void V(final u11 u11Var, Context context, String str, View view, int i10) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        long j3 = u11Var.f42351f;
        long j10 = u11Var.f42350e;
        org.telegram.ui.ActionBar.d6 d6Var = u11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == u11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new p11(u11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                u11Var.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
                }
            } else if (i10 == u11Var.F) {
                Bundle f7 = sc.v.f(j10, "dialog_id");
                f7.putLong("topic_id", j3);
                u11Var.presentFragment(new zk0(f7, d6Var));
            } else if (i10 == u11Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(u11Var.currentAccount);
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
                    u11Var.startActivityForResult(intent, 13);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == u11Var.G) {
                Activity parentActivity = u11Var.getParentActivity();
                long j11 = u11Var.f42350e;
                long j12 = u11Var.f42351f;
                Runnable runnable = new Runnable(u11Var) {
                    public final u11 f41055b;

                    {
                        this.f41055b = u11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                u11 u11Var2 = this.f41055b;
                                s11 s11Var = u11Var2.f42348b;
                                if (s11Var != null) {
                                    s11Var.m(u11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                u11 u11Var3 = this.f41055b;
                                s11 s11Var2 = u11Var3.f42348b;
                                if (s11Var2 != null) {
                                    s11Var2.m(u11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                u11 u11Var4 = this.f41055b;
                                s11 s11Var3 = u11Var4.f42348b;
                                if (s11Var3 != null) {
                                    s11Var3.m(u11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                u11 u11Var5 = this.f41055b;
                                s11 s11Var4 = u11Var5.f42348b;
                                if (s11Var4 != null) {
                                    s11Var4.m(u11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.d6 d6Var2 = u11Var.d;
                Pattern pattern = org.telegram.ui.Components.g5.f26658a;
                if (j11 != 0) {
                    str3 = a1.g.p(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                u11Var.showDialog(org.telegram.ui.Components.g5.X(parentActivity, j11, j12, str3, runnable, d6Var2));
            } else {
                int i11 = 2;
                if (i10 == u11Var.f42357y) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    boolean z10 = !w8Var.f23716e.h;
                    u11Var.f42352n = z10;
                    w8Var.setChecked(z10);
                    int childCount = u11Var.f42346a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.bm0 bm0Var = (org.telegram.ui.Components.bm0) u11Var.f42346a.T(u11Var.f42346a.getChildAt(i12));
                        int i13 = bm0Var.f47786f;
                        View view2 = bm0Var.f47782a;
                        int b10 = bm0Var.b();
                        if (b10 != u11Var.f42357y && b10 != u11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == u11Var.E) {
                                                    ((org.telegram.ui.Cells.w8) view2).e(arrayList, u11Var.f42352n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.k6) view2).b(arrayList, u11Var.f42352n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, u11Var.f42352n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.e9) view2).c(arrayList, u11Var.f42352n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ca) view2).a(arrayList, u11Var.f42352n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, u11Var.f42352n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = u11Var.f42349c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        u11Var.f42349c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        u11Var.f42349c.addListener(new dp0(u11Var, 16));
                        u11Var.f42349c.setDuration(150L);
                        u11Var.f42349c.start();
                    }
                } else if (i10 == u11Var.E) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    Switch r32 = w8Var2.f23716e;
                    MessagesController.getNotificationsSettings(u11Var.currentAccount).edit().putBoolean(sc.v.i("content_preview_", str), !r32.h).apply();
                    w8Var2.setChecked(!r32.h);
                } else if (i10 == u11Var.R) {
                    u11Var.showDialog(org.telegram.ui.Components.g5.X(u11Var.getParentActivity(), u11Var.f42350e, u11Var.f42351f, sc.v.i("calls_vibrate_", str), new Runnable(u11Var) {
                        public final u11 f41055b;

                        {
                            this.f41055b = u11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    u11 u11Var2 = this.f41055b;
                                    s11 s11Var = u11Var2.f42348b;
                                    if (s11Var != null) {
                                        s11Var.m(u11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    u11 u11Var3 = this.f41055b;
                                    s11 s11Var2 = u11Var3.f42348b;
                                    if (s11Var2 != null) {
                                        s11Var2.m(u11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    u11 u11Var4 = this.f41055b;
                                    s11 s11Var3 = u11Var4.f42348b;
                                    if (s11Var3 != null) {
                                        s11Var3.m(u11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    u11 u11Var5 = this.f41055b;
                                    s11 s11Var4 = u11Var5.f42348b;
                                    if (s11Var4 != null) {
                                        s11Var4.m(u11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, u11Var.d));
                } else if (i10 == u11Var.I) {
                    u11Var.showDialog(org.telegram.ui.Components.g5.H(u11Var.getParentActivity(), u11Var.f42350e, u11Var.f42351f, -1, new Runnable(u11Var) {
                        public final u11 f41055b;

                        {
                            this.f41055b = u11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    u11 u11Var2 = this.f41055b;
                                    s11 s11Var = u11Var2.f42348b;
                                    if (s11Var != null) {
                                        s11Var.m(u11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    u11 u11Var3 = this.f41055b;
                                    s11 s11Var2 = u11Var3.f42348b;
                                    if (s11Var2 != null) {
                                        s11Var2.m(u11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    u11 u11Var4 = this.f41055b;
                                    s11 s11Var3 = u11Var4.f42348b;
                                    if (s11Var3 != null) {
                                        s11Var3.m(u11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    u11 u11Var5 = this.f41055b;
                                    s11 s11Var4 = u11Var5.f42348b;
                                    if (s11Var4 != null) {
                                        s11Var4.m(u11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, u11Var.d));
                } else if (i10 == u11Var.H) {
                    if (u11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(u11Var.currentAccount);
                        int c10 = org.telegram.messenger.q.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.q.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = u11Var.getParentActivity();
                        p11 p11Var = new p11(u11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.g5.f26658a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.h6.f20930j5;
                            if (d6Var != null) {
                                x02 = d6Var.c0(i14);
                            } else {
                                x02 = org.telegram.ui.ActionBar.h6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.h6.f20893h5;
                            if (d6Var != null) {
                                x03 = d6Var.c0(i15);
                            } else {
                                x03 = org.telegram.ui.ActionBar.h6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.h6.Ji;
                            if (d6Var != null) {
                                d6Var.c0(i16);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.h6.Ni;
                            if (d6Var != null) {
                                d6Var.c0(i17);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.h6.E8;
                            if (d6Var != null) {
                                d6Var.c0(i18);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.h6.G8;
                            if (d6Var != null) {
                                d6Var.c0(i19);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.h6.f20913i6;
                            if (d6Var != null) {
                                d6Var.c0(i20);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.h6.Sh;
                            if (d6Var != null) {
                                x04 = d6Var.c0(i21);
                            } else {
                                x04 = org.telegram.ui.ActionBar.h6.x0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.h6.Oh;
                            if (d6Var != null) {
                                x05 = d6Var.c0(i22);
                            } else {
                                x05 = org.telegram.ui.ActionBar.h6.x0(null, i22, false);
                            }
                            int i23 = x05;
                            int i24 = org.telegram.ui.ActionBar.h6.Qh;
                            if (d6Var != null) {
                                x06 = d6Var.c0(i24);
                            } else {
                                x06 = org.telegram.ui.ActionBar.h6.x0(null, i24, false);
                            }
                            int i25 = x06;
                            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(parentActivity2, d6Var);
                            z2Var.a();
                            ?? ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, d6Var);
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(10);
                            ud0Var.setTextColor(x02);
                            ud0Var.setValue(i11 - 1);
                            ud0Var.setWrapSelectorWheel(false);
                            ud0Var.setFormatter(new ig(28));
                            ?? ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, d6Var);
                            ud0Var2.setMinValue(0);
                            ud0Var2.setMaxValue(10);
                            ud0Var2.setTextColor(x02);
                            ud0Var2.setValue((c11 / 60) - 1);
                            ud0Var2.setWrapSelectorWheel(false);
                            ud0Var2.setFormatter(new ig(29));
                            org.telegram.ui.Components.ud0 ud0Var3 = new org.telegram.ui.Components.ud0(parentActivity2, d6Var);
                            ud0Var3.setMinValue(0);
                            ud0Var3.setMaxValue(0);
                            ud0Var3.setTextColor(x02);
                            ud0Var3.setValue(0);
                            ud0Var3.setWrapSelectorWheel(false);
                            ud0Var3.setFormatter(new org.telegram.ui.Components.e2(0));
                            org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(parentActivity2, ud0Var, ud0Var2, ud0Var3);
                            y3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            y3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(x02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView2.setOnTouchListener(new bi.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            y3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ai.q4 q4Var = new ai.q4(parentActivity2, 18);
                            linearLayout.addView((View) ud0Var, w7.x5.l(0.4f, 0, 270));
                            linearLayout.addView(ud0Var3, w7.x5.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) ud0Var2, w7.x5.l(0.4f, 0, 270));
                            q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            q4Var.setGravity(17);
                            q4Var.setTextColor(x04);
                            q4Var.setTextSize(1, 14.0f);
                            q4Var.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            q4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, i23, i25, i25));
                            q4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            y3Var.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                            ig igVar = new ig(17);
                            ud0Var.setOnValueChangedListener(igVar);
                            ud0Var2.setOnValueChangedListener(igVar);
                            q4Var.setOnClickListener(new ai.p5((Object) ud0Var, (Object) ud0Var2, p11Var, z2Var, 7));
                            z2Var.b(y3Var);
                            org.telegram.ui.ActionBar.e3 e3Var = z2Var.f21746a;
                            e3Var.show();
                            e3Var.setBackgroundColor(x03);
                            e3Var.fixNavigationBar(x03);
                        }
                    }
                } else if (i10 == u11Var.U) {
                    if (u11Var.getParentActivity() != null) {
                        u11Var.showDialog(org.telegram.ui.Components.g5.t(u11Var.getParentActivity(), u11Var.f42350e, u11Var.f42351f, -1, new Runnable(u11Var) {
                            public final u11 f41055b;

                            {
                                this.f41055b = u11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        u11 u11Var2 = this.f41055b;
                                        s11 s11Var = u11Var2.f42348b;
                                        if (s11Var != null) {
                                            s11Var.m(u11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        u11 u11Var3 = this.f41055b;
                                        s11 s11Var2 = u11Var3.f42348b;
                                        if (s11Var2 != null) {
                                            s11Var2.m(u11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        u11 u11Var4 = this.f41055b;
                                        s11 s11Var3 = u11Var4.f42348b;
                                        if (s11Var3 != null) {
                                            s11Var3.m(u11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        u11 u11Var5 = this.f41055b;
                                        s11 s11Var4 = u11Var5.f42348b;
                                        if (s11Var4 != null) {
                                            s11Var4.m(u11Var5.U);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, u11Var.d));
                    }
                } else if (i10 == u11Var.L) {
                    MessagesController.getNotificationsSettings(u11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag = u11Var.f42346a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == u11Var.M) {
                    MessagesController.getNotificationsSettings(u11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = u11Var.f42346a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == u11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.f23716e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(u11Var.currentAccount).edit();
                    if (u11Var.Z && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    u11Var.getNotificationsController().updateServerNotificationsSettings(j10, j3);
                }
            }
        }
    }

    public static void W(u11 u11Var, String str) {
        u11Var.f42347a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(u11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        u11Var.finishFragment();
        t11 t11Var = u11Var.f42353r;
        if (t11Var != null) {
            t11Var.a0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20860f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        kVar.C(org.telegram.ui.ActionBar.h6.w0(i10, d6Var), false);
        this.actionBar.D(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21156v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.f42350e;
        long j10 = this.f42351f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new r11(this, sharedPrefKey));
        org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(context, null, false, d6Var);
        this.f42354s = uoVar;
        uoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.uo uoVar2 = this.f42354s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(uoVar2, 0, w7.x5.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
                ng.d.p(this.f42354s.getAvatarImageView(), findTopic, false, true, d6Var);
                this.f42354s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f42354s.setChatAvatar(chat);
                this.f42354s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f42354s.setUserAvatar(user);
                this.f42354s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f42354s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.o().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f42354s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20766a7, d6Var));
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(context, null);
        this.f42346a = rm0Var;
        rm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f42346a);
        frameLayout.addView(this.f42346a, w7.x5.d(-1.0f, -1));
        org.telegram.ui.Components.rm0 rm0Var2 = this.f42346a;
        s11 s11Var = new s11(this, context);
        this.f42348b = s11Var;
        rm0Var2.setAdapter(s11Var);
        this.f42346a.setItemAnimator(null);
        this.f42346a.setLayoutAnimation(null);
        this.f42346a.setLayoutManager(new gg.a0(17));
        this.f42346a.setOnItemClickListener(new zb1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f42348b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        vy0 vy0Var = new vy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.wa.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20766a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21101s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21156v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20944k0, null, null, org.telegram.ui.ActionBar.h6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20879g7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20895h7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f21225z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusColor"}, null, null, -1, vy0Var, org.telegram.ui.ActionBar.h6.f21207y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, null, null, -1, vy0Var, org.telegram.ui.ActionBar.h6.f21007n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42346a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, null, org.telegram.ui.ActionBar.h6.f21075r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, vy0Var, org.telegram.ui.ActionBar.h6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42350e, this.f42351f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.f42350e, this.f42351f);
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
            s11 s11Var = this.f42348b;
            if (s11Var != null) {
                if (i10 == 13) {
                    i12 = this.Q;
                } else {
                    i12 = this.F;
                }
                s11Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f42347a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42350e, this.f42351f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f42346a.setPadding(0, 0, 0, i13);
        this.f42346a.setClipToPadding(false);
    }
}
