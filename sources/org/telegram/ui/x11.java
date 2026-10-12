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
public final class x11 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.wm0 f43719a;
    public boolean f43720a0;
    public v11 f43721b;
    public AnimatorSet f43722c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final long f43723e;
    public final long f43724f;
    public final boolean h;
    public boolean f43725n;
    public w11 f43726r;
    public org.telegram.ui.Components.wo f43727s;
    public int v;
    public int f43728w;
    public int f43729x;
    public int f43730y;

    public x11(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.d = c6Var;
        this.f43723e = bundle.getLong("dialog_id");
        this.f43724f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(x11 x11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(x11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        v11 v11Var = x11Var.f43721b;
        if (v11Var != null) {
            v11Var.m(x11Var.H);
        }
    }

    public static void V(final x11 x11Var, Context context, String str, View view, int i10) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        long j3 = x11Var.f43724f;
        long j10 = x11Var.f43723e;
        org.telegram.ui.ActionBar.c6 c6Var = x11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == x11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20142a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new s11(x11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                x11Var.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20800q7, false));
                }
            } else if (i10 == x11Var.F) {
                Bundle f7 = sc.v.f(j10, "dialog_id");
                f7.putLong("topic_id", j3);
                x11Var.presentFragment(new bl0(f7, c6Var));
            } else if (i10 == x11Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(x11Var.currentAccount);
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
                    x11Var.startActivityForResult(intent, 13);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == x11Var.G) {
                Activity parentActivity = x11Var.getParentActivity();
                long j11 = x11Var.f43723e;
                long j12 = x11Var.f43724f;
                Runnable runnable = new Runnable(x11Var) {
                    public final x11 f42055b;

                    {
                        this.f42055b = x11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                x11 x11Var2 = this.f42055b;
                                v11 v11Var = x11Var2.f43721b;
                                if (v11Var != null) {
                                    v11Var.m(x11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                x11 x11Var3 = this.f42055b;
                                v11 v11Var2 = x11Var3.f43721b;
                                if (v11Var2 != null) {
                                    v11Var2.m(x11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                x11 x11Var4 = this.f42055b;
                                v11 v11Var3 = x11Var4.f43721b;
                                if (v11Var3 != null) {
                                    v11Var3.m(x11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                x11 x11Var5 = this.f42055b;
                                v11 v11Var4 = x11Var5.f43721b;
                                if (v11Var4 != null) {
                                    v11Var4.m(x11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.c6 c6Var2 = x11Var.d;
                Pattern pattern = org.telegram.ui.Components.g5.f26278a;
                if (j11 != 0) {
                    str3 = a1.g.p(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                x11Var.showDialog(org.telegram.ui.Components.g5.X(parentActivity, j11, j12, str3, runnable, c6Var2));
            } else {
                int i11 = 2;
                if (i10 == x11Var.f43730y) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    boolean z10 = !w8Var.f23452e.h;
                    x11Var.f43725n = z10;
                    w8Var.setChecked(z10);
                    int childCount = x11Var.f43719a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.gm0 gm0Var = (org.telegram.ui.Components.gm0) x11Var.f43719a.T(x11Var.f43719a.getChildAt(i12));
                        int i13 = gm0Var.f47901f;
                        View view2 = gm0Var.f47897a;
                        int b10 = gm0Var.b();
                        if (b10 != x11Var.f43730y && b10 != x11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == x11Var.E) {
                                                    ((org.telegram.ui.Cells.w8) view2).e(arrayList, x11Var.f43725n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.k6) view2).b(arrayList, x11Var.f43725n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, x11Var.f43725n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.e9) view2).c(arrayList, x11Var.f43725n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ca) view2).a(arrayList, x11Var.f43725n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, x11Var.f43725n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = x11Var.f43722c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        x11Var.f43722c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        x11Var.f43722c.addListener(new gp0(x11Var, 16));
                        x11Var.f43722c.setDuration(150L);
                        x11Var.f43722c.start();
                    }
                } else if (i10 == x11Var.E) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    Switch r32 = w8Var2.f23452e;
                    MessagesController.getNotificationsSettings(x11Var.currentAccount).edit().putBoolean(sc.v.i("content_preview_", str), !r32.h).apply();
                    w8Var2.setChecked(!r32.h);
                } else if (i10 == x11Var.R) {
                    x11Var.showDialog(org.telegram.ui.Components.g5.X(x11Var.getParentActivity(), x11Var.f43723e, x11Var.f43724f, sc.v.i("calls_vibrate_", str), new Runnable(x11Var) {
                        public final x11 f42055b;

                        {
                            this.f42055b = x11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    x11 x11Var2 = this.f42055b;
                                    v11 v11Var = x11Var2.f43721b;
                                    if (v11Var != null) {
                                        v11Var.m(x11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    x11 x11Var3 = this.f42055b;
                                    v11 v11Var2 = x11Var3.f43721b;
                                    if (v11Var2 != null) {
                                        v11Var2.m(x11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    x11 x11Var4 = this.f42055b;
                                    v11 v11Var3 = x11Var4.f43721b;
                                    if (v11Var3 != null) {
                                        v11Var3.m(x11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    x11 x11Var5 = this.f42055b;
                                    v11 v11Var4 = x11Var5.f43721b;
                                    if (v11Var4 != null) {
                                        v11Var4.m(x11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, x11Var.d));
                } else if (i10 == x11Var.I) {
                    x11Var.showDialog(org.telegram.ui.Components.g5.H(x11Var.getParentActivity(), x11Var.f43723e, x11Var.f43724f, -1, new Runnable(x11Var) {
                        public final x11 f42055b;

                        {
                            this.f42055b = x11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    x11 x11Var2 = this.f42055b;
                                    v11 v11Var = x11Var2.f43721b;
                                    if (v11Var != null) {
                                        v11Var.m(x11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    x11 x11Var3 = this.f42055b;
                                    v11 v11Var2 = x11Var3.f43721b;
                                    if (v11Var2 != null) {
                                        v11Var2.m(x11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    x11 x11Var4 = this.f42055b;
                                    v11 v11Var3 = x11Var4.f43721b;
                                    if (v11Var3 != null) {
                                        v11Var3.m(x11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    x11 x11Var5 = this.f42055b;
                                    v11 v11Var4 = x11Var5.f43721b;
                                    if (v11Var4 != null) {
                                        v11Var4.m(x11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, x11Var.d));
                } else if (i10 == x11Var.H) {
                    if (x11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(x11Var.currentAccount);
                        int c10 = org.telegram.messenger.v0.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.v0.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = x11Var.getParentActivity();
                        s11 s11Var = new s11(x11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.g5.f26278a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.h6.f20668j5;
                            if (c6Var != null) {
                                x02 = c6Var.d0(i14);
                            } else {
                                x02 = org.telegram.ui.ActionBar.h6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.h6.f20631h5;
                            if (c6Var != null) {
                                x03 = c6Var.d0(i15);
                            } else {
                                x03 = org.telegram.ui.ActionBar.h6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.h6.Ji;
                            if (c6Var != null) {
                                c6Var.d0(i16);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.h6.Ni;
                            if (c6Var != null) {
                                c6Var.d0(i17);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.h6.E8;
                            if (c6Var != null) {
                                c6Var.d0(i18);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.h6.G8;
                            if (c6Var != null) {
                                c6Var.d0(i19);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.h6.f20651i6;
                            if (c6Var != null) {
                                c6Var.d0(i20);
                            } else {
                                org.telegram.ui.ActionBar.h6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.h6.Sh;
                            if (c6Var != null) {
                                x04 = c6Var.d0(i21);
                            } else {
                                x04 = org.telegram.ui.ActionBar.h6.x0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.h6.Oh;
                            if (c6Var != null) {
                                x05 = c6Var.d0(i22);
                            } else {
                                x05 = org.telegram.ui.ActionBar.h6.x0(null, i22, false);
                            }
                            int i23 = x05;
                            int i24 = org.telegram.ui.ActionBar.h6.Qh;
                            if (c6Var != null) {
                                x06 = c6Var.d0(i24);
                            } else {
                                x06 = org.telegram.ui.ActionBar.h6.x0(null, i24, false);
                            }
                            int i25 = x06;
                            org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(parentActivity2, c6Var);
                            z2Var.a();
                            ?? yd0Var = new org.telegram.ui.Components.yd0(parentActivity2, c6Var);
                            yd0Var.setMinValue(0);
                            yd0Var.setMaxValue(10);
                            yd0Var.setTextColor(x02);
                            yd0Var.setValue(i11 - 1);
                            yd0Var.setWrapSelectorWheel(false);
                            yd0Var.setFormatter(new qr(26));
                            ?? yd0Var2 = new org.telegram.ui.Components.yd0(parentActivity2, c6Var);
                            yd0Var2.setMinValue(0);
                            yd0Var2.setMaxValue(10);
                            yd0Var2.setTextColor(x02);
                            yd0Var2.setValue((c11 / 60) - 1);
                            yd0Var2.setWrapSelectorWheel(false);
                            yd0Var2.setFormatter(new qr(27));
                            org.telegram.ui.Components.yd0 yd0Var3 = new org.telegram.ui.Components.yd0(parentActivity2, c6Var);
                            yd0Var3.setMinValue(0);
                            yd0Var3.setMaxValue(0);
                            yd0Var3.setTextColor(x02);
                            yd0Var3.setValue(0);
                            yd0Var3.setWrapSelectorWheel(false);
                            yd0Var3.setFormatter(new qr(28));
                            org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(parentActivity2, yd0Var, yd0Var2, yd0Var3);
                            y3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            y3Var.addView(frameLayout, w7.w5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(x02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, w7.w5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView2.setOnTouchListener(new bi.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            y3Var.addView(linearLayout, w7.w5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ai.q4 q4Var = new ai.q4(parentActivity2, 18);
                            linearLayout.addView((View) yd0Var, w7.w5.l(0.4f, 0, 270));
                            linearLayout.addView(yd0Var3, w7.w5.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) yd0Var2, w7.w5.l(0.4f, 0, 270));
                            q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            q4Var.setGravity(17);
                            q4Var.setTextColor(x04);
                            q4Var.setTextSize(1, 14.0f);
                            q4Var.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            q4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, i23, i25, i25));
                            q4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            y3Var.addView(q4Var, w7.w5.t(-1, 48, 83, 16, 15, 16, 16));
                            qr qrVar = new qr(15);
                            yd0Var.setOnValueChangedListener(qrVar);
                            yd0Var2.setOnValueChangedListener(qrVar);
                            q4Var.setOnClickListener(new ai.p5((Object) yd0Var, (Object) yd0Var2, s11Var, z2Var, 7));
                            z2Var.b(y3Var);
                            org.telegram.ui.ActionBar.e3 e3Var = z2Var.f21485a;
                            e3Var.show();
                            e3Var.setBackgroundColor(x03);
                            e3Var.fixNavigationBar(x03);
                        }
                    }
                } else if (i10 == x11Var.U) {
                    if (x11Var.getParentActivity() != null) {
                        x11Var.showDialog(org.telegram.ui.Components.g5.t(x11Var.getParentActivity(), x11Var.f43723e, x11Var.f43724f, -1, new Runnable(x11Var) {
                            public final x11 f42055b;

                            {
                                this.f42055b = x11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        x11 x11Var2 = this.f42055b;
                                        v11 v11Var = x11Var2.f43721b;
                                        if (v11Var != null) {
                                            v11Var.m(x11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        x11 x11Var3 = this.f42055b;
                                        v11 v11Var2 = x11Var3.f43721b;
                                        if (v11Var2 != null) {
                                            v11Var2.m(x11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        x11 x11Var4 = this.f42055b;
                                        v11 v11Var3 = x11Var4.f43721b;
                                        if (v11Var3 != null) {
                                            v11Var3.m(x11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        x11 x11Var5 = this.f42055b;
                                        v11 v11Var4 = x11Var5.f43721b;
                                        if (v11Var4 != null) {
                                            v11Var4.m(x11Var5.U);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, x11Var.d));
                    }
                } else if (i10 == x11Var.L) {
                    MessagesController.getNotificationsSettings(x11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag = x11Var.f43719a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == x11Var.M) {
                    MessagesController.getNotificationsSettings(x11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = x11Var.f43719a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == x11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.f23452e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(x11Var.currentAccount).edit();
                    if (x11Var.Z && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    x11Var.getNotificationsController().updateServerNotificationsSettings(j10, j3);
                }
            }
        }
    }

    public static void W(x11 x11Var, String str) {
        x11Var.f43720a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(x11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        x11Var.finishFragment();
        w11 w11Var = x11Var.f43726r;
        if (w11Var != null) {
            w11Var.b0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20598f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        kVar.D(org.telegram.ui.ActionBar.h6.w0(i10, c6Var), false);
        this.actionBar.E(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20895v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.f43723e;
        long j10 = this.f43724f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new u11(this, sharedPrefKey));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(context, null, false, c6Var);
        this.f43727s = woVar;
        woVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.wo woVar2 = this.f43727s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(woVar2, 0, w7.w5.a(-1.0f, f7, 0.0f, 40.0f, 0.0f, -2, 51));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
                ng.d.p(this.f43727s.getAvatarImageView(), findTopic, false, true, c6Var);
                this.f43727s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f43727s.setChatAvatar(chat);
                this.f43727s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f43727s.setUserAvatar(user);
                this.f43727s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f43727s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.p().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f43727s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20504a7, c6Var));
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f43719a = wm0Var;
        wm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f43719a);
        frameLayout.addView(this.f43719a, w7.w5.d(-1.0f, -1));
        org.telegram.ui.Components.wm0 wm0Var2 = this.f43719a;
        v11 v11Var = new v11(this, context);
        this.f43721b = v11Var;
        wm0Var2.setAdapter(v11Var);
        this.f43719a.setItemAnimator(null);
        this.f43719a.setLayoutAnimation(null);
        this.f43719a.setLayoutManager(new gg.a0(17));
        this.f43719a.setOnItemClickListener(new cc1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f43721b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        yy0 yy0Var = new yy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.wa.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20504a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20840s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20651i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20682k0, null, null, org.telegram.ui.ActionBar.h6.f20561d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20617g7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20633h7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20964z6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusColor"}, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.f20946y6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, null, null, -1, yy0Var, org.telegram.ui.ActionBar.h6.f20745n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f43719a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, null, org.telegram.ui.ActionBar.h6.f20813r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.h6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f43723e, this.f43724f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.f43723e, this.f43724f);
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
            v11 v11Var = this.f43721b;
            if (v11Var != null) {
                if (i10 == 13) {
                    i12 = this.Q;
                } else {
                    i12 = this.F;
                }
                v11Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f43720a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f43723e, this.f43724f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f43719a.setPadding(0, 0, 0, i13);
        this.f43719a.setClipToPadding(false);
    }
}
