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
public final class w6 extends hg.c {
    public final int d;
    public final Context e;
    public final org.telegram.ui.ActionBar.k2 f42676f;

    public w6(int i10, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        this.d = i10;
        this.f42676f = k2Var;
        this.e = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        switch (this.d) {
            case 0:
                y6 y6Var = (y6) this.f42676f;
                if (c1Var.b() != y6Var.J && (((i10 = c1Var.f47912f) != 2 || y6Var.G <= 0 || y6Var.K) && i10 != 5 && i10 != 7 && i10 != 11)) {
                    return false;
                }
                return true;
            default:
                int i11 = c1Var.f47912f;
                if (i11 != 0 && i11 != 4) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        switch (this.d) {
            case 0:
                return ((y6) this.f42676f).f43580f0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f42676f).I.size();
        }
    }

    @Override
    public final int d(int i10) {
        switch (this.d) {
            case 0:
                return ((u6) ((y6) this.f42676f).f43580f0.get(i10)).f7681a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f42676f;
                if (i10 >= 0 && i10 < notificationsCustomSettingsActivity.I.size()) {
                    return ((oi0) notificationsCustomSettingsActivity.I.get(i10)).f7681a;
                }
                return 5;
        }
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        String str;
        org.telegram.ui.Cells.p8 p8Var;
        float f7;
        float f10;
        boolean z10;
        String format;
        boolean z11;
        Boolean bool;
        boolean z12;
        float f11;
        int i12 = this.d;
        org.telegram.ui.ActionBar.k2 k2Var = this.f42676f;
        boolean z13 = true;
        switch (i12) {
            case 0:
                y6 y6Var = (y6) k2Var;
                ArrayList arrayList = y6Var.f43580f0;
                u6 u6Var = (u6) arrayList.get(i10);
                int i13 = c1Var.f47912f;
                View view = c1Var.f47909a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 != 7) {
                                    switch (i13) {
                                        case 9:
                                            y6Var.y0();
                                            return;
                                        case 10:
                                            l6 l6Var = y6Var.X;
                                            if (l6Var != null && !y6Var.K) {
                                                long j10 = y6Var.G;
                                                if (j10 <= 0) {
                                                    z13 = false;
                                                }
                                                long j11 = y6Var.H;
                                                int i14 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                                if (i14 <= 0) {
                                                    f7 = 0.0f;
                                                } else {
                                                    f7 = ((float) j10) / ((float) j11);
                                                }
                                                long j12 = y6Var.I;
                                                if (j12 > 0 && i14 > 0) {
                                                    f10 = ((float) (j11 - j12)) / ((float) j11);
                                                } else {
                                                    f10 = 0.0f;
                                                }
                                                l6Var.b(f7, f10, z13);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                                            int i15 = u6Var.f41831f;
                                            if (i15 < 0) {
                                                z10 = y6Var.t0();
                                            } else {
                                                z10 = y6Var.d[i15];
                                            }
                                            boolean z14 = z10;
                                            CharSequence charSequence = u6Var.d;
                                            int[] iArr = y6Var.U;
                                            int i16 = u6Var.f41831f;
                                            if (i16 < 0) {
                                                i16 = 9;
                                            }
                                            int i17 = iArr[i16];
                                            if (i17 <= 0) {
                                                format = String.format("<%.1f%%", Float.valueOf(1.0f));
                                            } else {
                                                format = String.format("%d%%", Integer.valueOf(i17));
                                            }
                                            SpannableString spannableString = new SpannableString(format);
                                            spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                                            spannableString.setSpan(new org.telegram.ui.Components.y41(org.telegram.messenger.i0.o()), 0, spannableString.length(), 33);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                            spannableStringBuilder.append((CharSequence) "  ");
                                            spannableStringBuilder.append((CharSequence) spannableString);
                                            String i02 = org.telegram.messenger.i0.i0(u6Var.f41832g, false, false);
                                            if (u6Var.f41831f >= 0 ? !u6Var.f41834j : !y6Var.L) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            c2Var.e(spannableStringBuilder, i02, z14, z11, false);
                                            int i18 = u6Var.h;
                                            int i19 = org.telegram.ui.ActionBar.t6.f21060k7;
                                            org.telegram.ui.Components.ep epVar = c2Var.f21780r;
                                            if (epVar != null) {
                                                epVar.b(i18, i18, i19);
                                            }
                                            if (u6Var.f41831f < 0) {
                                                bool = Boolean.valueOf(y6Var.L);
                                            } else {
                                                bool = null;
                                            }
                                            c2Var.setCollapsed(bool);
                                            if (u6Var.f41831f == -1) {
                                                c2Var.d(new a(this, 6), new ag.t0(26, this, c2Var));
                                            } else {
                                                c2Var.d(null, null);
                                            }
                                            c2Var.setPad(u6Var.f41833i ? 1 : 0);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                                org.telegram.messenger.y2 y2Var = y6Var.getMessagesController().f19244s7;
                                int i20 = u6Var.f41830c;
                                int size = y2Var.d(((u6) arrayList.get(i10)).f41830c).size();
                                if (size > 0) {
                                    str = org.telegram.messenger.dd.G(size, "ExceptionShort", Integer.valueOf(size));
                                } else {
                                    str = null;
                                }
                                String f12 = org.telegram.messenger.y2.f(y2Var.c(i20));
                                if (((u6) arrayList.get(i10)).f41830c == 0) {
                                    p8Var = p8Var2;
                                    p8Var.r(org.telegram.messenger.dd.L0(2131746768, null), f12, true, 2131232148, -11565578, -13276952, true);
                                } else {
                                    p8Var = p8Var2;
                                    if (((u6) arrayList.get(i10)).f41830c == 1) {
                                        p8Var.r(org.telegram.messenger.dd.L0(2131749466, null), f12, true, 2131232147, -11154873, -14175180, true);
                                    } else if (((u6) arrayList.get(i10)).f41830c == 2) {
                                        p8Var.r(org.telegram.messenger.dd.L0(2131752650, null), f12, true, 2131232146, -1007845, -1996271, true);
                                    } else if (((u6) arrayList.get(i10)).f41830c == 3) {
                                        p8Var.r(org.telegram.messenger.dd.L0(2131752646, null), f12, false, 2131232153, -765355, -2148011, false);
                                    }
                                }
                                p8Var.setSubtitle(str);
                                return;
                            }
                            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                            p4Var.setText(((u6) arrayList.get(i10)).d);
                            ((u6) arrayList.get(i10)).getClass();
                            p4Var.setTopMargin(15);
                            ((u6) arrayList.get(i10)).getClass();
                            p4Var.setBottomMargin(0);
                            return;
                        }
                        final org.telegram.ui.Components.mx0 mx0Var = (org.telegram.ui.Components.mx0) view;
                        boolean z15 = y6Var.K;
                        long j13 = y6Var.e;
                        long j14 = y6Var.G;
                        long j15 = y6Var.I;
                        long j16 = y6Var.H;
                        ac.a aVar = mx0Var.I;
                        View view2 = mx0Var.f28612x;
                        TextView textView = mx0Var.f28608n;
                        TextView textView2 = mx0Var.h;
                        TextView textView3 = mx0Var.f28611w;
                        org.telegram.ui.Cells.x9 x9Var = mx0Var.D;
                        mx0Var.e = z15;
                        TextView textView4 = mx0Var.f28609r;
                        textView4.setText(org.telegram.messenger.dd.a0("TotalDeviceFreeSize", null, 2131743998, org.telegram.messenger.i0.i0(j15, false, false)));
                        TextView textView5 = mx0Var.f28610s;
                        long j17 = j16 - j15;
                        textView5.setText(org.telegram.messenger.dd.a0("TotalDeviceSize", null, 2131743997, org.telegram.messenger.i0.i0(j17, false, false)));
                        if (z15) {
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            textView4.setVisibility(8);
                            textView5.setVisibility(8);
                            textView.setVisibility(8);
                            view2.setVisibility(8);
                            x9Var.setVisibility(8);
                            mx0Var.E = 0.0f;
                            mx0Var.F = 0.0f;
                            if (aVar != null) {
                                aVar.c(textView3);
                            }
                        } else {
                            if (aVar != null) {
                                aVar.w(textView3);
                            }
                            textView3.setVisibility(8);
                            if (j14 > 0) {
                                i11 = 0;
                                view2.setVisibility(0);
                                x9Var.setVisibility(0);
                                textView2.setVisibility(0);
                                textView.setVisibility(8);
                                x9Var.c(org.telegram.messenger.dd.L0(2131752047, null), org.telegram.messenger.i0.i0(j14, false, false), false, true);
                                textView2.setText(org.telegram.messenger.dd.a0("TelegramCacheSize", null, 2131744271, org.telegram.messenger.i0.i0(j14 + j13, false, false)));
                            } else {
                                i11 = 0;
                                textView2.setVisibility(8);
                                textView.setVisibility(0);
                                textView.setText(org.telegram.messenger.dd.a0("LocalDatabaseSize", null, 2131748779, org.telegram.messenger.i0.i0(j13, false, false)));
                                view2.setVisibility(8);
                                x9Var.setVisibility(8);
                            }
                            textView4.setVisibility(i11);
                            textView5.setVisibility(i11);
                            float f13 = (float) j16;
                            float f14 = ((float) (j14 + j13)) / f13;
                            float f15 = ((float) j17) / f13;
                            if (mx0Var.E != f14) {
                                ValueAnimator valueAnimator = mx0Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(mx0Var.E, f14);
                                mx0Var.G = ofFloat;
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        switch (r2) {
                                            case 0:
                                                mx0 mx0Var2 = mx0Var;
                                                mx0Var2.getClass();
                                                mx0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                mx0Var2.invalidate();
                                                return;
                                            default:
                                                mx0 mx0Var3 = mx0Var;
                                                mx0Var3.getClass();
                                                mx0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                mx0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                mx0Var.G.start();
                            }
                            if (mx0Var.F != f15) {
                                ValueAnimator valueAnimator2 = mx0Var.H;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(mx0Var.F, f15);
                                mx0Var.H = ofFloat2;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                        switch (r2) {
                                            case 0:
                                                mx0 mx0Var2 = mx0Var;
                                                mx0Var2.getClass();
                                                mx0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                mx0Var2.invalidate();
                                                return;
                                            default:
                                                mx0 mx0Var3 = mx0Var;
                                                mx0Var3.getClass();
                                                mx0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                mx0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                mx0Var.H.start();
                            }
                        }
                        org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.G6, null);
                        mx0Var.requestLayout();
                        return;
                    }
                    ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.i0.W2(u6Var.e));
                    return;
                }
                org.telegram.ui.Cells.x9 x9Var2 = (org.telegram.ui.Cells.x9) view;
                if (i10 == y6Var.J) {
                    x9Var2.c(org.telegram.messenger.dd.L0(2131748449, null), null, false, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) k2Var).I;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    oi0 oi0Var = (oi0) arrayList2.get(i10);
                    int i21 = i10 + 1;
                    if (i21 < arrayList2.size() && ((oi0) arrayList2.get(i21)).f7681a != 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i22 = c1Var.f47912f;
                    View view3 = c1Var.f47909a;
                    switch (i22) {
                        case 0:
                            ((org.telegram.ui.Cells.p4) view3).setText(oi0Var.e);
                            return;
                        case 1:
                            ((org.telegram.ui.Cells.t8) view3).f("" + ((Object) oi0Var.e), oi0Var.f40170i, z12);
                            return;
                        case 2:
                            ((org.telegram.ui.Cells.pa) view3).f(oi0Var.f40169g, null, z12);
                            return;
                        case 3:
                            ((org.telegram.ui.Cells.v8) view3).b(oi0Var.h, "" + ((Object) oi0Var.e), z12);
                            return;
                        case 4:
                            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view3;
                            if (oi0Var.e == null) {
                                b9Var.setFixedSize(12);
                                b9Var.setText(null);
                                return;
                            }
                            b9Var.setFixedSize(0);
                            b9Var.setText(oi0Var.e);
                            return;
                        case 5:
                            ((org.telegram.ui.Cells.x9) view3).c(oi0Var.e, oi0Var.f40168f, false, z12);
                            return;
                        case 6:
                            org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view3;
                            l5Var.setDrawLine(true);
                            l5Var.setChecked(oi0Var.f40170i);
                            l5Var.b(oi0Var.e, oi0Var.f40168f, oi0Var.d, oi0Var.f40170i, 0, false, z12, true);
                            return;
                        case 7:
                            org.telegram.ui.Cells.p8 p8Var3 = (org.telegram.ui.Cells.p8) view3;
                            if (oi0Var.d == 0) {
                                p8Var3.g(-1, org.telegram.ui.ActionBar.t6.f21154p7);
                                p8Var3.k("" + ((Object) oi0Var.e), z12);
                                return;
                            }
                            p8Var3.g(org.telegram.ui.ActionBar.t6.f21260v6, org.telegram.ui.ActionBar.t6.f21243u6);
                            p8Var3.o(oi0Var.d, "" + ((Object) oi0Var.e), z12);
                            return;
                        case 8:
                            ni0 ni0Var = (ni0) view3;
                            ni0Var.g(org.telegram.ui.ActionBar.t6.f21260v6, org.telegram.ui.ActionBar.t6.f21243u6);
                            CharSequence charSequence2 = oi0Var.e;
                            if (oi0Var.d != 1) {
                                z13 = false;
                            }
                            ViewPropertyAnimator animate = ni0Var.W.animate();
                            if (z13) {
                                f11 = 0.0f;
                            } else {
                                f11 = 180.0f;
                            }
                            org.telegram.messenger.a30.m(animate.rotation(f11), org.telegram.ui.Components.gr.h, 340L);
                            ni0Var.k(charSequence2, z12);
                            return;
                        default:
                            return;
                    }
                }
                return;
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.zz zzVar;
        int i11;
        View t0Var;
        v6 v6Var;
        FrameLayout l5Var;
        int i12 = this.d;
        int i13 = 5;
        Context context = this.e;
        org.telegram.ui.ActionBar.k2 k2Var = this.f42676f;
        switch (i12) {
            case 0:
                y6 y6Var = (y6) k2Var;
                if (i10 != 0) {
                    switch (i10) {
                        case 2:
                            ?? frameLayout = new FrameLayout(context);
                            Paint paint = new Paint(1);
                            frameLayout.f28604a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            frameLayout.f28605b = paint3;
                            Paint paint4 = new Paint(1);
                            frameLayout.f28606c = paint4;
                            frameLayout.d = new Paint();
                            org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g(220, 255);
                            frameLayout.L = gVar;
                            frameLayout.setWillNotDraw(false);
                            gVar.f31498k = false;
                            paint.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
                            paint2.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
                            paint3.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
                            paint4.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            bi.t0 t0Var2 = new bi.t0(frameLayout, context, 23);
                            frameLayout.f28607f = t0Var2;
                            frameLayout.addView(t0Var2, w7.b6.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            frameLayout.addView(linearLayout, w7.b6.c(-2.0f, -1));
                            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(context, 25);
                            linearLayout.addView(a5Var, w7.b6.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            frameLayout.f28611w = textView;
                            int i14 = org.telegram.ui.ActionBar.t6.f21312y6;
                            org.telegram.ui.ActionBar.a7.V(textView, i14, null);
                            String L0 = org.telegram.messenger.dd.L0(2131752643, "CalculatingSize");
                            int indexOf = L0.indexOf("...");
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString(L0);
                                ac.a aVar = new ac.a(textView);
                                frameLayout.I = aVar;
                                aVar.D(spannableString, indexOf);
                                textView.setText(spannableString);
                            } else {
                                textView.setText(L0);
                            }
                            TextView textView2 = new TextView(context);
                            frameLayout.h = textView2;
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            org.telegram.ui.ActionBar.a7.V(textView2, i14, null);
                            TextView textView3 = new TextView(context);
                            frameLayout.f28608n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            org.telegram.ui.ActionBar.a7.V(textView3, i14, null);
                            TextView textView4 = new TextView(context);
                            frameLayout.f28609r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            org.telegram.ui.ActionBar.a7.V(textView4, i14, null);
                            TextView textView5 = new TextView(context);
                            frameLayout.f28610s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            org.telegram.ui.ActionBar.a7.V(textView5, i14, null);
                            frameLayout.f28613y = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Jj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), frameLayout.f28613y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), i0.b.o(frameLayout.f28613y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), i0.b.o(frameLayout.f28613y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(10.0f), frameLayout.f28613y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.i0.L(6.0f));
                            a5Var.addView(textView, w7.b6.c(-2.0f, -2));
                            a5Var.addView(textView3, w7.b6.c(-2.0f, -2));
                            a5Var.addView(textView2, w7.b6.c(-2.0f, -2));
                            a5Var.addView(textView5, w7.b6.c(-2.0f, -2));
                            a5Var.addView(textView4, w7.b6.c(-2.0f, -2));
                            View view = new View(frameLayout.getContext());
                            frameLayout.f28612x = view;
                            linearLayout.addView(view, w7.b6.t(-1, -2, 0, 21, 0, 0, 0));
                            view.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20931d7, view, null);
                            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(frameLayout.getContext());
                            frameLayout.D = x9Var;
                            linearLayout.addView(x9Var, w7.b6.o(-1, -2));
                            zzVar = frameLayout;
                            break;
                        case 3:
                            zzVar = new org.telegram.ui.Cells.p4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, null);
                            zu0Var.setCallback(new org.telegram.messenger.e9(29));
                            int i15 = org.telegram.messenger.uz.G;
                            if (i15 == 3) {
                                i11 = 0;
                            } else {
                                i11 = i15 + 1;
                            }
                            zu0Var.b(i11, null, org.telegram.messenger.dd.G(3, "Days", new Object[0]), org.telegram.messenger.dd.G(1, "Weeks", new Object[0]), org.telegram.messenger.dd.G(1, "Months", new Object[0]), org.telegram.messenger.dd.L0(2131749069, null));
                            zzVar = zu0Var;
                            break;
                        case 5:
                            zzVar = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.zz zzVar2 = new org.telegram.ui.Components.zz(y6Var.getParentActivity(), null);
                            zzVar2.setIsSingleCell(true);
                            zzVar2.setItemsCount(3);
                            zzVar2.setIgnoreHeightCheck(true);
                            zzVar2.setViewType(25);
                            zzVar = zzVar2;
                            break;
                        case 7:
                            zzVar = new org.telegram.ui.Cells.p8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.lu0 lu0Var = y6Var.f43574b0;
                            lu0Var.getClass();
                            t0Var = new bi.t0(lu0Var, context, 20);
                            t0Var.setTag(-33024);
                            t0Var.setLayoutParams(new s4.o0(-1, -1));
                            zzVar = t0Var;
                            break;
                        case 9:
                            v6 v6Var2 = new v6(this, context);
                            y6Var.W = v6Var2;
                            v6Var2.setTag(-33024);
                            v6Var = v6Var2;
                            zzVar = v6Var;
                            break;
                        case 10:
                            l6 l6Var = new l6(y6Var, context);
                            y6Var.X = l6Var;
                            l6Var.setTag(-33024);
                            v6Var = l6Var;
                            zzVar = v6Var;
                            break;
                        case 11:
                            t0Var = new org.telegram.ui.Cells.c2(4, 21, this.e, y6Var.getResourceProvider(), false);
                            zzVar = t0Var;
                            break;
                        case 12:
                            org.telegram.ui.Components.zz zzVar3 = new org.telegram.ui.Components.zz(y6Var.getParentActivity(), null);
                            zzVar3.setIsSingleCell(true);
                            zzVar3.setItemsCount(1);
                            zzVar3.setIgnoreHeightCheck(true);
                            zzVar3.setViewType(26);
                            zzVar = zzVar3;
                            break;
                        case 13:
                            q6 q6Var = new q6(y6Var, context);
                            y6Var.Y = q6Var;
                            zzVar = q6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.zu0 zu0Var2 = new org.telegram.ui.Components.zu0(context, null);
                            float f7 = ((int) ((y6Var.H / 1024) / 1024)) / 1000.0f;
                            ArrayList arrayList = new ArrayList();
                            if (f7 <= 17.0f) {
                                arrayList.add(2);
                            }
                            if (f7 > 5.0f) {
                                arrayList.add(5);
                            }
                            if (f7 > 16.0f) {
                                arrayList.add(16);
                            }
                            if (f7 > 32.0f) {
                                arrayList.add(32);
                            }
                            arrayList.add(Integer.MAX_VALUE);
                            String[] strArr = new String[arrayList.size()];
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                if (((Integer) arrayList.get(i16)).intValue() == 1) {
                                    strArr[i16] = "300 MB";
                                } else if (((Integer) arrayList.get(i16)).intValue() == Integer.MAX_VALUE) {
                                    strArr[i16] = org.telegram.messenger.dd.L0(2131748219, null);
                                } else {
                                    strArr[i16] = String.format("%d GB", arrayList.get(i16));
                                }
                            }
                            zu0Var2.setCallback(new y0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.uz.q().getInt("cache_limit", Integer.MAX_VALUE)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            zu0Var2.b(indexOf2, null, strArr);
                            zzVar = zu0Var2;
                            break;
                        default:
                            zzVar = new org.telegram.ui.Cells.b9(context);
                            break;
                    }
                } else {
                    zzVar = new org.telegram.ui.Cells.x9(context);
                }
                return new s4.c1(zzVar);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) k2Var;
                switch (i10) {
                    case 0:
                        l5Var = new org.telegram.ui.Cells.p4(context);
                        break;
                    case 1:
                        l5Var = new org.telegram.ui.Cells.t8(context);
                        break;
                    case 2:
                        l5Var = new org.telegram.ui.Cells.pa(context, 6, 0, false);
                        break;
                    case 3:
                        l5Var = new org.telegram.ui.Cells.v8(context, null);
                        break;
                    case 4:
                        l5Var = new org.telegram.ui.Cells.b9(context);
                        break;
                    case 5:
                        l5Var = new org.telegram.ui.Cells.x9(context);
                        break;
                    case 6:
                        l5Var = new org.telegram.ui.Cells.l5(21, 64, this.e, NotificationsCustomSettingsActivity.d0(notificationsCustomSettingsActivity), true);
                        break;
                    case 7:
                    default:
                        l5Var = new org.telegram.ui.Cells.p8(context);
                        break;
                    case 8:
                        ?? p8Var = new org.telegram.ui.Cells.p8(context);
                        ImageView imageView = new ImageView(context);
                        p8Var.W = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21260v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131232129);
                        if (org.telegram.messenger.dd.X) {
                            i13 = 3;
                        }
                        p8Var.addView(imageView, w7.b6.d(24, 24.0f, i13 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        l5Var = p8Var;
                        break;
                }
                return new s4.c1(l5Var);
        }
    }

    @Override
    public void y(s4.c1 c1Var) {
        boolean B;
        oi0 oi0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f42676f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
                int i10 = notificationsCustomSettingsActivity.f33410s;
                if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f33412x) != null && arrayList2.isEmpty())) {
                    if (i10 == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.f33408n;
                        if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f33412x) == null || arrayList.isEmpty())) {
                            B = false;
                        } else {
                            B = true;
                        }
                    } else {
                        B = notificationsCustomSettingsActivity.getNotificationsController().B(i10);
                    }
                    int b10 = c1Var.b();
                    View view = c1Var.f47909a;
                    if (b10 >= 0 && b10 < arrayList3.size()) {
                        oi0Var = (oi0) arrayList3.get(b10);
                    } else {
                        oi0Var = null;
                    }
                    if (oi0Var == null || oi0Var.f40167c != 102) {
                        int i11 = c1Var.f47912f;
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 3) {
                                    if (i11 == 5) {
                                        ((org.telegram.ui.Cells.x9) view).a(null, B);
                                        return;
                                    }
                                    return;
                                }
                                ((org.telegram.ui.Cells.v8) view).a(null, B);
                                return;
                            }
                            ((org.telegram.ui.Cells.t8) view).e(null, B);
                            return;
                        }
                        ((org.telegram.ui.Cells.p4) view).a(null, B);
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
