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
public final class y11 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.Components.ll0 f42950a;
    public boolean f42951a0;
    public w11 f42952b;
    public AnimatorSet f42953c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long f42954e;
    public final long f42955f;
    public final boolean h;
    public boolean f42956n;
    public x11 f42957r;
    public org.telegram.ui.Components.co f42958s;
    public int v;
    public int f42959w;
    public int f42960x;
    public int f42961y;

    public y11(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.d = f6Var;
        this.f42954e = bundle.getLong("dialog_id");
        this.f42955f = bundle.getLong("topic_id");
        this.h = bundle.getBoolean("exception", false);
    }

    public static void U(y11 y11Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(y11Var.currentAccount).edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        w11 w11Var = y11Var.f42952b;
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
        long j3 = y11Var.f42955f;
        long j10 = y11Var.f42954e;
        org.telegram.ui.ActionBar.f6 f6Var = y11Var.d;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == y11Var.W) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                String string = LocaleController.getString(R.string.ResetCustomNotificationsAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ResetCustomNotificationsAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new t11(y11Var, str));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                y11Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
                }
            } else if (i10 == y11Var.F) {
                Bundle e7 = w.f.e(j10, "dialog_id");
                e7.putLong("topic_id", j3);
                y11Var.presentFragment(new bl0(e7, f6Var));
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            } else if (i10 == y11Var.G) {
                Activity parentActivity = y11Var.getParentActivity();
                long j11 = y11Var.f42954e;
                long j12 = y11Var.f42955f;
                Runnable runnable = new Runnable(y11Var) {
                    public final y11 f40894b;

                    {
                        this.f40894b = y11Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                y11 y11Var2 = this.f40894b;
                                w11 w11Var = y11Var2.f42952b;
                                if (w11Var != null) {
                                    w11Var.m(y11Var2.G);
                                    return;
                                }
                                return;
                            case 1:
                                y11 y11Var3 = this.f40894b;
                                w11 w11Var2 = y11Var3.f42952b;
                                if (w11Var2 != null) {
                                    w11Var2.m(y11Var3.R);
                                    return;
                                }
                                return;
                            case 2:
                                y11 y11Var4 = this.f40894b;
                                w11 w11Var3 = y11Var4.f42952b;
                                if (w11Var3 != null) {
                                    w11Var3.m(y11Var4.I);
                                    return;
                                }
                                return;
                            default:
                                y11 y11Var5 = this.f40894b;
                                w11 w11Var4 = y11Var5.f42952b;
                                if (w11Var4 != null) {
                                    w11Var4.m(y11Var5.U);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.f6 f6Var2 = y11Var.d;
                Pattern pattern = org.telegram.ui.Components.e5.f25557a;
                if (j11 != 0) {
                    str3 = a4.a.o(j11, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                y11Var.showDialog(org.telegram.ui.Components.e5.Y(parentActivity, j11, j12, str3, runnable, f6Var2));
            } else {
                int i11 = 2;
                if (i10 == y11Var.f42961y) {
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    boolean z10 = !w8Var.f23490e.h;
                    y11Var.f42956n = z10;
                    w8Var.setChecked(z10);
                    int childCount = y11Var.f42950a.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) y11Var.f42950a.T(y11Var.f42950a.getChildAt(i12));
                        int i13 = vk0Var.f45742f;
                        View view2 = vk0Var.f45738a;
                        int b10 = vk0Var.b();
                        if (b10 != y11Var.f42961y && b10 != y11Var.W) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == y11Var.E) {
                                                    ((org.telegram.ui.Cells.w8) view2).e(arrayList, y11Var.f42956n);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.j6) view2).b(arrayList, y11Var.f42956n);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.y8) view2).a(arrayList, y11Var.f42956n);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.e9) view2).c(arrayList, y11Var.f42956n);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.ea) view2).a(arrayList, y11Var.f42956n);
                                }
                            } else {
                                ((org.telegram.ui.Cells.l4) view2).a(arrayList, y11Var.f42956n);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = y11Var.f42953c;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        y11Var.f42953c = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        y11Var.f42953c.addListener(new gk0(y11Var, 18));
                        y11Var.f42953c.setDuration(150L);
                        y11Var.f42953c.start();
                    }
                } else if (i10 == y11Var.E) {
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    Switch r32 = w8Var2.f23490e;
                    MessagesController.getNotificationsSettings(y11Var.currentAccount).edit().putBoolean(org.telegram.ui.Cells.p6.i("content_preview_", str), !r32.h).apply();
                    w8Var2.setChecked(!r32.h);
                } else if (i10 == y11Var.R) {
                    y11Var.showDialog(org.telegram.ui.Components.e5.Y(y11Var.getParentActivity(), y11Var.f42954e, y11Var.f42955f, org.telegram.ui.Cells.p6.i("calls_vibrate_", str), new Runnable(y11Var) {
                        public final y11 f40894b;

                        {
                            this.f40894b = y11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    y11 y11Var2 = this.f40894b;
                                    w11 w11Var = y11Var2.f42952b;
                                    if (w11Var != null) {
                                        w11Var.m(y11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    y11 y11Var3 = this.f40894b;
                                    w11 w11Var2 = y11Var3.f42952b;
                                    if (w11Var2 != null) {
                                        w11Var2.m(y11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    y11 y11Var4 = this.f40894b;
                                    w11 w11Var3 = y11Var4.f42952b;
                                    if (w11Var3 != null) {
                                        w11Var3.m(y11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    y11 y11Var5 = this.f40894b;
                                    w11 w11Var4 = y11Var5.f42952b;
                                    if (w11Var4 != null) {
                                        w11Var4.m(y11Var5.U);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, y11Var.d));
                } else if (i10 == y11Var.I) {
                    y11Var.showDialog(org.telegram.ui.Components.e5.I(y11Var.getParentActivity(), y11Var.f42954e, y11Var.f42955f, -1, new Runnable(y11Var) {
                        public final y11 f40894b;

                        {
                            this.f40894b = y11Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    y11 y11Var2 = this.f40894b;
                                    w11 w11Var = y11Var2.f42952b;
                                    if (w11Var != null) {
                                        w11Var.m(y11Var2.G);
                                        return;
                                    }
                                    return;
                                case 1:
                                    y11 y11Var3 = this.f40894b;
                                    w11 w11Var2 = y11Var3.f42952b;
                                    if (w11Var2 != null) {
                                        w11Var2.m(y11Var3.R);
                                        return;
                                    }
                                    return;
                                case 2:
                                    y11 y11Var4 = this.f40894b;
                                    w11 w11Var3 = y11Var4.f42952b;
                                    if (w11Var3 != null) {
                                        w11Var3.m(y11Var4.I);
                                        return;
                                    }
                                    return;
                                default:
                                    y11 y11Var5 = this.f40894b;
                                    w11 w11Var4 = y11Var5.f42952b;
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
                        Pattern pattern2 = org.telegram.ui.Components.e5.f25557a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.j6.f20770j5;
                            if (f6Var != null) {
                                w02 = f6Var.h0(i14);
                            } else {
                                w02 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.j6.f20734h5;
                            if (f6Var != null) {
                                w03 = f6Var.h0(i15);
                            } else {
                                w03 = org.telegram.ui.ActionBar.j6.w0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.j6.Ji;
                            if (f6Var != null) {
                                f6Var.h0(i16);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.j6.Ni;
                            if (f6Var != null) {
                                f6Var.h0(i17);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.j6.E8;
                            if (f6Var != null) {
                                f6Var.h0(i18);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.j6.G8;
                            if (f6Var != null) {
                                f6Var.h0(i19);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.j6.f20753i6;
                            if (f6Var != null) {
                                f6Var.h0(i20);
                            } else {
                                org.telegram.ui.ActionBar.j6.w0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.j6.Sh;
                            if (f6Var != null) {
                                w04 = f6Var.h0(i21);
                            } else {
                                w04 = org.telegram.ui.ActionBar.j6.w0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.j6.Oh;
                            if (f6Var != null) {
                                w05 = f6Var.h0(i22);
                            } else {
                                w05 = org.telegram.ui.ActionBar.j6.w0(null, i22, false);
                            }
                            int i23 = w05;
                            int i24 = org.telegram.ui.ActionBar.j6.Qh;
                            if (f6Var != null) {
                                w06 = f6Var.h0(i24);
                            } else {
                                w06 = org.telegram.ui.ActionBar.j6.w0(null, i24, false);
                            }
                            int i25 = w06;
                            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(parentActivity2, f6Var);
                            a3Var.a();
                            ?? vc0Var = new org.telegram.ui.Components.vc0(parentActivity2, f6Var);
                            vc0Var.setMinValue(0);
                            vc0Var.setMaxValue(10);
                            vc0Var.setTextColor(w02);
                            vc0Var.setValue(i11 - 1);
                            vc0Var.setWrapSelectorWheel(false);
                            vc0Var.setFormatter(new org.telegram.ui.Components.f(16));
                            ?? vc0Var2 = new org.telegram.ui.Components.vc0(parentActivity2, f6Var);
                            vc0Var2.setMinValue(0);
                            vc0Var2.setMaxValue(10);
                            vc0Var2.setTextColor(w02);
                            vc0Var2.setValue((c11 / 60) - 1);
                            vc0Var2.setWrapSelectorWheel(false);
                            vc0Var2.setFormatter(new org.telegram.ui.Components.f(17));
                            org.telegram.ui.Components.vc0 vc0Var3 = new org.telegram.ui.Components.vc0(parentActivity2, f6Var);
                            vc0Var3.setMinValue(0);
                            vc0Var3.setMaxValue(0);
                            vc0Var3.setTextColor(w02);
                            vc0Var3.setValue(0);
                            vc0Var3.setWrapSelectorWheel(false);
                            vc0Var3.setFormatter(new org.telegram.ui.Components.f(18));
                            org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(parentActivity2, vc0Var, vc0Var2, vc0Var3);
                            w3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            w3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(LocaleController.getString(R.string.NotfificationsFrequencyTitle));
                            textView2.setTextColor(w02);
                            textView2.setTextSize(1, 20.0f);
                            textView2.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView2, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new ci.d(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            w3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            bi.c4 c4Var = new bi.c4(parentActivity2, 18);
                            linearLayout.addView((View) vc0Var, w7.x5.l(0.4f, 0, 270));
                            linearLayout.addView(vc0Var3, w7.x5.o(0, -2, 0.2f, 16));
                            linearLayout.addView((View) vc0Var2, w7.x5.l(0.4f, 0, 270));
                            c4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                            c4Var.setGravity(17);
                            c4Var.setTextColor(w04);
                            c4Var.setTextSize(1, 14.0f);
                            c4Var.setTypeface(AndroidUtilities.bold());
                            int dp = AndroidUtilities.dp(8.0f);
                            c4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, i23, i25, i25));
                            c4Var.setText(LocaleController.getString(R.string.AutoDeleteConfirm));
                            w3Var.addView(c4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                            org.telegram.ui.Components.f fVar = new org.telegram.ui.Components.f(5);
                            vc0Var.setOnValueChangedListener(fVar);
                            vc0Var2.setOnValueChangedListener(fVar);
                            c4Var.setOnClickListener(new bi.z4((Object) vc0Var, (Object) vc0Var2, t11Var, a3Var, 7));
                            a3Var.b(w3Var);
                            org.telegram.ui.ActionBar.f3 f3Var = a3Var.f20204a;
                            f3Var.show();
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                        }
                    }
                } else if (i10 == y11Var.U) {
                    if (y11Var.getParentActivity() != null) {
                        y11Var.showDialog(org.telegram.ui.Components.e5.u(y11Var.getParentActivity(), y11Var.f42954e, y11Var.f42955f, -1, new Runnable(y11Var) {
                            public final y11 f40894b;

                            {
                                this.f40894b = y11Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        y11 y11Var2 = this.f40894b;
                                        w11 w11Var = y11Var2.f42952b;
                                        if (w11Var != null) {
                                            w11Var.m(y11Var2.G);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        y11 y11Var3 = this.f40894b;
                                        w11 w11Var2 = y11Var3.f42952b;
                                        if (w11Var2 != null) {
                                            w11Var2.m(y11Var3.R);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        y11 y11Var4 = this.f40894b;
                                        w11 w11Var3 = y11Var4.f42952b;
                                        if (w11Var3 != null) {
                                            w11Var3.m(y11Var4.I);
                                            return;
                                        }
                                        return;
                                    default:
                                        y11 y11Var5 = this.f40894b;
                                        w11 w11Var4 = y11Var5.f42952b;
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
                    View findViewWithTag = y11Var.f42950a.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == y11Var.M) {
                    MessagesController.getNotificationsSettings(y11Var.currentAccount).edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.j6) view).a(true, true);
                    View findViewWithTag2 = y11Var.f42950a.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.j6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == y11Var.O) {
                    org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                    boolean z11 = w8Var3.f23490e.h;
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
        y11Var.f42951a0 = true;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(y11Var.currentAccount).edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        y11Var.finishFragment();
        x11 x11Var = y11Var.f42957r;
        if (x11Var != null) {
            x11Var.b0();
        }
    }

    @Override
    public final View createView(Context context) {
        float f7;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20701f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        kVar.B(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20992v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        long j3 = this.f42954e;
        long j10 = this.f42955f;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, j10);
        this.actionBar.setActionBarMenuOnItemClick(new v11(this, sharedPrefKey));
        org.telegram.ui.Components.co coVar = new org.telegram.ui.Components.co(context, null, false, f6Var);
        this.f42958s = coVar;
        coVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.co coVar2 = this.f42958s;
        if (!this.inPreviewMode) {
            f7 = 56.0f;
        } else {
            f7 = 0.0f;
        }
        kVar2.addView(coVar2, 0, w7.x5.d(-2, -1.0f, 51, f7, 0.0f, 40.0f, 0.0f));
        this.actionBar.setAllowOverlayTitle(false);
        if (j3 < 0) {
            if (j10 != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-j3, j10);
                og.d.p(this.f42958s.getAvatarImageView(), findTopic, false, true, f6Var);
                this.f42958s.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j3));
                this.f42958s.setChatAvatar(chat);
                this.f42958s.setTitle(chat.title);
            }
        } else {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                this.f42958s.setUserAvatar(user);
                this.f42958s.setTitle(ContactsController.formatName(user.first_name, user.last_name));
            }
        }
        if (this.h) {
            this.f42958s.setSubtitle(LocaleController.getString(R.string.NotificationsNewException));
            this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        } else {
            this.f42958s.setSubtitle(LocaleController.getString(R.string.CustomNotifications));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20607a7, f6Var));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f42950a = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f42950a);
        frameLayout.addView(this.f42950a, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.ll0 ll0Var2 = this.f42950a;
        w11 w11Var = new w11(this, context);
        this.f42952b = w11Var;
        ll0Var2.setAdapter(w11Var);
        this.f42950a.setItemAnimator(null);
        this.f42950a.setLayoutAnimation(null);
        this.f42950a.setLayoutManager(new hg.b0(17));
        this.f42950a.setOnItemClickListener(new zb1(this, context, sharedPrefKey, 1));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            try {
                this.f42952b.l();
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
        xy0 xy0Var = new xy0(1, this);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 16, new Class[]{org.telegram.ui.Cells.l4.class, org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.j6.class, org.telegram.ui.Cells.ya.class, org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20663d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20607a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20937s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20719g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20736h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21061z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusColor"}, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.f21042y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, new String[]{"statusOnlineColor"}, null, null, -1, xy0Var, org.telegram.ui.ActionBar.j6.f20846n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f42950a, 0, new Class[]{org.telegram.ui.Cells.ya.class}, null, org.telegram.ui.ActionBar.j6.f20910r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, xy0Var, org.telegram.ui.ActionBar.j6.U7));
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
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42954e, this.f42955f);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + sharedPrefKey, str);
                    edit.putString("sound_path_" + sharedPrefKey, uri.toString());
                } else {
                    edit.putString("sound_" + sharedPrefKey, "NoSound");
                    edit.putString("sound_path_" + sharedPrefKey, "NoSound");
                }
                getNotificationsController().deleteNotificationChannel(this.f42954e, this.f42955f);
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
            w11 w11Var = this.f42952b;
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
        if (!this.f42951a0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42954e, this.f42955f);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("custom_" + sharedPrefKey, true).apply();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f42950a.setPadding(0, 0, 0, i13);
        this.f42950a.setClipToPadding(false);
    }
}
