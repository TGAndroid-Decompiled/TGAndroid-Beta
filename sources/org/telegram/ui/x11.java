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
public final class x11 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.ll0 f39462a;
    public boolean f39463a0;
    public v11 f39464b;
    public AnimatorSet f39465c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long e;
    public final long f39466f;
    public final boolean h;
    public boolean f39467n;
    public w11 f39468r;
    public org.telegram.ui.Components.eo f39469s;
    public int v;
    public int f39470w;
    public int f39471x;
    public int f39472y;

    public x11(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.d = e6Var;
        this.e = bundle.getLong("dialog_id");
        this.f39466f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(x11 x11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(x11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        v11 v11Var = x11Var.f39464b;
        if (v11Var != null) {
            v11Var.m(x11Var.H);
        }
    }

    public static void V(final x11 x11Var, Context context, String str, View view, int i10) {
        String str2;
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        String str3;
        long j3 = x11Var.f39466f;
        long j10 = x11Var.e;
        org.telegram.ui.ActionBar.e6 e6Var = x11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == x11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new s11(x11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                x11Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19071q7, false));
                }
            } else if (i10 == x11Var.F) {
                Bundle e = w.c.e(j10, "dialog_id");
                e.putLong("topic_id", j3);
                x11Var.presentFragment(new yk0(e, e6Var));
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
                long j11 = x11Var.e;
                long j12 = x11Var.f39466f;
                Runnable runnable = new Runnable(x11Var) {
                    public final x11 f37538b;

                    {
                        this.f37538b = x11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                x11 x11Var2 = this.f37538b;
                                v11 v11Var = x11Var2.f39464b;
                                if (v11Var != null) {
                                    v11Var.m(x11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                x11 x11Var3 = this.f37538b;
                                v11 v11Var2 = x11Var3.f39464b;
                                if (v11Var2 != null) {
                                    v11Var2.m(x11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                x11 x11Var4 = this.f37538b;
                                v11 v11Var3 = x11Var4.f39464b;
                                if (v11Var3 != null) {
                                    v11Var3.m(x11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                x11 x11Var5 = this.f37538b;
                                v11 v11Var4 = x11Var5.f39464b;
                                if (v11Var4 != null) {
                                    v11Var4.m(x11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.e6 e6Var2 = x11Var.d;
                Pattern pattern = org.telegram.ui.Components.c5.f22944a;
                if (j11 != 0) {
                    str3 = a4.a.p(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                x11Var.showDialog(org.telegram.ui.Components.c5.Y(parentActivity, j11, j12, str3, runnable, e6Var2));
            } else {
                int i11 = 2;
                if (i10 == x11Var.f39472y) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    boolean z10 = !w8Var.e.h;
                    x11Var.f39467n = z10;
                    w8Var.setChecked(z10);
                    int childCount = x11Var.f39462a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) x11Var.f39462a.T(x11Var.f39462a.getChildAt(i12));
                        int i13 = vk0Var.f42674f;
                        View view2 = vk0Var.f42671a;
                        int b10 = vk0Var.b();
                        if (b10 != x11Var.f39472y && b10 != x11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == x11Var.E) {
                                                    ((org.telegram.ui.Cells.w8) view2).e(arrayList, x11Var.f39467n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.k6) view2).b(arrayList, x11Var.f39467n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, x11Var.f39467n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.e9) view2).c(arrayList, x11Var.f39467n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ea) view2).a(arrayList, x11Var.f39467n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, x11Var.f39467n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = x11Var.f39465c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        x11Var.f39465c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        x11Var.f39465c.addListener(new cr0(x11Var, 15));
                        x11Var.f39465c.setDuration(150L);
                        x11Var.f39465c.start();
                    }
                } else if (i10 == x11Var.E) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    Switch r32 = w8Var2.e;
                    MessagesController.getNotificationsSettings(x11Var.currentAccount).edit().putBoolean(org.telegram.ui.Cells.q3.i("content_preview_", str), !r32.h).apply();
                    w8Var2.setChecked(!r32.h);
                } else if (i10 == x11Var.R) {
                    x11Var.showDialog(org.telegram.ui.Components.c5.Y(x11Var.getParentActivity(), x11Var.e, x11Var.f39466f, org.telegram.ui.Cells.q3.i("calls_vibrate_", str), new Runnable(x11Var) {
                        public final x11 f37538b;

                        {
                            this.f37538b = x11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    x11 x11Var2 = this.f37538b;
                                    v11 v11Var = x11Var2.f39464b;
                                    if (v11Var != null) {
                                        v11Var.m(x11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    x11 x11Var3 = this.f37538b;
                                    v11 v11Var2 = x11Var3.f39464b;
                                    if (v11Var2 != null) {
                                        v11Var2.m(x11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    x11 x11Var4 = this.f37538b;
                                    v11 v11Var3 = x11Var4.f39464b;
                                    if (v11Var3 != null) {
                                        v11Var3.m(x11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    x11 x11Var5 = this.f37538b;
                                    v11 v11Var4 = x11Var5.f39464b;
                                    if (v11Var4 != null) {
                                        v11Var4.m(x11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, x11Var.d));
                } else if (i10 == x11Var.I) {
                    x11Var.showDialog(org.telegram.ui.Components.c5.I(x11Var.getParentActivity(), x11Var.e, x11Var.f39466f, -1, new Runnable(x11Var) {
                        public final x11 f37538b;

                        {
                            this.f37538b = x11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    x11 x11Var2 = this.f37538b;
                                    v11 v11Var = x11Var2.f39464b;
                                    if (v11Var != null) {
                                        v11Var.m(x11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    x11 x11Var3 = this.f37538b;
                                    v11 v11Var2 = x11Var3.f39464b;
                                    if (v11Var2 != null) {
                                        v11Var2.m(x11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    x11 x11Var4 = this.f37538b;
                                    v11 v11Var3 = x11Var4.f39464b;
                                    if (v11Var3 != null) {
                                        v11Var3.m(x11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    x11 x11Var5 = this.f37538b;
                                    v11 v11Var4 = x11Var5.f39464b;
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
                        int c10 = org.telegram.messenger.y0.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.y0.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = x11Var.getParentActivity();
                        s11 s11Var = new s11(x11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.c5.f22944a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.i6.f18940j5;
                            if (e6Var != null) {
                                w02 = e6Var.g0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.i6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.i6.f18904h5;
                            if (e6Var != null) {
                                w03 = e6Var.g0(i15);
                            } else {
                                w03 = org.telegram.ui.ActionBar.i6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.i6.Ji;
                            if (e6Var != null) {
                                e6Var.g0(i16);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.i6.Ni;
                            if (e6Var != null) {
                                e6Var.g0(i17);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.i6.E8;
                            if (e6Var != null) {
                                e6Var.g0(i18);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.i6.G8;
                            if (e6Var != null) {
                                e6Var.g0(i19);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.i6.f18923i6;
                            if (e6Var != null) {
                                e6Var.g0(i20);
                            } else {
                                org.telegram.ui.ActionBar.i6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.i6.Sh;
                            if (e6Var != null) {
                                w04 = e6Var.g0(i21);
                            } else {
                                w04 = org.telegram.ui.ActionBar.i6.w0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.i6.Oh;
                            if (e6Var != null) {
                                w05 = e6Var.g0(i22);
                            } else {
                                w05 = org.telegram.ui.ActionBar.i6.w0(null, i22, false);
                            }
                            int i23 = w05;
                            int i24 = org.telegram.ui.ActionBar.i6.Qh;
                            if (e6Var != null) {
                                w06 = e6Var.g0(i24);
                            } else {
                                w06 = org.telegram.ui.ActionBar.i6.w0(null, i24, false);
                            }
                            int i25 = w06;
                            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, e6Var);
                            a3Var.a();
                            ?? uc0Var = new org.telegram.ui.Components.uc0(parentActivity2, e6Var);
                            uc0Var.setMinValue(0);
                            uc0Var.setMaxValue(10);
                            uc0Var.setTextColor(w02);
                            uc0Var.setValue(i11 - 1);
                            uc0Var.setWrapSelectorWheel(false);
                            uc0Var.setFormatter(new es(18));
                            ?? uc0Var2 = new org.telegram.ui.Components.uc0(parentActivity2, e6Var);
                            uc0Var2.setMinValue(0);
                            uc0Var2.setMaxValue(10);
                            uc0Var2.setTextColor(w02);
                            uc0Var2.setValue((c11 / 60) - 1);
                            uc0Var2.setWrapSelectorWheel(false);
                            uc0Var2.setFormatter(new es(19));
                            org.telegram.ui.Components.uc0 uc0Var3 = new org.telegram.ui.Components.uc0(parentActivity2, e6Var);
                            uc0Var3.setMinValue(0);
                            uc0Var3.setMaxValue(0);
                            uc0Var3.setTextColor(w02);
                            uc0Var3.setValue(0);
                            uc0Var3.setWrapSelectorWheel(false);
                            uc0Var3.setFormatter(new es(20));
                            org.telegram.ui.Components.u3 u3Var = new org.telegram.ui.Components.u3(parentActivity2, uc0Var, uc0Var2, uc0Var3);
                            u3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            u3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(w02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new bi.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            u3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ai.p4 p4Var = new ai.p4(parentActivity2, 18);
                            linearLayout.addView((View) uc0Var, w7.x5.l(0.4f, 0, 270));
                            linearLayout.addView(uc0Var3, w7.x5.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) uc0Var2, w7.x5.l(0.4f, 0, 270));
                            p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            p4Var.setGravity(17);
                            p4Var.setTextColor(w04);
                            p4Var.setTextSize(1, 14.0f);
                            p4Var.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, i23, i25, i25));
                            p4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            u3Var.addView(p4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                            es esVar = new es(7);
                            uc0Var.setOnValueChangedListener(esVar);
                            uc0Var2.setOnValueChangedListener(esVar);
                            p4Var.setOnClickListener(new ai.p5((Object) uc0Var, (Object) uc0Var2, s11Var, a3Var, 7));
                            a3Var.b(u3Var);
                            org.telegram.ui.ActionBar.f3 f3Var = a3Var.f18440a;
                            f3Var.show();
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == x11Var.U) {
                    if (x11Var.getParentActivity() != null) {
                        x11Var.showDialog(org.telegram.ui.Components.c5.u(x11Var.getParentActivity(), x11Var.e, x11Var.f39466f, -1, new Runnable(x11Var) {
                            public final x11 f37538b;

                            {
                                this.f37538b = x11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        x11 x11Var2 = this.f37538b;
                                        v11 v11Var = x11Var2.f39464b;
                                        if (v11Var != null) {
                                            v11Var.m(x11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        x11 x11Var3 = this.f37538b;
                                        v11 v11Var2 = x11Var3.f39464b;
                                        if (v11Var2 != null) {
                                            v11Var2.m(x11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        x11 x11Var4 = this.f37538b;
                                        v11 v11Var3 = x11Var4.f39464b;
                                        if (v11Var3 != null) {
                                            v11Var3.m(x11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        x11 x11Var5 = this.f37538b;
                                        v11 v11Var4 = x11Var5.f39464b;
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
                    View findViewWithTag = x11Var.f39462a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == x11Var.M) {
                    MessagesController.getNotificationsSettings(x11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = x11Var.f39462a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == x11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.e.h;
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
        x11Var.f39463a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(x11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        x11Var.finishFragment();
        w11 w11Var = x11Var.f39468r;
        if (w11Var != null) {
            w11Var.c0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f18871f8;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.i6.v0(i10, e6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19165v8, e6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.e;
        long j10 = this.f39466f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new u11(this, sharedPrefKey));
        org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(context, null, false, e6Var);
        this.f39469s = eoVar;
        eoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.eo eoVar2 = this.f39469s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(eoVar2, 0, w7.x5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
                ng.d.p(this.f39469s.getAvatarImageView(), findTopic, false, true, e6Var);
                this.f39469s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f39469s.setChatAvatar(chat);
                this.f39469s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f39469s.setUserAvatar(user);
                this.f39469s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f39469s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f39469s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18778a7, e6Var));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f39462a = ll0Var;
        ll0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39462a);
        frameLayout.addView(this.f39462a, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ll0 ll0Var2 = this.f39462a;
        v11 v11Var = new v11(this, context);
        this.f39464b = v11Var;
        ll0Var2.setAdapter(v11Var);
        this.f39462a.setItemAnimator(null);
        this.f39462a.setLayoutAnimation(null);
        this.f39462a.setLayoutManager(new gg.b0(17));
        this.f39462a.setOnItemClickListener(new zb1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f39464b.l();
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
        xy0 xy0Var = new xy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.za.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.i6.f18834d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f18778a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f19110s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19165v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19129t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f18923i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f18955k0, null, null, org.telegram.ui.ActionBar.i6.f18835d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f18889g7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f18906h7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19234z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, xy0Var, org.telegram.ui.ActionBar.i6.f19215y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, xy0Var, org.telegram.ui.ActionBar.i6.f19018n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39462a, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, org.telegram.ui.ActionBar.i6.f19083r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.i6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f39466f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.e, this.f39466f);
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
            v11 v11Var = this.f39464b;
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
        if (!this.f39463a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f39466f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f39462a.setPadding(0, 0, 0, i13);
        this.f39462a.setClipToPadding(false);
    }
}
