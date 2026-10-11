package yh;

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
import ci.bb;
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
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cc1;
import org.telegram.ui.n20;
import org.telegram.ui.o20;
import org.telegram.ui.q50;
import org.telegram.ui.uo;
import org.telegram.ui.w70;
import org.telegram.ui.zn;
public final class p7 extends o20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat f53131h0;
    public static DecimalFormat f53132i0;
    public FrameLayout P;
    public sg.n Q;
    public o7 R;
    public q50 S;
    public i10 T;
    public LinearLayout U;
    public SpannableStringBuilder V;
    public org.telegram.ui.Components.r6 W;
    public TextView X;
    public ci.d Y;
    public rg.t0 Z;
    public ci.d f53133a0;
    public cc1 f53134b0;
    public ci.d f53135c0;
    public ci.d f53136d0;
    public boolean f53137e0;
    public boolean f53138f0;
    public s6 f53139g0;

    public p7() {
        this.M = true;
    }

    public static void A0(p7 p7Var, r61 r61Var, Boolean bool, String str) {
        if (p7Var.getParentActivity() != null) {
            if (bool.booleanValue()) {
                ad.a0(p7Var).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) r61Var.B, new Object[0])), R.raw.stars_topup).j();
                p7Var.T.c(true);
                n5.y(p7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, ad.a0(p7Var), R.raw.error, 36);
            }
        }
    }

    public static void B0(p7 p7Var) {
        n5.y(p7Var.currentAccount, false).u();
        tg.m1.f0(1, BirthdayController.getInstance(p7Var.currentAccount).getState());
    }

    public static void C0(p7 p7Var, Context context) {
        if (MessagesController.getInstance(p7Var.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(p7Var.currentAccount);
        } else {
            new f7(context, p7Var.resourceProvider).show();
        }
    }

    public static void G0(t01 t01Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.d6 d6Var) {
        CharSequence formatPluralStringComma;
        CharSequence charSequence;
        TextView textView = (TextView) ((q01) t01Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        ka0 ka0Var = new ka0(textView, AndroidUtilities.dp(90.0f), 0, d6Var);
        ka0Var.a(org.telegram.ui.ActionBar.h6.m1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.h6.m1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(ka0Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final n5 y3 = n5.y(i10, false);
            final long j3 = starGift.f20259id;
            final ii.q1 q1Var = new ii.q1(textView, 29);
            final boolean[] zArr = {false};
            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                    int i13;
                    n5 n5Var;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i11 == (i13 = NotificationCenter.starGiftsLoaded) && (J = (n5Var = n5.this).J(j3)) != null) {
                        zArr2[0] = true;
                        NotificationCenter.getInstance(n5Var.f52997a).removeObserver(notificationCenterDelegateArr[0], i13);
                        q1Var.run(J);
                    }
                }
            }};
            int i11 = y3.f52997a;
            NotificationCenter notificationCenter = NotificationCenter.getInstance(i11);
            NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = notificationCenterDelegateArr[0];
            int i12 = NotificationCenter.starGiftsLoaded;
            notificationCenter.addObserver(notificationCenterDelegate, i12);
            TL_stars.StarGift J = y3.J(j3);
            if (J != null) {
                zArr[0] = true;
                NotificationCenter.getInstance(i11).removeObserver(notificationCenterDelegateArr[0], i12);
                q1Var.run(J);
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

    public static void H0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new p6(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount) {
        return K0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder K0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (f53132i0 == null) {
            f53132i0 = new DecimalFormat("0.###", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j3 = starsAmount.amount;
            if (j3 % 1000000000 != 0) {
                String format = f53132i0.format(j3 / 1.0E9d);
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
                i10 = -1;
                d = 1.0E9d;
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
                DecimalFormat decimalFormat = f53132i0;
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

    public static SpannableStringBuilder L0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        boolean z10;
        if (f53132i0 == null) {
            f53132i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f53132i0.format(starsAmount.amount / 1.0E9d);
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
                DecimalFormat decimalFormat = f53132i0;
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

    public static SpannableStringBuilder M0(TL_stars.StarsAmount starsAmount) {
        double d;
        int i10;
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            if (f53132i0 == null) {
                f53132i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f53132i0.format(starsAmount.amount / 1.0E9d);
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
            if (f53132i0 == null) {
                f53132i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f53132i0;
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

    public static String N0(long j3) {
        String str;
        if (f53131h0 == null) {
            f53131h0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j3 % 1000000000 != 0) {
            return f53131h0.format(j3 / 1.0E9d);
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

    public static java.lang.String O0(int r5, boolean r6, org.telegram.tgnet.tl.TL_stars.StarsTransaction r7) {
        throw new UnsupportedOperationException("Method not decompiled: yh.p7.O0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
    }

    public static SpannableStringBuilder P0(CharSequence charSequence, float f7) {
        return Q0(charSequence, f7, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder Q0(CharSequence charSequence, float f7, float f10, float f11) {
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
        er erVar = new er(R.drawable.diamond, 0);
        erVar.recolorDrawable = false;
        erVar.translate(0.0f, f10);
        erVar.spaceScaleX = f11;
        erVar.setScale(f7, f7);
        spannableString.setSpan(erVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("💎️", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎 ", spannableStringBuilder, "💎");
        AndroidUtilities.replaceMultipleCharSequence("💎", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder R0(CharSequence charSequence) {
        return S0(charSequence, 1.13f, null);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, float f7, er[] erVarArr) {
        return V0(false, charSequence, f7, erVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(CharSequence charSequence, boolean z10) {
        return V0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return V0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder V0(boolean z10, CharSequence charSequence, float f7, er[] erVarArr, float f10, float f11) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        er erVar;
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
        if (erVarArr == null || (erVar = erVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            erVar = new er(i10, 0);
            if (erVarArr != null) {
                erVarArr[0] = erVar;
            }
        }
        erVar.translate(0.0f, f10);
        erVar.spaceScaleX = f11;
        if (z10) {
            erVar.recolorDrawable = false;
            float f12 = f7 * 0.2f;
            erVar.setScale(f12, f12);
        } else {
            erVar.setScale(f7, f7);
        }
        spannableString.setSpan(erVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(boolean z10, String str, er[] erVarArr) {
        er erVar;
        int i10;
        float f7;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (erVarArr == null || (erVar = erVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            erVar = new er(i10, 0);
            float f10 = 1.13f;
            if (z10) {
                f7 = 0.222f;
            } else {
                f7 = 1.13f;
            }
            if (z10) {
                f10 = 0.222f;
            }
            erVar.setScale(f7, f10);
        }
        if (z10) {
            erVar.recolorDrawable = false;
        }
        if (erVarArr != null) {
            erVarArr[0] = erVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(erVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder X0(TL_stars.StarsAmount starsAmount, String str, er[] erVarArr) {
        return Y0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, erVarArr);
    }

    public static SpannableStringBuilder Y0(boolean z10, CharSequence charSequence, float f7, er[] erVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i10;
        er erVar;
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
        if (erVarArr == null || (erVar = erVarArr[0]) == null) {
            if (erVarArr != null && erVarArr.length > 0) {
                erVar = new er(i10, 0);
                erVarArr[0] = erVar;
            } else {
                erVar = new er(i10, 0);
            }
        }
        erVar.recolorDrawable = false;
        if (z10) {
            f7 *= 0.33f;
        }
        erVar.setScale(f7, f7);
        spannableString.setSpan(erVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static a21 Z0(View view, ImageReceiver imageReceiver, String str, boolean z10) {
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
        return new a21(notificationCenter.listen(view, i10, new Utilities.Callback() {
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

    public static void a1(ImageReceiver imageReceiver, TLRPC.Document document, int i10) {
        if (document == null) {
            imageReceiver.clearImage();
            return;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, i10);
        imageReceiver.setImage(ImageLocation.getForDocument(document), a1.g.l(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a1.g.l(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f20730a7, 0.35f), 0L, null, null, 0);
    }

    public static void b1(ImageReceiver imageReceiver, TL_stars.StarGift starGift, int i10) {
        TLRPC.Document document;
        if (starGift == null) {
            document = null;
        } else {
            document = starGift.getDocument();
        }
        a1(imageReceiver, document, i10);
    }

    public static void c1(y9 y9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 1000) {
            str = "2⃣";
        } else if (j3 < 2500) {
            str = "3⃣";
        } else {
            str = "4⃣";
        }
        Z0(y9Var, imageReceiver, str, false);
    }

    public static a21 d1(y9 y9Var, ImageReceiver imageReceiver, int i10) {
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
        return Z0(y9Var, imageReceiver, str, false);
    }

    public static void e1(y9 y9Var, ImageReceiver imageReceiver, long j3) {
        String str;
        if (j3 <= 10000000000L) {
            str = "2⃣";
        } else if (j3 <= 50000000000L) {
            str = "1⃣";
        } else {
            str = "3⃣";
        }
        Z0(y9Var, imageReceiver, str, true);
    }

    public static void f1(Context context, int i10, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.d6 d6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 i11 = ai.i(1, context, d6Var, false);
        LinearLayout e7 = ai.e(context, 1);
        e7.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        e7.setClipChildren(false);
        e7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        e7.addView(frameLayout, w7.x5.t(-1, 150, 7, 0, 0, 0, 10));
        r6 r6Var = new r6(context, 70, 0);
        frameLayout.addView(r6Var, w7.x5.d(-1.0f, -1));
        sg.n nVar = new sg.n(context, 1, 2);
        sg.g gVar = nVar.f48168b;
        gVar.f48152z = org.telegram.ui.ActionBar.h6.fk;
        gVar.A = org.telegram.ui.ActionBar.h6.gk;
        gVar.b();
        nVar.setStarParticlesView(r6Var);
        frameLayout.addView(nVar, w7.x5.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
        nVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.h6.f20894j5, d6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView h = com.google.android.gms.internal.vision.e2.h(e7, textView, w7.x5.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), -6915073));
        h.setTextColor(-1);
        h.setTextSize(1, 11.33f);
        h.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        h.setGravity(17);
        h.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i12 = boost.multiplier;
        if (i12 == 0) {
            i12 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i12));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        er erVar = new er(R.drawable.mini_boost_badge, 2);
        erVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(erVar, 0, 1, 33);
        h.setText(spannableStringBuilder);
        e7.addView(h, w7.x5.t(-2, 20, 17, 20, 4, 20, 4));
        t01 t01Var = new t01(context, d6Var);
        t01Var.m(LocaleController.getString(R.string.BoostFrom), i10, j3, new p5(e3VarArr, j3, 2));
        t01Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            xh.q0 q0Var = new xh.q0(e3VarArr, j3, boost, 3);
            e3VarArr = e3VarArr;
            t01Var.h(string, string2, q0Var);
        }
        t01Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        t01Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        e7.addView(t01Var, w7.x5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        fa0 fa0Var = new fa0(context, d6Var);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21189z6, d6Var));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        fa0Var.setTextSize(1, 14.0f);
        fa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new di.a(context, 9)));
        fa0Var.setGravity(17);
        e7.addView(fa0Var, w7.x5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new u5(e3VarArr, 1));
        e7.addView(dVar, w7.x5.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        i11.customView = e7;
        e3VarArr[0] = i11;
        i11.useBackgroundTopPadding = false;
        i11.fixNavigationBar();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            e3VarArr[0].makeAttached(U);
        }
        nVar.setPaused(false);
        e3VarArr[0].show();
        e3VarArr[0].setOnDismissListener(new f0(nVar, 7));
    }

    public static h0 g1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        zf.a resellAmount;
        zf.b bVar = zf.b.f54530a;
        if (tL_starGiftUnique == null) {
            resellAmount = zf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f54531b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        h0 h0Var = new h0(context, d6Var, i10, resellAmount, new org.telegram.ui.Wallet.b7(16, callback2, r8));
        h0[] h0VarArr = {h0Var};
        h0Var.show();
        return h0VarArr[0];
    }

    public static void h1(Context context, long j3, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        int i11;
        CharSequence l4;
        org.telegram.ui.ActionBar.e3[] e3VarArr;
        long j10;
        boolean z11 = false;
        org.telegram.ui.ActionBar.e3 i12 = ai.i(1, context, d6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        ai.j(20.0f, R.string.PaidContentTitle, 1, textView);
        int i13 = org.telegram.ui.ActionBar.h6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        linearLayout.addView(textView, w7.x5.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        be0 be0Var = new be0(context, d6Var);
        be0Var.setForceForceUseCenter(true);
        be0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        be0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        ci.d dVar = null;
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setSelectAllOnFocus(true);
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21109uf, d6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21126vf, d6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new ei.w1(be0Var, editTextBoldCursor, 2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.x5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.x5.o(-1, -2, 1.0f, 119));
        be0Var.e(editTextBoldCursor);
        be0Var.addView(linearLayout2, w7.x5.e(-1, -2, 48));
        linearLayout.addView(be0Var, w7.x5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A6, false));
        be0Var.addView(textView2, w7.x5.a(-2.0f, 0.0f, 0.0f, 14.0f, 0.0f, -2, 21));
        fa0 fa0Var = new fa0(context, null);
        fa0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new di.a(context, 10)), true));
        fa0Var.setTextSize(1, 12.0f);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21189z6, d6Var));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        linearLayout.addView(fa0Var, w7.x5.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final ci.d f7 = ai.f(24, context, d6Var, true);
        int i14 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i14 > 0) {
            i11 = R.string.PaidContentUpdateButton;
        } else {
            i11 = R.string.PaidContentButton;
        }
        f7.g(LocaleController.getString(i11), false, true);
        linearLayout.addView(f7, w7.x5.n(-1, 48));
        if (i14 > 0 && z10) {
            dVar = ai.f(24, context, d6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.x5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        i12.customView = linearLayout;
        final org.telegram.ui.ActionBar.e3[] e3VarArr2 = {i12};
        if (i14 <= 0) {
            l4 = "";
        } else {
            l4 = Long.toString(j3);
        }
        editTextBoldCursor.setText(l4);
        editTextBoldCursor.addTextChangedListener(new q6(editTextBoldCursor, be0Var, j3, z10, f7, textView2));
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
                f7.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new e6(editTextBoldCursor2, e3VarArr2, 2));
                return true;
            }
        });
        f7.setOnClickListener(new d6(zArr, callback2, editTextBoldCursor, f7, e3VarArr2));
        if (dVar != null) {
            ci.d dVar2 = dVar;
            d6 d6Var2 = new d6(zArr, callback2, dVar2, editTextBoldCursor, e3VarArr2);
            e3VarArr = e3VarArr2;
            dVar2.setOnClickListener(d6Var2);
        } else {
            e3VarArr = e3VarArr2;
        }
        e3VarArr[0].fixNavigationBar();
        e3VarArr[0].setOnDismissListener(new ai.g5(editTextBoldCursor, 13));
        e3VarArr[0].show();
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R instanceof zn) {
            z11 = ((zn) R).U9();
        }
        e6 e6Var = new e6(e3VarArr, editTextBoldCursor);
        if (z11) {
            j10 = 200;
        } else {
            j10 = 80;
        }
        AndroidUtilities.runOnUIThread(e6Var, j10);
    }

    public static org.telegram.ui.ActionBar.e3 i1(final android.content.Context r59, final boolean r60, final long r61, final int r63, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r64, final org.telegram.ui.ActionBar.d6 r65) {
        throw new UnsupportedOperationException("Method not decompiled: yh.p7.i1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.d6):org.telegram.ui.ActionBar.e3");
    }

    public static void j1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.d6 d6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f20261id = tL_messageActionPaymentRefunded.charge.f20160id;
        starsTransaction.refund = true;
        i1(activity, false, 0L, i10, starsTransaction, d6Var);
    }

    public static void k1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.d6 d6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f20261id = tL_payments_paymentReceiptStars.transaction_id;
        i1(context, false, 0L, i10, starsTransaction, d6Var);
    }

    public static void y0(yh.p7 r43, int r44) {
        throw new UnsupportedOperationException("Method not decompiled: yh.p7.y0(yh.p7, int):void");
    }

    public final void I0(ArrayList arrayList, e71 e71Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        n5 y3 = n5.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        r61 r61Var = new r61(-2);
        r61Var.f30354c = (bb) super.r0(getParentActivity());
        arrayList.add(r61Var);
        arrayList.add(r61.k(this.U));
        ci.d dVar = this.f53136d0;
        if (dVar != null) {
            if (getMessagesController().starsGiftsEnabled) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            dVar.setVisibility(i10);
        }
        arrayList.add(r61.B(null));
        if (getMessagesController().starrefConnectAllowed) {
            arrayList.add(ei.h.a(-4, getThemedColor(org.telegram.ui.ActionBar.h6.uj), R.drawable.filled_earn_stars, uo.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(r61.B(null));
        }
        if (y3.f53000e && !arrayList2.isEmpty()) {
            com.google.android.gms.internal.vision.e2.n(R.string.StarMySubscriptions, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = g7.f52679a;
                r61 J = r61.J(g7.class);
                J.G = (TL_stars.StarsSubscription) arrayList2.get(i11);
                arrayList.add(J);
            }
            if (y3.f53017x) {
                arrayList.add(r61.o(arrayList.size(), 33));
            } else if (!y3.f53018y) {
                r61 c10 = r61.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.f30366q = true;
                arrayList.add(c10);
            }
            arrayList.add(r61.B(null));
        }
        boolean O = y3.O(0);
        this.f53137e0 = O;
        if (O) {
            arrayList.add(r61.p(this.R, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(r61.l(this.S));
    }

    @Override
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new o7(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.S = new q50(this, context, 13);
        super.createView(context);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        boolean z10 = true;
        frameLayout.setClickable(true);
        sg.n nVar = new sg.n(context, 1, 2);
        this.Q = nVar;
        sg.g gVar = nVar.f48168b;
        gVar.f48152z = org.telegram.ui.ActionBar.h6.fk;
        gVar.A = org.telegram.ui.ActionBar.h6.gk;
        gVar.b();
        this.Q.setStarParticlesView(this.f40393e);
        this.P.addView(this.Q, w7.x5.a(190.0f, 0.0f, 12.0f, 0.0f, 24.0f, 190, 17));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new di.a(context, 7)), true), this.P, null);
        this.f40392c.setOverScrollMode(2);
        s4.j jVar = new s4.j();
        jVar.f47788m = false;
        jVar.C = false;
        jVar.o(is.h);
        jVar.n(350L);
        this.f40392c.setItemAnimator(jVar);
        this.f40392c.setOnItemClickListener(new ai.g(this, 21));
        i10 i10Var = new i10(getParentActivity());
        this.T = i10Var;
        this.f40397s.addView(i10Var, w7.x5.d(-1.0f, -1));
        n5 y3 = n5.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(getParentActivity(), false, true, false);
        this.W = r6Var;
        r6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        w70 w70Var = new w70(this.W, 42.0f, this.currentAccount);
        ek0 ek0Var = new ek0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = w70Var.f43226b;
        imageReceiver.setImageBitmap(ek0Var);
        imageReceiver.setAutoRepeat(2);
        w70Var.f43229f = false;
        w70Var.h = -AndroidUtilities.dp(3.0f);
        this.V.setSpan(w70Var, 0, 1, 33);
        this.U.addView(this.W, w7.x5.a(40.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 17));
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.X.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21189z6, this.resourceProvider));
        this.U.addView(this.X, w7.x5.a(-2.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 17));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        rg.t0 t0Var = new rg.t0(this, getParentActivity(), 4);
        this.Z = t0Var;
        frameLayout2.addView(t0Var);
        ci.d dVar = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.f53133a0 = dVar;
        dVar.e();
        this.f53133a0.g("", false, true);
        this.f53133a0.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f53434b;

            {
                this.f53434b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        p7.C0(this.f53434b, context);
                        return;
                    default:
                        new f7(context, this.f53434b.resourceProvider).show();
                        return;
                }
            }
        });
        this.Z.addView(this.f53133a0, w7.x5.e(-1, 48, 119));
        cc1 cc1Var = new cc1(this, getParentActivity(), 20);
        this.f53134b0 = cc1Var;
        frameLayout2.addView(cc1Var);
        ci.d dVar2 = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.f53135c0 = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new er(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.f53135c0.g(spannableStringBuilder, false, true);
        this.f53135c0.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f53434b;

            {
                this.f53434b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        p7.C0(this.f53434b, context);
                        return;
                    default:
                        new f7(context, this.f53434b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f53134b0.addView(this.f53135c0, w7.x5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ci.d dVar3 = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new er(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.Y.g(spannableStringBuilder2, false, true);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f53465b;

            {
                this.f53465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p7 p7Var = this.f53465b;
                        p7Var.presentFragment(new g(0, p7Var.getUserConfig().getClientUserId()));
                        return;
                    default:
                        p7.B0(this.f53465b);
                        return;
                }
            }
        });
        this.f53134b0.addView(this.Y, w7.x5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, w7.x5.a(48.0f, 20.0f, 17.0f, 20.0f, 0.0f, -1, 17));
        ci.d dVar4 = new ci.d(getParentActivity(), this.resourceProvider, false);
        this.f53136d0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new er(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.f53136d0.g(spannableStringBuilder3, false, true);
        this.f53136d0.setOnClickListener(new View.OnClickListener(this) {
            public final p7 f53465b;

            {
                this.f53465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p7 p7Var = this.f53465b;
                        p7Var.presentFragment(new g(0, p7Var.getUserConfig().getClientUserId()));
                        return;
                    default:
                        p7.B0(this.f53465b);
                        return;
                }
            }
        });
        this.U.addView(this.f53136d0, w7.x5.a(48.0f, 20.0f, 8.0f, 20.0f, 0.0f, -1, 17));
        l1();
        s6 s6Var = this.f53139g0;
        if (s6Var != null) {
            s6Var.N(false);
        }
        o.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = o.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (y3.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = false;
        }
        m1(z10, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            t0();
            s6 s6Var = this.f53139g0;
            if (s6Var != null) {
                s6Var.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            n5 y3 = n5.y(this.currentAccount, false);
            if (this.f53137e0 != y3.O(0)) {
                this.f53137e0 = y3.O(0);
                t0();
                s6 s6Var2 = this.f53139g0;
                if (s6Var2 != null) {
                    s6Var2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            s6 s6Var3 = this.f53139g0;
            if (s6Var3 != null) {
                s6Var3.N(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            l1();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            l1();
        }
    }

    public final void l1() {
        int i10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z10 = false;
        n5 y3 = n5.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) K0(y3.p(), 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        ci.d dVar = this.f53133a0;
        if (y3.p().amount > 0) {
            i10 = R.string.StarsBuyMore;
        } else {
            i10 = R.string.StarsBuy;
        }
        dVar.g(LocaleController.getString(i10), true, true);
        TLRPC.TL_payments_starsRevenueStats h = o.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        if (h != null && (tL_starsRevenueStatus = h.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        }
        m1(z10, true);
    }

    public final void m1(final boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        this.f53138f0 = z10;
        float f11 = 1.0f;
        int i11 = 0;
        if (z11) {
            this.Z.setVisibility(0);
            this.f53134b0.setVisibility(0);
            ViewPropertyAnimator animate = this.Z.animate();
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final p7 f53533b;

                {
                    this.f53533b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f53533b.Z.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f53533b.f53134b0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f53134b0.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final p7 f53533b;

                {
                    this.f53533b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f53533b.Z.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f53533b.f53134b0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.Z.animate().cancel();
        this.f53134b0.animate().cancel();
        cc1 cc1Var = this.f53134b0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        cc1Var.setAlpha(f7);
        rg.t0 t0Var = this.Z;
        if (z10) {
            f11 = 0.0f;
        }
        t0Var.setAlpha(f11);
        cc1 cc1Var2 = this.f53134b0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        cc1Var2.setVisibility(i10);
        rg.t0 t0Var2 = this.Z;
        if (z10) {
            i11 = 8;
        }
        t0Var2.setVisibility(i11);
    }

    @Override
    public final s4.i0 n0() {
        s6 s6Var = new s6(this, this.f40392c, getParentActivity(), this.currentAccount, this.classGuid, new hi.a(this, 26), getResourceProvider());
        this.f53139g0 = s6Var;
        s6Var.f25890r = false;
        return s6Var;
    }

    @Override
    public final n20 o0() {
        return new di.f(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        n5.y(this.currentAccount, false).T(true);
        n5.y(this.currentAccount, false).S();
        n5.y(this.currentAccount, false).z();
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
        sg.n nVar = this.Q;
        if (nVar != null) {
            nVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        sg.n nVar = this.Q;
        if (nVar != null) {
            nVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override
    public final rg.w1 p0() {
        return new r6(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        o7 o7Var = this.R;
        boolean z10 = false;
        if (o7Var != null && (o7Var.getParent() instanceof View)) {
            if ((this.f40392c.getHeight() - this.f40392c.getPaddingBottom()) - ((View) this.R.getParent()).getBottom() >= 0) {
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
