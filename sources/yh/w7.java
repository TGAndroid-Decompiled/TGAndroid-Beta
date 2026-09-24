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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l20;
import org.telegram.ui.m20;
import org.telegram.ui.n50;
import org.telegram.ui.ro;
import org.telegram.ui.s70;
import org.telegram.ui.ub1;
import org.telegram.ui.wn;
public final class w7 extends m20 implements NotificationCenter.NotificationCenterDelegate {
    public static DecimalFormat f48178h0;
    public static DecimalFormat f48179i0;
    public FrameLayout P;
    public sg.e Q;
    public v7 R;
    public n50 S;
    public s00 T;
    public LinearLayout U;
    public SpannableStringBuilder V;
    public org.telegram.ui.Components.p6 W;
    public TextView X;
    public ci.d Y;
    public xh.h1 Z;
    public ci.d f48180a0;
    public ub1 f48181b0;
    public ci.d f48182c0;
    public ci.d f48183d0;
    public boolean f48184e0;
    public boolean f48185f0;
    public z6 f48186g0;

    public w7() {
        this.M = true;
    }

    public static void A0(w7 w7Var) {
        t5.y(w7Var.currentAccount, false).u();
        tg.m1.e0(1, BirthdayController.getInstance(w7Var.currentAccount).getState());
    }

    public static void B0(w7 w7Var, Context context) {
        if (MessagesController.getInstance(w7Var.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(w7Var.currentAccount);
        } else {
            new m7(context, w7Var.resourceProvider).show();
        }
    }

    public static void F0(zz0 zz0Var, int i10, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.d6 d6Var) {
        CharSequence formatPluralStringComma;
        CharSequence charSequence;
        TextView textView = (TextView) ((wz0) zz0Var.c(LocaleController.getString(R.string.Gift2Availability), "", null, null).getChildAt(1)).getChildAt(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
        s90 s90Var = new s90(textView, AndroidUtilities.dp(90.0f), 0, d6Var);
        s90Var.a(org.telegram.ui.ActionBar.h6.l1(0.21f, textView.getPaint().getColor()), org.telegram.ui.ActionBar.h6.l1(0.08f, textView.getPaint().getColor()));
        spannableStringBuilder.setSpan(s90Var, 0, 1, 33);
        textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        if (!starGift.sold_out) {
            final t5 y3 = t5.y(i10, false);
            final long j3 = starGift.f18546id;
            final ii.q1 q1Var = new ii.q1(textView, 29);
            final boolean[] zArr = {false};
            final NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = {new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i11, int i12, Object[] objArr) {
                    int i13;
                    t5 t5Var;
                    TL_stars.StarGift J;
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0] && i11 == (i13 = NotificationCenter.starGiftsLoaded) && (J = (t5Var = t5.this).J(j3)) != null) {
                        zArr2[0] = true;
                        NotificationCenter.getInstance(t5Var.f48028a).removeObserver(notificationCenterDelegateArr[0], i13);
                        q1Var.run(J);
                    }
                }
            }};
            int i11 = y3.f48028a;
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

