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
public final class v6 extends rg.b {
    public final int d;
    public final Context f52736e;
    public final org.telegram.ui.ActionBar.g2 f52737f;

    public v6(int i7, Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = i7;
        this.f52737f = g2Var;
        this.f52736e = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7;
        switch (this.d) {
            case 0:
                x6 x6Var = (x6) this.f52737f;
                if (f1Var.b() != x6Var.K && (((i7 = f1Var.f59169f) != 2 || x6Var.H <= 0 || x6Var.L) && i7 != 5 && i7 != 7 && i7 != 11)) {
                    return false;
                }
                return true;
            default:
                int i10 = f1Var.f59169f;
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
                return ((x6) this.f52737f).f53659g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f52737f).J.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((t6) ((x6) this.f52737f).f53659g0.get(i7)).f56634a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f52737f;
                if (i7 >= 0 && i7 < notificationsCustomSettingsActivity.J.size()) {
                    return ((qh0) notificationsCustomSettingsActivity.J.get(i7)).f56634a;
                }
                return 5;
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        String str;
        org.telegram.ui.Cells.n8 n8Var;
        float f10;
        float f11;
        boolean z10;
        String format;
        boolean z11;
        Boolean bool;
        boolean z12;
        float f12;
        int i11 = this.d;
        org.telegram.ui.ActionBar.g2 g2Var = this.f52737f;
        boolean z13 = true;
        switch (i11) {
            case 0:
                x6 x6Var = (x6) g2Var;
                ArrayList arrayList = x6Var.f53659g0;
                t6 t6Var = (t6) arrayList.get(i7);
                int i12 = f1Var.f59169f;
                View view = f1Var.f59165a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 7) {
                                    switch (i12) {
                                        case 9:
                                            x6Var.y0();
                                            return;
                                        case 10:
                                            k6 k6Var = x6Var.Y;
                                            if (k6Var != null && !x6Var.L) {
                                                long j3 = x6Var.H;
                                                if (j3 <= 0) {
                                                    z13 = false;
                                                }
                                                long j10 = x6Var.I;
                                                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                                if (i13 <= 0) {
                                                    f10 = 0.0f;
                                                } else {
                                                    f10 = ((float) j3) / ((float) j10);
                                                }
                                                long j11 = x6Var.J;
                                                if (j11 > 0 && i13 > 0) {
                                                    f11 = ((float) (j10 - j11)) / ((float) j10);
                                                } else {
                                                    f11 = 0.0f;
                                                }
                                                k6Var.b(f10, f11, z13);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                                            int i14 = t6Var.f52238f;
                                            if (i14 < 0) {
                                                z10 = x6Var.t0();
                                            } else {
                                                z10 = x6Var.d[i14];
                                            }
                                            boolean z14 = z10;
                                            CharSequence charSequence = t6Var.d;
                                            int[] iArr = x6Var.V;
                                            int i15 = t6Var.f52238f;
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
                                            spannableString.setSpan(new org.telegram.ui.Components.l41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                            spannableStringBuilder.append((CharSequence) "  ");
                                            spannableStringBuilder.append((CharSequence) spannableString);
                                            String i02 = org.telegram.messenger.g0.i0(t6Var.f52239g, false, false);
                                            if (t6Var.f52238f >= 0 ? !t6Var.f52241j : !x6Var.M) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            d2Var.e(spannableStringBuilder, i02, z14, z11, false);
                                            int i17 = t6Var.h;
                                            int i18 = org.telegram.ui.ActionBar.m6.f29511k7;
                                            org.telegram.ui.Components.op opVar = d2Var.f30562r;
                                            if (opVar != null) {
                                                opVar.b(i17, i17, i18);
                                            }
                                            if (t6Var.f52238f < 0) {
                                                bool = Boolean.valueOf(x6Var.M);
                                            } else {
                                                bool = null;
                                            }
                                            d2Var.setCollapsed(bool);
                                            if (t6Var.f52238f == -1) {
                                                d2Var.d(new a(this, 6), new oi.i1(6, this, d2Var));
                                            } else {
                                                d2Var.d(null, null);
                                            }
                                            d2Var.setPad(t6Var.f52240i ? 1 : 0);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                org.telegram.ui.Cells.n8 n8Var2 = (org.telegram.ui.Cells.n8) view;
                                org.telegram.messenger.v2 v2Var = x6Var.getMessagesController().f25977u7;
                                int i19 = t6Var.f52236c;
                                int size = v2Var.d(((t6) arrayList.get(i7)).f52236c).size();
                                if (size > 0) {
                                    str = org.telegram.messenger.hd.G(size, "ExceptionShort", Integer.valueOf(size));
                                } else {
                                    str = null;
                                }
                                String f13 = org.telegram.messenger.v2.f(v2Var.c(i19));
                                if (((t6) arrayList.get(i7)).f52236c == 0) {
                                    n8Var = n8Var2;
                                    n8Var.r(org.telegram.messenger.hd.N0(2131746559, null), f13, true, 2131232151, -11565578, -13276952, true);
                                } else {
                                    n8Var = n8Var2;
                                    if (((t6) arrayList.get(i7)).f52236c == 1) {
                                        n8Var.r(org.telegram.messenger.hd.N0(2131749264, null), f13, true, 2131232150, -11154873, -14175180, true);
                                    } else if (((t6) arrayList.get(i7)).f52236c == 2) {
                                        n8Var.r(org.telegram.messenger.hd.N0(2131752638, null), f13, true, 2131232149, -1007845, -1996271, true);
                                    } else if (((t6) arrayList.get(i7)).f52236c == 3) {
                                        n8Var.r(org.telegram.messenger.hd.N0(2131752634, null), f13, false, 2131232156, -765355, -2148011, false);
                                    }
                                }
                                n8Var.setSubtitle(str);
                                return;
                            }
                            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                            o4Var.setText(((t6) arrayList.get(i7)).d);
                            ((t6) arrayList.get(i7)).getClass();
                            o4Var.setTopMargin(15);
                            ((t6) arrayList.get(i7)).getClass();
                            o4Var.setBottomMargin(0);
                            return;
                        }
                        final org.telegram.ui.Components.tw0 tw0Var = (org.telegram.ui.Components.tw0) view;
                        boolean z15 = x6Var.L;
                        long j12 = x6Var.f53655e;
                        long j13 = x6Var.H;
                        long j14 = x6Var.J;
                        long j15 = x6Var.I;
                        ab.q qVar = tw0Var.J;
                        View view2 = tw0Var.f40075x;
                        TextView textView = tw0Var.f40071n;
                        TextView textView2 = tw0Var.h;
                        TextView textView3 = tw0Var.f40074w;
                        org.telegram.ui.Cells.x9 x9Var = tw0Var.E;
                        tw0Var.f40069e = z15;
                        TextView textView4 = tw0Var.f40072r;
                        textView4.setText(org.telegram.messenger.hd.a0("TotalDeviceFreeSize", null, 2131743728, org.telegram.messenger.g0.i0(j14, false, false)));
                        TextView textView5 = tw0Var.f40073s;
                        long j16 = j15 - j14;
                        textView5.setText(org.telegram.messenger.hd.a0("TotalDeviceSize", null, 2131743727, org.telegram.messenger.g0.i0(j16, false, false)));
                        if (z15) {
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            textView4.setVisibility(8);
                            textView5.setVisibility(8);
                            textView.setVisibility(8);
                            view2.setVisibility(8);
                            x9Var.setVisibility(8);
                            tw0Var.F = 0.0f;
                            tw0Var.G = 0.0f;
                            if (qVar != null) {
                                qVar.c(textView3);
                            }
                        } else {
                            if (qVar != null) {
                                qVar.y(textView3);
                            }
                            textView3.setVisibility(8);
                            if (j13 > 0) {
                                i10 = 0;
                                view2.setVisibility(0);
                                x9Var.setVisibility(0);
                                textView2.setVisibility(0);
                                textView.setVisibility(8);
                                x9Var.c(org.telegram.messenger.hd.N0(2131752035, null), org.telegram.messenger.g0.i0(j13, false, false), false, true);
                                textView2.setText(org.telegram.messenger.hd.a0("TelegramCacheSize", null, 2131744003, org.telegram.messenger.g0.i0(j13 + j12, false, false)));
                            } else {
                                i10 = 0;
                                textView2.setVisibility(8);
                                textView.setVisibility(0);
                                textView.setText(org.telegram.messenger.hd.a0("LocalDatabaseSize", null, 2131748576, org.telegram.messenger.g0.i0(j12, false, false)));
                                view2.setVisibility(8);
                                x9Var.setVisibility(8);
                            }
                            textView4.setVisibility(i10);
                            textView5.setVisibility(i10);
                            float f14 = (float) j15;
                            float f15 = ((float) (j13 + j12)) / f14;
                            float f16 = ((float) j16) / f14;
                            if (tw0Var.F != f15) {
                                ValueAnimator valueAnimator = tw0Var.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(tw0Var.F, f15);
                                tw0Var.H = ofFloat;
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        switch (r2) {
                                            case 0:
                                                tw0 tw0Var2 = tw0Var;
                                                tw0Var2.getClass();
                                                tw0Var2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                tw0Var2.invalidate();
                                                return;
                                            default:
                                                tw0 tw0Var3 = tw0Var;
                                                tw0Var3.getClass();
                                                tw0Var3.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                tw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                tw0Var.H.start();
                            }
                            if (tw0Var.G != f16) {
                                ValueAnimator valueAnimator2 = tw0Var.I;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(tw0Var.G, f16);
                                tw0Var.I = ofFloat2;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                        switch (r2) {
                                            case 0:
                                                tw0 tw0Var2 = tw0Var;
                                                tw0Var2.getClass();
                                                tw0Var2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                tw0Var2.invalidate();
                                                return;
                                            default:
                                                tw0 tw0Var3 = tw0Var;
                                                tw0Var3.getClass();
                                                tw0Var3.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                tw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                tw0Var.I.start();
                            }
                        }
                        org.telegram.ui.ActionBar.t6.U(x9Var.getTextView(), org.telegram.ui.ActionBar.m6.G6, null);
                        tw0Var.requestLayout();
                        return;
                    }
                    ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.g0.W2(t6Var.f52237e));
                    return;
                }
                org.telegram.ui.Cells.x9 x9Var2 = (org.telegram.ui.Cells.x9) view;
                if (i7 == x6Var.K) {
                    x9Var2.c(org.telegram.messenger.hd.N0(2131748241, null), null, false, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) g2Var).J;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    qh0 qh0Var = (qh0) arrayList2.get(i7);
                    int i20 = i7 + 1;
                    if (i20 < arrayList2.size() && ((qh0) arrayList2.get(i20)).f56634a != 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i21 = f1Var.f59169f;
                    View view3 = f1Var.f59165a;
                    switch (i21) {
                        case 0:
                            ((org.telegram.ui.Cells.o4) view3).setText(qh0Var.f51285e);
                            return;
                        case 1:
                            ((org.telegram.ui.Cells.s8) view3).f("" + ((Object) qh0Var.f51285e), qh0Var.f51288i, z12);
                            return;
                        case 2:
                            ((org.telegram.ui.Cells.ra) view3).f(qh0Var.f51287g, null, z12);
                            return;
                        case 3:
                            ((org.telegram.ui.Cells.u8) view3).b(qh0Var.h, "" + ((Object) qh0Var.f51285e), z12);
                            return;
                        case 4:
                            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view3;
                            if (qh0Var.f51285e == null) {
                                a9Var.setFixedSize(12);
                                a9Var.setText(null);
                                return;
                            }
                            a9Var.setFixedSize(0);
                            a9Var.setText(qh0Var.f51285e);
                            return;
                        case 5:
                            ((org.telegram.ui.Cells.x9) view3).c(qh0Var.f51285e, qh0Var.f51286f, false, z12);
                            return;
                        case 6:
                            org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view3;
                            j5Var.setDrawLine(true);
                            j5Var.setChecked(qh0Var.f51288i);
                            j5Var.b(qh0Var.f51285e, qh0Var.f51286f, qh0Var.d, qh0Var.f51288i, 0, false, z12, true);
                            return;
                        case 7:
                            org.telegram.ui.Cells.n8 n8Var3 = (org.telegram.ui.Cells.n8) view3;
                            if (qh0Var.d == 0) {
                                n8Var3.g(-1, org.telegram.ui.ActionBar.m6.f29602p7);
                                n8Var3.k("" + ((Object) qh0Var.f51285e), z12);
                                return;
                            }
                            n8Var3.g(org.telegram.ui.ActionBar.m6.f29716v6, org.telegram.ui.ActionBar.m6.f29697u6);
                            n8Var3.o(qh0Var.d, "" + ((Object) qh0Var.f51285e), z12);
                            return;
                        case 8:
                            ph0 ph0Var = (ph0) view3;
                            ph0Var.g(org.telegram.ui.ActionBar.m6.f29716v6, org.telegram.ui.ActionBar.m6.f29697u6);
                            CharSequence charSequence2 = qh0Var.f51285e;
                            if (qh0Var.d != 1) {
                                z13 = false;
                            }
                            ViewPropertyAnimator animate = ph0Var.f50886a0.animate();
                            if (z13) {
                                f12 = 0.0f;
                            } else {
                                f12 = 180.0f;
                            }
                            org.telegram.messenger.o10.o(animate.rotation(f12), org.telegram.ui.Components.nr.h, 340L);
                            ph0Var.k(charSequence2, z12);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Components.yz yzVar;
        int i10;
        u6 u6Var;
        FrameLayout j5Var;
        int i11 = this.d;
        int i12 = 5;
        Context context = this.f52736e;
        org.telegram.ui.ActionBar.g2 g2Var = this.f52737f;
        switch (i11) {
            case 0:
                x6 x6Var = (x6) g2Var;
                if (i7 != 0) {
                    switch (i7) {
                        case 2:
                            ?? frameLayout = new FrameLayout(context);
                            Paint paint = new Paint(1);
                            frameLayout.f40066a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            frameLayout.f40067b = paint3;
                            Paint paint4 = new Paint(1);
                            frameLayout.f40068c = paint4;
                            frameLayout.d = new Paint();
                            org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(220, 255);
                            frameLayout.M = nVar;
                            frameLayout.setWillNotDraw(false);
                            nVar.f41191k = false;
                            paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint3.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint4.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            bi.m3 m3Var = new bi.m3(29, context, frameLayout);
                            frameLayout.f40070f = m3Var;
                            frameLayout.addView(m3Var, c8.ma.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            frameLayout.addView(linearLayout, c8.ma.c(-2.0f, -1));
                            bi.t2 t2Var = new bi.t2(context, 23);
                            linearLayout.addView(t2Var, c8.ma.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            frameLayout.f40074w = textView;
                            int i13 = org.telegram.ui.ActionBar.m6.f29773y6;
                            org.telegram.ui.ActionBar.t6.U(textView, i13, null);
                            String N0 = org.telegram.messenger.hd.N0(2131752631, "CalculatingSize");
                            int indexOf = N0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(N0);
                                ab.q qVar = new ab.q(textView);
                                frameLayout.J = qVar;
                                qVar.F(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(N0);
                            }
                            TextView textView2 = new TextView(context);
                            frameLayout.h = textView2;
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.t6.U(textView2, i13, null);
                            TextView textView3 = new TextView(context);
                            frameLayout.f40071n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.t6.U(textView3, i13, null);
                            TextView textView4 = new TextView(context);
                            frameLayout.f40072r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.t6.U(textView4, i13, null);
                            TextView textView5 = new TextView(context);
                            frameLayout.f40073s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.t6.U(textView5, i13, null);
                            frameLayout.f40076y = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Mj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f40076y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f40076y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f40076y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f40076y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            t2Var.addView(textView, c8.ma.c(-2.0f, -2));
                            t2Var.addView(textView3, c8.ma.c(-2.0f, -2));
                            t2Var.addView(textView2, c8.ma.c(-2.0f, -2));
                            t2Var.addView(textView5, c8.ma.c(-2.0f, -2));
                            t2Var.addView(textView4, c8.ma.c(-2.0f, -2));
                            View view = new View(frameLayout.getContext());
                            frameLayout.f40075x = view;
                            linearLayout.addView(view, c8.ma.t(-1, -2, 0, 21, 0, 0, 0));
                            view.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29382d7, view, null);
                            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(frameLayout.getContext());
                            frameLayout.E = x9Var;
                            linearLayout.addView(x9Var, c8.ma.o(-1, -2));
                            yzVar = frameLayout;
                            break;
                        case 3:
                            yzVar = new org.telegram.ui.Cells.o4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.hu0 hu0Var = new org.telegram.ui.Components.hu0(context, null);
                            hu0Var.setCallback(new org.telegram.messenger.fd(20));
                            int i14 = org.telegram.messenger.cz.G;
                            if (i14 == 3) {
                                i10 = 0;
                            } else {
                                i10 = i14 + 1;
                            }
                            hu0Var.b(i10, null, org.telegram.messenger.hd.G(3, "Days", new Object[0]), org.telegram.messenger.hd.G(1, "Weeks", new Object[0]), org.telegram.messenger.hd.G(1, "Months", new Object[0]), org.telegram.messenger.hd.N0(2131748866, null));
                            yzVar = hu0Var;
                            break;
                        case 5:
                            yzVar = new w6(x6Var.getParentActivity(), x6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.yz yzVar2 = new org.telegram.ui.Components.yz(x6Var.getParentActivity(), null);
                            yzVar2.setIsSingleCell(true);
                            yzVar2.setItemsCount(3);
                            yzVar2.setIgnoreHeightCheck(true);
                            yzVar2.setViewType(25);
                            yzVar = yzVar2;
                            break;
                        case 7:
                            yzVar = new org.telegram.ui.Cells.n8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.tt0 tt0Var = x6Var.f53653c0;
                            tt0Var.getClass();
                            View m3Var2 = new bi.m3(26, context, tt0Var);
                            m3Var2.setTag(-33024);
                            m3Var2.setLayoutParams(new v4.q0(-1, -1));
                            yzVar = m3Var2;
                            break;
                        case 9:
                            u6 u6Var2 = new u6(this, context);
                            x6Var.X = u6Var2;
                            u6Var2.setTag(-33024);
                            u6Var = u6Var2;
                            yzVar = u6Var;
                            break;
                        case 10:
                            k6 k6Var = new k6(x6Var, context);
                            x6Var.Y = k6Var;
                            k6Var.setTag(-33024);
                            u6Var = k6Var;
                            yzVar = u6Var;
                            break;
                        case 11:
                            yzVar = new org.telegram.ui.Cells.d2(this.f52736e, 4, 21, false, x6Var.getResourceProvider());
                            break;
                        case 12:
                            org.telegram.ui.Components.yz yzVar3 = new org.telegram.ui.Components.yz(x6Var.getParentActivity(), null);
                            yzVar3.setIsSingleCell(true);
                            yzVar3.setItemsCount(1);
                            yzVar3.setIgnoreHeightCheck(true);
                            yzVar3.setViewType(26);
                            yzVar = yzVar3;
                            break;
                        case 13:
                            p6 p6Var = new p6(x6Var, context);
                            x6Var.Z = p6Var;
                            yzVar = p6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.hu0 hu0Var2 = new org.telegram.ui.Components.hu0(context, null);
                            float f10 = ((int) ((x6Var.I / 1024) / 1024)) / 1000.0f;
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
                                    strArr[i15] = org.telegram.messenger.hd.N0(2131748009, null);
                                } else {
                                    strArr[i15] = String.format("%d GB", arrayList.get(i15));
                                }
                            }
                            hu0Var2.setCallback(new w0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.cz.q().getInt("cache_limit", Integer.MAX_VALUE)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            hu0Var2.b(indexOf2, null, strArr);
                            yzVar = hu0Var2;
                            break;
                        default:
                            yzVar = new org.telegram.ui.Cells.a9(context);
                            break;
                    }
                } else {
                    yzVar = new org.telegram.ui.Cells.x9(context);
                }
                return new v4.f1(yzVar);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) g2Var;
                switch (i7) {
                    case 0:
                        j5Var = new org.telegram.ui.Cells.o4(context);
                        break;
                    case 1:
                        j5Var = new org.telegram.ui.Cells.s8(context);
                        break;
                    case 2:
                        j5Var = new org.telegram.ui.Cells.ra(context, 6, 0, false);
                        break;
                    case 3:
                        j5Var = new org.telegram.ui.Cells.u8(context, null);
                        break;
                    case 4:
                        j5Var = new org.telegram.ui.Cells.a9(context);
                        break;
                    case 5:
                        j5Var = new org.telegram.ui.Cells.x9(context);
                        break;
                    case 6:
                        j5Var = new org.telegram.ui.Cells.j5(this.f52736e, 21, 64, true, NotificationsCustomSettingsActivity.d0(notificationsCustomSettingsActivity));
                        break;
                    case 7:
                    default:
                        j5Var = new org.telegram.ui.Cells.n8(context);
                        break;
                    case 8:
                        ?? n8Var = new org.telegram.ui.Cells.n8(context);
                        ImageView imageView = new ImageView(context);
                        n8Var.f50886a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f29716v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131232132);
                        if (org.telegram.messenger.hd.f24444a0) {
                            i12 = 3;
                        }
                        n8Var.addView(imageView, c8.ma.d(24, 24.0f, i12 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        j5Var = n8Var;
                        break;
                }
                return new v4.f1(j5Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        boolean B;
        qh0 qh0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f52737f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                int i7 = notificationsCustomSettingsActivity.f43168s;
                if (i7 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f43170x) != null && arrayList2.isEmpty())) {
                    if (i7 == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.f43166n;
                        if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f43170x) == null || arrayList.isEmpty())) {
                            B = false;
                        } else {
                            B = true;
                        }
                    } else {
                        B = notificationsCustomSettingsActivity.getNotificationsController().B(i7);
                    }
                    int b10 = f1Var.b();
                    View view = f1Var.f59165a;
                    if (b10 >= 0 && b10 < arrayList3.size()) {
                        qh0Var = (qh0) arrayList3.get(b10);
                    } else {
                        qh0Var = null;
                    }
                    if (qh0Var == null || qh0Var.f51284c != 102) {
                        int i10 = f1Var.f59169f;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 != 3) {
                                    if (i10 == 5) {
                                        ((org.telegram.ui.Cells.x9) view).a(null, B);
                                        return;
                                    }
                                    return;
                                }
                                ((org.telegram.ui.Cells.u8) view).a(null, B);
                                return;
                            }
                            ((org.telegram.ui.Cells.s8) view).e(null, B);
                            return;
                        }
                        ((org.telegram.ui.Cells.o4) view).a(null, B);
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
