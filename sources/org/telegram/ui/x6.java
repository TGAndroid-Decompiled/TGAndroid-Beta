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
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

public final class x6 extends xf.b {
    public final Context d;

    public final z6 f44289e;

    public x6(z6 z6Var, Context context) {
        this.f44289e = z6Var;
        this.d = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        long jB = o1Var.b();
        z6 z6Var = this.f44289e;
        if (jB == z6Var.G) {
            return true;
        }
        int i10 = o1Var.f5793f;
        return (i10 == 2 && z6Var.D > 0 && !z6Var.H) || i10 == 5 || i10 == 7 || i10 == 11;
    }

    @Override
    public final int h() {
        return this.f44289e.W.size();
    }

    @Override
    public final int j(int i10) {
        return ((u6) this.f44289e.W.get(i10)).f49413a;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        z6 z6Var = this.f44289e;
        ArrayList arrayList = z6Var.W;
        u6 u6Var = (u6) arrayList.get(i10);
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i12 == 0) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            if (i10 == z6Var.G) {
                x9Var.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                return;
            }
            return;
        }
        if (i12 == 1) {
            ((org.telegram.ui.Cells.x8) view).setText(AndroidUtilities.replaceTags(u6Var.f43128e));
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                j4Var.setText(((u6) arrayList.get(i10)).d);
                ((u6) arrayList.get(i10)).getClass();
                j4Var.setTopMargin(15);
                ((u6) arrayList.get(i10)).getClass();
                j4Var.setBottomMargin(0);
                return;
            }
            int i13 = 7;
            if (i12 == 7) {
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                CacheByChatsController cacheByChatsController = z6Var.getMessagesController().getCacheByChatsController();
                int i14 = u6Var.f43127c;
                int size = cacheByChatsController.getKeepMediaExceptions(((u6) arrayList.get(i10)).f43127c).size();
                String pluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i14));
                if (((u6) arrayList.get(i10)).f43127c == 0) {
                    l8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((u6) arrayList.get(i10)).f43127c == 1) {
                    l8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((u6) arrayList.get(i10)).f43127c == 2) {
                    l8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((u6) arrayList.get(i10)).f43127c == 3) {
                    l8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                l8Var.setSubtitle(pluralString);
                return;
            }
            switch (i12) {
                case 9:
                    z6Var.v0();
                    break;
                case 10:
                    k6 k6Var = z6Var.N;
                    if (k6Var != null && !z6Var.H) {
                        long j10 = z6Var.D;
                        boolean z10 = j10 > 0;
                        long j11 = z6Var.E;
                        float f10 = j11 <= 0 ? 0.0f : j10 / j11;
                        long j12 = z6Var.F;
                        k6Var.b(f10, (j12 <= 0 || j11 <= 0) ? 0.0f : (j11 - j12) / j11, z10);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                    int i15 = u6Var.f43129f;
                    boolean zR0 = i15 < 0 ? z6Var.r0() : z6Var.f45044e[i15];
                    CharSequence charSequence = u6Var.d;
                    int[] iArr = z6Var.K;
                    int i16 = u6Var.f43129f;
                    if (i16 < 0) {
                        i16 = 9;
                    }
                    int i17 = iArr[i16];
                    SpannableString spannableString = new SpannableString(i17 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i17)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.k41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    y1Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(u6Var.f43130g), zR0, u6Var.f43129f >= 0 ? !u6Var.f43132j : !z6Var.I, false);
                    int i18 = u6Var.h;
                    int i19 = org.telegram.ui.ActionBar.g6.f23182k7;
                    org.telegram.ui.Components.bp bpVar = y1Var.f25981r;
                    if (bpVar != null) {
                        bpVar.b(i18, i18, i19);
                    }
                    y1Var.setCollapsed(u6Var.f43129f < 0 ? Boolean.valueOf(z6Var.I) : null);
                    if (u6Var.f43129f == -1) {
                        y1Var.d(new a(this, i13), new nh.x1(13, this, y1Var));
                    } else {
                        y1Var.d(null, null);
                    }
                    y1Var.setPad(u6Var.f43131i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.ox0 ox0Var = (org.telegram.ui.Components.ox0) view;
        boolean z11 = z6Var.H;
        long j13 = z6Var.f45046f;
        long j14 = z6Var.D;
        long j15 = z6Var.F;
        long j16 = z6Var.E;
        com.google.firebase.messaging.l lVar = ox0Var.E;
        View view2 = ox0Var.f31442w;
        TextView textView = ox0Var.f31439n;
        TextView textView2 = ox0Var.h;
        TextView textView3 = ox0Var.v;
        org.telegram.ui.Cells.x9 x9Var2 = ox0Var.f31444y;
        ox0Var.f31437e = z11;
        TextView textView4 = ox0Var.f31440r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j15)));
        TextView textView5 = ox0Var.f31441s;
        long j17 = j16 - j15;
        textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j17)));
        if (z11) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            x9Var2.setVisibility(8);
            ox0Var.A = 0.0f;
            ox0Var.B = 0.0f;
            if (lVar != null) {
                lVar.c(textView3);
            }
        } else {
            if (lVar != null) {
                lVar.q(textView3);
            }
            textView3.setVisibility(8);
            if (j14 > 0) {
                i11 = 0;
                view2.setVisibility(0);
                x9Var2.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(8);
                x9Var2.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j14), false, true);
                textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j14 + j13)));
            } else {
                i11 = 0;
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j13)));
                view2.setVisibility(8);
                x9Var2.setVisibility(8);
            }
            textView4.setVisibility(i11);
            textView5.setVisibility(i11);
            float f11 = j16;
            float f12 = (j14 + j13) / f11;
            float f13 = j17 / f11;
            if (ox0Var.A != f12) {
                ValueAnimator valueAnimator = ox0Var.C;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i20 = 0;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ox0Var.A, f12);
                ox0Var.C = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i20) {
                            case 0:
                                ox0 ox0Var2 = ox0Var;
                                ox0Var2.getClass();
                                ox0Var2.A = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                ox0Var2.invalidate();
                                break;
                            default:
                                ox0 ox0Var3 = ox0Var;
                                ox0Var3.getClass();
                                ox0Var3.B = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                ox0Var3.invalidate();
                                break;
                        }
                    }
                });
                ox0Var.C.start();
            }
            if (ox0Var.B != f13) {
                ValueAnimator valueAnimator2 = ox0Var.D;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i21 = 1;
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(ox0Var.B, f13);
                ox0Var.D = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        switch (i21) {
                            case 0:
                                ox0 ox0Var2 = ox0Var;
                                ox0Var2.getClass();
                                ox0Var2.A = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                ox0Var2.invalidate();
                                break;
                            default:
                                ox0 ox0Var3 = ox0Var;
                                ox0Var3.getClass();
                                ox0Var3.B = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                ox0Var3.invalidate();
                                break;
                        }
                    }
                });
                ox0Var.D.start();
            }
        }
        x9Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        ox0Var.requestLayout();
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        ?? x9Var;
        Object y1Var;
        Context context = this.d;
        if (i10 != 0) {
            int i11 = 0;
            z6 z6Var = this.f44289e;
            switch (i10) {
                case 2:
                    ?? ox0Var = new org.telegram.ui.Components.ox0(context);
                    Paint paint = new Paint(1);
                    ox0Var.f31434a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    ox0Var.f31435b = paint3;
                    Paint paint4 = new Paint(1);
                    ox0Var.f31436c = paint4;
                    ox0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    ox0Var.H = hVar;
                    ox0Var.setWillNotDraw(false);
                    hVar.f33595k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    ag.s0 s0Var = new ag.s0(ox0Var, context, 25);
                    ox0Var.f31438f = s0Var;
                    ox0Var.addView(s0Var, h7.z5.c(-2.0f, -1));
                    ?? linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    ox0Var.addView(linearLayout, h7.z5.c(-2.0f, -1));
                    ?? dVar = new ag.d(context, 19);
                    linearLayout.addView(dVar, h7.z5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    ox0Var.v = textView;
                    int i12 = org.telegram.ui.ActionBar.g6.f23423y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int iIndexOf = string.indexOf("...");
                    if (iIndexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l(textView);
                        ox0Var.E = lVar;
                        lVar.u(spannableString, iIndexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    ox0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    ox0Var.f31439n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    ox0Var.f31440r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    ox0Var.f31441s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    ox0Var.f31443x = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), ox0Var.f31443x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.b.k(ox0Var.f31443x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.b.k(ox0Var.f31443x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), ox0Var.f31443x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    dVar.addView(textView, h7.z5.c(-2.0f, -2));
                    dVar.addView(textView3, h7.z5.c(-2.0f, -2));
                    dVar.addView(textView2, h7.z5.c(-2.0f, -2));
                    dVar.addView(textView5, h7.z5.c(-2.0f, -2));
                    dVar.addView(textView4, h7.z5.c(-2.0f, -2));
                    View view = new View(ox0Var.getContext());
                    ox0Var.f31442w = view;
                    linearLayout.addView(view, h7.z5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23054d7, false));
                    org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(ox0Var.getContext());
                    ox0Var.f31444y = x9Var2;
                    linearLayout.addView(x9Var2, h7.z5.n(-1, -2));
                    x9Var = ox0Var;
                    break;
                case 3:
                    x9Var = new org.telegram.ui.Cells.j4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.dv0 dv0Var = new org.telegram.ui.Components.dv0(context, null);
                    dv0Var.setCallback(new ng.a(22));
                    int i13 = SharedConfig.keepMedia;
                    dv0Var.b(i13 == 3 ? 0 : i13 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    x9Var = dv0Var;
                    break;
                case 5:
                    x9Var = new y6(z6Var.getParentActivity(), z6Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(z6Var.getParentActivity(), null);
                    h00Var.setIsSingleCell(true);
                    h00Var.setItemsCount(3);
                    h00Var.setIgnoreHeightCheck(true);
                    h00Var.setViewType(25);
                    x9Var = h00Var;
                    break;
                case 7:
                    x9Var = new org.telegram.ui.Cells.l8(context);
                    break;
                case 8:
                    w6 w6Var = new w6(this, context, z6Var, i11);
                    z6Var.J = w6Var;
                    w6Var.setDelegate(new g(this, 7));
                    z6Var.J.setCacheModel(z6Var.U);
                    z6Var.R.a0(z6Var.J, AndroidUtilities.dp(40.0f));
                    w6Var.setLayoutParams(new f2.y0(-1, -1));
                    x9Var = w6Var;
                    break;
                case 9:
                    v6 v6Var = new v6(this, context);
                    z6Var.M = v6Var;
                    v6Var.setTag(-33024);
                    y1Var = v6Var;
                    x9Var = y1Var;
                    break;
                case 10:
                    k6 k6Var = new k6(z6Var, context);
                    z6Var.N = k6Var;
                    k6Var.setTag(-33024);
                    y1Var = k6Var;
                    x9Var = y1Var;
                    break;
                case 11:
                    y1Var = new org.telegram.ui.Cells.y1(4, 21, this.d, z6Var.getResourceProvider(), false);
                    x9Var = y1Var;
                    break;
                case 12:
                    org.telegram.ui.Components.h00 h00Var2 = new org.telegram.ui.Components.h00(z6Var.getParentActivity(), null);
                    h00Var2.setIsSingleCell(true);
                    h00Var2.setItemsCount(1);
                    h00Var2.setIgnoreHeightCheck(true);
                    h00Var2.setViewType(26);
                    x9Var = h00Var2;
                    break;
                case 13:
                    p6 p6Var = new p6(z6Var, context);
                    z6Var.O = p6Var;
                    x9Var = p6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.dv0 dv0Var2 = new org.telegram.ui.Components.dv0(context, null);
                    float f10 = ((int) ((z6Var.E / 1024) / 1024)) / 1000.0f;
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
                    dv0Var2.setCallback(new c1(arrayList, 9));
                    int iIndexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", Integer.MAX_VALUE)));
                    if (iIndexOf2 < 0) {
                        iIndexOf2 = arrayList.size() - 1;
                    }
                    dv0Var2.b(iIndexOf2, null, strArr);
                    x9Var = dv0Var2;
                    break;
                default:
                    x9Var = new org.telegram.ui.Cells.x8(context);
                    break;
            }
        } else {
            x9Var = new org.telegram.ui.Cells.x9(context);
        }
        return new org.telegram.ui.Components.lk0(x9Var);
    }
}