    public static void G0(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new w6(textView.getCurrentTextColor(), str), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    public static SpannableStringBuilder I0(TL_stars.StarsAmount starsAmount) {
        return J0(starsAmount, 0.777f, ',');
    }

    public static SpannableStringBuilder J0(TL_stars.StarsAmount starsAmount, float f7, char c10) {
        double d;
        int i10;
        if (f48179i0 == null) {
            f48179i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            long j3 = starsAmount.amount;
            if (j3 % 1000000000 != 0) {
                String format = f48179i0.format(j3 / 1.0E9d);
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
                DecimalFormat decimalFormat = f48179i0;
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
        if (f48179i0 == null) {
            f48179i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            String format = f48179i0.format(starsAmount.amount / 1.0E9d);
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
                DecimalFormat decimalFormat = f48179i0;
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
            if (f48179i0 == null) {
                f48179i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            String format = f48179i0.format(starsAmount.amount / 1.0E9d);
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
            if (f48179i0 == null) {
                f48179i0 = new DecimalFormat("0.################", new DecimalFormatSymbols(Locale.US));
            }
            DecimalFormat decimalFormat = f48179i0;
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
        if (f48178h0 == null) {
            f48178h0 = new DecimalFormat("0.####", new DecimalFormatSymbols(Locale.US));
        }
        if (j3 % 1000000000 != 0) {
            return f48178h0.format(j3 / 1.0E9d);
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
        throw new UnsupportedOperationException("Method not decompiled: yh.w7.N0(int, boolean, org.telegram.tgnet.tl.TL_stars$StarsTransaction):java.lang.String");
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
        pq pqVar = new pq(R.drawable.diamond, 0);
        pqVar.recolorDrawable = false;
        pqVar.translate(0.0f, f10);
        pqVar.spaceScaleX = f11;
        pqVar.setScale(f7, f7);
        spannableString.setSpan(pqVar, 0, spannableString.length() - 1, 33);
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

    public static SpannableStringBuilder R0(CharSequence charSequence, float f7, pq[] pqVarArr) {
        return U0(false, charSequence, f7, pqVarArr, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder S0(CharSequence charSequence, boolean z10) {
        return U0(z10, charSequence, 1.13f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder T0(TL_stars.StarsAmount starsAmount, CharSequence charSequence) {
        return U0(starsAmount instanceof TL_stars.TL_starsTonAmount, charSequence, 1.25f, null, 0.0f, 1.0f);
    }

    public static SpannableStringBuilder U0(boolean z10, CharSequence charSequence, float f7, pq[] pqVarArr, float f10, float f11) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        pq pqVar;
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
        if (pqVarArr == null || (pqVar = pqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            pqVar = new pq(i10, 0);
            if (pqVarArr != null) {
                pqVarArr[0] = pqVar;
            }
        }
        pqVar.translate(0.0f, f10);
        pqVar.spaceScaleX = f11;
        if (z10) {
            float f12 = f7 * 0.2f;
            pqVar.setScale(f12, f12);
        } else {
            pqVar.setScale(f7, f7);
        }
        spannableString.setSpan(pqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder V0(boolean z10, String str, pq[] pqVarArr) {
        pq pqVar;
        int i10;
        float f7;
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (pqVarArr == null || (pqVar = pqVarArr[0]) == null) {
            if (z10) {
                i10 = R.drawable.mini_gram_72;
            } else {
                i10 = R.drawable.msg_premium_liststar;
            }
            pqVar = new pq(i10, 0);
            float f10 = 1.13f;
            if (z10) {
                f7 = 0.222f;
            } else {
                f7 = 1.13f;
            }
            if (z10) {
                f10 = 0.222f;
            }
            pqVar.setScale(f7, f10);
        }
        if (pqVarArr != null) {
            pqVarArr[0] = pqVar;
        }
        SpannableString spannableString = new SpannableString("⭐ ");
        spannableString.setSpan(pqVar, 0, spannableString.length() - 1, 33);
        AndroidUtilities.replaceMultipleCharSequence("⭐️", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐ ", spannableStringBuilder, "⭐");
        AndroidUtilities.replaceMultipleCharSequence("⭐", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("XTR ", spannableStringBuilder, "XTR");
        AndroidUtilities.replaceMultipleCharSequence("XTR", spannableStringBuilder, spannableString);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder W0(TL_stars.StarsAmount starsAmount, String str, pq[] pqVarArr) {
        return X0(starsAmount instanceof TL_stars.TL_starsTonAmount, str, 0.8f, pqVarArr);
    }

    public static SpannableStringBuilder X0(boolean z10, CharSequence charSequence, float f7, pq[] pqVarArr) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int i10;
        pq pqVar;
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
        if (pqVarArr == null || (pqVar = pqVarArr[0]) == null) {
            if (pqVarArr != null && pqVarArr.length > 0) {
                pqVar = new pq(i10, 0);
                pqVarArr[0] = pqVar;
            } else {
                pqVar = new pq(i10, 0);
            }
        }
        if (z10) {
            f7 *= 0.33f;
        } else {
            pqVar.recolorDrawable = false;
        }
        pqVar.setScale(f7, f7);
        spannableString.setSpan(pqVar, 0, spannableString.length() - 1, 33);
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
        final m4.e0 e0Var = new m4.e0(z10, currentAccount, str, imageReceiver, new boolean[1]);
        e0Var.run();
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
                        e0Var.run();
                        return;
                    default:
                        e0Var.run();
                        return;
                }
            }
        }), NotificationCenter.getInstance(currentAccount).listen(view, NotificationCenter.diceStickersDidLoad, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Object[] objArr = (Object[]) obj;
                switch (r2) {
                    case 0:
                        e0Var.run();
                        return;
                    default:
                        e0Var.run();
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
        imageReceiver.setImage(ImageLocation.getForDocument(document), a4.a.l(i10, i10, "_"), ImageLocation.getForDocument(closestPhotoSizeWithSize, document), a4.a.l(i10, i10, "_"), DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.h6.f18989a7, 0.35f), 0L, null, null, 0);
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

    public static void e1(Context context, int i10, long j3, TL_stories.Boost boost, org.telegram.ui.ActionBar.d6 d6Var) {
        if (context == null) {
            return;
        }
        org.telegram.ui.ActionBar.e3 j10 = ok.j(1, context, d6Var, false);
        LinearLayout f7 = ok.f(context, 1);
        f7.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(4.0f));
        f7.setClipChildren(false);
        f7.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        f7.addView(frameLayout, w7.y5.t(-1, 150, 7, 0, 0, 0, 10));
        y6 y6Var = new y6(context, 70, 0);
        frameLayout.addView(y6Var, w7.y5.c(-1.0f, -1));
        sg.e eVar = new sg.e(context, 1, 2);
        sg.a aVar = eVar.f43211b;
        aVar.f43199w = org.telegram.ui.ActionBar.h6.fk;
        aVar.f43200x = org.telegram.ui.ActionBar.h6.gk;
        aVar.b();
        eVar.setStarParticlesView(y6Var);
        frameLayout.addView(eVar, w7.y5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        eVar.setPaused(false);
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.c1.p(org.telegram.ui.ActionBar.h6.f19151j5, d6Var, textView, 1, 20.0f);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.e3[] e3VarArr = new org.telegram.ui.ActionBar.e3[1];
        textView.setText(LocaleController.formatPluralStringSpaced("BoostStars", (int) boost.stars));
        TextView h = com.google.android.gms.internal.vision.e2.h(f7, textView, w7.y5.t(-1, -2, 17, 20, 0, 20, 4), context);
        h.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(20.0f), -6915073));
        h.setTextColor(-1);
        h.setTextSize(1, 11.33f);
        h.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(8.33f), 0);
        h.setGravity(17);
        h.setTypeface(AndroidUtilities.bold());
        StringBuilder sb2 = new StringBuilder("x");
        int i11 = boost.multiplier;
        if (i11 == 0) {
            i11 = 1;
        }
        sb2.append(LocaleController.formatPluralStringSpaced("BoostingBoostsCount", i11));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        pq pqVar = new pq(R.drawable.mini_boost_badge, 2);
        pqVar.translate(0.0f, AndroidUtilities.dp(0.66f));
        spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
        h.setText(spannableStringBuilder);
        f7.addView(h, w7.y5.t(-2, 20, 17, 20, 4, 20, 4));
        zz0 zz0Var = new zz0(context, d6Var);
        zz0Var.k(LocaleController.getString(R.string.BoostFrom), i10, j3, new v5(e3VarArr, j3, 2));
        zz0Var.c(LocaleController.getString(R.string.BoostGift), LocaleController.formatPluralString("BoostStars", (int) boost.stars, new Object[0]), null, null);
        if (boost.giveaway_msg_id != 0) {
            String string = LocaleController.getString(R.string.BoostReason);
            String string2 = LocaleController.getString(R.string.BoostReasonGiveaway);
            xh.p0 p0Var = new xh.p0(e3VarArr, j3, boost, 3);
            e3VarArr = e3VarArr;
            zz0Var.g(string, string2, p0Var);
        }
        zz0Var.c(LocaleController.getString(R.string.BoostDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.date * 1000))), null, null);
        zz0Var.c(LocaleController.getString(R.string.BoostUntil), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(boost.expires * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(boost.expires * 1000))), null, null);
        f7.addView(zz0Var, w7.y5.k(16.0f, 17.0f, 16.0f, 0.0f, -1, -2));
        n90 n90Var = new n90(context, d6Var);
        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19447z6, d6Var));
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        n90Var.setTextSize(1, 14.0f);
        n90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new di.a(context, 9)));
        n90Var.setGravity(17);
        f7.addView(n90Var, w7.y5.k(14.0f, 15.0f, 14.0f, 7.0f, -1, -2));
        ci.d dVar = new ci.d(context, d6Var, true);
        dVar.g(LocaleController.getString(R.string.OK), false, true);
        dVar.setOnClickListener(new a6(e3VarArr, 1));
        f7.addView(dVar, w7.y5.k(16.0f, 8.0f, 16.0f, 0.0f, -1, 48));
        j10.customView = f7;
        e3VarArr[0] = j10;
        j10.useBackgroundTopPadding = false;
        j10.fixNavigationBar();
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U)) {
            e3VarArr[0].makeAttached(U);
        }
        eVar.setPaused(false);
        e3VarArr[0].show();
        e3VarArr[0].setOnDismissListener(new r2(eVar, 3));
    }

    public static i0 f1(Context context, int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        zf.a resellAmount;
        zf.b bVar = zf.b.f49216a;
        if (tL_starGiftUnique == null) {
            resellAmount = zf.a.g(MessagesController.getInstance(i10).config.starsStarGiftResaleAmountMin.get(), bVar);
        } else if (tL_starGiftUnique.resale_ton_only) {
            resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f49217b);
        } else {
            resellAmount = tL_starGiftUnique.getResellAmount(bVar);
        }
        i0 i0Var = new i0(context, d6Var, i10, resellAmount, new p6(0, callback2, r8));
        i0[] i0VarArr = {i0Var};
        i0Var.show();
        return i0VarArr[0];
    }

