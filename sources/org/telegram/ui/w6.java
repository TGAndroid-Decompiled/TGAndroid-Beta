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
    public final Context f53146e;
    public final org.telegram.ui.ActionBar.g2 f53147f;

    public w6(int i7, Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        this.d = i7;
        this.f53147f = g2Var;
        this.f53146e = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7;
        switch (this.d) {
            case 0:
                y6 y6Var = (y6) this.f53147f;
                if (f1Var.b() != y6Var.K && (((i7 = f1Var.f59249f) != 2 || y6Var.H <= 0 || y6Var.L) && i7 != 5 && i7 != 7 && i7 != 11)) {
                    return false;
                }
                return true;
            default:
                int i10 = f1Var.f59249f;
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
                return ((y6) this.f53147f).f54251g0.size();
            default:
                return ((NotificationsCustomSettingsActivity) this.f53147f).J.size();
        }
    }

    @Override
    public final int d(int i7) {
        switch (this.d) {
            case 0:
                return ((u6) ((y6) this.f53147f).f54251g0.get(i7)).f56712a;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f53147f;
                if (i7 >= 0 && i7 < notificationsCustomSettingsActivity.J.size()) {
                    return ((oh0) notificationsCustomSettingsActivity.J.get(i7)).f56712a;
                }
                return 5;
        }
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        String str;
        org.telegram.ui.Cells.m8 m8Var;
        float f10;
        float f11;
        boolean z10;
        String format;
        boolean z11;
        Boolean bool;
        boolean z12;
        float f12;
        int i11 = this.d;
        org.telegram.ui.ActionBar.g2 g2Var = this.f53147f;
        boolean z13 = true;
        switch (i11) {
            case 0:
                y6 y6Var = (y6) g2Var;
                ArrayList arrayList = y6Var.f54251g0;
                u6 u6Var = (u6) arrayList.get(i7);
                int i12 = f1Var.f59249f;
                View view = f1Var.f59245a;
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
                                            l6 l6Var = y6Var.Y;
                                            if (l6Var != null && !y6Var.L) {
                                                long j3 = y6Var.H;
                                                if (j3 <= 0) {
                                                    z13 = false;
                                                }
                                                long j10 = y6Var.I;
                                                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                                if (i13 <= 0) {
                                                    f10 = 0.0f;
                                                } else {
                                                    f10 = ((float) j3) / ((float) j10);
                                                }
                                                long j11 = y6Var.J;
                                                if (j11 > 0 && i13 > 0) {
                                                    f11 = ((float) (j10 - j11)) / ((float) j10);
                                                } else {
                                                    f11 = 0.0f;
                                                }
                                                l6Var.b(f10, f11, z13);
                                                return;
                                            }
                                            return;
                                        case 11:
                                            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                                            int i14 = u6Var.f52546f;
                                            if (i14 < 0) {
                                                z10 = y6Var.t0();
                                            } else {
                                                z10 = y6Var.d[i14];
                                            }
                                            boolean z14 = z10;
                                            CharSequence charSequence = u6Var.d;
                                            int[] iArr = y6Var.V;
                                            int i15 = u6Var.f52546f;
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
                                            spannableString.setSpan(new org.telegram.ui.Components.k41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                            spannableStringBuilder.append((CharSequence) "  ");
                                            spannableStringBuilder.append((CharSequence) spannableString);
                                            String i02 = org.telegram.messenger.g0.i0(u6Var.f52547g, false, false);
                                            if (u6Var.f52546f >= 0 ? !u6Var.f52549j : !y6Var.M) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            d2Var.e(spannableStringBuilder, i02, z14, z11, false);
                                            int i17 = u6Var.h;
                                            int i18 = org.telegram.ui.ActionBar.n6.f29581k7;
                                            org.telegram.ui.Components.lp lpVar = d2Var.f30617r;
                                            if (lpVar != null) {
                                                lpVar.b(i17, i17, i18);
                                            }
                                            if (u6Var.f52546f < 0) {
                                                bool = Boolean.valueOf(y6Var.M);
                                            } else {
                                                bool = null;
                                            }
                                            d2Var.setCollapsed(bool);
                                            if (u6Var.f52546f == -1) {
                                                d2Var.d(new a(this, 6), new oi.i1(6, this, d2Var));
                                            } else {
                                                d2Var.d(null, null);
                                            }
                                            d2Var.setPad(u6Var.f52548i ? 1 : 0);
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                                org.telegram.messenger.v2 v2Var = y6Var.getMessagesController().f25873u7;
                                int i19 = u6Var.f52544c;
                                int size = v2Var.d(((u6) arrayList.get(i7)).f52544c).size();
                                if (size > 0) {
                                    str = org.telegram.messenger.gd.G(size, "ExceptionShort", Integer.valueOf(size));
                                } else {
                                    str = null;
                                }
                                String f13 = org.telegram.messenger.v2.f(v2Var.c(i19));
                                if (((u6) arrayList.get(i7)).f52544c == 0) {
                                    m8Var = m8Var2;
                                    m8Var.r(org.telegram.messenger.gd.N0(2131746559, null), f13, true, 2131232154, -11565578, -13276952, true);
                                } else {
                                    m8Var = m8Var2;
                                    if (((u6) arrayList.get(i7)).f52544c == 1) {
                                        m8Var.r(org.telegram.messenger.gd.N0(2131749264, null), f13, true, 2131232153, -11154873, -14175180, true);
                                    } else if (((u6) arrayList.get(i7)).f52544c == 2) {
                                        m8Var.r(org.telegram.messenger.gd.N0(2131752638, null), f13, true, 2131232152, -1007845, -1996271, true);
                                    } else if (((u6) arrayList.get(i7)).f52544c == 3) {
                                        m8Var.r(org.telegram.messenger.gd.N0(2131752634, null), f13, false, 2131232159, -765355, -2148011, false);
                                    }
                                }
                                m8Var.setSubtitle(str);
                                return;
                            }
                            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                            o4Var.setText(((u6) arrayList.get(i7)).d);
                            ((u6) arrayList.get(i7)).getClass();
                            o4Var.setTopMargin(15);
                            ((u6) arrayList.get(i7)).getClass();
                            o4Var.setBottomMargin(0);
                            return;
                        }
                        final org.telegram.ui.Components.sw0 sw0Var = (org.telegram.ui.Components.sw0) view;
                        boolean z15 = y6Var.L;
                        long j12 = y6Var.f54247e;
                        long j13 = y6Var.H;
                        long j14 = y6Var.J;
                        long j15 = y6Var.I;
                        ab.q qVar = sw0Var.J;
                        View view2 = sw0Var.f39732x;
                        TextView textView = sw0Var.f39728n;
                        TextView textView2 = sw0Var.h;
                        TextView textView3 = sw0Var.f39731w;
                        org.telegram.ui.Cells.w9 w9Var = sw0Var.E;
                        sw0Var.f39726e = z15;
                        TextView textView4 = sw0Var.f39729r;
                        textView4.setText(org.telegram.messenger.gd.a0("TotalDeviceFreeSize", null, 2131743726, org.telegram.messenger.g0.i0(j14, false, false)));
                        TextView textView5 = sw0Var.f39730s;
                        long j16 = j15 - j14;
                        textView5.setText(org.telegram.messenger.gd.a0("TotalDeviceSize", null, 2131743725, org.telegram.messenger.g0.i0(j16, false, false)));
                        if (z15) {
                            textView3.setVisibility(0);
                            textView2.setVisibility(8);
                            textView4.setVisibility(8);
                            textView5.setVisibility(8);
                            textView.setVisibility(8);
                            view2.setVisibility(8);
                            w9Var.setVisibility(8);
                            sw0Var.F = 0.0f;
                            sw0Var.G = 0.0f;
                            if (qVar != null) {
                                qVar.c(textView3);
                            }
                        } else {
                            if (qVar != null) {
                                qVar.z(textView3);
                            }
                            textView3.setVisibility(8);
                            if (j13 > 0) {
                                i10 = 0;
                                view2.setVisibility(0);
                                w9Var.setVisibility(0);
                                textView2.setVisibility(0);
                                textView.setVisibility(8);
                                w9Var.c(org.telegram.messenger.gd.N0(2131752035, null), org.telegram.messenger.g0.i0(j13, false, false), false, true);
                                textView2.setText(org.telegram.messenger.gd.a0("TelegramCacheSize", null, 2131744001, org.telegram.messenger.g0.i0(j13 + j12, false, false)));
                            } else {
                                i10 = 0;
                                textView2.setVisibility(8);
                                textView.setVisibility(0);
                                textView.setText(org.telegram.messenger.gd.a0("LocalDatabaseSize", null, 2131748576, org.telegram.messenger.g0.i0(j12, false, false)));
                                view2.setVisibility(8);
                                w9Var.setVisibility(8);
                            }
                            textView4.setVisibility(i10);
                            textView5.setVisibility(i10);
                            float f14 = (float) j15;
                            float f15 = ((float) (j13 + j12)) / f14;
                            float f16 = ((float) j16) / f14;
                            if (sw0Var.F != f15) {
                                ValueAnimator valueAnimator = sw0Var.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(sw0Var.F, f15);
                                sw0Var.H = ofFloat;
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        switch (r2) {
                                            case 0:
                                                sw0 sw0Var2 = sw0Var;
                                                sw0Var2.getClass();
                                                sw0Var2.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                sw0Var2.invalidate();
                                                return;
                                            default:
                                                sw0 sw0Var3 = sw0Var;
                                                sw0Var3.getClass();
                                                sw0Var3.G = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                                sw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                sw0Var.H.start();
                            }
                            if (sw0Var.G != f16) {
                                ValueAnimator valueAnimator2 = sw0Var.I;
                                if (valueAnimator2 != null) {
                                    valueAnimator2.cancel();
                                }
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(sw0Var.G, f16);
                                sw0Var.I = ofFloat2;
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                        switch (r2) {
                                            case 0:
                                                sw0 sw0Var2 = sw0Var;
                                                sw0Var2.getClass();
                                                sw0Var2.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                sw0Var2.invalidate();
                                                return;
                                            default:
                                                sw0 sw0Var3 = sw0Var;
                                                sw0Var3.getClass();
                                                sw0Var3.G = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                                sw0Var3.invalidate();
                                                return;
                                        }
                                    }
                                });
                                sw0Var.I.start();
                            }
                        }
                        org.telegram.ui.ActionBar.u6.U(w9Var.getTextView(), org.telegram.ui.ActionBar.n6.G6, null);
                        sw0Var.requestLayout();
                        return;
                    }
                    ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.g0.W2(u6Var.f52545e));
                    return;
                }
                org.telegram.ui.Cells.w9 w9Var2 = (org.telegram.ui.Cells.w9) view;
                if (i7 == y6Var.K) {
                    w9Var2.c(org.telegram.messenger.gd.N0(2131748241, null), null, false, false);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((NotificationsCustomSettingsActivity) g2Var).J;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    oh0 oh0Var = (oh0) arrayList2.get(i7);
                    int i20 = i7 + 1;
                    if (i20 < arrayList2.size() && ((oh0) arrayList2.get(i20)).f56712a != 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i21 = f1Var.f59249f;
                    View view3 = f1Var.f59245a;
                    switch (i21) {
                        case 0:
                            ((org.telegram.ui.Cells.o4) view3).setText(oh0Var.f50698e);
                            return;
                        case 1:
                            ((org.telegram.ui.Cells.r8) view3).f("" + ((Object) oh0Var.f50698e), oh0Var.f50701i, z12);
                            return;
                        case 2:
                            ((org.telegram.ui.Cells.sa) view3).f(oh0Var.f50700g, null, z12);
                            return;
                        case 3:
                            ((org.telegram.ui.Cells.t8) view3).b(oh0Var.h, "" + ((Object) oh0Var.f50698e), z12);
                            return;
                        case 4:
                            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view3;
                            if (oh0Var.f50698e == null) {
                                z8Var.setFixedSize(12);
                                z8Var.setText(null);
                                return;
                            }
                            z8Var.setFixedSize(0);
                            z8Var.setText(oh0Var.f50698e);
                            return;
                        case 5:
                            ((org.telegram.ui.Cells.w9) view3).c(oh0Var.f50698e, oh0Var.f50699f, false, z12);
                            return;
                        case 6:
                            org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view3;
                            i5Var.setDrawLine(true);
                            i5Var.setChecked(oh0Var.f50701i);
                            i5Var.b(oh0Var.f50698e, oh0Var.f50699f, oh0Var.d, oh0Var.f50701i, 0, false, z12, true);
                            return;
                        case 7:
                            org.telegram.ui.Cells.m8 m8Var3 = (org.telegram.ui.Cells.m8) view3;
                            if (oh0Var.d == 0) {
                                m8Var3.g(-1, org.telegram.ui.ActionBar.n6.f29672p7);
                                m8Var3.k("" + ((Object) oh0Var.f50698e), z12);
                                return;
                            }
                            m8Var3.g(org.telegram.ui.ActionBar.n6.f29786v6, org.telegram.ui.ActionBar.n6.f29767u6);
                            m8Var3.o(oh0Var.d, "" + ((Object) oh0Var.f50698e), z12);
                            return;
                        case 8:
                            nh0 nh0Var = (nh0) view3;
                            nh0Var.g(org.telegram.ui.ActionBar.n6.f29786v6, org.telegram.ui.ActionBar.n6.f29767u6);
                            CharSequence charSequence2 = oh0Var.f50698e;
                            if (oh0Var.d != 1) {
                                z13 = false;
                            }
                            ViewPropertyAnimator animate = nh0Var.f50317a0.animate();
                            if (z13) {
                                f12 = 0.0f;
                            } else {
                                f12 = 180.0f;
                            }
                            org.telegram.messenger.m10.o(animate.rotation(f12), org.telegram.ui.Components.kr.h, 340L);
                            nh0Var.k(charSequence2, z12);
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
        org.telegram.ui.Components.vz vzVar;
        int i10;
        v6 v6Var;
        FrameLayout i5Var;
        int i11 = this.d;
        int i12 = 5;
        Context context = this.f53146e;
        org.telegram.ui.ActionBar.g2 g2Var = this.f53147f;
        switch (i11) {
            case 0:
                y6 y6Var = (y6) g2Var;
                if (i7 != 0) {
                    switch (i7) {
                        case 2:
                            ?? frameLayout = new FrameLayout(context);
                            Paint paint = new Paint(1);
                            frameLayout.f39723a = paint;
                            Paint paint2 = new Paint(1);
                            Paint paint3 = new Paint(1);
                            frameLayout.f39724b = paint3;
                            Paint paint4 = new Paint(1);
                            frameLayout.f39725c = paint4;
                            frameLayout.d = new Paint();
                            org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(220, 255);
                            frameLayout.M = nVar;
                            frameLayout.setWillNotDraw(false);
                            nVar.f41078k = false;
                            paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint2.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint3.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            paint4.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
                            Paint.Cap cap = Paint.Cap.ROUND;
                            paint.setStrokeCap(cap);
                            paint2.setStrokeCap(cap);
                            paint3.setStrokeCap(cap);
                            paint4.setStrokeCap(cap);
                            bi.o3 o3Var = new bi.o3(29, context, frameLayout);
                            frameLayout.f39727f = o3Var;
                            frameLayout.addView(o3Var, c8.na.c(-2.0f, -1));
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(1);
                            frameLayout.addView(linearLayout, c8.na.c(-2.0f, -1));
                            bi.v2 v2Var = new bi.v2(context, 23);
                            linearLayout.addView(v2Var, c8.na.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                            TextView textView = new TextView(context);
                            frameLayout.f39731w = textView;
                            int i13 = org.telegram.ui.ActionBar.n6.f29843y6;
                            org.telegram.ui.ActionBar.u6.U(textView, i13, null);
                            String N0 = org.telegram.messenger.gd.N0(2131752631, "CalculatingSize");
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
                            org.telegram.ui.ActionBar.u6.U(textView2, i13, null);
                            TextView textView3 = new TextView(context);
                            frameLayout.f39728n = textView3;
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.u6.U(textView3, i13, null);
                            TextView textView4 = new TextView(context);
                            frameLayout.f39729r = textView4;
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.u6.U(textView4, i13, null);
                            TextView textView5 = new TextView(context);
                            frameLayout.f39730s = textView5;
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            org.telegram.ui.ActionBar.u6.U(textView5, i13, null);
                            frameLayout.f39733y = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false);
                            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f39733y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f39733y, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), i0.a.o(frameLayout.f39733y, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView5.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(10.0f), frameLayout.f39733y), (Drawable) null, (Drawable) null, (Drawable) null);
                            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
                            v2Var.addView(textView, c8.na.c(-2.0f, -2));
                            v2Var.addView(textView3, c8.na.c(-2.0f, -2));
                            v2Var.addView(textView2, c8.na.c(-2.0f, -2));
                            v2Var.addView(textView5, c8.na.c(-2.0f, -2));
                            v2Var.addView(textView4, c8.na.c(-2.0f, -2));
                            View view = new View(frameLayout.getContext());
                            frameLayout.f39732x = view;
                            linearLayout.addView(view, c8.na.t(-1, -2, 0, 21, 0, 0, 0));
                            view.getLayoutParams().height = 1;
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29452d7, view, null);
                            org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(frameLayout.getContext());
                            frameLayout.E = w9Var;
                            linearLayout.addView(w9Var, c8.na.o(-1, -2));
                            vzVar = frameLayout;
                            break;
                        case 3:
                            vzVar = new org.telegram.ui.Cells.o4(context);
                            break;
                        case 4:
                            org.telegram.ui.Components.gu0 gu0Var = new org.telegram.ui.Components.gu0(context, null);
                            gu0Var.setCallback(new org.telegram.messenger.ed(20));
                            int i14 = org.telegram.messenger.bz.G;
                            if (i14 == 3) {
                                i10 = 0;
                            } else {
                                i10 = i14 + 1;
                            }
                            gu0Var.b(i10, null, org.telegram.messenger.gd.G(3, "Days", new Object[0]), org.telegram.messenger.gd.G(1, "Weeks", new Object[0]), org.telegram.messenger.gd.G(1, "Months", new Object[0]), org.telegram.messenger.gd.N0(2131748866, null));
                            vzVar = gu0Var;
                            break;
                        case 5:
                            vzVar = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                            break;
                        case 6:
                            org.telegram.ui.Components.vz vzVar2 = new org.telegram.ui.Components.vz(y6Var.getParentActivity(), null);
                            vzVar2.setIsSingleCell(true);
                            vzVar2.setItemsCount(3);
                            vzVar2.setIgnoreHeightCheck(true);
                            vzVar2.setViewType(25);
                            vzVar = vzVar2;
                            break;
                        case 7:
                            vzVar = new org.telegram.ui.Cells.m8(context);
                            break;
                        case 8:
                            org.telegram.ui.Components.st0 st0Var = y6Var.f54245c0;
                            st0Var.getClass();
                            View o3Var2 = new bi.o3(26, context, st0Var);
                            o3Var2.setTag(-33024);
                            o3Var2.setLayoutParams(new v4.q0(-1, -1));
                            vzVar = o3Var2;
                            break;
                        case 9:
                            v6 v6Var2 = new v6(this, context);
                            y6Var.X = v6Var2;
                            v6Var2.setTag(-33024);
                            v6Var = v6Var2;
                            vzVar = v6Var;
                            break;
                        case 10:
                            l6 l6Var = new l6(y6Var, context);
                            y6Var.Y = l6Var;
                            l6Var.setTag(-33024);
                            v6Var = l6Var;
                            vzVar = v6Var;
                            break;
                        case 11:
                            vzVar = new org.telegram.ui.Cells.d2(this.f53146e, 4, 21, false, y6Var.getResourceProvider());
                            break;
                        case 12:
                            org.telegram.ui.Components.vz vzVar3 = new org.telegram.ui.Components.vz(y6Var.getParentActivity(), null);
                            vzVar3.setIsSingleCell(true);
                            vzVar3.setItemsCount(1);
                            vzVar3.setIgnoreHeightCheck(true);
                            vzVar3.setViewType(26);
                            vzVar = vzVar3;
                            break;
                        case 13:
                            q6 q6Var = new q6(y6Var, context);
                            y6Var.Z = q6Var;
                            vzVar = q6Var;
                            break;
                        case 14:
                            org.telegram.ui.Components.gu0 gu0Var2 = new org.telegram.ui.Components.gu0(context, null);
                            float f10 = ((int) ((y6Var.I / 1024) / 1024)) / 1000.0f;
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
                                    strArr[i15] = org.telegram.messenger.gd.N0(2131748009, null);
                                } else {
                                    strArr[i15] = String.format("%d GB", arrayList.get(i15));
                                }
                            }
                            gu0Var2.setCallback(new w0(arrayList, 10));
                            int indexOf2 = arrayList.indexOf(Integer.valueOf(org.telegram.messenger.bz.q().getInt("cache_limit", Integer.MAX_VALUE)));
                            if (indexOf2 < 0) {
                                indexOf2 = arrayList.size() - 1;
                            }
                            gu0Var2.b(indexOf2, null, strArr);
                            vzVar = gu0Var2;
                            break;
                        default:
                            vzVar = new org.telegram.ui.Cells.z8(context);
                            break;
                    }
                } else {
                    vzVar = new org.telegram.ui.Cells.w9(context);
                }
                return new v4.f1(vzVar);
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) g2Var;
                switch (i7) {
                    case 0:
                        i5Var = new org.telegram.ui.Cells.o4(context);
                        break;
                    case 1:
                        i5Var = new org.telegram.ui.Cells.r8(context);
                        break;
                    case 2:
                        i5Var = new org.telegram.ui.Cells.sa(context, 6, 0, false);
                        break;
                    case 3:
                        i5Var = new org.telegram.ui.Cells.t8(context, null);
                        break;
                    case 4:
                        i5Var = new org.telegram.ui.Cells.z8(context);
                        break;
                    case 5:
                        i5Var = new org.telegram.ui.Cells.w9(context);
                        break;
                    case 6:
                        i5Var = new org.telegram.ui.Cells.i5(this.f53146e, 21, 64, true, NotificationsCustomSettingsActivity.d0(notificationsCustomSettingsActivity));
                        break;
                    case 7:
                    default:
                        i5Var = new org.telegram.ui.Cells.m8(context);
                        break;
                    case 8:
                        ?? m8Var = new org.telegram.ui.Cells.m8(context);
                        ImageView imageView = new ImageView(context);
                        m8Var.f50317a0 = imageView;
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29786v6, notificationsCustomSettingsActivity.getResourceProvider(), PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131232135);
                        if (org.telegram.messenger.gd.f24314a0) {
                            i12 = 3;
                        }
                        m8Var.addView(imageView, c8.na.d(24, 24.0f, i12 | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                        i5Var = m8Var;
                        break;
                }
                return new v4.f1(i5Var);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        boolean B;
        oh0 oh0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.d) {
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) this.f53147f;
                ArrayList arrayList3 = notificationsCustomSettingsActivity.J;
                int i7 = notificationsCustomSettingsActivity.f43243s;
                if (i7 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.f43245x) != null && arrayList2.isEmpty())) {
                    if (i7 == 3) {
                        Boolean bool = notificationsCustomSettingsActivity.f43241n;
                        if (bool != null && !bool.booleanValue() && ((arrayList = notificationsCustomSettingsActivity.f43245x) == null || arrayList.isEmpty())) {
                            B = false;
                        } else {
                            B = true;
                        }
                    } else {
                        B = notificationsCustomSettingsActivity.getNotificationsController().B(i7);
                    }
                    int b10 = f1Var.b();
                    View view = f1Var.f59245a;
                    if (b10 >= 0 && b10 < arrayList3.size()) {
                        oh0Var = (oh0) arrayList3.get(b10);
                    } else {
                        oh0Var = null;
                    }
                    if (oh0Var == null || oh0Var.f50697c != 102) {
                        int i10 = f1Var.f59249f;
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
