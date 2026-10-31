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
public final class uy0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
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
    public FrameLayout f42541a;
    public boolean f42542a0;
    public org.telegram.ui.Components.tk0 f42543b;
    public boolean f42544b0;
    public sy0 f42545c;
    public AnimatorSet d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final long f42546f;
    public final long h;
    public final boolean f42547n;
    public boolean f42548r;
    public ty0 f42549s;
    public org.telegram.ui.Components.sn f42550w;
    public int f42551x;
    public int f42552y;

    public uy0(Bundle bundle, org.telegram.ui.ActionBar.p6 p6Var) {
        super(bundle);
        this.e = p6Var;
        this.f42546f = bundle.getLong("dialog_id");
        this.h = bundle.getLong("topic_id");
        this.f42547n = bundle.getBoolean("exception", false);
    }

    public static void Y(uy0 uy0Var, String str, int i10, int i11) {
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(uy0Var.currentAccount).e7.edit();
        SharedPreferences.Editor putInt = edit.putInt("smart_max_count_" + str, i10);
        putInt.putInt("smart_delay_" + str, i11).apply();
        sy0 sy0Var = uy0Var.f42545c;
        if (sy0Var != null) {
            sy0Var.g(uy0Var.I);
        }
    }

    public static void Z(final uy0 uy0Var, Context context, String str, View view, int i10) {
        String str2;
        int x02;
        int x03;
        int x04;
        int x05;
        int x06;
        String str3;
        org.telegram.ui.ActionBar.p6 p6Var = uy0Var.e;
        if (view.isEnabled()) {
            Parcelable parcelable = null;
            if (i10 == uy0Var.X) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
                String L0 = org.telegram.messenger.cd.L0(2131746119, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131746120, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new py0(uy0Var, str));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                uy0Var.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                }
            } else if (i10 == uy0Var.G) {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", uy0Var.f42546f);
                bundle.putLong("topic_id", uy0Var.h);
                uy0Var.presentFragment(new yi0(bundle, p6Var));
            } else if (i10 == uy0Var.R) {
                try {
                    Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                    intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
                    intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
                    intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", RingtoneManager.getDefaultUri(1));
                    SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(uy0Var.currentAccount).e7;
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
                    uy0Var.startActivityForResult(intent, 13);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            } else if (i10 == uy0Var.H) {
                Activity parentActivity = uy0Var.getParentActivity();
                long j10 = uy0Var.f42546f;
                long j11 = uy0Var.h;
                Runnable runnable = new Runnable(uy0Var) {
                    public final uy0 f41091b;

                    {
                        this.f41091b = uy0Var;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                uy0 uy0Var2 = this.f41091b;
                                sy0 sy0Var = uy0Var2.f42545c;
                                if (sy0Var != null) {
                                    sy0Var.g(uy0Var2.H);
                                    return;
                                }
                                return;
                            case 1:
                                uy0 uy0Var3 = this.f41091b;
                                sy0 sy0Var2 = uy0Var3.f42545c;
                                if (sy0Var2 != null) {
                                    sy0Var2.g(uy0Var3.S);
                                    return;
                                }
                                return;
                            case 2:
                                uy0 uy0Var4 = this.f41091b;
                                sy0 sy0Var3 = uy0Var4.f42545c;
                                if (sy0Var3 != null) {
                                    sy0Var3.g(uy0Var4.J);
                                    return;
                                }
                                return;
                            default:
                                uy0 uy0Var5 = this.f41091b;
                                sy0 sy0Var4 = uy0Var5.f42545c;
                                if (sy0Var4 != null) {
                                    sy0Var4.g(uy0Var5.V);
                                    return;
                                }
                                return;
                        }
                    }
                };
                org.telegram.ui.ActionBar.p6 p6Var2 = uy0Var.e;
                Pattern pattern = org.telegram.ui.Components.s4.f30123a;
                if (j10 != 0) {
                    str3 = a1.g.l(j10, "vibrate_");
                } else {
                    str3 = "vibrate_messages";
                }
                uy0Var.showDialog(org.telegram.ui.Components.s4.X(parentActivity, j10, j11, str3, runnable, p6Var2));
            } else {
                int i11 = 2;
                if (i10 == uy0Var.E) {
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    boolean z10 = !t8Var.e.h;
                    uy0Var.f42548r = z10;
                    t8Var.setChecked(z10);
                    int childCount = uy0Var.f42543b.getChildCount();
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) uy0Var.f42543b.T(uy0Var.f42543b.getChildAt(i12));
                        int i13 = ck0Var.f47901f;
                        View view2 = ck0Var.f47898a;
                        int b10 = ck0Var.b();
                        if (b10 != uy0Var.E && b10 != uy0Var.X) {
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                if (i13 == 7 && b10 == uy0Var.F) {
                                                    ((org.telegram.ui.Cells.t8) view2).e(arrayList, uy0Var.f42548r);
                                                }
                                            } else {
                                                ((org.telegram.ui.Cells.m6) view2).b(arrayList, uy0Var.f42548r);
                                            }
                                        } else {
                                            ((org.telegram.ui.Cells.v8) view2).a(arrayList, uy0Var.f42548r);
                                        }
                                    } else {
                                        ((org.telegram.ui.Cells.b9) view2).c(arrayList, uy0Var.f42548r);
                                    }
                                } else {
                                    ((org.telegram.ui.Cells.x9) view2).a(arrayList, uy0Var.f42548r);
                                }
                            } else {
                                ((org.telegram.ui.Cells.p4) view2).a(arrayList, uy0Var.f42548r);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnimatorSet animatorSet = uy0Var.d;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        uy0Var.d = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        uy0Var.d.addListener(new ns0(uy0Var, 4));
                        uy0Var.d.setDuration(150L);
                        uy0Var.d.start();
                    }
                } else if (i10 == uy0Var.F) {
                    org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
                    Switch r32 = t8Var2.e;
                    org.telegram.messenger.vp.r1(uy0Var.currentAccount).e7.edit().putBoolean(sc.e.h("content_preview_", str), !r32.h).apply();
                    t8Var2.setChecked(!r32.h);
                } else if (i10 == uy0Var.S) {
                    uy0Var.showDialog(org.telegram.ui.Components.s4.X(uy0Var.getParentActivity(), uy0Var.f42546f, uy0Var.h, sc.e.h("calls_vibrate_", str), new Runnable(uy0Var) {
                        public final uy0 f41091b;

                        {
                            this.f41091b = uy0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    uy0 uy0Var2 = this.f41091b;
                                    sy0 sy0Var = uy0Var2.f42545c;
                                    if (sy0Var != null) {
                                        sy0Var.g(uy0Var2.H);
                                        return;
                                    }
                                    return;
                                case 1:
                                    uy0 uy0Var3 = this.f41091b;
                                    sy0 sy0Var2 = uy0Var3.f42545c;
                                    if (sy0Var2 != null) {
                                        sy0Var2.g(uy0Var3.S);
                                        return;
                                    }
                                    return;
                                case 2:
                                    uy0 uy0Var4 = this.f41091b;
                                    sy0 sy0Var3 = uy0Var4.f42545c;
                                    if (sy0Var3 != null) {
                                        sy0Var3.g(uy0Var4.J);
                                        return;
                                    }
                                    return;
                                default:
                                    uy0 uy0Var5 = this.f41091b;
                                    sy0 sy0Var4 = uy0Var5.f42545c;
                                    if (sy0Var4 != null) {
                                        sy0Var4.g(uy0Var5.V);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, uy0Var.e));
                } else if (i10 == uy0Var.J) {
                    uy0Var.showDialog(org.telegram.ui.Components.s4.H(uy0Var.getParentActivity(), uy0Var.f42546f, uy0Var.h, -1, new Runnable(uy0Var) {
                        public final uy0 f41091b;

                        {
                            this.f41091b = uy0Var;
                        }

                        @Override
                        public final void run() {
                            switch (r2) {
                                case 0:
                                    uy0 uy0Var2 = this.f41091b;
                                    sy0 sy0Var = uy0Var2.f42545c;
                                    if (sy0Var != null) {
                                        sy0Var.g(uy0Var2.H);
                                        return;
                                    }
                                    return;
                                case 1:
                                    uy0 uy0Var3 = this.f41091b;
                                    sy0 sy0Var2 = uy0Var3.f42545c;
                                    if (sy0Var2 != null) {
                                        sy0Var2.g(uy0Var3.S);
                                        return;
                                    }
                                    return;
                                case 2:
                                    uy0 uy0Var4 = this.f41091b;
                                    sy0 sy0Var3 = uy0Var4.f42545c;
                                    if (sy0Var3 != null) {
                                        sy0Var3.g(uy0Var4.J);
                                        return;
                                    }
                                    return;
                                default:
                                    uy0 uy0Var5 = this.f41091b;
                                    sy0 sy0Var4 = uy0Var5.f42545c;
                                    if (sy0Var4 != null) {
                                        sy0Var4.g(uy0Var5.V);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, uy0Var.e));
                } else if (i10 == uy0Var.I) {
                    if (uy0Var.getParentActivity() != null) {
                        SharedPreferences sharedPreferences2 = org.telegram.messenger.vp.r1(uy0Var.currentAccount).e7;
                        int c10 = org.telegram.messenger.m5.c("smart_max_count_", str, sharedPreferences2, 2);
                        int c11 = org.telegram.messenger.m5.c("smart_delay_", str, sharedPreferences2, 180);
                        if (c10 != 0) {
                            i11 = c10;
                        }
                        Activity parentActivity2 = uy0Var.getParentActivity();
                        py0 py0Var = new py0(uy0Var, str);
                        Pattern pattern2 = org.telegram.ui.Components.s4.f30123a;
                        if (parentActivity2 != null) {
                            int i14 = org.telegram.ui.ActionBar.t6.f21037j5;
                            if (p6Var != null) {
                                x02 = p6Var.f(i14);
                            } else {
                                x02 = org.telegram.ui.ActionBar.t6.x0(null, i14, false);
                            }
                            int i15 = org.telegram.ui.ActionBar.t6.f21001h5;
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
                            int i20 = org.telegram.ui.ActionBar.t6.f21020i6;
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
                            ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21617v0 = false;
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
                            textView2.setText(org.telegram.messenger.cd.L0(2131748136, null));
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
                            j3Var.setText(org.telegram.messenger.cd.L0(2131753866, null));
                            n3Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                            org.telegram.ui.Cells.m5 m5Var = new org.telegram.ui.Cells.m5(20);
                            ac0Var.setOnValueChangedListener(m5Var);
                            ac0Var2.setOnValueChangedListener(m5Var);
                            j3Var.setOnClickListener(new org.telegram.messenger.video.h(ac0Var, ac0Var2, py0Var, fVar, 3));
                            org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.f11587b;
                            z2Var.N = n3Var;
                            z2Var.show();
                            z2Var.v0(x03);
                            z2Var.P(x03);
                        }
                    }
                } else if (i10 == uy0Var.V) {
                    if (uy0Var.getParentActivity() != null) {
                        uy0Var.showDialog(org.telegram.ui.Components.s4.t(uy0Var.getParentActivity(), uy0Var.f42546f, uy0Var.h, -1, new Runnable(uy0Var) {
                            public final uy0 f41091b;

                            {
                                this.f41091b = uy0Var;
                            }

                            @Override
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        uy0 uy0Var2 = this.f41091b;
                                        sy0 sy0Var = uy0Var2.f42545c;
                                        if (sy0Var != null) {
                                            sy0Var.g(uy0Var2.H);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        uy0 uy0Var3 = this.f41091b;
                                        sy0 sy0Var2 = uy0Var3.f42545c;
                                        if (sy0Var2 != null) {
                                            sy0Var2.g(uy0Var3.S);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        uy0 uy0Var4 = this.f41091b;
                                        sy0 sy0Var3 = uy0Var4.f42545c;
                                        if (sy0Var3 != null) {
                                            sy0Var3.g(uy0Var4.J);
                                            return;
                                        }
                                        return;
                                    default:
                                        uy0 uy0Var5 = this.f41091b;
                                        sy0 sy0Var4 = uy0Var5.f42545c;
                                        if (sy0Var4 != null) {
                                            sy0Var4.g(uy0Var5.V);
                                            return;
                                        }
                                        return;
                                }
                            }
                        }, uy0Var.e));
                    }
                } else if (i10 == uy0Var.M) {
                    org.telegram.messenger.vp.r1(uy0Var.currentAccount).e7.edit().putInt("popup_" + str, 1).apply();
                    ((org.telegram.ui.Cells.m6) view).a(true, true);
                    View findViewWithTag = uy0Var.f42543b.findViewWithTag(2);
                    if (findViewWithTag != null) {
                        ((org.telegram.ui.Cells.m6) findViewWithTag).a(false, true);
                    }
                } else if (i10 == uy0Var.N) {
                    org.telegram.messenger.vp.r1(uy0Var.currentAccount).e7.edit().putInt("popup_" + str, 2).apply();
                    ((org.telegram.ui.Cells.m6) view).a(true, true);
                    View findViewWithTag2 = uy0Var.f42543b.findViewWithTag(1);
                    if (findViewWithTag2 != null) {
                        ((org.telegram.ui.Cells.m6) findViewWithTag2).a(false, true);
                    }
                } else if (i10 == uy0Var.P) {
                    org.telegram.ui.Cells.t8 t8Var3 = (org.telegram.ui.Cells.t8) view;
                    boolean z11 = t8Var3.e.h;
                    boolean z12 = !z11;
                    t8Var3.setChecked(z12);
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(uy0Var.currentAccount).e7.edit();
                    if (uy0Var.f42542a0 && !z11) {
                        edit.remove("stories_" + str);
                    } else {
                        edit.putBoolean("stories_" + str, z12);
                    }
                    edit.apply();
                    uy0Var.getNotificationsController().c0(uy0Var.f42546f, uy0Var.h, true);
                }
            }
        }
    }

    public static void a0(uy0 uy0Var, String str) {
        uy0Var.f42544b0 = true;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(uy0Var.currentAccount).e7.edit();
        SharedPreferences.Editor putBoolean = edit.putBoolean("custom_" + str, false);
        putBoolean.remove("notify2_" + str).apply();
        uy0Var.finishFragment();
        ty0 ty0Var = uy0Var.f42549s;
        if (ty0Var != null) {
            ty0Var.b0();
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21003h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20986g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        long j10 = this.f42546f;
        long j11 = this.h;
        String v = org.telegram.messenger.ot.v(j10, j11, false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ry0(this, v));
        org.telegram.ui.ActionBar.p6 p6Var = this.e;
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, null, false, p6Var);
        this.f42550w = snVar;
        snVar.setOccupyStatusBar(!org.telegram.messenger.i0.Q1());
        if (j10 < 0) {
            if (j11 != 0) {
                TLRPC.TL_forumTopic f7 = getMessagesController().f18891r7.f(-j10, j11);
                gg.e.p(this.f42550w.getAvatarImageView(), f7, false, true, p6Var);
                this.simpleActionBar.setTitle(f7.title);
            } else {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
                this.f42550w.setChatAvatar(L0);
                this.simpleActionBar.setTitle(L0.title);
            }
        } else {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
            if (Z1 != null) {
                this.f42550w.setUserAvatar(Z1);
                this.simpleActionBar.setTitle(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
            }
        }
        if (this.f42547n) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.cd.L0(2131747911, null));
            this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.cd.L0(2131751685, null));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f42543b = tk0Var;
        tk0Var.r1();
        this.f42543b.setSectionsDrawBackground(true);
        frameLayout.addView(this.f42543b, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.tk0 tk0Var2 = this.f42543b;
        sy0 sy0Var = new sy0(this, context);
        this.f42545c = sy0Var;
        tk0Var2.setAdapter(sy0Var);
        this.f42543b.setItemAnimator(null);
        this.f42543b.setLayoutAnimation(null);
        this.f42543b.setLayoutManager(new dh.f(16));
        this.f42543b.setOnItemClickListener(new r71(this, context, v, 1));
        this.f42541a = frameLayout;
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19608f0) {
            try {
                this.f42545c.f();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f42543b;
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.e;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(19, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42543b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42543b, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42543b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21311y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42543b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21115n6));
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
            if (uri != null && (ringtone = RingtoneManager.getRingtone(org.telegram.messenger.w0.f19025b, uri)) != null) {
                if (i10 == 13) {
                    if (uri.equals(Settings.System.DEFAULT_RINGTONE_URI)) {
                        str = org.telegram.messenger.cd.L0(2131751600, null);
                    } else {
                        str = ringtone.getTitle(getParentActivity());
                    }
                } else if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = org.telegram.messenger.cd.L0(2131745298, null);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.currentAccount).e7.edit();
            String v = org.telegram.messenger.ot.v(this.f42546f, this.h, false);
            if (i10 == 12) {
                if (str != null) {
                    edit.putString("sound_" + v, str);
                    edit.putString("sound_path_" + v, uri.toString());
                } else {
                    edit.putString("sound_" + v, "NoSound");
                    edit.putString("sound_path_" + v, "NoSound");
                }
                getNotificationsController().l(this.f42546f, this.h);
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
            sy0 sy0Var = this.f42545c;
            if (sy0Var != null) {
                if (i10 == 13) {
                    i12 = this.R;
                } else {
                    i12 = this.G;
                }
                sy0Var.g(i12);
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uy0.onFragmentCreate():boolean");
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f42544b0) {
            String v = org.telegram.messenger.ot.v(this.f42546f, this.h, false);
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(this.currentAccount).e7.edit();
            edit.putBoolean("custom_" + v, true).apply();
        }
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19608f0);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        super.onInsets(i10, i11, i12, i13);
        org.telegram.messenger.i0.A3(this.f42550w.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(42.0f)) / 2) + this.mSystemInsets.f7766b, org.telegram.messenger.i0.L(6.0f), 0);
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
        org.telegram.messenger.i0.E2(this.f42550w.e);
        if (!this.f42547n) {
            this.f42541a.addView(this.f42550w.e, w7.b6.e(42, 42, 53));
        }
        org.telegram.messenger.i0.A3(this.f42550w.e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(42.0f)) / 2) + this.mSystemInsets.f7766b, org.telegram.messenger.i0.L(6.0f), 0);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
