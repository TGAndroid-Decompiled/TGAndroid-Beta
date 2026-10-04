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
public final class y6 extends og.b {
    public final Context d;
    public final a7 f43068e;

    public y6(a7 a7Var, Context context) {
        this.f43068e = a7Var;
        this.d = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        a7 a7Var = this.f43068e;
        if (c1Var.b() != a7Var.J) {
            int i10 = c1Var.f46528f;
            if ((i10 != 2 || a7Var.G <= 0 || a7Var.K) && i10 != 5 && i10 != 7 && i10 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f43068e.f34689g0.size();
    }

    @Override
    public final int j(int i10) {
        return ((w6) this.f43068e.f34689g0.get(i10)).f17183a;
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
        a7 a7Var = this.f43068e;
        ArrayList arrayList = a7Var.f34689g0;
        w6 w6Var = (w6) arrayList.get(i10);
        int i12 = c1Var.f46528f;
        View view = c1Var.f46524a;
        String str = null;
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 7) {
                            switch (i12) {
                                case 9:
                                    a7Var.t0();
                                    return;
                                case 10:
                                    m6 m6Var = a7Var.X;
                                    if (m6Var != null && !a7Var.K) {
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
                                        m6Var.b(f7, f10, z12);
                                        return;
                                    }
                                    return;
                                case 11:
                                    org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                                    int i14 = w6Var.f41926f;
                                    if (i14 < 0) {
                                        z10 = a7Var.o0();
                                    } else {
                                        z10 = a7Var.d[i14];
                                    }
                                    boolean z13 = z10;
                                    CharSequence charSequence = w6Var.d;
                                    int[] iArr = a7Var.U;
                                    int i15 = w6Var.f41926f;
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
                                    spannableString.setSpan(new org.telegram.ui.Components.d61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.append((CharSequence) "  ");
                                    spannableStringBuilder.append((CharSequence) spannableString);
                                    String formatFileSize = AndroidUtilities.formatFileSize(w6Var.f41927g);
                                    if (w6Var.f41926f >= 0 ? !w6Var.f41929j : !a7Var.L) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    a2Var.e(spannableStringBuilder, formatFileSize, z13, z11, false);
                                    int i17 = w6Var.h;
                                    int i18 = org.telegram.ui.ActionBar.i6.f20948k7;
                                    org.telegram.ui.Components.qp qpVar = a2Var.f21781r;
                                    if (qpVar != null) {
                                        qpVar.b(i17, i17, i18);
                                    }
                                    if (w6Var.f41926f < 0) {
                                        bool = Boolean.valueOf(a7Var.L);
                                    } else {
                                        bool = null;
                                    }
                                    a2Var.setCollapsed(bool);
                                    if (w6Var.f41926f == -1) {
                                        a2Var.d(new a(this, 7), new ai.f2(25, this, a2Var));
                                    } else {
                                        a2Var.d(null, null);
                                    }
                                    a2Var.setPad(w6Var.f41928i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        CacheByChatsController cacheByChatsController = a7Var.getMessagesController().getCacheByChatsController();
                        int i19 = w6Var.f41924c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((w6) arrayList.get(i10)).f41924c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i19));
                        if (((w6) arrayList.get(i10)).f41924c == 0) {
                            r8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((w6) arrayList.get(i10)).f41924c == 1) {
                            r8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((w6) arrayList.get(i10)).f41924c == 2) {
                            r8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((w6) arrayList.get(i10)).f41924c == 3) {
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
                final org.telegram.ui.Components.az0 az0Var = (org.telegram.ui.Components.az0) view;
                boolean z14 = a7Var.K;
                long j12 = a7Var.f34685e;
                long j13 = a7Var.G;
                long j14 = a7Var.I;
                long j15 = a7Var.H;
                com.google.firebase.messaging.m mVar = az0Var.I;
                View view2 = az0Var.f24731w;
                TextView textView = az0Var.f24728n;
                TextView textView2 = az0Var.h;
                TextView textView3 = az0Var.v;
                org.telegram.ui.Cells.ea eaVar = az0Var.f24733y;
                az0Var.f24726e = z14;
                TextView textView4 = az0Var.f24729r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
                TextView textView5 = az0Var.f24730s;
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
                    az0Var.E = 0.0f;
                    az0Var.F = 0.0f;
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
                    if (az0Var.E != f12) {
                        ValueAnimator valueAnimator = az0Var.G;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(az0Var.E, f12);
                        az0Var.G = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        az0 az0Var2 = az0Var;
                                        az0Var2.getClass();
                                        az0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        az0Var2.invalidate();
                                        return;
                                    default:
                                        az0 az0Var3 = az0Var;
                                        az0Var3.getClass();
                                        az0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        az0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        az0Var.G.start();
                    }
                    if (az0Var.F != f13) {
                        ValueAnimator valueAnimator2 = az0Var.H;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(az0Var.F, f13);
                        az0Var.H = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (r2) {
                                    case 0:
                                        az0 az0Var2 = az0Var;
                                        az0Var2.getClass();
                                        az0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        az0Var2.invalidate();
                                        return;
                                    default:
                                        az0 az0Var3 = az0Var;
                                        az0Var3.getClass();
                                        az0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        az0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        az0Var.H.start();
                    }
                }
                eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
                az0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.e9) view).setText(AndroidUtilities.replaceTags(w6Var.f41925e));
            return;
        }
        org.telegram.ui.Cells.ea eaVar2 = (org.telegram.ui.Cells.ea) view;
        if (i10 == a7Var.J) {
            eaVar2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Components.w00 w00Var;
        int i11;
        x6 x6Var;
        Context context = this.d;
        if (i10 != 0) {
            a7 a7Var = this.f43068e;
            switch (i10) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f24723a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f24724b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f24725c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.L = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f31879k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    ci.ab abVar = new ci.ab(frameLayout, context, 27);
                    frameLayout.f24727f = abVar;
                    frameLayout.addView(abVar, w7.z5.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, w7.z5.c(-2.0f, -1));
                    ai.w5 w5Var = new ai.w5(context, 20);
                    linearLayout.addView(w5Var, w7.z5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i12 = org.telegram.ui.ActionBar.i6.f21205y6;
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
                    frameLayout.f24728n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    frameLayout.f24729r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    frameLayout.f24730s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    frameLayout.f24732x = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), frameLayout.f24732x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f24732x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f24732x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), frameLayout.f24732x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    w5Var.addView(textView, w7.z5.c(-2.0f, -2));
                    w5Var.addView(textView3, w7.z5.c(-2.0f, -2));
                    w5Var.addView(textView2, w7.z5.c(-2.0f, -2));
                    w5Var.addView(textView5, w7.z5.c(-2.0f, -2));
                    w5Var.addView(textView4, w7.z5.c(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f24731w = view;
                    linearLayout.addView(view, w7.z5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20819d7, false));
                    org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(frameLayout.getContext());
                    frameLayout.f24733y = eaVar;
                    linearLayout.addView(eaVar, w7.z5.n(-1, -2));
                    w00Var = frameLayout;
                    break;
                case 3:
                    w00Var = new org.telegram.ui.Cells.m4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.pw0 pw0Var = new org.telegram.ui.Components.pw0(context, null);
                    pw0Var.setCallback(new m4(1));
                    int i13 = SharedConfig.keepMedia;
                    if (i13 == 3) {
                        i11 = 0;
                    } else {
                        i11 = i13 + 1;
                    }
                    pw0Var.b(i11, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    w00Var = pw0Var;
                    break;
                case 5:
                    w00Var = new z6(a7Var.getParentActivity(), a7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.w00 w00Var2 = new org.telegram.ui.Components.w00(a7Var.getParentActivity(), null);
                    w00Var2.setIsSingleCell(true);
                    w00Var2.setItemsCount(3);
                    w00Var2.setIgnoreHeightCheck(true);
                    w00Var2.setViewType(25);
                    w00Var = w00Var2;
                    break;
                case 7:
                    w00Var = new org.telegram.ui.Cells.r8(context);
                    break;
                case 8:
                    org.telegram.ui.Components.aw0 aw0Var = a7Var.f34681b0;
                    aw0Var.getClass();
                    View abVar2 = new ci.ab(aw0Var, context, 24);
                    abVar2.setTag(-33024);
                    abVar2.setLayoutParams(new s4.p0(-1, -1));
                    w00Var = abVar2;
                    break;
                case 9:
                    x6 x6Var2 = new x6(this, context);
                    a7Var.W = x6Var2;
                    x6Var2.setTag(-33024);
                    x6Var = x6Var2;
                    w00Var = x6Var;
                    break;
                case 10:
                    m6 m6Var = new m6(a7Var, context);
                    a7Var.X = m6Var;
                    m6Var.setTag(-33024);
                    x6Var = m6Var;
                    w00Var = x6Var;
                    break;
                case 11:
                    x6Var = new org.telegram.ui.Cells.a2(4, 21, this.d, a7Var.getResourceProvider(), false);
                    w00Var = x6Var;
                    break;
                case 12:
                    org.telegram.ui.Components.w00 w00Var3 = new org.telegram.ui.Components.w00(a7Var.getParentActivity(), null);
                    w00Var3.setIsSingleCell(true);
                    w00Var3.setItemsCount(1);
                    w00Var3.setIgnoreHeightCheck(true);
                    w00Var3.setViewType(26);
                    w00Var = w00Var3;
                    break;
                case 13:
                    r6 r6Var = new r6(a7Var, context);
                    a7Var.Y = r6Var;
                    w00Var = r6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.pw0 pw0Var2 = new org.telegram.ui.Components.pw0(context, null);
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
                    pw0Var2.setCallback(new z0(arrayList, 10));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    pw0Var2.b(indexOf2, null, strArr);
                    w00Var = pw0Var2;
                    break;
                default:
                    w00Var = new org.telegram.ui.Cells.e9(context);
                    break;
            }
        } else {
            w00Var = new org.telegram.ui.Cells.ea(context);
        }
        return new s4.c1(w00Var);
    }
}
