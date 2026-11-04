package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class x6 extends sg.b {
    public final int d;
    public final Context f51836e;
    public final org.telegram.ui.ActionBar.d2 f51837f;

    public x6(int i3, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.d = i3;
        this.f51837f = d2Var;
        this.f51836e = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3;
        switch (this.d) {
            case 0:
                z6 z6Var = (z6) this.f51837f;
                if (d1Var.b() != z6Var.K && (((i3 = d1Var.f55544f) != 2 || z6Var.H <= 0 || z6Var.L) && i3 != 5 && i3 != 7 && i3 != 11)) {
                    return false;
                }
                return true;
            default:
                int i10 = d1Var.f55544f;
                if (i10 != 0 && i10 != 4) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.d) {
            case 0:
                return ((z6) this.f51837f).f52556g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f51837f).J.size();
        }
    }

    @Override
    public final int d(int i3) {
        switch (this.d) {
            case 0:
                return ((v6) ((z6) this.f51837f).f52556g0.get(i3)).f54715a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f51837f;
                if (i3 >= 0 && i3 < notificationsCustomSettingsActivity.J.size()) {
                    return ((gh0) notificationsCustomSettingsActivity.J.get(i3)).f54715a;
                }
                return 5;
        }
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        String str;
        org.telegram.ui.Cells.l8 l8Var;
        float f10;
        float f11;
        boolean z10;
        String format;
        boolean z11;
        Boolean bool;
        boolean z12;
        float f12;
        int i11 = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = this.f51837f;
        boolean z13 = true;
        switch (i11) {
            case 0:
                z6 z6Var = (z6) d2Var;
                ArrayList arrayList = z6Var.f52556g0;
                v6 v6Var = (v6) arrayList.get(i3);
                int i12 = d1Var.f55544f;
                View view = d1Var.f55540a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 7) {
                                    switch (i12) {
                                        case 9:
                                            z6Var.y0();
                                            return;
                                        case 10:
                                            m6 m6Var = z6Var.Y;
                                            if (m6Var != null && !z6Var.L) {
                                                long j10 = z6Var.H;
                                                if (j10 <= 0) {
                                                    z13 = false;
                                                }
                                                long j11 = z6Var.I;
                                                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                                if (i13 <= 0) {
                                                    f10 = 0.0f;
                                                } else {
                                                    f10 = ((float) j10) / ((float) j11);
                                                }
                                                long j12 = z6Var.J;
                                                if (j12 > 0 && i13 > 0) {
                                                    f11 = ((float) (j11 - j12)) / ((float) j11);
                                                } else {
                                                    f11 = 0.0f;
                                                }
                                                m6Var.b(f10, f11, z13);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                                            int i14 = v6Var.f50401f;
                                            if (i14 < 0) {
                                                z10 = z6Var.t0();
                                            } else {
                                                z10 = z6Var.d[i14];
                                            }
                                            boolean z14 = z10;
                                            CharSequence charSequence = v6Var.d;
                                            int[] iArr = z6Var.V;
                                            int i15 = v6Var.f50401f;
                                            if (i15 < 0) {
                                                i15 = 9;
                                            }
                                            int i16 = iArr[i15];
                                            if (i16 <= 0) {
                                                format = String.format("<%.1f%%", Float.valueOf(1.0f));
                                            } else {
                                                format = String.format("%d%%", Integer.valueOf(i16));
                                            }
                                            SpannableString spannableString = new SpannableString(format);
                                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                                            spannableString.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                            spannableStringBuilder.append((CharSequence) "  ");
                                            spannableStringBuilder.append((CharSequence) spannableString);
                                            String i02 = org.telegram.messenger.g0.i0(v6Var.f50402g, false, false);
                                            if (v6Var.f50401f >= 0 ? !v6Var.f50404j : !z6Var.M) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            c2Var.e(spannableStringBuilder, i02, z14, z11, false);
                                            int i17 = v6Var.h;
                                            int i18 = org.telegram.ui.ActionBar.k6.f28008k7;
                                            org.telegram.ui.Components.wo woVar = c2Var.f29038r;
                                            if (woVar != null) {
                                                woVar.b(i17, i17, i18);
                                            }
                                            if (v6Var.f50401f < 0) {
                                                bool = Boolean.valueOf(z6Var.M);
                                            } else {
                                                bool = null;
                                            }
                                            c2Var.setCollapsed(bool);
                                            if (v6Var.f50401f == -1) {
                                                c2Var.d(new a(this, 6), new org.telegram.messenger.video.g(10, this, c2Var));
                                            } else {
                                                c2Var.d(null, null);
                                            }
                                            c2Var.setPad(v6Var.f50403i ? 1 : 0);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                                org.telegram.messenger.u2 u2Var = z6Var.getMessagesController().f23111r7;
                                int i19 = v6Var.f50399c;
                                int size = u2Var.d(((v6) arrayList.get(i3)).f50399c).size();
                                if (size > 0) {
                                    str = org.telegram.messenger.bd.G(size, "ExceptionShort", Integer.valueOf(size));
                                } else {
                                    str = null;
                                }
                                String f13 = org.telegram.messenger.u2.f(u2Var.c(i19));
                                if (((v6) arrayList.get(i3)).f50399c == 0) {
                                    l8Var = l8Var2;
                                    l8Var.r(org.telegram.messenger.bd.M0(2131746761, null), f13, true, 2131232149, -11565578, -13276952, true);
                                } else {
                                    l8Var = l8Var2;
                                    if (((v6) arrayList.get(i3)).f50399c == 1) {
                                        l8Var.r(org.telegram.messenger.bd.M0(2131749465, null), f13, true, 2131232148, -11154873, -14175180, true);
                                    } else if (((v6) arrayList.get(i3)).f50399c == 2) {
                                        l8Var.r(org.telegram.messenger.bd.M0(2131752650, null), f13, true, 2131232147, -1007845, -1996271, true);
                                    } else if (((v6) arrayList.get(i3)).f50399c == 3) {
                                        l8Var.r(org.telegram.messenger.bd.M0(2131752646, null), f13, false, 2131232154, -765355, -2148011, false);
                                    }
                                }
                                l8Var.setSubtitle(str);
                                return;
                            }
                            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                            n4Var.setText(((v6) arrayList.get(i3)).d);
                            ((v6) arrayList.get(i3)).getClass();
                            n4Var.setTopMargin(15);
                            ((v6) arrayList.get(i3)).getClass();
                            n4Var.setBottomMargin(0);
                            return;
                        }
                        final org.telegram.ui.Components.gw0 gw0Var = (org.telegram.ui.Components.gw0) view;
                        boolean z15 = z6Var.L;
                        long j13 = z6Var.f52552e;
                        long j14 = z6Var.H;
                        long j15 = z6Var.J;
                        long j16 = z6Var.I;
                        b4.n nVar = gw0Var.J;
                        View view2 = gw0Var.f34220x;
                        TextView textView = gw0Var.f34216n;
                        TextView textView2 = gw0Var.h;
                        TextView textView3 = gw0Var.f34219w;
                        org.telegram.ui.Cells.v9 v9Var = gw0Var.E;
                        gw0Var.f34214e = z15;
                        TextView textView4 = gw0Var.f34217r;
                        textView4.setText(org.telegram.messenger.bd.a0("TotalDeviceFreeSize", null, 2131743983, org.telegram.messenger.g0.i0(j15, false, false)));
                        TextView textView5 = gw0Var.f34218s;
                        long j17 = j16 - j15;
                        textView5.setText(org.telegram.messenger.bd.a0("TotalDeviceSize", null, 2131743982, org.telegram.messenger.g0.i0(j17, false, false)));
                        if (z15) {
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            textView4.setVisibility(8);
                            textView5.setVisibility(8);
                            textView.setVisibility(8);
                            view2.setVisibility(8);
                            v9Var.setVisibility(8);
                            gw0Var.F = 0.0f;
                            gw0Var.G = 0.0f;
                            if (nVar != null) {
                                nVar.c(textView3);
                            }
                        } else {
                            if (nVar != null) {
                                nVar.z(textView3);
                            }
                            textView3.setVisibility(8);
                            if (j14 > 0) {
                                i10 = 0;
                                view2.setVisibility(0);
                                v9Var.setVisibility(0);
                                textView2.setVisibility(0);
                                textView.setVisibility(8);
                                v9Var.c(org.telegram.messenger.bd.M0(2131752047, null), org.telegram.messenger.g0.i0(j14, false, false), false, true);
                                textView2.setText(org.telegram.messenger.bd.a0("TelegramCacheSize", null, 2131744256, org.telegram.messenger.g0.i0(j14 + j13, false, false)));
                            } else {
                                i10 = 0;
                                textView2.setVisibility(8);
                                textView.setVisibility(0);
                                textView.setText(org.telegram.messenger.bd.a0("LocalDatabaseSize", null, 2131748777, org.telegram.messenger.g0.i0(j13, false, false)));
                                view2.setVisibility(8);
                                v9Var.setVisibility(8);
                            }
                            textView4.setVisibility(i10);
                            textView5.setVisibility(i10);
                            float f14 = (float) j16;
                            float f15 = ((float) (j14 + j13)) / f14;
                            float f16 = ((float) j17) / f14;
                            if (gw0Var.F != f15) {
                                ValueAnimator valueAnimator = gw0Var.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(gw0Var.F, f15);
                                gw0Var.H = ofFloat;
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        switch (r2) {
                                            case 0:
                                                gw0 gw0Var2 = gw0Var;
                                                gw0Var2.getClass();
                                                gw0Var2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                gw0Var2.invalidate();
                                                return;
                                            default:
                                                gw0 gw0Var3 = gw0Var;
                                                gw0Var3.getClass();
                                                gw0Var3.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                gw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                gw0Var.H.start();
                            }
                            if (gw0Var.G != f16) {
                                ValueAnimator valueAnimator2 = gw0Var.I;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(gw0Var.G, f16);
                                gw0Var.I = ofFloat2;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                        switch (r2) {
                                            case 0:
                                                gw0 gw0Var2 = gw0Var;
                                                gw0Var2.getClass();
                                                gw0Var2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                gw0Var2.invalidate();
                                                return;
                                            default:
                                                gw0 gw0Var3 = gw0Var;
                                                gw0Var3.getClass();
                                                gw0Var3.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                gw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                gw0Var.I.start();
                            }
                        }
                        org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
                        gw0Var.requestLayout();
                        return;
                    }
                    ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.g0.X2(v6Var.f50400e));
                    return;
                }
                org.telegram.ui.Cells.v9 v9Var2 = (org.telegram.ui.Cells.v9) view;
                if (i3 == z6Var.K) {
                    v9Var2.c(org.telegram.messenger.bd.M0(2131748442, null), null, false, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) d2Var).J;
                if (i3 >= 0 && i3 < arrayList2.size()) {
                    gh0 gh0Var = (gh0) arrayList2.get(i3);
                    int i20 = i3 + 1;
                    if (i20 < arrayList2.size() && ((gh0) arrayList2.get(i20)).f54715a != 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i21 = d1Var.f55544f;
                    View view3 = d1Var.f55540a;
                    switch (i21) {
                        case 0:
                            ((org.telegram.ui.Cells.n4) view3).setText(gh0Var.f45664e);
                            return;
                        case 1:
                            ((org.telegram.ui.Cells.q8) view3).f("" + ((Object) gh0Var.f45664e), gh0Var.f45667i, z12);
                            return;
                        case 2:
                            ((org.telegram.ui.Cells.pa) view3).f(gh0Var.f45666g, null, z12);
                            return;
                        case 3:
                            ((org.telegram.ui.Cells.s8) view3).b(gh0Var.h, "" + ((Object) gh0Var.f45664e), z12);
                            return;
                        case 4:
                            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view3;
                            if (gh0Var.f45664e == null) {
                                y8Var.setFixedSize(12);
                                y8Var.setText(null);
                                return;
                            }
                            y8Var.setFixedSize(0);
                            y8Var.setText(gh0Var.f45664e);
                            return;
                        case 5:
                            ((org.telegram.ui.Cells.v9) view3).c(gh0Var.f45664e, gh0Var.f45665f, false, z12);
                            return;
                        case 6:
                            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view3;
                            h5Var.setDrawLine(true);
                            h5Var.setChecked(gh0Var.f45667i);
                            h5Var.b(gh0Var.f45664e, gh0Var.f45665f, gh0Var.d, gh0Var.f45667i, 0, false, z12, true);
                            return;
                        case 7:
                            org.telegram.ui.Cells.l8 l8Var3 = (org.telegram.ui.Cells.l8) view3;
                            if (gh0Var.d == 0) {
                                l8Var3.g(-1, org.telegram.ui.ActionBar.k6.f28102p7);
                                l8Var3.k("" + ((Object) gh0Var.f45664e), z12);
                                return;
                            }
                            l8Var3.g(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
                            l8Var3.o(gh0Var.d, "" + ((Object) gh0Var.f45664e), z12);
                            return;
                        case 8:
                            fh0 fh0Var = (fh0) view3;
                            fh0Var.g(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
                            CharSequence charSequence2 = gh0Var.f45664e;
                            if (gh0Var.d != 1) {
                                z13 = false;
                            }
                            ViewPropertyAnimator animate = fh0Var.f45283a0.animate();
                            if (z13) {
                                f12 = 0.0f;
                            } else {
                                f12 = 180.0f;
                            }
                            org.telegram.messenger.camera.q.l(animate.rotation(f12), org.telegram.ui.Components.xq.h, 340L);
                            fh0Var.k(charSequence2, z12);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Components.iz izVar;
        int i10;
        w6 w6Var;
        FrameLayout h5Var;
        int i11 = this.d;
        int i12 = 5;
        Context context = this.f51836e;
        org.telegram.ui.ActionBar.d2 d2Var = this.f51837f;
        switch (i11) {
            case 0:
                z6 z6Var = (z6) d2Var;
                if (i3 != 0) {
                    switch (i3) {
                        case 2:
                            ?? frameLayout = new FrameLayout(context);
                            Paint paint = new Paint(1);
                            frameLayout.f34211a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            frameLayout.f34212b = paint3;
                            Paint paint4 = new Paint(1);
                            frameLayout.f34213c = paint4;
                            frameLayout.d = new Paint();
                            org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g(220, 255);
                            frameLayout.M = gVar;
                            frameLayout.setWillNotDraw(false);
                            gVar.f39353k = false;
                            paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint3.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint4.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            ai.x2 x2Var = new ai.x2(29, context, frameLayout);
                            frameLayout.f34215f = x2Var;
                            frameLayout.addView(x2Var, b8.mf.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            frameLayout.addView(linearLayout, b8.mf.c(-2.0f, -1));
                            ai.d2 d2Var2 = new ai.d2(context, 23);
                            linearLayout.addView(d2Var2, b8.mf.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            frameLayout.f34219w = textView;
                            int i13 = org.telegram.ui.ActionBar.k6.f28273y6;
                            org.telegram.ui.ActionBar.r6.V(textView, i13, null);
                            String M0 = org.telegram.messenger.bd.M0(2131752643, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                b4.n nVar = new b4.n(textView);
                                frameLayout.J = nVar;
                                nVar.E(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            frameLayout.h = textView2;
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView2, i13, null);
                            TextView textView3 = new TextView(context);
                            frameLayout.f34216n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView3, i13, null);
                            TextView textView4 = new TextView(context);
                            frameLayout.f34217r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView4, i13, null);
                            TextView textView5 = new TextView(context);
                            frameLayout.f34218s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView5, i13, null);
                            frameLayout.f34221y = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f34221y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f34221y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f34221y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f34221y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            d2Var2.addView(textView, b8.mf.c(-2.0f, -2));
                            d2Var2.addView(textView3, b8.mf.c(-2.0f, -2));
                            d2Var2.addView(textView2, b8.mf.c(-2.0f, -2));
                            d2Var2.addView(textView5, b8.mf.c(-2.0f, -2));
                            d2Var2.addView(textView4, b8.mf.c(-2.0f, -2));
                            View view = new View(frameLayout.getContext());
                            frameLayout.f34220x = view;
                            linearLayout.addView(view, b8.mf.t(-1, -2, 0, 21, 0, 0, 0));
                            view.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view, null);
                            org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(frameLayout.getContext());
                            frameLayout.E = v9Var;
                            linearLayout.addView(v9Var, b8.mf.o(-1, -2));
                            izVar = frameLayout;
                            break;
                        case 3:
                            izVar = new org.telegram.ui.Cells.n4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.ut0 ut0Var = new org.telegram.ui.Components.ut0(context, null);
                            ut0Var.setCallback(new org.telegram.messenger.go(12));
                            int i14 = org.telegram.messenger.az.G;
                            if (i14 == 3) {
                                i10 = 0;
                            } else {
                                i10 = i14 + 1;
                            }
                            ut0Var.b(i10, null, org.telegram.messenger.bd.G(3, "Days", new Object[0]), org.telegram.messenger.bd.G(1, "Weeks", new Object[0]), org.telegram.messenger.bd.G(1, "Months", new Object[0]), org.telegram.messenger.bd.M0(2131749067, null));
                            izVar = ut0Var;
                            break;
                        case 5:
                            izVar = new y6(z6Var.getParentActivity(), z6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.iz izVar2 = new org.telegram.ui.Components.iz(z6Var.getParentActivity(), null);
                            izVar2.setIsSingleCell(true);
                            izVar2.setItemsCount(3);
                            izVar2.setIgnoreHeightCheck(true);
                            izVar2.setViewType(25);
                            izVar = izVar2;
                            break;
                        case 7:
                            izVar = new org.telegram.ui.Cells.l8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.gt0 gt0Var = z6Var.f52550c0;
                            gt0Var.getClass();
                            View x2Var2 = new ai.x2(26, context, gt0Var);
                            x2Var2.setTag(-33024);
                            x2Var2.setLayoutParams(new u4.p0(-1, -1));
                            izVar = x2Var2;
                            break;
                        case 9:
                            w6 w6Var2 = new w6(this, context);
                            z6Var.X = w6Var2;
                            w6Var2.setTag(-33024);
                            w6Var = w6Var2;
                            izVar = w6Var;
                            break;
                        case 10:
                            m6 m6Var = new m6(z6Var, context);
                            z6Var.Y = m6Var;
                            m6Var.setTag(-33024);
                            w6Var = m6Var;
                            izVar = w6Var;
                            break;
                        case 11:
                            izVar = new org.telegram.ui.Cells.c2(this.f51836e, 4, 21, false, z6Var.getResourceProvider());
                            break;
                        case 12:
                            org.telegram.ui.Components.iz izVar3 = new org.telegram.ui.Components.iz(z6Var.getParentActivity(), null);
                            izVar3.setIsSingleCell(true);
                            izVar3.setItemsCount(1);
                            izVar3.setIgnoreHeightCheck(true);
                            izVar3.setViewType(26);
                            izVar = izVar3;
                            break;
                        case 13:
                            r6 r6Var = new r6(z6Var, context);
                            z6Var.Z = r6Var;
                            izVar = r6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.ut0 ut0Var2 = new org.telegram.ui.Components.ut0(context, null);
                            float f10 = ((int) ((z6Var.I / 1024) / 1024)) / 1000.0f;
                            ArrayList arrayList = new ArrayList();
                            if (f10 <= 17.0f) {
                                arrayList.add(2);
                            }
                            if (f10 > 5.0f) {
                                arrayList.add(5);
                            }
                            if (f10 > 16.0f) {
                                arrayList.add(16);
                            }
                            if (f10 > 32.0f) {
                                arrayList.add(32);
                            }
                            arrayList.add(Integer.MAX_VALUE);
                            String[] strArr = new String[arrayList.size()];
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                if (((Integer) arrayList.get(i15)).intValue() == 1) {
                                    strArr[i15] = "300 MB";
                                } else if (((Integer) arrayList.get(i15)).intValue() == Integer.MAX_VALUE) {
                                    strArr[i15] = org.telegram.messenger.bd.M0(2131748210, null);
                                } else {
                                    strArr[i15] = String.format("%d GB", arrayList.get(i15));
                                }
                            }
                            ut0Var2.setCallback(new x0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.az.q().getInt("cache_limit", Integer.MAX_VALUE)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            ut0Var2.b(indexOf2, null, strArr);
                            izVar = ut0Var2;
                            break;
                        default:
                            izVar = new org.telegram.ui.Cells.y8(context);
                            break;
                    }
                } else {
                    izVar = new org.telegram.ui.Cells.v9(context);
                }
                return new u4.d1(izVar);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) d2Var;
                switch (i3) {
                    case 0:
                        h5Var = new org.telegram.ui.Cells.n4(context);
                        break;
                    case 1:
                        h5Var = new org.telegram.ui.Cells.q8(context);
                        break;
                    case 2:
                        h5Var = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                        break;
                    case 3:
                        h5Var = new org.telegram.ui.Cells.s8(context, null);
                        break;
                    case 4:
                        h5Var = new org.telegram.ui.Cells.y8(context);
                        break;
                    case 5:
                        h5Var = new org.telegram.ui.Cells.v9(context);
                        break;
                    case 6:
                        h5Var = new org.telegram.ui.Cells.h5(this.f51836e, 21, 64, true, NotificationsCustomSettingsActivity.d0(notificationsCustomSettingsActivity));
                        break;
                    case 7:
                    default:
                        h5Var = new org.telegram.ui.Cells.l8(context);
                        break;
                    case 8:
                        ?? l8Var = new org.telegram.ui.Cells.l8(context);
                        ImageView imageView = new ImageView(context);
                        l8Var.f45283a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28214v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131232130);
                        if (org.telegram.messenger.bd.f21784a0) {
                            i12 = 3;
                        }
                        l8Var.addView(imageView, b8.mf.d(24, 24.0f, i12 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        h5Var = l8Var;
                        break;
                }
                return new u4.d1(h5Var);
        }
    }

    @Override
    public void y(u4.d1 d1Var) {
        boolean B;
        gh0 gh0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f51837f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                int i3 = notificationsCustomSettingsActivity.f41339s;
                if (i3 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f41341x) != null && arrayList2.isEmpty())) {
                    if (i3 == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.f41337n;
                        if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f41341x) == null || arrayList.isEmpty())) {
                            B = false;
                        } else {
                            B = true;
                        }
                    } else {
                        B = notificationsCustomSettingsActivity.getNotificationsController().B(i3);
                    }
                    int b10 = d1Var.b();
                    View view = d1Var.f55540a;
                    if (b10 >= 0 && b10 < arrayList3.size()) {
                        gh0Var = (gh0) arrayList3.get(b10);
                    } else {
                        gh0Var = null;
                    }
                    if (gh0Var == null || gh0Var.f45663c != 102) {
                        int i10 = d1Var.f55544f;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 != 3) {
                                    if (i10 == 5) {
                                        ((org.telegram.ui.Cells.v9) view).a(null, B);
                                        return;
                                    }
                                    return;
                                }
                                ((org.telegram.ui.Cells.s8) view).a(null, B);
                                return;
                            }
                            ((org.telegram.ui.Cells.q8) view).e(null, B);
                            return;
                        }
                        ((org.telegram.ui.Cells.n4) view).a(null, B);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
