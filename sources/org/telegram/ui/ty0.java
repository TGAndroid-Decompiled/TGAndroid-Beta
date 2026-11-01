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
public final class ty0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
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
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public FrameLayout f41741a;
    public boolean f41742a0;
    public org.telegram.ui.Components.uk0 f41743b;
    public boolean f41744b0;
    public ry0 f41745c;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final long f41746f;
    public final long h;
    public final boolean f41747n;
    public boolean f41748r;
    public sy0 f41749s;
    public org.telegram.ui.Components.sn f41750w;
    public int f41751x;
    public int f41752y;

    public ty0(Bundle bundle, org.telegram.ui.ActionBar.p6 p6Var) {
        super(bundle);
        this.e = p6Var;
        this.f41746f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.f41747n = bundle.getBoolean("exception", false);
    }

    public static void Z(ty0 ty0Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        ry0 ry0Var = ty0Var.f41745c;
        if (ry0Var != null) {
            ry0Var.g(ty0Var.I);
        }
    }

    public static void a0(final ty0 ty0Var, Context context, String str, View view, int i10) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        org.telegram.ui.ActionBar.p6 p6Var = ty0Var.e;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == ty0Var.X) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                String L0 = org.telegram.messenger.dd.L0(2131746119, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.L0(2131746120, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746135, null), new oy0(ty0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                ty0Var.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                }
            } else if (i10 == ty0Var.G) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ty0Var.f41746f);
                bundle.putLong("topic_id", ty0Var.h);
                ty0Var.presentFragment(new wi0(bundle, p6Var));
            } else if (i10 == ty0Var.R) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7;
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
                    ty0Var.startActivityForResult(intent, 13);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            } else if (i10 == ty0Var.H) {
                Activity parentActivity = ty0Var.getParentActivity();
                long j10 = ty0Var.f41746f;
                long j11 = ty0Var.h;
                Runnable runnable = new Runnable(ty0Var) {
                    public final ty0 f40638b;

                    {
                        this.f40638b = ty0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                ty0 ty0Var2 = this.f40638b;
                                ry0 ry0Var = ty0Var2.f41745c;
                                if (ry0Var != null) {
                                    ry0Var.g(ty0Var2.H);
                                    return;
                                }
                                return;
                            case 1:
                                ty0 ty0Var3 = this.f40638b;
                                ry0 ry0Var2 = ty0Var3.f41745c;
                                if (ry0Var2 != null) {
                                    ry0Var2.g(ty0Var3.S);
                                    return;
                                }
                                return;
                            case 2:
                                ty0 ty0Var4 = this.f40638b;
                                ry0 ry0Var3 = ty0Var4.f41745c;
                                if (ry0Var3 != null) {
                                    ry0Var3.g(ty0Var4.J);
                                    return;
                                }
                                return;
                            default:
                                ty0 ty0Var5 = this.f40638b;
                                ry0 ry0Var4 = ty0Var5.f41745c;
                                if (ry0Var4 != null) {
                                    ry0Var4.g(ty0Var5.V);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.p6 p6Var2 = ty0Var.e;
                Pattern pattern = org.telegram.ui.Components.s4.f30174a;
                if (j10 != 0) {
                    str3 = a1.g.l(j10, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                ty0Var.showDialog(org.telegram.ui.Components.s4.X(parentActivity, j10, j11, str3, runnable, p6Var2));
            } else {
                int i11 = 2;
                if (i10 == ty0Var.E) {
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    boolean z10 = !t8Var.e.h;
                    ty0Var.f41748r = z10;
                    t8Var.setChecked(z10);
                    int childCount = ty0Var.f41743b.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.dk0 dk0Var = (org.telegram.ui.Components.dk0) ty0Var.f41743b.T(ty0Var.f41743b.getChildAt(i12));
                        int i13 = dk0Var.f47912f;
                        View view2 = dk0Var.f47909a;
                        int b10 = dk0Var.b();
                        if (b10 != ty0Var.E && b10 != ty0Var.X) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == ty0Var.F) {
                                                    ((org.telegram.ui.Cells.t8) view2).e(arrayList, ty0Var.f41748r);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.m6) view2).b(arrayList, ty0Var.f41748r);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.v8) view2).a(arrayList, ty0Var.f41748r);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.b9) view2).c(arrayList, ty0Var.f41748r);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.x9) view2).a(arrayList, ty0Var.f41748r);
                                }
                            } else {
                                ((org.telegram.ui.Cells.p4) view2).a(arrayList, ty0Var.f41748r);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = ty0Var.d;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ty0Var.d = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        ty0Var.d.addListener(new ms0(ty0Var, 4));
                        ty0Var.d.setDuration(150L);
                        ty0Var.d.start();
                    }
                } else if (i10 == ty0Var.F) {
                    org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
                    Switch r32 = t8Var2.e;
                    org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit().putBoolean(sc.e.h("content_preview_", str), !r32.h).apply();
                    t8Var2.setChecked(!r32.h);
                } else if (i10 == ty0Var.S) {
                    ty0Var.showDialog(org.telegram.ui.Components.s4.X(ty0Var.getParentActivity(), ty0Var.f41746f, ty0Var.h, sc.e.h("calls_vibrate_", str), new Runnable(ty0Var) {
                        public final ty0 f40638b;

                        {
                            this.f40638b = ty0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ty0 ty0Var2 = this.f40638b;
                                    ry0 ry0Var = ty0Var2.f41745c;
                                    if (ry0Var != null) {
                                        ry0Var.g(ty0Var2.H);
                                        return;
                                    }
                                    return;
                                case 1:
                                    ty0 ty0Var3 = this.f40638b;
                                    ry0 ry0Var2 = ty0Var3.f41745c;
                                    if (ry0Var2 != null) {
                                        ry0Var2.g(ty0Var3.S);
                                        return;
                                    }
                                    return;
                                case 2:
                                    ty0 ty0Var4 = this.f40638b;
                                    ry0 ry0Var3 = ty0Var4.f41745c;
                                    if (ry0Var3 != null) {
                                        ry0Var3.g(ty0Var4.J);
                                        return;
                                    }
                                    return;
                                default:
                                    ty0 ty0Var5 = this.f40638b;
                                    ry0 ry0Var4 = ty0Var5.f41745c;
                                    if (ry0Var4 != null) {
                                        ry0Var4.g(ty0Var5.V);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, ty0Var.e));
                } else if (i10 == ty0Var.J) {
                    ty0Var.showDialog(org.telegram.ui.Components.s4.H(ty0Var.getParentActivity(), ty0Var.f41746f, ty0Var.h, -1, new Runnable(ty0Var) {
                        public final ty0 f40638b;

                        {
                            this.f40638b = ty0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    ty0 ty0Var2 = this.f40638b;
                                    ry0 ry0Var = ty0Var2.f41745c;
                                    if (ry0Var != null) {
                                        ry0Var.g(ty0Var2.H);
                                        return;
                                    }
                                    return;
                                case 1:
                                    ty0 ty0Var3 = this.f40638b;
                                    ry0 ry0Var2 = ty0Var3.f41745c;
                                    if (ry0Var2 != null) {
                                        ry0Var2.g(ty0Var3.S);
                                        return;
                                    }
                                    return;
                                case 2:
                                    ty0 ty0Var4 = this.f40638b;
                                    ry0 ry0Var3 = ty0Var4.f41745c;
                                    if (ry0Var3 != null) {
                                        ry0Var3.g(ty0Var4.J);
                                        return;
                                    }
                                    return;
                                default:
                                    ty0 ty0Var5 = this.f40638b;
                                    ry0 ry0Var4 = ty0Var5.f41745c;
                                    if (ry0Var4 != null) {
                                        ry0Var4.g(ty0Var5.V);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, ty0Var.e));
                } else if (i10 == ty0Var.I) {
                    if (ty0Var.getParentActivity() != null) {
                        SharedPreferences sharedPreferences2 = org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7;
                        int c10 = org.telegram.messenger.m5.c("smart_max_count_", str, sharedPreferences2, 2);
                        int c11 = org.telegram.messenger.m5.c("smart_delay_", str, sharedPreferences2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = ty0Var.getParentActivity();
                        oy0 oy0Var = new oy0(ty0Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.s4.f30174a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.t6.f21038j5;
                            if (p6Var != null) {
                                x02 = p6Var.f(i14);
                            } else {
                                x02 = org.telegram.ui.ActionBar.t6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.t6.f21002h5;
                            if (p6Var != null) {
                                x03 = p6Var.f(i15);
                            } else {
                                x03 = org.telegram.ui.ActionBar.t6.x0(null, i15, false);
                            }
                            int i16 = org.telegram.ui.ActionBar.t6.xj;
                            if (p6Var != null) {
                                p6Var.f(i16);
                            } else {
                                org.telegram.ui.ActionBar.t6.x0(null, i16, false);
                            }
                            int i17 = org.telegram.ui.ActionBar.t6.Bj;
                            if (p6Var != null) {
                                p6Var.f(i17);
                            } else {
                                org.telegram.ui.ActionBar.t6.x0(null, i17, false);
                            }
                            int i18 = org.telegram.ui.ActionBar.t6.E8;
                            if (p6Var != null) {
                                p6Var.f(i18);
                            } else {
                                org.telegram.ui.ActionBar.t6.x0(null, i18, false);
                            }
                            int i19 = org.telegram.ui.ActionBar.t6.G8;
                            if (p6Var != null) {
                                p6Var.f(i19);
                            } else {
                                org.telegram.ui.ActionBar.t6.x0(null, i19, false);
                            }
                            int i20 = org.telegram.ui.ActionBar.t6.f21021i6;
                            if (p6Var != null) {
                                p6Var.f(i20);
                            } else {
                                org.telegram.ui.ActionBar.t6.x0(null, i20, false);
                            }
                            int i21 = org.telegram.ui.ActionBar.t6.Gi;
                            if (p6Var != null) {
                                x04 = p6Var.f(i21);
                            } else {
                                x04 = org.telegram.ui.ActionBar.t6.x0(null, i21, false);
                            }
                            int i22 = org.telegram.ui.ActionBar.t6.Ci;
                            if (p6Var != null) {
                                x05 = p6Var.f(i22);
                            } else {
                                x05 = org.telegram.ui.ActionBar.t6.x0(null, i22, false);
                            }
                            int i23 = x05;
                            int i24 = org.telegram.ui.ActionBar.t6.Ei;
                            if (p6Var != null) {
                                x06 = p6Var.f(i24);
                            } else {
                                x06 = org.telegram.ui.ActionBar.t6.x0(null, i24, false);
                            }
                            int i25 = x06;
                            l2.f fVar = new l2.f(parentActivity2, p6Var);
                            ((org.telegram.ui.ActionBar.z2) fVar.f11588b).f21618v0 = false;
                            org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(parentActivity2, p6Var);
                            ac0Var.setMinValue(0);
                            ac0Var.setMaxValue(10);
                            ac0Var.setTextColor(x02);
                            ac0Var.setValue(i11 - 1);
                            ac0Var.setWrapSelectorWheel(false);
                            ac0Var.setFormatter(new org.telegram.ui.Components.v1(4));
                            org.telegram.ui.Components.ac0 ac0Var2 = new org.telegram.ui.Components.ac0(parentActivity2, p6Var);
                            ac0Var2.setMinValue(0);
                            ac0Var2.setMaxValue(10);
                            ac0Var2.setTextColor(x02);
                            ac0Var2.setValue((c11 / 60) - 1);
                            ac0Var2.setWrapSelectorWheel(false);
                            ac0Var2.setFormatter(new org.telegram.ui.Components.v1(5));
                            org.telegram.ui.Components.ac0 ac0Var3 = new org.telegram.ui.Components.ac0(parentActivity2, p6Var);
                            ac0Var3.setMinValue(0);
                            ac0Var3.setMaxValue(0);
                            ac0Var3.setTextColor(x02);
                            ac0Var3.setValue(0);
                            ac0Var3.setWrapSelectorWheel(false);
                            ac0Var3.setFormatter(new org.telegram.ui.Components.v1(6));
                            org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(parentActivity2, ac0Var, ac0Var2, ac0Var3, 5);
                            n3Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(parentActivity2);
                            n3Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                            TextView textView2 = new TextView(parentActivity2);
                            textView2.setText(org.telegram.messenger.dd.L0(2131748136, null));
                            textView2.setTextColor(x02);
                            sc.e.t(textView2, 1, 20.0f);
                            frameLayout.addView(textView2, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
                            LinearLayout linearLayout = new LinearLayout(parentActivity2);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            n3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ag.j3 j3Var = new ag.j3(parentActivity2, 15);
                            linearLayout.addView(ac0Var, w7.b6.l(0.4f, 0, 270));
                            linearLayout.addView(ac0Var3, w7.b6.p(0, -2, 0.2f, 16));
                            linearLayout.addView(ac0Var2, w7.b6.l(0.4f, 0, 270));
                            j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                            j3Var.setGravity(17);
                            j3Var.setTextColor(x04);
                            j3Var.setTextSize(1, 14.0f);
                            j3Var.setTypeface(org.telegram.messenger.i0.o());
                            int L = org.telegram.messenger.i0.L(8.0f);
                            j3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, i23, i25, i25));
                            j3Var.setText(org.telegram.messenger.dd.L0(2131753866, null));
                            n3Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                            org.telegram.ui.Cells.m5 m5Var = new org.telegram.ui.Cells.m5(20);
                            ac0Var.setOnValueChangedListener(m5Var);
                            ac0Var2.setOnValueChangedListener(m5Var);
                            j3Var.setOnClickListener(new org.telegram.messenger.video.h(ac0Var, ac0Var2, oy0Var, fVar, 3));
                            org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.f11588b;
                            z2Var.N = n3Var;
                            z2Var.show();
                            z2Var.v0(x03);
                            z2Var.P(x03);
                        }
                    }
                } else if (i10 == ty0Var.V) {
                    if (ty0Var.getParentActivity() != null) {
                        ty0Var.showDialog(org.telegram.ui.Components.s4.t(ty0Var.getParentActivity(), ty0Var.f41746f, ty0Var.h, -1, new Runnable(ty0Var) {
                            public final ty0 f40638b;

                            {
                                this.f40638b = ty0Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        ty0 ty0Var2 = this.f40638b;
                                        ry0 ry0Var = ty0Var2.f41745c;
                                        if (ry0Var != null) {
                                            ry0Var.g(ty0Var2.H);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        ty0 ty0Var3 = this.f40638b;
                                        ry0 ry0Var2 = ty0Var3.f41745c;
                                        if (ry0Var2 != null) {
                                            ry0Var2.g(ty0Var3.S);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        ty0 ty0Var4 = this.f40638b;
                                        ry0 ry0Var3 = ty0Var4.f41745c;
                                        if (ry0Var3 != null) {
                                            ry0Var3.g(ty0Var4.J);
                                            return;
                                        }
                                        return;
                                    default:
                                        ty0 ty0Var5 = this.f40638b;
                                        ry0 ry0Var4 = ty0Var5.f41745c;
                                        if (ry0Var4 != null) {
                                            ry0Var4.g(ty0Var5.V);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, ty0Var.e));
                    }
                } else if (i10 == ty0Var.M) {
                    org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.m6) view).a(true, true);
                    View findViewWithTag = ty0Var.f41743b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.m6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == ty0Var.N) {
                    org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.m6) view).a(true, true);
                    View findViewWithTag2 = ty0Var.f41743b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.m6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == ty0Var.P) {
                    org.telegram.ui.Cells.t8 t8Var3 = (org.telegram.ui.Cells.t8) view;
                    boolean z11 = t8Var3.e.h;
                    boolean z12 = !z11;
                    t8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit();
                    if (ty0Var.f41742a0 && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    ty0Var.getNotificationsController().c0(ty0Var.f41746f, ty0Var.h, true);
                }
            }
        }
    }

    public static void b0(ty0 ty0Var, String str) {
        ty0Var.f41744b0 = true;
        SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(ty0Var.currentAccount).e7.edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        ty0Var.finishFragment();
        sy0 sy0Var = ty0Var.f41749s;
        if (sy0Var != null) {
            sy0Var.b0();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21331z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21004h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20987g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        long j10 = this.f41746f;
        long j11 = this.h;
        String v = org.telegram.messenger.pt.v(j10, j11, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new qy0(this, v));
        org.telegram.ui.ActionBar.p6 p6Var = this.e;
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, null, false, p6Var);
        this.f41750w = snVar;
        snVar.setOccupyStatusBar(!org.telegram.messenger.i0.Q1());
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic f7 = getMessagesController().f19234r7.f(-j10, j11);
                gg.e.p(this.f41750w.getAvatarImageView(), f7, false, true, p6Var);
                this.simpleActionBar.setTitle(f7.title);
            } else {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
                this.f41750w.setChatAvatar(L0);
                this.simpleActionBar.setTitle(L0.title);
            }
        } else {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
            if (Z1 != null) {
                this.f41750w.setUserAvatar(Z1);
                this.simpleActionBar.setTitle(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
            }
        }
        if (this.f41747n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.dd.L0(2131747911, null));
            this.simpleActionBar.n(org.telegram.messenger.dd.L0(2131745963, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.dd.L0(2131751685, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f41743b = uk0Var;
        uk0Var.r1();
        this.f41743b.setSectionsDrawBackground(true);
        frameLayout.addView(this.f41743b, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.uk0 uk0Var2 = this.f41743b;
        ry0 ry0Var = new ry0(this, context);
        this.f41745c = ry0Var;
        uk0Var2.setAdapter(ry0Var);
        this.f41743b.setItemAnimator(null);
        this.f41743b.setLayoutAnimation(null);
        this.f41743b.setLayoutManager(new dh.f(16));
        this.f41743b.setOnItemClickListener(new p71(this, context, v, 1));
        this.f41741a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14704f0) {
            try {
                this.f41745c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f41743b;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41743b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41743b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41743b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21312y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41743b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21116n6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        int i12;
        Ringtone ringtone;
        if (i11 == -1 && intent != null) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            String str = null;
            if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.w0.f18945b, uri)) != null) {
                if (i10 == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = org.telegram.messenger.dd.L0(2131751600, null);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.dd.L0(2131745298, null);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(this.currentAccount).e7.edit();
            String v = org.telegram.messenger.pt.v(this.f41746f, this.h, false);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + v, str);
                    edit.putString("sound_path_" + v, uri.toString());
                } else {
                    edit.putString("sound_" + v, "NoSound");
                    edit.putString("sound_path_" + v, "NoSound");
                }
                getNotificationsController().l(this.f41746f, this.h);
            } else if (i10 == 13) {
                if (str != null) {
                    edit.putString("ringtone_" + v, str);
                    edit.putString("ringtone_path_" + v, uri.toString());
                } else {
                    edit.putString("ringtone_" + v, "NoSound");
                    edit.putString("ringtone_path_" + v, "NoSound");
                }
            }
            edit.apply();
            ry0 ry0Var = this.f41745c;
            if (ry0Var != null) {
                if (i10 == 13) {
                    i12 = this.R;
                } else {
                    i12 = this.G;
                }
                ry0Var.g(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ty0.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f41744b0) {
            String v = org.telegram.messenger.pt.v(this.f41746f, this.h, false);
            SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(this.currentAccount).e7.edit();
            edit.putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14704f0);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        org.telegram.messenger.i0.A3(this.f41750w.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(42.0f)) / 2) + this.mSystemInsets.f7767b, org.telegram.messenger.i0.L(6.0f), 0);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        org.telegram.messenger.i0.E2(this.f41750w.e);
        if (!this.f41747n) {
            this.f41741a.addView(this.f41750w.e, w7.b6.e(42, 42, 53));
        }
        org.telegram.messenger.i0.A3(this.f41750w.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(42.0f)) / 2) + this.mSystemInsets.f7767b, org.telegram.messenger.i0.L(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
