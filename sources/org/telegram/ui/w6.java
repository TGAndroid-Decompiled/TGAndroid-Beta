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
public final class w6 extends wf.b {
    public final Context d;
    public final y6 f43679e;

    public w6(y6 y6Var, Context context) {
        this.f43679e = y6Var;
        this.d = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        y6 y6Var = this.f43679e;
        if (q1Var.b() != y6Var.G) {
            int i9 = q1Var.f5505f;
            if ((i9 != 2 || y6Var.D <= 0 || y6Var.H) && i9 != 5 && i9 != 7 && i9 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f43679e.W.size();
    }

    @Override
    public final int j(int i9) {
        return ((t6) this.f43679e.W.get(i9)).f48814a;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        float f10;
        float f11;
        boolean z10;
        String format;
        boolean z11;
        Boolean bool;
        y6 y6Var = this.f43679e;
        ArrayList arrayList = y6Var.W;
        t6 t6Var = (t6) arrayList.get(i9);
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        String str = null;
        boolean z12 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 7) {
                            switch (i11) {
                                case 9:
                                    y6Var.u0();
                                    return;
                                case 10:
                                    i6 i6Var = y6Var.N;
                                    if (i6Var != null && !y6Var.H) {
                                        long j10 = y6Var.D;
                                        if (j10 > 0) {
                                            z12 = true;
                                        }
                                        long j11 = y6Var.E;
                                        int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                        if (i12 <= 0) {
                                            f10 = 0.0f;
                                        } else {
                                            f10 = ((float) j10) / ((float) j11);
                                        }
                                        long j12 = y6Var.F;
                                        if (j12 > 0 && i12 > 0) {
                                            f11 = ((float) (j11 - j12)) / ((float) j11);
                                        } else {
                                            f11 = 0.0f;
                                        }
                                        i6Var.b(f10, f11, z12);
                                        return;
                                    }
                                    return;
                                case 11:
                                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                    int i13 = t6Var.f42865f;
                                    if (i13 < 0) {
                                        z10 = y6Var.q0();
                                    } else {
                                        z10 = y6Var.f44743e[i13];
                                    }
                                    boolean z13 = z10;
                                    CharSequence charSequence = t6Var.d;
                                    int[] iArr = y6Var.K;
                                    int i14 = t6Var.f42865f;
                                    if (i14 < 0) {
                                        i14 = 9;
                                    }
                                    int i15 = iArr[i14];
                                    if (i15 <= 0) {
                                        format = String.format("<%.1f%%", Float.valueOf(1.0f));
                                    } else {
                                        format = String.format("%d%%", Integer.valueOf(i15));
                                    }
                                    SpannableString spannableString = new SpannableString(format);
                                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                                    spannableString.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.append((CharSequence) "  ");
                                    spannableStringBuilder.append((CharSequence) spannableString);
                                    String formatFileSize = AndroidUtilities.formatFileSize(t6Var.f42866g);
                                    if (t6Var.f42865f >= 0 ? !t6Var.f42868j : !y6Var.I) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    z1Var.e(spannableStringBuilder, formatFileSize, z13, z11, false);
                                    int i16 = t6Var.h;
                                    int i17 = org.telegram.ui.ActionBar.f6.f23128k7;
                                    org.telegram.ui.Components.dp dpVar = z1Var.f26015r;
                                    if (dpVar != null) {
                                        dpVar.b(i16, i16, i17);
                                    }
                                    if (t6Var.f42865f < 0) {
                                        bool = Boolean.valueOf(y6Var.I);
                                    } else {
                                        bool = null;
                                    }
                                    z1Var.setCollapsed(bool);
                                    if (t6Var.f42865f == -1) {
                                        z1Var.d(new a(this, 7), new mh.k3(12, this, z1Var));
                                    } else {
                                        z1Var.d(null, null);
                                    }
                                    z1Var.setPad(t6Var.f42867i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                        CacheByChatsController cacheByChatsController = y6Var.getMessagesController().getCacheByChatsController();
                        int i18 = t6Var.f42863c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((t6) arrayList.get(i9)).f42863c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i18));
                        if (((t6) arrayList.get(i9)).f42863c == 0) {
                            p8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((t6) arrayList.get(i9)).f42863c == 1) {
                            p8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((t6) arrayList.get(i9)).f42863c == 2) {
                            p8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((t6) arrayList.get(i9)).f42863c == 3) {
                            p8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                        p8Var.setSubtitle(str);
                        return;
                    }
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    m4Var.setText(((t6) arrayList.get(i9)).d);
                    ((t6) arrayList.get(i9)).getClass();
                    m4Var.setTopMargin(15);
                    ((t6) arrayList.get(i9)).getClass();
                    m4Var.setBottomMargin(0);
                    return;
                }
                final org.telegram.ui.Components.mx0 mx0Var = (org.telegram.ui.Components.mx0) view;
                boolean z14 = y6Var.H;
                long j13 = y6Var.f44745f;
                long j14 = y6Var.D;
                long j15 = y6Var.F;
                long j16 = y6Var.E;
                com.google.firebase.messaging.l lVar = mx0Var.E;
                View view2 = mx0Var.f30941w;
                TextView textView = mx0Var.f30938n;
                TextView textView2 = mx0Var.h;
                TextView textView3 = mx0Var.v;
                org.telegram.ui.Cells.ba baVar = mx0Var.f30943y;
                mx0Var.f30936e = z14;
                TextView textView4 = mx0Var.f30939r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j15)));
                TextView textView5 = mx0Var.f30940s;
                long j17 = j16 - j15;
                textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j17)));
                if (z14) {
                    textView3.setVisibility(0);
                    textView2.setVisibility(8);
                    textView4.setVisibility(8);
                    textView5.setVisibility(8);
                    textView.setVisibility(8);
                    view2.setVisibility(8);
                    baVar.setVisibility(8);
                    mx0Var.A = 0.0f;
                    mx0Var.B = 0.0f;
                    if (lVar != null) {
                        lVar.c(textView3);
                    }
                } else {
                    if (lVar != null) {
                        lVar.q(textView3);
                    }
                    textView3.setVisibility(8);
                    if (j14 > 0) {
                        i10 = 0;
                        view2.setVisibility(0);
                        baVar.setVisibility(0);
                        textView2.setVisibility(0);
                        textView.setVisibility(8);
                        baVar.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j14), false, true);
                        textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j14 + j13)));
                    } else {
                        i10 = 0;
                        textView2.setVisibility(8);
                        textView.setVisibility(0);
                        textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j13)));
                        view2.setVisibility(8);
                        baVar.setVisibility(8);
                    }
                    textView4.setVisibility(i10);
                    textView5.setVisibility(i10);
                    float f12 = (float) j16;
                    float f13 = ((float) (j14 + j13)) / f12;
                    float f14 = ((float) j17) / f12;
                    if (mx0Var.A != f13) {
                        ValueAnimator valueAnimator = mx0Var.C;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(mx0Var.A, f13);
                        mx0Var.C = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        mx0 mx0Var2 = mx0Var;
                                        mx0Var2.getClass();
                                        mx0Var2.A = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        mx0Var2.invalidate();
                                        return;
                                    default:
                                        mx0 mx0Var3 = mx0Var;
                                        mx0Var3.getClass();
                                        mx0Var3.B = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        mx0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        mx0Var.C.start();
                    }
                    if (mx0Var.B != f14) {
                        ValueAnimator valueAnimator2 = mx0Var.D;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(mx0Var.B, f14);
                        mx0Var.D = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (r2) {
                                    case 0:
                                        mx0 mx0Var2 = mx0Var;
                                        mx0Var2.getClass();
                                        mx0Var2.A = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        mx0Var2.invalidate();
                                        return;
                                    default:
                                        mx0 mx0Var3 = mx0Var;
                                        mx0Var3.getClass();
                                        mx0Var3.B = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        mx0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        mx0Var.D.start();
                    }
                }
                baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                mx0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.b9) view).setText(AndroidUtilities.replaceTags(t6Var.f42864e));
            return;
        }
        org.telegram.ui.Cells.ba baVar2 = (org.telegram.ui.Cells.ba) view;
        if (i9 == y6Var.G) {
            baVar2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        o6 o6Var;
        int i10;
        i6 i6Var;
        Context context = this.d;
        if (i9 != 0) {
            y6 y6Var = this.f43679e;
            switch (i9) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f30933a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f30934b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f30935c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.H = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f33545k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    fh.l2 l2Var = new fh.l2(frameLayout, context, 25);
                    frameLayout.f30937f = l2Var;
                    frameLayout.addView(l2Var, g7.e6.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, g7.e6.c(-2.0f, -1));
                    dh.g gVar = new dh.g(context, 19);
                    linearLayout.addView(gVar, g7.e6.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i11 = org.telegram.ui.ActionBar.f6.f23369y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l(textView);
                        frameLayout.E = lVar;
                        lVar.u(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    frameLayout.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    TextView textView3 = new TextView(context);
                    frameLayout.f30938n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    TextView textView4 = new TextView(context);
                    frameLayout.f30939r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    TextView textView5 = new TextView(context);
                    frameLayout.f30940s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    frameLayout.f30942x = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), frameLayout.f30942x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f30942x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f30942x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), frameLayout.f30942x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    gVar.addView(textView, g7.e6.c(-2.0f, -2));
                    gVar.addView(textView3, g7.e6.c(-2.0f, -2));
                    gVar.addView(textView2, g7.e6.c(-2.0f, -2));
                    gVar.addView(textView5, g7.e6.c(-2.0f, -2));
                    gVar.addView(textView4, g7.e6.c(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f30941w = view;
                    linearLayout.addView(view, g7.e6.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23002d7, false));
                    org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(frameLayout.getContext());
                    frameLayout.f30943y = baVar;
                    linearLayout.addView(baVar, g7.e6.n(-1, -2));
                    o6Var = frameLayout;
                    break;
                case 3:
                    o6Var = new org.telegram.ui.Cells.m4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, null);
                    bv0Var.setCallback(new mg.b(17));
                    int i12 = SharedConfig.keepMedia;
                    if (i12 == 3) {
                        i10 = 0;
                    } else {
                        i10 = i12 + 1;
                    }
                    bv0Var.b(i10, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    o6Var = bv0Var;
                    break;
                case 5:
                    o6Var = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(y6Var.getParentActivity(), null);
                    e00Var.setIsSingleCell(true);
                    e00Var.setItemsCount(3);
                    e00Var.setIgnoreHeightCheck(true);
                    e00Var.setViewType(25);
                    o6Var = e00Var;
                    break;
                case 7:
                    o6Var = new org.telegram.ui.Cells.p8(context);
                    break;
                case 8:
                    v6 v6Var = new v6(this, context, y6Var, 0);
                    y6Var.J = v6Var;
                    v6Var.setDelegate(new g(this, 7));
                    y6Var.J.setCacheModel(y6Var.U);
                    y6Var.R.a0(y6Var.J, AndroidUtilities.dp(40.0f));
                    v6Var.setLayoutParams(new f2.a1(-1, -1));
                    o6Var = v6Var;
                    break;
                case 9:
                    u6 u6Var = new u6(this, context);
                    y6Var.M = u6Var;
                    u6Var.setTag(-33024);
                    i6Var = u6Var;
                    o6Var = i6Var;
                    break;
                case 10:
                    i6 i6Var2 = new i6(y6Var, context);
                    y6Var.N = i6Var2;
                    i6Var2.setTag(-33024);
                    i6Var = i6Var2;
                    o6Var = i6Var;
                    break;
                case 11:
                    i6Var = new org.telegram.ui.Cells.z1(4, 21, this.d, y6Var.getResourceProvider(), false);
                    o6Var = i6Var;
                    break;
                case 12:
                    org.telegram.ui.Components.e00 e00Var2 = new org.telegram.ui.Components.e00(y6Var.getParentActivity(), null);
                    e00Var2.setIsSingleCell(true);
                    e00Var2.setItemsCount(1);
                    e00Var2.setIgnoreHeightCheck(true);
                    e00Var2.setViewType(26);
                    o6Var = e00Var2;
                    break;
                case 13:
                    o6 o6Var2 = new o6(y6Var, context);
                    y6Var.O = o6Var2;
                    o6Var = o6Var2;
                    break;
                case 14:
                    org.telegram.ui.Components.bv0 bv0Var2 = new org.telegram.ui.Components.bv0(context, null);
                    float f10 = ((int) ((y6Var.E / 1024) / 1024)) / 1000.0f;
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
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (((Integer) arrayList.get(i13)).intValue() == 1) {
                            strArr[i13] = "300 MB";
                        } else if (((Integer) arrayList.get(i13)).intValue() == Integer.MAX_VALUE) {
                            strArr[i13] = LocaleController.getString(R.string.NoLimit);
                        } else {
                            strArr[i13] = String.format("%d GB", arrayList.get(i13));
                        }
                    }
                    bv0Var2.setCallback(new b1(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    bv0Var2.b(indexOf2, null, strArr);
                    o6Var = bv0Var2;
                    break;
                default:
                    o6Var = new org.telegram.ui.Cells.b9(context);
                    break;
            }
        } else {
            o6Var = new org.telegram.ui.Cells.ba(context);
        }
        return new f2.q1(o6Var);
    }
}
