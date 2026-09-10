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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class w6 extends ng.b {
    public final Context d;
    public final y6 e;

    public w6(y6 y6Var, Context context) {
        this.e = y6Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        y6 y6Var = this.e;
        if (c1Var.b() != y6Var.K) {
            int i10 = c1Var.f41613f;
            if ((i10 != 2 || y6Var.H <= 0 || y6Var.L) && i10 != 5 && i10 != 7 && i10 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f38908a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((t6) this.e.f38908a0.get(i10)).f14046a;
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
        y6 y6Var = this.e;
        ArrayList arrayList = y6Var.f38908a0;
        t6 t6Var = (t6) arrayList.get(i10);
        int i12 = c1Var.f41613f;
        View view = c1Var.f41610a;
        String str = null;
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 7) {
                            switch (i12) {
                                case 9:
                                    y6Var.v0();
                                    return;
                                case 10:
                                    k6 k6Var = y6Var.R;
                                    if (k6Var != null && !y6Var.L) {
                                        long j3 = y6Var.H;
                                        if (j3 > 0) {
                                            z12 = true;
                                        }
                                        long j10 = y6Var.I;
                                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                        if (i13 <= 0) {
                                            f7 = 0.0f;
                                        } else {
                                            f7 = ((float) j3) / ((float) j10);
                                        }
                                        long j11 = y6Var.J;
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
                                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                    int i14 = t6Var.f36845f;
                                    if (i14 < 0) {
                                        z10 = y6Var.r0();
                                    } else {
                                        z10 = y6Var.e[i14];
                                    }
                                    boolean z13 = z10;
                                    CharSequence charSequence = t6Var.d;
                                    int[] iArr = y6Var.O;
                                    int i15 = t6Var.f36845f;
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
                                    spannableString.setSpan(new org.telegram.ui.Components.s51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.append((CharSequence) "  ");
                                    spannableStringBuilder.append((CharSequence) spannableString);
                                    String formatFileSize = AndroidUtilities.formatFileSize(t6Var.f36846g);
                                    if (t6Var.f36845f >= 0 ? !t6Var.f36848j : !y6Var.M) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    z1Var.e(spannableStringBuilder, formatFileSize, z13, z11, false);
                                    int i17 = t6Var.h;
                                    int i18 = org.telegram.ui.ActionBar.j6.f18056k7;
                                    org.telegram.ui.Components.tp tpVar = z1Var.f20773r;
                                    if (tpVar != null) {
                                        tpVar.b(i17, i17, i18);
                                    }
                                    if (t6Var.f36845f < 0) {
                                        bool = Boolean.valueOf(y6Var.M);
                                    } else {
                                        bool = null;
                                    }
                                    z1Var.setCollapsed(bool);
                                    if (t6Var.f36845f == -1) {
                                        z1Var.d(new a(this, 7), new bi.n3(22, this, z1Var));
                                    } else {
                                        z1Var.d(null, null);
                                    }
                                    z1Var.setPad(t6Var.f36847i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                        CacheByChatsController cacheByChatsController = y6Var.getMessagesController().getCacheByChatsController();
                        int i19 = t6Var.f36844c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((t6) arrayList.get(i10)).f36844c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i19));
                        if (((t6) arrayList.get(i10)).f36844c == 0) {
                            s8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((t6) arrayList.get(i10)).f36844c == 1) {
                            s8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((t6) arrayList.get(i10)).f36844c == 2) {
                            s8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((t6) arrayList.get(i10)).f36844c == 3) {
                            s8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                        s8Var.setSubtitle(str);
                        return;
                    }
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    m4Var.setText(((t6) arrayList.get(i10)).d);
                    ((t6) arrayList.get(i10)).getClass();
                    m4Var.setTopMargin(15);
                    ((t6) arrayList.get(i10)).getClass();
                    m4Var.setBottomMargin(0);
                    return;
                }
                final org.telegram.ui.Components.ry0 ry0Var = (org.telegram.ui.Components.ry0) view;
                boolean z14 = y6Var.L;
                long j12 = y6Var.f38915f;
                long j13 = y6Var.H;
                long j14 = y6Var.J;
                long j15 = y6Var.I;
                com.google.firebase.messaging.m mVar = ry0Var.I;
                View view2 = ry0Var.f26793w;
                TextView textView = ry0Var.f26790n;
                TextView textView2 = ry0Var.h;
                TextView textView3 = ry0Var.v;
                org.telegram.ui.Cells.ga gaVar = ry0Var.f26795y;
                ry0Var.e = z14;
                TextView textView4 = ry0Var.f26791r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
                TextView textView5 = ry0Var.f26792s;
                long j16 = j15 - j14;
                textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j16)));
                if (z14) {
                    textView3.setVisibility(0);
                    textView2.setVisibility(8);
                    textView4.setVisibility(8);
                    textView5.setVisibility(8);
                    textView.setVisibility(8);
                    view2.setVisibility(8);
                    gaVar.setVisibility(8);
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
                        gaVar.setVisibility(0);
                        textView2.setVisibility(0);
                        textView.setVisibility(8);
                        gaVar.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j13), false, true);
                        textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j13 + j12)));
                    } else {
                        i11 = 0;
                        textView2.setVisibility(8);
                        textView.setVisibility(0);
                        textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j12)));
                        view2.setVisibility(8);
                        gaVar.setVisibility(8);
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
                gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                ry0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.f9) view).setText(AndroidUtilities.replaceTags(t6Var.e));
            return;
        }
        org.telegram.ui.Cells.ga gaVar2 = (org.telegram.ui.Cells.ga) view;
        if (i10 == y6Var.K) {
            gaVar2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        p6 p6Var;
        int i11;
        k6 k6Var;
        Context context = this.d;
        if (i10 != 0) {
            y6 y6Var = this.e;
            switch (i10) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f26786a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f26787b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f26788c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.L = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f28151k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    bi.nc ncVar = new bi.nc(frameLayout, context, 26);
                    frameLayout.f26789f = ncVar;
                    frameLayout.addView(ncVar, w7.a6.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, w7.a6.c(-2.0f, -1));
                    bi.l4 l4Var = new bi.l4(context, 19);
                    linearLayout.addView(l4Var, w7.a6.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i12 = org.telegram.ui.ActionBar.j6.f18306y6;
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
                    frameLayout.f26790n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    frameLayout.f26791r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    frameLayout.f26792s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    frameLayout.f26794x = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), frameLayout.f26794x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f26794x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f26794x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), frameLayout.f26794x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    l4Var.addView(textView, w7.a6.c(-2.0f, -2));
                    l4Var.addView(textView3, w7.a6.c(-2.0f, -2));
                    l4Var.addView(textView2, w7.a6.c(-2.0f, -2));
                    l4Var.addView(textView5, w7.a6.c(-2.0f, -2));
                    l4Var.addView(textView4, w7.a6.c(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f26793w = view;
                    linearLayout.addView(view, w7.a6.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17929d7, false));
                    org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(frameLayout.getContext());
                    frameLayout.f26795y = gaVar;
                    linearLayout.addView(gaVar, w7.a6.n(-1, -2));
                    p6Var = frameLayout;
                    break;
                case 3:
                    p6Var = new org.telegram.ui.Cells.m4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.ew0 ew0Var = new org.telegram.ui.Components.ew0(context, null);
                    ew0Var.setCallback(new n2.l(13));
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
                    p6Var = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(y6Var.getParentActivity(), null);
                    a10Var.setIsSingleCell(true);
                    a10Var.setItemsCount(3);
                    a10Var.setIgnoreHeightCheck(true);
                    a10Var.setViewType(25);
                    p6Var = a10Var;
                    break;
                case 7:
                    p6Var = new org.telegram.ui.Cells.s8(context);
                    break;
                case 8:
                    v6 v6Var = new v6(this, context, y6Var, 0);
                    y6Var.N = v6Var;
                    v6Var.setDelegate(new g(this, 7));
                    y6Var.N.setCacheModel(y6Var.Y);
                    y6Var.V.a0(y6Var.N, AndroidUtilities.dp(40.0f));
                    v6Var.setLayoutParams(new s4.p0(-1, -1));
                    p6Var = v6Var;
                    break;
                case 9:
                    u6 u6Var = new u6(this, context);
                    y6Var.Q = u6Var;
                    u6Var.setTag(-33024);
                    k6Var = u6Var;
                    p6Var = k6Var;
                    break;
                case 10:
                    k6 k6Var2 = new k6(y6Var, context);
                    y6Var.R = k6Var2;
                    k6Var2.setTag(-33024);
                    k6Var = k6Var2;
                    p6Var = k6Var;
                    break;
                case 11:
                    p6Var = new org.telegram.ui.Cells.z1(4, 21, this.d, y6Var.getResourceProvider(), false);
                    break;
                case 12:
                    org.telegram.ui.Components.a10 a10Var2 = new org.telegram.ui.Components.a10(y6Var.getParentActivity(), null);
                    a10Var2.setIsSingleCell(true);
                    a10Var2.setItemsCount(1);
                    a10Var2.setIgnoreHeightCheck(true);
                    a10Var2.setViewType(26);
                    p6Var = a10Var2;
                    break;
                case 13:
                    p6 p6Var2 = new p6(y6Var, context);
                    y6Var.S = p6Var2;
                    p6Var = p6Var2;
                    break;
                case 14:
                    org.telegram.ui.Components.ew0 ew0Var2 = new org.telegram.ui.Components.ew0(context, null);
                    float f7 = ((int) ((y6Var.I / 1024) / 1024)) / 1000.0f;
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
                    ew0Var2.setCallback(new a1(arrayList, 9));
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
            p6Var = new org.telegram.ui.Cells.ga(context);
        }
        return new s4.c1(p6Var);
    }
}
