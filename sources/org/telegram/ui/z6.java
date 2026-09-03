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
public final class z6 extends cg.c {
    public final Context d;
    public final b7 f43810e;

    public z6(b7 b7Var, Context context) {
        this.f43810e = b7Var;
        this.d = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        b7 b7Var = this.f43810e;
        if (m1Var.b() != b7Var.H) {
            int i10 = m1Var.f5879f;
            if ((i10 != 2 || b7Var.E <= 0 || b7Var.I) && i10 != 5 && i10 != 7 && i10 != 11) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f43810e.X.size();
    }

    @Override
    public final int j(int i10) {
        return ((w6) this.f43810e.X.get(i10)).f2505a;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        float f10;
        float f11;
        boolean z4;
        String format;
        boolean z10;
        Boolean bool;
        b7 b7Var = this.f43810e;
        ArrayList arrayList = b7Var.X;
        w6 w6Var = (w6) arrayList.get(i10);
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        String str = null;
        boolean z11 = false;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 7) {
                            switch (i12) {
                                case 9:
                                    b7Var.v0();
                                    return;
                                case 10:
                                    n6 n6Var = b7Var.O;
                                    if (n6Var != null && !b7Var.I) {
                                        long j10 = b7Var.E;
                                        if (j10 > 0) {
                                            z11 = true;
                                        }
                                        long j11 = b7Var.F;
                                        int i13 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                                        if (i13 <= 0) {
                                            f10 = 0.0f;
                                        } else {
                                            f10 = ((float) j10) / ((float) j11);
                                        }
                                        long j12 = b7Var.G;
                                        if (j12 > 0 && i13 > 0) {
                                            f11 = ((float) (j11 - j12)) / ((float) j11);
                                        } else {
                                            f11 = 0.0f;
                                        }
                                        n6Var.b(f10, f11, z11);
                                        return;
                                    }
                                    return;
                                case 11:
                                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                                    int i14 = w6Var.f42295f;
                                    if (i14 < 0) {
                                        z4 = b7Var.r0();
                                    } else {
                                        z4 = b7Var.f35381e[i14];
                                    }
                                    boolean z12 = z4;
                                    CharSequence charSequence = w6Var.d;
                                    int[] iArr = b7Var.L;
                                    int i15 = w6Var.f42295f;
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
                                    String formatFileSize = AndroidUtilities.formatFileSize(w6Var.f42296g);
                                    if (w6Var.f42295f >= 0 ? !w6Var.f42298j : !b7Var.J) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    z1Var.e(spannableStringBuilder, formatFileSize, z12, z10, false);
                                    int i17 = w6Var.h;
                                    int i18 = org.telegram.ui.ActionBar.k6.f21788k7;
                                    org.telegram.ui.Components.np npVar = z1Var.f24478r;
                                    if (npVar != null) {
                                        npVar.b(i17, i17, i18);
                                    }
                                    if (w6Var.f42295f < 0) {
                                        bool = Boolean.valueOf(b7Var.J);
                                    } else {
                                        bool = null;
                                    }
                                    z1Var.setCollapsed(bool);
                                    if (w6Var.f42295f == -1) {
                                        z1Var.d(new a(this, 7), new org.telegram.messenger.video.g(10, this, z1Var));
                                    } else {
                                        z1Var.d(null, null);
                                    }
                                    z1Var.setPad(w6Var.f42297i ? 1 : 0);
                                    return;
                                default:
                                    return;
                            }
                        }
                        org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                        CacheByChatsController cacheByChatsController = b7Var.getMessagesController().getCacheByChatsController();
                        int i19 = w6Var.f42293c;
                        int size = cacheByChatsController.getKeepMediaExceptions(((w6) arrayList.get(i10)).f42293c).size();
                        if (size > 0) {
                            str = LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size));
                        }
                        String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i19));
                        if (((w6) arrayList.get(i10)).f42293c == 0) {
                            o8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                        } else if (((w6) arrayList.get(i10)).f42293c == 1) {
                            o8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                        } else if (((w6) arrayList.get(i10)).f42293c == 2) {
                            o8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                        } else if (((w6) arrayList.get(i10)).f42293c == 3) {
                            o8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                        }
                        o8Var.setSubtitle(str);
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
                final org.telegram.ui.Components.hy0 hy0Var = (org.telegram.ui.Components.hy0) view;
                boolean z13 = b7Var.I;
                long j13 = b7Var.f35383f;
                long j14 = b7Var.E;
                long j15 = b7Var.G;
                long j16 = b7Var.F;
                cb.m mVar = hy0Var.F;
                View view2 = hy0Var.f27657w;
                TextView textView = hy0Var.f27654n;
                TextView textView2 = hy0Var.h;
                TextView textView3 = hy0Var.v;
                org.telegram.ui.Cells.aa aaVar = hy0Var.f27659y;
                hy0Var.f27652e = z13;
                TextView textView4 = hy0Var.f27655r;
                textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j15)));
                TextView textView5 = hy0Var.f27656s;
                long j17 = j16 - j15;
                textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j17)));
                if (z13) {
                    textView3.setVisibility(0);
                    textView2.setVisibility(8);
                    textView4.setVisibility(8);
                    textView5.setVisibility(8);
                    textView.setVisibility(8);
                    view2.setVisibility(8);
                    aaVar.setVisibility(8);
                    hy0Var.B = 0.0f;
                    hy0Var.C = 0.0f;
                    if (mVar != null) {
                        mVar.c(textView3);
                    }
                } else {
                    if (mVar != null) {
                        mVar.t(textView3);
                    }
                    textView3.setVisibility(8);
                    if (j14 > 0) {
                        i11 = 0;
                        view2.setVisibility(0);
                        aaVar.setVisibility(0);
                        textView2.setVisibility(0);
                        textView.setVisibility(8);
                        aaVar.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j14), false, true);
                        textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j14 + j13)));
                    } else {
                        i11 = 0;
                        textView2.setVisibility(8);
                        textView.setVisibility(0);
                        textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j13)));
                        view2.setVisibility(8);
                        aaVar.setVisibility(8);
                    }
                    textView4.setVisibility(i11);
                    textView5.setVisibility(i11);
                    float f12 = (float) j16;
                    float f13 = ((float) (j14 + j13)) / f12;
                    float f14 = ((float) j17) / f12;
                    if (hy0Var.B != f13) {
                        ValueAnimator valueAnimator = hy0Var.D;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(hy0Var.B, f13);
                        hy0Var.D = ofFloat;
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        hy0 hy0Var2 = hy0Var;
                                        hy0Var2.getClass();
                                        hy0Var2.B = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        hy0Var2.invalidate();
                                        return;
                                    default:
                                        hy0 hy0Var3 = hy0Var;
                                        hy0Var3.getClass();
                                        hy0Var3.C = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        hy0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        hy0Var.D.start();
                    }
                    if (hy0Var.C != f14) {
                        ValueAnimator valueAnimator2 = hy0Var.E;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(hy0Var.C, f14);
                        hy0Var.E = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (r2) {
                                    case 0:
                                        hy0 hy0Var2 = hy0Var;
                                        hy0Var2.getClass();
                                        hy0Var2.B = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        hy0Var2.invalidate();
                                        return;
                                    default:
                                        hy0 hy0Var3 = hy0Var;
                                        hy0Var3.getClass();
                                        hy0Var3.C = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        hy0Var3.invalidate();
                                        return;
                                }
                            }
                        });
                        hy0Var.E.start();
                    }
                }
                aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
                hy0Var.requestLayout();
                return;
            }
            ((org.telegram.ui.Cells.a9) view).setText(AndroidUtilities.replaceTags(w6Var.f42294e));
            return;
        }
        org.telegram.ui.Cells.aa aaVar2 = (org.telegram.ui.Cells.aa) view;
        if (i10 == b7Var.H) {
            aaVar2.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        s6 s6Var;
        int i11;
        n6 n6Var;
        Context context = this.d;
        if (i10 != 0) {
            b7 b7Var = this.f43810e;
            switch (i10) {
                case 2:
                    ?? frameLayout = new FrameLayout(context);
                    Paint paint = new Paint(1);
                    frameLayout.f27649a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    frameLayout.f27650b = paint3;
                    Paint paint4 = new Paint(1);
                    frameLayout.f27651c = paint4;
                    frameLayout.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    frameLayout.I = hVar;
                    frameLayout.setWillNotDraw(false);
                    hVar.f32064k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    fg.h0 h0Var = new fg.h0(frameLayout, context, 21);
                    frameLayout.f27653f = h0Var;
                    frameLayout.addView(h0Var, k7.c6.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    frameLayout.addView(linearLayout, k7.c6.c(-2.0f, -1));
                    eh.d dVar = new eh.d(context, 20);
                    linearLayout.addView(dVar, k7.c6.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    frameLayout.v = textView;
                    int i12 = org.telegram.ui.ActionBar.k6.f22038y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        cb.m mVar = new cb.m(textView);
                        frameLayout.F = mVar;
                        mVar.x(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    frameLayout.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    frameLayout.f27654n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    frameLayout.f27655r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    frameLayout.f27656s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
                    frameLayout.f27658x = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), frameLayout.f27658x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f27658x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), i0.a.k(frameLayout.f27658x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(10.0f), frameLayout.f27658x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    dVar.addView(textView, k7.c6.c(-2.0f, -2));
                    dVar.addView(textView3, k7.c6.c(-2.0f, -2));
                    dVar.addView(textView2, k7.c6.c(-2.0f, -2));
                    dVar.addView(textView5, k7.c6.c(-2.0f, -2));
                    dVar.addView(textView4, k7.c6.c(-2.0f, -2));
                    View view = new View(frameLayout.getContext());
                    frameLayout.f27657w = view;
                    linearLayout.addView(view, k7.c6.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21662d7, false));
                    org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(frameLayout.getContext());
                    frameLayout.f27659y = aaVar;
                    linearLayout.addView(aaVar, k7.c6.n(-1, -2));
                    s6Var = frameLayout;
                    break;
                case 3:
                    s6Var = new org.telegram.ui.Cells.m4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.uv0 uv0Var = new org.telegram.ui.Components.uv0(context, null);
                    uv0Var.setCallback(new mh.c3(16));
                    int i13 = SharedConfig.keepMedia;
                    if (i13 == 3) {
                        i11 = 0;
                    } else {
                        i11 = i13 + 1;
                    }
                    uv0Var.b(i11, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    s6Var = uv0Var;
                    break;
                case 5:
                    s6Var = new a7(b7Var.getParentActivity(), b7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(b7Var.getParentActivity(), null);
                    u00Var.setIsSingleCell(true);
                    u00Var.setItemsCount(3);
                    u00Var.setIgnoreHeightCheck(true);
                    u00Var.setViewType(25);
                    s6Var = u00Var;
                    break;
                case 7:
                    s6Var = new org.telegram.ui.Cells.o8(context);
                    break;
                case 8:
                    y6 y6Var = new y6(this, context, b7Var, 0);
                    b7Var.K = y6Var;
                    y6Var.setDelegate(new h(this, 7));
                    b7Var.K.setCacheModel(b7Var.V);
                    b7Var.S.a0(b7Var.K, AndroidUtilities.dp(40.0f));
                    y6Var.setLayoutParams(new f2.x0(-1, -1));
                    s6Var = y6Var;
                    break;
                case 9:
                    x6 x6Var = new x6(this, context);
                    b7Var.N = x6Var;
                    x6Var.setTag(-33024);
                    n6Var = x6Var;
                    s6Var = n6Var;
                    break;
                case 10:
                    n6 n6Var2 = new n6(b7Var, context);
                    b7Var.O = n6Var2;
                    n6Var2.setTag(-33024);
                    n6Var = n6Var2;
                    s6Var = n6Var;
                    break;
                case 11:
                    n6Var = new org.telegram.ui.Cells.z1(4, 21, this.d, b7Var.getResourceProvider(), false);
                    s6Var = n6Var;
                    break;
                case 12:
                    org.telegram.ui.Components.u00 u00Var2 = new org.telegram.ui.Components.u00(b7Var.getParentActivity(), null);
                    u00Var2.setIsSingleCell(true);
                    u00Var2.setItemsCount(1);
                    u00Var2.setIgnoreHeightCheck(true);
                    u00Var2.setViewType(26);
                    s6Var = u00Var2;
                    break;
                case 13:
                    s6 s6Var2 = new s6(b7Var, context);
                    b7Var.P = s6Var2;
                    s6Var = s6Var2;
                    break;
                case 14:
                    org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
                    float f10 = ((int) ((b7Var.F / 1024) / 1024)) / 1000.0f;
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
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        if (((Integer) arrayList.get(i14)).intValue() == 1) {
                            strArr[i14] = "300 MB";
                        } else if (((Integer) arrayList.get(i14)).intValue() == Integer.MAX_VALUE) {
                            strArr[i14] = LocaleController.getString(R.string.NoLimit);
                        } else {
                            strArr[i14] = String.format("%d GB", arrayList.get(i14));
                        }
                    }
                    uv0Var2.setCallback(new a1(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    uv0Var2.b(indexOf2, null, strArr);
                    s6Var = uv0Var2;
                    break;
                default:
                    s6Var = new org.telegram.ui.Cells.a9(context);
                    break;
            }
        } else {
            s6Var = new org.telegram.ui.Cells.aa(context);
        }
        return new f2.m1(s6Var);
    }
}
