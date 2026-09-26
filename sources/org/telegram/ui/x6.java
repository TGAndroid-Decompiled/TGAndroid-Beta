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
        if (c1Var.b() != z6Var.K) {
            int i10 = c1Var.f42962f;
            if ((i10 != 2 || z6Var.H <= 0 || z6Var.L) && i10 != 5 && i10 != 7 && i10 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.e.f40346a0.size();
    }

    @Override
    public final int j(int i10) {
        return ((t6) this.e.f40346a0.get(i10)).f15715a;
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
        ArrayList arrayList = z6Var.f40346a0;
        t6 t6Var = (t6) arrayList.get(i10);
        int i12 = c1Var.f42962f;
        View view = c1Var.f42959a;
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
                                    j6 j6Var = z6Var.R;
                                    if (j6Var != null && !z6Var.L) {
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
                                        j6Var.b(f7, f10, z12);
                                        return;
                                    }
                                    return;
                                case 11:
                                    org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                                    int i14 = t6Var.f37973f;
                                    if (i14 < 0) {
                                        z10 = z6Var.r0();
                                    } else {
                                        z10 = z6Var.e[i14];
                                    }
                                    boolean z13 = z10;
                                    CharSequence charSequence = t6Var.d;
                                    int[] iArr = z6Var.O;
                                    int i15 = t6Var.f37973f;
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
                                    String formatFileSize = AndroidUtilities.formatFileSize(t6Var.f37974g);
                                    if (t6Var.f37973f >= 0 ? !t6Var.f37976j : !z6Var.M) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    a2Var.e(spannableStringBuilder, formatFileSize, z13, z11, false);
                                    int i17 = t6Var.h;
                                    int i18 = org.telegram.ui.ActionBar.h6.f19187k7;
                                    org.telegram.ui.Components.pp ppVar = a2Var.f20010r;
                                    if (ppVar != null) {
                                        ppVar.b(i17, i17, i18);
                                    }
                                    if (t6Var.f37973f < 0) {
                                        bool = Boolean.valueOf(z6Var.M);
                                    } else {
                                        bool = null;
                                    }
                                    a2Var.setCollapsed(bool);
                                    if (t6Var.f37973f == -1) {
                                        a2Var.d(new a(this, 7), new ai.f2(25, this, a2Var));
                                    } else {
                                        a2Var.d(null, null);
                                    }
                                    a2Var.setPad(t6Var.f37975i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        CacheByChatsController cacheByChatsController = z6Var.getMessagesController().getCacheByChatsController();
                        int i19 = t6Var.f37972c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((t6) arrayList.get(i10)).f37972c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i19));
                        if (((t6) arrayList.get(i10)).f37972c == 0) {
                            r8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((t6) arrayList.get(i10)).f37972c == 1) {
                            r8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((t6) arrayList.get(i10)).f37972c == 2) {
                            r8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((t6) arrayList.get(i10)).f37972c == 3) {
                            r8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                        r8Var.setSubtitle(str);
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
                final org.telegram.ui.Components.qy0 qy0Var = (org.telegram.ui.Components.qy0) view;
                boolean z14 = z6Var.L;
                long j12 = z6Var.f40353f;
                long j13 = z6Var.H;
                long j14 = z6Var.J;
                long j15 = z6Var.I;
                com.google.firebase.messaging.m mVar = qy0Var.I;
                View view2 = qy0Var.f27786w;
                TextView textView = qy0Var.f27783n;
                TextView textView2 = qy0Var.h;
                TextView textView3 = qy0Var.v;
                org.telegram.ui.Cells.ea eaVar = qy0Var.f27788y;
                qy0Var.e = z14;
                TextView textView4 = qy0Var.f27784r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
                TextView textView5 = qy0Var.f27785s;
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
                eaVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
                qy0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.e9) view).setText(AndroidUtilities.replaceTags(t6Var.e));
            return;
        }
        org.telegram.ui.Cells.ea eaVar2 = (org.telegram.ui.Cells.ea) view;
        if (i10 == z6Var.K) {
            eaVar2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        o6 o6Var;
        int i11;
        j6 j6Var;
        Context context = this.d;
        if (i10 != 0) {
            z6 z6Var = this.e;
            switch (i10) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f27779a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f27780b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f27781c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.L = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f29288k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    ci.bb bbVar = new ci.bb(frameLayout, context, 26);
                    frameLayout.f27782f = bbVar;
                    frameLayout.addView(bbVar, w7.y5.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, w7.y5.c(-2.0f, -1));
                    ai.w5 w5Var = new ai.w5(context, 20);
                    linearLayout.addView(w5Var, w7.y5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i12 = org.telegram.ui.ActionBar.h6.f19442y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
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
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    frameLayout.f27783n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    frameLayout.f27784r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    frameLayout.f27785s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                    frameLayout.f27787x = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), frameLayout.f27787x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f27787x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f27787x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(10.0f), frameLayout.f27787x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    w5Var.addView(textView, w7.y5.c(-2.0f, -2));
                    w5Var.addView(textView3, w7.y5.c(-2.0f, -2));
                    w5Var.addView(textView2, w7.y5.c(-2.0f, -2));
                    w5Var.addView(textView5, w7.y5.c(-2.0f, -2));
                    w5Var.addView(textView4, w7.y5.c(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f27786w = view;
                    linearLayout.addView(view, w7.y5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d7, false));
                    org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(frameLayout.getContext());
                    frameLayout.f27788y = eaVar;
                    linearLayout.addView(eaVar, w7.y5.n(-1, -2));
                    o6Var = frameLayout;
                    break;
                case 3:
                    o6Var = new org.telegram.ui.Cells.m4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.fw0 fw0Var = new org.telegram.ui.Components.fw0(context, null);
                    fw0Var.setCallback(new u6(0));
                    int i13 = SharedConfig.keepMedia;
                    if (i13 == 3) {
                        i11 = 0;
                    } else {
                        i11 = i13 + 1;
                    }
                    fw0Var.b(i11, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    o6Var = fw0Var;
                    break;
                case 5:
                    o6Var = new y6(z6Var.getParentActivity(), z6Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00(z6Var.getParentActivity(), null);
                    v00Var.setIsSingleCell(true);
                    v00Var.setItemsCount(3);
                    v00Var.setIgnoreHeightCheck(true);
                    v00Var.setViewType(25);
                    o6Var = v00Var;
                    break;
                case 7:
                    o6Var = new org.telegram.ui.Cells.r8(context);
                    break;
                case 8:
                    w6 w6Var = new w6(this, context, z6Var, 0);
                    z6Var.N = w6Var;
                    w6Var.setDelegate(new g(this, 7));
                    z6Var.N.setCacheModel(z6Var.Y);
                    z6Var.V.a0(z6Var.N, AndroidUtilities.dp(40.0f));
                    w6Var.setLayoutParams(new s4.p0(-1, -1));
                    o6Var = w6Var;
                    break;
                case 9:
                    v6 v6Var = new v6(this, context);
                    z6Var.Q = v6Var;
                    v6Var.setTag(-33024);
                    j6Var = v6Var;
                    o6Var = j6Var;
                    break;
                case 10:
                    j6 j6Var2 = new j6(z6Var, context);
                    z6Var.R = j6Var2;
                    j6Var2.setTag(-33024);
                    j6Var = j6Var2;
                    o6Var = j6Var;
                    break;
                case 11:
                    o6Var = new org.telegram.ui.Cells.a2(4, 21, this.d, z6Var.getResourceProvider(), false);
                    break;
                case 12:
                    org.telegram.ui.Components.v00 v00Var2 = new org.telegram.ui.Components.v00(z6Var.getParentActivity(), null);
                    v00Var2.setIsSingleCell(true);
                    v00Var2.setItemsCount(1);
                    v00Var2.setIgnoreHeightCheck(true);
                    v00Var2.setViewType(26);
                    o6Var = v00Var2;
                    break;
                case 13:
                    o6 o6Var2 = new o6(z6Var, context);
                    z6Var.S = o6Var2;
                    o6Var = o6Var2;
                    break;
                case 14:
                    org.telegram.ui.Components.fw0 fw0Var2 = new org.telegram.ui.Components.fw0(context, null);
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
                    fw0Var2.setCallback(new z0(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    fw0Var2.b(indexOf2, null, strArr);
                    o6Var = fw0Var2;
                    break;
                default:
                    o6Var = new org.telegram.ui.Cells.e9(context);
                    break;
            }
        } else {
            o6Var = new org.telegram.ui.Cells.ea(context);
        }
        return new s4.c1(o6Var);
    }
}
