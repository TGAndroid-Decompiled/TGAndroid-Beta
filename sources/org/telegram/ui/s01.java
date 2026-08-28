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
public final class s01 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.wk0 f42519a;
    public q01 f42520b;
    public AnimatorSet f42521c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final long f42522e;
    public final long f42523f;
    public final boolean h;
    public boolean f42524n;
    public r01 f42525r;
    public org.telegram.ui.Components.tn f42526s;
    public int v;
    public int f42527w;
    public int f42528x;
    public int f42529y;

    public s01(Bundle bundle, org.telegram.ui.ActionBar.b6 b6Var) {
        super(bundle);
        this.d = b6Var;
        this.f42522e = bundle.getLong("dialog_id");
        this.f42523f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void T(s01 s01Var, String str, int i9, int i10) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(s01Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i9);
        putInt.putInt("smart_delay_" + str, i10).apply();
        q01 q01Var = s01Var.f42520b;
        if (q01Var != null) {
            q01Var.m(s01Var.D);
        }
    }

    public static void U(final s01 s01Var, Context context, String str, View view, int i9) {
        String str2;
        int w02;
        int w03;
        int w04;
        int w05;
        int w06;
        String str3;
        long j10 = s01Var.f42523f;
        long j11 = s01Var.f42522e;
        org.telegram.ui.ActionBar.b6 b6Var = s01Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i9 == s01Var.S) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new n01(s01Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                s01Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                }
            } else if (i9 == s01Var.B) {
                Bundle g10 = e2.c.g(j11, "dialog_id");
                g10.putLong("topic_id", j10);
                s01Var.presentFragment(new kk0(g10, b6Var));
            } else if (i9 == s01Var.M) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(s01Var.currentAccount);
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
                    s01Var.startActivityForResult(intent, 13);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else if (i9 == s01Var.C) {
                Activity parentActivity = s01Var.getParentActivity();
                long j12 = s01Var.f42522e;
                long j13 = s01Var.f42523f;
                Runnable runnable = new Runnable(s01Var) {
                    public final s01 f40861b;

                    {
                        this.f40861b = s01Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                s01 s01Var2 = this.f40861b;
                                q01 q01Var = s01Var2.f42520b;
                                if (q01Var != null) {
                                    q01Var.m(s01Var2.C);
                                    return;
                                }
                                return;
                            case 1:
                                s01 s01Var3 = this.f40861b;
                                q01 q01Var2 = s01Var3.f42520b;
                                if (q01Var2 != null) {
                                    q01Var2.m(s01Var3.N);
                                    return;
                                }
                                return;
                            case 2:
                                s01 s01Var4 = this.f40861b;
                                q01 q01Var3 = s01Var4.f42520b;
                                if (q01Var3 != null) {
                                    q01Var3.m(s01Var4.E);
                                    return;
                                }
                                return;
                            default:
                                s01 s01Var5 = this.f40861b;
                                q01 q01Var4 = s01Var5.f42520b;
                                if (q01Var4 != null) {
                                    q01Var4.m(s01Var5.Q);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.b6 b6Var2 = s01Var.d;
                Pattern pattern = org.telegram.ui.Components.y4.f34847a;
                if (j12 != 0) {
                    str3 = aa.d.m(j12, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                s01Var.showDialog(org.telegram.ui.Components.y4.Y(parentActivity, j12, j13, str3, runnable, b6Var2));
            } else {
                int i10 = 2;
                if (i9 == s01Var.f42529y) {
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    boolean z10 = !t8Var.f25711e.h;
                    s01Var.f42524n = z10;
                    t8Var.setChecked(z10);
                    int childCount = s01Var.f42519a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) s01Var.f42519a.T(s01Var.f42519a.getChildAt(i11));
                        int i12 = ik0Var.f5505f;
                        View view2 = ik0Var.f5501a;
                        int b10 = ik0Var.b();
                        if (b10 != s01Var.f42529y && b10 != s01Var.S) {
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            if (i12 != 4) {
                                                if (i12 == 7 && b10 == s01Var.A) {
                                                    ((org.telegram.ui.Cells.t8) view2).e(arrayList, s01Var.f42524n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.j6) view2).b(arrayList, s01Var.f42524n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.v8) view2).a(arrayList, s01Var.f42524n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.b9) view2).c(arrayList, s01Var.f42524n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ba) view2).a(arrayList, s01Var.f42524n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.m4) view2).a(arrayList, s01Var.f42524n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = s01Var.f42521c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        s01Var.f42521c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        s01Var.f42521c.addListener(new bc0(s01Var, 21));
                        s01Var.f42521c.setDuration(150L);
                        s01Var.f42521c.start();
                    }
                } else if (i9 == s01Var.A) {
                    org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
                    Switch r32 = t8Var2.f25711e;
                    MessagesController.getNotificationsSettings(s01Var.currentAccount).edit().putBoolean(ta.b.d("content_preview_", str), !r32.h).apply();
                    t8Var2.setChecked(!r32.h);
                } else if (i9 == s01Var.N) {
                    s01Var.showDialog(org.telegram.ui.Components.y4.Y(s01Var.getParentActivity(), s01Var.f42522e, s01Var.f42523f, ta.b.d("calls_vibrate_", str), new Runnable(s01Var) {
                        public final s01 f40861b;

                        {
                            this.f40861b = s01Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    s01 s01Var2 = this.f40861b;
                                    q01 q01Var = s01Var2.f42520b;
                                    if (q01Var != null) {
                                        q01Var.m(s01Var2.C);
                                        return;
                                    }
                                    return;
                                case 1:
                                    s01 s01Var3 = this.f40861b;
                                    q01 q01Var2 = s01Var3.f42520b;
                                    if (q01Var2 != null) {
                                        q01Var2.m(s01Var3.N);
                                        return;
                                    }
                                    return;
                                case 2:
                                    s01 s01Var4 = this.f40861b;
                                    q01 q01Var3 = s01Var4.f42520b;
                                    if (q01Var3 != null) {
                                        q01Var3.m(s01Var4.E);
                                        return;
                                    }
                                    return;
                                default:
                                    s01 s01Var5 = this.f40861b;
                                    q01 q01Var4 = s01Var5.f42520b;
                                    if (q01Var4 != null) {
                                        q01Var4.m(s01Var5.Q);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, s01Var.d));
                } else if (i9 == s01Var.E) {
                    s01Var.showDialog(org.telegram.ui.Components.y4.I(s01Var.getParentActivity(), s01Var.f42522e, s01Var.f42523f, -1, new Runnable(s01Var) {
                        public final s01 f40861b;

                        {
                            this.f40861b = s01Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    s01 s01Var2 = this.f40861b;
                                    q01 q01Var = s01Var2.f42520b;
                                    if (q01Var != null) {
                                        q01Var.m(s01Var2.C);
                                        return;
                                    }
                                    return;
                                case 1:
                                    s01 s01Var3 = this.f40861b;
                                    q01 q01Var2 = s01Var3.f42520b;
                                    if (q01Var2 != null) {
                                        q01Var2.m(s01Var3.N);
                                        return;
                                    }
                                    return;
                                case 2:
                                    s01 s01Var4 = this.f40861b;
                                    q01 q01Var3 = s01Var4.f42520b;
                                    if (q01Var3 != null) {
                                        q01Var3.m(s01Var4.E);
                                        return;
                                    }
                                    return;
                                default:
                                    s01 s01Var5 = this.f40861b;
                                    q01 q01Var4 = s01Var5.f42520b;
                                    if (q01Var4 != null) {
                                        q01Var4.m(s01Var5.Q);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, s01Var.d));
                } else if (i9 == s01Var.D) {
                    if (s01Var.getParentActivity() != null) {
                        SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(s01Var.currentAccount);
                        int c10 = org.telegram.messenger.l0.c("smart_max_count_", str, notificationsSettings2, 2);
                        int c11 = org.telegram.messenger.l0.c("smart_delay_", str, notificationsSettings2, 180);
                        if (c10 != 0) {
                            i10 = c10;
                        }
                        Activity parentActivity2 = s01Var.getParentActivity();
                        n01 n01Var = new n01(s01Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.y4.f34847a;
                        if (parentActivity2 != null) {
                            int i13 = org.telegram.ui.ActionBar.f6.f23108j5;
                            if (b6Var != null) {
                                w02 = b6Var.p0(i13);
                            } else {
                                w02 = org.telegram.ui.ActionBar.f6.w0(null, i13, false);
                            }
                            int i14 = org.telegram.ui.ActionBar.f6.f23072h5;
                            if (b6Var != null) {
                                w03 = b6Var.p0(i14);
                            } else {
                                w03 = org.telegram.ui.ActionBar.f6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.f6.Ji;
                            if (b6Var != null) {
                                b6Var.p0(i15);
                            } else {
                                org.telegram.ui.ActionBar.f6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.f6.Ni;
                            if (b6Var != null) {
                                b6Var.p0(i16);
                            } else {
                                org.telegram.ui.ActionBar.f6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.f6.E8;
                            if (b6Var != null) {
                                b6Var.p0(i17);
                            } else {
                                org.telegram.ui.ActionBar.f6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.f6.G8;
                            if (b6Var != null) {
                                b6Var.p0(i18);
                            } else {
                                org.telegram.ui.ActionBar.f6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.f6.f23092i6;
                            if (b6Var != null) {
                                b6Var.p0(i19);
                            } else {
                                org.telegram.ui.ActionBar.f6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.f6.Sh;
                            if (b6Var != null) {
                                w04 = b6Var.p0(i20);
                            } else {
                                w04 = org.telegram.ui.ActionBar.f6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.f6.Oh;
                            if (b6Var != null) {
                                w05 = b6Var.p0(i21);
                            } else {
                                w05 = org.telegram.ui.ActionBar.f6.w0(null, i21, false);
                            }
                            int i22 = w05;
                            int i23 = org.telegram.ui.ActionBar.f6.Qh;
                            if (b6Var != null) {
                                w06 = b6Var.p0(i23);
                            } else {
                                w06 = org.telegram.ui.ActionBar.f6.w0(null, i23, false);
                            }
                            int i24 = w06;
                            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, b6Var);
                            a3Var.a();
                            ?? bc0Var = new org.telegram.ui.Components.bc0(parentActivity2, b6Var);
                            bc0Var.setMinValue(0);
                            bc0Var.setMaxValue(10);
                            bc0Var.setTextColor(w02);
                            bc0Var.setValue(i10 - 1);
                            bc0Var.setWrapSelectorWheel(false);
                            bc0Var.setFormatter(new tr(21));
                            ?? bc0Var2 = new org.telegram.ui.Components.bc0(parentActivity2, b6Var);
                            bc0Var2.setMinValue(0);
                            bc0Var2.setMaxValue(10);
                            bc0Var2.setTextColor(w02);
                            bc0Var2.setValue((c11 / 60) - 1);
                            bc0Var2.setWrapSelectorWheel(false);
                            bc0Var2.setFormatter(new tr(22));
                            org.telegram.ui.Components.bc0 bc0Var3 = new org.telegram.ui.Components.bc0(parentActivity2, b6Var);
                            bc0Var3.setMinValue(0);
                            bc0Var3.setMaxValue(0);
                            bc0Var3.setTextColor(w02);
                            bc0Var3.setValue(0);
                            bc0Var3.setWrapSelectorWheel(false);
                            bc0Var3.setFormatter(new tr(23));
                            org.telegram.ui.Components.r3 r3Var = new org.telegram.ui.Components.r3(parentActivity2, bc0Var, bc0Var2, bc0Var3);
                            r3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            r3Var.addView(frameLayout, g7.e6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(w02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new jh.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            r3Var.addView(linearLayout, g7.e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            bg.t tVar = new bg.t(parentActivity2, 19);
                            linearLayout.addView((View) bc0Var, g7.e6.l(0.4f, 0, 270));
                            linearLayout.addView(bc0Var3, g7.e6.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) bc0Var2, g7.e6.l(0.4f, 0, 270));
                            tVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            tVar.setGravity(17);
                            tVar.setTextColor(w04);
                            tVar.setTextSize(1, 14.0f);
                            tVar.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            tVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, i22, i24, i24));
                            tVar.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            r3Var.addView(tVar, g7.e6.t(-1, 48, 83, 16, 15, 16, 16));
                            tr trVar = new tr(10);
                            bc0Var.setOnValueChangedListener(trVar);
                            bc0Var2.setOnValueChangedListener(trVar);
                            tVar.setOnClickListener(new fh.g4((Object) bc0Var, (Object) bc0Var2, n01Var, a3Var, 8));
                            a3Var.b(r3Var);
                            org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22713a;
                            f3Var.show();
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i9 == s01Var.Q) {
                    if (s01Var.getParentActivity() != null) {
                        s01Var.showDialog(org.telegram.ui.Components.y4.u(s01Var.getParentActivity(), s01Var.f42522e, s01Var.f42523f, -1, new Runnable(s01Var) {
                            public final s01 f40861b;

                            {
                                this.f40861b = s01Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        s01 s01Var2 = this.f40861b;
                                        q01 q01Var = s01Var2.f42520b;
                                        if (q01Var != null) {
                                            q01Var.m(s01Var2.C);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        s01 s01Var3 = this.f40861b;
                                        q01 q01Var2 = s01Var3.f42520b;
                                        if (q01Var2 != null) {
                                            q01Var2.m(s01Var3.N);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        s01 s01Var4 = this.f40861b;
                                        q01 q01Var3 = s01Var4.f42520b;
                                        if (q01Var3 != null) {
                                            q01Var3.m(s01Var4.E);
                                            return;
                                        }
                                        return;
                                    default:
                                        s01 s01Var5 = this.f40861b;
                                        q01 q01Var4 = s01Var5.f42520b;
                                        if (q01Var4 != null) {
                                            q01Var4.m(s01Var5.Q);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, s01Var.d));
                    }
                } else if (i9 == s01Var.H) {
                    MessagesController.getNotificationsSettings(s01Var.currentAccount).edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag = s01Var.f42519a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag).a(false, true);
                    }
                } else if (i9 == s01Var.I) {
                    MessagesController.getNotificationsSettings(s01Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag2 = s01Var.f42519a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag2).a(false, true);
                    }
                } else if (i9 == s01Var.K) {
                    org.telegram.ui.Cells.t8 t8Var3 = (org.telegram.ui.Cells.t8) view;
                    boolean z11 = t8Var3.f25711e.h;
                    boolean z12 = !z11;
                    t8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(s01Var.currentAccount).edit();
                    if (s01Var.V && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    s01Var.getNotificationsController().updateServerNotificationsSettings(j11, j10);
                }
            }
        }
    }

    public static void V(s01 s01Var, String str) {
        s01Var.W = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(s01Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        s01Var.finishFragment();
        r01 r01Var = s01Var.f42525r;
        if (r01Var != null) {
            r01Var.E();
        }
    }

    @Override
    public final View createView(Context context) {
        float f10;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23039f8;
        org.telegram.ui.ActionBar.b6 b6Var = this.d;
        kVar.A(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23321v8, b6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j10 = this.f42522e;
        long j11 = this.f42523f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j11);
        this.actionBar.setActionBarMenuOnItemClick(new p01(this, sharedPrefKey));
        org.telegram.ui.Components.tn tnVar = new org.telegram.ui.Components.tn(context, null, false, b6Var);
        this.f42526s = tnVar;
        tnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.tn tnVar2 = this.f42526s;
        if (!this.inPreviewMode) {
            f10 = 56.0f;
        } else {
            f10 = 0.0f;
        }
        kVar2.addView(tnVar2, 0, g7.e6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j10, j11);
                vf.c.p(this.f42526s.getAvatarImageView(), findTopic, false, true, b6Var);
                this.f42526s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                this.f42526s.setChatAvatar(chat);
                this.f42526s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                this.f42526s.setUserAvatar(user);
                this.f42526s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f42526s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f42526s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, b6Var));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f42519a = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f42519a);
        frameLayout.addView(this.f42519a, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.wk0 wk0Var2 = this.f42519a;
        q01 q01Var = new q01(this, context);
        this.f42520b = q01Var;
        wk0Var2.setAdapter(q01Var);
        this.f42519a.setItemAnimator(null);
        this.f42519a.setLayoutAnimation(null);
        this.f42519a.setLayoutManager(new of.y(16));
        this.f42519a.setOnItemClickListener(new qa1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f42520b.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.d;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        sx0 sx0Var = new sx0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.v8.class, org.telegram.ui.Cells.j6.class, org.telegram.ui.Cells.ua.class, org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.q8.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23056g7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23074h7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23386z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.f23369y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, sx0Var, org.telegram.ui.ActionBar.f6.f23179n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42519a, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.f6.U7));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        String str;
        int i11;
        Ringtone ringtone;
        if (i10 == -1 && intent != null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null && (ringtone = RingtoneManager.getRingtone(ApplicationLoader.applicationContext, uri)) != null) {
                if (i9 == 13) {
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42522e, this.f42523f);
            if (i9 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.f42522e, this.f42523f);
            } else if (i9 == 13) {
                if (str != null) {
                    edit.putString("ringtone_" + sharedPrefKey, str);
                    edit.putString("ringtone_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("ringtone_" + sharedPrefKey, "NoSound");
                    edit.putString("ringtone_path_" + sharedPrefKey, "NoSound");
                }
            }
            edit.apply();
            q01 q01Var = this.f42520b;
            if (q01Var != null) {
                if (i9 == 13) {
                    i11 = this.M;
                } else {
                    i11 = this.B;
                }
                q01Var.m(i11);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s01.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.W) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42522e, this.f42523f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f42519a.setPadding(0, 0, 0, i12);
        this.f42519a.setClipToPadding(false);
    }
}
