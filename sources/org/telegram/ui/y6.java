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
public final class y6 extends og.b {
    public final Context d;
    public final a7 e;

    public y6(a7 a7Var, Context context) {
        this.e = a7Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        a7 a7Var = this.e;
        if (c1Var.b() != a7Var.J) {
            int i10 = c1Var.f42700f;
            if ((i10 != 2 || a7Var.G <= 0 || a7Var.K) && i10 != 5 && i10 != 7 && i10 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f31739e0.size();
    }

    @Override
    public final int j(int i10) {
        return ((v6) this.e.f31739e0.get(i10)).f15543a;
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
        a7 a7Var = this.e;
        ArrayList arrayList = a7Var.f31739e0;
        v6 v6Var = (v6) arrayList.get(i10);
        int i12 = c1Var.f42700f;
        View view = c1Var.f42697a;
        String str = null;
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 7) {
                            switch (i12) {
                                case 9:
                                    a7Var.w0();
                                    return;
                                case 10:
                                    l6 l6Var = a7Var.V;
                                    if (l6Var != null && !a7Var.K) {
                                        long j3 = a7Var.G;
                                        if (j3 > 0) {
                                            z12 = true;
                                        }
                                        long j10 = a7Var.H;
                                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                        if (i13 <= 0) {
                                            f7 = 0.0f;
                                        } else {
                                            f7 = ((float) j3) / ((float) j10);
                                        }
                                        long j11 = a7Var.I;
                                        if (j11 > 0 && i13 > 0) {
                                            f10 = ((float) (j10 - j11)) / ((float) j10);
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        l6Var.b(f7, f10, z12);
                                        return;
                                    }
                                    return;
                                case 11:
                                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                    int i14 = v6Var.f38300f;
                                    if (i14 < 0) {
                                        z10 = a7Var.r0();
                                    } else {
                                        z10 = a7Var.d[i14];
                                    }
                                    boolean z13 = z10;
                                    CharSequence charSequence = v6Var.d;
                                    int[] iArr = a7Var.S;
                                    int i15 = v6Var.f38300f;
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
                                    spannableString.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.append((CharSequence) "  ");
                                    spannableStringBuilder.append((CharSequence) spannableString);
                                    String formatFileSize = AndroidUtilities.formatFileSize(v6Var.f38301g);
                                    if (v6Var.f38300f >= 0 ? !v6Var.f38303j : !a7Var.L) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    z1Var.e(spannableStringBuilder, formatFileSize, z13, z11, false);
                                    int i17 = v6Var.h;
                                    int i18 = org.telegram.ui.ActionBar.j6.f18991k7;
                                    org.telegram.ui.Components.np npVar = z1Var.f21686r;
                                    if (npVar != null) {
                                        npVar.b(i17, i17, i18);
                                    }
                                    if (v6Var.f38300f < 0) {
                                        bool = Boolean.valueOf(a7Var.L);
                                    } else {
                                        bool = null;
                                    }
                                    z1Var.setCollapsed(bool);
                                    if (v6Var.f38300f == -1) {
                                        z1Var.d(new a(this, 7), new ai.f2(25, this, z1Var));
                                    } else {
                                        z1Var.d(null, null);
                                    }
                                    z1Var.setPad(v6Var.f38302i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        CacheByChatsController cacheByChatsController = a7Var.getMessagesController().getCacheByChatsController();
                        int i19 = v6Var.f38299c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((v6) arrayList.get(i10)).f38299c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i19));
                        if (((v6) arrayList.get(i10)).f38299c == 0) {
                            r8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((v6) arrayList.get(i10)).f38299c == 1) {
                            r8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((v6) arrayList.get(i10)).f38299c == 2) {
                            r8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((v6) arrayList.get(i10)).f38299c == 3) {
                            r8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                        r8Var.setSubtitle(str);
                        return;
                    }
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    l4Var.setText(((v6) arrayList.get(i10)).d);
                    ((v6) arrayList.get(i10)).getClass();
                    l4Var.setTopMargin(15);
                    ((v6) arrayList.get(i10)).getClass();
                    l4Var.setBottomMargin(0);
                    return;
                }
                final org.telegram.ui.Components.gy0 gy0Var = (org.telegram.ui.Components.gy0) view;
                boolean z14 = a7Var.K;
                long j12 = a7Var.e;
                long j13 = a7Var.G;
                long j14 = a7Var.I;
                long j15 = a7Var.H;
                com.google.firebase.messaging.m mVar = gy0Var.I;
                View view2 = gy0Var.f24422w;
                TextView textView = gy0Var.f24419n;
                TextView textView2 = gy0Var.h;
                TextView textView3 = gy0Var.v;
                org.telegram.ui.Cells.ea eaVar = gy0Var.f24424y;
                gy0Var.e = z14;
                TextView textView4 = gy0Var.f24420r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
                TextView textView5 = gy0Var.f24421s;
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
                    gy0Var.E = 0.0f;
                    gy0Var.F = 0.0f;
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
                    if (gy0Var.E != f12) {
                        ValueAnimator valueAnimator = gy0Var.G;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(gy0Var.E, f12);
                        gy0Var.G = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        gy0 gy0Var2 = gy0Var;
                                        gy0Var2.getClass();
                                        gy0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        gy0Var2.invalidate();
                                        return;
                                    default:
                                        gy0 gy0Var3 = gy0Var;
                                        gy0Var3.getClass();
                                        gy0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        gy0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        gy0Var.G.start();
                    }
                    if (gy0Var.F != f13) {
                        ValueAnimator valueAnimator2 = gy0Var.H;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(gy0Var.F, f13);
                        gy0Var.H = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (r2) {
                                    case 0:
                                        gy0 gy0Var2 = gy0Var;
                                        gy0Var2.getClass();
                                        gy0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        gy0Var2.invalidate();
                                        return;
                                    default:
                                        gy0 gy0Var3 = gy0Var;
                                        gy0Var3.getClass();
                                        gy0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        gy0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        gy0Var.H.start();
                    }
                }
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                gy0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.e9) view).setText(AndroidUtilities.replaceTags(v6Var.e));
            return;
        }
        org.telegram.ui.Cells.ea eaVar2 = (org.telegram.ui.Cells.ea) view;
        if (i10 == a7Var.J) {
            eaVar2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        q6 q6Var;
        int i11;
        ki.i iVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.k kVar;
        l6 l6Var;
        Context context = this.d;
        if (i10 != 0) {
            a7 a7Var = this.e;
            switch (i10) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f24415a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f24416b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f24417c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.L = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f28946k = false;
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
                    frameLayout.f24418f = ebVar;
                    frameLayout.addView(ebVar, w7.x5.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, w7.x5.c(-2.0f, -1));
                    ai.x5 x5Var = new ai.x5(context, 20);
                    linearLayout.addView(x5Var, w7.x5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i12 = org.telegram.ui.ActionBar.j6.f19244y6;
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
                    frameLayout.f24419n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    frameLayout.f24420r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    frameLayout.f24421s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    frameLayout.f24423x = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), frameLayout.f24423x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f24423x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f24423x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), frameLayout.f24423x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    x5Var.addView(textView, w7.x5.c(-2.0f, -2));
                    x5Var.addView(textView3, w7.x5.c(-2.0f, -2));
                    x5Var.addView(textView2, w7.x5.c(-2.0f, -2));
                    x5Var.addView(textView5, w7.x5.c(-2.0f, -2));
                    x5Var.addView(textView4, w7.x5.c(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f24422w = view;
                    linearLayout.addView(view, w7.x5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d7, false));
                    org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(frameLayout.getContext());
                    frameLayout.f24424y = eaVar;
                    linearLayout.addView(eaVar, w7.x5.n(-1, -2));
                    q6Var = frameLayout;
                    break;
                case 3:
                    q6Var = new org.telegram.ui.Cells.l4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.uv0 uv0Var = new org.telegram.ui.Components.uv0(context, null);
                    uv0Var.setCallback(new m4.u0(15));
                    int i13 = SharedConfig.keepMedia;
                    if (i13 == 3) {
                        i11 = 0;
                    } else {
                        i11 = i13 + 1;
                    }
                    uv0Var.b(i11, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    q6Var = uv0Var;
                    break;
                case 5:
                    q6Var = new z6(a7Var.getParentActivity(), a7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(a7Var.getParentActivity(), null);
                    t00Var.setIsSingleCell(true);
                    t00Var.setItemsCount(3);
                    t00Var.setIgnoreHeightCheck(true);
                    t00Var.setViewType(25);
                    q6Var = t00Var;
                    break;
                case 7:
                    q6Var = new org.telegram.ui.Cells.r8(context);
                    break;
                case 8:
                    iVar = ((org.telegram.ui.ActionBar.o2) a7Var).glassEngine;
                    x6 x6Var = new x6(this, context, a7Var, iVar);
                    a7Var.M = x6Var;
                    FrameLayout frameLayout2 = a7Var.N;
                    if (frameLayout2 != null && (frameLayout2.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) a7Var.N.getParent()).removeView(a7Var.N);
                    }
                    x6 x6Var2 = a7Var.M;
                    x6Var2.f37956x = true;
                    FrameLayout frameLayout3 = x6Var2.f37949b;
                    AndroidUtilities.removeFromParent(frameLayout3);
                    frameLayout3.setTranslationY(0.0f);
                    a7Var.N = frameLayout3;
                    ch.d c10 = a7Var.getBaseSimpleGlass().f13656b.c(a7Var.N, null, false);
                    f6Var = ((org.telegram.ui.ActionBar.o2) a7Var).resourceProvider;
                    c10.o(eh.b.m(f6Var));
                    c10.p(AndroidUtilities.dp(9.66f));
                    c10.q(AndroidUtilities.dp(18.0f));
                    frameLayout3.setBackground(c10);
                    a7Var.Z.addView(a7Var.N, w7.x5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
                    kVar = ((org.telegram.ui.ActionBar.o2) a7Var).actionBar;
                    kVar.bringToFront();
                    a7Var.N.bringToFront();
                    a7Var.M.c(AndroidUtilities.dp(56.0f), a7Var.f31734b.getPaddingBottom());
                    ai.w0 w0Var = a7Var.f31734b;
                    if (w0Var != null) {
                        a7Var.P = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + w0Var.getPaddingTop()) - AndroidUtilities.dp(9.0f);
                    }
                    a7Var.z0();
                    a7Var.M.setDelegate(new g(this, 7));
                    a7Var.M.setCacheModel(a7Var.f31737c0);
                    a7Var.M.setTag(-33024);
                    i6 i6Var = a7Var.Z;
                    x6 x6Var3 = a7Var.M;
                    Objects.requireNonNull(x6Var3);
                    y0 y0Var = new y0(x6Var3, 9);
                    i6Var.f29663z0 = x6Var3;
                    i6Var.A0 = y0Var;
                    i6Var.b0();
                    x6Var.setLayoutParams(new s4.p0(-1, -1));
                    q6Var = x6Var;
                    break;
                case 9:
                    w6 w6Var = new w6(this, context);
                    a7Var.U = w6Var;
                    w6Var.setTag(-33024);
                    l6Var = w6Var;
                    q6Var = l6Var;
                    break;
                case 10:
                    l6 l6Var2 = new l6(a7Var, context);
                    a7Var.V = l6Var2;
                    l6Var2.setTag(-33024);
                    l6Var = l6Var2;
                    q6Var = l6Var;
                    break;
                case 11:
                    q6Var = new org.telegram.ui.Cells.z1(4, 21, this.d, a7Var.getResourceProvider(), false);
                    break;
                case 12:
                    org.telegram.ui.Components.t00 t00Var2 = new org.telegram.ui.Components.t00(a7Var.getParentActivity(), null);
                    t00Var2.setIsSingleCell(true);
                    t00Var2.setItemsCount(1);
                    t00Var2.setIgnoreHeightCheck(true);
                    t00Var2.setViewType(26);
                    q6Var = t00Var2;
                    break;
                case 13:
                    q6 q6Var2 = new q6(a7Var, context);
                    a7Var.W = q6Var2;
                    q6Var = q6Var2;
                    break;
                case 14:
                    org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
                    float f7 = ((int) ((a7Var.H / 1024) / 1024)) / 1000.0f;
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
                    uv0Var2.setCallback(new y0(arrayList, 10));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    uv0Var2.b(indexOf2, null, strArr);
                    q6Var = uv0Var2;
                    break;
                default:
                    q6Var = new org.telegram.ui.Cells.e9(context);
                    break;
            }
        } else {
            q6Var = new org.telegram.ui.Cells.ea(context);
        }
        return new s4.c1(q6Var);
    }
}
