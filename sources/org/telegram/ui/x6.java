package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class x6 extends og.b {
    public final Context d;
    public final z6 e;

    public x6(z6 z6Var, Context context) {
        this.e = z6Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        z6 z6Var = this.e;
        if (c1Var.b() != z6Var.J) {
            int i10 = c1Var.f42977f;
            if ((i10 != 2 || z6Var.G <= 0 || z6Var.K) && i10 != 5 && i10 != 7 && i10 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f40114e0.size();
    }

    @Override
    public final int j(int i10) {
        return ((u6) this.e.f40114e0.get(i10)).f15704a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        float f7;
        float f10;
        boolean z10;
        String format;
        boolean z11;
        Boolean bool;
        z6 z6Var = this.e;
        ArrayList arrayList = z6Var.f40114e0;
        u6 u6Var = (u6) arrayList.get(i10);
        int i12 = c1Var.f42977f;
        View view = c1Var.f42974a;
        String str = null;
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 7) {
                            switch (i12) {
                                case 9:
                                    z6Var.w0();
                                    return;
                                case 10:
                                    k6 k6Var = z6Var.V;
                                    if (k6Var != null && !z6Var.K) {
                                        long j3 = z6Var.G;
                                        if (j3 > 0) {
                                            z12 = true;
                                        }
                                        long j10 = z6Var.H;
                                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                        if (i13 <= 0) {
                                            f7 = 0.0f;
                                        } else {
                                            f7 = ((float) j3) / ((float) j10);
                                        }
                                        long j11 = z6Var.I;
                                        if (j11 > 0 && i13 > 0) {
                                            f10 = ((float) (j10 - j11)) / ((float) j10);
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        k6Var.b(f7, f10, z12);
                                        return;
                                    }
                                    return;
                                case 11:
                                    org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                                    int i14 = u6Var.f37969f;
                                    if (i14 < 0) {
                                        z10 = z6Var.r0();
                                    } else {
                                        z10 = z6Var.d[i14];
                                    }
                                    boolean z13 = z10;
                                    CharSequence charSequence = u6Var.d;
                                    int[] iArr = z6Var.S;
                                    int i15 = u6Var.f37969f;
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
                                    spannableString.setSpan(new org.telegram.ui.Components.t51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.append((CharSequence) "  ");
                                    spannableStringBuilder.append((CharSequence) spannableString);
                                    String formatFileSize = AndroidUtilities.formatFileSize(u6Var.f37970g);
                                    if (u6Var.f37969f >= 0 ? !u6Var.f37972j : !z6Var.L) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    a2Var.e(spannableStringBuilder, formatFileSize, z13, z11, false);
                                    int i17 = u6Var.h;
                                    int i18 = org.telegram.ui.ActionBar.j6.f19223k7;
                                    org.telegram.ui.Components.np npVar = a2Var.f20006r;
                                    if (npVar != null) {
                                        npVar.b(i17, i17, i18);
                                    }
                                    if (u6Var.f37969f < 0) {
                                        bool = Boolean.valueOf(z6Var.L);
                                    } else {
                                        bool = null;
                                    }
                                    a2Var.setCollapsed(bool);
                                    if (u6Var.f37969f == -1) {
                                        a2Var.d(new a(this, 7), new ai.f2(25, this, a2Var));
                                    } else {
                                        a2Var.d(null, null);
                                    }
                                    a2Var.setPad(u6Var.f37971i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                        CacheByChatsController cacheByChatsController = z6Var.getMessagesController().getCacheByChatsController();
                        int i19 = u6Var.f37968c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((u6) arrayList.get(i10)).f37968c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i19));
                        if (((u6) arrayList.get(i10)).f37968c == 0) {
                            s8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((u6) arrayList.get(i10)).f37968c == 1) {
                            s8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((u6) arrayList.get(i10)).f37968c == 2) {
                            s8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((u6) arrayList.get(i10)).f37968c == 3) {
                            s8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                        s8Var.setSubtitle(str);
                        return;
                    }
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    n4Var.setText(((u6) arrayList.get(i10)).d);
                    ((u6) arrayList.get(i10)).getClass();
                    n4Var.setTopMargin(15);
                    ((u6) arrayList.get(i10)).getClass();
                    n4Var.setBottomMargin(0);
                    return;
                }
                final org.telegram.ui.Components.qy0 qy0Var = (org.telegram.ui.Components.qy0) view;
                boolean z14 = z6Var.K;
                long j12 = z6Var.e;
                long j13 = z6Var.G;
                long j14 = z6Var.I;
                long j15 = z6Var.H;
                com.google.firebase.messaging.m mVar = qy0Var.I;
                View view2 = qy0Var.f27687w;
                TextView textView = qy0Var.f27684n;
                TextView textView2 = qy0Var.h;
                TextView textView3 = qy0Var.v;
                org.telegram.ui.Cells.fa faVar = qy0Var.f27689y;
                qy0Var.e = z14;
                TextView textView4 = qy0Var.f27685r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
                TextView textView5 = qy0Var.f27686s;
                long j16 = j15 - j14;
                textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j16)));
                if (z14) {
                    textView3.setVisibility(0);
                    textView2.setVisibility(8);
                    textView4.setVisibility(8);
                    textView5.setVisibility(8);
                    textView.setVisibility(8);
                    view2.setVisibility(8);
                    faVar.setVisibility(8);
                    qy0Var.E = 0.0f;
                    qy0Var.F = 0.0f;
                    if (mVar != null) {
                        mVar.c(textView3);
                    }
                } else {
                    if (mVar != null) {
                        mVar.s(textView3);
                    }
                    textView3.setVisibility(8);
                    if (j13 > 0) {
                        i11 = 0;
                        view2.setVisibility(0);
                        faVar.setVisibility(0);
                        textView2.setVisibility(0);
                        textView.setVisibility(8);
                        faVar.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j13), false, true);
                        textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j13 + j12)));
                    } else {
                        i11 = 0;
                        textView2.setVisibility(8);
                        textView.setVisibility(0);
                        textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j12)));
                        view2.setVisibility(8);
                        faVar.setVisibility(8);
                    }
                    textView4.setVisibility(i11);
                    textView5.setVisibility(i11);
                    float f11 = (float) j15;
                    float f12 = ((float) (j13 + j12)) / f11;
                    float f13 = ((float) j16) / f11;
                    if (qy0Var.E != f12) {
                        ValueAnimator valueAnimator = qy0Var.G;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(qy0Var.E, f12);
                        qy0Var.G = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        qy0 qy0Var2 = qy0Var;
                                        qy0Var2.getClass();
                                        qy0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        qy0Var2.invalidate();
                                        return;
                                    default:
                                        qy0 qy0Var3 = qy0Var;
                                        qy0Var3.getClass();
                                        qy0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        qy0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        qy0Var.G.start();
                    }
                    if (qy0Var.F != f13) {
                        ValueAnimator valueAnimator2 = qy0Var.H;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(qy0Var.F, f13);
                        qy0Var.H = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (r2) {
                                    case 0:
                                        qy0 qy0Var2 = qy0Var;
                                        qy0Var2.getClass();
                                        qy0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        qy0Var2.invalidate();
                                        return;
                                    default:
                                        qy0 qy0Var3 = qy0Var;
                                        qy0Var3.getClass();
                                        qy0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        qy0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        qy0Var.H.start();
                    }
                }
                faVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                qy0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.f9) view).setText(AndroidUtilities.replaceTags(u6Var.e));
            return;
        }
        org.telegram.ui.Cells.fa faVar2 = (org.telegram.ui.Cells.fa) view;
        if (i10 == z6Var.J) {
            faVar2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        p6 p6Var;
        int i11;
        li.i iVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.k kVar;
        k6 k6Var;
        Context context = this.d;
        if (i10 != 0) {
            z6 z6Var = this.e;
            switch (i10) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f27680a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f27681b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f27682c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.L = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f29372k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    ci.eb ebVar = new ci.eb(frameLayout, context, 26);
                    frameLayout.f27683f = ebVar;
                    frameLayout.addView(ebVar, w7.y5.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, w7.y5.c(-2.0f, -1));
                    ai.x5 x5Var = new ai.x5(context, 20);
                    linearLayout.addView(x5Var, w7.y5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i12 = org.telegram.ui.ActionBar.j6.f19477y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(textView);
                        frameLayout.I = mVar;
                        mVar.x(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    frameLayout.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    frameLayout.f27684n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    frameLayout.f27685r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    frameLayout.f27686s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    frameLayout.f27688x = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), frameLayout.f27688x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f27688x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f27688x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), frameLayout.f27688x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    x5Var.addView(textView, w7.y5.c(-2.0f, -2));
                    x5Var.addView(textView3, w7.y5.c(-2.0f, -2));
                    x5Var.addView(textView2, w7.y5.c(-2.0f, -2));
                    x5Var.addView(textView5, w7.y5.c(-2.0f, -2));
                    x5Var.addView(textView4, w7.y5.c(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f27687w = view;
                    linearLayout.addView(view, w7.y5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19095d7, false));
                    org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(frameLayout.getContext());
                    frameLayout.f27689y = faVar;
                    linearLayout.addView(faVar, w7.y5.n(-1, -2));
                    p6Var = frameLayout;
                    break;
                case 3:
                    p6Var = new org.telegram.ui.Cells.n4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, null);
                    ew0Var.setCallback(new m4.q0(19));
                    int i13 = SharedConfig.keepMedia;
                    if (i13 == 3) {
                        i11 = 0;
                    } else {
                        i11 = i13 + 1;
                    }
                    ew0Var.b(i11, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    p6Var = ew0Var;
                    break;
                case 5:
                    p6Var = new y6(z6Var.getParentActivity(), z6Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(z6Var.getParentActivity(), null);
                    t00Var.setIsSingleCell(true);
                    t00Var.setItemsCount(3);
                    t00Var.setIgnoreHeightCheck(true);
                    t00Var.setViewType(25);
                    p6Var = t00Var;
                    break;
                case 7:
                    p6Var = new org.telegram.ui.Cells.s8(context);
                    break;
                case 8:
                    iVar = ((org.telegram.ui.ActionBar.n2) z6Var).glassEngine;
                    w6 w6Var = new w6(this, context, z6Var, iVar);
                    z6Var.M = w6Var;
                    FrameLayout frameLayout2 = z6Var.N;
                    if (frameLayout2 != null && (frameLayout2.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) z6Var.N.getParent()).removeView(z6Var.N);
                    }
                    w6 w6Var2 = z6Var.M;
                    w6Var2.f37653x = true;
                    FrameLayout frameLayout3 = w6Var2.f37646b;
                    AndroidUtilities.removeFromParent(frameLayout3);
                    frameLayout3.setTranslationY(0.0f);
                    z6Var.N = frameLayout3;
                    ch.d c10 = z6Var.getBaseSimpleGlass().f14322b.c(z6Var.N, null, false);
                    f6Var = ((org.telegram.ui.ActionBar.n2) z6Var).resourceProvider;
                    c10.o(eh.b.m(f6Var));
                    c10.p(AndroidUtilities.dp(9.66f));
                    c10.q(AndroidUtilities.dp(18.0f));
                    frameLayout3.setBackground(c10);
                    z6Var.Z.addView(z6Var.N, w7.y5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
                    kVar = ((org.telegram.ui.ActionBar.n2) z6Var).actionBar;
                    kVar.bringToFront();
                    z6Var.N.bringToFront();
                    z6Var.M.c(AndroidUtilities.dp(56.0f), z6Var.f40109b.getPaddingBottom());
                    ai.w0 w0Var = z6Var.f40109b;
                    if (w0Var != null) {
                        z6Var.P = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + w0Var.getPaddingTop()) - AndroidUtilities.dp(9.0f);
                    }
                    z6Var.z0();
                    z6Var.M.setDelegate(new g(this, 7));
                    z6Var.M.setCacheModel(z6Var.f40112c0);
                    z6Var.M.setTag(-33024);
                    h6 h6Var = z6Var.Z;
                    w6 w6Var3 = z6Var.M;
                    Objects.requireNonNull(w6Var3);
                    y0 y0Var = new y0(w6Var3, 9);
                    h6Var.f23847z0 = w6Var3;
                    h6Var.A0 = y0Var;
                    h6Var.b0();
                    w6Var.setLayoutParams(new s4.p0(-1, -1));
                    p6Var = w6Var;
                    break;
                case 9:
                    v6 v6Var = new v6(this, context);
                    z6Var.U = v6Var;
                    v6Var.setTag(-33024);
                    k6Var = v6Var;
                    p6Var = k6Var;
                    break;
                case 10:
                    k6 k6Var2 = new k6(z6Var, context);
                    z6Var.V = k6Var2;
                    k6Var2.setTag(-33024);
                    k6Var = k6Var2;
                    p6Var = k6Var;
                    break;
                case 11:
                    p6Var = new org.telegram.ui.Cells.a2(4, 21, this.d, z6Var.getResourceProvider(), false);
                    break;
                case 12:
                    org.telegram.ui.Components.t00 t00Var2 = new org.telegram.ui.Components.t00(z6Var.getParentActivity(), null);
                    t00Var2.setIsSingleCell(true);
                    t00Var2.setItemsCount(1);
                    t00Var2.setIgnoreHeightCheck(true);
                    t00Var2.setViewType(26);
                    p6Var = t00Var2;
                    break;
                case 13:
                    p6 p6Var2 = new p6(z6Var, context);
                    z6Var.W = p6Var2;
                    p6Var = p6Var2;
                    break;
                case 14:
                    org.telegram.ui.Components.ew0 ew0Var2 = new org.telegram.ui.Components.ew0(context, null);
                    float f7 = ((int) ((z6Var.H / 1024) / 1024)) / 1000.0f;
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
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        if (((Integer) arrayList.get(i14)).intValue() == 1) {
                            strArr[i14] = "300 MB";
                        } else if (((Integer) arrayList.get(i14)).intValue() == Integer.MAX_VALUE) {
                            strArr[i14] = LocaleController.getString(R.string.NoLimit);
                        } else {
                            strArr[i14] = String.format("%d GB", arrayList.get(i14));
                        }
                    }
                    ew0Var2.setCallback(new y0(arrayList, 10));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    ew0Var2.b(indexOf2, null, strArr);
                    p6Var = ew0Var2;
                    break;
                default:
                    p6Var = new org.telegram.ui.Cells.f9(context);
                    break;
            }
        } else {
            p6Var = new org.telegram.ui.Cells.fa(context);
        }
        return new s4.c1(p6Var);
    }
}
