package xh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.nc;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.gc1;
import org.telegram.ui.nj0;
import org.telegram.ui.r20;
import org.telegram.ui.s20;
import org.telegram.ui.t50;
import org.telegram.ui.w70;
import org.telegram.ui.yo;
public final class z7 extends s20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat f46386h0;
    public static DecimalFormat f46387i0;
    public FrameLayout P;
    public rg.f Q;
    public y7 R;
    public t50 S;
    public y00 T;
    public LinearLayout U;
    public SpannableStringBuilder V;
    public org.telegram.ui.Components.o6 W;
    public TextView X;
    public bi.d Y;
    public a7 Z;
    public bi.d f46388a0;
    public gc1 f46389b0;
    public bi.d f46390c0;
    public bi.d f46391d0;
    public boolean f46392e0;
    public boolean f46393f0;
    public c7 f46394g0;

    public z7() {
        this.M = true;
    }

    public static void A0(z7 z7Var) {
        v5.y(z7Var.currentAccount, false).u();
        sg.p1.e0(1, BirthdayController.getInstance(z7Var.currentAccount).getState());
    }

    public static void B0(z7 z7Var, Context context) {
        if (MessagesController.getInstance(z7Var.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(z7Var.currentAccount);
        } else {
            new p7(context, z7Var.resourceProvider).show();
        }
    }

    public static void F0(b01 b01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence formatPluralStringComma;
        CharSequence charSequence;
        TextView textView = (TextView) ((yz0) b01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        r90 r90Var = new r90(textView, AndroidUtilities.dp(90.0f), 0, f6Var);
        r90Var.a(org.telegram.ui.ActionBar.j6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.j6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(r90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final v5 y3 = v5.y(i10, false);
            final long j3 = starGift.f17425id;
            final org.telegram.ui.web.y1 y1Var = new org.telegram.ui.web.y1(textView, 22);
            final boolean[] zArr = {false};
            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                    int i13;
                    v5 v5Var;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i11 == (i13 = NotificationCenter.starGiftsLoaded) && (J = (v5Var = v5.this).J(j3)) != null) {
                        zArr2[0] = true;
                        NotificationCenter.getInstance(v5Var.f46176a).removeObserver(notificationCenterDelegateArr[0], i13);
                        y1Var.run(J);
                    }
                }
            }};
            int i11 = y3.f46176a;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
            NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
            int i12 = NotificationCenter.starGiftsLoaded;
            notificationCenter.addObserver(notificationCenterDelegate, i12);
            TL_stars.StarGift J = y3.J(j3);
            if (J != null) {
                zArr[0] = true;
                NotificationCenter.getInstance(i11).removeObserver(notificationCenterDelegateArr[0], i12);
                y1Var.run(J);
            }
        } else if (starGift instanceof TL_stars.TL_starGiftUnique) {
            if (starGift.availability_remains <= 0) {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
            } else {
                charSequence = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
            }
            textView.setText(charSequence);
        } else {
            int i13 = starGift.availability_remains;
            if (i13 <= 0) {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total);
            } else {
                formatPluralStringComma = LocaleController.formatPluralStringComma("Gift2Availability4Value", i13, LocaleController.formatNumber(starGift.availability_total, ','));
            }
            textView.setText(formatPluralStringComma);
        }
    }

    public static void G0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new y6(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount) {
        return J0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (f46387i0 == null) {
            f46387i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j3 = starsAmount.amount;
            if (j3 % 1000000000 != 0) {
                String format = f46387i0.format(j3 / 1.0E9d);
                spannableStringBuilder.append((CharSequence) format);
                int indexOf = format.indexOf(".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
                    return spannableStringBuilder;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (starsAmount.negative()) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(LocaleController.formatNumber(Math.abs(starsAmount.amount / 1000000000), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                return spannableStringBuilder;
            }
        } else {
            long j10 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            boolean z10 = false;
            if (i11 < 0 && j10 > 0) {
                d = 1.0E9d;
                i10 = -1;
            } else if (i11 > 0 && j10 < 0) {
                d = 1.0E9d;
                i10 = 1;
            } else {
                d = 1.0E9d;
                i10 = 0;
            }
            long j11 = i10 + j10;
            int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i12 != 0 ? i12 < 0 : i11 < 0) {
                z10 = true;
            }
            if (i11 != 0) {
                StringBuilder sb3 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(LocaleController.formatNumber(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                DecimalFormat decimalFormat = f46387i0;
                int i13 = starsAmount.nanos;
                double d10 = i13;
                if (i13 < 0) {
                    d10 += d;
                }
                String format2 = decimalFormat.format(d10 / d);
                int indexOf2 = format2.indexOf(".");
                if (indexOf2 >= 0) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), length + 1, spannableStringBuilder.length(), 33);
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(LocaleController.formatNumber(Math.abs(j11), c10));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        boolean z10;
        if (f46387i0 == null) {
            f46387i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f46387i0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), indexOf, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        } else {
            long j3 = starsAmount.amount;
            int i11 = starsAmount.nanos;
            if (i11 < 0 && j3 > 0) {
                i10 = -1;
                d = 1.0E9d;
            } else if (i11 > 0 && j3 < 0) {
                d = 1.0E9d;
                i10 = 1;
            } else {
                d = 1.0E9d;
                i10 = 0;
            }
            long j10 = i10 + j3;
            int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i12 != 0 ? i12 < 0 : i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str = "";
            if (Math.abs(j10) <= 1000 && starsAmount.nanos != 0) {
                StringBuilder sb2 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb2.append(str);
                sb2.append(LocaleController.formatNumber(Math.abs(j10), c10));
                spannableStringBuilder.append((CharSequence) sb2.toString());
                DecimalFormat decimalFormat = f46387i0;
                int i13 = starsAmount.nanos;
                double d10 = i13;
                if (i13 < 0) {
                    d10 += d;
                }
                String format2 = decimalFormat.format(d10 / d);
                int indexOf2 = format2.indexOf(".");
                if (indexOf2 >= 0) {
                    int length = spannableStringBuilder.length();
                    String substring = format2.substring(indexOf2);
                    if (substring.length() > 1) {
                        spannableStringBuilder.append((CharSequence) substring.substring(0, Math.min(substring.length(), 3)));
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(f7), length + 1, spannableStringBuilder.length(), 33);
                    }
                }
            } else if (starsAmount.amount <= 1000) {
                StringBuilder sb3 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb3.append(str);
                sb3.append(LocaleController.formatNumber(Math.abs(j10), c10));
                spannableStringBuilder.append((CharSequence) sb3.toString());
                return spannableStringBuilder;
            } else {
                StringBuilder sb4 = new StringBuilder();
                if (z10) {
                    str = "-";
                }
                sb4.append(str);
                sb4.append(AndroidUtilities.formatWholeNumber((int) Math.abs(j10), 0));
                spannableStringBuilder.append((CharSequence) sb4.toString());
                return spannableStringBuilder;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (f46387i0 == null) {
                f46387i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f46387i0.format(starsAmount.amount / 1.0E9d);
            spannableStringBuilder.append((CharSequence) format);
            int indexOf = format.indexOf(".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), indexOf, spannableStringBuilder.length(), 33);
            }
            return spannableStringBuilder;
        }
        long j3 = starsAmount.amount;
        int i11 = starsAmount.nanos;
        boolean z10 = false;
        if (i11 < 0 && j3 > 0) {
            i10 = -1;
            d = 1.0E9d;
        } else if (i11 > 0 && j3 < 0) {
            d = 1.0E9d;
            i10 = 1;
        } else {
            d = 1.0E9d;
            i10 = 0;
        }
        long j10 = i10 + j3;
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i12 != 0 ? i12 < 0 : i11 < 0) {
            z10 = true;
        }
        if (i11 != 0) {
            StringBuilder sb2 = new StringBuilder();
            if (z10) {
                str = "-";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append(LocaleController.formatNumber(Math.abs(j10), ','));
            spannableStringBuilder.append((CharSequence) sb2.toString());
            if (f46387i0 == null) {
                f46387i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f46387i0;
            int i13 = starsAmount.nanos;
            double d10 = i13;
            if (i13 < 0) {
                d10 += d;
            }
            String format2 = decimalFormat.format(d10 / d);
            int indexOf2 = format2.indexOf(".");
            if (indexOf2 >= 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) format2.substring(indexOf2));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.777f), length + 1, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StarsNano));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) LocaleController.formatPluralStringComma("Stars", (int) j3));
        return spannableStringBuilder;
    }

    public static String M0(long j3) {
        String str;
        if (f46386h0 == null) {
            f46386h0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j3 % 1000000000 != 0) {
            return f46386h0.format(j3 / 1.0E9d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (j3 < 0) {
            str = "-";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(LocaleController.formatNumber(Math.abs(j3 / 1000000000), ','));
        return sb2.toString();
    }

    public static java.lang.String N0(int r5, boolean r6, org.telegram.tgnet.tl.TL_stars.StarsTransaction r7) {
        throw new UnsupportedOperationException("Method not decompiled: xh.z7.N0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder O0(CharSequence charSequence, float f7) {
        return P0(charSequence, f7, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder P0(CharSequence charSequence, float f7, float f10, float f11) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        SpannableString spannableString = new SpannableString("💎 ");
        uq uqVar = new uq(R.drawable.diamond, 0);
        uqVar.recolorDrawable = false;
        uqVar.translate(0.0f, f10);
        uqVar.spaceScaleX = f11;
        uqVar.setScale(f7, f7);
        spannableString.setSpan(uqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence) {
        return R0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder R0(CharSequence charSequence, float f7, uq[] uqVarArr) {
        return U0(false, charSequence, f7, uqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z10) {
        return U0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z10, CharSequence charSequence, float f7, uq[] uqVarArr, float f10, float f11) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        uq uqVar;
        int i10;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (!z10) {
            str = "⭐";
        } else {
            str = "TON";
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (uqVarArr == null || (uqVar = uqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            uqVar = new uq(i10, 0);
            if (uqVarArr != null) {
                uqVarArr[0] = uqVar;
            }
        }
        uqVar.translate(0.0f, f10);
        uqVar.spaceScaleX = f11;
        if (z10) {
            float f12 = f7 * 0.2f;
            uqVar.setScale(f12, f12);
        } else {
            uqVar.setScale(f7, f7);
        }
        spannableString.setSpan(uqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z10, String str, uq[] uqVarArr) {
        uq uqVar;
        int i10;
        float f7;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (uqVarArr == null || (uqVar = uqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            uqVar = new uq(i10, 0);
            float f10 = 1.13f;
            if (z10) {
                f7 = 0.222f;
            } else {
                f7 = 1.13f;
            }
            if (z10) {
                f10 = 0.222f;
            }
            uqVar.setScale(f7, f10);
        }
        if (uqVarArr != null) {
            uqVarArr[0] = uqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(uqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, uq[] uqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, uqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f7, uq[] uqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i10;
        uq uqVar;
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof SpannableStringBuilder)) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        }
        if (!z10) {
            str = "⭐";
        } else {
            str = "TON";
        }
        if (z10) {
            i10 = R.drawable.mini_gram_72;
        } else {
            i10 = R.drawable.star_small_inner;
        }
        SpannableString spannableString = new SpannableString(str.concat(" "));
        if (uqVarArr == null || (uqVar = uqVarArr[0]) == null) {
            if (uqVarArr != null && uqVarArr.length > 0) {
                uqVar = new uq(i10, 0);
                uqVarArr[0] = uqVar;
            } else {
                uqVar = new uq(i10, 0);
            }
        }
        if (z10) {
            f7 *= 0.33f;
        } else {
            uqVar.recolorDrawable = false;
        }
        uqVar.setScale(f7, f7);
        spannableString.setSpan(uqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static g11 Y0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
        int i10;
        int currentAccount = imageReceiver.getCurrentAccount();
        final m4.f0 f0Var = new m4.f0(z10, currentAccount, str, imageReceiver, new boolean[1]);
        f0Var.run();
        NotificationCenter notificationCenter = NotificationCenter.getInstance(currentAccount);
        if (z10) {
            i10 = NotificationCenter.didUpdateTonGiftStickers;
        } else {
            i10 = NotificationCenter.didUpdatePremiumGiftStickers;
        }
        return new g11(notificationCenter.listen(view, i10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        f0Var.run();
                        return;
                    default:
                        f0Var.run();
                        return;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        f0Var.run();
                        return;
                    default:
                        f0Var.run();
                        return;
                }
            }
        }), 1);
    }

    public static void Z0(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i10);
        imageReceiver.setImage(ImageLocation.getForDocument(document), a4.a.k(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.k(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f17872a7, 0.35f), 0L, null, null, 0);
    }

    public static void a1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        Z0(imageReceiver, document, i10);
    }

    public static void b1(w9 w9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 1000) {
            str = "2⃣";
        } else if (j3 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        Y0(w9Var, imageReceiver, str, false);
    }

    public static g11 c1(w9 w9Var, ImageReceiver imageReceiver, int i10) {
        String str;
        if (i10 != 3) {
            if (i10 != 6) {
                if (i10 != 12) {
                    if (i10 != 24) {
                        str = "1⃣";
                    } else {
                        str = "5⃣";
                    }
                } else {
                    str = "4⃣";
                }
            } else {
                str = "3⃣";
            }
        } else {
            str = "2⃣";
        }
        return Y0(w9Var, imageReceiver, str, false);
    }

    public static void d1(w9 w9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 10000000000L) {
            str = "2⃣";
        } else if (j3 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        Y0(w9Var, imageReceiver, str, true);
    }

    public static void e1(Context context, int i10, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.f6 f6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.h3 i11 = em.i(1, context, f6Var, false);
        LinearLayout f7 = em.f(context, 1);
        f7.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.a6.t(-1, 150, 7, 0, 0, 0, 10));
        b7 b7Var = new b7(context, 70, 0);
        frameLayout.addView(b7Var, w7.a6.c(-1.0f, -1));
        rg.f fVar = new rg.f(context, 1, 2);
        rg.a aVar = fVar.f41485b;
        aVar.f41471w = org.telegram.ui.ActionBar.j6.fk;
        aVar.f41472x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        fVar.setStarParticlesView(b7Var);
        frameLayout.addView(fVar, w7.a6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        fVar.setPaused(false);
        TextView textView = new TextView(context);
        em.x(org.telegram.ui.ActionBar.j6.f18034j5, f6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.h3[] h3VarArr = new org.telegram.ui.ActionBar.h3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(f7, textView, w7.a6.t(-1, -2, 17, 20, 0, 20, 4), context);
        g10.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), -6915073));
        g10.setTextColor(-1);
        g10.setTextSize(1, 11.33f);
        g10.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        g10.setGravity(17);
        g10.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i12 = boost.multiplier;
        if (i12 == 0) {
            i12 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i12));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        uq uqVar = new uq(R.drawable.mini_boost_badge, 2);
        uqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
        g10.setText(spannableStringBuilder);
        f7.addView(g10, w7.a6.t(-2, 20, 17, 20, 4, 20, 4));
        b01 b01Var = new b01(context, f6Var);
        b01Var.k(LocaleController.getString(R.string.BoostFrom), i10, j3, new x5(h3VarArr, j3, 2));
        b01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            a3.h0 h0Var = new a3.h0(h3VarArr, j3, boost, 27);
            h3VarArr = h3VarArr;
            b01Var.g(string, string2, h0Var);
        }
        b01Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        b01Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        f7.addView(b01Var, w7.a6.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        m90 m90Var = new m90(context, f6Var);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new ci.a(context, 9)));
        m90Var.setGravity(17);
        f7.addView(m90Var, w7.a6.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        bi.d dVar = new bi.d(context, f6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new c6(h3VarArr, 1));
        f7.addView(dVar, w7.a6.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        i11.customView = f7;
        h3VarArr[0] = i11;
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            h3VarArr[0].makeAttached(U);
        }
        fVar.setPaused(false);
        h3VarArr[0].show();
        h3VarArr[0].setOnDismissListener(new x(fVar, 9));
    }

    public static i0 f1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        yf.a resellAmount;
        yf.b bVar = yf.b.f46928a;
        if (tL_starGiftUnique == null) {
            resellAmount = yf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(yf.b.f46929b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        i0 i0Var = new i0(context, f6Var, i10, resellAmount, new nj0(21, callback2, r8));
        i0[] i0VarArr = {i0Var};
        i0Var.show();
        return i0VarArr[0];
    }

    public static void g1(Context context, long j3, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        int i11;
        CharSequence l4;
        org.telegram.ui.ActionBar.h3[] h3VarArr;
        long j10;
        boolean z11 = false;
        org.telegram.ui.ActionBar.h3 i12 = em.i(1, context, f6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        linearLayout.addView(textView, w7.a6.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        hd0 hd0Var = new hd0(context, f6Var);
        hd0Var.setForceForceUseCenter(true);
        hd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        hd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        bi.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18245uf, f6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new di.z1(hd0Var, editTextBoldCursor, 2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.a6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.a6.o(-1, -2, 1.0f, 119));
        hd0Var.e(editTextBoldCursor);
        hd0Var.addView(linearLayout2, w7.a6.e(-1, -2, 48));
        linearLayout.addView(hd0Var, w7.a6.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A6, false));
        hd0Var.addView(textView2, w7.a6.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        m90 m90Var = new m90(context, null);
        m90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new ci.a(context, 10)), true));
        m90Var.setTextSize(1, 12.0f);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        linearLayout.addView(m90Var, w7.a6.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final bi.d g10 = em.g(24, context, f6Var, true);
        int i14 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i14 > 0) {
            i11 = R.string.PaidContentUpdateButton;
        } else {
            i11 = R.string.PaidContentButton;
        }
        g10.g(LocaleController.getString(i11), false, true);
        linearLayout.addView(g10, w7.a6.n(-1, 48));
        if (i14 > 0 && z10) {
            dVar = em.g(24, context, f6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.a6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        i12.customView = linearLayout;
        final org.telegram.ui.ActionBar.h3[] h3VarArr2 = {i12};
        if (i14 <= 0) {
            l4 = "";
        } else {
            l4 = Long.toString(j3);
        }
        editTextBoldCursor.setText(l4);
        editTextBoldCursor.addTextChangedListener(new z6(editTextBoldCursor, hd0Var, j3, z10, g10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i15, KeyEvent keyEvent) {
                if (i15 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                g10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new m6(editTextBoldCursor2, h3VarArr2, 2));
                return true;
            }
        });
        g10.setOnClickListener(new l6(zArr, callback2, editTextBoldCursor, g10, h3VarArr2));
        if (dVar != null) {
            bi.d dVar2 = dVar;
            l6 l6Var = new l6(zArr, callback2, dVar2, editTextBoldCursor, h3VarArr2);
            h3VarArr = h3VarArr2;
            dVar2.setOnClickListener(l6Var);
        } else {
            h3VarArr = h3VarArr2;
        }
        h3VarArr[0].fixNavigationBar();
        h3VarArr[0].setOnDismissListener(new gg.o(editTextBoldCursor, 11));
        h3VarArr[0].show();
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R instanceof eo) {
            z11 = ((eo) R).P9();
        }
        m6 m6Var = new m6(h3VarArr, editTextBoldCursor);
        if (z11) {
            j10 = 200;
        } else {
            j10 = 80;
        }
        AndroidUtilities.runOnUIThread(m6Var, j10);
    }

    public static org.telegram.ui.ActionBar.h3 h1(final android.content.Context r58, final boolean r59, final long r60, final int r62, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r63, final org.telegram.ui.ActionBar.f6 r64) {
        throw new UnsupportedOperationException("Method not decompiled: xh.z7.h1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.f6):org.telegram.ui.ActionBar.h3");
    }

    public static void i1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.f6 f6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f17427id = tL_messageActionPaymentRefunded.charge.f17323id;
        starsTransaction.refund = true;
        h1(activity, false, 0L, i10, starsTransaction, f6Var);
    }

    public static void j1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.f6 f6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f17427id = tL_payments_paymentReceiptStars.transaction_id;
        h1(context, false, 0L, i10, starsTransaction, f6Var);
    }

    public static void x0(xh.z7 r40, int r41) {
        throw new UnsupportedOperationException("Method not decompiled: xh.z7.x0(xh.z7, int):void");
    }

    public static void z0(z7 z7Var, v51 v51Var, Boolean bool, String str) {
        if (z7Var.getParentActivity() != null) {
            if (bool.booleanValue()) {
                wc.a0(z7Var).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) v51Var.B, new Object[0])), R.raw.stars_topup).j();
                z7Var.T.c(true);
                v5.y(z7Var.currentAccount, false).T(true);
            } else if (str != null) {
                com.google.android.gms.internal.vision.e2.o(R.string.UnknownErrorCode, new Object[]{str}, wc.a0(z7Var), R.raw.error, 36);
            }
        }
    }

    public final void H0(ArrayList arrayList, j61 j61Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        v5 y3 = v5.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        v51 v51Var = new v51(-2);
        v51Var.f27823c = (nc) super.r0(getParentActivity());
        arrayList.add(v51Var);
        arrayList.add(v51.k(this.U));
        bi.d dVar = this.f46391d0;
        if (dVar != null) {
            if (getMessagesController().starsGiftsEnabled) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar.setVisibility(i10);
        }
        arrayList.add(v51.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(di.i.a(-4, getThemedColor(org.telegram.ui.ActionBar.j6.uj), R.drawable.filled_earn_stars, yo.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(v51.B(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            com.google.android.gms.internal.vision.e2.m(R.string.StarMySubscriptions, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = q7.f45938a;
                v51 J = v51.J(q7.class);
                J.G = (TL_stars.StarsSubscription) arrayList2.get(i11);
                arrayList.add(J);
            }
            if (y3.f46195x) {
                arrayList.add(v51.o(arrayList.size(), 33));
            } else if (!y3.f46196y) {
                v51 c10 = v51.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.f27834q = true;
                arrayList.add(c10);
            }
            arrayList.add(v51.B(null));
        }
        boolean O = y3.O(0);
        this.f46392e0 = O;
        if (O) {
            arrayList.add(v51.p(this.R, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(v51.l(this.S));
    }

    @Override
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new y7(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.S = new t50(this, context, 13);
        super.createView(context);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        boolean z10 = true;
        frameLayout.setClickable(true);
        rg.f fVar = new rg.f(context, 1, 2);
        this.Q = fVar;
        rg.a aVar = fVar.f41485b;
        aVar.f41471w = org.telegram.ui.ActionBar.j6.fk;
        aVar.f41472x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, w7.a6.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new ci.a(context, 7)), true), this.P, null);
        this.f36527c.setOverScrollMode(2);
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.f36527c.setItemAnimator(jVar);
        this.f36527c.setOnItemClickListener(new ai.g(this, 20));
        y00 y00Var = new y00(getParentActivity());
        this.T = y00Var;
        this.f36531s.addView(y00Var, w7.a6.c(-1.0f, -1));
        v5 y3 = v5.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getParentActivity(), false, true, false);
        this.W = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        w70 w70Var = new w70(this.W, 42.0f, this.currentAccount);
        hj0 hj0Var = new hj0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = w70Var.f37737b;
        imageReceiver.setImageBitmap(hj0Var);
        imageReceiver.setAutoRepeat(2);
        w70Var.f37739f = false;
        w70Var.h = -AndroidUtilities.dp(3.0f);
        this.V.setSpan(w70Var, 0, 1, 33);
        this.U.addView(this.W, w7.a6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.X.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18325z6, this.resourceProvider));
        this.U.addView(this.X, w7.a6.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        a7 a7Var = new a7(0, getParentActivity(), this);
        this.Z = a7Var;
        frameLayout2.addView(a7Var);
        bi.d dVar = new bi.d(getParentActivity(), this.resourceProvider, true);
        this.f46388a0 = dVar;
        dVar.e();
        this.f46388a0.g("", false, true);
        this.f46388a0.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f45376b;

            {
                this.f45376b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        z7.B0(this.f45376b, context);
                        return;
                    default:
                        new p7(context, this.f45376b.resourceProvider).show();
                        return;
                }
            }
        });
        this.Z.addView(this.f46388a0, w7.a6.e(-1, 48, 119));
        gc1 gc1Var = new gc1(this, getParentActivity(), 20);
        this.f46389b0 = gc1Var;
        frameLayout2.addView(gc1Var);
        bi.d dVar2 = new bi.d(getParentActivity(), this.resourceProvider, true);
        this.f46390c0 = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new uq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.f46390c0.g(spannableStringBuilder, false, true);
        this.f46390c0.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f45376b;

            {
                this.f45376b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        z7.B0(this.f45376b, context);
                        return;
                    default:
                        new p7(context, this.f45376b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f46389b0.addView(this.f46390c0, w7.a6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        bi.d dVar3 = new bi.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new uq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.Y.g(spannableStringBuilder2, false, true);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f45421b;

            {
                this.f45421b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z7 z7Var = this.f45421b;
                        z7Var.presentFragment(new h(0, z7Var.getUserConfig().getClientUserId()));
                        return;
                    default:
                        z7.A0(this.f45421b);
                        return;
                }
            }
        });
        this.f46389b0.addView(this.Y, w7.a6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, w7.a6.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        bi.d dVar4 = new bi.d(getParentActivity(), this.resourceProvider, false);
        this.f46391d0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new uq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.f46391d0.g(spannableStringBuilder3, false, true);
        this.f46391d0.setOnClickListener(new View.OnClickListener(this) {
            public final z7 f45421b;

            {
                this.f45421b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z7 z7Var = this.f45421b;
                        z7Var.presentFragment(new h(0, z7Var.getUserConfig().getClientUserId()));
                        return;
                    default:
                        z7.A0(this.f45421b);
                        return;
                }
            }
        });
        this.U.addView(this.f46391d0, w7.a6.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        c7 c7Var = this.f46394g0;
        if (c7Var != null) {
            c7Var.N(false);
        }
        p.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = p.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1((y3.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            c7 c7Var = this.f46394g0;
            if (c7Var != null) {
                c7Var.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            v5 y3 = v5.y(this.currentAccount, false);
            if (this.f46392e0 != y3.O(0)) {
                this.f46392e0 = y3.O(0);
                s0();
                c7 c7Var2 = this.f46394g0;
                if (c7Var2 != null) {
                    c7Var2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            c7 c7Var3 = this.f46394g0;
            if (c7Var3 != null) {
                c7Var3.N(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            k1();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            k1();
        }
    }

    public final void k1() {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        v5 y3 = v5.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) J0(y3.p(), 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        bi.d dVar = this.f46388a0;
        if (y3.p().amount > 0) {
            i10 = R.string.StarsBuyMore;
        } else {
            i10 = R.string.StarsBuy;
        }
        dVar.g(LocaleController.getString(i10), true, true);
        TLRPC.TL_payments_starsRevenueStats h = p.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        l1(z10, true);
    }

    public final void l1(final boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        this.f46393f0 = z10;
        float f11 = 1.0f;
        int i11 = 0;
        if (z11) {
            this.Z.setVisibility(0);
            this.f46389b0.setVisibility(0);
            ViewPropertyAnimator animate = this.Z.animate();
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final z7 f45467b;

                {
                    this.f45467b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f45467b.Z.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f45467b.f46389b0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f46389b0.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final z7 f45467b;

                {
                    this.f45467b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f45467b.Z.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f45467b.f46389b0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.Z.animate().cancel();
        this.f46389b0.animate().cancel();
        gc1 gc1Var = this.f46389b0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        gc1Var.setAlpha(f7);
        a7 a7Var = this.Z;
        if (z10) {
            f11 = 0.0f;
        }
        a7Var.setAlpha(f11);
        gc1 gc1Var2 = this.f46389b0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        gc1Var2.setVisibility(i10);
        a7 a7Var2 = this.Z;
        if (z10) {
            i11 = 8;
        }
        a7Var2.setVisibility(i11);
    }

    @Override
    public final s4.h0 n0() {
        c7 c7Var = new c7(this, this.f36527c, getParentActivity(), this.currentAccount, this.classGuid, new gi.a(this, 26), getResourceProvider());
        this.f46394g0 = c7Var;
        c7Var.f24250r = false;
        return c7Var;
    }

    @Override
    public final r20 o0() {
        return new ci.f(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        v5.y(this.currentAccount, false).T(true);
        v5.y(this.currentAccount, false).S();
        v5.y(this.currentAccount, false).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onPause() {
        super.onPause();
        rg.f fVar = this.Q;
        if (fVar != null) {
            fVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        rg.f fVar = this.Q;
        if (fVar != null) {
            fVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override
    public final qg.x1 p0() {
        return new b7(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        y7 y7Var = this.R;
        boolean z10 = false;
        if (y7Var != null && (y7Var.getParent() instanceof View)) {
            if ((this.f36527c.getHeight() - this.f36527c.getPaddingBottom()) - ((View) this.R.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override
    public final View r0(Context context) {
        throw null;
    }
}
