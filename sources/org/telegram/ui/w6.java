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
public final class w6 extends rg.b {
    public final int d;
    public final Context f50967e;
    public final org.telegram.ui.ActionBar.f2 f50968f;

    public w6(int i7, Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        this.d = i7;
        this.f50968f = f2Var;
        this.f50967e = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7;
        switch (this.d) {
            case 0:
                y6 y6Var = (y6) this.f50968f;
                if (d1Var.b() != y6Var.J && (((i7 = d1Var.f56956f) != 2 || y6Var.G <= 0 || y6Var.K) && i7 != 5 && i7 != 7 && i7 != 11)) {
                    return false;
                }
                return true;
            default:
                int i10 = d1Var.f56956f;
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
                return ((y6) this.f50968f).f52116f0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f50968f).I.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((u6) ((y6) this.f50968f).f52116f0.get(i7)).f54440a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f50968f;
                if (i7 >= 0 && i7 < notificationsCustomSettingsActivity.I.size()) {
                    return ((kh0) notificationsCustomSettingsActivity.I.get(i7)).f54440a;
                }
                return 5;
        }
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        long j3;
        String str;
        org.telegram.ui.Cells.m8 m8Var;
        float f10;
        float f11;
        boolean z9;
        String format;
        boolean z10;
        Boolean bool;
        boolean z11;
        float f12;
        int i11 = this.d;
        org.telegram.ui.ActionBar.f2 f2Var = this.f50968f;
        boolean z12 = true;
        switch (i11) {
            case 0:
                y6 y6Var = (y6) f2Var;
                ArrayList arrayList = y6Var.f52116f0;
                u6 u6Var = (u6) arrayList.get(i7);
                int i12 = d1Var.f56956f;
                View view = d1Var.f56952a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 7) {
                                    switch (i12) {
                                        case 9:
                                            y6Var.y0();
                                            return;
                                        case 10:
                                            k6 k6Var = y6Var.X;
                                            if (k6Var != null && !y6Var.K) {
                                                long j10 = y6Var.G;
                                                if (j10 <= 0) {
                                                    z12 = false;
                                                }
                                                long j11 = y6Var.H;
                                                int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                                if (i13 <= 0) {
                                                    f10 = 0.0f;
                                                } else {
                                                    f10 = ((float) j10) / ((float) j11);
                                                }
                                                long j12 = y6Var.I;
                                                if (j12 > 0 && i13 > 0) {
                                                    f11 = ((float) (j11 - j12)) / ((float) j11);
                                                } else {
                                                    f11 = 0.0f;
                                                }
                                                k6Var.b(f10, f11, z12);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                                            int i14 = u6Var.f50244f;
                                            if (i14 < 0) {
                                                z9 = y6Var.t0();
                                            } else {
                                                z9 = y6Var.d[i14];
                                            }
                                            boolean z13 = z9;
                                            CharSequence charSequence = u6Var.d;
                                            int[] iArr = y6Var.U;
                                            int i15 = u6Var.f50244f;
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
                                            spannableString.setSpan(new org.telegram.ui.Components.t31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                            spannableStringBuilder.append((CharSequence) "  ");
                                            spannableStringBuilder.append((CharSequence) spannableString);
                                            String i02 = org.telegram.messenger.g0.i0(u6Var.f50245g, false, false);
                                            if (u6Var.f50244f >= 0 ? !u6Var.f50247j : !y6Var.L) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            c2Var.e(spannableStringBuilder, i02, z13, z10, false);
                                            int i17 = u6Var.h;
                                            int i18 = org.telegram.ui.ActionBar.k6.f27978k7;
                                            org.telegram.ui.Components.wo woVar = c2Var.f28976r;
                                            if (woVar != null) {
                                                woVar.b(i17, i17, i18);
                                            }
                                            if (u6Var.f50244f < 0) {
                                                bool = Boolean.valueOf(y6Var.L);
                                            } else {
                                                bool = null;
                                            }
                                            c2Var.setCollapsed(bool);
                                            if (u6Var.f50244f == -1) {
                                                c2Var.d(new a(this, 6), new org.telegram.ui.ActionBar.l1(4, this, c2Var));
                                            } else {
                                                c2Var.d(null, null);
                                            }
                                            c2Var.setPad(u6Var.f50246i ? 1 : 0);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                                org.telegram.messenger.u2 u2Var = y6Var.getMessagesController().f24872r7;
                                int i19 = u6Var.f50242c;
                                int size = u2Var.d(((u6) arrayList.get(i7)).f50242c).size();
                                if (size > 0) {
                                    str = org.telegram.messenger.hd.G(size, "ExceptionShort", Integer.valueOf(size));
                                } else {
                                    str = null;
                                }
                                String f13 = org.telegram.messenger.u2.f(u2Var.c(i19));
                                if (((u6) arrayList.get(i7)).f50242c == 0) {
                                    m8Var = m8Var2;
                                    m8Var.r(org.telegram.messenger.hd.M0(2131746752, null), f13, true, 2131232149, -11565578, -13276952, true);
                                } else {
                                    m8Var = m8Var2;
                                    if (((u6) arrayList.get(i7)).f50242c == 1) {
                                        m8Var.r(org.telegram.messenger.hd.M0(2131749456, null), f13, true, 2131232148, -11154873, -14175180, true);
                                    } else if (((u6) arrayList.get(i7)).f50242c == 2) {
                                        m8Var.r(org.telegram.messenger.hd.M0(2131752650, null), f13, true, 2131232147, -1007845, -1996271, true);
                                    } else if (((u6) arrayList.get(i7)).f50242c == 3) {
                                        m8Var.r(org.telegram.messenger.hd.M0(2131752646, null), f13, false, 2131232154, -765355, -2148011, false);
                                    }
                                }
                                m8Var.setSubtitle(str);
                                return;
                            }
                            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                            n4Var.setText(((u6) arrayList.get(i7)).d);
                            ((u6) arrayList.get(i7)).getClass();
                            n4Var.setTopMargin(15);
                            ((u6) arrayList.get(i7)).getClass();
                            n4Var.setBottomMargin(0);
                            return;
                        }
                        final org.telegram.ui.Components.hw0 hw0Var = (org.telegram.ui.Components.hw0) view;
                        boolean z14 = y6Var.K;
                        long j13 = y6Var.f52113e;
                        long j14 = y6Var.G;
                        long j15 = y6Var.I;
                        long j16 = y6Var.H;
                        ab.q qVar = hw0Var.I;
                        View view2 = hw0Var.f34397x;
                        TextView textView = hw0Var.f34393n;
                        TextView textView2 = hw0Var.h;
                        TextView textView3 = hw0Var.f34396w;
                        org.telegram.ui.Cells.w9 w9Var = hw0Var.D;
                        hw0Var.f34391e = z14;
                        TextView textView4 = hw0Var.f34394r;
                        textView4.setText(org.telegram.messenger.hd.a0("TotalDeviceFreeSize", null, 2131743974, org.telegram.messenger.g0.i0(j15, false, false)));
                        TextView textView5 = hw0Var.f34395s;
                        long j17 = j16 - j15;
                        textView5.setText(org.telegram.messenger.hd.a0("TotalDeviceSize", null, 2131743973, org.telegram.messenger.g0.i0(j17, false, false)));
                        if (z14) {
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            textView4.setVisibility(8);
                            textView5.setVisibility(8);
                            textView.setVisibility(8);
                            view2.setVisibility(8);
                            w9Var.setVisibility(8);
                            hw0Var.E = 0.0f;
                            hw0Var.F = 0.0f;
                            if (qVar != null) {
                                qVar.c(textView3);
                            }
                        } else {
                            if (qVar != null) {
                                qVar.x(textView3);
                            }
                            textView3.setVisibility(8);
                            if (j14 > 0) {
                                i10 = 0;
                                view2.setVisibility(0);
                                w9Var.setVisibility(0);
                                textView2.setVisibility(0);
                                textView.setVisibility(8);
                                w9Var.c(org.telegram.messenger.hd.M0(2131752047, null), org.telegram.messenger.g0.i0(j14, false, false), false, true);
                                textView2.setText(org.telegram.messenger.hd.a0("TelegramCacheSize", null, 2131744247, org.telegram.messenger.g0.i0(j14 + j13, false, false)));
                                j3 = j13;
                            } else {
                                i10 = 0;
                                textView2.setVisibility(8);
                                textView.setVisibility(0);
                                j3 = j13;
                                textView.setText(org.telegram.messenger.hd.a0("LocalDatabaseSize", null, 2131748768, org.telegram.messenger.g0.i0(j3, false, false)));
                                view2.setVisibility(8);
                                w9Var.setVisibility(8);
                            }
                            textView4.setVisibility(i10);
                            textView5.setVisibility(i10);
                            float f14 = (float) j16;
                            float f15 = ((float) (j14 + j3)) / f14;
                            float f16 = ((float) j17) / f14;
                            if (hw0Var.E != f15) {
                                ValueAnimator valueAnimator = hw0Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(hw0Var.E, f15);
                                hw0Var.G = ofFloat;
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        switch (r2) {
                                            case 0:
                                                hw0 hw0Var2 = hw0Var;
                                                hw0Var2.getClass();
                                                hw0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                hw0Var2.invalidate();
                                                return;
                                            default:
                                                hw0 hw0Var3 = hw0Var;
                                                hw0Var3.getClass();
                                                hw0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                hw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                hw0Var.G.start();
                            }
                            if (hw0Var.F != f16) {
                                ValueAnimator valueAnimator2 = hw0Var.H;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(hw0Var.F, f16);
                                hw0Var.H = ofFloat2;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                        switch (r2) {
                                            case 0:
                                                hw0 hw0Var2 = hw0Var;
                                                hw0Var2.getClass();
                                                hw0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                hw0Var2.invalidate();
                                                return;
                                            default:
                                                hw0 hw0Var3 = hw0Var;
                                                hw0Var3.getClass();
                                                hw0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                hw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                hw0Var.H.start();
                            }
                        }
                        org.telegram.ui.ActionBar.r6.V(w9Var.getTextView(), org.telegram.ui.ActionBar.k6.G6, null);
                        hw0Var.requestLayout();
                        return;
                    }
                    ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.g0.X2(u6Var.f50243e));
                    return;
                }
                org.telegram.ui.Cells.w9 w9Var2 = (org.telegram.ui.Cells.w9) view;
                if (i7 == y6Var.J) {
                    w9Var2.c(org.telegram.messenger.hd.M0(2131748433, null), null, false, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) f2Var).I;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    kh0 kh0Var = (kh0) arrayList2.get(i7);
                    int i20 = i7 + 1;
                    if (i20 < arrayList2.size() && ((kh0) arrayList2.get(i20)).f54440a != 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i21 = d1Var.f56956f;
                    View view3 = d1Var.f56952a;
                    switch (i21) {
                        case 0:
                            ((org.telegram.ui.Cells.n4) view3).setText(kh0Var.f47193e);
                            return;
                        case 1:
                            ((org.telegram.ui.Cells.r8) view3).f("" + ((Object) kh0Var.f47193e), kh0Var.f47196i, z11);
                            return;
                        case 2:
                            ((org.telegram.ui.Cells.pa) view3).f(kh0Var.f47195g, null, z11);
                            return;
                        case 3:
                            ((org.telegram.ui.Cells.t8) view3).b(kh0Var.h, "" + ((Object) kh0Var.f47193e), z11);
                            return;
                        case 4:
                            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view3;
                            if (kh0Var.f47193e == null) {
                                z8Var.setFixedSize(12);
                                z8Var.setText(null);
                                return;
                            }
                            z8Var.setFixedSize(0);
                            z8Var.setText(kh0Var.f47193e);
                            return;
                        case 5:
                            ((org.telegram.ui.Cells.w9) view3).c(kh0Var.f47193e, kh0Var.f47194f, false, z11);
                            return;
                        case 6:
                            org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view3;
                            h5Var.setDrawLine(true);
                            h5Var.setChecked(kh0Var.f47196i);
                            h5Var.b(kh0Var.f47193e, kh0Var.f47194f, kh0Var.d, kh0Var.f47196i, 0, false, z11, true);
                            return;
                        case 7:
                            org.telegram.ui.Cells.m8 m8Var3 = (org.telegram.ui.Cells.m8) view3;
                            if (kh0Var.d == 0) {
                                m8Var3.g(-1, org.telegram.ui.ActionBar.k6.f28069p7);
                                m8Var3.k("" + ((Object) kh0Var.f47193e), z11);
                                return;
                            }
                            m8Var3.g(org.telegram.ui.ActionBar.k6.f28183v6, org.telegram.ui.ActionBar.k6.f28164u6);
                            m8Var3.o(kh0Var.d, "" + ((Object) kh0Var.f47193e), z11);
                            return;
                        case 8:
                            jh0 jh0Var = (jh0) view3;
                            jh0Var.g(org.telegram.ui.ActionBar.k6.f28183v6, org.telegram.ui.ActionBar.k6.f28164u6);
                            CharSequence charSequence2 = kh0Var.f47193e;
                            if (kh0Var.d != 1) {
                                z12 = false;
                            }
                            ViewPropertyAnimator animate = jh0Var.W.animate();
                            if (z12) {
                                f12 = 0.0f;
                            } else {
                                f12 = 180.0f;
                            }
                            org.telegram.messenger.camera.q.l(animate.rotation(f12), org.telegram.ui.Components.xq.h, 340L);
                            jh0Var.k(charSequence2, z11);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.lz lzVar;
        int i10;
        View ecVar;
        v6 v6Var;
        FrameLayout h5Var;
        int i11 = this.d;
        int i12 = 5;
        Context context = this.f50967e;
        org.telegram.ui.ActionBar.f2 f2Var = this.f50968f;
        switch (i11) {
            case 0:
                y6 y6Var = (y6) f2Var;
                if (i7 != 0) {
                    switch (i7) {
                        case 2:
                            ?? frameLayout = new FrameLayout(context);
                            Paint paint = new Paint(1);
                            frameLayout.f34388a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            frameLayout.f34389b = paint3;
                            Paint paint4 = new Paint(1);
                            frameLayout.f34390c = paint4;
                            frameLayout.d = new Paint();
                            org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(220, 255);
                            frameLayout.L = nVar;
                            frameLayout.setWillNotDraw(false);
                            nVar.f39322k = false;
                            paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint3.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint4.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            bi.ec ecVar2 = new bi.ec(28, context, frameLayout);
                            frameLayout.f34392f = ecVar2;
                            frameLayout.addView(ecVar2, c8.ha.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            frameLayout.addView(linearLayout, c8.ha.c(-2.0f, -1));
                            di.a4 a4Var = new di.a4(context, 21);
                            linearLayout.addView(a4Var, c8.ha.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            frameLayout.f34396w = textView;
                            int i13 = org.telegram.ui.ActionBar.k6.f28240y6;
                            org.telegram.ui.ActionBar.r6.V(textView, i13, null);
                            String M0 = org.telegram.messenger.hd.M0(2131752643, "CalculatingSize");
                            int indexOf = M0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(M0);
                                ab.q qVar = new ab.q(textView);
                                frameLayout.I = qVar;
                                qVar.E(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(M0);
                            }
                            TextView textView2 = new TextView(context);
                            frameLayout.h = textView2;
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView2, i13, null);
                            TextView textView3 = new TextView(context);
                            frameLayout.f34393n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView3, i13, null);
                            TextView textView4 = new TextView(context);
                            frameLayout.f34394r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView4, i13, null);
                            TextView textView5 = new TextView(context);
                            frameLayout.f34395s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.r6.V(textView5, i13, null);
                            frameLayout.f34398y = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f34398y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f34398y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f34398y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f34398y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            a4Var.addView(textView, c8.ha.c(-2.0f, -2));
                            a4Var.addView(textView3, c8.ha.c(-2.0f, -2));
                            a4Var.addView(textView2, c8.ha.c(-2.0f, -2));
                            a4Var.addView(textView5, c8.ha.c(-2.0f, -2));
                            a4Var.addView(textView4, c8.ha.c(-2.0f, -2));
                            View view = new View(frameLayout.getContext());
                            frameLayout.f34397x = view;
                            linearLayout.addView(view, c8.ha.t(-1, -2, 0, 21, 0, 0, 0));
                            view.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d7, view, null);
                            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(frameLayout.getContext());
                            frameLayout.D = w9Var;
                            linearLayout.addView(w9Var, c8.ha.o(-1, -2));
                            lzVar = frameLayout;
                            break;
                        case 3:
                            lzVar = new org.telegram.ui.Cells.n4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.vt0 vt0Var = new org.telegram.ui.Components.vt0(context, null);
                            vt0Var.setCallback(new org.telegram.messenger.ch(15));
                            int i14 = org.telegram.messenger.iz.G;
                            if (i14 == 3) {
                                i10 = 0;
                            } else {
                                i10 = i14 + 1;
                            }
                            vt0Var.b(i10, null, org.telegram.messenger.hd.G(3, "Days", new Object[0]), org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), org.telegram.messenger.hd.G(1, "Months", new Object[0]), org.telegram.messenger.hd.M0(2131749058, null));
                            lzVar = vt0Var;
                            break;
                        case 5:
                            lzVar = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.lz lzVar2 = new org.telegram.ui.Components.lz(y6Var.getParentActivity(), null);
                            lzVar2.setIsSingleCell(true);
                            lzVar2.setItemsCount(3);
                            lzVar2.setIgnoreHeightCheck(true);
                            lzVar2.setViewType(25);
                            lzVar = lzVar2;
                            break;
                        case 7:
                            lzVar = new org.telegram.ui.Cells.m8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.ht0 ht0Var = y6Var.f52109b0;
                            ht0Var.getClass();
                            ecVar = new bi.ec(25, context, ht0Var);
                            ecVar.setTag(-33024);
                            ecVar.setLayoutParams(new v4.o0(-1, -1));
                            lzVar = ecVar;
                            break;
                        case 9:
                            v6 v6Var2 = new v6(this, context);
                            y6Var.W = v6Var2;
                            v6Var2.setTag(-33024);
                            v6Var = v6Var2;
                            lzVar = v6Var;
                            break;
                        case 10:
                            k6 k6Var = new k6(y6Var, context);
                            y6Var.X = k6Var;
                            k6Var.setTag(-33024);
                            v6Var = k6Var;
                            lzVar = v6Var;
                            break;
                        case 11:
                            ecVar = new org.telegram.ui.Cells.c2(this.f50967e, 4, 21, false, y6Var.getResourceProvider());
                            lzVar = ecVar;
                            break;
                        case 12:
                            org.telegram.ui.Components.lz lzVar3 = new org.telegram.ui.Components.lz(y6Var.getParentActivity(), null);
                            lzVar3.setIsSingleCell(true);
                            lzVar3.setItemsCount(1);
                            lzVar3.setIgnoreHeightCheck(true);
                            lzVar3.setViewType(26);
                            lzVar = lzVar3;
                            break;
                        case 13:
                            q6 q6Var = new q6(y6Var, context);
                            y6Var.Y = q6Var;
                            lzVar = q6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.vt0 vt0Var2 = new org.telegram.ui.Components.vt0(context, null);
                            float f10 = ((int) ((y6Var.H / 1024) / 1024)) / 1000.0f;
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
                                    strArr[i15] = org.telegram.messenger.hd.M0(2131748201, null);
                                } else {
                                    strArr[i15] = String.format("%d GB", arrayList.get(i15));
                                }
                            }
                            vt0Var2.setCallback(new w0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.iz.q().getInt("cache_limit", Integer.MAX_VALUE)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            vt0Var2.b(indexOf2, null, strArr);
                            lzVar = vt0Var2;
                            break;
                        default:
                            lzVar = new org.telegram.ui.Cells.z8(context);
                            break;
                    }
                } else {
                    lzVar = new org.telegram.ui.Cells.w9(context);
                }
                return new v4.d1(lzVar);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) f2Var;
                switch (i7) {
                    case 0:
                        h5Var = new org.telegram.ui.Cells.n4(context);
                        break;
                    case 1:
                        h5Var = new org.telegram.ui.Cells.r8(context);
                        break;
                    case 2:
                        h5Var = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                        break;
                    case 3:
                        h5Var = new org.telegram.ui.Cells.t8(context, null);
                        break;
                    case 4:
                        h5Var = new org.telegram.ui.Cells.z8(context);
                        break;
                    case 5:
                        h5Var = new org.telegram.ui.Cells.w9(context);
                        break;
                    case 6:
                        h5Var = new org.telegram.ui.Cells.h5(this.f50967e, 21, 64, true, NotificationsCustomSettingsActivity.d0(notificationsCustomSettingsActivity));
                        break;
                    case 7:
                    default:
                        h5Var = new org.telegram.ui.Cells.m8(context);
                        break;
                    case 8:
                        ?? m8Var = new org.telegram.ui.Cells.m8(context);
                        ImageView imageView = new ImageView(context);
                        m8Var.W = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28183v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131232130);
                        if (org.telegram.messenger.hd.f22871a0) {
                            i12 = 3;
                        }
                        m8Var.addView(imageView, c8.ha.d(24, 24.0f, i12 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        h5Var = m8Var;
                        break;
                }
                return new v4.d1(h5Var);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        boolean B;
        kh0 kh0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f50968f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
                int i7 = notificationsCustomSettingsActivity.f41307s;
                if (i7 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f41309x) != null && arrayList2.isEmpty())) {
                    if (i7 == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.f41305n;
                        if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f41309x) == null || arrayList.isEmpty())) {
                            B = false;
                        } else {
                            B = true;
                        }
                    } else {
                        B = notificationsCustomSettingsActivity.getNotificationsController().B(i7);
                    }
                    int b10 = d1Var.b();
                    View view = d1Var.f56952a;
                    if (b10 >= 0 && b10 < arrayList3.size()) {
                        kh0Var = (kh0) arrayList3.get(b10);
                    } else {
                        kh0Var = null;
                    }
                    if (kh0Var == null || kh0Var.f47192c != 102) {
                        int i10 = d1Var.f56956f;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 != 3) {
                                    if (i10 == 5) {
                                        ((org.telegram.ui.Cells.w9) view).a(null, B);
                                        return;
                                    }
                                    return;
                                }
                                ((org.telegram.ui.Cells.t8) view).a(null, B);
                                return;
                            }
                            ((org.telegram.ui.Cells.r8) view).e(null, B);
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
