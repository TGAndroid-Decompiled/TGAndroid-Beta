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
public final class y11 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.ml0 f39767a;
    public boolean f39768a0;
    public w11 f39769b;
    public AnimatorSet f39770c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final long f39771f;
    public final boolean h;
    public boolean f39772n;
    public x11 f39773r;
    public org.telegram.ui.Components.eo f39774s;
    public int v;
    public int f39775w;
    public int f39776x;
    public int f39777y;

    public y11(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.d = f6Var;
        this.e = bundle.getLong("dialog_id");
        this.f39771f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(y11 y11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(y11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        w11 w11Var = y11Var.f39769b;
        if (w11Var != null) {
            w11Var.m(y11Var.H);
        }
    }

    public static void V(final y11 y11Var, Context context, String str, View view, int i10) {
        String str2;
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        String str3;
        long j3 = y11Var.f39771f;
        long j10 = y11Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = y11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == y11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new t11(y11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                y11Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
                }
            } else if (i10 == y11Var.F) {
                Bundle e = w.f.e(j10, "dialog_id");
                e.putLong("topic_id", j3);
                y11Var.presentFragment(new al0(e, f6Var));
            } else if (i10 == y11Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(y11Var.currentAccount);
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
                    y11Var.startActivityForResult(intent, 13);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == y11Var.G) {
                Activity parentActivity = y11Var.getParentActivity();
                long j11 = y11Var.e;
                long j12 = y11Var.f39771f;
                Runnable runnable = new Runnable(y11Var) {
                    public final y11 f37915b;

                    {
                        this.f37915b = y11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                y11 y11Var2 = this.f37915b;
                                w11 w11Var = y11Var2.f39769b;
                                if (w11Var != null) {
                                    w11Var.m(y11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                y11 y11Var3 = this.f37915b;
                                w11 w11Var2 = y11Var3.f39769b;
                                if (w11Var2 != null) {
                                    w11Var2.m(y11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                y11 y11Var4 = this.f37915b;
                                w11 w11Var3 = y11Var4.f39769b;
                                if (w11Var3 != null) {
                                    w11Var3.m(y11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                y11 y11Var5 = this.f37915b;
                                w11 w11Var4 = y11Var5.f39769b;
                                if (w11Var4 != null) {
                                    w11Var4.m(y11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.f6 f6Var2 = y11Var.d;
                Pattern pattern = org.telegram.ui.Components.c5.f22934a;
                if (j11 != 0) {
                    str3 = a4.a.o(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                y11Var.showDialog(org.telegram.ui.Components.c5.Y(parentActivity, j11, j12, str3, runnable, f6Var2));
            } else {
                int i11 = 2;
                if (i10 == y11Var.f39777y) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    boolean z10 = !w8Var.e.h;
                    y11Var.f39772n = z10;
                    w8Var.setChecked(z10);
                    int childCount = y11Var.f39767a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) y11Var.f39767a.U(y11Var.f39767a.getChildAt(i12));
                        int i13 = wk0Var.f42705f;
                        View view2 = wk0Var.f42702a;
                        int b10 = wk0Var.b();
                        if (b10 != y11Var.f39777y && b10 != y11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == y11Var.E) {
                                                    ((org.telegram.ui.Cells.w8) view2).e(arrayList, y11Var.f39772n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.j6) view2).b(arrayList, y11Var.f39772n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, y11Var.f39772n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.e9) view2).c(arrayList, y11Var.f39772n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ea) view2).a(arrayList, y11Var.f39772n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.l4) view2).a(arrayList, y11Var.f39772n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = y11Var.f39770c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        y11Var.f39770c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        y11Var.f39770c.addListener(new er0(y11Var, 15));
                        y11Var.f39770c.setDuration(150L);
                        y11Var.f39770c.start();
                    }
                } else if (i10 == y11Var.E) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    Switch r32 = w8Var2.e;
                    MessagesController.getNotificationsSettings(y11Var.currentAccount).edit().putBoolean(org.telegram.ui.Cells.p6.i("content_preview_", str), !r32.h).apply();
                    w8Var2.setChecked(!r32.h);
                } else if (i10 == y11Var.R) {
                    y11Var.showDialog(org.telegram.ui.Components.c5.Y(y11Var.getParentActivity(), y11Var.e, y11Var.f39771f, org.telegram.ui.Cells.p6.i("calls_vibrate_", str), new Runnable(y11Var) {
                        public final y11 f37915b;

                        {
                            this.f37915b = y11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    y11 y11Var2 = this.f37915b;
                                    w11 w11Var = y11Var2.f39769b;
                                    if (w11Var != null) {
                                        w11Var.m(y11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    y11 y11Var3 = this.f37915b;
                                    w11 w11Var2 = y11Var3.f39769b;
                                    if (w11Var2 != null) {
                                        w11Var2.m(y11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    y11 y11Var4 = this.f37915b;
                                    w11 w11Var3 = y11Var4.f39769b;
                                    if (w11Var3 != null) {
                                        w11Var3.m(y11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    y11 y11Var5 = this.f37915b;
                                    w11 w11Var4 = y11Var5.f39769b;
                                    if (w11Var4 != null) {
                                        w11Var4.m(y11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, y11Var.d));
                } else if (i10 == y11Var.I) {
                    y11Var.showDialog(org.telegram.ui.Components.c5.I(y11Var.getParentActivity(), y11Var.e, y11Var.f39771f, -1, new Runnable(y11Var) {
                        public final y11 f37915b;

                        {
                            this.f37915b = y11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    y11 y11Var2 = this.f37915b;
                                    w11 w11Var = y11Var2.f39769b;
                                    if (w11Var != null) {
                                        w11Var.m(y11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    y11 y11Var3 = this.f37915b;
                                    w11 w11Var2 = y11Var3.f39769b;
                                    if (w11Var2 != null) {
                                        w11Var2.m(y11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    y11 y11Var4 = this.f37915b;
                                    w11 w11Var3 = y11Var4.f39769b;
                                    if (w11Var3 != null) {
                                        w11Var3.m(y11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    y11 y11Var5 = this.f37915b;
                                    w11 w11Var4 = y11Var5.f39769b;
                                    if (w11Var4 != null) {
                                        w11Var4.m(y11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, y11Var.d));
                } else if (i10 == y11Var.H) {
                    if (y11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(y11Var.currentAccount);
                        int c10 = org.telegram.messenger.w1.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.w1.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = y11Var.getParentActivity();
                        t11 t11Var = new t11(y11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.c5.f22934a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.j6.f18970j5;
                            if (f6Var != null) {
                                w02 = f6Var.g0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.j6.f18934h5;
                            if (f6Var != null) {
                                w03 = f6Var.g0(i15);
                            } else {
                                w03 = org.telegram.ui.ActionBar.j6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.j6.Ji;
                            if (f6Var != null) {
                                f6Var.g0(i16);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.j6.Ni;
                            if (f6Var != null) {
                                f6Var.g0(i17);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.j6.E8;
                            if (f6Var != null) {
                                f6Var.g0(i18);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.j6.G8;
                            if (f6Var != null) {
                                f6Var.g0(i19);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.j6.f18953i6;
                            if (f6Var != null) {
                                f6Var.g0(i20);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.j6.Sh;
                            if (f6Var != null) {
                                w04 = f6Var.g0(i21);
                            } else {
                                w04 = org.telegram.ui.ActionBar.j6.w0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.j6.Oh;
                            if (f6Var != null) {
                                w05 = f6Var.g0(i22);
                            } else {
                                w05 = org.telegram.ui.ActionBar.j6.w0(null, i22, false);
                            }
                            int i23 = w05;
                            int i24 = org.telegram.ui.ActionBar.j6.Qh;
                            if (f6Var != null) {
                                w06 = f6Var.g0(i24);
                            } else {
                                w06 = org.telegram.ui.ActionBar.j6.w0(null, i24, false);
                            }
                            int i25 = w06;
                            org.telegram.ui.ActionBar.b3 b3Var = new org.telegram.ui.ActionBar.b3(parentActivity2, f6Var);
                            b3Var.a();
                            ?? uc0Var = new org.telegram.ui.Components.uc0(parentActivity2, f6Var);
                            uc0Var.setMinValue(0);
                            uc0Var.setMaxValue(10);
                            uc0Var.setTextColor(w02);
                            uc0Var.setValue(i11 - 1);
                            uc0Var.setWrapSelectorWheel(false);
                            uc0Var.setFormatter(new gs(19));
                            ?? uc0Var2 = new org.telegram.ui.Components.uc0(parentActivity2, f6Var);
                            uc0Var2.setMinValue(0);
                            uc0Var2.setMaxValue(10);
                            uc0Var2.setTextColor(w02);
                            uc0Var2.setValue((c11 / 60) - 1);
                            uc0Var2.setWrapSelectorWheel(false);
                            uc0Var2.setFormatter(new gs(20));
                            org.telegram.ui.Components.uc0 uc0Var3 = new org.telegram.ui.Components.uc0(parentActivity2, f6Var);
                            uc0Var3.setMinValue(0);
                            uc0Var3.setMaxValue(0);
                            uc0Var3.setTextColor(w02);
                            uc0Var3.setValue(0);
                            uc0Var3.setWrapSelectorWheel(false);
                            uc0Var3.setFormatter(new gs(21));
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
                            p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, i23, i25, i25));
                            p4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            u3Var.addView(p4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                            gs gsVar = new gs(8);
                            uc0Var.setOnValueChangedListener(gsVar);
                            uc0Var2.setOnValueChangedListener(gsVar);
                            p4Var.setOnClickListener(new ai.p5((Object) uc0Var, (Object) uc0Var2, t11Var, b3Var, 7));
                            b3Var.b(u3Var);
                            org.telegram.ui.ActionBar.g3 g3Var = b3Var.f18471a;
                            g3Var.show();
                            g3Var.setBackgroundColor(w03);
                            g3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == y11Var.U) {
                    if (y11Var.getParentActivity() != null) {
                        y11Var.showDialog(org.telegram.ui.Components.c5.u(y11Var.getParentActivity(), y11Var.e, y11Var.f39771f, -1, new Runnable(y11Var) {
                            public final y11 f37915b;

                            {
                                this.f37915b = y11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        y11 y11Var2 = this.f37915b;
                                        w11 w11Var = y11Var2.f39769b;
                                        if (w11Var != null) {
                                            w11Var.m(y11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        y11 y11Var3 = this.f37915b;
                                        w11 w11Var2 = y11Var3.f39769b;
                                        if (w11Var2 != null) {
                                            w11Var2.m(y11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        y11 y11Var4 = this.f37915b;
                                        w11 w11Var3 = y11Var4.f39769b;
                                        if (w11Var3 != null) {
                                            w11Var3.m(y11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        y11 y11Var5 = this.f37915b;
                                        w11 w11Var4 = y11Var5.f39769b;
                                        if (w11Var4 != null) {
                                            w11Var4.m(y11Var5.U);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, y11Var.d));
                    }
                } else if (i10 == y11Var.L) {
                    MessagesController.getNotificationsSettings(y11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag = y11Var.f39767a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == y11Var.M) {
                    MessagesController.getNotificationsSettings(y11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag2 = y11Var.f39767a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == y11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(y11Var.currentAccount).edit();
                    if (y11Var.Z && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    y11Var.getNotificationsController().updateServerNotificationsSettings(j10, j3);
                }
            }
        }
    }

    public static void W(y11 y11Var, String str) {
        y11Var.f39768a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(y11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        y11Var.finishFragment();
        x11 x11Var = y11Var.f39773r;
        if (x11Var != null) {
            x11Var.c0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f18900f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19195v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.e;
        long j10 = this.f39771f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new v11(this, sharedPrefKey));
        org.telegram.ui.Components.eo eoVar = new org.telegram.ui.Components.eo(context, null, false, f6Var);
        this.f39774s = eoVar;
        eoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.eo eoVar2 = this.f39774s;
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
                ng.d.p(this.f39774s.getAvatarImageView(), findTopic, false, true, f6Var);
                this.f39774s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f39774s.setChatAvatar(chat);
                this.f39774s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f39774s.setUserAvatar(user);
                this.f39774s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f39774s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f39774s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18807a7, f6Var));
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f39767a = ml0Var;
        ml0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f39767a);
        frameLayout.addView(this.f39767a, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ml0 ml0Var2 = this.f39767a;
        w11 w11Var = new w11(this, context);
        this.f39769b = w11Var;
        ml0Var2.setAdapter(w11Var);
        this.f39767a.setItemAnimator(null);
        this.f39767a.setLayoutAnimation(null);
        this.f39767a.setLayoutManager(new gg.b0(17));
        this.f39767a.setOnItemClickListener(new ac1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f39769b.l();
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
        yy0 yy0Var = new yy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.j6.class, org.telegram.ui.Cells.za.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18863d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f18807a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19140s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19195v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19159t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18953i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18985k0, null, null, org.telegram.ui.ActionBar.j6.f18864d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18918g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18936h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19264z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusColor"}, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.f19245y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.za.class}, new String[]{"statusOnlineColor"}, null, null, -1, yy0Var, org.telegram.ui.ActionBar.j6.f19048n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39767a, 0, new Class[]{org.telegram.ui.Cells.za.class}, null, org.telegram.ui.ActionBar.j6.f19113r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, yy0Var, org.telegram.ui.ActionBar.j6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f39771f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.e, this.f39771f);
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
            w11 w11Var = this.f39769b;
            if (w11Var != null) {
                if (i10 == 13) {
                    i12 = this.Q;
                } else {
                    i12 = this.F;
                }
                w11Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f39768a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.e, this.f39771f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f39767a.setPadding(0, 0, 0, i13);
        this.f39767a.setClipToPadding(false);
    }
}
