package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;
public final class yw0 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
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
    public int Z;
    public FrameLayout f52419a;
    public int f52420a0;
    public org.telegram.ui.Components.tj0 f52421b;
    public boolean f52422b0;
    public ww0 f52423c;
    public boolean f52424c0;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.e6 f52425e;
    public final long f52426f;
    public final long h;
    public final boolean f52427n;
    public boolean f52428r;
    public xw0 f52429s;
    public org.telegram.ui.Components.jn f52430w;
    public int f52431x;
    public int f52432y;

    public yw0(Bundle bundle, org.telegram.ui.ActionBar.e6 e6Var) {
        super(bundle);
        this.f52425e = e6Var;
        this.f52426f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.f52427n = bundle.getBoolean("exception", false);
    }

    public static void Z(yw0 yw0Var, String str, int i3, int i10) {
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(yw0Var.currentAccount).f22989d7.edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i3);
        putInt.putInt("smart_delay_" + str, i10).apply();
        ww0 ww0Var = yw0Var.f52423c;
        if (ww0Var != null) {
            ww0Var.g(yw0Var.J);
        }
    }

    public static void a0(final yw0 yw0Var, Context context, String str, View view, int i3) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        org.telegram.ui.ActionBar.e6 e6Var = yw0Var.f52425e;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i3 == yw0Var.Y) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
                String M0 = org.telegram.messenger.bd.M0(2131746112, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131746113, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746128, null), new tw0(yw0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                yw0Var.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                }
            } else if (i3 == yw0Var.H) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", yw0Var.f52426f);
                bundle.putLong("topic_id", yw0Var.h);
                yw0Var.presentFragment(new ph0(bundle, e6Var));
            } else if (i3 == yw0Var.S) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(yw0Var.currentAccount).f22989d7;
                    Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                    if (uri != null) {
                        str2 = uri.getPath();
                    } else {
                        str2 = null;
                    }
                    String string = sharedPreferences.getString("ringtone_path_" + str, str2);
                    if (string != null && !string.equals("NoSound")) {
                        parcelable = string.equals(str2) ? uri : Uri.parse(string);
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", parcelable);
                    yw0Var.startActivityForResult(intent, 13);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            } else if (i3 == yw0Var.I) {
                Activity parentActivity = yw0Var.getParentActivity();
                long j10 = yw0Var.f52426f;
                long j11 = yw0Var.h;
                Runnable runnable = new Runnable(yw0Var) {
                    public final yw0 f50335b;

                    {
                        this.f50335b = yw0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                yw0 yw0Var2 = this.f50335b;
                                ww0 ww0Var = yw0Var2.f52423c;
                                if (ww0Var != null) {
                                    ww0Var.g(yw0Var2.I);
                                    return;
                                }
                                return;
                            case 1:
                                yw0 yw0Var3 = this.f50335b;
                                ww0 ww0Var2 = yw0Var3.f52423c;
                                if (ww0Var2 != null) {
                                    ww0Var2.g(yw0Var3.T);
                                    return;
                                }
                                return;
                            case 2:
                                yw0 yw0Var4 = this.f50335b;
                                ww0 ww0Var3 = yw0Var4.f52423c;
                                if (ww0Var3 != null) {
                                    ww0Var3.g(yw0Var4.K);
                                    return;
                                }
                                return;
                            default:
                                yw0 yw0Var5 = this.f50335b;
                                ww0 ww0Var4 = yw0Var5.f52423c;
                                if (ww0Var4 != null) {
                                    ww0Var4.g(yw0Var5.W);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.e6 e6Var2 = yw0Var.f52425e;
                Pattern pattern = org.telegram.ui.Components.t4.f38241a;
                if (j10 != 0) {
                    str3 = a1.g.p(j10, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                yw0Var.showDialog(org.telegram.ui.Components.t4.X(parentActivity, j10, j11, str3, runnable, e6Var2));
            } else {
                int i10 = 2;
                if (i3 == yw0Var.F) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    boolean z10 = !q8Var.f30234e.h;
                    yw0Var.f52428r = z10;
                    q8Var.setChecked(z10);
                    int childCount = yw0Var.f52421b.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) yw0Var.f52421b.T(yw0Var.f52421b.getChildAt(i11));
                        int i12 = bj0Var.f55544f;
                        View view2 = bj0Var.f55540a;
                        int b10 = bj0Var.b();
                        if (b10 != yw0Var.F && b10 != yw0Var.Y) {
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            if (i12 != 4) {
                                                if (i12 == 7 && b10 == yw0Var.G) {
                                                    ((org.telegram.ui.Cells.q8) view2).e(arrayList, yw0Var.f52428r);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.h6) view2).b(arrayList, yw0Var.f52428r);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.s8) view2).a(arrayList, yw0Var.f52428r);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.y8) view2).c(arrayList, yw0Var.f52428r);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.v9) view2).a(arrayList, yw0Var.f52428r);
                                }
                            } else {
                                ((org.telegram.ui.Cells.n4) view2).a(arrayList, yw0Var.f52428r);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = yw0Var.d;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        yw0Var.d = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        yw0Var.d.addListener(new y20(yw0Var, 23));
                        yw0Var.d.setDuration(150L);
                        yw0Var.d.start();
                    }
                } else if (i3 == yw0Var.G) {
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                    Switch r32 = q8Var2.f30234e;
                    org.telegram.messenger.hp.s1(yw0Var.currentAccount).f22989d7.edit().putBoolean(t4.c.f("content_preview_", str), !r32.h).apply();
                    q8Var2.setChecked(!r32.h);
                } else if (i3 == yw0Var.T) {
                    yw0Var.showDialog(org.telegram.ui.Components.t4.X(yw0Var.getParentActivity(), yw0Var.f52426f, yw0Var.h, t4.c.f("calls_vibrate_", str), new Runnable(yw0Var) {
                        public final yw0 f50335b;

                        {
                            this.f50335b = yw0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    yw0 yw0Var2 = this.f50335b;
                                    ww0 ww0Var = yw0Var2.f52423c;
                                    if (ww0Var != null) {
                                        ww0Var.g(yw0Var2.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    yw0 yw0Var3 = this.f50335b;
                                    ww0 ww0Var2 = yw0Var3.f52423c;
                                    if (ww0Var2 != null) {
                                        ww0Var2.g(yw0Var3.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    yw0 yw0Var4 = this.f50335b;
                                    ww0 ww0Var3 = yw0Var4.f52423c;
                                    if (ww0Var3 != null) {
                                        ww0Var3.g(yw0Var4.K);
                                        return;
                                    }
                                    return;
                                default:
                                    yw0 yw0Var5 = this.f50335b;
                                    ww0 ww0Var4 = yw0Var5.f52423c;
                                    if (ww0Var4 != null) {
                                        ww0Var4.g(yw0Var5.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, yw0Var.f52425e));
                } else if (i3 == yw0Var.K) {
                    yw0Var.showDialog(org.telegram.ui.Components.t4.H(yw0Var.getParentActivity(), yw0Var.f52426f, yw0Var.h, -1, new Runnable(yw0Var) {
                        public final yw0 f50335b;

                        {
                            this.f50335b = yw0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    yw0 yw0Var2 = this.f50335b;
                                    ww0 ww0Var = yw0Var2.f52423c;
                                    if (ww0Var != null) {
                                        ww0Var.g(yw0Var2.I);
                                        return;
                                    }
                                    return;
                                case 1:
                                    yw0 yw0Var3 = this.f50335b;
                                    ww0 ww0Var2 = yw0Var3.f52423c;
                                    if (ww0Var2 != null) {
                                        ww0Var2.g(yw0Var3.T);
                                        return;
                                    }
                                    return;
                                case 2:
                                    yw0 yw0Var4 = this.f50335b;
                                    ww0 ww0Var3 = yw0Var4.f52423c;
                                    if (ww0Var3 != null) {
                                        ww0Var3.g(yw0Var4.K);
                                        return;
                                    }
                                    return;
                                default:
                                    yw0 yw0Var5 = this.f50335b;
                                    ww0 ww0Var4 = yw0Var5.f52423c;
                                    if (ww0Var4 != null) {
                                        ww0Var4.g(yw0Var5.W);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, yw0Var.f52425e));
                } else if (i3 == yw0Var.J) {
                    if (yw0Var.getParentActivity() != null) {
                        SharedPreferences sharedPreferences2 = org.telegram.messenger.hp.s1(yw0Var.currentAccount).f22989d7;
                        int c2 = org.telegram.messenger.k5.c("smart_max_count_", str, sharedPreferences2, 2);
                        int c10 = org.telegram.messenger.k5.c("smart_delay_", str, sharedPreferences2, 180);
                        if (c2 != 0) {
                            i10 = c2;
                        }
                        Activity parentActivity2 = yw0Var.getParentActivity();
                        tw0 tw0Var = new tw0(yw0Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.t4.f38241a;
                        if (parentActivity2 != null) {
                            int i13 = org.telegram.ui.ActionBar.k6.f27988j5;
                            if (e6Var != null) {
                                x02 = e6Var.f(i13);
                            } else {
                                x02 = org.telegram.ui.ActionBar.k6.x0(null, i13, false);
                            }
                            int i14 = org.telegram.ui.ActionBar.k6.f27954h5;
                            if (e6Var != null) {
                                x03 = e6Var.f(i14);
                            } else {
                                x03 = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.k6.xj;
                            if (e6Var != null) {
                                e6Var.f(i15);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.k6.Bj;
                            if (e6Var != null) {
                                e6Var.f(i16);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.k6.E8;
                            if (e6Var != null) {
                                e6Var.f(i17);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.k6.G8;
                            if (e6Var != null) {
                                e6Var.f(i18);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.k6.f27972i6;
                            if (e6Var != null) {
                                e6Var.f(i19);
                            } else {
                                org.telegram.ui.ActionBar.k6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.k6.Gi;
                            if (e6Var != null) {
                                x04 = e6Var.f(i20);
                            } else {
                                x04 = org.telegram.ui.ActionBar.k6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.k6.Ci;
                            if (e6Var != null) {
                                x05 = e6Var.f(i21);
                            } else {
                                x05 = org.telegram.ui.ActionBar.k6.x0(null, i21, false);
                            }
                            int i22 = x05;
                            int i23 = org.telegram.ui.ActionBar.k6.Ei;
                            if (e6Var != null) {
                                x06 = e6Var.f(i23);
                            } else {
                                x06 = org.telegram.ui.ActionBar.k6.x0(null, i23, false);
                            }
                            int i24 = x06;
                            hi.d dVar = new hi.d(parentActivity2, e6Var);
                            ((org.telegram.ui.ActionBar.t2) dVar.f14429b).f28621w0 = false;
                            org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(parentActivity2, e6Var);
                            cb0Var.setMinValue(0);
                            cb0Var.setMaxValue(10);
                            cb0Var.setTextColor(x02);
                            cb0Var.setValue(i10 - 1);
                            cb0Var.setWrapSelectorWheel(false);
                            cb0Var.setFormatter(new org.telegram.ui.Components.c(17));
                            org.telegram.ui.Components.cb0 cb0Var2 = new org.telegram.ui.Components.cb0(parentActivity2, e6Var);
                            cb0Var2.setMinValue(0);
                            cb0Var2.setMaxValue(10);
                            cb0Var2.setTextColor(x02);
                            cb0Var2.setValue((c10 / 60) - 1);
                            cb0Var2.setWrapSelectorWheel(false);
                            cb0Var2.setFormatter(new org.telegram.ui.Components.c(18));
                            org.telegram.ui.Components.cb0 cb0Var3 = new org.telegram.ui.Components.cb0(parentActivity2, e6Var);
                            cb0Var3.setMinValue(0);
                            cb0Var3.setMaxValue(0);
                            cb0Var3.setTextColor(x02);
                            cb0Var3.setValue(0);
                            cb0Var3.setWrapSelectorWheel(false);
                            cb0Var3.setFormatter(new org.telegram.ui.Components.c(19));
                            int i25 = x04;
                            org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(parentActivity2, cb0Var, cb0Var2, cb0Var3, 5);
                            n3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            n3Var.addView(frameLayout, b8.mf.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(org.telegram.messenger.bd.M0(2131748128, null));
                            textView2.setTextColor(x02);
                            k2.p1.t(textView2, 1, 20.0f);
                            frameLayout.addView(textView2, b8.mf.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new fi.a(10));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            n3Var.addView(linearLayout, b8.mf.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ci.ec ecVar = new ci.ec(parentActivity2, 18);
                            linearLayout.addView(cb0Var, b8.mf.l(0.4f, 0, 270));
                            linearLayout.addView(cb0Var3, b8.mf.p(0, -2, 0.2f, 16));
                            linearLayout.addView(cb0Var2, b8.mf.l(0.4f, 0, 270));
                            ecVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                            ecVar.setGravity(17);
                            ecVar.setTextColor(i25);
                            ecVar.setTextSize(1, 14.0f);
                            ecVar.setTypeface(org.telegram.messenger.g0.o());
                            int L = org.telegram.messenger.g0.L(8.0f);
                            ecVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, i22, i24, i24));
                            ecVar.setText(org.telegram.messenger.bd.M0(2131753866, null));
                            n3Var.addView(ecVar, b8.mf.t(-1, 48, 83, 16, 15, 16, 16));
                            org.telegram.ui.Components.c cVar = new org.telegram.ui.Components.c(3);
                            cb0Var.setOnValueChangedListener(cVar);
                            cb0Var2.setOnValueChangedListener(cVar);
                            ecVar.setOnClickListener(new ai.r4(cb0Var, cb0Var2, tw0Var, dVar, 8));
                            org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.f14429b;
                            t2Var.O = n3Var;
                            t2Var.show();
                            t2Var.v0(x03);
                            t2Var.O(x03);
                        }
                    }
                } else if (i3 == yw0Var.W) {
                    if (yw0Var.getParentActivity() != null) {
                        yw0Var.showDialog(org.telegram.ui.Components.t4.t(yw0Var.getParentActivity(), yw0Var.f52426f, yw0Var.h, -1, new Runnable(yw0Var) {
                            public final yw0 f50335b;

                            {
                                this.f50335b = yw0Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        yw0 yw0Var2 = this.f50335b;
                                        ww0 ww0Var = yw0Var2.f52423c;
                                        if (ww0Var != null) {
                                            ww0Var.g(yw0Var2.I);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        yw0 yw0Var3 = this.f50335b;
                                        ww0 ww0Var2 = yw0Var3.f52423c;
                                        if (ww0Var2 != null) {
                                            ww0Var2.g(yw0Var3.T);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        yw0 yw0Var4 = this.f50335b;
                                        ww0 ww0Var3 = yw0Var4.f52423c;
                                        if (ww0Var3 != null) {
                                            ww0Var3.g(yw0Var4.K);
                                            return;
                                        }
                                        return;
                                    default:
                                        yw0 yw0Var5 = this.f50335b;
                                        ww0 ww0Var4 = yw0Var5.f52423c;
                                        if (ww0Var4 != null) {
                                            ww0Var4.g(yw0Var5.W);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, yw0Var.f52425e));
                    }
                } else if (i3 == yw0Var.N) {
                    org.telegram.messenger.hp.s1(yw0Var.currentAccount).f22989d7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.h6) view).a(true, true);
                    View findViewWithTag = yw0Var.f52421b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.h6) findViewWithTag).a(false, true);
                    }
                } else if (i3 == yw0Var.O) {
                    org.telegram.messenger.hp.s1(yw0Var.currentAccount).f22989d7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.h6) view).a(true, true);
                    View findViewWithTag2 = yw0Var.f52421b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.h6) findViewWithTag2).a(false, true);
                    }
                } else if (i3 == yw0Var.Q) {
                    org.telegram.ui.Cells.q8 q8Var3 = (org.telegram.ui.Cells.q8) view;
                    boolean z11 = q8Var3.f30234e.h;
                    boolean z12 = !z11;
                    q8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(yw0Var.currentAccount).f22989d7.edit();
                    if (yw0Var.f52422b0 && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    yw0Var.getNotificationsController().c0(yw0Var.f52426f, yw0Var.h, true);
                }
            }
        }
    }

    public static void b0(yw0 yw0Var, String str) {
        yw0Var.f52424c0 = true;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(yw0Var.currentAccount).f22989d7.edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        yw0Var.finishFragment();
        xw0 xw0Var = yw0Var.f52429s;
        if (xw0Var != null) {
            xw0Var.a0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        long j10 = this.f52426f;
        long j11 = this.h;
        String v = org.telegram.messenger.us.v(j10, j11, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new vw0(this, v));
        org.telegram.ui.ActionBar.e6 e6Var = this.f52425e;
        org.telegram.ui.Components.jn jnVar = new org.telegram.ui.Components.jn(context, null, false, e6Var);
        this.f52430w = jnVar;
        jnVar.setOccupyStatusBar(!org.telegram.messenger.g0.Q1());
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f23102q7.f(-j10, j11);
                rg.c.p(this.f52430w.getAvatarImageView(), f10, false, true, e6Var);
                this.simpleActionBar.setTitle(f10.title);
            } else {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
                this.f52430w.setChatAvatar(M0);
                this.simpleActionBar.setTitle(M0.title);
            }
        } else {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
            if (a22 != null) {
                this.f52430w.setUserAvatar(a22);
                this.simpleActionBar.setTitle(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
            }
        }
        if (this.f52427n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.bd.M0(2131747903, null));
            this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.bd.M0(2131751685, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f52421b = tj0Var;
        tj0Var.r1();
        this.f52421b.setSectionsDrawBackground(true);
        frameLayout.addView(this.f52421b, b8.mf.c(-1.0f, -1));
        org.telegram.ui.Components.tj0 tj0Var2 = this.f52421b;
        ww0 ww0Var = new ww0(this, context);
        this.f52423c = ww0Var;
        tj0Var2.setAdapter(ww0Var);
        this.f52421b.setItemAnimator(null);
        this.f52421b.setLayoutAnimation(null);
        this.f52421b.setLayoutManager(new kg.y(17));
        this.f52421b.setOnItemClickListener(new p51(this, context, v, 1));
        this.f52419a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23225f0) {
            try {
                this.f52423c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f52421b;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f52425e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52421b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52421b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52421b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28273y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52421b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28062n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        int i11;
        Ringtone ringtone;
        if (i10 == -1 && intent != null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            String str = null;
            if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.t0.f25457b, uri)) != null) {
                if (i3 == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = org.telegram.messenger.bd.M0(2131751600, null);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.bd.M0(2131745290, null);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.currentAccount).f22989d7.edit();
            String v = org.telegram.messenger.us.v(this.f52426f, this.h, false);
            if (i3 == 12) {
                if (str != null) {
                    edit.putString("sound_" + v, str);
                    edit.putString("sound_path_" + v, uri.toString());
                } else {
                    edit.putString("sound_" + v, "NoSound");
                    edit.putString("sound_path_" + v, "NoSound");
                }
                getNotificationsController().l(this.f52426f, this.h);
            } else if (i3 == 13) {
                if (str != null) {
                    edit.putString("ringtone_" + v, str);
                    edit.putString("ringtone_path_" + v, uri.toString());
                } else {
                    edit.putString("ringtone_" + v, "NoSound");
                    edit.putString("ringtone_path_" + v, "NoSound");
                }
            }
            edit.apply();
            ww0 ww0Var = this.f52423c;
            if (ww0Var != null) {
                if (i3 == 13) {
                    i11 = this.S;
                } else {
                    i11 = this.H;
                }
                ww0Var.g(i11);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yw0.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f52424c0) {
            String v = org.telegram.messenger.us.v(this.f52426f, this.h, false);
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(this.currentAccount).f22989d7.edit();
            edit.putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.f23225f0);
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        super.onInsets(i3, i10, i11, i12);
        org.telegram.messenger.g0.B3(this.f52430w.f35127e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f14496b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        org.telegram.messenger.g0.E2(this.f52430w.f35127e);
        if (!this.f52427n) {
            this.f52419a.addView(this.f52430w.f35127e, b8.mf.e(42, 42, 53));
        }
        org.telegram.messenger.g0.B3(this.f52430w.f35127e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f14496b, org.telegram.messenger.g0.L(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
