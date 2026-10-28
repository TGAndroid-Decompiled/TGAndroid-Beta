package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r10 extends qg.b {
    public final Context d;
    public final FiltersSetupActivity e;

    public r10(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 3 && i10 != 0 && i10 != 5 && i10 != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.f35536n.size();
    }

    @Override
    public final int j(int i10) {
        p10 p10Var;
        if (i10 >= 0) {
            FiltersSetupActivity filtersSetupActivity = this.e;
            if (i10 >= filtersSetupActivity.f35536n.size() || (p10Var = (p10) filtersSetupActivity.f35536n.get(i10)) == null) {
                return 3;
            }
            return p10Var.f47075a;
        }
        return 3;
    }

    @Override
    public final void v(s4.e1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r10.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        n10 n10Var;
        int i11;
        int i12;
        int i13;
        int i14;
        Context context = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    int i15 = 3;
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.f43218a = textView;
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
                                org.telegram.messenger.wh.r(textView, 1, 16.0f, 1, 1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (LocaleController.isRTL) {
                                    i11 = 5;
                                } else {
                                    i11 = 3;
                                }
                                textView.setGravity(i11);
                                if (LocaleController.isRTL) {
                                    i12 = 5;
                                } else {
                                    i12 = 3;
                                }
                                frameLayout.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, i12, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.f43219b = textView2;
                                org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23768z6, null);
                                org.telegram.messenger.wh.r(textView2, 1, 13.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (LocaleController.isRTL) {
                                    i13 = 5;
                                } else {
                                    i13 = 3;
                                }
                                textView2.setGravity(i13);
                                if (LocaleController.isRTL) {
                                    i14 = 5;
                                } else {
                                    i14 = 3;
                                }
                                frameLayout.addView(textView2, org.telegram.ui.Components.kb1.h(-2, -2.0f, i14, 22.0f, 35.0f, 22.0f, 0.0f));
                                org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(context);
                                frameLayout.f43220c = xi0Var;
                                xi0Var.setText(LocaleController.getString(R.string.Add));
                                org.telegram.ui.ActionBar.f7.V(xi0Var, org.telegram.ui.ActionBar.y6.Sh, null);
                                xi0Var.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Nh, false));
                                int i16 = org.telegram.ui.ActionBar.y6.Oh;
                                int x02 = org.telegram.ui.ActionBar.y6.x0(null, i16, false);
                                org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
                                xi0Var.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{14.0f}, x02));
                                Drawable background = xi0Var.getBackground();
                                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
                                xi0Var.setBackground(background);
                                org.telegram.ui.ActionBar.f7.k(xi0Var, background, N, null, null);
                                frameLayout.addView(xi0Var, org.telegram.ui.Components.kb1.m(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new org.telegram.ui.Components.l51(17, this, frameLayout));
                                n10Var = frameLayout;
                            } else {
                                n10Var = new org.telegram.ui.Cells.a9(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
                            frameLayout2.f43461a = b6Var;
                            b6Var.setTextSize(16);
                            if (LocaleController.isRTL) {
                                i15 = 5;
                            }
                            b6Var.setGravity(i15);
                            int i17 = org.telegram.ui.ActionBar.y6.f23561o6;
                            org.telegram.ui.ActionBar.f7.Y(b6Var, i17, null);
                            b6Var.setTag(Integer.valueOf(i17));
                            frameLayout2.addView(b6Var);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.f43462b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            n10Var = frameLayout2;
                        }
                    } else {
                        n10Var = new org.telegram.ui.Cells.i9(context);
                    }
                } else {
                    n10 n10Var2 = new n10(this.e, context);
                    n10Var2.setOnReorderButtonTouchListener(new fi.o1(6, this, n10Var2));
                    n10Var2.setOnOptionsClick(new a(this, 28));
                    n10Var = n10Var2;
                }
            } else {
                int i18 = R.raw.filters;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.f41953a = imageView2;
                imageView2.f(i18, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, org.telegram.ui.Components.kb1.h(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new a(frameLayout3, 27));
                TextView textView3 = new TextView(context);
                org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(replaceTags);
                frameLayout3.addView(textView3, org.telegram.ui.Components.kb1.h(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                n10Var = frameLayout3;
            }
        } else {
            n10Var = new org.telegram.ui.Cells.q4(context);
        }
        return new s4.e1(n10Var);
    }
}
