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
public final class x6 extends pg.b {
    public final Context d;
    public final z6 f42597e;

    public x6(z6 z6Var, Context context) {
        this.f42597e = z6Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        z6 z6Var = this.f42597e;
        if (c1Var.b() != z6Var.K) {
            int i10 = c1Var.f45742f;
            if ((i10 != 2 || z6Var.H <= 0 || z6Var.L) && i10 != 5 && i10 != 7 && i10 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f42597e.f43304a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((u6) this.f42597e.f43304a0.get(i10)).f44071a;
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
        z6 z6Var = this.f42597e;
        ArrayList arrayList = z6Var.f43304a0;
        u6 u6Var = (u6) arrayList.get(i10);
        int i12 = c1Var.f45742f;
        View view = c1Var.f45738a;
        String str = null;
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 7) {
                            switch (i12) {
                                case 9:
                                    z6Var.v0();
                                    return;
                                case 10:
                                    k6 k6Var = z6Var.R;
                                    if (k6Var != null && !z6Var.L) {
                                        long j3 = z6Var.H;
                                        if (j3 > 0) {
                                            z12 = true;
                                        }
                                        long j10 = z6Var.I;
                                        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                        if (i13 <= 0) {
                                            f7 = 0.0f;
                                        } else {
                                            f7 = ((float) j3) / ((float) j10);
                                        }
                                        long j11 = z6Var.J;
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
                                    int i14 = u6Var.f40943f;
                                    if (i14 < 0) {
                                        z10 = z6Var.r0();
                                    } else {
                                        z10 = z6Var.f43310e[i14];
                                    }
                                    boolean z13 = z10;
                                    CharSequence charSequence = u6Var.d;
                                    int[] iArr = z6Var.O;
                                    int i15 = u6Var.f40943f;
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
                                    spannableString.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.append((CharSequence) "  ");
                                    spannableStringBuilder.append((CharSequence) spannableString);
                                    String formatFileSize = AndroidUtilities.formatFileSize(u6Var.f40944g);
                                    if (u6Var.f40943f >= 0 ? !u6Var.f40946j : !z6Var.M) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    z1Var.e(spannableStringBuilder, formatFileSize, z13, z11, false);
                                    int i17 = u6Var.h;
                                    int i18 = org.telegram.ui.ActionBar.j6.f20792k7;
                                    org.telegram.ui.Components.mp mpVar = z1Var.f23597r;
                                    if (mpVar != null) {
                                        mpVar.b(i17, i17, i18);
                                    }
                                    if (u6Var.f40943f < 0) {
                                        bool = Boolean.valueOf(z6Var.M);
                                    } else {
                                        bool = null;
                                    }
                                    z1Var.setCollapsed(bool);
                                    if (u6Var.f40943f == -1) {
                                        z1Var.d(new a(this, 7), new bi.u1(25, this, z1Var));
                                    } else {
                                        z1Var.d(null, null);
                                    }
                                    z1Var.setPad(u6Var.f40945i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        CacheByChatsController cacheByChatsController = z6Var.getMessagesController().getCacheByChatsController();
                        int i19 = u6Var.f40941c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((u6) arrayList.get(i10)).f40941c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i19));
                        if (((u6) arrayList.get(i10)).f40941c == 0) {
                            r8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((u6) arrayList.get(i10)).f40941c == 1) {
                            r8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((u6) arrayList.get(i10)).f40941c == 2) {
                            r8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((u6) arrayList.get(i10)).f40941c == 3) {
                            r8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                        r8Var.setSubtitle(str);
                        return;
                    }
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    l4Var.setText(((u6) arrayList.get(i10)).d);
                    ((u6) arrayList.get(i10)).getClass();
                    l4Var.setTopMargin(15);
                    ((u6) arrayList.get(i10)).getClass();
                    l4Var.setBottomMargin(0);
                    return;
                }
                final org.telegram.ui.Components.ey0 ey0Var = (org.telegram.ui.Components.ey0) view;
                boolean z14 = z6Var.L;
                long j12 = z6Var.f43312f;
                long j13 = z6Var.H;
                long j14 = z6Var.J;
                long j15 = z6Var.I;
                com.google.firebase.messaging.m mVar = ey0Var.I;
                View view2 = ey0Var.f25813w;
                TextView textView = ey0Var.f25810n;
                TextView textView2 = ey0Var.h;
                TextView textView3 = ey0Var.v;
                org.telegram.ui.Cells.ea eaVar = ey0Var.f25815y;
                ey0Var.f25808e = z14;
                TextView textView4 = ey0Var.f25811r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
                TextView textView5 = ey0Var.f25812s;
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
                    ey0Var.E = 0.0f;
                    ey0Var.F = 0.0f;
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
                    if (ey0Var.E != f12) {
                        ValueAnimator valueAnimator = ey0Var.G;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(ey0Var.E, f12);
                        ey0Var.G = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        ey0 ey0Var2 = ey0Var;
                                        ey0Var2.getClass();
                                        ey0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        ey0Var2.invalidate();
                                        return;
                                    default:
                                        ey0 ey0Var3 = ey0Var;
                                        ey0Var3.getClass();
                                        ey0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        ey0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        ey0Var.G.start();
                    }
                    if (ey0Var.F != f13) {
                        ValueAnimator valueAnimator2 = ey0Var.H;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(ey0Var.F, f13);
                        ey0Var.H = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (r2) {
                                    case 0:
                                        ey0 ey0Var2 = ey0Var;
                                        ey0Var2.getClass();
                                        ey0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        ey0Var2.invalidate();
                                        return;
                                    default:
                                        ey0 ey0Var3 = ey0Var;
                                        ey0Var3.getClass();
                                        ey0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        ey0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        ey0Var.H.start();
                    }
                }
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                ey0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.e9) view).setText(AndroidUtilities.replaceTags(u6Var.f40942e));
            return;
        }
        org.telegram.ui.Cells.ea eaVar2 = (org.telegram.ui.Cells.ea) view;
        if (i10 == z6Var.K) {
            eaVar2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        p6 p6Var;
        int i11;
        k6 k6Var;
        Context context = this.d;
        if (i10 != 0) {
            z6 z6Var = this.f42597e;
            switch (i10) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f25805a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f25806b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f25807c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.L = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f31507k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    di.eb ebVar = new di.eb(frameLayout, context, 26);
                    frameLayout.f25809f = ebVar;
                    frameLayout.addView(ebVar, w7.x5.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, w7.x5.c(-2.0f, -1));
                    bi.g5 g5Var = new bi.g5(context, 20);
                    linearLayout.addView(g5Var, w7.x5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i12 = org.telegram.ui.ActionBar.j6.f21042y6;
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
                    frameLayout.f25810n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    frameLayout.f25811r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    frameLayout.f25812s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    frameLayout.f25814x = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), frameLayout.f25814x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f25814x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f25814x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), frameLayout.f25814x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    g5Var.addView(textView, w7.x5.c(-2.0f, -2));
                    g5Var.addView(textView3, w7.x5.c(-2.0f, -2));
                    g5Var.addView(textView2, w7.x5.c(-2.0f, -2));
                    g5Var.addView(textView5, w7.x5.c(-2.0f, -2));
                    g5Var.addView(textView4, w7.x5.c(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f25813w = view;
                    linearLayout.addView(view, w7.x5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20664d7, false));
                    org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(frameLayout.getContext());
                    frameLayout.f25815y = eaVar;
                    linearLayout.addView(eaVar, w7.x5.n(-1, -2));
                    p6Var = frameLayout;
                    break;
                case 3:
                    p6Var = new org.telegram.ui.Cells.l4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.sv0 sv0Var = new org.telegram.ui.Components.sv0(context, null);
                    sv0Var.setCallback(new m4.t0(12));
                    int i13 = SharedConfig.keepMedia;
                    if (i13 == 3) {
                        i11 = 0;
                    } else {
                        i11 = i13 + 1;
                    }
                    sv0Var.b(i11, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    p6Var = sv0Var;
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
                    p6Var = new org.telegram.ui.Cells.r8(context);
                    break;
                case 8:
                    w6 w6Var = new w6(this, context, z6Var, 0);
                    z6Var.N = w6Var;
                    w6Var.setDelegate(new g(this, 7));
                    z6Var.N.setCacheModel(z6Var.Y);
                    z6Var.V.a0(z6Var.N, AndroidUtilities.dp(40.0f));
                    w6Var.setLayoutParams(new s4.p0(-1, -1));
                    p6Var = w6Var;
                    break;
                case 9:
                    v6 v6Var = new v6(this, context);
                    z6Var.Q = v6Var;
                    v6Var.setTag(-33024);
                    k6Var = v6Var;
                    p6Var = k6Var;
                    break;
                case 10:
                    k6 k6Var2 = new k6(z6Var, context);
                    z6Var.R = k6Var2;
                    k6Var2.setTag(-33024);
                    k6Var = k6Var2;
                    p6Var = k6Var;
                    break;
                case 11:
                    p6Var = new org.telegram.ui.Cells.z1(4, 21, this.d, z6Var.getResourceProvider(), false);
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
                    z6Var.S = p6Var2;
                    p6Var = p6Var2;
                    break;
                case 14:
                    org.telegram.ui.Components.sv0 sv0Var2 = new org.telegram.ui.Components.sv0(context, null);
                    float f7 = ((int) ((z6Var.I / 1024) / 1024)) / 1000.0f;
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
                    sv0Var2.setCallback(new z0(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    sv0Var2.b(indexOf2, null, strArr);
                    p6Var = sv0Var2;
                    break;
                default:
                    p6Var = new org.telegram.ui.Cells.e9(context);
                    break;
            }
        } else {
            p6Var = new org.telegram.ui.Cells.ea(context);
        }
        return new s4.c1(p6Var);
    }
}
