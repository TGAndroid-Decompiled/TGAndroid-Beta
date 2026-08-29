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
public final class t01 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
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
    public boolean V;
    public boolean W;
    public org.telegram.ui.Components.jl0 f42511a;
    public r01 f42512b;
    public AnimatorSet f42513c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final long f42514e;
    public final long f42515f;
    public final boolean h;
    public boolean f42516n;
    public s01 f42517r;
    public org.telegram.ui.Components.xn f42518s;
    public int v;
    public int f42519w;
    public int f42520x;
    public int f42521y;

    public t01(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.d = c6Var;
        this.f42514e = bundle.getLong("dialog_id");
        this.f42515f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(t01 t01Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(t01Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        r01 r01Var = t01Var.f42512b;
        if (r01Var != null) {
            r01Var.m(t01Var.D);
        }
    }

    public static void V(final t01 t01Var, Context context, String str, View view, int i10) {
        String str2;
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        String str3;
        long j10 = t01Var.f42515f;
        long j11 = t01Var.f42514e;
        org.telegram.ui.ActionBar.c6 c6Var = t01Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == t01Var.S) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new o01(t01Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                t01Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                }
            } else if (i10 == t01Var.B) {
                Bundle g10 = j7.l1.g(j11, "dialog_id");
                g10.putLong("topic_id", j10);
                t01Var.presentFragment(new gk0(g10, c6Var));
            } else if (i10 == t01Var.M) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(t01Var.currentAccount);
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
                    t01Var.startActivityForResult(intent, 13);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else if (i10 == t01Var.C) {
                Activity parentActivity = t01Var.getParentActivity();
                long j12 = t01Var.f42514e;
                long j13 = t01Var.f42515f;
                Runnable runnable = new Runnable(t01Var) {
                    public final t01 f41272b;

                    {
                        this.f41272b = t01Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                t01 t01Var2 = this.f41272b;
                                r01 r01Var = t01Var2.f42512b;
                                if (r01Var != null) {
                                    r01Var.m(t01Var2.C);
                                    return;
                                }
                                return;
                            case 1:
                                t01 t01Var3 = this.f41272b;
                                r01 r01Var2 = t01Var3.f42512b;
                                if (r01Var2 != null) {
                                    r01Var2.m(t01Var3.N);
                                    return;
                                }
                                return;
                            case 2:
                                t01 t01Var4 = this.f41272b;
                                r01 r01Var3 = t01Var4.f42512b;
                                if (r01Var3 != null) {
                                    r01Var3.m(t01Var4.E);
                                    return;
                                }
                                return;
                            default:
                                t01 t01Var5 = this.f41272b;
                                r01 r01Var4 = t01Var5.f42512b;
                                if (r01Var4 != null) {
                                    r01Var4.m(t01Var5.Q);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.c6 c6Var2 = t01Var.d;
                Pattern pattern = org.telegram.ui.Components.c5.f27308a;
                if (j12 != 0) {
                    str3 = a4.w.m(j12, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                t01Var.showDialog(org.telegram.ui.Components.c5.Y(parentActivity, j12, j13, str3, runnable, c6Var2));
            } else {
                int i11 = 2;
                if (i10 == t01Var.f42521y) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    boolean z10 = !q8Var.f25083e.h;
                    t01Var.f42516n = z10;
                    q8Var.setChecked(z10);
                    int childCount = t01Var.f42511a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) t01Var.f42511a.T(t01Var.f42511a.getChildAt(i12));
                        int i13 = vk0Var.f6436f;
                        View view2 = vk0Var.f6432a;
                        int b10 = vk0Var.b();
                        if (b10 != t01Var.f42521y && b10 != t01Var.S) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == t01Var.A) {
                                                    ((org.telegram.ui.Cells.q8) view2).e(arrayList, t01Var.f42516n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.h6) view2).b(arrayList, t01Var.f42516n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.s8) view2).a(arrayList, t01Var.f42516n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.y8) view2).c(arrayList, t01Var.f42516n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.y9) view2).a(arrayList, t01Var.f42516n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.k4) view2).a(arrayList, t01Var.f42516n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = t01Var.f42513c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        t01Var.f42513c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        t01Var.f42513c.addListener(new e50(t01Var, 23));
                        t01Var.f42513c.setDuration(150L);
                        t01Var.f42513c.start();
                    }
                } else if (i10 == t01Var.A) {
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                    Switch r32 = q8Var2.f25083e;
                    MessagesController.getNotificationsSettings(t01Var.currentAccount).edit().putBoolean(u3.c.e("content_preview_", str), !r32.h).apply();
                    q8Var2.setChecked(!r32.h);
                } else if (i10 == t01Var.N) {
                    t01Var.showDialog(org.telegram.ui.Components.c5.Y(t01Var.getParentActivity(), t01Var.f42514e, t01Var.f42515f, u3.c.e("calls_vibrate_", str), new Runnable(t01Var) {
                        public final t01 f41272b;

                        {
                            this.f41272b = t01Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    t01 t01Var2 = this.f41272b;
                                    r01 r01Var = t01Var2.f42512b;
                                    if (r01Var != null) {
                                        r01Var.m(t01Var2.C);
                                        return;
                                    }
                                    return;
                                case 1:
                                    t01 t01Var3 = this.f41272b;
                                    r01 r01Var2 = t01Var3.f42512b;
                                    if (r01Var2 != null) {
                                        r01Var2.m(t01Var3.N);
                                        return;
                                    }
                                    return;
                                case 2:
                                    t01 t01Var4 = this.f41272b;
                                    r01 r01Var3 = t01Var4.f42512b;
                                    if (r01Var3 != null) {
                                        r01Var3.m(t01Var4.E);
                                        return;
                                    }
                                    return;
                                default:
                                    t01 t01Var5 = this.f41272b;
                                    r01 r01Var4 = t01Var5.f42512b;
                                    if (r01Var4 != null) {
                                        r01Var4.m(t01Var5.Q);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, t01Var.d));
                } else if (i10 == t01Var.E) {
                    t01Var.showDialog(org.telegram.ui.Components.c5.I(t01Var.getParentActivity(), t01Var.f42514e, t01Var.f42515f, -1, new Runnable(t01Var) {
                        public final t01 f41272b;

                        {
                            this.f41272b = t01Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    t01 t01Var2 = this.f41272b;
                                    r01 r01Var = t01Var2.f42512b;
                                    if (r01Var != null) {
                                        r01Var.m(t01Var2.C);
                                        return;
                                    }
                                    return;
                                case 1:
                                    t01 t01Var3 = this.f41272b;
                                    r01 r01Var2 = t01Var3.f42512b;
                                    if (r01Var2 != null) {
                                        r01Var2.m(t01Var3.N);
                                        return;
                                    }
                                    return;
                                case 2:
                                    t01 t01Var4 = this.f41272b;
                                    r01 r01Var3 = t01Var4.f42512b;
                                    if (r01Var3 != null) {
                                        r01Var3.m(t01Var4.E);
                                        return;
                                    }
                                    return;
                                default:
                                    t01 t01Var5 = this.f41272b;
                                    r01 r01Var4 = t01Var5.f42512b;
                                    if (r01Var4 != null) {
                                        r01Var4.m(t01Var5.Q);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, t01Var.d));
                } else if (i10 == t01Var.D) {
                    if (t01Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(t01Var.currentAccount);
                        int c3 = org.telegram.messenger.x3.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c6 = org.telegram.messenger.x3.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c3 != 0) {
                            i11 = c3;
                        }
                        Activity parentActivity2 = t01Var.getParentActivity();
                        o01 o01Var = new o01(t01Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.c5.f27308a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.g6.f23169j5;
                            if (c6Var != null) {
                                w02 = c6Var.h0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.g6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.g6.f23133h5;
                            if (c6Var != null) {
                                w03 = c6Var.h0(i15);
                            } else {
                                w03 = org.telegram.ui.ActionBar.g6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.g6.Ji;
                            if (c6Var != null) {
                                c6Var.h0(i16);
                            } else {
                                org.telegram.ui.ActionBar.g6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.g6.Ni;
                            if (c6Var != null) {
                                c6Var.h0(i17);
                            } else {
                                org.telegram.ui.ActionBar.g6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.g6.E8;
                            if (c6Var != null) {
                                c6Var.h0(i18);
                            } else {
                                org.telegram.ui.ActionBar.g6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.g6.G8;
                            if (c6Var != null) {
                                c6Var.h0(i19);
                            } else {
                                org.telegram.ui.ActionBar.g6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.g6.f23152i6;
                            if (c6Var != null) {
                                c6Var.h0(i20);
                            } else {
                                org.telegram.ui.ActionBar.g6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.g6.Sh;
                            if (c6Var != null) {
                                w04 = c6Var.h0(i21);
                            } else {
                                w04 = org.telegram.ui.ActionBar.g6.w0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.g6.Oh;
                            if (c6Var != null) {
                                w05 = c6Var.h0(i22);
                            } else {
                                w05 = org.telegram.ui.ActionBar.g6.w0(null, i22, false);
                            }
                            int i23 = w05;
                            int i24 = org.telegram.ui.ActionBar.g6.Qh;
                            if (c6Var != null) {
                                w06 = c6Var.h0(i24);
                            } else {
                                w06 = org.telegram.ui.ActionBar.g6.w0(null, i24, false);
                            }
                            int i25 = w06;
                            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, c6Var);
                            a3Var.a();
                            ?? qc0Var = new org.telegram.ui.Components.qc0(parentActivity2, c6Var);
                            qc0Var.setMinValue(0);
                            qc0Var.setMaxValue(10);
                            qc0Var.setTextColor(w02);
                            qc0Var.setValue(i11 - 1);
                            qc0Var.setWrapSelectorWheel(false);
                            qc0Var.setFormatter(new org.telegram.ui.Components.n0(15));
                            ?? qc0Var2 = new org.telegram.ui.Components.qc0(parentActivity2, c6Var);
                            qc0Var2.setMinValue(0);
                            qc0Var2.setMaxValue(10);
                            qc0Var2.setTextColor(w02);
                            qc0Var2.setValue((c6 / 60) - 1);
                            qc0Var2.setWrapSelectorWheel(false);
                            qc0Var2.setFormatter(new org.telegram.ui.Components.n0(16));
                            org.telegram.ui.Components.qc0 qc0Var3 = new org.telegram.ui.Components.qc0(parentActivity2, c6Var);
                            qc0Var3.setMinValue(0);
                            qc0Var3.setMaxValue(0);
                            qc0Var3.setTextColor(w02);
                            qc0Var3.setValue(0);
                            qc0Var3.setWrapSelectorWheel(false);
                            qc0Var3.setFormatter(new org.telegram.ui.Components.n0(17));
                            org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(parentActivity2, qc0Var, qc0Var2, qc0Var3);
                            v3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            v3Var.addView(frameLayout, i7.f6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(w02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, i7.f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new mh.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            v3Var.addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            eg.r rVar = new eg.r(parentActivity2, 17);
                            linearLayout.addView((View) qc0Var, i7.f6.l(0.4f, 0, 270));
                            linearLayout.addView(qc0Var3, i7.f6.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) qc0Var2, i7.f6.l(0.4f, 0, 270));
                            rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            rVar.setGravity(17);
                            rVar.setTextColor(w04);
                            rVar.setTextSize(1, 14.0f);
                            rVar.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            rVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, i23, i25, i25));
                            rVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            v3Var.addView(rVar, i7.f6.t(-1, 48, 83, 16, 15, 16, 16));
                            org.telegram.ui.Components.n0 n0Var = new org.telegram.ui.Components.n0(4);
                            qc0Var.setOnValueChangedListener(n0Var);
                            qc0Var2.setOnValueChangedListener(n0Var);
                            rVar.setOnClickListener(new ih.u3((Object) qc0Var, (Object) qc0Var2, o01Var, a3Var, 5));
                            a3Var.b(v3Var);
                            org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22729a;
                            f3Var.show();
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == t01Var.Q) {
                    if (t01Var.getParentActivity() != null) {
                        t01Var.showDialog(org.telegram.ui.Components.c5.u(t01Var.getParentActivity(), t01Var.f42514e, t01Var.f42515f, -1, new Runnable(t01Var) {
                            public final t01 f41272b;

                            {
                                this.f41272b = t01Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        t01 t01Var2 = this.f41272b;
                                        r01 r01Var = t01Var2.f42512b;
                                        if (r01Var != null) {
                                            r01Var.m(t01Var2.C);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        t01 t01Var3 = this.f41272b;
                                        r01 r01Var2 = t01Var3.f42512b;
                                        if (r01Var2 != null) {
                                            r01Var2.m(t01Var3.N);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        t01 t01Var4 = this.f41272b;
                                        r01 r01Var3 = t01Var4.f42512b;
                                        if (r01Var3 != null) {
                                            r01Var3.m(t01Var4.E);
                                            return;
                                        }
                                        return;
                                    default:
                                        t01 t01Var5 = this.f41272b;
                                        r01 r01Var4 = t01Var5.f42512b;
                                        if (r01Var4 != null) {
                                            r01Var4.m(t01Var5.Q);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, t01Var.d));
                    }
                } else if (i10 == t01Var.H) {
                    MessagesController.getNotificationsSettings(t01Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.h6) view).a(true, true);
                    View findViewWithTag = t01Var.f42511a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.h6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == t01Var.I) {
                    MessagesController.getNotificationsSettings(t01Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.h6) view).a(true, true);
                    View findViewWithTag2 = t01Var.f42511a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.h6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == t01Var.K) {
                    org.telegram.ui.Cells.q8 q8Var3 = (org.telegram.ui.Cells.q8) view;
                    boolean z11 = q8Var3.f25083e.h;
                    boolean z12 = !z11;
                    q8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(t01Var.currentAccount).edit();
                    if (t01Var.V && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    t01Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                }
            }
        }
    }

    public static void W(t01 t01Var, String str) {
        t01Var.W = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(t01Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        t01Var.finishFragment();
        s01 s01Var = t01Var.f42517r;
        if (s01Var != null) {
            s01Var.a0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f9;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23101f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        lVar.B(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.f42514e;
        long j11 = this.f42515f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new q01(this, sharedPrefKey));
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(context, null, false, c6Var);
        this.f42518s = xnVar;
        xnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        org.telegram.ui.Components.xn xnVar2 = this.f42518s;
        if (!this.inPreviewMode) {
            f9 = 56.0f;
        } else {
            f9 = 0.0f;
        }
        lVar2.addView(xnVar2, 0, i7.f6.d(-2, -1.0f, 51, f9, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
                yf.d.p(this.f42518s.getAvatarImageView(), findTopic, false, true, c6Var);
                this.f42518s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                this.f42518s.setChatAvatar(chat);
                this.f42518s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.f42518s.setUserAvatar(user);
                this.f42518s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f42518s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f42518s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, c6Var));
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f42511a = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f42511a);
        frameLayout.addView(this.f42511a, i7.f6.c(-1.0f, -1));
        org.telegram.ui.Components.jl0 jl0Var2 = this.f42511a;
        r01 r01Var = new r01(this, context);
        this.f42512b = r01Var;
        jl0Var2.setAdapter(r01Var);
        this.f42511a.setItemAnimator(null);
        this.f42511a.setLayoutAnimation(null);
        this.f42511a.setLayoutManager(new k(15));
        this.f42511a.setOnItemClickListener(new ra1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f42512b.l();
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
        rx0 rx0Var = new rx0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 16, new Class[]{org.telegram.ui.Cells.k4.class, org.telegram.ui.Cells.y9.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.h6.class, org.telegram.ui.Cells.ra.class, org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.n8.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 8192, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23118g7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 16384, new Class[]{org.telegram.ui.Cells.h6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23135h7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23450z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusColor"}, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23433y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, null, null, -1, rx0Var, org.telegram.ui.ActionBar.g6.f23241n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42511a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, rx0Var, org.telegram.ui.ActionBar.g6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42514e, this.f42515f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.f42514e, this.f42515f);
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
            r01 r01Var = this.f42512b;
            if (r01Var != null) {
                if (i10 == 13) {
                    i12 = this.M;
                } else {
                    i12 = this.B;
                }
                r01Var.m(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t01.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.W) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42514e, this.f42515f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f42511a.setPadding(0, 0, 0, i13);
        this.f42511a.setClipToPadding(false);
    }
}
