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
public final class v11 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.qm0 f42600a;
    public boolean f42601a0;
    public t11 f42602b;
    public AnimatorSet f42603c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long f42604e;
    public final long f42605f;
    public final boolean h;
    public boolean f42606n;
    public u11 f42607r;
    public org.telegram.ui.Components.uo f42608s;
    public int v;
    public int f42609w;
    public int f42610x;
    public int f42611y;

    public v11(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.d = e6Var;
        this.f42604e = bundle.getLong("dialog_id");
        this.f42605f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(v11 v11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(v11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        t11 t11Var = v11Var.f42602b;
        if (t11Var != null) {
            t11Var.m(v11Var.H);
        }
    }

    public static void V(final v11 v11Var, Context context, String str, View view, int i10) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        long j3 = v11Var.f42605f;
        long j10 = v11Var.f42604e;
        org.telegram.ui.ActionBar.e6 e6Var = v11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == v11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new q11(v11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                v11Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21037q7, false));
                }
            } else if (i10 == v11Var.F) {
                Bundle f7 = sc.v.f(j10, "dialog_id");
                f7.putLong("topic_id", j3);
                v11Var.presentFragment(new al0(f7, e6Var));
            } else if (i10 == v11Var.Q) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(v11Var.currentAccount);
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
                    v11Var.startActivityForResult(intent, 13);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            } else if (i10 == v11Var.G) {
                Activity parentActivity = v11Var.getParentActivity();
                long j11 = v11Var.f42604e;
                long j12 = v11Var.f42605f;
                Runnable runnable = new Runnable(v11Var) {
                    public final v11 f41245b;

                    {
                        this.f41245b = v11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                v11 v11Var2 = this.f41245b;
                                t11 t11Var = v11Var2.f42602b;
                                if (t11Var != null) {
                                    t11Var.m(v11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                v11 v11Var3 = this.f41245b;
                                t11 t11Var2 = v11Var3.f42602b;
                                if (t11Var2 != null) {
                                    t11Var2.m(v11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                v11 v11Var4 = this.f41245b;
                                t11 t11Var3 = v11Var4.f42602b;
                                if (t11Var3 != null) {
                                    t11Var3.m(v11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                v11 v11Var5 = this.f41245b;
                                t11 t11Var4 = v11Var5.f42602b;
                                if (t11Var4 != null) {
                                    t11Var4.m(v11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.e6 e6Var2 = v11Var.d;
                Pattern pattern = org.telegram.ui.Components.g5.f26593a;
                if (j11 != 0) {
                    str3 = a1.g.p(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                v11Var.showDialog(org.telegram.ui.Components.g5.X(parentActivity, j11, j12, str3, runnable, e6Var2));
            } else {
                int i11 = 2;
                if (i10 == v11Var.f42611y) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    boolean z10 = !w8Var.f23688e.h;
                    v11Var.f42606n = z10;
                    w8Var.setChecked(z10);
                    int childCount = v11Var.f42600a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.am0 am0Var = (org.telegram.ui.Components.am0) v11Var.f42600a.T(v11Var.f42600a.getChildAt(i12));
                        int i13 = am0Var.f47660f;
                        View view2 = am0Var.f47656a;
                        int b10 = am0Var.b();
                        if (b10 != v11Var.f42611y && b10 != v11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == v11Var.E) {
                                                    ((org.telegram.ui.Cells.w8) view2).e(arrayList, v11Var.f42606n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.k6) view2).b(arrayList, v11Var.f42606n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, v11Var.f42606n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.e9) view2).c(arrayList, v11Var.f42606n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ca) view2).a(arrayList, v11Var.f42606n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, v11Var.f42606n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = v11Var.f42603c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        v11Var.f42603c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        v11Var.f42603c.addListener(new ep0(v11Var, 16));
                        v11Var.f42603c.setDuration(150L);
                        v11Var.f42603c.start();
                    }
                } else if (i10 == v11Var.E) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    Switch r32 = w8Var2.f23688e;
                    MessagesController.getNotificationsSettings(v11Var.currentAccount).edit().putBoolean(sc.v.i("content_preview_", str), !r32.h).apply();
                    w8Var2.setChecked(!r32.h);
                } else if (i10 == v11Var.R) {
                    v11Var.showDialog(org.telegram.ui.Components.g5.X(v11Var.getParentActivity(), v11Var.f42604e, v11Var.f42605f, sc.v.i("calls_vibrate_", str), new Runnable(v11Var) {
                        public final v11 f41245b;

                        {
                            this.f41245b = v11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    v11 v11Var2 = this.f41245b;
                                    t11 t11Var = v11Var2.f42602b;
                                    if (t11Var != null) {
                                        t11Var.m(v11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    v11 v11Var3 = this.f41245b;
                                    t11 t11Var2 = v11Var3.f42602b;
                                    if (t11Var2 != null) {
                                        t11Var2.m(v11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    v11 v11Var4 = this.f41245b;
                                    t11 t11Var3 = v11Var4.f42602b;
                                    if (t11Var3 != null) {
                                        t11Var3.m(v11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    v11 v11Var5 = this.f41245b;
                                    t11 t11Var4 = v11Var5.f42602b;
                                    if (t11Var4 != null) {
                                        t11Var4.m(v11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, v11Var.d));
                } else if (i10 == v11Var.I) {
                    v11Var.showDialog(org.telegram.ui.Components.g5.H(v11Var.getParentActivity(), v11Var.f42604e, v11Var.f42605f, -1, new Runnable(v11Var) {
                        public final v11 f41245b;

                        {
                            this.f41245b = v11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    v11 v11Var2 = this.f41245b;
                                    t11 t11Var = v11Var2.f42602b;
                                    if (t11Var != null) {
                                        t11Var.m(v11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    v11 v11Var3 = this.f41245b;
                                    t11 t11Var2 = v11Var3.f42602b;
                                    if (t11Var2 != null) {
                                        t11Var2.m(v11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    v11 v11Var4 = this.f41245b;
                                    t11 t11Var3 = v11Var4.f42602b;
                                    if (t11Var3 != null) {
                                        t11Var3.m(v11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    v11 v11Var5 = this.f41245b;
                                    t11 t11Var4 = v11Var5.f42602b;
                                    if (t11Var4 != null) {
                                        t11Var4.m(v11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, v11Var.d));
                } else if (i10 == v11Var.H) {
                    if (v11Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(v11Var.currentAccount);
                        int c10 = org.telegram.messenger.q.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.q.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = v11Var.getParentActivity();
                        q11 q11Var = new q11(v11Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.g5.f26593a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.i6.f20905j5;
                            if (e6Var != null) {
                                x02 = e6Var.c0(i14);
                            } else {
                                x02 = org.telegram.ui.ActionBar.i6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.i6.f20868h5;
                            if (e6Var != null) {
                                x03 = e6Var.c0(i15);
                            } else {
                                x03 = org.telegram.ui.ActionBar.i6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.i6.Ji;
                            if (e6Var != null) {
                                e6Var.c0(i16);
                            } else {
                                org.telegram.ui.ActionBar.i6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.i6.Ni;
                            if (e6Var != null) {
                                e6Var.c0(i17);
                            } else {
                                org.telegram.ui.ActionBar.i6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.i6.E8;
                            if (e6Var != null) {
                                e6Var.c0(i18);
                            } else {
                                org.telegram.ui.ActionBar.i6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.i6.G8;
                            if (e6Var != null) {
                                e6Var.c0(i19);
                            } else {
                                org.telegram.ui.ActionBar.i6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.i6.f20888i6;
                            if (e6Var != null) {
                                e6Var.c0(i20);
                            } else {
                                org.telegram.ui.ActionBar.i6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.i6.Sh;
                            if (e6Var != null) {
                                x04 = e6Var.c0(i21);
                            } else {
                                x04 = org.telegram.ui.ActionBar.i6.x0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.i6.Oh;
                            if (e6Var != null) {
                                x05 = e6Var.c0(i22);
                            } else {
                                x05 = org.telegram.ui.ActionBar.i6.x0(null, i22, false);
                            }
                            int i23 = x05;
                            int i24 = org.telegram.ui.ActionBar.i6.Qh;
                            if (e6Var != null) {
                                x06 = e6Var.c0(i24);
                            } else {
                                x06 = org.telegram.ui.ActionBar.i6.x0(null, i24, false);
                            }
                            int i25 = x06;
                            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, e6Var);
                            a3Var.a();
                            ?? ud0Var = new org.telegram.ui.Components.ud0(parentActivity2, e6Var);
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(10);
                            ud0Var.setTextColor(x02);
                            ud0Var.setValue(i11 - 1);
                            ud0Var.setWrapSelectorWheel(false);
                            ud0Var.setFormatter(new nr(26));
                            ?? ud0Var2 = new org.telegram.ui.Components.ud0(parentActivity2, e6Var);
                            ud0Var2.setMinValue(0);
                            ud0Var2.setMaxValue(10);
                            ud0Var2.setTextColor(x02);
                            ud0Var2.setValue((c11 / 60) - 1);
                            ud0Var2.setWrapSelectorWheel(false);
                            ud0Var2.setFormatter(new nr(27));
                            org.telegram.ui.Components.ud0 ud0Var3 = new org.telegram.ui.Components.ud0(parentActivity2, e6Var);
                            ud0Var3.setMinValue(0);
                            ud0Var3.setMaxValue(0);
                            ud0Var3.setTextColor(x02);
                            ud0Var3.setValue(0);
                            ud0Var3.setWrapSelectorWheel(false);
                            ud0Var3.setFormatter(new nr(28));
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
                            q4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, i23, i25, i25));
                            q4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            y3Var.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                            nr nrVar = new nr(15);
                            ud0Var.setOnValueChangedListener(nrVar);
                            ud0Var2.setOnValueChangedListener(nrVar);
                            q4Var.setOnClickListener(new ai.p5((Object) ud0Var, (Object) ud0Var2, q11Var, a3Var, 7));
                            a3Var.b(y3Var);
                            org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20380a;
                            f3Var.show();
                            f3Var.setBackgroundColor(x03);
                            f3Var.fixNavigationBar(x03);
                        }
                    }
                } else if (i10 == v11Var.U) {
                    if (v11Var.getParentActivity() != null) {
                        v11Var.showDialog(org.telegram.ui.Components.g5.t(v11Var.getParentActivity(), v11Var.f42604e, v11Var.f42605f, -1, new Runnable(v11Var) {
                            public final v11 f41245b;

                            {
                                this.f41245b = v11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        v11 v11Var2 = this.f41245b;
                                        t11 t11Var = v11Var2.f42602b;
                                        if (t11Var != null) {
                                            t11Var.m(v11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        v11 v11Var3 = this.f41245b;
                                        t11 t11Var2 = v11Var3.f42602b;
                                        if (t11Var2 != null) {
                                            t11Var2.m(v11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        v11 v11Var4 = this.f41245b;
                                        t11 t11Var3 = v11Var4.f42602b;
                                        if (t11Var3 != null) {
                                            t11Var3.m(v11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        v11 v11Var5 = this.f41245b;
                                        t11 t11Var4 = v11Var5.f42602b;
                                        if (t11Var4 != null) {
                                            t11Var4.m(v11Var5.U);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, v11Var.d));
                    }
                } else if (i10 == v11Var.L) {
                    MessagesController.getNotificationsSettings(v11Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag = v11Var.f42600a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == v11Var.M) {
                    MessagesController.getNotificationsSettings(v11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.k6) view).a(true, true);
                    View findViewWithTag2 = v11Var.f42600a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.k6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == v11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.f23688e.h;
                    boolean z12 = !z11;
                    w8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(v11Var.currentAccount).edit();
                    if (v11Var.Z && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    v11Var.getNotificationsController().updateServerNotificationsSettings(j10, j3);
                }
            }
        }
    }

    public static void W(v11 v11Var, String str) {
        v11Var.f42601a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(v11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        v11Var.finishFragment();
        u11 u11Var = v11Var.f42607r;
        if (u11Var != null) {
            u11Var.a0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f20835f8;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        kVar.C(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), false);
        this.actionBar.D(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21130v8, e6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.f42604e;
        long j10 = this.f42605f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new s11(this, sharedPrefKey));
        org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(context, null, false, e6Var);
        this.f42608s = uoVar;
        uoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.uo uoVar2 = this.f42608s;
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
                ng.d.p(this.f42608s.getAvatarImageView(), findTopic, false, true, e6Var);
                this.f42608s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f42608s.setChatAvatar(chat);
                this.f42608s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f42608s.setUserAvatar(user);
                this.f42608s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f42608s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.o().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f42608s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20741a7, e6Var));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.f42600a = qm0Var;
        qm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f42600a);
        frameLayout.addView(this.f42600a, w7.x5.d(-1.0f, -1));
        org.telegram.ui.Components.qm0 qm0Var2 = this.f42600a;
        t11 t11Var = new t11(this, context);
        this.f42602b = t11Var;
        qm0Var2.setAdapter(t11Var);
        this.f42600a.setItemAnimator(null);
        this.f42600a.setLayoutAnimation(null);
        this.f42600a.setLayoutManager(new gg.a0(17));
        this.f42600a.setOnItemClickListener(new ac1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f42602b.l();
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
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.k6.class, org.telegram.ui.Cells.wa.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20797d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21075s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 8192, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20854g7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 16384, new Class[]{org.telegram.ui.Cells.k6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20870h7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21199z6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusColor"}, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.f21181y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, new String[]{"statusOnlineColor"}, null, null, -1, wy0Var, org.telegram.ui.ActionBar.i6.f20982n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f42600a, 0, new Class[]{org.telegram.ui.Cells.wa.class}, null, org.telegram.ui.ActionBar.i6.f21049r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, wy0Var, org.telegram.ui.ActionBar.i6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42604e, this.f42605f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.f42604e, this.f42605f);
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
            t11 t11Var = this.f42602b;
            if (t11Var != null) {
                if (i10 == 13) {
                    i12 = this.Q;
                } else {
                    i12 = this.F;
                }
                t11Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v11.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f42601a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42604e, this.f42605f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f42600a.setPadding(0, 0, 0, i13);
        this.f42600a.setClipToPadding(false);
    }
}
