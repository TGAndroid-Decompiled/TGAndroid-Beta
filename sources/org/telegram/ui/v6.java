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
public final class v6 extends zf.b {
    public final Context d;
    public final x6 f43438e;

    public v6(x6 x6Var, Context context) {
        this.f43438e = x6Var;
        this.d = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        x6 x6Var = this.f43438e;
        if (n1Var.b() != x6Var.G) {
            int i10 = n1Var.f6436f;
            if ((i10 != 2 || x6Var.D <= 0 || x6Var.H) && i10 != 5 && i10 != 7 && i10 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f43438e.W.size();
    }

    @Override
    public final int j(int i10) {
        return ((s6) this.f43438e.W.get(i10)).f50845a;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        float f9;
        float f10;
        boolean z10;
        String format;
        boolean z11;
        Boolean bool;
        x6 x6Var = this.f43438e;
        ArrayList arrayList = x6Var.W;
        s6 s6Var = (s6) arrayList.get(i10);
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        String str = null;
        boolean z12 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 7) {
                            switch (i12) {
                                case 9:
                                    x6Var.v0();
                                    return;
                                case 10:
                                    j6 j6Var = x6Var.N;
                                    if (j6Var != null && !x6Var.H) {
                                        long j10 = x6Var.D;
                                        if (j10 > 0) {
                                            z12 = true;
                                        }
                                        long j11 = x6Var.E;
                                        int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                        if (i13 <= 0) {
                                            f9 = 0.0f;
                                        } else {
                                            f9 = ((float) j10) / ((float) j11);
                                        }
                                        long j12 = x6Var.F;
                                        if (j12 > 0 && i13 > 0) {
                                            f10 = ((float) (j11 - j12)) / ((float) j11);
                                        } else {
                                            f10 = 0.0f;
                                        }
                                        j6Var.b(f9, f10, z12);
                                        return;
                                    }
                                    return;
                                case 11:
                                    org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                                    int i14 = s6Var.f42284f;
                                    if (i14 < 0) {
                                        z10 = x6Var.r0();
                                    } else {
                                        z10 = x6Var.f44490e[i14];
                                    }
                                    boolean z13 = z10;
                                    CharSequence charSequence = s6Var.d;
                                    int[] iArr = x6Var.K;
                                    int i15 = s6Var.f42284f;
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
                                    spannableString.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                                    spannableStringBuilder.append((CharSequence) "  ");
                                    spannableStringBuilder.append((CharSequence) spannableString);
                                    String formatFileSize = AndroidUtilities.formatFileSize(s6Var.f42285g);
                                    if (s6Var.f42284f >= 0 ? !s6Var.f42287j : !x6Var.I) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    y1Var.e(spannableStringBuilder, formatFileSize, z13, z11, false);
                                    int i17 = s6Var.h;
                                    int i18 = org.telegram.ui.ActionBar.g6.f23190k7;
                                    org.telegram.ui.Components.hp hpVar = y1Var.f25988r;
                                    if (hpVar != null) {
                                        hpVar.b(i17, i17, i18);
                                    }
                                    if (s6Var.f42284f < 0) {
                                        bool = Boolean.valueOf(x6Var.I);
                                    } else {
                                        bool = null;
                                    }
                                    y1Var.setCollapsed(bool);
                                    if (s6Var.f42284f == -1) {
                                        y1Var.d(new a(this, 7), new nh.r7(13, this, y1Var));
                                    } else {
                                        y1Var.d(null, null);
                                    }
                                    y1Var.setPad(s6Var.f42286i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                        CacheByChatsController cacheByChatsController = x6Var.getMessagesController().getCacheByChatsController();
                        int i19 = s6Var.f42282c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((s6) arrayList.get(i10)).f42282c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i19));
                        if (((s6) arrayList.get(i10)).f42282c == 0) {
                            m8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((s6) arrayList.get(i10)).f42282c == 1) {
                            m8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((s6) arrayList.get(i10)).f42282c == 2) {
                            m8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((s6) arrayList.get(i10)).f42282c == 3) {
                            m8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                        m8Var.setSubtitle(str);
                        return;
                    }
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    k4Var.setText(((s6) arrayList.get(i10)).d);
                    ((s6) arrayList.get(i10)).getClass();
                    k4Var.setTopMargin(15);
                    ((s6) arrayList.get(i10)).getClass();
                    k4Var.setBottomMargin(0);
                    return;
                }
                final org.telegram.ui.Components.xx0 xx0Var = (org.telegram.ui.Components.xx0) view;
                boolean z14 = x6Var.H;
                long j13 = x6Var.f44492f;
                long j14 = x6Var.D;
                long j15 = x6Var.F;
                long j16 = x6Var.E;
                ab.m mVar = xx0Var.E;
                View view2 = xx0Var.f34849w;
                TextView textView = xx0Var.f34846n;
                TextView textView2 = xx0Var.h;
                TextView textView3 = xx0Var.v;
                org.telegram.ui.Cells.y9 y9Var = xx0Var.f34851y;
                xx0Var.f34844e = z14;
                TextView textView4 = xx0Var.f34847r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j15)));
                TextView textView5 = xx0Var.f34848s;
                long j17 = j16 - j15;
                textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j17)));
                if (z14) {
                    textView3.setVisibility(0);
                    textView2.setVisibility(8);
                    textView4.setVisibility(8);
                    textView5.setVisibility(8);
                    textView.setVisibility(8);
                    view2.setVisibility(8);
                    y9Var.setVisibility(8);
                    xx0Var.A = 0.0f;
                    xx0Var.B = 0.0f;
                    if (mVar != null) {
                        mVar.c(textView3);
                    }
                } else {
                    if (mVar != null) {
                        mVar.q(textView3);
                    }
                    textView3.setVisibility(8);
                    if (j14 > 0) {
                        i11 = 0;
                        view2.setVisibility(0);
                        y9Var.setVisibility(0);
                        textView2.setVisibility(0);
                        textView.setVisibility(8);
                        y9Var.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j14), false, true);
                        textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j14 + j13)));
                    } else {
                        i11 = 0;
                        textView2.setVisibility(8);
                        textView.setVisibility(0);
                        textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j13)));
                        view2.setVisibility(8);
                        y9Var.setVisibility(8);
                    }
                    textView4.setVisibility(i11);
                    textView5.setVisibility(i11);
                    float f11 = (float) j16;
                    float f12 = ((float) (j14 + j13)) / f11;
                    float f13 = ((float) j17) / f11;
                    if (xx0Var.A != f12) {
                        ValueAnimator valueAnimator = xx0Var.C;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(xx0Var.A, f12);
                        xx0Var.C = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        xx0 xx0Var2 = xx0Var;
                                        xx0Var2.getClass();
                                        xx0Var2.A = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        xx0Var2.invalidate();
                                        return;
                                    default:
                                        xx0 xx0Var3 = xx0Var;
                                        xx0Var3.getClass();
                                        xx0Var3.B = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        xx0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        xx0Var.C.start();
                    }
                    if (xx0Var.B != f13) {
                        ValueAnimator valueAnimator2 = xx0Var.D;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(xx0Var.B, f13);
                        xx0Var.D = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (r2) {
                                    case 0:
                                        xx0 xx0Var2 = xx0Var;
                                        xx0Var2.getClass();
                                        xx0Var2.A = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        xx0Var2.invalidate();
                                        return;
                                    default:
                                        xx0 xx0Var3 = xx0Var;
                                        xx0Var3.getClass();
                                        xx0Var3.B = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        xx0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        xx0Var.D.start();
                    }
                }
                y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                xx0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.y8) view).setText(AndroidUtilities.replaceTags(s6Var.f42283e));
            return;
        }
        org.telegram.ui.Cells.y9 y9Var2 = (org.telegram.ui.Cells.y9) view;
        if (i10 == x6Var.G) {
            y9Var2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        o6 o6Var;
        int i11;
        j6 j6Var;
        Context context = this.d;
        if (i10 != 0) {
            x6 x6Var = this.f43438e;
            switch (i10) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f34841a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f34842b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f34843c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.H = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f33724k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    cg.h0 h0Var = new cg.h0(frameLayout, context, 23);
                    frameLayout.f34845f = h0Var;
                    frameLayout.addView(h0Var, i7.f6.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, i7.f6.c(-2.0f, -1));
                    bh.d dVar = new bh.d(context, 21);
                    linearLayout.addView(dVar, i7.f6.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i12 = org.telegram.ui.ActionBar.g6.f23433y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        ab.m mVar = new ab.m(textView);
                        frameLayout.E = mVar;
                        mVar.u(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    frameLayout.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    frameLayout.f34846n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    frameLayout.f34847r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    frameLayout.f34848s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    frameLayout.f34850x = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), frameLayout.f34850x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f34850x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f34850x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), frameLayout.f34850x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    dVar.addView(textView, i7.f6.c(-2.0f, -2));
                    dVar.addView(textView3, i7.f6.c(-2.0f, -2));
                    dVar.addView(textView2, i7.f6.c(-2.0f, -2));
                    dVar.addView(textView5, i7.f6.c(-2.0f, -2));
                    dVar.addView(textView4, i7.f6.c(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f34849w = view;
                    linearLayout.addView(view, i7.f6.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23063d7, false));
                    org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(frameLayout.getContext());
                    frameLayout.f34851y = y9Var;
                    linearLayout.addView(y9Var, i7.f6.n(-1, -2));
                    o6Var = frameLayout;
                    break;
                case 3:
                    o6Var = new org.telegram.ui.Cells.k4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.lv0 lv0Var = new org.telegram.ui.Components.lv0(context, null);
                    lv0Var.setCallback(new m4.a(11));
                    int i13 = SharedConfig.keepMedia;
                    if (i13 == 3) {
                        i11 = 0;
                    } else {
                        i11 = i13 + 1;
                    }
                    lv0Var.b(i11, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    o6Var = lv0Var;
                    break;
                case 5:
                    o6Var = new w6(x6Var.getParentActivity(), x6Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(x6Var.getParentActivity(), null);
                    p00Var.setIsSingleCell(true);
                    p00Var.setItemsCount(3);
                    p00Var.setIgnoreHeightCheck(true);
                    p00Var.setViewType(25);
                    o6Var = p00Var;
                    break;
                case 7:
                    o6Var = new org.telegram.ui.Cells.m8(context);
                    break;
                case 8:
                    u6 u6Var = new u6(this, context, x6Var, 0);
                    x6Var.J = u6Var;
                    u6Var.setDelegate(new h(this, 7));
                    x6Var.J.setCacheModel(x6Var.U);
                    x6Var.R.a0(x6Var.J, AndroidUtilities.dp(40.0f));
                    u6Var.setLayoutParams(new f2.x0(-1, -1));
                    o6Var = u6Var;
                    break;
                case 9:
                    t6 t6Var = new t6(this, context);
                    x6Var.M = t6Var;
                    t6Var.setTag(-33024);
                    j6Var = t6Var;
                    o6Var = j6Var;
                    break;
                case 10:
                    j6 j6Var2 = new j6(x6Var, context);
                    x6Var.N = j6Var2;
                    j6Var2.setTag(-33024);
                    j6Var = j6Var2;
                    o6Var = j6Var;
                    break;
                case 11:
                    j6Var = new org.telegram.ui.Cells.y1(4, 21, this.d, x6Var.getResourceProvider(), false);
                    o6Var = j6Var;
                    break;
                case 12:
                    org.telegram.ui.Components.p00 p00Var2 = new org.telegram.ui.Components.p00(x6Var.getParentActivity(), null);
                    p00Var2.setIsSingleCell(true);
                    p00Var2.setItemsCount(1);
                    p00Var2.setIgnoreHeightCheck(true);
                    p00Var2.setViewType(26);
                    o6Var = p00Var2;
                    break;
                case 13:
                    o6 o6Var2 = new o6(x6Var, context);
                    x6Var.O = o6Var2;
                    o6Var = o6Var2;
                    break;
                case 14:
                    org.telegram.ui.Components.lv0 lv0Var2 = new org.telegram.ui.Components.lv0(context, null);
                    float f9 = ((int) ((x6Var.E / 1024) / 1024)) / 1000.0f;
                    ArrayList arrayList = new ArrayList();
                    if (f9 <= 17.0f) {
                        arrayList.add(2);
                    }
                    if (f9 > 5.0f) {
                        arrayList.add(5);
                    }
                    if (f9 > 16.0f) {
                        arrayList.add(16);
                    }
                    if (f9 > 32.0f) {
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
                    lv0Var2.setCallback(new c1(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    lv0Var2.b(indexOf2, null, strArr);
                    o6Var = lv0Var2;
                    break;
                default:
                    o6Var = new org.telegram.ui.Cells.y8(context);
                    break;
            }
        } else {
            o6Var = new org.telegram.ui.Cells.y9(context);
        }
        return new f2.n1(o6Var);
    }
}
