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
public final class z6 extends og.b {
    public final Context d;
    public final b7 e;

    public z6(b7 b7Var, Context context) {
        this.e = b7Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        b7 b7Var = this.e;
        if (c1Var.b() != b7Var.J) {
            int i10 = c1Var.f43008f;
            if ((i10 != 2 || b7Var.G <= 0 || b7Var.K) && i10 != 5 && i10 != 7 && i10 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f32262e0.size();
    }

    @Override
    public final int j(int i10) {
        return ((w6) this.e.f32262e0.get(i10)).f15754a;
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
        b7 b7Var = this.e;
        ArrayList arrayList = b7Var.f32262e0;
        w6 w6Var = (w6) arrayList.get(i10);
        int i12 = c1Var.f43008f;
        View view = c1Var.f43005a;
        String str = null;
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 7) {
                            switch (i12) {
                                case 9:
                                    b7Var.w0();
                                    return;
                                case 10:
                                    m6 m6Var = b7Var.V;
                                    if (m6Var != null && !b7Var.K) {
                                        long j3 = b7Var.G;
                                        if (j3 > 0) {
                                            z12 = true;
                                        }
                                        long j10 = b7Var.H;
                                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                        if (i13 <= 0) {
                                            f7 = 0.0f;
                                        } else {
                                            f7 = ((float) j3) / ((float) j10);
                                        }
                                        long j11 = b7Var.I;
                                        if (j11 > 0 && i13 > 0) {
                                            f10 = ((float) (j10 - j11)) / ((float) j10);
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        m6Var.b(f7, f10, z12);
                                        return;
                                    }
                                    return;
                                case 11:
                                    org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                                    int i14 = w6Var.f38821f;
                                    if (i14 < 0) {
                                        z10 = b7Var.r0();
                                    } else {
                                        z10 = b7Var.d[i14];
                                    }
                                    boolean z13 = z10;
                                    CharSequence charSequence = w6Var.d;
                                    int[] iArr = b7Var.S;
                                    int i15 = w6Var.f38821f;
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
                                    spannableString.setSpan(new org.telegram.ui.Components.u51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.append((CharSequence) "  ");
                                    spannableStringBuilder.append((CharSequence) spannableString);
                                    String formatFileSize = AndroidUtilities.formatFileSize(w6Var.f38822g);
                                    if (w6Var.f38821f >= 0 ? !w6Var.f38824j : !b7Var.L) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    a2Var.e(spannableStringBuilder, formatFileSize, z13, z11, false);
                                    int i17 = w6Var.h;
                                    int i18 = org.telegram.ui.ActionBar.i6.f19186k7;
                                    org.telegram.ui.Components.pp ppVar = a2Var.f20012r;
                                    if (ppVar != null) {
                                        ppVar.b(i17, i17, i18);
                                    }
                                    if (w6Var.f38821f < 0) {
                                        bool = Boolean.valueOf(b7Var.L);
                                    } else {
                                        bool = null;
                                    }
                                    a2Var.setCollapsed(bool);
                                    if (w6Var.f38821f == -1) {
                                        a2Var.d(new a(this, 7), new ai.f2(25, this, a2Var));
                                    } else {
                                        a2Var.d(null, null);
                                    }
                                    a2Var.setPad(w6Var.f38823i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        CacheByChatsController cacheByChatsController = b7Var.getMessagesController().getCacheByChatsController();
                        int i19 = w6Var.f38820c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((w6) arrayList.get(i10)).f38820c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i19));
                        if (((w6) arrayList.get(i10)).f38820c == 0) {
                            r8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((w6) arrayList.get(i10)).f38820c == 1) {
                            r8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((w6) arrayList.get(i10)).f38820c == 2) {
                            r8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((w6) arrayList.get(i10)).f38820c == 3) {
                            r8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                        r8Var.setSubtitle(str);
                        return;
                    }
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    m4Var.setText(((w6) arrayList.get(i10)).d);
                    ((w6) arrayList.get(i10)).getClass();
                    m4Var.setTopMargin(15);
                    ((w6) arrayList.get(i10)).getClass();
                    m4Var.setBottomMargin(0);
                    return;
                }
                final org.telegram.ui.Components.ry0 ry0Var = (org.telegram.ui.Components.ry0) view;
                boolean z14 = b7Var.K;
                long j12 = b7Var.e;
                long j13 = b7Var.G;
                long j14 = b7Var.I;
                long j15 = b7Var.H;
                com.google.firebase.messaging.m mVar = ry0Var.I;
                View view2 = ry0Var.f28118w;
                TextView textView = ry0Var.f28115n;
                TextView textView2 = ry0Var.h;
                TextView textView3 = ry0Var.v;
                org.telegram.ui.Cells.ea eaVar = ry0Var.f28120y;
                ry0Var.e = z14;
                TextView textView4 = ry0Var.f28116r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
                TextView textView5 = ry0Var.f28117s;
                long j16 = j15 - j14;
                textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j16)));
                if (z14) {
                    textView3.setVisibility(0);
                    textView2.setVisibility(8);
                    textView4.setVisibility(8);
                    textView5.setVisibility(8);
                    textView.setVisibility(8);
                    view2.setVisibility(8);
                    eaVar.setVisibility(8);
                    ry0Var.E = 0.0f;
                    ry0Var.F = 0.0f;
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
                        eaVar.setVisibility(0);
                        textView2.setVisibility(0);
                        textView.setVisibility(8);
                        eaVar.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j13), false, true);
                        textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j13 + j12)));
                    } else {
                        i11 = 0;
                        textView2.setVisibility(8);
                        textView.setVisibility(0);
                        textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j12)));
                        view2.setVisibility(8);
                        eaVar.setVisibility(8);
                    }
                    textView4.setVisibility(i11);
                    textView5.setVisibility(i11);
                    float f11 = (float) j15;
                    float f12 = ((float) (j13 + j12)) / f11;
                    float f13 = ((float) j16) / f11;
                    if (ry0Var.E != f12) {
                        ValueAnimator valueAnimator = ry0Var.G;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(ry0Var.E, f12);
                        ry0Var.G = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        ry0 ry0Var2 = ry0Var;
                                        ry0Var2.getClass();
                                        ry0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        ry0Var2.invalidate();
                                        return;
                                    default:
                                        ry0 ry0Var3 = ry0Var;
                                        ry0Var3.getClass();
                                        ry0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        ry0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        ry0Var.G.start();
                    }
                    if (ry0Var.F != f13) {
                        ValueAnimator valueAnimator2 = ry0Var.H;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(ry0Var.F, f13);
                        ry0Var.H = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (r2) {
                                    case 0:
                                        ry0 ry0Var2 = ry0Var;
                                        ry0Var2.getClass();
                                        ry0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        ry0Var2.invalidate();
                                        return;
                                    default:
                                        ry0 ry0Var3 = ry0Var;
                                        ry0Var3.getClass();
                                        ry0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        ry0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        ry0Var.H.start();
                    }
                }
                eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
                ry0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.e9) view).setText(AndroidUtilities.replaceTags(w6Var.e));
            return;
        }
        org.telegram.ui.Cells.ea eaVar2 = (org.telegram.ui.Cells.ea) view;
        if (i10 == b7Var.J) {
            eaVar2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        r6 r6Var;
        int i11;
        li.l lVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.l lVar2;
        m6 m6Var;
        Context context = this.d;
        if (i10 != 0) {
            b7 b7Var = this.e;
            switch (i10) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f28111a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f28112b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f28113c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.L = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f29314k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    ci.ab abVar = new ci.ab(frameLayout, context, 26);
                    frameLayout.f28114f = abVar;
                    frameLayout.addView(abVar, w7.y5.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, w7.y5.c(-2.0f, -1));
                    ai.w5 w5Var = new ai.w5(context, 20);
                    linearLayout.addView(w5Var, w7.y5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i12 = org.telegram.ui.ActionBar.i6.f19442y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
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
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    frameLayout.f28115n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    frameLayout.f28116r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    frameLayout.f28117s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    frameLayout.f28119x = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), frameLayout.f28119x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f28119x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f28119x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), frameLayout.f28119x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    w5Var.addView(textView, w7.y5.c(-2.0f, -2));
                    w5Var.addView(textView3, w7.y5.c(-2.0f, -2));
                    w5Var.addView(textView2, w7.y5.c(-2.0f, -2));
                    w5Var.addView(textView5, w7.y5.c(-2.0f, -2));
                    w5Var.addView(textView4, w7.y5.c(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f28118w = view;
                    linearLayout.addView(view, w7.y5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19058d7, false));
                    org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(frameLayout.getContext());
                    frameLayout.f28120y = eaVar;
                    linearLayout.addView(eaVar, w7.y5.n(-1, -2));
                    r6Var = frameLayout;
                    break;
                case 3:
                    r6Var = new org.telegram.ui.Cells.m4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, null);
                    gw0Var.setCallback(new n4(1));
                    int i13 = SharedConfig.keepMedia;
                    if (i13 == 3) {
                        i11 = 0;
                    } else {
                        i11 = i13 + 1;
                    }
                    gw0Var.b(i11, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    r6Var = gw0Var;
                    break;
                case 5:
                    r6Var = new a7(b7Var.getParentActivity(), b7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(b7Var.getParentActivity(), null);
                    v00Var.setIsSingleCell(true);
                    v00Var.setItemsCount(3);
                    v00Var.setIgnoreHeightCheck(true);
                    v00Var.setViewType(25);
                    r6Var = v00Var;
                    break;
                case 7:
                    r6Var = new org.telegram.ui.Cells.r8(context);
                    break;
                case 8:
                    lVar = ((org.telegram.ui.ActionBar.o2) b7Var).glassEngine;
                    y6 y6Var = new y6(this, context, b7Var, lVar);
                    b7Var.M = y6Var;
                    FrameLayout frameLayout2 = b7Var.N;
                    if (frameLayout2 != null && (frameLayout2.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) b7Var.N.getParent()).removeView(b7Var.N);
                    }
                    y6 y6Var2 = b7Var.M;
                    y6Var2.f38471x = true;
                    FrameLayout frameLayout3 = y6Var2.f38464b;
                    AndroidUtilities.removeFromParent(frameLayout3);
                    frameLayout3.setTranslationY(0.0f);
                    b7Var.N = frameLayout3;
                    ch.d c10 = b7Var.getBaseSimpleGlass().f14356c.c(b7Var.N, null, false);
                    e6Var = ((org.telegram.ui.ActionBar.o2) b7Var).resourceProvider;
                    c10.u(eh.b.m(e6Var));
                    c10.v(AndroidUtilities.dp(9.66f));
                    c10.w(AndroidUtilities.dp(18.0f));
                    frameLayout3.setBackground(c10);
                    b7Var.Z.addView(b7Var.N, w7.y5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
                    lVar2 = ((org.telegram.ui.ActionBar.o2) b7Var).actionBar;
                    lVar2.bringToFront();
                    b7Var.N.bringToFront();
                    b7Var.M.c(AndroidUtilities.dp(56.0f), b7Var.f32257b.getPaddingBottom());
                    ai.w0 w0Var = b7Var.f32257b;
                    if (w0Var != null) {
                        b7Var.P = ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) + w0Var.getPaddingTop()) - AndroidUtilities.dp(9.0f);
                    }
                    b7Var.z0();
                    b7Var.M.setDelegate(new g(this, 7));
                    b7Var.M.setCacheModel(b7Var.f32260c0);
                    b7Var.M.setTag(-33024);
                    j6 j6Var = b7Var.Z;
                    y6 y6Var3 = b7Var.M;
                    Objects.requireNonNull(y6Var3);
                    a1 a1Var = new a1(y6Var3, 9);
                    j6Var.f25131z0 = y6Var3;
                    j6Var.A0 = a1Var;
                    j6Var.b0();
                    y6Var.setLayoutParams(new s4.p0(-1, -1));
                    r6Var = y6Var;
                    break;
                case 9:
                    x6 x6Var = new x6(this, context);
                    b7Var.U = x6Var;
                    x6Var.setTag(-33024);
                    m6Var = x6Var;
                    r6Var = m6Var;
                    break;
                case 10:
                    m6 m6Var2 = new m6(b7Var, context);
                    b7Var.V = m6Var2;
                    m6Var2.setTag(-33024);
                    m6Var = m6Var2;
                    r6Var = m6Var;
                    break;
                case 11:
                    r6Var = new org.telegram.ui.Cells.a2(4, 21, this.d, b7Var.getResourceProvider(), false);
                    break;
                case 12:
                    org.telegram.ui.Components.v00 v00Var2 = new org.telegram.ui.Components.v00(b7Var.getParentActivity(), null);
                    v00Var2.setIsSingleCell(true);
                    v00Var2.setItemsCount(1);
                    v00Var2.setIgnoreHeightCheck(true);
                    v00Var2.setViewType(26);
                    r6Var = v00Var2;
                    break;
                case 13:
                    r6 r6Var2 = new r6(b7Var, context);
                    b7Var.W = r6Var2;
                    r6Var = r6Var2;
                    break;
                case 14:
                    org.telegram.ui.Components.gw0 gw0Var2 = new org.telegram.ui.Components.gw0(context, null);
                    float f7 = ((int) ((b7Var.H / 1024) / 1024)) / 1000.0f;
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
                    gw0Var2.setCallback(new a1(arrayList, 10));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    gw0Var2.b(indexOf2, null, strArr);
                    r6Var = gw0Var2;
                    break;
                default:
                    r6Var = new org.telegram.ui.Cells.e9(context);
                    break;
            }
        } else {
            r6Var = new org.telegram.ui.Cells.ea(context);
        }
        return new s4.c1(r6Var);
    }
}