    public static void g1(Context context, long j3, boolean z10, final Utilities.Callback2 callback2, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        int i11;
        CharSequence l4;
        org.telegram.ui.ActionBar.e3[] e3VarArr;
        long j10;
        boolean z11 = false;
        org.telegram.ui.ActionBar.e3 j11 = ok.j(1, context, d6Var, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.PaidContentTitle));
        textView.setTextSize(1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.h6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        linearLayout.addView(textView, w7.y5.k(4.0f, 0.0f, 4.0f, 18.0f, -1, -2));
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        jd0 jd0Var = new jd0(context, d6Var);
        jd0Var.setForceForceUseCenter(true);
        jd0Var.setText(LocaleController.getString(R.string.PaidContentPriceTitle));
        jd0Var.setLeftPadding(AndroidUtilities.dp(36.0f));
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
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
        editTextBoldCursor.setHighlightColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19367uf, d6Var));
        editTextBoldCursor.setHandlesColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19384vf, d6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        editTextBoldCursor.setGravity(i10);
        editTextBoldCursor.setOnFocusChangeListener(new ei.w1(jd0Var, editTextBoldCursor, 2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout2.addView(imageView, w7.y5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout2.addView(editTextBoldCursor, w7.y5.o(-1, -2, 1.0f, 119));
        jd0Var.e(editTextBoldCursor);
        jd0Var.addView(linearLayout2, w7.y5.e(-1, -2, 48));
        linearLayout.addView(jd0Var, w7.y5.n(-1, -2));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.A6, false));
        jd0Var.addView(textView2, w7.y5.d(-2, -2.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        n90 n90Var = new n90(context, null);
        n90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PaidContentInfo), new di.a(context, 10)), true));
        n90Var.setTextSize(1, 12.0f);
        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19447z6, d6Var));
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        linearLayout.addView(n90Var, w7.y5.k(14.0f, 3.0f, 14.0f, 24.0f, -1, -2));
        final ci.d g10 = ok.g(24, context, d6Var, true);
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 > 0) {
            i11 = R.string.PaidContentUpdateButton;
        } else {
            i11 = R.string.PaidContentButton;
        }
        g10.g(LocaleController.getString(i11), false, true);
        linearLayout.addView(g10, w7.y5.n(-1, 48));
        if (i13 > 0 && z10) {
            dVar = ok.g(24, context, d6Var, false);
            dVar.g(LocaleController.getString(R.string.PaidContentClearButton), false, false);
            linearLayout.addView(dVar, w7.y5.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 48));
        }
        j11.customView = linearLayout;
        final org.telegram.ui.ActionBar.e3[] e3VarArr2 = {j11};
        if (i13 <= 0) {
            l4 = "";
        } else {
            l4 = Long.toString(j3);
        }
        editTextBoldCursor.setText(l4);
        editTextBoldCursor.addTextChangedListener(new x6(editTextBoldCursor, jd0Var, j3, z10, g10, textView2));
        final boolean[] zArr = {false};
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i14, KeyEvent keyEvent) {
                if (i14 != 5) {
                    return false;
                }
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return true;
                }
                zArr2[0] = true;
                g10.setLoading(true);
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                callback2.run(Long.valueOf(Long.parseLong(editTextBoldCursor2.getText().toString())), new k6(editTextBoldCursor2, e3VarArr2, 2));
                return true;
            }
        });
        g10.setOnClickListener(new j6(zArr, callback2, editTextBoldCursor, g10, e3VarArr2));
        if (dVar != null) {
            ci.d dVar2 = dVar;
            j6 j6Var = new j6(zArr, callback2, dVar2, editTextBoldCursor, e3VarArr2);
            e3VarArr = e3VarArr2;
            dVar2.setOnClickListener(j6Var);
        } else {
            e3VarArr = e3VarArr2;
        }
        e3VarArr[0].fixNavigationBar();
        e3VarArr[0].setOnDismissListener(new ai.f5(editTextBoldCursor, 13));
        e3VarArr[0].show();
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R instanceof wn) {
            z11 = ((wn) R).P9();
        }
        k6 k6Var = new k6(e3VarArr, editTextBoldCursor);
        if (z11) {
            j10 = 200;
        } else {
            j10 = 80;
        }
        AndroidUtilities.runOnUIThread(k6Var, j10);
    }

    public static org.telegram.ui.ActionBar.e3 h1(final android.content.Context r60, final boolean r61, final long r62, final int r64, final org.telegram.tgnet.tl.TL_stars.StarsTransaction r65, final org.telegram.ui.ActionBar.d6 r66) {
        throw new UnsupportedOperationException("Method not decompiled: yh.w7.h1(android.content.Context, boolean, long, int, org.telegram.tgnet.tl.TL_stars$StarsTransaction, org.telegram.ui.ActionBar.d6):org.telegram.ui.ActionBar.e3");
    }

    public static void i1(Activity activity, int i10, int i11, TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded, org.telegram.ui.ActionBar.d6 d6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = null;
        starsTransaction.description = null;
        starsTransaction.photo = null;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = tL_messageActionPaymentRefunded.peer;
        starsTransaction.date = i11;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPaymentRefunded.total_amount);
        starsTransaction.f18548id = tL_messageActionPaymentRefunded.charge.f18449id;
        starsTransaction.refund = true;
        h1(activity, false, 0L, i10, starsTransaction, d6Var);
    }

    public static void j1(Context context, int i10, TLRPC.TL_payments_paymentReceiptStars tL_payments_paymentReceiptStars, org.telegram.ui.ActionBar.d6 d6Var) {
        TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
        starsTransaction.title = tL_payments_paymentReceiptStars.title;
        starsTransaction.description = tL_payments_paymentReceiptStars.description;
        starsTransaction.photo = tL_payments_paymentReceiptStars.photo;
        TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
        starsTransaction.peer = tL_starsTransactionPeer;
        tL_starsTransactionPeer.peer = MessagesController.getInstance(i10).getPeer(tL_payments_paymentReceiptStars.bot_id);
        starsTransaction.date = tL_payments_paymentReceiptStars.date;
        starsTransaction.amount = TL_stars.StarsAmount.ofStars(-tL_payments_paymentReceiptStars.total_amount);
        starsTransaction.f18548id = tL_payments_paymentReceiptStars.transaction_id;
        h1(context, false, 0L, i10, starsTransaction, d6Var);
    }

    public static void x0(yh.w7 r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: yh.w7.x0(yh.w7, int):void");
    }

    public static void z0(w7 w7Var, v51 v51Var, Boolean bool, String str) {
        if (w7Var.getParentActivity() != null) {
            if (bool.booleanValue()) {
                yc.a0(w7Var).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) v51Var.B, new Object[0])), R.raw.stars_topup).j();
                w7Var.T.c(true);
                t5.y(w7Var.currentAccount, false).T(true);
            } else if (str != null) {
                hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, yc.a0(w7Var), R.raw.error, 36);
            }
        }
    }

    public final void H0(ArrayList arrayList, j61 j61Var) {
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        t5 y3 = t5.y(this.currentAccount, false);
        ArrayList arrayList2 = y3.v;
        v51 v51Var = new v51(-2);
        v51Var.f29036c = (bb) super.r0(getParentActivity());
        arrayList.add(v51Var);
        arrayList.add(v51.k(this.U));
        ci.d dVar = this.f48183d0;
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
            arrayList.add(ei.h.a(-4, getThemedColor(org.telegram.ui.ActionBar.h6.uj), R.drawable.filled_earn_stars, ro.d0(LocaleController.getString(R.string.UserAffiliateProgramRowTitle)), LocaleController.getString(R.string.UserAffiliateProgramRowText)));
            arrayList.add(v51.B(null));
        }
        if (y3.e && !arrayList2.isEmpty()) {
            com.google.android.gms.internal.vision.e2.n(R.string.StarMySubscriptions, arrayList);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                int i12 = n7.f47764a;
                v51 J = v51.J(n7.class);
                J.G = (TL_stars.StarsSubscription) arrayList2.get(i11);
                arrayList.add(J);
            }
            if (y3.f48047x) {
                arrayList.add(v51.o(arrayList.size(), 33));
            } else if (!y3.f48048y) {
                v51 c10 = v51.c(-3, R.drawable.arrow_more, LocaleController.getString(R.string.StarMySubscriptionsExpand));
                c10.f29047q = true;
                arrayList.add(c10);
            }
            arrayList.add(v51.B(null));
        }
        boolean O = y3.O(0);
        this.f48184e0 = O;
        if (O) {
            arrayList.add(v51.p(this.R, AndroidUtilities.dp(24.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(v51.l(this.S));
    }

    @Override
    public final View createView(final Context context) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new v7(context, this.currentAccount, false, 0L, getClassGuid(), getResourceProvider());
        this.S = new n50(this, context, 13);
        super.createView(context);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        boolean z10 = true;
        frameLayout.setClickable(true);
        sg.e eVar = new sg.e(context, 1, 2);
        this.Q = eVar;
        sg.a aVar = eVar.f43211b;
        aVar.f43199w = org.telegram.ui.ActionBar.h6.fk;
        aVar.f43200x = org.telegram.ui.ActionBar.h6.gk;
        aVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, w7.y5.d(190, 190.0f, 17, 0.0f, 12.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TelegramStars), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TelegramStarsInfo2), new di.a(context, 7)), true), this.P, null);
        this.f35436c.setOverScrollMode(2);
        s4.j jVar = new s4.j();
        jVar.f42981m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        this.f35436c.setItemAnimator(jVar);
        this.f35436c.setOnItemClickListener(new ai.g(this, 21));
        s00 s00Var = new s00(getParentActivity());
        this.T = s00Var;
        this.f35440s.addView(s00Var, w7.y5.c(-1.0f, -1));
        t5 y3 = t5.y(this.currentAccount, false);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(10.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getParentActivity(), false, true, false);
        this.W = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        s70 s70Var = new s70(this.W, 42.0f, this.currentAccount);
        ij0 ij0Var = new ij0(R.raw.star_reaction, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f));
        ImageReceiver imageReceiver = s70Var.f37600b;
        imageReceiver.setImageBitmap(ij0Var);
        imageReceiver.setAutoRepeat(2);
        s70Var.f37602f = false;
        s70Var.h = -AndroidUtilities.dp(3.0f);
        this.V.setSpan(s70Var, 0, 1, 33);
        this.U.addView(this.W, w7.y5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourStarsBalance));
        this.X.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19447z6, this.resourceProvider));
        this.U.addView(this.X, w7.y5.d(-1, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        xh.h1 h1Var = new xh.h1(this, getParentActivity(), 2);
        this.Z = h1Var;
        frameLayout2.addView(h1Var);
        ci.d dVar = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.f48180a0 = dVar;
        dVar.e();
        this.f48180a0.g("", false, true);
        this.f48180a0.setOnClickListener(new View.OnClickListener(this) {
            public final w7 f47264b;

            {
                this.f47264b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        w7.B0(this.f47264b, context);
                        return;
                    default:
                        new m7(context, this.f47264b.resourceProvider).show();
                        return;
                }
            }
        });
        this.Z.addView(this.f48180a0, w7.y5.e(-1, 48, 119));
        ub1 ub1Var = new ub1(this, getParentActivity(), 20);
        this.f48181b0 = ub1Var;
        frameLayout2.addView(ub1Var);
        ci.d dVar2 = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.f48182c0 = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new pq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StarsTopUp));
        this.f48182c0.g(spannableStringBuilder, false, true);
        this.f48182c0.setOnClickListener(new View.OnClickListener(this) {
            public final w7 f47264b;

            {
                this.f47264b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        w7.B0(this.f47264b, context);
                        return;
                    default:
                        new m7(context, this.f47264b.resourceProvider).show();
                        return;
                }
            }
        });
        this.f48181b0.addView(this.f48182c0, w7.y5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        ci.d dVar3 = new ci.d(getParentActivity(), this.resourceProvider, true);
        this.Y = dVar3;
        dVar3.e();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new pq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.StarsStats));
        this.Y.g(spannableStringBuilder2, false, true);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final w7 f47294b;

            {
                this.f47294b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w7 w7Var = this.f47294b;
                        w7Var.presentFragment(new g(0, w7Var.getUserConfig().getClientUserId()));
                        return;
                    default:
                        w7.A0(this.f47294b);
                        return;
                }
            }
        });
        this.f48181b0.addView(this.Y, w7.y5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, w7.y5.d(-1, 48.0f, 17, 20.0f, 17.0f, 20.0f, 0.0f));
        ci.d dVar4 = new ci.d(getParentActivity(), this.resourceProvider, false);
        this.f48183d0 = dVar4;
        dVar4.e();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "G  ");
        spannableStringBuilder3.setSpan(new pq(R.drawable.menu_stars_gift, 0), 0, 1, 33);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.TelegramStarsGift));
        this.f48183d0.g(spannableStringBuilder3, false, true);
        this.f48183d0.setOnClickListener(new View.OnClickListener(this) {
            public final w7 f47294b;

            {
                this.f47294b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w7 w7Var = this.f47294b;
                        w7Var.presentFragment(new g(0, w7Var.getUserConfig().getClientUserId()));
                        return;
                    default:
                        w7.A0(this.f47294b);
                        return;
                }
            }
        });
        this.U.addView(this.f48183d0, w7.y5.d(-1, 48.0f, 17, 20.0f, 8.0f, 20.0f, 0.0f));
        k1();
        z6 z6Var = this.f48186g0;
        if (z6Var != null) {
            z6Var.N(false);
        }
        o.g(this.currentAccount).r(getUserConfig().getClientUserId());
        TLRPC.TL_payments_starsRevenueStats h = o.g(this.currentAccount).h(getUserConfig().getClientUserId(), false);
        l1((y3.p().amount <= 0 || h == null || (tL_starsRevenueStatus = h.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false, false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            z6 z6Var = this.f48186g0;
            if (z6Var != null) {
                z6Var.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            t5 y3 = t5.y(this.currentAccount, false);
            if (this.f48184e0 != y3.O(0)) {
                this.f48184e0 = y3.O(0);
                s0();
                z6 z6Var2 = this.f48186g0;
                if (z6Var2 != null) {
                    z6Var2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            z6 z6Var3 = this.f48186g0;
            if (z6Var3 != null) {
                z6Var3.N(true);
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
        t5 y3 = t5.y(this.currentAccount, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) J0(y3.p(), 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        ci.d dVar = this.f48180a0;
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
        l1(z10, true);
    }

    public final void l1(final boolean z10, boolean z11) {
        float f7;
        int i10;
        float f10;
        this.f48185f0 = z10;
        float f11 = 1.0f;
        int i11 = 0;
        if (z11) {
            this.Z.setVisibility(0);
            this.f48181b0.setVisibility(0);
            ViewPropertyAnimator animate = this.Z.animate();
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final w7 f47333b;

                {
                    this.f47333b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f47333b.Z.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f47333b.f48181b0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f48181b0.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final w7 f47333b;

                {
                    this.f47333b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f47333b.Z.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f47333b.f48181b0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            return;
        }
        this.Z.animate().cancel();
        this.f48181b0.animate().cancel();
        ub1 ub1Var = this.f48181b0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ub1Var.setAlpha(f7);
        xh.h1 h1Var = this.Z;
        if (z10) {
            f11 = 0.0f;
        }
        h1Var.setAlpha(f11);
        ub1 ub1Var2 = this.f48181b0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ub1Var2.setVisibility(i10);
        xh.h1 h1Var2 = this.Z;
        if (z10) {
            i11 = 8;
        }
        h1Var2.setVisibility(i11);
    }

    @Override
    public final s4.h0 n0() {
        z6 z6Var = new z6(this, this.f35436c, getParentActivity(), this.currentAccount, this.classGuid, new hi.a(this, 26), getResourceProvider());
        this.f48186g0 = z6Var;
        z6Var.f25265r = false;
        return z6Var;
    }

    @Override
    public final l20 o0() {
        return new di.f(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        t5.y(this.currentAccount, false).T(true);
        t5.y(this.currentAccount, false).S();
        t5.y(this.currentAccount, false).z();
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
        sg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        sg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override
    public final rg.w1 p0() {
        return new y6(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        v7 v7Var = this.R;
        boolean z10 = false;
        if (v7Var != null && (v7Var.getParent() instanceof View)) {
            if ((this.f35436c.getHeight() - this.f35436c.getPaddingBottom()) - ((View) this.R.getParent()).getBottom() >= 0) {
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
